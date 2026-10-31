package p;

import io.reactivex.rxjava3.functions.Function;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cjx0 implements Function {
    public final Set a;

    public Object apply(Object obj) {
        Set set = this.a;
        int iS = zno1.s(q7h.U(set, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Object obj2 : set) {
            linkedHashMap.put(obj2, new hix0(false, 0L));
        }
        return linkedHashMap;
    }
}
