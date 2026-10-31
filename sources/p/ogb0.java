package p;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ogb0 {
    public final Context a;
    public final List b;
    public final ArrayList c;
    public final idd1 d;
    public final /* synthetic */ uo5 e;

    public ogb0(uo5 uo5Var, Context context) {
        List listK;
        this.e = uo5Var;
        this.a = context;
        ArrayList arrayList = null;
        try {
            listK = w081.k(context, 1);
        } catch (IllegalArgumentException e) {
            n57.g("Could not retrieve static shortcuts", e);
            listK = null;
        }
        this.b = listK;
        List listB = ((lb) this.e.c).b();
        if (listB != null) {
            arrayList = new ArrayList(listB);
            uo5 uo5Var2 = this.e;
            if (((Integer) uo5Var2.d) == null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Integer numB = nfb.b((t081) it.next());
                    if (numB != null) {
                        arrayList2.add(numB);
                    }
                }
                uo5Var2.d = (Integer) o7h.D0(arrayList2);
            }
        }
        this.c = arrayList;
        this.d = new idd1(new pr90(this, (byte) 23));
    }

    public final String a() {
        uo5 uo5Var = this.e;
        Integer num = (Integer) uo5Var.d;
        int iIntValue = (num != null ? num.intValue() : 0) + 1;
        Set set = (Set) this.d.getValue();
        if (set != null) {
            while (set.contains(Integer.valueOf(iIntValue))) {
                iIntValue++;
            }
        }
        uo5Var.d = Integer.valueOf(iIntValue);
        return f4i1.c(iIntValue, "customshortcut-lastvisitedpage-");
    }
}
