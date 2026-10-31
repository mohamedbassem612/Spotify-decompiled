package p;

import android.os.Bundle;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lcm extends a8d1 implements bv30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public /* synthetic */ Object d;
    public /* synthetic */ Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lcm(mr20 mr20Var, pxc pxcVar, lnm lnmVar) {
        super(5, lnmVar);
        this.a = (byte) 1;
        this.f = mr20Var;
        this.g = pxcVar;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj6 = this.g;
        switch (b) {
            case 0:
                lcm lcmVar = new lcm(obj6, (lnm) obj5, (byte) 0);
                lcmVar.c = (gcm) obj;
                lcmVar.d = (jcm) obj2;
                lcmVar.e = (hcm) obj3;
                lcmVar.f = (tqw) obj4;
                return lcmVar.invokeSuspend(rih1Var);
            case 1:
                lcm lcmVar2 = new lcm((mr20) this.f, (pxc) obj6, (lnm) obj5);
                lcmVar2.d = (gdo) obj2;
                lcmVar2.e = (bdo) obj3;
                return lcmVar2.invokeSuspend(rih1Var);
            case 2:
                lcm lcmVar3 = new lcm((br0) this.e, (uw0) obj6, (lnm) obj5, (byte) 2);
                lcmVar3.c = (evu) obj2;
                lcmVar3.d = (bvu) obj3;
                lcmVar3.f = (tqw) obj4;
                return lcmVar3.invokeSuspend(rih1Var);
            case 3:
                lcm lcmVar4 = new lcm(obj6, (lnm) obj5, (byte) 3);
                lcmVar4.c = (sky) obj;
                lcmVar4.d = (tky) obj2;
                lcmVar4.e = (qky) obj3;
                lcmVar4.f = (tqw) obj4;
                return lcmVar4.invokeSuspend(rih1Var);
            case 4:
                lcm lcmVar5 = new lcm(obj6, (lnm) obj5, (byte) 4);
                lcmVar5.c = (mu70) obj;
                lcmVar5.d = (iu70) obj2;
                lcmVar5.e = (fu70) obj3;
                lcmVar5.f = (tqw) obj4;
                return lcmVar5.invokeSuspend(rih1Var);
            case 5:
                lcm lcmVar6 = new lcm(obj6, (lnm) obj5, (byte) 5);
                lcmVar6.c = (ewg0) obj;
                lcmVar6.d = (fwg0) obj2;
                lcmVar6.e = (dwg0) obj3;
                lcmVar6.f = (tqw) obj4;
                return lcmVar6.invokeSuspend(rih1Var);
            case 6:
                lcm lcmVar7 = new lcm(obj6, (lnm) obj5, (byte) 6);
                lcmVar7.c = (ewg0) obj;
                lcmVar7.d = (fwg0) obj2;
                lcmVar7.e = (dwg0) obj3;
                lcmVar7.f = (tqw) obj4;
                return lcmVar7.invokeSuspend(rih1Var);
            case 7:
                lcm lcmVar8 = new lcm(obj6, (lnm) obj5, (byte) 7);
                lcmVar8.c = (mey0) obj;
                lcmVar8.d = (hob1) obj2;
                lcmVar8.e = (c700) obj3;
                lcmVar8.f = (tqw) obj4;
                return lcmVar8.invokeSuspend(rih1Var);
            case 8:
                lcm lcmVar9 = new lcm((ng20) this.e, (dxy) obj6, (lnm) obj5, (byte) 8);
                lcmVar9.c = (a9n0) obj;
                lcmVar9.d = (w8n0) obj3;
                lcmVar9.f = (tqw) obj4;
                return lcmVar9.invokeSuspend(rih1Var);
            case 9:
                lcm lcmVar10 = new lcm(obj6, (lnm) obj5, (byte) 9);
                lcmVar10.c = (gey0) obj;
                lcmVar10.d = (lob1) obj2;
                lcmVar10.e = (h700) obj3;
                lcmVar10.f = (tqw) obj4;
                return lcmVar10.invokeSuspend(rih1Var);
            case 10:
                lcm lcmVar11 = new lcm(obj6, (lnm) obj5, (byte) 10);
                lcmVar11.c = (km61) obj;
                lcmVar11.d = (qxn0) obj2;
                lcmVar11.e = (uxn0) obj3;
                lcmVar11.f = (tqw) obj4;
                return lcmVar11.invokeSuspend(rih1Var);
            case 11:
                lcm lcmVar12 = new lcm(obj6, (lnm) obj5, (byte) 11);
                lcmVar12.c = (p0q0) obj;
                lcmVar12.d = (q0q0) obj2;
                lcmVar12.e = (f0q0) obj3;
                lcmVar12.f = (tqw) obj4;
                return lcmVar12.invokeSuspend(rih1Var);
            case 12:
                lcm lcmVar13 = new lcm((vu30) this.e, (qxr0) obj6, (lnm) obj5, (byte) 12);
                lcmVar13.c = (tyr0) obj;
                lcmVar13.d = (syr0) obj3;
                lcmVar13.f = (tqw) obj4;
                return lcmVar13.invokeSuspend(rih1Var);
            case 13:
                lcm lcmVar14 = new lcm(obj6, (lnm) obj5, (byte) 13);
                lcmVar14.c = (fu31) obj;
                lcmVar14.d = (hu31) obj2;
                lcmVar14.e = (zt31) obj3;
                lcmVar14.f = (tqw) obj4;
                return lcmVar14.invokeSuspend(rih1Var);
            case 14:
                lcm lcmVar15 = new lcm(obj6, (lnm) obj5, (byte) 14);
                lcmVar15.c = obj;
                lcmVar15.d = obj2;
                lcmVar15.e = obj3;
                lcmVar15.f = (tqw) obj4;
                return lcmVar15.invokeSuspend(rih1Var);
            case 15:
                lcm lcmVar16 = new lcm(obj6, (lnm) obj5, (byte) 15);
                lcmVar16.c = (jp61) obj;
                lcmVar16.d = (lp61) obj2;
                lcmVar16.e = obj3;
                lcmVar16.f = (tqw) obj4;
                return lcmVar16.invokeSuspend(rih1Var);
            case 16:
                lcm lcmVar17 = new lcm(obj6, (lnm) obj5, (byte) 16);
                lcmVar17.d = (oof1) obj;
                lcmVar17.e = (lof1) obj2;
                lcmVar17.f = (gof1) obj3;
                return lcmVar17.invokeSuspend(rih1Var);
            default:
                lcm lcmVar18 = new lcm((lo60) this.e, (q8n) obj6, (lnm) obj5, (byte) 17);
                lcmVar18.c = (c7m1) obj2;
                lcmVar18.d = (x6m1) obj3;
                lcmVar18.f = (tqw) obj4;
                return lcmVar18.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:241:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:388:0x081e  */
    /* JADX WARN: Code duplicated, block: B:389:0x0823  */
    /* JADX WARN: Code duplicated, block: B:391:0x0826  */
    /* JADX WARN: Code duplicated, block: B:472:? A[RETURN, SYNTHETIC] */
    public final Object invokeSuspend(Object obj) {
        ki0 ki0VarB;
        Object objI;
        boolean z;
        tv80 tv80VarY;
        p731 p731Var;
        Object objB;
        b7x b7xVarSingletonMap;
        plt0 rlt0Var;
        ou80 ou80Var;
        String str;
        Object objI2;
        cpf1 cpf1Var;
        String strUri;
        ContextTrack contextTrack;
        byte b = this.a;
        m4m m4mVar = m4m.c;
        m4m m4mVar2 = m4m.b;
        m4m m4mVar3 = m4m.a;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.g;
        switch (b) {
            case 0:
                gcm gcmVar = (gcm) this.c;
                jcm jcmVar = (jcm) this.d;
                hcm hcmVar = (hcm) this.e;
                tqw tqwVar = (tqw) this.f;
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (!u890.j(hcmVar, hcm.a)) {
                    eg.o();
                    return null;
                }
                gcmVar.getClass();
                fns fnsVar = igu.a;
                bs50 bs50Var = pyf0.a.f;
                sr1 sr1Var = new sr1((qlb) obj2, gcmVar, tqwVar, jcmVar, (lnm) null, (byte) 5);
                this.c = null;
                this.d = null;
                this.e = null;
                this.f = null;
                this.b = true;
                if (fn31.Y(bs50Var, sr1Var, this) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            case 1:
                gdo gdoVar = (gdo) this.d;
                bdo bdoVar = (bdo) this.e;
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        ki0VarB = (ki0) this.c;
                        hm5.M(obj);
                        objI = obj;
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                ki0VarB = gdoVar.b();
                if (ki0VarB != null) {
                    mr20 mr20Var = (mr20) this.f;
                    this.d = null;
                    this.e = bdoVar;
                    this.c = ki0VarB;
                    this.b = true;
                    objI = b5p1.i(mr20Var, this);
                    if (objI == d9nVar) {
                        return d9nVar;
                    }
                }
                return rih1Var;
                ki0 ki0Var = ki0VarB;
                long jLongValue = ((Number) objI).longValue();
                int iOrdinal = bdoVar.ordinal();
                if (iOrdinal == 0) {
                    pxc.a((pxc) obj2, ki0Var, new Long(jLongValue), (String) null, "companion_card", 20);
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    pxc.a((pxc) obj2, ki0Var, new Long(jLongValue), (String) null, "cta_button", 20);
                }
                return rih1Var;
            case 2:
                evu evuVar = (evu) this.c;
                bvu bvuVar = (bvu) this.d;
                tqw tqwVar2 = (tqw) this.f;
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                uw0 uw0Var = (uw0) obj2;
                int iOrdinal2 = bvuVar.ordinal();
                if (iOrdinal2 == 0) {
                    z = true;
                } else {
                    if (iOrdinal2 != 1) {
                        eg.o();
                        return null;
                    }
                    z = false;
                }
                kby kbyVar = evuVar.a;
                String str2 = kbyVar.a;
                boolean z5 = false;
                boolean z6 = kbyVar.g;
                g3d0 g3d0Var = evuVar.b;
                boolean z7 = kbyVar.j;
                tv80 tv80VarD = cvl1.d(tqwVar2);
                if (kbyVar.s == iwp0.c) {
                    z5 = true;
                }
                this.c = null;
                this.d = null;
                this.f = null;
                this.b = true;
                if (uw0Var.C(qtu.a, str2, z, z6, z7, z5, tv80VarD, g3d0Var, this) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            case 3:
                vky vkyVar = (vky) obj2;
                sky skyVar = (sky) this.c;
                tky tkyVar = (tky) this.d;
                qky qkyVar = (qky) this.e;
                tqw tqwVar3 = (tqw) this.f;
                boolean z8 = this.b;
                if (!z8) {
                    hm5.M(obj);
                    int iOrdinal3 = qkyVar.ordinal();
                    if (iOrdinal3 == 0) {
                        skyVar.f.invoke();
                    } else {
                        if (iOrdinal3 != 1) {
                            eg.o();
                            return null;
                        }
                        tn01 tn01Var = vkyVar.c;
                        hby hbyVar = new hby(tkyVar.a, skyVar.b);
                        this.c = null;
                        this.d = tkyVar;
                        this.e = null;
                        this.f = tqwVar3;
                        this.b = true;
                        if (tn01Var.c(hbyVar, this) == d9nVar) {
                            return d9nVar;
                        }
                        lzn0 lzn0Var = vkyVar.b;
                        String str3 = tkyVar.a;
                        if (tqwVar3 != null) {
                            tv80VarY = n3o1.y(tqwVar3);
                        } else {
                            tv80VarY = null;
                        }
                        lzn0Var.f(new dwn0(str3, "", false, false, 0, 0, false, (a690) null, (Bundle) null, tv80VarY != null ? new bwn0(tv80VarY) : null));
                    }
                } else {
                    if (!z8) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    lzn0 lzn0Var2 = vkyVar.b;
                    String str4 = tkyVar.a;
                    if (tqwVar3 != null) {
                        tv80VarY = n3o1.y(tqwVar3);
                    } else {
                        tv80VarY = null;
                    }
                    lzn0Var2.f(new dwn0(str4, "", false, false, 0, 0, false, (a690) null, (Bundle) null, tv80VarY != null ? new bwn0(tv80VarY) : null));
                }
                return rih1Var;
            case 4:
                mu70 mu70Var = (mu70) this.c;
                iu70 iu70Var = (iu70) this.d;
                fu70 fu70Var = (fu70) this.e;
                tqw tqwVar4 = (tqw) this.f;
                boolean z9 = this.b;
                if (!z9) {
                    hm5.M(obj);
                    fns fnsVar2 = igu.a;
                    bs50 bs50Var2 = pyf0.a.f;
                    ur1 ur1Var = new ur1((byte) 21, fu70Var, iu70Var, (lu70) obj2, tqwVar4, mu70Var, (lnm) null);
                    this.c = null;
                    this.d = null;
                    this.e = null;
                    this.f = null;
                    this.b = true;
                    if (fn31.Y(bs50Var2, ur1Var, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z9) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            case 5:
                ewg0 ewg0Var = (ewg0) this.c;
                fwg0 fwg0Var = (fwg0) this.d;
                dwg0 dwg0Var = (dwg0) this.e;
                tqw tqwVar5 = (tqw) this.f;
                boolean z10 = this.b;
                if (!z10) {
                    hm5.M(obj);
                    this.c = null;
                    this.d = null;
                    this.e = null;
                    this.f = null;
                    this.b = true;
                    if (((mvg0) obj2).e(ewg0Var, fwg0Var, dwg0Var, tqwVar5, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z10) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            case 6:
                ewg0 ewg0Var2 = (ewg0) this.c;
                fwg0 fwg0Var2 = (fwg0) this.d;
                dwg0 dwg0Var2 = (dwg0) this.e;
                tqw tqwVar6 = (tqw) this.f;
                boolean z11 = this.b;
                if (!z11) {
                    hm5.M(obj);
                    this.c = null;
                    this.d = null;
                    this.e = null;
                    this.f = null;
                    this.b = true;
                    if (((s060) obj2).e(ewg0Var2, fwg0Var2, dwg0Var2, tqwVar6, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z11) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            case 7:
                mey0 mey0Var = (mey0) this.c;
                hob1 hob1Var = (hob1) this.d;
                c700 c700Var = (c700) this.e;
                tqw tqwVar7 = (tqw) this.f;
                boolean z12 = this.b;
                if (!z12) {
                    hm5.M(obj);
                    zog zogVar = (zog) obj2;
                    this.c = null;
                    this.d = null;
                    this.e = null;
                    this.f = null;
                    this.b = true;
                    lzn0 lzn0Var3 = (lzn0) zogVar.c;
                    vu30 vu30Var = (vu30) zogVar.i;
                    if (vu30Var != null) {
                        vu30Var.invoke(mey0Var.c, c700Var);
                    }
                    if (c700Var instanceof kwz) {
                        hqn1.q(lzn0Var3, hob1Var.d, tqwVar7, (Bundle) null);
                    } else {
                        if (c700Var instanceof gzz) {
                            if (rwq.j(hob1Var)) {
                                objB = zogVar.b(mey0Var, hob1Var, tqwVar7, (hob1Var.D || hob1Var.E) ? ((gzz) c700Var).a : null, this);
                                if (objB != d9nVar) {
                                }
                            } else {
                                hqn1.q(lzn0Var3, hob1Var.d, tqwVar7, (Bundle) null);
                            }
                        } else if ((c700Var instanceof nwz) || u890.j(c700Var, hzz.a)) {
                            tgm tgmVarA = (tgm) hob1Var.o.f.invoke();
                            vgm vgmVar = (vgm) zogVar.d;
                            String str5 = hob1Var.o.a;
                            tqwVar7.getClass();
                            tv80 tv80VarY2 = n3o1.y(tqwVar7);
                            String str6 = mey0Var.a;
                            vu30 vu30Var2 = (vu30) zogVar.h;
                            int i = zogVar.b;
                            if (vu30Var2 != null) {
                                tgmVarA = tgm.a(tgmVarA, false, false, 0, false, (sgm) null, new vlu(vu30Var2, str6, (byte) 2), (p860) null, false, -134217729);
                            } else if (i == 1) {
                                tgmVarA = tgm.a(tgmVarA, false, false, 0, false, (sgm) null, (iu30) null, (p860) null, false, -134217729);
                            }
                            vgm.b(vgmVar, str5, (String) null, tv80VarY2, tgmVarA, 2);
                        } else if (c700Var instanceof mxz) {
                            dnc dncVar = (dnc) zogVar.e;
                            er00 er00Var = hob1Var.h;
                            boolean z13 = er00Var instanceof dr00;
                            boolean zN = rwq.n(mey0Var, er00Var);
                            Set set = s4b1.f;
                            objB = dncVar.b(upo1.E(mey0Var, hob1Var, tqwVar7, z13, uic.g(hob1Var.b, blc0.ed) ? Long.valueOf(wmo1.r(hob1Var)) : null, zN), this);
                            if (objB != d9nVar) {
                            }
                        } else if (c700Var instanceof w500) {
                            if (hob1Var.J) {
                                hqn1.q(lzn0Var3, hob1Var.d, tqwVar7, (Bundle) null);
                            } else {
                                objB = zogVar.b(mey0Var, hob1Var, tqwVar7, (hob1Var.D || hob1Var.E) ? ((w500) c700Var).a : null, this);
                                if (objB != d9nVar) {
                                }
                            }
                        } else if (c700Var instanceof zvz) {
                            hqn1.q(lzn0Var3, hob1Var.O ? hob1Var.e : hob1Var.d, tqwVar7, (Bundle) null);
                        } else if ((c700Var instanceof txz) && (p731Var = (p731) zogVar.g) != null && hob1Var.D && !hob1Var.i) {
                            p731Var.b(hob1Var.b, vuh1.a);
                        }
                        if (objB == d9nVar) {
                            return d9nVar;
                        }
                    }
                    objB = rih1Var;
                    if (objB == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z12) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            case 8:
                dxy dxyVar = (dxy) obj2;
                a9n0 a9n0Var = (a9n0) this.c;
                w8n0 w8n0Var = (w8n0) this.d;
                tqw tqwVar8 = (tqw) this.f;
                boolean z14 = this.b;
                if (z14) {
                    if (z14) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                tv80 tv80VarD2 = cvl1.d(tqwVar8);
                int iOrdinal4 = w8n0Var.ordinal();
                if (iOrdinal4 == 0) {
                    y8n0 y8n0Var = a9n0Var.a;
                    if (y8n0Var instanceof y8n0) {
                        toj0 toj0Var = (toj0) dxyVar.d;
                        y8n0 y8n0Var2 = y8n0Var;
                        this.c = null;
                        this.d = null;
                        this.f = null;
                        this.b = true;
                        Object obj3 = y8n0Var2.X;
                        ytp0 ytp0Var = (ytp0) toj0Var.f;
                        String str7 = ((zuc0) obj3).c;
                        int iOrdinal5 = y8n0Var2.i.ordinal();
                        if (iOrdinal5 == 0) {
                            m4mVar2 = m4mVar3;
                        } else if (iOrdinal5 != 1) {
                            m4mVar2 = m4mVar;
                        }
                        Object objM = ytp0Var.m(str7, m4mVar2, tv80VarD2, new tgg(toj0Var, y8n0Var2, tv80VarD2, (lnm) null, (byte) 0), this);
                        if (objM != d9nVar) {
                            objM = rih1Var;
                        }
                        if (objM == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else if (iOrdinal4 == 1) {
                    y8n0 y8n0Var3 = a9n0Var.a;
                    if (y8n0Var3 instanceof y8n0) {
                        y8n0 y8n0Var4 = y8n0Var3;
                        zuc0 zuc0Var = (zuc0) y8n0Var4.X;
                        if (y8n0Var4.Y) {
                            dxyVar.M(zuc0Var, tv80VarD2);
                        } else {
                            ((bk90) dxyVar.e).a(new zj90(y8n0Var4.t, zuc0Var));
                        }
                    }
                } else {
                    if (iOrdinal4 != 2) {
                        eg.o();
                        return null;
                    }
                    y8n0 y8n0Var5 = a9n0Var.a;
                    if (y8n0Var5 instanceof y8n0) {
                        y8n0 y8n0Var6 = y8n0Var5;
                        zuc0 zuc0Var2 = (zuc0) y8n0Var6.X;
                        if (y8n0Var6.Y) {
                            dxyVar.M(zuc0Var2, tv80VarD2);
                        } else {
                            ssf1 ssf1Var = (ssf1) dxyVar.c;
                            String str8 = zuc0Var2.c;
                            lik1 lik1Var = (lik1) dxyVar.b;
                            erq0 erq0VarA = zuc0Var2.q.a(erq0.class);
                            if (erq0VarA != null) {
                                b7xVarSingletonMap = erq0VarA.a.isEmpty() ? null : Collections.singletonMap("is_music_video", "true");
                                if (b7xVarSingletonMap == null) {
                                    b7xVarSingletonMap = b7x.a;
                                }
                            } else {
                                b7xVarSingletonMap = b7x.a;
                            }
                            ssf1Var.b(new dmf1(str8, lik1Var, (String) null, new vsf1((String) null, (String) null, false, (String) null, false, false, false, false, false, false, (String) null, false, false, false, false, false, (ugo0) null, (ok51) null, false, (g371) null, false, false, false, false, false, false, false, false, (p860) null, (String) null, false, false, -1, 63), b7xVarSingletonMap), tv80VarD2);
                        }
                    }
                }
                return rih1Var;
            case 9:
                san0 san0Var = (san0) obj2;
                gey0 gey0Var = (gey0) this.c;
                lob1 lob1Var = (lob1) this.d;
                h700 h700Var = (h700) this.e;
                tqw tqwVar9 = (tqw) this.f;
                boolean z15 = this.b;
                if (z15) {
                    if (z15) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (!(h700Var instanceof j400)) {
                    if ((h700Var instanceof m400) || (h700Var instanceof kxz)) {
                        vgm.b((vgm) san0Var.b.get(), gey0Var.a, (String) null, cvl1.d(tqwVar9), (tgm) null, 10);
                        return rih1Var;
                    }
                    eg.o();
                    return null;
                }
                ytp0 ytp0Var2 = san0Var.c;
                String str9 = gey0Var.a;
                int iC = l1d.C(lob1Var.f);
                if (iC == 0) {
                    m4mVar2 = m4mVar;
                } else if (iC != 1) {
                    if (iC != 2) {
                        eg.o();
                        return null;
                    }
                    m4mVar2 = m4mVar3;
                }
                l24 l24Var = new l24(san0Var, gey0Var, tqwVar9, (lnm) null, (byte) 13);
                this.c = null;
                this.d = null;
                this.e = null;
                this.f = null;
                this.b = true;
                if (ytp0Var2.m(str9, m4mVar2, (tv80) null, l24Var, this) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            case 10:
                wp20 wp20Var = (wp20) obj2;
                km61 km61Var = (km61) this.c;
                qxn0 qxn0Var = (qxn0) this.d;
                sxn0 sxn0Var = (uxn0) this.e;
                tqw tqwVar10 = (tqw) this.f;
                boolean z16 = this.b;
                if (z16) {
                    if (z16) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (sxn0Var instanceof sxn0) {
                    String str10 = sxn0Var.a;
                    this.c = null;
                    this.d = null;
                    this.e = null;
                    this.f = null;
                    this.b = true;
                    if (wp20Var.K(km61Var, qxn0Var, str10, tqwVar10, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!(sxn0Var instanceof txn0)) {
                        eg.o();
                        return null;
                    }
                    ((i9i1) wp20Var.e).b(((txn0) sxn0Var).a);
                }
                return rih1Var;
            case 11:
                n0q0 n0q0Var = (p0q0) this.c;
                q0q0 q0q0Var = (q0q0) this.d;
                f0q0 f0q0Var = (f0q0) this.e;
                tqw tqwVar11 = (tqw) this.f;
                boolean z17 = this.b;
                if (z17) {
                    if (z17) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (tqwVar11 != null) {
                    tv80 tv80VarY3 = n3o1.y(tqwVar11);
                    if (x0q0.a[f0q0Var.ordinal()] == 1) {
                        if (n0q0Var instanceof n0q0) {
                            rlt0Var = new plt0(n0q0Var.a);
                        } else if (n0q0Var instanceof o0q0) {
                            o0q0 o0q0Var = (o0q0) n0q0Var;
                            rlt0Var = new rlt0(o0q0Var.a, o0q0Var.b, o0q0Var.c);
                        } else {
                            eg.o();
                        }
                        plt0 plt0Var = rlt0Var;
                        boolean z18 = (n0q0Var instanceof o0q0) && ((o0q0) n0q0Var).e && q0q0Var.h && q0q0Var.e != ast0.a;
                        fns fnsVar3 = igu.a;
                        bs50 bs50Var3 = pyf0.a.f;
                        on1 on1Var = new on1((y0q0) obj2, q0q0Var, plt0Var, tv80VarY3, z18, (lnm) null);
                        this.c = null;
                        this.d = null;
                        this.e = null;
                        this.f = null;
                        this.b = true;
                        if (fn31.Y(bs50Var3, on1Var, this) == d9nVar) {
                            return d9nVar;
                        }
                        return rih1Var;
                    }
                    eg.o();
                } else {
                    hhg1.n("Required value was null.");
                }
                return null;
            case 12:
                tyr0 tyr0Var = (tyr0) this.c;
                syr0 syr0Var = (syr0) this.d;
                tqw tqwVar12 = (tqw) this.f;
                boolean z19 = this.b;
                if (z19) {
                    if (z19) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (u890.j(syr0Var, ryr0.a)) {
                    ((vu30) this.e).invoke(tyr0Var.a, Boolean.valueOf(!tyr0Var.g));
                } else {
                    if (!u890.j(syr0Var, qyr0.a)) {
                        eg.o();
                        return null;
                    }
                    rxr0 rxr0Var = (qxr0) obj2;
                    String str11 = tyr0Var.a;
                    String str12 = (tqwVar12 == null || (ou80Var = n3o1.y(tqwVar12).a) == null) ? null : ou80Var.a;
                    this.c = null;
                    this.d = null;
                    this.f = null;
                    this.b = true;
                    if (rxr0Var.a(str11, str12, this) == d9nVar) {
                        return d9nVar;
                    }
                }
                return rih1Var;
            case 13:
                ru31 ru31Var = (ru31) obj2;
                iu30 iu30Var = ru31Var.f;
                r091 r091Var = ru31Var.e;
                fu31 fu31Var = (fu31) this.c;
                hu31 hu31Var = (hu31) this.d;
                vt31 vt31Var = (zt31) this.e;
                tqw tqwVar13 = (tqw) this.f;
                boolean z20 = this.b;
                if (z20) {
                    if (z20) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if ((vt31Var instanceof xt31) || (vt31Var instanceof st31) || (vt31Var instanceof ut31) || (vt31Var instanceof tt31)) {
                    d0r d0rVar = ru31Var.a;
                    String str13 = fu31Var.b.a;
                    v061 v061Var = v061.a;
                    this.c = null;
                    this.d = null;
                    this.e = null;
                    this.f = null;
                    this.b = true;
                    d0rVar.getClass();
                    if (d0r.d(d0rVar, v061Var, str13, t061.a, this) == d9nVar) {
                        return d9nVar;
                    }
                } else if (vt31Var instanceof rt31) {
                    iu30Var.invoke(new bu31(fu31Var.b));
                } else if (vt31Var instanceof vt31) {
                    iu30Var.invoke(new cu31(fu31Var.b, vt31Var.a));
                } else if (vt31Var instanceof wt31) {
                    if (r091Var != null && (str = hu31Var.b) != null) {
                        tv80 tv80VarY4 = tqwVar13 != null ? n3o1.y(tqwVar13) : null;
                        yjp1 yjp1Var = aky0.a;
                        String str14 = ru31Var.b;
                        ftv ftvVar = fu31Var.b;
                        ebp1.s(r091Var, new lsm0(str, new ksm0(new gec1("2df9ccbfeca24f2d838d9546541a77b4"), ftvVar.b, str14, "edit-playlist-items-preview", ftvVar.a, (String) null, 480), false, false, (jsm0) null, 0L, (ism0) null, (String) null, false, 0, 2044), tv80VarY4, yjp1Var, 12);
                        r091Var.k();
                    }
                } else {
                    if (!(vt31Var instanceof yt31)) {
                        eg.o();
                        return null;
                    }
                    if (r091Var != null) {
                        r091Var.c();
                    }
                    if (r091Var != null) {
                        r091Var.j();
                    }
                }
                return rih1Var;
            case 14:
                Object obj4 = this.c;
                Object obj5 = this.d;
                Object obj6 = this.e;
                tqw tqwVar14 = (tqw) this.f;
                boolean z21 = this.b;
                if (!z21) {
                    hm5.M(obj);
                    CompletableSource completableSource = (CompletableSource) ((zu30) obj2).J(obj4, obj5, obj6, tqwVar14);
                    this.c = null;
                    this.d = null;
                    this.e = null;
                    this.f = null;
                    this.b = true;
                    if (fc11.i(completableSource, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z21) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            case 15:
                jp61 jp61Var = (jp61) this.c;
                lp61 lp61Var = (lp61) this.d;
                Object obj7 = this.e;
                tqw tqwVar15 = (tqw) this.f;
                boolean z22 = this.b;
                if (!z22) {
                    hm5.M(obj);
                    km61 km61Var2 = new km61(jp61Var);
                    igb1 igb1Var = jp61Var.c;
                    this.c = null;
                    this.d = null;
                    this.e = null;
                    this.f = null;
                    this.b = true;
                    if (((dv30) obj2).Y(km61Var2, igb1Var, lp61Var, obj7, tqwVar15, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z22) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            case 16:
                cpf1 cpf1Var2 = (cpf1) obj2;
                oof1 oof1Var = (oof1) this.d;
                lof1 lof1Var = (lof1) this.e;
                gof1 gof1Var = (gof1) this.f;
                boolean z23 = this.b;
                if (!z23) {
                    hm5.M(obj);
                    String str15 = lof1Var.g;
                    String str16 = oof1Var.b;
                    if (str16 == null) {
                        str16 = oof1Var.a;
                    }
                    if (u890.j(str15, str16)) {
                        int iOrdinal6 = gof1Var.ordinal();
                        if (iOrdinal6 == 0) {
                            FlowableMap flowableMap = cpf1Var2.a;
                            vbm[] vbmVarArr = q601.a;
                            kge kgeVar = new kge(flowableMap);
                            this.d = null;
                            this.e = null;
                            this.f = gof1Var;
                            this.c = cpf1Var2;
                            this.b = true;
                            objI2 = b5p1.i(kgeVar, this);
                            if (objI2 == d9nVar) {
                                return d9nVar;
                            }
                            cpf1Var = cpf1Var2;
                            contextTrack = (ContextTrack) objI2;
                            cpf1Var.getClass();
                            if (l4o1.G(contextTrack)) {
                                strUri = l4o1.a0(contextTrack, "album_uri");
                            }
                        } else {
                            if (iOrdinal6 != 1) {
                                eg.o();
                                return null;
                            }
                            strUri = lof1Var.f;
                        }
                    }
                    return rih1Var;
                }
                if (!z23) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cpf1 cpf1Var3 = (cpf1) this.c;
                hm5.M(obj);
                cpf1Var = cpf1Var3;
                objI2 = obj;
                contextTrack = (ContextTrack) objI2;
                cpf1Var.getClass();
                strUri = (l4o1.G(contextTrack) && l4o1.P(contextTrack)) ? contextTrack.uri() : l4o1.a0(contextTrack, "album_uri");
                if (strUri == null) {
                    strUri = "";
                }
                if (!ihc1.y0(strUri)) {
                    cpf1Var2.c.a(strUri, cpf1Var2.d.c(gof1Var, strUri));
                }
                return rih1Var;
            default:
                c7m1 c7m1Var = (c7m1) this.c;
                x6m1 x6m1Var = (x6m1) this.d;
                tqw tqwVar16 = (tqw) this.f;
                boolean z24 = this.b;
                if (!z24) {
                    hm5.M(obj);
                    if (x6m1Var instanceof w6m1) {
                        String str17 = c7m1Var.k;
                        lo60 lo60Var = (lo60) this.e;
                        this.c = null;
                        this.d = null;
                        this.f = null;
                        this.b = true;
                        wsk wskVar = s6m1.a;
                        Object objY = fn31.Y((q8n) obj2, new mxj1(lo60Var, str17, tqwVar16, (lnm) null, (byte) 10), this);
                        if (objY != d9nVar) {
                            objY = rih1Var;
                        }
                        if (objY == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (!z24) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lcm(Object obj, lnm lnmVar, byte b) {
        super(5, lnmVar);
        this.a = b;
        this.g = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lcm(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(5, lnmVar);
        this.a = b;
        this.e = obj;
        this.g = obj2;
    }
}
