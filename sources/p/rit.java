package p;

import android.os.Bundle;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rit implements xu40 {
    public final g0l a;
    public final a1r0 b;
    public final i8h1 c;

    public rit(g0l g0lVar, a1r0 a1r0Var, i8h1 i8h1Var) {
        this.a = g0lVar;
        this.b = a1r0Var;
        this.c = i8h1Var;
    }

    @Override // p.xu40
    public final o090 a(zv31 zv31Var, int i, String str) {
        Object next;
        Iterator it = this.a.i().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u890.j(((l0l) next).d(), zv31Var.a));
        l0l l0lVar = (l0l) next;
        if (l0lVar == null || l0lVar.getType() != f0u.b || !u890.j(l0lVar.y(), Boolean.FALSE)) {
            return m090.a;
        }
        String str2 = zv31Var.a;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-connect-menu";
        x6h1VarI.f = "6.6.0";
        x6h1VarI.g = "22.0.0";
        x6h1 x6h1VarR = kk0.r(x6h1VarI, "connect/devicepicker");
        x6h1VarR.i.add(new a7h1("device_list", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarR.j = false;
        y6h1 y6h1VarA = x6h1VarR.a();
        Integer numValueOf = Integer.valueOf(i);
        x6h1 x6h1VarC = y6h1VarA.c();
        x6h1VarC.i.add(new a7h1("connect_device", (String) null, numValueOf, str2, str));
        x6h1VarC.j = true;
        y6h1 y6h1VarA2 = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        ou80 ou80Var = this.c.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA2, r6h1.c, System.currentTimeMillis()), (xj61) null).a;
        a1r0.j(this.b, "spotify:internal:desktop-launcher-qr-sheet", (String) null, (Bundle) null, false, 14);
        return new n090(ou80Var);
    }

    @Override // p.xu40
    public final yu40 getType() {
        return yu40.b;
    }
}
