package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nkr0 implements iq20 {
    public final ru91 a;
    public final jkr0 b;

    public nkr0(ru91 ru91Var, jkr0 jkr0Var) {
        this.a = ru91Var;
        this.b = jkr0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p.iq20
    public final Object a(bs41 bs41Var, float f, lnm lnmVar) {
        mkr0 mkr0Var;
        if (lnmVar instanceof mkr0) {
            mkr0Var = (mkr0) lnmVar;
            int i = mkr0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mkr0Var.c = i - Integer.MIN_VALUE;
            } else {
                mkr0Var = new mkr0(this, (onm) lnmVar);
            }
        } else {
            mkr0Var = new mkr0(this, (onm) lnmVar);
        }
        Object objC = mkr0Var.a;
        int i2 = mkr0Var.c;
        if (i2 == 0) {
            hm5.M(objC);
            iu30 waq0Var = new waq0(this, bs41Var);
            mkr0Var.c = 1;
            objC = this.a.c(bs41Var, f, waq0Var, mkr0Var);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objC);
        }
        float fFloatValue = ((Number) objC).floatValue();
        jkr0 jkr0Var = this.b;
        kl1 kl1Var = jkr0Var.d;
        kl1 kl1Var2 = jkr0Var.d;
        if (kl1Var.q() != 0.0f && Math.abs(kl1Var2.q()) < 0.001d) {
            int iP = kl1Var2.p();
            if (jkr0Var.k.b()) {
                c921.y(((xjr0) jkr0Var.m.getValue()).s, (o8n) null, 0, new hc60(jkr0Var, (lnm) null, (byte) 3), 3);
            }
            jkr0Var.t(0.0f, iP, false);
        } else {
            yah0.o(kl1Var2.q());
        }
        return yah0.o(fFloatValue);
    }
}
