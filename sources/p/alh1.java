package p;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class alh1 {
    public final Unsafe a;

    public void a(long j, long j2, byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    public boolean b(long j, Object obj) {
        if (clh1.h) {
            return clh1.f(j, obj) != 0;
        }
        return clh1.g(j, obj) != 0;
    }

    public byte c(long j) {
        throw new UnsupportedOperationException();
    }

    public byte d(long j, Object obj) {
        return clh1.h ? clh1.f(j, obj) : clh1.g(j, obj);
    }

    public double e(long j, Object obj) {
        return Double.longBitsToDouble(this.a.getLong(obj, j));
    }

    public float f(long j, Object obj) {
        return Float.intBitsToFloat(this.a.getInt(obj, j));
    }

    public void g(Object obj, long j, boolean z) {
        if (clh1.h) {
            clh1.l(j, obj, z ? (byte) 1 : (byte) 0);
        } else {
            clh1.m(j, obj, z ? (byte) 1 : (byte) 0);
        }
    }

    public void h(long j, Object obj, byte b) {
        if (clh1.h) {
            clh1.l(j, obj, b);
        } else {
            clh1.m(j, obj, b);
        }
    }

    public void i(Object obj, long j, double d) {
        this.a.putLong(obj, j, Double.doubleToLongBits(d));
    }

    public void j(Object obj, long j, float f) {
        this.a.putInt(obj, j, Float.floatToIntBits(f));
    }

    public boolean k() {
        Unsafe unsafe = this.a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            dlh1.k(th);
            return false;
        }
    }

    public boolean l() {
        return false;
    }
}
