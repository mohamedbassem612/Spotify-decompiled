package p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x3f0 implements lhm {
    public final ynb0 a;
    public final ynb0 b;
    public final jo20 c;

    public x3f0(jo20 jo20Var, ynb0 ynb0Var, ynb0 ynb0Var2) {
        this.a = ynb0Var;
        this.b = ynb0Var2;
        this.c = jo20Var;
    }

    public final mr20 a(gpt gptVar) {
        return new ht20(new b8d0(rqt0.u(new qsc0(yoi1.g(((g0l) this.b.get()).j()), this, gptVar, (byte) 5)), this, (byte) 14), new v4e0(this, gptVar, (lnm) null, (byte) 6));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    public final z3f0 b(String str, List list) {
        Object next;
        boolean zK;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            l0l l0lVar = (l0l) next;
            if (u890.j(l0lVar.j(), str) && !l0lVar.l()) {
                break;
            }
        }
        l0l l0lVar2 = (l0l) next;
        if (l0lVar2 == null) {
            l0lVar2 = null;
        } else {
            if (!this.c.isEnabled()) {
                zK = l0lVar2.k();
            } else if (l0lVar2.k()) {
                int i = l0lVar2.i();
                if ((i & 2) == 0 && (i & 4) == 0 && (i & 8) == 0) {
                    zK = true;
                } else {
                    zK = false;
                }
            } else {
                zK = false;
            }
            if (!zK) {
                l0lVar2 = null;
            }
        }
        if (l0lVar2 != null) {
            return new z3f0(l0lVar2.j(), l0lVar2.G().a);
        }
        return null;
    }

    public final uhm getType() {
        return uhm.c;
    }
}
