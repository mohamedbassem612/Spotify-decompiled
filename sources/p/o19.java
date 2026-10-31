package p;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class o19 {
    public final UUID a;
    public final int b;
    public final int c;
    public final Rect d;
    public final Size e;
    public final int f;
    public final boolean g;

    public o19(UUID uuid, int i, int i2, Rect rect, Size size, int i3, boolean z) {
        if (uuid == null) {
            bhn0.i("Null getUuid");
            throw null;
        }
        this.a = uuid;
        this.b = i;
        this.c = i2;
        if (rect == null) {
            bhn0.i("Null getCropRect");
            throw null;
        }
        this.d = rect;
        if (size == null) {
            bhn0.i("Null getSize");
            throw null;
        }
        this.e = size;
        this.f = i3;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o19)) {
            return false;
        }
        o19 o19Var = (o19) obj;
        return this.a.equals(o19Var.a) && this.b == o19Var.b && this.c == o19Var.c && this.d.equals(o19Var.d) && this.e.equals(o19Var.e) && this.f == o19Var.f && this.g == o19Var.g;
    }

    public final int hashCode() {
        return (((this.g ? 1231 : 1237) ^ ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003)) * 1000003) ^ 1237;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutConfig{getUuid=");
        sb.append(this.a);
        sb.append(", getTargets=");
        sb.append(this.b);
        sb.append(", getFormat=");
        sb.append(this.c);
        sb.append(", getCropRect=");
        sb.append(this.d);
        sb.append(", getSize=");
        sb.append(this.e);
        sb.append(", getRotationDegrees=");
        sb.append(this.f);
        sb.append(", isMirroring=");
        return l1d.r(sb, this.g, ", shouldRespectInputCropRect=false}");
    }
}
