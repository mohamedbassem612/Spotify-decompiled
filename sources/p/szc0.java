package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.player.esperanto.proto.EsContextPlayerOptions;
import com.spotify.player.esperanto.proto.EsLoggingParams;
import com.spotify.player.esperanto.proto.EsOptional;
import com.spotify.player.esperanto.proto.EsOptional$OptionalInt64;
import com.spotify.player.esperanto.proto.EsPlayOrigin$PlayOrigin;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions;
import com.spotify.player.esperanto.proto.EsSkipToTrack;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class szc0 {
    public static final long f;
    public static final long g;
    public static final /* synthetic */ int h = 0;
    public final xrc0 a;
    public final iyc0 b;
    public final y610 c;
    public final g510 d;
    public final g0l e;

    static {
        ytw0 ytw0Var = jfv.b;
        ngv ngvVar = ngv.SECONDS;
        f = fdg1.k0(4, ngvVar);
        g = fdg1.k0(3, ngvVar);
    }

    public szc0(xrc0 xrc0Var, iyc0 iyc0Var, y610 y610Var, g510 g510Var, g0l g0lVar) {
        this.a = xrc0Var;
        this.b = iyc0Var;
        this.c = y610Var;
        this.d = g510Var;
        this.e = g0lVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(x610 x610Var, String str, onm onmVar) {
        pzc0 pzc0Var;
        if (onmVar instanceof pzc0) {
            pzc0Var = (pzc0) onmVar;
            int i = pzc0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pzc0Var.c = i - Integer.MIN_VALUE;
            } else {
                pzc0Var = new pzc0(this, onmVar);
            }
        } else {
            pzc0Var = new pzc0(this, onmVar);
        }
        Object objP = pzc0Var.a;
        int i2 = pzc0Var.c;
        long j = f;
        rih1 rih1Var = rih1.a;
        if (i2 == 0) {
            hm5.M(objP);
            l0l l0lVarC = this.e.c();
            if (l0lVarC != null && !l0lVarC.l() && l0lVarC.getType() == f0u.N0) {
                x610Var.b().b(str);
                no70 no70Var = new no70(this, (lnm) null, (byte) 27);
                pzc0Var.c = 1;
                objP = rc2.P(j, no70Var, pzc0Var);
                d9n d9nVar = d9n.a;
                if (objP == d9nVar) {
                    return d9nVar;
                }
            }
            return rih1Var;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objP);
        if (((spq0) objP) == null) {
            Logger.k("Active entity did not settle to self within %s before listEndpoint.play; continuing anyway", new Object[]{new jfv(j)});
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, Boolean bool, onm onmVar) {
        qzc0 qzc0Var;
        String str2;
        Boolean bool2;
        if (onmVar instanceof qzc0) {
            qzc0Var = (qzc0) onmVar;
            int i = qzc0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                qzc0Var.e = i - Integer.MIN_VALUE;
            } else {
                qzc0Var = new qzc0(this, onmVar);
            }
        } else {
            qzc0Var = new qzc0(this, onmVar);
        }
        Object objP = qzc0Var.c;
        int i2 = qzc0Var.e;
        long j = g;
        rih1 rih1Var = rih1.a;
        if (i2 == 0) {
            hm5.M(objP);
            if (bool != null) {
                n0a0 n0a0Var = new n0a0(this, str, bool, (lnm) null, (byte) 17);
                qzc0Var.a = str;
                qzc0Var.b = bool;
                qzc0Var.e = 1;
                objP = rc2.P(j, n0a0Var, qzc0Var);
                d9n d9nVar = d9n.a;
                if (objP == d9nVar) {
                    return d9nVar;
                }
                str2 = str;
                bool2 = bool;
            }
            return rih1Var;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        bool2 = qzc0Var.b;
        str2 = qzc0Var.a;
        hm5.M(objP);
        py21 py21Var = (py21) objP;
        if (py21Var == null) {
            Logger.k("setLens(enhance, %s) timed out within %s for %s; continuing without lens update", new Object[]{bool2, new jfv(j), str2});
            return rih1Var;
        }
        if (py21Var instanceof ly21) {
            Logger.k("setLens(enhance, %s) failed for %s: %s", new Object[]{bool2, str2, ((ly21) py21Var).a});
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(sst0 sst0Var, trc0 trc0Var, onm onmVar) {
        rzc0 rzc0Var;
        if (onmVar instanceof rzc0) {
            rzc0Var = (rzc0) onmVar;
            int i = rzc0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rzc0Var.c = i - Integer.MIN_VALUE;
            } else {
                rzc0Var = new rzc0(this, onmVar);
            }
        } else {
            rzc0Var = new rzc0(this, onmVar);
        }
        Object objO = rzc0Var.a;
        int i2 = rzc0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objO);
                lqz lqzVarS = EsPreparePlayOptions.PreparePlayOptions.s();
                if (sst0Var.f() != null || sst0Var.i() != null) {
                    imz imzVarO = EsContextPlayerOptions.ContextPlayerOptionOverrides.o();
                    Boolean boolF = sst0Var.f();
                    if (boolF != null) {
                        boolean zBooleanValue = boolF.booleanValue();
                        ppz ppzVarN = EsOptional.OptionalBoolean.n();
                        ppzVarN.n(zBooleanValue);
                        imzVarO.u(ppzVarN);
                    }
                    if (sst0Var.i() != null) {
                        String str = u890.j(sst0Var.i(), Boolean.TRUE) ? "RECOMMENDATION" : "NONE";
                        imzVarO.q("context_enhancement", str);
                        imzVarO.q("original_enhancement_mode", str);
                    }
                    lqzVarS.x(imzVarO.build());
                }
                if (sst0Var.g() != null) {
                    wrz wrzVarP = EsSkipToTrack.SkipToTrack.p();
                    wrzVarP.s(sst0Var.g());
                    String strH = sst0Var.h();
                    if (strH != null) {
                        wrzVarP.t(strH);
                    }
                    lqzVarS.D(wrzVarP);
                } else if (sst0Var.h() != null) {
                    wrz wrzVarP2 = EsSkipToTrack.SkipToTrack.p();
                    wrzVarP2.t(sst0Var.h());
                    lqzVarS.D(wrzVarP2);
                }
                Long lE = sst0Var.e();
                if (lE != null) {
                    long jLongValue = lE.longValue();
                    qpz qpzVarP = EsOptional$OptionalInt64.p();
                    qpzVarP.n(jLongValue);
                    lqzVarS.z((EsOptional$OptionalInt64) qpzVarP.build());
                }
                EsPreparePlayOptions.PreparePlayOptions preparePlayOptionsBuild = lqzVarS.build();
                zpz zpzVarY = EsPlayOrigin$PlayOrigin.y();
                zpzVarY.s("wearos");
                String strD = sst0Var.d();
                if (strD != null) {
                    zpzVarY.u(strD);
                }
                EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin = (EsPlayOrigin$PlayOrigin) zpzVarY.build();
                coz cozVarR = EsLoggingParams.LoggingParams.r();
                String strB = sst0Var.b();
                if (strB != null) {
                    cozVarR.n(strB);
                }
                String strC = sst0Var.c();
                if (strC != null) {
                    cozVarR.q(strC);
                }
                EsLoggingParams.LoggingParams loggingParamsBuild = cozVarR.build();
                y610 y610Var = this.c;
                fnc0 fnc0Var = fnc0.S0;
                vr0 vr0Var = new vr0(this, sst0Var, trc0Var, preparePlayOptionsBuild, esPlayOrigin$PlayOrigin, loggingParamsBuild, (lnm) null);
                rzc0Var.c = 1;
                objO = cwl1.o(y610Var, fnc0Var, (Long) null, vr0Var, rzc0Var);
                d9n d9nVar = d9n.a;
                if (objO == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objO);
            }
            return (kzq) objO;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Logger.e(th, "listEndpoint.play failed; returning error DataLayerResponse", new Object[0]);
            jzq jzqVar = kzq.Companion;
            String message = th.getMessage();
            if (message == null) {
                message = "listEndpoint.play failed";
            }
            jzqVar.getClass();
            return jzq.a(message);
        }
    }
}
