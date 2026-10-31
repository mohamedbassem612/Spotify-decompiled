package p;

import com.spotify.player.model.PauseResumeOrigin;
import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.ResumeCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qkm {
    public final yqg a;
    public final mr20 b;
    public final b7r0 c;
    public final w9u0 d;
    public final bmm e;

    public qkm(yqg yqgVar, mr20 mr20Var, b7r0 b7r0Var, String str, w9u0 w9u0Var) {
        this.a = yqgVar;
        this.b = mr20Var;
        this.c = b7r0Var;
        this.d = w9u0Var;
        this.e = new bmm(str);
    }

    public final LoggingParams a(String str) {
        LoggingParams.Builder builderCommandInitiatedTime = LoggingParams.builder().interactionId(str).commandInitiatedTime(Long.valueOf(this.a.b()));
        y6r0 y6r0Var = this.c.get();
        String str2 = y6r0Var != null ? y6r0Var.a : null;
        if (str2 == null) {
            str2 = "";
        }
        return builderCommandInitiatedTime.pageInstanceId(str2).build();
    }

    public final LoggingParams b(tv80 tv80Var) {
        String str;
        LoggingParams.Builder builderCommandInitiatedTime = LoggingParams.builder().interactionId(tv80Var.a.a).commandInitiatedTime(Long.valueOf(this.a.b()));
        y6r0 y6r0Var = tv80Var.b;
        if (y6r0Var == null || (str = y6r0Var.a) == null) {
            y6r0 y6r0Var2 = this.c.get();
            str = y6r0Var2 != null ? y6r0Var2.a : null;
            if (str == null) {
                str = "";
            }
        }
        return builderCommandInitiatedTime.pageInstanceId(str).build();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(LoggingParams loggingParams, onm onmVar) {
        lkm lkmVar;
        if (onmVar instanceof lkm) {
            lkmVar = (lkm) onmVar;
            int i = lkmVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lkmVar.c = i - Integer.MIN_VALUE;
            } else {
                lkmVar = new lkm(this, onmVar);
            }
        } else {
            lkmVar = new lkm(this, onmVar);
        }
        Object objJ = lkmVar.a;
        int i2 = lkmVar.c;
        if (i2 == 0) {
            hm5.M(objJ);
            Single map = this.d.a(new e9u0(PauseCommand.builder().loggingParams(loggingParams).options(CommandOptions.builder().systemInitiated(false).build()).pauseOrigin(PauseResumeOrigin.builder("listux-contextplayerhandlerimpl").build()).build())).map(rbc.U0);
            lkmVar.c = 1;
            objJ = fc11.j(map, lkmVar);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        return objJ;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(LoggingParams loggingParams, onm onmVar) {
        mkm mkmVar;
        if (onmVar instanceof mkm) {
            mkmVar = (mkm) onmVar;
            int i = mkmVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mkmVar.c = i - Integer.MIN_VALUE;
            } else {
                mkmVar = new mkm(this, onmVar);
            }
        } else {
            mkmVar = new mkm(this, onmVar);
        }
        Object objJ = mkmVar.a;
        int i2 = mkmVar.c;
        if (i2 == 0) {
            hm5.M(objJ);
            Single map = this.d.a(new h9u0(ResumeCommand.builder().loggingParams(loggingParams).options(CommandOptions.builder().systemInitiated(false).build()).resumeOrigin(PauseResumeOrigin.builder("listux-contextplayerhandlerimpl").build()).build())).map(uwg.W0);
            mkmVar.c = 1;
            objJ = fc11.j(map, mkmVar);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        return objJ;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a9, code lost:
    
        if (r9 == r5) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(java.lang.String r7, com.spotify.player.model.command.options.LoggingParams r8, p.onm r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p.nkm
            if (r0 == 0) goto L13
            r0 = r9
            p.nkm r0 = (p.nkm) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.nkm r0 = new p.nkm
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2c
            p.hm5.M(r9)
            goto Lac
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L32:
            com.spotify.player.model.command.options.LoggingParams r8 = r0.b
            java.lang.String r7 = r0.a
            p.hm5.M(r9)
            goto L4c
        L3a:
            p.hm5.M(r9)
            r0.a = r7
            r0.b = r8
            r0.e = r3
            p.mr20 r9 = r6.b
            java.lang.Object r9 = p.b5p1.i(r9, r0)
            if (r9 != r5) goto L4c
            goto Lab
        L4c:
            com.spotify.player.model.PlayerState r9 = (com.spotify.player.model.PlayerState) r9
            p.bmm r1 = r6.e
            p.p0d0 r1 = p.rjo1.p(r9, r1)
            p.cob1 r1 = r1.a
            boolean r1 = r1.b()
            if (r1 == 0) goto Lae
            p.spq0 r1 = r9.track()
            boolean r1 = r1.c()
            if (r1 == 0) goto Lae
            com.spotify.player.model.Restrictions r1 = r9.restrictions()
            p.t380 r1 = r1.disallowSkippingNextReasons()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto Lae
            p.spq0 r9 = r9.track()
            java.lang.Object r9 = r9.b()
            com.spotify.player.model.ContextTrack r9 = (com.spotify.player.model.ContextTrack) r9
            java.lang.String r9 = r9.uri()
            boolean r7 = p.u890.j(r9, r7)
            if (r7 == 0) goto Lae
            com.spotify.player.model.command.SkipToNextTrackCommand$Builder r7 = com.spotify.player.model.command.SkipToNextTrackCommand.builder()
            com.spotify.player.model.command.SkipToNextTrackCommand$Builder r7 = r7.loggingParams(r8)
            com.spotify.player.model.command.SkipToNextTrackCommand r7 = r7.build()
            p.m9u0 r8 = new p.m9u0
            r8.<init>(r7)
            p.w9u0 r6 = r6.d
            io.reactivex.rxjava3.core.Single r6 = r6.a(r8)
            r0.a = r4
            r0.b = r4
            r0.e = r2
            java.lang.Object r9 = p.fc11.j(r6, r0)
            if (r9 != r5) goto Lac
        Lab:
            return r5
        Lac:
            p.feh r9 = (p.feh) r9
        Lae:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.qkm.e(java.lang.String, com.spotify.player.model.command.options.LoggingParams, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        if (r10 == r6) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0098, code lost:
    
        if (r10 == r6) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(com.spotify.player.model.command.options.LoggingParams r9, p.onm r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof p.pkm
            if (r0 == 0) goto L13
            r0 = r10
            p.pkm r0 = (p.pkm) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.pkm r0 = new p.pkm
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.c
            int r1 = r0.e
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L42
            if (r1 == r4) goto L3c
            if (r1 == r3) goto L36
            if (r1 != r2) goto L30
            p.qkm r8 = r0.b
            p.hm5.M(r10)
            goto L9b
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return r5
        L36:
            p.qkm r8 = r0.b
            p.hm5.M(r10)
            goto L79
        L3c:
            com.spotify.player.model.command.options.LoggingParams r9 = r0.a
            p.hm5.M(r10)
            goto L62
        L42:
            p.hm5.M(r10)
            p.hff r10 = new p.hff
            r1 = 23
            p.mr20 r7 = r8.b
            r10.<init>(r7, r5, r8, r1)
            p.m441 r1 = new p.m441
            r1.<init>(r10)
            p.mr20 r10 = p.rqt0.u(r1)
            r0.a = r9
            r0.e = r4
            java.lang.Object r10 = p.b5p1.i(r10, r0)
            if (r10 != r6) goto L62
            goto L9a
        L62:
            p.p0d0 r10 = (p.p0d0) r10
            p.cob1 r1 = r10.a
            boolean r1 = r1.b()
            if (r1 == 0) goto L88
            r0.a = r5
            r0.b = r8
            r0.e = r3
            java.lang.Object r10 = r8.c(r9, r0)
            if (r10 != r6) goto L79
            goto L9a
        L79:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r9 = r10.booleanValue()
            r8.getClass()
            if (r9 == 0) goto L87
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        L87:
            return r5
        L88:
            p.cob1 r10 = r10.a
            p.cob1 r1 = p.cob1.b
            if (r10 != r1) goto La9
            r0.a = r5
            r0.b = r8
            r0.e = r2
            java.lang.Object r10 = r8.d(r9, r0)
            if (r10 != r6) goto L9b
        L9a:
            return r6
        L9b:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r9 = r10.booleanValue()
            r8.getClass()
            if (r9 == 0) goto La9
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            return r8
        La9:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.qkm.f(com.spotify.player.model.command.options.LoggingParams, p.onm):java.lang.Object");
    }
}
