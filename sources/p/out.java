package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class out extends a8d1 implements iu30 {
    public aza a;
    public evt b;
    public aza c;
    public byte d;
    public final /* synthetic */ sut e;
    public final /* synthetic */ cut f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public out(sut sutVar, cut cutVar, lnm lnmVar) {
        super(1, lnmVar);
        this.e = sutVar;
        this.f = cutVar;
    }

    public final lnm create(lnm lnmVar) {
        return new out(this.e, this.f, lnmVar);
    }

    public final Object invoke(Object obj) {
        return create((lnm) obj).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0093  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a4, code lost:
    
        if (r3.a(r0, (java.util.Set) r14, r13) == r9) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            byte r0 = r13.d
            p.rih1 r1 = p.rih1.a
            r2 = 4
            r3 = 3
            r4 = 1
            p.cut r5 = r13.f
            r6 = 2
            p.sut r7 = r13.e
            r8 = 0
            p.d9n r9 = p.d9n.a
            if (r0 == 0) goto L37
            if (r0 == r4) goto L33
            if (r0 == r6) goto L2d
            if (r0 == r3) goto L24
            if (r0 != r2) goto L1e
            p.hm5.M(r14)
            goto La7
        L1e:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r13)
            return r8
        L24:
            p.aza r0 = r13.c
            p.evt r3 = r13.b
            p.hm5.M(r14)
            goto L96
        L2d:
            p.aza r0 = r13.a
            p.hm5.M(r14)
            goto L7c
        L33:
            p.hm5.M(r14)
            goto L50
        L37:
            p.hm5.M(r14)
            p.gz4 r14 = r7.f
            int r14 = r14.e()
            long r10 = (long) r14
            p.nut r14 = new p.nut
            r0 = 0
            r14.<init>(r7, r5, r8, r0)
            r13.d = r4
            java.lang.Object r14 = p.rc2.O(r10, r14, r13)
            if (r14 != r9) goto L50
            goto La6
        L50:
            p.aza r14 = (p.aza) r14
            if (r14 == 0) goto La7
            p.g0l r0 = r7.b
            r13.a = r14
            r13.d = r6
            p.inr r0 = (p.inr) r0
            io.reactivex.rxjava3.core.Observable r0 = r0.j()
            p.ezc r0 = p.yoi1.g(r0)
            p.p3t r4 = new p.p3t
            r4.<init>(r0, r2)
            p.nw5 r0 = new p.nw5
            r10 = 10
            r0.<init>(r6, r8, r10)
            java.lang.Object r0 = p.b5p1.j(r4, r0, r13)
            if (r0 != r9) goto L77
            goto L78
        L77:
            r0 = r1
        L78:
            if (r0 != r9) goto L7b
            goto La6
        L7b:
            r0 = r14
        L7c:
            p.evt r14 = r7.e
            p.f2t r4 = new p.f2t
            r6 = 7
            r4.<init>(r7, r5, r6)
            r13.a = r8
            r13.b = r14
            r13.c = r0
            r13.d = r3
            java.lang.Object r3 = r7.i(r4, r13)
            if (r3 != r9) goto L93
            goto La6
        L93:
            r12 = r3
            r3 = r14
            r14 = r12
        L96:
            java.util.Set r14 = (java.util.Set) r14
            r13.a = r8
            r13.b = r8
            r13.c = r8
            r13.d = r2
            java.lang.Object r13 = r3.a(r0, r14, r13)
            if (r13 != r9) goto La7
        La6:
            return r9
        La7:
            java.lang.String r13 = r5.a
            java.util.LinkedHashMap r14 = r7.h
            r14.remove(r13)
            java.util.LinkedHashMap r14 = r7.i
            r14.remove(r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p.out.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
