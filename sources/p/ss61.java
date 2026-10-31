package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ss61 {
    public final Set a;
    public final idd1 b = new idd1(new l451(this, (byte) 25));

    public ss61(rs61... rs61VarArr) {
        this.a = f46.S0(rs61VarArr);
    }

    public static rs61 a(p6r0 p6r0Var, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((rs61) obj).isEnabled()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() <= 1) {
            return (rs61) o7h.X0(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(rc11.a.b(((rs61) it.next()).getClass()).r());
        }
        ncn0.j("Multiple enabled registrations for ", p6r0Var, ": ", o7h.y0(arrayList2, ", ", null, null, null, 62));
        return null;
    }
}
