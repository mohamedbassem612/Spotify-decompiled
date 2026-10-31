package p;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pr31 {
    public static final pr31 r = new pr31("", "", null, null, 0, false, 0, 0, 0, 0, null, null, false, false);
    public final String a;
    public final String b;
    public final String c;
    public final Uri d;
    public final int e;
    public final boolean f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final Bundle k;
    public final lwh0 l;
    public final boolean m;
    public final boolean n;
    public final idd1 o = new idd1(new nr31(this, (byte) 1));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final idd1 f66p = new idd1(new l5v0(this, 8));
    public final idd1 q = new idd1(new nr31(this, (byte) 0));

    public pr31(String str, String str2, String str3, Uri uri, int i, boolean z, int i2, int i3, int i4, int i5, Bundle bundle, lwh0 lwh0Var, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = uri;
        this.e = i;
        this.f = z;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = i5;
        this.k = bundle;
        this.l = lwh0Var;
        this.m = z2;
        this.n = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pr31)) {
            return false;
        }
        pr31 pr31Var = (pr31) obj;
        return u890.j(this.a, pr31Var.a) && u890.j(this.b, pr31Var.b) && u890.j(this.c, pr31Var.c) && u890.j(this.d, pr31Var.d) && this.e == pr31Var.e && this.f == pr31Var.f && this.g == pr31Var.g && this.h == pr31Var.h && this.i == pr31Var.i && this.j == pr31Var.j && u890.j(this.k, pr31Var.k) && u890.j(this.l, pr31Var.l) && this.m == pr31Var.m && this.n == pr31Var.n;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        Uri uri = this.d;
        int iF = kaa0.f(this.j, kaa0.f(this.i, kaa0.f(this.h, kaa0.f(this.g, xcg1.g(kaa0.f(this.e, (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31, 31), 31, this.f), 31), 31), 31), 31);
        Bundle bundle = this.k;
        int iHashCode2 = (iF + (bundle == null ? 0 : bundle.hashCode())) * 31;
        lwh0 lwh0Var = this.l;
        return Boolean.hashCode(this.n) + xcg1.g((iHashCode2 + (lwh0Var != null ? lwh0Var.hashCode() : 0)) * 31, 31, this.m);
    }
}
