package p;

import java.util.ArrayList;
import java.util.ListIterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tkg implements vkg {
    public final zia a = zia.a(ukg.a);
    public final ArrayList b = new ArrayList();

    @Override // p.vkg
    public final void S(xnh1 xnh1Var) {
        a(xnh1Var);
    }

    @Override // p.vkg
    public final void U(n6r0 n6r0Var, qir0 qir0Var) {
        a(new eir0(n6r0Var, qir0Var, 4));
    }

    public final void a(xnh1 xnh1Var) {
        this.b.add(xnh1Var);
        this.a.accept(xnh1Var);
    }

    @Override // p.vkg
    public final void h(n6r0 n6r0Var, qir0 qir0Var) {
        int iNextIndex;
        ArrayList arrayList = this.b;
        xnh1 xnh1Var = (xnh1) o7h.C0(arrayList);
        boolean z = n6r0Var.equals(xnh1Var != null ? xnh1Var.a() : null) && u890.j(xnh1Var.getPageUri(), qir0Var);
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            xnh1 xnh1Var2 = (xnh1) listIterator.previous();
            if (u890.j(xnh1Var2.a(), n6r0Var) && u890.j(xnh1Var2.getPageUri(), qir0Var)) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (iNextIndex != -1) {
            arrayList.remove(iNextIndex);
        }
        if (z) {
            Object obj = (xnh1) o7h.C0(arrayList);
            if (obj == null) {
                obj = ukg.a;
            }
            this.a.accept(obj);
        }
    }

    @Override // p.vkg
    public final zia j() {
        return this.a;
    }

    @Override // p.vkg
    public final void y(e6r0 e6r0Var) {
        h(e6r0Var.a, e6r0Var.b);
    }
}
