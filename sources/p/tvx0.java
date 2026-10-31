package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tvx0 implements zvx0 {
    public final boolean a;

    public tvx0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tvx0) && this.a == ((tvx0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
