package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ys20 extends a8d1 implements xu30 {
    public jfe a;
    public p811 b;
    public o811 c;
    public byte d;
    public /* synthetic */ c9n e;
    public /* synthetic */ vr20 f;
    public final /* synthetic */ iu30 g;
    public final /* synthetic */ mr20 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ys20(iu30 iu30Var, mr20 mr20Var, lnm lnmVar) {
        super(3, lnmVar);
        this.g = iu30Var;
        this.h = mr20Var;
    }

    @Override // p.xu30
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ys20 ys20Var = new ys20(this.g, this.h, (lnm) obj3);
        ys20Var.e = (c9n) obj;
        ys20Var.f = (vr20) obj2;
        return ys20Var.invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0048  */
    /* JADX WARN: Code duplicated, block: B:16:0x004f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0053  */
    /* JADX WARN: Code duplicated, block: B:21:0x0068  */
    /* JADX WARN: Code duplicated, block: B:22:0x006a  */
    /* JADX WARN: Code duplicated, block: B:24:0x006e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0084 A[PHI: r0 r2 r7
      0x0084: PHI (r0v2 p.o811) = (r0v4 p.o811), (r0v7 p.o811), (r0v7 p.o811) binds: [B:28:0x0082, B:15:0x004d, B:21:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x0084: PHI (r2v3 p.p811) = (r2v5 p.p811), (r2v6 p.p811), (r2v6 p.p811) binds: [B:28:0x0082, B:15:0x004d, B:21:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x0084: PHI (r7v3 p.jfe) = (r7v5 p.jfe), (r7v6 p.jfe), (r7v6 p.jfe) binds: [B:28:0x0082, B:15:0x004d, B:21:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x0088  */
    /* JADX WARN: Code duplicated, block: B:34:0x009b  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c6  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
    
        if (r1.emit(r14, r13) == r6) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c3, code lost:
    
        if (p.ou51.d(r7, r13) == r6) goto L37;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c3 -> B:7:0x0018). Please report as a decompilation issue!!! */
    @Override // p.faa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ys20.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
