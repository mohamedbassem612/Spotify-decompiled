package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class x33 extends a8d1 implements vu30 {
    public u961 a;
    public String b;
    public int c;
    public int d;
    public byte e;
    public /* synthetic */ Object f;
    public final /* synthetic */ u961 g;
    public final /* synthetic */ String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x33(u961 u961Var, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.g = u961Var;
        this.h = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        x33 x33Var = new x33(this.g, this.h, lnmVar);
        x33Var.f = obj;
        return x33Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:68|37|83|38|(5:41|42|48|(5:(1:51)|52|(1:54)(1:55)|56|(2:58|(1:59)))|62)|64) */
    /* JADX WARN: Code duplicated, block: B:41:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:90:? A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cf, code lost:
    
        r13 = r3;
        r3 = r15;
        r15 = r10;
        r10 = r0;
        r0 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d5, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0121, code lost:
    
        if (p.hap1.i(1000, r14) == r9) goto L64;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0121 -> B:8:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.x33.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
