package p;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class k8n1 extends BroadcastReceiver {
    public Context a;
    public final a6n1 b;

    public k8n1(a6n1 a6n1Var) {
        this.b = a6n1Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            a6n1 a6n1Var = this.b;
            c8n1 c8n1Var = (c8n1) ((ni) a6n1Var.c).c;
            c8n1Var.c.set(null);
            jim0 jim0Var = c8n1Var.g.N0;
            jim0Var.sendMessage(jim0Var.obtainMessage(3));
            Dialog dialog = (Dialog) a6n1Var.b;
            if (dialog.isShowing()) {
                dialog.dismiss();
            }
            synchronized (this) {
                try {
                    Context context2 = this.a;
                    if (context2 != null) {
                        context2.unregisterReceiver(this);
                    }
                    this.a = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
