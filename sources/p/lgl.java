package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lgl {
    public final dvd1 a;
    public final int b;
    public final boolean c;
    public final String d;

    public lgl(dvd1 dvd1Var, int i, boolean z, String str) {
        this.a = dvd1Var;
        this.b = i;
        this.c = z;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lgl)) {
            return false;
        }
        lgl lglVar = (lgl) obj;
        return this.a.equals(lglVar.a) && this.b == lglVar.b && this.c == lglVar.c && u890.j(this.d, lglVar.d);
    }

    public final int hashCode() {
        int iG = xcg1.g(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        String str = this.d;
        return iG + (str == null ? 0 : str.hashCode());
    }
}
