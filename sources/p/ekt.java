package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ekt extends m87 {
    public final fkt d;

    public ekt(fkt fktVar) {
        this.d = fktVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ekt) && this.d == ((ekt) obj).d;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
