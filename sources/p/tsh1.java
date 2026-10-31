package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tsh1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ d0r a;

    public tsh1(d0r d0rVar) {
        this.a = d0rVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        ssh1 ssh1Var;
        if (onmVar instanceof ssh1) {
            ssh1Var = (ssh1) onmVar;
            int i = ssh1Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ssh1Var.b = i - Integer.MIN_VALUE;
            } else {
                ssh1Var = new ssh1(this, onmVar);
            }
        } else {
            ssh1Var = new ssh1(this, onmVar);
        }
        Object obj2 = ssh1Var.a;
        int i2 = ssh1Var.b;
        if (i2 != 0) {
            if (i2 == 1) {
                hm5.M(obj2);
                return rih1.a;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj2);
        ay8 ay8VarF = d3p1.F(this.a, zsh1.a, ((ksh1) obj).a);
        aud1 aud1Var = new aud1(r261Var, (byte) 5);
        ssh1Var.b = 1;
        ay8VarF.collect(new yhg1(aud1Var, (byte) 26), ssh1Var);
        return d9n.a;
    }
}
