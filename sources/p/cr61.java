package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cr61 extends dr61 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public cr61(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cr61)) {
            return false;
        }
        cr61 cr61Var = (cr61) obj;
        return u890.j(this.a, cr61Var.a) && this.b == cr61Var.b && this.c == cr61Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
