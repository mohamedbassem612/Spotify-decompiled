package p;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class ma implements h0h1 {
    public int a;
    public final poe0 b;

    public ma(s1c1 s1c1Var) {
        this.b = new poe0((voe0) s1c1Var, new ka(this, (byte) 0), new p5(this, (byte) 5));
    }

    public abstract Collection a();

    public a8b0 b() {
        return bkz.b(zjz.g, new String[0]);
    }

    public djx0 c() {
        return djx0.R0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof h0h1) && obj.hashCode() == hashCode()) {
            h0h1 h0h1Var = (h0h1) obj;
            if (h0h1Var.getParameters().size() == getParameters().size()) {
                jfg jfgVarS = s();
                jfg jfgVarS2 = h0h1Var.s();
                if (jfgVarS2 == null || bkz.e(jfgVarS) || iht.m(jfgVarS) || bkz.e(jfgVarS2) || iht.m(jfgVarS2)) {
                    return false;
                }
                return g(jfgVarS2);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final List d() {
        return ((la) this.b.invoke()).b;
    }

    public abstract boolean g(jfg jfgVar);

    public List h(List list) {
        return list;
    }

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        jfg jfgVarS = s();
        int iIdentityHashCode = (bkz.e(jfgVarS) || iht.m(jfgVarS)) ? System.identityHashCode(this) : iht.f(jfgVarS).a.hashCode();
        this.a = iIdentityHashCode;
        return iIdentityHashCode;
    }
}
