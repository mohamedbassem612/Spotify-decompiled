package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pfr0 implements qfr0, sfr0 {
    public final String a;
    public final String b;
    public final tr80 c;
    public final boolean d;
    public final tfr0 e;

    public pfr0(String str, String str2, tr80 tr80Var, boolean z, tfr0 tfr0Var) {
        this.a = str;
        this.b = str2;
        this.c = tr80Var;
        this.d = z;
        this.e = tfr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pfr0)) {
            return false;
        }
        pfr0 pfr0Var = (pfr0) obj;
        return u890.j(this.a, pfr0Var.a) && u890.j(this.b, pfr0Var.b) && u890.j(this.c, pfr0Var.c) && this.d == pfr0Var.d && u890.j(this.e, pfr0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + xcg1.g(lf51.e(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
