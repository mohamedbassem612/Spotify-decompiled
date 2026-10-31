package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class bie extends a8d1 implements vu30 {
    public byte a;
    public final /* synthetic */ uhe b;
    public final /* synthetic */ m64 c;
    public final /* synthetic */ qzn0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bie(uhe uheVar, m64 m64Var, qzn0 qzn0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.b = uheVar;
        this.c = m64Var;
        this.d = qzn0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new bie(this.b, this.c, this.d, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        if (r8.d.f(r9, r0, r8) == r7) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            byte r0 = r8.a
            p.m64 r1 = r8.c
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            p.uhe r6 = r8.b
            p.d9n r7 = p.d9n.a
            if (r0 == 0) goto L26
            if (r0 == r4) goto L22
            if (r0 == r3) goto L1e
            if (r0 != r2) goto L18
            p.hm5.M(r9)
            goto L75
        L18:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return r5
        L1e:
            p.hm5.M(r9)
            goto L5f
        L22:
            p.hm5.M(r9)
            goto L36
        L26:
            p.hm5.M(r9)
            boolean r9 = r6.d
            if (r9 != 0) goto L36
            r8.a = r4
            java.lang.Object r9 = r1.b(r8)
            if (r9 != r7) goto L36
            goto L74
        L36:
            com.spotify.player.model.command.options.LoggingParams$Builder r9 = com.spotify.player.model.command.options.LoggingParams.builder()
            p.tv80 r0 = r6.c
            p.ou80 r0 = r0.a
            java.lang.String r0 = r0.a
            com.spotify.player.model.command.options.LoggingParams$Builder r9 = r9.interactionId(r0)
            p.tv80 r0 = r6.c
            p.y6r0 r0 = r0.b
            if (r0 == 0) goto L4c
            java.lang.String r5 = r0.a
        L4c:
            com.spotify.player.model.command.options.LoggingParams$Builder r9 = r9.pageInstanceId(r5)
            com.spotify.player.model.command.options.LoggingParams r9 = r9.build()
            long r4 = r6.b
            r8.a = r3
            java.lang.Object r9 = r1.a(r4, r9, r8)
            if (r9 != r7) goto L5f
            goto L74
        L5f:
            p.fqn0 r9 = p.fqn0.a
            p.ezn0 r0 = new p.ezn0
            p.tv80 r1 = r6.c
            p.ou80 r1 = r1.a
            r0.<init>(r1)
            r8.a = r2
            p.qzn0 r1 = r8.d
            java.lang.Object r8 = r1.f(r9, r0, r8)
            if (r8 != r7) goto L75
        L74:
            return r7
        L75:
            p.rih1 r8 = p.rih1.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.bie.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
