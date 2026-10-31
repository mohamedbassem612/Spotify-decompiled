package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerQueue;
import com.spotify.player.model.command.SetQueueCommand;
import com.spotify.player.model.command.options.CommandOptions;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zn50 implements Function {
    public final /* synthetic */ ao50 a;
    public final /* synthetic */ List b;

    public zn50(ao50 ao50Var, List list) {
        this.a = ao50Var;
        this.b = list;
    }

    public final Object apply(Object obj) {
        PlayerQueue playerQueue = (PlayerQueue) obj;
        b380 b380VarNextTracks = playerQueue.nextTracks();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : b380VarNextTracks) {
            if (!this.b.contains(((ContextTrack) obj2).uri())) {
                arrayList.add(obj2);
            }
        }
        return this.a.c.b(SetQueueCommand.builder(playerQueue.toBuilder().nextTracks(b380.p(arrayList)).build()).options(CommandOptions.builder().overrideRestrictions(true).build()).build());
    }
}
