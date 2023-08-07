![Screenshot (1817)](https://github.com/ShadmanShariar/My_Java_Template_For_Competitive_Programming/assets/75669228/b165a541-4973-4123-86a8-062d289dbcb2)

        // List
	
	ArrayList<Integer> al= new ArrayList<Integer>();
	LinkedList<Integer> ll= new LinkedList<Integer>();
	
	// List 2D
	
	ArrayList<ArrayList<Integer>> al2= new ArrayList<ArrayList<Integer>>();
	LinkedList<LinkedList<Integer>> ll2= new LinkedList<LinkedList<Integer>>();
	ArrayList<int[]> aa = new ArrayList<int[]>();
	LinkedList<long[]> la = new LinkedList<long[]>();
	
	// Adj List, Map, Set
	
	ArrayList<Integer> adj2[] = new ArrayList[1000];
	LinkedList<Integer> adj[] = new LinkedList[1000];
	HashSet<Integer> hsj[] = new HashSet[1000];
	HashMap<Integer,Integer> hmj[] = new HashMap[1000];

	// Stack
	
	Stack <Integer> stk = new Stack <Integer>();
	
	// Queue
	
	Queue <Integer> q = new LinkedList<Integer>();
	
	// Deque
	
	ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
	
	// PriorityQueue and Heap
	
	PriorityQueue <Integer> pq = new PriorityQueue<Integer>();
	PriorityQueue <Integer> pqr = new PriorityQueue<Integer>(Comparator.reverseOrder());
	
	// Set 
	
	HashSet<Integer> hs = new HashSet<Integer>();
	LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
	TreeSet<Integer> ts = new TreeSet<Integer>();
	TreeSet<Integer> tsr = new TreeSet<Integer>(Comparator.reverseOrder());
	SortedSet<Integer> multiset = new TreeSet<>( (i, j) -> i > j ? 1 : -1 );
	
	// Map
	
	HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
	LinkedHashMap<Integer,Integer> lhm = new LinkedHashMap<Integer,Integer>();
	TreeMap<Integer,Integer> tm = new TreeMap<Integer,Integer>();
	TreeMap<Integer,Integer> tmr = new TreeMap<Integer,Integer>(Comparator.reverseOrder());
	SortedMap< Integer, Integer > multimap = new TreeMap<>( (i, j) -> i > j ? 1 : -1 );
	
	// Hash Table
	
	Hashtable<Integer,Integer> ht = new Hashtable<Integer,Integer>();
