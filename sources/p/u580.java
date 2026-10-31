package p;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class u580 implements p580 {
    public static u580 m;
    public final Object a;
    public final Class b;
    public final Class c;
    public final Class d;
    public final Class e;
    public final Class f;
    public final Method g;
    public final Method h;
    public final Method i;
    public final Method j;
    public final a680 k;
    public static final dgb l = new dgb((byte) 13);
    public static final AtomicBoolean n = new AtomicBoolean(false);
    public static final ConcurrentHashMap o = new ConcurrentHashMap();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final ConcurrentHashMap f146p = new ConcurrentHashMap();
    public static final ConcurrentHashMap q = new ConcurrentHashMap();

    public u580(Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Method method, Method method2, Method method3, Method method4, a680 a680Var) {
        this.a = obj;
        this.b = cls;
        this.c = cls2;
        this.d = cls3;
        this.e = cls4;
        this.f = cls5;
        this.g = method;
        this.h = method2;
        this.i = method3;
        this.j = method4;
        this.k = a680Var;
    }

    public static final ConcurrentHashMap b() {
        if (dhn.a.contains(u580.class)) {
            return null;
        }
        try {
            return o;
        } catch (Throwable th) {
            dhn.a(u580.class, th);
            return null;
        }
    }

    public static final ConcurrentHashMap c() {
        if (dhn.a.contains(u580.class)) {
            return null;
        }
        try {
            return q;
        } catch (Throwable th) {
            dhn.a(u580.class, th);
            return null;
        }
    }

    public static final ConcurrentHashMap d() {
        if (dhn.a.contains(u580.class)) {
            return null;
        }
        try {
            return f146p;
        } catch (Throwable th) {
            dhn.a(u580.class, th);
            return null;
        }
    }

    public static final void e() {
        dhn.a.contains(u580.class);
    }

    @Override // p.p580
    public final void a(b680 b680Var, Runnable runnable) {
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            f(new c45((Object) this, (Object) b680Var, (Object) runnable, (byte) 20));
        } catch (Throwable th) {
            dhn.a(this, th);
        }
    }

    public final void f(Runnable runnable) {
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            if (n.get()) {
                runnable.run();
            } else {
                h(runnable);
            }
        } catch (Throwable th) {
            dhn.a(this, th);
        }
    }

    public final Object g() {
        if (dhn.a.contains(this)) {
            return null;
        }
        try {
            return this.a;
        } catch (Throwable th) {
            dhn.a(this, th);
            return null;
        }
    }

    public final void h(Runnable runnable) {
        Method methodA;
        Class cls = this.b;
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            Class clsX = c680.x("com.android.billingclient.api.BillingClientStateListener");
            if (clsX == null || (methodA = c680.A(cls, "startConnection", new Class[]{clsX})) == null) {
                return;
            }
            c680.B(cls, g(), methodA, new Object[]{Proxy.newProxyInstance(clsX.getClassLoader(), new Class[]{clsX}, new q580(runnable))});
        } catch (Throwable th) {
            dhn.a(this, th);
        }
    }
}
