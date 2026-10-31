package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRefCount;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class w5z0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ro30 a;

    public w5z0(ro30 ro30Var) {
        this.a = ro30Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        v5z0 v5z0Var;
        if (onmVar instanceof v5z0) {
            v5z0Var = (v5z0) onmVar;
            int i = v5z0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                v5z0Var.b = i - Integer.MIN_VALUE;
            } else {
                v5z0Var = new v5z0(this, onmVar);
            }
        } else {
            v5z0Var = new v5z0(this, onmVar);
        }
        Object obj2 = v5z0Var.a;
        int i2 = v5z0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            ro30 ro30Var = this.a;
            goq goqVar = (goq) ro30Var.b;
            kge kgeVar = (kge) goqVar.h;
            FlowableRefCount flowableRefCount = ((i710) goqVar.g).b.c;
            vbm[] vbmVarArr = q601.a;
            lt20 lt20Var = new lt20(new h5y0(rqt0.u(new lt20(new x010(kgeVar, new kge(flowableRefCount), new qr0(goqVar, (lnm) null, (byte) 16), (byte) 1), new vv70(ro30Var, (lnm) null, (byte) 3), (byte) 0)), (byte) 8), new w1e0(3, (lnm) null, (byte) 21), (byte) 0);
            klp0 klp0Var = new klp0(r261Var, (byte) 11);
            v5z0Var.b = 1;
            Object objCollect = lt20Var.collect(klp0Var, v5z0Var);
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
