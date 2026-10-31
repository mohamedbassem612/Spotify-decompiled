package p;

import android.os.Bundle;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class mzn0 {
    public mnn0 a;
    public boolean b;

    public vnn0 a() {
        return new qg0(this);
    }

    public final mnn0 b() {
        mnn0 mnn0Var = this.a;
        if (mnn0Var != null) {
            return mnn0Var;
        }
        eg.m("You cannot access the Navigator's state until the Navigator is attached");
        return null;
    }

    public vnn0 c(vnn0 vnn0Var, Bundle bundle, qon0 qon0Var) {
        return vnn0Var;
    }

    public void d(List list, qon0 qon0Var) {
        mf20 mf20Var = new mf20(z561.V(new sgg1(new j9n0(this, qon0Var, (byte) 14), new i46(list, (byte) 1))));
        while (mf20Var.hasNext()) {
            b().i((hnn0) mf20Var.next());
        }
    }

    public void e(mnn0 mnn0Var) {
        this.a = mnn0Var;
        this.b = true;
    }

    public void f(hnn0 hnn0Var) {
        vnn0 vnn0Var = hnn0Var.b;
        if (vnn0Var == null) {
            vnn0Var = null;
        }
        if (vnn0Var == null) {
            return;
        }
        pon0 pon0Var = new pon0();
        pon0Var.a = true;
        pon0Var.b = false;
        pon0Var.c = -1;
        pon0Var.d = false;
        pon0Var.e = false;
        c(vnn0Var, null, pon0Var.a());
        b().d(hnn0Var);
    }

    public Bundle h() {
        return null;
    }

    public void i(hnn0 hnn0Var, boolean z) {
        List list = (List) b().e.a.getValue();
        if (!list.contains(hnn0Var)) {
            ncn0.j("popBackStack was called with ", hnn0Var, " which does not exist in back stack ", list);
            return;
        }
        ListIterator listIterator = list.listIterator(list.size());
        hnn0 hnn0Var2 = null;
        while (j()) {
            hnn0Var2 = (hnn0) listIterator.previous();
            if (u890.j(hnn0Var2, hnn0Var)) {
                break;
            }
        }
        if (hnn0Var2 != null) {
            b().e(hnn0Var2, z);
        }
    }

    public boolean j() {
        return true;
    }

    public void g(Bundle bundle) {
    }
}
