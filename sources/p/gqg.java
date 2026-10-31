package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gqg {
    public final Map a;

    public gqg() {
        this.a = sqg0.J(new mmr0[]{new mmr0("unplayed", new fqg(0, 2131953941, "unplayed", krc0.a)), new mmr0("inprogress", new fqg(1, 2131953940, "inprogress", crc0.a)), new mmr0("finished", new fqg(2, 2131953939, "finished", brc0.a))});
    }

    public vmt a(o571 o571Var, List list, dmt dmtVar) {
        if (o571Var == p471.d) {
            return c(cq41.class).a(list);
        }
        if (o571Var == n571.d && dmtVar.b) {
            return c(qz70.class).a(list);
        }
        if (o571Var == l571.d && dmtVar.a) {
            return c(qz70.class).a(list);
        }
        if (aq8.B(list)) {
            return c(j9c1.class).a(list);
        }
        return list.contains(yy61.MESSAGE) ? c(b6j0.class).a(list) : c(ios.class).a(list);
    }

    public wmt c(Class cls) {
        wmt wmtVar = (wmt) this.a.get(cls);
        if (wmtVar != null) {
            return wmtVar;
        }
        hhg1.n(cy30.j(cls, "No share data provider registered for "));
        return null;
    }

    public gqg(Map map) {
        this.a = map;
    }
}
