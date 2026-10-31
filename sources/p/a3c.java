package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a3c extends a8d1 implements vu30 {
    public byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ o95 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ drr0 f;
    public final /* synthetic */ ven0 g;
    public final /* synthetic */ ven0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3c(o95 o95Var, float f, float f2, drr0 drr0Var, ven0 ven0Var, ven0 ven0Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.c = o95Var;
        this.d = f;
        this.e = f2;
        this.f = drr0Var;
        this.g = ven0Var;
        this.h = ven0Var2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        a3c a3cVar = new a3c(this.c, this.d, this.e, this.f, this.g, this.h, lnmVar);
        a3cVar.b = obj;
        return a3cVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        if (p.g3c.b(r6, r13, r1, r10, r12) == r9) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.b
            p.c9n r0 = (p.c9n) r0
            byte r1 = r12.a
            p.az31 r2 = p.az31.a
            p.ven0 r3 = r12.h
            p.ven0 r4 = r12.g
            p.drr0 r5 = r12.f
            p.o95 r6 = r12.c
            r7 = 2
            r8 = 1
            p.d9n r9 = p.d9n.a
            if (r1 == 0) goto L2b
            if (r1 == r8) goto L27
            if (r1 != r7) goto L20
            p.hm5.M(r13)     // Catch: java.lang.Throwable -> L1e
            goto L59
        L1e:
            r12 = move-exception
            goto L77
        L20:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r12)
            r12 = 0
            return r12
        L27:
            p.hm5.M(r13)     // Catch: java.lang.Throwable -> L1e
            goto L44
        L2b:
            p.hm5.M(r13)
            p.lee1 r13 = p.g3c.a     // Catch: java.lang.Throwable -> L1e
            float r13 = r5.s()     // Catch: java.lang.Throwable -> L1e
            java.lang.Float r1 = new java.lang.Float     // Catch: java.lang.Throwable -> L1e
            r1.<init>(r13)     // Catch: java.lang.Throwable -> L1e
            r12.b = r0     // Catch: java.lang.Throwable -> L1e
            r12.a = r8     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r13 = r6.g(r1, r12)     // Catch: java.lang.Throwable -> L1e
            if (r13 != r9) goto L44
            goto L58
        L44:
            float r13 = r12.d     // Catch: java.lang.Throwable -> L1e
            float r1 = r12.e     // Catch: java.lang.Throwable -> L1e
            p.qg6 r10 = new p.qg6     // Catch: java.lang.Throwable -> L1e
            r11 = 6
            r10.<init>(r5, r11)     // Catch: java.lang.Throwable -> L1e
            r12.b = r0     // Catch: java.lang.Throwable -> L1e
            r12.a = r7     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r12 = p.g3c.b(r6, r13, r1, r10, r12)     // Catch: java.lang.Throwable -> L1e
            if (r12 != r9) goto L59
        L58:
            return r9
        L59:
            p.lee1 r12 = p.g3c.a
            java.lang.Object r12 = r4.getValue()
            p.faa0 r12 = (p.faa0) r12
            if (r12 == 0) goto L74
            p.o8n r13 = r0.J()
            p.faa0 r13 = p.op71.z(r13)
            boolean r12 = r12.equals(r13)
            if (r12 != r8) goto L74
            r3.setValue(r2)
        L74:
            p.rih1 r12 = p.rih1.a
            return r12
        L77:
            p.lee1 r13 = p.g3c.a
            java.lang.Object r13 = r4.getValue()
            p.faa0 r13 = (p.faa0) r13
            if (r13 == 0) goto L92
            p.o8n r0 = r0.J()
            p.faa0 r0 = p.op71.z(r0)
            boolean r13 = r13.equals(r0)
            if (r13 != r8) goto L92
            r3.setValue(r2)
        L92:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p.a3c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
