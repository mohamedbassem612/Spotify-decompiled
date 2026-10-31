package p;

import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hyq0 implements w310 {
    public final uw0 b;
    public final Object d;
    public final /* synthetic */ byte a = 1;
    public final idd1 c = new idd1(new gyq0(this, (byte) 2));

    public hyq0(uw0 uw0Var, aai0 aai0Var) {
        this.b = uw0Var;
        this.d = aai0Var;
    }

    public final Single b(r9c r9cVar) {
        byte b = this.a;
        idd1 idd1Var = this.c;
        switch (b) {
            case 0:
                lyq0 lyq0Var = (lyq0) this.d;
                List list = lyq0Var.a;
                lyq0Var.a = null;
                if (list == null) {
                    return ((w310) idd1Var.getValue()).b(r9cVar);
                }
                List list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(t4n1.r((u310) it.next()));
                }
                Single singleJust = Single.just(new z310(arrayList, (f410) null, (m510) null, (String) null));
                singleJust.getClass();
                return singleJust;
            default:
                w310 w310Var = (w310) idd1Var.getValue();
                String str = r9cVar.n;
                return w310Var.b((str == null || str.length() == 0) ? r9cVar : r9c.a(r9cVar, (String) null, "com.spotify.your-playlists", false, false, (String) null, false, 262141)).flatMapObservable(ua20.U0).concatMap(new jkp0(this, (byte) 5)).take(25L).toList().map(new vyq0(this, (byte) 0));
        }
    }

    public hyq0(uw0 uw0Var, lyq0 lyq0Var) {
        this.b = uw0Var;
        this.d = lyq0Var;
    }
}
