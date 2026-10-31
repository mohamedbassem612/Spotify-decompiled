package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pag0 extends vag0 {
    public final boolean a;

    public pag0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pag0) && this.a == ((pag0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
