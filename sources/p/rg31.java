package p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rg31 implements f961 {
    public final uu00 a;
    public final q8n b;

    public rg31(uu00 uu00Var, q8n q8nVar) {
        this.a = uu00Var;
        this.b = q8nVar;
    }

    public final Object a(List list, lnm lnmVar) {
        if (list.isEmpty()) {
            return b7x.a;
        }
        Set setP1 = o7h.p1(list);
        return b5p1.i(new mpy0(new wzv0(new h5y0(o4p1.r(flo1.k(this.a, new lu2(setP1, (byte) 5)), this.b), (byte) 28), (byte) 11), setP1, this, (byte) 7), lnmVar);
    }

    public final Object getApi() {
        return this;
    }

    public final void shutdown() {
    }
}
