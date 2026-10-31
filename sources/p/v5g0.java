package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class v5g0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ a6g0 a;

    public v5g0(a6g0 a6g0Var) {
        this.a = a6g0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        u5g0 u5g0Var;
        if (onmVar instanceof u5g0) {
            u5g0Var = (u5g0) onmVar;
            int i = u5g0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                u5g0Var.b = i - Integer.MIN_VALUE;
            } else {
                u5g0Var = new u5g0(this, onmVar);
            }
        } else {
            u5g0Var = new u5g0(this, onmVar);
        }
        Object obj2 = u5g0Var.a;
        int i2 = u5g0Var.b;
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
        f5g0 f5g0Var = (f5g0) obj;
        l5g0 l5g0Var = this.a.a;
        String str = f5g0Var.b;
        boolean z = f5g0Var.c;
        ix7 ix7Var = l5g0Var.e;
        ix7Var.getClass();
        ezc ezcVarF = h4p1.f(new du2(ix7Var, str, z, (lnm) null));
        q5g0 q5g0Var = new q5g0(r261Var, (byte) 2);
        u5g0Var.b = 1;
        Object objCollect = ezcVarF.collect(new r90(q5g0Var, str, z, (byte) 2), u5g0Var);
        d9n d9nVar = d9n.a;
        if (objCollect != d9nVar) {
            objCollect = rih1Var;
        }
        return objCollect == d9nVar ? d9nVar : rih1Var;
    }
}
