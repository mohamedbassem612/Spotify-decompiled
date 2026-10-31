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
public abstract class dkn1 {
    public static final Unsafe a;
    public static final Class b;
    public static final zkh1 c;
    public static final boolean d;
    public static final boolean e;

    static {
        boolean z;
        zkh1 zkh1Var;
        Unsafe unsafeG = g();
        a = unsafeG;
        int i = phn1.a;
        b = Memory.class;
        Class cls = Long.TYPE;
        boolean zH = h(cls);
        Class cls2 = Integer.TYPE;
        boolean zH2 = h(cls2);
        char c2 = 1;
        ckn1 ckn1Var = null;
        byte b2 = 0;
        if (unsafeG != null) {
            if (zH) {
                ckn1Var = new ckn1(unsafeG, c2 == true ? 1 : 0);
            } else if (zH2) {
                ckn1Var = new ckn1(unsafeG, b2);
            }
        }
        c = ckn1Var;
        if (ckn1Var != null) {
            try {
                Class<?> cls3 = ((zkh1) ckn1Var).a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                o();
            } catch (Throwable th) {
                Logger.getLogger(dkn1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
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
                Logger.getLogger(dkn1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                z = false;
            }
        }
        d = z;
        m(byte[].class);
        m(boolean[].class);
        n(boolean[].class);
        m(int[].class);
        n(int[].class);
        m(long[].class);
        n(long[].class);
        m(float[].class);
        n(float[].class);
        m(double[].class);
        n(double[].class);
        m(Object[].class);
        n(Object[].class);
        Field fieldO = o();
        if (fieldO != null && (zkh1Var = c) != null) {
            zkh1Var.a.objectFieldOffset(fieldO);
        }
        e = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static int a(long j, Object obj) {
        return c.a.getInt(obj, j);
    }

    public static void b(Object obj, int i, long j) {
        c.a.putInt(obj, j, i);
    }

    public static long c(Object obj, long j) {
        return c.a.getLong(obj, j);
    }

    public static void d(Object obj, long j, long j2) {
        c.a.putLong(obj, j, j2);
    }

    public static Object e(long j, Object obj) {
        return c.a.getObject(obj, j);
    }

    public static void f(Object obj, long j, Object obj2) {
        c.a.putObject(obj, j, obj2);
    }

    public static Unsafe g() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new pkh1((byte) 2));
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
            Logger.getLogger(dkn1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    public static boolean h(Class cls) {
        int i = phn1.a;
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

    public static /* synthetic */ boolean i(long j, Object obj) {
        return ((byte) ((c.a.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ boolean j(long j, Object obj) {
        return ((byte) ((c.a.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ void k(Object obj, long j, boolean z) {
        Unsafe unsafe = c.a;
        long j2 = (-4) & j;
        int i = unsafe.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j2, ((z ? 1 : 0) << i2) | ((~(255 << i2)) & i));
    }

    public static /* synthetic */ void l(Object obj, long j, boolean z) {
        Unsafe unsafe = c.a;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j2, ((z ? 1 : 0) << i) | ((~(255 << i)) & unsafe.getInt(obj, j2)));
    }

    public static void m(Class cls) {
        if (d) {
            c.a.arrayBaseOffset(cls);
        }
    }

    public static void n(Class cls) {
        if (d) {
            c.a.arrayIndexScale(cls);
        }
    }

    public static Field o() {
        Field declaredField;
        Field declaredField2;
        int i = phn1.a;
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
}
