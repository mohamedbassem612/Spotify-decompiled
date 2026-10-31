package p;

import com.spotify.player.esperanto.proto.EsContextPlayerOptions;
import com.spotify.player.esperanto.proto.EsLoggingParams;
import com.spotify.player.esperanto.proto.EsOptional;
import com.spotify.player.esperanto.proto.EsOptional$OptionalInt64;
import com.spotify.player.esperanto.proto.EsPlayOrigin$PlayOrigin;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions;
import com.spotify.player.esperanto.proto.EsSkipToTrack;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vmc {
    public final kly0 a;
    public final upp0 b;
    public final b7r0 c;
    public final ov20 d;
    public final yqg e;
    public final n3d0 f;
    public final String g;
    public final bn70 h;
    public final ra81 i;

    public vmc(kly0 kly0Var, upp0 upp0Var, b7r0 b7r0Var, ov20 ov20Var, yqg yqgVar, n3d0 n3d0Var, String str, bn70 bn70Var, ra81 ra81Var) {
        this.a = kly0Var;
        this.b = upp0Var;
        this.c = b7r0Var;
        this.d = ov20Var;
        this.e = yqgVar;
        this.f = n3d0Var;
        this.g = str;
        this.h = bn70Var;
        this.i = ra81Var;
    }

    public static boolean e(enc encVar, boolean z) {
        String strC = encVar.c();
        String strG = encVar.g();
        if (strG == null) {
            strG = "";
        }
        boolean zJ = u890.j(strC, strG);
        String strC2 = encVar.c();
        Set set = s4b1.f;
        return ((!uic.h(strC2, new blc0[]{blc0.ALBUM, blc0.ALBUM_AUTOPLAY, blc0.ALBUM_RADIO}) && !uic.i(strC2, uic.s()) && !uic.g(strC2, blc0.PLAYLIST_RADIO)) || zJ || z) ? false : true;
    }

    public static boolean f(enc encVar, boolean z) {
        String strC = encVar.c();
        String strG = encVar.g();
        if (strG == null) {
            strG = "";
        }
        boolean zJ = u890.j(strC, strG);
        boolean z2 = !zJ;
        if (z) {
            return z2;
        }
        if (z) {
            eg.o();
            return false;
        }
        String strC2 = encVar.c();
        Set set = s4b1.f;
        return encVar.h() || (!zJ && !(uic.h(strC2, new blc0[]{blc0.ALBUM, blc0.ALBUM_AUTOPLAY, blc0.ALBUM_RADIO}) || uic.i(strC2, uic.s()) || uic.g(strC2, blc0.PLAYLIST_RADIO)));
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0092  */
    /* JADX WARN: Code duplicated, block: B:37:0x009a  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c4 A[PHI: r10 r11 r12
      0x01c4: PHI (r10v2 'this' p.vmc) = (r10v0 'this' p.vmc A[IMMUTABLE_TYPE, THIS]), (r10v16 'this' p.vmc) binds: [B:87:0x01c1, B:18:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x01c4: PHI (r11v7 p.enc) = (r11v1 p.enc), (r11v14 p.enc) binds: [B:87:0x01c1, B:18:0x0046] A[DONT_GENERATE, DONT_INLINE]
      0x01c4: PHI (r12v15 java.lang.Object) = (r12v9 java.lang.Object), (r12v1 java.lang.Object) binds: [B:87:0x01c1, B:18:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (r12 == r8) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ce, code lost:
    
        if (r12 == r8) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d6, code lost:
    
        if (r12 == r8) goto L91;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(p.enc r11, p.onm r12) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.vmc.a(p.enc, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object b(enc encVar, boolean z, onm onmVar) {
        smc smcVar;
        String str;
        EsLoggingParams.LoggingParams loggingParamsBuild;
        EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin;
        enc encVar2;
        hqz0 hqz0Var;
        boolean z2;
        ou80 ou80Var;
        if (onmVar instanceof smc) {
            smcVar = (smc) onmVar;
            int i = smcVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                smcVar.h = i - Integer.MIN_VALUE;
            } else {
                smcVar = new smc(this, onmVar);
            }
        } else {
            smcVar = new smc(this, onmVar);
        }
        Object objA = smcVar.f;
        int i2 = smcVar.h;
        String str2 = null;
        if (i2 == 0) {
            hm5.M(objA);
            coz cozVarR = EsLoggingParams.LoggingParams.r();
            tv80 tv80VarD = encVar.d();
            if (tv80VarD != null && (ou80Var = tv80VarD.a) != null) {
                str2 = ou80Var.a;
            }
            if (str2 == null) {
                str2 = "";
            }
            cozVarR.n(str2);
            y6r0 y6r0Var = this.c.get();
            if (y6r0Var == null || (str = y6r0Var.a) == null) {
                str = "";
            }
            cozVarR.q(str);
            qpz qpzVarP = EsOptional$OptionalInt64.p();
            qpzVarP.n(this.e.b());
            cozVarR.s((EsOptional$OptionalInt64) qpzVarP.build());
            loggingParamsBuild = cozVarR.build();
            zpz zpzVarY = EsPlayOrigin$PlayOrigin.y();
            kly0 kly0Var = this.a;
            zpzVarY.s(((PlayOrigin) kly0Var.get()).featureIdentifier());
            zpzVarY.t(((PlayOrigin) kly0Var.get()).featureVersion());
            zpzVarY.w(this.h.b.a);
            zpzVarY.u(((PlayOrigin) kly0Var.get()).referrerIdentifier());
            esPlayOrigin$PlayOrigin = (EsPlayOrigin$PlayOrigin) zpzVarY.build();
            r3d0 r3d0VarA = this.f.a(this.g);
            String strC = encVar.c();
            smcVar.a = encVar;
            smcVar.b = loggingParamsBuild;
            smcVar.c = esPlayOrigin$PlayOrigin;
            hqz0 hqz0Var2 = hqz0.a;
            smcVar.d = hqz0Var2;
            smcVar.e = z;
            smcVar.h = 1;
            objA = r3d0VarA.a(strC, smcVar);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
            encVar2 = encVar;
            hqz0Var = hqz0Var2;
            z2 = z;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = smcVar.e;
            hqz0 hqz0Var3 = smcVar.d;
            esPlayOrigin$PlayOrigin = smcVar.c;
            loggingParamsBuild = smcVar.b;
            encVar2 = smcVar.a;
            hm5.M(objA);
            hqz0Var = hqz0Var3;
        }
        EsLoggingParams.LoggingParams loggingParams = loggingParamsBuild;
        trc0 trc0Var = new trc0(null, (g3d0) objA, null, false, null, hqz0Var, null, 0, null, 477);
        lqz lqzVarS = EsPreparePlayOptions.PreparePlayOptions.s();
        if (f(encVar2, z2)) {
            wrz wrzVarP = EsSkipToTrack.SkipToTrack.p();
            String strG = encVar2.g();
            wrzVarP.t(strG != null ? strG : "");
            lqzVarS.C(wrzVarP.build());
        }
        if (e(encVar2, z2)) {
            imz imzVarO = EsContextPlayerOptions.ContextPlayerOptionOverrides.o();
            ppz ppzVarN = EsOptional.OptionalBoolean.n();
            ppzVarN.n(true);
            imzVarO.t(ppzVarN.build());
            lqzVarS.x(imzVarO.build());
        }
        lqzVarS.s(true);
        return new tsc0(loggingParams, esPlayOrigin$PlayOrigin, lqzVarS.build(), trc0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(enc encVar, onm onmVar) {
        tmc tmcVar;
        ou80 ou80Var;
        ou80 ou80Var2;
        if (onmVar instanceof tmc) {
            tmcVar = (tmc) onmVar;
            int i = tmcVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                tmcVar.e = i - Integer.MIN_VALUE;
            } else {
                tmcVar = new tmc(this, onmVar);
            }
        } else {
            tmcVar = new tmc(this, onmVar);
        }
        Object objD = tmcVar.c;
        int i2 = tmcVar.e;
        String str = null;
        if (i2 == 0) {
            hm5.M(objD);
            String strC = encVar.c();
            this.b.getClass();
            if (upp0.b(strC)) {
                tv80 tv80VarD = encVar.d();
                if (tv80VarD != null && (ou80Var = tv80VarD.a) != null) {
                    str = ou80Var.a;
                }
                return new gsc(str != null ? str : "");
            }
            tmcVar.a = this;
            tmcVar.b = encVar;
            tmcVar.e = 1;
            objD = d(tmcVar);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            encVar = tmcVar.b;
            this = tmcVar.a;
            hm5.M(objD);
        }
        boolean zBooleanValue = ((Boolean) objD).booleanValue();
        this.getClass();
        PlayCommand.Builder builderContext = PlayCommand.Builder.builder().context(Context.fromUri(encVar.c()).toBuilder().metadata(zno1.t(oqn1.n("autoplay_candidate", "false"))).build());
        PreparePlayOptions.Builder builderSuppressions = PreparePlayOptions.Builder.builder().alwaysPlaySomething(true).suppressions(Collections.singleton("mft"));
        if (f(encVar, zBooleanValue)) {
            String strG = encVar.g();
            if (strG == null) {
                strG = "";
            }
            builderSuppressions.skipTo(SkipToTrack.fromUri(strG));
        }
        Long lF = encVar.f();
        if (lF != null) {
            long jLongValue = lF.longValue();
            if (jLongValue > 0) {
                builderSuppressions.seekTo(Long.valueOf(jLongValue));
            }
        }
        builderContext.options(builderSuppressions.build());
        builderContext.playOrigin((PlayOrigin) this.a.get());
        LoggingParams.Builder builderCommandInitiatedTime = LoggingParams.builder().commandInitiatedTime(Long.valueOf(this.e.b()));
        y6r0 y6r0Var = this.c.get();
        String str2 = y6r0Var != null ? y6r0Var.a : null;
        if (str2 == null) {
            str2 = "";
        }
        LoggingParams.Builder builderPageInstanceId = builderCommandInitiatedTime.pageInstanceId(str2);
        tv80 tv80VarD2 = encVar.d();
        if (tv80VarD2 != null && (ou80Var2 = tv80VarD2.a) != null) {
            str = ou80Var2.a;
        }
        builderContext.loggingParams(builderPageInstanceId.interactionId(str != null ? str : "").commandId("on-demand-new-releases-play").build());
        return new xkm(builderContext.build());
    }

    public final Object d(onm onmVar) {
        return b5p1.i(x4p1.h(new nf(this.d.a, (byte) 29), new re1((byte) 11)), onmVar);
    }
}
