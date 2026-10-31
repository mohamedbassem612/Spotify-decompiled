package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fo9 implements qac0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ fo9(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                ((rm9) ((ynb0) this.b).get()).m(8);
                break;
            default:
                Intent intent = new Intent("com.spotify.widgets.widgets.ACTION_END_SESSION");
                Context context = (Context) this.b;
                intent.setComponent(new ComponentName(context, "com.spotify.widgets.npvwidget.WidgetUpdateCoordinator"));
                context.sendBroadcast(intent);
                break;
        }
    }
}
