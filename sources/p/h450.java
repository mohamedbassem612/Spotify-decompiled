package p;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class h450 {
    public static boolean b = false;
    public static boolean c = false;
    public static final /* synthetic */ int e = 0;
    public static final AtomicBoolean a = new AtomicBoolean();
    public static final AtomicBoolean d = new AtomicBoolean();

    public static void a(Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        mz40 mz40Var = mz40.b;
        int iC = mz40Var.c(context, 11925000);
        if (iC != 0) {
            Intent intentA = mz40Var.a(iC, context, "e");
            new StringBuilder(String.valueOf(iC).length() + 46);
            if (intentA != null) {
                throw new GooglePlayServicesRepairableException("Google Play Services not available");
            }
            throw new GooglePlayServicesNotAvailableException(iC);
        }
    }

    public static int b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    public static String c(int i) {
        return lal.F(i);
    }

    public static Context d(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean e(Context context) {
        if (!c) {
            try {
                PackageInfo packageInfo = mjm1.a(context).a.getPackageManager().getPackageInfo("com.google.android.gms", Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
                t450.a(context);
                if (packageInfo == null || t450.c(packageInfo, false) || !t450.c(packageInfo, true)) {
                    b = false;
                } else {
                    b = true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            } finally {
                c = true;
            }
        }
        return b || !"user".equals(Build.TYPE);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0190 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:73:0x013b  */
    /* JADX WARN: Code duplicated, block: B:80:0x015c  */
    /* JADX WARN: Code duplicated, block: B:81:0x015e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0163  */
    /* JADX WARN: Code duplicated, block: B:86:0x0167  */
    /* JADX WARN: Code duplicated, block: B:87:0x018c  */
    /* JADX WARN: Code duplicated, block: B:94:0x01a5 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x01a7 A[RETURN] */
    public static int f(Context context, int i) {
        boolean z;
        PackageInfo packageInfo;
        int i2;
        int i3;
        ApplicationInfo applicationInfo;
        try {
            context.getResources().getString(2131954152);
        } catch (Throwable unused) {
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !d.get()) {
            synchronized (dm5.g) {
                try {
                    if (!dm5.h) {
                        dm5.h = true;
                        try {
                            Bundle bundle = mjm1.a(context).a.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                            if (bundle != null) {
                                bundle.getString("com.google.app.id");
                                dm5.i = bundle.getInt("com.google.android.gms.version");
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int i4 = dm5.i;
            if (i4 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i4 != 12451000) {
                int i5 = mz40.a;
                StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 104 + String.valueOf(i4).length() + 194);
                c13.n(i5, i4, "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ", " but found ", sb);
                sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                throw new GooglePlayServicesIncorrectManifestValueException(sb.toString());
            }
        }
        if (e9k.w(context)) {
            z = false;
        } else {
            Boolean boolValueOf = e9k.c;
            if (boolValueOf == null) {
                boolValueOf = Boolean.valueOf(wyo1.j() ? context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") : context.getPackageManager().hasSystemFeature("android.hardware.type.iot"));
                e9k.c = boolValueOf;
            }
            if (boolValueOf.booleanValue()) {
                z = false;
            } else {
                z = true;
            }
        }
        zod.k(i >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", Build.VERSION.SDK_INT >= 28 ? 134225984 : 8256);
            } catch (PackageManager.NameNotFoundException unused3) {
                String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing.");
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
            t450.a(context);
            if (!t450.c(packageInfo2, true)) {
                String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid.");
            } else {
                if (!z) {
                    if (z) {
                    }
                    i2 = packageInfo2.versionCode;
                    if (i2 == -1) {
                        i3 = -1;
                    } else {
                        i3 = i2 / 1000;
                    }
                    if (i3 < (i != -1 ? i / 1000 : -1)) {
                        new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i).length() + 11 + String.valueOf(i2).length());
                        return 2;
                    }
                    applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                    }
                    if (applicationInfo.enabled) {
                        return 0;
                    }
                    return 3;
                }
                zod.s(packageInfo);
                if (!t450.c(packageInfo, true)) {
                    String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid.");
                } else {
                    if (z || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                        i2 = packageInfo2.versionCode;
                        if (i2 == -1) {
                            i3 = -1;
                        } else {
                            i3 = i2 / 1000;
                        }
                        if (i3 < (i != -1 ? i / 1000 : -1)) {
                            new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i).length() + 11 + String.valueOf(i2).length());
                            return 2;
                        }
                        applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            try {
                                applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                            } catch (PackageManager.NameNotFoundException unused4) {
                                String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info.");
                                return 1;
                            }
                        }
                        if (applicationInfo.enabled) {
                            return 3;
                        }
                        return 0;
                    }
                    String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services.");
                }
            }
            return 9;
        } catch (PackageManager.NameNotFoundException unused5) {
            String.valueOf(packageName).concat(" requires Google Play services, but they are missing.");
            return 1;
        }
    }

    public static boolean g(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    public static boolean h(Context context) {
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }
}
