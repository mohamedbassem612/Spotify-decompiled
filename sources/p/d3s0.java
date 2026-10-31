package p;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class d3s0 {
    public AtomicBoolean a;

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(iu30 iu30Var, onm onmVar) {
        c3s0 c3s0Var;
        AtomicBoolean atomicBoolean = this.a;
        if (onmVar instanceof c3s0) {
            c3s0Var = (c3s0) onmVar;
            int i = c3s0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3s0Var.c = i - Integer.MIN_VALUE;
            } else {
                c3s0Var = new c3s0(this, onmVar);
            }
        } else {
            c3s0Var = new c3s0(this, onmVar);
        }
        Object objInvoke = c3s0Var.a;
        int i2 = c3s0Var.c;
        rih1 rih1Var = rih1.a;
        if (i2 == 0) {
            hm5.M(objInvoke);
            if (atomicBoolean.getAndSet(false)) {
                c3s0Var.c = 1;
                objInvoke = iu30Var.invoke(c3s0Var);
                Object obj = d9n.a;
                if (objInvoke == obj) {
                    return obj;
                }
            }
            return rih1Var;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objInvoke);
        if (!((Boolean) objInvoke).booleanValue()) {
            atomicBoolean.set(true);
        }
        return rih1Var;
    }
}
