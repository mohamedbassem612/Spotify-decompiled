package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hit0 implements jit0 {
    public final int a;

    public hit0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hit0) && this.a == ((hit0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
