package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n5v0 implements fkf1, kof1 {
    public final i8h1 a;
    public final pdl0 b;

    public n5v0(i8h1 i8h1Var, pdl0 pdl0Var) {
        this.a = i8h1Var;
        this.b = pdl0Var;
    }

    @Override // p.fkf1
    public final w7h1 a(ckf1 ckf1Var, String str, fvf1 fvf1Var) {
        long j = fvf1Var.b;
        long j2 = fvf1Var.a;
        y6h1 y6h1Var = this.b.b;
        b7x b7xVar = b7x.a;
        if (ckf1Var == ckf1.a) {
            x6h1 x6h1VarC = y6h1Var.c();
            x6h1VarC.i.add(new a7h1("cover_art", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            y6h1 y6h1VarA = x6h1VarC.a();
            int i = (int) j;
            z7h1 z7h1Var = new z7h1("swipe", 1, b7xVar);
            mmr0 mmr0Var = new mmr0("item_to_be_skipped", str);
            String strValueOf = String.valueOf((int) j2);
            if (strValueOf == null) {
                strValueOf = "";
            }
            mmr0 mmr0Var2 = new mmr0("position_ms", strValueOf);
            String strValueOf2 = String.valueOf(i);
            return new w7h1("", "", z7h1Var, new x7h1("skip_to_next", 2, sqg0.J(new mmr0[]{mmr0Var, mmr0Var2, new mmr0("total_content_ms", strValueOf2 != null ? strValueOf2 : "")})), y6h1VarA, r6h1.c, System.currentTimeMillis());
        }
        x6h1 x6h1VarC2 = y6h1Var.c();
        x6h1VarC2.i.add(new a7h1("cover_art", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        y6h1 y6h1VarA2 = x6h1VarC2.a();
        int i2 = (int) j;
        z7h1 z7h1Var2 = new z7h1("swipe", 1, b7xVar);
        mmr0 mmr0Var3 = new mmr0("item_to_be_skipped", str);
        String strValueOf3 = String.valueOf((int) j2);
        if (strValueOf3 == null) {
            strValueOf3 = "";
        }
        mmr0 mmr0Var4 = new mmr0("position_ms", strValueOf3);
        String strValueOf4 = String.valueOf(i2);
        return new w7h1("", "", z7h1Var2, new x7h1("skip_to_previous", 2, sqg0.J(new mmr0[]{mmr0Var3, mmr0Var4, new mmr0("total_content_ms", strValueOf4 != null ? strValueOf4 : "")})), y6h1VarA2, r6h1.c, System.currentTimeMillis());
    }

    public final tv80 c(gof1 gof1Var, String str) {
        w7h1 w7h1Var;
        y6h1 y6h1Var = this.b.b;
        b7x b7xVar = b7x.a;
        if (gof1Var == gof1.a) {
            x6h1 x6h1VarC = y6h1Var.c();
            x6h1VarC.i.add(new a7h1("podcast_information", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            x6h1 x6h1VarC2 = x6h1VarC.a().c();
            x6h1VarC2.i.add(new a7h1("labels", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            x6h1 x6h1VarC3 = x6h1VarC2.a().c();
            x6h1VarC3.i.add(new a7h1("title_label", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC3.j = false;
            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
        } else {
            x6h1 x6h1VarC4 = y6h1Var.c();
            x6h1VarC4.i.add(new a7h1("podcast_information", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC4.j = false;
            x6h1 x6h1VarC5 = x6h1VarC4.a().c();
            x6h1VarC5.i.add(new a7h1("labels", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC5.j = false;
            x6h1 x6h1VarC6 = x6h1VarC5.a().c();
            x6h1VarC6.i.add(new a7h1("artist_label", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC6.j = false;
            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis());
        }
        return this.a.m(w7h1Var, (xj61) null);
    }
}
