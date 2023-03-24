public class Perfect {
    public static void main(String[] args) {
        int[] res = new int[10000];
        for(int i = 1; i < 10000; i++){
            int cpt = 0;
            for(int j = 1; j < i; j++){
                if(i % j == 0){
                    cpt += j;
                }
            }
            if(cpt == i){
                res[i] = cpt;
            }
        }
        for(int i = 1; i < res.length; i++){
            if(res[i] != 0){
                System.out.println(res[i]);
            }
        }
    }
}

