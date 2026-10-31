package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rc0 implements p360, n8h1, p8h1 {
    public final /* synthetic */ sqk0 a;
    public final /* synthetic */ sqk0 b;
    public final /* synthetic */ oj80 c;
    public final /* synthetic */ qc0 d;

    public rc0(sqk0 sqk0Var, oj80 oj80Var, qc0 qc0Var) {
        this.b = sqk0Var;
        this.c = oj80Var;
        this.d = qc0Var;
        this.a = sqk0Var;
    }

    public final r6h1 b() {
        return this.a.b();
    }

    public final l7h1 e() {
        l7h1 l7h1VarA;
        sqk0 sqk0Var = this.b;
        l7h1 l7h1VarE = sqk0Var.e();
        u961 u961Var = (u961) this.c.c;
        r6h1 r6h1Var = sqk0Var.c.b;
        y6h1 y6h1Var = sqk0Var.b;
        qc0 qc0Var = this.d;
        pc0 pc0Var = qc0Var.g;
        String str = pc0Var.a;
        if (!u890.j(str, (String) u961Var.a)) {
            i8h1 i8h1Var = (i8h1) u961Var.c;
            boolean z = pc0Var.b;
            if (z) {
                x6h1 x6h1VarC = y6h1Var.c();
                x6h1VarC.i.add(new a7h1("end_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).b = r6h1Var;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                l7h1VarA = (l7h1) k7h1Var.a();
            } else {
                if (z) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC2 = y6h1Var.c();
                x6h1VarC2.i.add(new a7h1("leave_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                k7h1 k7h1Var2 = new k7h1();
                ((xjn) k7h1Var2).a = y6h1VarA2;
                ((xjn) k7h1Var2).b = r6h1Var;
                ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                l7h1VarA = k7h1Var2.a();
            }
            i8h1Var.f(l7h1VarA, (Set) null);
            u961Var.a = str;
        }
        if (qc0Var.h && !u890.j(str, (String) u961Var.d)) {
            pux0 pux0Var = (pux0) ((fey) u961Var.b).b;
            i8h1 i8h1Var2 = (i8h1) pux0Var.b;
            x6h1 x6h1VarC3 = ((yok0) pux0Var.c).b.c();
            x6h1VarC3.i.add(new a7h1("capped_premium_queue_banner", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC3.j = true;
            y6h1 y6h1VarA3 = x6h1VarC3.a();
            k7h1 k7h1Var3 = new k7h1();
            ((xjn) k7h1Var3).a = y6h1VarA3;
            ((xjn) k7h1Var3).b = r6h1.c;
            ((xjn) k7h1Var3).c = Long.valueOf(System.currentTimeMillis());
            i8h1Var2.f(k7h1Var3.a(), (Set) null);
            u961Var.d = str;
        }
        return l7h1VarE;
    }

    @Override // p.p360
    public final sqk0 get() {
        return this.b;
    }
}
