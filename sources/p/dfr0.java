package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class dfr0 implements qfr0 {
    public final int a;

    public dfr0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dfr0) && this.a == ((dfr0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
