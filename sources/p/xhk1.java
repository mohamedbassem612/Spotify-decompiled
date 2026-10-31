package p;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.ListIterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xhk1 {
    public static final ien0 a = new ien0(q6x.b);

    public static op80 a(View view) {
        ArrayList arrayList = new ArrayList();
        Object value = q6x.b;
        View view2 = view;
        while (view2 != null) {
            Object tag = view2.getTag(2131431629);
            u601 u601Var = tag instanceof u601 ? (u601) tag : null;
            if (u601Var != null) {
                value = u601Var.getValue();
                break;
            }
            Object tag2 = view2.getTag(2131431628);
            rp80 rp80Var = tag2 instanceof rp80 ? (rp80) tag2 : null;
            Object tag3 = view2.getTag(2131431627);
            rp80 rp80Var2 = tag3 instanceof rp80 ? (rp80) tag3 : null;
            if (rp80Var != null) {
                arrayList.add(new hcf1(1, rp80Var, rp80.class, "aggregate", "aggregate(Lcom/spotify/element/core/instrumentation/InstrumentationEnvironment;)Lcom/spotify/element/core/instrumentation/InstrumentationEnvironment;", 0, (byte) 24));
            }
            if (rp80Var2 != null) {
                arrayList.add(new hcf1(1, rp80Var2, rp80.class, "aggregate", "aggregate(Lcom/spotify/element/core/instrumentation/InstrumentationEnvironment;)Lcom/spotify/element/core/instrumentation/InstrumentationEnvironment;", 0, (byte) 25));
            }
            Object parent = view2.getParent();
            view2 = parent instanceof View ? (View) parent : null;
        }
        if (!arrayList.isEmpty()) {
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (listIterator.hasPrevious()) {
                value = (op80) ((iu30) listIterator.previous()).invoke((op80) value);
            }
        }
        return (op80) value;
    }

    public static u601 b(c9n c9nVar, View view) {
        u601 u601Var;
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (view == null) {
                u601Var = null;
                break;
            }
            Object tag = view.getTag(2131431629);
            u601Var = tag instanceof u601 ? (u601) tag : null;
            if (u601Var != null) {
                break;
            }
            Object tag2 = view.getTag(2131431628);
            rp80 rp80Var = tag2 instanceof rp80 ? (rp80) tag2 : null;
            Object tag3 = view.getTag(2131431627);
            rp80 rp80Var2 = tag3 instanceof rp80 ? (rp80) tag3 : null;
            if (rp80Var != null) {
                arrayList.add(rp80Var);
            }
            if (rp80Var2 != null) {
                arrayList.add(rp80Var2);
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (u601Var == null) {
            u601Var = a;
        }
        if (!arrayList.isEmpty()) {
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (listIterator.hasPrevious()) {
                rp80 rp80Var3 = (rp80) listIterator.previous();
                rp80Var3.b(u601Var, c9nVar.J());
                u601Var = rp80Var3.j;
            }
        }
        fn31.T(c9nVar, (o8n) null, 0, new fkj1(u601Var, (lnm) null, (byte) 8), 3);
        return u601Var;
    }

    public static final void c(View view, op80 op80Var) {
        d(view, new fom(op80Var, (byte) 1));
    }

    public static final void d(View view, sp80 sp80Var) {
        Object tag = view.getTag(2131431627);
        rp80 rp80Var = tag instanceof rp80 ? (rp80) tag : null;
        if (rp80Var != null) {
            rp80Var.d(sp80Var);
        } else {
            view.setTag(2131431627, new rp80(sp80Var));
        }
    }

    public static final void e(View view, sp80 sp80Var) {
        Object tag = view.getTag(2131431628);
        rp80 rp80Var = tag instanceof rp80 ? (rp80) tag : null;
        if (rp80Var != null) {
            rp80Var.d(sp80Var);
        } else {
            view.setTag(2131431628, new rp80(sp80Var));
        }
    }

    public static final void f(ViewGroup viewGroup, u601 u601Var) {
        Object tag = viewGroup.getTag(2131431629);
        j931 j931Var = tag instanceof j931 ? (j931) tag : null;
        if (j931Var != null) {
            j931Var.b.m((Object) null, u601Var);
        } else {
            viewGroup.setTag(2131431629, new j931(viewGroup, u601Var));
        }
    }
}
