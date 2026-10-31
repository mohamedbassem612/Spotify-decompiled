package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l0b1 {
    public final boolean a;

    public l0b1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0b1) && this.a == ((l0b1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
