package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ca7 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ha7 a;
    public final /* synthetic */ xb7 b;

    public ca7(ha7 ha7Var, xb7 xb7Var) {
        this.a = ha7Var;
        this.b = xb7Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        ba7 ba7Var;
        if (onmVar instanceof ba7) {
            ba7Var = (ba7) onmVar;
            int i = ba7Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ba7Var.b = i - Integer.MIN_VALUE;
            } else {
                ba7Var = new ba7(this, onmVar);
            }
        } else {
            ba7Var = new ba7(this, onmVar);
        }
        Object obj2 = ba7Var.a;
        int i2 = ba7Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            m441 m441Var = new m441(new xd1(obj, (Object) this.b, (Object) this.a.b, (lnm) null, (byte) 0));
            k91 k91Var = new k91(r261Var, (byte) 6);
            ba7Var.b = 1;
            Object objCollect = m441Var.collect(k91Var, ba7Var);
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
