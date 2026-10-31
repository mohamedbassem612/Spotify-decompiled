package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qe21 implements ez00 {
    public final boolean a;

    public qe21(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qe21) && this.a == ((qe21) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
