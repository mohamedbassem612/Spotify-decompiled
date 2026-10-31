package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qze implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ o0f a;

    public qze(o0f o0fVar) {
        this.a = o0fVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        e5l0 e5l0Var = this.a.f47p;
        String str = ((qxe) obj).a;
        fpf fpfVar = (fpf) e5l0Var.b;
        dma1 dma1Var = fpfVar.b;
        bma1 bma1Var = fpf.g;
        w7x w7xVar = w7x.a;
        w7x w7xVarB = dma1Var.b(bma1Var, w7xVar);
        if (w7xVarB != null) {
            w7xVar = w7xVarB;
        }
        Set setO1 = o7h.o1((Iterable) w7xVar);
        if (!setO1.contains(str)) {
            setO1.add(str);
            hma1 hma1VarEdit = fpfVar.b.edit();
            hma1VarEdit.e(bma1Var, setO1);
            hma1VarEdit.g();
        }
        return rih1.a;
    }
}
