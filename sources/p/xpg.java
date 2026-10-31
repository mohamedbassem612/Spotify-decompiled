package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xpg implements hsw {
    public final String a;
    public final bct b;
    public final q8n c;
    public final m720 d;
    public final Set e;
    public final l141 f;
    public final ay8 g;
    public final ay8 h;
    public llm i;
    public xab1 j;
    public final x010 k;
    public final evz l;
    public final yd91 m;

    public xpg(String str, n6r0 n6r0Var, z1p z1pVar, koc0 koc0Var, yha1 yha1Var, bct bctVar, lcq lcqVar, q8n q8nVar, m720 m720Var, Set set) {
        this.a = str;
        this.b = bctVar;
        this.c = q8nVar;
        this.d = m720Var;
        this.e = set;
        this.f = yha1Var.a(str, n6r0Var, bctVar.e);
        d0r d0rVar = bctVar.b;
        ay8 ay8VarF = d3p1.F(d0rVar, w3p1.o(new l4r(pwc0.e, 1, tpg.c, new j4r(tzf.e1), tpg.d), tpg.b), str);
        this.g = ay8VarF;
        ay8 ay8VarL = vxo1.l(d0rVar, str);
        this.h = ay8VarL;
        roc0 roc0Var = (roc0) koc0Var;
        this.k = new x010(roc0Var.d(), new te1(ay8VarL, (byte) 18), new qr0(this, null, (byte) 8), (byte) 1);
        this.l = h5p1.s(roc0Var.d(), new te1(ay8VarF, (byte) 19), new te1(ay8VarL, (byte) 20), new w63(this, (lnm) null, (byte) 3));
        this.m = new yd91(3, new ame(z1pVar, this, (byte) 17));
    }

    public static g3d0 e(g3d0 g3d0Var, Map map) {
        Collection collectionValues = map.values();
        ArrayList arrayList = new ArrayList(q7h.U(collectionValues, 10));
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.add(((tha1) it.next()).getSortOrder());
        }
        if (g3d0Var != null) {
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                do {
                    if (!it2.hasNext()) {
                        g3d0Var = null;
                        break;
                    }
                } while (((g3d0) it2.next()).getClass() != g3d0Var.getClass());
            } else {
                g3d0Var = null;
                break;
            }
            if (g3d0Var != null) {
                return g3d0Var;
            }
        }
        return (g3d0) o7h.s0(arrayList);
    }

    @Override // p.anc0
    public final void a() {
        llm llmVar = this.i;
        if (llmVar != null) {
            smo1.p(llmVar, (CancellationException) null);
        }
        this.i = null;
        xab1 xab1Var = this.j;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.j = null;
    }

    @Override // p.xe91
    public final yd91 d() {
        return this.m;
    }

    @Override // p.hsw, p.xe91
    public final mr20 getShow() {
        return this.k;
    }
}
