package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k94 implements pdy0 {
    public final j94 a;
    public final luk b;
    public final idd1 c = new idd1(new u74(this, (byte) 15));

    public k94(j94 j94Var, luk lukVar) {
        this.a = j94Var;
        this.b = lukVar;
    }

    public final j94 a() {
        j94 j94VarA;
        k94 k94Var = (k94) this.c.getValue();
        return (k94Var == null || (j94VarA = k94Var.a()) == null) ? this.a : j94VarA;
    }

    public final List models() {
        String str = a().a;
        j94[] j94VarArrValues = j94.values();
        ArrayList arrayList = new ArrayList(j94VarArrValues.length);
        for (j94 j94Var : j94VarArrValues) {
            arrayList.add(j94Var.a);
        }
        return Collections.singletonList(new fpb("mark_as_played_endpoint_options", "android-collection-content-impl", str, arrayList));
    }
}
