package p;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class o29 {
    public final Rect a;
    public final int b;
    public final int c;
    public final boolean d;
    public final Matrix e;
    public final boolean f;

    public o29(Rect rect, int i, int i2, boolean z, Matrix matrix, boolean z2) {
        this.a = rect;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = matrix;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o29)) {
            return false;
        }
        o29 o29Var = (o29) obj;
        return this.a.equals(o29Var.a) && this.b == o29Var.b && this.c == o29Var.c && this.d == o29Var.d && this.e.equals(o29Var.e) && this.f == o29Var.f;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (this.f ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransformationInfo{getCropRect=");
        sb.append(this.a);
        sb.append(", getRotationDegrees=");
        sb.append(this.b);
        sb.append(", getTargetRotation=");
        sb.append(this.c);
        sb.append(", hasCameraTransform=");
        sb.append(this.d);
        sb.append(", getSensorToBufferTransform=");
        sb.append(this.e);
        sb.append(", isMirroring=");
        return l1d.r(sb, this.f, "}");
    }
}
