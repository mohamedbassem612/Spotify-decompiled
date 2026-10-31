package p;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ywa implements uwa {
    public final /* synthetic */ Function0 a;

    public ywa(Function0 function0) {
        this.a = function0;
    }

    @Override // p.uwa
    public final Object a(List list, lnm lnmVar) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new wwa((vwa) it.next(), (Uri) this.a.invoke()));
        }
        return arrayList;
    }
}
