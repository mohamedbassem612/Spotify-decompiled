package p;

import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vjr0 {
    public final ebp a;
    public final q9l1 b;
    public final kly0 c;
    public final dt71 d;
    public final dt71 e;
    public Integer g;
    public Integer h;
    public final LinkedHashMap f = new LinkedHashMap();
    public List i = z6x.a;

    public vjr0(ebp ebpVar, q9l1 q9l1Var, jly0 jly0Var, dt71 dt71Var, dt71 dt71Var2) {
        this.a = ebpVar;
        this.b = q9l1Var;
        this.c = jly0Var;
        this.d = dt71Var;
        this.e = dt71Var2;
    }

    public final xm90 a(int i, z0i z0iVar) {
        String uri;
        vpl vplVarA;
        String strJ;
        LinkedHashMap linkedHashMap = this.f;
        Object objA = linkedHashMap.get(z0iVar);
        if (objA == null) {
            boolean z = z0iVar instanceof w8l1;
            w8l1 w8l1Var = z ? (w8l1) z0iVar : null;
            String str = "";
            if (w8l1Var == null || (uri = w8l1Var.getUri()) == null) {
                uri = "";
            }
            w8l1 w8l1Var2 = z ? (w8l1) z0iVar : null;
            if (w8l1Var2 != null && (vplVarA = w8l1Var2.a()) != null && (strJ = vplVarA.j()) != null) {
                str = strJ;
            }
            objA = this.a.a(new e5l0(new fp80(i, uri, str), (byte) 19), z0iVar, (n2u0) this.c.get());
            linkedHashMap.put(z0iVar, objA);
        }
        return (xm90) objA;
    }
}
