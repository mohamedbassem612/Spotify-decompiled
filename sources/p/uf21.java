package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uf21 implements vf21 {
    public final boolean a;

    public uf21(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uf21) && this.a == ((uf21) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
