package p;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class axv extends hab0 implements iu30 {
    public static final axv N0;
    public static final axv O0;
    public static final axv P0;
    public static final axv Q0;
    public static final axv R0;
    public static final axv S0;
    public static final axv T0;
    public static final axv U0;
    public static final axv V0;
    public static final axv W0;
    public static final axv X;
    public static final axv X0;
    public static final axv Y;
    public static final axv Y0;
    public static final axv Z;
    public static final axv Z0;
    public static final axv a1;
    public static final axv b;
    public static final axv b1;
    public static final axv c;
    public static final axv c1;
    public static final axv d;
    public static final axv d1;
    public static final axv e;
    public static final axv e1;
    public static final axv f;
    public static final axv g;
    public static final axv h;
    public static final axv i;
    public static final axv t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new axv(i2, (byte) 0);
        c = new axv(i2, (byte) 1);
        d = new axv(i2, (byte) 2);
        e = new axv(i2, (byte) 3);
        f = new axv(i2, (byte) 4);
        g = new axv(i2, (byte) 5);
        h = new axv(i2, (byte) 6);
        i = new axv(i2, (byte) 7);
        t = new axv(i2, (byte) 8);
        X = new axv(i2, (byte) 9);
        Y = new axv(i2, (byte) 10);
        Z = new axv(i2, (byte) 11);
        N0 = new axv(i2, (byte) 12);
        O0 = new axv(i2, (byte) 13);
        P0 = new axv(i2, (byte) 14);
        Q0 = new axv(i2, (byte) 15);
        R0 = new axv(i2, (byte) 16);
        S0 = new axv(i2, (byte) 17);
        T0 = new axv(i2, (byte) 18);
        U0 = new axv(i2, (byte) 19);
        V0 = new axv(i2, (byte) 20);
        W0 = new axv(i2, (byte) 21);
        X0 = new axv(i2, (byte) 22);
        Y0 = new axv(i2, (byte) 23);
        Z0 = new axv(i2, (byte) 24);
        a1 = new axv(i2, (byte) 25);
        b1 = new axv(i2, (byte) 26);
        c1 = new axv(i2, (byte) 27);
        d1 = new axv(i2, (byte) 28);
        e1 = new axv(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ axv(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        List list;
        byte b2 = this.a;
        w7x w7xVar = w7x.a;
        Map map = b7x.a;
        boolean zContains = false;
        switch (b2) {
            case 0:
                b261.c((e261) obj);
                return rih1.a;
            case 1:
                return zr7.i(aqb0.b((aqb0) obj, nim0.a, (pxg1) null, (ni20) null, 7), gft.t);
            case 2:
                return w7xVar;
            case 3:
                return w7xVar;
            case 4:
                hoy0 hoy0Var = (hoy0) obj;
                return new csu0(hoy0Var.a, hoy0Var.b, hoy0Var.d, hoy0Var.e, xru0.a);
            case 5:
                return w7xVar;
            case 6:
                yny0 yny0Var = (yny0) obj;
                return new csu0(yny0Var.a, yny0Var.b, yny0Var.e, yny0Var.f, new wru0(yny0Var.d));
            case 7:
                return Boolean.valueOf(((s0w) obj).d);
            case 8:
                r0w r0wVar = (r0w) obj;
                i8h1 i8h1Var = r0wVar.a;
                x6h1 x6h1VarC = r0wVar.b.b.c();
                x6h1VarC.i.add(new a7h1("user_displayname_text", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                return i8h1Var.m(new w7h1("", "", new z7h1("key_stroke", 1, map), new x7h1("change_display_name", 1, map), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a.a;
            case 9:
                return Boolean.valueOf(((s0w) obj).f13p);
            case 10:
                r0w r0wVar2 = (r0w) obj;
                i8h1 i8h1Var2 = r0wVar2.a;
                x6h1 x6h1VarC2 = r0wVar2.b.b.c();
                x6h1VarC2.i.add(new a7h1("user_pronouns_text", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                return i8h1Var2.m(new w7h1("", "", new z7h1("key_stroke", 1, map), new x7h1("text_edit", 1, Collections.singletonMap("field_to_be_changed", "pronouns")), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a.a;
            case 11:
                return Boolean.valueOf(((s0w) obj).r);
            case 12:
                r0w r0wVar3 = (r0w) obj;
                i8h1 i8h1Var3 = r0wVar3.a;
                x6h1 x6h1VarC3 = r0wVar3.b.b.c();
                x6h1VarC3.i.add(new a7h1("user_location_text", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                return i8h1Var3.m(new w7h1("", "", new z7h1("key_stroke", 1, map), new x7h1("text_edit", 1, Collections.singletonMap("field_to_be_changed", "location")), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a.a;
            case 13:
                return Boolean.valueOf(!((s0w) obj).y);
            case 14:
                s0w s0wVar = (s0w) obj;
                if (s0wVar.z && s0wVar.A && !s0wVar.y) {
                    zContains = true;
                }
                return Boolean.valueOf(zContains);
            case 15:
                return (c2w) obj;
            case 16:
                String str = ((c2w) obj).c;
                if (str != null) {
                    return new rxc0(str);
                }
                return null;
            case 17:
                qxc0 qxc0Var = (qxc0) obj;
                Map map2 = qxc0Var != null ? qxc0Var.X : null;
                if (map2 != null) {
                    map = map2;
                }
                return Boolean.valueOf(u890.j(map.get("is_genpods_with_disconnected_connectors"), "true"));
            case 18:
                return Boolean.valueOf((obj instanceof qxc0) || (obj instanceof rih1));
            case 19:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qxc0) obj;
            case 20:
                return Boolean.valueOf((obj instanceof hll) || (obj instanceof rih1));
            case 21:
                if (obj instanceof rih1) {
                    return null;
                }
                return (hll) obj;
            case 22:
                return ((c2w) obj).a;
            case 23:
                hll hllVar = (hll) obj;
                if (hllVar != null && (list = hllVar.d) != null) {
                    zContains = list.contains(fll.f);
                }
                return Boolean.valueOf(zContains);
            case 24:
                return Boolean.valueOf((obj instanceof qxc0) || (obj instanceof rih1));
            case 25:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qxc0) obj;
            case 26:
                return new rxc0(((c2w) obj).a);
            case 27:
                return Boolean.valueOf(mp10.w((qxc0) obj));
            case 28:
                return new h0l0((i3l0) obj);
            default:
                h0l0 h0l0Var = (h0l0) obj;
                String str2 = nik1.R6.a;
                z7h1 z7h1Var = new z7h1("hit", 1, map);
                if (str2 == null) {
                    str2 = "";
                }
                return new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), h0l0Var.a, r6h1.c, System.currentTimeMillis());
        }
    }
}
