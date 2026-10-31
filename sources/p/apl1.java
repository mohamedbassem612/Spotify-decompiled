package p;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.spotify.widgets.npvwidget.PlaybackCommandHandlerService;
import com.spotify.widgets.npvwidget.WidgetInteraction;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class apl1 {
    public static final x60 a = new x60("widget_category");
    public static final x60 b = new x60("widget_interaction");
    public static final x60 c = new x60("deeplink_path");

    public static final Bundle a() {
        if (Build.VERSION.SDK_INT >= 26) {
            return ActivityOptions.makeBasic().setLaunchDisplayId(0).toBundle();
        }
        return null;
    }

    public static final Object b(scn0 scn0Var, x60 x60Var) {
        Object obj = scn0Var.a.get(x60Var);
        if (obj != null) {
            return obj;
        }
        n57.e("[DynamicNpvWidget] " + x60Var + " missing from ActionParameters");
        return null;
    }

    public static final void c(Context context, WidgetInteraction widgetInteraction, String str) {
        Intent intent = new Intent(context, (Class<?>) PlaybackCommandHandlerService.class);
        intent.setAction("com.spotify.widgets.widgets.ACTION_PLAYBACK_COMMAND");
        intent.putExtra("com.spotify.widgets.npvwidget.EXTRA_WIDGET_INTERACTION", widgetInteraction);
        intent.putExtra("com.spotify.widgets.npvwidget.EXTRA_WIDGET_CATEGORY", str);
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }
}
