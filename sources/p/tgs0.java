package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tgs0 implements ugs0 {
    public final float a;
    public final ArrayList b;
    public final vr60 c;

    public tgs0(float f, ArrayList arrayList, vr60 vr60Var) {
        this.a = f;
        this.b = arrayList;
        this.c = vr60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tgs0)) {
            return false;
        }
        tgs0 tgs0Var = (tgs0) obj;
        return p3v.c(this.a, tgs0Var.a) && this.b.equals(tgs0Var.b) && this.c.equals(tgs0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + p3d1.f(this.b, Float.hashCode(this.a) * 31, 31);
    }
}
