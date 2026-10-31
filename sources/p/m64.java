package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class m64 {
    public final a710 a;
    public final mr20 b;

    public m64(a710 a710Var, mr20 mr20Var) {
        this.a = a710Var;
        this.b = mr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0091  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ac, code lost:
    
        if (p.fc11.j(r12, r0) == r7) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r11, com.spotify.player.model.command.options.LoggingParams r13, p.onm r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof p.k64
            if (r0 == 0) goto L13
            r0 = r14
            p.k64 r0 = (p.k64) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.k64 r0 = new p.k64
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.c
            int r1 = r0.e
            p.a710 r2 = r10.a
            r3 = 0
            r4 = 3
            r5 = 1
            r6 = 2
            p.d9n r7 = p.d9n.a
            if (r1 == 0) goto L47
            if (r1 == r5) goto L3f
            if (r1 == r6) goto L37
            if (r1 != r4) goto L31
            p.hm5.M(r14)
            goto Laf
        L31:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r10)
            return r3
        L37:
            long r10 = r0.a
            com.spotify.player.model.command.options.LoggingParams r12 = r0.b
            p.hm5.M(r14)
            goto L8f
        L3f:
            long r11 = r0.a
            com.spotify.player.model.command.options.LoggingParams r13 = r0.b
            p.hm5.M(r14)
            goto L66
        L47:
            p.hm5.M(r14)
            p.ytw0 r14 = p.jfv.b
            p.ngv r14 = p.ngv.e
            long r8 = p.fdg1.k0(r6, r14)
            p.qm r14 = new p.qm
            r1 = 23
            r14.<init>(r10, r3, r1)
            r0.b = r13
            r0.a = r11
            r0.e = r5
            java.lang.Object r10 = p.rc2.P(r8, r14, r0)
            if (r10 != r7) goto L66
            goto Lae
        L66:
            r10 = r2
            p.g710 r10 = (p.g710) r10
            r10.getClass()
            p.i9u0 r14 = new p.i9u0
            r14.<init>(r11)
            p.ruz r1 = r10.k
            io.reactivex.rxjava3.core.Single r14 = r1.a(r14)
            p.b710 r1 = new p.b710
            r1.<init>(r10, r6)
            io.reactivex.rxjava3.core.Single r10 = r14.doOnSuccess(r1)
            r0.b = r13
            r0.a = r11
            r0.e = r6
            java.lang.Object r10 = p.fc11.j(r10, r0)
            if (r10 != r7) goto L8d
            goto Lae
        L8d:
            r10 = r11
            r12 = r13
        L8f:
            if (r12 != 0) goto L99
            com.spotify.player.model.command.options.LoggingParams$Builder r12 = com.spotify.player.model.command.options.LoggingParams.builder()
            com.spotify.player.model.command.options.LoggingParams r12 = r12.build()
        L99:
            r12.getClass()
            p.g710 r2 = (p.g710) r2
            io.reactivex.rxjava3.core.Single r12 = r2.h(r12)
            r0.b = r3
            r0.a = r10
            r0.e = r4
            java.lang.Object r10 = p.fc11.j(r12, r0)
            if (r10 != r7) goto Laf
        Lae:
            return r7
        Laf:
            p.rih1 r10 = p.rih1.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p.m64.a(long, com.spotify.player.model.command.options.LoggingParams, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (p.hap1.i(500, r0) == r4) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(p.onm r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p.l64
            if (r0 == 0) goto L13
            r0 = r6
            p.l64 r0 = (p.l64) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.l64 r0 = new p.l64
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 2
            r3 = 1
            p.d9n r4 = p.d9n.a
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            p.hm5.M(r6)
            goto L6f
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r5)
            r5 = 0
            return r5
        L31:
            p.hm5.M(r6)
            goto L55
        L35:
            p.hm5.M(r6)
            p.a710 r5 = r5.a
            p.g710 r5 = (p.g710) r5
            p.ruz r5 = r5.k
            java.lang.String r6 = "switch-to-full-episode"
            com.spotify.player.model.command.SignalCommand r6 = com.spotify.player.model.command.SignalCommand.create(r6)
            p.k9u0 r6 = p.q9u0.i(r6)
            io.reactivex.rxjava3.core.Single r5 = r5.a(r6)
            r0.c = r3
            java.lang.Object r6 = p.fc11.j(r5, r0)
            if (r6 != r4) goto L55
            goto L6e
        L55:
            p.feh r6 = (p.feh) r6
            boolean r5 = r6 instanceof p.beh
            if (r5 == 0) goto L64
            p.beh r6 = (p.beh) r6
            java.lang.String r5 = r6.a
            java.lang.String r6 = "[CAL] AndroidAutoChapterPlaybackController: switch-to-full-episode signal failed: "
            p.v8i0.j(r6, r5)
        L64:
            r0.c = r2
            r5 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r5 = p.hap1.i(r5, r0)
            if (r5 != r4) goto L6f
        L6e:
            return r4
        L6f:
            p.rih1 r5 = p.rih1.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.m64.b(p.onm):java.lang.Object");
    }
}
