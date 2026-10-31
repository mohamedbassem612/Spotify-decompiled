package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zfd1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ vx40 a;
    public final /* synthetic */ myq0 b;

    public zfd1(vx40 vx40Var, myq0 myq0Var) {
        this.a = vx40Var;
        this.b = myq0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        yfd1 yfd1Var;
        if (onmVar instanceof yfd1) {
            yfd1Var = (yfd1) onmVar;
            int i = yfd1Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                yfd1Var.b = i - Integer.MIN_VALUE;
            } else {
                yfd1Var = new yfd1(this, onmVar);
            }
        } else {
            yfd1Var = new yfd1(this, onmVar);
        }
        Object obj2 = yfd1Var.a;
        int i2 = yfd1Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            String str = ((nfd1) obj).a;
            mr20 mr20VarS = this.a.s(str);
            myq0 myq0Var = this.b;
            lt20 lt20Var = new lt20(new mpy0(mr20VarS, str, myq0Var, (byte) 18), new afb1(myq0Var, str, (lnm) null, (byte) 2), (byte) 0);
            klp0 klp0Var = new klp0(r261Var, (byte) 29);
            yfd1Var.b = 1;
            Object objCollect = lt20Var.collect(klp0Var, yfd1Var);
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
