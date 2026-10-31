package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vf4 implements pdy0 {
    public final uf4 a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new pe4(this, (byte) 25));

    public vf4(uf4 uf4Var, boolean z, luk lukVar) {
        this.a = uf4Var;
        this.b = z;
        this.c = lukVar;
    }

    public final uf4 a() {
        uf4 uf4VarA;
        vf4 vf4Var = (vf4) this.d.getValue();
        return (vf4Var == null || (uf4VarA = vf4Var.a()) == null) ? this.a : uf4VarA;
    }

    public final boolean b() {
        vf4 vf4Var = (vf4) this.d.getValue();
        return vf4Var != null ? vf4Var.b() : this.b;
    }

    public final List models() {
        String str = a().a;
        uf4[] uf4VarArrValues = uf4.values();
        ArrayList arrayList = new ArrayList(uf4VarArrValues.length);
        for (uf4 uf4Var : uf4VarArrValues) {
            arrayList.add(uf4Var.a);
        }
        return p7h.M(new fpb[]{new fpb("create_menu_icon_placement", "android-feature-create-menu", str, arrayList), new fpb("use_sectioned_create_menu", "android-feature-create-menu", b())});
    }
}
