package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class r84 implements pdy0 {
    public final q84 a;
    public final luk b;
    public final idd1 c = new idd1(new u74(this, (byte) 7));

    public r84(q84 q84Var, luk lukVar) {
        this.a = q84Var;
        this.b = lukVar;
    }

    public final q84 a() {
        q84 q84VarA;
        r84 r84Var = (r84) this.c.getValue();
        return (r84Var == null || (q84VarA = r84Var.a()) == null) ? this.a : q84VarA;
    }

    @Override // p.pdy0
    public final List models() {
        String str = a().a;
        q84[] q84VarArrValues = q84.values();
        ArrayList arrayList = new ArrayList(q84VarArrValues.length);
        for (q84 q84Var : q84VarArrValues) {
            arrayList.add(q84Var.a);
        }
        return k4p1.x(new fpb("wrapped_routing_destination", "android-campaign-routing", str, arrayList));
    }
}
