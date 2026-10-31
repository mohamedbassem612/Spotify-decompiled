package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class f2t0 extends z031 implements vu30 {
    public int b;
    public byte c;
    public /* synthetic */ Object d;
    public final /* synthetic */ xu30 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2t0(xu30 xu30Var, lnm lnmVar) {
        super(2, lnmVar);
        this.e = xu30Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        f2t0 f2t0Var = new f2t0(this.e, lnmVar);
        f2t0Var.d = obj;
        return f2t0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((i8d1) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (p.rqd1.b(r1, r15, 2) == r5) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        if (r6 == r5) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        return r5;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x003e -> B:17:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.f2t0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
