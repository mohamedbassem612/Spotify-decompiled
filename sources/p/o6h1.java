package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class o6h1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e5l0 b;
    public final /* synthetic */ n2u0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o6h1(e5l0 e5l0Var, n2u0 n2u0Var, byte b) {
        super(1);
        this.a = b;
        this.b = e5l0Var;
        this.c = n2u0Var;
    }

    public final Object invoke(Object obj) {
        String strValueOf;
        l2u0 l2u0Var;
        Long lA;
        l2u0 l2u0Var2;
        Long lA2;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        n2u0 n2u0Var = this.c;
        e5l0 e5l0Var = this.b;
        switch (b) {
            case 0:
                q3m0 q3m0Var = (q3m0) obj;
                String strP = oap1.p(e5l0Var);
                Integer numValueOf = (n2u0Var == null || (lA = n2u0Var.a()) == null) ? null : Integer.valueOf((int) lA.longValue());
                Integer numValueOf2 = (n2u0Var == null || (l2u0Var = (l2u0) n2u0Var.c.getValue()) == null) ? null : Integer.valueOf((int) l2u0Var.c);
                z7h1 z7h1Var = new z7h1("swipe", 1, b7xVar);
                if (strP == null) {
                    strP = "";
                }
                mmr0 mmr0Var = new mmr0("item_to_be_skipped", strP);
                String strValueOf2 = numValueOf != null ? String.valueOf(numValueOf.intValue()) : null;
                if (strValueOf2 == null) {
                    strValueOf2 = "";
                }
                mmr0 mmr0Var2 = new mmr0("position_ms", strValueOf2);
                strValueOf = numValueOf2 != null ? String.valueOf(numValueOf2.intValue()) : null;
                return new w7h1("", "", z7h1Var, new x7h1("skip_to_next", 2, sqg0.J(new mmr0[]{mmr0Var, mmr0Var2, new mmr0("total_content_ms", strValueOf != null ? strValueOf : "")})), q3m0Var.a, r6h1.c, System.currentTimeMillis());
            default:
                q3m0 q3m0Var2 = (q3m0) obj;
                String strP2 = oap1.p(e5l0Var);
                Integer numValueOf3 = (n2u0Var == null || (lA2 = n2u0Var.a()) == null) ? null : Integer.valueOf((int) lA2.longValue());
                Integer numValueOf4 = (n2u0Var == null || (l2u0Var2 = (l2u0) n2u0Var.c.getValue()) == null) ? null : Integer.valueOf((int) l2u0Var2.c);
                z7h1 z7h1Var2 = new z7h1("swipe", 1, b7xVar);
                if (strP2 == null) {
                    strP2 = "";
                }
                mmr0 mmr0Var3 = new mmr0("item_to_be_skipped", strP2);
                String strValueOf3 = numValueOf3 != null ? String.valueOf(numValueOf3.intValue()) : null;
                if (strValueOf3 == null) {
                    strValueOf3 = "";
                }
                mmr0 mmr0Var4 = new mmr0("position_ms", strValueOf3);
                strValueOf = numValueOf4 != null ? String.valueOf(numValueOf4.intValue()) : null;
                return new w7h1("", "", z7h1Var2, new x7h1("skip_to_previous", 2, sqg0.J(new mmr0[]{mmr0Var3, mmr0Var4, new mmr0("total_content_ms", strValueOf != null ? strValueOf : "")})), q3m0Var2.a, r6h1.c, System.currentTimeMillis());
        }
    }
}
