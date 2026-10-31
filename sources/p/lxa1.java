package p;

import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.ImageView;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lxa1 extends AsyncTask {
    public final /* synthetic */ mxa1 a;

    public lxa1(mxa1 mxa1Var) {
        this.a = mxa1Var;
    }

    public final boolean a(File file) {
        mxa1 mxa1Var = this.a;
        Context context = (Context) mxa1Var.b;
        String str = (String) mxa1Var.c;
        String str2 = (String) mxa1Var.e;
        wzn wznVar = (wzn) mxa1Var.f;
        Uri uriForFile = FileProvider.getUriForFile(context, str, file);
        context.grantUriPermission(str2, uriForFile, 1);
        wznVar.getClass();
        Bundle bundle = new Bundle();
        PendingIntent pendingIntent = (PendingIntent) wznVar.d;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
        try {
            return ((og70) ((qg70) wznVar.a)).Y0((hro) wznVar.b, uriForFile, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        Boolean boolValueOf;
        if (isCancelled()) {
            return Boolean.FALSE;
        }
        mxa1 mxa1Var = this.a;
        Context context = (Context) mxa1Var.b;
        File file = new File(context.getFilesDir(), "twa_splash");
        if (!file.exists() && !file.mkdir()) {
            return Boolean.FALSE;
        }
        File file2 = new File(file, "splash_image.png");
        SharedPreferences sharedPreferences = context.getSharedPreferences("splashImagePrefs", 0);
        try {
            long j = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
            if (file2.exists() && j == sharedPreferences.getLong("lastUpdateTime", 0L)) {
                return Boolean.valueOf(a(file2));
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    if (isCancelled()) {
                        boolValueOf = Boolean.FALSE;
                    } else {
                        ((Bitmap) mxa1Var.d).compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        fileOutputStream.flush();
                        sharedPreferences.edit().putLong("lastUpdateTime", j).commit();
                        boolValueOf = isCancelled() ? Boolean.FALSE : Boolean.valueOf(a(file2));
                    }
                    fileOutputStream.close();
                    return boolValueOf;
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Exception e) {
                eg.j(e);
                return null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            eg.j(e2);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Boolean bool = (Boolean) obj;
        mxa1 mxa1Var = this.a;
        if (((k65) mxa1Var.g) == null || isCancelled()) {
            return;
        }
        k65 k65Var = (k65) mxa1Var.g;
        boolean zBooleanValue = bool.booleanValue();
        syy0 syy0Var = (syy0) k65Var.b;
        pwg1 pwg1Var = (pwg1) k65Var.c;
        vqh0 vqh0Var = (vqh0) k65Var.d;
        syy0Var.getClass();
        if (!zBooleanValue) {
            vqh0Var.run();
            return;
        }
        Bundle bundleG = cy30.g("androidx.browser.trusted.KEY_SPLASH_SCREEN_VERSION", "androidx.browser.trusted.category.TrustedWebActivitySplashScreensV1");
        bundleG.putInt("androidx.browser.trusted.KEY_SPLASH_SCREEN_FADE_OUT_DURATION", syy0Var.e);
        bundleG.putInt("androidx.browser.trusted.trusted.KEY_SPLASH_SCREEN_BACKGROUND_COLOR", syy0Var.c);
        bundleG.putInt("androidx.browser.trusted.KEY_SPLASH_SCREEN_SCALE_TYPE", ImageView.ScaleType.CENTER.ordinal());
        pwg1Var.d = bundleG;
        zyh0 zyh0Var = new zyh0((Object) syy0Var, (Object) vqh0Var, (byte) 19);
        if (syy0Var.j) {
            zyh0Var.run();
        } else {
            syy0Var.k = zyh0Var;
        }
    }
}
