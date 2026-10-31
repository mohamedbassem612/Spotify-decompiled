package p;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;
import androidx.media3.common.util.GlUtil;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class p6t0 extends Surface {
    public static int d;
    public static boolean e;
    public final boolean a;
    public final o6t0 b;
    public boolean c;

    public p6t0(o6t0 o6t0Var, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.b = o6t0Var;
        this.a = z;
    }

    public static int a(Context context) {
        try {
            int i = Build.VERSION.SDK_INT;
            if (((i >= 26 || !("samsung".equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL))) && (i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance"))) ? fn31.R("EGL_EXT_protected_content") : false) {
                return fn31.R("EGL_KHR_surfaceless_context") ? 1 : 2;
            }
            return 0;
        } catch (GlUtil.GlException e2) {
            oon1.v("Failed to determine secure mode due to GL error: " + e2.getMessage());
            return 0;
        }
    }

    public static synchronized boolean b(Context context) {
        try {
            if (!e) {
                d = a(context);
                e = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return d != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.b) {
            try {
                if (!this.c) {
                    o6t0 o6t0Var = this.b;
                    o6t0Var.b.getClass();
                    o6t0Var.b.sendEmptyMessage(2);
                    this.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
