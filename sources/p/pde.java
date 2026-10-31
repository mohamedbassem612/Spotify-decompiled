package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class pde implements Update {
    public static final pde a = new pde();

    public final Next a(Object obj, Object obj2) {
        nde ndeVar = (ode) obj2;
        String str = ((rde) obj).a;
        if (ndeVar.equals(lde.a)) {
            return Next.a(Collections.singleton(dde.a));
        }
        if (ndeVar.equals(lde.b)) {
            return Next.h(new rde(str, yde.a));
        }
        if (ndeVar.equals(lde.c)) {
            return Next.a(Collections.singleton(cde.a));
        }
        if (ndeVar.equals(lde.d)) {
            return Next.i(new rde(str, zde.a), Collections.singleton(new ede(str)));
        }
        if (ndeVar instanceof mde) {
            return Next.h(new rde(((mde) ndeVar).a, aee.a));
        }
        if (ndeVar instanceof nde) {
            return Next.h(new rde(ndeVar.a, xde.a));
        }
        eg.o();
        return null;
    }
}
