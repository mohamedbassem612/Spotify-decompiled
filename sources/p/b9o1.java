package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class b9o1 extends a8d1 implements vu30 {
    public long a;
    public boolean b;
    public byte c;
    public final /* synthetic */ oao1 d;
    public final /* synthetic */ p811 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9o1(oao1 oao1Var, p811 p811Var, lnm lnmVar) {
        super(2, lnmVar);
        this.d = oao1Var;
        this.e = p811Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new b9o1(this.d, this.e, lnmVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.play.core.integrity.StandardIntegrityException */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r9 != r4) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0070, code lost:
    
        if (p.hap1.i(r5, r8) != r4) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0075, code lost:
    
        return r4;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x003d -> B:13:0x0023). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0070 -> B:6:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws com.google.android.play.core.integrity.StandardIntegrityException {
        /*
            r8 = this;
            byte r0 = r8.c
            p.oao1 r1 = r8.d
            r2 = 0
            r3 = 1
            p.d9n r4 = p.d9n.a
            if (r0 == 0) goto L1d
            if (r0 == r3) goto L15
            boolean r0 = r8.b
            long r5 = r8.a
            p.hm5.M(r9)
        L13:
            r9 = r0
            goto L73
        L15:
            long r5 = r8.a
            p.hm5.M(r9)     // Catch: java.lang.Exception -> L1b
            goto L2f
        L1b:
            r9 = move-exception
            goto L3f
        L1d:
            p.hm5.M(r9)
            r5 = 1000(0x3e8, double:4.94E-321)
            r9 = r3
        L23:
            if (r9 == 0) goto L77
            r8.a = r5     // Catch: java.lang.Exception -> L1b
            r8.c = r3     // Catch: java.lang.Exception -> L1b
            java.lang.Object r9 = p.oao1.g(r1, r8)     // Catch: java.lang.Exception -> L1b
            if (r9 == r4) goto L75
        L2f:
            p.c6n1 r9 = (p.c6n1) r9     // Catch: java.lang.Exception -> L1b
            p.ayh r0 = r1.a()     // Catch: java.lang.Exception -> L1b
            r0.m0(r9)     // Catch: java.lang.Exception -> L1b
            p.e2x0 r9 = p.e2x0.c1     // Catch: java.lang.Exception -> L1b
            p.oao1.f(r1, r9)     // Catch: java.lang.Exception -> L1b
            r9 = r2
            goto L23
        L3f:
            p.p811 r0 = r8.e
            r0.a = r9
            boolean r0 = r9 instanceof com.google.android.play.core.integrity.StandardIntegrityException
            if (r0 == 0) goto L60
            r0 = r9
            com.google.android.play.core.integrity.StandardIntegrityException r0 = (com.google.android.play.core.integrity.StandardIntegrityException) r0
            int r0 = r0.getErrorCode()
            r7 = -100
            if (r0 == r7) goto L62
            r7 = -18
            if (r0 == r7) goto L62
            r7 = -12
            if (r0 == r7) goto L62
            r7 = -8
            if (r0 == r7) goto L62
            r7 = -3
            if (r0 == r7) goto L62
        L60:
            r0 = r2
            goto L63
        L62:
            r0 = r3
        L63:
            if (r0 == 0) goto L76
            r8.a = r5
            r8.b = r3
            r9 = 2
            r8.c = r9
            java.lang.Object r9 = p.hap1.i(r5, r8)
            if (r9 == r4) goto L75
            goto L13
        L73:
            long r5 = r5 + r5
            goto L23
        L75:
            return r4
        L76:
            throw r9
        L77:
            p.rih1 r8 = p.rih1.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.b9o1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
