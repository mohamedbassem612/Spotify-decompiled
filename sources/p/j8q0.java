package p;

import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j8q0 implements Function {
    public final ArrayList a;

    public j8q0(fo9 fo9Var, t380 t380Var, y1n0 y1n0Var) {
        this.a = o7h.N0(Collections.singletonList(y1n0Var), o7h.N0(t380Var, Collections.singletonList(fo9Var)));
    }

    public ArrayList a() {
        return this.a;
    }

    public Object apply(Object obj) {
        ArrayList arrayList = this.a;
        int iS = zno1.s(q7h.U(arrayList, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Object obj2 : arrayList) {
            linkedHashMap.put(obj2, uml1.T0);
        }
        return linkedHashMap;
    }

    public j8q0(ArrayList arrayList) {
        this.a = arrayList;
    }
}
