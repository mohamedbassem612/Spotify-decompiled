package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class n8z {
    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public n8z(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n8z) && this.a == ((n8z) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a ? 1 : 0) + (Integer.hashCode(0) * 31);
    }
}
