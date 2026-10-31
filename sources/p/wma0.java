package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wma0 implements oma0 {
    public final oma0 a;

    public wma0(oma0 oma0Var) {
        this.a = oma0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        wma0 wma0Var = obj instanceof wma0 ? (wma0) obj : null;
        oma0 oma0Var = wma0Var != null ? wma0Var.a : null;
        oma0 oma0Var2 = this.a;
        if (!u890.j(oma0Var2, oma0Var)) {
            return false;
        }
        wdg wdgVarK = oma0Var2.k();
        if (!(wdgVarK instanceof tka0)) {
            return false;
        }
        oma0 oma0Var3 = obj instanceof oma0 ? (oma0) obj : null;
        jla0 jla0VarK = oma0Var3 != null ? oma0Var3.k() : null;
        if (jla0VarK == null || !(jla0VarK instanceof tka0)) {
            return false;
        }
        return ((tka0) wdgVarK).n().equals(((tka0) jla0VarK).n());
    }

    public final List getAnnotations() {
        return this.a.getAnnotations();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // p.oma0
    public final boolean i() {
        return this.a.i();
    }

    @Override // p.oma0
    public final jla0 k() {
        return this.a.k();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.a;
    }

    @Override // p.oma0
    public final List v() {
        return this.a.v();
    }
}
