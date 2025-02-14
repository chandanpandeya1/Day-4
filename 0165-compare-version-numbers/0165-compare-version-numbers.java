class Solution {
    public int compareVersion(String version1, String version2) {
       //split into Array String "1.1.0" = {"1","1","0"}
        String [] v1 =  version1.split("\\.");
        String [] v2 =  version2.split("\\.");

        int Maxx = Math.max(version1.length(),version2.length());

        for(int i = 0; i<Maxx;i++){

                int val1 = i < v1.length ? Integer.parseInt(v1[i]) : 0 ;
                int val2 = i < v2.length ? Integer.parseInt(v2[i]) : 0 ;

            if(val1>val2){
            return 1;
            }
            else if(val1<val2){
              return -1;
            }
    
    }
    return 0;
}
}