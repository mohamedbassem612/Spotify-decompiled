package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class huk extends a8d1 implements vu30 {
    public fuk a;
    public int b;
    public int c;
    public byte d;
    public final /* synthetic */ iuk e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public huk(iuk iukVar, lnm lnmVar) {
        super(2, lnmVar);
        this.e = iukVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new huk(this.e, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0072  */
    /* JADX WARN: Code duplicated, block: B:17:0x007c A[LOOP:0: B:17:0x007c->B:57:?, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:22:0x009f A[PHI: r4 r11
      0x009f: PHI (r4v9 java.lang.Object) = (r4v29 java.lang.Object), (r4v33 java.lang.Object) binds: [B:20:0x009b, B:11:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x009f: PHI (r11v7 int) = (r11v13 int), (r11v0 int) binds: [B:20:0x009b, B:11:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:34:0x0102  */
    /* JADX WARN: Code duplicated, block: B:35:0x0105  */
    /* JADX WARN: Code duplicated, block: B:39:0x011f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0133 A[PHI: r4 r8 r15
      0x0133: PHI (r4v6 int) = (r4v19 int), (r4v34 int) binds: [B:38:0x011d, B:10:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x0133: PHI (r8v3 p.fuk) = (r8v8 p.fuk), (r8v13 p.fuk) binds: [B:38:0x011d, B:10:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x0133: PHI (r15v1 int) = (r15v4 int), (r15v7 int) binds: [B:38:0x011d, B:10:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x0141  */
    /* JADX WARN: Code duplicated, block: B:47:0x0158  */
    /* JADX WARN: Code duplicated, block: B:49:0x0164  */
    /* JADX WARN: Code duplicated, block: B:53:0x0179  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0172 -> B:52:0x0175). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0179 -> B:13:0x0068). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.huk.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
