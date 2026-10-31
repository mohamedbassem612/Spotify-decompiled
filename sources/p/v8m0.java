package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v8m0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ l9m0 a;

    public v8m0(l9m0 l9m0Var) {
        this.a = l9m0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        u8m0 u8m0Var;
        mr20 mr20VarR;
        if (onmVar instanceof u8m0) {
            u8m0Var = (u8m0) onmVar;
            int i = u8m0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                u8m0Var.b = i - Integer.MIN_VALUE;
            } else {
                u8m0Var = new u8m0(this, onmVar);
            }
        } else {
            u8m0Var = new u8m0(this, onmVar);
        }
        Object obj2 = u8m0Var.a;
        int i2 = u8m0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            cce cceVar = this.a.a;
            String str = ((gcm1) obj).e;
            if (str == null || (mr20VarR = o4p1.r(new lt20(new ht20(new mgb(((bfd) cceVar.b).z(str, 0, false), cceVar, (byte) 20), new sd0(2, (lnm) null, (byte) 19)), new rf2(3, (lnm) null, (byte) 12), (byte) 0), (q8n) cceVar.d)) == null) {
                mr20VarR = r6x.a;
            }
            q5g0 q5g0Var = new q5g0(r261Var, (byte) 17);
            u8m0Var.b = 1;
            Object objCollect = mr20VarR.collect(q5g0Var, u8m0Var);
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
