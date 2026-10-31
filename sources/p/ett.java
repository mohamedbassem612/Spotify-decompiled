package p;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.work.WorkerParameters;
import com.spotify.base.java.logging.Logger;
import com.spotify.eventsender.musicintegration.eventsenderworker.EventSenderWorker;
import com.spotify.oopsplatform.appintegration.DiagnosticReportUploadWorker;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import java.io.File;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ett extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ett(los losVar, boolean z, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 28;
        this.c = losVar;
        this.b = z;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return new ett(obj2, lnmVar, (byte) 0);
            case 1:
                return new ett(obj2, lnmVar, (byte) 1);
            case 2:
                return new ett(obj2, lnmVar, (byte) 2);
            case 3:
                ett ettVar = new ett(obj2, lnmVar, (byte) 3);
                ettVar.b = ((Boolean) obj).booleanValue();
                return ettVar;
            case 4:
                return new ett(obj2, lnmVar, (byte) 4);
            case 5:
                return new ett(obj2, lnmVar, (byte) 5);
            case 6:
                return new ett(obj2, lnmVar, (byte) 6);
            case 7:
                return new ett(obj2, lnmVar, (byte) 7);
            case 8:
                return new ett(this.b, (vqv) obj2, lnmVar);
            case 9:
                return new ett(obj2, lnmVar, (byte) 9);
            case 10:
                return new ett(obj2, lnmVar, (byte) 10);
            case 11:
                return new ett(obj2, lnmVar, (byte) 11);
            case 12:
                return new ett(obj2, lnmVar, (byte) 12);
            case 13:
                return new ett(obj2, lnmVar, (byte) 13);
            case 14:
                return new ett(obj2, lnmVar, (byte) 14);
            case 15:
                return new ett(obj2, lnmVar, (byte) 15);
            case 16:
                return new ett(obj2, lnmVar, (byte) 16);
            case 17:
                return new ett(obj2, lnmVar, (byte) 17);
            case 18:
                return new ett(obj2, lnmVar, (byte) 18);
            case 19:
                return new ett(obj2, lnmVar, (byte) 19);
            case 20:
                return new ett(obj2, lnmVar, (byte) 20);
            case 21:
                return new ett(obj2, lnmVar, (byte) 21);
            case 22:
                return new ett(obj2, lnmVar, (byte) 22);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new ett(obj2, lnmVar, (byte) 23);
            case 24:
                return new ett(obj2, lnmVar, (byte) 24);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new ett(obj2, lnmVar, (byte) 25);
            case 26:
                return new ett(obj2, lnmVar, (byte) 26);
            case 27:
                return new ett(obj2, lnmVar, (byte) 27);
            case 28:
                return new ett((los) obj2, this.b, lnmVar);
            default:
                return new ett(obj2, lnmVar, (byte) 29);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        Object obj3 = this.c;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return ((ett) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 1:
                return ((ett) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 2:
                return ((ett) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((ett) create(bool, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case 4:
                ((ett) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return d9nVar;
            case 5:
                return ((ett) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 6:
                return ((ett) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 7:
                return ((ett) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 8:
                ((ett) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case 9:
                return ((ett) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 10:
                String str = ((gq0) obj).a;
                return new ett(obj3, (lnm) obj2, (byte) 10).invokeSuspend(rih1Var);
            case 11:
                String str2 = ((gq0) obj).a;
                return new ett(obj3, (lnm) obj2, (byte) 11).invokeSuspend(rih1Var);
            case 12:
                return ((ett) create((Intent) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 13:
                return ((ett) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 14:
                return ((ett) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 15:
                return ((ett) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 16:
                return ((ett) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 17:
                return ((ett) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 18:
                ((ett) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return d9nVar;
            case 19:
                return ((ett) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 20:
                return ((ett) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 21:
                return ((ett) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 22:
                return ((ett) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return ((ett) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 24:
                return ((ett) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return ((ett) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 26:
                return ((ett) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 27:
                return ((ett) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 28:
                ((ett) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                return ((ett) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        cx80 cx80Var;
        byte b = this.a;
        byte b2 = 6;
        byte b3 = 25;
        d9n d9nVar = rih1.a;
        d9n d9nVar2 = d9n.a;
        Object obj2 = this.c;
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
                aje0 aje0Var = ((gtt) obj2).a;
                this.b = true;
                Object objD = aje0Var.d(this);
                return objD == d9nVar2 ? d9nVar2 : objD;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    Object objI = b5p1.i((any) obj2, this);
                    return objI == d9nVar2 ? d9nVar2 : objI;
                }
                if (z2) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                DiagnosticReportUploadWorker diagnosticReportUploadWorker = (DiagnosticReportUploadWorker) obj2;
                Context context = ((z8d0) diagnosticReportUploadWorker).a;
                ro30 ro30Var = diagnosticReportUploadWorker.l;
                boolean z3 = this.b;
                try {
                    if (!z3) {
                        hm5.M(obj);
                        WorkerParameters workerParameters = ((z8d0) diagnosticReportUploadWorker).b;
                        UUID uuid = workerParameters.a;
                        new Integer(workerParameters.c);
                        if (Build.VERSION.SDK_INT >= 36) {
                            SharedPreferences sharedPreferences = context.getSharedPreferences("com.spotify.oops", 0);
                            sharedPreferences.getBoolean("AndroidProfilingEnabledFromRCProperty", false);
                            if (sharedPreferences.getBoolean("DiagnosticReportUploadEnabledFromRCProperty", false)) {
                                w5b1 w5b1Var = (w5b1) diagnosticReportUploadWorker.j.get();
                                nfa0 nfa0Var = (nfa0) diagnosticReportUploadWorker.k.get();
                                nfa0Var.getClass();
                                tjq tjqVar = new tjq(new z320(new File(context.getFilesDir(), "diagnostic_reports"), nfa0Var), new zur(new poj0(w5b1Var.d, w5b1Var.c, nfa0Var), ro30Var), diagnosticReportUploadWorker.i, ro30Var);
                                this.b = true;
                                obj = fn31.Y((q8n) tjqVar.d, new zi3(tjqVar, null), this);
                                if (obj == d9nVar2) {
                                    return d9nVar2;
                                }
                            }
                        }
                        return y8d0.a();
                    }
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    int iOrdinal = ((i1u) obj).ordinal();
                    if (iOrdinal == 0) {
                        return y8d0.a();
                    }
                    if (iOrdinal == 1) {
                        ro30Var.t("Finished processing available diagnostic reports");
                        return y8d0.a();
                    }
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ro30Var.t("Diagnostic report processing needs another attempt");
                    return new w8d0();
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    ro30Var.t("Diagnostic report worker failed due to " + e2.getClass().getSimpleName() + "; processing will be retried");
                    Logger.d("Diagnostic report worker failed (%s)", new Object[]{e2.getClass().getSimpleName()});
                    return new w8d0();
                }
            case 3:
                boolean z4 = this.b;
                hm5.M(obj);
                if (!z4 && (cx80Var = ((qmu) obj2).d) != null) {
                    cx80Var.cancel();
                }
                return d9nVar;
            case 4:
                boolean z5 = this.b;
                try {
                    if (!z5) {
                        hm5.M(obj);
                        this.b = true;
                        hap1.f(this);
                        return d9nVar2;
                    }
                    if (!z5) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    throw new KotlinNothingValueException();
                } catch (Throwable th) {
                    ((suu) obj2).f.a();
                    throw th;
                }
            case 5:
                bbv bbvVar = (bbv) obj2;
                boolean z6 = this.b;
                if (z6) {
                    if (z6) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                jge jgeVarE = hu20.e(new pzs(rqt0.u(yoi1.g(bbvVar.b.a(true))), bbvVar, (byte) 12), new uls((lnm) null, bbvVar, (byte) 6));
                skr skrVar = new skr(bbvVar, (byte) 21);
                this.b = true;
                Object objCollect = jgeVarE.collect(new inu((vr20) skrVar, (byte) 15), this);
                if (objCollect != d9nVar2) {
                    objCollect = d9nVar;
                }
                return objCollect == d9nVar2 ? d9nVar2 : d9nVar;
            case 6:
                boolean z7 = this.b;
                if (!z7) {
                    hm5.M(obj);
                    mr20 mr20Var = ((mnk0) ((jl1) obj2).d).a;
                    this.b = true;
                    obj = b5p1.i(mr20Var, this);
                    if (obj == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (!z7) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return Boolean.valueOf(((ibk0) obj).b());
            case 7:
                boolean z8 = this.b;
                if (!z8) {
                    hm5.M(obj);
                    f1n0 f1n0Var = ((vpv) obj2).a;
                    this.b = true;
                    return f1n0Var.a(this) == d9nVar2 ? d9nVar2 : d9nVar;
                }
                if (z8) {
                    hm5.M(obj);
                    return d9nVar;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                hm5.M(obj);
                if (this.b) {
                    ((vqv) obj2).b.b();
                }
                return d9nVar;
            case 9:
                boolean z9 = this.b;
                if (z9) {
                    if (z9) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                sqw sqwVar = (sqw) obj2;
                u601 u601Var = sqwVar.l;
                if (u601Var == null) {
                    return d9nVar;
                }
                nnu nnuVar = new nnu((Object) sqwVar, lnmVar, (byte) 14);
                this.b = true;
                return u601Var.b(nnuVar, this) == d9nVar2 ? d9nVar2 : d9nVar;
            case 10:
                boolean z10 = this.b;
                if (z10) {
                    if (z10) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bpb1 bpb1Var = (bpb1) ((r0x) obj2).h;
                Boolean bool = Boolean.TRUE;
                this.b = true;
                bpb1Var.emit(bool, this);
                return d9nVar == d9nVar2 ? d9nVar2 : d9nVar;
            case 11:
                boolean z11 = this.b;
                if (z11) {
                    if (z11) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bpb1 bpb1Var2 = (bpb1) ((vgr) obj2).g;
                Boolean bool2 = Boolean.TRUE;
                this.b = true;
                bpb1Var2.emit(bool2, this);
                return d9nVar == d9nVar2 ? d9nVar2 : d9nVar;
            case 12:
                boolean z12 = this.b;
                if (z12) {
                    if (z12) {
                        hm5.M(obj);
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                this.b = true;
                obj = b5p1.i(((x5x) obj2).a.a("employee", false), this);
                if (obj == d9nVar2) {
                    return d9nVar2;
                }
                if (!((Boolean) obj).booleanValue()) {
                    return crn0.a;
                }
                return null;
            case 13:
                uux uuxVar = (uux) obj2;
                boolean z13 = this.b;
                if (z13) {
                    if (z13) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarJ = o4p1.j(uuxVar.O0.c(), 2, 2);
                skr skrVar2 = new skr(uuxVar, (byte) 22);
                this.b = true;
                return mr20VarJ.collect(skrVar2, this) == d9nVar2 ? d9nVar2 : d9nVar;
            case 14:
                boolean z14 = this.b;
                if (!z14) {
                    hm5.M(obj);
                    this.b = true;
                    return ((t24) obj2).h(0.0f, this) == d9nVar2 ? d9nVar2 : d9nVar;
                }
                if (z14) {
                    hm5.M(obj);
                    return d9nVar;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                y0y y0yVar = (y0y) obj2;
                boolean z15 = this.b;
                if (z15) {
                    if (z15) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                FlowableMap flowableMap = y0yVar.i;
                vbm[] vbmVarArr = q601.a;
                plu pluVarW = rqt0.w(new kge(flowableMap), s8x.c1, rqt0.b);
                skr skrVar3 = new skr(y0yVar, (byte) 23);
                this.b = true;
                return pluVarW.collect(skrVar3, this) == d9nVar2 ? d9nVar2 : d9nVar;
            case 16:
                boolean z16 = this.b;
                if (z16) {
                    if (z16) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarU = rqt0.u(new xs4(((ov20) obj2).a, "dj-voice-commentary", b2));
                this.b = true;
                Object objI2 = b5p1.i(mr20VarU, this);
                return objI2 == d9nVar2 ? d9nVar2 : objI2;
            case 17:
                g9r g9rVar = (g9r) obj2;
                boolean z17 = this.b;
                if (z17) {
                    if (z17) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                lt20 lt20VarV = aqo1.v((Flowable) g9rVar.c);
                skr skrVar4 = new skr(g9rVar, (byte) 25);
                this.b = true;
                return lt20VarV.collect(skrVar4, this) == d9nVar2 ? d9nVar2 : d9nVar;
            case 18:
                boolean z18 = this.b;
                if (z18) {
                    if (!z18) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        hm5.M(obj);
                    }
                    return null;
                }
                hm5.M(obj);
                zcy zcyVar = (zcy) obj2;
                zob1 zob1Var = zcyVar.b;
                skr skrVar5 = new skr(zcyVar, (byte) 26);
                this.b = true;
                if (zob1Var.collect(skrVar5, this) == d9nVar2) {
                    return d9nVar2;
                }
                jah.d();
                return null;
            case 19:
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
                fdc fdcVar = (fdc) obj2;
                String str = ((vqy) fdcVar.c).a;
                this.b = true;
                Object objI0 = fdcVar.i0(str, this);
                return objI0 == d9nVar2 ? d9nVar2 : objI0;
            case 20:
                buy buyVar = (buy) obj2;
                boolean z20 = this.b;
                if (!z20) {
                    hm5.M(obj);
                    vvu vvuVar = new vvu(d3p1.F((d0r) buyVar.e.invoke(), buyVar.i, buyVar.d), (byte) 11);
                    this.b = true;
                    obj = b5p1.i(vvuVar, this);
                    if (obj == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (!z20) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                Object obj3 = ((e331) obj).a;
                Throwable thA = e331.a(obj3);
                if (thA != null) {
                    buyVar.h(thA);
                    return d9nVar;
                }
                buyVar.g.l((gwq) obj3);
                buyVar.i();
                return d9nVar;
            case 21:
                boolean z21 = this.b;
                if (z21) {
                    if (z21) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                aod aodVar = (aod) ((lgy) obj2).i;
                this.b = true;
                Object objJ = aodVar.j(this);
                return objJ == d9nVar2 ? d9nVar2 : objJ;
            case 22:
                boolean z22 = this.b;
                if (!z22) {
                    hm5.M(obj);
                    this.b = true;
                    if (hap1.i(500L, this) == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (!z22) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((tau0) ((sfz) obj2).d.b).a().a(new g9u0("ereader", false)).subscribe(mux0.T0, mux0.U0);
                return d9nVar;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                itz itzVar = (itz) obj2;
                boolean z23 = this.b;
                if (z23) {
                    if (z23) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                lt20 lt20Var = new lt20(new pzs(new m441(new ymu(itzVar, lnmVar, b3)), itzVar, (byte) 28), new rf2(3, (lnm) null, (byte) 17), (byte) 0);
                skr skrVar6 = new skr(itzVar, (byte) 28);
                this.b = true;
                return lt20Var.collect(skrVar6, this) == d9nVar2 ? d9nVar2 : d9nVar;
            case 24:
                boolean z24 = this.b;
                if (!z24) {
                    hm5.M(obj);
                    this.b = true;
                    Object objK = b5p1.k((evz) obj2, this);
                    return objK == d9nVar2 ? d9nVar2 : objK;
                }
                if (z24) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
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
                ezc ezcVarG = yoi1.g(((EventSenderWorker) obj2).r.a.map(xi10.Q0).distinctUntilChanged());
                afv afvVar = new afv(2, (lnm) null, (byte) 9);
                this.b = true;
                Object objL = b5p1.l(ezcVarG, afvVar, this);
                return objL == d9nVar2 ? d9nVar2 : objL;
            case 26:
                el00 el00Var = (el00) obj2;
                boolean z26 = this.b;
                if (z26) {
                    if (z26) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p811 p811VarU = cy30.u(obj);
                mr20 mr20VarU2 = rqt0.u(el00Var.t.f());
                cl00 cl00Var = new cl00(p811VarU, el00Var);
                this.b = true;
                return mr20VarU2.collect(cl00Var, this) == d9nVar2 ? d9nVar2 : d9nVar;
            case 27:
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
                Single singleJ = ((y210) obj2).a.j(y210.c);
                this.b = true;
                Object objJ2 = fc11.j(singleJ, this);
                return objJ2 == d9nVar2 ? d9nVar2 : objJ2;
            case 28:
                hm5.M(obj);
                ((los) obj2).a(this.b ? ixb.b : ixb.a);
                return d9nVar;
            default:
                boolean z28 = this.b;
                if (z28) {
                    if (z28) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ew6 ew6Var = ((uy10) obj2).d;
                this.b = true;
                Object objInvoke = ew6Var.invoke(this);
                return objInvoke == d9nVar2 ? d9nVar2 : objInvoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ett(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ett(boolean z, vqv vqvVar, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 8;
        this.b = z;
        this.c = vqvVar;
    }
}
