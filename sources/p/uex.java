package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uex extends l570 implements o5s {
    public final qzh b;
    public final vx40 c;

    public uex(qzh qzhVar, vx40 vx40Var) {
        super(qzhVar.getView());
        this.b = qzhVar;
        this.c = vx40Var;
    }

    public final void a(y570 y570Var, l670 l670Var, yfu yfuVar) {
        Object next;
        String str = y570Var.n().a.b;
        String str2 = str == null ? "" : str;
        String str3 = y570Var.n().a.a;
        String str4 = str3 == null ? "" : str3;
        String str5 = y570Var.n().a.d;
        String str6 = str5 == null ? "" : str5;
        ld70 ld70Var = y570Var.k().a.d;
        g07 g07Var = new g07(ld70Var != null ? ld70Var.a.c : null);
        String strB = y570Var.g().B("type");
        String str7 = strB != null ? strB : "";
        Iterator it = olg.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!nhc1.S(((olg) next).name(), str7, true));
        olg olgVar = (olg) next;
        if (olgVar == null) {
            olgVar = olg.a;
        }
        ld70 ld70Var2 = y570Var.k().a.c;
        plg plgVar = new plg(str2, str4, str6, olgVar, g07Var, new g07(ld70Var2 != null ? ld70Var2.a.c : null, new zz6(6.0f)));
        qzh qzhVar = this.b;
        qzhVar.f(plgVar);
        qzhVar.n(new jy(this, y570Var, l670Var, (byte) 4));
        this.c.v(y570Var);
    }

    public final void b(int... iArr) {
    }
}
