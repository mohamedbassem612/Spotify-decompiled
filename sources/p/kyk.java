package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kyk implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ nxk a;

    public kyk(nxk nxkVar) {
        this.a = nxkVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        xne0 xne0Var;
        mvk mvkVar = (mvk) obj;
        String str = mvkVar.a;
        String str2 = mvkVar.b;
        b431 b431Var = this.a.b;
        wne0 wne0Var = new wne0(str2);
        if (str == null) {
            xne0Var = null;
        } else {
            if (ihc1.y0(str)) {
                str = null;
            }
            if (str != null) {
                xne0Var = new xne0(str, true);
            } else {
                xne0Var = null;
            }
        }
        b431Var.a(new dso(Collections.singletonList(new evb1("confirm-generation-location", wne0Var, xne0Var, null, 8))), null);
        return rih1.a;
    }
}
