package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hj4 implements pdy0 {
    public final gj4 a;
    public final luk b;
    public final idd1 c = new idd1(new sh4(this, (byte) 24));

    public hj4(gj4 gj4Var, luk lukVar) {
        this.a = gj4Var;
        this.b = lukVar;
    }

    public final gj4 a() {
        gj4 gj4VarA;
        hj4 hj4Var = (hj4) this.c.getValue();
        return (hj4Var == null || (gj4VarA = hj4Var.a()) == null) ? this.a : gj4VarA;
    }

    @Override // p.pdy0
    public final List models() {
        String strA = a().a();
        gj4[] gj4VarArrValues = gj4.values();
        ArrayList arrayList = new ArrayList(gj4VarArrValues.length);
        for (gj4 gj4Var : gj4VarArrValues) {
            arrayList.add(gj4Var.a());
        }
        return k4p1.x(new fpb("pace_zones_variant", "android-fitness-settings-page", strA, arrayList));
    }
}
