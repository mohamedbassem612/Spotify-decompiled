package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class t2c extends a8d1 implements vu30 {
    public float a;
    public byte b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ float e;
    public final /* synthetic */ o95 f;
    public final /* synthetic */ ven0 g;
    public final /* synthetic */ drr0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2c(int i, int i2, float f, o95 o95Var, ven0 ven0Var, drr0 drr0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = i;
        this.d = i2;
        this.e = f;
        this.f = o95Var;
        this.g = ven0Var;
        this.h = drr0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new t2c(this.c, this.d, this.e, this.f, this.g, this.h, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
    
        if (r0 == r10) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            byte r0 = r13.b
            r1 = 0
            p.rih1 r7 = p.rih1.a
            r2 = 2
            r3 = 1
            p.drr0 r4 = r13.h
            p.az31 r8 = p.az31.a
            p.ven0 r9 = r13.g
            p.d9n r10 = p.d9n.a
            if (r0 == 0) goto L2a
            if (r0 == r3) goto L24
            if (r0 != r2) goto L1e
            p.hm5.M(r14)     // Catch: java.lang.Throwable -> L1b
            r0 = r14
            goto L8f
        L1b:
            r0 = move-exception
            goto L97
        L1e:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            return r1
        L24:
            float r0 = r13.a
            p.hm5.M(r14)     // Catch: java.lang.Throwable -> L1b
            goto L6b
        L2a:
            p.hm5.M(r14)
            p.lee1 r0 = p.g3c.a
            java.lang.Object r0 = r9.getValue()
            p.az31 r0 = (p.az31) r0
            if (r0 == r8) goto L38
            goto L9d
        L38:
            int r0 = r13.c
            int r6 = r13.d
            int r0 = r0 - r6
            float r0 = (float) r0
            float r6 = r13.e
            float r0 = r0 * r6
            float r6 = r4.s()
            float r6 = r6 - r0
            float r6 = java.lang.Math.abs(r6)
            r11 = 1056964608(0x3f000000, float:0.5)
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 <= 0) goto L9d
            p.az31 r6 = p.az31.c
            r9.setValue(r6)
            p.o95 r6 = r13.f     // Catch: java.lang.Throwable -> L1b
            float r11 = r4.s()     // Catch: java.lang.Throwable -> L1b
            java.lang.Float r12 = new java.lang.Float     // Catch: java.lang.Throwable -> L1b
            r12.<init>(r11)     // Catch: java.lang.Throwable -> L1b
            r13.a = r0     // Catch: java.lang.Throwable -> L1b
            r13.b = r3     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r3 = r6.g(r12, r13)     // Catch: java.lang.Throwable -> L1b
            if (r3 != r10) goto L6b
            goto L8e
        L6b:
            p.o95 r3 = r13.f     // Catch: java.lang.Throwable -> L1b
            java.lang.Float r6 = new java.lang.Float     // Catch: java.lang.Throwable -> L1b
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L1b
            r11 = 7
            r12 = 0
            p.n8b1 r1 = p.irn1.l0(r12, r12, r1, r11)     // Catch: java.lang.Throwable -> L1b
            p.qg6 r11 = new p.qg6     // Catch: java.lang.Throwable -> L1b
            r11.<init>(r4, r2)     // Catch: java.lang.Throwable -> L1b
            r13.a = r0     // Catch: java.lang.Throwable -> L1b
            r13.b = r2     // Catch: java.lang.Throwable -> L1b
            r0 = r3
            r3 = 0
            r2 = r1
            r1 = r6
            r6 = 4
            r5 = r13
            r4 = r11
            java.lang.Object r0 = p.o95.b(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L1b
            if (r0 != r10) goto L8f
        L8e:
            return r10
        L8f:
            p.ce5 r0 = (p.ce5) r0     // Catch: java.lang.Throwable -> L1b
            p.lee1 r0 = p.g3c.a
            r9.setValue(r8)
            return r7
        L97:
            p.lee1 r1 = p.g3c.a
            r9.setValue(r8)
            throw r0
        L9d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.t2c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
