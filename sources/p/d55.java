package p;

import android.app.Activity;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.ImageDecoder;
import android.graphics.Insets;
import android.os.Build;
import android.os.Trace;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.view.Window;
import android.view.WindowManager;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class d55 {
    public static void a(String str, int i) {
        Trace.beginAsyncSection(str, i);
    }

    public static void b(Window window) {
        window.getDecorView();
        i(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            int i2 = i >= 30 ? 3 : 1;
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (t8e1.h(attributes) != i2) {
                attributes.layoutInDisplayCutoutMode = i2;
                window.setAttributes(attributes);
            }
        }
        if (i >= 29) {
            window.setStatusBarContrastEnforced(false);
            window.setNavigationBarContrastEnforced(false);
        }
    }

    public static void c(String str, int i) {
        Trace.endAsyncSection(str, i);
    }

    public static float d(int i, Resources resources) {
        return resources.getFloat(i);
    }

    public static boolean e() {
        return Trace.isEnabled();
    }

    public static Insets f(int i, int i2, int i3, int i4) {
        return Insets.of(i, i2, i3, i4);
    }

    public static final void g(Activity activity, jrw0.a aVar) {
        activity.registerActivityLifecycleCallbacks(aVar);
    }

    public static void h(int i, String str) {
        Trace.setCounter(str, i);
    }

    public static void i(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            w081.z(window, z);
        } else if (i >= 30) {
            w081.y(window, z);
        } else {
            sjo0.y(window, z);
        }
    }

    public static final ImageDecoder.Source j(a080 a080Var, dqq0 dqq0Var, boolean z) {
        s8s0 s8s0VarW0;
        if (a080Var.getFileSystem() == i520.a && (s8s0VarW0 = a080Var.W0()) != null) {
            return ImageDecoder.createSource(s8s0VarW0.toFile());
        }
        m5n1 metadata = a080Var.getMetadata();
        if (metadata instanceof d67) {
            return ImageDecoder.createSource(dqq0Var.a.getAssets(), ((d67) metadata).h);
        }
        if ((metadata instanceof dyl) && Build.VERSION.SDK_INT >= 29) {
            try {
                AssetFileDescriptor assetFileDescriptor = ((dyl) metadata).h;
                Os.lseek(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), OsConstants.SEEK_SET);
                return ImageDecoder.createSource((Callable<AssetFileDescriptor>) new lhn(assetFileDescriptor, (byte) 7));
            } catch (ErrnoException unused) {
                return null;
            }
        }
        if (metadata instanceof fx21) {
            fx21 fx21Var = (fx21) metadata;
            if (fx21Var.h.equals(dqq0Var.a.getPackageName())) {
                return ImageDecoder.createSource(dqq0Var.a.getResources(), fx21Var.i);
            }
        }
        if (!(metadata instanceof qgc)) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 30 || !z || ((qgc) metadata).h.isDirect()) {
            return ImageDecoder.createSource(((qgc) metadata).h);
        }
        return null;
    }

    public static final void k(long j, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j);
        }
    }
}
