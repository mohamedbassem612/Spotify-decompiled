package p;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class jw9 extends BroadcastReceiver {
    public final Handler a;

    public /* synthetic */ jw9() {
        this(fmv.Z.b());
    }

    public abstract void a(Context context, Intent intent);

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.post(new hw9(this, context, intent, goAsync(), (byte) 1));
    }

    public jw9(Handler handler) {
        this.a = handler;
    }
}
