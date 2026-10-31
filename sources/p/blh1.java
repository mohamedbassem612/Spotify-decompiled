package p;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class blh1 {
    public static final Unsafe a;
    public static final Class b;
    public static final zkh1 c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final boolean g;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Unsafe unsafe;
        Object[] objArr = 0;
        rkh1 rkh1Var = null;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction) new pkh1((byte) 0));
        } catch (Throwable unused) {
            unsafe = null;
        }
        a = unsafe;
        b = n34.a;
        boolean zE = e(Long.TYPE);
        boolean zE2 = e(Integer.TYPE);
        byte b2 = 1;
        if (unsafe != null) {
            if (!n34.a()) {
                rkh1Var = new rkh1(unsafe, (byte) 2);
            } else if (zE) {
                rkh1Var = new rkh1(unsafe, b2);
            } else if (zE2) {
                rkh1Var = new rkh1(unsafe, objArr == true ? 1 : 0);
            }
        }
        c = rkh1Var;
        d = rkh1Var == null ? false : rkh1Var.i();
        e = rkh1Var == null ? false : rkh1Var.h();
        f = b(byte[].class);
        b(boolean[].class);
        c(boolean[].class);
        b(int[].class);
        c(int[].class);
        b(long[].class);
        c(long[].class);
        b(float[].class);
        c(float[].class);
        b(double[].class);
        c(double[].class);
        b(Object[].class);
        c(Object[].class);
        Field fieldD = d();
        if (fieldD != null && rkh1Var != null) {
            rkh1Var.a.objectFieldOffset(fieldD);
        }
        g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static Object a(Class cls) {
        try {
            return a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            bhn0.p(e2);
            return null;
        }
    }

    public static int b(Class cls) {
        if (e) {
            return c.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void c(Class cls) {
        if (e) {
            c.a.arrayIndexScale(cls);
        }
    }

    public static Field d() {
        Field declaredField;
        Field declaredField2;
        if (n34.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    public static boolean e(Class cls) {
        if (!n34.a()) {
            return false;
        }
        try {
            Class cls2 = b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean f(long j, Object obj) {
        return ((byte) ((g((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static int g(long j, Object obj) {
        return c.a.getInt(obj, j);
    }

    public static long h(long j, Object obj) {
        return c.a.getLong(obj, j);
    }

    public static Object i(long j, Object obj) {
        return c.a.getObject(obj, j);
    }

    public static void j(Throwable th) {
        Logger.getLogger(blh1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static void k(byte[] bArr, long j, byte b2) {
        c.e(f + j, bArr, b2);
    }

    public static void l(long j, Object obj, byte b2) {
        long j2 = (-4) & j;
        int iG = g(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        n(obj, ((255 & b2) << i) | (iG & (~(255 << i))), j2);
    }

    public static void m(long j, Object obj, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        n(obj, ((255 & b2) << i) | (g(j2, obj) & (~(255 << i))), j2);
    }

    public static void n(Object obj, int i, long j) {
        c.a.putInt(obj, j, i);
    }

    public static void o(Object obj, long j, long j2) {
        c.a.putLong(obj, j, j2);
    }

    public static void p(Object obj, long j, Object obj2) {
        c.a.putObject(obj, j, obj2);
    }
}
