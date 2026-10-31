package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wby0 {
    public final boolean a;
    public final List b;
    public final boolean c;
    public final String d;
    public final String e;
    public final boolean f;

    public wby0(String str, String str2, List list, boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = list;
        this.c = z2;
        this.d = str;
        this.e = str2;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wby0)) {
            return false;
        }
        wby0 wby0Var = (wby0) obj;
        return this.a == wby0Var.a && u890.j(this.b, wby0Var.b) && this.c == wby0Var.c && u890.j(this.d, wby0Var.d) && u890.j(this.e, wby0Var.e) && this.f == wby0Var.f;
    }

    public final int hashCode() {
        int iG = xcg1.g(f4i1.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
