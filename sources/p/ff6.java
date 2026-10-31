package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ff6 extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff6(boolean z, re6 re6Var, lf6 lf6Var, iu30 iu30Var, int i) {
        super(1);
        this.c = z;
        this.d = re6Var;
        this.e = lf6Var;
        this.f = iu30Var;
        this.b = i;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.d;
        boolean z = this.c;
        int i = this.b;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (b) {
            case 0:
                e261 e261Var = (e261) obj;
                gj6 gj6Var = ((re6) obj2).b;
                b261.n(e261Var, z ? gj6Var.d : gj6Var.e);
                b261.x(e261Var, 0);
                b261.g(e261Var, ((ue6) ((lf6) obj4).f).e, new ck0((iu30) obj3, i, (byte) 5));
                break;
            default:
                e261 e261Var2 = (e261) obj;
                List list = (List) obj4;
                d261 d261Var = c1e1.a;
                u7h u7hVar = (u7h) ((tob1) obj3).getValue();
                long j = u7hVar.a;
                e261Var2.b(d261Var, u7hVar);
                b261.B(e261Var2, "text_section_" + i);
                b261.G(e261Var2, (float) i);
                if (z) {
                    b261.A(e261Var2, (String) obj2);
                }
                if (!list.isEmpty()) {
                    b261.p(e261Var2, list);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff6(int i, boolean z, String str, List list, tob1 tob1Var) {
        super(1);
        this.b = i;
        this.c = z;
        this.d = str;
        this.e = list;
        this.f = tob1Var;
    }
}
