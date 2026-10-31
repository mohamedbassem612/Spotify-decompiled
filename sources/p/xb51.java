package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xb51 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof xb51) {
            return this.a == ((xb51) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return gvg.e(this.a, "RenderContentUpdate(id=", ")");
    }
}
