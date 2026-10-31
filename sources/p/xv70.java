package p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xv70 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nm1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xv70(nm1 nm1Var, byte b) {
        super(1);
        this.a = b;
        this.b = nm1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        nm1 nm1Var = this.b;
        switch (b) {
            case 0:
                sv70 sv70Var = (sv70) obj;
                f7c f7cVar = (f7c) nm1Var.g;
                String str = sv70Var.b;
                ipr iprVar = new ipr(f7cVar.a.k(str, f7cVar.d), f7cVar, str, (byte) 4);
                ArrayList arrayList = sv70Var.c;
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((tlt) it.next()).a);
                }
                return hu20.e(new ipr(new pv70(z6x.a, o7h.p1(arrayList2), (String) null, (byte[]) null), iprVar, new vv70(3, (lnm) null, (byte) 0), (byte) 16), new qd0((lnm) null, sv70Var, nm1Var, (byte) 22));
            default:
                ((qtr) obj).b(new gz0(nm1Var, (lnm) null, (byte) 12));
                return rih1.a;
        }
    }
}
