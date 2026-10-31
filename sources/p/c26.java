package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class c26 implements pdy0 {
    public final boolean a;
    public final y16 b;
    public final z16 c;
    public final tgp0 d;
    public final luk e;
    public final idd1 f = new idd1(new b26(this, (byte) 1));
    public final idd1 g = new idd1(new b26(this, (byte) 0));

    public c26(boolean z, y16 y16Var, z16 z16Var, tgp0 tgp0Var, luk lukVar) {
        this.a = z;
        this.b = y16Var;
        this.c = z16Var;
        this.d = tgp0Var;
        this.e = lukVar;
    }

    public final boolean a() {
        c26 c26Var = (c26) this.g.getValue();
        return c26Var != null ? c26Var.a() : this.a;
    }

    public final y16 b() {
        y16 y16VarB;
        c26 c26Var = (c26) this.g.getValue();
        return (c26Var == null || (y16VarB = c26Var.b()) == null) ? this.b : y16VarB;
    }

    public final z16 c() {
        z16 z16VarC;
        c26 c26Var = (c26) this.g.getValue();
        return (c26Var == null || (z16VarC = c26Var.c()) == null) ? this.c : z16VarC;
    }

    public final List models() {
        fpb fpbVar = new fpb("button_big", "apps-music-features-remoteconfiguration", a());
        String str = b().a;
        y16[] y16VarArrValues = y16.values();
        ArrayList arrayList = new ArrayList(y16VarArrValues.length);
        for (y16 y16Var : y16VarArrValues) {
            arrayList.add(y16Var.a);
        }
        fpb fpbVar2 = new fpb("button_color", "apps-music-features-remoteconfiguration", str, arrayList);
        String str2 = c().a;
        z16[] z16VarArrValues = z16.values();
        ArrayList arrayList2 = new ArrayList(z16VarArrValues.length);
        for (z16 z16Var : z16VarArrValues) {
            arrayList2.add(z16Var.a);
        }
        return p7h.M(new fpb[]{fpbVar, fpbVar2, new fpb("message", "apps-music-features-remoteconfiguration", str2, arrayList2)});
    }
}
