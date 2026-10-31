package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u1s0 extends zmo1 {
    public final int b;

    public u1s0(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u1s0) && this.b == ((u1s0) obj).b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }
}
