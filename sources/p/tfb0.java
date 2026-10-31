package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tfb0 extends a8d1 implements vu30 {
    public long a;
    public byte b;
    public /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Long e;
    public final /* synthetic */ yqg f;
    public final /* synthetic */ ihd0 g;
    public final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tfb0(boolean z, Long l, yqg yqgVar, ihd0 ihd0Var, boolean z2, lnm lnmVar) {
        super(2, lnmVar);
        this.d = z;
        this.e = l;
        this.f = yqgVar;
        this.g = ihd0Var;
        this.h = z2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        tfb0 tfb0Var = new tfb0(this.d, this.e, this.f, this.g, this.h, lnmVar);
        tfb0Var.c = obj;
        return tfb0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:25:0x0083 A[PHI: r13
      0x0083: PHI (r13v0 long) = (r13v2 long), (r13v2 long), (r13v3 long) binds: [B:23:0x0080, B:20:0x005d, B:11:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0094  */
    /* JADX WARN: Code duplicated, block: B:28:0x0098  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b2  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00be, code lost:
    
        if (p.hap1.i(r2, r21) == r12) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d3, code lost:
    
        if (r1.emit(r2, r21) == r12) goto L44;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00be -> B:41:0x00c1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.tfb0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
