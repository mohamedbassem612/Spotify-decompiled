package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tlh {
    public final String a;
    public final String b;
    public final alr0 c;

    public tlh(String str, String str2, alr0 alr0Var) {
        this.a = str;
        this.b = str2;
        this.c = alr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tlh)) {
            return false;
        }
        tlh tlhVar = (tlh) obj;
        return u890.j(this.a, tlhVar.a) && this.b.equals(tlhVar.b) && u890.j(this.c, tlhVar.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        alr0 alr0Var = this.c;
        return iD + (alr0Var == null ? 0 : alr0Var.hashCode());
    }
}
