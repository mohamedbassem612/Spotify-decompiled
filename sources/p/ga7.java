package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ga7 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ha7 a;
    public final /* synthetic */ xb7 b;

    public ga7(ha7 ha7Var, xb7 xb7Var) {
        this.a = ha7Var;
        this.b = xb7Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        fa7 fa7Var;
        if (onmVar instanceof fa7) {
            fa7Var = (fa7) onmVar;
            int i = fa7Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                fa7Var.b = i - Integer.MIN_VALUE;
            } else {
                fa7Var = new fa7(this, onmVar);
            }
        } else {
            fa7Var = new fa7(this, onmVar);
        }
        Object obj2 = fa7Var.a;
        int i2 = fa7Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            m441 m441Var = new m441(new ae1((b97) obj, this.a.c, this.b, null, (byte) 0));
            k91 k91Var = new k91(r261Var, (byte) 8);
            fa7Var.b = 1;
            Object objCollect = m441Var.collect(k91Var, fa7Var);
            d9n d9nVar = d9n.a;
            if (objCollect == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }
}
