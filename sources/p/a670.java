package p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class a670 implements c670 {
    public final ArrayList a;

    public a670(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final n570 a(int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            n570 n570VarA = ((c670) it.next()).a(i);
            if (n570VarA != null) {
                return n570VarA;
            }
        }
        return null;
    }
}
