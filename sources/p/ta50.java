package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class ta50 implements Update {
    public final Next a(Object obj, Object obj2) {
        va50 va50Var = (va50) obj;
        oa50 oa50Var = (oa50) obj2;
        String str = va50Var.b;
        String str2 = va50Var.c;
        if (oa50Var instanceof ma50) {
            return ((ma50) oa50Var).a ? Next.i(new va50(3, str, str2), Collections.singleton(new ka50(true))) : Next.i(new va50(4, str, str2), Collections.singleton(new ka50(false)));
        }
        if (oa50Var instanceof na50) {
            return Next.i(new va50(2, str, str2), Collections.singleton(new ja50(((na50) oa50Var).a)));
        }
        if (oa50Var.equals(la50.a)) {
            return Next.i(new va50(2, str, str2), Collections.singleton(new ia50(str2, str)));
        }
        eg.o();
        return null;
    }
}
