package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class r0y implements xee, fkf1, kof1, g1b1 {
    public final /* synthetic */ byte a;
    public final kly0 b;
    public final idd1 c;
    public final Object d;

    public r0y(tsq tsqVar, o2p0 o2p0Var) {
        this.a = (byte) 1;
        this.b = tsqVar;
        this.d = o2p0Var;
        this.c = new idd1(new dch1(this, (byte) 21));
    }

    @Override // p.fkf1
    public final w7h1 a(ckf1 ckf1Var, String str, fvf1 fvf1Var) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        byte b = this.a;
        ckf1 ckf1Var2 = ckf1.a;
        b7x b7xVar = b7x.a;
        switch (b) {
            case 0:
                long j = fvf1Var.b;
                long j2 = fvf1Var.a;
                y6h1 y6h1Var = ((pdl0) this.d).b;
                if (ckf1Var == ckf1Var2) {
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
                    w7h1Var = new w7h1("", "", z7h1Var, new x7h1("skip_to_next", 2, sqg0.J(new mmr0[]{mmr0Var, mmr0Var2, new mmr0("total_content_ms", strValueOf2 == null ? "" : strValueOf2)})), y6h1VarA, r6h1.c, System.currentTimeMillis());
                } else {
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
                    w7h1Var = new w7h1("", "", z7h1Var2, new x7h1("skip_to_previous", 2, sqg0.J(new mmr0[]{mmr0Var3, mmr0Var4, new mmr0("total_content_ms", strValueOf4 == null ? "" : strValueOf4)})), y6h1VarA2, r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var;
            default:
                long j3 = fvf1Var.b;
                long j4 = fvf1Var.a;
                if (ckf1Var == ckf1Var2) {
                    g5l0 g5l0VarF = f();
                    x6h1 x6h1VarC3 = g5l0VarF.c.c();
                    x6h1VarC3.i.add(new a7h1("content_area", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                    x6h1VarC4.i.add(new a7h1("cover_art", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    y6h1 y6h1VarA3 = x6h1VarC4.a();
                    int i3 = (int) j4;
                    int i4 = (int) j3;
                    z7h1 z7h1Var3 = new z7h1("swipe", 1, b7xVar);
                    mmr0 mmr0Var5 = new mmr0("item_to_be_skipped", str);
                    String strValueOf5 = String.valueOf(i3);
                    if (strValueOf5 == null) {
                        strValueOf5 = "";
                    }
                    mmr0 mmr0Var6 = new mmr0("position_ms", strValueOf5);
                    String strValueOf6 = String.valueOf(i4);
                    w7h1Var2 = new w7h1("", "", z7h1Var3, new x7h1("skip_to_next", 2, sqg0.J(new mmr0[]{mmr0Var5, mmr0Var6, new mmr0("total_content_ms", strValueOf6 != null ? strValueOf6 : "")})), y6h1VarA3, g5l0VarF.b, System.currentTimeMillis());
                } else {
                    g5l0 g5l0VarF2 = f();
                    x6h1 x6h1VarC5 = g5l0VarF2.c.c();
                    x6h1VarC5.i.add(new a7h1("content_area", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                    x6h1VarC6.i.add(new a7h1("cover_art", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    y6h1 y6h1VarA4 = x6h1VarC6.a();
                    int i5 = (int) j4;
                    int i6 = (int) j3;
                    z7h1 z7h1Var4 = new z7h1("swipe", 1, b7xVar);
                    mmr0 mmr0Var7 = new mmr0("item_to_be_skipped", str);
                    String strValueOf7 = String.valueOf(i5);
                    if (strValueOf7 == null) {
                        strValueOf7 = "";
                    }
                    mmr0 mmr0Var8 = new mmr0("position_ms", strValueOf7);
                    String strValueOf8 = String.valueOf(i6);
                    w7h1Var2 = new w7h1("", "", z7h1Var4, new x7h1("skip_to_previous", 2, sqg0.J(new mmr0[]{mmr0Var7, mmr0Var8, new mmr0("total_content_ms", strValueOf8 != null ? strValueOf8 : "")})), y6h1VarA4, g5l0VarF2.b, System.currentTimeMillis());
                }
                return w7h1Var2;
        }
    }

    public void b() {
        i8h1 i8h1Var = (i8h1) this.c.getValue();
        g5l0 g5l0VarF = f();
        x6h1 x6h1VarC = g5l0VarF.c.c();
        x6h1VarC.i.add(new a7h1("sponsored_tooltip", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).b = g5l0VarF.b;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        i8h1Var.f(k7h1Var.a(), (Set) null);
    }

    public tv80 c(gof1 gof1Var, String str) {
        w7h1 w7h1Var;
        i8h1 i8h1Var = (i8h1) this.c.getValue();
        y6h1 y6h1Var = ((pdl0) this.d).b;
        b7x b7xVar = b7x.a;
        if (gof1Var == gof1.a) {
            x6h1 x6h1VarC = y6h1Var.c();
            x6h1VarC.i.add(new a7h1("track_information", (String) null, (Integer) null, (String) null, (String) null));
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
            x6h1VarC4.i.add(new a7h1("track_information", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC4.j = false;
            x6h1 x6h1VarC5 = x6h1VarC4.a().c();
            x6h1VarC5.i.add(new a7h1("labels", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC5.j = false;
            x6h1 x6h1VarC6 = x6h1VarC5.a().c();
            x6h1VarC6.i.add(new a7h1("artist_label", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC6.j = false;
            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis());
        }
        return i8h1Var.m(w7h1Var, (xj61) null);
    }

    public w7h1 d(String str, String str2) {
        x6h1 x6h1VarC = ((pdl0) this.d).b.c();
        x6h1VarC.i.add(new a7h1("track_information", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("labels", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        x6h1 x6h1VarC3 = x6h1VarC2.a().c();
        x6h1VarC3.i.add(new a7h1("neffle_button", (String) null, (Integer) null, str, (String) null));
        x6h1VarC3.j = false;
        return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
    }

    public w7h1 e(String str, String str2) {
        x6h1 x6h1VarC = ((pdl0) this.d).b.c();
        x6h1VarC.i.add(new a7h1("track_information", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("labels", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        x6h1 x6h1VarC3 = x6h1VarC2.a().c();
        x6h1VarC3.i.add(new a7h1("neffle_button", (String) null, (Integer) null, str, (String) null));
        x6h1VarC3.j = false;
        return new w7h1("", "", new z7h1("long_hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
    }

    public g5l0 f() {
        return new g5l0(((o2p0) this.d).a, (byte) 27);
    }

    public r6h1 g() {
        g5l0 g5l0VarF = f();
        x6h1 x6h1VarC = g5l0VarF.c.c();
        x6h1VarC.i.add(new a7h1("top_bar", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        r6h1 r6h1Var = r6h1.c;
        r6h1 r6h1Var2 = g5l0VarF.b;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(r6h1Var2.a);
        arrayList.add(y6h1VarA);
        return new r6h1(arrayList, r6h1Var2.b);
    }

    public r6h1 h() {
        g5l0 g5l0VarF = f();
        x6h1 x6h1VarC = g5l0VarF.c.c();
        x6h1VarC.i.add(new a7h1("overlay_controls", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        r6h1 r6h1Var = r6h1.c;
        r6h1 r6h1Var2 = g5l0VarF.b;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(r6h1Var2.a);
        arrayList.add(y6h1VarA);
        return new r6h1(arrayList, r6h1Var2.b);
    }

    public r6h1 i() {
        g5l0 g5l0VarF = f();
        x6h1 x6h1VarC = g5l0VarF.c.c();
        x6h1VarC.i.add(new a7h1("main_controls", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        r6h1 r6h1Var = r6h1.c;
        r6h1 r6h1Var2 = g5l0VarF.b;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(r6h1Var2.a);
        arrayList.add(y6h1VarA);
        return new r6h1(arrayList, r6h1Var2.b);
    }

    public r0y(bsp bspVar, pdl0 pdl0Var) {
        this.a = (byte) 0;
        this.b = bspVar;
        this.d = pdl0Var;
        this.c = new idd1(new v7v(this, (byte) 22));
    }
}
