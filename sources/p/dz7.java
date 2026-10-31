package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dz7 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ yo00 a;
    public final /* synthetic */ zjx0 b;

    public dz7(yo00 yo00Var, zjx0 zjx0Var) {
        this.a = yo00Var;
        this.b = zjx0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        ty7 ty7Var = (ty7) obj;
        akx0 akx0VarE = this.b.e(yoh0.c(ty7Var.b));
        yo00 yo00Var = this.a;
        yo00Var.W0(akx0VarE);
        yo00Var.e();
        yo00Var.M(false);
        yo00Var.setRepeatMode(ty7Var.c ? 1 : 0);
        return rih1.a;
    }
}
