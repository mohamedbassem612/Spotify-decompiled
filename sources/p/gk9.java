package p;

import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class gk9 {
    public static final Map a;

    static {
        ArrayList arrayList = new ArrayList();
        d7 d7Var = new d7(cih1.f, (byte) 0);
        while (d7Var.hasNext()) {
            cih1 cih1Var = (cih1) d7Var.next();
            UUID uuidA = cih1Var.a();
            mmr0 mmr0Var = uuidA != null ? new mmr0(uuidA, cih1Var) : null;
            if (mmr0Var != null) {
                arrayList.add(mmr0Var);
            }
        }
        a = sqg0.T(arrayList);
    }
}
