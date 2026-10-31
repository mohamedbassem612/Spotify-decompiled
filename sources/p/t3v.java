package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class t3v {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t3v) && p3v.c(10.0f, 10.0f) && p3v.c(40.0f, 40.0f) && p3v.c(10.0f, 10.0f) && p3v.c(40.0f, 40.0f);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + x0d.f(x0d.f(x0d.f(Float.hashCode(10.0f) * 31, 31, 40.0f), 31, 10.0f), 31, 40.0f);
    }

    public final String toString() {
        String strD = p3v.d(10.0f);
        String strD2 = p3v.d(40.0f);
        return rjx.o(gvg.n("DpTouchBoundsExpansion(start=", strD, ", top=", strD2, ", end="), p3v.d(10.0f), ", bottom=", p3v.d(40.0f), ", isLayoutDirectionAware=true)");
    }
}
