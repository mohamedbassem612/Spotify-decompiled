package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ybr0 implements b431 {
    public final /* synthetic */ m431 a;
    public final /* synthetic */ zbr0 b;
    public final /* synthetic */ u331 c;

    public ybr0(m431 m431Var, zbr0 zbr0Var, u331 u331Var) {
        this.a = m431Var;
        this.b = zbr0Var;
        this.c = u331Var;
    }

    public final void a(Object obj, String str) {
        m431 m431Var = this.a;
        n431 n431Var = m431Var.a;
        n431Var.b.add(m431Var.b);
        String str2 = m431Var.c;
        String strA = n431.a(str2, m431Var.d);
        Iterator it = n431Var.b.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (!str3.equals(strA) && nhc1.Y(str3, str2, false)) {
                it.remove();
            }
        }
        zbr0 zbr0Var = this.b;
        c690 c690Var = zbr0Var.a;
        String str4 = zbr0Var.d;
        u331 u331Var = this.c;
        c690Var.c(u331Var.a(obj), str4, (String) u331Var.getUri().invoke(obj), str);
    }

    public final void unregister() {
        this.a.unregister();
    }
}
