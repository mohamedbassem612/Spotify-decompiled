package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerQueue;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ccu0 implements Function {
    public final /* synthetic */ tuz a;
    public final /* synthetic */ ContextTrack b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Map f;

    public ccu0(tuz tuzVar, ContextTrack contextTrack, int i, boolean z, boolean z2, Map map) {
        this.a = tuzVar;
        this.b = contextTrack;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = map;
    }

    public final Object apply(Object obj) {
        ContextTrack contextTrack;
        PlayerQueue playerQueueBuild = (PlayerQueue) obj;
        ArrayList arrayList = new ArrayList((Collection) playerQueueBuild.nextTracks());
        String strUid = ((ContextTrack) wlm.a(wlm.b(arrayList, this.d), this.f, this.e).get(this.c)).uid();
        Iterator it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            contextTrack = this.b;
            if (!zHasNext) {
                i2 = -1;
                break;
            }
            if (u890.j(((ContextTrack) it.next()).uid(), contextTrack.uid())) {
                break;
            }
            i2++;
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            }
            if (u890.j(((ContextTrack) it2.next()).uid(), strUid)) {
                break;
            }
            i++;
        }
        if (i2 != -1 && i != -1) {
            arrayList.remove(i2);
            if (i <= arrayList.size()) {
                arrayList.add(i, contextTrack);
            } else {
                arrayList.add(contextTrack);
            }
            PlayerQueue.Builder builder = playerQueueBuild.toBuilder();
            v280 v280VarM = b380.m();
            v280VarM.e(arrayList);
            playerQueueBuild = builder.nextTracks(v280VarM.g()).build();
        }
        return this.a.b(dcu0.d(playerQueueBuild));
    }
}
