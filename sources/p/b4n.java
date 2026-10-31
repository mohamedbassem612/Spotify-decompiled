package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class b4n implements Update {
    public static final b4n a = new b4n();

    public final Next a(Object obj, Object obj2) {
        d4n d4nVar = (d4n) obj;
        z3n z3nVar = (z3n) obj2;
        if (z3nVar.equals(y3n.a)) {
            return Next.h(d4n.a(d4nVar, null, 13));
        }
        if (z3nVar instanceof t3n) {
            return Next.a(Collections.singleton(new p3n(d4nVar.a, ((t3n) z3nVar).a)));
        }
        if (z3nVar instanceof v3n) {
            return Next.h(d4n.a(d4nVar, f4n.a, 7));
        }
        boolean z = z3nVar instanceof w3n;
        h4n h4nVar = h4n.a;
        if (z) {
            return u890.j(d4nVar.d, h4nVar) ? Next.h(d4n.a(d4nVar, g4n.a, 7)) : Next.j();
        }
        if (z3nVar instanceof x3n) {
            return Next.h(d4n.a(d4nVar, h4nVar, 7));
        }
        if (z3nVar instanceof u3n) {
            return Next.a(Collections.singleton(o3n.b));
        }
        eg.o();
        return null;
    }
}
