package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hgt0 extends xzo1 {
    public final String c;
    public final ArrayList d;
    public final int e;
    public final String f;
    public final int g;
    public final h131 h;
    public final boolean i;

    public hgt0(String str, ArrayList arrayList, int i, String str2, int i2, h131 h131Var, boolean z) {
        this.c = str;
        this.d = arrayList;
        this.e = i;
        this.f = str2;
        this.g = i2;
        this.h = h131Var;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hgt0)) {
            return false;
        }
        hgt0 hgt0Var = (hgt0) obj;
        return this.c.equals(hgt0Var.c) && this.d.equals(hgt0Var.d) && this.e == hgt0Var.e && u890.j(this.f, hgt0Var.f) && this.g == hgt0Var.g && this.h.equals(hgt0Var.h) && this.i == hgt0Var.i;
    }

    public final int hashCode() {
        int iF = kaa0.f(this.e, p3d1.f(this.d, this.c.hashCode() * 31, 31), 31);
        String str = this.f;
        return gqt0.a.hashCode() + xcg1.g((this.h.hashCode() + ab80.k(this.g, (iF + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31, 31, this.i);
    }
}
