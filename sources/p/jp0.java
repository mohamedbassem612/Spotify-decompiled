package p;

import com.spotify.adsdisplay.elementimpl.feedback.events.proto.AdFeedbackEvent;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jp0 implements xpw {
    public final t2j0 a;
    public final i44 b;
    public final ko0 c;
    public final dg30 d;
    public final los e;
    public final i8h1 f;
    public final js20 g = x3p1.m(r6x.a, new n5(1, this, jp0.class, "createState", "createState(Lcom/spotify/adsdisplay/element/feedback/AdFeedbackBottomSheetElement$Props;)Lcom/spotify/adsdisplay/elementimpl/feedback/AdFeedbackBottomSheetElementImpl$State;", 0, (byte) 5), new ab(this, (byte) 15), (o8n) null, new j2(this, (byte) 13), 8);
    public final ia00 h = n3o1.q(this).a(fp0.b, new m3(this, (byte) 11));
    public final psw i;

    public jp0(t2j0 t2j0Var, i44 i44Var, ko0 ko0Var, dg30 dg30Var, los losVar, i8h1 i8h1Var) {
        this.a = t2j0Var;
        this.b = i44Var;
        this.c = ko0Var;
        this.d = dg30Var;
        this.e = losVar;
        this.f = i8h1Var;
        j2i j2iVar = new j2i(1412638281, new r1(this, (byte) 12), true);
        ien0 ien0Var = qsw.a;
        this.i = new psw(j2iVar, (byte) 0);
    }

    public static w7h1 f(vpk0 vpk0Var, lo0 lo0Var, String str) {
        char c;
        String str2;
        zp0 zp0Var = lo0Var.a;
        if (str.equals("negative_repetitive")) {
            c = 4;
        } else if (str.equals("negative_brand")) {
            c = 2;
        } else if (str.equals("negative_product")) {
            c = 3;
        } else if (str.equals("negative_already_using")) {
            c = 1;
        } else {
            c = str.equals("negative_something_else") ? (char) 5 : (char) 0;
        }
        if (c == 0) {
            return null;
        }
        r6h1 r6h1VarB = vpk0Var.b();
        String strE = gq0.e(zp0Var.f);
        String str3 = zp0Var.c;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-ads-feedback-not-interested-menu";
        x6h1VarI.f = "1.1.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.b = str3;
        x6h1VarI.d = strE;
        x6h1 x6h1VarC = x6h1VarI.a().c();
        if (c == 1) {
            str2 = "negative_already_using";
        } else if (c == 2) {
            str2 = "negative_brand";
        } else if (c == 3) {
            str2 = "negative_product";
        } else if (c == 4) {
            str2 = "negative_repetitive";
        } else {
            if (c != 5) {
                throw null;
            }
            str2 = "negative_something_else";
        }
        x6h1VarC.i.add(new a7h1("feedback_context_menu_option", (String) null, (Integer) null, (String) null, str2));
        x6h1VarC.j = false;
        return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("dislike_ad", 1, Collections.singletonMap("reason", str)), x6h1VarC.a(), r6h1VarB, System.currentTimeMillis());
    }

    public final rqw a() {
        return this.h;
    }

    public final jsw c() {
        return this.i;
    }

    public final dp0 e(lo0 lo0Var) {
        String str;
        boolean z;
        smc0 smc0Var;
        k32 k32Var;
        List listK;
        zp0 zp0Var = lo0Var.a;
        String str2 = zp0Var.f;
        String str3 = zp0Var.b;
        hs10 hs10Var = zp0Var.a;
        if (u890.j(hs10Var, gs10.a)) {
            return new cp0(str3, p7h.M(new ap0[]{new ap0(2131951863, "like_relevance"), new ap0(2131951864, "like_brand"), new ap0(2131951865, "like_product"), new ap0(2131951866, "like_creative"), new ap0(2131951867, "like_discover")}));
        }
        if (u890.j(hs10Var, fs10.a)) {
            return new cp0(str3, p7h.M(new ap0[]{new ap0(2131951850, "dislike_repetitive"), new ap0(2131951849, "dislike_relevance"), new ap0(2131951851, "dislike_creative"), new ap0(2131951852, "dislike_offensive"), new ap0(2131951853, "dislike_unknown")}));
        }
        boolean z2 = hs10Var instanceof cs10;
        p32 p32Var = p32.REPORT_AD;
        p32 p32Var2 = p32.NOT_INTERESTED;
        p32 p32Var3 = p32.INTERESTED;
        u32 u32Var = u32.a;
        if (z2) {
            smc0 smc0VarN = k4p1.n();
            smc0VarN.add(new o32(p32Var3, 2131951982, (hux) jtx.c, (n32) new l32(new tx10(str2)), 8));
            smc0VarN.add(new o32(p32Var2, 2131951983, (hux) itx.c, (w32) u32Var, (n32) new m32("not_interested_reasons")));
            smc0VarN.add(new o32(p32Var, 2131951984, (hux) csx.c, (w32) u32Var, (n32) new m32("report_ad_categories")));
            if (((cs10) hs10Var).a && this.b.a()) {
                smc0VarN.add(new o32(p32.CLOSE_AD, 2131951980, (hux) fux.c, (n32) new l32(new sx10(str2)), 8));
            }
            smc0 smc0VarK = k4p1.k(smc0VarN);
            smc0 smc0VarN2 = k4p1.n();
            smc0VarN2.add(new r32("infeed_overflow_entry", new i32(str3, 2131951978), smc0VarK, null));
            smc0VarN2.add(ht71.a(str2));
            smc0VarN2.add(ht71.b());
            smc0VarN2.addAll(ht71.c(str2));
            smc0VarN2.add(new q32());
            return new bp0(new g32(k4p1.k(smc0VarN2)));
        }
        if (u890.j(hs10Var, es10.a)) {
            return new bp0(new g32(Collections.singletonList(new r32("instream_not_interested_reasons", new i32(str3, 2131951985), p7h.M(new o32[]{new o32(p32.TOO_OFTEN, 2131951990, (hux) null, new l32(new vx10("negative_repetitive", str2)), 12), new o32(p32.NOT_BRAND, 2131951987, (hux) null, new l32(new vx10("negative_brand", str2)), 12), new o32(p32.NOT_PRODUCT, 2131951988, (hux) null, new l32(new vx10("negative_product", str2)), 12), new o32(p32.ALREADY_USING, 2131951986, (hux) null, new l32(new vx10("negative_already_using", str2)), 12), new o32(p32.SOMETHING_ELSE, 2131951989, (hux) null, new l32(new vx10("negative_something_else", str2)), 12)}), null))));
        }
        if (!(hs10Var instanceof ds10)) {
            eg.o();
            return null;
        }
        ds10 ds10Var = (ds10) hs10Var;
        boolean z3 = ds10Var.c;
        smc0 smc0VarN3 = k4p1.n();
        k32 i32Var = new i32(str3, 2131951978);
        boolean z4 = ds10Var.b;
        if (z4) {
            listK = Collections.singletonList(new o32(p32.BRAND_SURVEY, 2131951979, (hux) eox.c, (n32) new l32(new rx10(str2)), 8));
            str = str2;
            z = z3;
            smc0Var = smc0VarN3;
            k32Var = i32Var;
        } else {
            smc0 smc0VarN4 = k4p1.n();
            if (ds10Var.a) {
                smc0VarN4.add(new o32(p32.DSA, 2131951981, (hux) eox.c, (n32) new l32(new ux10(str2)), 8));
            }
            if (z3) {
                str = str2;
                z = z3;
                smc0Var = smc0VarN3;
                k32Var = i32Var;
            } else {
                jtx jtxVar = jtx.c;
                z = z3;
                l32 l32Var = new l32(new tx10(str2));
                k32Var = i32Var;
                smc0Var = smc0VarN3;
                str = str2;
                smc0VarN4.add(new o32(p32Var3, 2131951982, (hux) jtxVar, (n32) l32Var, 8));
                smc0VarN4.add(new o32(p32Var2, 2131951983, (hux) itx.c, (w32) u32Var, (n32) new m32("not_interested_reasons")));
                smc0VarN4.add(new o32(p32Var, 2131951984, (hux) csx.c, (w32) u32Var, (n32) new m32("report_ad_categories")));
            }
            listK = k4p1.k(smc0VarN4);
        }
        smc0Var.add(new r32("instream_overflow_entry", k32Var, listK, null));
        if (!z4 && !z) {
            smc0Var.add(ht71.a(str));
            smc0Var.add(ht71.b());
            smc0Var.addAll(ht71.c(str));
            smc0Var.add(new q32());
        }
        return new bp0(new g32(k4p1.k(smc0Var)));
    }

    public final void g(zp0 zp0Var, String str) {
        tp0 tp0VarN = AdFeedbackEvent.n();
        tp0VarN.v(zp0Var.c);
        tp0VarN.s(zp0Var.d);
        tp0VarN.q(zp0Var.e);
        tp0VarN.n(zp0Var.f);
        tp0VarN.r(zp0Var.g);
        tp0VarN.u(zp0Var.i);
        tp0VarN.t(str);
        tp0VarN.w(zp0Var.t);
        Double d = zp0Var.Y;
        if (d != null) {
            tp0VarN.z(d.doubleValue());
        }
        Long l = zp0Var.X;
        if (l != null) {
            tp0VarN.x(l.longValue());
        }
        String str2 = zp0Var.Z;
        if (str2 != null) {
            tp0VarN.y(str2);
        }
        this.a.a(tp0VarN.build());
    }

    public final mqw getBehavior() {
        return this.g;
    }
}
