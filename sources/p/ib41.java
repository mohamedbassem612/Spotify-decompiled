package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ib41 extends pb41 {
    public final boolean a;

    public ib41(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ib41) && this.a == ((ib41) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
