package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rv3 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rv3(Object obj, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = obj;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                return new rv3((tv3) obj, lnmVar, (byte) 0);
            case 1:
                return new rv3((n4e1) obj, lnmVar, (byte) 1);
            case 2:
                return new rv3((x6e1) obj, lnmVar, (byte) 2);
            default:
                return new rv3((y9i1) obj, lnmVar, (byte) 3);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0075  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00dc, code lost:
    
        if (r14 == r3) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0148, code lost:
    
        if (r14 == r3) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x019f, code lost:
    
        if (r14 == r3) goto L100;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.rv3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
