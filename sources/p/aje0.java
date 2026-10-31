package p;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.location.LocationManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import com.spotify.base.java.logging.Logger;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class aje0 implements kvp0 {
    public final Context a;
    public final Object b;

    public aje0(Context context, byte b) {
        switch (b) {
            case 1:
                this.a = context;
                this.b = !context.getPackageManager().hasSystemFeature("android.hardware.telephony") ? new huz(Boolean.FALSE, (byte) 10) : d5p1.r(new lt20(rqt0.u(h4p1.g(new k1e0(this, (lnm) null, (byte) 10))), new i440(3, (lnm) null, (byte) 13), (byte) 0), smo1.e(new z8n("MobileDataDisabledDetectorScope")), ey71.a, 1);
                break;
            default:
                this.a = context;
                this.b = new idd1(new jgd0(this, (byte) 16));
                break;
        }
    }

    public static Object c(Activity activity, kse kseVar) {
        Bitmap m231Var;
        if (activity.isFinishing()) {
            Logger.k("ScreenShotGrabber Activity is finishing, skipping screenshot capture", new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        View decorView = window.getDecorView();
        if (Build.VERSION.SDK_INT < 26) {
            try {
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                m231Var = zno1.j(decorView);
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                m231Var = new m231(th);
            }
            return m231Var instanceof m231 ? null : m231Var;
        }
        ohd ohdVar = new ohd(1, aym.t(kseVar));
        ohdVar.t();
        if (decorView.getWidth() <= 0 || decorView.getHeight() <= 0) {
            Logger.k(cy30.i(decorView.getWidth(), "ScreenShotGrabber View has invalid dimensions: ", decorView.getHeight(), "x"), new Object[0]);
            ohdVar.resumeWith((Object) null);
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(decorView.getWidth(), decorView.getHeight(), Bitmap.Config.ARGB_8888);
            try {
                PixelCopy.request(window, bitmapCreateBitmap, new lp41(bitmapCreateBitmap, ohdVar), new Handler(Looper.getMainLooper()));
            } catch (IllegalArgumentException e2) {
                bitmapCreateBitmap.recycle();
                throw e2;
            }
        }
        return ohdVar.r();
    }

    public mr20 a() {
        return (mr20) this.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(onm onmVar) {
        xie0 xie0Var;
        String str;
        if (onmVar instanceof xie0) {
            xie0Var = (xie0) onmVar;
            int i = xie0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                xie0Var.d = i - Integer.MIN_VALUE;
            } else {
                xie0Var = new xie0(this, onmVar);
            }
        } else {
            xie0Var = new xie0(this, onmVar);
        }
        Object objG = xie0Var.b;
        int i2 = xie0Var.d;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objG);
            if (e().isProviderEnabled("gps")) {
                str = "gps";
            } else {
                str = e().isProviderEnabled("network") ? "network" : null;
            }
            if (str != null) {
                xie0Var.a = str;
                xie0Var.d = 1;
                objG = g(str, xie0Var);
                if (objG != d9nVar) {
                }
            }
            return null;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objG);
                return objG;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = xie0Var.a;
        hm5.M(objG);
        irt irtVar = (irt) objG;
        if (irtVar != null) {
            return irtVar;
        }
        if (u890.j(str, "gps") && e().isProviderEnabled("network")) {
            xie0Var.a = null;
            xie0Var.d = 2;
            Object objG2 = g("network", xie0Var);
            return objG2 == d9nVar ? d9nVar : objG2;
        }
        return null;
    }

    public LocationManager e() {
        return (LocationManager) ((idd1) this.b).getValue();
    }

    public boolean f() {
        Context context = this.a;
        Object systemService = context.getApplicationContext().getSystemService("phone");
        if (systemService instanceof TelephonyManager) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                TelephonyManager telephonyManager = (TelephonyManager) systemService;
                int activeModemCount = telephonyManager.getActiveModemCount();
                for (int i2 = 0; i2 < activeModemCount; i2++) {
                    if (telephonyManager.getSimState(i2) == 5) {
                        if (Settings.Global.getInt(context.getApplicationContext().getContentResolver(), "mobile_data", 1) != 1) {
                            return true;
                        }
                    }
                }
                return false;
            }
            if (i >= 26) {
                TelephonyManager telephonyManager2 = (TelephonyManager) systemService;
                int phoneCount = telephonyManager2.getPhoneCount();
                for (int i3 = 0; i3 < phoneCount; i3++) {
                    if (telephonyManager2.getSimState(i3) == 5) {
                        if (Settings.Global.getInt(context.getApplicationContext().getContentResolver(), "mobile_data", 1) != 1) {
                            return true;
                        }
                    }
                }
                return false;
            }
            if (((TelephonyManager) systemService).getSimState() == 5 && Settings.Global.getInt(context.getApplicationContext().getContentResolver(), "mobile_data", 1) != 1) {
                return true;
            }
        }
        return false;
    }

    public Object g(String str, xie0 xie0Var) {
        if (Build.VERSION.SDK_INT >= 30) {
            ohd ohdVar = new ohd(1, aym.t(xie0Var));
            ohdVar.t();
            CancellationSignal cancellationSignal = new CancellationSignal();
            ohdVar.n(new m5o(cancellationSignal, (byte) 2));
            e().getCurrentLocation(str, cancellationSignal, this.a.getMainExecutor(), new zie0(ohdVar, this));
            return ohdVar.r();
        }
        ohd ohdVar2 = new ohd(1, aym.t(xie0Var));
        ohdVar2.t();
        yie0 yie0Var = new yie0(ohdVar2, this);
        ohdVar2.n(new j2d0(this, yie0Var, (byte) 8));
        e().requestSingleUpdate(str, yie0Var, Looper.getMainLooper());
        return ohdVar2.r();
    }

    public File h(Bitmap bitmap) throws IOException {
        File file = new File(this.a.getCacheDir(), f4i1.f("user_feedback_screenshot_", UUID.randomUUID().toString(), ".webp"));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                if (Build.VERSION.SDK_INT >= 30) {
                    bitmap.compress(Bitmap.CompressFormat.WEBP_LOSSY, 50, fileOutputStream);
                } else {
                    bitmap.compress(Bitmap.CompressFormat.WEBP, 50, fileOutputStream);
                }
                fileOutputStream.close();
                file.getAbsolutePath();
                return file;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    u890.p(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (IOException e) {
            file.delete();
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object i(Activity activity, onm onmVar) {
        mp41 mp41Var;
        CancellationException e;
        p811 p811Var;
        File file;
        if (onmVar instanceof mp41) {
            mp41Var = (mp41) onmVar;
            int i = mp41Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mp41Var.d = i - Integer.MIN_VALUE;
            } else {
                mp41Var = new mp41(this, onmVar);
            }
        } else {
            mp41Var = new mp41(this, onmVar);
        }
        Object obj = mp41Var.b;
        int i2 = mp41Var.d;
        if (i2 == 0) {
            p811 p811VarU = cy30.u(obj);
            try {
                q8n q8nVar = (q8n) this.b;
                try {
                    kse kseVar = new kse(this, activity, p811VarU, (lnm) null);
                    mp41Var.a = p811VarU;
                    mp41Var.d = 1;
                    Object objY = fn31.Y(q8nVar, kseVar, mp41Var);
                    d9n d9nVar = d9n.a;
                    if (objY == d9nVar) {
                        return d9nVar;
                    }
                    obj = objY;
                    p811Var = p811VarU;
                } catch (CancellationException e2) {
                    e = e2;
                    p811Var = p811VarU;
                    file = (File) p811Var.a;
                    if (file != null) {
                        file.delete();
                    }
                    throw e;
                }
            } catch (CancellationException e3) {
                e = e3;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p811Var = mp41Var.a;
            try {
                hm5.M(obj);
            } catch (CancellationException e4) {
                e = e4;
                file = (File) p811Var.a;
                if (file != null) {
                    file.delete();
                }
                throw e;
            }
        }
        String str = (String) obj;
        p811Var.a = null;
        return str;
    }

    public boolean j() {
        return m() == 3;
    }

    public boolean k() {
        try {
            List<PackageInfo> installedPackages = ((Application) this.a).getPackageManager().getInstalledPackages(0);
            if (!(installedPackages instanceof Collection) || !installedPackages.isEmpty()) {
                Iterator<T> it = installedPackages.iterator();
                while (it.hasNext()) {
                    if (u890.j(((PackageInfo) it.next()).packageName, "com.android.vending")) {
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public String l() {
        try {
            Application application = (Application) this.a;
            PackageManager packageManager = application.getPackageManager();
            String packageName = application.getPackageName();
            if (Build.VERSION.SDK_INT >= 30) {
                String initiatingPackageName = packageManager.getInstallSourceInfo(packageName).getInitiatingPackageName();
                if (initiatingPackageName != null) {
                    return initiatingPackageName;
                }
            } else {
                String installerPackageName = packageManager.getInstallerPackageName(packageName);
                if (installerPackageName != null) {
                    return installerPackageName;
                }
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    public int m() {
        int iB = ((mz40) this.b).b((Application) this.a);
        return (iB == 1 || iB == 3 || iB == 9) ? 4 : 3;
    }

    public /* synthetic */ aje0(Context context, Object obj) {
        this.a = context;
        this.b = obj;
    }
}
