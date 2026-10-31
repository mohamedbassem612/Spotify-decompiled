package p;

import android.net.Uri;
import android.os.Bundle;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vuh0 {
    public final String a;
    public final String b;
    public final List c;
    public final int d;
    public final boolean e;
    public final Uri f;
    public final String g;
    public final int h;
    public final String i;
    public final int j;
    public final int k;
    public final int l;
    public final Set m;
    public final Bundle n;

    public vuh0(String str, String str2, List list, int i, boolean z, Uri uri, String str3, int i2, String str4, int i3, int i4, int i5, Set set, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = uri;
        this.g = str3;
        this.h = i2;
        this.i = str4;
        this.j = i3;
        this.k = i4;
        this.l = i5;
        this.m = set;
        this.n = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vuh0)) {
            return false;
        }
        vuh0 vuh0Var = (vuh0) obj;
        return this.a.equals(vuh0Var.a) && u890.j(this.b, vuh0Var.b) && this.c.equals(vuh0Var.c) && this.d == vuh0Var.d && this.e == vuh0Var.e && u890.j(this.f, vuh0Var.f) && u890.j(this.g, vuh0Var.g) && this.h == vuh0Var.h && u890.j(this.i, vuh0Var.i) && this.j == vuh0Var.j && this.k == vuh0Var.k && this.l == vuh0Var.l && this.m.equals(vuh0Var.m) && u890.j(this.n, vuh0Var.n);
    }

    public final int hashCode() {
        int iG = xcg1.g(kaa0.f(this.d, f4i1.b(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e);
        Uri uri = this.f;
        int iHashCode = (iG + (uri == null ? 0 : uri.hashCode())) * 31;
        String str = this.g;
        int iF = kaa0.f(this.h, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.i;
        int iC = gvg.c(kaa0.f(this.l, kaa0.f(this.k, kaa0.f(this.j, (iF + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31), 31, this.m);
        Bundle bundle = this.n;
        return iC + (bundle != null ? bundle.hashCode() : 0);
    }
}
