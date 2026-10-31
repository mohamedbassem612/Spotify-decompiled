package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ContextTrack$Metadata;
import com.spotify.player.model.PlayerQueue;
import com.spotify.player.model.command.SetQueueCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hqr implements Function {
    public final /* synthetic */ List a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ iqr f;

    public hqr(List list, int i, boolean z, String str, String str2, iqr iqrVar) {
        this.a = list;
        this.b = i;
        this.c = z;
        this.d = str;
        this.e = str2;
        this.f = iqrVar;
    }

    public final Object apply(Object obj) {
        PlayerQueue playerQueue = (PlayerQueue) obj;
        if (!playerQueue.track().c()) {
            return Single.just(new beh("not_playing_context"));
        }
        Set set = iqr.d;
        b380 b380VarNextTracks = playerQueue.nextTracks();
        b380VarNextTracks.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : b380VarNextTracks) {
            ContextTrack contextTrack = (ContextTrack) obj2;
            contextTrack.getClass();
            if (!l4o1.S(contextTrack)) {
                break;
            }
            arrayList.add(obj2);
        }
        List<ContextTrack> list = this.a;
        ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
        for (ContextTrack contextTrack2 : list) {
            HashMap map = new HashMap((Map) contextTrack2.metadata());
            map.put(ContextTrack$Metadata.KEY_IS_QUEUED, "true");
            arrayList2.add(contextTrack2.toBuilder().metadata(map).build());
        }
        b380 b380VarX = b380VarNextTracks.x(arrayList.size(), b380VarNextTracks.size());
        v280 v280VarM = b380.m();
        if (this.b == 1) {
            v280VarM.e(arrayList2);
            v280VarM.e(arrayList);
        } else {
            v280VarM.e(arrayList);
            v280VarM.e(arrayList2);
        }
        v280VarM.e(b380VarX);
        SetQueueCommand.Builder builder = SetQueueCommand.builder(playerQueue.toBuilder().nextTracks(v280VarM.g()).build());
        if (this.c) {
            builder.options(CommandOptions.builder().overrideRestrictions(true).build());
        }
        return this.f.a.b(builder.loggingParams(LoggingParams.builder().pageInstanceId(this.d).interactionId(this.e).build()).build());
    }
}
