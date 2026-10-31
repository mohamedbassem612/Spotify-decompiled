package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bv2 {
    public final vu2 a;
    public final lmy0 b;
    public final yqg c;
    public final q8n d;

    public bv2(vu2 vu2Var, lmy0 lmy0Var, yqg yqgVar, q8n q8nVar) {
        this.a = vu2Var;
        this.b = lmy0Var;
        this.c = yqgVar;
        this.d = q8nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        av2 av2Var;
        if (onmVar instanceof av2) {
            av2Var = (av2) onmVar;
            int i = av2Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                av2Var.c = i - Integer.MIN_VALUE;
            } else {
                av2Var = new av2(this, onmVar);
            }
        } else {
            av2Var = new av2(this, onmVar);
        }
        Object objA = av2Var.a;
        int i2 = av2Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                vu2 vu2Var = this.a;
                av2Var.c = 1;
                objA = vu2Var.a(av2Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objA);
            }
            jq2 jq2Var = ((wv2) objA).a;
            return jq2Var == null ? tu2.a : b(jq2Var);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public final uu2 b(jq2 jq2Var) {
        Long lD0 = nhc1.d0(10, jq2Var.b);
        String str = jq2Var.a;
        if (u890.j(str, "ONLINE_STATE_ONLINE")) {
            if (lD0 != null) {
                long jLongValue = lD0.longValue();
                return this.c.b() - jLongValue > 300000 ? new ru2(lD0) : new su2(jLongValue);
            }
        } else if (u890.j(str, "ONLINE_STATE_OFFLINE")) {
            return new ru2(lD0);
        }
        return tu2.a;
    }
}
