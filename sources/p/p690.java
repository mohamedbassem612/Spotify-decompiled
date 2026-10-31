package p;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class p690 implements rzc {
    public final Method a;
    public final List b;
    public final Class c;

    public p690(Method method, List list) {
        this.a = method;
        this.b = list;
        this.c = method.getReturnType();
    }

    @Override // p.rzc
    public final List a() {
        return this.b;
    }

    @Override // p.rzc
    public final Member b() {
        return null;
    }

    @Override // p.rzc
    public final boolean c() {
        return false;
    }

    public final void d(Object[] objArr) {
        if (w0h1.r(this) == objArr.length) {
            return;
        }
        StringBuilder sb = new StringBuilder("Callable expects ");
        sb.append(w0h1.r(this));
        sb.append(" arguments, but ");
        hhg1.n(gvg.j(sb, objArr.length, " were provided."));
    }

    @Override // p.rzc
    public final Type getReturnType() {
        return this.c;
    }
}
