package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ipo extends a8d1 implements vu30 {
    public byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ven0 c;
    public final /* synthetic */ o95 d;
    public final /* synthetic */ c9n e;
    public final /* synthetic */ int f;
    public final /* synthetic */ ven0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ipo(boolean z, ven0 ven0Var, o95 o95Var, c9n c9nVar, int i, ven0 ven0Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.b = z;
        this.c = ven0Var;
        this.d = o95Var;
        this.e = c9nVar;
        this.f = i;
        this.g = ven0Var2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new ipo(this.b, this.c, this.d, this.e, this.f, this.g, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        if (r4.g(r3, r6) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        if (r4.g(r1, r6) == r0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            byte r0 = r6.a
            r1 = 0
            p.ven0 r2 = r6.g
            r3 = 2
            p.o95 r4 = r6.d
            r5 = 1
            if (r0 == 0) goto L1d
            if (r0 == r5) goto L19
            if (r0 != r3) goto L13
            p.hm5.M(r7)
            goto L65
        L13:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r1
        L19:
            p.hm5.M(r7)
            goto L41
        L1d:
            p.hm5.M(r7)
            boolean r7 = r6.b
            p.d9n r0 = p.d9n.a
            if (r7 == 0) goto L54
            p.ven0 r7 = r6.c
            java.lang.Object r7 = r7.getValue()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            float r7 = (float) r7
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r7)
            r6.a = r5
            java.lang.Object r7 = r4.g(r3, r6)
            if (r7 != r0) goto L41
            goto L64
        L41:
            b r7 = new b
            r0 = 7
            r7.<init>(r4, r1, r0)
            r0 = 3
            r3 = 0
            p.c9n r6 = r6.e
            p.fn31.T(r6, r1, r3, r7, r0)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r2.setValue(r6)
            goto L6a
        L54:
            int r7 = r6.f
            float r7 = (float) r7
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r7)
            r6.a = r3
            java.lang.Object r6 = r4.g(r1, r6)
            if (r6 != r0) goto L65
        L64:
            return r0
        L65:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r2.setValue(r6)
        L6a:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ipo.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
