package p;

import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import spotify.autodownload.esperanto.proto.DecoratedFollowedShowsRequest;
import spotify.autodownload.esperanto.proto.DecoratedFollowedShowsResponse;
import spotify.autodownload.esperanto.proto.DecoratedShow;
import spotify.autodownload.esperanto.proto.EpisodeLimitRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nt8 {
    public final mt8 a;
    public final uu00 b;

    public nt8(mt8 mt8Var, uu00 uu00Var) {
        this.a = mt8Var;
        this.b = uu00Var;
    }

    public static zq61 a(DecoratedFollowedShowsResponse decoratedFollowedShowsResponse, Map map, tr80 tr80Var) {
        int i = ((rr80) tr80Var).a;
        int iO = (i == 0 && decoratedFollowedShowsResponse.o() == 0) ? 0 : decoratedFollowedShowsResponse.n() == 0 ? decoratedFollowedShowsResponse.o() + i : decoratedFollowedShowsResponse.n() + ((rr80) tr80Var).b + 1;
        h290<DecoratedShow> h290VarP = decoratedFollowedShowsResponse.p();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarP, 10));
        for (DecoratedShow decoratedShow : h290VarP) {
            String uri = decoratedShow.getUri();
            String strP = decoratedShow.p();
            String title = decoratedShow.getTitle();
            String publisher = decoratedShow.getPublisher();
            boolean zN = decoratedShow.n();
            boolean zO = decoratedShow.o();
            ktl ktlVar = (ktl) map.get(decoratedShow.getUri());
            if (ktlVar == null) {
                ktlVar = ktl.a;
            }
            arrayList.add(new i281(uri, strP, title, publisher, zN, zO, ktlVar != ktl.c || decoratedShow.q()));
        }
        return new zq61(i, iO, tr80Var, arrayList);
    }

    public final Observable b(tr80 tr80Var) {
        int size;
        oar oarVarN = DecoratedFollowedShowsRequest.n();
        oarVarN.q(((rr80) tr80Var).a);
        if (tr80Var instanceof Collection) {
            size = ((Collection) tr80Var).size();
        } else {
            lr80 it = tr80Var.iterator();
            int i = 0;
            while (((sr80) it).c) {
                it.next();
                i++;
                if (i < 0) {
                    p7h.S();
                    throw null;
                }
            }
            size = i;
        }
        oarVarN.n(size);
        return this.a.callStream("spotify.autodownload_esperanto.proto.AutoDownloadService", "StreamDecoratedFollowedShows", (DecoratedFollowedShowsRequest) oarVarN.build()).map(ios.t).switchMap(new ow3(this, tr80Var, (byte) 28));
    }

    public final Observable c() {
        x4z x4zVarN = EpisodeLimitRequest.n();
        x4zVarN.n();
        return this.a.callStream("spotify.autodownload_esperanto.proto.AutoDownloadService", "StreamEpisodeLimit", (EpisodeLimitRequest) x4zVarN.build()).map(v560.t).map(drm0.t);
    }
}
