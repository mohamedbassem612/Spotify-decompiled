package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nn4 implements pdy0 {
    public final mn4 a;
    public final luk b;
    public final idd1 c = new idd1(new om4(this, (byte) 19));

    public nn4(mn4 mn4Var, luk lukVar) {
        this.a = mn4Var;
        this.b = lukVar;
    }

    public final mn4 a() {
        mn4 mn4VarA;
        nn4 nn4Var = (nn4) this.c.getValue();
        return (nn4Var == null || (mn4VarA = nn4Var.a()) == null) ? this.a : mn4VarA;
    }

    public final List models() {
        String str = a().a;
        mn4[] mn4VarArrValues = mn4.values();
        ArrayList arrayList = new ArrayList(mn4VarArrValues.length);
        for (mn4 mn4Var : mn4VarArrValues) {
            arrayList.add(mn4Var.a);
        }
        return Collections.singletonList(new fpb("persistence_mode", "android-libs-nowplaying-elements-videoqualityselection", str, arrayList));
    }
}
