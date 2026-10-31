package p;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class m9v0 implements slq0 {
    public final /* synthetic */ byte a = 0;
    public final xe01 b;

    public m9v0(o241 o241Var, ymd0 ymd0Var, c9n c9nVar) {
        this.b = d5p1.t(new x010(t5p1.i(ymd0Var), yoi1.g(((p241) o241Var).a.map(yz10.c1)), new dwf0(this, (lnm) null, (byte) 14), (byte) 1), c9nVar, ey71.a, new rlq0(b7x.a));
    }

    public static rlq0 b(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((Boolean) entry.getValue()).booleanValue() ? plq0.a : olq0.a);
        }
        return new rlq0(linkedHashMap);
    }

    @Override // p.slq0
    public final Object a(String str, mlq0 mlq0Var, r6h1 r6h1Var, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return Boolean.TRUE;
            default:
                return Boolean.valueOf(!u890.j(((rlq0) this.b.a.getValue()).a.get(str), plq0.a));
        }
    }

    @Override // p.slq0
    public final zob1 getStatus() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b;
    }

    public m9v0(c9n c9nVar, c9v0 c9v0Var) {
        this.b = d5p1.t(new m9r0(c9v0Var.a(), this, (byte) 20), c9nVar, ey71.a, b(((j9v0) c9v0Var.a().getValue()).a));
    }
}
