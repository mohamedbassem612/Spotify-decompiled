package p;

import android.content.Context;
import androidx.work.impl.WorkerStoppedException;
import com.google.protobuf.Empty;
import com.spotify.widget.widget.WidgetPickerService;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDefer;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFilter;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import spotify.restrictions.permissions.permissions_proto.PermissionsEsperanto;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vse0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vse0(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return new vse0((yse0) obj2, lnmVar, (byte) 0);
            case 1:
                return new vse0((iue0) obj2, lnmVar, (byte) 1);
            case 2:
                return new vse0((lnf0) obj2, lnmVar, (byte) 2);
            case 3:
                return new vse0((qug0) obj2, lnmVar, (byte) 3);
            case 4:
                return new vse0((m2o0) obj2, lnmVar, (byte) 4);
            case 5:
                return new vse0((g2z) obj2, lnmVar, (byte) 5);
            case 6:
                return new vse0((k4q0) obj2, lnmVar, (byte) 6);
            case 7:
                return new vse0((air0) obj2, lnmVar, (byte) 7);
            case 8:
                return new vse0((qns0) obj2, lnmVar, (byte) 8);
            case 9:
                return new vse0((w6u0) obj2, lnmVar, (byte) 9);
            case 10:
                return new vse0((ayh) obj2, lnmVar, (byte) 10);
            case 11:
                return new vse0((upy0) obj2, lnmVar, (byte) 11);
            case 12:
                return new vse0((k0z0) obj2, lnmVar, (byte) 12);
            case 13:
                return new vse0((ojz0) obj2, lnmVar, (byte) 13);
            case 14:
                return new vse0((hj01) obj2, lnmVar, (byte) 14);
            case 15:
                return new vse0((on01) obj2, lnmVar, (byte) 15);
            case 16:
                return new vse0((vr01) obj2, lnmVar, (byte) 16);
            case 17:
                return new vse0((hi11) obj2, lnmVar, (byte) 17);
            case 18:
                return new vse0((qn41) obj2, lnmVar, (byte) 18);
            case 19:
                return new vse0((fh81) obj2, lnmVar, (byte) 19);
            case 20:
                return new vse0((n381) obj2, lnmVar, (byte) 20);
            case 21:
                return new vse0((vi11) obj2, lnmVar, (byte) 21);
            case 22:
                return new vse0((WidgetPickerService) obj2, lnmVar, (byte) 22);
            case 23:
                return new vse0((sxl1) obj2, lnmVar, (byte) 23);
            default:
                return new vse0((m8m1) obj2, lnmVar, (byte) 24);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invoke(Object obj, Object obj2) throws KotlinNothingValueException {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((dr90) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 17:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 18:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 19:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case 20:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        qxl1 nxl1Var;
        byte b = this.a;
        byte b2 = 18;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.c;
        rih1 rih1Var2 = d9n.a;
        byte b3 = 1;
        lnm lnmVar = null;
        switch (b) {
            case 0:
                yse0 yse0Var = (yse0) obj2;
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                yj1 yj1Var = new yj1(yse0Var, (byte) 13);
                int i = Flowable.a;
                FlowableFilter flowableFilterX = new FlowableDefer(yj1Var).x(vf61.X0);
                vbm[] vbmVarArr = q601.a;
                mr20 mr20VarU = rqt0.u(new dy20(new kge(flowableFilterX), (byte) 7));
                cff cffVar = new cff(yse0Var, (byte) 13);
                this.b = true;
                return mr20VarU.collect(cffVar, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 1:
                iue0 iue0Var = (iue0) obj2;
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
                bpb1 bpb1VarF = iue0.e(iue0Var).F();
                cff cffVar2 = new cff(iue0Var, (byte) 14);
                this.b = true;
                bpb1VarF.collect(cffVar2, this);
                return rih1Var2;
            case 2:
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                zwz0 zwz0Var = ((lnf0) obj2).i;
                this.b = true;
                zwz0Var.getClass();
                Object objI = b5p1.i(zwz0Var.c(), this);
                return objI == rih1Var2 ? rih1Var2 : objI;
            case 3:
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                np61 np61Var = ((qug0) obj2).c;
                jx0 jx0Var = jx0.b;
                d3p1.z();
                jx0 jx0Var2 = jx0.b;
                this.b = true;
                Object objH = c921.H(np61Var.b, new lm61(np61Var, (lnm) null), this);
                return objH == rih1Var2 ? rih1Var2 : objH;
            case 4:
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                m2o0 m2o0Var = (m2o0) obj2;
                Context context = m2o0Var.e;
                this.b = true;
                v4o0 v4o0Var = m2o0Var.d;
                w0o0 w0o0Var = w0o0.a;
                Object objB = v4o0Var.b(new n4o0(l0o0.a, w0o1.s(w0o0Var, context, true), w0o1.t(w0o0Var, context, true)), this);
                if (objB != rih1Var2) {
                    objB = rih1Var;
                }
                return objB == rih1Var2 ? rih1Var2 : rih1Var;
            case 5:
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    this.b = true;
                    return g2z.t((g2z) obj2, this) == rih1Var2 ? rih1Var2 : rih1Var;
                }
                if (z6) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                boolean z7 = this.b;
                try {
                    if (!z7) {
                        hm5.M(obj);
                        this.b = true;
                        Object objB2 = ((k4q0) obj2).a.b(this);
                        if (objB2 != rih1Var2) {
                            objB2 = rih1Var;
                        }
                        if (objB2 == rih1Var2) {
                            rih1Var = rih1Var2;
                        }
                    } else {
                        if (!z7) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    return rih1Var;
                } catch (Exception unused) {
                    return rih1Var;
                }
            case 7:
                boolean z8 = this.b;
                if (z8) {
                    if (!z8) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        hm5.M(obj);
                    }
                    return null;
                }
                hm5.M(obj);
                air0 air0Var = (air0) obj2;
                ve01 ve01Var = air0Var.g;
                phr0 phr0Var = new phr0(air0Var.a.b(), (byte) 0);
                this.b = true;
                if (ve01Var.a.collect(phr0Var, this) == rih1Var2) {
                    return rih1Var2;
                }
                jah.d();
                return null;
            case 8:
                boolean z9 = this.b;
                if (!z9) {
                    hm5.M(obj);
                    jn7 jn7Var = ((qns0) obj2).b;
                    Empty empty = (Empty) Empty.o().build();
                    this.b = true;
                    obj = jn7Var.c(empty, this);
                    if (obj == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z9) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return sns0.a((PermissionsEsperanto.QueueQueryResponse) obj);
            case 9:
                w6u0 w6u0Var = (w6u0) obj2;
                boolean z10 = this.b;
                if (z10) {
                    if (z10) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Flowable flowableC = ((zeu0) w6u0Var.a.get()).c();
                vbm[] vbmVarArr2 = q601.a;
                lt20 lt20VarH = x4p1.h(new kge(flowableC), new kd3(3, lnmVar, b3));
                f3t0 f3t0Var = new f3t0(w6u0Var, (lnm) null, (byte) 15);
                this.b = true;
                return l4p1.q(lt20VarH, f3t0Var, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 10:
                boolean z11 = this.b;
                if (!z11) {
                    hm5.M(obj);
                    this.b = true;
                    Object objQ = ((ayh) obj2).Q(this);
                    return objQ == rih1Var2 ? rih1Var2 : objQ;
                }
                if (z11) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 11:
                upy0 upy0Var = (upy0) obj2;
                boolean z12 = this.b;
                if (z12) {
                    if (z12) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                m441 m441VarL = h4p1.l(new tya(o4p1.r(yoi1.g((ObservableSource) ((y170) upy0Var.X).invoke()), (q8n) upy0Var.Y), (lnm) null, (byte) 10));
                blr blrVar = new blr(upy0Var, lnmVar, b3);
                this.b = true;
                return l4p1.q(m441VarL, blrVar, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 12:
                k0z0 k0z0Var = (k0z0) obj2;
                boolean z13 = this.b;
                if (z13) {
                    if (z13) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                lt20 lt20VarH2 = x4p1.h(eth.V(k0z0.a(k0z0Var)), new xx0(k0z0Var, (lnm) null, (byte) 18));
                j0z0 j0z0Var = new j0z0(k0z0Var, (byte) 0);
                this.b = true;
                return lt20VarH2.collect(j0z0Var, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 13:
                ojz0 ojz0Var = (ojz0) obj2;
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
                mr20 mr20VarC = q1o1.c(ojz0Var.b, ojz0Var.c);
                cff cffVar3 = new cff(ojz0Var, b2);
                this.b = true;
                return mr20VarC.collect(cffVar3, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 14:
                boolean z15 = this.b;
                if (!z15) {
                    hm5.M(obj);
                    bbc bbcVar = ((hj01) obj2).f;
                    this.b = true;
                    return bbcVar.r(this) == rih1Var2 ? rih1Var2 : rih1Var;
                }
                if (z15) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                boolean z16 = this.b;
                if (!z16) {
                    hm5.M(obj);
                    xyc0 xyc0Var = ((on01) obj2).b;
                    this.b = true;
                    return xyc0Var.u("spotify:playlist:37i9dQZF1Fs6Dvo6yu9lo4", ddd1.V0, this) == rih1Var2 ? rih1Var2 : rih1Var;
                }
                if (z16) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 16:
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
                vr01 vr01Var = (vr01) obj2;
                xyc0 xyc0Var2 = vr01Var.d;
                String str = vr01Var.p;
                this.b = true;
                Object objU = xyc0Var2.u(str, ddd1.Y, this);
                return objU == rih1Var2 ? rih1Var2 : objU;
            case 17:
                hi11 hi11Var = (hi11) obj2;
                boolean z18 = this.b;
                if (z18) {
                    if (z18) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                lt20 lt20VarH3 = x4p1.h(new f5y0(yoi1.g(hi11Var.a.a()), hi11Var, (byte) 19), new ob00((byte) 26));
                cff cffVar4 = new cff(hi11Var, (byte) 19);
                this.b = true;
                return lt20VarH3.collect(cffVar4, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 18:
                boolean z19 = this.b;
                if (!z19) {
                    hm5.M(obj);
                    this.b = true;
                    ((qn41) obj2).a(this);
                    return rih1Var2;
                }
                if (z19) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 19:
                boolean z20 = this.b;
                if (z20) {
                    if (!z20) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        hm5.M(obj);
                    }
                    return null;
                }
                hm5.M(obj);
                fh81 fh81Var = (fh81) obj2;
                xe01 xe01Var = fh81Var.q1;
                cff cffVar5 = new cff(fh81Var, (byte) 20);
                this.b = true;
                if (xe01Var.a.collect(cffVar5, this) == rih1Var2) {
                    return rih1Var2;
                }
                jah.d();
                return null;
            case 20:
                boolean z21 = this.b;
                if (!z21) {
                    hm5.M(obj);
                    this.b = true;
                    return n381.a((n381) obj2, this) == rih1Var2 ? rih1Var2 : rih1Var;
                }
                if (z21) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 21:
                boolean z22 = this.b;
                if (!z22) {
                    hm5.M(obj);
                    this.b = true;
                    return vi11.g((vi11) obj2, this) == rih1Var2 ? rih1Var2 : rih1Var;
                }
                if (z22) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 22:
                WidgetPickerService widgetPickerService = (WidgetPickerService) obj2;
                boolean z23 = this.b;
                if (!z23) {
                    hm5.M(obj);
                    ghk1 ghk1VarC = widgetPickerService.c();
                    this.b = true;
                    obj = ghk1VarC.e(nmx0.c, this);
                    if (obj == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z23) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                if (((mys0) obj) == mys0.c) {
                    WidgetPickerService.b(widgetPickerService);
                }
                WidgetPickerService.a(widgetPickerService);
                return rih1Var;
            case 23:
                sxl1 sxl1Var = (sxl1) obj2;
                boolean z24 = this.b;
                try {
                    if (!z24) {
                        hm5.M(obj);
                        gaa0 gaa0Var = sxl1Var.k;
                        fkj1 fkj1Var = new fkj1(sxl1Var, (lnm) null, (byte) 21);
                        this.b = true;
                        obj = c921.H(gaa0Var, fkj1Var, this);
                        if (obj == rih1Var2) {
                            return rih1Var2;
                        }
                    } else {
                        if (!z24) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    nxl1Var = (qxl1) obj;
                    break;
                } catch (WorkerStoppedException e) {
                    nxl1Var = new pxl1(e.a);
                } catch (CancellationException unused2) {
                    nxl1Var = new nxl1();
                } catch (Throwable unused3) {
                    int i2 = txl1.a;
                    qs10.a().getClass();
                    nxl1Var = new nxl1();
                }
                return sxl1Var.g.r(new ww21(new p2r(nxl1Var, sxl1Var, (byte) 7), (byte) 1));
            default:
                boolean z25 = this.b;
                if (z25) {
                    if (z25) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ha4 ha4Var = ((m8m1) obj2).a;
                this.b = true;
                Object objC = ha4Var.Z0.c(this);
                if (objC != rih1Var2) {
                    objC = rih1Var;
                }
                return objC == rih1Var2 ? rih1Var2 : rih1Var;
        }
    }
}
