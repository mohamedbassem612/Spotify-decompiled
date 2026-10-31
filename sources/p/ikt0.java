package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ikt0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public Exception b;
    public byte c;
    public /* synthetic */ Object d;
    public final /* synthetic */ o751 e;
    public final /* synthetic */ sx41 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ikt0(o751 o751Var, sx41 sx41Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = o751Var;
        this.f = sx41Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        sx41 sx41Var = this.f;
        o751 o751Var = this.e;
        switch (b) {
            case 0:
                ikt0 ikt0Var = new ikt0(o751Var, sx41Var, lnmVar, (byte) 0);
                ikt0Var.d = obj;
                return ikt0Var;
            default:
                ikt0 ikt0Var2 = new ikt0(o751Var, sx41Var, lnmVar, (byte) 1);
                ikt0Var2.d = obj;
                return ikt0Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ssw0 ssw0Var = (ssw0) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(ssw0Var, lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008f, code lost:
    
        if (r13.b(r1, r6) == r10) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0115, code lost:
    
        if (r13.b(r1, r6) == r10) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ikt0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
