package p;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class uya {
    public final ak9 a;
    public final xir b;
    public final t74 c;
    public final yqg d;
    public final q8n e;
    public final llm f;
    public final bpb1 g;
    public final LinkedHashMap h;
    public final LinkedHashMap i;
    public final LinkedHashSet j;
    public final LinkedHashMap k;
    public j0d1 l;
    public final idd1 m;
    public final bpb1 n;

    public uya(ak9 ak9Var, xir xirVar, t74 t74Var, yqg yqgVar, q8n q8nVar) {
        this.a = ak9Var;
        this.b = xirVar;
        this.c = t74Var;
        this.d = yqgVar;
        this.e = q8nVar;
        this.f = l1d.x(q8nVar);
        b7x b7xVar = b7x.a;
        this.g = gio1.b(b7xVar);
        this.h = new LinkedHashMap();
        this.i = new LinkedHashMap();
        this.j = new LinkedHashSet();
        this.k = new LinkedHashMap();
        this.m = new idd1(new vv8(this, (byte) 12));
        this.n = gio1.b(b7xVar);
    }

    public final zob1 a() {
        return this.c.a() ? (zob1) this.m.getValue() : this.n;
    }
}
