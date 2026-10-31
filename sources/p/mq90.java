package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mq90 implements enn {
    public final c9c0 a;
    public final lzn0 b;
    public final up90 c;
    public final vx40 d;
    public final p410 e;

    public mq90(c9c0 c9c0Var, lzn0 lzn0Var, up90 up90Var, vx40 vx40Var, p410 p410Var) {
        this.a = c9c0Var;
        this.b = lzn0Var;
        this.c = up90Var;
        this.d = vx40Var;
        this.e = p410Var;
    }

    public final Object a(qmn qmnVar, lnm lnmVar) {
        if (((bp90) this.a.e.a().getValue()).b) {
            return new mmn(tnx.c, new Integer(2131954648), (Integer) null, new Integer(2131954642), (String) null, (tm81) null, (nmn) null, 6, new jmn(o390.b1, new c4z(2, this, mq90.class, "onClick", "onClick(Lcom/spotify/ubi/logger/InteractionLoggingResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 15)), 476);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006e, code lost:
    
        if (r4.invoke(r0) == r5) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(p.tv80 r7, boolean r8, p.lnm r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p.lq90
            if (r0 == 0) goto L13
            r0 = r9
            p.lq90 r0 = (p.lq90) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.lq90 r0 = new p.lq90
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r9)
            goto L71
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L31:
            boolean r8 = r0.a
            p.hm5.M(r9)     // Catch: java.lang.Throwable -> L37 java.util.concurrent.CancellationException -> L74
            goto L4d
        L37:
            r7 = move-exception
            goto L50
        L39:
            p.hm5.M(r9)
            p.p410 r9 = r6.e     // Catch: java.lang.Throwable -> L37 java.util.concurrent.CancellationException -> L74
            p.o4a0 r1 = p.o4a0.a     // Catch: java.lang.Throwable -> L37 java.util.concurrent.CancellationException -> L74
            p.ou80 r7 = r7.a     // Catch: java.lang.Throwable -> L37 java.util.concurrent.CancellationException -> L74
            r0.a = r8     // Catch: java.lang.Throwable -> L37 java.util.concurrent.CancellationException -> L74
            r0.d = r3     // Catch: java.lang.Throwable -> L37 java.util.concurrent.CancellationException -> L74
            java.io.Serializable r9 = r9.C(r1, r7, r4, r0)     // Catch: java.lang.Throwable -> L37 java.util.concurrent.CancellationException -> L74
            if (r9 != r5) goto L4d
            goto L70
        L4d:
            p.iu30 r9 = (p.iu30) r9     // Catch: java.lang.Throwable -> L37 java.util.concurrent.CancellationException -> L74
            goto L55
        L50:
            p.m231 r9 = new p.m231
            r9.<init>(r7)
        L55:
            boolean r7 = r9 instanceof p.m231
            if (r7 == 0) goto L5a
            goto L5b
        L5a:
            r4 = r9
        L5b:
            p.iu30 r4 = (p.iu30) r4
            if (r4 == 0) goto L71
            if (r8 == 0) goto L66
            p.lzn0 r6 = r6.b
            r6.e()
        L66:
            r0.a = r8
            r0.d = r2
            java.lang.Object r6 = r4.invoke(r0)
            if (r6 != r5) goto L71
        L70:
            return r5
        L71:
            p.rih1 r6 = p.rih1.a
            return r6
        L74:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.mq90.b(p.tv80, boolean, p.lnm):java.lang.Object");
    }
}
