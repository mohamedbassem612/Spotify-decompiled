package p;

import android.net.Uri;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tii1 implements jbh0 {
    public static final tii1 a = new tii1();
    public static final List b = p7h.M("spotify.com", "www.spotify.com");

    @Override // p.jbh0
    public final String description() {
        return "Matches urls in the form https://[spotify.com|www.spotify.com]/listeningstats/*";
    }

    @Override // p.jbh0
    public final boolean match(Object obj) {
        Uri data = ((qs31) ((js31) obj)).a.getData();
        if (data != null) {
            List list = b;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (u890.j((String) it.next(), data.getHost())) {
                        if ((data.getPathSegments().size() < 1 || !u890.j(data.getPathSegments().get(0), "listeningstats")) && (data.getPathSegments().size() < 2 || !u890.j(data.getPathSegments().get(1), "listeningstats"))) {
                            break;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
