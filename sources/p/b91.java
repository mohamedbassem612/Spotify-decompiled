package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class b91 extends a8d1 implements vu30 {
    public final /* synthetic */ String N0;
    public final /* synthetic */ boolean O0;
    public final /* synthetic */ d91 X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ boolean Z;
    public vgn0 a;
    public Object b;
    public String c;
    public String d;
    public boolean e;
    public boolean f;
    public int g;
    public int h;
    public byte i;
    public /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b91(d91 d91Var, String str, boolean z, String str2, boolean z2, lnm lnmVar) {
        super(2, lnmVar);
        this.X = d91Var;
        this.Y = str;
        this.Z = z;
        this.N0 = str2;
        this.O0 = z2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        b91 b91Var = new b91(this.X, this.Y, this.Z, this.N0, this.O0, lnmVar);
        b91Var.t = obj;
        return b91Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00fb  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012f, code lost:
    
        if (r4.emit(r0, r17) == r14) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [byte] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.b91.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
