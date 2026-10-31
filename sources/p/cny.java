package p;

import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor$Companion;
import com.spotify.mobius.EventSource;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.coroutines.b;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cny {
    public final vx40 a;
    public final qzn0 b;
    public final dh30 c;
    public final q8n d;
    public final q8n e;
    public final myq0 f;
    public final ro30 g;
    public final l7m0 h;

    public cny(vx40 vx40Var, qzn0 qzn0Var, dh30 dh30Var, q8n q8nVar, q8n q8nVar2, myq0 myq0Var, ro30 ro30Var, l7m0 l7m0Var) {
        this.a = vx40Var;
        this.b = qzn0Var;
        this.c = dh30Var;
        this.d = q8nVar;
        this.e = q8nVar2;
        this.f = myq0Var;
        this.g = ro30Var;
        this.h = l7m0Var;
    }

    public final MobiusLoop a(wqn0 wqn0Var) {
        Observable observableD;
        any anyVar;
        goq goqVar = (goq) this.g.b;
        k84 k84Var = (k84) this.h.b;
        boolean zM = k84Var.m();
        char c = 1;
        boolean z = zM && !(wqn0Var instanceof tpn0);
        boolean zQ = k84Var.q();
        x3s x3sVar = new x3s(rqt0.u(new xow((kge) goqVar.h, goqVar, wqn0Var.getUri(), (byte) 1)), (byte) 28);
        x3s x3sVar2 = new x3s(rqt0.u(new xow((kge) goqVar.h, goqVar, wqn0Var.getUri(), (byte) 0)), (byte) 29);
        String uri = wqn0Var.getUri();
        if (nhc1.Y(uri, "spotify:artist:", false)) {
            observableD = ((dxz0) goqVar.e).e().distinctUntilChanged().switchMap(new otu(goqVar, uri, (byte) 14));
            observableD.getClass();
        } else {
            observableD = ((ki91) ((a710) goqVar.b).h.get()).d(uri);
        }
        Flowable flowable = observableD.observeOn((Scheduler) goqVar.f).map(new lhc(goqVar, (byte) 8)).distinctUntilChanged().toFlowable(BackpressureStrategy.d);
        vbm[] vbmVarArr = q601.a;
        any anyVar2 = new any(new kge(flowable), (byte) 0);
        if (z) {
            String uri2 = wqn0Var.getUri();
            c = 1;
            anyVar = new any(new lt20(rqt0.u(new i0h(new ks4(hu20.e(new huz(Collections.singleton(uri2), (byte) 10), new uls((lnm) null, (ye90) ((dg8) goqVar.d).b, (byte) 27)), uri2, (byte) 3), (byte) 25)), new cpw(uri2, null, (byte) 0), (byte) 0), (byte) 1);
        } else {
            anyVar = null;
        }
        mr20[] mr20VarArr = new mr20[4];
        mr20VarArr[0] = x3sVar;
        mr20VarArr[c] = x3sVar2;
        mr20VarArr[2] = anyVar2;
        mr20VarArr[3] = anyVar;
        List listI0 = f46.i0(mr20VarArr);
        drm1 drm1Var = new drm1((byte) 15);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        afy afyVar = new afy(this.b);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(tey.class), runSequentially.a(afyVar));
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially2 = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        dh30 dh30Var = this.c;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(vey.class), runSequentially2.a(new bfy(dh30Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(uey.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new cfy(dh30Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(wey.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new dfy(dh30Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(xey.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new efy(dh30Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(yey.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ffy()));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(rey.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new hfy(dh30Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(sey.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new jfy(this.a, this.f)));
        q8n q8nVar = this.e;
        MobiusLoop.Builder builderD = Mobius.d(drm1Var, new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI));
        FlowEventSources.Companion companion = FlowEventSources.a;
        mr20[] mr20VarArr2 = (mr20[]) listI0.toArray(new mr20[0]);
        mr20[] mr20VarArr3 = (mr20[]) Arrays.copyOf(mr20VarArr2, mr20VarArr2.length);
        companion.getClass();
        MobiusLoop.Builder builderD2 = builderD.c(new b(q8nVar, mr20VarArr3), new EventSource[0]).b(new fey(this, (byte) 1)).d(new lmw(this, (byte) 5));
        String uri3 = wqn0Var.getUri();
        boolean z2 = wqn0Var instanceof nqn0;
        nqn0 nqn0Var = z2 ? (nqn0) wqn0Var : null;
        String str = nqn0Var != null ? nqn0Var.b : null;
        nqn0 nqn0Var2 = z2 ? (nqn0) wqn0Var : null;
        return builderD2.a(new dny(uri3, str, nqn0Var2 != null ? nqn0Var2.b : null, (zM || zQ) ? new tqb1(z, null) : null, NativeMediaProcessor$Companion.PROCESS_SAMPLE_RESULT_NULL_PROCESS_BYTE_COUNTS), Collections.singleton(new sey(wqn0Var.getUri())));
    }
}
