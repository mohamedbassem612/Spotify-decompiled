package p;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class k740 {
    public final uu00 a;
    public final krh b;
    public final kly0 c;
    public final mr20 d;
    public final llm e;
    public Map f;
    public final bpb1 g;
    public final bpb1 h;

    public k740(uu00 uu00Var, krh krhVar, r7q r7qVar, q8n q8nVar, mr20 mr20Var) {
        this.a = uu00Var;
        this.b = krhVar;
        this.c = r7qVar;
        this.d = mr20Var;
        this.e = cy30.t(q8nVar);
        b7x b7xVar = b7x.a;
        this.f = b7xVar;
        this.g = gio1.b(b7xVar);
        this.h = gio1.b(b7xVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final x440 a(String str, Map map, Map map2) throws NoWhenBranchMatchedException {
        s640 s640Var = (s640) this.f.get(str);
        if (s640Var != null) {
            if (u890.j(map2.get(s640Var), u640.a)) {
                return v440.a;
            }
            y640 y640Var = (d740) map.get(s640Var);
            if (u890.j(y640Var, b740.a)) {
                return u440.a;
            }
            if (y640Var instanceof y640) {
                return new r440(y640Var.b());
            }
            if (y640Var instanceof w640) {
                return new p440(((w640) y640Var).a());
            }
            if (y640Var instanceof c740) {
                return new w440(((c740) y640Var).a());
            }
            if (y640Var instanceof z640) {
                z640 z640Var = (z640) y640Var;
                return new s440(z640Var.b(), z640Var.a());
            }
            if (y640Var instanceof x640) {
                x640 x640Var = (x640) y640Var;
                return new q440(x640Var.a(), x640Var.b(), x640Var.c());
            }
            if (!u890.j(y640Var, a740.a) && y640Var != null) {
                eg.o();
                return null;
            }
        }
        return t440.a;
    }

    public final void b(s640 s640Var, v640 v640Var) {
        bpb1 bpb1Var;
        Object value;
        LinkedHashMap linkedHashMapX;
        do {
            bpb1Var = this.h;
            value = bpb1Var.getValue();
            linkedHashMapX = sqg0.X((Map) value);
            linkedHashMapX.put(s640Var, v640Var);
        } while (!bpb1Var.k(value, linkedHashMapX));
    }

    public final void c() {
        c921.y(this.e, (o8n) null, 0, new j020(this, (lnm) null, (byte) 13), 3);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final xe01 d(String str) throws NoWhenBranchMatchedException {
        t83 t83Var = new t83(this, str, (lnm) null, (byte) 3);
        bpb1 bpb1Var = this.g;
        bpb1 bpb1Var2 = this.h;
        return d5p1.t(h5p1.t(bpb1Var, bpb1Var2, t83Var), this.e, new alb1(0L, Long.MAX_VALUE), a(str, (Map) bpb1Var.getValue(), (Map) bpb1Var2.getValue()));
    }

    public final void e() {
        smo1.q(this.e);
        bpb1 bpb1Var = this.g;
        b7x b7xVar = b7x.a;
        bpb1Var.m((Object) null, b7xVar);
        this.h.m((Object) null, b7xVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(String str, onm onmVar) throws NoWhenBranchMatchedException {
        j740 j740Var;
        if (onmVar instanceof j740) {
            j740Var = (j740) onmVar;
            int i = j740Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                j740Var.c = i - Integer.MIN_VALUE;
            } else {
                j740Var = new j740(this, onmVar);
            }
        } else {
            j740Var = new j740(this, onmVar);
        }
        Object objH = j740Var.a;
        int i2 = j740Var.c;
        if (i2 == 0) {
            hm5.M(objH);
            s640 s640Var = (s640) sqg0.G(str, this.f);
            y640 y640Var = (d740) ((Map) this.g.getValue()).get(s640Var);
            if (y640Var instanceof y640) {
                a540 a540VarA = y640Var.a();
                if (a540VarA != null) {
                    return a540VarA;
                }
            } else if (y640Var instanceof z640) {
                j740Var.c = 1;
                objH = c921.H(this.e.a, new p1r(this, s640Var, (lnm) null, (byte) 23), j740Var);
                d9n d9nVar = d9n.a;
                if (objH == d9nVar) {
                    return d9nVar;
                }
            } else if (!(y640Var instanceof c740) && !(y640Var instanceof w640) && !(y640Var instanceof x640) && !u890.j(y640Var, b740.a) && !u890.j(y640Var, a740.a) && y640Var != null) {
                eg.o();
                return null;
            }
            return c540.a;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objH);
        return ((Boolean) objH).booleanValue() ? d540.a : b540.a;
    }
}
