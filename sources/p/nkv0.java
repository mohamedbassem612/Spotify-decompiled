package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nkv0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ skv0 a;

    public nkv0(skv0 skv0Var) {
        this.a = skv0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        lkv0 lkv0Var;
        if (onmVar instanceof lkv0) {
            lkv0Var = (lkv0) onmVar;
            int i = lkv0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                lkv0Var.b = i - Integer.MIN_VALUE;
            } else {
                lkv0Var = new lkv0(this, onmVar);
            }
        } else {
            lkv0Var = new lkv0(this, onmVar);
        }
        Object obj2 = lkv0Var.a;
        int i2 = lkv0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vjv0 vjv0Var = (vjv0) obj;
            skv0 skv0Var = this.a;
            lt20 lt20Var = new lt20(new evz(new uop0(yoi1.g(skv0Var.a.c(vjv0Var.a).distinctUntilChanged()), (byte) 18), new o8n0(4, (lnm) null, (byte) 2), (byte) 11), new dwf0(skv0Var, vjv0Var, (lnm) null, (byte) 13), (byte) 0);
            klp0 klp0Var = new klp0(r261Var, (byte) 6);
            lkv0Var.b = 1;
            Object objCollect = lt20Var.collect(klp0Var, lkv0Var);
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
