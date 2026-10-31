package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m5v0 implements g1b1, fkf1 {
    public final kly0 a;
    public final o2p0 b;
    public final n6r0 c;
    public final lik1 d;
    public final idd1 e = new idd1(new l5v0(this, (byte) 0));

    public m5v0(ywp ywpVar, o2p0 o2p0Var, n6r0 n6r0Var, lik1 lik1Var) {
        this.a = ywpVar;
        this.b = o2p0Var;
        this.c = n6r0Var;
        this.d = lik1Var;
    }

    @Override // p.fkf1
    public final w7h1 a(ckf1 ckf1Var, String str, fvf1 fvf1Var) {
        long j = fvf1Var.b;
        long j2 = fvf1Var.a;
        ckf1 ckf1Var2 = ckf1.a;
        b7x b7xVar = b7x.a;
        if (ckf1Var == ckf1Var2) {
            yhl0 yhl0VarD = d();
            x6h1 x6h1VarC = yhl0VarD.b.c();
            x6h1VarC.i.add(new a7h1("content_area", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            x6h1 x6h1VarC2 = x6h1VarC.a().c();
            x6h1VarC2.i.add(new a7h1("cover_art", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            y6h1 y6h1VarA = x6h1VarC2.a();
            int i = (int) j;
            z7h1 z7h1Var = new z7h1("swipe", 1, b7xVar);
            mmr0 mmr0Var = new mmr0("item_to_be_skipped", str);
            String strValueOf = String.valueOf((int) j2);
            if (strValueOf == null) {
                strValueOf = "";
            }
            mmr0 mmr0Var2 = new mmr0("position_ms", strValueOf);
            String strValueOf2 = String.valueOf(i);
            return new w7h1("", "", z7h1Var, new x7h1("skip_to_next", 2, sqg0.J(new mmr0[]{mmr0Var, mmr0Var2, new mmr0("total_content_ms", strValueOf2 != null ? strValueOf2 : "")})), y6h1VarA, yhl0VarD.a, System.currentTimeMillis());
        }
        yhl0 yhl0VarD2 = d();
        x6h1 x6h1VarC3 = yhl0VarD2.b.c();
        x6h1VarC3.i.add(new a7h1("content_area", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC3.j = false;
        x6h1 x6h1VarC4 = x6h1VarC3.a().c();
        x6h1VarC4.i.add(new a7h1("cover_art", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC4.j = false;
        y6h1 y6h1VarA2 = x6h1VarC4.a();
        int i2 = (int) j;
        z7h1 z7h1Var2 = new z7h1("swipe", 1, b7xVar);
        mmr0 mmr0Var3 = new mmr0("item_to_be_skipped", str);
        String strValueOf3 = String.valueOf((int) j2);
        if (strValueOf3 == null) {
            strValueOf3 = "";
        }
        mmr0 mmr0Var4 = new mmr0("position_ms", strValueOf3);
        String strValueOf4 = String.valueOf(i2);
        return new w7h1("", "", z7h1Var2, new x7h1("skip_to_previous", 2, sqg0.J(new mmr0[]{mmr0Var3, mmr0Var4, new mmr0("total_content_ms", strValueOf4 != null ? strValueOf4 : "")})), y6h1VarA2, yhl0VarD2.a, System.currentTimeMillis());
    }

    public final void b() {
        i8h1 i8h1Var = (i8h1) this.e.getValue();
        yhl0 yhl0VarD = d();
        x6h1 x6h1VarC = yhl0VarD.b.c();
        x6h1VarC.i.add(new a7h1("sponsored_tooltip", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).b = yhl0VarD.a;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        k7h1Var.e = yhl0VarD.c;
        i8h1Var.f(k7h1Var.a(), (Set) null);
    }

    public final yhl0 d() {
        return new yhl0(this.c.path(), this.d.a, this.b.a);
    }
}
