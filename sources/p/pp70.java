package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pp70 {
    public final afx a;
    public final afx b;
    public final afx c;
    public final u7h d;

    public pp70(afx afxVar, afx afxVar2, afx afxVar3, u7h u7hVar) {
        this.a = afxVar;
        this.b = afxVar2;
        this.c = afxVar3;
        this.d = u7hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pp70)) {
            return false;
        }
        pp70 pp70Var = (pp70) obj;
        return this.a.equals(pp70Var.a) && this.b.equals(pp70Var.b) && this.c.equals(pp70Var.c) && this.d.equals(pp70Var.d);
    }

    public final int hashCode() {
        return z4h1.c(this.d.a) + ab80.l(this.c, ab80.l(this.b, this.a.hashCode() * 31, 31), 31);
    }
}
