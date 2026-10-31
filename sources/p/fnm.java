package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fnm {
    public static final bma1 d;
    public static final bma1 e;
    public final dma1 a;
    public Set b;
    public Set c;

    static {
        nbc nbcVar = bma1.b;
        d = nbcVar.u("uri_shuffle_on");
        e = nbcVar.u("uri_shuffle_off");
    }

    public fnm(dma1 dma1Var) {
        this.a = dma1Var;
        w7x w7xVar = w7x.a;
        this.b = w7xVar;
        this.c = w7xVar;
        Set setA = dma1Var.a(d);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = setA.iterator();
        while (it.hasNext()) {
            y6b1 y6b1VarU = tto1.u((String) it.next());
            if (y6b1VarU != null) {
                linkedHashSet.add(y6b1VarU);
            }
        }
        this.b = linkedHashSet;
        Set setA2 = this.a.a(e);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = setA2.iterator();
        while (it2.hasNext()) {
            y6b1 y6b1VarU2 = tto1.u((String) it2.next());
            if (y6b1VarU2 != null) {
                linkedHashSet2.add(y6b1VarU2);
            }
        }
        this.c = linkedHashSet2;
    }

    public final void a(String str, boolean z) {
        y6b1 y6b1VarU = tto1.u(str);
        if (y6b1VarU == null) {
            return;
        }
        if (z) {
            if (!tto1.i(this.b, y6b1VarU)) {
                this.b = dm61.x0(y6b1VarU, this.b);
            }
            Set set = this.c;
            ArrayList arrayList = new ArrayList();
            for (Object obj : set) {
                if (!y6b1VarU.j((y6b1) obj)) {
                    arrayList.add(obj);
                }
            }
            this.c = o7h.p1(arrayList);
        } else {
            if (!tto1.i(this.c, y6b1VarU)) {
                this.c = dm61.x0(y6b1VarU, this.c);
            }
            Set set2 = this.b;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : set2) {
                if (!y6b1VarU.j((y6b1) obj2)) {
                    arrayList2.add(obj2);
                }
            }
            this.b = o7h.p1(arrayList2);
        }
        dma1 dma1Var = this.a;
        hma1 hma1VarEdit = dma1Var.edit();
        Set set3 = this.b;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = set3.iterator();
        while (it.hasNext()) {
            String strG = ((y6b1) it.next()).g();
            if (strG != null) {
                arrayList3.add(strG);
            }
        }
        hma1VarEdit.e(d, o7h.p1(arrayList3));
        hma1VarEdit.g();
        hma1 hma1VarEdit2 = dma1Var.edit();
        Set set4 = this.c;
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = set4.iterator();
        while (it2.hasNext()) {
            String strG2 = ((y6b1) it2.next()).g();
            if (strG2 != null) {
                arrayList4.add(strG2);
            }
        }
        hma1VarEdit2.e(e, o7h.p1(arrayList4));
        hma1VarEdit2.g();
    }
}
