package p;

import com.google.protobuf.m;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yz00 extends xz00 {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    static {
        try {
            a = dlh1.c.a.objectFieldOffset(pe40.class.getDeclaredField("b"));
        } catch (Throwable th) {
            k220.p("Unable to lookup extension field offset", th);
        }
    }

    @Override // p.xz00
    public final int a(Map.Entry entry) {
        pze0.m(entry.getKey());
        throw null;
    }

    @Override // p.xz00
    public final Object b(uz00 uz00Var, s2j0 s2j0Var, int i) {
        bb00.l(s2j0Var);
        throw null;
    }

    @Override // p.xz00
    public final l220 d(Object obj) {
        l220 l220VarC = c(obj);
        if (!l220VarC.b) {
            return l220VarC;
        }
        l220 l220VarClone = l220VarC.clone();
        dlh1.q(obj, a, l220VarClone);
        return l220VarClone;
    }

    @Override // p.xz00
    public final boolean e(s2j0 s2j0Var) {
        return false;
    }

    @Override // p.xz00
    public final void f(Object obj) {
        c(obj).j();
    }

    @Override // p.xz00
    public final Object g(Object obj, zb01 zb01Var, Object obj2, uz00 uz00Var, l220 l220Var, Object obj3, m mVar) {
        kaa0.k(obj2);
        throw null;
    }

    @Override // p.xz00
    public final void h(zb01 zb01Var, Object obj, uz00 uz00Var, l220 l220Var) {
        kaa0.k(obj);
        throw null;
    }

    @Override // p.xz00
    public final void i(phc phcVar, Object obj, uz00 uz00Var, l220 l220Var) {
        kaa0.k(obj);
        throw null;
    }

    @Override // p.xz00
    public final void j(i6b i6bVar, Map.Entry entry) {
        pze0.m(entry.getKey());
        throw null;
    }
}
