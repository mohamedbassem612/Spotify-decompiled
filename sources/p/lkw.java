package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lkw implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ elw a;

    public lkw(elw elwVar) {
        this.a = elwVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        ikw ikwVar;
        if (onmVar instanceof ikw) {
            ikwVar = (ikw) onmVar;
            int i = ikwVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ikwVar.b = i - Integer.MIN_VALUE;
            } else {
                ikwVar = new ikw(this, onmVar);
            }
        } else {
            ikwVar = new ikw(this, onmVar);
        }
        Object obj2 = ikwVar.a;
        int i2 = ikwVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            v6a0 v6a0Var = this.a.b;
            Long l = ((cgw) obj).a;
            yc2 yc2Var = l != null ? new yc2(new m441(new tfb0(false, l, (yqg) v6a0Var.b, (ihd0) v6a0Var.c, false, null)), (byte) 14) : new huz(new al50((String) null, (String) null), (byte) 10);
            wmk wmkVar = new wmk(r261Var, (byte) 16);
            ikwVar.b = 1;
            Object objCollect = yc2Var.collect(wmkVar, ikwVar);
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
