package p;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class lya {
    public static final Map a = sqg0.J(new mmr0[]{new mmr0(pe9.a, 1), new mmr0(pe9.c, 2), new mmr0(pe9.d, 4), new mmr0(pe9.e, 4), new mmr0(pe9.f, 8), new mmr0(pe9.g, 4)});

    public static int a(Set set) {
        Iterator it = set.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            Integer num = (Integer) a.get(((ee9) it.next()).getUuid());
            if (num != null) {
                iIntValue |= num.intValue();
            }
        }
        return iIntValue;
    }
}
