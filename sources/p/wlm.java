package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ContextTrack$Metadata;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class wlm {
    public static final Set a = Collections.singleton("spotify:meta");

    public static final List a(ArrayList arrayList, Map map, boolean z) {
        if (!z) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            ContextTrack contextTrack = (ContextTrack) obj;
            if (l4o1.K(contextTrack) ? u890.j(map.get(contextTrack.uri()), Boolean.TRUE) : true) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static final ArrayList b(ArrayList arrayList, boolean z) {
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((ContextTrack) obj).isDelimiter()) {
                break;
            }
            arrayList2.add(obj);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            ContextTrack contextTrack = (ContextTrack) obj2;
            Set set = a;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator it = set.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (nhc1.Y(contextTrack.uri(), (String) it.next(), false)) {
                        }
                    }
                }
            }
            if (!Boolean.parseBoolean((String) contextTrack.metadata().get(ContextTrack$Metadata.KEY_COLLECTION_IS_BANNED)) && !Boolean.parseBoolean((String) contextTrack.metadata().get(ContextTrack$Metadata.KEY_HIDDEN)) && (!z || !l4o1.D(contextTrack))) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }
}
