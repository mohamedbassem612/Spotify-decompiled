package p;

import com.spotify.widgets.npvwidget.u;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fql1 extends a8d1 implements vu30 {
    public final /* synthetic */ boolean N0;
    public final /* synthetic */ qol1 X;
    public final /* synthetic */ t45 Y;
    public final /* synthetic */ String Z;
    public String a;
    public u b;
    public String c;
    public t45 d;
    public u e;
    public int f;
    public int g;
    public byte h;
    public final /* synthetic */ u i;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fql1(u uVar, int i, qol1 qol1Var, t45 t45Var, String str, boolean z, lnm lnmVar) {
        super(2, lnmVar);
        this.i = uVar;
        this.t = i;
        this.X = qol1Var;
        this.Y = t45Var;
        this.Z = str;
        this.N0 = z;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new fql1(this.i, this.t, this.X, this.Y, this.Z, this.N0, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:102:0x0237 A[Catch: SecurityException -> 0x021b, TRY_ENTER, TryCatch #2 {SecurityException -> 0x021b, blocks: (B:86:0x0205, B:97:0x0221, B:102:0x0237, B:103:0x023c), top: B:116:0x01f3 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0263  */
    /* JADX WARN: Code duplicated, block: B:110:0x0267 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e1 A[PHI: r4 r14
      0x00e1: PHI (r4v11 java.lang.Object) = (r4v8 java.lang.Object), (r4v26 java.lang.Object) binds: [B:27:0x00dd, B:18:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x00e1: PHI (r14v1 java.lang.String) = (r14v0 java.lang.String), (r14v2 java.lang.String) binds: [B:27:0x00dd, B:18:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00fb A[Catch: SecurityException -> 0x0123, TRY_ENTER, TRY_LEAVE, TryCatch #0 {SecurityException -> 0x0123, blocks: (B:32:0x00fb, B:44:0x012c, B:52:0x0150, B:60:0x0177, B:68:0x01a3, B:76:0x01cf), top: B:112:0x00f9 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0117  */
    /* JADX WARN: Code duplicated, block: B:42:0x0128 A[Catch: SecurityException -> 0x021e, TRY_ENTER, TRY_LEAVE, TryCatch #3 {SecurityException -> 0x021e, blocks: (B:30:0x00f4, B:42:0x0128, B:50:0x014c, B:58:0x0173, B:66:0x019f, B:74:0x01cb, B:82:0x01f1, B:84:0x01f5), top: B:117:0x00f4 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x012c A[Catch: SecurityException -> 0x0123, TRY_ENTER, TRY_LEAVE, TryCatch #0 {SecurityException -> 0x0123, blocks: (B:32:0x00fb, B:44:0x012c, B:52:0x0150, B:60:0x0177, B:68:0x01a3, B:76:0x01cf), top: B:112:0x00f9 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0147  */
    /* JADX WARN: Code duplicated, block: B:50:0x014c A[Catch: SecurityException -> 0x021e, TRY_ENTER, TRY_LEAVE, TryCatch #3 {SecurityException -> 0x021e, blocks: (B:30:0x00f4, B:42:0x0128, B:50:0x014c, B:58:0x0173, B:66:0x019f, B:74:0x01cb, B:82:0x01f1, B:84:0x01f5), top: B:117:0x00f4 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0150 A[Catch: SecurityException -> 0x0123, TRY_ENTER, TRY_LEAVE, TryCatch #0 {SecurityException -> 0x0123, blocks: (B:32:0x00fb, B:44:0x012c, B:52:0x0150, B:60:0x0177, B:68:0x01a3, B:76:0x01cf), top: B:112:0x00f9 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x016e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0173 A[Catch: SecurityException -> 0x021e, TRY_ENTER, TRY_LEAVE, TryCatch #3 {SecurityException -> 0x021e, blocks: (B:30:0x00f4, B:42:0x0128, B:50:0x014c, B:58:0x0173, B:66:0x019f, B:74:0x01cb, B:82:0x01f1, B:84:0x01f5), top: B:117:0x00f4 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0177 A[Catch: SecurityException -> 0x0123, TRY_ENTER, TRY_LEAVE, TryCatch #0 {SecurityException -> 0x0123, blocks: (B:32:0x00fb, B:44:0x012c, B:52:0x0150, B:60:0x0177, B:68:0x01a3, B:76:0x01cf), top: B:112:0x00f9 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x019a  */
    /* JADX WARN: Code duplicated, block: B:66:0x019f A[Catch: SecurityException -> 0x021e, TRY_ENTER, TRY_LEAVE, TryCatch #3 {SecurityException -> 0x021e, blocks: (B:30:0x00f4, B:42:0x0128, B:50:0x014c, B:58:0x0173, B:66:0x019f, B:74:0x01cb, B:82:0x01f1, B:84:0x01f5), top: B:117:0x00f4 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x01a3 A[Catch: SecurityException -> 0x0123, TRY_ENTER, TRY_LEAVE, TryCatch #0 {SecurityException -> 0x0123, blocks: (B:32:0x00fb, B:44:0x012c, B:52:0x0150, B:60:0x0177, B:68:0x01a3, B:76:0x01cf), top: B:112:0x00f9 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:74:0x01cb A[Catch: SecurityException -> 0x021e, TRY_ENTER, TRY_LEAVE, TryCatch #3 {SecurityException -> 0x021e, blocks: (B:30:0x00f4, B:42:0x0128, B:50:0x014c, B:58:0x0173, B:66:0x019f, B:74:0x01cb, B:82:0x01f1, B:84:0x01f5), top: B:117:0x00f4 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01cf A[Catch: SecurityException -> 0x0123, TRY_ENTER, TRY_LEAVE, TryCatch #0 {SecurityException -> 0x0123, blocks: (B:32:0x00fb, B:44:0x012c, B:52:0x0150, B:60:0x0177, B:68:0x01a3, B:76:0x01cf), top: B:112:0x00f9 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:82:0x01f1 A[Catch: SecurityException -> 0x021e, TRY_ENTER, TryCatch #3 {SecurityException -> 0x021e, blocks: (B:30:0x00f4, B:42:0x0128, B:50:0x014c, B:58:0x0173, B:66:0x019f, B:74:0x01cb, B:82:0x01f1, B:84:0x01f5), top: B:117:0x00f4 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01f5 A[Catch: SecurityException -> 0x021e, TRY_LEAVE, TryCatch #3 {SecurityException -> 0x021e, blocks: (B:30:0x00f4, B:42:0x0128, B:50:0x014c, B:58:0x0173, B:66:0x019f, B:74:0x01cb, B:82:0x01f1, B:84:0x01f5), top: B:117:0x00f4 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0211  */
    /* JADX WARN: Code duplicated, block: B:89:0x0212  */
    /* JADX WARN: Code duplicated, block: B:91:0x0215  */
    /* JADX WARN: Code duplicated, block: B:92:0x0216  */
    /* JADX WARN: Code duplicated, block: B:97:0x0221 A[Catch: SecurityException -> 0x021b, TRY_LEAVE, TryCatch #2 {SecurityException -> 0x021b, blocks: (B:86:0x0205, B:97:0x0221, B:102:0x0237, B:103:0x023c), top: B:116:0x01f3 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0226  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0118, code lost:
    
        if (r0 == r10) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x011c, code lost:
    
        r4 = r2;
        r0 = r9;
        r3 = r14;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0148, code lost:
    
        if (r0 == r10) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x016f, code lost:
    
        if (r0 == r10) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x019b, code lost:
    
        if (r0 == r10) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01c7, code lost:
    
        if (r0 == r10) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ed, code lost:
    
        if (r0 == r10) goto L109;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v31, types: [int] */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.fql1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
