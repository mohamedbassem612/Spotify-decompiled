package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class oz80 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 2;
    public byte b;
    public final /* synthetic */ long c;
    public Object d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oz80(o811 o811Var, o811 o811Var2, qz80 qz80Var, long j, lnm lnmVar) {
        super(2, lnmVar);
        this.d = o811Var;
        this.e = o811Var2;
        this.f = qz80Var;
        this.c = j;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.f;
        switch (b) {
            case 0:
                return new oz80((o811) this.d, (o811) this.e, (qz80) obj2, this.c, lnmVar);
            case 1:
                oz80 oz80Var = new oz80((ssk1) this.e, this.c, (yln1) obj2, lnmVar);
                oz80Var.d = obj;
                return oz80Var;
            default:
                oz80 oz80Var2 = new oz80((cik1) obj2, this.c, lnmVar);
                oz80Var2.e = obj;
                return oz80Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((rvo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((zwo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:31:0x00de  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0175, code lost:
    
        if (p.xpn1.H(r18) == r5) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0187, code lost:
    
        if (p.hap1.i((r12 - r10) / 1000000, r18) == r5) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.oz80.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oz80(cik1 cik1Var, long j, lnm lnmVar) {
        super(2, lnmVar);
        this.f = cik1Var;
        this.c = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oz80(ssk1 ssk1Var, long j, yln1 yln1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.e = ssk1Var;
        this.c = j;
        this.f = yln1Var;
    }
}
