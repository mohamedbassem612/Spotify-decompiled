package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class tqf0 implements xqf0 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof tqf0) {
            return this.a == ((tqf0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return f4i1.f("OnLineClicked(lineIndex=", gvg.e(this.a, "LineIndex(value=", ")"), ")");
    }
}
