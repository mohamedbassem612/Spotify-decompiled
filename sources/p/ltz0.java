package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ltz0 {
    public final String a;
    public final int b;
    public final boolean c;

    public ltz0(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ltz0)) {
            return false;
        }
        ltz0 ltz0Var = (ltz0) obj;
        return u890.j(this.a, ltz0Var.a) && this.b == ltz0Var.b && this.c == ltz0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
