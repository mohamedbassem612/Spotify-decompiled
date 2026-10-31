package p;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Button;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pn20 extends BroadcastReceiver {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Button b;

    public /* synthetic */ pn20(Button button, byte b) {
        this.a = b;
        this.b = button;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        byte b = this.a;
        Button button = this.b;
        switch (b) {
            case 0:
                s8p1.J(new l7m0((byte) 3), button);
                break;
            default:
                s8p1.J(new l7m0((byte) 3), button);
                break;
        }
    }
}
