package p;

import com.spotify.cosmos.util.proto.PlayabilityRestriction;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class o3w0 {
    public final String a;
    public final List b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final PlayabilityRestriction l;

    public o3w0(String str, List list, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, PlayabilityRestriction playabilityRestriction) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = z6;
        this.k = z7;
        this.l = playabilityRestriction;
    }

    public static o3w0 a(o3w0 o3w0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, PlayabilityRestriction playabilityRestriction, int i) {
        String str = o3w0Var.a;
        List list = o3w0Var.b;
        String str2 = o3w0Var.c;
        String str3 = o3w0Var.d;
        if ((i & 16) != 0) {
            z = o3w0Var.e;
        }
        return new o3w0(str, list, str2, str3, z, (i & 32) != 0 ? o3w0Var.f : z2, (i & 64) != 0 ? o3w0Var.g : z3, (i & 128) != 0 ? o3w0Var.h : z4, (i & 256) != 0 ? o3w0Var.i : z5, (i & 512) != 0 ? o3w0Var.j : z6, o3w0Var.k, (i & 2048) != 0 ? o3w0Var.l : playabilityRestriction);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3w0)) {
            return false;
        }
        o3w0 o3w0Var = (o3w0) obj;
        return u890.j(this.a, o3w0Var.a) && u890.j(this.b, o3w0Var.b) && u890.j(this.c, o3w0Var.c) && u890.j(this.d, o3w0Var.d) && this.e == o3w0Var.e && this.f == o3w0Var.f && this.g == o3w0Var.g && this.h == o3w0Var.h && this.i == o3w0Var.i && this.j == o3w0Var.j && this.k == o3w0Var.k && this.l == o3w0Var.l;
    }

    public final int hashCode() {
        int iB = f4i1.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
        PlayabilityRestriction playabilityRestriction = this.l;
        return iG + (playabilityRestriction != null ? playabilityRestriction.hashCode() : 0);
    }
}
