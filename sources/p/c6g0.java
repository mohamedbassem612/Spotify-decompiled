package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c6g0 extends n6g0 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public c6g0(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6g0)) {
            return false;
        }
        c6g0 c6g0Var = (c6g0) obj;
        return u890.j(this.a, c6g0Var.a) && this.b == c6g0Var.b && this.c == c6g0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
