package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wxg1 {
    public final vu30 a;
    public final yj41 b;
    public final txg1 c;
    public final txg1 d;
    public final txg1 e;

    public wxg1(vu30 vu30Var, yj41 yj41Var, txg1 txg1Var, txg1 txg1Var2, txg1 txg1Var3) {
        this.a = vu30Var;
        this.b = yj41Var;
        this.c = txg1Var;
        this.d = txg1Var2;
        this.e = txg1Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wxg1) {
            wxg1 wxg1Var = (wxg1) obj;
            return u890.j(this.a, wxg1Var.a) && u890.j(this.b, wxg1Var.b) && this.c == wxg1Var.c && this.d == wxg1Var.d && this.e == wxg1Var.e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}
