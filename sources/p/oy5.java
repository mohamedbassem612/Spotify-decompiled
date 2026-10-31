package p;

import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class oy5 extends hab0 implements zu30 {
    public static final oy5 N0;
    public static final oy5 O0;
    public static final oy5 P0;
    public static final oy5 Q0;
    public static final oy5 R0;
    public static final oy5 S0;
    public static final oy5 T0;
    public static final oy5 U0;
    public static final oy5 V0;
    public static final oy5 W0;
    public static final oy5 X;
    public static final oy5 X0;
    public static final oy5 Y;
    public static final oy5 Y0;
    public static final oy5 Z;
    public static final oy5 Z0;
    public static final oy5 a1;
    public static final oy5 b;
    public static final oy5 b1;
    public static final oy5 c;
    public static final oy5 c1;
    public static final oy5 d;
    public static final oy5 d1;
    public static final oy5 e;
    public static final oy5 e1;
    public static final oy5 f;
    public static final oy5 g;
    public static final oy5 h;
    public static final oy5 i;
    public static final oy5 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new oy5(i2, (byte) 0);
        c = new oy5(i2, (byte) 1);
        d = new oy5(i2, (byte) 2);
        e = new oy5(i2, (byte) 3);
        f = new oy5(i2, (byte) 4);
        g = new oy5(i2, (byte) 5);
        h = new oy5(i2, (byte) 6);
        i = new oy5(i2, (byte) 7);
        t = new oy5(i2, (byte) 8);
        X = new oy5(i2, (byte) 9);
        Y = new oy5(i2, (byte) 10);
        Z = new oy5(i2, (byte) 11);
        N0 = new oy5(i2, (byte) 12);
        O0 = new oy5(i2, (byte) 13);
        P0 = new oy5(i2, (byte) 14);
        Q0 = new oy5(i2, (byte) 15);
        R0 = new oy5(i2, (byte) 16);
        S0 = new oy5(i2, (byte) 17);
        T0 = new oy5(i2, (byte) 18);
        U0 = new oy5(i2, (byte) 19);
        V0 = new oy5(i2, (byte) 20);
        W0 = new oy5(i2, (byte) 21);
        X0 = new oy5(i2, (byte) 22);
        Y0 = new oy5(i2, (byte) 23);
        Z0 = new oy5(i2, (byte) 24);
        a1 = new oy5(i2, (byte) 25);
        b1 = new oy5(i2, (byte) 26);
        c1 = new oy5(i2, (byte) 27);
        d1 = new oy5(i2, (byte) 28);
        e1 = new oy5(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oy5(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        byte b2 = this.a;
        kl6 kl6Var = kl6.a;
        jl6 jl6Var = jl6.a;
        ll6 ll6Var = ll6.a;
        b7x b7xVar = b7x.a;
        switch (b2) {
            case 0:
                ((Number) obj3).intValue();
                return new nsk0(new psk0((String) obj));
            case 1:
                return null;
            case 2:
                ((Number) obj3).intValue();
                return new psk0(l1d.m("spotify:atv-pin-entry:", ((ez5) obj).a));
            case 3:
                ((Number) obj3).intValue();
                return new osk0(new psk0(((gz5) obj).a));
            case 4:
                return null;
            case 5:
                ((Number) obj3).intValue();
                return new q7l0(((p16) obj).a, (r6h1) obj4);
            case 6:
                q7l0 q7l0Var = (q7l0) obj;
                o16 o16Var = (o16) obj4;
                r6h1 r6h1Var = q7l0Var.a;
                y6h1 y6h1Var = q7l0Var.b;
                if (o16Var.equals(l16.a)) {
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("approve_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("submit", 1, b7xVar), x6h1VarC.a(), r6h1Var, System.currentTimeMillis());
                } else {
                    if (!o16Var.equals(m16.a)) {
                        if (o16Var.equals(n16.a)) {
                            return null;
                        }
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC2 = y6h1Var.c();
                    x6h1VarC2.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1Var, System.currentTimeMillis());
                }
                return w7h1Var;
            case 7:
                ((Number) obj3).intValue();
                return new n0m0(new uqk0((r6h1) obj4, (byte) 3), ((nza) obj).a);
            case 8:
                n0m0 n0m0Var = (n0m0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", ((nza) obj2).a.concat(":dna"))), n0m0Var.a, n0m0Var.b.b, System.currentTimeMillis());
            case 9:
                ((Number) obj3).intValue();
                return new o0m0(new uqk0((r6h1) obj4, (byte) 3), ((nza) obj).a);
            case 10:
                o0m0 o0m0Var = (o0m0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", ((nza) obj2).a.concat(":dna"))), o0m0Var.a, o0m0Var.b.b, System.currentTimeMillis());
            case 11:
                bwl0 bwl0Var = (bwl0) obj;
                pl6 pl6Var = (pl6) obj3;
                nl6 nl6Var = (nl6) obj4;
                y6h1 y6h1Var2 = bwl0Var.a;
                String str = ((ol6) obj2).a;
                hl6 hl6Var = pl6Var.m;
                if (nl6Var instanceof ml6) {
                    return bwl0Var.a(str);
                }
                if (nl6Var.equals(ll6Var)) {
                    return pl6Var.i ? bwl0Var.j(str) : bwl0Var.h(str);
                }
                if (nl6Var.equals(jl6Var)) {
                    if (hl6Var != null) {
                        return bwl0Var.a(hl6Var.a);
                    }
                    return null;
                }
                if (!nl6Var.equals(kl6Var)) {
                    eg.o();
                    return null;
                }
                if (hl6Var == null) {
                    return null;
                }
                boolean z = pl6Var.n;
                String str2 = hl6Var.a;
                if (z) {
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_like", 1, Collections.singletonMap("item_no_longer_liked", str2 == null ? "" : str2)), y6h1Var2, r6h1.c, System.currentTimeMillis());
                } else {
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("like", 1, Collections.singletonMap("item_to_be_liked", str2 == null ? "" : str2)), y6h1Var2, r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 12:
                wvl0 wvl0Var = (wvl0) obj;
                pl6 pl6Var2 = (pl6) obj3;
                nl6 nl6Var2 = (nl6) obj4;
                y6h1 y6h1Var3 = wvl0Var.a;
                String str3 = ((ol6) obj2).a;
                hl6 hl6Var2 = pl6Var2.m;
                if (nl6Var2 instanceof ml6) {
                    return wvl0Var.a(str3);
                }
                if (nl6Var2.equals(ll6Var)) {
                    return pl6Var2.i ? wvl0Var.j(str3) : wvl0Var.h(str3);
                }
                if (nl6Var2.equals(jl6Var)) {
                    if (hl6Var2 != null) {
                        return wvl0Var.a(hl6Var2.a);
                    }
                    return null;
                }
                if (!nl6Var2.equals(kl6Var)) {
                    eg.o();
                    return null;
                }
                if (hl6Var2 == null) {
                    return null;
                }
                boolean z2 = pl6Var2.n;
                String str4 = hl6Var2.a;
                if (z2) {
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_like", 1, Collections.singletonMap("item_no_longer_liked", str4 == null ? "" : str4)), y6h1Var3, r6h1.c, System.currentTimeMillis());
                } else {
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("like", 1, Collections.singletonMap("item_to_be_liked", str4 == null ? "" : str4)), y6h1Var3, r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var3;
            case 13:
                if (obj4 != null) {
                    bhn0.d();
                }
                return null;
            case 14:
                ((Number) obj3).intValue();
                return new u8l0(new nqk0(new v8l0()), ((bp6) obj).a);
            case 15:
                u8l0 u8l0Var = (u8l0) obj;
                if (!((ap6) obj4).equals(ap6.a)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC3 = u8l0Var.a.c();
                x6h1VarC3.i.add(new a7h1("approve_artist_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
            case 16:
                ((Number) obj3).intValue();
                return new qol0(new fjl0((r6h1) obj4, (byte) 23));
            case 17:
                qol0 qol0Var = (qol0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", ((rq6) obj3).c)), qol0Var.a, qol0Var.b.b, System.currentTimeMillis());
            case 18:
                return rih1.a;
            case 19:
                return new tql0(Integer.valueOf(((Number) obj3).intValue()), ((hx6) obj).a, new mjl0(new uql0()));
            case 20:
                ix6 ix6Var = (ix6) obj;
                return new eql0(new cql0(new fql0(ix6Var.a), (byte) 2), Integer.valueOf(((Number) obj3).intValue()), ix6Var.b);
            case 21:
                return new idl0(Integer.valueOf(((Number) obj3).intValue()), ((gx6) obj).a, (r6h1) obj4);
            case 22:
                tql0 tql0Var = (tql0) obj;
                if (((bx6) obj4).a.equals(yis0.d)) {
                    return new w7h1("gui", "user", new z7h1("long_hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), tql0Var.a, r6h1.c, System.currentTimeMillis());
                }
                return null;
            case 23:
                return null;
            case 24:
                jvl0 jvl0Var = (jvl0) obj;
                lx6 lx6Var = (lx6) obj3;
                dx6 dx6Var = (dx6) obj4;
                String str5 = ((jx6) obj2).a;
                if (dx6Var instanceof zw6) {
                    return lx6Var.g ? jvl0Var.j() : jvl0Var.a(str5);
                }
                if (dx6Var.equals(xw6.a)) {
                    return lx6Var.h ? jvl0Var.k(str5) : jvl0Var.h(str5);
                }
                eg.o();
                return null;
            case 25:
                return new oqk0(Integer.valueOf(((Number) obj3).intValue()), ((kx6) obj).a, new py9((r6h1) obj4, (byte) 10));
            case 26:
                oqk0 oqk0Var = (oqk0) obj;
                kx6 kx6Var = (kx6) obj2;
                if (((ax6) obj4).equals(ax6.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", kx6Var.a)), oqk0Var.a, oqk0Var.b.b, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 27:
                return new cz6((jo70) obj, (xkk1) obj2, (qxc0) obj3, (qxc0) obj4);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                ((Number) obj3).intValue();
                return new m0m0((r6h1) obj4);
            default:
                return null;
        }
    }
}
