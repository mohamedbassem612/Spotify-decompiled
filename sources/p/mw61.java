package p;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mw61 implements usi1 {
    public static final mw61 a = new mw61();
    public static final ye90 b = ye90.m(new String[]{"c", "v", "i", "o"});

    @Override // p.usi1
    public final Object h(eha0 eha0Var, float f) {
        if (eha0Var.o() == 1) {
            eha0Var.a();
        }
        eha0Var.c();
        ArrayList arrayListC = null;
        ArrayList arrayListC2 = null;
        ArrayList arrayListC3 = null;
        boolean zH = false;
        while (eha0Var.g()) {
            int iQ = eha0Var.q(b);
            if (iQ == 0) {
                zH = eha0Var.h();
            } else if (iQ == 1) {
                arrayListC = pha0.c(eha0Var, f);
            } else if (iQ == 2) {
                arrayListC2 = pha0.c(eha0Var, f);
            } else if (iQ != 3) {
                eha0Var.u();
                eha0Var.v();
            } else {
                arrayListC3 = pha0.c(eha0Var, f);
            }
        }
        eha0Var.e();
        if (eha0Var.o() == 2) {
            eha0Var.d();
        }
        if (arrayListC == null || arrayListC2 == null || arrayListC3 == null) {
            hhg1.n("Shape data was missing information.");
            return null;
        }
        if (arrayListC.isEmpty()) {
            return new lw61(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = arrayListC.size();
        PointF pointF = (PointF) arrayListC.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) arrayListC.get(i);
            int i2 = i - 1;
            arrayList.add(new deo(itj0.a((PointF) arrayListC.get(i2), (PointF) arrayListC3.get(i2)), itj0.a(pointF2, (PointF) arrayListC2.get(i)), pointF2));
        }
        if (zH) {
            PointF pointF3 = (PointF) arrayListC.get(0);
            int i3 = size - 1;
            arrayList.add(new deo(itj0.a((PointF) arrayListC.get(i3), (PointF) arrayListC3.get(i3)), itj0.a(pointF3, (PointF) arrayListC2.get(0)), pointF3));
        }
        return new lw61(pointF, zH, arrayList);
    }
}
