package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class a190 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ lzn0 a;

    public a190(lzn0 lzn0Var) {
        this.a = lzn0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        z090 z090Var;
        if (onmVar instanceof z090) {
            z090Var = (z090) onmVar;
            int i = z090Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                z090Var.b = i - Integer.MIN_VALUE;
            } else {
                z090Var = new z090(this, onmVar);
            }
        } else {
            z090Var = new z090(this, onmVar);
        }
        Object obj2 = z090Var.a;
        int i2 = z090Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            ((u9w) obj).getClass();
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        this.a.d(blc0.j3);
        return rih1.a;
    }
}
