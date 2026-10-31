package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uxt implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ezt a;

    public uxt(ezt eztVar) {
        this.a = eztVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        oxt oxtVar = ((pxt) obj).a;
        Set<Map.Entry> setEntrySet = this.a.t.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setEntrySet) {
            if (((qyt) entry.getKey()).b == oxtVar) {
                entry.getValue().getClass();
                bhn0.d();
                return null;
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return rih1.a;
        }
        Map.Entry entry2 = (Map.Entry) it.next();
        entry2.getClass();
        entry2.getValue();
        bhn0.d();
        return null;
    }
}
