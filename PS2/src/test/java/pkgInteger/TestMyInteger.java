package pkgInteger;
import pkgInteger.MyInteger;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestMyInteger {

	@Test
	public void TestGetiValue() {
		MyInteger y = new MyInteger(9);
		assertEquals(y.getiValue(),9);
	}

	@Test
	public void TestisEven() {
		MyInteger y = new MyInteger(9);
		assertEquals(y.isEven(),false);
		MyInteger x = new MyInteger(6);
		assertEquals(x.isEven(),true);
	}

	@Test
	public void TestisOdd() {
		MyInteger y = new MyInteger(7);
		assertEquals(y.isOdd(),true);
		MyInteger x = new MyInteger(4);
		assertEquals(x.isOdd(),false);
	}

	@Test
	public void TestisPrime() {
		MyInteger y = new MyInteger(37);
		assertEquals(y.isPrime(),true);
		MyInteger x = new MyInteger(22);
		assertEquals(x.isPrime(),false);
	}

	@Test
	public void TestisEvenInt() {
		assertEquals(MyInteger.isEven(11),false);
		assertEquals(MyInteger.isEven(16),true);
	}

	@Test
	public void TestisOddInt() {
		assertEquals(MyInteger.isOdd(8),false);
		assertEquals(MyInteger.isOdd(777),true);
	}

	@Test
	public void TestisPrimeInt() {
		assertEquals(MyInteger.isPrime(35),false);
		assertEquals(MyInteger.isPrime(17),true);
	}

	@Test
	public void TestisEvenMyInteger() {
		MyInteger y = new MyInteger(157);
		assertEquals(MyInteger.isEven(y),false);
		MyInteger x = new MyInteger(614);
		assertEquals(MyInteger.isEven(x),true);
	}

	@Test
	public void TestisOddMyInteger() {
		MyInteger y = new MyInteger(611);
		assertEquals(MyInteger.isOdd(y),true);
		MyInteger x = new MyInteger(210);
		assertEquals(MyInteger.isOdd(x),false);
	}

	@Test
	public void TestisPrimeMyInteger() {
		MyInteger y = new MyInteger(41);
		assertEquals(MyInteger.isPrime(y),true);
		MyInteger x = new MyInteger(18);
		assertEquals(MyInteger.isPrime(x),false);
	}

}
