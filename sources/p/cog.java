package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cog implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ qo71 a;
    public final /* synthetic */ izj1 b;
    public final /* synthetic */ yqg c;
    public final /* synthetic */ dmr d;

    public cog(qo71 qo71Var, izj1 izj1Var, yqg yqgVar, dmr dmrVar) {
        this.a = qo71Var;
        this.b = izj1Var;
        this.c = yqgVar;
        this.d = dmrVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        bog bogVar;
        if (onmVar instanceof bog) {
            bogVar = (bog) onmVar;
            int i = bogVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                bogVar.b = i - Integer.MIN_VALUE;
            } else {
                bogVar = new bog(this, onmVar);
            }
        } else {
            bogVar = new bog(this, onmVar);
        }
        Object obj2 = bogVar.a;
        int i2 = bogVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            kog kogVar = (kog) obj;
            jog jogVar = kogVar.d;
            if (jogVar != null) {
                String str = jogVar.c;
                int iB = (int) (this.c.b() - jogVar.d);
                boolean z = kogVar.c;
                String str2 = jogVar.e;
                dmr dmrVar = this.d;
                if (z) {
                    dmrVar.c(str2, str, iB, jogVar.a, false, 2, jogVar.f, jogVar.g);
                } else {
                    dmrVar.c(str2, str, iB, jogVar.a, false, 4, jogVar.f, jogVar.g);
                }
            }
            bogVar.b = 1;
            Object objA = this.a.a(bogVar);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        this.b.invoke();
        return rih1.a;
    }
}
