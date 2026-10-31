package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jb4 implements pdy0 {
    public final eb4 a;
    public final luk b;
    public final idd1 c = new idd1(new u74(this, (byte) 24));

    public jb4(eb4 eb4Var, luk lukVar) {
        this.a = eb4Var;
        this.b = lukVar;
    }

    public final eb4 a() {
        eb4 eb4VarA;
        jb4 jb4Var = (jb4) this.c.getValue();
        return (jb4Var == null || (eb4VarA = jb4Var.a()) == null) ? this.a : eb4VarA;
    }

    public final List models() {
        String strA = a().a();
        eb4[] eb4VarArrValues = eb4.values();
        ArrayList arrayList = new ArrayList(eb4VarArrValues.length);
        for (eb4 eb4Var : eb4VarArrValues) {
            arrayList.add(eb4Var.a());
        }
        return k4p1.x(new fpb("http_engine", "android-connectivity", strA, arrayList));
    }
}
