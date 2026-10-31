package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class slr extends a8d1 implements iu30 {
    public mje a;
    public d0r b;
    public kdy0 c;
    public String d;
    public byte e;
    public final /* synthetic */ wlr f;
    public final /* synthetic */ ahe g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public slr(wlr wlrVar, ahe aheVar, lnm lnmVar) {
        super(1, lnmVar);
        this.f = wlrVar;
        this.g = aheVar;
    }

    public final lnm create(lnm lnmVar) {
        return new slr(this.f, this.g, lnmVar);
    }

    public final Object invoke(Object obj) {
        return create((lnm) obj).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0061, code lost:
    
        if (r5.f(r6, r7, r8, (java.util.List) r12, r11) == r4) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            byte r0 = r11.e
            r1 = 2
            r2 = 1
            r3 = 0
            p.d9n r4 = p.d9n.a
            if (r0 == 0) goto L28
            if (r0 == r2) goto L17
            if (r0 != r1) goto L11
            p.hm5.M(r12)
            goto L64
        L11:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r11)
            return r3
        L17:
            java.lang.String r0 = r11.d
            p.kdy0 r2 = r11.c
            p.d0r r5 = r11.b
            p.mje r6 = r11.a
            p.hm5.M(r12)
            r7 = r6
            r6 = r5
            r5 = r7
            r8 = r0
            r7 = r2
            goto L4f
        L28:
            p.hm5.M(r12)
            p.wlr r12 = r11.f
            p.mje r6 = r12.g
            p.d0r r5 = r12.d
            p.kdy0 r0 = r12.h
            java.lang.String r7 = r12.e
            p.ahe r8 = r11.g
            java.lang.String r8 = r8.a
            r11.a = r6
            r11.b = r5
            r11.c = r0
            r11.d = r7
            r11.e = r2
            java.lang.Object r12 = r12.c(r8, r11)
            if (r12 != r4) goto L4a
            goto L63
        L4a:
            r8 = r6
            r6 = r5
            r5 = r8
            r8 = r7
            r7 = r0
        L4f:
            r9 = r12
            java.util.List r9 = (java.util.List) r9
            r11.a = r3
            r11.b = r3
            r11.c = r3
            r11.d = r3
            r11.e = r1
            r10 = r11
            java.lang.Object r11 = r5.f(r6, r7, r8, r9, r10)
            if (r11 != r4) goto L64
        L63:
            return r4
        L64:
            p.rih1 r11 = p.rih1.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p.slr.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
