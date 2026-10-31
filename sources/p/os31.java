package p;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class os31 {
    public final v02 a;
    public final yrg0 b;
    public final jf01 c;
    public final boolean d;
    public final List e;
    public int f;
    public List g;
    public final ArrayList h;

    public os31(v02 v02Var, yrg0 yrg0Var, jf01 jf01Var, boolean z) {
        List listK;
        this.a = v02Var;
        this.b = yrg0Var;
        this.c = jf01Var;
        this.d = z;
        z6x z6xVar = z6x.a;
        this.e = z6xVar;
        this.g = z6xVar;
        this.h = new ArrayList();
        l370 l370Var = v02Var.h;
        xa00 xa00Var = jf01Var.e;
        xa00Var.s(jf01Var, l370Var);
        URI uriI = l370Var.i();
        if (uriI.getHost() == null) {
            listK = z4n1.k(new Proxy[]{Proxy.NO_PROXY});
        } else {
            List<Proxy> listSelect = v02Var.g.select(uriI);
            List<Proxy> list = listSelect;
            listK = (list == null || list.isEmpty()) ? z4n1.k(new Proxy[]{Proxy.NO_PROXY}) : z4n1.j(listSelect);
        }
        this.e = listK;
        this.f = 0;
        xa00Var.r(jf01Var, l370Var, listK);
    }

    public final boolean a() {
        return this.f < this.e.size() || !this.h.isEmpty();
    }
}
