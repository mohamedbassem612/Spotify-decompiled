package p;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class um1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wm1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ um1(wm1 wm1Var, byte b) {
        super(1);
        this.a = b;
        this.b = wm1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        wm1 wm1Var = this.b;
        String quantityString = null;
        switch (b) {
            case 0:
                ((qtr) obj).b(new gz0(wm1Var, (lnm) null, (byte) 2));
                return rih1Var;
            default:
                y231 y231Var = (d331) obj;
                bpb1 bpb1Var = wm1Var.i;
                if (y231Var instanceof y231) {
                    uof uofVar = ((vof) y231Var.a).a;
                    if (uofVar instanceof rof) {
                        List list = ((rof) uofVar).a;
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((jwm) it.next()).a.b);
                        }
                        int size = arrayList.size();
                        if (size != 0) {
                            Context context = wm1Var.a;
                            quantityString = size != 1 ? context.getResources().getQuantityString(2131820594, arrayList.size(), Integer.valueOf(arrayList.size())) : context.getString(2131953310, o7h.q0(arrayList));
                        }
                        String str = quantityString;
                        if (str == null) {
                            return rih1Var;
                        }
                        wm1Var.b.k(new er91((fs91) null, str, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                        wm1Var.g.invoke(list);
                        return rih1Var;
                    }
                    if (uofVar instanceof tof) {
                        wm1Var.h.invoke(((tof) uofVar).a);
                        return rih1Var;
                    }
                    if (uofVar instanceof sof) {
                        ugz ugzVar = new ugz(((sof) uofVar).a, true);
                        bpb1Var.getClass();
                        bpb1Var.m((Object) null, ugzVar);
                        return rih1Var;
                    }
                    eg.o();
                } else {
                    if (y231Var.equals(l231.a)) {
                        ugz ugzVar2 = new ugz((piz) null, true);
                        bpb1Var.getClass();
                        bpb1Var.m((Object) null, ugzVar2);
                        return rih1Var;
                    }
                    eg.o();
                }
                return null;
        }
    }
}
