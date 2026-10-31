package p;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public enum qd00 {
    ENTERED(0),
    REJECTED_CLIENT(1),
    DROPPED(2),
    PERSISTED(3),
    REJECTED_BACKEND(4),
    DELIVERED(5),
    DELETED(6),
    UNKNOWN(-1);

    public static final LinkedHashMap b;
    public static final Set c;
    public static final int d;
    public final int a;

    static {
        qd00[] qd00VarArrValues = values();
        int iS = zno1.s(qd00VarArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS < 16 ? 16 : iS);
        for (qd00 qd00Var : qd00VarArrValues) {
            linkedHashMap.put(Integer.valueOf(qd00Var.a), qd00Var);
        }
        b = linkedHashMap;
        qd00[] qd00VarArrValues2 = values();
        ArrayList arrayList = new ArrayList();
        for (qd00 qd00Var2 : qd00VarArrValues2) {
            if (qd00Var2 != UNKNOWN) {
                arrayList.add(qd00Var2);
            }
        }
        Set setP1 = o7h.p1(arrayList);
        c = setP1;
        d = setP1.size();
    }

    qd00(int i) {
        this.a = i;
    }
}
