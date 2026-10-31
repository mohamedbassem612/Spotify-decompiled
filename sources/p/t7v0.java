package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class t7v0 extends b8v0 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public t7v0(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7v0)) {
            return false;
        }
        t7v0 t7v0Var = (t7v0) obj;
        return u890.j(this.a, t7v0Var.a) && this.b == t7v0Var.b && this.c == t7v0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
