package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k62 implements fkf1 {
    public final yok0 a;

    public k62(yok0 yok0Var) {
        this.a = yok0Var;
    }

    @Override // p.fkf1
    public final w7h1 a(ckf1 ckf1Var, String str, fvf1 fvf1Var) {
        y6h1 y6h1Var = this.a.b;
        long j = fvf1Var.b;
        long j2 = fvf1Var.a;
        int iOrdinal = ckf1Var.ordinal();
        b7x b7xVar = b7x.a;
        if (iOrdinal == 0) {
            x6h1 x6h1VarC = y6h1Var.c();
            x6h1VarC.i.add(new a7h1("cover_art", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            y6h1 y6h1VarA = x6h1VarC.a();
            int i = (int) j2;
            int i2 = (int) j;
            z7h1 z7h1Var = new z7h1("swipe", 1, b7xVar);
            mmr0 mmr0Var = new mmr0("item_to_be_skipped", str);
            String strValueOf = String.valueOf(i);
            if (strValueOf == null) {
                strValueOf = "";
            }
            mmr0 mmr0Var2 = new mmr0("position_ms", strValueOf);
            String strValueOf2 = String.valueOf(i2);
            return new w7h1("", "", z7h1Var, new x7h1("skip_to_next", 2, sqg0.J(new mmr0[]{mmr0Var, mmr0Var2, new mmr0("total_content_ms", strValueOf2 != null ? strValueOf2 : "")})), y6h1VarA, r6h1.c, System.currentTimeMillis());
        }
        if (iOrdinal != 1) {
            eg.o();
            return null;
        }
        x6h1 x6h1VarC2 = y6h1Var.c();
        x6h1VarC2.i.add(new a7h1("cover_art", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        y6h1 y6h1VarA2 = x6h1VarC2.a();
        int i3 = (int) j2;
        int i4 = (int) j;
        z7h1 z7h1Var2 = new z7h1("swipe", 1, b7xVar);
        mmr0 mmr0Var3 = new mmr0("item_to_be_skipped", str);
        String strValueOf3 = String.valueOf(i3);
        if (strValueOf3 == null) {
            strValueOf3 = "";
        }
        mmr0 mmr0Var4 = new mmr0("position_ms", strValueOf3);
        String strValueOf4 = String.valueOf(i4);
        return new w7h1("", "", z7h1Var2, new x7h1("skip_to_previous", 2, sqg0.J(new mmr0[]{mmr0Var3, mmr0Var4, new mmr0("total_content_ms", strValueOf4 != null ? strValueOf4 : "")})), y6h1VarA2, r6h1.c, System.currentTimeMillis());
    }
}
