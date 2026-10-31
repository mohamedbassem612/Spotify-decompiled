package p;

import com.spotify.collection.componentrecycler.ComponentRecyclerAdapter;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c1i {
    public List a = z6x.a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final LinkedHashMap d = new LinkedHashMap();
    public final LinkedHashMap e = new LinkedHashMap();
    public h5z f;

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.collection.componentrecycler.ComponentRecyclerAdapter$DuplicateComparatorFound */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.collection.componentrecycler.ComponentRecyclerAdapter$DuplicateComponentProducerFound */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.collection.componentrecycler.ComponentRecyclerAdapter$DuplicateComponentViewBinderFound */
    public final void a(tka0 tka0Var, a1i a1iVar, qsw0 qsw0Var, t1i t1iVar) throws ComponentRecyclerAdapter.DuplicateComponentProducerFound, ComponentRecyclerAdapter.DuplicateComparatorFound, ComponentRecyclerAdapter.DuplicateComponentViewBinderFound {
        LinkedHashMap linkedHashMap = this.b;
        if (linkedHashMap.containsKey(tka0Var)) {
            throw new ComponentRecyclerAdapter.DuplicateComparatorFound(tka0Var);
        }
        linkedHashMap.put(tka0Var, a1iVar);
        LinkedHashMap linkedHashMap2 = this.c;
        if (linkedHashMap2.containsKey(tka0Var)) {
            throw new ComponentRecyclerAdapter.DuplicateComponentProducerFound(tka0Var);
        }
        linkedHashMap2.put(tka0Var, qsw0Var);
        if (t1iVar != null) {
            LinkedHashMap linkedHashMap3 = this.d;
            if (!linkedHashMap3.containsKey(tka0Var)) {
                linkedHashMap3.put(tka0Var, t1iVar);
                return;
            }
            throw new ComponentRecyclerAdapter.DuplicateComponentViewBinderFound("ComponentViewBinder<AnyModel, AnyEvent> instance for " + tka0Var + " has already been supplied.");
        }
    }
}
