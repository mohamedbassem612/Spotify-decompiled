package p;

import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class l29 {
    public final Size a;
    public final Rect b;
    public final n3d c;
    public final int d;
    public final boolean e;

    public l29(Size size, Rect rect, n3d n3dVar, int i, boolean z) {
        if (size == null) {
            bhn0.i("Null inputSize");
            throw null;
        }
        this.a = size;
        if (rect == null) {
            bhn0.i("Null inputCropRect");
            throw null;
        }
        this.b = rect;
        this.c = n3dVar;
        this.d = i;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l29) {
            l29 l29Var = (l29) obj;
            if (this.a.equals(l29Var.a) && this.b.equals(l29Var.b)) {
                n3d n3dVar = l29Var.c;
                n3d n3dVar2 = this.c;
                if (n3dVar2 != null ? n3dVar2.equals(n3dVar) : n3dVar == null) {
                    if (this.d == l29Var.d && this.e == l29Var.e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        n3d n3dVar = this.c;
        return (this.e ? 1231 : 1237) ^ ((((iHashCode ^ (n3dVar == null ? 0 : n3dVar.hashCode())) * 1000003) ^ this.d) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraInputInfo{inputSize=");
        sb.append(this.a);
        sb.append(", inputCropRect=");
        sb.append(this.b);
        sb.append(", cameraInternal=");
        sb.append(this.c);
        sb.append(", rotationDegrees=");
        sb.append(this.d);
        sb.append(", mirroring=");
        return l1d.r(sb, this.e, "}");
    }
}
