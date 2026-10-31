package p;

import android.os.Handler;
import android.os.Message;
import com.comscore.Analytics;
import com.comscore.PublisherConfiguration;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wbh implements Handler.Callback {
    public final kly0 a;
    public final ubh b;
    public Handler c;
    public boolean d;
    public boolean e;
    public boolean f;

    public wbh(nxo nxoVar, nxo nxoVar2) {
        this.a = nxoVar2;
        this.b = (ubh) nxoVar.get();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (!this.f) {
            return true;
        }
        int i = message.what;
        if (i == 0) {
            vbh vbhVar = (vbh) this.b;
            Analytics.getConfiguration().addClient(new PublisherConfiguration.Builder().publisherId("15654041").build());
            Analytics.getConfiguration().setUsagePropertiesAutoUpdateMode(cy8.a(sbh.a).intValue());
            Analytics.start(vbhVar.a);
            return true;
        }
        if (i == 1) {
            Analytics.notifyUxActive();
            this.d = true;
            return true;
        }
        if (i == 2) {
            Analytics.notifyUxInactive();
            this.d = false;
            return true;
        }
        if (i == 3) {
            Analytics.notifyEnterForeground();
            return true;
        }
        if (i == 4) {
            Analytics.notifyExitForeground();
            return true;
        }
        n57.m("Unexpected message " + i);
        return true;
    }
}
