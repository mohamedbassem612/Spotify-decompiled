package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class np51 {
    public final List a;
    public final String b;
    public final long c;
    public final int d;
    public final String e;
    public final boolean f;
    public final long g;
    public final long h;

    public np51(List list, String str, long j, int i, String str2, boolean z, long j2, long j3) {
        this.a = list;
        this.b = str;
        this.c = j;
        this.d = i;
        this.e = str2;
        this.f = z;
        this.g = j2;
        this.h = j3;
    }

    public final ptl a() {
        return this.c > 600000 ? ptl.a : ptl.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof np51)) {
            return false;
        }
        np51 np51Var = (np51) obj;
        return u890.j(this.a, np51Var.a) && u890.j(this.b, np51Var.b) && this.c == np51Var.c && this.d == np51Var.d && u890.j(this.e, np51Var.e) && this.f == np51Var.f && this.g == np51Var.g && this.h == np51Var.h;
    }

    public final int hashCode() {
        int iF = kaa0.f(this.d, cy30.f(cy30.d(this.a.hashCode() * 31, 31, this.b), this.c, 31), 31);
        String str = this.e;
        return Long.hashCode(this.h) + cy30.f(xcg1.g((iF + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), this.g, 31);
    }
}
