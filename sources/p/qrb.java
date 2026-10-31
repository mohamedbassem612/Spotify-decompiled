package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qrb {
    public final boolean a;

    public qrb(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qrb) && this.a == ((qrb) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
