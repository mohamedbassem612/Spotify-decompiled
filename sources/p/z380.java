package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class z380 implements og51 {
    public final /* synthetic */ byte a;
    public final evm1 b;

    public /* synthetic */ z380(evm1 evm1Var, byte b) {
        this.a = b;
        this.b = evm1Var;
    }

    @Override // p.og51
    public final boolean a(tr3 tr3Var) {
        byte b = this.a;
        evm1 evm1Var = this.b;
        switch (b) {
            case 0:
                sxc0 sxc0Var = tr3Var.b;
                if (!evm1Var.p()) {
                    return false;
                }
                lml lmlVarB = sxc0Var.a.b();
                String str = lmlVarB != null ? lmlVarB.a : null;
                if (sxc0Var.b() || !u890.j(tr3Var.c.a(kf90.a), Boolean.FALSE) || str != null) {
                    return false;
                }
                List list = sxc0Var.a.d;
                if (list.isEmpty()) {
                    return sxc0Var.c instanceof b8e0 ? false : false;
                }
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            d6c0 d6c0Var = (d6c0) it.next();
                            if ((d6c0Var instanceof y5c0) || (d6c0Var instanceof e5c0) || (d6c0Var instanceof y4c0)) {
                            }
                        }
                    }
                    if ((sxc0Var.c instanceof b8e0) || !list.isEmpty()) {
                    }
                }
                return true;
            default:
                List list3 = tr3Var.b.a.d;
                if (!evm1Var.F() || list3.isEmpty()) {
                    return false;
                }
                List list4 = list3;
                if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        if (!(((d6c0) it2.next()) instanceof e5c0)) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }
}
