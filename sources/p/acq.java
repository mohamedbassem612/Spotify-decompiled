package p;

import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class acq {
    public final /* synthetic */ r7q a;

    public acq(r7q r7qVar) {
        this.a = r7qVar;
    }

    public final re10 a(String str, r6h1 r6h1Var, iu30 iu30Var) {
        r7q r7qVar = this.a;
        daq daqVar = r7qVar.b;
        gw70 gw70Var = (gw70) daqVar.d8.get();
        v5n v5nVar = (v5n) daqVar.Pb.get();
        teq teqVar = r7qVar.d;
        ll3 ll3Var = new ll3(teqVar.O1, teqVar.P1);
        daq daqVar2 = teqVar.d;
        return new re10(gw70Var, v5nVar, new qe10(new l6s(ll3Var, (j0n1) daqVar2.a.n3.get(), (ov20) daqVar2.P5.get()), (z5s) daqVar2.Tl.get(), (q8n) daqVar2.E1.get()), (bcq) teqVar.Jd.get(), (Scheduler) daqVar.z1.get(), (Scheduler) daqVar.r3.get(), str, r6h1Var, iu30Var);
    }
}
