package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sif0 implements yif0 {
    public final boolean a;

    public sif0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sif0) && this.a == ((sif0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
