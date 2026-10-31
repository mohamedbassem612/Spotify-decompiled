package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yfz0 extends z031 implements vu30 {
    public float b;
    public int c;
    public byte d;
    public /* synthetic */ Object e;
    public final /* synthetic */ fgz0 f;
    public final /* synthetic */ float g;
    public final /* synthetic */ c9n h;
    public final /* synthetic */ drr0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yfz0(fgz0 fgz0Var, float f, c9n c9nVar, drr0 drr0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.f = fgz0Var;
        this.g = f;
        this.h = c9nVar;
        this.i = drr0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        yfz0 yfz0Var = new yfz0(this.f, this.g, this.h, this.i, lnmVar);
        yfz0Var.e = obj;
        return yfz0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((i8d1) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008b A[Catch: all -> 0x002a, TRY_ENTER, TryCatch #0 {all -> 0x002a, blocks: (B:7:0x001e, B:30:0x009c, B:32:0x00a8, B:37:0x00b1, B:27:0x008b), top: B:43:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ee  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        if (r2 == r12) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0099, code lost:
    
        if (r4 == r12) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009b, code lost:
    
        return r12;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0099 -> B:30:0x009c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.yfz0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
