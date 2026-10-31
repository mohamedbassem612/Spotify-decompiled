package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;
import p.awl1;
import p.qs10;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    static {
        qs10.c("RescheduleReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        qs10 qs10VarA = qs10.a();
        Objects.toString(intent);
        qs10VarA.getClass();
        try {
            awl1 awl1VarD = awl1.d(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            awl1VarD.getClass();
            synchronized (awl1.m) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = awl1VarD.i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    awl1VarD.i = pendingResultGoAsync;
                    if (awl1VarD.h) {
                        pendingResultGoAsync.finish();
                        awl1VarD.i = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException unused) {
            qs10.a().getClass();
        }
    }
}
