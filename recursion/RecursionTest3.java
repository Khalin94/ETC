class RecursionTest3{
    public static void main(String[] args){
        int[] data = {1,2,3,4,5,6,7,8,9,10,12,13,14,15};

        System.out.println(data.length);

        System.out.println("target : " + loopSearch(data, 8));

        System.out.println("recursionSearch : " + recursionSearch(data, 1, 15, 14));

        System.out.println("recursionSearchBack : " + recursionSearchBack(data, 1, data.length-1, 16));
        
        System.out.println("recursionSearchMiddle : " + recursionSearchMiddle(data, 1, data.length-1, 3));

        System.out.println("findMax : " + findMax(data, 0, 9));

        System.out.println("findMaxMiddle : " + findMax(data, 0, 10));

        String[] strData = {"Sun", "Mon", "Tue", "Wes", "Thu", "Fri", "Sat"};

        System.out.println("binary : " + binarySearch(strData, "Wes", 0, strData.length-1));
    }

    private static int loopSearch(int[] data, int target){
        for(int i=0; i<data.length;i++){
            if(data[i] == target){
                return data[i];
            }
        }

        return -1;
    }

    private static int recursionSearch(int[] data, int begin, int end, int target){
        if(begin > end){
            return -1;
        }else if(begin > data.length){
            return -1;
        }else if(data[begin] == target){
            return data[begin];
        }else{
            return recursionSearch(data, begin+1, end, target);
        }
    }

    private static int recursionSearchBack(int[] data, int begin, int end, int target){
        if(end < begin){
            return -1;
        }else if(data[end] == target){
            return data[end];
        }else{
            return recursionSearchBack(data, begin, end-1, target);
        }
    }

    private static int recursionSearchMiddle(int[] data, int begin, int end, int target){
        if(begin > end){
            return -1;
        }else{
            int middle = (begin + end) / 2;

            if(data[middle] == target){
                return data[middle];
            }
            int index = recursionSearchMiddle(data, begin, middle-1, target);

            if(index != -1){
                return index;
            }else{
                return recursionSearchMiddle(data, middle+1, end, target);
            }
        }
    }

    private static int findMax(int[] data, int begin, int end){
        if(data[begin] == data[end]){
            return data[begin];
        }else{
            return Math.max(data[begin], findMax(data,begin+1, end));
        }
    }

    private static int findMaxMiddle(int[] data, int begin, int end){
        int middle = (begin + end) /2;

        if(begin == end){
            return data[begin];
        }else{
            int max1 = findMaxMiddle(data, begin, middle);
            int max2 = findMaxMiddle(data, middle+1, end);
            return Math.max(max1, max2);
        }
    }

    private static String binarySearch(String[] data, String target, int begin, int end){
        if(begin > end){
            return "-1";
        }else{
            int middle = (begin + end) / 2;
            int compResult = target.compareTo(data[middle]);
            if(compResult == 0){
                return data[middle];
            }else if( compResult < 0){
                return binarySearch(data, target, begin, middle-1);
            }else{
                return binarySearch(data, target, middle+1, end);
            }
        }
    }
}
