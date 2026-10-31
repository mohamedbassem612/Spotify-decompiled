package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nf7 implements xf7 {
    public final boolean a;

    public nf7(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nf7) && this.a == ((nf7) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
