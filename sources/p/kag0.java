package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kag0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ mag0 a;

    public kag0(mag0 mag0Var) {
        this.a = mag0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        jag0 jag0Var;
        if (onmVar instanceof jag0) {
            jag0Var = (jag0) onmVar;
            int i = jag0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                jag0Var.b = i - Integer.MIN_VALUE;
            } else {
                jag0Var = new jag0(this, onmVar);
            }
        } else {
            jag0Var = new jag0(this, onmVar);
        }
        Object obj2 = jag0Var.a;
        int i2 = jag0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            dag0 dag0Var = (dag0) obj;
            lt20 lt20Var = new lt20(new m441(new l4f0(this.a, dag0Var, (lnm) null, (byte) 3)), new lag0(dag0Var, (lnm) null, (byte) 0), (byte) 0);
            q5g0 q5g0Var = new q5g0(r261Var, (byte) 5);
            jag0Var.b = 1;
            Object objCollect = lt20Var.collect(q5g0Var, jag0Var);
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
