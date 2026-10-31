package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jub extends a8d1 implements vu30 {
    public long a;
    public float b;
    public byte c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ long f;
    public final /* synthetic */ drr0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jub(boolean z, boolean z2, long j, drr0 drr0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.d = z;
        this.e = z2;
        this.f = j;
        this.g = drr0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new jub(this.d, this.e, this.f, this.g, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:29:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (r1 == r6) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            byte r1 = r0.c
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 2
            r4 = 1
            p.drr0 r5 = r0.g
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L27
            if (r1 == r4) goto L21
            if (r1 != r3) goto L1a
            float r1 = r0.b
            long r7 = r0.a
            p.hm5.M(r18)
            goto L5f
        L1a:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            r0 = 0
            return r0
        L21:
            p.hm5.M(r18)
            r1 = r18
            goto L53
        L27:
            p.hm5.M(r18)
            boolean r1 = r0.d
            if (r1 == 0) goto L34
            p.ceo r0 = p.kub.a
            r5.t(r2)
            goto L8b
        L34:
            boolean r1 = r0.e
            if (r1 == 0) goto L8b
            long r7 = r0.f
            r9 = 0
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 <= 0) goto L8b
            p.iub r1 = p.iub.b
            r0.c = r4
            p.o8n r4 = r0.getContext()
            p.rjm0 r4 = p.s110.h(r4)
            java.lang.Object r1 = r4.D(r1, r0)
            if (r1 != r6) goto L53
            goto L8a
        L53:
            java.lang.Number r1 = (java.lang.Number) r1
            long r7 = r1.longValue()
            p.ceo r1 = p.kub.a
            float r1 = r5.s()
        L5f:
            r12 = r1
            r10 = r7
        L61:
            p.ceo r1 = p.kub.a
            float r1 = r5.s()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L8b
            p.ca5 r9 = new p.ca5
            p.drr0 r15 = r0.g
            r16 = 2
            long r13 = r0.f
            r9.<init>(r10, r12, r13, r15, r16)
            r0.a = r10
            r0.b = r12
            r0.c = r3
            p.o8n r1 = r0.getContext()
            p.rjm0 r1 = p.s110.h(r1)
            java.lang.Object r1 = r1.D(r9, r0)
            if (r1 != r6) goto L61
        L8a:
            return r6
        L8b:
            p.rih1 r0 = p.rih1.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.jub.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
