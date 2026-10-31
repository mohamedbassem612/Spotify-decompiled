package p;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n1r0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n1r0(Object obj, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0332 A[PHI: r5
      0x0332: PHI (r5v18 int) = (r5v0 int), (r5v19 int) binds: [B:99:0x0323, B:102:0x0328] A[DONT_GENERATE, DONT_INLINE]] */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iV;
        byte b = this.a;
        int i = 2;
        nim0 nim0Var = nim0.a;
        int i2 = 1;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                View view = (View) obj;
                hsl1 hsl1Var = (hsl1) obj2;
                uc80 uc80Var = (uc80) obj3;
                esl1 esl1Var = hsl1Var.a;
                nk80 nk80VarI = esl1Var.i(519);
                nk80 nk80VarI2 = esl1Var.i(8);
                o1r0 o1r0Var = (o1r0) obj4;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, uc80Var.b + nk80VarI.b, marginLayoutParams.rightMargin, uc80Var.d + (o1r0Var.R0 ? nk80VarI2.d : 0));
                view.setLayoutParams(marginLayoutParams);
                return hsl1Var;
            case 1:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                sgc1.G(b0kVar).c("key", apo.r(1778099347, new jyo0((p8r0) obj4, (hx60) obj, (byte) 20), b0kVar), b0kVar, 54);
                return rih1Var;
            case 2:
                return ((hcr0) obj4).Z0((iac0) obj, (bbr0) obj2, (Function0) obj3);
            case 3:
                qim0 qim0Var = (qim0) obj;
                ((Number) obj3).intValue();
                jkr0 jkr0Var = (jkr0) obj4;
                x340 x340Var = (b0k) obj2;
                x340Var.i0(-2106136430);
                Object objT = x340Var.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = us71.i(0.0f, x340Var);
                }
                drr0 drr0Var = (drr0) objT;
                Boolean boolValueOf = Boolean.valueOf(jkr0Var.k.b());
                boolean zI = x340Var.i(jkr0Var) | x340Var.i(drr0Var);
                Object objT2 = x340Var.T();
                byte b2 = 22;
                if (zI || objT2 == m4cVar) {
                    objT2 = new cto0(jkr0Var, drr0Var, (lnm) null, (byte) 22);
                    x340Var.s0(objT2);
                }
                qxd0.t(boolValueOf, x340Var, (vu30) objT2);
                tob1 tob1VarB = z95.b(drr0Var.s(), irn1.o0(300, 0, (dlv) null, 6), (String) null, (iu30) null, x340Var, 0, 28);
                boolean zI2 = x340Var.i(tob1VarB) | x340Var.i(jkr0Var);
                Object objT3 = x340Var.T();
                if (zI2 || objT3 == m4cVar) {
                    objT3 = new ozp0(jkr0Var, tob1VarB, b2);
                    x340Var.s0(objT3);
                }
                qim0 qim0VarS = exd0.s(qim0Var, (iu30) objT3);
                x340Var.r(false);
                return qim0VarS;
            case 4:
                tqw tqwVar = (tqw) obj3;
                if (((esr0) obj2).equals(esr0.a)) {
                    hqn1.q(((na9) obj4).b, nik1.X6.a, tqwVar, (Bundle) null);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 5:
                rsr0 rsr0Var = (rsr0) obj;
                int iIntValue = ((Number) obj3).intValue();
                m4c m4cVar2 = fkj0.X;
                nsr0 nsr0Var = (nsr0) obj4;
                x340 x340Var2 = (b0k) obj2;
                boolean zI3 = x340Var2.i(nsr0Var);
                Object objT4 = x340Var2.T();
                if (zI3 || objT4 == m4cVar2) {
                    objT4 = new lsr0(nsr0Var, (byte) 0);
                    x340Var2.s0(objT4);
                }
                Function0 function0 = (Function0) objT4;
                boolean zI4 = x340Var2.i(nsr0Var);
                Object objT5 = x340Var2.T();
                if (zI4 || objT5 == m4cVar2) {
                    objT5 = new lsr0(nsr0Var, (byte) 1);
                    x340Var2.s0(objT5);
                }
                Function0 function1 = (Function0) objT5;
                boolean zI5 = x340Var2.i(nsr0Var);
                Object objT6 = x340Var2.T();
                if (zI5 || objT6 == m4cVar2) {
                    objT6 = new lsr0(nsr0Var, (byte) 2);
                    x340Var2.s0(objT6);
                }
                zho1.n(rsr0Var, function0, function1, (Function0) objT6, nsr0Var.g, (qim0) null, x340Var2, iIntValue & 14);
                return rih1Var;
            case 6:
                nwr0 nwr0Var = (nwr0) obj2;
                tqw tqwVar2 = (tqw) obj3;
                if ((nwr0Var instanceof nwr0) && tqwVar2 != null) {
                    ((owr0) obj4).a.invoke(new vat0(nwr0Var.a, n3o1.y(tqwVar2)));
                }
                return rih1Var;
            case 7:
                wwr0 wwr0Var = (wwr0) obj;
                if (((vwr0) obj2).equals(vwr0.a)) {
                    ((k2g0) obj4).invoke(wwr0Var.a, Boolean.valueOf(!wwr0Var.b));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 8:
                axr0 axr0Var = (axr0) obj;
                if (((zwr0) obj2).equals(zwr0.a)) {
                    ((k2g0) obj4).invoke(axr0Var.a, Boolean.valueOf(!axr0Var.b));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 9:
                pxr0 pxr0Var = (pxr0) obj;
                tqw tqwVar3 = (tqw) obj3;
                lzn0 lzn0Var = ((md1) obj4).b;
                if (!((oxr0) obj2).equals(oxr0.a)) {
                    eg.o();
                    return null;
                }
                String strF = md1.f(pxr0Var);
                if (tqwVar3 != null) {
                    lzn0Var.a(strF, n3o1.y(tqwVar3), (Bundle) null);
                } else {
                    lzn0Var.h(strF);
                }
                return rih1Var;
            case 10:
                lyr0 lyr0Var = (lyr0) obj;
                tqw tqwVar4 = (tqw) obj3;
                nyr0 nyr0Var = (nyr0) obj4;
                String str = lyr0Var.a;
                if (!((jyr0) obj2).equals(jyr0.a)) {
                    eg.o();
                    return null;
                }
                String str2 = lyr0Var.b;
                lzn0 lzn0Var2 = nyr0Var.a;
                String str3 = cfm0.i("spotify:account-management:member-details:", str2, nik1.h0).a;
                Bundle bundle = new Bundle();
                if (str3 != null) {
                    bundle.putString("overriddenReturnToUri", str3);
                }
                if (tqwVar4 != null) {
                    lzn0Var2.a(nyr0.e(str), n3o1.y(tqwVar4), bundle);
                } else {
                    lzn0Var2.g(bundle, nyr0.e(str));
                }
                return rih1Var;
            case 11:
                tqw tqwVar5 = (tqw) obj3;
                oyr0 oyr0Var = (oyr0) obj4;
                String strE = oyr0.e((myr0) obj);
                tv80 tv80VarY = tqwVar5 != null ? n3o1.y(tqwVar5) : null;
                lzn0 lzn0Var3 = oyr0Var.a;
                if (tv80VarY != null) {
                    lzn0Var3.a(strE, tv80VarY, (Bundle) null);
                } else {
                    lzn0Var3.h(strE);
                }
                return rih1Var;
            case 12:
                ((Number) obj3).intValue();
                bno1.e((zmo1) obj4, (qim0) null, (b0k) obj2, 0);
                return rih1Var;
            case 13:
                ((Number) obj3).intValue();
                kno1.a((e7s0) obj4, (b0k) obj2, 0);
                return rih1Var;
            case 14:
                wat0 wat0Var = (ebt0) obj2;
                tqw tqwVar6 = (tqw) obj3;
                if (wat0Var instanceof wat0) {
                    iu30 iu30Var = ((yas0) obj4).a;
                    if (tqwVar6 != null) {
                        iu30Var.invoke(new wat0(wat0Var.a, n3o1.y(tqwVar6)));
                    } else {
                        iu30Var.invoke(wat0Var);
                    }
                }
                return rih1Var;
            case 15:
                kfs0 kfs0Var = (kfs0) obj;
                tqw tqwVar7 = (tqw) obj3;
                lfs0 lfs0Var = (lfs0) obj4;
                if (((jfs0) obj2).equals(jfs0.a)) {
                    lfs0Var.a.a(nik1.a6.b("spotify:internal:managed-account-allowlisting-requests:child:".concat(kfs0Var.a)).a, cvl1.d(tqwVar7), (Bundle) null);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 16:
                mgs0 mgs0Var = (mgs0) obj;
                vu60 vu60Var = (vu60) ((ngs0) obj4).d;
                vr60 vr60Var = mgs0Var.f;
                j16 j16Var = mgs0Var.e;
                String str4 = mgs0Var.d;
                int iOrdinal = ((lgs0) obj2).ordinal();
                if (iOrdinal == 0) {
                    vu60Var.b.accept(new vt60(str4, j16Var, vr60Var));
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    vu60Var.b.accept(new nu60(str4, j16Var, vr60Var));
                }
                return rih1Var;
            case 17:
                vms0 vms0Var = (vms0) obj;
                yxb0 yxb0Var = (yxb0) obj4;
                svh0 svh0Var = (svh0) yxb0Var.f;
                int iOrdinal2 = ((ums0) obj2).ordinal();
                if (iOrdinal2 == 0) {
                    pp90 pp90Var = (pp90) ((c9c0) yxb0Var.e).b.current().getValue();
                    if (pp90Var != null) {
                        String str5 = pp90Var.a;
                        vu60 vu60Var2 = (vu60) yxb0Var.c;
                        int iOrdinal3 = vms0Var.b.ordinal();
                        if (iOrdinal3 == 0) {
                            i = i2;
                        } else if (iOrdinal3 != 1) {
                            i2 = 3;
                            if (iOrdinal3 == 2) {
                                i = i2;
                            } else {
                                if (iOrdinal3 != 3) {
                                    eg.o();
                                    return null;
                                }
                                i = 4;
                            }
                        }
                        vu60Var2.b.accept(new bu60(str5, i));
                    }
                    svh0Var.i();
                } else if (iOrdinal2 == 1) {
                    ((up90) yxb0Var.d).a(hr90.P0, true);
                    svh0Var.i();
                } else if (iOrdinal2 != 2) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                ((sus0) ((ngs0) obj4).d).invoke((xus0) obj2);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                Boolean bool = (Boolean) obj2;
                boolean zBooleanValue = bool.booleanValue();
                hma1 hma1VarEdit = ((gvs0) ((qkn0) obj4).b).b.edit();
                hma1VarEdit.a(hvs0.a, zBooleanValue);
                hma1VarEdit.h();
                return new it61(bool);
            case 20:
                vvs0 vvs0Var = (vvs0) obj2;
                xvs0 xvs0Var = (xvs0) obj4;
                if (vvs0Var instanceof tvs0) {
                    xvs0Var.a.invoke(((tvs0) vvs0Var).a);
                } else if (vvs0Var instanceof uvs0) {
                    uvs0 uvs0Var = (uvs0) vvs0Var;
                    xvs0Var.b.invoke(Integer.valueOf(uvs0Var.a), uvs0Var.b);
                } else {
                    if (!vvs0Var.equals(svs0.a)) {
                        eg.o();
                        return null;
                    }
                    xvs0Var.c.invoke();
                }
                return rih1Var;
            case 21:
                ((Number) obj3).intValue();
                ows0.d(((qpl) obj4).h, er31.a, ows0.f, d7e.r(1.0f, u291.f(nim0Var, 1.0f), false), (b0k) obj2, 512);
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                jxs0 jxs0Var = (jxs0) obj3;
                if ((jxs0Var instanceof ixs0) || (jxs0Var instanceof hxs0)) {
                    iV = qpb0.b;
                } else {
                    if (!(jxs0Var instanceof gxs0)) {
                        eg.o();
                        return null;
                    }
                    boolean z = ((gxs0) jxs0Var).c instanceof w4a;
                    fws0 fws0Var = (fws0) obj4;
                    int i3 = fws0Var.b;
                    int i4 = fws0Var.c;
                    iV = z ? ((i3 / buo1.v(i3, i4)) * i4) / i3 : ((i3 / buo1.v(i3, i4)) * i4) / i4;
                }
                return new bg50(blo1.c(iV));
            case 23:
                Boolean bool2 = (Boolean) obj2;
                boolean zBooleanValue2 = bool2.booleanValue();
                hma1 hma1VarEdit2 = ((g3t0) ((sjq0) obj4).b).a.a(((km61) obj).a.a).edit();
                hma1VarEdit2.a(g3t0.c, zBooleanValue2);
                hma1VarEdit2.h();
                return new it61(bool2);
            case 24:
                b4t0 b4t0Var = (b4t0) obj4;
                return o7r0.c(b4t0Var.g, b4t0Var.t.d(), (iac0) obj, (bbr0) obj2, (Function0) obj3, (String) null, (fkk1) null, 112);
            case 25:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                x4t0 x4t0Var = (x4t0) obj4;
                vl7.a(x4t0Var.d, apo.r(181969634, new hws0((w4t0) obj, x4t0Var, (byte) 4), b0kVar2), b0kVar2, 48);
                return rih1Var;
            case 26:
                qim0 qim0Var2 = (qim0) obj;
                ((Number) obj3).intValue();
                fe5 fe5Var = (fe5) obj4;
                x340 x340Var3 = (b0k) obj2;
                x340Var3.i0(-1066403975);
                Object objT7 = x340Var3.T();
                m4c m4cVar3 = fkj0.X;
                if (objT7 == m4cVar3) {
                    objT7 = qxd0.M(o6x.a, x340Var3);
                    x340Var3.s0(objT7);
                }
                c9n c9nVar = (c9n) objT7;
                Object objT8 = x340Var3.T();
                if (objT8 == m4cVar3) {
                    objT8 = v8r.q(new qr80(0L));
                    x340Var3.s0(objT8);
                }
                ven0 ven0Var = (ven0) objT8;
                Object objT9 = x340Var3.T();
                if (objT9 == m4cVar3) {
                    objT9 = v8r.q((Object) null);
                    x340Var3.s0(objT9);
                }
                ven0 ven0Var2 = (ven0) objT9;
                boolean z2 = x340Var3.k(t4k.n) == flb0.b;
                boolean zH = x340Var3.h(z2);
                Object objT10 = x340Var3.T();
                if (zH || objT10 == m4cVar3) {
                    objT10 = new mlf0(z2, ven0Var, (byte) 1);
                    x340Var3.s0(objT10);
                }
                qim0 qim0VarG0 = irn1.g0(qim0Var2, (iu30) objT10);
                boolean zI6 = x340Var3.i(c9nVar) | x340Var3.i(fe5Var);
                Object objT11 = x340Var3.T();
                if (zI6 || objT11 == m4cVar3) {
                    ntf0 ntf0Var = new ntf0(c9nVar, ven0Var2, ven0Var, fe5Var, (byte) 25);
                    x340Var3.s0(ntf0Var);
                    objT11 = ntf0Var;
                }
                qim0 qim0VarB = eqr0.B(qim0VarG0, (iu30) objT11);
                x340Var3.r(false);
                return qim0VarB;
            case 27:
                f7t0 f7t0Var = (f7t0) obj;
                j7t0 j7t0Var = (m7t0) obj2;
                iu30 iu30Var2 = ((h7t0) obj4).a;
                boolean z3 = f7t0Var.c;
                int i5 = f7t0Var.b;
                if (j7t0Var instanceof k7t0) {
                    iu30Var2.invoke(new p99(i5, z3));
                } else if (!(j7t0Var instanceof l7t0)) {
                    if (!(j7t0Var instanceof j7t0)) {
                        eg.o();
                        return null;
                    }
                    iu30Var2.invoke(new o99(j7t0Var.a, i5, z3));
                }
                return rih1Var;
            case 28:
                if (((kft0) obj2).equals(kft0.a)) {
                    ((wet0) obj4).b.invoke();
                    return rih1Var;
                }
                eg.o();
                return null;
            default:
                ((Number) obj3).intValue();
                m0t m0tVar = (m0t) obj4;
                x340 x340Var4 = (b0k) obj2;
                boolean zI7 = x340Var4.i(m0tVar);
                Object objT12 = x340Var4.T();
                if (zI7 || objT12 == fkj0.X) {
                    objT12 = new kks0(m0tVar, (byte) 11);
                    x340Var4.s0(objT12);
                }
                wro1.h(new gbx(z50.c, (Function0) objT12), new idx(18), u291.r(nim0Var, 64.0f), (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, k8j.a, x340Var4, 0, 6, 1016);
                return rih1Var;
        }
    }
}
