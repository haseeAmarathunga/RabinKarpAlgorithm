//Input as Command Line Argument
//ex: java RabinKarp text pattern
class RabinKarp
{
    public static void main(String args[])
    {
        String txt=args[0];
        String pat=args[1];
        Rabin(txt,pat,17);

    }

    public static void Rabin(String txt,String pat,int prime)
    {
        int d=256;
        int n=txt.length();
        int m=pat.length();
        
        int h=1;
        int hasht=0;
        int hashp=0;

        for(int i=0;i<m-1;i++){
            h=(h*d)%prime;
        }

        for(int i=0;i<m;i++){
            hasht=(hasht*d+txt.charAt(i))%prime;
            hashp=(hashp*d+pat.charAt(i))%prime;
        }
        //System.out.println(hashp);
        //System.out.println(h);

        for(int i=0;i<=n-m;i++)
        {
            if(hashp==hasht)
            {
                int j;
                for(j=0;j<m;j++)
                {
                    if(txt.charAt(i+j)!=pat.charAt(j))
                    {
                        break;
                    }

                }

                if(j==m)
                {
                    System.out.println("Pattern Ocuurs at index "+i);
                }
            }

            if(i<n-m)
            {
                hasht=(d*(hasht-txt.charAt(i)*h)+txt.charAt(i+m))%prime;

                if(hasht<0)
                {
                    hasht+=prime;
                }
            }

        }



    }

}