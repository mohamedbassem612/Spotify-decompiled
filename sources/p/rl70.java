package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rl70 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rl70) && p3v.c(32.0f, 32.0f) && p3v.c(40.0f, 40.0f) && p3v.c(48.0f, 48.0f);
    }

    public final int hashCode() {
        return Float.hashCode(48.0f) + x0d.f(Float.hashCode(32.0f) * 31, 31, 40.0f);
    }

    public final String toString() {
        return l1d.n(p3v.d(48.0f), ")", gvg.n("IconSizes(small=", p3v.d(32.0f), ", medium=", p3v.d(40.0f), ", large="));
    }
}
