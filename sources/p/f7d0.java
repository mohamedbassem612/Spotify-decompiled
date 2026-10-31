package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class f7d0 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public final /* synthetic */ wj3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f7d0(wj3 wj3Var, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = wj3Var;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        wj3 wj3Var = this.c;
        switch (b) {
            case 0:
                return new f7d0(wj3Var, lnmVar, (byte) 0);
            default:
                return new f7d0(wj3Var, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0094  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
    
        if (r12 == r5) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            byte r0 = r11.a
            p.rih1 r1 = p.rih1.a
            p.w7x r2 = p.w7x.a
            r3 = 0
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            p.d9n r5 = p.d9n.a
            r6 = 1
            r7 = 2
            p.wj3 r8 = r11.c
            switch(r0) {
                case 0: goto L41;
                default: goto L12;
            }
        L12:
            byte r0 = r11.b
            if (r0 == 0) goto L27
            if (r0 == r6) goto L23
            if (r0 != r7) goto L1e
            p.hm5.M(r12)
            goto L40
        L1e:
            p.eg.m(r4)
            r1 = r3
            goto L40
        L23:
            p.hm5.M(r12)
            goto L33
        L27:
            p.hm5.M(r12)
            r11.b = r6
            java.lang.Object r12 = r8.q(r2, r11)
            if (r12 != r5) goto L33
            goto L3f
        L33:
            p.g3d0 r12 = r8.e()
            r11.b = r7
            java.lang.Object r11 = r8.r(r12, r11)
            if (r11 != r5) goto L40
        L3f:
            r1 = r5
        L40:
            return r1
        L41:
            java.lang.Object r0 = r8.e
            p.dma1 r0 = (p.dma1) r0
            byte r9 = r11.b
            r10 = 3
            if (r9 == 0) goto L61
            if (r9 == r6) goto L5d
            if (r9 == r7) goto L59
            if (r9 != r10) goto L54
            p.hm5.M(r12)
            goto La1
        L54:
            p.eg.m(r4)
            r1 = r3
            goto La1
        L59:
            p.hm5.M(r12)
            goto L94
        L5d:
            p.hm5.M(r12)
            goto L79
        L61:
            p.hm5.M(r12)
            p.bma1 r12 = p.n7d0.b
            java.lang.String r12 = r0.f(r12)
            if (r12 != 0) goto L7f
            java.lang.Object r12 = r8.O0
            p.x880 r12 = (p.x880) r12
            r11.b = r6
            java.lang.Object r12 = p.b5p1.i(r12, r11)
            if (r12 != r5) goto L79
            goto La0
        L79:
            p.g3d0 r12 = (p.g3d0) r12
            java.lang.String r12 = r12.g()
        L7f:
            p.hma1 r0 = r0.edit()
            p.bma1 r3 = p.n7d0.b
            r0.d(r3, r12)
            r0.g()
            r11.b = r7
            java.lang.Object r12 = r8.q(r2, r11)
            if (r12 != r5) goto L94
            goto La0
        L94:
            p.g3d0 r12 = r8.e()
            r11.b = r10
            java.lang.Object r11 = r8.r(r12, r11)
            if (r11 != r5) goto La1
        La0:
            r1 = r5
        La1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p.f7d0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
