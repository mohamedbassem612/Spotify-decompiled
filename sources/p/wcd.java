package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wcd extends a8d1 implements vu30 {
    public final /* synthetic */ ok51 N0;
    public final /* synthetic */ lik1 O0;
    public final /* synthetic */ xcd X;
    public final /* synthetic */ aji1 Y;
    public final /* synthetic */ String Z;
    public String a;
    public Object b;
    public String c;
    public ok51 d;
    public lik1 e;
    public w4i1 f;
    public ssw0 g;
    public byte h;
    public /* synthetic */ Object i;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wcd(String str, xcd xcdVar, aji1 aji1Var, String str2, ok51 ok51Var, lik1 lik1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.t = str;
        this.X = xcdVar;
        this.Y = aji1Var;
        this.Z = str2;
        this.N0 = ok51Var;
        this.O0 = lik1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        wcd wcdVar = new wcd(this.t, this.X, this.Y, this.Z, this.N0, this.O0, lnmVar);
        wcdVar.i = obj;
        return wcdVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0096 A[PHI: r2
      0x0096: PHI (r2v4 java.lang.String) = (r2v1 java.lang.String), (r2v6 java.lang.String) binds: [B:19:0x005d, B:35:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ac A[PHI: r1 r2 r7
      0x00ac: PHI (r1v2 p.ssw0) = (r1v1 p.ssw0), (r1v6 p.ssw0) binds: [B:40:0x00a8, B:14:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r2v8 java.lang.String) = (r2v4 java.lang.String), (r2v19 java.lang.String) binds: [B:40:0x00a8, B:14:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r7v2 java.lang.Object) = (r7v1 java.lang.Object), (r7v6 java.lang.Object) binds: [B:40:0x00a8, B:14:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:63:0x016a  */
    /* JADX WARN: Code duplicated, block: B:67:0x018b A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d2, code lost:
    
        if (r14 == r13) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.wcd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
