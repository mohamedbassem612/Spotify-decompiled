package p;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.instrumentation.events.proto.AndroidDeviceReport;
import com.spotify.platform.os.CpuFeatures;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ht50 {
    public final t2j0 a;
    public final DisplayMetrics b;
    public final z550 c;
    public final uc4 d;
    public final Context e;
    public final dur f = new dur();

    public ht50(t2j0 t2j0Var, DisplayMetrics displayMetrics, Context context, z550 z550Var, uc4 uc4Var) {
        this.a = t2j0Var;
        this.b = displayMetrics;
        this.c = z550Var;
        this.d = uc4Var;
        this.e = context.getApplicationContext();
    }

    public final void a() {
        String strE;
        String strE2;
        z550 z550Var = this.c;
        y550 y550Var = jo31.a;
        if (this.d.a()) {
            dma1 dma1Var = z550Var.a;
            y550 y550Var2 = null;
            if (u890.j(dma1Var.e(a650.a, (String) null), "1|" + Build.FINGERPRINT) && (strE = dma1Var.e(a650.b, (String) null)) != null && (strE2 = dma1Var.e(a650.c, (String) null)) != null) {
                y550Var2 = new y550(strE, strE2);
            }
            if (y550Var2 != null) {
                y550Var = y550Var2;
            } else {
                ft30 ft30Var = new ft30(1, this.c, z550.class, "write", "write(Lcom/spotify/deviceinfo/devicereportimpl/GpuInfo;)V", 0, (byte) 3);
                AtomicReference atomicReference = new AtomicReference();
                Thread thread = new Thread((Runnable) new xwn1(atomicReference, ft30Var, (byte) 21), "GpuInfoReader");
                thread.setDaemon(true);
                try {
                    thread.start();
                    thread.join(500L);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    Logger.e(e, "Interrupted waiting for GPU probe", new Object[0]);
                } catch (Throwable th) {
                    Logger.e(th, "Failed to run GPU probe", new Object[0]);
                }
                y550 y550Var3 = (y550) atomicReference.get();
                if (y550Var3 == null) {
                    Logger.b("GPU probe timed out after %d ms", new Object[]{500L});
                }
                if (y550Var3 == null) {
                    y550Var3 = y550Var;
                }
                if (y550Var3.equals(y550Var)) {
                    z550Var.a(y550Var);
                }
                y550Var = y550Var3;
            }
        }
        t2j0 t2j0Var = this.a;
        gd4 gd4VarN = AndroidDeviceReport.n();
        String str = Build.MODEL;
        gd4VarN.z();
        String str2 = Build.BRAND;
        gd4VarN.n();
        String str3 = Build.MANUFACTURER;
        gd4VarN.w();
        String str4 = Build.DISPLAY;
        gd4VarN.t();
        gd4VarN.A(tm80.B());
        gd4VarN.x(tm80.z());
        gd4VarN.y(tm80.C(this.e));
        DisplayMetrics displayMetrics = this.b;
        float f = displayMetrics.widthPixels / displayMetrics.xdpi;
        float f2 = displayMetrics.heightPixels / displayMetrics.ydpi;
        gd4VarN.E((float) Math.sqrt((f2 * f2) + (f * f)));
        gd4VarN.F(this.b.widthPixels);
        gd4VarN.D(this.b.heightPixels);
        gd4VarN.C(this.b.densityDpi);
        Context context = this.e;
        if (anm1.a == null) {
            synchronized (anm1.class) {
                try {
                    if (anm1.a == null) {
                        anm1.a = Integer.valueOf(anm1.m(context));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        gd4VarN.s(anm1.a.intValue());
        CpuFeatures.Companion companion = CpuFeatures.Companion;
        gd4VarN.r(companion.getCpuFeatures());
        gd4VarN.q(companion.getCpuFamily());
        gd4VarN.B(this.f.a);
        gd4VarN.v(y550Var.a);
        gd4VarN.u(y550Var.b);
        int i = Build.VERSION.SDK_INT;
        gd4VarN.G(i >= 31 ? tw20.o() : "");
        gd4VarN.H(i >= 31 ? ofr.h() : "");
        t2j0Var.a(gd4VarN.build());
    }
}
