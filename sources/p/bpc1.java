package p;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bpc1 implements rue0 {
    public final String a;
    public volatile rue0 b;
    public Boolean c;
    public Method d;
    public uo5 e;
    public final LinkedBlockingQueue f;
    public final boolean g;

    public bpc1(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z) {
        this.a = str;
        this.f = linkedBlockingQueue;
        this.g = z;
    }

    public final rue0 a() {
        if (this.b != null) {
            return this.b;
        }
        if (this.g) {
            return kin0.b;
        }
        uo5 uo5Var = this.e;
        if (uo5Var != null) {
            return uo5Var;
        }
        LinkedBlockingQueue linkedBlockingQueue = this.f;
        uo5 uo5Var2 = new uo5((byte) 14);
        uo5Var2.c = this;
        uo5Var2.b = this.a;
        uo5Var2.d = linkedBlockingQueue;
        this.e = uo5Var2;
        return uo5Var2;
    }

    public final void b(Object obj) {
        a().b(obj);
    }

    public final boolean c() {
        Boolean bool;
        Boolean bool2 = this.c;
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        try {
            this.d = this.b.getClass().getMethod("log", cpc1.class);
            bool = Boolean.TRUE;
            this.c = bool;
        } catch (NoSuchMethodException unused) {
            bool = Boolean.FALSE;
            this.c = bool;
        }
        return bool.booleanValue();
    }

    public final void d(String str, Object obj, Object obj2) {
        a().d(str, obj, obj2);
    }

    public final void e(String str) {
        a().e(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && bpc1.class == obj.getClass() && this.a.equals(((bpc1) obj).a);
    }

    public final void f(String str, Object... objArr) {
        a().f(str, objArr);
    }

    public final boolean g() {
        return a().g();
    }

    public final String getName() {
        return this.a;
    }

    public final void h(String str, Integer num, Object obj) {
        a().h(str, num, obj);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void i(String str, Throwable th) {
        a().i(str, th);
    }

    public final void j(Object obj, Exception exc) {
        a().j(obj, exc);
    }

    public final void k(String str, Exception exc) {
        a().k(str, exc);
    }

    public final void l(Object obj, String str) {
        a().l(obj, str);
    }

    public final void m(Object obj, String str) {
        a().m(obj, str);
    }

    public final void n(Object... objArr) {
        a().n(objArr);
    }

    public final void o(String str) {
        a().o(str);
    }

    public final void p(String str) {
        a().p(str);
    }

    public final boolean q() {
        return this.b instanceof kin0;
    }

    public final boolean r() {
        return this.b == null;
    }

    public final void s(cpc1 cpc1Var) {
        if (c()) {
            try {
                this.d.invoke(this.b, cpc1Var);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    public final void t(rue0 rue0Var) {
        this.b = rue0Var;
    }
}
