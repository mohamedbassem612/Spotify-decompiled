package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class znk1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ hok1 a;

    public znk1(hok1 hok1Var) {
        this.a = hok1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        mnk1 mnk1Var = (mnk1) obj;
        hok1 hok1Var = this.a;
        exg1 exg1Var = hok1Var.c;
        boolean z = mnk1Var.a;
        hma1 hma1VarEdit = exg1Var.a.edit();
        hma1VarEdit.a(exg1.c, z);
        hma1VarEdit.h();
        if (mnk1Var.a) {
            hok1Var.Z.invoke(hok1Var.a.getString(2131956733));
        }
        return rih1.a;
    }
}
