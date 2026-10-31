package p;

import io.reactivex.rxjava3.functions.Function;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g11 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u11 b;

    public /* synthetic */ g11(u11 u11Var, byte b) {
        this.a = b;
        this.b = u11Var;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        u11 u11Var = this.b;
        switch (b) {
            case 0:
                return new d1f0(u11Var.j.n, ((e331) obj).a);
            default:
                oi8 oi8Var = (oi8) obj;
                Iterator it = ((Set) u11Var.e.get()).iterator();
                while (it.hasNext()) {
                    ((ol8) it.next()).a(oi8Var.a);
                }
                return qi8.a;
        }
    }
}
