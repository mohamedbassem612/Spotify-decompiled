package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s2f1 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t2f1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s2f1(t2f1 t2f1Var, byte b) {
        super(4);
        this.a = b;
        this.b = t2f1Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        t2f1 t2f1Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                return t2f1Var.d;
            default:
                n2f1 n2f1Var = (p2f1) obj2;
                l2f1 l2f1Var = (l2f1) obj4;
                if (!(n2f1Var instanceof n2f1) || !(l2f1Var instanceof j2f1)) {
                    return null;
                }
                r6h1 r6h1VarB = t2f1Var.d.b();
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-your-listening-sharing";
                x6h1VarI.f = "3.0.0";
                x6h1VarI.g = "22.0.0";
                y6h1 y6h1VarA = x6h1VarI.a();
                n2f1 n2f1Var2 = n2f1Var;
                String str = n2f1Var2.c;
                Integer numValueOf = Integer.valueOf(t2f1Var.e.b.a());
                x6h1 x6h1VarC = y6h1VarA.c();
                x6h1VarC.i.add(new a7h1("details_page_share_button", str, numValueOf, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA2 = x6h1VarC.a();
                String str2 = n2f1Var2.c;
                z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
                mmr0 mmr0Var = new mmr0("entity_to_be_shared", "spotify:listeningstatsdetails");
                if (str2 == null) {
                    str2 = "";
                }
                return new w7h1("", "", z7h1Var, new x7h1("share", 2, sqg0.J(new mmr0[]{mmr0Var, new mmr0("share_id", str2)})), y6h1VarA2, r6h1VarB, System.currentTimeMillis());
        }
    }
}
