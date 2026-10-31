package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class cb50 implements Update {
    public static final cb50 a = new cb50();

    public final Next a(Object obj, Object obj2) {
        l600 l600Var = (l600) obj2;
        if (l600Var.equals(n000.a)) {
            return Next.a(Collections.singleton(r9w.a));
        }
        if (l600Var instanceof l100) {
            return Next.a(Collections.singleton(new fdw(((l100) l600Var).a)));
        }
        eg.o();
        return null;
    }
}
