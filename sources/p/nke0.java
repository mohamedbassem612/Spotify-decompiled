package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nke0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ rzo0 a;

    public nke0(rzo0 rzo0Var) {
        this.a = rzo0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        mke0 mke0Var;
        if (onmVar instanceof mke0) {
            mke0Var = (mke0) onmVar;
            int i = mke0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                mke0Var.b = i - Integer.MIN_VALUE;
            } else {
                mke0Var = new mke0(this, onmVar);
            }
        } else {
            mke0Var = new mke0(this, onmVar);
        }
        Object obj2 = mke0Var.a;
        int i2 = mke0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            m441 m441Var = new m441(new ofk0(this.a, ((wje0) obj).c, (lnm) null, (byte) 15));
            cg00 cg00Var = new cg00(r261Var, (byte) 23);
            mke0Var.b = 1;
            Object objCollect = m441Var.collect(cg00Var, mke0Var);
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
