package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hgi0 {
    public final String a;
    public final String b;
    public final x360 c;
    public final ArrayList d;
    public final boolean e;
    public final boolean f;
    public final String g;

    public /* synthetic */ hgi0(String str, String str2, x360 x360Var, ArrayList arrayList, boolean z, String str3, int i) {
        this(str, str2, x360Var, arrayList, (i & 16) != 0 ? false : z, false, (i & 64) != 0 ? null : str3);
    }

    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hgi0)) {
            return false;
        }
        hgi0 hgi0Var = (hgi0) obj;
        return u890.j(this.a, hgi0Var.a) && u890.j(this.b, hgi0Var.b) && u890.j(this.c, hgi0Var.c) && u890.j(this.d, hgi0Var.d) && this.e == hgi0Var.e && this.f == hgi0Var.f && u890.j(this.g, hgi0Var.g);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        x360 x360Var = this.c;
        int iG = xcg1.g(xcg1.g(p3d1.f(this.d, (iD + (x360Var == null ? 0 : x360Var.hashCode())) * 31, 31), 31, this.e), 31, this.f);
        String str = this.g;
        return iG + (str != null ? str.hashCode() : 0);
    }

    public hgi0(String str, String str2, x360 x360Var, ArrayList arrayList, boolean z, boolean z2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = x360Var;
        this.d = arrayList;
        this.e = z;
        this.f = z2;
        this.g = str3;
    }
}
