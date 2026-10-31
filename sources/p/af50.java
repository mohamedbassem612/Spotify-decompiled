package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class af50 implements fkf1, cf50 {
    public final kly0 a;
    public final o2p0 b;
    public final lik1 c;
    public final idd1 d = new idd1(new g050(this, (byte) 8));

    public af50(chp chpVar, o2p0 o2p0Var, lik1 lik1Var) {
        this.a = chpVar;
        this.b = o2p0Var;
        this.c = lik1Var;
    }

    @Override // p.fkf1
    public final w7h1 a(ckf1 ckf1Var, String str, fvf1 fvf1Var) {
        return new v7h1().a();
    }

    public final tv80 b(String str) {
        i8h1 i8h1Var = (i8h1) this.d.getValue();
        r6h1 r6h1Var = this.b.a;
        String str2 = this.c.a;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-now-playing-view-live-room";
        x6h1VarI.f = "9.1.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.d = str2;
        x6h1 x6h1VarC = x6h1VarI.a().c();
        x6h1VarC.i.add(new a7h1("track_information", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("labels", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        x6h1 x6h1VarC3 = x6h1VarC2.a().c();
        x6h1VarC3.i.add(new a7h1("title_label", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC3.j = false;
        return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC3.a(), r6h1Var, System.currentTimeMillis()), (xj61) null);
    }

    public final tv80 c(String str) {
        i8h1 i8h1Var = (i8h1) this.d.getValue();
        r6h1 r6h1Var = this.b.a;
        String str2 = this.c.a;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-now-playing-view-live-room";
        x6h1VarI.f = "9.1.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.d = str2;
        x6h1 x6h1VarC = x6h1VarI.a().c();
        x6h1VarC.i.add(new a7h1("track_information", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("labels", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        x6h1 x6h1VarC3 = x6h1VarC2.a().c();
        x6h1VarC3.i.add(new a7h1("host_label", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC3.j = false;
        return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC3.a(), r6h1Var, System.currentTimeMillis()), (xj61) null);
    }
}
