package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lyc0 extends a8d1 implements vu30 {
    public xyc0 a;
    public String b;
    public jyc0 c;
    public int d;
    public byte e;
    public /* synthetic */ Object f;
    public final /* synthetic */ String g;
    public final /* synthetic */ xyc0 h;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lyc0(String str, xyc0 xyc0Var, String str2, lnm lnmVar) {
        super(2, lnmVar);
        this.g = str;
        this.h = xyc0Var;
        this.i = str2;
    }

    @Override // p.faa
    public final lnm create(Object obj, lnm lnmVar) {
        lyc0 lyc0Var = new lyc0(this.g, this.h, this.i, lnmVar);
        lyc0Var.f = obj;
        return lyc0Var;
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        return ((lyc0) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ab, code lost:
    
        if (r6.d(r7, r8, r9, r10, r12) == r5) goto L27;
     */
    @Override // p.faa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.lyc0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
