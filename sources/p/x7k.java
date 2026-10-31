package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x7k implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ dg8 a;

    public x7k(dg8 dg8Var) {
        this.a = dg8Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        w7k w7kVar;
        if (onmVar instanceof w7k) {
            w7kVar = (w7k) onmVar;
            int i = w7kVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                w7kVar.b = i - Integer.MIN_VALUE;
            } else {
                w7kVar = new w7k(this, onmVar);
            }
        } else {
            w7kVar = new w7k(this, onmVar);
        }
        Object obj2 = w7kVar.a;
        int i2 = w7kVar.b;
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
        String str = ((h7k) obj).a;
        ezc ezcVarV = this.a.v(Collections.singletonList(str), w5h.f);
        z6f z6fVar = new z6f(r261Var, (byte) 11);
        w7kVar.b = 1;
        Object objCollect = ezcVarV.collect(new st(new x1h(z6fVar, (byte) 13), str, (byte) 18), w7kVar);
        d9n d9nVar = d9n.a;
        if (objCollect != d9nVar) {
            objCollect = rih1Var;
        }
        if (objCollect != d9nVar) {
            objCollect = rih1Var;
        }
        return objCollect == d9nVar ? d9nVar : rih1Var;
    }
}
