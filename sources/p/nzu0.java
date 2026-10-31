package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nzu0 extends a8d1 implements iu30 {
    public Object a;
    public int b;
    public byte c;
    public final /* synthetic */ qzu0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nzu0(qzu0 qzu0Var, lnm lnmVar) {
        super(1, lnmVar);
        this.d = qzu0Var;
    }

    public final lnm create(lnm lnmVar) {
        return new nzu0(this.d, lnmVar);
    }

    public final Object invoke(Object obj) {
        return create((lnm) obj).invokeSuspend(rih1.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.TimeoutCancellationException */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0095, code lost:
    
        if (r8 == r5) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            byte r0 = r7.c
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r0 == 0) goto L31
            if (r0 == r3) goto L29
            if (r0 == r2) goto L1f
            if (r0 != r1) goto L19
            java.lang.Object r7 = r7.a
            p.k331 r7 = (p.k331) r7
            p.hm5.M(r8)
            goto L98
        L19:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r4
        L1f:
            int r0 = r7.b
            java.lang.Object r2 = r7.a
            p.qzu0 r2 = (p.qzu0) r2
            p.hm5.M(r8)
            goto L5d
        L29:
            java.lang.Object r7 = r7.a
            p.k331 r7 = (p.k331) r7
            p.hm5.M(r8)
            return r7
        L31:
            p.hm5.M(r8)
            p.qzu0 r8 = r7.d
            p.y131 r0 = r8.C0
            r6 = 0
            if (r0 == 0) goto L49
            r7.a = r0
            r7.b = r6
            r7.c = r3
            java.lang.Object r7 = r8.f(r7)
            if (r7 != r5) goto L48
            goto L97
        L48:
            return r0
        L49:
            p.x711 r0 = r8.c
            p.bqr0 r3 = r8.f
            r7.a = r8
            r7.b = r6
            r7.c = r2
            java.lang.Object r0 = r0.a(r3, r7)
            if (r0 != r5) goto L5a
            goto L97
        L5a:
            r2 = r8
            r8 = r0
            r0 = r6
        L5d:
            p.k331 r8 = (p.k331) r8
            r7.a = r4
            r7.b = r0
            r7.c = r1
            boolean r0 = r8 instanceof p.y131
            if (r0 == 0) goto L71
            p.y131 r8 = (p.y131) r8
            java.lang.Object r7 = r2.e(r8, r7)
            r8 = r7
            goto L95
        L71:
            r2.getClass()
            boolean r7 = r8 instanceof p.r231
            if (r7 != 0) goto L95
            boolean r7 = r8 instanceof p.o231
            if (r7 != 0) goto L95
            boolean r7 = r8 instanceof p.p231
            if (r7 != 0) goto L95
            boolean r7 = r8 instanceof p.a331
            if (r7 == 0) goto L85
            goto L95
        L85:
            boolean r7 = r8 instanceof p.b331
            if (r7 != 0) goto L8d
            p.eg.o()
            return r4
        L8d:
            java.lang.Throwable r7 = new java.lang.Throwable
            java.lang.String r8 = "Result is Unknown. Trying to access result too early."
            r7.<init>(r8)
            throw r7
        L95:
            if (r8 != r5) goto L98
        L97:
            return r5
        L98:
            p.k331 r8 = (p.k331) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.nzu0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
