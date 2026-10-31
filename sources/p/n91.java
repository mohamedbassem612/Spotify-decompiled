package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class n91 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ aa1 a;

    public n91(aa1 aa1Var) {
        this.a = aa1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        m91 m91Var;
        if (onmVar instanceof m91) {
            m91Var = (m91) onmVar;
            int i = m91Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                m91Var.b = i - Integer.MIN_VALUE;
            } else {
                m91Var = new m91(this, onmVar);
            }
        } else {
            m91Var = new m91(this, onmVar);
        }
        Object obj2 = m91Var.a;
        int i2 = m91Var.b;
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
        s81 s81Var = (s81) obj;
        d91 d91Var = this.a.a;
        String str = s81Var.c;
        boolean z = s81Var.d;
        ix7 ix7Var = d91Var.g;
        ix7Var.getClass();
        ezc ezcVarF = h4p1.f(new du2(ix7Var, str, z, (lnm) null));
        k91 k91Var = new k91(r261Var, (byte) 1);
        m91Var.b = 1;
        Object objCollect = ezcVarF.collect(new r90(k91Var, str, z, (byte) 1), m91Var);
        d9n d9nVar = d9n.a;
        if (objCollect != d9nVar) {
            objCollect = rih1Var;
        }
        return objCollect == d9nVar ? d9nVar : rih1Var;
    }
}
