package p;

import app.p000rive.semantics.SemanticState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mge1 implements bhn {
    @Override // p.chn
    public final wk21 a() {
        StringBuilder sb = new StringBuilder(SemanticState.Modal);
        sb.append("Current thread:\n");
        sb.append(Thread.currentThread().getName());
        sb.append("\n\nAll threads (\n");
        Set<Thread> setKeySet = Thread.getAllStackTraces().keySet();
        sb.append(setKeySet.size());
        sb.append("):");
        Set<Thread> set = setKeySet;
        ArrayList arrayList = new ArrayList(q7h.U(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((Thread) it.next()).getName());
        }
        Iterator it2 = o7h.a1(arrayList, String.CASE_INSENSITIVE_ORDER).iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            sb.append('\n');
        }
        return new wk21("Threads", "Every live thread sorted by case sensitive name.", sb.toString());
    }
}
