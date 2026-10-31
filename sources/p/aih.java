package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class aih extends eih {
    public final boolean a;

    public aih(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aih) && this.a == ((aih) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
