package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lf20 implements fg5 {
    public final fg5 a;
    public final tae1 b;

    public lf20(fg5 fg5Var, tae1 tae1Var) {
        this.a = fg5Var;
        this.b = tae1Var;
    }

    @Override // p.fg5
    public final pf5 F(kf30 kf30Var) {
        if (((Boolean) this.b.invoke(kf30Var)).booleanValue()) {
            return this.a.F(kf30Var);
        }
        return null;
    }

    @Override // p.fg5
    public final boolean d0(kf30 kf30Var) {
        if (((Boolean) this.b.invoke(kf30Var)).booleanValue()) {
            return this.a.d0(kf30Var);
        }
        return false;
    }

    @Override // p.fg5
    public final boolean isEmpty() {
        fg5 fg5Var = this.a;
        if ((fg5Var instanceof Collection) && ((Collection) fg5Var).isEmpty()) {
            return false;
        }
        Iterator it = fg5Var.iterator();
        while (it.hasNext()) {
            kf30 kf30VarB = ((pf5) it.next()).b();
            if (kf30VarB != null && ((Boolean) this.b.invoke(kf30VarB)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.a) {
            kf30 kf30VarB = ((pf5) obj).b();
            if (kf30VarB != null && ((Boolean) this.b.invoke(kf30VarB)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList.iterator();
    }
}
