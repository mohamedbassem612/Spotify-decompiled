package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class i0w0 extends cxm {
    public final String d;
    public final String e;
    public final ArrayList f;
    public final ArrayList g;
    public final boolean h;
    public final tv80 i;

    public i0w0(String str, String str2, ArrayList arrayList, ArrayList arrayList2, boolean z, tv80 tv80Var) {
        this.d = str;
        this.e = str2;
        this.f = arrayList;
        this.g = arrayList2;
        this.h = z;
        this.i = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0w0)) {
            return false;
        }
        i0w0 i0w0Var = (i0w0) obj;
        return this.d.equals(i0w0Var.d) && this.e.equals(i0w0Var.e) && this.f.equals(i0w0Var.f) && this.g.equals(i0w0Var.g) && this.h == i0w0Var.h && u890.j(this.i, i0w0Var.i);
    }

    public final int hashCode() {
        int iG = xcg1.g(p3d1.f(this.g, p3d1.f(this.f, cy30.d(this.d.hashCode() * 31, 31, this.e), 31), 31), 31, this.h);
        tv80 tv80Var = this.i;
        return iG + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
