package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v8o {
    public final gj5 a;

    public v8o(gj5 gj5Var) {
        this.a = gj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
    
        if (p.u890.l(r7, r0) == r5) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(p.onm r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof p.u8o
            if (r0 == 0) goto L13
            r0 = r8
            p.u8o r0 = (p.u8o) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.u8o r0 = new p.u8o
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            p.gj5 r7 = r7.a
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2d
            p.hm5.M(r8)     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L74
            goto L7e
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r4
        L33:
            p.a6n1 r1 = r0.a
            p.hm5.M(r8)     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L74
            goto L61
        L39:
            p.hm5.M(r8)
            android.content.Context r8 = r7.getApplicationContext()     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L74
            if (r8 == 0) goto L43
            goto L44
        L43:
            r8 = r7
        L44:
            p.a6n1 r1 = new p.a6n1     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L74
            p.nbo1 r6 = new p.nbo1     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L74
            r6.<init>(r8)     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L74
            r1.<init>(r6)     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L74
            java.lang.Object r8 = r1.b     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L74
            p.nbo1 r8 = (p.nbo1) r8     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L74
            p.hfp1 r8 = r8.a()     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L74
            r0.a = r1     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L74
            r0.d = r3     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L74
            java.lang.Object r8 = p.u890.l(r8, r0)     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L74
            if (r8 != r5) goto L61
            goto L71
        L61:
            p.r8o r8 = (p.r8o) r8     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L74
            p.hfp1 r7 = r1.c(r7, r8)     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L74
            r0.a = r4     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L74
            r0.d = r2     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L74
            java.lang.Object r7 = p.u890.l(r7, r0)     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L74
            if (r7 != r5) goto L7e
        L71:
            return r5
        L72:
            r7 = move-exception
            goto L76
        L74:
            r7 = move-exception
            goto L81
        L76:
            r8 = 0
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.String r0 = "WearAppOnboarding: CrossDevicePromptInstallation failed"
            com.spotify.base.java.logging.Logger.e(r7, r0, r8)
        L7e:
            p.rih1 r7 = p.rih1.a
            return r7
        L81:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.v8o.a(p.onm):java.lang.Object");
    }
}
