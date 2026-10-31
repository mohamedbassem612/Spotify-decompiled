package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class afn implements ugn {
    public final boolean a;

    public afn(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof afn) && this.a == ((afn) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
