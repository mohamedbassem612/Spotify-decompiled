package p;

import android.util.Size;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class iy8 {
    public final String a;
    public final Class b;
    public final bb61 c;
    public final i4i1 d;
    public final Size e;
    public final i29 f;
    public final List g;

    public iy8(String str, Class cls, bb61 bb61Var, i4i1 i4i1Var, Size size, i29 i29Var, ArrayList arrayList) {
        this.a = str;
        this.b = cls;
        if (bb61Var == null) {
            bhn0.i("Null sessionConfig");
            throw null;
        }
        this.c = bb61Var;
        if (i4i1Var == null) {
            bhn0.i("Null useCaseConfig");
            throw null;
        }
        this.d = i4i1Var;
        this.e = size;
        this.f = i29Var;
        this.g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iy8)) {
            return false;
        }
        iy8 iy8Var = (iy8) obj;
        if (!this.a.equals(iy8Var.a) || !this.b.equals(iy8Var.b) || !this.c.equals(iy8Var.c) || !this.d.equals(iy8Var.d)) {
            return false;
        }
        Size size = iy8Var.e;
        Size size2 = this.e;
        if (size2 == null) {
            if (size != null) {
                return false;
            }
        } else if (!size2.equals(size)) {
            return false;
        }
        i29 i29Var = iy8Var.f;
        i29 i29Var2 = this.f;
        if (i29Var2 == null) {
            if (i29Var != null) {
                return false;
            }
        } else if (!i29Var2.equals(i29Var)) {
            return false;
        }
        List list = iy8Var.g;
        List list2 = this.g;
        if (list2 == null) {
            return list == null;
        }
        return list2.equals(list);
    }

    public final int hashCode() {
        int iHashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        Size size = this.e;
        int iHashCode2 = (iHashCode ^ (size == null ? 0 : size.hashCode())) * 1000003;
        i29 i29Var = this.f;
        int iHashCode3 = (iHashCode2 ^ (i29Var == null ? 0 : i29Var.hashCode())) * 1000003;
        List list = this.g;
        return iHashCode3 ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "UseCaseInfo{useCaseId=" + this.a + ", useCaseType=" + this.b + ", sessionConfig=" + this.c + ", useCaseConfig=" + this.d + ", surfaceResolution=" + this.e + ", streamSpec=" + this.f + ", captureTypes=" + this.g + "}";
    }
}
