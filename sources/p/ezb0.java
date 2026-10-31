package p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ezb0 implements o4h1 {
    public final dxy a;
    public final aru0 b;
    public final yqu0 c;
    public final hr0 d;
    public final ao0 e;
    public final String f;
    public final d3d1 g;
    public final lgo h;

    public ezb0(dxy dxyVar, aru0 aru0Var, yqu0 yqu0Var, hr0 hr0Var, ao0 ao0Var, String str, d3d1 d3d1Var, lgo lgoVar, List list) {
        this.a = dxyVar;
        this.b = aru0Var;
        this.c = yqu0Var;
        this.d = hr0Var;
        this.e = ao0Var;
        this.f = str;
        this.g = d3d1Var;
        this.h = lgoVar;
        ((lcb0) lgoVar.b).C(list);
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            ji0 ji0Var = (ji0) obj;
            yqu0 yqu0Var2 = this.c;
            String str2 = ji0Var.h;
            String str3 = this.f;
            String str4 = ji0Var.W0;
            i8h1 i8h1Var = (i8h1) yqu0Var2.c;
            x6h1 x6h1VarC = ((tol0) yqu0Var2.b).a.c();
            x6h1VarC.i.add(new a7h1("cta_card", str2, (Integer) null, str3, str4));
            x6h1VarC.j = true;
            y6h1 y6h1VarA = x6h1VarC.a();
            k7h1 k7h1Var = new k7h1();
            ((xjn) k7h1Var).a = y6h1VarA;
            ((xjn) k7h1Var).b = r6h1.c;
            ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
            i8h1Var.f(k7h1Var.a(), (Set) null);
            this.d.b(i, this.f, ji0Var.h, ji0Var.t, this.g);
            if (ji0Var.c1 == 1) {
                ao0.a(this.e, co0.Z, ji0Var.a, (Long) null, (String) null, (String) null, 124);
            } else {
                aru0 aru0Var2 = this.b;
                String str5 = ji0Var.h;
                z6x z6xVar = (List) ji0Var.Q0.get("viewed");
                aru0Var2.g(str5, "viewed", z6xVar == null ? z6x.a : z6xVar, this.g, ji0Var.t);
            }
            i = i2;
        }
    }

    @Override // p.o4h1
    public final void start() {
        ((lcb0) this.h.b).g = new pdb0(this, (byte) 7);
    }

    @Override // p.o4h1
    public final void stop() {
        ((lcb0) this.h.b).g = null;
        ((vku) this.a.g).c();
    }
}
