package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z521 extends tt51 {
    public final hy00 X;
    public final String g;
    public final iyc0 h;
    public final koc0 i;
    public final ykq t;

    public z521(d0r d0rVar, u9c0 u9c0Var, g931 g931Var, String str, iyc0 iyc0Var, koc0 koc0Var, ykq ykqVar) {
        super(d0rVar, u9c0Var, g931Var);
        this.g = str;
        this.h = iyc0Var;
        this.i = koc0Var;
        this.t = ykqVar;
        this.X = n3o1.r(this).c(ok11.X0, new g001(this, (byte) 28));
    }

    public final rqw a() {
        return this.X;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        if (r10 == r5) goto L29;
     */
    @Override // p.tt51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(p.aw51 r8, p.tv80 r9, p.lnm r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof p.y521
            if (r0 == 0) goto L13
            r0 = r10
            p.y521 r0 = (p.y521) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L1a
        L13:
            p.y521 r0 = new p.y521
            p.onm r10 = (p.onm) r10
            r0.<init>(r7, r10)
        L1a:
            java.lang.Object r10 = r0.c
            int r1 = r0.e
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L40
            if (r1 == r4) goto L3a
            if (r1 != r3) goto L33
            p.z521 r7 = r0.b
            p.aw51 r8 = r0.a
            p.hm5.M(r10)     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> Laf
            goto L74
        L31:
            r7 = move-exception
            goto L99
        L33:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            r7 = 0
            return r7
        L3a:
            p.aw51 r8 = r0.a
            p.hm5.M(r10)
            goto L56
        L40:
            p.hm5.M(r10)
            java.util.ArrayList r10 = r8.a
            r0.a = r8
            r0.e = r4
            p.iyc0 r1 = r7.h
            p.xyc0 r1 = (p.xyc0) r1
            java.lang.String r6 = r7.g
            java.lang.Object r10 = r1.m(r6, r10, r0, r9)
            if (r10 != r5) goto L56
            goto L73
        L56:
            p.py21 r10 = (p.py21) r10
            boolean r9 = r10 instanceof p.oy21
            if (r9 != 0) goto L5f
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L5f:
            p.koc0 r9 = r7.i     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> Laf
            p.roc0 r9 = (p.roc0) r9     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> Laf
            p.any r9 = r9.d()     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> Laf
            r0.a = r8     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> Laf
            r0.b = r7     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> Laf
            r0.e = r3     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> Laf
            java.lang.Object r10 = p.b5p1.i(r9, r0)     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> Laf
            if (r10 != r5) goto L74
        L73:
            return r5
        L74:
            p.cxc0 r10 = (p.cxc0) r10     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> Laf
            p.kby r9 = r10.f     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> Laf
            p.ykq r10 = r7.t     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> Laf
            java.lang.Object r10 = r10.get()     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> Laf
            p.ymu0 r10 = (p.ymu0) r10     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> Laf
            java.lang.String r7 = r7.g     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> Laf
            p.x7i1 r9 = r9.w     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> Laf
            p.o3w r0 = new p.o3w     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> Laf
            java.util.ArrayList r8 = r8.a     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> Laf
            int r8 = r8.size()     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> Laf
            r1 = 5
            r0.<init>(r2, r8, r2, r1)     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> Laf
            boolean r7 = r10.a(r0, r7, r9, r4)     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> Laf
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> Laf
            goto L9f
        L99:
            p.m231 r8 = new p.m231
            r8.<init>(r7)
            r7 = r8
        L9f:
            java.lang.Throwable r7 = p.e331.a(r7)
            if (r7 == 0) goto Lac
            java.lang.String r8 = "Failed to show snackbar after removing items."
            java.lang.Object[] r9 = new java.lang.Object[r2]
            com.spotify.base.java.logging.Logger.e(r7, r8, r9)
        Lac:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        Laf:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.z521.e(p.aw51, p.tv80, p.lnm):java.lang.Object");
    }
}
