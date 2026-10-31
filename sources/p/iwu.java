package p;

import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class iwu implements iu30 {
    public final /* synthetic */ byte a;
    public final yfu b;

    public /* synthetic */ iwu(yfu yfuVar, byte b) {
        this.a = b;
        this.b = yfuVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        yfu yfuVar = this.b;
        switch (b) {
            case 0:
                z460 z460Var = (z460) obj;
                List listA = z460Var.a();
                ArrayList arrayList = new ArrayList(q7h.U(listA, 10));
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    arrayList.add(((s920) yfuVar.b).a(((s520) it.next()).b).map(kc20.b));
                }
                return Observable.zip(arrayList, new pvc((byte) 10)).flatMapCompletable(new yfu(yfuVar, z460Var, (byte) 11));
            default:
                return ((uny) yfuVar.c).l((String) obj);
        }
    }
}
