package p;

import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cmt0 implements Function {
    public final /* synthetic */ yon a;

    public cmt0(yon yonVar) {
        this.a = yonVar;
    }

    public final Object apply(Object obj) {
        cew cewVar = (cew) obj;
        yon yonVar = this.a;
        rlu0 rlu0Var = (rlu0) yonVar.d;
        PreparePlayOptions preparePlayOptionsA = rlu0Var.a(Integer.valueOf(cewVar.a));
        LoggingParams.Builder builderCommandInitiatedTime = LoggingParams.builder().interactionId(cewVar.c).commandInitiatedTime(Long.valueOf(((yqg) yonVar.b).b()));
        y6r0 y6r0Var = ((b7r0) yonVar.e).get();
        String str = y6r0Var != null ? y6r0Var.a : null;
        if (str == null) {
            str = "";
        }
        return ((muz) yonVar.c).a(PlayCommand.builder(rlu0Var.b(cewVar.b, cewVar.d), rlu0Var.a).options(preparePlayOptionsA).loggingParams(builderCommandInitiatedTime.pageInstanceId(str).build()).build()).map(si10.Y0).map(xi10.Y0).toObservable();
    }
}
