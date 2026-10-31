package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hx3 {
    public final String a;
    public final c2b0 b;
    public final boolean c;

    public hx3(String str, c2b0 c2b0Var, boolean z) {
        this.a = str;
        this.b = c2b0Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hx3)) {
            return false;
        }
        hx3 hx3Var = (hx3) obj;
        return u890.j(this.a, hx3Var.a) && this.b == hx3Var.b && this.c == hx3Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
