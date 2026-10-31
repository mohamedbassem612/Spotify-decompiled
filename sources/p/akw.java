package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class akw implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ dlw a;

    public akw(dlw dlwVar) {
        this.a = dlwVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        tjw tjwVar;
        if (onmVar instanceof tjw) {
            tjwVar = (tjw) onmVar;
            int i = tjwVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                tjwVar.b = i - Integer.MIN_VALUE;
            } else {
                tjwVar = new tjw(this, onmVar);
            }
        } else {
            tjwVar = new tjw(this, onmVar);
        }
        Object obj2 = tjwVar.a;
        int i2 = tjwVar.b;
        lnm lnmVar = null;
        if (i2 == 0) {
            hm5.M(obj2);
            qbw qbwVar = (qbw) obj;
            d0r d0rVar = (d0r) this.a.a.b;
            Set set = s4b1.f;
            String str = qbwVar.a;
            String strS = uic.x(str).s();
            huz huzVar = strS == null ? new huz(new ho10(new IllegalStateException(l1d.m("Cannot extract username from: ", str))), (byte) 10) : new lt20(new ve1(new x010(d3p1.F(d0rVar, kzd.a, str), d3p1.F(d0rVar, kzd.b, qbwVar.b), new t83(qbwVar, strS, (lnm) null, (byte) 6), (byte) 1), (byte) 7), new w1e0(3, lnmVar, (byte) 5), (byte) 0);
            wmk wmkVar = new wmk(r261Var, (byte) 8);
            tjwVar.b = 1;
            Object objCollect = huzVar.collect(wmkVar, tjwVar);
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
