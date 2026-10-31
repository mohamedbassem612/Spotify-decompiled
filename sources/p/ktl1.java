package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ktl1 implements dbr0 {
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public ktl1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ktl1) && this.a == ((ktl1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
