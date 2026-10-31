package p;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class uqb0 implements Function0 {
    public final /* synthetic */ byte a;
    public final yqb0 b;

    public /* synthetic */ uqb0(yqb0 yqb0Var, byte b) {
        this.a = b;
        this.b = yqb0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        yqb0 yqb0Var = this.b;
        switch (b) {
            case 0:
                wgt wgtVar = wgt.m;
                zpi0.a.getClass();
                zqb0 zqb0Var = zqb0.f;
                List list = wgtVar.a;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                if (wgtVar.a(wgt.l)) {
                    Iterator it = yqb0Var.h(wgtVar, zqb0Var).iterator();
                    while (it.hasNext()) {
                        h4p1.d(linkedHashSet, yqb0Var.g((ajn0) it.next(), 13));
                    }
                }
                if (wgtVar.a(wgt.i) && !list.contains(sgt.a)) {
                    Iterator it2 = yqb0Var.i(wgtVar, zqb0Var).iterator();
                    while (it2.hasNext()) {
                        linkedHashSet.addAll(yqb0Var.c((ajn0) it2.next(), 13));
                    }
                }
                if (wgtVar.a(wgt.j) && !list.contains(sgt.a)) {
                    Iterator it3 = yqb0Var.n().iterator();
                    while (it3.hasNext()) {
                        linkedHashSet.addAll(yqb0Var.a((ajn0) it3.next(), 13));
                    }
                }
                return o7h.l1(linkedHashSet);
            case 1:
                return yqb0Var.k();
            case 2:
                return yqb0Var.i(wgt.f49p, null);
            case 3:
                xgc xgcVar = wgt.c;
                return yqb0Var.n();
            default:
                return yqb0Var.h(wgt.o, null);
        }
    }
}
