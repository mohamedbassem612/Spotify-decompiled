package p;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class df61 {
    public static final df61 a = new df61();
    public static final wb00 b;

    static {
        aga0 aga0Var = new aga0();
        wcp1.t.c(aga0Var);
        aga0Var.d = true;
        b = new wb00(aga0Var, (byte) 23);
    }

    public static xz5 a(wi20 wi20Var) {
        wi20Var.a();
        Context context = wi20Var.a;
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        wi20Var.a();
        String str = wi20Var.c.b;
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        String str4 = packageInfo.versionName;
        if (str4 == null) {
            str4 = strValueOf;
        }
        String str5 = Build.MANUFACTURER;
        wi20Var.a();
        grw0 grw0VarI = gg.i(context);
        wi20Var.a();
        return new xz5(str, new c54(packageName, str4, strValueOf, grw0VarI, gg.f(context)));
    }
}
