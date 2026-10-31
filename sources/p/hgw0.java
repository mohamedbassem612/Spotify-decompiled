package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hgw0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ghw0 a;

    public hgw0(ghw0 ghw0Var) {
        this.a = ghw0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a1, code lost:
    
        if (r8.b(r6, r0) == r5) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r7, p.r261 r8, p.onm r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p.ggw0
            if (r0 == 0) goto L13
            r0 = r9
            p.ggw0 r0 = (p.ggw0) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.ggw0 r0 = new p.ggw0
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            int r1 = r0.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L38
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2c
            p.hm5.M(r9)
            goto La4
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L32:
            p.r261 r8 = r0.d
            p.hm5.M(r9)
            goto L86
        L38:
            p.hm5.M(r9)
            p.zfw0 r7 = (p.zfw0) r7
            p.tv80 r7 = r7.c
            r0.d = r8
            r0.b = r3
            p.ghw0 r6 = r6.a
            p.ruz r9 = r6.c
            com.spotify.player.model.command.PauseCommand$Builder r1 = com.spotify.player.model.command.PauseCommand.builder()
            com.spotify.player.model.command.options.LoggingParams r7 = r6.d(r7)
            com.spotify.player.model.command.PauseCommand$Builder r7 = r1.loggingParams(r7)
            com.spotify.player.model.command.options.CommandOptions$Builder r1 = com.spotify.player.model.command.options.CommandOptions.builder()
            r3 = 0
            com.spotify.player.model.command.options.CommandOptions$Builder r1 = r1.systemInitiated(r3)
            com.spotify.player.model.command.options.CommandOptions r1 = r1.build()
            com.spotify.player.model.command.PauseCommand$Builder r7 = r7.options(r1)
            java.lang.String r1 = "PreviewElementPlayerImpl"
            com.spotify.player.model.PauseResumeOrigin$Builder r1 = com.spotify.player.model.PauseResumeOrigin.builder(r1)
            com.spotify.player.model.PauseResumeOrigin r1 = r1.build()
            com.spotify.player.model.command.PauseCommand$Builder r7 = r7.pauseOrigin(r1)
            com.spotify.player.model.command.PauseCommand r7 = r7.build()
            p.e9u0 r1 = new p.e9u0
            r1.<init>(r7)
            io.reactivex.rxjava3.core.Single r7 = r9.a(r1)
            java.lang.Object r9 = r6.a(r7, r0)
            if (r9 != r5) goto L86
            goto La3
        L86:
            p.bhw0 r9 = (p.bhw0) r9
            p.ahw0 r6 = p.ahw0.a
            boolean r6 = p.u890.j(r9, r6)
            if (r6 == 0) goto L93
            p.vgw0 r6 = p.vgw0.a
            goto L99
        L93:
            boolean r6 = r9 instanceof p.zgw0
            if (r6 == 0) goto La7
            p.ugw0 r6 = p.ugw0.a
        L99:
            r0.d = r4
            r0.b = r2
            java.lang.Object r6 = r8.b(r6, r0)
            if (r6 != r5) goto La4
        La3:
            return r5
        La4:
            p.rih1 r6 = p.rih1.a
            return r6
        La7:
            p.eg.o()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.hgw0.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
