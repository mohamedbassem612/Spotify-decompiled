package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class eic0 {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof eic0) {
            return this.a.equals(((eic0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f4i1.f("LineText(value=", this.a, ")");
    }
}
