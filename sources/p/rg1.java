package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class rg1 implements Update {
    public final Next a(Object obj, Object obj2) {
        qg1 qg1Var = (qg1) obj2;
        mh1 mh1Var = ((yg1) obj).d;
        if (qg1Var instanceof lg1) {
            return Next.a(Collections.singleton(new gg1(mh1Var.c.e)));
        }
        if (qg1Var instanceof pg1) {
            return Next.a(Collections.singleton(new kg1(((lh1) mh1Var.b.get(((pg1) qg1Var).a)).e.e)));
        }
        if (qg1Var instanceof og1) {
            return Next.a(Collections.singleton(new jg1(((og1) qg1Var).a)));
        }
        if (qg1Var instanceof ng1) {
            return Next.a(Collections.singleton(new ig1(((ng1) qg1Var).a)));
        }
        if (qg1Var instanceof mg1) {
            return Next.a(Collections.singleton(new hg1(((mg1) qg1Var).a)));
        }
        eg.o();
        return null;
    }
}
