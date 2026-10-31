package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class kv3 implements Update {
    public static final kv3 a = new kv3();

    public final Next a(Object obj, Object obj2) {
        cw3 cw3Var = (cw3) obj;
        iv3 iv3Var = (iv3) obj2;
        if (iv3Var instanceof gv3) {
            if ((cw3Var instanceof aw3) || (cw3Var instanceof bw3) || (cw3Var instanceof yv3)) {
                return Next.j();
            }
            if (cw3Var instanceof zv3) {
                qu3 qu3Var = ((zv3) cw3Var).a;
                return Next.i(new aw3(qu3Var), Collections.singleton(new su3(qu3Var.c)));
            }
            eg.o();
            return null;
        }
        if (iv3Var instanceof dv3) {
            return Next.a(Collections.singleton(ru3.a));
        }
        if (iv3Var instanceof hv3) {
            String str = ((hv3) iv3Var).a;
            return Next.i(new bw3(str), Collections.singleton(new tu3(str)));
        }
        if (iv3Var.equals(ev3.a) || iv3Var.equals(fv3.a)) {
            return Next.h(new yv3());
        }
        eg.o();
        return null;
    }
}
