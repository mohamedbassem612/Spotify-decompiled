package p;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class zkh1 {
    public final Unsafe a;

    public abstract void A(Object obj, long j, double d);

    public abstract boolean B(Object obj, long j);

    public abstract boolean a(long j, Object obj);

    public abstract double b(long j, Object obj);

    public abstract float c(long j, Object obj);

    public abstract void d(Object obj, long j, boolean z);

    public abstract void e(long j, Object obj, byte b);

    public abstract void f(Object obj, long j, double d);

    public abstract void g(Object obj, long j, float f);

    public boolean h() {
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
            blh1.j(th);
            return false;
        }
    }

    public abstract boolean i();

    public abstract double j(Object obj, long j);

    public abstract void k(long j, Object obj, byte b);

    public abstract boolean l(long j, Object obj);

    public abstract float m(Object obj, long j);

    public abstract void n(Object obj, long j, boolean z);

    public abstract boolean o(long j, Object obj);

    public abstract float p(long j, Object obj);

    public abstract void q(Object obj, long j, boolean z);

    public abstract float r(long j, Object obj);

    public abstract void s(Object obj, long j, byte b);

    public abstract void t(Object obj, long j, float f);

    public abstract double u(long j, Object obj);

    public abstract void v(Object obj, long j, double d);

    public abstract void w(Object obj, long j, float f);

    public abstract double x(long j, Object obj);

    public abstract void y(Object obj, long j, double d);

    public abstract void z(Object obj, long j, float f);
}
