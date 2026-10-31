package p;

import com.spotify.carmobile.wazesdk.navigation.WazeWakeUpReceiver;
import com.spotify.engagesdk.engagecontinuationcluster.EngageContinuationClusterBroadcastReceiver;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Optional;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b1q implements dl4, nud0 {
    public final /* synthetic */ byte a;
    public final daq b;

    public /* synthetic */ b1q(daq daqVar, byte b) {
        this.a = b;
        this.b = daqVar;
    }

    public oud0 g(q2p0 q2p0Var) {
        q2p0Var.getClass();
        return new izp(this.b, (byte) 3);
    }

    public void w(Object obj) {
        byte b = this.a;
        daq daqVar = this.b;
        switch (b) {
            case 1:
                EngageContinuationClusterBroadcastReceiver engageContinuationClusterBroadcastReceiver = (EngageContinuationClusterBroadcastReceiver) obj;
                engageContinuationClusterBroadcastReceiver.c = vj3.q(daqVar.u());
                engageContinuationClusterBroadcastReceiver.b = (r0z0) daqVar.fl.get();
                break;
            case 4:
                fso0 fso0Var = (fso0) obj;
                fso0Var.F1 = daqVar.A1();
                fso0Var.H1 = (twy0) daqVar.dg.get();
                fso0Var.G1 = (fxy0) daqVar.cg.get();
                break;
            case 6:
                h021 h021Var = (h021) obj;
                h021Var.Q1 = Optional.empty();
                h021Var.O1 = (Observable) daqVar.a.P5.get();
                h021Var.S1 = (Scheduler) daqVar.z1.get();
                h021Var.T1 = new c26(false, y16.b, z16.b, (tgp0) daqVar.o2.get(), (luk) daqVar.L1.get());
                h021Var.R1 = (luw0) daqVar.wi.get();
                h021Var.P1 = (Observable) daqVar.a.Q5.get();
                h021Var.M1 = (lw21) daqVar.L1.get();
                h021Var.N1 = (o241) daqVar.u4.get();
                break;
            default:
                ((WazeWakeUpReceiver) obj).b = daqVar.l2();
                break;
        }
    }

    public /* synthetic */ b1q(daq daqVar, dl4 dl4Var, byte b) {
        this.a = b;
        this.b = daqVar;
    }
}
