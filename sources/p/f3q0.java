package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class f3q0 extends a8d1 implements vu30 {
    public long a;
    public byte b;
    public /* synthetic */ Object c;
    public final /* synthetic */ g3q0 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3q0(g3q0 g3q0Var, String str, int i, int i2, lnm lnmVar) {
        super(2, lnmVar);
        this.d = g3q0Var;
        this.e = str;
        this.f = i;
        this.g = i2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        f3q0 f3q0Var = new f3q0(this.d, this.e, this.f, this.g, lnmVar);
        f3q0Var.c = obj;
        return f3q0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0068  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        if (r0.emit(r1, r12) == r5) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.c
            p.vr20 r0 = (p.vr20) r0
            byte r1 = r12.b
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L21
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L15
            p.hm5.M(r13)
            goto L77
        L15:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r12)
            return r2
        L1b:
            long r6 = r12.a
            p.hm5.M(r13)
            goto L47
        L21:
            p.hm5.M(r13)
            p.g3q0 r13 = r12.d
            p.yqg r1 = r13.c
            long r6 = r1.b()
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r8
            r12.c = r0
            r12.a = r6
            r12.b = r4
            p.q8n r1 = r13.e
            p.cto0 r4 = new p.cto0
            r8 = 12
            java.lang.String r9 = r12.e
            r4.<init>(r13, r9, r2, r8)
            java.lang.Object r13 = p.fn31.Y(r1, r4, r12)
            if (r13 != r5) goto L47
            goto L76
        L47:
            java.lang.Number r13 = (java.lang.Number) r13
            long r8 = r13.longValue()
            long r10 = r6 - r8
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 <= 0) goto L68
            int r13 = r12.f
            long r8 = (long) r13
            int r13 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r13 >= 0) goto L68
            long r8 = r8 - r10
            r10 = 86400(0x15180, double:4.26873E-319)
            long r8 = r8 / r10
            int r13 = (int) r8
            p.d3q0 r1 = new p.d3q0
            int r4 = r12.g
            r1.<init>(r13, r4)
            goto L6a
        L68:
            p.c3q0 r1 = p.c3q0.a
        L6a:
            r12.c = r2
            r12.a = r6
            r12.b = r3
            java.lang.Object r12 = r0.emit(r1, r12)
            if (r12 != r5) goto L77
        L76:
            return r5
        L77:
            p.rih1 r12 = p.rih1.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p.f3q0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
