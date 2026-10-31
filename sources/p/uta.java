package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class uta implements Update {
    public final Next a(Object obj, Object obj2) {
        aua auaVar = (aua) obj;
        kta ktaVar = (kta) obj2;
        if (ktaVar.equals(jta.a)) {
            return Next.a(Collections.singleton(new eta(auaVar.n)));
        }
        if (ktaVar.equals(ita.a)) {
            return Next.a(Collections.singleton(new bta(auaVar.q)));
        }
        if (ktaVar instanceof gta) {
            return Next.a(Collections.singleton(new cta(((gta) ktaVar).a)));
        }
        if (ktaVar.equals(hta.a)) {
            return Next.a(Collections.singleton(dta.a));
        }
        eg.o();
        return null;
    }
}
