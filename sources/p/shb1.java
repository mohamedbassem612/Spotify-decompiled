package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class shb1 extends z031 implements vu30 {
    public byte b;
    public /* synthetic */ Object c;
    public final /* synthetic */ float d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ ven0 f;
    public final /* synthetic */ hdn0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public shb1(float f, iu30 iu30Var, ven0 ven0Var, hdn0 hdn0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.d = f;
        this.e = iu30Var;
        this.f = ven0Var;
        this.g = hdn0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        shb1 shb1Var = new shb1(this.d, this.e, this.f, this.g, lnmVar);
        shb1Var.c = obj;
        return shb1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((i8d1) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        if (r12 == r8) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0064, code lost:
    
        if (r12 == r8) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
    
        return r8;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0064 -> B:17:0x0067). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.shb1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
