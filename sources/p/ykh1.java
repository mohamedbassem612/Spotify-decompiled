package p;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ykh1 extends alh1 {
    public ykh1(Unsafe unsafe) {
        super(unsafe);
    }

    public final void a(long j, long j2, byte[] bArr) {
        ((alh1) this).a.copyMemory((Object) null, j, bArr, dlh1.f, j2);
    }

    public final boolean b(long j, Object obj) {
        return ((alh1) this).a.getBoolean(obj, j);
    }

    public final byte c(long j) {
        return ((alh1) this).a.getByte(j);
    }

    public final byte d(long j, Object obj) {
        return ((alh1) this).a.getByte(obj, j);
    }

    public final double e(long j, Object obj) {
        return ((alh1) this).a.getDouble(obj, j);
    }

    public final float f(long j, Object obj) {
        return ((alh1) this).a.getFloat(obj, j);
    }

    public final void g(Object obj, long j, boolean z) {
        ((alh1) this).a.putBoolean(obj, j, z);
    }

    public final void h(long j, Object obj, byte b) {
        ((alh1) this).a.putByte(obj, j, b);
    }

    public final void i(Object obj, long j, double d) {
        ((alh1) this).a.putDouble(obj, j, d);
    }

    public final void j(Object obj, long j, float f) {
        ((alh1) this).a.putFloat(obj, j, f);
    }

    public final boolean k() {
        if (!super.k()) {
            return false;
        }
        try {
            Class<?> cls = ((alh1) this).a.getClass();
            Class cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            dlh1.k(th);
            return false;
        }
    }

    public final boolean l() {
        Unsafe unsafe = ((alh1) this).a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (dlh1.c() != null) {
                    try {
                        Class<?> cls3 = unsafe.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        dlh1.k(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                dlh1.k(th2);
            }
        }
        return false;
    }
}
