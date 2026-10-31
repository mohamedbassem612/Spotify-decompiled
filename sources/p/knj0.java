package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class knj0 extends snj0 {
    public final boolean b;

    public knj0(boolean z) {
        super(true);
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof knj0) && this.b == ((knj0) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }
}
