package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rh30 implements ph30 {
    public final /* synthetic */ th30 a;

    public rh30(th30 th30Var) {
        this.a = th30Var;
    }

    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3;
        ArrayList arrayList4;
        boolean zA0;
        th30 th30Var = this.a;
        ArrayList<oh30> arrayList5 = th30Var.o;
        if (th30.P(2)) {
            Objects.toString(th30Var.a);
        }
        if (th30Var.d.isEmpty()) {
            zA0 = false;
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
        } else {
            nu9 nu9Var = (nu9) l1d.i(1, th30Var.d);
            th30Var.h = nu9Var;
            Iterator it = nu9Var.c.iterator();
            while (it.hasNext()) {
                zf30 zf30Var = ((wi30) it.next()).b;
                if (zf30Var != null) {
                    zf30Var.Z = true;
                }
            }
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            zA0 = th30Var.a0(arrayList3, arrayList4, (String) null, -1, 0);
        }
        if (!arrayList5.isEmpty() && arrayList3.size() > 0) {
            boolean zBooleanValue = ((Boolean) arrayList4.get(arrayList3.size() - 1)).booleanValue();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(th30.K((nu9) it2.next()));
            }
            for (oh30 oh30Var : arrayList5) {
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    oh30Var.b((zf30) it3.next(), zBooleanValue);
                }
            }
        }
        return zA0;
    }
}
