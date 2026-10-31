package p;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.graphics.Insets;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.contentcapture.ContentCaptureSession;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.work.impl.foreground.SystemForegroundService;
import com.spotify.mediabrowserservice.medialibraryservice.SpotifyMediaLibraryService;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class g961 {
    public static void a(Rect rect, Rect rect2, View view) {
        Insets systemWindowInsets = view.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(Insets.of(rect)).build(), rect2).getSystemWindowInsets();
        rect.set(systemWindowInsets.left, systemWindowInsets.top, systemWindowInsets.right, systemWindowInsets.bottom);
    }

    public static final mj31 b(b0k b0kVar) {
        m4c m4cVar = fkj0.X;
        lj31 lj31Var = m9x0.h;
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(-978885037);
        if (Build.VERSION.SDK_INT < 29) {
            x340Var.r(false);
            return lj31Var;
        }
        Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
        boolean zG = x340Var.g(context);
        Object objT = x340Var.T();
        if (zG || objT == m4cVar) {
            Object systemService = context.getSystemService("power");
            objT = systemService instanceof PowerManager ? (PowerManager) systemService : null;
            x340Var.s0(objT);
        }
        PowerManager powerManager = (PowerManager) objT;
        if (powerManager == null) {
            x340Var.r(false);
            return lj31Var;
        }
        boolean zG2 = x340Var.g(powerManager);
        Object objT2 = x340Var.T();
        if (zG2 || objT2 == m4cVar) {
            objT2 = bb00.h(powerManager.getCurrentThermalStatus(), x340Var);
        }
        err0 err0Var = (hdn0) objT2;
        boolean zI = x340Var.i(err0Var) | x340Var.i(powerManager) | x340Var.i(context);
        Object objT3 = x340Var.T();
        if (zI || objT3 == m4cVar) {
            objT3 = new ofe1(powerManager, context, err0Var);
            x340Var.s0(objT3);
        }
        qxd0.i(powerManager, (iu30) objT3, x340Var);
        switch (err0Var.s()) {
            case 0:
                break;
            case 1:
                lj31Var = new lj31(60.0f);
                break;
            case 2:
                lj31Var = new lj31(30.0f);
                break;
            case 3:
                lj31Var = new lj31(24.0f);
                break;
            case 4:
                lj31Var = new lj31(24.0f);
                break;
            case 5:
                lj31Var = new lj31(24.0f);
                break;
            case 6:
                lj31Var = new lj31(24.0f);
                break;
            default:
                lj31Var = new lj31(30.0f);
                break;
        }
        x340Var.r(false);
        return lj31Var;
    }

    public static ContentCaptureSession c(View view) {
        return view.getContentCaptureSession();
    }

    public static float d(View view) {
        return view.getTransitionAlpha();
    }

    public static void e(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    public static void f(View view, float f) {
        view.setTransitionAlpha(f);
    }

    public static void g(View view, int i) {
        view.setTransitionVisibility(i);
    }

    public static void h(Service service, int i, Notification notification) {
        try {
            service.startForeground(i, notification, 2);
        } catch (RuntimeException e) {
            oon1.v("The service must be declared with a foregroundServiceType that includes mediaPlayback");
            throw e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void i(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        systemForegroundService.startForeground(i, notification, i2);
    }

    public static void j(SpotifyMediaLibraryService spotifyMediaLibraryService, Notification notification, int i) {
        if (i == 0 || i == -1) {
            spotifyMediaLibraryService.startForeground(2131430174, notification, i);
        } else {
            spotifyMediaLibraryService.startForeground(2131430174, notification, i & 255);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void k(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        try {
            systemForegroundService.startForeground(i, notification, i2);
        } catch (ForegroundServiceStartNotAllowedException unused) {
            qs10 qs10VarA = qs10.a();
            int i3 = SystemForegroundService.e;
            qs10VarA.getClass();
        } catch (SecurityException unused2) {
            qs10 qs10VarA2 = qs10.a();
            int i4 = SystemForegroundService.e;
            qs10VarA2.getClass();
        }
    }

    public static void l(SpotifyMediaLibraryService spotifyMediaLibraryService, Notification notification, int i) {
        if (i == 0 || i == -1) {
            spotifyMediaLibraryService.startForeground(2131430174, notification, i);
        } else {
            spotifyMediaLibraryService.startForeground(2131430174, notification, i & 1073745919);
        }
    }

    public static void m(ViewGroup viewGroup, boolean z) {
        viewGroup.suppressLayout(z);
    }

    public static void n(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    public static void o(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
