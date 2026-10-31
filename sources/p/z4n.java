package p;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class z4n implements k120 {
    public final Context a;
    public final f5n b;
    public final amm0 c;
    public final cxc d;
    public final nq80 e;
    public final z8c0 f;

    public z4n(Context context, f5n f5nVar, amm0 amm0Var, cxc cxcVar, nq80 nq80Var, z8c0 z8c0Var) {
        this.a = context;
        this.b = f5nVar;
        this.c = amm0Var;
        this.d = cxcVar;
        this.e = nq80Var;
        this.f = z8c0Var;
    }

    public final l120 a(Object obj, dqq0 dqq0Var, rf01 rf01Var) {
        j2i1 j2i1Var = (j2i1) obj;
        k291 k291Var = dqq0Var.b;
        cp21 cp21Var = (cp21) kto1.w(dqq0Var.j, h4o1.a);
        String str = j2i1Var.a;
        qfe0 qfe0VarB = this.f.b(str);
        if (this.c.b.a(str) != null) {
            w4u w4uVar = k291Var.a;
            int i = w4uVar instanceof w4u ? w4uVar.a : 0;
            w4u w4uVar2 = k291Var.b;
            return new ulm0(j2i1Var, i, w4uVar2 instanceof w4u ? w4uVar2.a : 0, this.c, this.e, cp21Var.a);
        }
        if (qfe0VarB instanceof ofe0) {
            return ((ofe0) qfe0VarB).a;
        }
        if (o7h.i0(a5n.a, j2i1Var.c)) {
            return null;
        }
        Uri uriO = rno1.o(j2i1Var);
        w4u w4uVar3 = k291Var.a;
        int i2 = w4uVar3 instanceof w4u ? w4uVar3.a : 0;
        w4u w4uVar4 = k291Var.b;
        return new y4n(this.a, uriO, i2, w4uVar4 instanceof w4u ? w4uVar4.a : 0, dqq0Var.i, this.b, this.d, this.e, cp21Var.a);
    }
}
