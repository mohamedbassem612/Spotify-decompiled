package p;

import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import com.spotify.base.java.logging.Logger;
import com.spotify.interapp.service.service.AppProtocolRemoteService;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class aij0 implements IBinder.DeathRecipient {
    public final Messenger a = new Messenger((Handler) new kv5(this));
    public final Messenger b;
    public s24 c;
    public uk4 d;

    public aij0(Messenger messenger) {
        this.b = messenger;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        uk4 uk4Var = this.d;
        if (uk4Var != null) {
            AppProtocolRemoteService appProtocolRemoteService = (AppProtocolRemoteService) uk4Var.b;
            aos aosVar = (aos) uk4Var.c;
            int i = AppProtocolRemoteService.f1;
            Logger.g("Remote client died. Stop the session", new Object[0]);
            appProtocolRemoteService.e1.post(new iv5(appProtocolRemoteService, aosVar, (byte) 0));
        }
    }
}
