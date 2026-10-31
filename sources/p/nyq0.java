package p;

import io.reactivex.rxjava3.core.Single;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nyq0 implements w310 {
    public final uw0 a;
    public final lyq0 b;
    public final zx4 c;
    public final idd1 d = new idd1(new gyq0(this, (byte) 1));

    public nyq0(uw0 uw0Var, lyq0 lyq0Var, zx4 zx4Var) {
        this.a = uw0Var;
        this.b = lyq0Var;
        this.c = zx4Var;
    }

    public final Single b(r9c r9cVar) {
        lyq0 lyq0Var = this.b;
        List list = lyq0Var.a;
        lyq0Var.a = null;
        Single singleJust = list != null ? Single.just(list) : ((w310) this.d.getValue()).b(r9cVar).map(ws10.W0);
        singleJust.getClass();
        return singleJust.flatMap(new myq0(this, r9cVar, (byte) 0));
    }
}
