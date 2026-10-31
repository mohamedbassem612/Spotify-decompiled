package p;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Looper;
import com.spotify.music.SpotifyMainActivity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yym0 implements bi0 {
    public final Activity a;
    public final idd1 b = new idd1(new zem0(this, (byte) 5));

    public yym0(Activity activity) {
        this.a = activity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.bi0
    public final void a(Intent intent) {
        Activity activity = this.a;
        if (activity.isDestroyed()) {
            n57.e("Activity is destroyed, you cannot call startActivity on it. Could you be using this API from a ViewModel to navigate to " + intent.getData() + "?");
            return;
        }
        n57.j(u890.j(Looper.myLooper(), Looper.getMainLooper()), "Starting an activity off the main thread is not safe and may lead to crashes or weird behaviour. Navigation target: " + intent.getData());
        if (!(activity instanceof SpotifyMainActivity) || !u890.j(Looper.myLooper(), Looper.getMainLooper()) || !b(intent)) {
            activity.runOnUiThread(new jyh0(this, intent, (byte) 3));
        } else {
            dem1.v();
            ((SpotifyMainActivity) activity).onNewIntent(intent);
        }
    }

    public final boolean b(Intent intent) {
        ComponentName component = intent.getComponent();
        idd1 idd1Var = this.b;
        Activity activity = this.a;
        if (component != null) {
            return u890.j(activity.getComponentName(), component) || u890.j((ComponentName) idd1Var.getValue(), component);
        }
        ResolveInfo resolveInfoResolveActivity = activity.getPackageManager().resolveActivity(intent, 65536);
        if (resolveInfoResolveActivity == null) {
            return false;
        }
        ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
        ComponentName componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
        return u890.j(activity.getComponentName(), componentName) || u890.j((ComponentName) idd1Var.getValue(), componentName);
    }
}
