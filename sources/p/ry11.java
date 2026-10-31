package p;

import android.os.Build;
import android.os.OutcomeReceiver;
import android.util.Log;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ry11 implements OutcomeReceiver {
    public final /* synthetic */ mzc a;

    public ry11(mzc mzcVar) {
        this.a = mzcVar;
    }

    public final void onError(Throwable th) {
        th.toString();
        if (!Log.isLoggable("startRemoteActivity", 3)) {
            Build.TYPE.equals("user");
        }
        this.a.c(th);
    }

    public final void onResult(Object obj) {
        if (!Log.isLoggable("startRemoteActivity", 3)) {
            Build.TYPE.equals("user");
        }
        this.a.b((Object) null);
    }
}
