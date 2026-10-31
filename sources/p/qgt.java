package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qgt implements iu30 {
    public final /* synthetic */ byte a;
    public final beg b;

    public qgt(beg begVar, iwz0 iwz0Var, qx81 qx81Var, o8a0 o8a0Var) {
        this.a = (byte) 2;
        this.b = begVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        beg begVar = this.b;
        switch (b) {
            case 0:
                ucn0 ucn0Var = (ucn0) obj;
                List<y0h1> listN = begVar.n();
                ArrayList arrayList = new ArrayList(q7h.U(listN, 10));
                for (y0h1 y0h1Var : listN) {
                    y0h1Var.getClass();
                    arrayList.add(new qma0(ucn0Var, y0h1Var));
                }
                return arrayList;
            case 1:
                Collection collectionD = begVar.g().d();
                ArrayList arrayList2 = new ArrayList(q7h.U(collectionD, 10));
                Iterator it = collectionD.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new rgt((a8b0) it.next()));
                }
                return arrayList2;
            default:
                kht.f(begVar);
                return null;
        }
    }

    public /* synthetic */ qgt(beg begVar, byte b) {
        this.a = b;
        this.b = begVar;
    }
}
