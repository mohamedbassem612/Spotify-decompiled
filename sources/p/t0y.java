package p;

import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class t0y implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lkd b;

    public /* synthetic */ t0y(lkd lkdVar, byte b) {
        this.a = b;
        this.b = lkdVar;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        o6x o6xVar = o6x.a;
        lkd lkdVar = this.b;
        switch (b) {
            case 0:
                ContextTrack contextTrack = (ContextTrack) obj;
                return s3o1.v(contextTrack, false) ? Flowable.I(Boolean.TRUE) : yoi1.h(lkdVar.c(contextTrack), o6xVar);
            default:
                return yoi1.h(lkdVar.c((ContextTrack) obj), o6xVar);
        }
    }
}
