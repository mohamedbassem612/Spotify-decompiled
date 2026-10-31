package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class k88 implements Update {
    public final Next a(Object obj, Object obj2) {
        o88 o88Var = (o88) obj;
        j88 j88Var = (j88) obj2;
        a10 a10Var = o88Var.a.f;
        ph1 ph1Var = o88Var.e;
        if (j88Var instanceof h88) {
            return Next.a(Collections.singleton(new f88(ph1Var, a10Var.b)));
        }
        if (j88Var instanceof i88) {
            return Next.a(Collections.singleton(new g88(ph1Var, a10Var.b)));
        }
        eg.o();
        return null;
    }
}
