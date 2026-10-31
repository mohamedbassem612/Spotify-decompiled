package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mig1 implements ez00 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;

    public mig1(String str, String str2, String str3, String str4, int i, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mig1)) {
            return false;
        }
        mig1 mig1Var = (mig1) obj;
        return this.a.equals(mig1Var.a) && this.b.equals(mig1Var.b) && this.c.equals(mig1Var.c) && this.d.equals(mig1Var.d) && this.e.equals(mig1Var.e) && this.f.equals(mig1Var.f) && this.g == mig1Var.g;
    }

    public final int hashCode() {
        return l1d.C(this.g) + cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }
}
