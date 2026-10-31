package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class r3z extends hab0 implements ku30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3z(m4c m4cVar, String str, boolean z) {
        super(12);
        this.a = str;
        this.b = z;
    }

    public final Object E0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12) {
        iix0 iix0Var = (iix0) obj;
        mdz mdzVar = (mdz) obj2;
        p6v0 p6v0Var = (p6v0) obj3;
        jo70 jo70Var = (jo70) obj4;
        mtl mtlVar = (mtl) obj5;
        l1z l1zVar = (l1z) obj6;
        hll hllVar = (hll) obj7;
        qfd qfdVar = (qfd) obj8;
        ArrayList arrayListC = jo70Var != null ? jzn1.C(jo70Var) : null;
        if (arrayListC == null) {
            arrayListC = z6x.a;
        }
        return m4c.o(this.a, iix0Var, mdzVar, p6v0Var, arrayListC, hwb.B(mtlVar, jo70Var, this.b), l1zVar, hllVar, qfdVar);
    }
}
