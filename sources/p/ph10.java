package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class ph10 {
    public static final List a = p7h.M(new String[]{"spotify:list:track-samples:", "spotify:list:track-covers:", "spotify:list:track-sampled-in:", "spotify:list:artists-popular-collaborations:", "spotify:list:popular-release-segments:", "spotify:list:artist-connections:", "spotify:list:artist-connections-shelf:"});

    public static final boolean a(String str) {
        List list = a;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (nhc1.Y(str, (String) it.next(), false)) {
                    return true;
                }
            }
        }
        return false;
    }
}
