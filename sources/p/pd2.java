package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pd2 {
    public final a1g a;
    public final w0g b;
    public final t3f0 c;

    public pd2(a1g a1gVar, w0g w0gVar, t3f0 t3f0Var) {
        this.a = a1gVar;
        this.b = w0gVar;
        this.c = t3f0Var;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0056 A[PHI: r1 r8
      0x0056: PHI (r1v6 java.lang.String) = (r1v2 java.lang.String), (r1v4 java.lang.String), (r1v8 java.lang.String) binds: [B:26:0x0053, B:43:0x009c, B:12:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x0056: PHI (r8v4 long) = (r8v0 long), (r8v2 long), (r8v8 long) binds: [B:26:0x0053, B:43:0x009c, B:12:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x0060 A[Catch: Exception -> 0x003f, CancellationException -> 0x009f, TRY_ENTER, TryCatch #2 {CancellationException -> 0x009f, Exception -> 0x003f, blocks: (B:29:0x0060, B:32:0x0070, B:39:0x0081, B:16:0x003b), top: B:49:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:31:0x006f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0070 A[Catch: Exception -> 0x003f, CancellationException -> 0x009f, PHI: r1 r8 r10
      0x0070: PHI (r1v5 java.lang.String) = (r1v6 java.lang.String), (r1v7 java.lang.String) binds: [B:30:0x006d, B:16:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x0070: PHI (r8v3 long) = (r8v4 long), (r8v6 long) binds: [B:30:0x006d, B:16:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x0070: PHI (r10v8 java.lang.Object) = (r10v16 java.lang.Object), (r10v1 java.lang.Object) binds: [B:30:0x006d, B:16:0x003b] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x009f, Exception -> 0x003f, blocks: (B:29:0x0060, B:32:0x0070, B:39:0x0081, B:16:0x003b), top: B:49:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:34:0x007a  */
    /* JADX WARN: Code duplicated, block: B:36:0x007d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0080  */
    /* JADX WARN: Code duplicated, block: B:39:0x0081 A[Catch: Exception -> 0x003f, CancellationException -> 0x009f, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x009f, Exception -> 0x003f, blocks: (B:29:0x0060, B:32:0x0070, B:39:0x0081, B:16:0x003b), top: B:49:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v6, types: [int, short] */
    /* JADX WARN: Type inference failed for: r2v8, types: [int, short] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x009c -> B:27:0x0056). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(long r8, p.onm r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof p.od2
            if (r0 == 0) goto L13
            r0 = r10
            p.od2 r0 = (p.od2) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.od2 r0 = new p.od2
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.c
            int r1 = r0.e
            r2 = 0
            r3 = 1
            r4 = 2
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L41
            if (r1 == r3) goto L36
            if (r1 != r4) goto L30
            short r8 = r0.a
            long r8 = (long) r8
            java.lang.String r1 = r0.b
            p.hm5.M(r10)
            goto L56
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r2
        L36:
            short r8 = r0.a
            long r8 = (long) r8
            java.lang.String r1 = r0.b
            p.hm5.M(r10)     // Catch: java.lang.Exception -> L3f java.util.concurrent.CancellationException -> L9f
            goto L70
        L3f:
            r10 = move-exception
            goto L89
        L41:
            p.hm5.M(r10)
            p.a1g r10 = r7.a
            p.z0g r10 = r10.b()
            if (r10 == 0) goto La1
            int r1 = r10.a
            if (r1 != r4) goto L51
            r2 = r10
        L51:
            if (r2 == 0) goto La1
            java.lang.String r10 = r2.b
            r1 = r10
        L56:
            p.o8n r10 = r0.getContext()
            boolean r10 = p.op71.C(r10)
            if (r10 == 0) goto La1
            p.w0g r10 = r7.b     // Catch: java.lang.Exception -> L3f java.util.concurrent.CancellationException -> L9f
            r0.b = r1     // Catch: java.lang.Exception -> L3f java.util.concurrent.CancellationException -> L9f
            int r2 = (int) r8     // Catch: java.lang.Exception -> L3f java.util.concurrent.CancellationException -> L9f
            r0.a = r2     // Catch: java.lang.Exception -> L3f java.util.concurrent.CancellationException -> L9f
            r0.e = r3     // Catch: java.lang.Exception -> L3f java.util.concurrent.CancellationException -> L9f
            java.lang.Object r10 = r10.b(r1, r0)     // Catch: java.lang.Exception -> L3f java.util.concurrent.CancellationException -> L9f
            if (r10 != r5) goto L70
            goto L9e
        L70:
            p.tur0 r10 = (p.tur0) r10     // Catch: java.lang.Exception -> L3f java.util.concurrent.CancellationException -> L9f
            int r10 = r10.f     // Catch: java.lang.Exception -> L3f java.util.concurrent.CancellationException -> L9f
            int r10 = p.l1d.C(r10)     // Catch: java.lang.Exception -> L3f java.util.concurrent.CancellationException -> L9f
            if (r10 == r4) goto L81
            r2 = 3
            if (r10 == r2) goto La1
            r2 = 4
            if (r10 == r2) goto L81
            goto L91
        L81:
            p.t3f0 r10 = r7.c     // Catch: java.lang.Exception -> L3f java.util.concurrent.CancellationException -> L9f
            p.yg8 r2 = p.yg8.P0     // Catch: java.lang.Exception -> L3f java.util.concurrent.CancellationException -> L9f
            r10.a(r2)     // Catch: java.lang.Exception -> L3f java.util.concurrent.CancellationException -> L9f
            goto La1
        L89:
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r6 = "AgeAssurance session poll failed"
            com.spotify.base.java.logging.Logger.e(r10, r6, r2)
        L91:
            r0.b = r1
            int r10 = (int) r8
            r0.a = r10
            r0.e = r4
            java.lang.Object r10 = p.hap1.i(r8, r0)
            if (r10 != r5) goto L56
        L9e:
            return r5
        L9f:
            r7 = move-exception
            throw r7
        La1:
            p.rih1 r7 = p.rih1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.pd2.a(long, p.onm):java.lang.Object");
    }
}
