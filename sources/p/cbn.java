package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final /* synthetic */ class cbn implements Update {
    public final Next a(Object obj, Object obj2) {
        ebn ebnVar = (ebn) obj;
        abn abnVar = (abn) obj2;
        if (abnVar instanceof zan) {
            String str = ((zan) abnVar).a;
            van vanVar = ebnVar.a;
            return Next.h(ebn.a(ebnVar, str, s321.c(str, vanVar.d, vanVar.c), 1));
        }
        if (abnVar instanceof yan) {
            return Next.a(Collections.singleton(new wan(((yan) abnVar).a)));
        }
        eg.o();
        return null;
    }
}
