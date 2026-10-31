package p;

import com.spotify.collection.componentrecycler.ComponentRecyclerAdapter$DuplicateComponentProducerFound;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qqz0 {
    public uqz0 a = uqz0.t;
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final LinkedHashMap d = new LinkedHashMap();
    public final LinkedHashMap e = new LinkedHashMap();
    public h5z f;
    public h5z g;

    public static void a(qqz0 qqz0Var, tka0 tka0Var, a1i a1iVar, qsw0 qsw0Var) {
        qqz0Var.b(a1iVar, tka0Var);
        LinkedHashMap linkedHashMap = qqz0Var.c;
        if (linkedHashMap.containsKey(tka0Var)) {
            throw new ComponentRecyclerAdapter$DuplicateComponentProducerFound(tka0Var);
        }
        linkedHashMap.put(tka0Var, qsw0Var);
    }

    public final void b(a1i a1iVar, final tka0 tka0Var) {
        LinkedHashMap linkedHashMap = this.b;
        if (linkedHashMap.containsKey(tka0Var)) {
            throw new RuntimeException(tka0Var) { // from class: com.spotify.collection.componentrecycler.ComponentRecyclerAdapter$DuplicateComparatorFound
                {
                    super("ComponentModelComparator instance for " + tka0Var + " has already been supplied.");
                }
            };
        }
        linkedHashMap.put(tka0Var, a1iVar);
    }
}
