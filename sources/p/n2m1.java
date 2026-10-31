package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class n2m1 extends sgc1 {
    public final String b;
    public final boolean c;

    public n2m1(String str, boolean z) {
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2m1)) {
            return false;
        }
        n2m1 n2m1Var = (n2m1) obj;
        return u890.j(this.b, n2m1Var.b) && this.c == n2m1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }
}
