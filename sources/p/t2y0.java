package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class t2y0 implements Update {
    public static final t2y0 a = new t2y0();

    public final Next a(Object obj, Object obj2) {
        t67 t67Var = (t67) obj;
        r67 r67Var = (r67) obj2;
        if (r67Var instanceof q67) {
            return Next.h(t67.a(t67Var, op41.b, ((q67) r67Var).a, 1));
        }
        if (r67Var.equals(p67.a)) {
            return Next.h(t67.a(t67Var, op41.a, 0, 5));
        }
        eg.o();
        return null;
    }
}
