package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class z0c extends a8d1 implements vu30 {
    public float a;
    public float b;
    public byte c;
    public final /* synthetic */ pob0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ lbh f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0c(pob0 pob0Var, int i, lbh lbhVar, lnm lnmVar) {
        super(2, lnmVar);
        this.d = pob0Var;
        this.e = i;
        this.f = lbhVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new z0c(this.d, this.e, this.f, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        if (r3.f(r2, r0, r6) == r4) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            byte r0 = r6.c
            r1 = 2
            r2 = 1
            p.pob0 r3 = r6.d
            p.d9n r4 = p.d9n.a
            if (r0 == 0) goto L21
            if (r0 == r2) goto L19
            if (r0 != r1) goto L12
            p.hm5.M(r7)
            goto L4f
        L12:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            r6 = 0
            return r6
        L19:
            float r0 = r6.b
            float r2 = r6.a
            p.hm5.M(r7)
            goto L42
        L21:
            p.hm5.M(r7)
            p.fjk1 r7 = r3.c()
            float r7 = r7.a
            p.fjk1 r0 = r3.c()
            float r0 = r0.b
            r6.a = r7
            r6.b = r0
            r6.c = r2
            int r2 = r6.e
            p.lbh r5 = r6.f
            java.lang.Object r2 = r3.g(r2, r5, r6)
            if (r2 != r4) goto L41
            goto L4e
        L41:
            r2 = r7
        L42:
            r6.a = r2
            r6.b = r0
            r6.c = r1
            java.lang.Object r6 = r3.f(r2, r0, r6)
            if (r6 != r4) goto L4f
        L4e:
            return r4
        L4f:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.z0c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
