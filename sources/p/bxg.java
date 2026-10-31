package p;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public interface bxg {
    rf01 e();

    default void g(Uri uri) {
        LinkedHashSet linkedHashSetY0;
        String string = uri.toString();
        List listK0 = z561.k0(se11.b(gbr.a, string));
        wf01 wf01VarD = e().d();
        if (wf01VarD == null) {
            return;
        }
        if (listK0.size() != 1) {
            wf01VarD.b(new bsi0(string, b7x.a));
            return;
        }
        String strConcat = ((mbh0) o7h.q0(listK0)).a.group().concat("#");
        synchronized (wf01VarD.c) {
            linkedHashSetY0 = dm61.y0(o7h.p1(((cg01) wf01VarD.a.c).a.keySet()), o7h.p1(((LinkedHashMap) wf01VarD.b.b).keySet()));
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSetY0) {
            bsi0 bsi0Var = (bsi0) obj;
            if (nhc1.Y(bsi0Var.a, strConcat, false) || u890.j(bsi0Var.a, ((mbh0) o7h.q0(listK0)).a.group())) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            wf01VarD.b((bsi0) it.next());
        }
    }
}
