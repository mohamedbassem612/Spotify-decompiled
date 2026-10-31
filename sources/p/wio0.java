package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wio0 {
    public uio0 a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, onm onmVar) {
        vio0 vio0Var;
        if (onmVar instanceof vio0) {
            vio0Var = (vio0) onmVar;
            int i = vio0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vio0Var.c = i - Integer.MIN_VALUE;
            } else {
                vio0Var = new vio0(this, onmVar);
            }
        } else {
            vio0Var = new vio0(this, onmVar);
        }
        Object objQ = vio0Var.a;
        d9n d9nVar = d9n.a;
        int i2 = vio0Var.c;
        boolean z = false;
        ayh ayhVar = null;
        if (i2 == 0) {
            hm5.M(objQ);
            synchronized (this) {
                uio0 uio0Var = this.a;
                if (uio0Var != null) {
                    if (!u890.j(uio0Var.a, str)) {
                        uio0Var = null;
                    }
                    if (uio0Var != null) {
                        ayhVar = uio0Var.b;
                    }
                }
            }
            if (ayhVar != null) {
                vio0Var.c = 1;
                objQ = ayhVar.Q(vio0Var);
                if (objQ == d9nVar) {
                    return d9nVar;
                }
            }
            return Boolean.valueOf(z);
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objQ);
        if (((Boolean) objQ).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final synchronized void b(String str, boolean z) {
        uio0 uio0Var = this.a;
        if (uio0Var != null) {
            if (!u890.j(uio0Var.a, str)) {
                uio0Var = null;
            }
            if (uio0Var != null) {
                this.a = null;
                uio0Var.b.m0(Boolean.valueOf(z));
            }
        }
    }
}
