package p;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class agg1 implements tfg1 {
    public static final agg1 c;
    public int a;
    public List b;

    static {
        List list = Collections.EMPTY_LIST;
        agg1 agg1Var = new agg1();
        agg1Var.a = 2;
        agg1Var.b = list;
        c = agg1Var;
    }

    @Override // p.tfg1
    public final float a(float f) {
        int i = this.a;
        List list = this.b;
        if (i != 1) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((tfg1) it.next()).a(f);
            }
        } else {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                f = ((tfg1) it2.next()).a(f);
            }
        }
        return f;
    }
}
