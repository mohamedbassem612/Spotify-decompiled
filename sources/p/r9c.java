package p;

import com.spotify.externalintegration.ubi.UbiSpecificationId;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class r9c {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final m210 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final hlr0 j;
    public final int k;
    public final int l;
    public final UbiSpecificationId m;
    public final String n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f35p;
    public final boolean q;

    public /* synthetic */ r9c(String str, String str2, String str3, String str4, m210 m210Var, boolean z, boolean z2, hlr0 hlr0Var, int i, int i2, UbiSpecificationId ubiSpecificationId, boolean z3, int i3) {
        this((i3 & 1) != 0 ? null : str, str2, (i3 & 4) != 0 ? null : str3, (i3 & 8) != 0 ? null : str4, m210Var, z, true, (i3 & 256) == 0, (i3 & 512) != 0 ? false : z2, (i3 & 1024) != 0 ? new hlr0() : hlr0Var, (i3 & 2048) != 0 ? 3 : i, i2, (i3 & 8192) != 0 ? UbiSpecificationId.UNKNOWN : ubiSpecificationId, null, false, (65536 & i3) != 0, (i3 & 131072) != 0 ? false : z3);
    }

    public static r9c a(r9c r9cVar, String str, String str2, boolean z, boolean z2, String str3, boolean z3, int i) {
        String str4 = (i & 1) != 0 ? r9cVar.a : str;
        String str5 = (i & 2) != 0 ? r9cVar.b : str2;
        String str6 = r9cVar.c;
        String str7 = r9cVar.d;
        m210 m210Var = r9cVar.e;
        r9cVar.getClass();
        boolean z4 = r9cVar.f;
        boolean z5 = (i & 128) != 0 ? r9cVar.g : z;
        boolean z6 = (i & 256) != 0 ? r9cVar.h : z2;
        boolean z7 = r9cVar.i;
        hlr0 hlr0Var = r9cVar.j;
        int i2 = r9cVar.k;
        int i3 = r9cVar.l;
        UbiSpecificationId ubiSpecificationId = r9cVar.m;
        String str8 = (i & 16384) != 0 ? r9cVar.n : str3;
        boolean z8 = (i & 32768) != 0 ? r9cVar.o : z3;
        boolean z9 = r9cVar.f35p;
        boolean z10 = r9cVar.q;
        r9cVar.getClass();
        return new r9c(str4, str5, str6, str7, m210Var, z4, z5, z6, z7, hlr0Var, i2, i3, ubiSpecificationId, str8, z8, z9, z10);
    }

    public final m210 b() {
        return this.e;
    }

    public final String c() {
        return this.c;
    }

    public final hlr0 d() {
        return this.j;
    }

    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r9c)) {
            return false;
        }
        r9c r9cVar = (r9c) obj;
        return u890.j(this.a, r9cVar.a) && u890.j(this.b, r9cVar.b) && u890.j(this.c, r9cVar.c) && u890.j(this.d, r9cVar.d) && u890.j(this.e, r9cVar.e) && this.f == r9cVar.f && this.g == r9cVar.g && this.h == r9cVar.h && this.i == r9cVar.i && u890.j(this.j, r9cVar.j) && this.k == r9cVar.k && this.l == r9cVar.l && this.m == r9cVar.m && u890.j(this.n, r9cVar.n) && this.o == r9cVar.o && this.f35p == r9cVar.f35p && this.q == r9cVar.q;
    }

    public final int f() {
        return this.l;
    }

    public final String g() {
        return this.a;
    }

    public final UbiSpecificationId h() {
        return this.m;
    }

    public final int hashCode() {
        String str = this.a;
        int iD = cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        int iHashCode = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        m210 m210Var = this.e;
        int iHashCode3 = (this.m.hashCode() + ab80.k(this.l, ab80.k(this.k, (this.j.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g((iHashCode2 + (m210Var == null ? 0 : m210Var.hashCode())) * 961, 31, this.f), 31, this.g), 31, this.h), 31, this.i)) * 31, 31), 31)) * 31;
        String str4 = this.n;
        return Boolean.hashCode(this.q) + xcg1.g(xcg1.g((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.o), 31, this.f35p);
    }

    public final boolean i() {
        return this.i;
    }

    public final boolean j() {
        return this.h;
    }

    public final boolean k() {
        return this.g;
    }

    public final boolean l() {
        return this.f;
    }

    public final q9c m() {
        q9c q9cVar = new q9c(this.b, this.k, this.l, this.f);
        q9cVar.f = this.c;
        q9cVar.g = this.d;
        q9cVar.h = this.e;
        q9cVar.e = this.a;
        q9cVar.i = this.g;
        q9cVar.j = this.h;
        q9cVar.k = this.i;
        q9cVar.l = this.j;
        q9cVar.m = this.m;
        q9cVar.n = this.n;
        q9cVar.o = this.o;
        q9cVar.f30p = this.f35p;
        q9cVar.q = this.q;
        return q9cVar;
    }

    public r9c(String str, String str2, String str3, String str4, m210 m210Var, boolean z, boolean z2, boolean z3, boolean z4, hlr0 hlr0Var, int i, int i2, UbiSpecificationId ubiSpecificationId, String str5, boolean z5, boolean z6, boolean z7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = m210Var;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = hlr0Var;
        this.k = i;
        this.l = i2;
        this.m = ubiSpecificationId;
        this.n = str5;
        this.o = z5;
        this.f35p = z6;
        this.q = z7;
    }
}
