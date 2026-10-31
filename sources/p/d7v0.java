package p;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class d7v0 extends z511 {
    public final eyh0 d;
    public final e7v0 e;
    public ArrayList f = new ArrayList();

    public d7v0(eyh0 eyh0Var, e7v0 e7v0Var) {
        this.d = eyh0Var;
        this.e = e7v0Var;
        x(true);
    }

    public final int e() {
        return this.f.size();
    }

    public final long f(int i) {
        return ((a2z) this.f.get(i)).b.hashCode();
    }

    public final int g(int i) {
        return this.d.g((a2z) this.f.get(i));
    }

    public final void n(int i, w611 w611Var) {
        a2z a2zVar = (a2z) this.f.get(i);
        a2zVar.getClass();
        w611Var.a.setVisibility(0);
        eyh0 eyh0Var = this.d;
        o01 o01Var = (o01) ((HashMap) eyh0Var.c).get(Integer.valueOf(eyh0Var.g(a2zVar)));
        if (o01Var != null) {
            o01Var.b(a2zVar, w611Var);
        } else {
            eg.m(f4i1.c(w611Var.f, "No AdapterDelegate added for ViewType "));
        }
    }

    public final w611 p(int i, ViewGroup viewGroup) {
        eyh0 eyh0Var = this.d;
        o01 o01Var = (o01) ((HashMap) eyh0Var.c).get(Integer.valueOf(i));
        if (o01Var != null) {
            return o01Var.a((LayoutInflater) eyh0Var.d, viewGroup);
        }
        eg.m(f4i1.c(i, "No AdapterDelegate added for ViewType"));
        return null;
    }

    public final void t(w611 w611Var) {
        int iN = w611Var.n();
        if (iN > -1) {
            a2z a2zVar = (a2z) this.f.get(iN);
            a2zVar.getClass();
            eyh0 eyh0Var = this.d;
            if (((o01) ((HashMap) eyh0Var.c).get(Integer.valueOf(eyh0Var.g(a2zVar)))) != null) {
                return;
            }
            eg.m(f4i1.c(w611Var.f, "No AdapterDelegate added for ViewType "));
        }
    }

    public final void u(w611 w611Var) {
        int iN = w611Var.n();
        if (iN > -1) {
            a2z a2zVar = (a2z) this.f.get(iN);
            a2zVar.getClass();
            eyh0 eyh0Var = this.d;
            if (((o01) ((HashMap) eyh0Var.c).get(Integer.valueOf(eyh0Var.g(a2zVar)))) != null) {
                return;
            }
            eg.m(f4i1.c(w611Var.f, "No AdapterDelegate added for ViewType "));
        }
    }
}
