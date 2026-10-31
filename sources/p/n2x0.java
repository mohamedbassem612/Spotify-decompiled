package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class n2x0 extends z2x0 {
    public final String a;
    public final String b;
    public final boolean c;

    public n2x0(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2x0)) {
            return false;
        }
        n2x0 n2x0Var = (n2x0) obj;
        return this.a.equals(n2x0Var.a) && this.b.equals(n2x0Var.b) && this.c == n2x0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
