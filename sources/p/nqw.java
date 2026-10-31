package p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nqw {
    public final ArrayList a = new ArrayList();

    public final void a(Object obj, j2i j2iVar) {
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (u890.j(((mmr0) it.next()).a, obj)) {
                    hhg1.f(gvg.g(obj, "Duplicate key "));
                    return;
                }
            }
        }
        arrayList.add(new mmr0(obj, j2iVar));
    }
}
