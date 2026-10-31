package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gm10 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hrr0 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gm10(hrr0 hrr0Var, dx0 dx0Var, iu30 iu30Var) {
        super(2);
        this.a = (byte) 2;
        this.b = hrr0Var;
        this.c = iu30Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:121:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:99:0x017a  */
    public final Object invoke(Object obj, Object obj2) {
        rih1 rih1Var;
        zsc zscVar;
        long j;
        long jG;
        String str;
        String str2;
        int i;
        byte b = this.a;
        rih1 rih1Var2 = rih1.a;
        iu30 iu30Var = this.c;
        hrr0 hrr0Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    em10 em10Var = (em10) hrr0Var.getValue();
                    if (em10Var == null) {
                        x340Var2.i0(850042254);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(850042255);
                        boolean z = em10Var.d;
                        boolean z2 = em10Var.c;
                        osv0 osv0Var = em10Var.a;
                        boolean zG = x340Var2.g(iu30Var);
                        Object objT = x340Var2.T();
                        if (zG || objT == fkj0.X) {
                            objT = new yx00(iu30Var, (byte) 12);
                            x340Var2.s0(objT);
                        }
                        pwo1.d(z2, z, osv0Var, (Function0) objT, (qim0) null, x340Var2, 0);
                        x340Var2.r(false);
                    }
                } else {
                    x340Var2.b0();
                }
                return rih1Var2;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nyx.a(2, (wux) null, apo.r(-1330516034, new gm10(hrr0Var, iu30Var, (byte) 0), x340Var4), x340Var4, 3078, 6);
                } else {
                    x340Var4.b0();
                }
                return rih1Var2;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ssv0 ssv0Var = (ssv0) hrr0Var.getValue();
                    if (ssv0Var == null) {
                        x340Var6.i0(-91482011);
                        x340Var6.r(false);
                        rih1Var = rih1Var2;
                    } else {
                        x340Var6.i0(-91482010);
                        ktv0 ktv0Var = ssv0Var.a;
                        String str3 = ktv0Var.c;
                        String str4 = str3 == null ? "" : str3;
                        String str5 = ktv0Var.i;
                        String str6 = str5 == null ? "" : str5;
                        String str7 = ktv0Var.d;
                        String str8 = str7 == null ? "" : str7;
                        String str9 = ktv0Var.h;
                        String str10 = str9 == null ? "" : str9;
                        String str11 = ktv0Var.e;
                        String str12 = str11 == null ? "" : str11;
                        String str13 = ktv0Var.f;
                        String str14 = str13 == null ? "" : str13;
                        List list = ktv0Var.j;
                        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            anp0 anp0Var = (anp0) it.next();
                            String str15 = anp0Var.a;
                            if (str15 == null) {
                                str15 = "";
                            }
                            ypa ypaVar = lfx.c;
                            rih1 rih1Var3 = rih1Var2;
                            String str16 = anp0Var.b;
                            ypaVar.getClass();
                            hux huxVarH = ypa.h(str16);
                            int i2 = anp0Var.d;
                            Iterator it2 = it;
                            int i3 = i2 == 0 ? -1 : tsv0.a[l1d.C(i2)];
                            if (i3 == -1) {
                                i = 3;
                            } else if (i3 == 1) {
                                i = 1;
                            } else {
                                if (i3 != 2) {
                                    eg.o();
                                    return null;
                                }
                                i = 2;
                            }
                            arrayList.add(new sx30(str15, huxVarH, i));
                            it = it2;
                            rih1Var2 = rih1Var3;
                        }
                        rih1Var = rih1Var2;
                        c9 c9VarF = mqo1.F(arrayList);
                        String str17 = ktv0Var.k;
                        String str18 = str17 == null ? "" : str17;
                        htv0 htv0Var = ktv0Var.n;
                        String str19 = (htv0Var == null || (str2 = htv0Var.a) == null) ? "" : str2;
                        htv0 htv0Var2 = ktv0Var.o;
                        String str20 = (htv0Var2 == null || (str = htv0Var2.a) == null) ? "" : str;
                        boolean z3 = htv0Var != null ? htv0Var.c : false;
                        String str21 = ktv0Var.l;
                        if (str21 != null) {
                            switch (str21) {
                                case "premiumPlatinum":
                                    uwr uwrVar = cbx.a;
                                    zscVar = zex.a;
                                    j = ((xex) ((gmt) zscVar.c).b).J;
                                    break;
                                case "standardStudent":
                                    uwr uwrVar2 = cbx.a;
                                    zscVar = zex.a;
                                    j = ((xex) ((gmt) zscVar.c).b).n;
                                    break;
                                case "premiumLiteGBB":
                                    uwr uwrVar3 = cbx.a;
                                    zscVar = zex.a;
                                    j = ((xex) ((gmt) zscVar.c).b).v;
                                    break;
                                case "premiumStandard":
                                    uwr uwrVar4 = cbx.a;
                                    zscVar = zex.a;
                                    j = ((xex) ((gmt) zscVar.c).b).m;
                                    break;
                                default:
                                    uwr uwrVar5 = cbx.a;
                                    zscVar = zex.a;
                                    j = ((xex) ((gmt) zscVar.c).b).m;
                                    break;
                            }
                        } else {
                            uwr uwrVar6 = cbx.a;
                            zscVar = zex.a;
                            j = ((xex) ((gmt) zscVar.c).b).m;
                        }
                        long j2 = j;
                        gmt gmtVar = (gmt) zscVar.c;
                        xex xexVar = (xex) gmtVar.b;
                        String str22 = ktv0Var.m;
                        if (str22 != null) {
                            switch (str22) {
                                case "premiumPlatinum":
                                    jG = z4p1.g(4279244834L);
                                    break;
                                case "standardStudent":
                                    jG = z4p1.g(4280229663L);
                                    break;
                                case "premiumLiteGBB":
                                    jG = ((wex) gmtVar.c).c;
                                    break;
                                case "premiumStandard":
                                    jG = xexVar.o;
                                    break;
                                default:
                                    jG = xexVar.o;
                                    break;
                            }
                        } else {
                            jG = xexVar.o;
                        }
                        zx30 zx30Var = new zx30(str4, str6, str8, str10, str12, str14, c9VarF, str18, str19, str20, z3, j2, jG);
                        boolean zG2 = x340Var6.g(iu30Var);
                        Object objT2 = x340Var6.T();
                        if (zG2 || objT2 == fkj0.X) {
                            objT2 = new ppv0(iu30Var, (byte) 1);
                            x340Var6.s0(objT2);
                        }
                        lcc.i(zx30Var, null, (iu30) objT2, x340Var6, 8);
                        x340Var6.r(false);
                    }
                } else {
                    rih1Var = rih1Var2;
                    x340Var6.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gm10(hrr0 hrr0Var, iu30 iu30Var, byte b) {
        super(2);
        this.a = b;
        this.b = hrr0Var;
        this.c = iu30Var;
    }
}
