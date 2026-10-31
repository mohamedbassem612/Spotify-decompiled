package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ii4 implements pdy0 {
    public final hi4 a;
    public final luk b;
    public final idd1 c = new idd1(new sh4(this, (byte) 7));

    public ii4(hi4 hi4Var, luk lukVar) {
        this.a = hi4Var;
        this.b = lukVar;
    }

    public final hi4 a() {
        hi4 hi4VarA;
        ii4 ii4Var = (ii4) this.c.getValue();
        return (ii4Var == null || (hi4VarA = ii4Var.a()) == null) ? this.a : hi4VarA;
    }

    public final List models() {
        String str = a().a;
        hi4[] hi4VarArrValues = hi4.values();
        ArrayList arrayList = new ArrayList(hi4VarArrValues.length);
        for (hi4 hi4Var : hi4VarArrValues) {
            arrayList.add(hi4Var.a);
        }
        return Collections.singletonList(new fpb("header_variant", "android-feature-sidedrawer", str, arrayList));
    }
}
