package p;

import android.util.Size;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ny8 {
    public g280 a;
    public final g280 b = null;
    public final Size c;
    public final int d;
    public final int e;
    public final boolean f;
    public final ae0 g;
    public final ae0 h;

    public ny8(Size size, int i, int i2, boolean z, ae0 ae0Var, ae0 ae0Var2) {
        if (size == null) {
            bhn0.i("Null size");
            throw null;
        }
        this.c = size;
        this.d = i;
        this.e = i2;
        this.f = z;
        this.g = ae0Var;
        this.h = ae0Var2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ny8) {
            ny8 ny8Var = (ny8) obj;
            return this.c.equals(ny8Var.c) && this.d == ny8Var.d && this.e == ny8Var.e && this.f == ny8Var.f && this.g == ny8Var.g && this.h == ny8Var.h;
        }
        return false;
    }

    public final int hashCode() {
        return this.h.hashCode() ^ ((((((((((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ (this.f ? 1231 : 1237)) * 583896283) ^ 35) * 1000003) ^ this.g.hashCode()) * 1000003);
    }

    public final String toString() {
        return "In{size=" + this.c + ", inputFormat=" + this.d + ", outputFormat=" + this.e + ", virtualCamera=" + this.f + ", imageReaderProxyProvider=null, postviewSize=null, postviewImageFormat=35, requestEdge=" + this.g + ", errorEdge=" + this.h + "}";
    }
}
