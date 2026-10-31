package p;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Environment;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ltt implements wgn {
    public final Context a;
    public final jqt b;

    public ltt(Context context, jqt jqtVar) {
        this.a = context;
        this.b = jqtVar;
    }

    public final List a() {
        ktt kttVar;
        long jT;
        Context context = this.a;
        ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityManager.class);
        if (activityManager == null) {
            kttVar = null;
        } else {
            ktt kttVar2 = new ktt();
            activityManager.getMemoryInfo(kttVar2);
            kttVar = kttVar2;
        }
        Configuration configuration = context.getResources().getConfiguration();
        smc0 smc0VarN = k4p1.n();
        smc0VarN.add(new ven(this.b.a()));
        smc0VarN.add(new vfn(configuration.orientation == 2));
        String str = Build.MODEL;
        smc0VarN.add(new ffn());
        String str2 = Build.MANUFACTURER;
        smc0VarN.add(new gfn());
        String str3 = Build.VERSION.RELEASE;
        smc0VarN.add(new ufn());
        smc0VarN.add(new zen(configuration.fontScale));
        try {
            jT = new utw0(Environment.getDataDirectory().getAbsolutePath()).t();
        } catch (IOException unused) {
            jT = -1;
        }
        smc0VarN.add(new cfn(jT));
        String str4 = (String) f46.k0(Build.SUPPORTED_ABIS);
        if (str4 == null) {
            str4 = Build.CPU_ABI;
        }
        smc0VarN.add(new oen(str4));
        boolean zB = xoi1.b(context);
        String str5 = Build.VERSION.RELEASE;
        int i = Build.VERSION.SDK_INT;
        String str6 = Build.MANUFACTURER;
        String str7 = Build.MODEL;
        smc0VarN.add(new fgn(i, zB));
        if (kttVar != null) {
            smc0VarN.add(new dfn(((ActivityManager.MemoryInfo) kttVar).availMem));
            smc0VarN.add(new tfn(((ActivityManager.MemoryInfo) kttVar).lowMemory));
            smc0VarN.add(new ngn(((ActivityManager.MemoryInfo) kttVar).threshold));
        }
        return k4p1.k(smc0VarN);
    }
}
