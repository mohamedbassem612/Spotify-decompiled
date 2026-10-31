package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableScanSeed;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class e72 implements o5s {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e72(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void onStart(iac0 iac0Var) {
        jl8 jl8Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                eyh0 eyh0Var = ((g72) obj).e;
                ycc1 ycc1Var = (ycc1) eyh0Var.d;
                fn31.T((llm) ycc1Var.c, (o8n) null, 0, new qm(ycc1Var, (lnm) null, (byte) 4), 3);
                i72 i72Var = (i72) eyh0Var.b;
                if (i72Var.a) {
                    ao0.c((ao0) eyh0Var.c, co0.FOREGROUNDED, i72Var.b, 0L, (String) null, (String) null, (String) null, (String) null, 96);
                    return;
                }
                return;
            case 1:
                gjb gjbVar = (gjb) obj;
                gjbVar.b.c(new s10(gjbVar, (byte) 17));
                return;
            case 2:
                ((f4h1) obj).start();
                return;
            case 3:
                k0d0 k0d0Var = (k0d0) obj;
                xab1 xab1Var = k0d0Var.f;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                k0d0Var.f = fn31.T(smo1.e(k0d0Var.e), (o8n) null, 0, new mx(k0d0Var, (lnm) null, (byte) 28), 3);
                return;
            case 4:
                ywv0 ywv0Var = (ywv0) ((p1f0) obj).f;
                if (ywv0Var == null) {
                    u890.C("sessionContraption");
                    throw null;
                }
                lb61 lb61Var = (lb61) ywv0Var.a;
                if (lb61Var != null && (jl8Var = lb61Var.a) != null && (!(jl8Var instanceof gl8) || eth.C((xm41) ((kly0) ywv0Var.c).get()))) {
                    ((kdn0) ywv0Var.f).m(jl8Var);
                }
                rku rkuVar = (rku) ywv0Var.g;
                Flowable flowableH = Flowable.h((Flowable) ((idd1) ywv0Var.h).getValue(), (Flowable) ((idd1) ywv0Var.i).getValue(), xpv0.f);
                ks21 ks21Var = new ks21(ywv0Var, (byte) 14);
                flowableH.getClass();
                rkuVar.b(new FlowableScanSeed(flowableH, Functions.h(il8.a), ks21Var).L((Scheduler) ((kly0) ywv0Var.d).get()).subscribe(new tr41(ywv0Var, (byte) 4)));
                return;
            case 5:
                g2z g2zVar = (g2z) obj;
                k561 k561Var = (k561) g2zVar.d;
                k561Var.disable();
                ((rku) g2zVar.e).b(k561Var.b.r(1000L, Schedulers.b).t(Functions.a).x(new ewn0(g2zVar, (byte) 7)).subscribe(new lrj0(g2zVar, (byte) 22)));
                k561Var.enable();
                return;
            case 6:
                ((z4p0) obj).a();
                return;
            case 7:
                ((pbq) obj).z0();
                return;
            case 8:
                ((kdn0) ((r961) obj).c).m(li61.a);
                return;
            default:
                f4h1 f4h1Var = ((kw81) obj).a;
                if (f4h1Var != null) {
                    f4h1Var.start();
                    return;
                }
                return;
        }
    }

    public final void onStop(iac0 iac0Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                eyh0 eyh0Var = ((g72) obj).e;
                ycc1 ycc1Var = (ycc1) eyh0Var.d;
                fn31.T((llm) ycc1Var.c, (o8n) null, 0, new mx(ycc1Var, (lnm) null, (byte) 1), 3);
                i72 i72Var = (i72) eyh0Var.b;
                if (i72Var.a) {
                    ao0.c((ao0) eyh0Var.c, co0.BACKGROUNDED, i72Var.b, 0L, (String) null, (String) null, (String) null, (String) null, 96);
                    return;
                }
                return;
            case 1:
                gjb gjbVar = (gjb) obj;
                gjbVar.b.c(new g54(gjbVar, (byte) 2));
                return;
            case 2:
                ((f4h1) obj).stop();
                return;
            case 3:
                xab1 xab1Var = ((k0d0) obj).f;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                    return;
                }
                return;
            case 4:
                ywv0 ywv0Var = (ywv0) ((p1f0) obj).f;
                if (ywv0Var == null) {
                    u890.C("sessionContraption");
                    throw null;
                }
                ((rku) ywv0Var.g).a();
                ((kdn0) ywv0Var.f).m(il8.a);
                return;
            case 5:
                g2z g2zVar = (g2z) obj;
                ((k561) g2zVar.d).disable();
                ((rku) g2zVar.e).a();
                return;
            case 6:
                ((z4p0) obj).a();
                return;
            case 7:
                ((pbq) obj).z0();
                return;
            case 8:
                ((kdn0) ((r961) obj).c).m(li61.b);
                return;
            default:
                f4h1 f4h1Var = ((kw81) obj).a;
                if (f4h1Var != null) {
                    f4h1Var.stop();
                    return;
                }
                return;
        }
    }
}
