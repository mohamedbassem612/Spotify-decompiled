package p;

import android.os.Bundle;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d8i0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ f8i0 a;

    public d8i0(f8i0 f8i0Var) {
        this.a = f8i0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        String str;
        r6i0 r6i0Var = this.a.a;
        u3i0 u3i0Var = ((r7i0) obj).c;
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(u3i0Var.a);
        int iOrdinal = s4b1VarX.c.ordinal();
        if (iOrdinal != 844) {
            str = iOrdinal != 926 ? "unknown" : "track";
        } else {
            str = "episode";
        }
        String strH = gvg.h("spotify:internal:media-trimmer:", str, ":", s4b1VarX.h());
        a1r0 a1r0Var = r6i0Var.a;
        Bundle bundle = new Bundle();
        bundle.putParcelable("mediatrimmer.args", u3i0Var);
        a1r0.j(a1r0Var, strH, (String) null, bundle, false, 10);
        return rih1.a;
    }
}
