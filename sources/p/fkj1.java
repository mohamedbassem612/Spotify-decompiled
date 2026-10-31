package p;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.widgets.npvwidget.WidgetsProxyActivity;
import com.spotify.widgets.npvwidget.t;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableAndThenCompletable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableDetach;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fkj1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fkj1(q9l1 q9l1Var, boolean z, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 12;
        this.c = q9l1Var;
        this.b = z;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return new fkj1(obj2, lnmVar, (byte) 0);
            case 1:
                return new fkj1(obj2, lnmVar, (byte) 1);
            case 2:
                return new fkj1(obj2, lnmVar, (byte) 2);
            case 3:
                return new fkj1(obj2, lnmVar, (byte) 3);
            case 4:
                return new fkj1(obj2, lnmVar, (byte) 4);
            case 5:
                return new fkj1(obj2, lnmVar, (byte) 5);
            case 6:
                return new fkj1(obj2, lnmVar, (byte) 6);
            case 7:
                return new fkj1(obj2, lnmVar, (byte) 7);
            case 8:
                return new fkj1(obj2, lnmVar, (byte) 8);
            case 9:
                return new fkj1(obj2, lnmVar, (byte) 9);
            case 10:
                return new fkj1(obj2, lnmVar, (byte) 10);
            case 11:
                return new fkj1(obj2, lnmVar, (byte) 11);
            case 12:
                return new fkj1((q9l1) obj2, this.b, lnmVar);
            case 13:
                return new fkj1(obj2, lnmVar, (byte) 13);
            case 14:
                return new fkj1(obj2, lnmVar, (byte) 14);
            case 15:
                return new fkj1(obj2, lnmVar, (byte) 15);
            case 16:
                return new fkj1(obj2, lnmVar, (byte) 16);
            case 17:
                return new fkj1(obj2, lnmVar, (byte) 17);
            case 18:
                return new fkj1(obj2, lnmVar, (byte) 18);
            case 19:
                return new fkj1(obj2, lnmVar, (byte) 19);
            case 20:
                return new fkj1(obj2, lnmVar, (byte) 20);
            case 21:
                return new fkj1(obj2, lnmVar, (byte) 21);
            case 22:
                return new fkj1(obj2, lnmVar, (byte) 22);
            case 23:
                return new fkj1(obj2, lnmVar, (byte) 23);
            case 24:
                return new fkj1(obj2, lnmVar, (byte) 24);
            case 25:
                return new fkj1(obj2, lnmVar, (byte) 25);
            case 26:
                return new fkj1(obj2, lnmVar, (byte) 26);
            case 27:
                return new fkj1(obj2, lnmVar, (byte) 27);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return new fkj1(obj2, lnmVar, (byte) 28);
            default:
                return new fkj1(obj2, lnmVar, (byte) 29);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invoke(Object obj, Object obj2) throws KotlinNothingValueException {
        byte b = this.a;
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
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
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
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((rvo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Type inference failed for: r13v22, types: [android.app.Activity, com.spotify.widgets.npvwidget.WidgetsProxyActivity] */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        bpb1 bpb1Var;
        Object objZ0;
        hwe0 hwe0Var;
        Object objK;
        Object objA;
        byte b = this.a;
        byte b2 = 2;
        byte b3 = 0;
        rih1 rih1Var = rih1.a;
        rih1 rih1Var2 = d9n.a;
        Object obj2 = this.c;
        byte b4 = 1;
        lnm lnmVar = null;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                e821 e821Var = (e821) obj2;
                this.b = true;
                ohd ohdVar = new ohd(1, aym.t(this));
                ohdVar.t();
                xae xaeVar = (xae) e821Var.d;
                hij1 hij1Var = new hij1(e821Var, ohdVar, b4);
                efr efrVar = xaeVar.b;
                Activity activity = xaeVar.a;
                String string = activity.getString(2131955020);
                String string2 = activity.getString(2131955018);
                String string3 = activity.getString(2131955017);
                String string4 = activity.getString(2131955016);
                if (!((zb4) xaeVar.c.b).a()) {
                    mw40 mw40VarT = yoi1.T(activity, string, string2);
                    mw40VarT.e = true;
                    mw40VarT.f = new vae((Object) hij1Var, (byte) 14);
                    ekj1 ekj1Var = new ekj1(hij1Var, b3);
                    mw40VarT.a = string3;
                    mw40VarT.c = ekj1Var;
                    ekj1 ekj1Var2 = new ekj1(hij1Var, b4);
                    mw40VarT.b = string4;
                    mw40VarT.d = ekj1Var2;
                    mw40VarT.b().b();
                } else if (efrVar.c()) {
                    dkj1 dkj1Var = new dkj1(hij1Var, b3);
                    z50 z50Var = z50.c;
                    oqo1.t((Activity) efrVar.b, new fhx(string, string2, new ygx(string3, new gbx(z50Var, dkj1Var)), new ygx(string4, new gbx(z50Var, new dkj1(hij1Var, b4))), new dkj1(hij1Var, b2), null, 80));
                } else {
                    hij1Var.invoke(h331.c);
                }
                Object objR = ohdVar.r();
                return objR == rih1Var2 ? rih1Var2 : objR;
            case 1:
                amj1 amj1Var = (amj1) obj2;
                roc0 roc0Var = amj1Var.c;
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
                mr20 mr20VarU = rqt0.u(h5p1.s(rqt0.u(new x010(rqt0.u(new vlj1(amj1Var.d.a, amj1Var, (byte) 0)), rqt0.u(new xlj1(roc0Var.d(), amj1Var, b3)), new irp0(3, (lnm) null, (byte) 26), (byte) 1)), rqt0.u(new cly0(d3p1.F(amj1Var.a, amj1Var.h, rih1Var), (byte) 20)), rqt0.u(new xlj1(roc0Var.d(), amj1Var, b4)), new kg10(amj1Var, (lnm) null, (byte) 1)));
                bda1 bda1Var = new bda1(amj1Var, (byte) 21);
                this.b = true;
                return mr20VarU.collect(bda1Var, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 2:
                ioj1 ioj1Var = (ioj1) obj2;
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Flowable flowableH = Flowable.h(ioj1Var.a, ioj1Var.b.a().toFlowable(BackpressureStrategy.d), hgx0.W0);
                flowableH.getClass();
                FlowableDistinctUntilChanged flowableDistinctUntilChangedT = flowableH.t(Functions.a);
                vbm[] vbmVarArr = q601.a;
                mr20 mr20VarR = o4p1.r(new kge(flowableDistinctUntilChangedT), ioj1Var.t);
                vi viVar = new vi(ioj1Var, (byte) 20);
                this.b = true;
                return mr20VarR.collect(viVar, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 3:
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
                zoj1 zoj1Var = (zoj1) obj2;
                q881 q881Var = ((zda) zoj1Var).c;
                if (q881Var == null) {
                    return rih1Var;
                }
                dec decVar = zoj1Var.j.d;
                this.b = true;
                decVar.f(q881Var, rih1Var);
                return rih1Var == rih1Var2 ? rih1Var2 : rih1Var;
            case 4:
                qu2 qu2Var = (qu2) obj2;
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
                jge jgeVarC = hu20.c(hu20.e(rqt0.u(new vlj1((kge) qu2Var.e, qu2Var, (byte) 1)), new afb1((lnm) null, qu2Var, (byte) 13)), new gqj1(qu2Var, lnmVar, b3));
                ft1 ft1Var = ft1.g;
                this.b = true;
                return jgeVarC.collect(ft1Var, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 5:
                upy0 upy0Var = (upy0) obj2;
                aj4 aj4Var = (aj4) upy0Var.h;
                boolean z6 = this.b;
                if (z6) {
                    if (z6) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                hqp0 hqp0Var = (hqp0) upy0Var.e;
                int iK = aj4Var.k();
                int iL = aj4Var.l();
                int iM = aj4Var.m();
                boolean zH = aj4Var.h();
                this.b = true;
                Object objY = fn31.Y(hqp0Var.e, new gqp0(hqp0Var, iK, iL, zH, iM, (lnm) null), this);
                if (objY != rih1Var2) {
                    objY = rih1Var;
                }
                return objY == rih1Var2 ? rih1Var2 : rih1Var;
            case 6:
                boolean z7 = this.b;
                if (z7) {
                    if (z7) {
                        throw l1d.v(obj);
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                yuj1 yuj1Var = (yuj1) obj2;
                r091 r091Var = yuj1Var.l;
                if (r091Var == null || (bpb1Var = r091Var.g) == null) {
                    return rih1Var;
                }
                bda1 bda1Var2 = new bda1(yuj1Var, (byte) 23);
                this.b = true;
                bpb1Var.collect(bda1Var2, this);
                return rih1Var2;
            case 7:
                boolean z8 = this.b;
                if (z8) {
                    if (z8) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20Var = ((pck1) obj2).f;
                this.b = true;
                Object objI = b5p1.i(mr20Var, this);
                return objI == rih1Var2 ? rih1Var2 : objI;
            case 8:
                boolean z9 = this.b;
                if (!z9) {
                    hm5.M(obj);
                    whk1 whk1Var = new whk1(2, null, (byte) 0);
                    this.b = true;
                    return ((u601) obj2).b(whk1Var, this) == rih1Var2 ? rih1Var2 : rih1Var;
                }
                if (z9) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                x2l1 x2l1Var = (x2l1) obj2;
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
                j810 j810Var = x2l1Var.l;
                mr20 mr20VarR2 = o4p1.r(f5p1.m(j810Var.b, rc11.a.b(h810.class)), j810Var.a);
                bda1 bda1Var3 = new bda1(x2l1Var, (byte) 24);
                this.b = true;
                return mr20VarR2.collect(bda1Var3, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 10:
                c5l1 c5l1Var = (c5l1) obj2;
                boolean z11 = this.b;
                if (!z11) {
                    hm5.M(obj);
                    this.b = true;
                    Set set = c5l1.S1;
                    objZ0 = c5l1Var.Z0(this);
                    if (objZ0 == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z11) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objZ0 = obj;
                }
                fn2 fn2Var = (fn2) objZ0;
                if (fn2Var != null) {
                    c5l1Var.Y0().c(new djt(fn2Var.a, fn2Var.b), new ifl1((Object) null, (byte) 25), true);
                    return rih1Var;
                }
                Set set2 = c5l1.S1;
                CompositeDisposable compositeDisposable = c5l1Var.P1;
                Intent intent = c5l1Var.N0().getIntent();
                Uri data = intent.getData();
                CompletableFromAction completableFromAction = CompletableEmpty.a;
                if (data != null && myo1.q(data)) {
                    completableFromAction = new CompletableFromAction(new dkb1(myo1.s(data), c5l1Var, (byte) 10));
                } else if (kbb.I(c5l1Var.N0().getIntent()) && (hwe0Var = (hwe0) ila0.s(intent, "child_credentials", hwe0.class)) != null) {
                    kg0.e(c5l1Var.Y0(), new yit(new g3f0(hwe0Var.a, hwe0Var.b), bk8.i, (n5o) null, 12), new ifl1((Object) null, (byte) 25));
                }
                if (intent.getStringExtra("graduation_token") != null) {
                    String stringExtra = intent.getStringExtra("graduation_token");
                    if (stringExtra == null) {
                        return rih1Var;
                    }
                    CompletableAndThenCompletable completableAndThenCompletableC = new CompletableFromAction(new dkb1(c5l1Var, stringExtra, (byte) 11)).c(completableFromAction);
                    Scheduler scheduler = c5l1Var.I1;
                    if (scheduler != null) {
                        compositeDisposable.b(new CompletableDetach(completableAndThenCompletableC.n(scheduler)).subscribe());
                        return rih1Var;
                    }
                    u890.C("mainScheduler");
                    throw null;
                }
                a1g a1gVar = c5l1Var.K1;
                if (a1gVar == null) {
                    u890.C("childInitiatedAuthSessionManager");
                    throw null;
                }
                boolean z12 = a1gVar.b() != null;
                boolean z13 = intent.getData() == null || o7h.i0(c5l1.S1, intent.getDataString());
                if (z12 && z13) {
                    CompletableAndThenCompletable completableAndThenCompletableC2 = new CompletableFromAction(new b5l1(c5l1Var, (byte) 0)).c(completableFromAction);
                    Scheduler scheduler2 = c5l1Var.I1;
                    if (scheduler2 != null) {
                        compositeDisposable.b(new CompletableDetach(completableAndThenCompletableC2.n(scheduler2)).subscribe());
                        return rih1Var;
                    }
                    u890.C("mainScheduler");
                    throw null;
                }
                a1g a1gVar2 = c5l1Var.K1;
                if (a1gVar2 == null) {
                    u890.C("childInitiatedAuthSessionManager");
                    throw null;
                }
                a1gVar2.a();
                if (intent.getBooleanExtra("extra_start_on_login", false)) {
                    CompletableAndThenCompletable completableAndThenCompletableC3 = new CompletableFromAction(new b5l1(c5l1Var, (byte) 1)).c(completableFromAction);
                    Scheduler scheduler3 = c5l1Var.I1;
                    if (scheduler3 != null) {
                        compositeDisposable.b(new CompletableDetach(completableAndThenCompletableC3.n(scheduler3)).subscribe());
                        return rih1Var;
                    }
                    u890.C("mainScheduler");
                    throw null;
                }
                CompletableAndThenCompletable completableAndThenCompletableC4 = new CompletableFromAction(new djg0(c5l1Var, myo1.r(intent.getData()))).c(completableFromAction);
                Scheduler scheduler4 = c5l1Var.I1;
                if (scheduler4 != null) {
                    compositeDisposable.b(new CompletableDetach(completableAndThenCompletableC4.n(scheduler4)).subscribe());
                    return rih1Var;
                }
                u890.C("mainScheduler");
                throw null;
            case 11:
                boolean z14 = this.b;
                if (!z14) {
                    hm5.M(obj);
                    ecl eclVar = ((h5l1) obj2).b;
                    this.b = true;
                    return eclVar.a(this) == rih1Var2 ? rih1Var2 : rih1Var;
                }
                if (z14) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                hm5.M(obj);
                ((q9l1) obj2).j.m((Object) null, Boolean.valueOf(this.b));
                return rih1Var;
            case 13:
                boolean z15 = this.b;
                if (!z15) {
                    hm5.M(obj);
                    this.b = true;
                    if (hap1.i(300L, this) == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z15) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((bih1) ((sd5) obj2).e).k();
                return rih1Var;
            case 14:
                err0 err0Var = (hdn0) obj2;
                boolean z16 = this.b;
                if (!z16) {
                    hm5.M(obj);
                    this.b = true;
                    if (hap1.i(300L, this) == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z16) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ydh.m(err0Var, 1);
                return rih1Var;
            case 15:
                y250 y250Var = (y250) obj2;
                boolean z17 = this.b;
                if (!z17) {
                    hm5.M(obj);
                    mr20 mr20VarD = y250Var.d();
                    this.b = true;
                    objK = b5p1.k(mr20VarD, this);
                    if (objK == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z17) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objK = obj;
                }
                j2s0 j2s0Var = (l2s0) objK;
                if (j2s0Var == null || !(j2s0Var instanceof j2s0)) {
                    return rih1Var;
                }
                lag lagVar = y250Var.c;
                fn31.T((u9c0) lagVar.c, (o8n) null, 0, new hff(lagVar, e3s0.e, j2s0Var.a, (lnm) null, (byte) 20), 3);
                return rih1Var;
            case 16:
                mgl1 mgl1Var = (mgl1) obj2;
                boolean z18 = this.b;
                try {
                    if (z18) {
                        if (z18) {
                            hm5.M(obj);
                            return rih1Var;
                        }
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    phl1 phl1Var = mgl1Var.b;
                    dt71 dt71Var = phl1Var.c.c() ? phl1Var.d : r6x.a;
                    bda1 bda1Var4 = new bda1(mgl1Var, (byte) 28);
                    this.b = true;
                    return dt71Var.collect(bda1Var4, this) == rih1Var2 ? rih1Var2 : rih1Var;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    th.toString();
                    return rih1Var;
                }
            case 17:
                xjl1 xjl1Var = (xjl1) obj2;
                bpb1 bpb1Var2 = xjl1Var.c;
                boolean z19 = this.b;
                if (!z19) {
                    hm5.M(obj);
                    Logger.g("WebView startup starting", new Object[0]);
                    this.b = true;
                    objA = xjl1Var.a(this);
                    if (objA == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z19) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objA = ((e331) obj).a;
                }
                Throwable thA = e331.a(objA);
                if (thA == null) {
                    bpb1Var2.getClass();
                    bpb1Var2.m((Object) null, akl1.a);
                    Logger.g("WebView startup completed", new Object[0]);
                    return rih1Var;
                }
                yjl1 yjl1Var = new yjl1(thA);
                bpb1Var2.getClass();
                bpb1Var2.m((Object) null, yjl1Var);
                Logger.e(thA, "WebView startup failed", new Object[0]);
                return rih1Var;
            case 18:
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
                eol1 eol1Var = (eol1) obj2;
                dt71 dt71Var2 = eol1Var.b.f;
                vi viVar2 = new vi(eol1Var, (byte) 21);
                this.b = true;
                dt71Var2.collect(new zmj1(viVar2, (byte) 23), this);
                return rih1Var2;
            case 19:
                npl1 npl1Var = (npl1) obj2;
                boolean z21 = this.b;
                if (z21) {
                    if (z21) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20Var2 = npl1Var.c;
                yy11 yy11Var = new yy11(b2, lnmVar, (byte) 8);
                bda1 bda1Var5 = new bda1(npl1Var, (byte) 29);
                this.b = true;
                Object objCollect = mr20Var2.collect(new wem((byte) 19, new l811(), yy11Var, bda1Var5), this);
                if (objCollect != rih1Var2) {
                    objCollect = rih1Var;
                }
                return objCollect == rih1Var2 ? rih1Var2 : rih1Var;
            case 20:
                ?? r13 = (WidgetsProxyActivity) obj2;
                boolean z22 = this.b;
                if (!z22) {
                    hm5.M(obj);
                    t tVar = r13.f1;
                    if (tVar == null) {
                        u890.C("intentHandler");
                        throw null;
                    }
                    Intent intent2 = r13.getIntent();
                    this.b = true;
                    if (tVar.c(intent2, this) == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z22) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                r13.finish();
                return rih1Var;
            case 21:
                boolean z23 = this.b;
                if (!z23) {
                    hm5.M(obj);
                    this.b = true;
                    Object objC = ((sxl1) obj2).c(this);
                    return objC == rih1Var2 ? rih1Var2 : objC;
                }
                if (z23) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 22:
                boolean z24 = this.b;
                try {
                    if (!z24) {
                        hm5.M(obj);
                        this.b = true;
                        if (((zyl1) obj2).a(this) == rih1Var2) {
                            rih1Var = rih1Var2;
                        }
                    } else {
                        if (!z24) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    return rih1Var;
                } catch (Exception unused) {
                    return rih1Var;
                }
            case 23:
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
                suh1 suh1Var = (suh1) obj2;
                ezc ezcVarG = yoi1.g(((hj91) suh1Var.f).d((String) suh1Var.d));
                ft1 ft1Var2 = ft1.i;
                this.b = true;
                return ezcVarG.collect(ft1Var2, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 24:
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
                ha4 ha4Var = ((m8m1) obj2).a;
                this.b = true;
                Object objA2 = ha4Var.a1.a(this);
                if (objA2 != rih1Var2) {
                    objA2 = rih1Var;
                }
                return objA2 == rih1Var2 ? rih1Var2 : rih1Var;
            case 25:
                qem1 qem1Var = (qem1) obj2;
                boolean z27 = this.b;
                if (!z27) {
                    hm5.M(obj);
                    this.b = true;
                    if (hap1.i(10000L, this) == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z27) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                if (((Boolean) qem1Var.h.getValue()).booleanValue()) {
                    return rih1Var;
                }
                qem1Var.g.m((Object) null, nem1.a);
                yo00 yo00Var = qem1Var.e;
                if (yo00Var == null) {
                    return rih1Var;
                }
                yo00Var.M(false);
                return rih1Var;
            case 26:
                boolean z28 = this.b;
                if (!z28) {
                    hm5.M(obj);
                    hj31 hj31Var = (hj31) ((qim1) obj2).d.get();
                    this.b = true;
                    return hj31Var.a(true, this) == rih1Var2 ? rih1Var2 : rih1Var;
                }
                if (z28) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 27:
                rim1 rim1Var = (rim1) obj2;
                boolean z29 = this.b;
                if (z29) {
                    if (z29) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                any anyVarW = zro1.w(rim1Var.c);
                tyl1 tyl1Var = new tyl1(rim1Var, (byte) 2);
                this.b = true;
                return anyVarW.collect(tyl1Var, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
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
                mr20 mr20Var3 = (mr20) ((d3s) ((ru9) obj2).c).invoke();
                this.b = true;
                Object objI2 = b5p1.i(mr20Var3, this);
                return objI2 == rih1Var2 ? rih1Var2 : objI2;
            default:
                boolean z31 = this.b;
                hm5.M(obj);
                if (z31) {
                    return rih1Var;
                }
                h8m1 h8m1Var = new h8m1((oao1) obj2, (lnm) null, (byte) 9);
                this.b = true;
                return smo1.s(h8m1Var, this) == rih1Var2 ? rih1Var2 : rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fkj1(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
    }
}
