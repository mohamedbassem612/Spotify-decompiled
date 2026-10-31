package p;

import com.spotify.player.esperanto.proto.EsLoggingParams;
import com.spotify.player.esperanto.proto.EsOptional;
import com.spotify.player.esperanto.proto.EsPlayOptions;
import com.spotify.player.esperanto.proto.EsPlayOrigin;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uit0 {
    public final yqg a;
    public final lik1 b;
    public final xrc0 c;
    public final b7r0 d;

    public /* synthetic */ uit0(yqg yqgVar, lik1 lik1Var, xrc0 xrc0Var, b7r0 b7r0Var) {
        this.a = yqgVar;
        this.b = lik1Var;
        this.c = xrc0Var;
        this.d = b7r0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public Object a(zdw zdwVar, onm onmVar) {
        tit0 tit0Var;
        lw00 lw00Var = lw00.a;
        if (onmVar instanceof tit0) {
            tit0Var = (tit0) onmVar;
            int i = tit0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tit0Var.c = i - Integer.MIN_VALUE;
            } else {
                tit0Var = new tit0(this, onmVar);
            }
        } else {
            tit0Var = new tit0(this, onmVar);
        }
        tit0 tit0Var2 = tit0Var;
        Object objB = tit0Var2.a;
        int i2 = tit0Var2.c;
        try {
            if (i2 == 0) {
                hm5.M(objB);
                zpz zpzVarY = EsPlayOrigin.PlayOrigin.y();
                zpzVarY.w(this.b.a);
                zpzVarY.s("listening-activity");
                EsPlayOrigin.PlayOrigin playOriginBuild = zpzVarY.build();
                coz cozVarR = EsLoggingParams.LoggingParams.r();
                cozVarR.n(zdwVar.b);
                y6r0 y6r0Var = this.d.get();
                String str = y6r0Var != null ? y6r0Var.a : null;
                if (str == null) {
                    str = "";
                }
                cozVarR.q(str);
                qpz qpzVarP = EsOptional.OptionalInt64.p();
                qpzVarP.n(this.a.b());
                cozVarR.t(qpzVarP);
                EsLoggingParams.LoggingParams loggingParamsBuild = cozVarR.build();
                trc0 trc0Var = new trc0(PlaylistRequestDecorationPolicy.n(), (g3d0) null, (Set) null, false, (src0) null, hqz0.a, (prc0) null, 0, (List) null, 478);
                xrc0 xrc0Var = this.c;
                String str2 = zdwVar.a;
                playOriginBuild.getClass();
                loggingParamsBuild.getClass();
                tit0Var2.c = 1;
                objB = xrc0.b(xrc0Var, str2, trc0Var, (EsPreparePlayOptions.PreparePlayOptions) null, playOriginBuild, (EsPlayOptions.PlayOptions) null, (Map) null, loggingParamsBuild, (ayc0) null, tit0Var2, 180);
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
            }
            ly21 ly21Var = (py21) objB;
            ly21Var.getClass();
            if (ly21Var instanceof ly21) {
                return new kw00(ly21Var.a.b());
            }
            if (!(ly21Var instanceof oy21)) {
                throw new NoWhenBranchMatchedException();
            }
            return lw00Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            return new kw00(message);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public Object b(ydw ydwVar, onm onmVar) {
        sit0 sit0Var;
        p5i1 p5i1Var = p5i1.a;
        if (onmVar instanceof sit0) {
            sit0Var = (sit0) onmVar;
            int i = sit0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sit0Var.c = i - Integer.MIN_VALUE;
            } else {
                sit0Var = new sit0(this, onmVar);
            }
        } else {
            sit0Var = new sit0(this, onmVar);
        }
        sit0 sit0Var2 = sit0Var;
        Object objB = sit0Var2.a;
        int i2 = sit0Var2.c;
        try {
            if (i2 == 0) {
                hm5.M(objB);
                zpz zpzVarY = EsPlayOrigin.PlayOrigin.y();
                zpzVarY.w(this.b.a);
                zpzVarY.s("listening-activity");
                EsPlayOrigin.PlayOrigin playOriginBuild = zpzVarY.build();
                coz cozVarR = EsLoggingParams.LoggingParams.r();
                cozVarR.n(ydwVar.b);
                y6r0 y6r0Var = this.d.get();
                String str = y6r0Var != null ? y6r0Var.a : null;
                if (str == null) {
                    str = "";
                }
                cozVarR.q(str);
                qpz qpzVarP = EsOptional.OptionalInt64.p();
                qpzVarP.n(this.a.b());
                cozVarR.t(qpzVarP);
                EsLoggingParams.LoggingParams loggingParamsBuild = cozVarR.build();
                trc0 trc0Var = new trc0(PlaylistRequestDecorationPolicy.n(), (g3d0) null, (Set) null, false, (src0) null, hqz0.a, (prc0) null, 0, (List) null, 478);
                xrc0 xrc0Var = this.c;
                String str2 = ydwVar.a;
                playOriginBuild.getClass();
                loggingParamsBuild.getClass();
                sit0Var2.c = 1;
                objB = xrc0.b(xrc0Var, str2, trc0Var, (EsPreparePlayOptions.PreparePlayOptions) null, playOriginBuild, (EsPlayOptions.PlayOptions) null, (Map) null, loggingParamsBuild, (ayc0) null, sit0Var2, 180);
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
            }
            ly21 ly21Var = (py21) objB;
            ly21Var.getClass();
            if (ly21Var instanceof ly21) {
                return new o5i1(ly21Var.a.b());
            }
            if (!(ly21Var instanceof oy21)) {
                throw new NoWhenBranchMatchedException();
            }
            return p5i1Var;
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            return new o5i1(message);
        }
    }
}
