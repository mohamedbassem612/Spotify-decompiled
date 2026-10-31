package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pj90 implements qj90 {
    public final int a;

    public pj90(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pj90) && this.a == ((pj90) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
