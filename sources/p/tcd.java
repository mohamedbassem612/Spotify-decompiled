package p;

import com.spotify.player.model.Context;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import io.reactivex.rxjava3.core.Single;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class tcd {
    public final tgt0 a;
    public final cyp b;
    public final xrc0 c;
    public final idd1 d = new idd1(new ptb(this, (byte) 13));

    public tcd(tgt0 tgt0Var, cyp cypVar, xrc0 xrc0Var) {
        this.a = tgt0Var;
        this.b = cypVar;
        this.c = xrc0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, onm onmVar) {
        qcd qcdVar;
        boolean zBooleanValue;
        if (onmVar instanceof qcd) {
            qcdVar = (qcd) onmVar;
            int i = qcdVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qcdVar.c = i - Integer.MIN_VALUE;
            } else {
                qcdVar = new qcd(this, onmVar);
            }
        } else {
            qcdVar = new qcd(this, onmVar);
        }
        Object objY = qcdVar.a;
        int i2 = qcdVar.c;
        if (i2 == 0) {
            hm5.M(objY);
            qcdVar.c = 1;
            rsc0 rsc0Var = this.c;
            objY = fn31.Y(rsc0Var.c, new asc0(rsc0Var, str2, str, (lnm) null, (byte) 0), qcdVar);
            d9n d9nVar = d9n.a;
            if (objY == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objY);
        }
        oy21 oy21Var = (py21) objY;
        if (oy21Var instanceof oy21) {
            zBooleanValue = ((Boolean) oy21Var.a).booleanValue();
        } else {
            if (!(oy21Var instanceof ly21)) {
                eg.o();
                return null;
            }
            zBooleanValue = false;
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public final Object b(String str, pl7 pl7Var) {
        Set set = s4b1.f;
        String strZ = uic.x(str).z();
        if (strZ == null) {
            return Boolean.FALSE;
        }
        String strN = uic.x(str).n("context");
        if (nzy.c(str)) {
            return c(Context.fromUri(strZ), null, PreparePlayOptions.builder().skipTo(SkipToTrack.builder().trackUri(strZ).build()).build(), pl7Var);
        }
        return nzy.g(str) ? d(strZ, strN, pl7Var) : Boolean.FALSE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(Context context, tv80 tv80Var, PreparePlayOptions preparePlayOptions, onm onmVar) {
        rcd rcdVar;
        ou80 ou80Var;
        if (onmVar instanceof rcd) {
            rcdVar = (rcd) onmVar;
            int i = rcdVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rcdVar.c = i - Integer.MIN_VALUE;
            } else {
                rcdVar = new rcd(this, onmVar);
            }
        } else {
            rcdVar = new rcd(this, onmVar);
        }
        Object objJ = rcdVar.a;
        int i2 = rcdVar.c;
        String str = null;
        if (i2 == 0) {
            hm5.M(objJ);
            muz muzVar = (muz) this.d.getValue();
            PlayCommand.Builder builder = PlayCommand.builder(context, this.a.a);
            LoggingParams.Builder builder2 = LoggingParams.builder();
            if (tv80Var != null && (ou80Var = tv80Var.a) != null) {
                str = ou80Var.a;
            }
            if (str == null) {
                str = "";
            }
            Single singleOnErrorReturn = muzVar.a(builder.loggingParams(builder2.interactionId(str).commandInitiatedTime(0L).build()).options(preparePlayOptions).build()).onErrorReturn(new fza(this, (byte) 1));
            rcdVar.c = 1;
            objJ = fc11.j(singleOnErrorReturn, rcdVar);
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
        return Boolean.valueOf(u890.j(objJ, new ceh()));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006b A[PHI: r7
      0x006b: PHI (r7v1 java.lang.String) = (r7v0 java.lang.String), (r7v0 java.lang.String), (r7v7 java.lang.String) binds: [B:22:0x0049, B:24:0x004f, B:29:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00bb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        if (r9 == r5) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.lang.String r7, java.lang.String r8, p.onm r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p.scd
            if (r0 == 0) goto L13
            r0 = r9
            p.scd r0 = (p.scd) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.scd r0 = new p.scd
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.e
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L39
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            p.hm5.M(r9)
            return r9
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r2
        L31:
            java.lang.String r8 = r0.b
            java.lang.String r7 = r0.a
            p.hm5.M(r9)
            goto L5e
        L39:
            p.hm5.M(r9)
            if (r8 == 0) goto L49
            boolean r9 = p.nzy.a(r8)
            if (r9 == 0) goto L49
            com.spotify.player.model.Context r8 = com.spotify.player.model.Context.fromUri(r8)
            goto L93
        L49:
            if (r8 == 0) goto L6b
            boolean r9 = p.nzy.d(r8)
            if (r9 == 0) goto L6b
            r0.a = r7
            r0.b = r8
            r0.e = r4
            java.lang.Object r9 = r6.a(r7, r8, r0)
            if (r9 != r5) goto L5e
            goto Lba
        L5e:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L6b
            com.spotify.player.model.Context r8 = com.spotify.player.model.Context.fromUri(r8)
            goto L93
        L6b:
            com.spotify.player.model.ContextTrack$Builder r8 = com.spotify.player.model.ContextTrack.builder(r7)
            com.spotify.player.model.ContextTrack r8 = r8.build()
            java.util.List r8 = java.util.Collections.singletonList(r8)
            com.spotify.player.model.ContextPage$Builder r9 = com.spotify.player.model.ContextPage.builder()
            com.spotify.player.model.ContextPage$Builder r8 = r9.tracks(r8)
            com.spotify.player.model.ContextPage r8 = r8.build()
            java.util.List r8 = java.util.Collections.singletonList(r8)
            com.spotify.player.model.Context$Builder r9 = com.spotify.player.model.Context.builder(r7)
            com.spotify.player.model.Context$Builder r8 = r9.pages(r8)
            com.spotify.player.model.Context r8 = r8.build()
        L93:
            r8.getClass()
            com.spotify.player.model.command.options.SkipToTrack$Builder r9 = com.spotify.player.model.command.options.SkipToTrack.builder()
            com.spotify.player.model.command.options.SkipToTrack$Builder r7 = r9.trackUri(r7)
            com.spotify.player.model.command.options.SkipToTrack r7 = r7.build()
            com.spotify.player.model.command.options.PreparePlayOptions$Builder r9 = com.spotify.player.model.command.options.PreparePlayOptions.builder()
            com.spotify.player.model.command.options.PreparePlayOptions$Builder r7 = r9.skipTo(r7)
            com.spotify.player.model.command.options.PreparePlayOptions r7 = r7.build()
            r0.a = r2
            r0.b = r2
            r0.e = r3
            java.lang.Object r6 = r6.c(r8, r2, r7, r0)
            if (r6 != r5) goto Lbb
        Lba:
            return r5
        Lbb:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.tcd.d(java.lang.String, java.lang.String, p.onm):java.lang.Object");
    }
}
