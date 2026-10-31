package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class mmi0 implements Update {
    public static final mmi0 a = new mmi0();

    public final Next a(Object obj, Object obj2) {
        lmi0 lmi0Var = (lmi0) obj2;
        String str = ((omi0) obj).a;
        if (lmi0Var instanceof jmi0) {
            return Next.i(new omi0(str, mgk1.a), Collections.singleton(new hmi0(str, ihc1.e1(((jmi0) lmi0Var).a).toString())));
        }
        if (lmi0Var instanceof kmi0) {
            return Next.h(new omi0(str, !ihc1.y0(ihc1.e1(((kmi0) lmi0Var).a).toString()) ? ifk1.a : ffk1.a));
        }
        if (lmi0Var.equals(imi0.b)) {
            return Next.h(new omi0(str, pgk1.a));
        }
        if (lmi0Var.equals(imi0.c)) {
            return Next.h(new omi0(str, sgk1.a));
        }
        if (lmi0Var.equals(imi0.a)) {
            return Next.h(new omi0(str, dfk1.a));
        }
        eg.o();
        return null;
    }
}
