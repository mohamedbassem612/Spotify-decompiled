package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zs70 {
    public final String a;
    public final ArrayList b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;

    public zs70(String str, ArrayList arrayList, int i, String str2, String str3, String str4, boolean z, boolean z2) {
        this.a = str;
        this.b = arrayList;
        this.c = i;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = z;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zs70)) {
            return false;
        }
        zs70 zs70Var = (zs70) obj;
        return u890.j(this.a, zs70Var.a) && this.b.equals(zs70Var.b) && this.c == zs70Var.c && u890.j(this.d, zs70Var.d) && u890.j(this.e, zs70Var.e) && u890.j(this.f, zs70Var.f) && this.g == zs70Var.g && this.h == zs70Var.h;
    }

    public final int hashCode() {
        int iD = cy30.d(kaa0.f(this.c, p3d1.f(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d);
        String str = this.e;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return Boolean.hashCode(this.h) + xcg1.g((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.g);
    }
}
