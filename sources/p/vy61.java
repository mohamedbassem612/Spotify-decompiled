package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vy61 extends hab0 implements zu30 {
    public static final vy61 N0;
    public static final vy61 O0;
    public static final vy61 P0;
    public static final vy61 Q0;
    public static final vy61 R0;
    public static final vy61 S0;
    public static final vy61 T0;
    public static final vy61 U0;
    public static final vy61 V0;
    public static final vy61 W0;
    public static final vy61 X;
    public static final vy61 X0;
    public static final vy61 Y;
    public static final vy61 Y0;
    public static final vy61 Z;
    public static final vy61 Z0;
    public static final vy61 a1;
    public static final vy61 b;
    public static final vy61 b1;
    public static final vy61 c;
    public static final vy61 c1;
    public static final vy61 d;
    public static final vy61 d1;
    public static final vy61 e;
    public static final vy61 e1;
    public static final vy61 f;
    public static final vy61 g;
    public static final vy61 h;
    public static final vy61 i;
    public static final vy61 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new vy61(i2, (byte) 0);
        c = new vy61(i2, (byte) 1);
        d = new vy61(i2, (byte) 2);
        e = new vy61(i2, (byte) 3);
        f = new vy61(i2, (byte) 4);
        g = new vy61(i2, (byte) 5);
        h = new vy61(i2, (byte) 6);
        i = new vy61(i2, (byte) 7);
        t = new vy61(i2, (byte) 8);
        X = new vy61(i2, (byte) 9);
        Y = new vy61(i2, (byte) 10);
        Z = new vy61(i2, (byte) 11);
        N0 = new vy61(i2, (byte) 12);
        O0 = new vy61(i2, (byte) 13);
        P0 = new vy61(i2, (byte) 14);
        Q0 = new vy61(i2, (byte) 15);
        R0 = new vy61(i2, (byte) 16);
        S0 = new vy61(i2, (byte) 17);
        T0 = new vy61(i2, (byte) 18);
        U0 = new vy61(i2, (byte) 19);
        V0 = new vy61(i2, (byte) 20);
        W0 = new vy61(i2, (byte) 21);
        X0 = new vy61(i2, (byte) 22);
        Y0 = new vy61(i2, (byte) 23);
        Z0 = new vy61(i2, (byte) 24);
        a1 = new vy61(i2, (byte) 25);
        b1 = new vy61(i2, (byte) 26);
        c1 = new vy61(i2, (byte) 27);
        d1 = new vy61(i2, (byte) 28);
        e1 = new vy61(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vy61(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        byte b2 = this.a;
        b381 b381Var = b381.a;
        c381 c381Var = c381.a;
        b7x b7xVar = b7x.a;
        int i2 = 1;
        switch (b2) {
            case 0:
                return ((rxl0) obj).a(nik1.n2.a);
            case 1:
                ((Number) obj3).intValue();
                return new oyk0(((ny61) obj).a, "", (r6h1) obj4);
            case 2:
                oyk0 oyk0Var = (oyk0) obj;
                x6h1 x6h1VarC = oyk0Var.b.c();
                x6h1VarC.i.add(new a7h1("share_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", ((ny61) obj2).a)), x6h1VarC.a(), oyk0Var.a, System.currentTimeMillis());
            case 3:
                return null;
            case 4:
                Integer numValueOf = Integer.valueOf(((Number) obj3).intValue());
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                return new ptl0(new qtl0(numValueOf, yon1.G1("READALONG", "readalong", 1626, "readalong").c, ((a371) obj).a, (r6h1) obj4));
            case 5:
                ptl0 ptl0Var = (ptl0) obj;
                if (((z271) obj4).equals(z271.a)) {
                    return ptl0Var.h();
                }
                eg.o();
                return null;
            case 6:
                ((Number) obj3).intValue();
                return new rxl0((r6h1) obj4);
            case 7:
                return ((rxl0) obj).a(nik1.n2.a);
            case 8:
                ((Number) obj3).intValue();
                return new wil0((r6h1) obj4);
            case 9:
                wil0 wil0Var = (wil0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), wil0Var.b, wil0Var.a, System.currentTimeMillis());
            case 10:
                ((Number) obj3).intValue();
                return new rxl0((r6h1) obj4);
            case 11:
                return ((rxl0) obj).a("spotify:app:share-flow");
            case 12:
                ((Number) obj3).intValue();
                return new rxl0((r6h1) obj4);
            case 13:
                rxl0 rxl0Var = (rxl0) obj;
                if (((h871) obj4).equals(h871.a)) {
                    return rxl0Var.a("spotify:app:share-flow");
                }
                eg.o();
                return null;
            case 14:
                cyl0 cyl0Var = (cyl0) obj;
                if (((ef71) obj4) instanceof ef71) {
                    vb2.a.getClass();
                    return cyl0Var.a(ub2.b);
                }
                eg.o();
                return null;
            case 15:
                ((Number) obj3).intValue();
                wa71 wa71Var = ((ug71) obj).b.a;
                String str = wa71Var != null ? wa71Var.a : null;
                return new xxl0(str != null ? str : "");
            case 16:
                ks71 ks71Var = (ks71) obj2;
                ((Number) obj3).intValue();
                String str2 = ks71Var.d;
                r6h1 r6h1Var = r6h1.c;
                return new hwk0(Integer.valueOf(ks71Var.c), ks71Var.b, new nqk0(new yok0(str2, (byte) 9), (byte) 0));
            case 17:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", ((ks71) obj3).b)), ((hwk0) obj).a, r6h1.c, System.currentTimeMillis());
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                ((Number) obj3).intValue();
                return new mfl0((r6h1) obj4);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return null;
            case 20:
                return new vyl0(Integer.valueOf(((Number) obj3).intValue()), ((m081) obj).d, (r6h1) obj4);
            case 21:
                vyl0 vyl0Var = (vyl0) obj;
                m081 m081Var = (m081) obj2;
                g081 g081Var = (g081) obj4;
                r6h1 r6h1Var2 = vyl0Var.a;
                y6h1 y6h1Var = vyl0Var.b;
                if (g081Var instanceof e081) {
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", m081Var.a)), y6h1Var, r6h1Var2, System.currentTimeMillis());
                } else {
                    if (!(g081Var instanceof f081)) {
                        eg.o();
                        return null;
                    }
                    w7h1Var = new w7h1("", "", new z7h1("long_hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var, r6h1Var2, System.currentTimeMillis());
                }
                return w7h1Var;
            case 22:
                return new wyl0(Integer.valueOf(((Number) obj3).intValue()), ((e181) obj).a, (r6h1) obj4);
            case 23:
                return null;
            case 24:
                bwl0 bwl0Var = (bwl0) obj;
                f381 f381Var = (f381) obj3;
                d381 d381Var = (d381) obj4;
                String str3 = ((e381) obj2).a;
                if (d381Var.equals(c381Var)) {
                    return bwl0Var.a(str3);
                }
                if (d381Var.equals(b381Var)) {
                    return f381Var.i ? bwl0Var.j(str3) : bwl0Var.h(str3);
                }
                eg.o();
                return null;
            case 25:
                wvl0 wvl0Var = (wvl0) obj;
                f381 f381Var2 = (f381) obj3;
                d381 d381Var2 = (d381) obj4;
                String str4 = ((e381) obj2).a;
                if (d381Var2.equals(c381Var)) {
                    return wvl0Var.a(str4);
                }
                if (d381Var2.equals(b381Var)) {
                    return f381Var2.i ? wvl0Var.j(str4) : wvl0Var.h(str4);
                }
                eg.o();
                return null;
            case 26:
                ((Number) obj3).intValue();
                r6h1 r6h1Var3 = (r6h1) obj4;
                int iL = l6p1.l(((m581) obj2).a);
                if (iL != 0) {
                    return new t9l0(iL, r6h1Var3);
                }
                eg.m("Required value was null.");
                return null;
            case 27:
                t9l0 t9l0Var = (t9l0) obj;
                r581 r581Var = (r581) obj4;
                r6h1 r6h1Var4 = t9l0Var.a;
                y6h1 y6h1Var2 = t9l0Var.b;
                if (r581Var.equals(q581.a)) {
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var2, r6h1Var4, System.currentTimeMillis());
                } else {
                    if (!r581Var.equals(p581.a)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC2 = y6h1Var2.c();
                    x6h1VarC2.i.add(new a7h1("retry_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), x6h1VarC2.a(), r6h1Var4, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 28:
                j681 j681Var = (j681) obj;
                int iIntValue = ((Number) obj3).intValue();
                h7l0 h7l0Var = new h7l0((byte) 24);
                int iC = l1d.C(j681Var.e);
                if (iC == 0) {
                    i2 = 2;
                } else if (iC != 1) {
                    if (iC != 2) {
                        eg.o();
                        return null;
                    }
                    i2 = 3;
                }
                return new u9l0(h7l0Var, i2, Integer.valueOf(iIntValue), j681Var.a);
            default:
                j681 j681Var2 = (j681) obj2;
                n681 n681Var = (n681) obj4;
                y6h1 y6h1Var3 = ((u9l0) obj).a;
                if (n681Var.equals(l681.a)) {
                    x6h1 x6h1VarC3 = y6h1Var3.c();
                    x6h1VarC3.i.add(new a7h1("retry_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (!n681Var.equals(m681.a)) {
                        eg.o();
                        return null;
                    }
                    String str5 = j681Var2.d;
                    if (str5 == null) {
                        return null;
                    }
                    if (ihc1.y0(str5)) {
                        str5 = null;
                    }
                    if (str5 == null) {
                        return null;
                    }
                    x6h1 x6h1VarC4 = y6h1Var3.c();
                    x6h1VarC4.i.add(new a7h1("view_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str5)), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var3;
        }
    }
}
