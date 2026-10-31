package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sef1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uef1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sef1(uef1 uef1Var, byte b) {
        super(1);
        this.a = b;
        this.b = uef1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        uef1 uef1Var = this.b;
        switch (b) {
            case 0:
                d0r d0rVar = uef1Var.g;
                o3r o3rVar = vdf1.a;
                List listD1 = o7h.d1(((oef1) obj).d, 3);
                ArrayList arrayList = new ArrayList(q7h.U(listD1, 10));
                Iterator it = listD1.iterator();
                while (it.hasNext()) {
                    arrayList.add(new gef1((String) it.next()));
                }
                return t2p1.u(d0rVar, o3rVar, arrayList);
            case 1:
                return gm50.A((oef1) obj, z6x.a, uef1Var.f, uef1Var.t);
            default:
                ((qtr) obj).b(new bgb1((avl1) uef1Var, (lnm) null, (byte) 6));
                return rih1.a;
        }
    }
}
