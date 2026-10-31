package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class piu0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ d0r a;
    public final /* synthetic */ o3r b;

    public piu0(d0r d0rVar, o3r o3rVar) {
        this.a = d0rVar;
        this.b = o3rVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        oiu0 oiu0Var;
        if (onmVar instanceof oiu0) {
            oiu0Var = (oiu0) onmVar;
            int i = oiu0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                oiu0Var.b = i - Integer.MIN_VALUE;
            } else {
                oiu0Var = new oiu0(this, onmVar);
            }
        } else {
            oiu0Var = new oiu0(this, onmVar);
        }
        Object obj2 = oiu0Var.a;
        int i2 = oiu0Var.b;
        if (i2 != 0) {
            if (i2 == 1) {
                hm5.M(obj2);
                return rih1.a;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj2);
        ay8 ay8VarF = d3p1.F(this.a, this.b, new wju0("", ((eju0) obj).a, (String) null));
        klp0 klp0Var = new klp0(r261Var, (byte) 3);
        oiu0Var.b = 1;
        ay8VarF.collect(new dfu0(klp0Var, (byte) 3), oiu0Var);
        return d9n.a;
    }
}
