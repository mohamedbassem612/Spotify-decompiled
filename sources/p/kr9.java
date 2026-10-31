package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kr9 {
    public final jn7 a;
    public final q8n b;
    public final llm c;
    public s2t d;
    public s2t e;

    public kr9(jn7 jn7Var, q8n q8nVar, q8n q8nVar2) {
        this.a = jn7Var;
        this.b = q8nVar;
        this.c = us71.h(q8nVar2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        er9 er9Var;
        boolean zBooleanValue;
        if (onmVar instanceof er9) {
            er9Var = (er9) onmVar;
            int i = er9Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                er9Var.c = i - Integer.MIN_VALUE;
            } else {
                er9Var = new er9(this, onmVar);
            }
        } else {
            er9Var = new er9(this, onmVar);
        }
        Object objQ = er9Var.a;
        int i2 = er9Var.c;
        if (i2 == 0) {
            hm5.M(objQ);
            s2t s2tVar = this.d;
            if (s2tVar != null) {
                er9Var.c = 1;
                objQ = s2tVar.Q(er9Var);
                d9n d9nVar = d9n.a;
                if (objQ == d9nVar) {
                    return d9nVar;
                }
            } else {
                zBooleanValue = false;
            }
            return Boolean.valueOf(zBooleanValue);
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objQ);
        zBooleanValue = ((Boolean) objQ).booleanValue();
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(boolean z, onm onmVar) {
        gr9 gr9Var;
        if (onmVar instanceof gr9) {
            gr9Var = (gr9) onmVar;
            int i = gr9Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gr9Var.c = i - Integer.MIN_VALUE;
            } else {
                gr9Var = new gr9(this, onmVar);
            }
        } else {
            gr9Var = new gr9(this, onmVar);
        }
        Object obj = gr9Var.a;
        int i2 = gr9Var.c;
        boolean z2 = true;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                q8n q8nVar = this.b;
                oy3 oy3Var = new oy3(z, this, (lnm) null, (byte) 2);
                gr9Var.c = 1;
                Object objY = fn31.Y(q8nVar, oy3Var, gr9Var);
                d9n d9nVar = d9n.a;
                if (objY == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
