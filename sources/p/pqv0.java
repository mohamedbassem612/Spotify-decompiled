package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class pqv0 implements sqv0 {
    public final boolean a;

    public pqv0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pqv0) && this.a == ((pqv0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
