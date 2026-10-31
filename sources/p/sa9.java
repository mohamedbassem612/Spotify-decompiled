package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class sa9 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xab1 b;
    public final /* synthetic */ ssw0 c;

    public /* synthetic */ sa9(xab1 xab1Var, ssw0 ssw0Var, byte b) {
        this.a = b;
        this.b = xab1Var;
        this.c = ssw0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        if (r6.c.b(r7, r0) == r5) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(com.spotify.pamviewservice.v1.proto.PremiumPlanRow r7, p.lnm r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p.ra9
            if (r0 == 0) goto L13
            r0 = r8
            p.ra9 r0 = (p.ra9) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.ra9 r0 = new p.ra9
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            p.hm5.M(r8)
            goto L6d
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r2
        L31:
            com.spotify.pamviewservice.v1.proto.PremiumPlanRow r7 = r0.a
            p.hm5.M(r8)
            goto L47
        L37:
            p.hm5.M(r8)
            r0.a = r7
            r0.d = r4
            p.xab1 r8 = r6.b
            java.lang.Object r8 = p.op71.p(r8, r0)
            if (r8 != r5) goto L47
            goto L6c
        L47:
            com.spotify.pamviewservice.v1.proto.AvailablePlans r7 = r7.o()
            java.lang.String r7 = r7.getTitle()
            if (r7 == 0) goto L5a
            boolean r7 = p.ihc1.y0(r7)
            if (r7 == 0) goto L58
            goto L5a
        L58:
            r7 = 0
            goto L5b
        L5a:
            r7 = r4
        L5b:
            r7 = r7 ^ r4
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r0.a = r2
            r0.d = r3
            p.ssw0 r6 = r6.c
            java.lang.Object r6 = r6.b(r7, r0)
            if (r6 != r5) goto L6d
        L6c:
            return r5
        L6d:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.sa9.b(com.spotify.pamviewservice.v1.proto.PremiumPlanRow, p.lnm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r6.c.b(r7, r0) == r5) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r7, p.lnm r8) {
        /*
            r6 = this;
            byte r0 = r6.a
            switch(r0) {
                case 0: goto L5d;
                default: goto L5;
            }
        L5:
            boolean r0 = r8 instanceof p.vc80
            if (r0 == 0) goto L18
            r0 = r8
            p.vc80 r0 = (p.vc80) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.d = r1
            goto L1d
        L18:
            p.vc80 r0 = new p.vc80
            r0.<init>(r6, r8)
        L1d:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L3c
            if (r1 == r4) goto L36
            if (r1 != r3) goto L30
            p.hm5.M(r8)
            goto L5a
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            goto L5c
        L36:
            java.lang.Object r7 = r0.a
            p.hm5.M(r8)
            goto L4c
        L3c:
            p.hm5.M(r8)
            r0.a = r7
            r0.d = r4
            p.xab1 r8 = r6.b
            java.lang.Object r8 = p.op71.p(r8, r0)
            if (r8 != r5) goto L4c
            goto L58
        L4c:
            r0.a = r2
            r0.d = r3
            p.ssw0 r6 = r6.c
            java.lang.Object r6 = r6.b(r7, r0)
            if (r6 != r5) goto L5a
        L58:
            r2 = r5
            goto L5c
        L5a:
            p.rih1 r2 = p.rih1.a
        L5c:
            return r2
        L5d:
            com.spotify.pamviewservice.v1.proto.PremiumPlanRow r7 = (com.spotify.pamviewservice.v1.proto.PremiumPlanRow) r7
            java.lang.Object r6 = r6.b(r7, r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.sa9.emit(java.lang.Object, p.lnm):java.lang.Object");
    }
}
