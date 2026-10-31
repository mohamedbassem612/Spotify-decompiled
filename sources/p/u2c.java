package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u2c extends a8d1 implements vu30 {
    public int a;
    public float b;
    public byte c;
    public final /* synthetic */ Integer d;
    public final /* synthetic */ int e;
    public final /* synthetic */ float f;
    public final /* synthetic */ o95 g;
    public final /* synthetic */ drr0 h;
    public final /* synthetic */ ven0 i;
    public final /* synthetic */ ven0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2c(Integer num, int i, float f, o95 o95Var, drr0 drr0Var, ven0 ven0Var, ven0 ven0Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.d = num;
        this.e = i;
        this.f = f;
        this.g = o95Var;
        this.h = drr0Var;
        this.i = ven0Var;
        this.t = ven0Var2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new u2c(this.d, this.e, this.f, this.g, this.h, this.i, this.t, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a3, code lost:
    
        if (r0 == r10) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            byte r0 = r14.c
            p.rih1 r7 = p.rih1.a
            p.az31 r8 = p.az31.a
            r1 = 2
            p.ven0 r9 = r14.i
            p.drr0 r2 = r14.h
            r3 = 1
            r4 = 0
            p.d9n r10 = p.d9n.a
            if (r0 == 0) goto L2c
            if (r0 == r3) goto L24
            if (r0 != r1) goto L1e
            p.hm5.M(r15)     // Catch: java.lang.Throwable -> L1b
            r0 = r15
            goto La6
        L1b:
            r0 = move-exception
            goto Lae
        L1e:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            return r4
        L24:
            float r0 = r14.b
            int r3 = r14.a
            p.hm5.M(r15)     // Catch: java.lang.Throwable -> L1b
            goto L7f
        L2c:
            p.hm5.M(r15)
            java.lang.Integer r0 = r14.d
            if (r0 == 0) goto Lb4
            int r0 = r0.intValue()
            int r6 = r14.e
            int r6 = r0 - r6
            float r6 = (float) r6
            float r11 = r14.f
            float r6 = r6 * r11
            p.lee1 r11 = p.g3c.a
            float r11 = r2.s()
            float r11 = r11 - r6
            float r11 = java.lang.Math.abs(r11)
            r12 = 1056964608(0x3f000000, float:0.5)
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 <= 0) goto Lb4
            p.az31 r11 = p.az31.c
            r9.setValue(r11)
            p.ven0 r11 = r14.t
            java.lang.Object r12 = r11.getValue()
            p.faa0 r12 = (p.faa0) r12
            r11.setValue(r4)
            if (r12 == 0) goto L65
            r12.d(r4)
        L65:
            p.o95 r11 = r14.g     // Catch: java.lang.Throwable -> L1b
            float r12 = r2.s()     // Catch: java.lang.Throwable -> L1b
            java.lang.Float r13 = new java.lang.Float     // Catch: java.lang.Throwable -> L1b
            r13.<init>(r12)     // Catch: java.lang.Throwable -> L1b
            r14.a = r0     // Catch: java.lang.Throwable -> L1b
            r14.b = r6     // Catch: java.lang.Throwable -> L1b
            r14.c = r3     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r3 = r11.g(r13, r14)     // Catch: java.lang.Throwable -> L1b
            if (r3 != r10) goto L7d
            goto La5
        L7d:
            r3 = r0
            r0 = r6
        L7f:
            p.o95 r6 = r14.g     // Catch: java.lang.Throwable -> L1b
            java.lang.Float r11 = new java.lang.Float     // Catch: java.lang.Throwable -> L1b
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L1b
            r12 = 7
            r13 = 0
            p.n8b1 r4 = p.irn1.l0(r13, r13, r4, r12)     // Catch: java.lang.Throwable -> L1b
            r12 = r4
            p.qg6 r4 = new p.qg6     // Catch: java.lang.Throwable -> L1b
            r13 = 3
            r4.<init>(r2, r13)     // Catch: java.lang.Throwable -> L1b
            r14.a = r3     // Catch: java.lang.Throwable -> L1b
            r14.b = r0     // Catch: java.lang.Throwable -> L1b
            r14.c = r1     // Catch: java.lang.Throwable -> L1b
            r3 = 0
            r0 = r6
            r6 = 4
            r5 = r14
            r1 = r11
            r2 = r12
            java.lang.Object r0 = p.o95.b(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L1b
            if (r0 != r10) goto La6
        La5:
            return r10
        La6:
            p.ce5 r0 = (p.ce5) r0     // Catch: java.lang.Throwable -> L1b
            p.lee1 r0 = p.g3c.a
            r9.setValue(r8)
            return r7
        Lae:
            p.lee1 r1 = p.g3c.a
            r9.setValue(r8)
            throw r0
        Lb4:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.u2c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
