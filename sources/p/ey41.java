package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ey41 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ yjq a;
    public final /* synthetic */ l7m0 b;

    public ey41(yjq yjqVar, l7m0 l7m0Var) {
        this.a = yjqVar;
        this.b = l7m0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        dy41 dy41Var;
        r6x sr0Var;
        if (onmVar instanceof dy41) {
            dy41Var = (dy41) onmVar;
            int i = dy41Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                dy41Var.b = i - Integer.MIN_VALUE;
            } else {
                dy41Var = new dy41(this, onmVar);
            }
        } else {
            dy41Var = new dy41(this, onmVar);
        }
        Object obj2 = dy41Var.a;
        int i2 = dy41Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            yx41 yx41Var = (yx41) obj;
            String str = yx41Var.a;
            if (ihc1.y0(str)) {
                sr0Var = r6x.a;
            } else {
                yjq yjqVar = this.a;
                sr0Var = new sr0(new lt20(new lt0(rqt0.u(new x010(new m441(new hxn(yjqVar, str, false, (lnm) null, (byte) 25)), rqt0.u(new php0((mr20) yjqVar.f, (byte) 24)), new mpw(yjqVar, (lnm) null), (byte) 1)), (byte) 3), new cpw(str, null, (byte) 1), (byte) 0), str, yx41Var, this.b, (byte) 24);
            }
            klp0 klp0Var = new klp0(r261Var, (byte) 18);
            dy41Var.b = 1;
            Object objCollect = sr0Var.collect(klp0Var, dy41Var);
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
