package p;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ub3 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ub3(Object obj, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:249:0x0724  */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        Object value;
        String str2;
        rz5 rz5VarA;
        Object obj4;
        int i;
        float f;
        urx urxVar;
        float f2;
        ou80 ou80Var;
        byte b = this.a;
        float width = 1.0f;
        qim0 qim0Var = nim0.a;
        byte b2 = 8;
        byte b3 = 6;
        byte b4 = 1;
        tv80 tv80Var = null;
        rih1 rih1Var = rih1.a;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                tb3 tb3Var = (tb3) obj;
                tqw tqwVar = (tqw) obj3;
                if (!((sb3) obj2).equals(sb3.a)) {
                    eg.o();
                    return null;
                }
                if (tqwVar != null) {
                    ((lzn0) ((rt01) obj5).c).a(tb3Var.b, n3o1.y(tqwVar), (Bundle) null);
                }
                return rih1Var;
            case 1:
                tqw tqwVar2 = (tqw) obj3;
                if (tqwVar2 != null) {
                    rt01 rt01Var = (rt01) obj5;
                    ((lzn0) rt01Var.c).a((String) ((idd1) rt01Var.d).getValue(), n3o1.y(tqwVar2), (Bundle) null);
                }
                return rih1Var;
            case 2:
                ((Number) obj3).intValue();
                ((ps3) obj5).c((b0k) obj2, 0);
                return rih1Var;
            case 3:
                ut3 ut3Var = (ut3) obj2;
                qt3 qt3Var = (qt3) ((ldo) obj5).d;
                if (ut3Var instanceof tt3) {
                    qt3Var.a.invoke(((tt3) ut3Var).a);
                } else if (ut3Var.equals(st3.a)) {
                    qt3Var.b.invoke();
                } else {
                    if (!ut3Var.equals(rt3.a)) {
                        eg.o();
                        return null;
                    }
                    qt3Var.c.invoke();
                }
                return rih1Var;
            case 4:
                bu3 bu3Var = (bu3) obj;
                if (((au3) obj2).equals(au3.a)) {
                    ((xb2) ((umf0) obj5).e).invoke(Integer.valueOf(bu3Var.a), bu3Var.b);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 5:
                bv3 bv3Var = (bv3) obj2;
                br0 br0Var = (br0) obj5;
                if (bv3Var.equals(zu3.a)) {
                    ((Function0) br0Var.d).invoke();
                } else {
                    if (!bv3Var.equals(av3.a)) {
                        eg.o();
                        return null;
                    }
                    ((Function0) br0Var.c).invoke();
                }
                return rih1Var;
            case 6:
                dy3 dy3Var = (ey3) obj2;
                tqw tqwVar3 = (tqw) obj3;
                qj0 qj0Var = (qj0) obj5;
                if (dy3Var instanceof dy3) {
                    ((lzn0) qj0Var.d).a(dy3Var.a, cvl1.d(tqwVar3), (Bundle) null);
                } else {
                    if (!(dy3Var instanceof cy3)) {
                        eg.o();
                        return null;
                    }
                    z710.d((z710) qj0Var.e, ((cy3) dy3Var).a, false, 6);
                }
                return rih1Var;
            case 7:
                yy5 yy5Var = (dz5) obj2;
                tqw tqwVar4 = (tqw) obj3;
                pt ptVar = (pt) obj5;
                yfr yfrVar = (yfr) ptVar.d;
                if (yy5Var instanceof az5) {
                    String str3 = ((az5) yy5Var).a;
                    StringBuilder sb = new StringBuilder();
                    int length = str3.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        char cCharAt = str3.charAt(i2);
                        if ('0' <= cCharAt && cCharAt < ':') {
                            sb.append(cCharAt);
                        }
                    }
                    String strC1 = ihc1.c1(4, sb.toString());
                    bpb1 bpb1Var = yfrVar.h;
                    while (true) {
                        Object value2 = bpb1Var.getValue();
                        rz5 rz5Var = (rz5) value2;
                        if (!rz5Var.g() || u890.j(rz5Var.a, strC1)) {
                            str2 = strC1;
                            rz5VarA = rz5Var;
                        } else {
                            str2 = strC1;
                            rz5VarA = rz5.a(rz5Var, str2, false, null, null, false, false, 0, 254);
                        }
                        if (!bpb1Var.k(value2, rz5VarA)) {
                            strC1 = str2;
                        }
                    }
                } else if (yy5Var.equals(cz5.a)) {
                    if (tqwVar4 == null) {
                        str = null;
                    } else {
                        tv80 tv80VarY = (a8h1) tqwVar4.a(rc11.a.b(a8h1.class));
                        if (tv80VarY == null) {
                            tv80VarY = n3o1.y(tqwVar4);
                        }
                        ou80 ou80Var2 = tv80VarY.a;
                        if (ou80Var2 != null) {
                            str = ou80Var2.a;
                        } else {
                            str = null;
                        }
                    }
                    zob1 zob1Var = yfrVar.n.a;
                    String str4 = ((rz5) zob1Var.getValue()).a;
                    if (((rz5) zob1Var.getValue()).e()) {
                        yfrVar.l = str;
                        bpb1 bpb1Var2 = yfrVar.h;
                        do {
                            value = bpb1Var2.getValue();
                        } while (!bpb1Var2.k(value, rz5.a((rz5) value, null, true, null, null, false, false, 0, 217)));
                        fn31.T(yfrVar.g, (o8n) null, 0, new p1r(yfrVar, str4, (lnm) null, (byte) 3), 3);
                    }
                } else if (yy5Var.equals(zy5.a)) {
                    if (((rz5) yfrVar.n.a.getValue()).b()) {
                        yfrVar.d((String) null);
                    }
                } else if (!yy5Var.equals(bz5.a)) {
                    if (!(yy5Var instanceof yy5)) {
                        eg.o();
                        return null;
                    }
                    smo1.p(yfrVar.g, (CancellationException) null);
                    if (yy5Var.a instanceof gxb) {
                        ((uu0) ptVar.i).j();
                    }
                } else if (((rz5) yfrVar.n.a.getValue()).d()) {
                    if (tqwVar4 != null) {
                        tv80 tv80VarY2 = (a8h1) tqwVar4.a(rc11.a.b(a8h1.class));
                        if (tv80VarY2 == null) {
                            tv80VarY2 = n3o1.y(tqwVar4);
                        }
                        ou80 ou80Var3 = tv80VarY2.a;
                        if (ou80Var3 != null) {
                            tv80Var = ou80Var3.a;
                        }
                    }
                    yfrVar.d(tv80Var);
                }
                return rih1Var;
            case 8:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                nyx.a(2, (wux) null, apo.r(94703110, new pp5((ic6) obj, (yb6) obj5, b3), b0kVar), b0kVar, 3078, 6);
                return rih1Var;
            case 9:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                String strO0 = cwl1.o0(b0kVar2, ((dd6) obj5).getCurrentListenersCount() == 1 ? 2131954682 : 2131954681);
                uwr uwrVar = cbx.a;
                uwo1.e(strO0, (qim0) null, (lee1) null, cbx.a(b0kVar2).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2038);
                return rih1Var;
            case 10:
                b0k b0kVar3 = (b0k) obj2;
                ((Number) obj3).intValue();
                String strN0 = cwl1.n0(2131954685, new Object[]{Integer.valueOf(((ed6) obj5).getCurrentRank())}, b0kVar3);
                uwr uwrVar2 = cbx.a;
                uwo1.e(strN0, (qim0) null, cbx.d(b0kVar3).b, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar3, 0, 0, 2042);
                return rih1Var;
            case 11:
                int iIntValue = ((Number) obj).intValue();
                x340 x340Var = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= x340Var.e(iIntValue) ? 4 : 2;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    ue6 ue6Var = (ue6) obj5;
                    Object objT = x340Var2.T();
                    if (objT == fkj0.X) {
                        obj4 = objT;
                        t16 t16Var = t16.Z0;
                        x340Var2.s0(t16Var);
                        obj4 = t16Var;
                    }
                    obj4 = objT;
                    vgo1.c(ue6Var, iIntValue, s161.a(qim0Var, (iu30) obj4), x340Var2, (iIntValue2 << 3) & 112);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 12:
                i2c i2cVar = (i2c) obj;
                x340 x340Var3 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                zyq0 zyq0Var = (zyq0) obj5;
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= x340Var3.g(i2cVar) ? 4 : 2;
                }
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    bhv bhvVar = new bhv(i2cVar.d(), i2cVar.c(), (byte) 2);
                    fho1.h(zyq0Var.d, u291.d(qim0Var, 1.0f), mif1.V0, x340Var4, 440, 0);
                    fho1.h(zyq0Var.e, u291.h(u291.v(eqr0.C(qim0Var, bhvVar.c(17.0f), bhvVar.e(54.41f)), bhvVar.c(251.0f)), bhvVar.e(313.0f)), (j6m) null, x340Var4, 8, 4);
                    fho1.i(zyq0Var.f, u291.h(u291.v(eqr0.C(qim0Var, bhvVar.c(281.0f), bhvVar.e(54.41f)), bhvVar.c(53.0f)), bhvVar.e(313.0f)), x340Var4, 8);
                    fho1.f(6, apo.r(-1092630226, new pp5(zyq0Var, bhvVar, b2), x340Var4), x340Var4);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 13:
                i2c i2cVar2 = (i2c) obj;
                x340 x340Var5 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= x340Var5.g(i2cVar2) ? 4 : 2;
                }
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    Bitmap bitmap = ((yj41) obj5).a;
                    if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
                        width = bitmap.getWidth() / bitmap.getHeight();
                    }
                    float f3 = zjy.j(i2cVar2.c() * width, new p3v(i2cVar2.d())).a;
                    fho1.h((yj41) obj5, u291.h(u291.v(qim0Var, f3), f3 / width), (j6m) null, x340Var6, 8, 4);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 14:
                long j = ((hjl) obj3).a;
                q5t0 q5t0VarH = ((afh0) obj2).H(hjl.b(j, 0, 0, 0, Integer.MAX_VALUE, 3));
                return ((ifh0) obj).S(q5t0VarH.a, hjl.h(j), b7x.a, new xg6(q5t0VarH, (yux) obj5, b4));
            case 15:
                x340 x340Var7 = (b0k) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    int iOrdinal = ((em0) obj5).W().ordinal();
                    if (iOrdinal == 0) {
                        i = 2131961058;
                    } else if (iOrdinal == 1) {
                        i = 2131962779;
                    } else {
                        if (iOrdinal != 2) {
                            eg.o();
                            return null;
                        }
                        i = 2131963811;
                    }
                    zmo1.a(0, cwl1.o0(x340Var8, i), x340Var8, (qim0) null);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 16:
                kx6 kx6Var = (kx6) obj;
                tqw tqwVar5 = (tqw) obj3;
                if (!((ax6) obj2).equals(ax6.a)) {
                    eg.o();
                    return null;
                }
                if (tqwVar5 != null) {
                    ((lzn0) ((rt01) obj5).c).a(kx6Var.a, n3o1.y(tqwVar5), (Bundle) null);
                }
                return rih1Var;
            case 17:
                hsl1 hsl1Var = (hsl1) obj2;
                ((ViewGroup.MarginLayoutParams) ((ViewGroup) ((he7) obj5).t).getLayoutParams()).topMargin = hsl1Var.a.i(519).b;
                return hsl1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                View view = (View) obj;
                hsl1 hsl1Var2 = (hsl1) obj2;
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                esl1 esl1Var = hsl1Var2.a;
                xl7 xl7Var = (xl7) obj5;
                xl7Var.f = Float.valueOf((view.getHeight() + iArr[1]) - Math.max(esl1Var.i(519).d, esl1Var.i(8).d));
                xl7Var.g.b = null;
                tv80 tv80Var2 = xl7Var.d;
                tv80Var = tv80Var2 instanceof RecyclerView ? (RecyclerView) tv80Var2 : null;
                if (tv80Var != null) {
                    tv80Var.post(new nx30(xl7Var, tv80Var, (byte) 5));
                }
                return hsl1Var2;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ib8 ib8Var = (ib8) obj;
                tqw tqwVar6 = (tqw) obj3;
                if (tqwVar6 != null) {
                    ((lzn0) ((qj0) obj5).e).a(ib8Var.b, n3o1.y(tqwVar6), (Bundle) null);
                }
                return rih1Var;
            case 20:
                bpb1 bpb1Var3 = ((kc8) ((ldo) obj5).c).a;
                bpb1Var3.m((Object) null, Boolean.valueOf(!((Boolean) bpb1Var3.getValue()).booleanValue()));
                return rih1Var;
            case 21:
                f861 f861Var = (f861) obj;
                x340 x340Var9 = (b0k) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= x340Var9.g(f861Var) ? 4 : 2;
                }
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    ((d861) ((qc8) obj5).d.get()).a(f861Var, null, x340Var10, iIntValue6 & 14);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 22:
                f78 f78Var = (f78) obj;
                he8 he8Var = (he8) obj2;
                tqw tqwVar7 = (tqw) obj3;
                rt01 rt01Var2 = (rt01) obj5;
                ix7 ix7Var = (ix7) rt01Var2.c;
                if (he8Var.equals(he8.b)) {
                    ((lzn0) rt01Var2.d).e();
                } else if (he8Var.equals(he8.a)) {
                    ix7Var.q(f78Var.e, tqwVar7 != null ? n3o1.y(tqwVar7) : null);
                } else {
                    if (!he8Var.equals(he8.c)) {
                        eg.o();
                        return null;
                    }
                    ix7Var.q(f78Var.g, tqwVar7 != null ? n3o1.y(tqwVar7) : null);
                }
                return rih1Var;
            case 23:
                uwr uwrVar3 = cbx.a;
                x340 x340Var11 = (b0k) obj2;
                int iIntValue7 = ((Number) obj3).intValue();
                u39 u39Var = (u39) obj5;
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    if (u39Var.g) {
                        x340Var12.i0(1445385260);
                        mta mtaVar = cbx.b(x340Var12).d;
                        x340Var12.r(false);
                        f = 32.0f;
                    } else {
                        x340Var12.i0(1445387145);
                        mta mtaVar2 = cbx.b(x340Var12).d;
                        x340Var12.r(false);
                        f = 48.0f;
                    }
                    qim0 qim0VarThen = u291.r(qim0Var, f).then(u39Var.e ? dug.f(i1p1.q(qim0Var, er31.a), ((vex) zex.a.e).i, d4o1.a) : qim0Var);
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode = Long.hashCode(x340Var12.T);
                    xos0 xos0VarM = x340Var12.m();
                    qim0 qim0VarE = zr7.E(x340Var12, qim0VarThen);
                    hzj.A.getClass();
                    if (x340Var12.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var12.m0();
                    if (x340Var12.S) {
                        x340Var12.l(hmb0.t1);
                    } else {
                        x340Var12.v0();
                    }
                    nko1.H(gfh0VarC, x340Var12, y580.O0);
                    nko1.H(xos0VarM, x340Var12, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var12, y580.R0);
                    nko1.F(x340Var12);
                    nko1.H(qim0VarE, x340Var12, y580.Y);
                    int iC = l1d.C(u39Var.c);
                    if (iC == 0) {
                        urxVar = esx.c;
                    } else {
                        if (iC != 1) {
                            eg.o();
                            return null;
                        }
                        urxVar = urx.c;
                    }
                    urx urxVar2 = urxVar;
                    if (u39Var.g) {
                        x340Var12.i0(-708118064);
                        zov0 zov0Var = cbx.b(x340Var12).g;
                        x340Var12.r(false);
                        f2 = 16.0f;
                    } else {
                        x340Var12.i0(-708117231);
                        zov0 zov0Var2 = cbx.b(x340Var12).g;
                        x340Var12.r(false);
                        f2 = 24.0f;
                    }
                    w0h1.a(urxVar2, isl.a, u291.r(qim0Var, f2), cbx.a(x340Var12).b.a, 0L, false, x340Var12, 56, 48);
                    x340Var12.r(true);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 24:
                hsl1 hsl1Var3 = (hsl1) obj2;
                uc80 uc80Var = (uc80) obj3;
                ((ConstraintLayout) ((s59) obj5).c).setPadding(uc80Var.a, uc80Var.b + hsl1Var3.a.i(519).b, uc80Var.c, uc80Var.d);
                return hsl1Var3;
            case 25:
                ((d99) obj5).b.invoke((ebt0) obj2);
                return rih1Var;
            case 26:
                tqw tqwVar8 = (tqw) obj3;
                String str5 = ((ma9) obj).d;
                if (str5 != null) {
                    hqn1.q(((na9) obj5).b, str5, tqwVar8, (Bundle) null);
                }
                return rih1Var;
            case 27:
                kn9 kn9Var = (kn9) obj;
                tqw tqwVar9 = (tqw) obj3;
                yxb0 yxb0Var = (yxb0) obj5;
                String str6 = kn9Var.d;
                if (!((jn9) obj2).equals(jn9.a)) {
                    eg.o();
                    return null;
                }
                if (tqwVar9 != null && (ou80Var = n3o1.y(tqwVar9).a) != null) {
                    tv80Var = ou80Var.a;
                }
                tv80 tv80Var3 = tv80Var;
                String str7 = kn9Var.e;
                rm9 rm9Var = (rm9) yxb0Var.c;
                if (str7 == null) {
                    rm9Var.f(str6, "byom-scroll-card", tv80Var3);
                    aym.v((kt91) yxb0Var.d, new z77(yxb0Var, kn9Var, (byte) 16));
                } else {
                    rm9Var.k(str6, kn9Var.f, str7, "byom-scroll-card", kn9Var.a, tv80Var3);
                }
                return rih1Var;
            case 28:
                f8n f8nVar = (f8n) obj;
                x340 x340Var13 = (b0k) obj2;
                int iIntValue8 = ((Number) obj3).intValue();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= x340Var13.e(f8nVar.ordinal()) ? 4 : 2;
                }
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    otw.c((tm) obj5, f8nVar, (qim0) null, (ipb1) null, x340Var14, 8 | ((iIntValue8 << 3) & 112), 12);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            default:
                return ((sas) ((bs0) obj5).b).i((q3a) obj3, ((t3a) obj2).a);
        }
    }
}
