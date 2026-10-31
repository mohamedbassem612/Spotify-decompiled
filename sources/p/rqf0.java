package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rqf0 {
    public final float a;

    public final boolean equals(Object obj) {
        if (obj instanceof rqf0) {
            return Float.compare(this.a, ((rqf0) obj).a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return c13.h("SaveUserTextScalePreference(textScale=", this.a, ")");
    }
}
