package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gn01 {
    public static final bma1 d = bma1.b.u("YourLibraryX.recentSearches");
    public final Scheduler a;
    public final dma1 b;
    public final AtomicBoolean c = new AtomicBoolean(false);

    public gn01(Context context, ut71 ut71Var, String str, Scheduler scheduler) {
        this.a = scheduler;
        this.b = ut71Var.b(context, str);
    }

    public final ArrayList a() {
        ArrayList arrayList;
        String strE = this.b.e(d, (String) null);
        if (strE != null) {
            List listP0 = ihc1.P0(strE, new char[]{','}, 6);
            arrayList = new ArrayList();
            for (Object obj : listP0) {
                Set set = s4b1.f;
                if (uic.x((String) obj).c != blc0.o6) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = z6x.a;
        }
        return new ArrayList(arrayList);
    }

    public final void b(ArrayList arrayList) {
        hma1 hma1VarEdit = this.b.edit();
        hma1VarEdit.d(d, o7h.y0(o7h.d1(arrayList, 10), ",", (String) null, (String) null, (iu30) null, 62));
        hma1VarEdit.h();
    }
}
