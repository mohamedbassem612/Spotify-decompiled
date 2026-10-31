package p;

import com.spotify.connect.mediarouteactivity.jam.OutputSwitcherJamLauncherActivity;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableElementAtSingle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class z0q implements dl4 {
    public final daq a;

    public /* synthetic */ z0q(daq daqVar) {
        this.a = daqVar;
    }

    public Scheduler a() {
        return (Scheduler) this.a.r3.get();
    }

    public Scheduler b() {
        return (Scheduler) this.a.A2.get();
    }

    public io91 c() {
        return (io91) this.a.Gr.get();
    }

    public vnd1 d() {
        daq daqVar = this.a;
        return new vnd1((a4q0) daqVar.Sp.get(), new drj0((kt91) daqVar.f8.get(), new lto((i8h1) daqVar.A5.get()), (byte) 27), (q8n) daqVar.w1.get(), (q8n) daqVar.E1.get());
    }

    public FlowableElementAtSingle e() {
        return ((Flowable) this.a.z2.get()).x(gtv0.g).J(hgx0.N0).z();
    }

    public void w(Object obj) {
        OutputSwitcherJamLauncherActivity outputSwitcherJamLauncherActivity = (OutputSwitcherJamLauncherActivity) obj;
        daq daqVar = this.a;
        ((mzo) outputSwitcherJamLauncherActivity).a1 = (jgu) daqVar.a.g0.get();
        outputSwitcherJamLauncherActivity.b1 = new ip31((owh0) daqVar.b4.get(), (g0l) daqVar.E5.get(), (zor) daqVar.V6.get(), (c9c0) daqVar.Ed.get(), rr90.x((mkp) daqVar.ie.get()), (q8n) daqVar.V2.get(), i1l.c((b8p) daqVar.f4.get()), daqVar.Oe);
    }

    public z0q(daq daqVar, teq teqVar) {
        this.a = daqVar;
    }
}
