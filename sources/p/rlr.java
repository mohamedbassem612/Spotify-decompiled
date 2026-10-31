package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rlr extends a8d1 implements iu30 {
    public mje a;
    public d0r b;
    public kdy0 c;
    public tzo d;
    public uq8 e;
    public String f;
    public byte g;
    public final /* synthetic */ wlr h;
    public final /* synthetic */ ahe i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rlr(wlr wlrVar, ahe aheVar, lnm lnmVar) {
        super(1, lnmVar);
        this.h = wlrVar;
        this.i = aheVar;
    }

    public final lnm create(lnm lnmVar) {
        return new rlr(this.h, this.i, lnmVar);
    }

    public final Object invoke(Object obj) {
        return create((lnm) obj).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x007e, code lost:
    
        if (r11.d(r10, r7, r6, r4, r5, (java.util.List) r3, r1, r14) == r9) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            byte r0 = r14.g
            p.wlr r1 = r14.h
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r9 = p.d9n.a
            if (r0 == 0) goto L31
            if (r0 == r3) goto L1a
            if (r0 != r2) goto L14
            p.hm5.M(r15)
            goto L81
        L14:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            return r4
        L1a:
            java.lang.String r0 = r14.f
            p.uq8 r3 = r14.e
            p.tzo r5 = r14.d
            p.kdy0 r6 = r14.c
            p.d0r r7 = r14.b
            p.mje r10 = r14.a
            p.hm5.M(r15)
            r11 = r10
            r10 = r7
            r7 = r6
            r6 = r5
            r5 = r0
            r0 = r3
            r3 = r15
            goto L5f
        L31:
            p.hm5.M(r15)
            p.mje r10 = r1.g
            p.d0r r7 = r1.d
            p.kdy0 r6 = r1.h
            p.tzo r5 = r1.n
            p.uq8 r0 = r1.l
            java.lang.String r11 = r1.e
            p.ahe r12 = r14.i
            java.lang.String r12 = r12.a
            r14.a = r10
            r14.b = r7
            r14.c = r6
            r14.d = r5
            r14.e = r0
            r14.f = r11
            r14.g = r3
            java.lang.Object r3 = r1.d(r12, r14)
            if (r3 != r9) goto L59
            goto L80
        L59:
            r13 = r6
            r6 = r5
            r5 = r11
            r11 = r10
            r10 = r7
            r7 = r13
        L5f:
            java.util.List r3 = (java.util.List) r3
            p.hsc r1 = r1.m
            r14.a = r4
            r14.b = r4
            r14.c = r4
            r14.d = r4
            r14.e = r4
            r14.f = r4
            r14.g = r2
            r2 = r6
            r6 = r3
            r3 = r2
            r8 = r14
            r4 = r0
            r2 = r7
            r0 = r11
            r7 = r1
            r1 = r10
            java.lang.Object r0 = r0.d(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r0 != r9) goto L81
        L80:
            return r9
        L81:
            p.rih1 r0 = p.rih1.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.rlr.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
