package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sl6 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ di4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sl6(di4 di4Var, byte b) {
        super(1);
        this.a = b;
        this.b = di4Var;
    }

    /* JADX WARN: Code duplicated, block: B:162:0x027b  */
    /* JADX WARN: Code duplicated, block: B:170:0x0290  */
    /* JADX WARN: Code duplicated, block: B:172:0x0296 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:174:0x0299  */
    /* JADX WARN: Code duplicated, block: B:68:0x011d  */
    public final Object invoke(Object obj) {
        int i;
        int i2;
        int iOrdinal;
        int iOrdinal2;
        String str;
        boolean z;
        boolean z2;
        j9k1 j9k1Var;
        byte b = this.a;
        j9k1 j9k1Var2 = gql.b;
        j9k1 j9k1Var3 = fql.b;
        j9k1 j9k1Var4 = eql.b;
        di4 di4Var = this.b;
        switch (b) {
            case 0:
                pl6 pl6Var = (pl6) obj;
                return f5p1.i(pl6Var.f, pl6Var.g, di4Var.b(), di4Var.O());
            case 1:
                um01 um01Var = (um01) obj;
                return new vm01(um01Var.a, "", "", null, null, false, 3, false, false, false, false, false, 3, false, false, false, false, false, di4Var.r0(), di4Var.s0(), false, false, um01Var.f, false, false, null, false, false, false, false, false, false, false, false, "", null);
            case 2:
                vm01 vm01Var = (vm01) obj;
                CharSequence charSequence = vm01Var.c;
                boolean z3 = vm01Var.i;
                int i3 = vm01Var.I;
                k4m k4mVarP = oqn1.p(i3);
                String str2 = vm01Var.a;
                ck60 ck60VarQ = mqo1.q(str2);
                boolean zF = ck60VarQ == ck60.h ? false : o0c.F(i3, vm01Var.g, vm01Var.h);
                boolean z4 = !vm01Var.u && ck60VarQ == ck60.b;
                boolean z5 = vm01Var.j && sgy.a(str2) && !vm01Var.k;
                boolean z6 = (zF && !vm01Var.F) || z3 || z4 || z5;
                boolean z7 = zF || z3 || z5;
                boolean z8 = zF || z3 || z5;
                boolean zJ = o0c.j(str2, vm01Var.E, z6 || zF);
                if (vm01Var.w) {
                    i = (!vm01Var.y || (str = vm01Var.d) == null || ihc1.y0(str)) ? 3 : 2;
                } else {
                    i = 1;
                }
                String str3 = vm01Var.b;
                String str4 = vm01Var.d;
                String str5 = vm01Var.e;
                boolean z9 = di4Var.N() && charSequence.length() > 0;
                boolean z10 = nik1.N.a(str2) || nik1.E.a(str2) || nik1.P4.a(str2);
                int i4 = vm01Var.J;
                boolean z11 = vm01Var.l;
                boolean z12 = vm01Var.y;
                boolean z13 = vm01Var.n;
                boolean z14 = vm01Var.o;
                boolean z15 = vm01Var.f42p;
                String str6 = vm01Var.e;
                bi4 bi4Var = vm01Var.q;
                ci4 ci4Var = vm01Var.r;
                if (!z11 || str6 == null || str6.length() == 0) {
                    i2 = 2;
                } else {
                    int iOrdinal3 = mqo1.q(str2).ordinal();
                    if (iOrdinal3 == 0) {
                        iOrdinal = bi4Var.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal != 1) {
                                eg.o();
                                return null;
                            }
                            i2 = 1;
                        } else {
                            i2 = 2;
                        }
                    } else {
                        if (iOrdinal3 != 1) {
                            if (iOrdinal3 == 13) {
                                iOrdinal = bi4Var.ordinal();
                                if (iOrdinal != 0) {
                                    if (iOrdinal != 1) {
                                        eg.o();
                                        return null;
                                    }
                                    i2 = 1;
                                }
                            }
                        } else if (z12 && (iOrdinal2 = ci4Var.ordinal()) != 0) {
                            if (iOrdinal2 != 1) {
                                eg.o();
                                return null;
                            }
                            i2 = 1;
                        }
                        i2 = 2;
                    }
                }
                return new bk60(str3, charSequence, str4, str5, ck60VarQ, z9, i4, k4mVarP, z6, z7, z8, z10, zJ, z11, z12, vm01Var.m, z13, z14, z15, i2, vm01Var.s, vm01Var.t, vm01Var.v, vm01Var.w, i, vm01Var.G, vm01Var.H);
            case 3:
                vm01 vm01Var2 = (vm01) obj;
                return f5p1.i(vm01Var2.o, vm01Var2.f42p, di4Var.b(), di4Var.O());
            case 4:
                qlf1 qlf1Var = (qlf1) obj;
                boolean z16 = qlf1Var.j;
                j9k1 j9k1Var5 = qlf1Var.i;
                boolean zEquals = j9k1Var5.equals(j9k1Var2);
                boolean z17 = !zEquals;
                boolean z18 = (zEquals || z16) ? false : true;
                boolean z19 = (!o0c.j(qlf1Var.a, qlf1Var.z, z17) || qlf1Var.t || qlf1Var.f34p) ? false : true;
                String str7 = qlf1Var.c;
                String str8 = qlf1Var.d;
                String str9 = qlf1Var.e;
                String str10 = ((j9k1Var5 instanceof eql) || (j9k1Var5 instanceof dql) || z16) ? null : qlf1Var.f;
                k4m k4mVarP2 = oqn1.p(qlf1Var.h);
                int i5 = qlf1Var.k;
                boolean z20 = qlf1Var.j;
                boolean z21 = !z20;
                boolean z22 = qlf1Var.m;
                if (z20) {
                    z = false;
                } else {
                    if (j9k1Var5.equals(dql.b) || j9k1Var5.equals(j9k1Var4)) {
                        z2 = false;
                    } else {
                        if (!j9k1Var5.equals(j9k1Var3) && !j9k1Var5.equals(j9k1Var2)) {
                            eg.o();
                            return null;
                        }
                        z2 = qlf1Var.g;
                    }
                    if (z2) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                return new wlf1(str7, str8, str9, str10, k4mVarP2, i5, z18, z20, z21, z22, z, qlf1Var.l, z19, qlf1Var.n && di4Var.q0(), qlf1Var.f34p, qlf1Var.q, qlf1Var.b, qlf1Var.r, qlf1Var.w, qlf1Var.x, qlf1Var.s, qlf1Var.t, qlf1Var.v, qlf1Var.y);
            default:
                iyf1 iyf1Var = (iyf1) obj;
                int i6 = iyf1Var.f;
                boolean z23 = iyf1Var.v;
                boolean z24 = iyf1Var.w;
                boolean z25 = i6 != 3 && z23;
                boolean zF2 = o0c.F(i6, z24, z24);
                if (z25) {
                    j9k1Var = j9k1Var4;
                } else {
                    j9k1Var = zF2 ? j9k1Var3 : j9k1Var2;
                }
                String str11 = iyf1Var.a;
                String str12 = iyf1Var.b;
                String str13 = iyf1Var.c;
                String str14 = iyf1Var.d;
                String str15 = iyf1Var.e;
                int i7 = iyf1Var.f;
                boolean z26 = iyf1Var.i;
                boolean z27 = iyf1Var.j;
                boolean z28 = iyf1Var.n;
                boolean z29 = iyf1Var.o;
                String str16 = iyf1Var.q;
                boolean zX = di4Var.X();
                List list = iyf1Var.r;
                boolean z30 = iyf1Var.t;
                boolean z31 = iyf1Var.s;
                return new nyf1(str11, str12, str13, str14, str15, false, i7, j9k1Var, false, 3, z26, z27, z28, z29, str16, false, zX, list, z30, z31, iyf1Var.u && (z30 || z31), (Integer) null, iyf1Var.y, false, iyf1Var.z, iyf1Var.B && di4Var.d());
        }
    }
}
