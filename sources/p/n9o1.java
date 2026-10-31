package p;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class n9o1 {
    public static final Unsafe a;
    public static final Class b;
    public static final zkh1 c;
    public static final boolean d;
    public static final long e;
    public static final boolean f;

    static {
        boolean z;
        zkh1 zkh1Var;
        Unsafe unsafeP = p();
        a = unsafeP;
        int i = asn1.a;
        b = Memory.class;
        Class cls = Long.TYPE;
        boolean zQ = q(cls);
        Class cls2 = Integer.TYPE;
        boolean zQ2 = q(cls2);
        char c2 = 1;
        a9o1 a9o1Var = null;
        byte b2 = 0;
        if (unsafeP != null) {
            if (zQ) {
                a9o1Var = new a9o1(unsafeP, c2 == true ? 1 : 0);
            } else if (zQ2) {
                a9o1Var = new a9o1(unsafeP, b2);
            }
        }
        c = a9o1Var;
        if (a9o1Var != null) {
            try {
                Class<?> cls3 = ((zkh1) a9o1Var).a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                a();
            } catch (Throwable th) {
                Logger.getLogger(n9o1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
        }
        zkh1 zkh1Var2 = c;
        if (zkh1Var2 == null) {
            z = false;
        } else {
            try {
                Class<?> cls4 = zkh1Var2.a.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z = true;
            } catch (Throwable th2) {
                Logger.getLogger(n9o1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                z = false;
            }
        }
        d = z;
        e = t(byte[].class);
        t(boolean[].class);
        u(boolean[].class);
        t(int[].class);
        u(int[].class);
        t(long[].class);
        u(long[].class);
        t(float[].class);
        u(float[].class);
        t(double[].class);
        u(double[].class);
        t(Object[].class);
        u(Object[].class);
        Field fieldA = a();
        if (fieldA != null && (zkh1Var = c) != null) {
            zkh1Var.a.objectFieldOffset(fieldA);
        }
        f = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static Field a() {
        Field declaredField;
        Field declaredField2;
        int i = asn1.a;
        try {
            declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            declaredField = null;
        }
        if (declaredField != null) {
            return declaredField;
        }
        try {
            declaredField2 = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField2 = null;
        }
        if (declaredField2 == null || declaredField2.getType() != Long.TYPE) {
            return null;
        }
        return declaredField2;
    }

    public static void b(long j, Object obj, byte b2) {
        Unsafe unsafe = c.a;
        long j2 = (-4) & j;
        int i = unsafe.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b2) << i2) | (i & (~(255 << i2))));
    }

    public static void c(Object obj, long j, byte b2) {
        Unsafe unsafe = c.a;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b2) << i) | (unsafe.getInt(obj, j2) & (~(255 << i))));
    }

    public static int d(Object obj, long j) {
        return c.a.getInt(obj, j);
    }

    public static void e(Object obj, int i, long j) {
        c.a.putInt(obj, j, i);
    }

    public static long f(long j, Object obj) {
        return c.a.getLong(obj, j);
    }

    public static void g(Object obj, long j, long j2) {
        c.a.putLong(obj, j, j2);
    }

    public static boolean h(Object obj, long j) {
        return c.o(j, obj);
    }

    public static void i(Object obj, long j, boolean z) {
        c.q(obj, j, z);
    }

    public static float j(long j, Object obj) {
        return c.r(j, obj);
    }

    public static void k(Object obj, long j, float f2) {
        c.w(obj, j, f2);
    }

    public static double l(long j, Object obj) {
        return c.x(j, obj);
    }

    public static void m(Object obj, long j, double d2) {
        c.A(obj, j, d2);
    }

    public static Object n(long j, Object obj) {
        return c.a.getObject(obj, j);
    }

    public static void o(Object obj, long j, Object obj2) {
        c.a.putObject(obj, j, obj2);
    }

    public static Unsafe p() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new pkh1((byte) 4));
        } catch (Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (Exception unused2) {
            Logger.getLogger(n9o1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    public static boolean q(Class cls) {
        int i = asn1.a;
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

    public static /* synthetic */ boolean r(Object obj, long j) {
        return ((byte) ((c.a.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ boolean s(Object obj, long j) {
        return ((byte) ((c.a.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static int t(Class cls) {
        if (d) {
            return c.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void u(Class cls) {
        if (d) {
            c.a.arrayIndexScale(cls);
        }
    }
}
