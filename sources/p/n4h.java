package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class n4h extends apn0 {
    public Object g() {
        return new double[0];
    }

    public List h(Object obj) {
        double[] dArr = (double[]) obj;
        if (dArr == null) {
            return z6x.a;
        }
        List listM0 = f46.M0(dArr);
        ArrayList arrayList = new ArrayList(q7h.U(listM0, 10));
        Iterator it = listM0.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).doubleValue()));
        }
        return arrayList;
    }
}
