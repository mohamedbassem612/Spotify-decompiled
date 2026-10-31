package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cth1 implements gth1 {
    public final boolean a;

    public cth1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cth1) && this.a == ((cth1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
