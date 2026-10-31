package p;

import android.os.Build;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qsh0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ xsh0 a;

    public qsh0(xsh0 xsh0Var) {
        this.a = xsh0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        String str;
        grh0 grh0Var = (grh0) obj;
        if (Build.VERSION.SDK_INT >= 34) {
            iu30 iu30Var = this.a.g;
            int iOrdinal = grh0Var.a.ordinal();
            if (iOrdinal == 0) {
                str = "android.permission.READ_MEDIA_IMAGES";
            } else {
                if (iOrdinal != 1) {
                    eg.o();
                    return null;
                }
                str = "android.permission.READ_MEDIA_VIDEO";
            }
            iu30Var.invoke(new String[]{str, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"});
        }
        return rih1.a;
    }
}
