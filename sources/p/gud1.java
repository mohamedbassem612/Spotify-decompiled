package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gud1 extends a8d1 implements vu30 {
    public sud1 a;
    public long b;
    public int c;
    public byte d;
    public /* synthetic */ Object e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ std1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gud1(int i, int i2, std1 std1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.f = i;
        this.g = i2;
        this.h = std1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        gud1 gud1Var = new gud1(this.f, this.g, this.h, lnmVar);
        gud1Var.e = obj;
        return gud1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    /* JADX WARN: Code duplicated, block: B:30:0x006a  */
    /* JADX WARN: Code duplicated, block: B:31:0x006b A[Catch: Exception -> 0x0020, CancellationException -> 0x00a6, PHI: r1 r8 r13
      0x006b: PHI (r1v2 int) = (r1v3 int), (r1v9 int) binds: [B:29:0x0068, B:15:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x006b: PHI (r8v1 long) = (r8v2 long), (r8v9 long) binds: [B:29:0x0068, B:15:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x006b: PHI (r13v2 java.lang.Object) = (r13v6 java.lang.Object), (r13v0 java.lang.Object) binds: [B:29:0x0068, B:15:0x002d] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x00a6, Exception -> 0x0020, blocks: (B:8:0x001c, B:34:0x0084, B:28:0x005a, B:31:0x006b, B:15:0x002d), top: B:44:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a3  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
    
        if (r0.emit(r13, r12) == r7) goto L33;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0081 -> B:34:0x0084). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.e
            p.vr20 r0 = (p.vr20) r0
            byte r1 = r12.d
            r2 = 0
            int r3 = r12.f
            r4 = 3
            r5 = 2
            r6 = 1
            p.d9n r7 = p.d9n.a
            if (r1 == 0) goto L39
            if (r1 == r6) goto L31
            if (r1 == r5) goto L29
            if (r1 != r4) goto L23
            int r1 = r12.c
            long r8 = r12.b
            p.sud1 r10 = r12.a
            p.hm5.M(r13)     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> La6
            goto L84
        L20:
            r13 = move-exception
            goto L8b
        L23:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r12)
            return r2
        L29:
            int r1 = r12.c
            long r8 = r12.b
            p.hm5.M(r13)     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> La6
            goto L6b
        L31:
            int r1 = r12.c
            long r8 = r12.b
            p.hm5.M(r13)
            goto L5a
        L39:
            p.hm5.M(r13)
            if (r3 > 0) goto L3f
            goto La8
        L3f:
            int r13 = r12.g
            long r8 = (long) r13
            r10 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r10
            if (r6 > r3) goto La8
            r13 = r6
        L48:
            r12.e = r0
            r12.a = r2
            r12.b = r8
            r12.c = r13
            r12.d = r6
            java.lang.Object r1 = p.hap1.i(r8, r12)
            if (r1 != r7) goto L59
            goto L83
        L59:
            r1 = r13
        L5a:
            p.std1 r13 = r12.h     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> La6
            r12.e = r0     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> La6
            r12.b = r8     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> La6
            r12.c = r1     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> La6
            r12.d = r5     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> La6
            java.lang.Object r13 = r13.a(r12)     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> La6
            if (r13 != r7) goto L6b
            goto L83
        L6b:
            r10 = r13
            p.sud1 r10 = (p.sud1) r10     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> La6
            p.mud1 r13 = new p.mud1     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> La6
            r13.<init>(r10)     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> La6
            r12.e = r0     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> La6
            r12.a = r10     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> La6
            r12.b = r8     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> La6
            r12.c = r1     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> La6
            r12.d = r4     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> La6
            java.lang.Object r13 = r0.emit(r13, r12)     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> La6
            if (r13 != r7) goto L84
        L83:
            return r7
        L84:
            boolean r13 = r10.b()     // Catch: java.lang.Exception -> L20 java.util.concurrent.CancellationException -> La6
            if (r13 != 0) goto La1
            goto La8
        L8b:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Note status polling attempt "
            r10.<init>(r11)
            r10.append(r1)
            java.lang.String r11 = " failed"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            p.n57.t(r10, r13)
        La1:
            if (r1 == r3) goto La8
            int r13 = r1 + 1
            goto L48
        La6:
            r12 = move-exception
            throw r12
        La8:
            p.rih1 r12 = p.rih1.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p.gud1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
