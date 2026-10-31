package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fgd1 {
    public final int a;

    public fgd1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fgd1) && this.a == ((fgd1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
