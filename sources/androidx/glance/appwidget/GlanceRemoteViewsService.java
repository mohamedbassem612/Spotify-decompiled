package androidx.glance.appwidget;

import android.content.Intent;
import android.widget.RemoteViewsService;
import kotlin.Metadata;
import p.cuw;
import p.eg;
import p.it40;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/glance/appwidget/GlanceRemoteViewsService;", "Landroid/widget/RemoteViewsService;", "<init>", "()V", "p/it40", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GlanceRemoteViewsService extends RemoteViewsService {
    public static final cuw a = new cuw((byte) 2);

    @Override // android.widget.RemoteViewsService
    public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        int intExtra = intent.getIntExtra("appWidgetId", -1);
        if (intExtra == -1) {
            eg.m("No app widget id was present in the intent");
            return null;
        }
        int intExtra2 = intent.getIntExtra("androidx.glance.widget.extra.view_id", -1);
        if (intExtra2 == -1) {
            eg.m("No view id was present in the intent");
            return null;
        }
        String stringExtra = intent.getStringExtra("androidx.glance.widget.extra.size_info");
        if (stringExtra != null && stringExtra.length() != 0) {
            return new it40(this, intExtra, intExtra2, stringExtra);
        }
        eg.m("No size info was present in the intent");
        return null;
    }
}
