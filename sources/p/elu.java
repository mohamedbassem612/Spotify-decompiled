package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class elu {
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public elu(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof elu) && this.a == ((elu) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a) + kaa0.f(0, Integer.hashCode(50) * 31, 31);
    }
}
