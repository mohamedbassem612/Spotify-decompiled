package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.concertcampaignview.v1.CtaType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qpf extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qpf(boolean z, boolean z2, byte b) {
        super(3);
        this.a = b;
        this.b = z;
        this.c = z2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object objP0;
        Object objP1;
        Object objP2;
        float f;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.c;
        boolean z2 = this.b;
        boolean z3 = true;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ouo1.x(z2 ? 120.0f : 152.0f, 12.0f, 48, x340Var2, z);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ouo1.x(z2 ? 176.0f : 216.0f, 14.0f, 48, x340Var4, z);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                qim0 qim0Var = (qim0) obj;
                ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var5 = (b0k) obj2;
                x340Var5.i0(101691926);
                x340Var5.i0(-1058305801);
                jmr0 jmr0VarN = i3o1.n(2131233076, x340Var5, 0);
                x340Var5.r(false);
                pxg1 pxg1VarO0 = z2 ? irn1.o0(CtaType.BUY_TICKETS_FIELD_NUMBER, 0, klv.c, 2) : irn1.o0(0, 0, null, 6);
                bjg1 bjg1VarY = bno1.y(Boolean.valueOf(z), "FlareOverlayTransition", x340Var5, 48, 0);
                k9 k9Var = ((mhg1) bjg1VarY).a;
                qo20 qo20Var = new qo20(pxg1VarO0, (byte) 0);
                if (bjg1VarY.g()) {
                    x340Var5.i0(1666827533);
                    x340Var5.r(false);
                    objP0 = k9Var.P0();
                } else {
                    x340Var5.i0(1666573488);
                    boolean zG = x340Var5.g(bjg1VarY);
                    objP0 = x340Var5.T();
                    if (zG || objP0 == m4cVar) {
                        jv91 jv91VarO = ekb.o();
                        iu30 iu30VarE = jv91VarO != null ? jv91VarO.e() : null;
                        jv91 jv91VarU = ekb.u(jv91VarO);
                        try {
                            Object objP3 = k9Var.P0();
                            ekb.C(jv91VarO, jv91VarU, iu30VarE);
                            x340Var5.s0(objP3);
                            objP0 = objP3;
                        } catch (Throwable th) {
                            ekb.C(jv91VarO, jv91VarU, iu30VarE);
                            throw th;
                        }
                    }
                    x340Var5.r(false);
                }
                boolean zBooleanValue = ((Boolean) objP0).booleanValue();
                x340Var5.i0(-2093711130);
                float f2 = zBooleanValue ? 1.0f : 0.0f;
                x340Var5.r(false);
                Float fValueOf = Float.valueOf(f2);
                boolean zG2 = x340Var5.g(bjg1VarY);
                Object objT = x340Var5.T();
                if (zG2 || objT == m4cVar) {
                    objT = yv91.a(new dck(bjg1VarY, (byte) 25));
                    x340Var5.s0(objT);
                }
                boolean zBooleanValue2 = ((Boolean) ((tob1) objT).getValue()).booleanValue();
                x340Var5.i0(-2093711130);
                float f3 = zBooleanValue2 ? 1.0f : 0.0f;
                x340Var5.r(false);
                Float fValueOf2 = Float.valueOf(f3);
                boolean zG3 = x340Var5.g(bjg1VarY);
                Object objT2 = x340Var5.T();
                if (zG3 || objT2 == m4cVar) {
                    objT2 = yv91.a(new dck(bjg1VarY, (byte) 26));
                    x340Var5.s0(objT2);
                }
                ni20 ni20Var = (ni20) qo20Var.invoke(((tob1) objT2).getValue(), x340Var5, 0);
                tzg1 tzg1Var = rno1.a;
                fhg1 fhg1VarO = bno1.o(bjg1VarY, fValueOf, fValueOf2, ni20Var, tzg1Var, x340Var5, 196608);
                qo20 qo20Var2 = new qo20(pxg1VarO0, (byte) 2);
                if (bjg1VarY.g()) {
                    x340Var5.i0(1666827533);
                    x340Var5.r(false);
                    objP1 = k9Var.P0();
                } else {
                    x340Var5.i0(1666573488);
                    boolean zG4 = x340Var5.g(bjg1VarY);
                    objP1 = x340Var5.T();
                    if (zG4 || objP1 == m4cVar) {
                        jv91 jv91VarO2 = ekb.o();
                        iu30 iu30VarE2 = jv91VarO2 != null ? jv91VarO2.e() : null;
                        jv91 jv91VarU2 = ekb.u(jv91VarO2);
                        try {
                            Object objP4 = k9Var.P0();
                            ekb.C(jv91VarO2, jv91VarU2, iu30VarE2);
                            x340Var5.s0(objP4);
                            objP1 = objP4;
                        } catch (Throwable th2) {
                            ekb.C(jv91VarO2, jv91VarU2, iu30VarE2);
                            throw th2;
                        }
                    }
                    x340Var5.r(false);
                }
                boolean zBooleanValue3 = ((Boolean) objP1).booleanValue();
                x340Var5.i0(-778364294);
                float f4 = zBooleanValue3 ? 1.0f : 0.8f;
                x340Var5.r(false);
                Float fValueOf3 = Float.valueOf(f4);
                boolean zG5 = x340Var5.g(bjg1VarY);
                Object objT3 = x340Var5.T();
                if (zG5 || objT3 == m4cVar) {
                    objT3 = yv91.a(new dck(bjg1VarY, (byte) 27));
                    x340Var5.s0(objT3);
                }
                boolean zBooleanValue4 = ((Boolean) ((tob1) objT3).getValue()).booleanValue();
                x340Var5.i0(-778364294);
                float f5 = zBooleanValue4 ? 1.0f : 0.8f;
                x340Var5.r(false);
                Float fValueOf4 = Float.valueOf(f5);
                boolean zG6 = x340Var5.g(bjg1VarY);
                Object objT4 = x340Var5.T();
                if (zG6 || objT4 == m4cVar) {
                    objT4 = yv91.a(new dck(bjg1VarY, (byte) 28));
                    x340Var5.s0(objT4);
                }
                fhg1 fhg1VarO2 = bno1.o(bjg1VarY, fValueOf3, fValueOf4, (ni20) qo20Var2.invoke(((tob1) objT4).getValue(), x340Var5, 0), tzg1Var, x340Var5, 196608);
                qo20 qo20Var3 = new qo20(pxg1VarO0, (byte) 1);
                if (bjg1VarY.g()) {
                    x340Var5.i0(1666827533);
                    x340Var5.r(false);
                    objP2 = k9Var.P0();
                } else {
                    x340Var5.i0(1666573488);
                    boolean zG7 = x340Var5.g(bjg1VarY);
                    objP2 = x340Var5.T();
                    if (zG7 || objP2 == m4cVar) {
                        jv91 jv91VarO3 = ekb.o();
                        iu30 iu30VarE3 = jv91VarO3 != null ? jv91VarO3.e() : null;
                        jv91 jv91VarU3 = ekb.u(jv91VarO3);
                        try {
                            Object objP5 = k9Var.P0();
                            ekb.C(jv91VarO3, jv91VarU3, iu30VarE3);
                            x340Var5.s0(objP5);
                            objP2 = objP5;
                        } catch (Throwable th3) {
                            ekb.C(jv91VarO3, jv91VarU3, iu30VarE3);
                            throw th3;
                        }
                    }
                    x340Var5.r(false);
                }
                boolean zBooleanValue5 = ((Boolean) objP2).booleanValue();
                x340Var5.i0(-1027239597);
                float f6 = zBooleanValue5 ? 1.0f : 0.0f;
                x340Var5.r(false);
                Float fValueOf5 = Float.valueOf(f6);
                boolean zG8 = x340Var5.g(bjg1VarY);
                Object objT5 = x340Var5.T();
                if (zG8 || objT5 == m4cVar) {
                    objT5 = yv91.a(new dck(bjg1VarY, (byte) 29));
                    x340Var5.s0(objT5);
                }
                boolean zBooleanValue6 = ((Boolean) ((tob1) objT5).getValue()).booleanValue();
                x340Var5.i0(-1027239597);
                float f7 = zBooleanValue6 ? 1.0f : 0.0f;
                x340Var5.r(false);
                Float fValueOf6 = Float.valueOf(f7);
                boolean zG9 = x340Var5.g(bjg1VarY);
                Object objT6 = x340Var5.T();
                if (zG9 || objT6 == m4cVar) {
                    objT6 = yv91.a(new ro20(bjg1VarY, (byte) 0));
                    x340Var5.s0(objT6);
                }
                fhg1 fhg1VarO3 = bno1.o(bjg1VarY, fValueOf5, fValueOf6, (ni20) qo20Var3.invoke(((tob1) objT6).getValue(), x340Var5, 0), tzg1Var, x340Var5, 196608);
                long jI = jmr0VarN.i();
                int i = (int) (4294967295L & jI);
                float fIntBitsToFloat = Float.intBitsToFloat(i) > 0.0f ? Float.intBitsToFloat((int) (jI >> 32)) / Float.intBitsToFloat(i) : 1.0f;
                qim0 qim0VarN = anm1.N("standard_artwork_flare", qim0Var);
                boolean zF = x340Var5.f(jI) | x340Var5.d(fIntBitsToFloat) | x340Var5.i(bjg1VarY) | x340Var5.i(fhg1VarO2) | x340Var5.i(fhg1VarO3) | x340Var5.i(jmr0VarN) | x340Var5.i(fhg1VarO);
                Object objT7 = x340Var5.T();
                if (zF || objT7 == m4cVar) {
                    po20 po20Var = new po20(jI, fIntBitsToFloat, bjg1VarY, fhg1VarO2, fhg1VarO3, jmr0VarN, fhg1VarO);
                    x340Var5.s0(po20Var);
                    objT7 = po20Var;
                }
                qim0 qim0VarS = exd0.s(qim0VarN, (iu30) objT7);
                x340Var5.r(false);
                return qim0VarS;
            default:
                ((Number) obj3).intValue();
                x340 x340Var6 = (b0k) obj2;
                x340Var6.i0(-1617253096);
                qim0 qim0VarN2 = anm1.N("MediumPreviewVideoUI", (qim0) obj);
                if (z2) {
                    x340Var6.i0(1356193059);
                } else {
                    x340Var6.i0(597938225);
                    z3 = true ^ upo1.z(x340Var6);
                }
                x340Var6.r(false);
                if (z3) {
                    x340Var6.i0(1356270167);
                    if (z) {
                        x340Var6.i0(597940685);
                        x340Var6.r(false);
                        f = 0.0f;
                    } else {
                        x340Var6.i0(597942335);
                        uwr uwrVar = cbx.a;
                        cua cuaVar = cbx.b(x340Var6).f;
                        x340Var6.r(false);
                        f = 8.0f;
                    }
                    tob1 tob1VarA = z95.a(f, irn1.o0(CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER, 0, bth.a, 2), "cornerRadius", x340Var6, 384, 8);
                    Object objT8 = x340Var6.T();
                    m4c m4cVar2 = fkj0.X;
                    if (objT8 == m4cVar2) {
                        objT8 = yv91.a(new bu2(tob1VarA, (byte) 13));
                        x340Var6.s0(objT8);
                    }
                    if (((Boolean) ((tob1) objT8).getValue()).booleanValue()) {
                        x340Var6.i0(1356921136);
                    } else {
                        x340Var6.i0(1356958119);
                        boolean zI = x340Var6.i(tob1VarA);
                        Object objT9 = x340Var6.T();
                        if (zI || objT9 == m4cVar2) {
                            objT9 = new pak(tob1VarA, (byte) 27);
                            x340Var6.s0(objT9);
                        }
                        qim0VarN2 = i541.C(qim0VarN2, (iu30) objT9);
                    }
                    x340Var6.r(false);
                    x340Var6.r(false);
                } else {
                    x340Var6.i0(1357156116);
                    x340Var6.r(false);
                }
                x340Var6.r(false);
                return qim0VarN2;
        }
    }
}
