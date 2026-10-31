package p;

import android.os.Build;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class osh0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ xsh0 a;

    public osh0(xsh0 xsh0Var) {
        this.a = xsh0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        String[] strArr;
        iu30 iu30Var = this.a.c;
        boolean z = ((hrh0) obj).a;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            smc0 smc0VarN = k4p1.n();
            smc0VarN.add("android.permission.READ_MEDIA_IMAGES");
            if (z) {
                smc0VarN.add("android.permission.READ_MEDIA_VIDEO");
            }
            smc0VarN.add("android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
            strArr = (String[]) k4p1.k(smc0VarN).toArray(new String[0]);
        } else if (i >= 33) {
            smc0 smc0VarN2 = k4p1.n();
            smc0VarN2.add("android.permission.READ_MEDIA_IMAGES");
            if (z) {
                smc0VarN2.add("android.permission.READ_MEDIA_VIDEO");
            }
            strArr = (String[]) k4p1.k(smc0VarN2).toArray(new String[0]);
        } else {
            strArr = new String[]{"android.permission.READ_EXTERNAL_STORAGE"};
        }
        iu30Var.invoke(strArr);
        return rih1.a;
    }
}
