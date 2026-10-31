package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nt70 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Integer e;
    public final int f;
    public final maa g;
    public final maa h;
    public final maa i;
    public final maa j;
    public final v17 k;
    public final maa l;
    public final List m;
    public final List n;
    public final maa o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f25p;
    public final boolean q;

    public nt70(String str, String str2, String str3, String str4, Integer num, maa maaVar, maa maaVar2, maa maaVar3, kpg0 kpg0Var, v17 v17Var, xzq xzqVar, List list, List list2, maa maaVar4, boolean z, boolean z2, int i) {
        String str5 = (i & 2) != 0 ? null : str2;
        String str6 = (i & 4) != 0 ? null : str3;
        String str7 = (i & 8) != 0 ? null : str4;
        Integer num2 = (i & 16) != 0 ? null : num;
        maa maaVar5 = (i & 64) != 0 ? null : maaVar;
        maa maaVar6 = (i & 128) != 0 ? null : maaVar2;
        maa maaVar7 = (i & 256) != 0 ? null : maaVar3;
        kpg0 kpg0Var2 = (i & 512) != 0 ? null : kpg0Var;
        v17 v17Var2 = (i & 1024) != 0 ? null : v17Var;
        xzq xzqVar2 = (i & 2048) != 0 ? null : xzqVar;
        int i2 = i & 4096;
        List list3 = z6x.a;
        List list4 = i2 != 0 ? list3 : list;
        list3 = (i & 8192) == 0 ? list2 : list3;
        maa maaVar8 = (i & 16384) != 0 ? null : maaVar4;
        boolean z3 = (i & 32768) != 0 ? false : z;
        boolean z4 = (i & 65536) != 0 ? false : z2;
        this.a = str;
        this.b = str5;
        this.c = str6;
        this.d = str7;
        this.e = num2;
        this.f = 3;
        this.g = maaVar5;
        this.h = maaVar6;
        this.i = maaVar7;
        this.j = kpg0Var2;
        this.k = v17Var2;
        this.l = xzqVar2;
        this.m = list4;
        this.n = list3;
        this.o = maaVar8;
        this.f25p = z3;
        this.q = z4;
        if (list4.size() > 5) {
            hhg1.n("leadingActionElements cannot have more than 5 elements");
            throw null;
        }
        if (list3.size() <= 2) {
            return;
        }
        hhg1.n("trailingActionElements cannot have more than 2 elements");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nt70)) {
            return false;
        }
        nt70 nt70Var = (nt70) obj;
        return u890.j(this.a, nt70Var.a) && u890.j(this.b, nt70Var.b) && u890.j(this.c, nt70Var.c) && u890.j(this.d, nt70Var.d) && u890.j(this.e, nt70Var.e) && this.f == nt70Var.f && u890.j(this.g, nt70Var.g) && u890.j(this.h, nt70Var.h) && u890.j(this.i, nt70Var.i) && u890.j(this.j, nt70Var.j) && u890.j(this.k, nt70Var.k) && u890.j(this.l, nt70Var.l) && this.m.equals(nt70Var.m) && this.n.equals(nt70Var.n) && u890.j(this.o, nt70Var.o) && this.f25p == nt70Var.f25p && this.q == nt70Var.q;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.e;
        int iK = ab80.k(this.f, (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31, 31);
        maa maaVar = this.g;
        int iHashCode5 = (iK + (maaVar == null ? 0 : maaVar.hashCode())) * 31;
        maa maaVar2 = this.h;
        int iHashCode6 = (iHashCode5 + (maaVar2 == null ? 0 : maaVar2.hashCode())) * 31;
        maa maaVar3 = this.i;
        int iHashCode7 = (iHashCode6 + (maaVar3 == null ? 0 : maaVar3.hashCode())) * 31;
        maa maaVar4 = this.j;
        int iHashCode8 = (((iHashCode7 + (maaVar4 == null ? 0 : maaVar4.hashCode())) * 31) + (this.k == null ? 0 : Integer.hashCode(2131952446))) * 31;
        maa maaVar5 = this.l;
        int iB = f4i1.b(f4i1.b((iHashCode8 + (maaVar5 == null ? 0 : maaVar5.hashCode())) * 31, 31, this.m), 31, this.n);
        maa maaVar6 = this.o;
        return Boolean.hashCode(this.q) + xcg1.g((iB + (maaVar6 != null ? maaVar6.hashCode() : 0)) * 31, 31, this.f25p);
    }
}
