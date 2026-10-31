package p;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class pj5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;

    public /* synthetic */ pj5(Context context, byte b) {
        this.a = b;
        this.b = context;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0083  */
    @Override // java.lang.Runnable
    public final void run() {
        fhe0 fhe0VarD;
        Object systemService;
        Context context;
        byte b = this.a;
        Context context2 = this.b;
        switch (b) {
            case 0:
                int i = Build.VERSION.SDK_INT;
                if (i >= 33) {
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i >= 33) {
                            d46 d46Var = rj5.g;
                            d46Var.getClass();
                            w36 w36Var = new w36(d46Var);
                            while (true) {
                                if (w36Var.hasNext()) {
                                    yj5 yj5Var = (rj5) ((WeakReference) w36Var.next()).get();
                                    if (yj5Var != null && (context = yj5Var.X) != null) {
                                        systemService = context.getSystemService("locale");
                                    }
                                } else {
                                    systemService = null;
                                }
                            }
                            if (systemService != null) {
                                fhe0VarD = fhe0.d(gg.D(systemService));
                            } else {
                                fhe0VarD = fhe0.b;
                            }
                        } else {
                            fhe0VarD = rj5.c;
                            if (fhe0VarD == null) {
                                fhe0VarD = fhe0.b;
                            }
                        }
                        if (fhe0VarD.a.a.isEmpty()) {
                            String strH = zr7.H(context2);
                            Object systemService2 = context2.getSystemService("locale");
                            if (systemService2 != null) {
                                gg.E(systemService2, LocaleList.forLanguageTags(strH));
                            }
                        }
                        context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                rj5.f = true;
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new pj5(context2, (byte) 2));
                break;
            default:
                u2o1.v(context2, new l5o(), u2o1.a, false);
                break;
        }
    }
}
