package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class a950 implements Update {
    public static final a950 a = new a950();

    public final Next a(Object obj, Object obj2) {
        k600 k600Var = (k600) obj2;
        if (k600Var instanceof g100) {
            return Next.a(Collections.singleton(new nfw(((g100) k600Var).a)));
        }
        boolean zEquals = k600Var.equals(l000.a);
        saw sawVar = saw.a;
        if (zEquals) {
            return Next.a(Collections.singleton(sawVar));
        }
        if (k600Var instanceof c100) {
            return Next.h(new c950(((c100) k600Var).a));
        }
        if (k600Var.equals(f100.a)) {
            return Next.a(Collections.singleton(abw.a));
        }
        if (k600Var.equals(d100.a)) {
            return Next.a(Collections.singleton(sawVar));
        }
        eg.o();
        return null;
    }
}
