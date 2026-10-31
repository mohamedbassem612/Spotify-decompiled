package p;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class loa1 {
    public static final LinkedHashSet a;
    public static final heg b;

    static {
        List listM = p7h.M(eia0.a, eia0.h, eia0.i, eia0.c, eia0.d, eia0.f);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listM.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(mka.n((kf30) it.next()));
        }
        a = linkedHashSet;
        b = mka.n(eia0.g);
    }
}
