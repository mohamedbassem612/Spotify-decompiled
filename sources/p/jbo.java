package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jbo {
    public final Object a = new Object();
    public hbo b;
    public ibo c;

    public final obo a(String str) {
        obo oboVar;
        synchronized (this.a) {
            hbo hboVar = this.b;
            oboVar = null;
            if (hboVar != null) {
                if (!u890.j(hboVar.a, str)) {
                    hboVar = null;
                }
                if (hboVar != null) {
                    oboVar = hboVar.b;
                }
            }
        }
        return oboVar;
    }

    public final void b(String str, ArrayList arrayList) {
        synchronized (this.a) {
            this.c = new ibo(str, o7h.l1(arrayList), 0);
        }
    }
}
