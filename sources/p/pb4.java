package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pb4 {
    public final byte a;

    public final boolean equals(Object obj) {
        if (obj instanceof pb4) {
            return this.a == ((pb4) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return gvg.e(this.a, "AndroidContentDataType(androidAutofillType=", ")");
    }
}
