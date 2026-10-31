package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class w0m1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ f2g1 a;

    public w0m1(f2g1 f2g1Var) {
        this.a = f2g1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        v0m1 v0m1Var;
        if (onmVar instanceof v0m1) {
            v0m1Var = (v0m1) onmVar;
            int i = v0m1Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                v0m1Var.b = i - Integer.MIN_VALUE;
            } else {
                v0m1Var = new v0m1(this, onmVar);
            }
        } else {
            v0m1Var = new v0m1(this, onmVar);
        }
        Object obj2 = v0m1Var.a;
        int i2 = v0m1Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            f0m1 f0m1Var = (f0m1) obj;
            try {
                ((n2t) ((tzo) this.a.b).b).c(vt7.d, 800);
            } catch (Exception unused) {
            }
            q1m1 q1m1Var = new q1m1(f0m1Var.a);
            v0m1Var.b = 1;
            Object objB = r261Var.b(q1m1Var, v0m1Var);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
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
