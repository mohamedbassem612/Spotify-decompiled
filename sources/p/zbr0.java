package p;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zbr0 implements g431 {
    public final c690 a;
    public final n431 b;
    public final s331 c;
    public final String d;
    public final LinkedHashMap e = new LinkedHashMap();

    public zbr0(c690 c690Var, n431 n431Var, s331 s331Var, String str) {
        this.a = c690Var;
        this.b = n431Var;
        this.c = s331Var;
        this.d = str;
    }

    @Override // p.g431
    public final b431 a(u331 u331Var, r331 r331Var) {
        this.e.put(u331Var, r331Var);
        c(u331Var, r331Var);
        Class clsB = u331Var.b();
        n431 n431Var = this.b;
        n431Var.getClass();
        String str = this.d;
        return new ybr0(new m431(n431Var, n431.a(str, clsB), str, clsB), this, u331Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) {
        xbr0 xbr0Var;
        if (onmVar instanceof xbr0) {
            xbr0Var = (xbr0) onmVar;
            int i = xbr0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xbr0Var.c = i - Integer.MIN_VALUE;
            } else {
                xbr0Var = new xbr0(this, onmVar);
            }
        } else {
            xbr0Var = new xbr0(this, onmVar);
        }
        Object obj = xbr0Var.a;
        int i2 = xbr0Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            xbr0Var.c = 1;
            Object objA = this.c.a(xbr0Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        for (Map.Entry entry : this.e.entrySet()) {
            c((u331) entry.getKey(), (r331) entry.getValue());
        }
        return rih1.a;
    }

    public final void c(u331 u331Var, r331 r331Var) {
        Class clsB = u331Var.b();
        n431 n431Var = this.b;
        n431Var.getClass();
        String strA = n431.a(this.d, clsB);
        HashMap map = n431Var.a;
        d331 d331Var = map.containsKey(strA) ? (d331) map.remove(strA) : null;
        if (d331Var != null) {
            r331Var.e(d331Var);
        }
    }
}
