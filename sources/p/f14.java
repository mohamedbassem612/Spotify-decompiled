package p;

import androidx.car.app.navigation.model.Maneuver;
import androidx.compose.ui.tooling.PreviewActivity;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class f14 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f14(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                float fFloatValue = ((Float) obj).floatValue();
                ((o24) obj4).a(fFloatValue, ((Float) obj2).floatValue());
                ((m811) obj3).a = fFloatValue;
                return rih1Var;
            case 1:
                ob4 ob4Var = (ob4) obj3;
                int iIntValue = ((Integer) obj).intValue();
                v161 v161Var = (v161) obj2;
                if (!((w161) obj4).b.c(v161Var.f)) {
                    ob4Var.h(iIntValue, v161Var);
                    ob4Var.g.l(rih1Var);
                }
                return rih1Var;
            case 2:
                ((Integer) obj2).getClass();
                anm1.b(czo1.p(1), (b0k) obj, (vu30) obj3, (qim0) obj4);
                return rih1Var;
            case 3:
                ((Integer) obj2).getClass();
                ((t9w) obj4).f(czo1.p(7), (j2i) obj3, (b0k) obj);
                return rih1Var;
            case 4:
                tlc1 tlc1Var = (tlc1) obj;
                hjl hjlVar = (hjl) obj2;
                return ((gfh0) obj4).measure-3p2s80s(tlc1Var, tlc1Var.P(rih1Var, new j2i(-431986394, new f14(obj3, (Object) new i2c(tlc1Var, hjlVar.a), (byte) 5), true)), hjlVar.a);
            case 5:
                j2i j2iVar = (j2i) obj4;
                i2c i2cVar = (i2c) obj3;
                x340 x340Var = (b0k) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    j2iVar.invoke(i2cVar, x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 6:
                n811 n811Var = (n811) obj3;
                int i = n811Var.a;
                n811Var.a = i + 1;
                ((o8n[]) obj4)[i] = (m8n) obj2;
                return rih1Var;
            case 7:
                ((Integer) obj2).getClass();
                ((uim) obj4).a((mdm) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 8:
                ((Integer) obj2).getClass();
                ((kjr) obj4).a((yu3) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 9:
                ((Integer) obj2).getClass();
                ((xps) obj4).a((i191) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                g3e1 g3e1Var = (g3e1) obj4;
                r3e1 r3e1Var = (r3e1) obj3;
                x340 x340Var3 = (b0k) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zG = x340Var4.g(g3e1Var);
                    Object objT = x340Var4.T();
                    if (zG || objT == fkj0.X) {
                        objT = yv91.a(new l1k(0, g3e1Var, g3e1.class, "data", "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0, (byte) 28));
                        x340Var4.s0(objT);
                    }
                    fus.a(r3e1Var, (f3e1) ((tob1) objT).getValue(), x340Var4, 0);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 11:
                ((Integer) obj2).getClass();
                fus.a((r3e1) obj4, (f3e1) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 12:
                ((Integer) obj2).getClass();
                ((bys) obj4).a((szg1) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 13:
                xnm0 xnm0Var = (xnm0) obj4;
                x340 x340Var5 = (b0k) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    xnm0Var.a.invoke(obj3, x340Var6, 0);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 14:
                h72 h72Var = (h72) obj4;
                hf91 hf91Var = (hf91) obj3;
                int iIntValue5 = ((Integer) obj).intValue();
                if (obj2 instanceof wvj) {
                    ((bfn0) h72Var.g).b((wvj) obj2);
                } else if (!(obj2 instanceof jd31)) {
                    if (obj2 instanceof b440) {
                        ot11.L(hf91Var, iIntValue5, obj2);
                        h72Var.D((b440) obj2);
                    } else if (obj2 instanceof h311) {
                        ot11.L(hf91Var, iIntValue5, obj2);
                        ((h311) obj2).d();
                    }
                }
                return rih1Var;
            case 15:
                nmb0 nmb0Var = (nmb0) obj4;
                vu30 vu30Var = (vu30) obj3;
                x340 x340Var7 = (b0k) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    Boolean bool = (Boolean) nmb0Var.g.getValue();
                    boolean zBooleanValue = bool.booleanValue();
                    x340Var8.l0(bool);
                    boolean zH = x340Var8.h(zBooleanValue);
                    if (zBooleanValue) {
                        vu30Var.invoke(x340Var8, 0);
                    } else {
                        if (x340Var8.l != 0) {
                            g0k.a("No nodes can be emitted before calling deactivateToEndGroup");
                        }
                        if (!x340Var8.S) {
                            if (zH) {
                                ye91 ye91Var = x340Var8.G;
                                int i2 = ye91Var.g;
                                int i3 = ye91Var.h;
                                c0k c0kVar = x340Var8.M;
                                c0kVar.getClass();
                                c0kVar.d(false);
                                c0kVar.b.c.B(ckq0.c);
                                ot11.t(i2, i3, x340Var8.s);
                                x340Var8.G.t();
                            } else {
                                x340Var8.a0();
                            }
                        }
                    }
                    x340Var8.w();
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 16:
                pf50 pf50Var = (pf50) obj4;
                c36 c36Var = (c36) obj3;
                wat watVar = (wat) obj;
                hjl hjlVar2 = (hjl) obj2;
                if (hjl.i(hjlVar2.a) == Integer.MAX_VALUE) {
                    tf80.a("LazyVerticalGrid's width should be bound by parent.");
                }
                int i4 = hjl.i(hjlVar2.a);
                int iI0 = watVar.i0(c36Var.a());
                int i5 = pf50Var.a;
                int i6 = i4 - ((i5 - 1) * iI0);
                int i7 = i6 / i5;
                int i8 = i6 % i5;
                ArrayList arrayList = new ArrayList(i5);
                int i9 = 0;
                while (i9 < i5) {
                    arrayList.add(Integer.valueOf((i9 < i8 ? 1 : 0) + i7));
                    i9++;
                }
                int[] iArrK1 = o7h.k1(arrayList);
                int[] iArr = new int[iArrK1.length];
                c36Var.e(watVar, i4, iArrK1, flb0.a, iArr);
                return new v6a0(iArrK1, iArr, (byte) 10);
            case 17:
                dsb0 dsb0Var = (dsb0) obj4;
                csb0 csb0Var = (csb0) obj3;
                x340 x340Var9 = (b0k) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    esb0 esb0Var = (esb0) dsb0Var.b.invoke();
                    int iC = csb0Var.c;
                    Object obj5 = csb0Var.a;
                    if ((iC >= esb0Var.a() || !esb0Var.d(iC).equals(obj5)) && (iC = esb0Var.c(obj5)) != -1) {
                        csb0Var.c = iC;
                    }
                    int i10 = iC;
                    if (i10 != -1) {
                        x340Var10.i0(-1664741271);
                        omo1.e(esb0Var, dsb0Var.a, i10, csb0Var.a, x340Var10, 0);
                        x340Var10.r(false);
                    } else {
                        x340Var10.i0(-1664505826);
                        x340Var10.r(false);
                    }
                    boolean zI = x340Var10.i(csb0Var);
                    Object objT2 = x340Var10.T();
                    if (zI || objT2 == fkj0.X) {
                        objT2 = new gv20((Object) csb0Var, (byte) 13);
                        x340Var10.s0(objT2);
                    }
                    qxd0.i(obj5, (iu30) objT2, x340Var10);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 18:
                return ((hsb0) obj3).a(new isb0((dsb0) obj4, (tlc1) obj), ((hjl) obj2).a);
            case 19:
                j2i j2iVar2 = (j2i) obj4;
                hub0 hub0Var = (hub0) obj3;
                x340 x340Var11 = (b0k) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    j2iVar2.invoke(hub0Var, x340Var12, 0);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 20:
                return ((r3d0) obj4).a((String) obj3, (lnm) obj2);
            case 21:
                r7j0 r7j0Var = (r7j0) obj4;
                rvg0 rvg0Var = (rvg0) obj3;
                x340 x340Var13 = (b0k) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    r7j0Var.invoke(rvg0Var.invoke(x340Var14, 0));
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 22:
                ndo0 ndo0Var = (ndo0) obj4;
                g030 g030Var = (g030) obj3;
                fid fidVar = (fid) obj;
                be50 be50Var = (be50) obj2;
                hmb0 hmb0Var = ndo0Var.U0;
                if (hmb0Var.J()) {
                    ndo0Var.r1 = fidVar;
                    ndo0Var.q1 = be50Var;
                    kmb0.a(hmb0Var).getSnapshotObserver().a.d(ndo0Var, ndo0.y1, g030Var);
                    ndo0Var.u1 = false;
                } else {
                    ndo0Var.u1 = true;
                }
                return rih1Var;
            case 23:
                m811 m811Var = (m811) obj3;
                float fFloatValue2 = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                m811Var.a += ((zjr0) obj4).a.f(fFloatValue2 - m811Var.a);
                return rih1Var;
            case 24:
                String str = (String) obj4;
                String str2 = (String) obj3;
                x340 x340Var15 = (b0k) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                int i11 = PreviewActivity.U0;
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    w0h1.w(str, str2, x340Var16, new Object[0]);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 25:
                j2i j2iVar3 = (j2i) obj4;
                xf41 xf41Var = (xf41) obj3;
                x340 x340Var17 = (b0k) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    j2iVar3.invoke(xf41Var, x340Var18, 6);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 26:
                j2i j2iVar4 = (j2i) obj4;
                bg41 bg41Var = (bg41) obj3;
                x340 x340Var19 = (b0k) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    j2iVar4.invoke(bg41Var.a, x340Var20, 0);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                f3a f3aVar = (f3a) obj4;
                vu30 vu30Var2 = (vu30) obj3;
                x340 x340Var21 = (b0k) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    mod.b(yf41.a.a(f3aVar), vu30Var2, x340Var22, 8);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                m811 m811Var2 = (m811) obj3;
                float fFloatValue3 = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                float f = m811Var2.a;
                m811Var2.a = ((bs41) obj4).f(fFloatValue3 - f) + f;
                return rih1Var;
            default:
                ((Integer) obj2).getClass();
                jap1.n(czo1.p(49), (j2i) obj3, (b0k) obj, (qim0) obj4);
                return rih1Var;
        }
    }

    public /* synthetic */ f14(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ f14(m811 m811Var, bs41 bs41Var, byte b) {
        this.a = b;
        this.c = m811Var;
        this.b = bs41Var;
    }
}
