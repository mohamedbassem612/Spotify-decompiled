package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mu2 implements f961 {
    public final uu00 a;
    public final q8n b;

    public mu2(uu00 uu00Var, q8n q8nVar) {
        this.a = uu00Var;
        this.b = q8nVar;
    }

    public final Object a(List list, lnm lnmVar) {
        if (list.isEmpty()) {
            return b7x.a;
        }
        return b5p1.i(new gk(new u70(o4p1.r(flo1.k(this.a, new lu2(o7h.p1(list), (byte) 0)), this.b), (byte) 8), list, (byte) 16), lnmVar);
    }

    public final Object getApi() {
        return this;
    }

    public final void shutdown() {
    }
}
