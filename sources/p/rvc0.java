package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class rvc0 implements h661 {
    public final h661 a;

    public rvc0(h661 h661Var) {
        this.a = h661Var;
    }

    @Override // p.h661
    public final int c(String str) {
        Integer numC0 = nhc1.c0(str);
        if (numC0 != null) {
            return numC0.intValue();
        }
        hhg1.n(str.concat(" is not a valid list index"));
        return 0;
    }

    @Override // p.h661
    public final int d() {
        return 1;
    }

    @Override // p.h661
    public final String e(int i) {
        return String.valueOf(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rvc0)) {
            return false;
        }
        rvc0 rvc0Var = (rvc0) obj;
        return u890.j(this.a, rvc0Var.a) && u890.j(h(), rvc0Var.h());
    }

    @Override // p.h661
    public final List f(int i) {
        if (i >= 0) {
            return z6x.a;
        }
        ncn0.g(cy30.r(i, "Illegal index ", ", "), h(), " expects only non-negative indices");
        return null;
    }

    @Override // p.h661
    public final h661 g(int i) {
        if (i >= 0) {
            return this.a;
        }
        ncn0.g(cy30.r(i, "Illegal index ", ", "), h(), " expects only non-negative indices");
        return null;
    }

    @Override // p.h661
    public final yoi1 getKind() {
        return uic1.i;
    }

    public final int hashCode() {
        return h().hashCode() + (this.a.hashCode() * 31);
    }

    @Override // p.h661
    public final boolean i(int i) {
        if (i >= 0) {
            return false;
        }
        ncn0.g(cy30.r(i, "Illegal index ", ", "), h(), " expects only non-negative indices");
        return false;
    }

    public final String toString() {
        return h() + '(' + this.a + ')';
    }
}
