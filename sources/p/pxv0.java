package p;

import com.spotify.player.esperanto.proto.EsDeleteSession;
import com.spotify.player.model.command.PreparePlayCommand;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pxv0 implements Function {
    public final /* synthetic */ so a;

    public pxv0(so soVar) {
        this.a = soVar;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x003a  */
    public final Object apply(Object obj) {
        Completable completableIgnoreElement;
        gew gewVar = (gew) obj;
        so soVar = this.a;
        rlu0 rlu0Var = (rlu0) soVar.c;
        wuz wuzVar = gewVar.c;
        if (wuzVar != null) {
            wuzVar.d = true;
            ujm ujmVar = wuzVar.a;
            umz umzVarN = EsDeleteSession.DeleteSessionRequest.n();
            umzVarN.n(wuzVar.c);
            completableIgnoreElement = ujmVar.callSingle("spotify.player.esperanto.proto.ContextPlayer", "DeleteSession", umzVarN.build()).map(ios.S0).map(wcp1.b1).ignoreElement();
            if (completableIgnoreElement == null) {
                completableIgnoreElement = CompletableEmpty.a;
            }
        } else {
            completableIgnoreElement = CompletableEmpty.a;
        }
        muz muzVar = (muz) soVar.b;
        return completableIgnoreElement.e(muzVar.a.callSingle("spotify.player.esperanto.proto.ContextPlayer", "PreparePlay", dug.p(PreparePlayCommand.builder(rlu0Var.b(gewVar.a, gewVar.b), rlu0Var.a).options(rlu0Var.a((Integer) null)).build())).map(cq41.S0).map(new j3v(muzVar, (byte) 11)).map(e710.e1));
    }
}
