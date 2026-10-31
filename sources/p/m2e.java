package p;

import android.content.Context;
import com.spotify.home.evopage.mobius.a;
import com.spotify.home.evopage.structureapi.DismissedEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class m2e {
    public static final dzz a(l2e l2eVar, Set set, Set set2, boolean z, boolean z2, Set set3, ice0 ice0Var, Context context) {
        yz21 yz21Var = l2eVar.c;
        List list = l2eVar.a;
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            jn60 jn60Var = (jn60) a.d(list).get((String) it.next());
            DismissedEntity dismissedEntity = jn60Var == null ? null : new DismissedEntity(jn60Var.getId(), DismissedEntity.Type.EXPLICIT_FEEDBACK);
            if (dismissedEntity != null) {
                arrayList.add(dismissedEntity);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof xq01) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (set2.contains(((xq01) obj2).e.d)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(new DismissedEntity(((xq01) it2.next()).a, DismissedEntity.Type.RECENTS));
        }
        ArrayList arrayList5 = new ArrayList(list);
        if (u890.j(l2eVar.d, "music-following-chip")) {
            arrayList5.add(0, new e460("music-following-heading-section", "music-following-heading-section", new hvl1(context.getString(2131958989), 254, (String) null, (String) null, false, (String) null), yz21.c));
        }
        if (z2) {
            arrayList5.add(0, new mvo(yz21Var));
        }
        return new dzz(arrayList5, o7h.p1(o7h.N0(arrayList4, arrayList)), set3, l2eVar.b, yz21Var, z, l2eVar.e, l2eVar.d, l2eVar.f, ice0Var, l2eVar.g, l2eVar.h);
    }
}
