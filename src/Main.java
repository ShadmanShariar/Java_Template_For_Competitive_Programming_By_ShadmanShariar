 // Author : Shadman Shariar              //
//  Email  : shadmanshariar007@gmail.com //
import java.io.*; import java.util.*;
import java.time.*; import java.lang.Math.*;
import java.io.BufferedReader; import java.io.IOException;
import java.math.BigInteger; import java.text.DecimalFormat;
import java.io.InputStreamReader; import java.io.PrintWriter;
import java.util.function.Supplier;import java.io.Closeable;
import java.util.regex.Pattern;import java.util.regex.Matcher;
import java.util.stream.*;import static java.lang.System.exit;
import java.nio.charset.Charset; import java.security.KeyStore.Entry;
public class Main {
public static Main obj = new Main();
private static final Integer Null = null;
public static final long N = (long)(1000000001);
public static final long Bigmod = 1_000_000_007;
public static final String Vowels = "aeiouAEIOU";
public static final Random random = new Random();
//random.nextInt(max-min+1)+min)&(int)(Math.random()*(max-min+1)+min)
public static int [] dx = {-1, 1, 0, 0, -1, -1, 1, 1};
public static int [] dy = {0, 0, -1, 1, -1, 1, -1, 1};
public static int [] dp1 = new int [10];
public static int [][] dp2 = new int[10][10]; 
public static final long bigmod = (long)(Math.pow(10,9)+7);
public static final String spliter1 = "\\s+", spliter2 = "[ ]+";
public static FastReader fr = new FastReader();
public static Scanner input = new Scanner(System.in);
public static PrintWriter out = new PrintWriter(System.out);
public static DecimalFormat df = new DecimalFormat(".000");
public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
public static void main (String[]args) throws Exception{Scanner input=new Scanner(System.in);
//===========================================================================================//
//Vector vc = new Vector();
//BigInteger bi = new BigInteger("1000");
//StringBuilder sb = new StringBuilder();
//StringBuffer sbf = new StringBuffer();
//StringTokenizer st = new StringTokenizer("string",spliter1);
//ArrayList<Integer> al= new ArrayList<Integer>();
//LinkedList<Integer> ll= new LinkedList<Integer>();
//Stack <Integer> stk = new Stack <Integer>();
//Queue <Integer> q = new LinkedList<Integer>();
//ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
//PriorityQueue <Integer> pq = new PriorityQueue<Integer>();
//PriorityQueue <Integer> pqr = new PriorityQueue<Integer>(Comparator.reverseOrder());
//HashSet<Integer> hs = new HashSet<Integer>();
//LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
//TreeSet<Integer> ts = new TreeSet<Integer>();
//TreeSet<Integer> tsr = new TreeSet<Integer>(Comparator.reverseOrder());
//Hashtable<Integer,Integer> ht = new Hashtable<Integer,Integer>();
//HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
//LinkedHashMap<Integer,Integer> lhm = new LinkedHashMap<Integer,Integer>();
//TreeMap<Integer,Integer> tm = new TreeMap<Integer,Integer>();
//TreeMap<Integer,Integer> tmr = new TreeMap<Integer,Integer>(Comparator.reverseOrder());
//ArrayList<ArrayList<Integer>> al2= new ArrayList<ArrayList<Integer>>();
//LinkedList<LinkedList<Integer>> ll2= new LinkedList<LinkedList<Integer>>();
//LinkedList<Integer> adj[] = new LinkedList[1000];
//ArrayList<Integer> adj2[] = new ArrayList[1000];
//HashSet<Integer> hsj[] = new HashSet[1000];
//HashMap<Integer,Integer> hmj[] = new HashMap[1000];
//ArrayList<int[]> aa = new ArrayList<int[]>();
//LinkedList<long[]> la = new LinkedList<long[]>();
//Arrays.sort(dp2, Comparator.comparingInt(o -> o[0]));
//SortedSet< Integer > ss = new TreeSet<>( (i, j) -> i > j ? 1 : -1 );
//SortedMap< Integer, Integer > sm = new TreeMap<>( (i, j) -> i > j ? 1 : -1 );
//Arrays.stream(arr).boxed().toList(); //These 2 are Array to List
//Arrays.stream(arr).boxed().collect(Collectors.toList());
//Integer[] array = (Integer[]) l.toArray(new Integer[l.size()]); //List to Array
//===========================================================================================//
//long start = System.currentTimeMillis();

// Bitmask -----------------------------------
// Check Bit - (number&(1<<pos)) -> 0/1 bit  |
// Set Bit - number = (number|(1<<pos))      |
// Unset Bit - number = (number&(~(1<<pos))) |
// inverse toggle - number = number^(1<<pos) |
//--------------------------------------------

int tc = 1;

//tc = input.nextInt();

for (int tt = 1; tt <= tc; tt++) {
	
	debug("Shadman Shariar .....");
	
}

//long end = System.currentTimeMillis();
//System.out.println("Time : "+((end-start)/1000));
//===========================================================================================//
        out.flush();
        out.close();
        input.close();
        System.exit(0);
}
//===========================================================================================//
//-------->> Temporary Method Starts Here <<--------//
private static int[] nodes;
public static void setsizeooofunion(int size) {
    nodes = new int[size];
    for (int i = 0; i < size; i++) {
        nodes[i] = i;
    } }
public static int root (int i) {
	while(i != nodes[i]) i = nodes[i];
	return i;}
public static boolean connected2(int p, int q) {
    return root(p) == root(q); }
public static void printconnections() {
    for (int i = 0; i < nodes.length; i++) {
        System.out.print(i + " | ");
    }
    System.out.println();
    for (int n : nodes) {
        System.out.print(n + " | ");
    } }
public static void union2(int p, int q) {
	int i = root(p);
	int j = root(q);
	nodes[i] = j;
}
public static void union(int p, int q) {
    int valP = nodes[p];
    int valQ = nodes[q];
    for (int i = 0; i < nodes.length; i++) {
        if (nodes[i] == valP) {
            nodes[i] = valQ;
        } } }
public static boolean connected(int p, int q) {
    return nodes[p] == nodes[q]; }
//-------->>  Temporary Method Ends Here  <<--------//
//===========================================================================================//
public static void bdfs(char[][] grid, int i, int j) {
if(i<0||j<0||i>=grid.length||j>=grid[i].length||grid[i][j]=='0')return;
grid[i][j] = '0';bdfs(grid, i+1, j);bdfs(grid, i-1, j);bdfs(grid, i, j+1);
bdfs(grid, i, j-1); return;}
public static class pair { int first, second;
public pair(int first, int second) 
{ this.first = first; this.second = second;}}
public static void debug(Object... obj){System.err.println(Arrays.deepToString(obj));}
public static void swap(int a[], int i, int j) {
a[i] ^= a[j];a[j] ^= a[i];a[i] ^= a[j];}
public static void swap(long a[], int i, int j) {
a[i] ^= a[j];a[j] ^= a[i];a[i] ^= a[j];}
public static void sort(int[] a) {ArrayList<Integer> l=new ArrayList<>();
for(int i:a)l.add(i);Collections.sort(l);for(int i=0; i<a.length;i++)a[i]=l.get(i);}
public static long add(long a, long b) {return (a+b)%Bigmod;}
public static long sub(long a, long b) {return ((a-b)%Bigmod+Bigmod)%Bigmod;}
public static long mul(long a, long b) {return (a*b)%Bigmod;}
public static long exp(long base,long exp){if(exp==0)return 1;long half=exp(base,exp/2);
if (exp%2==0) return mul(half, half);return mul(half, mul(half, base));}
public static long lcm(long a,long b){return (a/gcd(a,b))*b;}
public static long gcd(long a,long b){if(a==0)return b;return gcd(b%a,a);}
public static long nPr(long n,long r){return factorial(n)/factorial(n-r);}
public static long nCr(long n,long r){return factorial(n)/(factorial(r)*factorial(n-r));}
public static long factorial(long n){return (n==1||n==0)?1:n*factorial(n-1);}
public static long countsubstr(String str){long n=str.length();return n*(n+1)/2;}
public static long fastpower(long a,long b,long n) {long res=1;while(b>0){if((b&1)!=0)
{res=(res*a%n)%n;}a=(a%n*a%n)%n;b=b>>1;}return res;}
public static void subsequences(String s,String ans){if(s.length()==0){ss.
add(ans);return;}subsequences(s.substring(1),ans+s.charAt(0));subsequences
(s.substring(1),ans);}public static List<String>ss=new ArrayList<>();
public static boolean perfectsquare(long x){if(x>=0)
{long sr=(long)(Math.sqrt(x));return((sr*sr)==x);}return false;}
public static boolean perfectcube(long N){int cube;int c=0;for(int i=0;i<=N;i++){cube=i*i*i;
if(cube==N){c=1;break;}else if (cube>N){c=0;break;}}if(c==1)return true;else return false;}
public static boolean[] sieveOfEratosthenes(int n){boolean prime[]=new boolean[n+1];
for (int i = 0; i <= n; i++)prime[i] = true;for (int p = 2; p * p <= n; p++){
if(prime[p]==true){for(int i=p*p;i<=n;i+=p)prime[i]=false;}}prime[1]=false;return prime;}
public static int binarysearch(int arr[],int l,int r,int x) 
{if (r >= l){int mid = l + (r - l) / 2;if (arr[mid]==x)return mid;if(arr[mid]>x)return
binarysearch(arr, l, mid - 1, x);return binarysearch(arr, mid + 1, r, x);}return -1;}
public static void rangeofprime(int a,int b){int i, j, flag;for (i = a; i <= b; i++)
{if (i == 1 || i == 0)continue;flag = 1;for (j = 2; j <= i / 2; ++j) {if (i % j == 0)
{flag = 0;break;}}if (flag == 1)System.out.println(i);}}
public static boolean isprime(long n){if(n<=1)return false;else if(n==2)return true;else if
(n%2==0)return false;for(long i=3;i<=Math.sqrt(n);i+=2){if(n%i==0)return false;}return true;}
public static void rufflesort(int[]a){int n=a.length;for(int i=0;i<n;i++){
int oi=random.nextInt(n),temp=a[oi];a[oi]=a[i]; a[i]=temp;}Arrays.sort(a);}
public static int pit(int n){int res=1;for(int i=2;i<n;i++)if(gcd(i,n)==1)res++;return res;}
//===========================================================================================//
public static class Node{
	int data ; Node left, right;
	public Node (int data) {	
		this.data = data;
	}
}
public static Node createTree() {
	Node root = null;
	System.out.println("data : ");
	int data = input.nextInt();
	if(data == -1) return null;
	root = new Node(data);
	System.out.println("left : " + data);
	root.left = createTree();
	System.out.println("right :"+ data);
	root.right = createTree();
	return root;
}
public static class FastReader {
		BufferedReader br;
		StringTokenizer st;
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
		double nextDouble() {
			return Double.parseDouble(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long[] readArrayL(int n) {
			long[] a=new long[n];
			for (int i=0; i<n; i++) a[i]=nextLong();
			return a;
		}
		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}
