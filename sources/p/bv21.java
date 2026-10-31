package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bv21 {
    public final String a;
    public final long b;
    public final boolean c;

    public bv21(long j, String str, boolean z) {
        this.a = str;
        this.b = j;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bv21)) {
            return false;
        }
        bv21 bv21Var = (bv21) obj;
        return u890.j(this.a, bv21Var.a) && this.b == bv21Var.b && this.c == bv21Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.f(this.a.hashCode() * 31, this.b, 31);
    }
}
