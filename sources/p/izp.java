package p;

import com.spotify.engagesdk.engagerecommendationscluster.EngageRecommendationsClusterBroadcastReceiver;
import com.spotify.musicappplatform.state.pendingintentreceiver.PendingIntentBroadcastReceiver;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class izp implements dl4, oud0 {
    public final /* synthetic */ byte a;
    public final daq b;

    public /* synthetic */ izp(daq daqVar, byte b) {
        this.a = b;
        this.b = daqVar;
    }

    public lud0 a() {
        return new lud0(new af80((gw70) this.b.d8.get()), (byte) 0);
    }

    public void w(Object obj) {
        byte b = this.a;
        daq daqVar = this.b;
        switch (b) {
            case 1:
                EngageRecommendationsClusterBroadcastReceiver engageRecommendationsClusterBroadcastReceiver = (EngageRecommendationsClusterBroadcastReceiver) obj;
                engageRecommendationsClusterBroadcastReceiver.c = vj3.q(daqVar.u());
                engageRecommendationsClusterBroadcastReceiver.b = (r0z0) daqVar.dl.get();
                break;
            default:
                PendingIntentBroadcastReceiver pendingIntentBroadcastReceiver = (PendingIntentBroadcastReceiver) obj;
                pendingIntentBroadcastReceiver.b = (zn41) daqVar.Zl.get();
                pendingIntentBroadcastReceiver.a = (zn41) daqVar.am.get();
                break;
        }
    }

    public /* synthetic */ izp(daq daqVar, teq teqVar, byte b) {
        this.a = b;
        this.b = daqVar;
    }
}
