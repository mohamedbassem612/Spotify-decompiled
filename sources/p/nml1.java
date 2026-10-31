package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class nml1 implements Update {
    public static final nml1 a = new nml1();

    public final Next a(Object obj, Object obj2) {
        e600 e600Var = (e600) obj2;
        if (e600Var instanceof w000) {
            return Next.a(Collections.singleton(new scw(((w000) e600Var).a)));
        }
        if (e600Var.equals(t000.a)) {
            return Next.a(Collections.singleton(y9w.c));
        }
        eg.o();
        return null;
    }
}
