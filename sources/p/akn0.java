package p;

import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class akn0 implements zjn0 {
    public final mgy0 a;
    public final kgy0 b;

    public akn0(mgy0 mgy0Var, kgy0 kgy0Var) {
        this.a = mgy0Var;
        this.b = kgy0Var;
    }

    public final boolean a(int i) {
        return ((Boolean) c(i).c).booleanValue();
    }

    public final String b(int i) {
        yvg1 yvg1VarC = c(i);
        List list = (List) yvg1VarC.a;
        String strY0 = o7h.y0((List) yvg1VarC.b, ".", (String) null, (String) null, (iu30) null, 62);
        if (list.isEmpty()) {
            return strY0;
        }
        return o7h.y0(list, "/", (String) null, (String) null, (iu30) null, 62) + '/' + strY0;
    }

    public final yvg1 c(int i) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        while (i != -1) {
            jgy0 jgy0Var = (jgy0) this.b.b.get(i);
            String str = (String) this.a.b.get(jgy0Var.d);
            igy0 igy0Var = jgy0Var.e;
            igy0Var.getClass();
            int iOrdinal = igy0Var.ordinal();
            if (iOrdinal == 0) {
                linkedList2.addFirst(str);
            } else if (iOrdinal == 1) {
                linkedList.addFirst(str);
            } else {
                if (iOrdinal != 2) {
                    eg.o();
                    return null;
                }
                linkedList2.addFirst(str);
                z = true;
            }
            i = jgy0Var.c;
        }
        return new yvg1(linkedList, linkedList2, Boolean.valueOf(z));
    }

    public final String getString(int i) {
        return (String) this.a.b.get(i);
    }
}
