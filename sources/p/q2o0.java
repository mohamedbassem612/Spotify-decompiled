package p;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class q2o0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Activity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2o0(o4o0 o4o0Var, Activity activity) {
        super(0);
        this.a = (byte) 1;
        this.b = activity;
    }

    public final Object invoke() {
        byte b = this.a;
        Activity activity = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(ag0.C0(activity, "android.permission.BLUETOOTH_CONNECT"));
            case 1:
                return Boolean.valueOf(Build.VERSION.SDK_INT >= 31 ? ag0.C0(activity, "android.permission.BLUETOOTH_CONNECT") : false);
            case 2:
                return new chy("offboard_new_episodes", "spotify:home?facet=podcasts-following-chip", activity.getString(2131964114), activity.getString(2131964118), activity.getString(2131964115), activity.getString(2131964116), activity.getString(2131964117), activity.getString(2131964113), 0);
            case 3:
                activity.startActivity(new Intent("android.settings.panel.action.INTERNET_CONNECTIVITY"));
                return rih1.a;
            case 4:
                return new chy("create_playlist", nik1.C1.a, activity.getString(2131964057), activity.getString(2131964058), activity.getString(2131964053), activity.getString(2131964054), activity.getString(2131964055), activity.getString(2131964056), null);
            default:
                return new chy("follow_podcast", nik1.M0.a, activity.getString(2131964080), activity.getString(2131964081), activity.getString(2131964078), activity.getString(2131964079), null, activity.getString(2131964073), null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q2o0(Activity activity, byte b) {
        super(0);
        this.a = b;
        this.b = activity;
    }
}
