package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.concertcampaignview.v1.CtaType;
import com.spotify.mobius.functions.Consumer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qw1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 5;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw1(cce cceVar, o0i o0iVar, xhl xhlVar, ihl ihlVar, ihl ihlVar2, tob1 tob1Var, boolean z, ven0 ven0Var, ven0 ven0Var2) {
        super(2);
        this.f = cceVar;
        this.g = o0iVar;
        this.h = xhlVar;
        this.i = ihlVar;
        this.c = ihlVar2;
        this.e = tob1Var;
        this.b = z;
        this.d = ven0Var;
        this.t = ven0Var2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        String strK;
        byte b;
        xu30 xu30Var;
        k9 k9Var;
        boolean z;
        Object objP0;
        boolean z2;
        Object objP1;
        boolean z3;
        Object objP2;
        byte b2 = this.a;
        nim0 nim0Var = nim0.a;
        boolean z4 = this.b;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.t;
        Object obj4 = this.d;
        Object obj5 = this.i;
        Object obj6 = this.h;
        Object obj7 = this.g;
        Object obj8 = this.f;
        Object obj9 = this.c;
        Object obj10 = this.e;
        switch (b2) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                n9p1.a((fu1) obj8, (dx1) obj7, (ow1) obj6, (Function0) obj5, (iu30) obj9, (j2i) obj10, (qim0) obj4, this.b, (Integer) obj3, (b0k) obj, czo1.p(196609));
                return rih1Var;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    wro1.i(this.b, (iu30) obj9, (hdx) obj8, (qim0) obj4, (hdx) obj7, (max) obj6, (gdx) obj5, (zzq0) obj3, false, null, null, apo.r(237346644, new pu2((j2i) obj10, (byte) 5), x340Var2), x340Var2, 100663296, 1536);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                fqo1.b((d4f) obj8, this.b, (Function0) obj5, (Function0) obj7, (Function0) obj6, (qim0) obj4, (Function0) obj9, (String) obj10, (String) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                hso1.l((jld0) obj8, this.b, (String) obj7, (String) obj6, (j2i) obj10, (j2i) obj5, (j2i) obj9, (j2i) obj4, (j2i) obj3, (b0k) obj, czo1.p(115040257));
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                ((txj) obj8).b((String) obj7, (hwq) obj6, (String) obj5, (String) obj9, this.b, (tob1) obj10, (r6h1) obj4, (w061) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                cso1.c((String) obj8, (Function0) obj5, this.b, (s4o) obj7, (c380) obj6, (j2i) obj10, (bxn) obj4, (iu30) obj9, (ubc) obj3, (b0k) obj, czo1.p(229377));
                return rih1Var;
            case 6:
                iac0 iac0Var = (iac0) obj2;
                tzr0 tzr0Var = (tzr0) obj8;
                return l6o1.A(new jpg0(new w2s((kwn) obj7, new cb8(z4, (tzo) obj3, (byte) 9), new c4z(2, new mar((z3v0) tzr0Var.b, (wr00) tzr0Var.c, (yh2) tzr0Var.d, (y5v0) tzr0Var.e, iac0Var), mar.class, "playbackAuthorisation", "playbackAuthorisation(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 1), new v8z((dvn) obj6), (q8n) obj5, (q8n) obj10, (zob1) ((iu30) obj9).invoke(iac0Var), (vb2) obj4), new w8z((ymd0) obj, (byte) 0)));
            case 7:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                yqg yqgVar = (yqg) obj7;
                iu30 iu30Var = (iu30) obj9;
                m4c m4cVar = fkj0.X;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    int i = ((tna0) obj8).b;
                    boolean z5 = i != 3;
                    int iC = l1d.C(i);
                    if (iC == 0) {
                        strK = x0d.k(x340Var4, -676379692, 2131959810, x340Var4, false);
                    } else if (iC == 1) {
                        strK = x0d.k(x340Var4, -676375789, 2131959809, x340Var4, false);
                    } else {
                        if (iC != 2) {
                            throw p3d1.k(x340Var4, -676381608, false);
                        }
                        x340Var4.i0(507292762);
                        x340Var4.r(false);
                        strK = "";
                    }
                    qim0 qim0VarN = anm1.N("kallax_row", u291.f(nim0Var, 1.0f));
                    boolean zH = x340Var4.h(z5) | x340Var4.g(strK);
                    Object objT = x340Var4.T();
                    if (zH || objT == m4cVar) {
                        objT = new cl1(z5, strK, (byte) 20);
                        x340Var4.s0(objT);
                    }
                    qim0 qim0VarThen = qim0VarN.then(s161.b(nim0Var, false, (iu30) objT));
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var4).b;
                    cvx cvxVar2 = cbx.b(x340Var4).b;
                    cvx cvxVar3 = cbx.b(x340Var4).b;
                    zzq0 zzq0Var = new zzq0(16.0f, 8.0f, 0.0f, 8.0f);
                    tvx tvxVarB = gto1.B(1, x340Var4, 3);
                    cvx cvxVar4 = cbx.b(x340Var4).b;
                    tvx tvxVarA = tvx.a(tvxVarB, 2.0f, 6);
                    zov0 zov0Var = cbx.b(x340Var4).g;
                    uvx uvxVar = new uvx(1, (pgx) null, 3, zzq0Var, (zzq0) null, tvxVarA, (hw61) null, 0, new p3v(48.0f), 210);
                    boolean zG = x340Var4.g(iu30Var) | x340Var4.g(yqgVar);
                    Object objT2 = x340Var4.T();
                    if (zG || objT2 == m4cVar) {
                        objT2 = new sn8(iu30Var, yqgVar, (byte) 5);
                        x340Var4.s0(objT2);
                    }
                    Function0 function0 = (Function0) objT2;
                    if (ihc1.y0("Kallax row")) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    gbx gbxVar = new gbx(new y50("Kallax row"), function0);
                    if (z4) {
                        x340Var4.i0(-676328784);
                        xu30 xu30VarR = apo.r(-1467740489, new cn20((ta51) obj6, (byte) 1), x340Var4);
                        b = 0;
                        x340Var4.r(false);
                        xu30Var = xu30VarR;
                    } else {
                        b = 0;
                        x340Var4.i0(508693529);
                        x340Var4.r(false);
                        xu30Var = null;
                    }
                    jto1.b(qim0VarThen, uvxVar, jax.a, false, null, null, gbxVar, null, null, apo.r(1743261997, new una0((pa51) obj5, b), x340Var4), null, xu30Var, apo.r(477772395, new h6a0((xho) obj10, (sna0) obj4, (byte) 1), x340Var4), null, null, apo.r(-198585080, new vna0((va51) obj3, b), x340Var4), x340Var4, 805306816, 196992, 26040);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 8:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                j701 j701Var = (j701) obj10;
                edl1 edl1Var = (edl1) obj9;
                fza fzaVar = (fza) obj5;
                uhl uhlVar = (xhl) obj7;
                m4c m4cVar2 = fkj0.X;
                if ((iIntValue3 & 11) == 2) {
                    x340 x340Var6 = x340Var5;
                    if (x340Var6.H()) {
                        x340Var6.b0();
                        return rih1Var;
                    }
                }
                ((ven0) obj8).setValue(rih1Var);
                int i2 = uhlVar.b;
                uhlVar.m();
                x340 x340Var7 = x340Var5;
                x340Var7.i0(-1575097540);
                xhl xhlVar = (xhl) uhlVar.l().b;
                ihl ihlVarK = xhlVar.k();
                ihl ihlVarK2 = xhlVar.k();
                ihl ihlVarK3 = xhlVar.k();
                shl shlVarE = uhlVar.e();
                bjg1 bjg1VarY = bno1.y(Boolean.valueOf(z4), "", x340Var7, 48, 0);
                k9 k9Var2 = ((mhg1) bjg1VarY).a;
                if (bjg1VarY.g()) {
                    i2 = i2;
                    k9Var = k9Var2;
                    z = false;
                    x340Var7.i0(1666827533);
                    x340Var7.r(false);
                    objP0 = k9Var.P0();
                } else {
                    x340Var7.i0(1666573488);
                    boolean zG2 = x340Var7.g(bjg1VarY);
                    objP0 = x340Var7.T();
                    if (zG2 || objP0 == m4cVar2) {
                        jv91 jv91VarO = ekb.o();
                        iu30 iu30VarE = jv91VarO != null ? jv91VarO.e() : null;
                        k9Var = k9Var2;
                        jv91 jv91VarU = ekb.u(jv91VarO);
                        try {
                            Object objP3 = k9Var.P0();
                            ekb.C(jv91VarO, jv91VarU, iu30VarE);
                            x340Var7.s0(objP3);
                            objP0 = objP3;
                        } catch (Throwable th) {
                            ekb.C(jv91VarO, jv91VarU, iu30VarE);
                            throw th;
                        }
                    } else {
                        k9Var = k9Var2;
                    }
                    z = false;
                    x340Var7.r(false);
                }
                boolean zBooleanValue = ((Boolean) objP0).booleanValue();
                x340Var7.i0(-452692412);
                float f = zBooleanValue ? 0.9f : 1.0f;
                x340Var7.r(z);
                Float fValueOf = Float.valueOf(f);
                boolean zG3 = x340Var7.g(bjg1VarY);
                Object objT3 = x340Var7.T();
                if (zG3 || objT3 == m4cVar2) {
                    objT3 = yv91.a(new ro20(bjg1VarY, (byte) 1));
                    x340Var7.s0(objT3);
                }
                boolean zBooleanValue2 = ((Boolean) ((tob1) objT3).getValue()).booleanValue();
                x340Var7.i0(-452692412);
                float f2 = zBooleanValue2 ? 0.9f : 1.0f;
                x340Var7.r(false);
                Float fValueOf2 = Float.valueOf(f2);
                boolean zG4 = x340Var7.g(bjg1VarY);
                Object objT4 = x340Var7.T();
                if (zG4 || objT4 == m4cVar2) {
                    objT4 = yv91.a(new ro20(bjg1VarY, (byte) 2));
                    x340Var7.s0(objT4);
                }
                x340Var7.i0(32023369);
                pxg1 pxg1VarO0 = irn1.o0(CtaType.CTA_CANT_ATTEND_FIELD_NUMBER, 0, new ceo(0.4f, 0.0f, 0.6f, 1.0f), 2);
                x340Var7.r(false);
                tzg1 tzg1Var = rno1.a;
                fhg1 fhg1VarO = bno1.o(bjg1VarY, fValueOf, fValueOf2, pxg1VarO0, tzg1Var, x340Var7, 196608);
                if (bjg1VarY.g()) {
                    uhlVar = uhlVar;
                    z2 = false;
                    x340Var7.i0(1666827533);
                    x340Var7.r(false);
                    objP1 = k9Var.P0();
                } else {
                    x340Var7.i0(1666573488);
                    boolean zG5 = x340Var7.g(bjg1VarY);
                    objP1 = x340Var7.T();
                    if (zG5 || objP1 == m4cVar2) {
                        jv91 jv91VarO2 = ekb.o();
                        iu30 iu30VarE2 = jv91VarO2 != null ? jv91VarO2.e() : null;
                        jv91 jv91VarU2 = ekb.u(jv91VarO2);
                        try {
                            Object objP4 = k9Var.P0();
                            ekb.C(jv91VarO2, jv91VarU2, iu30VarE2);
                            x340Var7.s0(objP4);
                            objP1 = objP4;
                        } catch (Throwable th2) {
                            ekb.C(jv91VarO2, jv91VarU2, iu30VarE2);
                            throw th2;
                        }
                    }
                    z2 = false;
                    x340Var7.r(false);
                }
                boolean zBooleanValue3 = ((Boolean) objP1).booleanValue();
                x340Var7.i0(-513402467);
                float f3 = zBooleanValue3 ? 0.0f : 1.0f;
                x340Var7.r(z2);
                Float fValueOf3 = Float.valueOf(f3);
                boolean zG6 = x340Var7.g(bjg1VarY);
                Object objT5 = x340Var7.T();
                if (zG6 || objT5 == m4cVar2) {
                    objT5 = yv91.a(new ro20(bjg1VarY, (byte) 3));
                    x340Var7.s0(objT5);
                }
                boolean zBooleanValue4 = ((Boolean) ((tob1) objT5).getValue()).booleanValue();
                x340Var7.i0(-513402467);
                float f4 = zBooleanValue4 ? 0.0f : 1.0f;
                x340Var7.r(false);
                Float fValueOf4 = Float.valueOf(f4);
                boolean zG7 = x340Var7.g(bjg1VarY);
                Object objT6 = x340Var7.T();
                if (zG7 || objT6 == m4cVar2) {
                    objT6 = yv91.a(new ro20(bjg1VarY, (byte) 4));
                    x340Var7.s0(objT6);
                }
                x340Var7.i0(1294828642);
                pxg1 pxg1VarO1 = irn1.o0(CtaType.CTA_CANT_ATTEND_FIELD_NUMBER, 0, new ceo(0.4f, 0.0f, 0.6f, 1.0f), 2);
                x340Var7.r(false);
                fhg1 fhg1VarO2 = bno1.o(bjg1VarY, fValueOf3, fValueOf4, pxg1VarO1, tzg1Var, x340Var7, 196608);
                if (bjg1VarY.g()) {
                    ihlVarK2 = ihlVarK2;
                    z3 = false;
                    x340Var7.i0(1666827533);
                    x340Var7.r(false);
                    objP2 = k9Var.P0();
                } else {
                    x340Var7.i0(1666573488);
                    boolean zG8 = x340Var7.g(bjg1VarY);
                    objP2 = x340Var7.T();
                    if (zG8 || objP2 == m4cVar2) {
                        jv91 jv91VarO3 = ekb.o();
                        iu30 iu30VarE3 = jv91VarO3 != null ? jv91VarO3.e() : null;
                        jv91 jv91VarU3 = ekb.u(jv91VarO3);
                        try {
                            Object objP5 = k9Var.P0();
                            ekb.C(jv91VarO3, jv91VarU3, iu30VarE3);
                            x340Var7.s0(objP5);
                            objP2 = objP5;
                        } catch (Throwable th3) {
                            ekb.C(jv91VarO3, jv91VarU3, iu30VarE3);
                            throw th3;
                        }
                    }
                    z3 = false;
                    x340Var7.r(false);
                }
                boolean zBooleanValue5 = ((Boolean) objP2).booleanValue();
                x340Var7.i0(741849665);
                float f5 = zBooleanValue5 ? 1.0f : 0.0f;
                x340Var7.r(z3);
                Float fValueOf5 = Float.valueOf(f5);
                boolean zG9 = x340Var7.g(bjg1VarY);
                Object objT7 = x340Var7.T();
                if (zG9 || objT7 == m4cVar2) {
                    objT7 = yv91.a(new ro20(bjg1VarY, (byte) 5));
                    x340Var7.s0(objT7);
                }
                boolean zBooleanValue6 = ((Boolean) ((tob1) objT7).getValue()).booleanValue();
                x340Var7.i0(741849665);
                float f6 = zBooleanValue6 ? 1.0f : 0.0f;
                x340Var7.r(false);
                Float fValueOf6 = Float.valueOf(f6);
                boolean zG10 = x340Var7.g(bjg1VarY);
                Object objT8 = x340Var7.T();
                if (zG10 || objT8 == m4cVar2) {
                    objT8 = yv91.a(new ro20(bjg1VarY, (byte) 6));
                    x340Var7.s0(objT8);
                }
                x340Var7.i0(589090204);
                pxg1 pxg1Var = new pxg1(CtaType.CTA_CANT_ATTEND_FIELD_NUMBER, CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER, new ceo(0.4f, 0.0f, 0.6f, 1.0f));
                x340Var7.r(false);
                fhg1 fhg1VarO3 = bno1.o(bjg1VarY, fValueOf5, fValueOf6, pxg1Var, tzg1Var, x340Var7, 196608);
                boolean zG11 = x340Var7.g(ihlVarK);
                Object objT9 = x340Var7.T();
                if (zG11 || objT9 == m4cVar2) {
                    objT9 = new pu(ihlVarK, (byte) 24);
                    x340Var7.s0(objT9);
                }
                qim0 qim0VarJ = xhl.j(nim0Var, ihlVarK3, (iu30) objT9);
                boolean zG12 = x340Var7.g(fhg1VarO2);
                Object objT10 = x340Var7.T();
                if (zG12 || objT10 == m4cVar2) {
                    objT10 = new lws0(fhg1VarO2, (byte) 8);
                    x340Var7.s0(objT10);
                }
                qim0 qim0VarC = i541.C(qim0VarJ, (iu30) objT10);
                boolean zI = x340Var7.i(fzaVar);
                Object objT11 = x340Var7.T();
                if (zI || objT11 == m4cVar2) {
                    objT11 = new fbz0(fzaVar, (byte) 22);
                    x340Var7.s0(objT11);
                }
                iu30 iu30Var2 = (iu30) objT11;
                boolean zG13 = x340Var7.g(edl1Var);
                Object objT12 = x340Var7.T();
                if (zG13 || objT12 == m4cVar2) {
                    objT12 = new fbz0(edl1Var, (byte) 23);
                    x340Var7.s0(objT12);
                }
                dm5.a(iu30Var2, qim0VarC, (iu30) objT12, x340Var7, 0, 0);
                Uri uri = Uri.parse(j701Var.c.a);
                cbx.a.getClass();
                ecx ecxVarA = uwr.a();
                boolean zG14 = x340Var7.g(shlVarE);
                Object objT13 = x340Var7.T();
                if (zG14 || objT13 == m4cVar2) {
                    objT13 = new esy0(shlVarE, (byte) 1);
                    x340Var7.s0(objT13);
                }
                qim0 qim0VarQ = i1p1.q(uyn1.z(70.0f, 0.0f, 2, xhl.j(nim0Var, ihlVarK, (iu30) objT13)), er31.b(8.0f));
                boolean zG15 = x340Var7.g(fhg1VarO2) | x340Var7.g(fhg1VarO);
                Object objT14 = x340Var7.T();
                if (zG15 || objT14 == m4cVar2) {
                    objT14 = new dy(fhg1VarO2, fhg1VarO, (byte) 8);
                    x340Var7.s0(objT14);
                }
                eso1.e(uri, isl.a, i541.C(qim0VarQ, (iu30) objT14), (p3v) null, (zvx) null, ecxVarA, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var7, 27696, 0, 4032);
                Object objT15 = x340Var7.T();
                if (objT15 == m4cVar2) {
                    objT15 = k301.Q0;
                    x340Var7.s0(objT15);
                }
                qim0 qim0VarB = uyn1.B(xhl.j(nim0Var, ihlVarK2, (iu30) objT15), 16.0f, 0.0f, 64.0f, 0.0f, 10);
                boolean zG16 = x340Var7.g(fhg1VarO3);
                Object objT16 = x340Var7.T();
                if (zG16 || objT16 == m4cVar2) {
                    objT16 = new lws0(fhg1VarO3, (byte) 9);
                    x340Var7.s0(objT16);
                }
                w2g0.c(i541.C(qim0VarB, (iu30) objT16), (tl3) null, apo.r(-1427457154, new hho0((ezj) obj4, (mbl1) obj3, j701Var, (byte) 16), x340Var7), x340Var7, 3072, 6);
                x340Var7.r(false);
                if (uhlVar.b == i2) {
                    return rih1Var;
                }
                qxd0.S((su) obj6, x340Var7);
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                a8o.q((vnr0) obj8, (yk31) obj7, this.b, (String) obj6, (String) obj9, (dzo1) obj10, (kj31) obj3, (qim0) obj4, (Function0) obj5, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 10:
                x340 x340Var8 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var9 = x340Var8;
                if (x340Var9.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    mod.b(oi7.a.a((gw70) obj8), apo.r(1064629097, new q3((tob1) obj7, (n081) obj6, (Function0) obj5, (Function0) obj9, (xu30) obj10, this.b, (idn0) obj4, (tob1) obj3), x340Var9), x340Var9, 56);
                } else {
                    x340Var9.b0();
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ((Number) obj2).intValue();
                sok.e((dbp) obj8, (hcl1) obj7, (cce) obj6, (q9l1) obj5, (q9l1) obj9, (Consumer) obj10, this.b, (z0i) obj3, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                x340 x340Var10 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                tob1 tob1Var = (tob1) obj10;
                ihl ihlVar = (ihl) obj9;
                m4c m4cVar3 = fkj0.X;
                x340 x340Var11 = x340Var10;
                if (x340Var11.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    cce cceVar = (cce) obj8;
                    o0i o0iVar = (o0i) obj7;
                    xhl xhlVar2 = (xhl) obj6;
                    ihl ihlVar2 = (ihl) obj5;
                    boolean zG17 = x340Var11.g(ihlVar);
                    Object objT17 = x340Var11.T();
                    if (zG17 || objT17 == m4cVar3) {
                        objT17 = new nij1(ihlVar, (byte) 8);
                        x340Var11.s0(objT17);
                    }
                    xhlVar2.getClass();
                    qim0 qim0VarN2 = anm1.N("two_column_progress_bar_container", xhl.j(nim0Var, ihlVar2, (iu30) objT17));
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar5 = cbx.b(x340Var11).b;
                    qim0 qim0VarZ = uyn1.z(8.0f, 0.0f, 2, qim0VarN2);
                    mta mtaVar = cbx.b(x340Var11).d;
                    qim0 qim0VarH = u291.h(qim0VarZ, 32.0f);
                    boolean zG18 = x340Var11.g(tob1Var);
                    Object objT18 = x340Var11.T();
                    if (zG18 || objT18 == m4cVar3) {
                        objT18 = new eyg1(tob1Var, (byte) 13);
                        x340Var11.s0(objT18);
                    }
                    qim0 qim0VarI = zr7.i(i541.C(qim0VarH, (iu30) objT18), new aw1((byte) 8, z4 && !((Boolean) ((tob1) obj4).getValue()).booleanValue()));
                    ven0 ven0Var = (ven0) obj3;
                    Object objT19 = x340Var11.T();
                    if (objT19 == m4cVar3) {
                        objT19 = new i2g1(ven0Var, (byte) 25);
                        x340Var11.s0(objT19);
                    }
                    cceVar.a(56, o0iVar, kfx0.a, x340Var11, irn1.g0(qim0VarI, (iu30) objT19));
                } else {
                    x340Var11.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw1(fu1 fu1Var, dx1 dx1Var, ow1 ow1Var, Function0 function0, iu30 iu30Var, j2i j2iVar, qim0 qim0Var, boolean z, Integer num, int i) {
        super(2);
        this.f = fu1Var;
        this.g = dx1Var;
        this.h = ow1Var;
        this.i = function0;
        this.c = iu30Var;
        this.e = j2iVar;
        this.d = qim0Var;
        this.b = z;
        this.t = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw1(String str, Function0 function0, boolean z, s4o s4oVar, c380 c380Var, j2i j2iVar, bxn bxnVar, iu30 iu30Var, ubc ubcVar, int i) {
        super(2);
        this.f = str;
        this.i = function0;
        this.b = z;
        this.g = s4oVar;
        this.h = c380Var;
        this.e = j2iVar;
        this.d = bxnVar;
        this.c = iu30Var;
        this.t = ubcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw1(d4f d4fVar, boolean z, Function0 function0, Function0 function1, Function0 function2, qim0 qim0Var, Function0 function3, String str, String str2, int i) {
        super(2);
        this.f = d4fVar;
        this.b = z;
        this.i = function0;
        this.g = function1;
        this.h = function2;
        this.d = qim0Var;
        this.c = function3;
        this.e = str;
        this.t = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw1(txj txjVar, String str, hwq hwqVar, String str2, String str3, boolean z, tob1 tob1Var, r6h1 r6h1Var, w061 w061Var, int i) {
        super(2);
        this.f = txjVar;
        this.g = str;
        this.h = hwqVar;
        this.i = str2;
        this.c = str3;
        this.b = z;
        this.e = tob1Var;
        this.d = r6h1Var;
        this.t = w061Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw1(dbp dbpVar, hcl1 hcl1Var, cce cceVar, q9l1 q9l1Var, q9l1 q9l1Var2, Consumer consumer, boolean z, z0i z0iVar, qim0 qim0Var, int i) {
        super(2);
        this.f = dbpVar;
        this.g = hcl1Var;
        this.h = cceVar;
        this.i = q9l1Var;
        this.c = q9l1Var2;
        this.e = consumer;
        this.b = z;
        this.t = z0iVar;
        this.d = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw1(gw70 gw70Var, tob1 tob1Var, n081 n081Var, Function0 function0, Function0 function1, xu30 xu30Var, boolean z, idn0 idn0Var, tob1 tob1Var2) {
        super(2);
        this.f = gw70Var;
        this.g = tob1Var;
        this.h = n081Var;
        this.i = function0;
        this.c = function1;
        this.e = xu30Var;
        this.b = z;
        this.d = idn0Var;
        this.t = tob1Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw1(tna0 tna0Var, iu30 iu30Var, yqg yqgVar, boolean z, ta51 ta51Var, pa51 pa51Var, xho xhoVar, sna0 sna0Var, va51 va51Var) {
        super(2);
        this.f = tna0Var;
        this.c = iu30Var;
        this.g = yqgVar;
        this.b = z;
        this.h = ta51Var;
        this.i = pa51Var;
        this.e = xhoVar;
        this.d = sna0Var;
        this.t = va51Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw1(jld0 jld0Var, boolean z, String str, String str2, j2i j2iVar, j2i j2iVar2, j2i j2iVar3, j2i j2iVar4, j2i j2iVar5, int i) {
        super(2);
        this.f = jld0Var;
        this.b = z;
        this.g = str;
        this.h = str2;
        this.e = j2iVar;
        this.i = j2iVar2;
        this.c = j2iVar3;
        this.d = j2iVar4;
        this.t = j2iVar5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw1(ven0 ven0Var, xhl xhlVar, su suVar, boolean z, fza fzaVar, edl1 edl1Var, j701 j701Var, ezj ezjVar, mbl1 mbl1Var) {
        super(2);
        this.f = ven0Var;
        this.g = xhlVar;
        this.h = suVar;
        this.b = z;
        this.i = fzaVar;
        this.c = edl1Var;
        this.e = j701Var;
        this.d = ezjVar;
        this.t = mbl1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw1(vnr0 vnr0Var, yk31 yk31Var, boolean z, String str, String str2, dzo1 dzo1Var, kj31 kj31Var, qim0 qim0Var, Function0 function0, int i) {
        super(2);
        this.f = vnr0Var;
        this.g = yk31Var;
        this.b = z;
        this.h = str;
        this.c = str2;
        this.e = dzo1Var;
        this.t = kj31Var;
        this.d = qim0Var;
        this.i = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw1(tzr0 tzr0Var, kwn kwnVar, dvn dvnVar, q8n q8nVar, q8n q8nVar2, iu30 iu30Var, vb2 vb2Var, boolean z, tzo tzoVar) {
        super(2);
        this.f = tzr0Var;
        this.g = kwnVar;
        this.h = dvnVar;
        this.i = q8nVar;
        this.e = q8nVar2;
        this.c = iu30Var;
        this.d = vb2Var;
        this.b = z;
        this.t = tzoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw1(boolean z, iu30 iu30Var, hdx hdxVar, qim0 qim0Var, hdx hdxVar2, max maxVar, gdx gdxVar, zzq0 zzq0Var, j2i j2iVar) {
        super(2);
        this.b = z;
        this.c = iu30Var;
        this.f = hdxVar;
        this.d = qim0Var;
        this.g = hdxVar2;
        this.h = maxVar;
        this.i = gdxVar;
        this.t = zzq0Var;
        this.e = j2iVar;
    }
}
