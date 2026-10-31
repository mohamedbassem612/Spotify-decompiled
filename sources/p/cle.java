package p;

import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cle implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ele a;

    public cle(ele eleVar) {
        this.a = eleVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        xke xkeVar = (xke) obj;
        qke qkeVar = this.a.a;
        wke wkeVar = xkeVar.c;
        String str = wkeVar.a;
        Parcelable lkeVar = new lke(str, wkeVar.b, xkeVar.d);
        Set set = s4b1.f;
        String strConcat = "spotify:internal:chapters:sheet:episode:".concat(uic.x(str).h());
        a1r0 a1r0Var = qkeVar.a;
        Bundle bundle = new Bundle();
        bundle.putParcelable("chapterselector.args", lkeVar);
        a1r0.j(a1r0Var, strConcat, (String) null, bundle, false, 10);
        return rih1.a;
    }
}
