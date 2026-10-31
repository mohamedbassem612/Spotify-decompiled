package p;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.protobuf.h;
import com.spotify.contexts.DeviceAndroid;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class iqt implements r900 {
    public final Context a;
    public final xk4 b;
    public final kg60 c;
    public final WindowManager d;

    public iqt(Context context, xk4 xk4Var, kg60 kg60Var) {
        this.a = context;
        this.b = xk4Var;
        this.c = kg60Var;
        Object systemService = context.getSystemService("window");
        this.d = systemService instanceof WindowManager ? (WindowManager) systemService : null;
    }

    @Override // p.r900
    public final String a() {
        return "context_device_android";
    }

    @Override // p.r900
    public final h getData() {
        jpt jptVarO = DeviceAndroid.o();
        String str = Build.MANUFACTURER;
        jptVarO.u();
        String str2 = Build.VERSION.RELEASE;
        jptVarO.w();
        jptVarO.C(Build.VERSION.SDK_INT);
        String str3 = Build.MODEL;
        jptVarO.v();
        jptVarO.n(this.b.a());
        WindowManager windowManager = this.d;
        if (windowManager != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            jptVarO.B(displayMetrics.widthPixels);
            jptVarO.z(displayMetrics.heightPixels);
            jptVarO.x(displayMetrics.densityDpi);
        }
        Context context = this.a;
        jptVarO.A(context.getResources().getConfiguration().smallestScreenWidthDp);
        int i = DisplayMetrics.DENSITY_DEVICE_STABLE;
        jptVarO.y();
        aqo1 aqo1VarA = this.c.a();
        if (aqo1VarA instanceof hg60) {
            jptVarO.t(((hg60) aqo1VarA).b);
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            jptVarO.s(packageManager.hasSystemFeature("android.hardware.type.watch"));
            jptVarO.q(packageManager.hasSystemFeature("android.hardware.type.automotive"));
            jptVarO.r(wpb1.z(packageManager));
        }
        return jptVarO.build();
    }
}
