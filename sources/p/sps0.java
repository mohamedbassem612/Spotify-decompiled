package p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sps0 extends aa implements v380 {
    public final eps0 a;

    public sps0(eps0 eps0Var) {
        this.a = eps0Var;
    }

    public final int b() {
        return this.a.c;
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        eps0 eps0Var = this.a;
        Object obj2 = eps0Var.get(key);
        if (obj2 != null) {
            return obj2.equals(entry.getValue());
        }
        return entry.getValue() == null && eps0Var.containsKey(entry.getKey());
    }

    public final Iterator iterator() {
        kug1 kug1Var = this.a.b;
        mug1[] mug1VarArr = new mug1[8];
        for (int i = 0; i < 8; i++) {
            mug1VarArr[i] = new oug1((byte) 0);
        }
        return new ups0(kug1Var, mug1VarArr);
    }
}
