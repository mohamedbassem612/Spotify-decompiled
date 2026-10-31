package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class so2 implements vo2 {
    public final String a;
    public final String b;
    public final kw01 c;

    public so2(String str, String str2, kw01 kw01Var) {
        this.a = str;
        this.b = str2;
        this.c = kw01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so2)) {
            return false;
        }
        so2 so2Var = (so2) obj;
        return u890.j(this.a, so2Var.a) && u890.j(this.b, so2Var.b) && u890.j(this.c, so2Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        kw01 kw01Var = this.c;
        return iD + (kw01Var == null ? 0 : kw01Var.hashCode());
    }
}
