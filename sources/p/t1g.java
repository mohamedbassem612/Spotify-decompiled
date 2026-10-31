package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class t1g implements Update {
    public static final t1g a = new t1g();

    public final Next a(Object obj, Object obj2) {
        v1g v1gVar = (v1g) obj;
        m1g m1gVar = (m1g) obj2;
        zzy zzyVar = v1gVar.d;
        String str = v1gVar.a;
        if (v1gVar.g) {
            return Next.j();
        }
        if (m1gVar.equals(j1g.a)) {
            pe11 pe11Var = v1gVar.f;
            pe11 pe11Var2 = pe11.d;
            return pe11Var == pe11Var2 ? Next.j() : Next.i(v1g.a(v1gVar, null, pe11Var2, false, false, 223), Collections.singleton(new d1g(str, v1gVar.e)));
        }
        if (m1gVar instanceof l1g) {
            return Next.h(v1g.a(v1gVar, ((l1g) m1gVar).a, pe11.c, false, false, 219));
        }
        if (m1gVar.equals(k1g.a)) {
            return Next.h(v1g.a(v1gVar, null, pe11.e, false, false, 223));
        }
        if (m1gVar.equals(g1g.a)) {
            return Next.i(v1g.a(v1gVar, null, null, true, false, 191), Collections.singleton(new b1g(zzyVar, v1gVar.b, str)));
        }
        if (m1gVar.equals(h1g.a)) {
            return Next.a(Collections.singleton(new c1g(str, zzyVar)));
        }
        if (m1gVar.equals(f1g.a)) {
            return Next.h(v1g.a(v1gVar, null, null, false, true, 127));
        }
        if (m1gVar.equals(i1g.a)) {
            return Next.h(v1g.a(v1gVar, null, null, false, false, 127));
        }
        eg.o();
        return null;
    }
}
