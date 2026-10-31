package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cze0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ dze0 a;

    public cze0(dze0 dze0Var) {
        this.a = dze0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        bze0 bze0Var;
        if (onmVar instanceof bze0) {
            bze0Var = (bze0) onmVar;
            int i = bze0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                bze0Var.b = i - Integer.MIN_VALUE;
            } else {
                bze0Var = new bze0(this, onmVar);
            }
        } else {
            bze0Var = new bze0(this, onmVar);
        }
        Object obj2 = bze0Var.a;
        int i2 = bze0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            uye0 uye0Var = (uye0) obj;
            lt20 lt20Var = new lt20(new m441(new og5(this.a.a, uye0Var.c, uye0Var.d, (lnm) null, (byte) 26)), new w1e0(3, (lnm) null, (byte) 7), (byte) 0);
            cg00 cg00Var = new cg00(r261Var, (byte) 27);
            bze0Var.b = 1;
            Object objCollect = lt20Var.collect(cg00Var, bze0Var);
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
