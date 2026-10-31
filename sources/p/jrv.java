package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class jrv implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ hyy0 a;

    public jrv(hyy0 hyy0Var) {
        this.a = hyy0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        hyy0 hyy0Var = this.a;
        mhk0 mhk0Var = (mhk0) hyy0Var.c;
        String str = (String) hyy0Var.b;
        if (str.length() != 0) {
            lhk0 lhk0VarA = mhk0Var.a();
            lhk0 lhk0Var = new lhk0(lhk0VarA.b + 1, dm61.x0(str, lhk0VarA.a));
            hma1 hma1VarEdit = mhk0Var.a.edit();
            hma1VarEdit.d(nhk0.a, mhk0Var.b.b(lhk0.Companion.serializer(), lhk0Var));
            hma1VarEdit.h();
        }
        return rih1.a;
    }
}
