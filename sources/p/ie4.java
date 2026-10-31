package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ie4 implements pdy0 {
    public final he4 a;
    public final luk b;
    public final idd1 c = new idd1(new wb4(this, (byte) 24));

    public ie4(he4 he4Var, luk lukVar) {
        this.a = he4Var;
        this.b = lukVar;
    }

    public final he4 a() {
        he4 he4VarA;
        ie4 ie4Var = (ie4) this.c.getValue();
        return (ie4Var == null || (he4VarA = ie4Var.a()) == null) ? this.a : he4VarA;
    }

    @Override // p.pdy0
    public final List models() {
        String str = a().a;
        he4[] he4VarArrValues = he4.values();
        ArrayList arrayList = new ArrayList(he4VarArrValues.length);
        for (he4 he4Var : he4VarArrValues) {
            arrayList.add(he4Var.a);
        }
        return k4p1.x(new fpb("player_implementation", "android-endless-sillywalk-commentaryplayerimpl", str, arrayList));
    }
}
