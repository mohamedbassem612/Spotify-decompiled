package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class h46 implements Iterable, ola0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public h46(smc0 smc0Var) {
        this.a = (byte) 1;
        this.b = smc0Var;
        if (smc0Var.isEmpty()) {
            eg.m("Initialized with empty categorized sources");
            throw null;
        }
    }

    public int b(int i) {
        Iterator it = o7h.d1((List) this.b, i).iterator();
        int iB = 0;
        while (it.hasNext()) {
            iB += ((lj90) it.next()).b();
        }
        return iB;
    }

    public ln90 c(int i) {
        for (lj90 lj90Var : (List) this.b) {
            if (i < lj90Var.b()) {
                return lj90Var.a(i);
            }
            i -= lj90Var.b();
        }
        tw20.p();
        return null;
    }

    public tr80 d(lj90 lj90Var) {
        List list = (List) this.b;
        if (list.contains(lj90Var)) {
            int iB = b(list.indexOf(lj90Var));
            return yoi1.Q(iB, lj90Var.b() + iB);
        }
        eg.m("Check failed.");
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        byte b = this.a;
        byte b2 = 1;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new d7((Object[]) obj, b2);
            case 1:
                ArrayList arrayList = new ArrayList();
                for (lj90 lj90Var : (List) obj) {
                    lj90Var.getClass();
                    tr80 tr80Var = new tr80(0, lj90Var.b() - 1, 1);
                    ArrayList arrayList2 = new ArrayList(q7h.U(tr80Var, 10));
                    lr80 it = tr80Var.iterator();
                    while (((sr80) it).c) {
                        arrayList2.add(lj90Var.a(it.nextInt()));
                    }
                    r7h.W(arrayList2, arrayList);
                }
                return arrayList.iterator();
            case 2:
                return ((n561) obj).iterator();
            case 3:
                return new d7((h661) obj);
            default:
                return new d7((q0z) obj);
        }
    }

    public /* synthetic */ h46(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
