package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pji0 implements qji0 {
    public final boolean a;

    public pji0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pji0) && this.a == ((pji0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
