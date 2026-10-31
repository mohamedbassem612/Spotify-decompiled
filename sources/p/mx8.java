package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mx8 implements nx8 {
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public mx8(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mx8) && this.a == ((mx8) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
