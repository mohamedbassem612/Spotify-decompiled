package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gwt {
    public final ato0 a;
    public final int b;
    public final int c;

    public gwt(ato0 ato0Var, int i, int i2) {
        this.a = ato0Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gwt)) {
            return false;
        }
        gwt gwtVar = (gwt) obj;
        return u890.j(this.a, gwtVar.a) && this.b == gwtVar.b && this.c == gwtVar.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + ab80.k(this.b, this.a.hashCode() * 31, 31);
    }
}
