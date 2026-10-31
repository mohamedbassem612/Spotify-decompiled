package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c6r extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ldo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c6r(ldo ldoVar, byte b) {
        super(4);
        this.a = b;
        this.b = ldoVar;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        byte b = this.a;
        ldo ldoVar = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                return (t9h1) ldoVar.b;
            default:
                x5r x5rVar = (x5r) obj2;
                w5r w5rVar = (w5r) obj4;
                t9h1 t9h1Var = (t9h1) ldoVar.b;
                String str = x5rVar.h;
                int i = x5rVar.i;
                if (w5rVar instanceof u5r) {
                    return (w7h1) ((Function0) ldoVar.f).invoke();
                }
                if (w5rVar instanceof v5r) {
                    b6r b6rVar = x5rVar.t;
                    boolean z = b6rVar instanceof z5r;
                    b7x b7xVar = b7x.a;
                    if (z) {
                        r6h1 r6h1VarB = t9h1Var.b();
                        y6h1 y6h1Var = y6h1.i;
                        x6h1 x6h1VarI = i3o1.i();
                        x6h1VarI.h = "music";
                        x6h1VarI.a = "mobile-your-listening-sharing";
                        x6h1VarI.f = "3.0.0";
                        x6h1VarI.g = "22.0.0";
                        y6h1 y6h1VarA = x6h1VarI.a();
                        Integer numValueOf = Integer.valueOf(i);
                        x6h1 x6h1VarC = y6h1VarA.c();
                        x6h1VarC.i.add(new a7h1("monthly_stats_share_button", str, numValueOf, (String) null, (String) null));
                        x6h1VarC.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("share", 2, sqg0.J(new mmr0[]{new mmr0("entity_to_be_shared", "spotify:listeningstats"), new mmr0("share_id", str)})), x6h1VarC.a(), r6h1VarB, System.currentTimeMillis());
                    } else if (b6rVar instanceof a6r) {
                        r6h1 r6h1VarB2 = t9h1Var.b();
                        y6h1 y6h1Var2 = y6h1.i;
                        x6h1 x6h1VarI2 = i3o1.i();
                        x6h1VarI2.h = "music";
                        x6h1VarI2.a = "mobile-your-listening-sharing";
                        x6h1VarI2.f = "3.0.0";
                        x6h1VarI2.g = "22.0.0";
                        y6h1 y6h1VarA2 = x6h1VarI2.a();
                        Integer numValueOf2 = Integer.valueOf(i);
                        x6h1 x6h1VarC2 = y6h1VarA2.c();
                        x6h1VarC2.i.add(new a7h1("monthly_stats_share_button", str, numValueOf2, (String) null, (String) null));
                        x6h1VarC2.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), r6h1VarB2, System.currentTimeMillis());
                    } else if (!b6rVar.equals(y5r.a)) {
                        eg.o();
                    }
                    return w7h1Var;
                }
                eg.o();
                return null;
        }
    }
}
