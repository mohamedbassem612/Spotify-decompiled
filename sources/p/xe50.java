package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xe50 implements fkf1, cf50 {
    public final kly0 a;
    public final yok0 b;
    public final idd1 c = new idd1(new g050(this, (byte) 6));

    public xe50(bsp bspVar, yok0 yok0Var) {
        this.a = bspVar;
        this.b = yok0Var;
    }

    @Override // p.fkf1
    public final w7h1 a(ckf1 ckf1Var, String str, fvf1 fvf1Var) {
        return new v7h1().a();
    }

    public final tv80 b(String str) {
        i8h1 i8h1Var = (i8h1) this.c.getValue();
        x6h1 x6h1VarC = this.b.b.c();
        x6h1VarC.i.add(new a7h1("track_information", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("title_label", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public final tv80 c(String str) {
        i8h1 i8h1Var = (i8h1) this.c.getValue();
        x6h1 x6h1VarC = this.b.b.c();
        x6h1VarC.i.add(new a7h1("track_information", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("subtitle_label", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }
}
