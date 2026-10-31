package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class agh0 implements dgh0 {
    public final boolean a;

    public agh0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof agh0) && this.a == ((agh0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
