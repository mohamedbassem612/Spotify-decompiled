package p;

import com.spotify.player.model.Context;
import com.spotify.player.model.PauseResumeOrigin;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.Suppressions;
import com.spotify.player.model.Suppressions$Providers;
import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.ResumeCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wab1 implements ylt0 {
    public static final PreparePlayOptions g;
    public final yqg a;
    public final wdm b;
    public final lag c;
    public final b7r0 d;
    public final muz e;
    public final ruz f;

    static {
        PreparePlayOptions.Builder builderSuppressions = PreparePlayOptions.builder().suppressions(Suppressions.create(Collections.singleton(Suppressions$Providers.MFT)));
        PlayerOptionOverrides.Builder builder = PlayerOptionOverrides.builder();
        Boolean bool = Boolean.FALSE;
        g = builderSuppressions.playerOptionsOverride(builder.shufflingContext(bool).repeatingContext(bool).repeatingTrack(bool).build()).build();
    }

    public wab1(yqg yqgVar, wdm wdmVar, lag lagVar, b7r0 b7r0Var, muz muzVar, ruz ruzVar) {
        this.a = yqgVar;
        this.b = wdmVar;
        this.c = lagVar;
        this.d = b7r0Var;
        this.e = muzVar;
        this.f = ruzVar;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00ea A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x00eb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    @Override // p.ylt0
    public final Object a(slt0 slt0Var, ast0 ast0Var, r840 r840Var, y4m y4mVar, tv80 tv80Var, ijk0 ijk0Var, boolean z, onm onmVar) {
        uab1 uab1Var;
        String str;
        String str2;
        tv80 tv80Var2;
        boolean z2;
        ast0 ast0Var2 = ast0Var;
        if (onmVar instanceof uab1) {
            uab1Var = (uab1) onmVar;
            int i = uab1Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                uab1Var.g = i - Integer.MIN_VALUE;
            } else {
                uab1Var = new uab1(this, onmVar);
            }
        } else {
            uab1Var = new uab1(this, onmVar);
        }
        Object objO = uab1Var.e;
        int i2 = uab1Var.g;
        rih1 rih1Var = rih1.a;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objO);
            if (slt0Var instanceof qlt0) {
                str = ((qlt0) slt0Var).a;
            } else if (slt0Var instanceof plt0) {
                str = ((plt0) slt0Var).a;
            } else {
                if (!(slt0Var instanceof rlt0)) {
                    eg.o();
                    return null;
                }
                str = ((rlt0) slt0Var).a;
            }
            if (y4mVar instanceof w4m) {
                w4m w4mVar = (w4m) y4mVar;
                if (!w4mVar.b) {
                    u4m u4mVar = w4mVar.a;
                    uab1Var.a = null;
                    uab1Var.b = null;
                    uab1Var.c = null;
                    uab1Var.d = z;
                    uab1Var.g = 1;
                    if (this.c.t(str, u4mVar, tv80Var, uab1Var) == obj) {
                        return obj;
                    }
                    return rih1Var;
                }
            }
            if (r840Var instanceof o840) {
                uab1Var.a = ast0Var2;
                uab1Var.b = tv80Var;
                uab1Var.c = str;
                uab1Var.d = z;
                uab1Var.g = 2;
                objO = this.b.O(str, (o840) r840Var, tv80Var, uab1Var);
                if (objO != obj) {
                    str2 = str;
                    tv80Var2 = tv80Var;
                    z2 = z;
                }
            } else {
                ou80 ou80Var = tv80Var.a;
                uab1Var.a = null;
                uab1Var.b = null;
                uab1Var.c = null;
                uab1Var.d = z;
                uab1Var.g = 4;
                if (c(str, ast0Var2, ou80Var, uab1Var) != obj) {
                    return rih1Var;
                }
            }
            return obj;
        }
        if (i2 == 1) {
            hm5.M(objO);
            return rih1Var;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                hm5.M(objO);
                return rih1Var;
            }
            if (i2 == 4) {
                hm5.M(objO);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z2 = uab1Var.d;
        String str3 = uab1Var.c;
        tv80Var2 = uab1Var.b;
        ast0 ast0Var3 = uab1Var.a;
        hm5.M(objO);
        str2 = str3;
        ast0Var2 = ast0Var3;
        if (((x840) objO) instanceof w840) {
            ou80 ou80Var2 = tv80Var2.a;
            uab1Var.a = null;
            uab1Var.b = null;
            uab1Var.c = null;
            uab1Var.d = z2;
            uab1Var.g = 3;
            if (c(str2, ast0Var2, ou80Var2, uab1Var) == obj) {
                return obj;
            }
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0128 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x0129 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, ast0 ast0Var, ou80 ou80Var, onm onmVar) {
        vab1 vab1Var;
        if (onmVar instanceof vab1) {
            vab1Var = (vab1) onmVar;
            int i = vab1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vab1Var.c = i - Integer.MIN_VALUE;
            } else {
                vab1Var = new vab1(this, onmVar);
            }
        } else {
            vab1Var = new vab1(this, onmVar);
        }
        Object obj = vab1Var.a;
        int i2 = vab1Var.c;
        rih1 rih1Var = rih1.a;
        if (i2 != 0) {
            if (i2 == 1) {
                hm5.M(obj);
                return rih1Var;
            }
            if (i2 == 2) {
                hm5.M(obj);
                return rih1Var;
            }
            if (i2 == 3) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        y6r0 y6r0Var = this.d.get();
        String str2 = y6r0Var != null ? y6r0Var.a : null;
        if (str2 == null || str2.length() == 0) {
            n57.e("StandaloneContextPlayIntentHandler: missing page instance ID");
            return rih1Var;
        }
        LoggingParams loggingParamsBuild = LoggingParams.builder().interactionId(ou80Var.a).commandInitiatedTime(new Long(this.a.b())).pageInstanceId(str2).build();
        int iOrdinal = ast0Var.ordinal();
        ruz ruzVar = this.f;
        d9n d9nVar = d9n.a;
        if (iOrdinal == 0) {
            Single singleA = ruzVar.a(new e9u0(PauseCommand.builder().loggingParams(loggingParamsBuild).pauseOrigin(PauseResumeOrigin.builder("context-play-handler").build()).build()));
            vab1Var.c = 1;
            if (fc11.j(singleA, vab1Var) == d9nVar) {
                return d9nVar;
            }
            return rih1Var;
        }
        if (iOrdinal == 1) {
            Single singleA2 = ruzVar.a(new h9u0(ResumeCommand.builder().loggingParams(loggingParamsBuild).resumeOrigin(PauseResumeOrigin.builder("context-play-handler").build()).build()));
            vab1Var.c = 2;
            if (fc11.j(singleA2, vab1Var) == d9nVar) {
                return d9nVar;
            }
            return rih1Var;
        }
        if (iOrdinal != 2) {
            eg.o();
            return null;
        }
        Completable completableIgnoreElement = this.e.a(PlayCommand.create(Context.builder(str).url("context://" + str).build(), PlayOrigin.builder("context-play-handler").build()).toBuilder().options(g).loggingParams(loggingParamsBuild).build()).ignoreElement();
        vab1Var.c = 3;
        if (fc11.i(completableIgnoreElement, vab1Var) == d9nVar) {
            return d9nVar;
        }
        return rih1Var;
    }
}
