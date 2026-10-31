package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kdc0 extends ldc0 {
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;

    public kdc0(int i, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdc0)) {
            return false;
        }
        kdc0 kdc0Var = (kdc0) obj;
        return u890.j(this.a, kdc0Var.a) && u890.j(this.b, kdc0Var.b) && this.c == kdc0Var.c && this.d == kdc0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
