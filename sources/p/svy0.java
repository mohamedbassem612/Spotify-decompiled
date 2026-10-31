package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class svy0 extends mgo1 {
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;

    public svy0(int i, String str, String str2, String str3, String str4) {
        this.c = str;
        this.d = i;
        this.e = str2;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof svy0)) {
            return false;
        }
        svy0 svy0Var = (svy0) obj;
        return this.c.equals(svy0Var.c) && this.d == svy0Var.d && this.e.equals(svy0Var.e) && this.f.equals(svy0Var.f) && this.g.equals(svy0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + cy30.d(cy30.d(kaa0.f(this.d, this.c.hashCode() * 31, 31), 31, this.e), 31, this.f);
    }
}
