package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class l3y implements Update {
    public static final l3y a = new l3y();

    public final Next a(Object obj, Object obj2) {
        u3y u3yVar = (u3y) obj;
        g3y g3yVar = (g3y) obj2;
        if (g3yVar instanceof c3y) {
            return Next.h(u3y.a(u3yVar, ((c3y) g3yVar).a, null, 14));
        }
        if (g3yVar instanceof e3y) {
            return Next.i(u3y.a(u3yVar, 0, null, 13), Collections.singleton(new y2y(u3yVar.a, ((e3y) g3yVar).a)));
        }
        if (g3yVar instanceof d3y) {
            return Next.h(u3y.a(u3yVar, 0, ((d3y) g3yVar).a, 11));
        }
        if (g3yVar instanceof f3y) {
            return Next.h(u3y.a(u3yVar, 0, null, 7));
        }
        eg.o();
        return null;
    }
}
