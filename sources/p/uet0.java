package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uet0 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public uet0(String str, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uet0)) {
            return false;
        }
        uet0 uet0Var = (uet0) obj;
        return u890.j(this.a, uet0Var.a) && this.b == uet0Var.b && this.c == uet0Var.c && this.d == uet0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public /* synthetic */ uet0(String str, boolean z) {
        this(str, z, false, false);
    }
}
