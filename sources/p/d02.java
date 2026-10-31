package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class d02 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l8d1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d02(l8d1 l8d1Var, byte b) {
        super(3);
        this.a = b;
        this.b = l8d1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        l8d1 l8d1Var = this.b;
        switch (b) {
            case 0:
                c02 c02Var = (c02) obj2;
                tqw tqwVar = (tqw) obj3;
                if (c02Var instanceof a02) {
                    p60 p60Var = ((a02) c02Var).b;
                    k20 k20Var = p60Var.k;
                    if (k20Var instanceof i20) {
                        l8d1.a(l8d1Var, ((i20) k20Var).a, tqwVar != null ? n3o1.y(tqwVar) : null, 2);
                        return rih1Var;
                    }
                    if (k20Var.equals(b6j0.b)) {
                        l8d1.a(l8d1Var, p60Var.e, tqwVar != null ? n3o1.y(tqwVar) : null, 2);
                        return rih1Var;
                    }
                    if (k20Var instanceof j20) {
                        j20 j20Var = (j20) k20Var;
                        rwb rwbVar = l8d1Var.d;
                        String str = j20Var.c;
                        rwbVar.b.a(new swb(str != null ? huj.e(str) : null, j20Var.d, j20Var.e, j20Var.a, j20Var.b, j20Var.f, j20Var.g, false, j20Var.h, false, j20Var.i, false), (String) null);
                        return rih1Var;
                    }
                    eg.o();
                } else {
                    if (c02Var instanceof b02) {
                        l8d1.a(l8d1Var, ((b02) c02Var).b, tqwVar != null ? n3o1.y(tqwVar) : null, 2);
                        return rih1Var;
                    }
                    eg.o();
                }
                return null;
            case 1:
                tqw tqwVar2 = (tqw) obj3;
                l8d1.a(l8d1Var, ((a5a) obj2).b, tqwVar2 != null ? n3o1.y(tqwVar2) : null, 2);
                return rih1Var;
            case 2:
                tqw tqwVar3 = (tqw) obj3;
                l8d1.a(l8d1Var, ((vja) obj2).b, tqwVar3 != null ? n3o1.y(tqwVar3) : null, 2);
                return rih1Var;
            case 3:
                tqw tqwVar4 = (tqw) obj3;
                l8d1.a(l8d1Var, ((a0z) obj2).c, tqwVar4 != null ? n3o1.y(tqwVar4) : null, 2);
                return rih1Var;
            case 4:
                hb80 hb80Var = (jb80) obj2;
                tqw tqwVar5 = (tqw) obj3;
                if (hb80Var instanceof hb80) {
                    l8d1.a(l8d1Var, hb80Var.b, tqwVar5 != null ? n3o1.y(tqwVar5) : null, 2);
                    return rih1Var;
                }
                if (hb80Var instanceof ib80) {
                    l8d1.a(l8d1Var, ((ib80) hb80Var).b, tqwVar5 != null ? n3o1.y(tqwVar5) : null, 2);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 5:
                l8d1.a(l8d1Var, ((teb0) obj2).a, null, 6);
                return rih1Var;
            case 6:
                m7t0 m7t0Var = (m7t0) obj2;
                tqw tqwVar6 = (tqw) obj3;
                if (m7t0Var instanceof j7t0) {
                    l8d1.a(l8d1Var, ((j7t0) m7t0Var).a, tqwVar6 != null ? n3o1.y(tqwVar6) : null, 2);
                    return rih1Var;
                }
                if (m7t0Var instanceof k7t0) {
                    l8d1.a(l8d1Var, ((k7t0) m7t0Var).a, tqwVar6 != null ? n3o1.y(tqwVar6) : null, 2);
                    return rih1Var;
                }
                if (m7t0Var instanceof l7t0) {
                    l8d1.a(l8d1Var, ((l7t0) m7t0Var).a, tqwVar6 != null ? n3o1.y(tqwVar6) : null, 2);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 7:
                l8d1.a(l8d1Var, ((tf91) obj2).a, null, 6);
                return rih1Var;
            default:
                tqw tqwVar7 = (tqw) obj3;
                l8d1.a(l8d1Var, ((tnc1) obj2).b, tqwVar7 != null ? n3o1.y(tqwVar7) : null, 2);
                return rih1Var;
        }
    }
}
