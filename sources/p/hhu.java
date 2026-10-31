package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hhu implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ bju a;

    public hhu(bju bjuVar) {
        this.a = bjuVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        boolean z = ((wzb1) obj).a;
        bju bjuVar = this.a;
        t45 t45Var = bjuVar.b;
        if (t45Var != null) {
            t45Var.g("image_load");
        }
        t45 t45Var2 = bjuVar.b;
        if (t45Var2 != null) {
            t45Var2.a("outcome", z ? "SUCCESS" : "FAILURE");
        }
        t45 t45Var3 = bjuVar.b;
        if (t45Var3 != null) {
            bjuVar.a.b(t45Var3.e());
        }
        bjuVar.b = null;
        return rih1.a;
    }
}
