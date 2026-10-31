package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jfy implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ vx40 a;
    public final /* synthetic */ myq0 b;

    public jfy(vx40 vx40Var, myq0 myq0Var) {
        this.a = vx40Var;
        this.b = myq0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        ify ifyVar;
        if (onmVar instanceof ify) {
            ifyVar = (ify) onmVar;
            int i = ifyVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ifyVar.b = i - Integer.MIN_VALUE;
            } else {
                ifyVar = new ify(this, onmVar);
            }
        } else {
            ifyVar = new ify(this, onmVar);
        }
        Object obj2 = ifyVar.a;
        int i2 = ifyVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            sey seyVar = (sey) obj;
            mr20 mr20VarS = this.a.s(seyVar.a);
            myq0 myq0Var = this.b;
            lt20 lt20Var = new lt20(new pzs(new ht20(mr20VarS, new nnu(myq0Var, seyVar, (lnm) null, (byte) 21)), myq0Var, (byte) 21), new ew0(myq0Var, (lnm) null, (byte) 21), (byte) 0);
            wmk wmkVar = new wmk(r261Var, (byte) 26);
            ifyVar.b = 1;
            Object objCollect = lt20Var.collect(wmkVar, ifyVar);
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
