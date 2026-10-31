package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qwz extends o600 {
    public final boolean a;

    public qwz(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qwz) && this.a == ((qwz) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
