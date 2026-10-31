package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class sas implements fkf1, xee {
    public final /* synthetic */ byte a;
    public final o2p0 b;
    public final n6r0 c;
    public final lik1 d;

    public sas(lbp lbpVar, o2p0 o2p0Var, n6r0 n6r0Var, lik1 lik1Var) {
        this.a = (byte) 1;
        this.b = o2p0Var;
        this.c = n6r0Var;
        this.d = lik1Var;
    }

    @Override // p.fkf1
    public final w7h1 a(ckf1 ckf1Var, String str, fvf1 fvf1Var) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        w7h1 w7h1Var4;
        byte b = this.a;
        ckf1 ckf1Var2 = ckf1.a;
        b7x b7xVar = b7x.a;
        switch (b) {
            case 0:
                long j = fvf1Var.b;
                long j2 = fvf1Var.a;
                if (ckf1Var == ckf1Var2) {
                    khl0 khl0VarB = b();
                    x6h1 x6h1VarC = khl0VarB.b.c();
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
                    w7h1Var = new w7h1("", "", z7h1Var, new x7h1("skip_to_next", 2, sqg0.J(new mmr0[]{mmr0Var, mmr0Var2, new mmr0("total_content_ms", strValueOf2 == null ? "" : strValueOf2)})), y6h1VarA, khl0VarB.a, System.currentTimeMillis());
                } else {
                    khl0 khl0VarB2 = b();
                    x6h1 x6h1VarC3 = khl0VarB2.b.c();
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
                    w7h1Var = new w7h1("", "", z7h1Var2, new x7h1("skip_to_previous", 2, sqg0.J(new mmr0[]{mmr0Var3, mmr0Var4, new mmr0("total_content_ms", strValueOf4 == null ? "" : strValueOf4)})), y6h1VarA2, khl0VarB2.a, System.currentTimeMillis());
                }
                return w7h1Var;
            case 1:
                long j3 = fvf1Var.b;
                long j4 = fvf1Var.a;
                if (ckf1Var == ckf1Var2) {
                    nhl0 nhl0VarC = c();
                    x6h1 x6h1VarC5 = nhl0VarC.b.c();
                    x6h1VarC5.i.add(new a7h1("cover_art", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    y6h1 y6h1VarA3 = x6h1VarC5.a();
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
                    w7h1Var2 = new w7h1("", "", z7h1Var3, new x7h1("skip_to_next", 2, sqg0.J(new mmr0[]{mmr0Var5, mmr0Var6, new mmr0("total_content_ms", strValueOf6 == null ? "" : strValueOf6)})), y6h1VarA3, nhl0VarC.a, System.currentTimeMillis());
                } else {
                    nhl0 nhl0VarC2 = c();
                    x6h1 x6h1VarC6 = nhl0VarC2.b.c();
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
                    w7h1Var2 = new w7h1("", "", z7h1Var4, new x7h1("skip_to_previous", 2, sqg0.J(new mmr0[]{mmr0Var7, mmr0Var8, new mmr0("total_content_ms", strValueOf8 == null ? "" : strValueOf8)})), y6h1VarA4, nhl0VarC2.a, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 2:
                long j5 = fvf1Var.b;
                long j6 = fvf1Var.a;
                if (ckf1Var == ckf1Var2) {
                    phl0 phl0VarF = f();
                    x6h1 x6h1VarC7 = phl0VarF.b.c();
                    x6h1VarC7.i.add(new a7h1("content_area", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    x6h1 x6h1VarC8 = x6h1VarC7.a().c();
                    x6h1VarC8.i.add(new a7h1("cover_art", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    y6h1 y6h1VarA5 = x6h1VarC8.a();
                    int i7 = (int) j5;
                    z7h1 z7h1Var5 = new z7h1("swipe", 1, b7xVar);
                    mmr0 mmr0Var9 = new mmr0("item_to_be_skipped", str);
                    String strValueOf9 = String.valueOf((int) j6);
                    if (strValueOf9 == null) {
                        strValueOf9 = "";
                    }
                    mmr0 mmr0Var10 = new mmr0("position_ms", strValueOf9);
                    String strValueOf10 = String.valueOf(i7);
                    return new w7h1("", "", z7h1Var5, new x7h1("skip_to_next", 2, sqg0.J(new mmr0[]{mmr0Var9, mmr0Var10, new mmr0("total_content_ms", strValueOf10 == null ? "" : strValueOf10)})), y6h1VarA5, phl0VarF.a, System.currentTimeMillis());
                }
                phl0 phl0VarF2 = f();
                x6h1 x6h1VarC9 = phl0VarF2.b.c();
                x6h1VarC9.i.add(new a7h1("content_area", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC9.j = false;
                x6h1 x6h1VarC10 = x6h1VarC9.a().c();
                x6h1VarC10.i.add(new a7h1("cover_art", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC10.j = false;
                y6h1 y6h1VarA6 = x6h1VarC10.a();
                int i8 = (int) j5;
                z7h1 z7h1Var6 = new z7h1("swipe", 1, b7xVar);
                mmr0 mmr0Var11 = new mmr0("item_to_be_skipped", str);
                String strValueOf11 = String.valueOf((int) j6);
                if (strValueOf11 == null) {
                    strValueOf11 = "";
                }
                mmr0 mmr0Var12 = new mmr0("position_ms", strValueOf11);
                String strValueOf12 = String.valueOf(i8);
                return new w7h1("", "", z7h1Var6, new x7h1("skip_to_previous", 2, sqg0.J(new mmr0[]{mmr0Var11, mmr0Var12, new mmr0("total_content_ms", strValueOf12 == null ? "" : strValueOf12)})), y6h1VarA6, phl0VarF2.a, System.currentTimeMillis());
            case 3:
                long j7 = fvf1Var.b;
                long j8 = fvf1Var.a;
                if (ckf1Var == ckf1Var2) {
                    rhl0 rhl0VarG = g();
                    x6h1 x6h1VarC11 = rhl0VarG.b.c();
                    x6h1VarC11.i.add(new a7h1("content_area", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC11.j = false;
                    x6h1 x6h1VarC12 = x6h1VarC11.a().c();
                    x6h1VarC12.i.add(new a7h1("cover_art", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC12.j = false;
                    y6h1 y6h1VarA7 = x6h1VarC12.a();
                    int i9 = (int) j7;
                    z7h1 z7h1Var7 = new z7h1("swipe", 1, b7xVar);
                    mmr0 mmr0Var13 = new mmr0("item_to_be_skipped", str);
                    String strValueOf13 = String.valueOf((int) j8);
                    if (strValueOf13 == null) {
                        strValueOf13 = "";
                    }
                    mmr0 mmr0Var14 = new mmr0("position_ms", strValueOf13);
                    String strValueOf14 = String.valueOf(i9);
                    w7h1Var3 = new w7h1("", "", z7h1Var7, new x7h1("skip_to_next", 2, sqg0.J(new mmr0[]{mmr0Var13, mmr0Var14, new mmr0("total_content_ms", strValueOf14 == null ? "" : strValueOf14)})), y6h1VarA7, rhl0VarG.a, System.currentTimeMillis());
                } else {
                    rhl0 rhl0VarG2 = g();
                    x6h1 x6h1VarC13 = rhl0VarG2.b.c();
                    x6h1VarC13.i.add(new a7h1("content_area", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC13.j = false;
                    x6h1 x6h1VarC14 = x6h1VarC13.a().c();
                    x6h1VarC14.i.add(new a7h1("cover_art", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC14.j = false;
                    y6h1 y6h1VarA8 = x6h1VarC14.a();
                    int i10 = (int) j7;
                    z7h1 z7h1Var8 = new z7h1("swipe", 1, b7xVar);
                    mmr0 mmr0Var15 = new mmr0("item_to_be_skipped", str);
                    String strValueOf15 = String.valueOf((int) j8);
                    if (strValueOf15 == null) {
                        strValueOf15 = "";
                    }
                    mmr0 mmr0Var16 = new mmr0("position_ms", strValueOf15);
                    String strValueOf16 = String.valueOf(i10);
                    w7h1Var3 = new w7h1("", "", z7h1Var8, new x7h1("skip_to_previous", 2, sqg0.J(new mmr0[]{mmr0Var15, mmr0Var16, new mmr0("total_content_ms", strValueOf16 == null ? "" : strValueOf16)})), y6h1VarA8, rhl0VarG2.a, System.currentTimeMillis());
                }
                return w7h1Var3;
            default:
                long j9 = fvf1Var.b;
                long j10 = fvf1Var.a;
                if (ckf1Var == ckf1Var2) {
                    bil0 bil0VarH = h();
                    x6h1 x6h1VarC15 = bil0VarH.b.c();
                    x6h1VarC15.i.add(new a7h1("content_area", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC15.j = false;
                    x6h1 x6h1VarC16 = x6h1VarC15.a().c();
                    x6h1VarC16.i.add(new a7h1("cover_art", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC16.j = false;
                    y6h1 y6h1VarA9 = x6h1VarC16.a();
                    int i11 = (int) j10;
                    int i12 = (int) j9;
                    z7h1 z7h1Var9 = new z7h1("swipe", 1, b7xVar);
                    mmr0 mmr0Var17 = new mmr0("item_to_be_skipped", str);
                    String strValueOf17 = String.valueOf(i11);
                    if (strValueOf17 == null) {
                        strValueOf17 = "";
                    }
                    mmr0 mmr0Var18 = new mmr0("position_ms", strValueOf17);
                    String strValueOf18 = String.valueOf(i12);
                    w7h1Var4 = new w7h1("", "", z7h1Var9, new x7h1("skip_to_next", 2, sqg0.J(new mmr0[]{mmr0Var17, mmr0Var18, new mmr0("total_content_ms", strValueOf18 != null ? strValueOf18 : "")})), y6h1VarA9, bil0VarH.a, System.currentTimeMillis());
                } else {
                    bil0 bil0VarH2 = h();
                    x6h1 x6h1VarC17 = bil0VarH2.b.c();
                    x6h1VarC17.i.add(new a7h1("content_area", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC17.j = false;
                    x6h1 x6h1VarC18 = x6h1VarC17.a().c();
                    x6h1VarC18.i.add(new a7h1("cover_art", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC18.j = false;
                    y6h1 y6h1VarA10 = x6h1VarC18.a();
                    int i13 = (int) j10;
                    int i14 = (int) j9;
                    z7h1 z7h1Var10 = new z7h1("swipe", 1, b7xVar);
                    mmr0 mmr0Var19 = new mmr0("item_to_be_skipped", str);
                    String strValueOf19 = String.valueOf(i13);
                    if (strValueOf19 == null) {
                        strValueOf19 = "";
                    }
                    mmr0 mmr0Var20 = new mmr0("position_ms", strValueOf19);
                    String strValueOf20 = String.valueOf(i14);
                    w7h1Var4 = new w7h1("", "", z7h1Var10, new x7h1("skip_to_previous", 2, sqg0.J(new mmr0[]{mmr0Var19, mmr0Var20, new mmr0("total_content_ms", strValueOf20 != null ? strValueOf20 : "")})), y6h1VarA10, bil0VarH2.a, System.currentTimeMillis());
                }
                return w7h1Var4;
        }
    }

    public khl0 b() {
        return new khl0(this.c.path(), this.d.a, this.b.a);
    }

    public nhl0 c() {
        return new nhl0(this.c.path(), this.d.a, this.b.a);
    }

    public w7h1 d(String str, String str2) {
        nhl0 nhl0VarC = c();
        x6h1 x6h1VarC = nhl0VarC.b.c();
        x6h1VarC.i.add(new a7h1("track_information", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("neffle_button", (String) null, (Integer) null, str, (String) null));
        x6h1VarC2.j = false;
        return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC2.a(), nhl0VarC.a, System.currentTimeMillis());
    }

    public w7h1 e(String str, String str2) {
        nhl0 nhl0VarC = c();
        x6h1 x6h1VarC = nhl0VarC.b.c();
        x6h1VarC.i.add(new a7h1("track_information", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("neffle_button", (String) null, (Integer) null, str, (String) null));
        x6h1VarC2.j = false;
        return new w7h1("", "", new z7h1("long_hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC2.a(), nhl0VarC.a, System.currentTimeMillis());
    }

    public phl0 f() {
        return new phl0(this.c.path(), this.d.a, this.b.a);
    }

    public rhl0 g() {
        return new rhl0(this.c.path(), this.d.a, this.b.a);
    }

    public bil0 h() {
        return new bil0(this.c.path(), this.d.a, this.b.a);
    }

    public w7h1 i(q3a q3aVar, String str) {
        byte b = this.a;
        q3a q3aVar2 = q3a.a;
        b7x b7xVar = b7x.a;
        switch (b) {
            case 2:
                if (q3aVar == q3aVar2) {
                    phl0 phl0VarF = f();
                    x6h1 x6h1VarC = phl0VarF.b.c();
                    x6h1VarC.i.add(new a7h1("main_controls", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    x6h1 x6h1VarC2 = x6h1VarC.a().c();
                    x6h1VarC2.i.add(new a7h1("ban_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("dislike", 1, Collections.singletonMap("item_to_be_disliked", str)), x6h1VarC2.a(), phl0VarF.a, System.currentTimeMillis());
                }
                phl0 phl0VarF2 = f();
                x6h1 x6h1VarC3 = phl0VarF2.b.c();
                x6h1VarC3.i.add(new a7h1("main_controls", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("ban_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_dislike", 1, Collections.singletonMap("item_no_longer_disliked", str)), x6h1VarC4.a(), phl0VarF2.a, System.currentTimeMillis());
            case 3:
                if (q3aVar == q3aVar2) {
                    rhl0 rhl0VarG = g();
                    x6h1 x6h1VarC5 = rhl0VarG.b.c();
                    x6h1VarC5.i.add(new a7h1("main_controls", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                    x6h1VarC6.i.add(new a7h1("ban_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("dislike", 1, Collections.singletonMap("item_to_be_disliked", str)), x6h1VarC6.a(), rhl0VarG.a, System.currentTimeMillis());
                }
                rhl0 rhl0VarG2 = g();
                x6h1 x6h1VarC7 = rhl0VarG2.b.c();
                x6h1VarC7.i.add(new a7h1("main_controls", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC7.j = false;
                x6h1 x6h1VarC8 = x6h1VarC7.a().c();
                x6h1VarC8.i.add(new a7h1("ban_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC8.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_dislike", 1, Collections.singletonMap("item_no_longer_disliked", str)), x6h1VarC8.a(), rhl0VarG2.a, System.currentTimeMillis());
            default:
                if (q3aVar == q3aVar2) {
                    bil0 bil0VarH = h();
                    x6h1 x6h1VarC9 = bil0VarH.b.c();
                    x6h1VarC9.i.add(new a7h1("main_controls", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    x6h1 x6h1VarC10 = x6h1VarC9.a().c();
                    x6h1VarC10.i.add(new a7h1("ban_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC10.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("dislike", 1, Collections.singletonMap("item_to_be_disliked", str)), x6h1VarC10.a(), bil0VarH.a, System.currentTimeMillis());
                }
                bil0 bil0VarH2 = h();
                x6h1 x6h1VarC11 = bil0VarH2.b.c();
                x6h1VarC11.i.add(new a7h1("main_controls", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC11.j = false;
                x6h1 x6h1VarC12 = x6h1VarC11.a().c();
                x6h1VarC12.i.add(new a7h1("ban_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC12.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_dislike", 1, Collections.singletonMap("item_no_longer_disliked", str)), x6h1VarC12.a(), bil0VarH2.a, System.currentTimeMillis());
        }
    }

    public w7h1 j(String str) {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        switch (b) {
            case 0:
                khl0 khl0VarB = b();
                x6h1 x6h1VarC = khl0VarB.b.c();
                x6h1VarC.i.add(new a7h1("track_information", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("minus_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), khl0VarB.a, System.currentTimeMillis());
            default:
                bil0 bil0VarH = h();
                x6h1 x6h1VarC3 = bil0VarH.b.c();
                x6h1VarC3.i.add(new a7h1("track_information", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("minus_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("dislike", 1, Collections.singletonMap("item_to_be_disliked", str)), x6h1VarC4.a(), bil0VarH.a, System.currentTimeMillis());
        }
    }

    public /* synthetic */ sas(o2p0 o2p0Var, n6r0 n6r0Var, lik1 lik1Var, byte b) {
        this.a = b;
        this.b = o2p0Var;
        this.c = n6r0Var;
        this.d = lik1Var;
    }
}
