package p;

import java.util.ArrayList;
import java.util.Date;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xgf1 implements o4h1 {
    public final ygf1 a;
    public final igf1 b;
    public final vku c = new vku();

    public xgf1(ygf1 ygf1Var, igf1 igf1Var) {
        this.a = ygf1Var;
        this.b = igf1Var;
    }

    @Override // p.o4h1
    public final void start() {
        pgf1 pgf1Var = this.a.a;
        igf1 igf1Var = this.b;
        ArrayList<hgf1> arrayList = igf1Var.a;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        for (hgf1 hgf1Var : arrayList) {
            int i = hgf1Var.b;
            Date date = hgf1Var.d;
            Date date2 = hgf1Var.c;
            int i2 = hgf1Var.a;
            arrayList2.add(i > 0 ? new kiq0(i2, i, date2, date) : new kay(i2, date2, date));
        }
        String str = igf1Var.b;
        String str2 = igf1Var.c;
        yo21 yo21Var = new yo21(str, str2, igf1Var.d);
        ArrayList arrayList3 = pgf1Var.e;
        arrayList3.clear();
        arrayList3.add(pmc0.c);
        arrayList3.addAll(arrayList2);
        arrayList3.add(pmc0.b);
        if (str2.length() > 0) {
            arrayList3.add(yo21Var);
        }
    }

    @Override // p.o4h1
    public final void stop() {
        this.c.c();
    }
}
