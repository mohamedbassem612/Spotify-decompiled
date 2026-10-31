package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kh21 extends lh21 {
    public final mpl a;
    public final long b;

    public kh21(mpl mplVar, long j) {
        this.a = mplVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kh21)) {
            return false;
        }
        kh21 kh21Var = (kh21) obj;
        return this.a.equals(kh21Var.a) && this.b == kh21Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
