package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class t7i1 implements Update {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t7i1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Next a(Object obj, Object obj2) {
        adj1 adj1VarH;
        adj1 adj1VarH2;
        Object objH;
        ou80 ou80Var;
        adj1 adj1VarH3;
        adj1 adj1VarH4;
        Object objH2;
        ou80 ou80Var2;
        byte b = this.a;
        bf21 bf21Var = bf21.a;
        uij1 uij1Var = uij1.a;
        apt0 apt0Var = apt0.a;
        cpd1 cpd1Var = cpd1.a;
        u8u0 u8u0Var = u8u0.a;
        rp00 rp00Var = rp00.a;
        rw50 rw50Var = rw50.a;
        grg grgVar = grg.a;
        rxc rxcVar = rxc.a;
        fy0 fy0Var = fy0.a;
        ddj1 ddj1Var = ddj1.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                o7i1 o7i1Var = (o7i1) obj;
                i7i1 i7i1Var = (i7i1) obj2;
                u7i1 u7i1Var = (u7i1) obj3;
                String str = u7i1Var.d;
                if (i7i1Var instanceof c7i1) {
                    if (u7i1Var.e == xks0.b) {
                        o7i1Var.getClass();
                        return Next.h(new o7i1(null, k7i1.b));
                    }
                    o7i1Var.getClass();
                    return Next.h(new o7i1(null, j7i1.b));
                }
                if (u890.j(i7i1Var, a7i1.a)) {
                    o7i1Var.getClass();
                    return Next.h(new o7i1(null, null));
                }
                if (u890.j(i7i1Var, d7i1.a)) {
                    o7i1Var.getClass();
                    return Next.i(new o7i1(null, null), Effects.a(new x6i1[]{new x6i1(str)}));
                }
                if (u890.j(i7i1Var, b7i1.a)) {
                    o7i1Var.getClass();
                    return Next.h(new o7i1(m7i1.i, null));
                }
                if (u890.j(i7i1Var, f7i1.a)) {
                    o7i1Var.getClass();
                    return Next.i(new o7i1(null, null), Effects.a(new y6i1[]{new y6i1(str)}));
                }
                if (u890.j(i7i1Var, e7i1.a)) {
                    o7i1Var.getClass();
                    return Next.h(new o7i1(n7i1.i, null));
                }
                if (i7i1Var instanceof g7i1) {
                    o7i1Var.getClass();
                    return Next.h(new o7i1(null, l7i1.b));
                }
                if (i7i1Var instanceof h7i1) {
                    o7i1Var.getClass();
                    return Next.i(new o7i1(null, null), Effects.a(new z6i1[]{new z6i1(u7i1Var.c.e)}));
                }
                eg.o();
                return null;
            case 1:
                bdj1 bdj1Var = (edj1) obj;
                tq80 tq80Var = (tq80) obj2;
                gcj1 gcj1Var = (gcj1) obj3;
                if (!(bdj1Var instanceof adj1)) {
                    return Next.j();
                }
                arl1 arl1Var = (nbj1) tq80Var.a;
                tqw tqwVar = tq80Var.b;
                String str2 = (tqwVar == null || (ou80Var = n3o1.y(tqwVar).a) == null) ? null : ou80Var.a;
                if (u890.j(arl1Var, fy0Var)) {
                    return gcj1.b(bdj1Var, "ad_tag");
                }
                if (u890.j(arl1Var, rxcVar)) {
                    if (!gcj1Var.b) {
                        return gcj1.b(bdj1Var, "cta_button");
                    }
                    bdj1 bdj1Var2 = bdj1Var;
                    return Next.i(ddj1Var, Effects.a(new d9j1[]{new ljb0(bdj1Var2.a().d, "cta_button"), new geu(bdj1Var2.a().a, false)}));
                }
                if (u890.j(arl1Var, grgVar)) {
                    return Next.i(ddj1Var, Effects.a(new geu[]{new geu(bdj1Var.a().a, true)}));
                }
                if (u890.j(arl1Var, rw50Var)) {
                    return gcj1.b(bdj1Var, "header");
                }
                if (u890.j(arl1Var, rp00Var)) {
                    bdj1 bdj1Var3 = bdj1Var;
                    return Next.i(gcj1.d(bdj1Var3, true, false), Effects.a(new dkb0[]{new dkb0(bdj1Var3.a(), str2)}));
                }
                if (u890.j(arl1Var, u8u0Var)) {
                    bdj1 bdj1Var4 = bdj1Var;
                    return Next.i(gcj1.d(bdj1Var4, true, false), Effects.a(new d9j1[]{eas0.a, new fkb0(bdj1Var4.a())}));
                }
                if (u890.j(arl1Var, mv7.b)) {
                    return Next.j();
                }
                if (u890.j(arl1Var, cpd1Var)) {
                    return gcj1.b(bdj1Var, "tagline");
                }
                if (arl1Var instanceof zsi0) {
                    if (ecj1.a[((zsi0) arl1Var).a.ordinal()] == 1) {
                        return Next.i(ddj1Var, Effects.a(new geu[]{new geu(bdj1Var.a().a, true)}));
                    }
                    eg.o();
                } else {
                    if (u890.j(arl1Var, apt0Var)) {
                        if (!(bdj1Var instanceof bdj1)) {
                            return Next.j();
                        }
                        bdj1 bdj1Var5 = bdj1Var;
                        boolean z = bdj1Var5.e;
                        return Next.i(bdj1.h(bdj1Var5, false, false, false, !z, false, 0, 111), Effects.a(new d9j1[]{z ? v631.a : fas0.a}));
                    }
                    if (u890.j(arl1Var, uij1Var)) {
                        if (!(bdj1Var instanceof bdj1)) {
                            return Next.j();
                        }
                        bdj1 bdj1Var6 = bdj1Var;
                        return Next.h(bdj1.h(bdj1Var6, !bdj1Var6.b, false, false, false, false, 0, 125));
                    }
                    if (arl1Var instanceof m7u0) {
                        dv0 dv0Var = ((m7u0) arl1Var).a;
                        if (dv0Var.c()) {
                            bdj1 bdj1Var7 = bdj1Var;
                            taj1 taj1VarA = bdj1Var7.a();
                            boolean zE = bdj1Var7.e();
                            bdj1 bdj1Var8 = new bdj1(taj1VarA, zE, bdj1Var7.isVisible(), bdj1Var7.d(), bdj1Var7.f(), bdj1Var7.c(), bdj1Var7.b());
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            if (!zE) {
                                linkedHashSet.add(gwo0.a);
                            }
                            r7h.W(gcj1.c(bdj1Var7, bdj1Var8), linkedHashSet);
                            return Next.i(bdj1Var8, linkedHashSet);
                        }
                        if (dv0Var.b()) {
                            bdj1 bdj1Var9 = bdj1Var;
                            zcj1 zcj1Var = new zcj1(bdj1Var9.a(), bdj1Var9.e(), bdj1Var9.isVisible(), bdj1Var9.d(), bdj1Var9.f(), bdj1Var9.c(), bdj1Var9.b());
                            return gcj1Var.a ? Next.i(zcj1Var, Effects.a(new geu[]{new geu(bdj1Var9.a().a, false)})) : Next.h(zcj1Var);
                        }
                        if (!dv0Var.b && dv0Var.d != 0) {
                            bdj1 bdj1Var10 = bdj1Var;
                            return Next.h(new ycj1(bdj1Var10.a(), bdj1Var10.e(), bdj1Var10.isVisible(), bdj1Var10.d(), bdj1Var10.f(), bdj1Var10.c(), bdj1Var10.b()));
                        }
                        if (!dv0Var.a) {
                            return Next.j();
                        }
                        bdj1 bdj1Var11 = bdj1Var;
                        return Next.h(new xcj1(bdj1Var11.a(), bdj1Var11.e(), bdj1Var11.isVisible(), bdj1Var11.d(), bdj1Var11.f(), bdj1Var11.c(), bdj1Var11.b()));
                    }
                    if (u890.j(arl1Var, mv7.a)) {
                        bdj1 bdj1Var12 = bdj1Var;
                        if (bdj1Var12 instanceof xcj1) {
                            objH = xcj1.h((xcj1) bdj1Var12, true, false, false, false, 0, 125);
                        } else if (bdj1Var12 instanceof ycj1) {
                            objH = ycj1.h((ycj1) bdj1Var12, true, false, false, false, 0, 125);
                        } else if (bdj1Var12 instanceof zcj1) {
                            objH = zcj1.h((zcj1) bdj1Var12, true, false, false, false, 0, 125);
                        } else if (bdj1Var12 instanceof bdj1) {
                            objH = bdj1.h(bdj1Var12, true, false, false, false, false, 0, 125);
                        } else if (bdj1Var12 instanceof cdj1) {
                            objH = cdj1.h((cdj1) bdj1Var12, true, false, false, false, 0, 125);
                        } else {
                            eg.o();
                        }
                        return Next.h(objH);
                    }
                    if (u890.j(arl1Var, bf21Var)) {
                        bdj1 bdj1Var13 = bdj1Var;
                        return Next.i(new cdj1(bdj1Var13.a(), bdj1Var13.e(), bdj1Var13.b()), Effects.a(new of21[]{new of21(bdj1Var13.a().a)}));
                    }
                    if (arl1Var instanceof jjs0) {
                        bdj1 bdj1Var14 = bdj1Var;
                        int i = ((jjs0) arl1Var).a;
                        tr80 tr80VarQ = yoi1.Q(0, 50);
                        tr80 tr80Var = new tr80(50, 100, 1);
                        boolean z2 = i >= 50;
                        if (bdj1Var14 instanceof xcj1) {
                            adj1VarH = xcj1.h((xcj1) bdj1Var14, false, false, false, false, i, 63);
                        } else if (bdj1Var14 instanceof ycj1) {
                            adj1VarH = ycj1.h((ycj1) bdj1Var14, false, false, false, false, i, 63);
                        } else if (bdj1Var14 instanceof zcj1) {
                            adj1VarH = zcj1.h((zcj1) bdj1Var14, false, false, false, false, i, 63);
                        } else if (bdj1Var14 instanceof bdj1) {
                            adj1VarH = bdj1.h(bdj1Var14, false, false, false, false, false, i, 63);
                            i = i;
                        } else if (bdj1Var14 instanceof cdj1) {
                            adj1VarH = cdj1.h((cdj1) bdj1Var14, false, false, false, false, i, 63);
                        } else {
                            eg.o();
                        }
                        if (adj1VarH.isVisible() != z2) {
                            if (adj1VarH instanceof xcj1) {
                                adj1VarH2 = xcj1.h((xcj1) adj1VarH, false, z2, false, false, 0, 123);
                            } else {
                                boolean z3 = z2;
                                if (adj1VarH instanceof ycj1) {
                                    adj1VarH2 = ycj1.h((ycj1) adj1VarH, false, z3, false, false, 0, 123);
                                } else if (adj1VarH instanceof zcj1) {
                                    adj1VarH2 = zcj1.h((zcj1) adj1VarH, false, z3, false, false, 0, 123);
                                } else if (adj1VarH instanceof bdj1) {
                                    adj1VarH2 = bdj1.h((bdj1) adj1VarH, false, z3, false, false, false, 0, 123);
                                } else if (adj1VarH instanceof cdj1) {
                                    adj1VarH2 = cdj1.h((cdj1) adj1VarH, false, z3, false, false, 0, 123);
                                } else {
                                    eg.o();
                                }
                            }
                            adj1VarH = adj1VarH2;
                        }
                        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                        int i2 = ((rr80) tr80VarQ).a;
                        int i3 = ((rr80) tr80VarQ).b;
                        int iB = bdj1Var14.b();
                        int i4 = ((rr80) tr80Var).b;
                        if (i2 > iB || iB > i3 || i > i4 || 50 > i) {
                            int iB2 = bdj1Var14.b();
                            if (50 <= iB2 && iB2 <= i4) {
                                int i5 = ((rr80) tr80VarQ).a;
                                if (i <= i3 && i5 <= i) {
                                    linkedHashSet2.add(new gm21(bdj1Var14.a().a.a()));
                                }
                            }
                        } else {
                            linkedHashSet2.add(new dm21(bdj1Var14.a().a.a()));
                        }
                        r7h.W(gcj1.c(bdj1Var14, adj1VarH), linkedHashSet2);
                        return Next.i(adj1VarH, linkedHashSet2);
                    }
                    if (arl1Var instanceof arl1) {
                        bdj1 bdj1Var15 = bdj1Var;
                        if (bdj1Var15.c() && arl1Var.a) {
                            return Next.i(gcj1.e(gcj1.d(bdj1Var15, false, true), true), Effects.a(new avf[]{new avf(bdj1Var15.a().a)}));
                        }
                        boolean zD = bdj1Var15.d();
                        boolean z4 = arl1Var.a;
                        if (zD == z4) {
                            return Next.j();
                        }
                        adj1 adj1VarE = gcj1.e(bdj1Var15, z4);
                        return Next.i(adj1VarE, gcj1.c(bdj1Var15, adj1VarE));
                    }
                    eg.o();
                }
                return null;
            case 2:
                bdj1 bdj1Var16 = (edj1) obj;
                tq80 tq80Var2 = (tq80) obj2;
                hcj1 hcj1Var = (hcj1) obj3;
                if (!(bdj1Var16 instanceof adj1)) {
                    return Next.j();
                }
                arl1 arl1Var2 = (nbj1) tq80Var2.a;
                tqw tqwVar2 = tq80Var2.b;
                String str3 = (tqwVar2 == null || (ou80Var2 = n3o1.y(tqwVar2).a) == null) ? null : ou80Var2.a;
                if (u890.j(arl1Var2, fy0Var)) {
                    return hcj1.b(bdj1Var16, "ad_tag");
                }
                if (u890.j(arl1Var2, rxcVar)) {
                    if (!hcj1Var.b) {
                        return hcj1.b(bdj1Var16, "cta_button");
                    }
                    bdj1 bdj1Var17 = bdj1Var16;
                    return Next.i(ddj1Var, Effects.a(new e9j1[]{new kjb0(bdj1Var17.a().d, "cta_button"), new feu(bdj1Var17.a().a, false)}));
                }
                if (u890.j(arl1Var2, grgVar)) {
                    return Next.i(ddj1Var, Effects.a(new feu[]{new feu(bdj1Var16.a().a, true)}));
                }
                if (u890.j(arl1Var2, rw50Var)) {
                    return hcj1.b(bdj1Var16, "header");
                }
                if (u890.j(arl1Var2, rp00Var)) {
                    return Next.a(Effects.a(new ekb0[]{new ekb0(bdj1Var16.a(), str3, "expand_button")}));
                }
                if (u890.j(arl1Var2, u8u0Var)) {
                    int iOrdinal = hcj1Var.c.ordinal();
                    if (iOrdinal == 0) {
                        return Next.a(Effects.a(new ekb0[]{new ekb0(bdj1Var16.a(), str3, "player")}));
                    }
                    if (iOrdinal == 1 || iOrdinal == 2) {
                        return hcj1.b(bdj1Var16, "player");
                    }
                    eg.o();
                } else {
                    if (u890.j(arl1Var2, mv7.b)) {
                        return Next.j();
                    }
                    if (u890.j(arl1Var2, cpd1Var)) {
                        return hcj1.b(bdj1Var16, "tagline");
                    }
                    if (arl1Var2 instanceof zsi0) {
                        if (fcj1.a[((zsi0) arl1Var2).a.ordinal()] == 1) {
                            return Next.i(ddj1Var, Effects.a(new feu[]{new feu(bdj1Var16.a().a, true)}));
                        }
                        eg.o();
                    } else {
                        if (u890.j(arl1Var2, apt0Var)) {
                            if (!(bdj1Var16 instanceof bdj1)) {
                                return Next.j();
                            }
                            bdj1 bdj1Var18 = bdj1Var16;
                            boolean z5 = bdj1Var18.e;
                            return Next.i(bdj1.h(bdj1Var18, false, false, false, !z5, false, 0, 111), Effects.a(new e9j1[]{z5 ? w631.a : gas0.a}));
                        }
                        if (u890.j(arl1Var2, uij1Var)) {
                            if (!(bdj1Var16 instanceof bdj1)) {
                                return Next.j();
                            }
                            bdj1 bdj1Var19 = bdj1Var16;
                            return Next.h(bdj1.h(bdj1Var19, !bdj1Var19.b, false, false, false, false, 0, 125));
                        }
                        if (arl1Var2 instanceof m7u0) {
                            dv0 dv0Var2 = ((m7u0) arl1Var2).a;
                            if (dv0Var2.c()) {
                                bdj1 bdj1Var20 = bdj1Var16;
                                taj1 taj1VarA2 = bdj1Var20.a();
                                boolean zE2 = bdj1Var20.e();
                                bdj1 bdj1Var21 = new bdj1(taj1VarA2, zE2, bdj1Var20.isVisible(), bdj1Var20.d(), bdj1Var20.f(), false, bdj1Var20.b());
                                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                                if (!zE2) {
                                    linkedHashSet3.add(hwo0.a);
                                }
                                r7h.W(hcj1.c(bdj1Var20, bdj1Var21), linkedHashSet3);
                                return Next.i(bdj1Var21, linkedHashSet3);
                            }
                            if (dv0Var2.b()) {
                                bdj1 bdj1Var22 = bdj1Var16;
                                zcj1 zcj1Var2 = new zcj1(bdj1Var22.a(), bdj1Var22.e(), bdj1Var22.isVisible(), bdj1Var22.d(), bdj1Var22.f(), false, bdj1Var22.b());
                                return hcj1Var.a ? Next.i(zcj1Var2, Effects.a(new feu[]{new feu(bdj1Var22.a().a, false)})) : Next.h(zcj1Var2);
                            }
                            if (!dv0Var2.b && dv0Var2.d != 0) {
                                bdj1 bdj1Var23 = bdj1Var16;
                                return Next.h(new ycj1(bdj1Var23.a(), bdj1Var23.e(), bdj1Var23.isVisible(), bdj1Var23.d(), bdj1Var23.f(), false, bdj1Var23.b()));
                            }
                            if (!dv0Var2.a) {
                                return Next.j();
                            }
                            bdj1 bdj1Var24 = bdj1Var16;
                            return Next.h(new xcj1(bdj1Var24.a(), bdj1Var24.e(), bdj1Var24.isVisible(), bdj1Var24.d(), bdj1Var24.f(), bdj1Var24.b(), 32));
                        }
                        if (u890.j(arl1Var2, mv7.a)) {
                            bdj1 bdj1Var25 = bdj1Var16;
                            if (bdj1Var25 instanceof xcj1) {
                                objH2 = xcj1.h((xcj1) bdj1Var25, true, false, false, false, 0, 125);
                            } else if (bdj1Var25 instanceof ycj1) {
                                objH2 = ycj1.h((ycj1) bdj1Var25, true, false, false, false, 0, 125);
                            } else if (bdj1Var25 instanceof zcj1) {
                                objH2 = zcj1.h((zcj1) bdj1Var25, true, false, false, false, 0, 125);
                            } else if (bdj1Var25 instanceof bdj1) {
                                objH2 = bdj1.h(bdj1Var25, true, false, false, false, false, 0, 125);
                            } else if (bdj1Var25 instanceof cdj1) {
                                objH2 = cdj1.h((cdj1) bdj1Var25, true, false, false, false, 0, 125);
                            } else {
                                eg.o();
                            }
                            return Next.h(objH2);
                        }
                        if (u890.j(arl1Var2, bf21Var)) {
                            bdj1 bdj1Var26 = bdj1Var16;
                            return Next.i(new cdj1(bdj1Var26.a(), bdj1Var26.e(), bdj1Var26.b()), Effects.a(new pf21[]{new pf21(bdj1Var26.a().a)}));
                        }
                        if (arl1Var2 instanceof jjs0) {
                            bdj1 bdj1Var27 = bdj1Var16;
                            int i6 = ((jjs0) arl1Var2).a;
                            tr80 tr80VarQ2 = yoi1.Q(0, 50);
                            tr80 tr80Var2 = new tr80(50, 100, 1);
                            boolean z6 = i6 >= 50;
                            if (bdj1Var27 instanceof xcj1) {
                                adj1VarH4 = xcj1.h((xcj1) bdj1Var27, false, false, false, false, i6, 63);
                            } else if (bdj1Var27 instanceof ycj1) {
                                adj1VarH4 = ycj1.h((ycj1) bdj1Var27, false, false, false, false, i6, 63);
                            } else if (bdj1Var27 instanceof zcj1) {
                                adj1VarH4 = zcj1.h((zcj1) bdj1Var27, false, false, false, false, i6, 63);
                            } else if (bdj1Var27 instanceof bdj1) {
                                adj1VarH4 = bdj1.h(bdj1Var27, false, false, false, false, false, i6, 63);
                            } else if (bdj1Var27 instanceof cdj1) {
                                adj1VarH4 = cdj1.h((cdj1) bdj1Var27, false, false, false, false, i6, 63);
                            } else {
                                eg.o();
                            }
                            if (adj1VarH4.isVisible() != z6) {
                                if (adj1VarH4 instanceof xcj1) {
                                    adj1VarH4 = xcj1.h((xcj1) adj1VarH4, false, z6, false, false, 0, 123);
                                } else if (adj1VarH4 instanceof ycj1) {
                                    adj1VarH4 = ycj1.h((ycj1) adj1VarH4, false, z6, false, false, 0, 123);
                                } else if (adj1VarH4 instanceof zcj1) {
                                    adj1VarH4 = zcj1.h((zcj1) adj1VarH4, false, z6, false, false, 0, 123);
                                } else if (adj1VarH4 instanceof bdj1) {
                                    adj1VarH4 = bdj1.h((bdj1) adj1VarH4, false, z6, false, false, false, 0, 123);
                                } else if (adj1VarH4 instanceof cdj1) {
                                    adj1VarH4 = cdj1.h((cdj1) adj1VarH4, false, z6, false, false, 0, 123);
                                } else {
                                    eg.o();
                                }
                            }
                            LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                            int i7 = ((rr80) tr80VarQ2).a;
                            int i8 = ((rr80) tr80VarQ2).b;
                            int iB3 = bdj1Var27.b();
                            int i9 = ((rr80) tr80Var2).b;
                            if (i7 > iB3 || iB3 > i8 || i6 > i9 || 50 > i6) {
                                int iB4 = bdj1Var27.b();
                                if (50 <= iB4 && iB4 <= i9) {
                                    int i10 = ((rr80) tr80VarQ2).a;
                                    if (i6 <= i8 && i10 <= i6) {
                                        linkedHashSet4.add(new fm21(bdj1Var27.a().a.a()));
                                    }
                                }
                            } else {
                                linkedHashSet4.add(new cm21(bdj1Var27.a().a.a()));
                            }
                            r7h.W(hcj1.c(bdj1Var27, adj1VarH4), linkedHashSet4);
                            return Next.i(adj1VarH4, linkedHashSet4);
                        }
                        if (arl1Var2 instanceof arl1) {
                            bdj1 bdj1Var28 = bdj1Var16;
                            boolean zD2 = bdj1Var28.d();
                            boolean z7 = arl1Var2.a;
                            if (zD2 == z7) {
                                return Next.j();
                            }
                            if (bdj1Var28 instanceof xcj1) {
                                adj1VarH3 = xcj1.h((xcj1) bdj1Var28, false, false, z7, false, 0, 119);
                            } else if (bdj1Var28 instanceof ycj1) {
                                adj1VarH3 = ycj1.h((ycj1) bdj1Var28, false, false, z7, false, 0, 119);
                            } else if (bdj1Var28 instanceof zcj1) {
                                adj1VarH3 = zcj1.h((zcj1) bdj1Var28, false, false, z7, false, 0, 119);
                            } else if (bdj1Var28 instanceof bdj1) {
                                adj1VarH3 = bdj1.h(bdj1Var28, false, false, z7, false, false, 0, 119);
                            } else if (bdj1Var28 instanceof cdj1) {
                                adj1VarH3 = cdj1.h((cdj1) bdj1Var28, false, false, z7, false, 0, 119);
                            } else {
                                eg.o();
                            }
                            return Next.i(adj1VarH3, hcj1.c(bdj1Var28, adj1VarH3));
                        }
                        eg.o();
                    }
                }
                return null;
            case 3:
                return (Next) ((eq7) obj3).invoke(obj, obj2);
            case 4:
                return (Next) ((eii1) obj3).invoke(obj, obj2);
            case 5:
                return (Next) ((eq7) obj3).invoke(obj, obj2);
            default:
                dnk1 dnk1Var = (dnk1) obj;
                zmk1 zmk1Var = (cnk1) obj2;
                hok1 hok1Var = (hok1) obj3;
                dnk1Var.getClass();
                boolean z8 = dnk1Var.c;
                boolean z9 = dnk1Var.b;
                zmk1Var.getClass();
                if (zmk1Var instanceof zmk1) {
                    return Next.i(dnk1.a(dnk1Var, zmk1Var.a, false, 5), Collections.singleton(qnk1.a));
                }
                if (zmk1Var instanceof bnk1) {
                    boolean z10 = !z8;
                    return Next.i(dnk1.a(dnk1Var, false, z10, 3), Collections.singleton(new mnk1(z10)));
                }
                boolean z11 = zmk1Var instanceof ymk1;
                knk1 knk1Var = knk1.a;
                if (z11) {
                    dnk1 dnk1VarA = dnk1.a(dnk1Var, false, false, 5);
                    xj61 xj61Var = new xj61();
                    xj61Var.add(new jnk1(z9));
                    xj61Var.add(knk1Var);
                    return Next.i(dnk1VarA, cwl1.j(xj61Var));
                }
                if (zmk1Var instanceof ank1) {
                    dnk1 dnk1VarA2 = dnk1.a(dnk1Var, z9 ? false : z9, false, 4);
                    xj61 xj61Var2 = new xj61();
                    xj61Var2.add(new rnk1(z9));
                    return Next.i(dnk1VarA2, cwl1.j(xj61Var2));
                }
                boolean z12 = zmk1Var instanceof vmk1;
                onk1 onk1Var = onk1.a;
                if (z12) {
                    return Next.i(dnk1.a(dnk1Var, z9 ? false : z9, false, 4), z9 ? Collections.singleton(onk1Var) : w7x.a);
                }
                if (zmk1Var instanceof xmk1) {
                    dnk1 dnk1VarA3 = dnk1.a(dnk1Var, false, false, 5);
                    xj61 xj61Var3 = new xj61();
                    boolean z13 = hok1Var.d.x() && z8;
                    if (z9) {
                        xj61Var3.add(onk1Var);
                    }
                    xj61Var3.add(new lnk1(((xmk1) zmk1Var).a, z13));
                    return Next.i(dnk1VarA3, cwl1.j(xj61Var3));
                }
                if (!(zmk1Var instanceof wmk1)) {
                    eg.o();
                    return null;
                }
                dnk1 dnk1VarA4 = dnk1.a(dnk1Var, false, false, 5);
                xj61 xj61Var4 = new xj61();
                xj61Var4.add(new jnk1(z9));
                xj61Var4.add(pnk1.a);
                xj61Var4.add(knk1Var);
                return Next.i(dnk1VarA4, cwl1.j(xj61Var4));
        }
    }
}
