package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lk11 {
    public final String a;
    public final int b;
    public final boolean c;

    public lk11(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lk11)) {
            return false;
        }
        lk11 lk11Var = (lk11) obj;
        return u890.j(this.a, lk11Var.a) && this.b == lk11Var.b && this.c == lk11Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
