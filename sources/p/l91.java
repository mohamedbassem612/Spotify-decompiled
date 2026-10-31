package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l91 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ aa1 a;

    public l91(aa1 aa1Var) {
        this.a = aa1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        j91 j91Var;
        if (onmVar instanceof j91) {
            j91Var = (j91) onmVar;
            int i = j91Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                j91Var.b = i - Integer.MIN_VALUE;
            } else {
                j91Var = new j91(this, onmVar);
            }
        } else {
            j91Var = new j91(this, onmVar);
        }
        Object obj2 = j91Var.a;
        int i2 = j91Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            t81 t81Var = (t81) obj;
            m441 m441Var = new m441(new b91(this.a.a, t81Var.d, t81Var.e, t81Var.c, t81Var.f, null));
            k91 k91Var = new k91(r261Var, (byte) 0);
            j91Var.b = 1;
            Object objCollect = m441Var.collect(k91Var, j91Var);
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
