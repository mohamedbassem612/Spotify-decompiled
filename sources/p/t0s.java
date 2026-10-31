package p;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class t0s implements lly0 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Context b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t0s(Context context, String str) {
        this.b = context;
        this.c = str;
    }

    @Override // p.lly0
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        byte b = this.a;
        Context context = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                return new q6y(context, (String) obj);
            default:
                wi20 wi20Var = (wi20) obj;
                String strD = wi20Var.d();
                qwq qwqVar = new qwq();
                Context contextN = x74.n(context);
                SharedPreferences sharedPreferences = contextN.getSharedPreferences("com.google.firebase.common.prefs:".concat(strD), 0);
                boolean z = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = contextN.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextN.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                        break;
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                qwqVar.a = z;
                return qwqVar;
        }
    }

    public /* synthetic */ t0s(wi20 wi20Var, Context context) {
        this.c = wi20Var;
        this.b = context;
    }
}
