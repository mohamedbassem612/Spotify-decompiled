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
public abstract class dcn1 {
    public static final Unsafe a;
    public static final Class b;
    public static final zkh1 c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final boolean g;

    /* JADX WARN: Code duplicated, block: B:15:0x004a  */
    static {
        Unsafe unsafe;
        boolean z;
        boolean z2;
        zkh1 zkh1Var;
        zbn1 zbn1Var = null;
        char c2 = 1;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new pkh1(1 == true ? 1 : 0));
        } catch (Throwable unused) {
            unsafe = null;
        }
        a = unsafe;
        int i = wgp1.a;
        b = Memory.class;
        Class cls = Long.TYPE;
        boolean zI = i(cls);
        Class cls2 = Integer.TYPE;
        boolean zI2 = i(cls2);
        byte b2 = 0;
        if (unsafe != null) {
            if (zI) {
                zbn1Var = new zbn1(unsafe, c2 == true ? 1 : 0);
            } else if (zI2) {
                zbn1Var = new zbn1(unsafe, b2);
            }
        }
        c = zbn1Var;
        if (zbn1Var == null) {
            z = false;
        } else {
            try {
                Class<?> cls3 = ((zkh1) zbn1Var).a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (b() == null) {
                    z = false;
                } else {
                    z = true;
                }
            } catch (Throwable th) {
                Logger.getLogger(dcn1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
        }
        d = z;
        zkh1 zkh1Var2 = c;
        if (zkh1Var2 == null) {
            z2 = false;
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
                z2 = true;
            } catch (Throwable th2) {
                Logger.getLogger(dcn1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                z2 = false;
            }
        }
        e = z2;
        f = l(byte[].class);
        l(boolean[].class);
        a(boolean[].class);
        l(int[].class);
        a(int[].class);
        l(long[].class);
        a(long[].class);
        l(float[].class);
        a(float[].class);
        l(double[].class);
        a(double[].class);
        l(Object[].class);
        a(Object[].class);
        Field fieldB = b();
        if (fieldB != null && (zkh1Var = c) != null) {
            zkh1Var.a.objectFieldOffset(fieldB);
        }
        g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Class cls) {
        if (e) {
            c.a.arrayIndexScale(cls);
        }
    }

    public static Field b() {
        Field declaredField;
        Field declaredField2;
        int i = wgp1.a;
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

    public static void c(Object obj, long j, byte b2) {
        Unsafe unsafe = c.a;
        long j2 = (-4) & j;
        int i = unsafe.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b2) << i2) | (i & (~(255 << i2))));
    }

    public static void d(Object obj, long j, byte b2) {
        Unsafe unsafe = c.a;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b2) << i) | (unsafe.getInt(obj, j2) & (~(255 << i))));
    }

    public static int e(long j, Object obj) {
        return c.a.getInt(obj, j);
    }

    public static void f(Object obj, int i, long j) {
        c.a.putInt(obj, j, i);
    }

    public static long g(long j, Object obj) {
        return c.a.getLong(obj, j);
    }

    public static Object h(long j, Object obj) {
        return c.a.getObject(obj, j);
    }

    public static boolean i(Class cls) {
        int i = wgp1.a;
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

    public static /* synthetic */ boolean j(Object obj, long j) {
        return ((byte) ((c.a.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ boolean k(long j, Object obj) {
        return ((byte) ((c.a.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static int l(Class cls) {
        if (e) {
            return c.a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
