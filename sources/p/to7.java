package p;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class to7 extends BroadcastReceiver {
    public final so00 a;
    public final wdd1 b;
    public final /* synthetic */ rl1 c;

    public to7(rl1 rl1Var, wdd1 wdd1Var, so00 so00Var) {
        this.c = rl1Var;
        this.b = wdd1Var;
        this.a = so00Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.b.f(new fe(this, (byte) 8));
        }
    }
}
