package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ti81 {
    public final String a;
    public final Uri b;
    public final String c;
    public final u7h d;
    public final boolean e;
    public final boolean f;
    public final li81 g;
    public final li81 h;
    public final boolean i;
    public final boolean j;

    public ti81(String str, Uri uri, String str2, u7h u7hVar, boolean z, boolean z2, li81 li81Var, li81 li81Var2) {
        this.a = str;
        this.b = uri;
        this.c = str2;
        this.d = u7hVar;
        this.e = z;
        this.f = z2;
        this.g = li81Var;
        this.h = li81Var2;
        this.i = li81Var != null;
        this.j = li81Var2 != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ti81)) {
            return false;
        }
        ti81 ti81Var = (ti81) obj;
        return u890.j(this.a, ti81Var.a) && u890.j(this.b, ti81Var.b) && u890.j(this.c, ti81Var.c) && u890.j(this.d, ti81Var.d) && this.e == ti81Var.e && this.f == ti81Var.f && u890.j(this.g, ti81Var.g) && u890.j(this.h, ti81Var.h);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Uri uri = this.b;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        u7h u7hVar = this.d;
        int iG = xcg1.g(xcg1.g((iHashCode3 + (u7hVar == null ? 0 : Long.hashCode(u7hVar.a))) * 31, 31, this.e), 31, this.f);
        li81 li81Var = this.g;
        int iHashCode4 = (iG + (li81Var == null ? 0 : li81Var.hashCode())) * 31;
        li81 li81Var2 = this.h;
        return iHashCode4 + (li81Var2 != null ? li81Var2.hashCode() : 0);
    }
}
