package p;

import com.spotify.player.esperanto.proto.EsSignalRequest;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ehl implements Function {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ghl c;

    public ehl(ghl ghlVar, boolean z) {
        this.c = ghlVar;
        this.b = z;
    }

    public final Object apply(Object obj) {
        Completable completableFlatMapCompletable;
        byte b = this.a;
        boolean z = this.b;
        ghl ghlVar = this.c;
        switch (b) {
            case 0:
                ContextTrack contextTrack = (ContextTrack) ((PlayerState) obj).track().h();
                if (contextTrack == null) {
                    return CompletableEmpty.a;
                }
                String strA0 = l4o1.a0(contextTrack, "context_uri");
                return (strA0 == null || (completableFlatMapCompletable = ghlVar.e.b(contextTrack.uid(), strA0).firstOrError().map(new kba(contextTrack, (byte) 24)).flatMapCompletable(new ehl(z, ghlVar))) == null) ? CompletableEmpty.a : completableFlatMapCompletable;
            default:
                Boolean bool = (Boolean) obj;
                if (z || !bool.booleanValue() || !ghlVar.f.b()) {
                    return CompletableEmpty.a;
                }
                ujm ujmVar = (ujm) ghlVar.e.q.getValue();
                srz srzVarN = EsSignalRequest.SignalRequest.n();
                srzVarN.r("plus");
                return ujmVar.callSingle("spotify.player.esperanto.proto.ContextPlayer", "Signal", srzVarN.build()).map(xbp1.S0).ignoreElement();
        }
    }

    public ehl(boolean z, ghl ghlVar) {
        this.b = z;
        this.c = ghlVar;
    }
}
