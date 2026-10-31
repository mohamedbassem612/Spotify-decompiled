package p;

import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class p5b implements Init {
    public static final p5b a = new p5b();

    public final First e0(Object obj) {
        s5b s5bVar = (s5b) obj;
        m87 m87Var = s5bVar.a;
        if (m87Var instanceof x5b) {
            String str = ((x5b) m87Var).j;
            return First.c(s5bVar, (str == null || str.length() == 0) ? Collections.singleton(y4b.g) : Collections.singleton(new c5b(str)));
        }
        if (m87Var instanceof y5b) {
            return First.c(s5bVar, Collections.singleton(b5b.g));
        }
        if (m87Var instanceof w5b) {
            return First.c(s5bVar, Collections.singleton(a5b.g));
        }
        eg.o();
        return null;
    }
}
