package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lnn0 {
    public final cc0 a;
    public final LinkedHashMap b = new LinkedHashMap();

    public lnn0(cc0 cc0Var, dg30 dg30Var) {
        this.a = cc0Var;
        ((f0i) dg30Var).a.a(new i83(this, (byte) 13));
    }

    public final knn0 a(onr0 onr0Var, int i, String str) {
        String strName = onr0Var.name();
        String strL = jup0.l(i);
        if (str == null) {
            str = "";
        }
        String str2 = strName + ":" + strL + ":" + str;
        pnr0 pnr0Var = new pnr0(onr0Var, i);
        LinkedHashMap linkedHashMap = this.b;
        Object obj = linkedHashMap.get(str2);
        if (obj == null) {
            hfb hfbVar = new hfb((byte) 17);
            knn0 knn0Var = new knn0(new ntf0(this, hfbVar, onr0Var, pnr0Var, (byte) 16), new dt90(this, hfbVar, onr0Var, (byte) 27));
            linkedHashMap.put(str2, knn0Var);
            obj = knn0Var;
        }
        return (knn0) obj;
    }
}
