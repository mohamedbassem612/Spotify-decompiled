package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a2h0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ b2h0 a;

    public a2h0(b2h0 b2h0Var) {
        this.a = b2h0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        z1h0 z1h0Var;
        if (onmVar instanceof z1h0) {
            z1h0Var = (z1h0) onmVar;
            int i = z1h0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                z1h0Var.b = i - Integer.MIN_VALUE;
            } else {
                z1h0Var = new z1h0(this, onmVar);
            }
        } else {
            z1h0Var = new z1h0(this, onmVar);
        }
        Object obj2 = z1h0Var.a;
        int i2 = z1h0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            e2h0 e2h0Var = new e2h0(((kzg0) obj).a, x74.j(this.a.U0.a, "android.permission.RECORD_AUDIO") == 0);
            z1h0Var.b = 1;
            Object objB = r261Var.b(e2h0Var, z1h0Var);
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
