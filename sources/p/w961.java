package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.spotify.base.java.logging.Logger;
import java.util.Random;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class w961 implements t961 {
    public final ow3 a;
    public final Random b;

    public w961(ow3 ow3Var, Random random) {
        this.a = ow3Var;
        this.b = random;
    }

    public final void a(Context context, Intent intent) {
        String className;
        int iNextInt = this.b.nextInt();
        intent.putExtra("intent-id", iNextInt);
        ComponentName component = intent.getComponent();
        Logger.b("Starting foreground service %s intent-id=%d action=%s", new Object[]{(component == null || (className = component.getClassName()) == null) ? null : ihc1.V0(className, '.', className), Integer.valueOf(iNextInt), intent.getAction()});
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            context.startService(intent);
            return;
        }
        i2x0.m(intent);
        if (i < 31) {
            context.startForegroundService(intent);
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            action = "";
        }
        this.a.n(context, action, new v961(context, intent));
    }

    public final void b(Context context, Intent intent) {
        String className;
        int iNextInt = this.b.nextInt();
        intent.putExtra("intent-id", iNextInt);
        ComponentName component = intent.getComponent();
        Logger.b("Starting non-foreground service %s intent-id=%d action=%s", new Object[]{(component == null || (className = component.getClassName()) == null) ? null : ihc1.V0(className, '.', className), Integer.valueOf(iNextInt), intent.getAction()});
        if (Build.VERSION.SDK_INT < 26) {
            context.startService(intent);
            return;
        }
        try {
            context.startService(intent);
        } catch (IllegalStateException unused) {
            Logger.b("Expected: cannot start service from background for " + intent, new Object[0]);
        } catch (RuntimeException e) {
            n57.g("Failed to start non-foreground service for " + intent, e);
        }
    }
}
