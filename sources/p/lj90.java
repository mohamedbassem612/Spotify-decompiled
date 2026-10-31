package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lj90 {
    public final int a;
    public final o9e b;
    public final List c;
    public final Integer d;
    public final q6t0 e;

    public lj90(int i, o9e o9eVar, ArrayList arrayList, Integer num, q6t0 q6t0Var) {
        this.a = i;
        this.b = o9eVar;
        this.c = arrayList;
        this.d = num;
        this.e = q6t0Var;
    }

    public final ln90 a(int i) {
        q6t0 q6t0Var;
        if (i == 0) {
            return this.b;
        }
        int i2 = i - 1;
        List list = this.c;
        if (i2 < list.size()) {
            return (ln90) list.get(i2);
        }
        if (i2 == 0 && (q6t0Var = this.e) != null) {
            return q6t0Var;
        }
        tw20.p();
        return null;
    }

    public final int b() {
        int size;
        List list = this.c;
        if (list.isEmpty()) {
            size = this.e != null ? 1 : 0;
        } else {
            Integer num = this.d;
            size = (num == null || list.size() <= num.intValue()) ? list.size() : num.intValue();
        }
        return 1 + size;
    }
}
