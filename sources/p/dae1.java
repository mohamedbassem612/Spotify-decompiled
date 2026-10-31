package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dae1 extends a8d1 implements vu30 {
    public byte a;
    public final /* synthetic */ faa0 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ eae1 d;
    public final /* synthetic */ elb0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dae1(faa0 faa0Var, float f, eae1 eae1Var, elb0 elb0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.b = faa0Var;
        this.c = f;
        this.d = eae1Var;
        this.e = elb0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new dae1(this.b, this.c, this.d, this.e, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x016c  */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        if (p.hap1.j(r7, r27) == r6) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.dae1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
