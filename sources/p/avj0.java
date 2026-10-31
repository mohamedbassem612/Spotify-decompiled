package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class avj0 implements enn {
    public final mnk0 a;
    public final rxj0 b;
    public final spn c;
    public final q8n d;

    public avj0(mnk0 mnk0Var, rxj0 rxj0Var, spn spnVar, q8n q8nVar) {
        this.a = mnk0Var;
        this.b = rxj0Var;
        this.c = spnVar;
        this.d = q8nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(qmn qmnVar, lnm lnmVar) {
        zuj0 zuj0Var;
        qmn qmnVar2;
        if (lnmVar instanceof zuj0) {
            zuj0Var = (zuj0) lnmVar;
            int i = zuj0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                zuj0Var.d = i - Integer.MIN_VALUE;
            } else {
                zuj0Var = new zuj0(this, (onm) lnmVar);
            }
        } else {
            zuj0Var = new zuj0(this, (onm) lnmVar);
        }
        Object objI = zuj0Var.b;
        int i2 = zuj0Var.d;
        rxj0 rxj0Var = this.b;
        if (i2 == 0) {
            hm5.M(objI);
            if (rxj0Var.r) {
                mr20 mr20Var = this.a.a;
                zuj0Var.a = qmnVar;
                zuj0Var.d = 1;
                objI = b5p1.i(mr20Var, zuj0Var);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
                qmnVar2 = qmnVar;
            }
            return null;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        qmnVar2 = zuj0Var.a;
        hm5.M(objI);
        if (((ibk0) objI).equals(ebk0.a) && rxj0Var.a) {
            return new mmn(ptx.c, new Integer(2131954650), new Integer(2131954651), new Integer(2131954649), (String) null, new tm81(0, 10, "mixed_playlist", (iu30) null, true), new nmn(), 9, new jmn(ktj0.Z, new v4e0(this, qmnVar2, (lnm) null, (byte) 27)), 84);
        }
        return null;
    }
}
