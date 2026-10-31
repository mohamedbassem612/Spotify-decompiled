package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ln21 {
    public final l370 a;
    public final String b;
    public final v360 c;
    public final tn21 d;
    public final hm5 e;
    public upc f;

    public ln21(ne neVar) {
        l370 l370Var = (l370) neVar.a;
        if (l370Var == null) {
            eg.m("url == null");
            throw null;
        }
        this.a = l370Var;
        this.b = (String) neVar.b;
        t360 t360Var = (t360) neVar.c;
        t360Var.getClass();
        this.c = m5n1.g(t360Var);
        this.d = (tn21) neVar.d;
        this.e = (hm5) neVar.e;
    }

    public final upc a() {
        upc upcVar = this.f;
        if (upcVar != null) {
            return upcVar;
        }
        upc upcVar2 = upc.n;
        upc upcVarY = nyn1.Y(this.c);
        this.f = upcVarY;
        return upcVarY;
    }

    public final ne b() {
        ne neVar = new ne();
        neVar.a = this.a;
        neVar.b = this.b;
        neVar.d = this.d;
        neVar.e = this.e;
        neVar.c = m5n1.i(this.c);
        return neVar;
    }

    public final Object c(Class cls) {
        tka0 tka0VarB = rc11.a.b(cls);
        return ((wdg) tka0VarB).n().cast(this.e.v(tka0VarB));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.a);
        v360 v360Var = this.c;
        if (v360Var.size() != 0) {
            sb.append(", headers=[");
            d7 it = v360Var.iterator();
            int i = 0;
            while (true) {
                d7 d7Var = it;
                if (!d7Var.hasNext()) {
                    sb.append(']');
                    break;
                }
                Object next = d7Var.next();
                int i2 = i + 1;
                if (i < 0) {
                    p7h.T();
                    throw null;
                }
                mmr0 mmr0Var = (mmr0) next;
                String str = (String) mmr0Var.a;
                String str2 = (String) mmr0Var.b;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                if (w4n1.l(str)) {
                    str2 = "██";
                }
                sb.append(str2);
                i = i2;
            }
        }
        e9x e9xVar = e9x.n;
        hm5 hm5Var = this.e;
        if (!u890.j(hm5Var, e9xVar)) {
            sb.append(", tags=");
            sb.append(hm5Var);
        }
        sb.append('}');
        return sb.toString();
    }
}
