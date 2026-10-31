package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ixz implements a600 {
    public final boolean a;

    public ixz(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ixz) && this.a == ((ixz) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
