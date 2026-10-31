package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class v9e {
    public static final Pattern a;
    public static final Pattern b;

    static {
        new pob((byte) 1, false);
        Set setZ0 = dm61.z0("scdn.co", "spotifycdn.com");
        ArrayList arrayList = new ArrayList(q7h.U(setZ0, 10));
        Iterator it = setZ0.iterator();
        while (it.hasNext()) {
            arrayList.add("(^|\\.)" + Pattern.quote((String) it.next()) + "$");
        }
        a = Pattern.compile(o7h.y0(arrayList, "|", null, null, null, 62));
        b = Pattern.compile("[/@:?#\\\\\\s]");
    }
}
