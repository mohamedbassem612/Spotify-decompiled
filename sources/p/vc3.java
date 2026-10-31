package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vc3 extends a8d1 implements bv30 {
    public fd3 a;
    public byte b;
    public /* synthetic */ pc3 c;
    public /* synthetic */ uc3 d;
    public /* synthetic */ tqw e;
    public final /* synthetic */ dx0 f;
    public final /* synthetic */ fd3 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc3(dx0 dx0Var, fd3 fd3Var, lnm lnmVar) {
        super(5, lnmVar);
        this.f = dx0Var;
        this.g = fd3Var;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        vc3 vc3Var = new vc3(this.f, this.g, (lnm) obj5);
        vc3Var.c = (pc3) obj;
        vc3Var.d = (uc3) obj2;
        vc3Var.e = (tqw) obj4;
        return vc3Var.invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0066  */
    /* JADX WARN: Code duplicated, block: B:22:0x006b  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
    
        if (((p.id3) r0).e(r14, r1, r13) == r7) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            p.pc3 r0 = r13.c
            p.uc3 r1 = r13.d
            p.tqw r2 = r13.e
            byte r3 = r13.b
            r4 = 2
            r5 = 1
            r6 = 0
            p.d9n r7 = p.d9n.a
            if (r3 == 0) goto L23
            if (r3 == r5) goto L1d
            if (r3 != r4) goto L17
            p.hm5.M(r14)
            goto L7f
        L17:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r13)
            return r6
        L1d:
            p.fd3 r0 = r13.a
            p.hm5.M(r14)
            goto L62
        L23:
            p.hm5.M(r14)
            boolean r14 = r1 instanceof p.qc3
            if (r14 == 0) goto L4c
            p.dx0 r13 = r13.f
            p.t740 r7 = p.dx0.e(r13)
            java.lang.String r8 = r0.a()
            if (r2 == 0) goto L3a
            p.tv80 r6 = p.n3o1.y(r2)
        L3a:
            r10 = r6
            p.qc3 r1 = (p.qc3) r1
            p.hpe0 r13 = r1.a()
            java.lang.String r11 = p.zr7.n(r13)
            r12 = 16
            r9 = 0
            p.t740.b(r7, r8, r9, r10, r11, r12)
            goto L7f
        L4c:
            r13.c = r6
            r13.d = r6
            r13.e = r2
            p.fd3 r0 = r13.g
            r13.a = r0
            r13.b = r5
            r14 = r0
            p.id3 r14 = (p.id3) r14
            p.ad3 r14 = r14.b()
            if (r14 != r7) goto L62
            goto L7e
        L62:
            p.ad3 r14 = (p.ad3) r14
            if (r2 == 0) goto L6b
            p.tv80 r1 = p.n3o1.y(r2)
            goto L6c
        L6b:
            r1 = r6
        L6c:
            r13.c = r6
            r13.d = r6
            r13.e = r6
            r13.a = r6
            r13.b = r4
            p.id3 r0 = (p.id3) r0
            java.lang.Object r13 = r0.e(r14, r1, r13)
            if (r13 != r7) goto L7f
        L7e:
            return r7
        L7f:
            p.rih1 r13 = p.rih1.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p.vc3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
