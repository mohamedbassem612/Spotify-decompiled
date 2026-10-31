package p;

import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class b9l1 {
    public final ttm0 a;
    public final zau0 b;
    public final LinkedList c;

    public b9l1(q7r0 q7r0Var) {
        ttm0 ttm0VarE = cwl1.E(q7r0Var);
        this.a = ttm0VarE;
        this.b = ttm0VarE.c(true);
        this.c = new LinkedList();
        iac0 iac0Var = q7r0Var.d.c;
        iac0Var.getLifecycle().a(new eet0(this, iac0Var, (byte) 1));
    }

    public final r091 a(r091 r091Var) {
        zau0 zau0Var;
        LinkedList linkedList = this.c;
        if (r091Var != null && !((Boolean) r091Var.e.b.getValue()).booleanValue()) {
            Iterator it = linkedList.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (u890.j((r091) it.next(), r091Var)) {
                    break;
                }
                i++;
            }
            if (i != -1 && i != p7h.L(linkedList)) {
                linkedList.add((r091) linkedList.remove(i));
            }
            return r091Var;
        }
        linkedList.removeIf(z8l1.c);
        while (true) {
            zau0Var = this.b;
            if (zau0Var.b() != 0 || linkedList.isEmpty()) {
                break;
            }
            r091 r091Var2 = (r091) linkedList.poll();
            if (r091Var2 != null) {
                r091Var2.g();
            }
        }
        r091 r091VarA = zau0Var.a();
        if (r091VarA == null) {
            return null;
        }
        linkedList.add(r091VarA);
        return r091VarA;
    }
}
