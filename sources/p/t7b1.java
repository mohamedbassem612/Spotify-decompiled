package p;

import android.appwidget.AppWidgetManager;
import android.widget.RemoteViews;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class t7b1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ RemoteViews b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t7b1(RemoteViews remoteViews, byte b) {
        super(2);
        this.a = b;
        this.b = remoteViews;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        RemoteViews remoteViews = this.b;
        switch (b) {
            case 0:
                ((AppWidgetManager) obj).partiallyUpdateAppWidget((int[]) obj2, remoteViews);
                break;
            default:
                ((AppWidgetManager) obj).updateAppWidget((int[]) obj2, remoteViews);
                break;
        }
        return rih1Var;
    }
}
