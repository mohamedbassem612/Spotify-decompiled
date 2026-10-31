package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class trf implements wrf {
    public final w4i1 a;
    public final boolean b;
    public final boolean c;

    public trf(w4i1 w4i1Var, boolean z, boolean z2) {
        this.a = w4i1Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof trf)) {
            return false;
        }
        trf trfVar = (trf) obj;
        return u890.j(this.a, trfVar.a) && this.b == trfVar.b && this.c == trfVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
