package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class n1 extends hab0 implements zu30 {
    public static final n1 N0;
    public static final n1 O0;
    public static final n1 P0;
    public static final n1 Q0;
    public static final n1 R0;
    public static final n1 S0;
    public static final n1 T0;
    public static final n1 U0;
    public static final n1 V0;
    public static final n1 W0;
    public static final n1 X;
    public static final n1 X0;
    public static final n1 Y;
    public static final n1 Y0;
    public static final n1 Z;
    public static final n1 Z0;
    public static final n1 a1;
    public static final n1 b;
    public static final n1 b1;
    public static final n1 c;
    public static final n1 c1;
    public static final n1 d;
    public static final n1 d1;
    public static final n1 e;
    public static final n1 e1;
    public static final n1 f;
    public static final n1 g;
    public static final n1 h;
    public static final n1 i;
    public static final n1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new n1(i2, (byte) 0);
        c = new n1(i2, (byte) 1);
        d = new n1(i2, (byte) 2);
        e = new n1(i2, (byte) 3);
        f = new n1(i2, (byte) 4);
        g = new n1(i2, (byte) 5);
        h = new n1(i2, (byte) 6);
        i = new n1(i2, (byte) 7);
        t = new n1(i2, (byte) 8);
        X = new n1(i2, (byte) 9);
        Y = new n1(i2, (byte) 10);
        Z = new n1(i2, (byte) 11);
        N0 = new n1(i2, (byte) 12);
        O0 = new n1(i2, (byte) 13);
        P0 = new n1(i2, (byte) 14);
        Q0 = new n1(i2, (byte) 15);
        R0 = new n1(i2, (byte) 16);
        S0 = new n1(i2, (byte) 17);
        T0 = new n1(i2, (byte) 18);
        U0 = new n1(i2, (byte) 19);
        V0 = new n1(i2, (byte) 20);
        W0 = new n1(i2, (byte) 21);
        X0 = new n1(i2, (byte) 22);
        Y0 = new n1(i2, (byte) 23);
        Z0 = new n1(i2, (byte) 24);
        a1 = new n1(i2, (byte) 25);
        b1 = new n1(i2, (byte) 26);
        c1 = new n1(i2, (byte) 27);
        d1 = new n1(i2, (byte) 28);
        e1 = new n1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        y6q0 y6q0Var;
        List list;
        gll gllVar;
        mq70 mq70Var;
        up70 up70VarA;
        String str;
        String str2;
        String str3;
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        w7h1 w7h1Var4;
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        String str4 = null;
        switch (b2) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                c1 c1Var = (c1) obj;
                int iIntValue = ((Number) obj3).intValue();
                r6h1 r6h1Var = (r6h1) obj4;
                int iC = l1d.C(((h1) obj2).c);
                if (iC != 3) {
                    return iC != 4 ? new b4l0(Integer.valueOf(iIntValue), c1Var.a, r6h1Var) : new yyl0(Integer.valueOf(iIntValue), r6h1Var);
                }
                return new e6l0(Integer.valueOf(iIntValue), r6h1Var);
            case 1:
                jo70 jo70Var = (jo70) obj;
                xkk1 xkk1Var = (xkk1) obj2;
                hll hllVar = (hll) obj3;
                a7q0 a7q0Var = (a7q0) obj4;
                String str5 = (jo70Var == null || (str3 = jo70Var.a) == null) ? "" : str3;
                String str6 = (jo70Var == null || (str2 = jo70Var.c) == null) ? "" : str2;
                String str7 = (xkk1Var == null || (mq70Var = xkk1Var.a) == null || (up70VarA = mq70Var.a(vp70.d)) == null || (str = up70VarA.a.a) == null) ? "" : str;
                if (hllVar != null && (list = hllVar.c) != null && (gllVar = (gll) o7h.s0(list)) != null) {
                    str4 = gllVar.a;
                }
                return new z2(str5, str6, str7, str4, (a7q0Var == null || (y6q0Var = a7q0Var.d) == null) ? gy50.b : new fy50(Double.valueOf(y6q0Var.a), Long.valueOf(y6q0Var.b), Boolean.TRUE, 3));
            case 2:
                ((Number) obj3).intValue();
                return new sol0(new fjl0((r6h1) obj4, (byte) 24), ((b3) obj).a);
            case 3:
                sol0 sol0Var = (sol0) obj;
                c3 c3Var = (c3) obj3;
                if (((a3) obj4).equals(a3.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", c3Var.a)), sol0Var.a, sol0Var.b.b, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 4:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), ((trl0) obj).a, r6h1.c, System.currentTimeMillis());
            case 5:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), ((ozl0) obj).a, r6h1.c, System.currentTimeMillis());
            case 6:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("logout", 1, b7xVar), ((gzl0) obj).a, r6h1.c, System.currentTimeMillis());
            case 7:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("logout", 1, b7xVar), ((fzl0) obj).a, r6h1.c, System.currentTimeMillis());
            case 8:
                return null;
            case 9:
                hzl0 hzl0Var = (hzl0) obj;
                String str8 = nik1.Z0.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str8 != null ? str8 : "")), hzl0Var.a, r6h1.c, System.currentTimeMillis());
            case 10:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("login", 1, b7xVar), ((izl0) obj).a, r6h1.c, System.currentTimeMillis());
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                qrp0 qrp0Var = (qrp0) obj;
                ((Number) obj3).intValue();
                return new ojl0(new rjl0(epo1.J(qrp0Var.d), r6h1.c), j010.a[qrp0Var.c.ordinal()] == 1 ? 1 : 2);
            case grn1.d /* 12 */:
                ojl0 ojl0Var = (ojl0) obj;
                y6h1 y6h1Var = ojl0Var.a;
                r6h1 r6h1Var2 = ojl0Var.b.a;
                vrp0 vrp0Var = ((qrp0) obj2).c;
                int iOrdinal = vrp0Var.ordinal();
                if (iOrdinal == 2) {
                    String strC = epo1.C(vrp0Var);
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strC != null ? strC : "")), y6h1Var, r6h1Var2, System.currentTimeMillis());
                } else {
                    if (iOrdinal != 3) {
                        return null;
                    }
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), y6h1Var, r6h1Var2, System.currentTimeMillis());
                }
                return w7h1Var;
            case 13:
                return new uyl0(Integer.valueOf(((Number) obj3).intValue()), ((k30) obj).a, "", (r6h1) obj4);
            case 14:
                return null;
            case 15:
                tyl0 tyl0Var = (tyl0) obj;
                d40 d40Var = (d40) obj2;
                b40 b40Var = (b40) obj4;
                if (b40Var instanceof z30) {
                    return tyl0Var.a(d40Var.e);
                }
                if (b40Var instanceof a40) {
                    return new w7h1("", "", new z7h1("long_hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), tyl0Var.b, tyl0Var.a, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 16:
                ((Number) obj3).intValue();
                r6h1 r6h1Var3 = (r6h1) obj4;
                return new p4e(r6h1Var3, new py9(r6h1Var3, (byte) 15), new py9(r6h1Var3, (byte) 16));
            case 17:
                p4e p4eVar = (p4e) obj;
                py9 py9Var = p4eVar.b;
                r6h1 r6h1Var4 = py9Var.b;
                y6h1 y6h1Var2 = py9Var.c;
                b50 b50VarA = ((q40) obj4).a.a();
                if (b50VarA instanceof z40) {
                    z40 z40Var = (z40) b50VarA;
                    String str9 = z40Var.a;
                    x6h1 x6h1VarC = y6h1Var2.c();
                    x6h1VarC.i.add(new a7h1("filter_chip", str9, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", z40Var.b)), x6h1VarC.a(), r6h1Var4, System.currentTimeMillis());
                } else {
                    if (!(b50VarA instanceof a50)) {
                        if (u890.j(b50VarA, y40.a)) {
                            py9 py9Var2 = p4eVar.c;
                            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("create_playlist", 1, b7xVar), py9Var2.c, py9Var2.b, System.currentTimeMillis());
                        }
                        if (b50VarA == null) {
                            return null;
                        }
                        eg.o();
                        return null;
                    }
                    a50 a50Var = (a50) b50VarA;
                    String str10 = a50Var.a;
                    x6h1 x6h1VarC2 = y6h1Var2.c();
                    x6h1VarC2.i.add(new a7h1("sort_chip", str10, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", a50Var.b)), x6h1VarC2.a(), r6h1Var4, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 18:
                trp0 trp0Var = (trp0) obj;
                ((Number) obj3).intValue();
                return new pjl0(new rjl0(epo1.J(trp0Var.f), r6h1.c), Integer.valueOf(trp0Var.a), epo1.C(trp0Var.e));
            case 19:
                tjl0 tjl0Var = (tjl0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", u2p1.w(((o6u0) obj2).e))), tjl0Var.a, tjl0Var.b.b, System.currentTimeMillis());
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                pjl0 pjl0Var = (pjl0) obj;
                String strC2 = epo1.C(((trp0) obj2).e);
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strC2 != null ? strC2 : "")), pjl0Var.a, pjl0Var.b.a, System.currentTimeMillis());
            case 21:
                ((Number) obj4).intValue();
                x340 x340Var = (b0k) obj3;
                x340Var.i0(-664731032);
                y70 y70Var = new y70((wl71) obj2);
                x340Var.r(false);
                return y70Var;
            case 22:
                ((Number) obj3).intValue();
                ji0 ji0Var = ((mj0) obj).a;
                return new kpk0(ji0Var.h, gq0.e(ji0Var.a), (r6h1) obj4);
            case 23:
                kpk0 kpk0Var = (kpk0) obj;
                izd izdVar = (tj0) obj4;
                r6h1 r6h1Var5 = kpk0Var.a;
                y6h1 y6h1Var3 = kpk0Var.b;
                List list2 = ((mj0) obj2).c;
                if (izdVar instanceof izd) {
                    x6h1 x6h1VarC3 = y6h1Var3.c();
                    x6h1VarC3.i.add(new a7h1("carousel", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    y6h1 y6h1VarA = x6h1VarC3.a();
                    int i2 = izdVar.a;
                    Integer numValueOf = Integer.valueOf(i2);
                    String str11 = ((hj0) list2.get(i2)).d.e;
                    x6h1 x6h1VarC4 = y6h1VarA.c();
                    x6h1VarC4.i.add(new a7h1("carousel_item", "carousel_item_clicked", numValueOf, str11, (String) null));
                    x6h1VarC4.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC4.a();
                    String str12 = ((hj0) list2.get(i2)).d.e;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", str12 != null ? str12 : "")), y6h1VarA2, r6h1Var5, System.currentTimeMillis());
                } else if (izdVar instanceof x9d1) {
                    x6h1 x6h1VarC5 = y6h1Var3.c();
                    x6h1VarC5.i.add(new a7h1("carousel", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    y6h1 y6h1VarA3 = x6h1VarC5.a();
                    int i3 = ((x9d1) izdVar).a;
                    Integer numValueOf2 = Integer.valueOf(i3);
                    String str13 = ((hj0) list2.get(i3)).d.e;
                    x6h1 x6h1VarC6 = y6h1VarA3.c();
                    x6h1VarC6.i.add(new a7h1("carousel_item", "carousel_item_swiped_left", numValueOf2, str13, (String) null));
                    x6h1VarC6.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("swipe_left", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC6.a(), r6h1Var5, System.currentTimeMillis());
                } else if (izdVar instanceof gad1) {
                    x6h1 x6h1VarC7 = y6h1Var3.c();
                    x6h1VarC7.i.add(new a7h1("carousel", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    y6h1 y6h1VarA4 = x6h1VarC7.a();
                    int i4 = ((gad1) izdVar).a;
                    Integer numValueOf3 = Integer.valueOf(i4);
                    String str14 = ((hj0) list2.get(i4)).d.e;
                    x6h1 x6h1VarC8 = y6h1VarA4.c();
                    x6h1VarC8.i.add(new a7h1("carousel_item", "carousel_item_swiped_right", numValueOf3, str14, (String) null));
                    x6h1VarC8.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("swipe_right", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC8.a(), r6h1Var5, System.currentTimeMillis());
                } else if (izdVar instanceof sdo) {
                    int i5 = ((sdo) izdVar).a;
                    String str15 = ((hj0) list2.get(i5)).d.e;
                    x6h1 x6h1VarC9 = y6h1Var3.c();
                    x6h1VarC9.i.add(new a7h1("cta_button", (String) null, (Integer) null, str15, (String) null));
                    x6h1VarC9.j = false;
                    y6h1 y6h1VarA5 = x6h1VarC9.a();
                    String str16 = ((hj0) list2.get(i5)).d.e;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", str16 != null ? str16 : "")), y6h1VarA5, r6h1Var5, System.currentTimeMillis());
                } else {
                    if (!(izdVar instanceof ta30)) {
                        if ((izdVar instanceof wr10) || (izdVar instanceof mk20) || (izdVar instanceof dkk1) || (izdVar instanceof ozd)) {
                            return null;
                        }
                        eg.o();
                        return null;
                    }
                    int i6 = ((ta30) izdVar).a;
                    String str17 = ((hj0) list2.get(i6)).d.e;
                    x6h1 x6h1VarC10 = y6h1Var3.c();
                    x6h1VarC10.i.add(new a7h1("footer", (String) null, (Integer) null, str17, (String) null));
                    x6h1VarC10.j = false;
                    y6h1 y6h1VarA6 = x6h1VarC10.a();
                    String str18 = ((hj0) list2.get(i6)).d.e;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", str18 != null ? str18 : "")), y6h1VarA6, r6h1Var5, System.currentTimeMillis());
                }
                return w7h1Var3;
            case 24:
                uj0 uj0Var = (uj0) obj;
                ((Number) obj3).intValue();
                ji0 ji0Var2 = uj0Var.b;
                return new ipk0(new jpk0(new kpk0(ji0Var2.h, gq0.e(ji0Var2.a), (r6h1) obj4)), uj0Var.a, Integer.valueOf(uj0Var.c), ji0Var2.e);
            case 25:
                if (obj4 != null) {
                    bhn0.d();
                }
                return null;
            case 26:
                ((Number) obj3).intValue();
                return new wwl0((r6h1) obj4);
            case 27:
                return null;
            case 28:
                return new vwl0(new wwl0((r6h1) obj4), ((tl0) obj).b, Integer.valueOf(((Number) obj3).intValue()));
            default:
                vwl0 vwl0Var = (vwl0) obj;
                ul0 ul0Var = (ul0) obj3;
                rl0 rl0Var = (rl0) obj4;
                y6h1 y6h1Var4 = vwl0Var.a;
                r6h1 r6h1Var6 = vwl0Var.b.a;
                if (!(rl0Var instanceof pl0)) {
                    if (rl0Var instanceof ql0) {
                        return null;
                    }
                    eg.o();
                    return null;
                }
                int iC2 = l1d.C(ul0Var.a);
                if (iC2 == 0) {
                    w7h1Var4 = ((pl0) rl0Var).b ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("add_interest", 1, b7xVar), y6h1Var4, r6h1Var6, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_interest", 1, b7xVar), y6h1Var4, r6h1Var6, System.currentTimeMillis());
                } else {
                    if (iC2 != 1) {
                        eg.o();
                        return null;
                    }
                    w7h1Var4 = ((pl0) rl0Var).b ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), y6h1Var4, r6h1Var6, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_disable", 1, b7xVar), y6h1Var4, r6h1Var6, System.currentTimeMillis());
                }
                return w7h1Var4;
        }
    }
}
