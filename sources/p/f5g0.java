package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class f5g0 extends t4n1 {
    public final String b;
    public final boolean c;

    public f5g0(String str, boolean z) {
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5g0)) {
            return false;
        }
        f5g0 f5g0Var = (f5g0) obj;
        return u890.j(this.b, f5g0Var.b) && this.c == f5g0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }
}
