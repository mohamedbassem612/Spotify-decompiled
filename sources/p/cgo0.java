package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cgo0 implements iu30 {
    public final /* synthetic */ byte a;
    public final poj0 b;

    public /* synthetic */ cgo0(poj0 poj0Var, byte b) {
        this.a = b;
        this.b = poj0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        poj0 poj0Var = this.b;
        switch (b) {
            case 0:
                return new h7x((zim0) poj0Var.c, (kf30) obj, false);
            default:
                dgo0 dgo0Var = (dgo0) obj;
                heg hegVar = dgo0Var.a;
                List list = dgo0Var.b;
                if (hegVar.c) {
                    t8e1.o(hegVar, "Unresolved local class: ");
                    return null;
                }
                heg hegVarE = hegVar.e();
                leg legVarP = hegVarE != null ? poj0Var.p(hegVarE, o7h.k0(list, 1)) : (leg) ((qoe0) poj0Var.d).invoke(hegVar.a);
                boolean zG = hegVar.g();
                s1c1 s1c1Var = (s1c1) poj0Var.b;
                ajn0 ajn0VarF = hegVar.f();
                Integer num = (Integer) o7h.s0(list);
                return new ego0(s1c1Var, legVarP, ajn0VarF, zG, num != null ? num.intValue() : 0);
        }
    }
}
