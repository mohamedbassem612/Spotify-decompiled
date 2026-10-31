package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lvd1 {
    public final String a;
    public final String b;
    public final h290 c;
    public final String d;
    public final int e;

    public lvd1(String str, String str2, h290 h290Var, String str3, int i) {
        this.a = str;
        this.b = str2;
        this.c = h290Var;
        this.d = str3;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lvd1)) {
            return false;
        }
        lvd1 lvd1Var = (lvd1) obj;
        return this.a.equals(lvd1Var.a) && this.b.equals(lvd1Var.b) && this.c.equals(lvd1Var.c) && this.d.equals(lvd1Var.d) && this.e == lvd1Var.e;
    }

    public final int hashCode() {
        return l1d.C(this.e) + cy30.d(kk0.g(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
    }
}
