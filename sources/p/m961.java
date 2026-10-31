package p;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class m961 {
    public static Intent a(Context context, String str) {
        return new Intent(str).setClassName(context, "com.spotify.musicappplatform.state.pendingintentreceiver.PendingIntentBroadcastReceiver");
    }
}
