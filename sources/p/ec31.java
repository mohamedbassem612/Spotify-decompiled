package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ec31 {
    public final int a;

    public ec31(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ec31) && this.a == ((ec31) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Integer.hashCode(this.a) * 31);
    }
}
