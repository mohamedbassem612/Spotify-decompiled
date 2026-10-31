package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ysb1 {
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public ysb1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ysb1) && this.a == ((ysb1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
