package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mqu extends a8d1 implements zu30 {
    public byte a;
    public /* synthetic */ tqw b;
    public final /* synthetic */ nqu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mqu(nqu nquVar, lnm lnmVar) {
        super(4, lnmVar);
        this.c = nquVar;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        mqu mquVar = new mqu(this.c, (lnm) obj4);
        mquVar.b = (tqw) obj3;
        return mquVar.invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (p.fn31.Y(r8, r1, r7) == r6) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            p.tqw r0 = r7.b
            byte r1 = r7.a
            r2 = 0
            p.nqu r3 = r7.c
            r4 = 2
            r5 = 1
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L1f
            if (r1 == r5) goto L1b
            if (r1 != r4) goto L15
            p.hm5.M(r8)
            goto L43
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r2
        L1b:
            p.hm5.M(r8)
            goto L2f
        L1f:
            p.hm5.M(r8)
            p.iu30 r8 = r3.b
            r7.b = r0
            r7.a = r5
            java.lang.Object r8 = r8.invoke(r7)
            if (r8 != r6) goto L2f
            goto L42
        L2f:
            p.fns r8 = p.igu.a
            p.bs50 r8 = p.pyf0.a
            p.nnu r1 = new p.nnu
            r1.<init>(r3, r0, r2, r4)
            r7.b = r2
            r7.a = r4
            java.lang.Object r7 = p.fn31.Y(r8, r1, r7)
            if (r7 != r6) goto L43
        L42:
            return r6
        L43:
            p.rih1 r7 = p.rih1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.mqu.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
