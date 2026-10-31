package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class l0i1 extends a8d1 implements vu30 {
    public long a;
    public Long b;
    public byte c;
    public final /* synthetic */ m0i1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0i1(m0i1 m0i1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.d = m0i1Var;
    }

    @Override // p.faa
    public final lnm create(Object obj, lnm lnmVar) {
        return new l0i1(this.d, lnmVar);
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        return ((l0i1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0074  */
    /* JADX WARN: Code duplicated, block: B:33:0x0076 A[Catch: Exception -> 0x0018, PHI: r6 r14
      0x0076: PHI (r6v1 long) = (r6v0 long), (r6v3 long) binds: [B:31:0x0072, B:20:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x0076: PHI (r14v11 java.lang.Object) = (r14v8 java.lang.Object), (r14v0 java.lang.Object) binds: [B:31:0x0072, B:20:0x0033] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0018, blocks: (B:6:0x0013, B:11:0x001f, B:57:0x0124, B:14:0x0026, B:48:0x00d3, B:17:0x002d, B:39:0x009d, B:20:0x0033, B:33:0x0076, B:35:0x007c, B:42:0x00ba, B:44:0x00c2, B:51:0x00e7, B:53:0x00eb, B:60:0x013b, B:61:0x0140, B:30:0x0065), top: B:65:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:35:0x007c A[Catch: Exception -> 0x0018, TryCatch #0 {Exception -> 0x0018, blocks: (B:6:0x0013, B:11:0x001f, B:57:0x0124, B:14:0x0026, B:48:0x00d3, B:17:0x002d, B:39:0x009d, B:20:0x0033, B:33:0x0076, B:35:0x007c, B:42:0x00ba, B:44:0x00c2, B:51:0x00e7, B:53:0x00eb, B:60:0x013b, B:61:0x0140, B:30:0x0065), top: B:65:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:37:0x009a  */
    /* JADX WARN: Code duplicated, block: B:38:0x009c  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ba A[Catch: Exception -> 0x0018, TryCatch #0 {Exception -> 0x0018, blocks: (B:6:0x0013, B:11:0x001f, B:57:0x0124, B:14:0x0026, B:48:0x00d3, B:17:0x002d, B:39:0x009d, B:20:0x0033, B:33:0x0076, B:35:0x007c, B:42:0x00ba, B:44:0x00c2, B:51:0x00e7, B:53:0x00eb, B:60:0x013b, B:61:0x0140, B:30:0x0065), top: B:65:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c2 A[Catch: Exception -> 0x0018, TryCatch #0 {Exception -> 0x0018, blocks: (B:6:0x0013, B:11:0x001f, B:57:0x0124, B:14:0x0026, B:48:0x00d3, B:17:0x002d, B:39:0x009d, B:20:0x0033, B:33:0x0076, B:35:0x007c, B:42:0x00ba, B:44:0x00c2, B:51:0x00e7, B:53:0x00eb, B:60:0x013b, B:61:0x0140, B:30:0x0065), top: B:65:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e7 A[Catch: Exception -> 0x0018, TryCatch #0 {Exception -> 0x0018, blocks: (B:6:0x0013, B:11:0x001f, B:57:0x0124, B:14:0x0026, B:48:0x00d3, B:17:0x002d, B:39:0x009d, B:20:0x0033, B:33:0x0076, B:35:0x007c, B:42:0x00ba, B:44:0x00c2, B:51:0x00e7, B:53:0x00eb, B:60:0x013b, B:61:0x0140, B:30:0x0065), top: B:65:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00eb A[Catch: Exception -> 0x0018, TryCatch #0 {Exception -> 0x0018, blocks: (B:6:0x0013, B:11:0x001f, B:57:0x0124, B:14:0x0026, B:48:0x00d3, B:17:0x002d, B:39:0x009d, B:20:0x0033, B:33:0x0076, B:35:0x007c, B:42:0x00ba, B:44:0x00c2, B:51:0x00e7, B:53:0x00eb, B:60:0x013b, B:61:0x0140, B:30:0x0065), top: B:65:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0120  */
    /* JADX WARN: Code duplicated, block: B:56:0x0121  */
    /* JADX WARN: Code duplicated, block: B:60:0x013b A[Catch: Exception -> 0x0018, TryCatch #0 {Exception -> 0x0018, blocks: (B:6:0x0013, B:11:0x001f, B:57:0x0124, B:14:0x0026, B:48:0x00d3, B:17:0x002d, B:39:0x009d, B:20:0x0033, B:33:0x0076, B:35:0x007c, B:42:0x00ba, B:44:0x00c2, B:51:0x00e7, B:53:0x00eb, B:60:0x013b, B:61:0x0140, B:30:0x0065), top: B:65:0x000a }] */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0138, code lost:
    
        if (r14.f(r6, r13) == r5) goto L59;
     */
    @Override // p.faa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.l0i1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
