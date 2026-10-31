package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kfr0 implements qfr0 {
    public final boolean a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final tfr0 f;

    public kfr0(boolean z, String str, String str2, int i, String str3, tfr0 tfr0Var) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = tfr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kfr0)) {
            return false;
        }
        kfr0 kfr0Var = (kfr0) obj;
        return this.a == kfr0Var.a && u890.j(this.b, kfr0Var.b) && u890.j(this.c, kfr0Var.c) && this.d == kfr0Var.d && u890.j(this.e, kfr0Var.e) && this.f.equals(kfr0Var.f);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.d, cy30.d(cy30.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31);
        String str = this.e;
        return this.f.hashCode() + ((iF + (str == null ? 0 : str.hashCode())) * 31);
    }
}
