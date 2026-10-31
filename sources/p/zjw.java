package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zjw implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ clw a;

    public zjw(clw clwVar) {
        this.a = clwVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        sjw sjwVar;
        eq10 eq10Var;
        if (onmVar instanceof sjw) {
            sjwVar = (sjw) onmVar;
            int i = sjwVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                sjwVar.b = i - Integer.MIN_VALUE;
            } else {
                sjwVar = new sjw(this, onmVar);
            }
        } else {
            sjwVar = new sjw(this, onmVar);
        }
        Object obj2 = sjwVar.a;
        int i2 = sjwVar.b;
        lnm lnmVar = null;
        if (i2 == 0) {
            hm5.M(obj2);
            haa0 haa0Var = this.a.a;
            Set set = ((fbw) obj).a;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                int iOrdinal = ((ubd0) it.next()).ordinal();
                if (iOrdinal == 0) {
                    eq10Var = eq10.a;
                } else if (iOrdinal == 1) {
                    eq10Var = eq10.c;
                } else {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    eq10Var = eq10.b;
                }
                linkedHashSet.add(eq10Var);
            }
            kge kgeVarD = hu20.d(new mr20[]{hu20.c(new m441(new m2a0(haa0Var, (lnm) null, (byte) 12)), new q4d0(haa0Var, linkedHashSet, lnmVar, (byte) 16)), new mnc0(((kbd) haa0Var.d).b(), (byte) 21)});
            wmk wmkVar = new wmk(r261Var, (byte) 7);
            sjwVar.b = 1;
            Object objCollect = kgeVarD.collect(wmkVar, sjwVar);
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
