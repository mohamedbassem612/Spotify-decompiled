package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bh11 extends gh11 {
    public final boolean a;

    public bh11(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bh11) && this.a == ((bh11) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
