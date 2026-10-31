package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mio {
    public final boolean a;

    public mio(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mio) && this.a == ((mio) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
