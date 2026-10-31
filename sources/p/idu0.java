package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class idu0 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public idu0(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof idu0)) {
            return false;
        }
        idu0 idu0Var = (idu0) obj;
        return u890.j(this.a, idu0Var.a) && this.b == idu0Var.b && this.c == idu0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
