package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pey0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final zzq0 f;

    public pey0(String str, String str2, String str3, String str4, String str5, zzq0 zzq0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = zzq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pey0)) {
            return false;
        }
        pey0 pey0Var = (pey0) obj;
        return this.a.equals(pey0Var.a) && this.b.equals(pey0Var.b) && this.c.equals(pey0Var.c) && this.d.equals(pey0Var.d) && this.e.equals(pey0Var.e) && this.f.equals(pey0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(l1d.C(1) * 31, 31, this.a), 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
