package p;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class i0d implements rzc {
    public final Member a;
    public final Type b;
    public final Class c;
    public final List d;

    public i0d(Member member, Type type, Class cls, Type[] typeArr) {
        List listQ0;
        this.a = member;
        this.b = type;
        this.c = cls;
        if (cls != null) {
            c8b1 c8b1Var = new c8b1(2);
            c8b1Var.a(cls);
            c8b1Var.b(typeArr);
            ArrayList arrayList = c8b1Var.a;
            listQ0 = p7h.M(arrayList.toArray(new Type[arrayList.size()]));
        } else {
            listQ0 = f46.Q0(typeArr);
        }
        this.d = listQ0;
    }

    @Override // p.rzc
    public final List a() {
        return this.d;
    }

    @Override // p.rzc
    public final Member b() {
        return this.a;
    }

    @Override // p.rzc
    public final boolean c() {
        return false;
    }

    public void d(Object[] objArr) {
        if (w0h1.r(this) == objArr.length) {
            return;
        }
        StringBuilder sb = new StringBuilder("Callable expects ");
        sb.append(w0h1.r(this));
        sb.append(" arguments, but ");
        hhg1.n(gvg.j(sb, objArr.length, " were provided."));
    }

    public final void e(Object obj) {
        if (obj == null || !this.a.getDeclaringClass().isInstance(obj)) {
            hhg1.n("An object member requires the object instance passed as the first argument.");
        }
    }

    @Override // p.rzc
    public final Type getReturnType() {
        return this.b;
    }
}
