package p;

import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ngl extends hab0 implements zu30 {
    public static final ngl N0;
    public static final ngl O0;
    public static final ngl P0;
    public static final ngl Q0;
    public static final ngl R0;
    public static final ngl S0;
    public static final ngl T0;
    public static final ngl U0;
    public static final ngl V0;
    public static final ngl W0;
    public static final ngl X;
    public static final ngl X0;
    public static final ngl Y;
    public static final ngl Y0;
    public static final ngl Z;
    public static final ngl Z0;
    public static final ngl a1;
    public static final ngl b;
    public static final ngl b1;
    public static final ngl c;
    public static final ngl c1;
    public static final ngl d;
    public static final ngl d1;
    public static final ngl e;
    public static final ngl e1;
    public static final ngl f;
    public static final ngl g;
    public static final ngl h;
    public static final ngl i;
    public static final ngl t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new ngl(i2, (byte) 0);
        c = new ngl(i2, (byte) 1);
        d = new ngl(i2, (byte) 2);
        e = new ngl(i2, (byte) 3);
        f = new ngl(i2, (byte) 4);
        g = new ngl(i2, (byte) 5);
        h = new ngl(i2, (byte) 6);
        i = new ngl(i2, (byte) 7);
        t = new ngl(i2, (byte) 8);
        X = new ngl(i2, (byte) 9);
        Y = new ngl(i2, (byte) 10);
        Z = new ngl(i2, (byte) 11);
        N0 = new ngl(i2, (byte) 12);
        O0 = new ngl(i2, (byte) 13);
        P0 = new ngl(i2, (byte) 14);
        Q0 = new ngl(i2, (byte) 15);
        R0 = new ngl(i2, (byte) 16);
        S0 = new ngl(i2, (byte) 17);
        T0 = new ngl(i2, (byte) 18);
        U0 = new ngl(i2, (byte) 19);
        V0 = new ngl(i2, (byte) 20);
        W0 = new ngl(i2, (byte) 21);
        X0 = new ngl(i2, (byte) 22);
        Y0 = new ngl(i2, (byte) 23);
        Z0 = new ngl(i2, (byte) 24);
        a1 = new ngl(i2, (byte) 25);
        b1 = new ngl(i2, (byte) 26);
        c1 = new ngl(i2, (byte) 27);
        d1 = new ngl(i2, (byte) 28);
        e1 = new ngl(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ngl(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:135:0x0466  */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        w7h1 w7h1Var4;
        w7h1 w7h1Var5;
        String str;
        boolean z;
        u4m o4mVar;
        Object next;
        w7h1 w7h1Var6;
        byte b2 = this.a;
        lwl lwlVar = lwl.a;
        b7x b7xVar = b7x.a;
        switch (b2) {
            case 0:
                ((Number) obj3).intValue();
                return new n2m0(new brl0((byte) 13), ((lgl) obj).a.a);
            case 1:
                kgl kglVar = (kgl) obj4;
                y6h1 y6h1Var = ((n2m0) obj).a;
                if (kglVar instanceof hgl) {
                    hgl hglVar = (hgl) kglVar;
                    String str2 = hglVar.b;
                    Integer numValueOf = Integer.valueOf(hglVar.a);
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("prompt_suggestion_chip", str2, numValueOf, (String) null, (String) null));
                    x6h1VarC.j = true;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
                }
                if (kglVar.equals(igl.a)) {
                    x6h1 x6h1VarC2 = y6h1Var.c();
                    x6h1VarC2.i.add(new a7h1("see_all_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (!kglVar.equals(jgl.a)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC3 = y6h1Var.c();
                    x6h1VarC3.i.add(new a7h1("see_less_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var;
            case 2:
                ((Number) obj3).intValue();
                return new u6m0(new ksk0((byte) 24), ((ikl) obj2).b.e);
            case 3:
                jkl jklVar = (jkl) obj;
                ((Number) obj3).intValue();
                return new myk0(new nqk0(new txk0((byte) 3), Integer.valueOf(jklVar.a)), Integer.valueOf(jklVar.b));
            case 4:
                return null;
            case 5:
                okl oklVar = (okl) obj4;
                y6h1 y6h1Var2 = ((myk0) obj).a;
                if (oklVar instanceof mkl) {
                    mkl mklVar = (mkl) oklVar;
                    Integer numValueOf2 = Integer.valueOf(mklVar.a);
                    String str3 = mklVar.b;
                    x6h1 x6h1VarC4 = y6h1Var2.c();
                    x6h1VarC4.i.add(new a7h1("buttons", (String) null, numValueOf2, str3, (String) null));
                    x6h1VarC4.j = false;
                    y6h1 y6h1VarA = x6h1VarC4.a();
                    String str4 = mklVar.b;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str4 != null ? str4 : "")), y6h1VarA, r6h1.c, System.currentTimeMillis());
                } else {
                    if (!(oklVar instanceof nkl)) {
                        eg.o();
                        return null;
                    }
                    nkl nklVar = (nkl) oklVar;
                    Integer numValueOf3 = Integer.valueOf(nklVar.a);
                    String str5 = nklVar.b;
                    x6h1 x6h1VarC5 = y6h1Var2.c();
                    x6h1VarC5.i.add(new a7h1("internal_links", (String) null, numValueOf3, str5, (String) null));
                    x6h1VarC5.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC5.a();
                    String str6 = nklVar.b;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str6 != null ? str6 : "")), y6h1VarA2, r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 6:
                ((Number) obj3).intValue();
                return new jml0((r6h1) obj4);
            case 7:
                jml0 jml0Var = (jml0) obj;
                osl oslVar = (osl) obj4;
                r6h1 r6h1Var = jml0Var.a;
                y6h1 y6h1Var3 = jml0Var.b;
                if (oslVar.equals(msl.a)) {
                    x6h1 x6h1VarC6 = y6h1Var3.c();
                    x6h1VarC6.i.add(new a7h1("add_songs_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC6.a(), r6h1Var, System.currentTimeMillis());
                } else {
                    if (!oslVar.equals(nsl.a)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC7 = y6h1Var3.c();
                    x6h1VarC7.i.add(new a7h1("home_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:home")), x6h1VarC7.a(), r6h1Var, System.currentTimeMillis());
                }
                return w7h1Var3;
            case 8:
                return null;
            case 9:
                etl0 etl0Var = (etl0) obj;
                owl owlVar = (owl) obj2;
                nwl nwlVar = (nwl) obj4;
                if (nwlVar instanceof mwl) {
                    Set set = s4b1.f;
                    String strJ = uic.x(owlVar.a).j();
                    return etl0Var.a("spotify:readalong:".concat(strJ != null ? strJ : ""));
                }
                if (nwlVar.equals(lwlVar)) {
                    return etl0Var.h();
                }
                eg.o();
                return null;
            case 10:
                etl0 etl0Var2 = (etl0) obj;
                owl owlVar2 = (owl) obj2;
                nwl nwlVar2 = (nwl) obj4;
                if (nwlVar2 instanceof mwl) {
                    Set set2 = s4b1.f;
                    String strJ2 = uic.x(owlVar2.a).j();
                    return etl0Var2.a("spotify:readalong:".concat(strJ2 != null ? strJ2 : ""));
                }
                if (nwlVar2.equals(lwlVar)) {
                    return etl0Var2.h();
                }
                eg.o();
                return null;
            case 11:
                ((Number) obj3).intValue();
                return new hvk0((r6h1) obj4);
            case 12:
                hvk0 hvk0Var = (hvk0) obj;
                w0m w0mVar = (w0m) obj3;
                t0m t0mVar = (v0m) obj4;
                r6h1 r6h1Var2 = hvk0Var.a;
                y6h1 y6h1Var4 = hvk0Var.b;
                if (t0mVar instanceof t0m) {
                    x6h1 x6h1VarC8 = y6h1Var4.c();
                    x6h1VarC8.i.add(new a7h1("search_bar", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    x6h1 x6h1VarC9 = x6h1VarC8.a().c();
                    x6h1VarC9.i.add(new a7h1("input_field", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    y6h1 y6h1VarA3 = x6h1VarC9.a();
                    String string = ihc1.e1(t0mVar.a).toString();
                    w7h1Var4 = new w7h1("", "", new z7h1("key_stroke", 1, b7xVar), new x7h1("change_search_query", 1, Collections.singletonMap("search_query_string", string != null ? string : "")), y6h1VarA3, r6h1Var2, System.currentTimeMillis());
                } else if (t0mVar instanceof u0m) {
                    x6h1 x6h1VarC10 = y6h1Var4.c();
                    x6h1VarC10.i.add(new a7h1("search_bar", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC10.j = false;
                    x6h1 x6h1VarC11 = x6h1VarC10.a().c();
                    x6h1VarC11.i.add(new a7h1("clear_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC11.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("text_clear", 1, b7xVar), x6h1VarC11.a(), r6h1Var2, System.currentTimeMillis());
                } else {
                    if (!(t0mVar instanceof n0m)) {
                        if ((t0mVar instanceof r0m) || (t0mVar instanceof p0m) || (t0mVar instanceof s0m) || (t0mVar instanceof o0m) || (t0mVar instanceof q0m)) {
                            return null;
                        }
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC12 = y6h1Var4.c();
                    x6h1VarC12.i.add(new a7h1("gif_grid", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC12.j = false;
                    y6h1 y6h1VarA4 = x6h1VarC12.a();
                    Integer numValueOf4 = Integer.valueOf(w0mVar.b.indexOf(((n0m) t0mVar).a));
                    x6h1 x6h1VarC13 = y6h1VarA4.c();
                    x6h1VarC13.i.add(new a7h1("gif", (String) null, numValueOf4, (String) null, (String) null));
                    x6h1VarC13.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC13.a(), r6h1Var2, System.currentTimeMillis());
                }
                return w7h1Var4;
            case 13:
                ((Number) obj3).intValue();
                return new jvk0(((s2m) obj2).a, (r6h1) obj4);
            case 14:
                jvk0 jvk0Var = (jvk0) obj;
                s2m s2mVar = (s2m) obj3;
                i2m i2mVar = (r2m) obj4;
                r6h1 r6h1Var3 = jvk0Var.a;
                y6h1 y6h1Var5 = jvk0Var.b;
                if (i2mVar instanceof i2m) {
                    x6h1 x6h1VarC14 = y6h1Var5.c();
                    x6h1VarC14.i.add(new a7h1("filter_chips", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC14.j = false;
                    y6h1 y6h1VarA5 = x6h1VarC14.a();
                    k620 k620Var = i2mVar.a;
                    switch (k620Var.ordinal()) {
                        case 0:
                            str = "all";
                            break;
                        case 1:
                            str = "filter:artist";
                            break;
                        case 2:
                            str = "filter:track";
                            break;
                        case 3:
                            str = "filter:album";
                            break;
                        case 4:
                            str = "filter:playlist";
                            break;
                        case 5:
                            str = "filter:show";
                            break;
                        case 6:
                            str = "filter:episode";
                            break;
                        case 7:
                            str = "filter:audiobook";
                            break;
                        default:
                            eg.o();
                            return null;
                    }
                    String str7 = str;
                    c380 c380Var = s2mVar.f;
                    c9 c9Var = ya20.c;
                    Iterator it = i1p1.v(c380Var).iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = -1;
                        } else if (((ya20) it.next()).a != k620Var) {
                            i2++;
                        }
                    }
                    Integer numValueOf5 = Integer.valueOf(i2);
                    x6h1 x6h1VarC15 = y6h1VarA5.c();
                    x6h1VarC15.i.add(new a7h1("filter_chip", str7, numValueOf5, (String) null, (String) null));
                    x6h1VarC15.j = false;
                    w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("filter", 1, b7xVar), x6h1VarC15.a(), r6h1Var3, System.currentTimeMillis());
                } else if (i2mVar instanceof k2m) {
                    x6h1 x6h1VarC16 = y6h1Var5.c();
                    x6h1VarC16.i.add(new a7h1("search_bar", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC16.j = false;
                    x6h1 x6h1VarC17 = x6h1VarC16.a().c();
                    x6h1VarC17.i.add(new a7h1("input_field", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC17.j = false;
                    y6h1 y6h1VarA6 = x6h1VarC17.a();
                    String string2 = ihc1.e1(((k2m) i2mVar).a).toString();
                    w7h1Var5 = new w7h1("", "", new z7h1("key_stroke", 1, b7xVar), new x7h1("change_search_query", 1, Collections.singletonMap("search_query_string", string2 != null ? string2 : "")), y6h1VarA6, r6h1Var3, System.currentTimeMillis());
                } else if (i2mVar.equals(l2m.a)) {
                    x6h1 x6h1VarC18 = y6h1Var5.c();
                    x6h1VarC18.i.add(new a7h1("search_bar", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC18.j = false;
                    x6h1 x6h1VarC19 = x6h1VarC18.a().c();
                    x6h1VarC19.i.add(new a7h1("input_field", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC19.j = false;
                    w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("text_clear", 1, b7xVar), x6h1VarC19.a(), r6h1Var3, System.currentTimeMillis());
                } else {
                    if (!i2mVar.equals(h2m.a)) {
                        if ((i2mVar instanceof g2m) || (i2mVar instanceof j2m) || (i2mVar instanceof n2m) || (i2mVar instanceof m2m) || (i2mVar instanceof o2m) || (i2mVar instanceof p2m) || (i2mVar instanceof q2m)) {
                            return null;
                        }
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC20 = y6h1Var5.c();
                    x6h1VarC20.i.add(new a7h1("entity_list", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC20.j = false;
                    x6h1 x6h1VarC21 = x6h1VarC20.a().c();
                    x6h1VarC21.i.add(new a7h1("clear_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC21.j = false;
                    w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("clear_recent_searches", 1, b7xVar), x6h1VarC21.a(), r6h1Var3, System.currentTimeMillis());
                }
                return w7h1Var5;
            case 15:
                k1r k1rVar = (k1r) obj;
                k1r k1rVar2 = (k1r) obj2;
                k1r k1rVar3 = (k1r) obj3;
                k1r k1rVar4 = (k1r) obj4;
                k1r[] k1rVarArr = {k1rVar, k1rVar2, k1rVar3, k1rVar4};
                for (int i3 = 0; i3 < 4; i3++) {
                    if (k1rVarArr[i3] instanceof j1r) {
                        return v4m.a;
                    }
                }
                qfd qfdVar = (qfd) mqn1.N(k1rVar);
                String str8 = (String) mqn1.N(k1rVar2);
                String str9 = (String) mqn1.N(k1rVar3);
                vnb1 vnb1Var = (vnb1) mqn1.N(k1rVar4);
                boolean z2 = (qfdVar != null ? qfdVar.c : 0) == 3;
                u4m u4mVar = p4m.a;
                u4m u4mVar2 = r4m.a;
                u4m u4mVar3 = s4m.a;
                u4m u4mVar4 = t4m.a;
                if (qfdVar != null) {
                    ArrayList arrayList = qfdVar.e;
                    rh7 rh7Var = qfdVar.d;
                    Iterator it2 = arrayList.iterator();
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (it2.hasNext()) {
                            int iE = mqn1.E((l131) next);
                            do {
                                Object next2 = it2.next();
                                int iE2 = mqn1.E((l131) next2);
                                if (iE > iE2) {
                                    iE = iE2;
                                    next = next2;
                                }
                            } while (it2.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    l131 l131Var = (l131) next;
                    int i4 = l131Var == null ? -1 : b5m.a[l131Var.ordinal()];
                    if (i4 == -1) {
                        o4mVar = null;
                    } else if (i4 == 1) {
                        o4mVar = new o4m(rh7Var != null ? rh7Var.a : 0);
                    } else if (i4 == 2) {
                        o4mVar = u4mVar;
                    } else if (i4 == 3) {
                        o4mVar = u4mVar2;
                    } else if (i4 == 4) {
                        o4mVar = u4mVar3;
                    } else {
                        if (i4 != 5) {
                            eg.o();
                            return null;
                        }
                        o4mVar = u4mVar4;
                    }
                    z = false;
                } else {
                    z = false;
                    o4mVar = null;
                }
                boolean zK = yto.k(str8, z);
                boolean z3 = yto.k(str9, z) && vnb1Var != null && vnb1Var.b;
                boolean z4 = u890.j(o4mVar, u4mVar2) && zK;
                u4m u4mVar5 = q4m.a;
                if (z3) {
                    o4mVar = u4mVar5;
                } else if (z2) {
                    rh7 rh7Var2 = qfdVar.d;
                    o4mVar = new o4m(rh7Var2 != null ? rh7Var2.a : 0);
                } else if (z4) {
                    o4mVar = u4mVar5;
                } else if (o4mVar == null) {
                    o4mVar = null;
                }
                d1q0 d1q0VarX = qfdVar != null ? rrn1.x(qfdVar.a) : null;
                boolean z5 = d1q0VarX == d1q0.a;
                return o4mVar != null ? new w4m(o4mVar, (((d1q0VarX == d1q0.c || d1q0VarX == d1q0.b) && ((o4mVar instanceof o4m) || u890.j(o4mVar, u4mVar) || u890.j(o4mVar, u4mVar2))) || u890.j(o4mVar, u4mVar3)) ? true : u890.j(o4mVar, u4mVar4) ? z5 : false) : x4m.a;
            case 16:
                return new u1m0(Integer.valueOf(((Number) obj3).intValue()), ((l7m) obj).a, (r6h1) obj4);
            case 17:
                u1m0 u1m0Var = (u1m0) obj;
                g7m g7mVar = (g7m) obj4;
                r6h1 r6h1Var4 = u1m0Var.a;
                y6h1 y6h1Var6 = u1m0Var.b;
                if (g7mVar instanceof z6m) {
                    x6h1 x6h1VarC22 = y6h1Var6.c();
                    x6h1VarC22.i.add(new a7h1("next_story_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC22.j = false;
                    w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC22.a(), r6h1Var4, System.currentTimeMillis());
                } else if (g7mVar instanceof a7m) {
                    x6h1 x6h1VarC23 = y6h1Var6.c();
                    x6h1VarC23.i.add(new a7h1("previous_story_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC23.j = false;
                    w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC23.a(), r6h1Var4, System.currentTimeMillis());
                } else if (g7mVar instanceof e7m) {
                    x6h1 x6h1VarC24 = y6h1Var6.c();
                    x6h1VarC24.i.add(new a7h1("story_carousel", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC24.j = false;
                    w7h1Var6 = new w7h1("", "", new z7h1("swipe_left", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC24.a(), r6h1Var4, System.currentTimeMillis());
                } else if (g7mVar instanceof f7m) {
                    x6h1 x6h1VarC25 = y6h1Var6.c();
                    x6h1VarC25.i.add(new a7h1("story_carousel", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC25.j = false;
                    w7h1Var6 = new w7h1("", "", new z7h1("swipe_right", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC25.a(), r6h1Var4, System.currentTimeMillis());
                } else {
                    if (!(g7mVar instanceof c7m)) {
                        return null;
                    }
                    x6h1 x6h1VarC26 = y6h1Var6.c();
                    x6h1VarC26.i.add(new a7h1("see_more_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC26.j = false;
                    w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:internal:martini")), x6h1VarC26.a(), r6h1Var4, System.currentTimeMillis());
                }
                return w7h1Var6;
            case 18:
                ((Number) obj3).intValue();
                return new t1m0((r6h1) obj4);
            case 19:
                t1m0 t1m0Var = (t1m0) obj;
                if (!((o7m) obj4).equals(o7m.a)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC27 = t1m0Var.b.c();
                x6h1VarC27.i.add(new a7h1("try_again_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC27.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), x6h1VarC27.a(), t1m0Var.a, System.currentTimeMillis());
            case 20:
                j8m j8mVar = (j8m) obj;
                ((Number) obj3).intValue();
                return new w1m0(j8mVar.b.a, Integer.valueOf(j8mVar.g), j8mVar.a, String.valueOf(j8mVar.h), (r6h1) obj4);
            case 21:
                return null;
            case 22:
                f9m f9mVar = (f9m) obj;
                ((Number) obj3).intValue();
                r6h1 r6h1Var5 = (r6h1) obj4;
                String str10 = f9mVar.b;
                String str11 = f9mVar.c;
                if (ihc1.y0(str11)) {
                    str11 = str10;
                }
                return new gqk0(str11, str10, r6h1Var5);
            case 23:
                gqk0 gqk0Var = (gqk0) obj;
                e9m e9mVar = (e9m) obj4;
                if (e9mVar instanceof d9m) {
                    return gqk0Var.a(nik1.w6.a);
                }
                if (e9mVar instanceof c9m) {
                    return gqk0Var.a(((c9m) e9mVar).a);
                }
                eg.o();
                return null;
            case 24:
                ((Number) obj3).intValue();
                return new iil0((r6h1) obj4);
            case 25:
                iil0 iil0Var = (iil0) obj;
                String str12 = ((pbm) obj3).c;
                if (str12 != null) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str12)), iil0Var.b, iil0Var.a, System.currentTimeMillis());
                }
                return null;
            case 26:
                ((Number) obj3).intValue();
                return new ryk0((r6h1) obj4);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                ryk0 ryk0Var = (ryk0) obj;
                if (((hcm) obj4).equals(hcm.a)) {
                    return ryk0Var.e();
                }
                eg.o();
                return null;
            case 28:
                xcm xcmVar = (xcm) obj;
                ((Number) obj3).intValue();
                return new mpk0(xcmVar.b, gq0.e(xcmVar.a), (r6h1) obj4);
            default:
                ryk0 ryk0Var2 = (ryk0) obj;
                if (((zcm) obj4).equals(zcm.a)) {
                    return ryk0Var2.e();
                }
                eg.o();
                return null;
        }
    }
}
