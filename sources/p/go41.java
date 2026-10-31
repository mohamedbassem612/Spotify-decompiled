package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class go41 implements jei1 {
    public final kly0 a;
    public final mr20 b;
    public final oum c;

    public go41(caq caqVar, mr20 mr20Var, oum oumVar) {
        this.a = caqVar;
        this.b = mr20Var;
        this.c = oumVar;
    }

    public final Object a(String str, String str2, String str3, String str4, onm onmVar) {
        return b(new sew0(str, str2, str3, str4, (lnm) null, (byte) 19), onmVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
    
        if (r9 == r6) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(p.sew0 r8, p.onm r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p.fo41
            if (r0 == 0) goto L13
            r0 = r9
            p.fo41 r0 = (p.fo41) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.fo41 r0 = new p.fo41
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.e
            p.oum r2 = r7.c
            r3 = 2
            r4 = 1
            r5 = 0
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L3d
            if (r1 == r4) goto L37
            if (r1 != r3) goto L31
            p.rzq r7 = r0.b
            p.hm5.M(r9)     // Catch: java.lang.Throwable -> L2f
            goto L76
        L2f:
            r8 = move-exception
            goto L7a
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r5
        L37:
            p.sew0 r8 = r0.a
            p.hm5.M(r9)
            goto L52
        L3d:
            p.hm5.M(r9)
            boolean r9 = r2.a
            if (r9 != 0) goto L45
            return r5
        L45:
            r0.a = r8
            r0.e = r4
            p.mr20 r9 = r7.b
            java.lang.Object r9 = p.b5p1.i(r9, r0)
            if (r9 != r6) goto L52
            goto L75
        L52:
            p.th61 r9 = (p.th61) r9
            java.lang.String r9 = r9.a
            p.j3r r1 = p.rzq.y
            p.kly0 r7 = r7.a
            java.lang.Object r7 = r7.get()
            p.l2r r7 = (p.l2r) r7
            p.rzq r7 = p.l2p1.f(r7)
            p.mei1 r1 = new p.mei1     // Catch: java.lang.Throwable -> L2f
            r1.<init>(r7, r9, r2)     // Catch: java.lang.Throwable -> L2f
            r0.a = r5     // Catch: java.lang.Throwable -> L2f
            r0.b = r7     // Catch: java.lang.Throwable -> L2f
            r0.e = r3     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r9 = r8.invoke(r1, r0)     // Catch: java.lang.Throwable -> L2f
            if (r9 != r6) goto L76
        L75:
            return r6
        L76:
            r7.l()
            return r9
        L7a:
            r7.l()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.go41.b(p.sew0, p.onm):java.lang.Object");
    }
}
