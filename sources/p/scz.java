package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class scz {
    public final String a;
    public final kcz b;
    public final qcz c;
    public final iu30 d;

    public scz(String str, kcz kczVar, qcz qczVar, iu30 iu30Var) {
        this.a = str;
        this.b = kczVar;
        this.c = qczVar;
        this.d = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof scz)) {
            return false;
        }
        scz sczVar = (scz) obj;
        return u890.j(this.a, sczVar.a) && this.b == sczVar.b && this.c.equals(sczVar.c) && u890.j(this.d, sczVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
