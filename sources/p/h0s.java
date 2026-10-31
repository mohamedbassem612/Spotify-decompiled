package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class h0s {
    public final xrc0 a;

    public h0s(xrc0 xrc0Var) {
        this.a = xrc0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, onm onmVar) {
        g0s g0sVar;
        Map map;
        if (onmVar instanceof g0s) {
            g0sVar = (g0s) onmVar;
            int i = g0sVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                g0sVar.c = i - Integer.MIN_VALUE;
            } else {
                g0sVar = new g0s(this, onmVar);
            }
        } else {
            g0sVar = new g0s(this, onmVar);
        }
        Object objJ = g0sVar.a;
        int i2 = g0sVar.c;
        String str2 = null;
        if (i2 == 0) {
            hm5.M(objJ);
            rxc0 rxc0Var = new rxc0(str);
            g0sVar.c = 1;
            objJ = this.a.j(rxc0Var, g0sVar);
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
        if (qxc0Var != null && (map = qxc0Var.X) != null) {
            str2 = (String) map.get("is_genpods");
        }
        return Boolean.valueOf(u890.j(str2, "true"));
    }
}
