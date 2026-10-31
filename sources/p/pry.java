package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.player.esperanto.proto.EsContextPlayerOptions;
import com.spotify.player.esperanto.proto.EsLoggingParams;
import com.spotify.player.esperanto.proto.EsOptional;
import com.spotify.player.esperanto.proto.EsPlayOptions;
import com.spotify.player.esperanto.proto.EsPlayOrigin;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions;
import com.spotify.player.esperanto.proto.EsSkipToTrack;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PauseResumeOrigin;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.ResumeCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pry {
    public final String a;
    public final vu30 b;
    public final asy c;
    public final uvy d;
    public final boolean e;
    public final yqg f;
    public final xrc0 g;
    public final Flowable h;
    public final uu00 i;
    public final vbs j;
    public final e7p0 k;
    public final ruz l;
    public final String m;

    public pry(String str, x8c0 x8c0Var, vu30 vu30Var, asy asyVar, uvy uvyVar, boolean z, yqg yqgVar, xrc0 xrc0Var, t8u0 t8u0Var, Flowable flowable, uu00 uu00Var, vbs vbsVar, e7p0 e7p0Var, b7r0 b7r0Var) {
        this.a = str;
        this.b = vu30Var;
        this.c = asyVar;
        this.d = uvyVar;
        this.e = z;
        this.f = yqgVar;
        this.g = xrc0Var;
        this.h = flowable;
        this.i = uu00Var;
        this.j = vbsVar;
        this.k = e7p0Var;
        this.l = t8u0Var.a(x8c0Var).a();
        y6r0 y6r0Var = b7r0Var.get();
        this.m = y6r0Var != null ? y6r0Var.a : null;
    }

    public static boolean a(PlayerState playerState, String str) {
        ContextTrack contextTrack = (ContextTrack) playerState.track().h();
        return contextTrack != null && u890.j(contextTrack.uri(), str);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, onm onmVar, tv80 tv80Var, boolean z) {
        kry kryVar;
        ou80 ou80Var;
        String str2;
        boolean z2;
        jo70 jo70Var;
        io70 io70Var;
        if (onmVar instanceof kry) {
            kryVar = (kry) onmVar;
            int i = kryVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                kryVar.g = i - Integer.MIN_VALUE;
            } else {
                kryVar = new kry(this, onmVar);
            }
        } else {
            kryVar = new kry(this, onmVar);
        }
        Object objA = kryVar.e;
        int i2 = kryVar.g;
        rih1 rih1Var = rih1.a;
        String str3 = this.a;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objA);
            kryVar.a = str;
            kryVar.b = tv80Var;
            kryVar.d = z;
            kryVar.g = 1;
            objA = this.c.a(str3, tv80Var, kryVar);
            if (objA != obj) {
            }
        }
        if (i2 == 1) {
            z = kryVar.d;
            tv80Var = kryVar.b;
            str = kryVar.a;
            hm5.M(objA);
        } else {
            if (i2 == 2) {
                hm5.M(objA);
                return rih1Var;
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    hm5.M(objA);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = kryVar.d;
            ou80Var = kryVar.c;
            str2 = kryVar.a;
            hm5.M(objA);
        }
        jo70Var = (jo70) objA;
        if (jo70Var == null) {
            str3 = null;
        } else {
            io70Var = jo70Var.e;
            if (io70Var != null) {
                str3 = io70Var.b;
            } else {
                Set set = s4b1.f;
                if (!uic.g(str3, blc0.ti)) {
                    str3 = null;
                }
            }
        }
        kryVar.a = null;
        kryVar.b = null;
        kryVar.c = null;
        kryVar.d = z2;
        kryVar.g = 4;
        return c(str2, str3, ou80Var, kryVar) == obj ? obj : rih1Var;
        if (!((Boolean) objA).booleanValue()) {
            ou80Var = tv80Var != null ? tv80Var.a : null;
            if (z) {
                kryVar.a = null;
                kryVar.b = null;
                kryVar.c = null;
                kryVar.d = z;
                kryVar.g = 2;
                if (f(ou80Var, kryVar) == obj) {
                }
            } else {
                kryVar.a = str;
                kryVar.b = null;
                kryVar.c = ou80Var;
                kryVar.d = z;
                kryVar.g = 3;
                objA = mue1.A(this.i, str3, kryVar);
                if (objA != obj) {
                    boolean z3 = z;
                    str2 = str;
                    z2 = z3;
                    jo70Var = (jo70) objA;
                    if (jo70Var == null) {
                        str3 = null;
                    } else {
                        io70Var = jo70Var.e;
                        if (io70Var != null) {
                            str3 = io70Var.b;
                        } else {
                            Set set2 = s4b1.f;
                            if (!uic.g(str3, blc0.ti)) {
                                str3 = null;
                            }
                        }
                    }
                    kryVar.a = null;
                    kryVar.b = null;
                    kryVar.c = null;
                    kryVar.d = z2;
                    kryVar.g = 4;
                    if (c(str2, str3, ou80Var, kryVar) == obj) {
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0058 A[PHI: r1 r2 r3 r4 r6
      0x0058: PHI (r1v14 p.gi40) = (r1v9 p.gi40), (r1v20 p.gi40) binds: [B:37:0x00e0, B:16:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x0058: PHI (r2v11 p.ou80) = (r2v7 p.ou80), (r2v20 p.ou80) binds: [B:37:0x00e0, B:16:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x0058: PHI (r3v14 java.lang.String) = (r3v9 java.lang.String), (r3v19 java.lang.String) binds: [B:37:0x00e0, B:16:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x0058: PHI (r4v18 java.lang.Object) = (r4v15 java.lang.Object), (r4v1 java.lang.Object) binds: [B:37:0x00e0, B:16:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x0058: PHI (r6v8 java.lang.String) = (r6v5 java.lang.String), (r6v10 java.lang.String) binds: [B:37:0x00e0, B:16:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:58:0x0130  */
    /* JADX WARN: Code duplicated, block: B:61:0x0145  */
    /* JADX WARN: Code duplicated, block: B:64:0x0150  */
    /* JADX WARN: Code duplicated, block: B:69:0x0171  */
    /* JADX WARN: Code duplicated, block: B:72:0x017a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0199 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c6, code lost:
    
        if (r4 == r12) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r17, java.lang.String r18, p.ou80 r19, p.onm r20) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.pry.c(java.lang.String, java.lang.String, p.ou80, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object d(String str, String str2, gi40 gi40Var, ou80 ou80Var, onm onmVar) {
        mry mryVar;
        String str3;
        boolean z;
        String str4;
        boolean z2;
        if (onmVar instanceof mry) {
            mryVar = (mry) onmVar;
            int i = mryVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mryVar.c = i - Integer.MIN_VALUE;
            } else {
                mryVar = new mry(this, onmVar);
            }
        } else {
            mryVar = new mry(this, onmVar);
        }
        mry mryVar2 = mryVar;
        Object objB = mryVar2.a;
        int i2 = mryVar2.c;
        if (i2 == 0) {
            hm5.M(objB);
            long jB = this.f.b();
            lqz lqzVarS = EsPreparePlayOptions.PreparePlayOptions.s();
            boolean z3 = gi40Var instanceof ei40;
            String str5 = this.a;
            if (z3) {
                if (str == null) {
                    Logger.d("Could not initiate the playback, context uri is null", new Object[0]);
                    return Boolean.FALSE;
                }
                wrz wrzVarP = EsSkipToTrack.SkipToTrack.p();
                wrzVarP.t(str5);
                lqzVarS.C(wrzVarP.build());
                ei40 ei40Var = (ei40) gi40Var;
                long j = ei40Var.a;
                if (ei40Var.b) {
                    lqzVarS.A(String.valueOf(j));
                } else {
                    qpz qpzVarP = EsOptional.OptionalInt64.p();
                    qpzVarP.n(j);
                    lqzVarS.z(qpzVarP.build());
                }
                str3 = str;
            } else {
                if (!(gi40Var instanceof fi40)) {
                    eg.o();
                    return null;
                }
                str3 = str2;
            }
            if (this.j.e) {
                Set set = s4b1.f;
                z = !uic.h(str5, blc0.ti, blc0.ui);
            } else {
                z = true;
            }
            if (z) {
                lqzVarS.q();
                imz imzVarO = EsContextPlayerOptions.ContextPlayerOptionOverrides.o();
                ppz ppzVarN = EsOptional.OptionalBoolean.n();
                ppzVarN.n(false);
                imzVarO.t((EsOptional.OptionalBoolean) ppzVarN.build());
                ppz ppzVarN2 = EsOptional.OptionalBoolean.n();
                ppzVarN2.n(false);
                imzVarO.r((EsOptional.OptionalBoolean) ppzVarN2.build());
                ppz ppzVarN3 = EsOptional.OptionalBoolean.n();
                ppzVarN3.n(false);
                imzVarO.s((EsOptional.OptionalBoolean) ppzVarN3.build());
                lqzVarS.x(imzVarO.build());
            }
            lqzVarS.E(false);
            zpz zpzVarY = EsPlayOrigin.PlayOrigin.y();
            zpzVarY.s("entity-segments-playback");
            zpzVarY.w(str2);
            EsPlayOrigin.PlayOrigin playOriginBuild = zpzVarY.build();
            coz cozVarR = EsLoggingParams.LoggingParams.r();
            cozVarR.q(this.m);
            if (ou80Var == null || (str4 = ou80Var.a) == null) {
                str4 = "";
            }
            cozVarR.n(str4);
            qpz qpzVarP2 = EsOptional.OptionalInt64.p();
            qpzVarP2.n(jB);
            cozVarR.s(qpzVarP2.build());
            EsLoggingParams.LoggingParams loggingParamsBuild = cozVarR.build();
            EsPreparePlayOptions.PreparePlayOptions preparePlayOptionsBuild = lqzVarS.build();
            mryVar2.c = 1;
            String str6 = str3;
            z2 = false;
            objB = xrc0.b(this.g, str6, (trc0) null, preparePlayOptionsBuild, playOriginBuild, (EsPlayOptions.PlayOptions) null, (Map) null, loggingParamsBuild, (ayc0) null, mryVar2, 178);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objB);
            z2 = false;
        }
        return Boolean.valueOf(((py21) objB).c() != null ? true : z2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
    
        if (r13 == r7) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0092, code lost:
    
        if (r13 == r7) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fc, code lost:
    
        if (r13 == r7) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(long r9, p.ou80 r11, boolean r12, p.onm r13) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.pry.e(long, p.ou80, boolean, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0115 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(ou80 ou80Var, onm onmVar) {
        ory oryVar;
        String str;
        String str2;
        if (onmVar instanceof ory) {
            oryVar = (ory) onmVar;
            int i = oryVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                oryVar.d = i - Integer.MIN_VALUE;
            } else {
                oryVar = new ory(this, onmVar);
            }
        } else {
            oryVar = new ory(this, onmVar);
        }
        Object objM = oryVar.b;
        int i2 = oryVar.d;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objM);
            oryVar.a = ou80Var;
            oryVar.d = 1;
            objM = u890.m(this.h, 1, oryVar);
            if (objM != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objM);
                return rih1Var;
            }
            if (i2 == 3) {
                hm5.M(objM);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ou80Var = oryVar.a;
        hm5.M(objM);
        PlayerState playerState = (PlayerState) objM;
        if (a(playerState, this.a)) {
            boolean zIsPaused = playerState.isPaused();
            String str3 = this.m;
            ruz ruzVar = this.l;
            if (zIsPaused) {
                ResumeCommand.Builder builder = ResumeCommand.builder();
                LoggingParams.Builder builder2 = LoggingParams.builder();
                if (ou80Var == null || (str2 = ou80Var.a) == null) {
                    str2 = "";
                }
                builder2.interactionId(str2);
                if (str3 == null) {
                    str3 = "";
                }
                Single singleA = ruzVar.a(new h9u0(builder.loggingParams(builder2.pageInstanceId(str3).build()).options(CommandOptions.builder().systemInitiated(false).build()).resumeOrigin(PauseResumeOrigin.builder("entity-segments-playback").build()).build()));
                oryVar.a = null;
                oryVar.d = 2;
                if (fc11.j(singleA, oryVar) == d9nVar) {
                    return d9nVar;
                }
            } else {
                PauseCommand.Builder builder3 = PauseCommand.builder();
                LoggingParams.Builder builder4 = LoggingParams.builder();
                if (ou80Var == null || (str = ou80Var.a) == null) {
                    str = "";
                }
                builder4.interactionId(str);
                if (str3 == null) {
                    str3 = "";
                }
                Single singleA2 = ruzVar.a(new e9u0(builder3.loggingParams(builder4.pageInstanceId(str3).build()).options(CommandOptions.builder().systemInitiated(false).build()).pauseOrigin(PauseResumeOrigin.builder("entity-segments-playback").build()).build()));
                oryVar.a = null;
                oryVar.d = 3;
                if (fc11.j(singleA2, oryVar) == d9nVar) {
                    return d9nVar;
                }
            }
        }
        return rih1Var;
    }
}
