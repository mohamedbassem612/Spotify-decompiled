package p;

import android.content.Context;
import com.spotify.scrollsita.v1.Section;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fp0 extends hab0 implements zu30 {
    public static final fp0 N0;
    public static final fp0 O0;
    public static final fp0 P0;
    public static final fp0 Q0;
    public static final fp0 R0;
    public static final fp0 S0;
    public static final fp0 T0;
    public static final fp0 U0;
    public static final fp0 V0;
    public static final fp0 W0;
    public static final fp0 X;
    public static final fp0 X0;
    public static final fp0 Y;
    public static final fp0 Y0;
    public static final fp0 Z;
    public static final fp0 Z0;
    public static final fp0 a1;
    public static final fp0 b;
    public static final fp0 b1;
    public static final fp0 c;
    public static final fp0 c1;
    public static final fp0 d;
    public static final fp0 d1;
    public static final fp0 e;
    public static final fp0 e1;
    public static final fp0 f;
    public static final fp0 g;
    public static final fp0 h;
    public static final fp0 i;
    public static final fp0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new fp0(i2, (byte) 0);
        c = new fp0(i2, (byte) 1);
        d = new fp0(i2, (byte) 2);
        e = new fp0(i2, (byte) 3);
        f = new fp0(i2, (byte) 4);
        g = new fp0(i2, (byte) 5);
        h = new fp0(i2, (byte) 6);
        i = new fp0(i2, (byte) 7);
        t = new fp0(i2, (byte) 8);
        X = new fp0(i2, (byte) 9);
        Y = new fp0(i2, (byte) 10);
        Z = new fp0(i2, (byte) 11);
        N0 = new fp0(i2, (byte) 12);
        O0 = new fp0(i2, (byte) 13);
        P0 = new fp0(i2, (byte) 14);
        Q0 = new fp0(i2, (byte) 15);
        R0 = new fp0(i2, (byte) 16);
        S0 = new fp0(i2, (byte) 17);
        T0 = new fp0(i2, (byte) 18);
        U0 = new fp0(i2, (byte) 19);
        V0 = new fp0(i2, (byte) 20);
        W0 = new fp0(i2, (byte) 21);
        X0 = new fp0(i2, (byte) 22);
        Y0 = new fp0(i2, (byte) 23);
        Z0 = new fp0(i2, (byte) 24);
        a1 = new fp0(i2, (byte) 25);
        b1 = new fp0(i2, (byte) 26);
        c1 = new fp0(i2, (byte) 27);
        d1 = new fp0(i2, (byte) 28);
        e1 = new fp0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fp0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        byte b2 = this.a;
        int i2 = 2;
        b7x b7xVar = b7x.a;
        String strG = null;
        switch (b2) {
            case 0:
                ((Number) obj3).intValue();
                zp0 zp0Var = ((lo0) obj).a;
                return new vpk0(zp0Var.c, gq0.e(zp0Var.f), (r6h1) obj4);
            case 1:
                return ((mpk0) obj).h();
            case 2:
                ((Number) obj3).intValue();
                r6h1 r6h1Var = (r6h1) obj4;
                i6h1 i6h1Var = ((zq0) obj2).f;
                return new ypk0(i6h1Var != null ? i6h1Var.b : null, i6h1Var != null ? i6h1Var.a : null, r6h1Var);
            case 3:
                ypk0 ypk0Var = (ypk0) obj;
                ki0 ki0Var = ((zq0) obj3).a;
                strG = ki0Var != null ? ki0Var.g() : null;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", strG != null ? strG : "")), ypk0Var.b, ypk0Var.a, System.currentTimeMillis());
            case 4:
                ((Number) obj3).intValue();
                ji0 ji0Var = ((zr0) obj).a;
                return new xpk0(new py9((r6h1) obj4, (byte) 8), ji0Var.h, ji0Var.W0, ji0Var.b);
            case 5:
                return new ow0((Context) obj2, (iu30) obj4, (byte) 0);
            case 6:
                return new ow0((Context) obj2, (iu30) obj4, (byte) 1);
            case 7:
                ((Number) obj3).intValue();
                r6h1 r6h1Var2 = (r6h1) obj4;
                i6h1 i6h1Var2 = ((ez0) obj2).f;
                return new zpk0(i6h1Var2 != null ? i6h1Var2.b : null, i6h1Var2 != null ? i6h1Var2.a : null, r6h1Var2);
            case 8:
                zpk0 zpk0Var = (zpk0) obj;
                ty0 ty0Var = (vy0) obj4;
                if (ty0Var instanceof ty0) {
                    int i3 = (int) ty0Var.a;
                    z7h1 z7h1Var = new z7h1("drag", 1, b7xVar);
                    String strValueOf = String.valueOf(i3);
                    strG = new w7h1("", "", z7h1Var, new x7h1("seek_to_time", 1, Collections.singletonMap("ms_to_seek_to", strValueOf != null ? strValueOf : "")), zpk0Var.b, zpk0Var.a, System.currentTimeMillis());
                } else if (!ty0Var.equals(sy0.a) && !ty0Var.equals(uy0.a)) {
                    eg.o();
                }
                return strG;
            case 9:
                ((Number) obj3).intValue();
                return new o7l0();
            case 10:
                ub1 ub1Var = (ub1) obj;
                ((Number) obj3).intValue();
                z7l0 z7l0Var = new z7l0((r6h1) obj4);
                boolean z = ub1Var.c;
                iyr0 iyr0Var = ub1Var.b;
                if (z) {
                    int iOrdinal = iyr0Var.ordinal();
                    if (iOrdinal == 0) {
                        i2 = 1;
                    } else if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    return new y7l0(z7l0Var, i2);
                }
                int iOrdinal2 = iyr0Var.ordinal();
                if (iOrdinal2 == 0) {
                    i2 = 1;
                } else if (iOrdinal2 != 1) {
                    eg.o();
                    return null;
                }
                return new v7l0(z7l0Var, i2);
            case 11:
                n8h1 n8h1Var = (n8h1) obj;
                ub1 ub1Var2 = (ub1) obj2;
                if (!((tb1) obj4).equals(tb1.a)) {
                    eg.o();
                    return null;
                }
                if (ub1Var2.c) {
                    return ((y7l0) n8h1Var).e();
                }
                v7l0 v7l0Var = (v7l0) n8h1Var;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("submit", 1, b7xVar), v7l0Var.a, v7l0Var.b.a, System.currentTimeMillis());
            case 12:
                ((Number) obj3).intValue();
                return new fpk0();
            case 13:
                ac1 ac1Var = (ac1) obj4;
                y6h1 y6h1Var = ((fpk0) obj).a;
                if (ac1Var instanceof zb1) {
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("continue_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    String str = bc1.f;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), y6h1VarA, r6h1.c, System.currentTimeMillis());
                } else {
                    if (!(ac1Var instanceof yb1)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC2 = y6h1Var.c();
                    x6h1VarC2.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var;
            case 14:
                ((Number) obj3).intValue();
                return new wll0(new fjl0((r6h1) obj4, (byte) 5));
            case 15:
                wll0 wll0Var = (wll0) obj;
                if (((fd1) obj4).equals(fd1.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:assisted-curation")), wll0Var.a, wll0Var.b.b, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 16:
                ((Number) obj3).intValue();
                return new bpk0(new epk0((r6h1) obj4));
            case 17:
                bpk0 bpk0Var = (bpk0) obj;
                if (((nd1) obj4) instanceof nd1) {
                    return bpk0Var.e();
                }
                eg.o();
                return null;
            case 18:
                return new icl0(Integer.valueOf(((Number) obj3).intValue()), (r6h1) obj4);
            case 19:
                icl0 icl0Var = (icl0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), icl0Var.b, icl0Var.a, System.currentTimeMillis());
            case 20:
                ((Number) obj3).intValue();
                return new oll0(new fjl0((r6h1) obj4, (byte) 3));
            case 21:
                oll0 oll0Var = (oll0) obj;
                if (((ke1) obj4).equals(ke1.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:assisted-curation")), oll0Var.a, oll0Var.b.b, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 22:
                ((Number) obj3).intValue();
                return new ekl0((r6h1) obj4);
            case 23:
                ekl0 ekl0Var = (ekl0) obj;
                yh1 yh1Var = (yh1) obj2;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", dj20.c(yh1Var.e, 1, yh1Var.a, yh1Var.b, Long.valueOf(yh1Var.c), Long.valueOf(yh1Var.d)))), ekl0Var.b, ekl0Var.a, System.currentTimeMillis());
            case 24:
                ((Number) obj3).intValue();
                return new fkl0();
            case 25:
                return null;
            case 26:
                ((Number) obj3).intValue();
                r6h1 r6h1Var3 = r6h1.c;
                return new suk0();
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                ej1 ej1Var = (ej1) obj4;
                y6h1 y6h1Var2 = ((suk0) obj).a;
                if (ej1Var instanceof dj1) {
                    dj1 dj1Var = (dj1) ej1Var;
                    String str2 = dj1Var.e;
                    int i4 = dj1Var.d;
                    if (dj1Var.c) {
                        x6h1 x6h1VarC3 = y6h1Var2.c();
                        x6h1VarC3.i.add(new a7h1("suggested_users", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC3.j = false;
                        y6h1 y6h1VarA2 = x6h1VarC3.a();
                        Integer numValueOf = Integer.valueOf(i4);
                        x6h1 x6h1VarC4 = y6h1VarA2.c();
                        x6h1VarC4.i.add(new a7h1("user", (String) null, numValueOf, str2, (String) null));
                        x6h1VarC4.j = true;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_element_toggle", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
                    } else {
                        x6h1 x6h1VarC5 = y6h1Var2.c();
                        x6h1VarC5.i.add(new a7h1("invitable_users", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC5.j = false;
                        y6h1 y6h1VarA3 = x6h1VarC5.a();
                        Integer numValueOf2 = Integer.valueOf(i4);
                        x6h1 x6h1VarC6 = y6h1VarA3.c();
                        x6h1VarC6.i.add(new a7h1("user", (String) null, numValueOf2, str2, (String) null));
                        x6h1VarC6.j = true;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_element_toggle", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis());
                    }
                } else if (ej1Var instanceof cj1) {
                    x6h1 x6h1VarC7 = y6h1Var2.c();
                    x6h1VarC7.i.add(new a7h1("added_members_row", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    x6h1 x6h1VarC8 = x6h1VarC7.a().c();
                    x6h1VarC8.i.add(new a7h1("member", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (!ej1Var.equals(yi1.a)) {
                        if ((ej1Var instanceof aj1) || ej1Var.equals(zi1.a) || ej1Var.equals(bj1.a) || ej1Var.equals(wi1.a) || ej1Var.equals(xi1.a)) {
                            return null;
                        }
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC9 = y6h1Var2.c();
                    x6h1VarC9.i.add(new a7h1("invite_to_group_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC9.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 28:
                ((Number) obj3).intValue();
                return new fil0(((zl1) obj2).e ? "smartShuffleRecommendation" : null, (r6h1) obj4);
            default:
                fil0 fil0Var = (fil0) obj;
                zl1 zl1Var = (zl1) obj3;
                r6h1 r6h1Var4 = fil0Var.a;
                y6h1 y6h1Var3 = fil0Var.b;
                String str3 = zl1Var.c;
                int iOrdinal3 = ((wl1) obj4).ordinal();
                if (iOrdinal3 == 0) {
                    w7h1Var3 = zl1Var.e ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("add_to_playlist", 2, sqg0.J(new mmr0[]{new mmr0("playlist", zl1Var.d), new mmr0("item_to_be_added", str3)})), y6h1Var3, r6h1Var4, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("like", 1, Collections.singletonMap("item_to_be_liked", str3)), y6h1Var3, r6h1Var4, System.currentTimeMillis());
                } else {
                    if (iOrdinal3 != 1) {
                        eg.o();
                        return null;
                    }
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_like", 1, Collections.singletonMap("item_no_longer_liked", str3)), y6h1Var3, r6h1Var4, System.currentTimeMillis());
                }
                return w7h1Var3;
        }
    }
}
