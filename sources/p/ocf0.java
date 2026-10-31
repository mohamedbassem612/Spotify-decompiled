package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ocf0 implements qcf0 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof ocf0) {
            return this.a == ((ocf0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return gvg.e(this.a, "RawRes(resId=", ")");
    }
}
