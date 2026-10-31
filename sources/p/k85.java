package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class k85 implements pdy0 {
    public final j85 a;
    public final luk b;
    public final idd1 c;

    public k85(j85 j85Var, luk lukVar) {
        this.a = j85Var;
        this.b = lukVar;
        this.c = new idd1(new f85(this, (byte) 3));
    }

    public final j85 a() {
        j85 j85VarA;
        k85 k85Var = (k85) this.c.getValue();
        return (k85Var == null || (j85VarA = k85Var.a()) == null) ? this.a : j85VarA;
    }

    @Override // p.pdy0
    public final List models() {
        String str = a().a;
        j85[] j85VarArrValues = j85.values();
        ArrayList arrayList = new ArrayList(j85VarArrValues.length);
        for (j85 j85Var : j85VarArrValues) {
            arrayList.add(j85Var.a);
        }
        return k4p1.x(new fpb("color_extraction_source", "android-widgets-colorextractionimpl", str, arrayList));
    }

    public k85(luk lukVar) {
        this(j85.LOCAL_EXTRACTION, lukVar);
    }
}
