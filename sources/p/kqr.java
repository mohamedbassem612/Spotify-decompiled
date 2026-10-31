package p;

import io.reactivex.rxjava3.android.plugins.RxAndroidPlugins;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Scheduler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kqr extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nqr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kqr(nqr nqrVar, byte b) {
        super(0);
        this.a = b;
        this.b = nqrVar;
    }

    public final Object invoke() {
        byte b = this.a;
        nqr nqrVar = this.b;
        switch (b) {
            case 0:
                mqr mqrVar = nqrVar.e;
                if (mqrVar != null) {
                    mqrVar.a.invoke(can.a);
                }
                return rih1.a;
            default:
                iac0 iac0VarH = x9p1.h(nqrVar.f);
                x8c0 lifecycle = iac0VarH != null ? iac0VarH.getLifecycle() : null;
                h94 h94Var = nqrVar.c;
                if (h94Var == null) {
                    h94Var = new h94();
                }
                Scheduler scheduler = nqrVar.d;
                if (scheduler == null) {
                    scheduler = AndroidSchedulers.a;
                    RxAndroidPlugins.b(scheduler);
                }
                return lifecycle != null ? new a9c0(lifecycle, h94Var, scheduler) : new lw81(h94Var, scheduler);
        }
    }
}
