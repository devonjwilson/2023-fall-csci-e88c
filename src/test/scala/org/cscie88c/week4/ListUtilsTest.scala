package org.cscie88c.week4

import org.cscie88c.testutils.{StandardTest}

class ListUtilsTest extends StandardTest {
  "ListUtils" when {
    "calling ones" should {
      "return the correct value 5 and 10 for ones" in {
        // write 2.4 unit test here
        assert(ListUtils.ones(5) == List(1,1,1,1,1))
        assert(ListUtils.ones(10) == List(1,1,1,1,1,1,1,1,1,1))        
    }
    // write 2.5 unit tests for zeroes
      "return the correct value 5 and 10 for zeros" in {
        // write 2.4 unit test here
        assert(ListUtils.zeros(5) == List(0,0,0,0,0))
        assert(ListUtils.zeros(10) == List(0,0,0,0,0,0,0,0,0,0))        
    }

      // write 3.2 unit test "Hello World"
      "Write unit tests for charCounts checking value of Hello Word" in {
        // write 2.4 unit test here
        val helloWorld = ListUtils.charCounts("Hello world")
        val e = helloWorld.get('e')
        assert(e == Some(1))        

        val l = helloWorld.get('l')
        assert(l == Some(3))        

        val H = helloWorld.get('H')
        assert(H == Some(1))        

        val w = helloWorld.get('w')
        assert(w == Some(1))        

        val r = helloWorld.get('r')
        assert(r == Some(1))        

        val o = helloWorld.get('o')
        assert(o == Some(2))        

        val d = helloWorld.get('d')
        assert(d == Some(1))        
    }

      // write 3.3 unit test 
      "Write unit tests for charCounts checking value of Quick Brown Fox" in {
        // write 2.4 unit test here
        val brownFox = ListUtils.charCounts("The quick brown fox jumps over the lazy dog")
        val a = brownFox.get('a')
        assert(a == Some(1))      
        val b = brownFox.get('b')
        assert(b == Some(1))        
        val c = brownFox.get('c')
        assert(c == Some(1))        
        val d = brownFox.get('d')
        assert(d == Some(1))      
        val e = brownFox.get('e')
        assert(e == Some(3))        
        val f = brownFox.get('f')
        assert(f == Some(1))  
        val g = brownFox.get('g')
        assert(g == Some(1))      
        val h = brownFox.get('h')
        assert(h == Some(2))        
        val i = brownFox.get('i')
        assert(i == Some(1))  
        val j = brownFox.get('j')
        assert(j == Some(1))  
        val k = brownFox.get('k')
        assert(k == Some(1))      
        val l = brownFox.get('l')
        assert(l == Some(1))        
        val m = brownFox.get('m')
        assert(m == Some(1))  
        val n = brownFox.get('n')
        assert(n == Some(1))      
        val o = brownFox.get('o')
        assert(o == Some(4))        
        val p = brownFox.get('p')
        assert(p == Some(1))        
        val q = brownFox.get('q')
        assert(q == Some(1))      
        val r = brownFox.get('r')
        assert(r == Some(2))        
        val s = brownFox.get('s')
        assert(s == Some(1))  
        //The one capital letter
        val T = brownFox.get('T')
        assert(T == Some(1))      
        val u = brownFox.get('u')
        assert(u == Some(2))        
        val v = brownFox.get('v')
        assert(v == Some(1))  
        val w = brownFox.get('w')
        assert(w == Some(1))  
        val x = brownFox.get('x')
        assert(x == Some(1))      
        val y = brownFox.get('y')
        assert(y == Some(1))        
        val z = brownFox.get('z')
        assert(z == Some(1))        
    }    
  }

    // write 3.5 unit tests for zeroes
      "Check that the topN values match" in {
        val helloWorld = ListUtils.charCounts("Hello world")
        val helloWorld2 = ListUtils.topN(2)(helloWorld)
        assert(helloWorld2 == Map('l' -> 3, 'o' -> 2))        
    }
  }
}