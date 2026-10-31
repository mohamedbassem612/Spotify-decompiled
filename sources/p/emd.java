package p;

import android.content.Context;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class emd extends hab0 implements zu30 {
    public static final emd N0;
    public static final emd O0;
    public static final emd P0;
    public static final emd Q0;
    public static final emd R0;
    public static final emd S0;
    public static final emd T0;
    public static final emd U0;
    public static final emd V0;
    public static final emd W0;
    public static final emd X;
    public static final emd X0;
    public static final emd Y;
    public static final emd Y0;
    public static final emd Z;
    public static final emd Z0;
    public static final emd a1;
    public static final emd b;
    public static final emd b1;
    public static final emd c;
    public static final emd c1;
    public static final emd d;
    public static final emd d1;
    public static final emd e;
    public static final emd e1;
    public static final emd f;
    public static final emd g;
    public static final emd h;
    public static final emd i;
    public static final emd t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new emd(i2, (byte) 0);
        c = new emd(i2, (byte) 1);
        d = new emd(i2, (byte) 2);
        e = new emd(i2, (byte) 3);
        f = new emd(i2, (byte) 4);
        g = new emd(i2, (byte) 5);
        h = new emd(i2, (byte) 6);
        i = new emd(i2, (byte) 7);
        t = new emd(i2, (byte) 8);
        X = new emd(i2, (byte) 9);
        Y = new emd(i2, (byte) 10);
        Z = new emd(i2, (byte) 11);
        N0 = new emd(i2, (byte) 12);
        O0 = new emd(i2, (byte) 13);
        P0 = new emd(i2, (byte) 14);
        Q0 = new emd(i2, (byte) 15);
        R0 = new emd(i2, (byte) 16);
        S0 = new emd(i2, (byte) 17);
        T0 = new emd(i2, (byte) 18);
        U0 = new emd(i2, (byte) 19);
        V0 = new emd(i2, (byte) 20);
        W0 = new emd(i2, (byte) 21);
        X0 = new emd(i2, (byte) 22);
        Y0 = new emd(i2, (byte) 23);
        Z0 = new emd(i2, (byte) 24);
        a1 = new emd(i2, (byte) 25);
        b1 = new emd(i2, (byte) 26);
        c1 = new emd(i2, (byte) 27);
        d1 = new emd(i2, (byte) 28);
        e1 = new emd(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ emd(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        qxd qxdVar;
        int i2;
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        char c2;
        String str;
        w7h1 w7h1Var4;
        byte b2 = this.a;
        int i3 = 3;
        b7x b7xVar = b7x.a;
        switch (b2) {
            case 0:
                dcl0 dcl0Var = (dcl0) obj;
                if (!((dmd) obj4).equals(dmd.a)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC = dcl0Var.b.c();
                x6h1VarC.i.add(new a7h1("expand_collapse_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC.a(), dcl0Var.a, System.currentTimeMillis());
            case 1:
                hhl0 hhl0Var = (hhl0) obj;
                lnd lndVar = (lnd) obj4;
                if (lndVar instanceof jnd) {
                    return hhl0Var.e();
                }
                if (lndVar instanceof knd) {
                    return hhl0Var.h(((knd) lndVar).b);
                }
                eg.o();
                return null;
            case 2:
                return new vh((Context) obj2, (iu30) obj4);
            case 3:
                dtd dtdVar = (dtd) obj;
                ((Number) obj3).intValue();
                return new afl0(Integer.valueOf(dtdVar.b), dtdVar.c, new jpk0(new tdl0((byte) 3), Integer.valueOf(dtdVar.a)));
            case 4:
                return null;
            case 5:
                return new pul0(Integer.valueOf(((Number) obj3).intValue()), ((cwd) obj).a.a, (r6h1) obj4);
            case 6:
                return ((pul0) obj).a(((bwd) obj4).a);
            case 7:
                qxd qxdVar2 = (sxd) obj4;
                y6h1 y6h1Var = ((brk0) obj).a;
                if (!(qxdVar2 instanceof qxd) || (i2 = (qxdVar = qxdVar2).a) < 0) {
                    return null;
                }
                int i4 = qxdVar.b;
                if (i4 > i2) {
                    w7h1Var = new w7h1("", "", new z7h1("swipe_left", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var, r6h1.c, System.currentTimeMillis());
                } else {
                    if (i4 >= i2) {
                        return null;
                    }
                    w7h1Var = new w7h1("", "", new z7h1("swipe_right", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var, r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var;
            case 8:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "")), ((ark0) obj).a, r6h1.c, System.currentTimeMillis());
            case 9:
                ((Number) obj3).intValue();
                return new puk0((r6h1) obj4);
            case 10:
                puk0 puk0Var = (puk0) obj;
                q6e q6eVar = (q6e) obj4;
                r6h1 r6h1Var = puk0Var.a;
                y6h1 y6h1Var2 = puk0Var.b;
                if (q6eVar instanceof m6e) {
                    String str2 = ((m6e) q6eVar).a.a;
                    x6h1 x6h1VarC2 = y6h1Var2.c();
                    x6h1VarC2.i.add(new a7h1("category_chip", str2, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("filter", 1, b7xVar), x6h1VarC2.a(), r6h1Var, System.currentTimeMillis());
                } else {
                    if (!(q6eVar instanceof p6e)) {
                        if ((q6eVar instanceof o6e) || q6eVar.equals(n6e.a)) {
                            return null;
                        }
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC3 = y6h1Var2.c();
                    x6h1VarC3.i.add(new a7h1("header_action_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    y6h1 y6h1VarA = x6h1VarC3.a();
                    String str3 = ((p6e) q6eVar).a;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str3 != null ? str3 : "")), y6h1VarA, r6h1Var, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 11:
                l8e l8eVar = (l8e) obj;
                ((Number) obj3).intValue();
                r6h1 r6h1Var2 = (r6h1) obj4;
                for (jx11 jx11Var : jx11.f) {
                    if (jx11Var.a().equals(l8eVar.a)) {
                        int iOrdinal = jx11Var.ordinal();
                        if (iOrdinal == 0) {
                            i3 = 1;
                        } else if (iOrdinal == 1) {
                            i3 = 2;
                        } else if (iOrdinal != 2) {
                            eg.o();
                            return null;
                        }
                        return new xrk0(i3, r6h1Var2);
                    }
                }
                bhn0.t("Collection contains no element matching the predicate.");
                return null;
            case 12:
                xrk0 xrk0Var = (xrk0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", ((m8e) obj4).a.d())), xrk0Var.b, xrk0Var.a, System.currentTimeMillis());
            case 13:
                int iIntValue = ((Number) obj3).intValue();
                String str4 = ((o8e) obj).a;
                return new p3l0(Integer.valueOf(iIntValue), str4, new py9(str4, (r6h1) obj4, (byte) 25));
            case 14:
                p3l0 p3l0Var = (p3l0) obj;
                String str5 = ((o8e) obj2).a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str5 != null ? str5 : "")), p3l0Var.a, p3l0Var.b.b, System.currentTimeMillis());
            case 15:
                return new ccl0(Integer.valueOf(((Number) obj3).intValue()), ((w8e) obj).a, (r6h1) obj4);
            case 16:
                return null;
            case 17:
                d9e d9eVar = (d9e) obj;
                ((Number) obj3).intValue();
                return new qtk0(Integer.valueOf(d9eVar.c), d9eVar.a, (r6h1) obj4);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                qtk0 qtk0Var = (qtk0) obj;
                String str6 = ((c9e) obj4).a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str6 != null ? str6 : "")), qtk0Var.b, qtk0Var.a, System.currentTimeMillis());
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ((Number) obj3).intValue();
                return new kll0(new fjl0((r6h1) obj4, (byte) 2));
            case 20:
                kll0 kll0Var = (kll0) obj;
                if (((a700) obj4) instanceof twz) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), kll0Var.a, kll0Var.b.b, System.currentTimeMillis());
                }
                return null;
            case 21:
                qhe qheVar = (qhe) obj2;
                ((Number) obj3).intValue();
                r6h1 r6h1Var3 = (r6h1) obj4;
                if (qheVar instanceof phe) {
                    return new tsk0(r6h1Var3);
                }
                if (qheVar.equals(ohe.a)) {
                    return new z8s((byte) 2);
                }
                eg.o();
                return null;
            case 22:
                tsk0 tsk0Var = (n8h1) obj;
                phe pheVar = (qhe) obj3;
                if (!(((lhe) obj4) instanceof lhe)) {
                    eg.o();
                    return null;
                }
                if (!(pheVar instanceof phe)) {
                    return null;
                }
                String str7 = pheVar.a;
                if (str7.length() <= 0) {
                    return null;
                }
                tsk0 tsk0Var2 = tsk0Var;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str7)), tsk0Var2.b, tsk0Var2.a, System.currentTimeMillis());
            case 23:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), ((txl0) obj).a, r6h1.c, System.currentTimeMillis());
            case 24:
                iyl0 iyl0Var = (iyl0) obj;
                if (((zke) obj4) instanceof zke) {
                    AtomicReferenceArray atomicReferenceArray = p6r0.e;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", yon1.v1().a)), iyl0Var.a, iyl0Var.b.b, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 25:
                dpe dpeVar = (npe) obj4;
                y6h1 y6h1Var3 = ((ifl0) obj).a;
                if (dpeVar instanceof fpe) {
                    x6h1 x6h1VarC4 = y6h1Var3.c();
                    x6h1VarC4.i.add(new a7h1("send_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("send_message", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
                } else if (dpeVar instanceof epe) {
                    x6h1 x6h1VarC5 = y6h1Var3.c();
                    x6h1VarC5.i.add(new a7h1("text_input", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("focus_input_field", 1, b7xVar), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis());
                } else if (dpeVar instanceof bpe) {
                    x6h1 x6h1VarC6 = y6h1Var3.c();
                    x6h1VarC6.i.add(new a7h1("stop_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis());
                } else if (!(dpeVar instanceof dpe)) {
                    if (!(dpeVar instanceof lpe)) {
                        return null;
                    }
                    x6h1 x6h1VarC7 = y6h1Var3.c();
                    x6h1VarC7.i.add(new a7h1("mic_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis());
                } else if (dpeVar.b) {
                    x6h1 x6h1VarC8 = y6h1Var3.c();
                    x6h1VarC8.i.add(new a7h1("thinking_state", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC8.a();
                    String str8 = nik1.w6.a;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str8 != null ? str8 : "")), y6h1VarA2, r6h1.c, System.currentTimeMillis());
                } else {
                    x6h1 x6h1VarC9 = y6h1Var3.c();
                    x6h1VarC9.i.add(new a7h1("expand_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    y6h1 y6h1VarA3 = x6h1VarC9.a();
                    String str9 = nik1.w6.a;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str9 != null ? str9 : "")), y6h1VarA3, r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var3;
            case 26:
                ((Number) obj3).intValue();
                return new cdl0(((wre) obj).a, (r6h1) obj4);
            case 27:
                ((Number) obj3).intValue();
                return new gvk0(new bqk0((byte) 23));
            case 28:
                gvk0 gvk0Var = (gvk0) obj;
                yse yseVar = (yse) obj4;
                xse xseVar = yseVar.a;
                int iC = l1d.C(xseVar.a);
                if (iC == 0) {
                    c2 = 3;
                } else if (iC == 1) {
                    c2 = 2;
                } else {
                    if (iC != 2) {
                        eg.o();
                        return null;
                    }
                    c2 = 1;
                }
                Integer numValueOf = Integer.valueOf(yseVar.b);
                x6h1 x6h1VarC10 = gvk0Var.a.c();
                if (c2 == 1) {
                    str = "gifs";
                } else if (c2 == 2) {
                    str = "lyrics_stickers";
                } else {
                    if (c2 != 3) {
                        throw null;
                    }
                    str = "spotify_entities";
                }
                x6h1VarC10.i.add(new a7h1("tab", str, numValueOf, (String) null, (String) null));
                x6h1VarC10.j = false;
                y6h1 y6h1VarA4 = x6h1VarC10.a();
                String str10 = xseVar.d;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str10 != null ? str10 : "")), y6h1VarA4, r6h1.c, System.currentTimeMillis());
            default:
                wve wveVar = (wve) obj2;
                vve vveVar = (vve) obj4;
                y6h1 y6h1Var4 = ((cvk0) obj).a;
                if (vveVar.equals(uve.a)) {
                    String str11 = wveVar.b;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str11 != null ? str11 : "")), y6h1Var4, r6h1.c, System.currentTimeMillis());
                } else {
                    if (!vveVar.equals(tve.a)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC11 = y6h1Var4.c();
                    x6h1VarC11.i.add(new a7h1("more_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC11.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC11.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var4;
        }
    }
}
