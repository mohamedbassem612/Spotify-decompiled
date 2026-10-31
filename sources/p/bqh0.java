package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bqh0 {
    public List a;
    public List b;

    public final void a(kph0 kph0Var) {
        ArrayList arrayListN0 = o7h.N0(this.b, this.a);
        kph0Var.j(arrayListN0);
        w280 w280VarR = kph0Var.a().r(0);
        while (w280VarR.hasNext()) {
            ixh0 ixh0Var = (ixh0) w280VarR.next();
            dr41 dr41VarA = gxh0.g.a();
            ArrayList arrayList = new ArrayList();
            Iterator it = arrayListN0.iterator();
            while (it.hasNext()) {
                pa61 pa61Var = ((udh) it.next()).a;
                if (pa61Var != null) {
                    arrayList.add(pa61Var);
                }
            }
            dr41VarA.g(arrayList);
            qa61 qa61VarH = dr41VarA.h();
            l8u0 l8u0Var = new l8u0();
            l8u0Var.b();
            kph0Var.i(ixh0Var, qa61VarH, l8u0Var.d());
        }
    }
}
