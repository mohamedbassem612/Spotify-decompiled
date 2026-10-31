package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qye implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ o0f a;

    public qye(o0f o0fVar) {
        this.a = o0fVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        hxe hxeVar = (hxe) obj;
        o0f o0fVar = this.a;
        z4p z4pVar = o0fVar.t;
        fta ftaVar = o0fVar.w;
        z4pVar.getClass();
        Object objY = fn31.Y((q8n) ftaVar.b, new ur1(ftaVar, hxeVar.b, hxeVar.a, (String) null, Collections.singletonList("SEARCH"), (lnm) null), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? objY : rih1Var;
    }
}
