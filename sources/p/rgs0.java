package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rgs0 {
    public final float a;
    public final ArrayList b;
    public final vr60 c;

    public rgs0(float f, ArrayList arrayList, vr60 vr60Var) {
        this.a = f;
        this.b = arrayList;
        this.c = vr60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgs0)) {
            return false;
        }
        rgs0 rgs0Var = (rgs0) obj;
        return p3v.c(this.a, rgs0Var.a) && this.b.equals(rgs0Var.b) && this.c.equals(rgs0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + p3d1.f(this.b, Float.hashCode(this.a) * 31, 31);
    }
}
