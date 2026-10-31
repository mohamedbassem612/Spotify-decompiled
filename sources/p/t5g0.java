package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t5g0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ a6g0 a;

    public t5g0(a6g0 a6g0Var) {
        this.a = a6g0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        s5g0 s5g0Var;
        if (onmVar instanceof s5g0) {
            s5g0Var = (s5g0) onmVar;
            int i = s5g0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                s5g0Var.b = i - Integer.MIN_VALUE;
            } else {
                s5g0Var = new s5g0(this, onmVar);
            }
        } else {
            s5g0Var = new s5g0(this, onmVar);
        }
        Object obj2 = s5g0Var.a;
        int i2 = s5g0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            a5g0 a5g0Var = (a5g0) obj;
            m441 m441Var = new m441(new k1e0(this.a.a, a5g0Var.b, a5g0Var.c, (lnm) null, (byte) 5));
            q5g0 q5g0Var = new q5g0(r261Var, (byte) 1);
            s5g0Var.b = 1;
            Object objCollect = m441Var.collect(q5g0Var, s5g0Var);
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
