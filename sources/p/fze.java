package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fze implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ o0f a;

    public fze(o0f o0fVar) {
        this.a = o0fVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        ip31 ip31Var = this.a.r;
        String str = ((axe) obj).a;
        fpf fpfVar = (fpf) ip31Var.d;
        dma1 dma1Var = fpfVar.b;
        bma1 bma1Var = fpf.h;
        Set set = w7x.a;
        Set setB = dma1Var.b(bma1Var, set);
        if (setB != null) {
            set = setB;
        }
        LinkedHashSet linkedHashSetX0 = dm61.x0(str, set);
        hma1 hma1VarEdit = fpfVar.b.edit();
        hma1VarEdit.e(bma1Var, linkedHashSetX0);
        hma1VarEdit.g();
        fpf fpfVar2 = (fpf) ip31Var.d;
        synchronized (fpfVar2) {
            dma1 dma1Var2 = fpfVar2.b;
            bma1 bma1Var2 = fpf.i;
            int iL = dma1Var2.l(bma1Var2, 0) + 1;
            hma1 hma1VarEdit2 = fpfVar2.b.edit();
            hma1VarEdit2.b(bma1Var2, iL);
            hma1VarEdit2.g();
            bpb1 bpb1Var = (wen0) fpfVar2.c.getValue();
            Integer numValueOf = Integer.valueOf(iL);
            bpb1 bpb1Var2 = bpb1Var;
            bpb1Var2.getClass();
            bpb1Var2.m((Object) null, numValueOf);
        }
        return rih1.a;
    }
}
