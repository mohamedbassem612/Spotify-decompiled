package p;

import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cnn extends hab0 implements zu30 {
    public static final cnn N0;
    public static final cnn O0;
    public static final cnn P0;
    public static final cnn Q0;
    public static final cnn R0;
    public static final cnn S0;
    public static final cnn T0;
    public static final cnn U0;
    public static final cnn V0;
    public static final cnn W0;
    public static final cnn X;
    public static final cnn X0;
    public static final cnn Y;
    public static final cnn Y0;
    public static final cnn Z;
    public static final cnn Z0;
    public static final cnn a1;
    public static final cnn b;
    public static final cnn b1;
    public static final cnn c;
    public static final cnn c1;
    public static final cnn d;
    public static final cnn d1;
    public static final cnn e;
    public static final cnn e1;
    public static final cnn f;
    public static final cnn g;
    public static final cnn h;
    public static final cnn i;
    public static final cnn t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new cnn(i2, (byte) 0);
        c = new cnn(i2, (byte) 1);
        d = new cnn(i2, (byte) 2);
        e = new cnn(i2, (byte) 3);
        f = new cnn(i2, (byte) 4);
        g = new cnn(i2, (byte) 5);
        h = new cnn(i2, (byte) 6);
        i = new cnn(i2, (byte) 7);
        t = new cnn(i2, (byte) 8);
        X = new cnn(i2, (byte) 9);
        Y = new cnn(i2, (byte) 10);
        Z = new cnn(i2, (byte) 11);
        N0 = new cnn(i2, (byte) 12);
        O0 = new cnn(i2, (byte) 13);
        P0 = new cnn(i2, (byte) 14);
        Q0 = new cnn(i2, (byte) 15);
        R0 = new cnn(i2, (byte) 16);
        S0 = new cnn(i2, (byte) 17);
        T0 = new cnn(i2, (byte) 18);
        U0 = new cnn(i2, (byte) 19);
        V0 = new cnn(i2, (byte) 20);
        W0 = new cnn(i2, (byte) 21);
        X0 = new cnn(i2, (byte) 22);
        Y0 = new cnn(i2, (byte) 23);
        Z0 = new cnn(i2, (byte) 24);
        a1 = new cnn(i2, (byte) 25);
        b1 = new cnn(i2, (byte) 26);
        c1 = new cnn(i2, (byte) 27);
        d1 = new cnn(i2, (byte) 28);
        e1 = new cnn(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cnn(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        vnb1 vnb1Var;
        String str;
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        String str2;
        w7h1 w7h1Var3;
        byte b2 = this.a;
        int i2 = 2;
        t1o t1oVar = t1o.a;
        u1o u1oVar = u1o.a;
        boolean z = false;
        String str3 = "";
        b7x b7xVar = b7x.a;
        String w7h1Var4 = null;
        switch (b2) {
            case 0:
                n3l0 n3l0Var = (n3l0) obj;
                xmn xmnVar = (xmn) obj2;
                umn umnVar = (umn) obj4;
                if (!(umnVar instanceof smn)) {
                    if (umnVar instanceof tmn) {
                        return null;
                    }
                    eg.o();
                    return null;
                }
                jmn jmnVar = xmnVar.a.i;
                if (jmnVar instanceof kmn) {
                    return n3l0Var.a(((kmn) jmnVar).a);
                }
                if (jmnVar instanceof jmn) {
                    return (w7h1) jmnVar.a.invoke(n3l0Var);
                }
                eg.o();
                return null;
            case 1:
                cyn cynVar = (cyn) obj;
                ((Number) obj3).intValue();
                return new a4l0(cynVar.a, Integer.valueOf(cynVar.b), (r6h1) obj4);
            case 2:
                if (obj4 != null) {
                    bhn0.d();
                }
                return null;
            case 3:
                return null;
            case 4:
                pyn pynVar = (pyn) obj;
                int iIntValue = ((Number) obj3).intValue();
                r6h1 r6h1Var = (r6h1) obj4;
                int iC = l1d.C(((vyn) obj2).c);
                if (iC != 3) {
                    return iC != 4 ? new b4l0(Integer.valueOf(iIntValue), pynVar.a, r6h1Var) : new yyl0(Integer.valueOf(iIntValue), r6h1Var);
                }
                return new e6l0(Integer.valueOf(iIntValue), r6h1Var);
            case 5:
                hzy hzyVar = (hzy) obj;
                i1r i1rVar = (k1r) obj3;
                String str4 = (k1r) obj4;
                int i3 = hzyVar != null ? hzyVar.a : 0;
                i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                boolean zK = yto.k(i1rVar2 != null ? (String) i1rVar2.a : null, false);
                w7h1Var4 = str4 instanceof i1r ? (i1r) str4 : null;
                boolean z2 = (w7h1Var4 == null || (vnb1Var = (vnb1) ((i1r) w7h1Var4).a) == null || !vnb1Var.b) ? false : true;
                if (zK && z2) {
                    z = true;
                }
                return new bw21(i3, z);
            case 6:
                ((Number) obj3).intValue();
                r6h1 r6h1Var2 = (r6h1) obj4;
                x4i1 x4i1Var = ((c0o) obj).a;
                if (x4i1Var != null && (str = x4i1Var.a) != null) {
                    str3 = str;
                }
                return new rml0(str3, r6h1Var2);
            case 7:
                rml0 rml0Var = (rml0) obj;
                xzn xznVar = (a0o) obj4;
                r6h1 r6h1Var3 = rml0Var.a;
                y6h1 y6h1Var = rml0Var.b;
                if (xznVar instanceof zzn) {
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("creator_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    String str5 = ((zzn) xznVar).a;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str5 != null ? str5 : "")), y6h1VarA, r6h1Var3, System.currentTimeMillis());
                } else if (xznVar instanceof xzn) {
                    x6h1 x6h1VarC2 = y6h1Var.c();
                    x6h1VarC2.i.add(new a7h1("creator_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC2.a();
                    String str6 = xznVar.a;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str6 != null ? str6 : "")), y6h1VarA2, r6h1Var3, System.currentTimeMillis());
                } else {
                    if (!(xznVar instanceof yzn)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC3 = y6h1Var.c();
                    x6h1VarC3.i.add(new a7h1("collaborators_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC3.a(), r6h1Var3, System.currentTimeMillis());
                }
                return w7h1Var;
            case 8:
                v1o v1oVar = (c2o) obj2;
                r6h1 r6h1Var4 = (r6h1) obj4;
                Integer numValueOf = Integer.valueOf(((Number) obj3).intValue());
                if (v1oVar.equals(u1oVar)) {
                    i2 = 3;
                } else {
                    if (!(v1oVar instanceof v1o)) {
                        eg.o();
                        return null;
                    }
                    b2o b2oVar = v1oVar.d;
                    if (b2oVar instanceof w1o) {
                        i2 = 1;
                    } else if (b2oVar instanceof z1o) {
                        i2 = 4;
                    } else if (!(b2oVar instanceof a2o) && !(b2oVar instanceof x1o)) {
                        if (!(b2oVar instanceof y1o)) {
                            eg.o();
                            return null;
                        }
                        i2 = 3;
                    }
                }
                if (!v1oVar.equals(u1oVar)) {
                    if (!(v1oVar instanceof v1o)) {
                        eg.o();
                        return null;
                    }
                    w7h1Var4 = v1oVar.a;
                }
                return new dll0(i2, numValueOf, w7h1Var4, r6h1Var4);
            case 9:
                dll0 dll0Var = (dll0) obj;
                v1o v1oVar2 = (c2o) obj3;
                if (!((t1o) obj4).equals(t1oVar)) {
                    eg.o();
                    return null;
                }
                if (v1oVar2.equals(u1oVar)) {
                    return null;
                }
                if (!(v1oVar2 instanceof v1o)) {
                    eg.o();
                    return null;
                }
                v1o v1oVar3 = v1oVar2;
                z1o z1oVar = v1oVar3.d;
                if (z1oVar instanceof z1o) {
                    return dll0Var.a(z1oVar.a);
                }
                if ((z1oVar instanceof w1o) || (z1oVar instanceof a2o) || (z1oVar instanceof x1o) || (z1oVar instanceof y1o)) {
                    return dll0Var.a(v1oVar3.a);
                }
                eg.o();
                return null;
            case 10:
                v1o v1oVar4 = (c2o) obj2;
                r6h1 r6h1Var5 = (r6h1) obj4;
                Integer numValueOf2 = Integer.valueOf(((Number) obj3).intValue());
                if (v1oVar4.equals(u1oVar)) {
                    i2 = 3;
                } else {
                    if (!(v1oVar4 instanceof v1o)) {
                        eg.o();
                        return null;
                    }
                    b2o b2oVar2 = v1oVar4.d;
                    if (b2oVar2 instanceof w1o) {
                        i2 = 1;
                    } else if (b2oVar2 instanceof z1o) {
                        i2 = 4;
                    } else if (!(b2oVar2 instanceof a2o) && !(b2oVar2 instanceof x1o)) {
                        if (!(b2oVar2 instanceof y1o)) {
                            eg.o();
                            return null;
                        }
                        i2 = 3;
                    }
                }
                if (!v1oVar4.equals(u1oVar)) {
                    if (!(v1oVar4 instanceof v1o)) {
                        eg.o();
                        return null;
                    }
                    w7h1Var4 = v1oVar4.a;
                }
                return new dll0(i2, numValueOf2, w7h1Var4, r6h1Var5);
            case 11:
                dll0 dll0Var2 = (dll0) obj;
                v1o v1oVar5 = (c2o) obj3;
                if (!((t1o) obj4).equals(t1oVar)) {
                    eg.o();
                    return null;
                }
                if (v1oVar5.equals(u1oVar)) {
                    return null;
                }
                if (!(v1oVar5 instanceof v1o)) {
                    eg.o();
                    return null;
                }
                v1o v1oVar6 = v1oVar5;
                z1o z1oVar2 = v1oVar6.d;
                if (z1oVar2 instanceof z1o) {
                    return dll0Var2.a(z1oVar2.a);
                }
                if ((z1oVar2 instanceof w1o) || (z1oVar2 instanceof a2o) || (z1oVar2 instanceof x1o) || (z1oVar2 instanceof y1o)) {
                    return dll0Var2.a(v1oVar6.a);
                }
                eg.o();
                return null;
            case 12:
                ((Number) obj3).intValue();
                return new iqk0(new jqk0((r6h1) obj4));
            case 13:
                iqk0 iqk0Var = (iqk0) obj;
                f5o f5oVar = (f5o) obj2;
                b5o b5oVar = (b5o) obj4;
                y6h1 y6h1Var2 = iqk0Var.a;
                r6h1 r6h1Var6 = iqk0Var.b.b;
                if (b5oVar instanceof z4o) {
                    e5o e5oVar = (e5o) o7h.X0(f5oVar.b);
                    if (e5oVar == null || (str2 = e5oVar.b) == null) {
                        return null;
                    }
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), y6h1Var2, r6h1Var6, System.currentTimeMillis());
                } else {
                    if (!(b5oVar instanceof a5o)) {
                        eg.o();
                        return null;
                    }
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var2, r6h1Var6, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 14:
                return new f4l0(Integer.valueOf(((Number) obj3).intValue()), ((r6o) obj2).a, (r6h1) obj4);
            case 15:
                return null;
            case 16:
                ((Number) obj3).intValue();
                return new g4l0((r6h1) obj4);
            case 17:
                g4l0 g4l0Var = (g4l0) obj;
                x6h1 x6h1VarC4 = g4l0Var.b.c();
                x6h1VarC4.i.add(new a7h1("show_all_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC4.a(), g4l0Var.a, System.currentTimeMillis());
            case 18:
                ((Number) obj3).intValue();
                r6h1 r6h1Var7 = r6h1.c;
                return new xwl0(new qrl0((byte) 3));
            case 19:
                xwl0 xwl0Var = (xwl0) obj;
                String strValueOf = String.valueOf(((e9o) obj4).a);
                return new w7h1("", "", new z7h1("drag", 1, b7xVar), new x7h1("set_multiple_choice_value", 1, Collections.singletonMap("option_selected", strValueOf != null ? strValueOf : "")), xwl0Var.a, r6h1.c, System.currentTimeMillis());
            case 20:
                zvl0 zvl0Var = (zvl0) obj;
                iao iaoVar = (iao) obj2;
                if (((hao) obj4).equals(hao.a)) {
                    String str7 = iaoVar.a;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str7 != null ? str7 : "")), zvl0Var.a, r6h1.c, System.currentTimeMillis());
                } else {
                    eg.o();
                }
                return w7h1Var4;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                return null;
            case 22:
                xvl0 xvl0Var = (xvl0) obj;
                String str8 = nik1.w6.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str8 != null ? str8 : "")), xvl0Var.a, r6h1.c, System.currentTimeMillis());
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                return null;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                yvl0 yvl0Var = (yvl0) obj;
                if (!((rbo) obj4).equals(rbo.a)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC5 = yvl0Var.a.c();
                x6h1VarC5.i.add(new a7h1("see_more_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis());
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                gdo gdoVar = (gdo) obj2;
                ((Number) obj3).intValue();
                r6h1 r6h1Var8 = (r6h1) obj4;
                i6h1 i6h1VarA = gdoVar.a();
                String str9 = i6h1VarA != null ? i6h1VarA.a : null;
                i6h1 i6h1VarA2 = gdoVar.a();
                return new npk0(i6h1VarA2 != null ? i6h1VarA2.b : null, str9, r6h1Var8);
            case 26:
                npk0 npk0Var = (npk0) obj;
                gdo gdoVar2 = (gdo) obj3;
                r6h1 r6h1Var9 = npk0Var.a;
                y6h1 y6h1Var3 = npk0Var.b;
                int iOrdinal = ((bdo) obj4).ordinal();
                if (iOrdinal == 0) {
                    ki0 ki0VarB = gdoVar2.b();
                    w7h1Var4 = ki0VarB != null ? ki0VarB.g() : null;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", w7h1Var4 != null ? w7h1Var4 : "")), y6h1Var3, r6h1Var9, System.currentTimeMillis());
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC6 = y6h1Var3.c();
                    x6h1VarC6.i.add(new a7h1("cta_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    y6h1 y6h1VarA3 = x6h1VarC6.a();
                    ki0 ki0VarB2 = gdoVar2.b();
                    w7h1Var4 = ki0VarB2 != null ? ki0VarB2.g() : null;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", w7h1Var4 != null ? w7h1Var4 : "")), y6h1VarA3, r6h1Var9, System.currentTimeMillis());
                }
                return w7h1Var3;
            case 27:
                return new i4l0(Integer.valueOf(((Number) obj3).intValue()), (String) obj, (r6h1) obj4);
            case 28:
                i4l0 i4l0Var = (i4l0) obj;
                ifo ifoVar = (ifo) obj3;
                if (((hfo) obj4).equals(hfo.a)) {
                    String str10 = ifoVar.d;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str10 != null ? str10 : "")), i4l0Var.b, i4l0Var.a, System.currentTimeMillis());
                } else {
                    eg.o();
                }
                return w7h1Var4;
            default:
                ((Number) obj3).intValue();
                return new k4l0((r6h1) obj4);
        }
    }
}
