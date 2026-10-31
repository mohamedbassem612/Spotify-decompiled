package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ocb0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qcb0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ocb0(qcb0 qcb0Var, byte b) {
        super(1);
        this.a = b;
        this.b = qcb0Var;
    }

    public final Object invoke(Object obj) {
        int i;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        qcb0 qcb0Var = this.b;
        switch (b) {
            case 0:
                if (!((bdb0) obj).equals(bdb0.a)) {
                    eg.o();
                    return null;
                }
                pbb0 pbb0Var = qcb0Var.I1;
                if (pbb0Var == null) {
                    u890.C("navigator");
                    throw null;
                }
                th30 th30Var = pbb0Var.a;
                if (th30Var.G(obb0.class.getName()) != null) {
                    return rih1Var;
                }
                pbb0Var.b.a().g1(th30Var, obb0.class.getName());
                return rih1Var;
            case 1:
                if (pcb0.a[((d8x) obj).ordinal()] == 1) {
                    ((gdb0) qcb0Var.L1.getValue()).V();
                    return rih1Var;
                }
                eg.o();
                return null;
            default:
                kcb0 kcb0Var = (kcb0) obj;
                gdb0 gdb0Var = (gdb0) qcb0Var.L1.getValue();
                kdn0 kdn0Var = gdb0Var.h;
                if (((mdb0) kdn0Var.e()) instanceof idb0) {
                    List<kcb0> list = gdb0Var.t;
                    ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                    for (kcb0 kcb0Var2 : list) {
                        if (u890.j(kcb0Var2.a.b, kcb0Var.a.b)) {
                            kcb0Var2 = new kcb0(kcb0Var2.a, !kcb0Var2.b);
                        }
                        arrayList.add(kcb0Var2);
                    }
                    if (arrayList.isEmpty()) {
                        i = 0;
                    } else {
                        Iterator it = arrayList.iterator();
                        i = 0;
                        while (it.hasNext()) {
                            if (((kcb0) it.next()).b && (i = i + 1) < 0) {
                                p7h.S();
                                throw null;
                            }
                        }
                    }
                    if (i < 1) {
                        gdb0Var.i.m(new cdb0());
                        z = false;
                    } else {
                        gdb0Var.t = arrayList;
                        kdn0Var.m(new idb0(arrayList));
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
