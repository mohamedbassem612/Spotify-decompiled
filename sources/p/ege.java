package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ege implements vr20 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ ssw0 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public ege(faa0 faa0Var, k261 k261Var, ssw0 ssw0Var, d561 d561Var) {
        this.c = faa0Var;
        this.d = k261Var;
        this.b = ssw0Var;
        this.e = d561Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public Object b(mr20 mr20Var, lnm lnmVar) {
        dge dgeVar;
        k261 k261Var = (k261) this.d;
        if (lnmVar instanceof dge) {
            dgeVar = (dge) lnmVar;
            int i = dgeVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                dgeVar.d = i - Integer.MIN_VALUE;
            } else {
                dgeVar = new dge(this, lnmVar);
            }
        } else {
            dgeVar = new dge(this, lnmVar);
        }
        Object obj = dgeVar.b;
        int i2 = dgeVar.d;
        if (i2 == 0) {
            hm5.M(obj);
            faa0 faa0Var = (faa0) this.c;
            if (faa0Var != null) {
                op71.y(faa0Var);
            }
            dgeVar.a = mr20Var;
            dgeVar.d = 1;
            Object objB = k261Var.b(dgeVar);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mr20Var = dgeVar.a;
            hm5.M(obj);
        }
        c921.y(this.b, (o8n) null, 0, new sxa(mr20Var, (d561) this.e, k261Var, (lnm) null, (byte) 19), 3);
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bc, code lost:
    
        if (r7.b(r1, r3) == r10) goto L33;
     */
    @Override // p.vr20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r18, p.lnm r19) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ege.emit(java.lang.Object, p.lnm):java.lang.Object");
    }

    public ege(q6n1 q6n1Var, ssw0 ssw0Var, hx4 hx4Var, l811 l811Var) {
        this.c = q6n1Var;
        this.b = ssw0Var;
        this.d = hx4Var;
        this.e = l811Var;
    }
}
