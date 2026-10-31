package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tej1 extends vej1 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public tej1(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tej1)) {
            return false;
        }
        tej1 tej1Var = (tej1) obj;
        return u890.j(this.a, tej1Var.a) && this.b == tej1Var.b && this.c == tej1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
