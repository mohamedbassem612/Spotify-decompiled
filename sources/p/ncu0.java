package p;

import com.google.protobuf.Duration;
import com.spotify.player.esperanto.proto.EsSetSleepTimerRequest$SetSleepTimerRequest;
import com.spotify.player.esperanto.proto.a;
import com.spotify.player.esperanto.proto.c;
import com.spotify.player.model.command.SetSleepTimerCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.TimerType;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ncu0 extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ ocu0 b;
    public final /* synthetic */ TimerType c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ncu0(ocu0 ocu0Var, TimerType timerType, lnm lnmVar) {
        super(2, lnmVar);
        this.b = ocu0Var;
        this.c = timerType;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new ncu0(this.b, this.c, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            uuz uuzVar = this.b.a;
            SetSleepTimerCommand setSleepTimerCommandBuild = SetSleepTimerCommand.builder(this.c).build();
            a aVarN = EsSetSleepTimerRequest$SetSleepTimerRequest.n();
            if (setSleepTimerCommandBuild.options().c()) {
                aVarN.t(l6p1.h((CommandOptions) setSleepTimerCommandBuild.options().b()));
            }
            aVarN.s(tgp1.s(uuzVar.b.a(setSleepTimerCommandBuild.loggingParams())));
            TimerType timerType = setSleepTimerCommandBuild.timerType();
            if (timerType instanceof TimerType.Duration) {
                c cVarN = EsSetSleepTimerRequest$SetSleepTimerRequest.Duration.n();
                ifv ifvVarQ = Duration.q();
                ifvVarQ.q(((TimerType.Duration) setSleepTimerCommandBuild.timerType()).durationSeconds());
                cVarN.n((Duration) ifvVarQ.build());
                aVarN.q(cVarN);
            } else if (timerType instanceof TimerType.EndOfTrack) {
                aVarN.r((EsSetSleepTimerRequest$SetSleepTimerRequest.EndOfTrack) EsSetSleepTimerRequest$SetSleepTimerRequest.EndOfTrack.n().build());
            } else if (timerType instanceof TimerType.Clear) {
                aVarN.n((EsSetSleepTimerRequest$SetSleepTimerRequest.Clear) EsSetSleepTimerRequest$SetSleepTimerRequest.Clear.n().build());
            }
            Single map = uuzVar.a.callSingle("spotify.player.esperanto.proto.ContextPlayer", "SetSleepTimer", (EsSetSleepTimerRequest$SetSleepTimerRequest) aVarN.build()).map(vap1.R0).map(qbo1.a1);
            this.a = true;
            Object objJ = fc11.j(map, this);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }
}
