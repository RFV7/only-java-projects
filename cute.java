public class cute {
    public static void main(String[] args) {
        String[] [] cuc = {{ "id","ysername", "pass", " valuek","pass" },
            { "1","value0", "value1", " valuek","pass" },
                         {"2","lkk","kkk","nnn","pass"},
                         {"2","lkk","kkk","nnn","pass"},
    
    };
        System.out.println(cuc[0][1]);
         System.out.println(cuc.length);
         for(int  i=0; i<cuc.length; i++){
             for(int  j=0; j<=5; j++){ 
                System.out.print(cuc[i][j]);

             }
             System.out.println();
         }
    }
    
}
