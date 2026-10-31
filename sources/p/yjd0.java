package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.rx3.RxConnectables;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.functions.ObjectHelper;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFlattenIterable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableScanSeed;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yjd0 implements dwo {
    public final dzp0 a;
    public final MobiusLoop.Controller b;

    public yjd0(x5u x5uVar, dzp0 dzp0Var, kkd0 kkd0Var, ikp ikpVar) {
        this.a = dzp0Var;
        if (!((Boolean) x5uVar.invoke()).booleanValue()) {
            if (((qq4) ikpVar.get()).f()) {
                MobiusLoop.Controller controllerA = Mobius.a(l1d.g(Mobius.d(ikd0.a, RxConnectables.a(kkd0Var.c))).h(n3o1.w(kkd0Var.a, kkd0Var.b.a())), iyt0.a, hkd0.a);
                controllerA.c(hqd.c);
                controllerA.start();
                this.b = controllerA;
                return;
            }
            return;
        }
        rku rkuVar = (rku) dzp0Var.d;
        Flowable flowable = (Flowable) dzp0Var.b;
        c4s0 c4s0Var = new c4s0(d4s0.a);
        yla ylaVar = new yla(dzp0Var, (byte) 19);
        flowable.getClass();
        FlowableScanSeed flowableScanSeed = new FlowableScanSeed(flowable, Functions.h(c4s0Var), ylaVar);
        f4s0 f4s0Var = f4s0.b;
        jma jmaVar = new jma();
        ObjectHelper.a(2, "prefetch");
        rkuVar.b(new FlowableFlattenIterable(flowableScanSeed, jmaVar).subscribe(new ixp0(dzp0Var, (byte) 12), zzc0.Z0));
    }

    @Override // p.dwo
    public final void shutdown() {
        ((rku) this.a.d).a();
        MobiusLoop.Controller controller = this.b;
        if (controller != null) {
            controller.stop();
            controller.disconnect();
        }
    }
}
