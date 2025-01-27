public class panagram {
    public static void main(String[] args) {
        System.out.println(ispangramanagram("abcdefghijklmnopqrstuvwxyzz"));
    }
    public static boolean ispangramanagram(String s)
	{
		s=s.toLowerCase();
		int a[]=new int[26];
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				a[s.charAt(i)-97]=1;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				return true;
	}
		}
        return false;
		System.out.println(count);
		if(count==26) {
			return true;
		}
		else
		{
			return false;
		}
	}
    
}
