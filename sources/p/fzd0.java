package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fzd0 implements qzd0 {
    public final int a;

    public fzd0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fzd0) && this.a == ((fzd0) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
