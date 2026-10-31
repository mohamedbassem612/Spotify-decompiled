package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ea7 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ha7 a;
    public final /* synthetic */ xb7 b;

    public ea7(ha7 ha7Var, xb7 xb7Var) {
        this.a = ha7Var;
        this.b = xb7Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        da7 da7Var;
        if (onmVar instanceof da7) {
            da7Var = (da7) onmVar;
            int i = da7Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                da7Var.b = i - Integer.MIN_VALUE;
            } else {
                da7Var = new da7(this, onmVar);
            }
        } else {
            da7Var = new da7(this, onmVar);
        }
        Object obj2 = da7Var.a;
        int i2 = da7Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            m441 m441Var = new m441(new hgo0((g97) obj, this.b, this.a.d, (lnm) null, (byte) 9));
            k91 k91Var = new k91(r261Var, (byte) 7);
            da7Var.b = 1;
            Object objCollect = m441Var.collect(k91Var, da7Var);
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
