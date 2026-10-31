package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class c7c1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ q8n a;
    public final /* synthetic */ w4c1 b;
    public final /* synthetic */ String c;

    public c7c1(q8n q8nVar, w4c1 w4c1Var, String str) {
        this.a = q8nVar;
        this.b = w4c1Var;
        this.c = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        b7c1 b7c1Var;
        if (onmVar instanceof b7c1) {
            b7c1Var = (b7c1) onmVar;
            int i = b7c1Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                b7c1Var.b = i - Integer.MIN_VALUE;
            } else {
                b7c1Var = new b7c1(this, onmVar);
            }
        } else {
            b7c1Var = new b7c1(this, onmVar);
        }
        Object obj2 = b7c1Var.a;
        int i2 = b7c1Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            mr20 mr20VarR = o4p1.r(new m441(new ciw0((y6c1) obj, this.b, this.c, (lnm) null, (byte) 25)), this.a);
            klp0 klp0Var = new klp0(r261Var, (byte) 28);
            b7c1Var.b = 1;
            Object objCollect = mr20VarR.collect(klp0Var, b7c1Var);
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
