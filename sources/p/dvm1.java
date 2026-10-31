package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dvm1 implements pdy0 {
    public final boolean a;
    public final bvm1 b;
    public final luk c;
    public final idd1 d;

    public dvm1(boolean z, bvm1 bvm1Var, luk lukVar) {
        this.a = z;
        this.b = bvm1Var;
        this.c = lukVar;
        this.d = new idd1(new yrm1(this, (byte) 2));
    }

    public final boolean a() {
        dvm1 dvm1Var = (dvm1) this.d.getValue();
        return dvm1Var != null ? dvm1Var.a() : this.a;
    }

    public final bvm1 b() {
        bvm1 bvm1VarB;
        dvm1 dvm1Var = (dvm1) this.d.getValue();
        return (dvm1Var == null || (bvm1VarB = dvm1Var.b()) == null) ? this.b : bvm1VarB;
    }

    public final List models() {
        fpb fpbVar = new fpb("default_grid_view_googlebook", "your-library", a());
        String str = b().a;
        bvm1[] bvm1VarArrValues = bvm1.values();
        ArrayList arrayList = new ArrayList(bvm1VarArrValues.length);
        for (bvm1 bvm1Var : bvm1VarArrValues) {
            arrayList.add(bvm1Var.a);
        }
        return p7h.M(new fpb[]{fpbVar, new fpb("default_view_density", "your-library", str, arrayList)});
    }

    public dvm1(luk lukVar) {
        this(false, bvm1.LIST, lukVar);
    }
}
