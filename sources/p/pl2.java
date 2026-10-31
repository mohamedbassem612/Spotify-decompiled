package p;

import android.app.Activity;
import android.net.Uri;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pl2 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ wl2 a;

    public pl2(wl2 wl2Var) {
        this.a = wl2Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        bl2 bl2Var = (bl2) obj;
        kp5 kp5Var = this.a.a;
        s2j1 s2j1Var = bl2Var.a;
        String str = bl2Var.b;
        int iOrdinal = s2j1Var.ordinal();
        if (iOrdinal == 0) {
            vb2.b((vb2) kp5Var.b, bb2.a, false, (tv80) kp5Var.h);
        } else {
            if (iOrdinal != 1) {
                eg.o();
                return null;
            }
            Uri uriBuild = Uri.parse(str).buildUpon().appendQueryParameter("redirect_uri", "https://www.spotify.com/mobile/close/parental-consent").build();
            ryf ryfVar = (ryf) kp5Var.c;
            Activity activity = (Activity) kp5Var.f;
            jyf jyfVar = new jyf((String) null);
            uriBuild.getClass();
            ryfVar.b(activity, new lyf(pxf.b, jyfVar, uriBuild));
        }
        return rih1.a;
    }
}
