package p;

import com.spotify.messages.PushAndroidDeviceSettingsV1;
import com.spotify.messages.UbiExpr2PageView;
import com.spotify.messages.UbiProd1PageTransitionNonAuth;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qb00 implements pvy0 {
    public final t2j0 a;
    public final yqg b;

    public qb00(yqg yqgVar, t2j0 t2j0Var, t7h1 t7h1Var) {
        this.a = t2j0Var;
        this.b = yqgVar;
    }

    public static String a(Object obj) {
        String string = obj != null ? obj.toString() : null;
        return string == null ? "" : string;
    }

    public static String e(wvn0 wvn0Var) {
        String str;
        if (wvn0Var instanceof tvn0) {
            tvn0 tvn0Var = (tvn0) wvn0Var;
            int iC = l1d.C(tvn0Var.a);
            if (iC == 0) {
                str = "waiting_for_location_change";
            } else {
                if (iC != 1) {
                    eg.o();
                    return null;
                }
                str = "waiting_for_completion";
            }
            return cy30.p("navigation_interrupted_by_new_action(", str, ", ", tvn0Var.b.b(), ")");
        }
        if (u890.j(wvn0Var, qvn0.b)) {
            return "location_changing_without_request";
        }
        if (u890.j(wvn0Var, qvn0.a)) {
            return "location_change_is_missing_action";
        }
        if (u890.j(wvn0Var, svn0.a)) {
            return "missing_location_changing";
        }
        if (wvn0Var instanceof rvn0) {
            return f4i1.f("location_changing_more_than_once(", ((rvn0) wvn0Var).a.b(), ")");
        }
        if (u890.j(wvn0Var, qvn0.c)) {
            return "presentation_path_not_received_before_navigation";
        }
        if (wvn0Var instanceof pvn0) {
            return f4i1.f("initial_presentation_interrupted_by_presentation_change(", ((pvn0) wvn0Var).a.b(), ")");
        }
        if (wvn0Var instanceof vvn0) {
            return f4i1.f("presentation_change_interrupted_by_new_action(", ((vvn0) wvn0Var).a.b(), ")");
        }
        if (wvn0Var instanceof uvn0) {
            return f4i1.f("presentation_change_interrupted_by_navigation(", ((uvn0) wvn0Var).a.b(), ")");
        }
        eg.o();
        return null;
    }

    public void b(String str, boolean z, boolean z2) {
        zuy0 zuy0VarN = PushAndroidDeviceSettingsV1.n();
        zuy0VarN.n(str);
        zuy0VarN.r(z);
        zuy0VarN.q(z2);
        this.a.a(zuy0VarN.build());
    }

    public void c(w8h1 w8h1Var) {
        gwn0 gwn0Var;
        String str;
        gwn0 gwn0Var2;
        String str2;
        gwn0 gwn0Var3;
        String str3;
        y6r0 y6r0Var;
        String str4;
        String str5;
        y5h1 y5h1Var = w8h1Var.j;
        j9h1 j9h1VarV = UbiProd1PageTransitionNonAuth.v();
        hwn0 hwn0Var = w8h1Var.b;
        y6r0 y6r0Var2 = hwn0Var.a;
        gwn0 gwn0Var4 = hwn0Var.b;
        if (y6r0Var2 != null && (str5 = y6r0Var2.a) != null) {
            j9h1VarV.K(str5);
        }
        j9h1VarV.I(gwn0Var4.a);
        String str6 = gwn0Var4.b;
        if (str6 != null) {
            j9h1VarV.B(str6);
        }
        String str7 = gwn0Var4.c;
        if (str7 != null) {
            j9h1VarV.H(str7);
        }
        ltf1 ltf1Var = e8h1.a;
        u8h1 u8h1Var = gwn0Var4.d;
        String strC = e8h1.c(u8h1Var != null ? u8h1Var.a.a : null);
        if (strC != null && strC.length() != 0) {
            j9h1VarV.J(strC);
        }
        hwn0 hwn0Var2 = w8h1Var.c;
        if (hwn0Var2 != null && (y6r0Var = hwn0Var2.a) != null && (str4 = y6r0Var.a) != null) {
            j9h1VarV.F(str4);
        }
        hwn0 hwn0Var3 = w8h1Var.c;
        if (hwn0Var3 != null && (gwn0Var3 = hwn0Var3.b) != null && (str3 = gwn0Var3.a) != null && str3.length() != 0) {
            j9h1VarV.E(str3);
        }
        hwn0 hwn0Var4 = w8h1Var.c;
        if (hwn0Var4 != null && (gwn0Var2 = hwn0Var4.b) != null && (str2 = gwn0Var2.b) != null && str2.length() != 0) {
            j9h1VarV.C(str2);
        }
        hwn0 hwn0Var5 = w8h1Var.c;
        if (hwn0Var5 != null && (gwn0Var = hwn0Var5.b) != null && (str = gwn0Var.c) != null && str.length() != 0) {
            j9h1VarV.D(str);
        }
        String str8 = w8h1Var.i;
        if (str8 != null && str8.length() != 0) {
            j9h1VarV.z(str8);
        }
        j9h1VarV.G(w8h1Var.d.b());
        j9h1VarV.A(this.b.g().getID());
        List list = w8h1Var.f;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ou80) it.next()).a);
        }
        j9h1VarV.q(arrayList);
        List list2 = w8h1Var.e;
        ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(e((wvn0) it2.next()));
        }
        j9h1VarV.n(arrayList2);
        var0 var0Var = hwn0Var.c;
        if (var0Var != null) {
            j9h1VarV.L(var0Var.a.a);
            for (y6h1 y6h1Var : var0Var.b.a) {
                int i = 0;
                for (Object obj : y6h1Var.d) {
                    int i2 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    a7h1 a7h1Var = (a7h1) obj;
                    j9h1VarV.s(a7h1Var.a);
                    j9h1VarV.r(a(a7h1Var.b));
                    j9h1VarV.w(a(a7h1Var.c));
                    j9h1VarV.u(a(a7h1Var.e));
                    j9h1VarV.t(a(a7h1Var.d));
                    if (i == 0) {
                        j9h1VarV.v(y6h1Var.a);
                    } else {
                        j9h1VarV.v("");
                    }
                    i = i2;
                }
            }
        }
        j9h1VarV.x(y5h1Var.a.b);
        hn5 hn5Var = y5h1Var.b;
        if (hn5Var != null) {
            j9h1VarV.y(hn5Var.a);
        }
        UbiProd1PageTransitionNonAuth ubiProd1PageTransitionNonAuthBuild = j9h1VarV.build();
        ubiProd1PageTransitionNonAuthBuild.getClass();
        this.a.a(ubiProd1PageTransitionNonAuthBuild);
        LinkedHashMap linkedHashMap = h8h1.a;
    }

    public void d(w8h1 w8h1Var) {
        gwn0 gwn0Var;
        String str;
        gwn0 gwn0Var2;
        String str2;
        gwn0 gwn0Var3;
        String str3;
        y6r0 y6r0Var;
        String str4;
        String str5;
        y5h1 y5h1Var = w8h1Var.j;
        e7h1 e7h1VarW = UbiExpr2PageView.w();
        hwn0 hwn0Var = w8h1Var.b;
        y6r0 y6r0Var2 = hwn0Var.a;
        gwn0 gwn0Var4 = hwn0Var.b;
        if (y6r0Var2 != null && (str5 = y6r0Var2.a) != null) {
            e7h1VarW.L(str5);
        }
        String str6 = gwn0Var4.a;
        if (str6 != null && str6.length() != 0) {
            e7h1VarW.J(str6);
        }
        String str7 = gwn0Var4.b;
        if (str7 != null && str7.length() != 0) {
            e7h1VarW.C(str7);
        }
        String str8 = gwn0Var4.c;
        if (str8 != null && str8.length() != 0) {
            e7h1VarW.I(str8);
        }
        ltf1 ltf1Var = e8h1.a;
        u8h1 u8h1Var = gwn0Var4.d;
        String strC = e8h1.c(u8h1Var != null ? u8h1Var.a.a : null);
        if (strC != null && strC.length() != 0) {
            e7h1VarW.K(strC);
        }
        hwn0 hwn0Var2 = w8h1Var.c;
        if (hwn0Var2 != null && (y6r0Var = hwn0Var2.a) != null && (str4 = y6r0Var.a) != null) {
            e7h1VarW.G(str4);
        }
        hwn0 hwn0Var3 = w8h1Var.c;
        if (hwn0Var3 != null && (gwn0Var3 = hwn0Var3.b) != null && (str3 = gwn0Var3.a) != null && str3.length() != 0) {
            e7h1VarW.F(str3);
        }
        hwn0 hwn0Var4 = w8h1Var.c;
        if (hwn0Var4 != null && (gwn0Var2 = hwn0Var4.b) != null && (str2 = gwn0Var2.b) != null && str2.length() != 0) {
            e7h1VarW.D(str2);
        }
        hwn0 hwn0Var5 = w8h1Var.c;
        if (hwn0Var5 != null && (gwn0Var = hwn0Var5.b) != null && (str = gwn0Var.c) != null && str.length() != 0) {
            e7h1VarW.E(str);
        }
        Long l = w8h1Var.g;
        if (l != null) {
            e7h1VarW.O(l.longValue());
        }
        Map map = w8h1Var.h;
        if (map != null) {
            e7h1VarW.x(map);
        }
        String str9 = w8h1Var.i;
        if (str9 != null && str9.length() != 0) {
            e7h1VarW.A(str9);
        }
        e7h1VarW.H(w8h1Var.d.b());
        e7h1VarW.N((String) w8h1Var.a.a.a);
        e7h1VarW.B(this.b.g().getID());
        List list = w8h1Var.f;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ou80) it.next()).a);
        }
        e7h1VarW.q(arrayList);
        List list2 = w8h1Var.e;
        ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(e((wvn0) it2.next()));
        }
        e7h1VarW.n(arrayList2);
        var0 var0Var = hwn0Var.c;
        if (var0Var != null) {
            e7h1VarW.M(var0Var.a.a);
            for (y6h1 y6h1Var : var0Var.b.a) {
                int i = 0;
                for (Object obj : y6h1Var.d) {
                    int i2 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    a7h1 a7h1Var = (a7h1) obj;
                    e7h1VarW.s(a7h1Var.a);
                    e7h1VarW.r(a(a7h1Var.b));
                    e7h1VarW.w(a(a7h1Var.c));
                    e7h1VarW.u(a(a7h1Var.e));
                    e7h1VarW.t(a(a7h1Var.d));
                    if (i == 0) {
                        e7h1VarW.v(y6h1Var.a);
                    } else {
                        e7h1VarW.v("");
                    }
                    i = i2;
                }
            }
        }
        e7h1VarW.y(y5h1Var.a.b);
        hn5 hn5Var = y5h1Var.b;
        if (hn5Var != null) {
            e7h1VarW.z(hn5Var.a);
        }
        UbiExpr2PageView ubiExpr2PageViewBuild = e7h1VarW.build();
        ubiExpr2PageViewBuild.getClass();
        this.a.a(ubiExpr2PageViewBuild);
        LinkedHashMap linkedHashMap = h8h1.a;
    }

    public qb00(yqg yqgVar, t2j0 t2j0Var) {
        this.b = yqgVar;
        this.a = t2j0Var;
    }
}
