package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class h81 implements og51 {
    public final /* synthetic */ byte a;

    public /* synthetic */ h81(byte b) {
        this.a = b;
    }

    @Override // p.og51
    public final boolean a(tr3 tr3Var) {
        String str;
        byte b = this.a;
        kf90 kf90Var = kf90.a;
        switch (b) {
            case 0:
                sxc0 sxc0Var = tr3Var.b;
                lml lmlVarB = sxc0Var.a.b();
                str = lmlVarB != null ? lmlVarB.a : null;
                if (!sxc0Var.b() && u890.j(tr3Var.c.a(kf90Var), Boolean.FALSE) && str == null) {
                    List list = sxc0Var.a.d;
                    if (!list.isEmpty()) {
                        List list2 = list;
                        if ((list2 instanceof Collection) && list2.isEmpty()) {
                            return true;
                        }
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            if (!(((d6c0) it.next()) instanceof e5c0)) {
                            }
                        }
                        return true;
                    }
                    if ((sxc0Var.c instanceof b8e0) && list.isEmpty()) {
                        return true;
                    }
                }
                return false;
            case 1:
                sxc0 sxc0Var2 = tr3Var.b;
                w7c0 w7c0Var = tr3Var.c;
                lml lmlVarB2 = sxc0Var2.a.b();
                str = lmlVarB2 != null ? lmlVarB2.a : null;
                if (!sxc0Var2.b() && u890.j(w7c0Var.a(x9v0.a), Boolean.TRUE) && u890.j(w7c0Var.a(kf90Var), Boolean.FALSE) && str == null) {
                    List list3 = sxc0Var2.a.d;
                    if (!list3.isEmpty()) {
                        List list4 = list3;
                        if ((list4 instanceof Collection) && list4.isEmpty()) {
                            return true;
                        }
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            if (!(((d6c0) it2.next()) instanceof z5c0)) {
                            }
                        }
                        return true;
                    }
                    if ((sxc0Var2.c instanceof b8e0) && list3.isEmpty()) {
                        return true;
                    }
                }
                return false;
            case 2:
                List<d6c0> list5 = tr3Var.b.a.d;
                if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                    for (d6c0 d6c0Var : list5) {
                        if ((d6c0Var instanceof q5c0) || (d6c0Var instanceof b5c0)) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                sxc0 sxc0Var3 = tr3Var.b;
                lml lmlVarB3 = sxc0Var3.a.b();
                str = lmlVarB3 != null ? lmlVarB3.a : null;
                if (!sxc0Var3.b() && str == null && u890.j(tr3Var.c.a(kf90Var), Boolean.FALSE)) {
                    List list6 = sxc0Var3.a.d;
                    if (!list6.isEmpty()) {
                        List list7 = list6;
                        if ((list7 instanceof Collection) && list7.isEmpty()) {
                            return true;
                        }
                        Iterator it3 = list7.iterator();
                        while (it3.hasNext()) {
                            if (!(((d6c0) it3.next()) instanceof r5c0)) {
                            }
                        }
                        return true;
                    }
                    if ((sxc0Var3.c instanceof b8e0) && list6.isEmpty()) {
                        return true;
                    }
                }
                return false;
        }
    }
}
