package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ud5 extends a8d1 implements vu30 {
    public int a;
    public byte b;
    public final /* synthetic */ o95 c;
    public final /* synthetic */ short d;
    public final /* synthetic */ ni20 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ud5(o95 o95Var, int i, ni20 ni20Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = o95Var;
        this.d = i;
        this.e = ni20Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new ud5(this.c, this.d, this.e, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0055 A[PHI: r0
      0x0055: PHI (r0v9 int) = (r0v7 int), (r0v7 int), (r0v10 int) binds: [B:16:0x0045, B:18:0x0052, B:9:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
    
        if (p.o95.b(r12.c, r6, r12.e, (java.lang.Float) null, (p.iu30) null, r12, 12) == r4) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            byte r0 = r12.b
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 2
            r3 = 1
            p.d9n r4 = p.d9n.a
            if (r0 == 0) goto L1f
            if (r0 == r3) goto L19
            if (r0 != r2) goto L12
            p.hm5.M(r13)
            goto L6e
        L12:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r12)
            r12 = 0
            return r12
        L19:
            int r0 = r12.a
            p.hm5.M(r13)
            goto L55
        L1f:
            p.hm5.M(r13)
            p.o95 r13 = r12.c
            java.lang.Object r0 = r13.e()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L6e
            java.lang.Object r13 = r13.e()
            java.lang.Number r13 = (java.lang.Number) r13
            float r13 = r13.floatValue()
            r0 = 0
            int r13 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r13 <= 0) goto L43
            r0 = r3
            goto L45
        L43:
            r13 = 0
            r0 = r13
        L45:
            if (r0 != 0) goto L55
            short r13 = r12.d
            long r5 = (long) r13
            r12.a = r0
            r12.b = r3
            java.lang.Object r13 = p.hap1.i(r5, r12)
            if (r13 != r4) goto L55
            goto L6d
        L55:
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r1)
            r12.a = r0
            r12.b = r2
            p.o95 r5 = r12.c
            p.ni20 r7 = r12.e
            r8 = 0
            r9 = 0
            r11 = 12
            r10 = r12
            java.lang.Object r12 = p.o95.b(r5, r6, r7, r8, r9, r10, r11)
            if (r12 != r4) goto L6e
        L6d:
            return r4
        L6e:
            p.rih1 r12 = p.rih1.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ud5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
