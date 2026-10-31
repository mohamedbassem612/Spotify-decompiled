package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rye implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ o0f a;

    public rye(o0f o0fVar) {
        this.a = o0fVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        List listK;
        ixe ixeVar = (ixe) obj;
        int i = ixeVar.c;
        o0f o0fVar = this.a;
        if (i != 0) {
            listK = Collections.singletonList(ktd.t(i));
        } else {
            smc0 smc0VarN = k4p1.n();
            if (o0fVar.u.g()) {
                smc0VarN.add("LYRICS_STICKERS");
            }
            smc0VarN.add("GIFS");
            listK = k4p1.k(smc0VarN);
        }
        List list = listK;
        boolean zIsEmpty = list.isEmpty();
        rih1 rih1Var = rih1.a;
        if (!zIsEmpty) {
            z4p z4pVar = o0fVar.t;
            fta ftaVar = o0fVar.w;
            z4pVar.getClass();
            String str = ixeVar.a;
            Object objY = fn31.Y((q8n) ftaVar.b, new ur1(ftaVar, ixeVar.b, str, (String) o7h.q0(list), list, (lnm) null), onmVar);
            d9n d9nVar = d9n.a;
            if (objY != d9nVar) {
                objY = rih1Var;
            }
            if (objY != d9nVar) {
                objY = rih1Var;
            }
            if (objY == d9nVar) {
                return objY;
            }
        }
        return rih1Var;
    }
}
