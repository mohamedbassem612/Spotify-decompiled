package p;

import com.spotify.mobius.Connection;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k011 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k011(ArrayList arrayList, byte b) {
        super(1);
        this.a = b;
        this.b = arrayList;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ArrayList arrayList = this.b;
        switch (b) {
            case 0:
                ((qv00) obj).b(z1g1.class, arrayList, false);
                return rih1Var;
            case 1:
                ((qv00) obj).b(dxc0.class, arrayList, false);
                return rih1Var;
            case 2:
                ((qv00) obj).b(hll.class, arrayList, false);
                return rih1Var;
            case 3:
                qv00 qv00Var = (qv00) obj;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    qv00Var.a((String) it.next(), m1b1.class, false);
                }
                return rih1Var;
            case 4:
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((Connection) it2.next()).accept(obj);
                }
                return rih1Var;
            default:
                return new fgd1(arrayList.indexOf((ito) obj));
        }
    }
}
