package p;

import android.app.Activity;
import android.content.Intent;
import android.provider.CalendarContract;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hi1 implements Consumer {
    public final /* synthetic */ byte a;
    public final Activity b;

    public hi1(Activity activity) {
        this.a = (byte) 0;
        this.b = activity;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        Activity activity = this.b;
        switch (b) {
            case 0:
                wzd0 wzd0Var = ((uwd0) obj).b;
                String str = wzd0Var.a;
                String str2 = wzd0Var.b;
                String str3 = wzd0Var.c;
                long j = wzd0Var.d;
                activity.startActivity(new Intent("android.intent.action.INSERT").setData(CalendarContract.Events.CONTENT_URI).putExtra("title", str).putExtra("description", str2).putExtra("eventLocation", str3).putExtra("beginTime", j).putExtra("endTime", j + 4500000).putExtra("availability", 0));
                break;
            case 1:
                e630.b(activity, ((z4x0) obj).d, k1x0.e);
                break;
            default:
                e630.b(activity, ((a9x0) obj).c, k1x0.Z);
                break;
        }
    }

    public /* synthetic */ hi1(e630 e630Var, Activity activity, byte b) {
        this.a = b;
        this.b = activity;
    }
}
