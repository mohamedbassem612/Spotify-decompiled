package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class joe {
    public final a1r0 a;
    public final poe b;
    public final v03 c;

    public joe(a1r0 a1r0Var, poe poeVar, v03 v03Var) {
        this.a = a1r0Var;
        this.b = poeVar;
        this.c = v03Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final Object a(String str, onm onmVar) {
        ioe ioeVar;
        poe poeVar = this.b;
        yqg yqgVar = poeVar.b;
        dma1 dma1Var = poeVar.a;
        if (onmVar instanceof ioe) {
            ioeVar = (ioe) onmVar;
            int i = ioeVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ioeVar.c = i - Integer.MIN_VALUE;
            } else {
                ioeVar = new ioe(this, onmVar);
            }
        } else {
            ioeVar = new ioe(this, onmVar);
        }
        Object objS = ioeVar.a;
        int i2 = ioeVar.c;
        if (i2 == 0) {
            hm5.M(objS);
            bma1 bma1Var = poe.c;
            long jG = dma1Var.g(bma1Var, 0L);
            long jB = (yqgVar.b() - jG) / 86400000;
            if (jG != 0 && jB < 30) {
                l1d.B(yqgVar, dma1Var.edit(), bma1Var);
                return moe.a;
            }
            sxa sxaVar = new sxa(this, str, (lnm) null, (byte) 23);
            ioeVar.c = 1;
            objS = smo1.s(sxaVar, ioeVar);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objS);
        }
        s03 s03Var = (u03) objS;
        if (!(s03Var instanceof s03)) {
            return loe.a;
        }
        hma1 hma1VarEdit = dma1Var.edit();
        hma1VarEdit.c(poe.c, yqgVar.b());
        hma1VarEdit.g();
        return new koe(s03Var.b());
    }
}
