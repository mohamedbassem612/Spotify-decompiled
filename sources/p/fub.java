package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fub extends a8d1 implements vu30 {
    public byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ o95 d;
    public final /* synthetic */ short e;
    public final /* synthetic */ dlv f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public fub(boolean z, boolean z2, o95 o95Var, int i, dlv dlvVar, lnm lnmVar) {
        super(2, lnmVar);
        this.b = z;
        this.c = z2;
        this.d = o95Var;
        this.e = i;
        this.f = dlvVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new fub(this.b, this.c, this.d, this.e, this.f, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (r11.d.g(r0, r11) == r9) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        if (p.o95.b(r11.d, r0, r2, (java.lang.Float) null, (p.iu30) null, r11, 12) == r9) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
    
        if (r2.g(r1, r11) == r9) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009c, code lost:
    
        if (p.o95.b(r2, r4, r0, (java.lang.Float) null, (p.iu30) null, r11, 12) == r9) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            byte r0 = r11.a
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 5
            r4 = 4
            r6 = 3
            r7 = 1
            r8 = 2
            p.d9n r9 = p.d9n.a
            if (r0 == 0) goto L28
            if (r0 == r7) goto L18
            if (r0 == r8) goto L24
            if (r0 == r6) goto L18
            if (r0 == r4) goto L18
            if (r0 != r3) goto L1d
        L18:
            p.hm5.M(r12)
            goto L9f
        L1d:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            r0 = 0
            return r0
        L24:
            p.hm5.M(r12)
            goto L4f
        L28:
            p.hm5.M(r12)
            boolean r0 = r11.b
            boolean r10 = r11.c
            if (r0 == 0) goto L6d
            if (r10 == 0) goto L43
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r2)
            r11.a = r7
            p.o95 r1 = r11.d
            java.lang.Object r0 = r1.g(r0, r11)
            if (r0 != r9) goto L9f
            goto L9e
        L43:
            short r0 = r11.e
            long r3 = (long) r0
            r11.a = r8
            java.lang.Object r0 = p.hap1.i(r3, r11)
            if (r0 != r9) goto L4f
            goto L9e
        L4f:
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r2)
            r2 = 800(0x320, float:1.121E-42)
            p.dlv r3 = r11.f
            p.pxg1 r2 = p.irn1.o0(r2, r1, r3, r8)
            r11.a = r6
            r1 = r0
            p.o95 r0 = r11.d
            r3 = 0
            r4 = 0
            r6 = 12
            r5 = r11
            java.lang.Object r0 = p.o95.b(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r9) goto L9f
            goto L9e
        L6d:
            r0 = 0
            p.o95 r2 = r11.d
            if (r10 == 0) goto L80
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r0)
            r11.a = r4
            java.lang.Object r0 = r2.g(r1, r11)
            if (r0 != r9) goto L9f
            goto L9e
        L80:
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r0)
            r0 = 500(0x1f4, float:7.0E-43)
            p.ceo r6 = p.kub.a
            p.pxg1 r0 = p.irn1.o0(r0, r1, r6, r8)
            r11.a = r3
            r3 = 0
            r1 = r4
            r4 = 0
            r6 = 12
            r5 = r2
            r2 = r0
            r0 = r5
            r5 = r11
            java.lang.Object r0 = p.o95.b(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r9) goto L9f
        L9e:
            return r9
        L9f:
            p.rih1 r0 = p.rih1.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.fub.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
