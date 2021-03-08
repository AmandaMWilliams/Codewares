//package CodeWarsTests;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//public class EnoughIsEnoughTest {
//
//    @Test
//    public void deleteNth() throws Exception {
//        Assert.assertArrayEquals(
//                new int[] { 20, 37, 21 },
//                EnoughIsEnough.deleteNth( new int[] { 20, 37, 20, 21 }, 1 )
//        );
//        Assert.assertArrayEquals(
//                new int[] { 1, 1, 3, 3, 7, 2, 2, 2 },
//                EnoughIsEnough.deleteNth( new int[] { 1, 1, 3, 3, 7, 2, 2, 2, 2 }, 3 )
//
//        );
//        Assert.assertArrayEquals(
//                new int[] { 1, 2, 3, 1, 1, 2, 2, 3, 3, 4, 5 },
//                EnoughIsEnough.deleteNth( new int[] { 1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1 }, 3 )
//        );
//        Assert.assertArrayEquals(
//                new int[] { 1, 1, 1, 1, 1 },
//                EnoughIsEnough.deleteNth( new int[] { 1, 1, 1, 1, 1 }, 5 )
//        );
//        Assert.assertArrayEquals(
//                new int[] { },
//                EnoughIsEnough.deleteNth( new int[] { }, 5 )
//        );
//
//    }
//
//}
