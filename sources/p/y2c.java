package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y2c extends a8d1 implements vu30 {
    public byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ o95 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float g;
    public final /* synthetic */ drr0 h;
    public final /* synthetic */ ven0 i;
    public final /* synthetic */ ven0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2c(o95 o95Var, float f, float f2, float f3, float f4, drr0 drr0Var, ven0 ven0Var, ven0 ven0Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.c = o95Var;
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = f4;
        this.h = drr0Var;
        this.i = ven0Var;
        this.t = ven0Var2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        y2c y2cVar = new y2c(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, lnmVar);
        y2cVar.b = obj;
        return y2cVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
    
        if (p.g3c.b(r7, r14, r1, r8, r13) == r10) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.b
            p.c9n r0 = (p.c9n) r0
            byte r1 = r13.a
            p.az31 r2 = p.az31.a
            p.ven0 r3 = r13.t
            p.ven0 r4 = r13.i
            r5 = 3
            p.drr0 r6 = r13.h
            p.o95 r7 = r13.c
            r8 = 2
            r9 = 1
            p.d9n r10 = p.d9n.a
            if (r1 == 0) goto L33
            if (r1 == r9) goto L2f
            if (r1 == r8) goto L2b
            if (r1 != r5) goto L24
            p.hm5.M(r14)     // Catch: java.lang.Throwable -> L21
            goto L82
        L21:
            r13 = move-exception
            goto La0
        L24:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r13)
            r13 = 0
            return r13
        L2b:
            p.hm5.M(r14)     // Catch: java.lang.Throwable -> L21
            goto L6d
        L2f:
            p.hm5.M(r14)     // Catch: java.lang.Throwable -> L21
            goto L4c
        L33:
            p.hm5.M(r14)
            p.lee1 r14 = p.g3c.a     // Catch: java.lang.Throwable -> L21
            float r14 = r6.s()     // Catch: java.lang.Throwable -> L21
            java.lang.Float r1 = new java.lang.Float     // Catch: java.lang.Throwable -> L21
            r1.<init>(r14)     // Catch: java.lang.Throwable -> L21
            r13.b = r0     // Catch: java.lang.Throwable -> L21
            r13.a = r9     // Catch: java.lang.Throwable -> L21
            java.lang.Object r14 = r7.g(r1, r13)     // Catch: java.lang.Throwable -> L21
            if (r14 != r10) goto L4c
            goto L81
        L4c:
            float r14 = r13.d     // Catch: java.lang.Throwable -> L21
            float r14 = -r14
            float r1 = r13.e     // Catch: java.lang.Throwable -> L21
            float r14 = r14 * r1
            java.lang.Float r1 = new java.lang.Float     // Catch: java.lang.Throwable -> L21
            r1.<init>(r14)     // Catch: java.lang.Throwable -> L21
            r14 = 0
            p.e9r r14 = p.t5p1.m(r14, r8)     // Catch: java.lang.Throwable -> L21
            p.qg6 r11 = new p.qg6     // Catch: java.lang.Throwable -> L21
            r12 = 4
            r11.<init>(r6, r12)     // Catch: java.lang.Throwable -> L21
            r13.b = r0     // Catch: java.lang.Throwable -> L21
            r13.a = r8     // Catch: java.lang.Throwable -> L21
            java.lang.Object r14 = r7.a(r1, r14, r11, r13)     // Catch: java.lang.Throwable -> L21
            if (r14 != r10) goto L6d
            goto L81
        L6d:
            float r14 = r13.f     // Catch: java.lang.Throwable -> L21
            float r1 = r13.g     // Catch: java.lang.Throwable -> L21
            p.qg6 r8 = new p.qg6     // Catch: java.lang.Throwable -> L21
            r11 = 5
            r8.<init>(r6, r11)     // Catch: java.lang.Throwable -> L21
            r13.b = r0     // Catch: java.lang.Throwable -> L21
            r13.a = r5     // Catch: java.lang.Throwable -> L21
            java.lang.Object r13 = p.g3c.b(r7, r14, r1, r8, r13)     // Catch: java.lang.Throwable -> L21
            if (r13 != r10) goto L82
        L81:
            return r10
        L82:
            p.lee1 r13 = p.g3c.a
            java.lang.Object r13 = r4.getValue()
            p.faa0 r13 = (p.faa0) r13
            if (r13 == 0) goto L9d
            p.o8n r14 = r0.J()
            p.faa0 r14 = p.op71.z(r14)
            boolean r13 = r13.equals(r14)
            if (r13 != r9) goto L9d
            r3.setValue(r2)
        L9d:
            p.rih1 r13 = p.rih1.a
            return r13
        La0:
            p.lee1 r14 = p.g3c.a
            java.lang.Object r14 = r4.getValue()
            p.faa0 r14 = (p.faa0) r14
            if (r14 == 0) goto Lbb
            p.o8n r0 = r0.J()
            p.faa0 r0 = p.op71.z(r0)
            boolean r14 = r14.equals(r0)
            if (r14 != r9) goto Lbb
            r3.setValue(r2)
        Lbb:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p.y2c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
