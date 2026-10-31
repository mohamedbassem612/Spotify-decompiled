package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fuf0 {
    public final mwh0 a;

    public fuf0(mwh0 mwh0Var) {
        this.a = mwh0Var;
    }

    public final boolean a(String str, String str2) {
        mwh0 mwh0Var = this.a;
        List listA = mwh0Var.g().a();
        if (!(listA instanceof Collection) || !listA.isEmpty()) {
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                if (ihc1.h0(((vuh0) it.next()).a, str, false)) {
                    return true;
                }
            }
        }
        if (str2 == null) {
            return false;
        }
        List<vuh0> listA2 = mwh0Var.g().a();
        if ((listA2 instanceof Collection) && listA2.isEmpty()) {
            return false;
        }
        for (vuh0 vuh0Var : listA2) {
            String str3 = vuh0Var.a;
            if (u890.j(vuh0Var.b, str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) {
        euf0 euf0Var;
        if (onmVar instanceof euf0) {
            euf0Var = (euf0) onmVar;
            int i = euf0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                euf0Var.c = i - Integer.MIN_VALUE;
            } else {
                euf0Var = new euf0(this, onmVar);
            }
        } else {
            euf0Var = new euf0(this, onmVar);
        }
        Object obj = euf0Var.a;
        int i2 = euf0Var.c;
        boolean z = true;
        if (i2 == 0) {
            hm5.M(obj);
            euf0Var.c = 1;
            Object objI = hap1.i(200L, euf0Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        List<vuh0> listA = this.a.g().a();
        if ((listA instanceof Collection) && listA.isEmpty()) {
            z = false;
        } else {
            for (vuh0 vuh0Var : listA) {
                String str = vuh0Var.a;
                if (vuh0Var.d == 2) {
                }
            }
            z = false;
        }
        return yah0.m(z);
    }
}
