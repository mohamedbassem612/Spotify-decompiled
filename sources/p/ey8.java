package p;

import android.util.Range;
import android.util.Size;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ey8 {
    public final k29 a;
    public final int b;
    public final Size c;
    public final liv d;
    public final List e;
    public final qsk f;
    public final Range g;

    public ey8(k29 k29Var, int i, Size size, liv livVar, List list, qsk qskVar, Range range) {
        if (k29Var == null) {
            bhn0.i("Null surfaceConfig");
            throw null;
        }
        this.a = k29Var;
        this.b = i;
        if (size == null) {
            bhn0.i("Null size");
            throw null;
        }
        this.c = size;
        if (livVar == null) {
            bhn0.i("Null dynamicRange");
            throw null;
        }
        this.d = livVar;
        if (list == null) {
            bhn0.i("Null captureTypes");
            throw null;
        }
        this.e = list;
        this.f = qskVar;
        this.g = range;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ey8) {
            ey8 ey8Var = (ey8) obj;
            if (this.a.equals(ey8Var.a) && this.b == ey8Var.b && this.c.equals(ey8Var.c) && this.d.equals(ey8Var.d) && this.e.equals(ey8Var.e)) {
                qsk qskVar = ey8Var.f;
                qsk qskVar2 = this.f;
                if (qskVar2 != null ? qskVar2.equals(qskVar) : qskVar == null) {
                    Range range = ey8Var.g;
                    Range range2 = this.g;
                    if (range2 != null ? range2.equals(range) : range == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        qsk qskVar = this.f;
        int iHashCode2 = (iHashCode ^ (qskVar == null ? 0 : qskVar.hashCode())) * 1000003;
        Range range = this.g;
        return iHashCode2 ^ (range != null ? range.hashCode() : 0);
    }

    public final String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.a + ", imageFormat=" + this.b + ", size=" + this.c + ", dynamicRange=" + this.d + ", captureTypes=" + this.e + ", implementationOptions=" + this.f + ", targetFrameRate=" + this.g + "}";
    }
}
