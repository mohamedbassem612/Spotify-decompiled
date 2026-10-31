package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pxx extends z031 implements vu30 {
    public m811 b;
    public l811 c;
    public byte d;
    public /* synthetic */ Object e;
    public final /* synthetic */ t24 f;
    public final /* synthetic */ c9n g;
    public final /* synthetic */ flb0 h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pxx(t24 t24Var, c9n c9nVar, flb0 flb0Var, boolean z, boolean z2, lnm lnmVar) {
        super(2, lnmVar);
        this.f = t24Var;
        this.g = c9nVar;
        this.h = flb0Var;
        this.i = z;
        this.t = z2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        pxx pxxVar = new pxx(this.f, this.g, this.h, this.i, this.t, lnmVar);
        pxxVar.e = obj;
        return pxxVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((i8d1) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0099, code lost:
    
        if (p.g5v.n(r1, r4, r9, r19) == r8) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            java.lang.Object r1 = r0.e
            p.i8d1 r1 = (p.i8d1) r1
            byte r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            p.t24 r6 = r0.f
            r7 = 0
            p.d9n r8 = p.d9n.a
            if (r2 == 0) goto L37
            if (r2 == r5) goto L31
            if (r2 == r4) goto L23
            if (r2 != r3) goto L1d
            p.hm5.M(r20)
            goto L9c
        L1d:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            return r7
        L23:
            p.l811 r2 = r0.c
            p.m811 r4 = r0.b
            p.hm5.M(r20)
            r11 = r2
            r13 = r4
            r18 = r6
            r4 = r20
            goto L76
        L31:
            p.hm5.M(r20)
            r2 = r20
            goto L45
        L37:
            p.hm5.M(r20)
            r0.e = r1
            r0.d = r5
            java.lang.Object r2 = p.rqd1.b(r1, r0, r4)
            if (r2 != r8) goto L45
            goto L9b
        L45:
            p.hav0 r2 = (p.hav0) r2
            p.m811 r13 = new p.m811
            r13.<init>()
            p.l811 r11 = new p.l811
            r11.<init>()
            long r9 = r2.a
            r14 = r9
            p.hy r9 = new p.hy
            r16 = r14
            boolean r15 = r0.t
            r10 = 10
            p.flb0 r12 = r0.h
            boolean r14 = r0.i
            r18 = r6
            r5 = r16
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r0.e = r1
            r0.b = r13
            r0.c = r11
            r0.d = r4
            java.lang.Object r4 = p.g5v.d(r1, r5, r9, r0)
            if (r4 != r8) goto L76
            goto L9b
        L76:
            p.hav0 r4 = (p.hav0) r4
            if (r4 == 0) goto La9
            boolean r5 = r11.a
            if (r5 == 0) goto La9
            float r5 = r13.a
            r6 = r18
            r6.b(r5)
            long r4 = r4.a
            p.mxx r9 = new p.mxx
            r2 = 1
            r9.<init>(r6, r2)
            r0.e = r7
            r0.b = r7
            r0.c = r7
            r0.d = r3
            java.lang.Object r1 = p.g5v.n(r1, r4, r9, r0)
            if (r1 != r8) goto L9c
        L9b:
            return r8
        L9c:
            p.ett r1 = new p.ett
            r2 = 14
            r1.<init>(r6, r7, r2)
            r2 = 0
            p.c9n r0 = r0.g
            p.fn31.T(r0, r7, r2, r1, r3)
        La9:
            p.rih1 r0 = p.rih1.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.pxx.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
