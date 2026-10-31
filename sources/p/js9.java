package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class js9 extends z031 implements vu30 {
    public final /* synthetic */ byte b;
    public byte c;
    public /* synthetic */ Object d;
    public final /* synthetic */ iu30 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ js9(iu30 iu30Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.b = b;
        this.e = iu30Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.b;
        iu30 iu30Var = this.e;
        switch (b) {
            case 0:
                js9 js9Var = new js9(iu30Var, lnmVar, (byte) 0);
                js9Var.d = obj;
                return js9Var;
            case 1:
                js9 js9Var2 = new js9(iu30Var, lnmVar, (byte) 1);
                js9Var2.d = obj;
                return js9Var2;
            default:
                js9 js9Var3 = new js9(iu30Var, lnmVar, (byte) 2);
                js9Var3.d = obj;
                return js9Var3;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.b;
        rih1 rih1Var = rih1.a;
        i8d1 i8d1Var = (i8d1) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return create(i8d1Var, lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        if (r12 == r5) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0097, code lost:
    
        if (r12 == r5) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e2, code lost:
    
        if (r12 == r5) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.js9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
