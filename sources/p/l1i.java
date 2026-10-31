package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class l1i {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l1i) && p3v.c(6.0f, 6.0f) && p3v.c(8.0f, 8.0f) && p3v.c(12.0f, 12.0f) && p3v.c(16.0f, 16.0f) && p3v.c(20.0f, 20.0f);
    }

    public final int hashCode() {
        return Float.hashCode(20.0f) + x0d.f(x0d.f(x0d.f(Float.hashCode(6.0f) * 31, 31, 8.0f), 31, 12.0f), 31, 16.0f);
    }

    public final String toString() {
        String strD = p3v.d(6.0f);
        String strD2 = p3v.d(8.0f);
        String strD3 = p3v.d(12.0f);
        String strD4 = p3v.d(16.0f);
        String strD5 = p3v.d(20.0f);
        StringBuilder sbN = gvg.n("ComponentSpacingValues(extraSmall=", strD, ", small=", strD2, ", medium=");
        bb00.j(sbN, strD3, ", large=", strD4, ", extraLarge=");
        return l1d.n(strD5, ")", sbN);
    }
}
