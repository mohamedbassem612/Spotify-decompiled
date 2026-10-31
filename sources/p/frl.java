package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class frl implements grl {
    public final c380 a;
    public final boolean b;
    public final String c;

    public frl(int i, String str, c380 c380Var) {
        boolean z = (i & 2) == 0;
        str = (i & 4) != 0 ? null : str;
        this.a = c380Var;
        this.b = z;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof frl)) {
            return false;
        }
        frl frlVar = (frl) obj;
        return u890.j(this.a, frlVar.a) && this.b == frlVar.b && u890.j(this.c, frlVar.c);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iG + (str == null ? 0 : str.hashCode());
    }
}
