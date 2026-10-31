package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class csw0 {
    public final int a;

    public csw0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof csw0) {
            return this.a == ((csw0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}
