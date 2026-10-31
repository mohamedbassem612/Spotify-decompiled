package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class psl {
    public final boolean a;

    public psl(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof psl) && this.a == ((psl) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
