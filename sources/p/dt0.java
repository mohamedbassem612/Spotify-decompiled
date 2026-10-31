package p;

import android.net.Uri;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeToSingle;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dt0 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dt0(Object obj, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = obj;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new dt0((nt0) obj, lnmVar, (byte) 0);
            case 1:
                return new dt0((yc1) obj, lnmVar, (byte) 1);
            case 2:
                return new dt0((nf1) obj, lnmVar, (byte) 2);
            case 3:
                return new dt0((bh1) obj, lnmVar, (byte) 3);
            case 4:
                return new dt0((s22) obj, lnmVar, (byte) 4);
            case 5:
                return new dt0((oc2) obj, lnmVar, (byte) 5);
            case 6:
                return new dt0((rj2) obj, lnmVar, (byte) 6);
            case 7:
                return new dt0((fq2) obj, lnmVar, (byte) 7);
            case 8:
                return new dt0((jw3) obj, lnmVar, (byte) 8);
            case 9:
                return new dt0((pg5) obj, lnmVar, (byte) 9);
            case 10:
                return new dt0((zn6) obj, lnmVar, (byte) 10);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return new dt0((q88) obj, lnmVar, (byte) 11);
            case grn1.d /* 12 */:
                return new dt0((qc8) obj, lnmVar, (byte) 12);
            case 13:
                return new dt0((ce8) obj, lnmVar, (byte) 13);
            case 14:
                return new dt0((ca9) obj, lnmVar, (byte) 14);
            case 15:
                return new dt0((dua) obj, lnmVar, (byte) 15);
            case 16:
                return new dt0((ic9) obj, lnmVar, (byte) 16);
            case 17:
                return new dt0((fqb) obj, lnmVar, (byte) 17);
            case 18:
                return new dt0((wje) obj, lnmVar, (byte) 18);
            case 19:
                return new dt0((kp5) obj, lnmVar, (byte) 19);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return new dt0((eme) obj, lnmVar, (byte) 20);
            case 21:
                return new dt0((rqe) obj, lnmVar, (byte) 21);
            case 22:
                return new dt0((eve) obj, lnmVar, (byte) 22);
            case 23:
                return new dt0((y9f) obj, lnmVar, (byte) 23);
            case 24:
                return new dt0((yaf) obj, lnmVar, (byte) 24);
            case 25:
                return new dt0((uff) obj, lnmVar, (byte) 25);
            case 26:
                return new dt0((yhf) obj, lnmVar, (byte) 26);
            case 27:
                return new dt0((nmf) obj, lnmVar, (byte) 27);
            case 28:
                return new dt0((smf) obj, lnmVar, (byte) 28);
            default:
                return new dt0((x1g) obj, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                break;
            case grn1.d /* 12 */:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                break;
            case 28:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    public final Object invokeSuspend(Object obj) throws AbortFlowException {
        c2b0 m231Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = 0;
        byte b3 = 2;
        Object obj2 = this.c;
        d9n d9nVar = d9n.a;
        String str = null;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                nt0 nt0Var = (nt0) obj2;
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    faa0 faa0Var = nt0Var.u;
                    if (faa0Var != null) {
                        faa0Var.d((CancellationException) null);
                    }
                    nt0Var.u = null;
                    nt0Var.u = fn31.T(cto1.q(nt0Var.k.d.c), (o8n) null, 0, new jt0(nt0Var, str, b2), 3);
                    vt0 vt0Var = nt0Var.b;
                    ct0 ct0Var = new ct0(nt0Var, (byte) 0);
                    this.b = true;
                    obj = !((a44) vt0Var.c.get()).b() ? vt0Var.a(ct0Var, this) : vt0Var.b(this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ji0 ji0Var = (ji0) obj;
                nt0Var.v = ji0Var != null ? ji0Var.a : null;
                return obj;
            case 1:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                yc1 yc1Var = (yc1) obj2;
                gj10 gj10Var = yc1Var.d;
                String str2 = yc1Var.b.a;
                this.b = true;
                Object objC = gj10Var.c(str2, this);
                return objC == d9nVar ? d9nVar : objC;
            case 2:
                boolean z3 = this.b;
                try {
                    if (!z3) {
                        hm5.M(obj);
                        nf1 nf1Var = (nf1) obj2;
                        q59 q59Var = nf1Var.c;
                        vf1 vf1Var = nf1Var.e;
                        String str3 = vf1Var.a;
                        String str4 = vf1Var.b;
                        String str5 = vf1Var.c;
                        boolean z4 = vf1Var.d;
                        this.b = true;
                        obj = q59Var.e(str3, str4, str5, z4, this);
                        if (obj == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z3) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    return (lf1) obj;
                } catch (Exception unused) {
                    return new lf1();
                }
            case 3:
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bh1 bh1Var = (bh1) obj2;
                fp8 fp8Var = bh1Var.d;
                String str6 = bh1Var.b.a;
                this.b = true;
                Object objJ = fp8Var.j(str6, this);
                return objJ == d9nVar ? d9nVar : objJ;
            case 4:
                boolean z6 = this.b;
                if (z6) {
                    if (z6) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarC = ((s22) obj2).c.c("country_code", "");
                this.b = true;
                Object objI = b5p1.i(mr20VarC, this);
                return objI == d9nVar ? d9nVar : objI;
            case 5:
                boolean z7 = this.b;
                if (z7) {
                    if (z7) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                kc2 kc2Var = ((oc2) obj2).d;
                this.b = true;
                Object objA = kc2Var.a(this);
                return objA == d9nVar ? d9nVar : objA;
            case 6:
                boolean z8 = this.b;
                if (!z8) {
                    hm5.M(obj);
                    ezc ezcVar = ((rj2) obj2).c.a;
                    s4 s4Var = new s4(2, (lnm) null, (byte) 4);
                    this.b = true;
                    obj = b5p1.j(ezcVar, s4Var, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z8) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return Boolean.valueOf(yto.k((String) ((Map) obj).get("apply-child-content-restrictions"), false));
            case 7:
                boolean z9 = this.b;
                if (!z9) {
                    hm5.M(obj);
                    this.b = true;
                    Object objP = ((fq2) obj2).p(rq2.HOME_DJ, (String) null, this);
                    return objP == d9nVar ? d9nVar : objP;
                }
                if (z9) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                boolean z10 = this.b;
                try {
                    if (!z10) {
                        hm5.M(obj);
                        jw3 jw3Var = (jw3) obj2;
                        a2b0 a2b0Var = jw3Var.c;
                        String str7 = jw3Var.b.a;
                        this.b = true;
                        obj = a2b0Var.h(str7, this);
                        if (obj == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z10) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    m231Var = (c2b0) obj;
                    break;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                return m231Var instanceof m231 ? c2b0.a : m231Var;
            case 9:
                boolean z11 = this.b;
                if (z11) {
                    if (z11) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                xh7 xh7Var = (xh7) ((pg5) obj2).a.get();
                this.b = true;
                Object objJ2 = b5p1.j(xh7Var.b, new nw5(b3, str, b3), this);
                if (objJ2 != d9nVar) {
                    objJ2 = rih1Var;
                }
                return objJ2 == d9nVar ? d9nVar : rih1Var;
            case 10:
                boolean z12 = this.b;
                if (z12) {
                    if (z12) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                this.b = true;
                fns fnsVar = igu.a;
                Object objY = fn31.Y(b3s.c, new og5((zn6) obj2, (lnm) null, (byte) 2), this);
                return objY == d9nVar ? d9nVar : objY;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                boolean z13 = this.b;
                if (z13) {
                    if (z13) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                q88 q88Var = (q88) obj2;
                dv9 dv9Var = q88Var.c;
                v88 v88Var = q88Var.e;
                ph1 ph1Var = v88Var.a;
                boolean z14 = v88Var.b;
                this.b = true;
                Object objA2 = dv9Var.a(ph1Var, z14, this);
                return objA2 == d9nVar ? d9nVar : objA2;
            case grn1.d /* 12 */:
                boolean z15 = this.b;
                if (z15) {
                    if (z15) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                qc8 qc8Var = (qc8) obj2;
                v0e0 v0e0Var = qc8Var.c;
                String str8 = qc8Var.b.a;
                this.b = true;
                Object objB = v0e0Var.b(str8, this);
                return objB == d9nVar ? d9nVar : objB;
            case 13:
                boolean z16 = this.b;
                if (!z16) {
                    hm5.M(obj);
                    ce8 ce8Var = (ce8) obj2;
                    fta ftaVar = ce8Var.d;
                    String str9 = ce8Var.b.a;
                    Single singleOnErrorReturnItem = new MaybeToSingle(((hmd) ftaVar.c).a().timeout(((n54) ftaVar.e).a(), TimeUnit.MILLISECONDS, (Scheduler) ftaVar.d).filter(new twb(ftaVar, b2)).f(new hdn1((byte) 2, ftaVar, str9)), ftaVar.t(str9)).onErrorReturnItem(ftaVar.t(str9));
                    this.b = true;
                    obj = fc11.j(singleOnErrorReturnItem, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z16) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return obj;
            case 14:
                boolean z17 = this.b;
                if (z17) {
                    if (z17) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ca9 ca9Var = (ca9) obj2;
                fv9 fv9Var = ca9Var.d;
                boolean z18 = ca9Var.b.b;
                this.b = true;
                Object objB2 = fv9Var.b(z18, this);
                return objB2 == d9nVar ? d9nVar : objB2;
            case 15:
                boolean z19 = this.b;
                if (z19) {
                    if (z19) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                dua duaVar = (dua) obj2;
                ic9 ic9Var = duaVar.c;
                boolean z20 = duaVar.e.b;
                this.b = true;
                Object objE = ic9Var.e(z20, this);
                return objE == d9nVar ? d9nVar : objE;
            case 16:
                boolean z21 = this.b;
                if (z21) {
                    if (z21) {
                        hm5.M(obj);
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                ezc ezcVarG = yoi1.g((Observable) ((ic9) obj2).c);
                this.b = true;
                obj = b5p1.k(ezcVarG, this);
                if (obj == d9nVar) {
                    return d9nVar;
                }
                String str10 = (String) obj;
                if (str10 != null) {
                    return f4i1.f("spotify:user:", Uri.encode(str10), ":blocked");
                }
                return null;
            case 17:
                boolean z22 = this.b;
                if (z22) {
                    if (z22) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                opb opbVar = (opb) ((fqb) obj2).b;
                this.b = true;
                Object objB3 = opbVar.b(this);
                return objB3 == d9nVar ? d9nVar : objB3;
            case 18:
                wje wjeVar = (wje) obj2;
                boolean z23 = this.b;
                if (z23) {
                    if (z23) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                sje sjeVar = wjeVar.d;
                d0r d0rVarC = cwl1.C(wjeVar.c);
                zje zjeVar = wjeVar.b;
                String str11 = zjeVar.a;
                String str12 = zjeVar.b;
                this.b = true;
                Object objA3 = sjeVar.a(d0rVarC, str11, str12, this);
                return objA3 == d9nVar ? d9nVar : objA3;
            case 19:
                boolean z24 = this.b;
                if (!z24) {
                    hm5.M(obj);
                    this.b = true;
                    Object objT = ((kp5) obj2).t(this);
                    return objT == d9nVar ? d9nVar : objT;
                }
                if (z24) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                eme emeVar = (eme) obj2;
                boolean z25 = this.b;
                if (z25) {
                    if (z25) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ule uleVar = emeVar.g;
                d0r d0rVarC2 = cwl1.C(emeVar.f);
                String str13 = emeVar.b.a;
                this.b = true;
                Object objA4 = uleVar.a(d0rVarC2, str13, this);
                return objA4 == d9nVar ? d9nVar : objA4;
            case 21:
                boolean z26 = this.b;
                if (z26) {
                    if (z26) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                rqe rqeVar = (rqe) obj2;
                q8n q8nVar = rqeVar.N0;
                qqe qqeVar = new qqe(rqeVar, str, b2);
                this.b = true;
                return fn31.Y(q8nVar, qqeVar, this) == d9nVar ? d9nVar : rih1Var;
            case 22:
                boolean z27 = this.b;
                if (z27) {
                    if (z27) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                eve eveVar = (eve) obj2;
                bfd bfdVar = eveVar.a;
                String str14 = eveVar.b.a;
                Integer num = new Integer(20);
                this.b = true;
                Object objS = bfdVar.s(str14, num, this);
                return objS == d9nVar ? d9nVar : objS;
            case 23:
                boolean z28 = this.b;
                if (z28) {
                    if (z28) {
                        hm5.M(obj);
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                bfd bfdVar2 = ((y9f) obj2).a;
                this.b = true;
                obj = b5p1.i(bfdVar2.A(), this);
                if (obj == d9nVar) {
                    return d9nVar;
                }
                x7d x7dVar = (z7d) obj;
                if (u890.j(x7dVar, y7d.a)) {
                    return new r9f((ArrayList) null, 1, 6);
                }
                if (u890.j(x7dVar, w7d.a)) {
                    return new r9f((ArrayList) null, 3, 6);
                }
                if (x7dVar instanceof x7d) {
                    return new r9f(x7dVar.a, 2, 4);
                }
                eg.o();
                return null;
            case 24:
                boolean z29 = this.b;
                if (z29) {
                    if (z29) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                yaf yafVar = (yaf) obj2;
                g1e0 g1e0Var = yafVar.f;
                String str15 = yafVar.d.b;
                this.b = true;
                Object objA5 = g1e0Var.a(str15, this);
                return objA5 == d9nVar ? d9nVar : objA5;
            case 25:
                boolean z30 = this.b;
                if (z30) {
                    if (z30) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                em0 em0Var = ((uff) obj2).f;
                this.b = true;
                Object objY2 = fn31.Y((q8n) em0Var.t, new naf(em0Var, (lnm) null), this);
                return objY2 == d9nVar ? d9nVar : objY2;
            case 26:
                yhf yhfVar = (yhf) obj2;
                boolean z31 = this.b;
                if (z31) {
                    if (z31) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bfd bfdVar3 = (bfd) yhfVar.a.get();
                String str16 = yhfVar.c.a;
                this.b = true;
                Object objD = bfdVar3.d(str16, this);
                return objD == d9nVar ? d9nVar : objD;
            case 27:
                nmf nmfVar = (nmf) obj2;
                boolean z32 = this.b;
                if (z32) {
                    if (z32) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bfd bfdVar4 = (bfd) nmfVar.a.get();
                String str17 = nmfVar.c.a;
                this.b = true;
                Object objD2 = bfdVar4.d(str17, this);
                return objD2 == d9nVar ? d9nVar : objD2;
            case 28:
                smf smfVar = (smf) obj2;
                boolean z33 = this.b;
                if (z33) {
                    if (z33) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bfd bfdVar5 = (bfd) smfVar.a.get();
                String str18 = smfVar.c.a;
                this.b = true;
                Object objD3 = bfdVar5.d(str18, this);
                return objD3 == d9nVar ? d9nVar : objD3;
            default:
                boolean z34 = this.b;
                if (z34) {
                    if (z34) {
                        hm5.M(obj);
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                x1g x1gVar = (x1g) obj2;
                bza0 bza0Var = x1gVar.c;
                b2g b2gVar = x1gVar.a;
                String str19 = b2gVar.a;
                Boolean bool = b2gVar.b;
                this.b = true;
                obj = bza0Var.b(str19, bool, this);
                if (obj == d9nVar) {
                    return d9nVar;
                }
                u1f0 u1f0Var = (u1f0) obj;
                if (u1f0Var != null) {
                    return u1f0Var;
                }
                eg.m("Child login options unavailable");
                return null;
        }
    }
}
