package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class q5b implements Update {
    public static final q5b a = new q5b();

    public final Next a(Object obj, Object obj2) {
        n5b n5bVar = (n5b) obj2;
        m87 m87Var = ((s5b) obj).a;
        if (!(m87Var instanceof x5b)) {
            return Next.j();
        }
        if (n5bVar instanceof m5b) {
            x5b x5bVar = (x5b) m87Var;
            return x5bVar.d ? Next.j() : Next.i(new s5b(x5b.E(x5bVar, true)), f46.S0(new z47[]{new t4b(x5bVar.e), x4b.g}));
        }
        if (n5bVar instanceof h5b) {
            boolean z = ((x5b) m87Var).k;
            String str = ((h5b) n5bVar).a;
            return z ? Next.a(Effects.a(new z4b[]{new z4b(str)})) : Next.a(Effects.a(new c5b[]{new c5b(str)}));
        }
        if (n5bVar instanceof j5b) {
            return Next.a(Effects.a(new u4b[]{u4b.g}));
        }
        return n5bVar instanceof i5b ? Next.i(new s5b(x5b.E((x5b) m87Var, false)), Collections.singleton(e5b.g)) : Next.j();
    }
}
