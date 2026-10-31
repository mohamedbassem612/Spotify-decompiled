package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bs91 {
    public final xgn0 a = ygn0.a();
    public final hrr0 b = v8r.q((Object) null);

    public static Object c(bs91 bs91Var, String str, lnm lnmVar, int i) {
        bs91Var.getClass();
        return bs91Var.b(new yr91(str, 1), lnmVar);
    }

    public final wr91 a() {
        return (wr91) this.b.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        if (r9 == r6) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(p.yr91 r8, p.lnm r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p.as91
            if (r0 == 0) goto L13
            r0 = r9
            p.as91 r0 = (p.as91) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.as91 r0 = new p.as91
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.e
            p.hrr0 r2 = r7.b
            r3 = 2
            r4 = 1
            r5 = 0
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L3f
            if (r1 == r4) goto L37
            if (r1 != r3) goto L31
            p.vgn0 r7 = r0.b
            p.hm5.M(r9)     // Catch: java.lang.Throwable -> L2f
            goto L72
        L2f:
            r8 = move-exception
            goto L7b
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r5
        L37:
            p.vgn0 r7 = r0.b
            p.yr91 r8 = r0.a
            p.hm5.M(r9)
            goto L51
        L3f:
            p.hm5.M(r9)
            r0.a = r8
            p.xgn0 r7 = r7.a
            r0.b = r7
            r0.e = r4
            java.lang.Object r9 = r7.a(r0)
            if (r9 != r6) goto L51
            goto L71
        L51:
            r0.a = r8     // Catch: java.lang.Throwable -> L2f
            r0.b = r7     // Catch: java.lang.Throwable -> L2f
            r0.e = r3     // Catch: java.lang.Throwable -> L2f
            p.ohd r9 = new p.ohd     // Catch: java.lang.Throwable -> L2f
            p.lnm r0 = p.aym.t(r0)     // Catch: java.lang.Throwable -> L2f
            r9.<init>(r4, r0)     // Catch: java.lang.Throwable -> L2f
            r9.t()     // Catch: java.lang.Throwable -> L2f
            p.wr91 r0 = new p.wr91     // Catch: java.lang.Throwable -> L2f
            r0.<init>(r8, r9)     // Catch: java.lang.Throwable -> L2f
            r2.setValue(r0)     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r9 = r9.r()     // Catch: java.lang.Throwable -> L2f
            if (r9 != r6) goto L72
        L71:
            return r6
        L72:
            r2.setValue(r5)     // Catch: java.lang.Throwable -> L79
            r7.c(r5)
            return r9
        L79:
            r8 = move-exception
            goto L7f
        L7b:
            r2.setValue(r5)     // Catch: java.lang.Throwable -> L79
            throw r8     // Catch: java.lang.Throwable -> L79
        L7f:
            r7.c(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.bs91.b(p.yr91, p.lnm):java.lang.Object");
    }
}
