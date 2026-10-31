package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class dz21 {
    public final String a;
    public final String b;
    public final c380 c;
    public final String d;

    public dz21(String str, String str2, String str3, c380 c380Var) {
        this.a = str;
        this.b = str2;
        this.c = c380Var;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz21)) {
            return false;
        }
        dz21 dz21Var = (dz21) obj;
        return this.a.equals(dz21Var.a) && this.b.equals(dz21Var.b) && u890.j(this.c, dz21Var.c) && u890.j(this.d, dz21Var.d);
    }

    public final int hashCode() {
        int iF = kk0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
        String str = this.d;
        return iF + (str == null ? 0 : str.hashCode());
    }
}
