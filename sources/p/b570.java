package p;

import java.util.AbstractList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b570 extends AbstractList {
    public final l670 a;
    public List b = Collections.EMPTY_LIST;
    public final uo5 c;
    public final f670 d;
    public final a570 e;

    public b570(l670 l670Var) {
        je70 je70Var = je70.d;
        this.d = new f670(this, (byte) 2);
        this.e = new a570(this);
        this.a = l670Var;
        this.c = new uo5(l670Var);
    }

    public static void b(b570 b570Var) {
        uo5 uo5Var = b570Var.c;
        ((IdentityHashMap) uo5Var.c).clear();
        ((IdentityHashMap) uo5Var.d).clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        y570 y570Var = (y570) this.b.get(i);
        y570Var.getClass();
        return this.c.x(y570Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }
}
