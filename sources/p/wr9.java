package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wr9 implements zr9 {
    public final boolean a;

    public wr9(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wr9) && this.a == ((wr9) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
