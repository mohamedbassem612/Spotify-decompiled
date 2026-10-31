package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class d7t0 {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;
    public final String h;
    public final int i;

    public d7t0(String str, String str2, ArrayList arrayList, String str3, String str4, int i, int i2, String str5, int i3) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = str3;
        this.e = str4;
        this.f = i;
        this.g = i2;
        this.h = str5;
        this.i = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7t0)) {
            return false;
        }
        d7t0 d7t0Var = (d7t0) obj;
        return this.a.equals(d7t0Var.a) && this.b.equals(d7t0Var.b) && this.c.equals(d7t0Var.c) && this.d.equals(d7t0Var.d) && this.e.equals(d7t0Var.e) && this.f == d7t0Var.f && this.g == d7t0Var.g && this.h.equals(d7t0Var.h) && this.i == d7t0Var.i;
    }

    public final int hashCode() {
        int iD = cy30.d(ab80.k(this.g, ab80.k(this.f, cy30.d(cy30.d(p3d1.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 961), 31, this.d), 31, this.e), 31), 31), 31, this.h);
        int i = this.i;
        return iD + (i == 0 ? 0 : l1d.C(i));
    }
}
