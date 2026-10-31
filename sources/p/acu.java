package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class acu implements dcu {
    public final boolean a;

    public acu(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof acu) && this.a == ((acu) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
