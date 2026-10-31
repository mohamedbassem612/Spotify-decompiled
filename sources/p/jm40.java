package p;

import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jm40 implements Function {
    public final ArrayList a;

    public jm40() {
        this.a = new ArrayList();
    }

    public void a(po40 po40Var) {
        this.a.add(po40Var);
    }

    public Object apply(Object obj) {
        Map map = (Map) obj;
        ArrayList arrayList = this.a;
        int iS = zno1.s(q7h.U(arrayList, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Object obj2 : arrayList) {
            f7h f7hVar = (f7h) map.get((String) obj2);
            linkedHashMap.put(obj2, Boolean.valueOf(f7hVar != null ? f7hVar.a : false));
        }
        return linkedHashMap;
    }

    public fjs0 b() {
        return new fjs0(o7h.l1(this.a), false);
    }

    public jm40(ArrayList arrayList) {
        this.a = arrayList;
    }
}
