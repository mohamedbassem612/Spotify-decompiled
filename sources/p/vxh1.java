package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vxh1 implements yxh1 {
    public final List a;
    public final int b;
    public final int c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final long h;

    public vxh1(List list, int i, int i2, String str, int i3, int i4, int i5, long j) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxh1)) {
            return false;
        }
        vxh1 vxh1Var = (vxh1) obj;
        return u890.j(this.a, vxh1Var.a) && this.b == vxh1Var.b && this.c == vxh1Var.c && u890.j(this.d, vxh1Var.d) && this.e == vxh1Var.e && this.f == vxh1Var.f && this.g == vxh1Var.g && this.h == vxh1Var.h;
    }

    public final int hashCode() {
        int iF = kaa0.f(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31);
        String str = this.d;
        return Long.hashCode(this.h) + ab80.k(this.g, kaa0.f(this.f, kaa0.f(this.e, (iF + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31);
    }
}
