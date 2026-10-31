package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ContextTrack$Metadata;
import com.spotify.player.model.PlayerQueue;
import com.spotify.player.model.command.SetQueueCommand;
import com.spotify.player.model.command.options.CommandOptions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleSingle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTake;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class dcu0 {
    public static final ArrayList a(PlayerQueue playerQueue) {
        b380 b380VarNextTracks = playerQueue.nextTracks();
        ArrayList arrayList = new ArrayList();
        for (Object obj : b380VarNextTracks) {
            ContextTrack contextTrack = (ContextTrack) obj;
            contextTrack.getClass();
            if (!l4o1.S(contextTrack)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final FlowableSingleSingle b(tuz tuzVar) {
        return new FlowableSingleSingle(new FlowableTake(tuzVar.c));
    }

    public static final ArrayList c(PlayerQueue playerQueue) {
        b380 b380VarNextTracks = playerQueue.nextTracks();
        ArrayList arrayList = new ArrayList();
        for (Object obj : b380VarNextTracks) {
            if (l4o1.S((ContextTrack) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final SetQueueCommand d(PlayerQueue playerQueue) {
        return SetQueueCommand.builder(playerQueue).options(CommandOptions.builder().overrideRestrictions(true).build()).build();
    }

    public static final ContextTrack e(ContextTrack contextTrack, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap((Map) contextTrack.metadata());
        linkedHashMap.put(ContextTrack$Metadata.KEY_IS_QUEUED, String.valueOf(z));
        return contextTrack.toBuilder().metadata(linkedHashMap).build();
    }
}
