package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class r5g0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ a6g0 a;

    public r5g0(a6g0 a6g0Var) {
        this.a = a6g0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        p5g0 p5g0Var;
        if (onmVar instanceof p5g0) {
            p5g0Var = (p5g0) onmVar;
            int i = p5g0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                p5g0Var.b = i - Integer.MIN_VALUE;
            } else {
                p5g0Var = new p5g0(this, onmVar);
            }
        } else {
            p5g0Var = new p5g0(this, onmVar);
        }
        Object obj2 = p5g0Var.a;
        int i2 = p5g0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            g5g0 g5g0Var = (g5g0) obj;
            m441 m441Var = new m441(new k5g0(this.a.a, g5g0Var.c, g5g0Var.d, g5g0Var.b, g5g0Var.e, null));
            q5g0 q5g0Var = new q5g0(r261Var, (byte) 0);
            p5g0Var.b = 1;
            Object objCollect = m441Var.collect(q5g0Var, p5g0Var);
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
