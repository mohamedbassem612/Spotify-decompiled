package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oze implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ o0f a;

    public oze(o0f o0fVar) {
        this.a = o0fVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        nze nzeVar;
        if (onmVar instanceof nze) {
            nzeVar = (nze) onmVar;
            int i = nzeVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                nzeVar.b = i - Integer.MIN_VALUE;
            } else {
                nzeVar = new nze(this, onmVar);
            }
        } else {
            nzeVar = new nze(this, onmVar);
        }
        Object obj2 = nzeVar.a;
        int i2 = nzeVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            he11 he11Var = this.a.o;
            String str = ((txe) obj).a;
            nzeVar.b = 1;
            Object objB = he11Var.b(str, nzeVar);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
            Object obj3 = ((e331) obj2).a;
        }
        return rih1.a;
    }
}
