package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class suj0 implements uuj0 {
    public final boolean a;

    public suj0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof suj0) && this.a == ((suj0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
