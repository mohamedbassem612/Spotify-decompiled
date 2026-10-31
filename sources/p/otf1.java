package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class otf1 {
    public final idm1 a;
    public final xhm1 b;
    public final LinkedHashMap c = new LinkedHashMap();

    public otf1(idm1 idm1Var, xhm1 xhm1Var) {
        this.a = idm1Var;
        this.b = xhm1Var;
    }

    public final void a(aof1 aof1Var, String str, boolean z) {
        int i;
        LinkedHashMap linkedHashMap = this.c;
        boolean zContainsKey = linkedHashMap.containsKey(aof1Var);
        idm1 idm1Var = this.a;
        if (!z || zContainsKey || str == null) {
            if (z || !zContainsKey) {
                return;
            }
            idm1Var.c((t480) linkedHashMap.remove(aof1Var));
            return;
        }
        int iOrdinal = aof1Var.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                eg.o();
                return;
            }
        } else {
            i = 0;
        }
        linkedHashMap.put(aof1Var, idm1Var.b(this.b, i, str));
    }
}
