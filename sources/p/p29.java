package p;

import android.util.Size;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class p29 {
    public final Size a;
    public final HashMap b;
    public final Size c;
    public final HashMap d;
    public final Size e;
    public final HashMap f;
    public final HashMap g;

    public p29(Size size, HashMap map, Size size2, HashMap map2, Size size3, HashMap map3, HashMap map4) {
        if (size == null) {
            bhn0.i("Null analysisSize");
            throw null;
        }
        this.a = size;
        this.b = map;
        if (size2 == null) {
            bhn0.i("Null previewSize");
            throw null;
        }
        this.c = size2;
        this.d = map2;
        if (size3 == null) {
            bhn0.i("Null recordSize");
            throw null;
        }
        this.e = size3;
        this.f = map3;
        this.g = map4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p29)) {
            return false;
        }
        p29 p29Var = (p29) obj;
        return this.a.equals(p29Var.a) && this.b.equals(p29Var.b) && this.c.equals(p29Var.c) && this.d.equals(p29Var.d) && this.e.equals(p29Var.e) && this.f.equals(p29Var.f) && this.g.equals(p29Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() ^ ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003);
    }

    public final String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.a + ", s720pSizeMap=" + this.b + ", previewSize=" + this.c + ", s1440pSizeMap=" + this.d + ", recordSize=" + this.e + ", maximumSizeMap=" + this.f + ", ultraMaximumSizeMap=" + this.g + "}";
    }
}
