package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class f9m0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ k9m0 a;

    public f9m0(k9m0 k9m0Var) {
        this.a = k9m0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        e9m0 e9m0Var;
        if (onmVar instanceof e9m0) {
            e9m0Var = (e9m0) onmVar;
            int i = e9m0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                e9m0Var.b = i - Integer.MIN_VALUE;
            } else {
                e9m0Var = new e9m0(this, onmVar);
            }
        } else {
            e9m0Var = new e9m0(this, onmVar);
        }
        Object obj2 = e9m0Var.a;
        int i2 = e9m0Var.b;
        if (i2 != 0) {
            if (i2 == 1) {
                hm5.M(obj2);
                return rih1.a;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj2);
        m7y0 m7y0Var = this.a.d;
        String str = ((euf) obj).a;
        ay8 ay8VarF = d3p1.F((d0r) m7y0Var.b, yt21.a, str);
        q5g0 q5g0Var = new q5g0(r261Var, (byte) 20);
        e9m0Var.b = 1;
        ay8VarF.collect(new ml21((vr20) new ru11(new dgk0(q5g0Var, (byte) 9), str, (byte) 3), (byte) 3), e9m0Var);
        return d9n.a;
    }
}
