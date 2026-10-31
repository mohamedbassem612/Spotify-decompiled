package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dim extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public Object g;
    public Object h;
    public Object i;
    public Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dim(int[] iArr, spl1 spl1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.i = iArr;
        this.t = spl1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new dim((jim) this.h, lnmVar);
            default:
                return new dim((int[]) this.i, (spl1) this.t, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f8 A[Catch: all -> 0x011a, TryCatch #2 {all -> 0x011a, blocks: (B:34:0x00f0, B:36:0x00f8, B:38:0x0106, B:40:0x0114), top: B:55:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0106 A[Catch: all -> 0x011a, TryCatch #2 {all -> 0x011a, blocks: (B:34:0x00f0, B:36:0x00f8, B:38:0x0106, B:40:0x0114), top: B:55:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0123  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x005e -> B:15:0x0061). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00e9 -> B:55:0x00f0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.dim.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dim(jim jimVar, lnm lnmVar) {
        super(2, lnmVar);
        this.h = jimVar;
    }
}
