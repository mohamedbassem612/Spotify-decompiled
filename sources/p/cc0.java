package p;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cc0 {
    public final b4n0 a;
    public final syn0 b;
    public final bpb1 c = gio1.b(b7x.a);
    public final LinkedHashMap d = new LinkedHashMap();

    public cc0(b4n0 b4n0Var, syn0 syn0Var) {
        this.a = b4n0Var;
        this.b = syn0Var;
    }

    public final void a(onr0 onr0Var, List list, Map map) {
        Object value;
        Object value2;
        bc0 bc0Var = (bc0) o7h.C0(list);
        ac0 ac0VarA = bc0Var != null ? bc0Var.a() : null;
        bpb1 bpb1Var = this.c;
        if (ac0VarA == null) {
            this.d.remove(onr0Var);
            do {
                value2 = bpb1Var.getValue();
            } while (!bpb1Var.k(value2, sqg0.K(onr0Var, (Map) value2)));
        } else {
            do {
                value = bpb1Var.getValue();
            } while (!bpb1Var.k(value, sqg0.P((Map) value, oqn1.n(onr0Var, ac0VarA))));
        }
        Map map2 = (Map) bpb1Var.getValue();
        if (u890.j(map2, map)) {
            return;
        }
        this.b.h(map2);
    }
}
