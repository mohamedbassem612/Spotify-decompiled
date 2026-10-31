package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rgb1 extends wgb1 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final ArrayList e;
    public final cuu0 f;

    public rgb1(String str, String str2, String str3, int i, ArrayList arrayList, cuu0 cuu0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = arrayList;
        this.f = cuu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgb1)) {
            return false;
        }
        rgb1 rgb1Var = (rgb1) obj;
        return u890.j(this.a, rgb1Var.a) && u890.j(this.b, rgb1Var.b) && u890.j(this.c, rgb1Var.c) && this.d == rgb1Var.d && this.e.equals(rgb1Var.e) && u890.j(this.f, rgb1Var.f);
    }

    public final int hashCode() {
        int iF = kaa0.f(0, p3d1.f(this.e, kaa0.f(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31);
        cuu0 cuu0Var = this.f;
        return iF + (cuu0Var != null ? cuu0Var.hashCode() : 0);
    }
}
