package p;

import android.content.Context;
import com.spotify.scrollsita.v1.Section;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fdm extends hab0 implements zu30 {
    public static final fdm N0;
    public static final fdm O0;
    public static final fdm P0;
    public static final fdm Q0;
    public static final fdm R0;
    public static final fdm S0;
    public static final fdm T0;
    public static final fdm U0;
    public static final fdm V0;
    public static final fdm W0;
    public static final fdm X;
    public static final fdm X0;
    public static final fdm Y;
    public static final fdm Y0;
    public static final fdm Z;
    public static final fdm Z0;
    public static final fdm a1;
    public static final fdm b;
    public static final fdm b1;
    public static final fdm c;
    public static final fdm c1;
    public static final fdm d;
    public static final fdm d1;
    public static final fdm e;
    public static final fdm e1;
    public static final fdm f;
    public static final fdm g;
    public static final fdm h;
    public static final fdm i;
    public static final fdm t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new fdm(i2, (byte) 0);
        c = new fdm(i2, (byte) 1);
        d = new fdm(i2, (byte) 2);
        e = new fdm(i2, (byte) 3);
        f = new fdm(i2, (byte) 4);
        g = new fdm(i2, (byte) 5);
        h = new fdm(i2, (byte) 6);
        i = new fdm(i2, (byte) 7);
        t = new fdm(i2, (byte) 8);
        X = new fdm(i2, (byte) 9);
        Y = new fdm(i2, (byte) 10);
        Z = new fdm(i2, (byte) 11);
        N0 = new fdm(i2, (byte) 12);
        O0 = new fdm(i2, (byte) 13);
        P0 = new fdm(i2, (byte) 14);
        Q0 = new fdm(i2, (byte) 15);
        R0 = new fdm(i2, (byte) 16);
        S0 = new fdm(i2, (byte) 17);
        T0 = new fdm(i2, (byte) 18);
        U0 = new fdm(i2, (byte) 19);
        V0 = new fdm(i2, (byte) 20);
        W0 = new fdm(i2, (byte) 21);
        X0 = new fdm(i2, (byte) 22);
        Y0 = new fdm(i2, (byte) 23);
        Z0 = new fdm(i2, (byte) 24);
        a1 = new fdm(i2, (byte) 25);
        b1 = new fdm(i2, (byte) 26);
        c1 = new fdm(i2, (byte) 27);
        d1 = new fdm(i2, (byte) 28);
        e1 = new fdm(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fdm(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        Object obj5;
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        switch (b2) {
            case 0:
                return ((mpk0) obj).h();
            case 1:
                ((Number) obj3).intValue();
                return new ryk0((r6h1) obj4);
            case 2:
                return null;
            case 3:
                return ((ryk0) obj).e();
            case 4:
                return null;
            case 5:
                return new as0((Context) obj2, (iu30) obj4, (byte) 7);
            case 6:
                ((Number) obj3).intValue();
                return new kml0(new fjl0((r6h1) obj4, (byte) 8));
            case 7:
                uml0 uml0Var = (uml0) obj;
                if (jfm.a[((eem) obj4).ordinal()] == 1) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), uml0Var.a, uml0Var.b.a, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 8:
                kml0 kml0Var = (kml0) obj;
                if (kfm.a[((gem) obj4).ordinal()] == 1) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), kml0Var.a, kml0Var.b.b, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 9:
                ((Number) obj4).intValue();
                return new uml0((yml0) obj);
            case 10:
                ((Number) obj3).intValue();
                return new vll0(((tmm) obj2).b, (r6h1) obj4);
            case 11:
                return null;
            case 12:
                ((Number) obj3).intValue();
                return new cml0(new fjl0((r6h1) obj4, (byte) 5), ((nsm) obj2).a ? 2 : 1);
            case 13:
                cml0 cml0Var = (cml0) obj;
                boolean z = ((nsm) obj3).a;
                char c2 = z ? (char) 2 : (char) 1;
                char c3 = z ? (char) 1 : (char) 2;
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                String str = "off";
                if (c2 == 1) {
                    obj5 = "off";
                } else {
                    if (c2 != 2) {
                        throw null;
                    }
                    obj5 = "on";
                }
                mmr0 mmr0Var = new mmr0("state_before_toggle", obj5);
                if (c3 != 1) {
                    if (c3 != 2) {
                        throw null;
                    }
                    str = "on";
                }
                return new w7h1("", "", z7h1Var, new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{mmr0Var, new mmr0("state_after_toggle", str)})), cml0Var.a, cml0Var.b.b, System.currentTimeMillis());
            case 14:
                swm swmVar = (swm) obj4;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", gvg.h("spotify:artist:", (String) o7h.A0(ihc1.Q0(swmVar.b, new String[]{":"}, 0, 6)), ":dna:blend:", (String) o7h.A0(ihc1.Q0(swmVar.a, new String[]{":"}, 0, 6))))), ((s0m0) obj).a, r6h1.c, System.currentTimeMillis());
            case 15:
                x6h1 x6h1VarC = ((u0m0) obj).a.c();
                x6h1VarC.i.add(new a7h1("see_all_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", ((hxm) obj4).a.concat(":dna"))), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
            case 16:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", ((qxm) obj4).a.concat(":dna"))), ((q0m0) obj).a, r6h1.c, System.currentTimeMillis());
            case 17:
                return new rxm((jo70) obj2, (k1r) obj3, (f7a1) obj, (xkk1) obj4);
            case 18:
                x6h1 x6h1VarC2 = ((r0m0) obj).a.c();
                x6h1VarC2.i.add(new a7h1("see_all_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", ((eym) obj4).a.concat(":dna"))), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
            case 19:
                ((Number) obj3).intValue();
                return new jfl0((r6h1) obj4);
            case 20:
                jfl0 jfl0Var = (jfl0) obj;
                c0n c0nVar = (c0n) obj4;
                r6h1 r6h1Var = jfl0Var.a;
                y6h1 y6h1Var = jfl0Var.b;
                if (c0nVar instanceof a0n) {
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var, r6h1Var, System.currentTimeMillis());
                } else {
                    if (!(c0nVar instanceof b0n)) {
                        eg.o();
                        return null;
                    }
                    w7h1Var = new w7h1("", "", new z7h1("swipe_left", 1, b7xVar), new x7h1("delete_chat", 1, b7xVar), y6h1Var, r6h1Var, System.currentTimeMillis());
                }
                return w7h1Var;
            case 21:
                g2n g2nVar = (g2n) obj;
                ((Number) obj3).intValue();
                return new m3l0(Integer.valueOf(g2nVar.a), g2nVar.b, g2nVar.e, (r6h1) obj4);
            case 22:
                m3l0 m3l0Var = (m3l0) obj;
                String str2 = nik1.w6.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2 != null ? str2 : "")), m3l0Var.b, m3l0Var.a, System.currentTimeMillis());
            case 23:
                return null;
            case 24:
                ((Number) obj3).intValue();
                r6h1 r6h1Var2 = r6h1.c;
                return new wuk0();
            case 25:
                ykn yknVar = (ykn) obj2;
                bln blnVar = (bln) obj3;
                ukn uknVar = (xkn) obj4;
                y6h1 y6h1Var2 = ((wuk0) obj).a;
                if (uknVar instanceof qkn) {
                    x6h1 x6h1VarC3 = y6h1Var2.c();
                    x6h1VarC3.i.add(new a7h1("create_group_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", pcf.k(blnVar.c(), o7h.l1(blnVar.a().keySet()), blnVar.b()))), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
                } else if (uknVar instanceof ukn) {
                    x6h1 x6h1VarC4 = y6h1Var2.c();
                    x6h1VarC4.i.add(new a7h1("selected_users_row", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    y6h1 y6h1VarA = x6h1VarC4.a();
                    Integer numValueOf = Integer.valueOf(uknVar.a);
                    x6h1 x6h1VarC5 = y6h1VarA.c();
                    x6h1VarC5.i.add(new a7h1("selected_user", (String) null, numValueOf, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis());
                } else if (uknVar instanceof wkn) {
                    wkn wknVar = (wkn) uknVar;
                    String str3 = wknVar.e;
                    int i2 = wknVar.a;
                    if (wknVar.d) {
                        x6h1 x6h1VarC6 = y6h1Var2.c();
                        x6h1VarC6.i.add(new a7h1("suggested_users", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC6.j = false;
                        y6h1 y6h1VarA2 = x6h1VarC6.a();
                        Integer numValueOf2 = Integer.valueOf(i2);
                        x6h1 x6h1VarC7 = y6h1VarA2.c();
                        x6h1VarC7.i.add(new a7h1("user", (String) null, numValueOf2, str3, (String) null));
                        x6h1VarC7.j = true;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_element_toggle", 1, b7xVar), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis());
                    } else {
                        x6h1 x6h1VarC8 = y6h1Var2.c();
                        x6h1VarC8.i.add(new a7h1("selectable_users", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC8.j = false;
                        y6h1 y6h1VarA3 = x6h1VarC8.a();
                        Integer numValueOf3 = Integer.valueOf(i2);
                        x6h1 x6h1VarC9 = y6h1VarA3.c();
                        x6h1VarC9.i.add(new a7h1("user", (String) null, numValueOf3, str3, (String) null));
                        x6h1VarC9.j = true;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_element_toggle", 1, b7xVar), x6h1VarC9.a(), r6h1.c, System.currentTimeMillis());
                    }
                } else {
                    if (!(uknVar instanceof pkn)) {
                        if (uknVar.equals(tkn.a) || uknVar.equals(vkn.a) || (uknVar instanceof skn) || uknVar.equals(rkn.a)) {
                            return null;
                        }
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC10 = y6h1Var2.c();
                    x6h1VarC10.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC10.j = false;
                    y6h1 y6h1VarA4 = x6h1VarC10.a();
                    String str4 = yknVar.c;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str4 != null ? str4 : "")), y6h1VarA4, r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 26:
                return new tuk0(Integer.valueOf(((Number) obj3).intValue()), (r6h1) obj4);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                ((Number) obj3).intValue();
                return new o3l0();
            case 28:
                return null;
            default:
                xmn xmnVar = (xmn) obj;
                ((Number) obj3).intValue();
                return new n3l0(new o3l0(), xmnVar.a.h, Integer.valueOf(xmnVar.b));
        }
    }
}
