package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rra0 implements sra0 {
    public final String a;
    public final boolean b;

    public rra0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rra0)) {
            return false;
        }
        rra0 rra0Var = (rra0) obj;
        return this.a.equals(rra0Var.a) && this.b == rra0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
