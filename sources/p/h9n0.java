package p;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class h9n0 {
    public final eu4 a;
    public final xrc0 b;
    public final bmj1 c;

    public h9n0(eu4 eu4Var, xrc0 xrc0Var, bmj1 bmj1Var) {
        this.a = eu4Var;
        this.b = xrc0Var;
        this.c = bmj1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, onm onmVar) {
        g9n0 g9n0Var;
        if (onmVar instanceof g9n0) {
            g9n0Var = (g9n0) onmVar;
            int i = g9n0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                g9n0Var.c = i - Integer.MIN_VALUE;
            } else {
                g9n0Var = new g9n0(this, onmVar);
            }
        } else {
            g9n0Var = new g9n0(this, onmVar);
        }
        Object objJ = g9n0Var.a;
        int i2 = g9n0Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            if (!b(str)) {
                return Boolean.FALSE;
            }
            rxc0 rxc0Var = new rxc0(str);
            g9n0Var.c = 1;
            objJ = this.b.j(rxc0Var, g9n0Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        qxc0 qxc0Var = (qxc0) ((py21) objJ).c();
        if (qxc0Var == null) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(gyo1.H(qxc0Var.O0, dlc0.d) && qxc0Var.Z0);
    }

    public final boolean b(String str) {
        if (this.a.l()) {
            Set set = s4b1.f;
            if (uic.k(str, new b3i1[]{nyu0.e, wyu0.f}) || uic.x(str).c == blc0.g1) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(Map map) {
        if (this.a.h()) {
            return true;
        }
        this.c.getClass();
        return !Boolean.parseBoolean((String) map.get("is_video_first"));
    }
}
