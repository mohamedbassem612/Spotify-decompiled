package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dvs0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ evs0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dvs0(evs0 evs0Var, byte b) {
        super(1);
        this.a = b;
        this.b = evs0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        b7x b7xVar = b7x.a;
        evs0 evs0Var = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                t8r0 t8r0Var = evs0Var.c;
                i8h1 i8h1Var = (i8h1) t8r0Var.a;
                x6h1 x6h1VarC = ((zok0) t8r0Var.b).b.c();
                x6h1VarC.i.add(new a7h1("seek_backward_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                mmr0 mmr0Var = new mmr0("ms_seeked_offset", "");
                String strValueOf = String.valueOf(iIntValue);
                i8h1Var.m(new w7h1("", "", z7h1Var, new x7h1("seek_by_time", 2, sqg0.J(new mmr0[]{mmr0Var, new mmr0("position_ms", strValueOf != null ? strValueOf : "")})), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                break;
            default:
                int iIntValue2 = ((Number) obj).intValue();
                t8r0 t8r0Var2 = evs0Var.c;
                i8h1 i8h1Var2 = (i8h1) t8r0Var2.a;
                x6h1 x6h1VarC2 = ((zok0) t8r0Var2.b).b.c();
                x6h1VarC2.i.add(new a7h1("seek_forward_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                z7h1 z7h1Var2 = new z7h1("hit", 1, b7xVar);
                mmr0 mmr0Var2 = new mmr0("ms_seeked_offset", "");
                String strValueOf2 = String.valueOf(iIntValue2);
                i8h1Var2.m(new w7h1("", "", z7h1Var2, new x7h1("seek_by_time", 2, sqg0.J(new mmr0[]{mmr0Var2, new mmr0("position_ms", strValueOf2 != null ? strValueOf2 : "")})), y6h1VarA2, r6h1.c, System.currentTimeMillis()), (xj61) null);
                break;
        }
        return rih1Var;
    }
}
