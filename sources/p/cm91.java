package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cm91 {
    public final String a;
    public final String b;
    public final sp91 c;
    public final boolean d;
    public final jm91 e;

    public cm91(String str, String str2, sp91 sp91Var, boolean z, jm91 jm91Var) {
        this.a = str;
        this.b = str2;
        this.c = sp91Var;
        this.d = z;
        this.e = jm91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cm91)) {
            return false;
        }
        cm91 cm91Var = (cm91) obj;
        return this.a.equals(cm91Var.a) && this.b.equals(cm91Var.b) && this.c.equals(cm91Var.c) && this.d == cm91Var.d && this.e.equals(cm91Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + xcg1.g((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
    }
}
