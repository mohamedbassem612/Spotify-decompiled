package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vfo1 {
    public final a6n1 a;
    public s2t b;
    public final y1t0 c;
    public final qeh1 d;

    public vfo1(y1t0 y1t0Var, a6n1 a6n1Var, qeh1 qeh1Var) {
        this.c = y1t0Var;
        this.a = a6n1Var;
        this.d = qeh1Var;
    }

    public final qwo1 a() {
        return new qwo1(new zdm1(this, null, (byte) 4));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
    
        if (r7 != r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(p.onm r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p.oeo1
            if (r0 == 0) goto L13
            r0 = r7
            p.oeo1 r0 = (p.oeo1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.oeo1 r0 = new p.oeo1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            p.d9n r1 = p.d9n.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            p.hm5.M(r7)
            goto L57
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r5
        L31:
            p.hm5.M(r7)
            goto L44
        L35:
            p.hm5.M(r7)
            p.a6n1 r7 = r6.a
            r0.c = r4
            java.lang.String r2 = "ovk"
            java.lang.Object r7 = r7.a(r2, r0)
            if (r7 == r1) goto L69
        L44:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L49
            return r7
        L49:
            monitor-enter(r6)
            p.s2t r7 = r6.b     // Catch: java.lang.Throwable -> L66
            monitor-exit(r6)
            if (r7 == 0) goto L5a
            r0.c = r3
            java.lang.Object r7 = r7.Q(r0)
            if (r7 == r1) goto L69
        L57:
            java.lang.String r7 = (java.lang.String) r7
            goto L5b
        L5a:
            r7 = r5
        L5b:
            if (r7 == 0) goto L65
            int r6 = r7.length()
            if (r6 != 0) goto L64
            goto L65
        L64:
            return r7
        L65:
            return r5
        L66:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p.vfo1.b(p.onm):java.lang.Object");
    }
}
