package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class u86 implements Update {
    public static final u86 a = new u86();

    public final Next a(Object obj, Object obj2) {
        fa6 fa6Var = (fa6) obj;
        m86 m86Var = (m86) obj2;
        z740 z740VarC = fa6Var.a.c();
        Next nextA = null;
        if (z740VarC != null && ((m86Var instanceof u76) || m86Var.equals(j76.a) || m86Var.equals(m76.a))) {
            nextA = Next.a(Collections.singleton(new r56(z740VarC)));
        }
        return nextA == null ? o4o1.v(fa6Var, m86Var) : nextA;
    }
}
