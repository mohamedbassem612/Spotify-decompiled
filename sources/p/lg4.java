package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lg4 implements pdy0 {
    public final kg4 a;
    public final luk b;
    public final idd1 c = new idd1(new cg4(this, (byte) 4));

    public lg4(kg4 kg4Var, ez11 ez11Var) {
        this.a = kg4Var;
        this.b = ez11Var;
    }

    public final kg4 a() {
        kg4 kg4VarA;
        lg4 lg4Var = (lg4) this.c.getValue();
        return (lg4Var == null || (kg4VarA = lg4Var.a()) == null) ? this.a : kg4VarA;
    }

    @Override // p.pdy0
    public final List models() {
        String str = a().a;
        kg4[] kg4VarArrValues = kg4.values();
        ArrayList arrayList = new ArrayList(kg4VarArrValues.length);
        for (kg4 kg4Var : kg4VarArrValues) {
            arrayList.add(kg4Var.a);
        }
        return k4p1.x(new fpb("enable_post_signup_premium_upsell_v1", "android-feature-login", str, arrayList));
    }
}
