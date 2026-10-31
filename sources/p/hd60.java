package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hd60 {
    public final String a;
    public final String b;
    public final gd60 c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final String i;
    public final int j;
    public final boolean k;
    public final ArrayList l;

    public hd60(String str, String str2, gd60 gd60Var, String str3, int i, int i2, int i3, int i4, String str4, int i5, boolean z, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = gd60Var;
        this.d = str3;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = str4;
        this.j = i5;
        this.k = z;
        this.l = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd60)) {
            return false;
        }
        hd60 hd60Var = (hd60) obj;
        return this.a.equals(hd60Var.a) && this.b.equals(hd60Var.b) && this.c.equals(hd60Var.c) && this.d.equals(hd60Var.d) && this.e == hd60Var.e && this.f == hd60Var.f && this.g == hd60Var.g && this.h == hd60Var.h && u890.j(this.i, hd60Var.i) && this.j == hd60Var.j && this.k == hd60Var.k && this.l.equals(hd60Var.l);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.h, kaa0.f(this.g, kaa0.f(this.f, kaa0.f(this.e, cy30.d((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31), 31), 31), 31);
        String str = this.i;
        return this.l.hashCode() + xcg1.g(kaa0.f(this.j, (iF + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.k);
    }
}
