package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class om51 {
    public final boolean a;

    public om51(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof om51) && this.a == ((om51) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
