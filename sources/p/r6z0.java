package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerQueue;
import com.spotify.player.model.command.SetQueueCommand;
import com.spotify.player.model.command.options.CommandOptions;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class r6z0 implements Function {
    public final /* synthetic */ m5z0 a;
    public final /* synthetic */ t6z0 b;

    public r6z0(m5z0 m5z0Var, t6z0 t6z0Var) {
        this.a = m5z0Var;
        this.b = t6z0Var;
    }

    public final Object apply(Object obj) {
        PlayerQueue playerQueue = (PlayerQueue) obj;
        gcz0 gcz0Var = this.a.d;
        List list = gcz0Var.a;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(dcu0.e((ContextTrack) it.next(), true));
        }
        List list2 = gcz0Var.b;
        ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(dcu0.e((ContextTrack) it2.next(), false));
        }
        return this.b.c.b(SetQueueCommand.builder(playerQueue.toBuilder().nextTracks(o7h.N0(arrayList2, arrayList)).build()).options(CommandOptions.builder().overrideRestrictions(true).build()).build());
    }
}
