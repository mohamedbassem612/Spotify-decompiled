package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class ma31 implements Update {
    public static final ma31 a = new ma31();

    public final Next a(Object obj, Object obj2) {
        ja31 ja31Var;
        ka31 ka31Var = (ka31) obj;
        ha31 ha31Var = (ha31) obj2;
        boolean z = false;
        if (ha31Var instanceof ea31) {
            ea31 ea31Var = (ea31) ha31Var;
            String str = ea31Var.b;
            tv80 tv80Var = ea31Var.c;
            ja31Var = ka31Var instanceof ja31 ? (ja31) ka31Var : null;
            if (ja31Var != null && ja31Var.g) {
                z = true;
            }
            return Next.a(Collections.singleton(new q931(str, tv80Var, z)));
        }
        if (ha31Var instanceof fa31) {
            ja31Var = ka31Var instanceof ja31 ? (ja31) ka31Var : null;
            if (ja31Var != null && ja31Var.g) {
                z = true;
            }
            return Next.a(Collections.singleton(new r931(z)));
        }
        if (!(ha31Var instanceof ga31)) {
            eg.o();
            return null;
        }
        if (ka31Var instanceof ja31) {
            ja31 ja31Var2 = (ja31) ka31Var;
            boolean z2 = ja31Var2.g;
            return Next.i(ja31.a(ja31Var2, !z2), Collections.singleton(z2 ? u931.a : p931.a));
        }
        if (ka31Var instanceof ia31) {
            return Next.j();
        }
        eg.o();
        return null;
    }
}
