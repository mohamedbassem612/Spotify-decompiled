package p;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class dlh1 {
    public static final Unsafe a;
    public static final Class b;
    public static final alh1 c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final long g;
    public static final boolean h;

    static {
        Unsafe unsafe;
        wkh1 ykh1Var = null;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new qkh1((byte) 1));
        } catch (Throwable unused) {
            unsafe = null;
        }
        a = unsafe;
        b = p34.a;
        boolean zD = d(Long.TYPE);
        boolean zD2 = d(Integer.TYPE);
        if (unsafe != null) {
            if (!p34.a()) {
                ykh1Var = new ykh1(unsafe);
            } else if (zD) {
                ykh1Var = new wkh1(unsafe);
            } else if (zD2) {
                ykh1Var = new tkh1(unsafe);
            }
        }
        c = ykh1Var;
        d = ykh1Var == null ? false : ykh1Var.l();
        e = ykh1Var == null ? false : ykh1Var.k();
        f = a(byte[].class);
        a(boolean[].class);
        b(boolean[].class);
        a(int[].class);
        b(int[].class);
        a(long[].class);
        b(long[].class);
        a(float[].class);
        b(float[].class);
        a(double[].class);
        b(double[].class);
        a(Object[].class);
        b(Object[].class);
        Field fieldC = c();
        g = (fieldC == null || ykh1Var == null) ? -1L : ykh1Var.a.objectFieldOffset(fieldC);
        h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static int a(Class cls) {
        if (e) {
            return c.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void b(Class cls) {
        if (e) {
            c.a.arrayIndexScale(cls);
        }
    }

    public static Field c() {
        Field declaredField;
        Field declaredField2;
        if (p34.a()) {
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

    public static boolean d(Class cls) {
        if (!p34.a()) {
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

    public static byte e(long j, byte[] bArr) {
        return c.d(f + j, bArr);
    }

    public static byte f(long j, Object obj) {
        return (byte) ((h((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte g(long j, Object obj) {
        return (byte) ((h((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static int h(long j, Object obj) {
        return c.a.getInt(obj, j);
    }

    public static long i(long j, Object obj) {
        return c.a.getLong(obj, j);
    }

    public static Object j(long j, Object obj) {
        return c.a.getObject(obj, j);
    }

    public static void k(Throwable th) {
        Logger.getLogger(dlh1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th)));
    }

    public static void l(byte[] bArr, long j, byte b2) {
        c.h(f + j, bArr, b2);
    }

    public static void m(long j, Object obj, byte b2) {
        long j2 = (-4) & j;
        int iH = h(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        o(obj, ((255 & b2) << i) | (iH & (~(255 << i))), j2);
    }

    public static void n(long j, Object obj, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        o(obj, ((255 & b2) << i) | (h(j2, obj) & (~(255 << i))), j2);
    }

    public static void o(Object obj, int i, long j) {
        c.a.putInt(obj, j, i);
    }

    public static void p(Object obj, long j, long j2) {
        c.a.putLong(obj, j, j2);
    }

    public static void q(Object obj, long j, Object obj2) {
        c.a.putObject(obj, j, obj2);
    }
}
