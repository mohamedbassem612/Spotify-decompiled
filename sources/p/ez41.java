package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ez41 extends q151 {
    public final boolean a;

    public ez41(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ez41) && this.a == ((ez41) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
