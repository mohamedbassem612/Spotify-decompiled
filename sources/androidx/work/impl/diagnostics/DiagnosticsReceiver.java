package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import p.awl1;
import p.ciq0;
import p.qs10;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    static {
        qs10.c("DiagnosticsRcvr");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        qs10.a().getClass();
        try {
            awl1.d(context).a(new ciq0(DiagnosticsWorker.class).b());
        } catch (IllegalStateException unused) {
            qs10.a().getClass();
        }
    }
}
