package p;

import com.spotify.player.esperanto.proto.EsCommandOptions$CommandOptions;
import com.spotify.player.esperanto.proto.EsGetStateRequest;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import com.spotify.player.esperanto.proto.EsPause$PauseRequest;
import com.spotify.player.esperanto.proto.EsPauseresumeOrigin$PauseResumeOrigin;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class z9g extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ gag c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z9g(gag gagVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = gagVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        gag gagVar = this.c;
        switch (b) {
            case 0:
                return new z9g(gagVar, lnmVar, (byte) 0);
            default:
                return new z9g(gagVar, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        rih1 rih1Var2 = d9n.a;
        gag gagVar = this.c;
        switch (b) {
            case 0:
                boolean z = this.b;
                try {
                    if (!z) {
                        hm5.M(obj);
                        jn7 jn7Var = gagVar.c;
                        rpz rpzVarN = EsPause$PauseRequest.n();
                        tlz tlzVarN = EsCommandOptions$CommandOptions.n();
                        tlzVarN.s(false);
                        rpzVarN.q((EsCommandOptions$CommandOptions) tlzVarN.build());
                        spz spzVarN = EsPauseresumeOrigin$PauseResumeOrigin.n();
                        spzVarN.n("chromeless-webview");
                        rpzVarN.r((EsPauseresumeOrigin$PauseResumeOrigin) spzVarN.build());
                        rpzVarN.n(EsLoggingParams$LoggingParams.p());
                        EsPause$PauseRequest esPause$PauseRequest = (EsPause$PauseRequest) rpzVarN.build();
                        this.b = true;
                        if (jn7Var.T(esPause$PauseRequest, this) == rih1Var2) {
                            rih1Var = rih1Var2;
                        }
                    } else {
                        if (!z) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    return rih1Var;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception unused) {
                    return rih1Var;
                }
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarU = rqt0.u(new fag(gagVar.c.E(EsGetStateRequest.GetStateRequest.n()), (byte) 0));
                fdd fddVar = new fdd(gagVar, (byte) 6);
                this.b = true;
                return mr20VarU.collect(fddVar, this) == rih1Var2 ? rih1Var2 : rih1Var;
        }
    }
}
