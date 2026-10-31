package androidx.glance.appwidget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import p.eg;
import p.u890;
import p.v9c;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/glance/appwidget/UnmanagedSessionReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "p/v9c", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UnmanagedSessionReceiver extends BroadcastReceiver {
    public static final v9c a = new v9c((byte) 28);
    public static final LinkedHashMap b = new LinkedHashMap();

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (u890.j(intent.getAction(), "ACTION_TRIGGER_LAMBDA")) {
            if (intent.getStringExtra("EXTRA_ACTION_KEY") == null) {
                eg.m("Intent is missing ActionKey extra");
                return;
            }
            int intExtra = intent.getIntExtra("EXTRA_APPWIDGET_ID", -1);
            if (intExtra != -1) {
                v9c.e(intExtra);
            } else {
                eg.m("Intent is missing AppWidgetId extra");
            }
        }
    }
}
