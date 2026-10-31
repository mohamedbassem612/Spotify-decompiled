package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class blr extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ blr(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                blr blrVar = new blr((clr) obj2, lnmVar, (byte) 0);
                blrVar.c = obj;
                return blrVar;
            case 1:
                blr blrVar2 = new blr((upy0) obj2, lnmVar, (byte) 1);
                blrVar2.c = obj;
                return blrVar2;
            case 2:
                blr blrVar3 = new blr((bvg1) obj2, lnmVar, (byte) 2);
                blrVar3.c = obj;
                return blrVar3;
            default:
                blr blrVar4 = new blr((f0p1) obj2, lnmVar, (byte) 3);
                blrVar4.c = obj;
                return blrVar4;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((gbl) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((mmr0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((v7g1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((zwo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0132, code lost:
    
        if (r4.c(r9) == r5) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.blr.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
