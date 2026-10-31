package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class em4 implements pdy0 {
    public final dm4 a;
    public final luk b;
    public final idd1 c = new idd1(new gk4(this, (byte) 22));

    public em4(dm4 dm4Var, luk lukVar) {
        this.a = dm4Var;
        this.b = lukVar;
    }

    public final dm4 a() {
        dm4 dm4VarA;
        em4 em4Var = (em4) this.c.getValue();
        return (em4Var == null || (dm4VarA = em4Var.a()) == null) ? this.a : dm4VarA;
    }

    @Override // p.pdy0
    public final List models() {
        String str = a().a;
        dm4[] dm4VarArrValues = dm4.values();
        ArrayList arrayList = new ArrayList(dm4VarArrValues.length);
        for (dm4 dm4Var : dm4VarArrValues) {
            arrayList.add(dm4Var.a);
        }
        return k4p1.x(new fpb("car_detection_is_enabled", "android-libs-car-detection", str, arrayList));
    }
}
