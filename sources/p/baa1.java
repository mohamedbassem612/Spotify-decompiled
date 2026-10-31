package p;

import com.spotify.player.esperanto.proto.EsContextPlayerOptions;
import com.spotify.player.esperanto.proto.EsLoggingParams;
import com.spotify.player.esperanto.proto.EsOptional;
import com.spotify.player.esperanto.proto.EsPlayOptions;
import com.spotify.player.esperanto.proto.EsPlayOrigin;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions;
import com.spotify.player.esperanto.proto.EsSkipToTrack;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import io.reactivex.rxjava3.core.Flowable;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class baa1 implements q8u0 {
    public final yqg a;
    public final ruz b;
    public final b7r0 c;
    public final xrc0 d;
    public final q8n e;
    public final y390 f;
    public final qtt0 g;
    public final iac0 h;
    public final String i;
    public final b9u0 j;
    public final r6h1 k;
    public final xe01 l;
    public final y9a1 m;
    public final y9a1 n;
    public final huz o;

    public baa1(zeu0 zeu0Var, yqg yqgVar, ruz ruzVar, b7r0 b7r0Var, xrc0 xrc0Var, q8n q8nVar, y390 y390Var, qtt0 qtt0Var, iac0 iac0Var, String str, b9u0 b9u0Var, r6h1 r6h1Var) {
        this.a = yqgVar;
        this.b = ruzVar;
        this.c = b7r0Var;
        this.d = xrc0Var;
        this.e = q8nVar;
        this.f = y390Var;
        this.g = qtt0Var;
        this.h = iac0Var;
        this.i = str;
        this.j = b9u0Var;
        this.k = r6h1Var;
        Flowable flowableC = zeu0Var.c();
        vbm[] vbmVarArr = q601.a;
        xe01 xe01VarT = d5p1.t(new kge(flowableC), cto1.q(iac0Var), ey71.b, PlayerState.builder().build());
        this.l = xe01VarT;
        this.m = new y9a1(xe01VarT, this, (byte) 0);
        this.n = new y9a1(xe01VarT, this, (byte) 1);
        this.o = new huz(Boolean.FALSE, (byte) 10);
    }

    public final mr20 a() {
        return this.o;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0092  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (p.fn31.Y(r11.e, r12, r7) == r8) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(p.tv80 r12, p.lnm r13) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.baa1.b(p.tv80, p.lnm):java.lang.Object");
    }

    public final boolean c(PlayerState playerState) {
        String strUri;
        String strContextUri = playerState.contextUri();
        String str = this.i;
        if (!u890.j(strContextUri, str)) {
            return false;
        }
        ContextTrack contextTrack = (ContextTrack) playerState.track().h();
        if (contextTrack == null || (strUri = contextTrack.uri()) == null) {
            strUri = "";
        }
        return strUri.equals(str) && !playerState.isPaused() && playerState.isPlaying();
    }

    public final LoggingParams d(long j, String str) {
        String str2;
        LoggingParams.Builder builder = LoggingParams.builder();
        String str3 = "unknown";
        if (str == null) {
            str = "unknown";
        }
        LoggingParams.Builder builderCommandInitiatedTime = builder.interactionId(str).commandInitiatedTime(Long.valueOf(j));
        y6r0 y6r0Var = this.c.get();
        if (y6r0Var != null && (str2 = y6r0Var.a) != null) {
            str3 = str2;
        }
        return builderCommandInitiatedTime.pageInstanceId(str3).build();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object e(String str, ou80 ou80Var, long j, onm onmVar) {
        v9a1 v9a1Var;
        if (onmVar instanceof v9a1) {
            v9a1Var = (v9a1) onmVar;
            int i = v9a1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                v9a1Var.c = i - Integer.MIN_VALUE;
            } else {
                v9a1Var = new v9a1(this, onmVar);
            }
        } else {
            v9a1Var = new v9a1(this, onmVar);
        }
        v9a1 v9a1Var2 = v9a1Var;
        Object objB = v9a1Var2.a;
        int i2 = v9a1Var2.c;
        if (i2 == 0) {
            hm5.M(objB);
            trc0 trc0Var = new trc0(PlaylistRequestDecorationPolicy.n(), (g3d0) null, (Set) null, false, (src0) null, hqz0.a, (prc0) null, 0, (List) null, 478);
            zpz zpzVarY = EsPlayOrigin.PlayOrigin.y();
            b9u0 b9u0Var = this.j;
            zpzVarY.s(b9u0Var.a);
            zpzVarY.u(b9u0Var.b);
            zpzVarY.w(str + ":dna");
            EsPlayOrigin.PlayOrigin playOriginBuild = zpzVarY.build();
            Map mapSingletonMap = Collections.singletonMap("format_list_type", "track");
            coz cozVarR = EsLoggingParams.LoggingParams.r();
            y6r0 y6r0Var = this.c.get();
            String str2 = y6r0Var != null ? y6r0Var.a : null;
            if (str2 == null) {
                str2 = "";
            }
            cozVarR.q(str2);
            String str3 = ou80Var != null ? ou80Var.a : null;
            cozVarR.n(str3 != null ? str3 : "");
            qpz qpzVarP = EsOptional.OptionalInt64.p();
            qpzVarP.n(j);
            cozVarR.s(qpzVarP.build());
            EsLoggingParams.LoggingParams loggingParamsBuild = cozVarR.build();
            lqz lqzVarS = EsPreparePlayOptions.PreparePlayOptions.s();
            wrz wrzVarP = EsSkipToTrack.SkipToTrack.p();
            wrzVarP.t(str);
            lqzVarS.C(wrzVarP.build());
            imz imzVarO = EsContextPlayerOptions.ContextPlayerOptionOverrides.o();
            imzVarO.q("media", "audio");
            lqzVarS.x(imzVarO.build());
            EsPreparePlayOptions.PreparePlayOptions preparePlayOptionsBuild = lqzVarS.build();
            v9a1Var2.c = 1;
            objB = xrc0.b(this.d, str, trc0Var, preparePlayOptionsBuild, playOriginBuild, (EsPlayOptions.PlayOptions) null, mapSingletonMap, loggingParamsBuild, (ayc0) null, v9a1Var2, 144);
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
        return Boolean.valueOf(((py21) objB).c() != null);
    }

    public final mr20 i() {
        return this.n;
    }

    public final mr20 isActive() {
        return this.m;
    }
}
