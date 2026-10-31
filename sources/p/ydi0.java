package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.concertcampaignview.v1.CtaType;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ydi0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydi0(Integer num, String str, vu30 vu30Var, txd1 txd1Var, Function0 function0, m5a m5aVar, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 19;
        this.b = num;
        this.c = str;
        this.e = vu30Var;
        this.f = txd1Var;
        this.d = function0;
        this.g = m5aVar;
        this.h = qim0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object a(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        iu30 iu30Var = (iu30) this.b;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            qim0 qim0VarN = anm1.N("showcase", (qim0) this.h);
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ktd.n(x340Var2);
            }
            idn0 idn0Var = (idn0) objT;
            jtr jtrVar = jtr.f;
            boolean zG = x340Var2.g(iu30Var);
            Object objT2 = x340Var2.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new m861(iu30Var, (byte) 29);
                x340Var2.s0(objT2);
            }
            Function0 function0 = (Function0) objT2;
            boolean zG2 = x340Var2.g(iu30Var);
            Object objT3 = x340Var2.T();
            if (zG2 || objT3 == m4cVar) {
                objT3 = new pc81(iu30Var, (byte) 0);
                x340Var2.s0(objT3);
            }
            qim0 qim0VarY = bin.y(qim0VarN, idn0Var, jtrVar, false, null, null, null, function0, (Function0) objT3, 444);
            he81 he81Var = (he81) this.c;
            VideoSurfaceView videoSurfaceView = (VideoSurfaceView) this.d;
            idd1 idd1Var = (idd1) this.e;
            idd1 idd1Var2 = (idd1) this.f;
            idd1 idd1Var3 = (idd1) this.g;
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarY);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            j7p1.g(he81Var, apo.r(-1978353517, new qc81(he81Var, idd1Var, iu30Var, (byte) 0), x340Var2), apo.r(-1985733838, new qc81(he81Var, idd1Var2, iu30Var, (byte) 1), x340Var2), apo.r(-1993114159, new qc81(he81Var, idd1Var3, iu30Var, (byte) 2), x340Var2), null, videoSurfaceView, x340Var2, 3504);
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2) {
        gbx gbxVar;
        j2i j2iVarR;
        j2i j2iVar;
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        ti81 ti81Var = (ti81) this.f;
        li81 li81Var = (li81) this.b;
        Function0 function0 = (Function0) this.d;
        String str = (String) this.c;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            j2i j2iVarR2 = null;
            if (function0 == null) {
                gbxVar = null;
            } else {
                if (ihc1.y0(str)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                gbxVar = new gbx(new y50(str), function0);
            }
            if (li81Var == null) {
                x340Var2.i0(-562189943);
                x340Var2.r(false);
                j2iVarR = null;
            } else {
                x340Var2.i0(-562189942);
                j2iVarR = apo.r(1073655257, new rt11((pt) this.e, li81Var, (byte) 24), x340Var2);
                x340Var2.r(false);
            }
            if (j2iVarR == null) {
                x340Var2.i0(-562043250);
                if ((function0 != null ? str : null) == null) {
                    x340Var2.i0(-562043251);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-562043250);
                    j2iVarR2 = apo.r(571329764, new iww0(str, (byte) 28), x340Var2);
                    x340Var2.r(false);
                }
                x340Var2.r(false);
                j2iVar = j2iVarR2;
            } else {
                x340Var2.i0(-572324654);
                x340Var2.r(false);
                j2iVar = j2iVarR;
            }
            jto1.b((qim0) this.h, null, null, false, null, null, gbxVar, null, apo.r(-469104450, new k681(ti81Var, (byte) 8), x340Var2), null, null, j2iVar, null, null, null, apo.r(-778093500, new rt11(ti81Var, (qim0) this.g, (byte) 25), x340Var2), x340Var2, 100663296, 196608, 30398);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        Object obj3 = this.d;
        Function0 function0 = (Function0) obj3;
        Object obj4 = this.f;
        String str = (String) obj4;
        Object obj5 = this.g;
        vu30 vu30Var = (vu30) obj5;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object obj6 = this.b;
            pxk0 pxk0Var = (pxk0) obj6;
            Object obj7 = this.e;
            if (pxk0Var != null) {
                x340Var2.i0(-564941394);
                otw.c((aje1) this.c, new zie1((wr21) obj7, (String) obj4, (pxk0) obj6, (Function0) obj3, (vu30) obj5, ((Boolean) ((ven0) this.h).getValue()).booleanValue()), u291.d(nim0.a, 1.0f), (ipb1) null, x340Var2, 0, 8);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-564604641);
                wr21 wr21Var = (wr21) obj7;
                boolean zG = x340Var2.g(vu30Var) | x340Var2.g(str) | x340Var2.g(function0);
                Object objT = x340Var2.T();
                if (zG || objT == fkj0.X) {
                    objT = new rsc1(vu30Var, str, function0, (byte) 8);
                    x340Var2.s0(objT);
                }
                x9p1.d(wr21Var, (iu30) objT, x340Var2, 0);
                x340Var2.r(false);
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        cev0.g((jyf1) this.b, (d0r) this.c, (tyq) this.e, (tyq) this.f, (tyq) this.g, (qim0) this.h, (Function0) this.d, (b0k) obj, czo1.p(4097));
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2) throws Throwable {
        ((Number) obj2).intValue();
        r4o1.b((String) this.b, (nm6) this.c, (d0r) this.d, (hw2) this.e, (kt91) this.f, (vzq0) this.g, (qim0) this.h, (b0k) obj, czo1.p(1572865));
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ppo1.k((w9i1) this.b, (n9i1) this.c, (lzn0) this.f, (e490) this.g, (Function0) this.d, (Function0) this.e, (qim0) this.h, (b0k) obj, czo1.p(1));
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        qyo1.m((kyi1) this.b, (q1a) this.d, (t8r0) this.e, (xfx) this.f, (j2i) this.c, (iu30) this.g, (qim0) this.h, (b0k) obj, czo1.p(1));
        return rih1.a;
    }

    private final Object j(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        d5p1.f((czj1) this.b, (iu30) this.c, (pzj1) this.d, (vzj1) this.e, (jd6) this.f, (zzq0) this.g, (qim0) this.h, (b0k) obj, czo1.p(1));
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:260:0x0d1b  */
    /* JADX WARN: Code duplicated, block: B:261:0x0d27  */
    /* JADX WARN: Code duplicated, block: B:263:0x0d33  */
    /* JADX WARN: Code duplicated, block: B:270:0x0d5a  */
    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var;
        ven0 ven0VarP;
        ven0 ven0VarS;
        Object objT;
        qim0 qim0VarA;
        boolean zG;
        Object objT2;
        vu30 vu30Var;
        int i;
        lnm lnmVar;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        qim0 qim0Var = nim0.a;
        lnm lnmVar2 = null;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.c;
        Object obj4 = this.h;
        Object obj5 = this.e;
        Object obj6 = this.f;
        Object obj7 = this.b;
        Object obj8 = this.g;
        Object obj9 = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                wpo1.e((odi0) obj7, (j2i) obj3, (Function0) obj9, (Function0) obj5, (Function0) obj6, (fns) obj8, (qim0) obj4, (b0k) obj, czo1.p(49));
                return rih1Var;
            case 1:
                x340 x340Var2 = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                tob1 tob1Var = (tob1) obj9;
                Float fValueOf = Float.valueOf(1.0f);
                rk41 rk41Var = (rk41) obj5;
                Object obj10 = fkj0.X;
                thd0 thd0Var = (thd0) obj7;
                x340 x340Var3 = x340Var2;
                if (x340Var3.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    i2c i2cVar = (i2c) obj6;
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode = Long.hashCode(x340Var3.T);
                    xos0 xos0VarM = x340Var3.m();
                    qim0 qim0VarE = zr7.E(x340Var3, qim0Var);
                    hzj.A.getClass();
                    if (x340Var3.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var3.m0();
                    if (x340Var3.S) {
                        x340Var3.l(n4kVar);
                    } else {
                        x340Var3.v0();
                    }
                    nko1.H(gfh0VarC, x340Var3, y580.O0);
                    nko1.H(xos0VarM, x340Var3, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
                    nko1.F(x340Var3);
                    nko1.H(qim0VarE, x340Var3, y580.Y);
                    x340Var3.i0(99182832);
                    etj0 etj0Var = (etj0) thd0Var.c;
                    Iterator it = etj0Var.c.iterator();
                    int i2 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            p7h.T();
                            throw null;
                        }
                        dtj0 dtj0Var = (dtj0) next;
                        boolean z = i2 == p7h.L(etj0Var.c);
                        Iterator it2 = it;
                        boolean z2 = rk41Var.a;
                        boolean z3 = thd0Var.b;
                        String strC = f4i1.c(i2, "badgeIn");
                        Float fValueOf2 = Float.valueOf(0.0f);
                        i2c i2cVar2 = i2cVar;
                        int i4 = i2 * 1000;
                        ilv.a.getClass();
                        ceo ceoVar = flv.d;
                        boolean z4 = z;
                        Object obj11 = obj3;
                        pxg1 pxg1Var = new pxg1(CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER, i4, ceoVar);
                        tzg1 tzg1Var = rno1.a;
                        hsi1 hsi1Var = new hsi1(strC, fValueOf2, fValueOf, pxg1Var, tzg1Var);
                        if (z4) {
                            x340Var3.i0(-1577601664);
                            x340 x340Var4 = x340Var3;
                            ven0VarP = zod.S(hsi1Var, z2, z3, (Function0) null, x340Var4, 8, 8);
                            x340Var = x340Var4;
                            x340Var.r(false);
                        } else {
                            x340Var = x340Var3;
                            if (z3) {
                                x340Var.i0(-1577586049);
                                Float f = fValueOf;
                                fValueOf = f;
                                x340Var = x340Var;
                                ven0VarP = zod.P(mqo1.s(hsi1Var, new hsi1("badgeOut" + i2, f, fValueOf2, new pxg1(CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER, CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER, flv.i), tzg1Var)), z2, (String) null, (Function0) null, (Function0) null, x340Var, 8, 28);
                                x340Var.r(false);
                            } else {
                                x340Var.i0(-1577595264);
                                ven0VarP = zod.R(new hsi1("badgeIn" + i2 + "-disabled", fValueOf2, fValueOf2, irn1.j0(), tzg1Var), z2, (Function0) null, x340Var, 8, 4);
                                x340Var.r(false);
                            }
                            ven0VarS = zod.S(new hsi1(f4i1.c(i2, "badgeScale"), Float.valueOf(yoi1.o(0.8f - (i2 * 0.1f), 0.0f, 1.0f)), fValueOf, new pxg1(CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER, i4, ceoVar), tzg1Var), rk41Var.a, thd0Var.b, (Function0) null, x340Var, 8, 8);
                            vnr0 vnr0Var = (vnr0) dtj0Var.a.invoke(x340Var, 0);
                            float fD = i2cVar2.d();
                            uwr uwrVar = cbx.a;
                            qim0 qim0VarX = u291.x(0.0f, fD - (cbx.b(x340Var).b.a * 2.0f), 1, qim0Var);
                            if (z4) {
                                x340Var.i0(-2074088901);
                                x340Var.r(false);
                                qim0VarA = qim0Var;
                            } else {
                                x340Var.i0(-2074088150);
                                objT = x340Var.T();
                                if (objT == obj10) {
                                    objT = kmj0.V0;
                                    x340Var.s0(objT);
                                }
                                qim0VarA = s161.a(qim0Var, (iu30) objT);
                                x340Var.r(false);
                            }
                            qim0 qim0VarThen = qim0VarX.then(qim0VarA);
                            zG = x340Var.g(ven0VarP) | x340Var.g(ven0VarS);
                            objT2 = x340Var.T();
                            if (zG || objT2 == obj10) {
                                objT2 = new dy(ven0VarP, ven0VarS, (byte) 5);
                                x340Var.s0(objT2);
                            }
                            x340 x340Var5 = x340Var;
                            qgo1.f(vnr0Var, i541.C(qim0VarThen, (iu30) objT2), new a0e1(3), 0, false, null, x340Var5, 8, 56);
                            it = it2;
                            i2cVar = i2cVar2;
                            x340Var3 = x340Var5;
                            i2 = i3;
                            obj3 = obj11;
                            obj8 = obj8;
                        }
                        ven0VarS = zod.S(new hsi1(f4i1.c(i2, "badgeScale"), Float.valueOf(yoi1.o(0.8f - (i2 * 0.1f), 0.0f, 1.0f)), fValueOf, new pxg1(CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER, i4, ceoVar), tzg1Var), rk41Var.a, thd0Var.b, (Function0) null, x340Var, 8, 8);
                        vnr0 vnr0Var2 = (vnr0) dtj0Var.a.invoke(x340Var, 0);
                        float fD2 = i2cVar2.d();
                        uwr uwrVar2 = cbx.a;
                        qim0 qim0VarX2 = u291.x(0.0f, fD2 - (cbx.b(x340Var).b.a * 2.0f), 1, qim0Var);
                        if (z4) {
                            x340Var.i0(-2074088901);
                            x340Var.r(false);
                            qim0VarA = qim0Var;
                        } else {
                            x340Var.i0(-2074088150);
                            objT = x340Var.T();
                            if (objT == obj10) {
                                objT = kmj0.V0;
                                x340Var.s0(objT);
                            }
                            qim0VarA = s161.a(qim0Var, (iu30) objT);
                            x340Var.r(false);
                        }
                        qim0 qim0VarThen2 = qim0VarX2.then(qim0VarA);
                        zG = x340Var.g(ven0VarP) | x340Var.g(ven0VarS);
                        objT2 = x340Var.T();
                        if (zG) {
                            objT2 = new dy(ven0VarP, ven0VarS, (byte) 5);
                            x340Var.s0(objT2);
                        } else {
                            objT2 = new dy(ven0VarP, ven0VarS, (byte) 5);
                            x340Var.s0(objT2);
                        }
                        x340 x340Var6 = x340Var;
                        qgo1.f(vnr0Var2, i541.C(qim0VarThen2, (iu30) objT2), new a0e1(3), 0, false, null, x340Var6, 8, 56);
                        it = it2;
                        i2cVar = i2cVar2;
                        x340Var3 = x340Var6;
                        i2 = i3;
                        obj3 = obj11;
                        obj8 = obj8;
                    }
                    x340 x340Var7 = x340Var3;
                    Object obj12 = obj3;
                    Object obj13 = obj8;
                    x340Var7.r(false);
                    x340Var7.r(true);
                    Object objT3 = x340Var7.T();
                    if (objT3 == obj10) {
                        objT3 = NumberFormat.getInstance().format(etj0Var.a);
                        x340Var7.s0(objT3);
                    }
                    String str = (String) objT3;
                    x340Var7.i0(-106263433);
                    zj31 zj31Var = etj0Var.e;
                    jfe jfeVar = (jfe) obj13;
                    List list = (List) obj4;
                    boolean z5 = rk41Var.a;
                    qim0 qim0VarR = d7e.r(3.0f, u291.f(qim0Var, 1.0f), false);
                    Object objT4 = x340Var7.T();
                    if (objT4 == obj10) {
                        objT4 = new fki0(str, (byte) 7);
                        x340Var7.s0(objT4);
                    }
                    zj31Var.b(new jj31(z5, 0, s161.a(qim0VarR, (iu30) objT4), 2, jfeVar, list, (Map) null, false, false, (Function0) null, (iu30) null, 4032), x340Var7, 8);
                    x340Var7.r(false);
                    vnr0 vnr0Var3 = (vnr0) etj0Var.b.invoke(x340Var7, 0);
                    tob1 tob1Var2 = (tob1) obj12;
                    qim0 qim0VarF = u291.f(qim0Var, 1.0f);
                    uwr uwrVar3 = cbx.a;
                    qim0 qim0VarZ = uyn1.z(cbx.b(x340Var7).b.a, 0.0f, 2, qim0VarF);
                    boolean zG2 = x340Var7.g(tob1Var);
                    Object objT5 = x340Var7.T();
                    if (zG2 || objT5 == obj10) {
                        objT5 = new pak(tob1Var, (byte) 28);
                        x340Var7.s0(objT5);
                    }
                    htj0.a(vnr0Var3, tob1Var2, i541.C(qim0VarZ, (iu30) objT5), x340Var7, 8);
                } else {
                    x340Var3.b0();
                }
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                xap1.g((String) obj7, (String) obj3, (hux) obj6, (c380) obj8, (Function0) obj9, (Function0) obj5, (qim0) obj4, (b0k) obj, czo1.p(513));
                return rih1Var;
            case 3:
                x340 x340Var8 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                iu30 iu30Var = (iu30) obj3;
                mwq0 mwq0Var = (mwq0) obj7;
                x340 x340Var9 = x340Var8;
                if (x340Var9.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    fdg1.j(mwq0Var, apo.r(241658557, new jb1(obj5, obj6, obj4, (iu30) obj8, obj9, (byte) 23), x340Var9), x340Var9, 48);
                    boolean zG3 = x340Var9.g(iu30Var) | x340Var9.i(mwq0Var);
                    Object objT6 = x340Var9.T();
                    if (zG3 || objT6 == m4cVar) {
                        objT6 = new e3p0(iu30Var, mwq0Var, lnmVar2, (byte) 14);
                        x340Var9.s0(objT6);
                    }
                    qxd0.t(mwq0Var, x340Var9, (vu30) objT6);
                    Object objT7 = x340Var9.T();
                    if (objT7 == m4cVar) {
                        objT7 = v8r.q(Boolean.FALSE);
                        x340Var9.s0(objT7);
                    }
                    ven0 ven0Var = (ven0) objT7;
                    Boolean boolValueOf = Boolean.valueOf(mwq0Var.a());
                    boolean zI = x340Var9.i(ven0Var) | x340Var9.i(mwq0Var) | x340Var9.g((iu30) obj8) | x340Var9.g((Function0) obj9);
                    mwq0 mwq0Var2 = (mwq0) obj7;
                    iu30 iu30Var2 = (iu30) obj8;
                    Function0 function0 = (Function0) obj9;
                    Object objT8 = x340Var9.T();
                    if (zI || objT8 == m4cVar) {
                        c6h0 c6h0Var = new c6h0(mwq0Var2, iu30Var2, function0, ven0Var, (lnm) null, (byte) 8);
                        x340Var9.s0(c6h0Var);
                        objT8 = c6h0Var;
                    }
                    qxd0.t(boolValueOf, x340Var9, (vu30) objT8);
                } else {
                    x340Var9.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var10 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var11 = x340Var10;
                if (x340Var11.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ccs0 ccs0Var = (ccs0) obj7;
                    String str2 = ccs0Var.b;
                    c380 c380Var = ccs0Var.a.f;
                    dw91 dw91Var = (dw91) obj3;
                    iu30 iu30Var3 = (iu30) obj9;
                    tqw0 tqw0VarG = ccs0Var.g();
                    if (tqw0VarG == null) {
                        x340Var11.i0(242432491);
                        x340Var11.r(false);
                        vu30Var = null;
                    } else {
                        x340Var11.i0(242432492);
                        vu30 vu30VarR = apo.r(1965436547, new e9g0((Object) tqw0VarG, obj5, obj6, obj8, obj4, (byte) 18), x340Var11);
                        x340Var11.r(false);
                        vu30Var = vu30VarR;
                    }
                    epo1.l(str2, c380Var, dw91Var, iu30Var3, vu30Var, null, x340Var11, 0);
                } else {
                    x340Var11.b0();
                }
                return rih1Var;
            case 5:
                x340 x340Var12 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var13 = x340Var12;
                if (x340Var13.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    otw.c((ngs0) obj7, new yus0((String) obj3, (String) obj9, (String) obj5, (String) obj6, (String) obj8, (String) obj4), (qim0) null, (ipb1) null, x340Var13, 0, 12);
                } else {
                    x340Var13.b0();
                }
                return rih1Var;
            case 6:
                x340 x340Var14 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var15 = x340Var14;
                boolean zY = x340Var15.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2);
                j06 j06Var = x340Var15.a;
                if (!zY) {
                    x340Var15.b0();
                    return rih1Var;
                }
                uwr uwrVar4 = cbx.a;
                long j = cbx.a(x340Var15).a.c;
                cua cuaVar = cbx.b(x340Var15).f;
                qim0 qim0VarX3 = uyn1.x(dug.f(qim0Var, j, er31.b(8.0f)), cbx.b(x340Var15).e.c);
                era eraVar = een.Q0;
                String str3 = (String) obj7;
                String str4 = (String) obj3;
                String strF = (String) obj6;
                String str5 = (String) obj8;
                String str6 = (String) obj4;
                Function0 function1 = (Function0) obj9;
                Function0 function2 = (Function0) obj5;
                mbh mbhVarA = jbh.a(h36.e(cbx.b(x340Var15).b.b), eraVar, x340Var15, 0);
                int iHashCode2 = Long.hashCode(x340Var15.T);
                xos0 xos0VarM2 = x340Var15.m();
                qim0 qim0VarE2 = zr7.E(x340Var15, qim0VarX3);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var15.m0();
                if (x340Var15.S) {
                    x340Var15.l(n4kVar);
                } else {
                    x340Var15.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(mbhVarA, x340Var15, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM2, x340Var15, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode2);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var15, lljVar3);
                nko1.F(x340Var15);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE2, x340Var15, lljVar4);
                cvx cvxVar = cbx.b(x340Var15).b;
                mbh mbhVarA2 = jbh.a(h36.e(8.0f), eraVar, x340Var15, 0);
                int iHashCode3 = Long.hashCode(x340Var15.T);
                xos0 xos0VarM3 = x340Var15.m();
                qim0 qim0VarE3 = zr7.E(x340Var15, qim0Var);
                x340Var15.m0();
                if (x340Var15.S) {
                    x340Var15.l(n4kVar);
                } else {
                    x340Var15.v0();
                }
                nko1.H(mbhVarA2, x340Var15, lljVar);
                nko1.H(xos0VarM3, x340Var15, lljVar2);
                x0d.q(iHashCode3, x340Var15, lljVar3, x340Var15);
                nko1.H(qim0VarE3, x340Var15, lljVar4);
                eso1.e(Uri.parse(str3), isl.a, (qim0) null, new p3v(164.0f), (zvx) null, (ecx) null, mif1.Q0, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var15, 48, 0, 4020);
                if (str4.length() > 0) {
                    strF = f4i1.f(strF, " · ", str4);
                }
                uwo1.e(strF, null, cbx.d(x340Var15).n, cbx.a(x340Var15).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var15, 0, 0, 2018);
                x340Var15.r(true);
                qim0 qim0VarF2 = u291.f(qim0Var, 1.0f);
                cvx cvxVar2 = cbx.b(x340Var15).b;
                mbh mbhVarA3 = jbh.a(h36.e(4.0f), eraVar, x340Var15, 0);
                int iHashCode4 = Long.hashCode(x340Var15.T);
                xos0 xos0VarM4 = x340Var15.m();
                qim0 qim0VarE4 = zr7.E(x340Var15, qim0VarF2);
                x340Var15.m0();
                if (x340Var15.S) {
                    x340Var15.l(n4kVar);
                } else {
                    x340Var15.v0();
                }
                nko1.H(mbhVarA3, x340Var15, lljVar);
                nko1.H(xos0VarM4, x340Var15, lljVar2);
                x0d.q(iHashCode4, x340Var15, lljVar3, x340Var15);
                nko1.H(qim0VarE4, x340Var15, lljVar4);
                qim0 qim0VarF3 = u291.f(qim0Var, 1.0f);
                cvx cvxVar3 = cbx.b(x340Var15).b;
                mbh mbhVarA4 = jbh.a(h36.e(16.0f), eraVar, x340Var15, 0);
                int iHashCode5 = Long.hashCode(x340Var15.T);
                xos0 xos0VarM5 = x340Var15.m();
                qim0 qim0VarE5 = zr7.E(x340Var15, qim0VarF3);
                x340Var15.m0();
                if (x340Var15.S) {
                    x340Var15.l(n4kVar);
                } else {
                    x340Var15.v0();
                }
                nko1.H(mbhVarA4, x340Var15, lljVar);
                nko1.H(xos0VarM5, x340Var15, lljVar2);
                x0d.q(iHashCode5, x340Var15, lljVar3, x340Var15);
                nko1.H(qim0VarE5, x340Var15, lljVar4);
                cvx cvxVar4 = cbx.b(x340Var15).b;
                mbh mbhVarA5 = jbh.a(h36.e(8.0f), eraVar, x340Var15, 0);
                int iHashCode6 = Long.hashCode(x340Var15.T);
                xos0 xos0VarM6 = x340Var15.m();
                qim0 qim0VarE6 = zr7.E(x340Var15, qim0Var);
                x340Var15.m0();
                if (x340Var15.S) {
                    x340Var15.l(n4kVar);
                } else {
                    x340Var15.v0();
                }
                nko1.H(mbhVarA5, x340Var15, lljVar);
                nko1.H(xos0VarM6, x340Var15, lljVar2);
                x0d.q(iHashCode6, x340Var15, lljVar3, x340Var15);
                nko1.H(qim0VarE6, x340Var15, lljVar4);
                if (str5.equals("Bookshop.org")) {
                    x340Var15.i0(-695898010);
                    cwl1.f(i3o1.n(2131233185, x340Var15, 0), cwl1.n0(2131959734, new Object[]{str5}, x340Var15), u291.h(qim0Var, 28.0f), (tl3) null, (j6m) null, 0.0f, (ColorFilter) null, x340Var15, 8, 120);
                    x340Var15.r(false);
                } else {
                    x340Var15.i0(-695590614);
                    uwo1.e(cwl1.n0(2131959734, new Object[]{str5}, x340Var15), null, cbx.d(x340Var15).e, cbx.a(x340Var15).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var15, 0, 0, 2018);
                    x340Var15.r(false);
                }
                if (str6.length() > 0) {
                    x340Var15.i0(-695247475);
                    uwo1.e(cwl1.n0(2131959732, new Object[]{str6}, x340Var15), null, cbx.d(x340Var15).j, cbx.a(x340Var15).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var15, 0, 0, 2018);
                    i = 0;
                    x340Var15.r(false);
                } else {
                    i = 0;
                    x340Var15.i0(-694931306);
                    x340Var15.r(false);
                }
                x340Var15.r(true);
                qim0 qim0VarF4 = u291.f(qim0Var, 1.0f);
                cvx cvxVar5 = cbx.b(x340Var15).b;
                mbh mbhVarA6 = jbh.a(h36.e(8.0f), eraVar, x340Var15, i);
                int iHashCode7 = Long.hashCode(x340Var15.T);
                xos0 xos0VarM7 = x340Var15.m();
                qim0 qim0VarE7 = zr7.E(x340Var15, qim0VarF4);
                x340Var15.m0();
                if (x340Var15.S) {
                    x340Var15.l(n4kVar);
                } else {
                    x340Var15.v0();
                }
                nko1.H(mbhVarA6, x340Var15, lljVar);
                nko1.H(xos0VarM7, x340Var15, lljVar2);
                x0d.q(iHashCode7, x340Var15, lljVar3, x340Var15);
                nko1.H(qim0VarE7, x340Var15, lljVar4);
                idx idxVar = new idx(4);
                gdx gdxVarR = yla.r(x340Var15);
                z50 z50Var = z50.c;
                foo1.c(new gbx(z50Var, function1), idxVar, anm1.N("physical_book_sale_modal_continue", qim0Var), null, gdxVarR, null, null, null, null, i7j.a, apo.r(-1223608842, new psr0(str5, (byte) 12), x340Var15), x340Var15, 0, 54, 984);
                foo1.c(new gbx(z50Var, function2), ldx.c, anm1.N("physical_book_sale_modal_cancel", qim0Var), null, null, null, null, null, null, null, i7j.b, x340Var15, 0, 48, 2040);
                x340Var15.r(true);
                x340Var15.r(true);
                uwo1.e(cwl1.n0(2131959733, new Object[]{str5}, x340Var15), null, cbx.d(x340Var15).o, cbx.a(x340Var15).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var15, 0, 0, 2018);
                x340Var15.r(true);
                x340Var15.r(true);
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                wwo1.e((kly0) obj7, (hcl1) obj3, (c380) obj9, (o0i) obj5, (iu30) obj6, (iu30) obj8, (qim0) obj4, (b0k) obj, czo1.p(4097));
                return rih1Var;
            case 8:
                x340 x340Var16 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                iu30 iu30Var4 = (iu30) obj7;
                x340 x340Var17 = x340Var16;
                if (x340Var17.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    Object objT9 = x340Var17.T();
                    m4c m4cVar2 = fkj0.X;
                    if (objT9 == m4cVar2) {
                        objT9 = ktd.n(x340Var17);
                    }
                    idn0 idn0Var = (idn0) objT9;
                    jtr jtrVar = jtr.f;
                    qim0 qim0Var2 = (qim0) obj4;
                    boolean zG4 = x340Var17.g(iu30Var4);
                    Object objT10 = x340Var17.T();
                    if (zG4 || objT10 == m4cVar2) {
                        objT10 = new h7w0(iu30Var4, (byte) 10);
                        x340Var17.s0(objT10);
                    }
                    Function0 function3 = (Function0) objT10;
                    boolean zG5 = x340Var17.g(iu30Var4);
                    Object objT11 = x340Var17.T();
                    if (zG5 || objT11 == m4cVar2) {
                        objT11 = new h7w0(iu30Var4, (byte) 11);
                        x340Var17.s0(objT11);
                    }
                    qim0 qim0VarY = bin.y(qim0Var2, idn0Var, jtrVar, false, null, null, null, function3, (Function0) objT11, 444);
                    umx0 umx0Var = (umx0) obj3;
                    idd1 idd1Var = (idd1) obj9;
                    idd1 idd1Var2 = (idd1) obj5;
                    idd1 idd1Var3 = (idd1) obj6;
                    idd1 idd1Var4 = (idd1) obj8;
                    gfh0 gfh0VarC2 = t1c.c(een.d, false);
                    int iHashCode8 = Long.hashCode(x340Var17.T);
                    xos0 xos0VarM8 = x340Var17.m();
                    qim0 qim0VarE8 = zr7.E(x340Var17, qim0VarY);
                    hzj.A.getClass();
                    if (x340Var17.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var17.m0();
                    if (x340Var17.S) {
                        x340Var17.l(n4kVar);
                    } else {
                        x340Var17.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var17, y580.O0);
                    nko1.H(xos0VarM8, x340Var17, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode8), x340Var17, y580.R0);
                    nko1.F(x340Var17);
                    nko1.H(qim0VarE8, x340Var17, y580.Y);
                    nmn1.f(umx0Var, apo.r(1638049456, new c9y(umx0Var, idd1Var, idd1Var2, iu30Var4, (byte) 23), x340Var17), apo.r(1217930511, new rmx0(umx0Var, idd1Var3, iu30Var4, (byte) 0), x340Var17), apo.r(797811566, new rmx0(umx0Var, idd1Var4, iu30Var4, (byte) 1), x340Var17), null, x340Var17, 3504);
                    x340Var17.r(true);
                } else {
                    x340Var17.b0();
                }
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                tro1.h((lgu0) obj7, (String) obj3, (String) obj5, (String) obj6, (String) obj8, (Function0) obj9, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                x340 x340Var18 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                Function0 function4 = (Function0) obj5;
                i4m0 i4m0Var = (i4m0) obj6;
                fl01 fl01Var = (hl01) obj7;
                x340 x340Var19 = x340Var18;
                if (x340Var19.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    wat watVar = (wat) x340Var19.k(t4k.h);
                    boolean z6 = fl01Var instanceof fl01;
                    boolean z7 = z6 && fl01Var.g;
                    Object objT12 = x340Var19.T();
                    m4c m4cVar3 = fkj0.X;
                    if (objT12 == m4cVar3) {
                        objT12 = new vy71(false, new pj(watVar, (byte) 7), new pj(watVar, (byte) 8), z7 ? xy71.b : xy71.a, (iu30) null, 48);
                        x340Var19.s0(objT12);
                    }
                    vy71 vy71Var = (vy71) objT12;
                    if (z7) {
                        x340Var19.i0(-1851298600);
                        boolean zI2 = x340Var19.i(vy71Var);
                        Object objT13 = x340Var19.T();
                        if (zI2 || objT13 == m4cVar3) {
                            objT13 = new dyb(vy71Var, (lnm) null, (byte) 1);
                            x340Var19.s0(objT13);
                        }
                        qxd0.t(rih1Var, x340Var19, (vu30) objT13);
                        x340Var19.r(false);
                    } else {
                        x340Var19.i0(-1851140035);
                        x340Var19.r(false);
                    }
                    ven0 ven0VarS2 = v8r.s((Function0) obj9, x340Var19);
                    Object objT14 = x340Var19.T();
                    if (objT14 == m4cVar3) {
                        objT14 = new hce0(i4m0Var);
                        x340Var19.s0(objT14);
                    }
                    hce0 hce0Var = (hce0) objT14;
                    Object objT15 = x340Var19.T();
                    if (objT15 == m4cVar3) {
                        objT15 = new rjz(i4m0Var, new g8y0(ven0VarS2, (byte) 5));
                        x340Var19.s0(objT15);
                    }
                    rjz rjzVar = (rjz) objT15;
                    fl01 fl01Var2 = z6 ? fl01Var : null;
                    int i5 = fl01Var2 != null ? fl01Var2.f : -1;
                    Object objT16 = x340Var19.T();
                    if (objT16 == m4cVar3) {
                        objT16 = v8r.q(Boolean.FALSE);
                        x340Var19.s0(objT16);
                    }
                    ven0 ven0Var2 = (ven0) objT16;
                    Integer numValueOf2 = Integer.valueOf(i5);
                    boolean zI3 = x340Var19.i(ven0Var2) | x340Var19.e(i5) | x340Var19.i(vy71Var);
                    Object objT17 = x340Var19.T();
                    if (zI3 || objT17 == m4cVar3) {
                        objT17 = new zi3(i5, vy71Var, ven0Var2, (lnm) null, (byte) 14);
                        lnmVar = null;
                        x340Var19.s0(objT17);
                    } else {
                        lnmVar = null;
                    }
                    qxd0.t(numValueOf2, x340Var19, (vu30) objT17);
                    ven0 ven0VarS3 = v8r.s((iu30) obj3, x340Var19);
                    boolean zI4 = x340Var19.i(vy71Var) | x340Var19.i(ven0VarS3);
                    Object objT18 = x340Var19.T();
                    if (zI4 || objT18 == m4cVar3) {
                        objT18 = new dk01(vy71Var, ven0VarS3, lnmVar, (byte) 0);
                        x340Var19.s0(objT18);
                    }
                    qxd0.t(vy71Var, x340Var19, (vu30) objT18);
                    boolean zI5 = x340Var19.i(vy71Var) | x340Var19.g(function4);
                    Object objT19 = x340Var19.T();
                    if (zI5 || objT19 == m4cVar3) {
                        objT19 = new zkz0(vy71Var, function4, (byte) 8);
                        x340Var19.s0(objT19);
                    }
                    WeakHashMap weakHashMap = osl1.x;
                    qim0 qim0VarO = td6.o(lhc.g(x340Var19).g, 16, qim0Var);
                    uwr uwrVar5 = cbx.a;
                    cua cuaVar2 = cbx.b(x340Var19).f;
                    cua cuaVar3 = cbx.b(x340Var19).f;
                    cr31 cr31VarD = er31.d(16.0f, 16.0f, 0.0f, 0.0f, 12);
                    long j2 = u7h.j;
                    dem0.a((Function0) objT19, qim0VarO, vy71Var, 640.0f, false, cr31VarD, j2, j2, 0.0f, u7h.b(u7h.b, 0.5f, 0.0f, 0.0f, 0.0f, 14), (vu30) null, atz0.S0, (eem0) null, apo.r(-1279703261, new mse((hl01) obj7, (i4m0) obj6, (iu30) obj8, (vu30) obj4, hce0Var, rjzVar, (byte) 9), x340Var19), x340Var19, 3072, 3078, 4112);
                } else {
                    x340Var19.b0();
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ((Number) obj2).intValue();
                byo1.j((vv01) obj7, (agc0) obj3, (vyq0) obj6, (fgx) obj8, (znb0) obj4, (Function0) obj9, (Function0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case grn1.d /* 12 */:
                ((Number) obj2).intValue();
                fbp1.i((rr21) obj7, (d0r) obj3, (yqg) obj9, (jxp) obj5, (jxp) obj6, (nr21) obj8, (iu30) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                t0c.c((vnr0) obj7, (String) obj3, (String) obj5, (String) obj6, (dzo1) obj8, (qim0) obj4, (Function0) obj9, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                jzn1.m((y7e1) obj7, (String) obj3, (String) obj6, (lz20) obj8, (Function0) obj9, (Function0) obj5, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                ((r961) obj7).b((c380) obj3, (c380) obj5, (ib60) obj6, (qim0) obj4, (vzq0) obj8, (Function0) obj9, (b0k) obj, czo1.p(73));
                return rih1Var;
            case 16:
                return a(obj, obj2);
            case 17:
                return d(obj, obj2);
            case 18:
                ((Number) obj2).intValue();
                qgo1.h((String) obj7, (if5) obj3, (c380) obj9, (iu30) obj5, (iu30) obj6, (qim0) obj4, (lax) obj8, (b0k) obj, czo1.p(65));
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                u1p1.p((Integer) obj7, (String) obj3, (vu30) obj5, (txd1) obj6, (Function0) obj9, (m5a) obj8, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return e(obj, obj2);
            case 21:
                return f(obj, obj2);
            case 22:
                return g(obj, obj2);
            case 23:
                return h(obj, obj2);
            case 24:
                return i(obj, obj2);
            case 25:
                return j(obj, obj2);
            default:
                hav0 hav0Var = (hav0) obj;
                ((Number) obj2).floatValue();
                hav0Var.a();
                int iB = iel1.b((ven0) obj9, (ven0) obj5, (ven0) obj6, (ven0) obj8, Float.intBitsToFloat((int) (hav0Var.c >> 32)), (int) (((nav0) obj7).Y0 >> 32));
                ((ven0) obj4).setValue(Integer.valueOf(iB));
                ((xu30) obj3).invoke(Integer.valueOf(iB), Boolean.TRUE, (Object) null);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ydi0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ydi0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ydi0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, qim0 qim0Var, Function0 function0, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
        this.h = qim0Var;
        this.d = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ydi0(Object obj, Object obj2, Object obj3, Object obj4, Function0 function0, Function0 function1, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.f = obj3;
        this.g = obj4;
        this.d = function0;
        this.e = function1;
        this.h = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydi0(String str, String str2, String str3, String str4, String str5, Function0 function0, Function0 function1) {
        super(2);
        this.a = (byte) 6;
        this.b = str;
        this.c = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.d = function0;
        this.e = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydi0(String str, if5 if5Var, c380 c380Var, iu30 iu30Var, iu30 iu30Var2, qim0 qim0Var, lax laxVar, int i) {
        super(2);
        this.a = (byte) 18;
        this.b = str;
        this.c = if5Var;
        this.d = c380Var;
        this.e = iu30Var;
        this.f = iu30Var2;
        this.h = qim0Var;
        this.g = laxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydi0(Function0 function0, li81 li81Var, String str, qim0 qim0Var, pt ptVar, ti81 ti81Var, qim0 qim0Var2) {
        super(2);
        this.a = (byte) 17;
        this.d = function0;
        this.b = li81Var;
        this.c = str;
        this.h = qim0Var;
        this.e = ptVar;
        this.f = ti81Var;
        this.g = qim0Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydi0(pxk0 pxk0Var, aje1 aje1Var, wr21 wr21Var, String str, Function0 function0, vu30 vu30Var, ven0 ven0Var) {
        super(2);
        this.a = (byte) 20;
        this.b = pxk0Var;
        this.c = aje1Var;
        this.e = wr21Var;
        this.f = str;
        this.d = function0;
        this.g = vu30Var;
        this.h = ven0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ydi0(qim0 qim0Var, iu30 iu30Var, Object obj, Object obj2, idd1 idd1Var, idd1 idd1Var2, idd1 idd1Var3, byte b) {
        super(2);
        this.a = b;
        this.h = qim0Var;
        this.b = iu30Var;
        this.c = obj;
        this.d = obj2;
        this.e = idd1Var;
        this.f = idd1Var2;
        this.g = idd1Var3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydi0(mwq0 mwq0Var, iu30 iu30Var, iu30 iu30Var2, Function0 function0, Function0 function1, Function0 function2, vu30 vu30Var) {
        super(2);
        this.a = (byte) 3;
        this.b = mwq0Var;
        this.c = iu30Var;
        this.g = iu30Var2;
        this.d = function0;
        this.e = function1;
        this.f = function2;
        this.h = vu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydi0(lgu0 lgu0Var, String str, String str2, String str3, String str4, Function0 function0, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 9;
        this.b = lgu0Var;
        this.c = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.d = function0;
        this.h = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydi0(hl01 hl01Var, Function0 function0, iu30 iu30Var, Function0 function1, i4m0 i4m0Var, iu30 iu30Var2, vu30 vu30Var) {
        super(2);
        this.a = (byte) 10;
        this.b = hl01Var;
        this.d = function0;
        this.c = iu30Var;
        this.e = function1;
        this.f = i4m0Var;
        this.g = iu30Var2;
        this.h = vu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydi0(vv01 vv01Var, agc0 agc0Var, vyq0 vyq0Var, fgx fgxVar, znb0 znb0Var, Function0 function0, Function0 function1, int i) {
        super(2);
        this.a = (byte) 11;
        this.b = vv01Var;
        this.c = agc0Var;
        this.f = vyq0Var;
        this.g = fgxVar;
        this.h = znb0Var;
        this.d = function0;
        this.e = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydi0(r961 r961Var, c380 c380Var, c380 c380Var2, ib60 ib60Var, qim0 qim0Var, vzq0 vzq0Var, Function0 function0, int i) {
        super(2);
        this.a = (byte) 15;
        this.b = r961Var;
        this.c = c380Var;
        this.e = c380Var2;
        this.f = ib60Var;
        this.h = qim0Var;
        this.g = vzq0Var;
        this.d = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydi0(kyi1 kyi1Var, q1a q1aVar, t8r0 t8r0Var, xfx xfxVar, j2i j2iVar, iu30 iu30Var, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 24;
        this.b = kyi1Var;
        this.d = q1aVar;
        this.e = t8r0Var;
        this.f = xfxVar;
        this.c = j2iVar;
        this.g = iu30Var;
        this.h = qim0Var;
    }
}
