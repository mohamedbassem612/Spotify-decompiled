package p;

import android.util.SparseArray;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class m611 {
    public final SparseArray a = new SparseArray();
    public int b = 0;
    public final Set c = Collections.newSetFromMap(new IdentityHashMap());

    public final l611 a(int i) {
        SparseArray sparseArray = this.a;
        l611 l611Var = (l611) sparseArray.get(i);
        if (l611Var != null) {
            return l611Var;
        }
        l611 l611Var2 = new l611();
        sparseArray.put(i, l611Var2);
        return l611Var2;
    }
}
