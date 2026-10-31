package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mkv0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ rkv0 a;

    public mkv0(rkv0 rkv0Var) {
        this.a = rkv0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        kkv0 kkv0Var;
        if (onmVar instanceof kkv0) {
            kkv0Var = (kkv0) onmVar;
            int i = kkv0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                kkv0Var.b = i - Integer.MIN_VALUE;
            } else {
                kkv0Var = new kkv0(this, onmVar);
            }
        } else {
            kkv0Var = new kkv0(this, onmVar);
        }
        Object obj2 = kkv0Var.a;
        int i2 = kkv0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            ujv0 ujv0Var = (ujv0) obj;
            rkv0 rkv0Var = this.a;
            lt20 lt20VarH = x4p1.h(x4p1.r(new uop0(yoi1.g(rkv0Var.a.c(ujv0Var.a).distinctUntilChanged()), (byte) 17), new o8n0()), new dwf0(rkv0Var, ujv0Var, (lnm) null, (byte) 12));
            klp0 klp0Var = new klp0(r261Var, (byte) 5);
            kkv0Var.b = 1;
            Object objCollect = lt20VarH.collect(klp0Var, kkv0Var);
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
