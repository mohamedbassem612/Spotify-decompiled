package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z7k implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ dg8 a;

    public z7k(dg8 dg8Var) {
        this.a = dg8Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        y7k y7kVar;
        if (onmVar instanceof y7k) {
            y7kVar = (y7k) onmVar;
            int i = y7kVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                y7kVar.b = i - Integer.MIN_VALUE;
            } else {
                y7kVar = new y7k(this, onmVar);
            }
        } else {
            y7kVar = new y7k(this, onmVar);
        }
        Object obj2 = y7kVar.a;
        int i2 = y7kVar.b;
        rih1 rih1Var = rih1.a;
        if (i2 != 0) {
            if (i2 == 1) {
                hm5.M(obj2);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj2);
        xs4 xs4VarW = this.a.w(((i7k) obj).a);
        z6f z6fVar = new z6f(r261Var, (byte) 12);
        y7kVar.b = 1;
        Object objCollect = xs4VarW.collect(new x1h(z6fVar, (byte) 14), y7kVar);
        d9n d9nVar = d9n.a;
        if (objCollect != d9nVar) {
            objCollect = rih1Var;
        }
        return objCollect == d9nVar ? d9nVar : rih1Var;
    }
}
