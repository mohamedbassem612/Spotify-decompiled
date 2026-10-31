package p;

import android.view.View;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureLatest;
import io.reactivex.rxjava3.processors.BehaviorProcessor;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gik1 {
    public final iac0 a;
    public final b2r0 b;
    public final kly0 c;

    public gik1(iac0 iac0Var, b2r0 b2r0Var, b2p b2pVar, fza fzaVar) {
        this.a = iac0Var;
        this.b = b2r0Var;
        this.c = b2pVar;
    }

    public static void b(View view) {
        view.setTag(2131431638, "TAG_CONTAINER_VIEW");
    }

    public final dik1 a(View view, Function0 function0) {
        vik1 vik1Var = (vik1) this.c.get();
        b2r0 b2r0Var = this.b;
        csj1 csj1Var = new csj1(new f3h1(b2r0Var, b2r0Var, b2r0Var), (byte) 1);
        BehaviorProcessor behaviorProcessor = new BehaviorProcessor();
        eik1 eik1Var = new eik1(behaviorProcessor, vik1Var);
        this.a.getLifecycle().a(eik1Var);
        p811 p811Var = new p811();
        vik1Var.getClass();
        vik1Var.e(view, new g4k1(p811Var, this, view), new FlowableOnBackpressureLatest(behaviorProcessor.t(Functions.a)), new hij1(csj1Var, function0, (byte) 16), (r1t) null);
        fik1 fik1Var = new fik1(vik1Var, (byte) 0);
        view.addOnLayoutChangeListener(fik1Var);
        return new dik1(this, eik1Var, vik1Var, view, fik1Var);
    }
}
