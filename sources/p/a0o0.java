package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class a0o0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ iu30 a;

    public a0o0(iu30 iu30Var) {
        this.a = iu30Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        zzn0 zzn0Var;
        if (onmVar instanceof zzn0) {
            zzn0Var = (zzn0) onmVar;
            int i = zzn0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzn0Var.b = i - Integer.MIN_VALUE;
            } else {
                zzn0Var = new zzn0(this, onmVar);
            }
        } else {
            zzn0Var = new zzn0(this, onmVar);
        }
        Object obj2 = zzn0Var.a;
        int i2 = zzn0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            mr20 mr20Var = (mr20) this.a.invoke((vzn0) obj);
            q5g0 q5g0Var = new q5g0(r261Var, (byte) 23);
            zzn0Var.b = 1;
            Object objCollect = mr20Var.collect(q5g0Var, zzn0Var);
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
