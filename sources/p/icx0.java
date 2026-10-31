package p;

import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.LinkedHashMap;
import java.util.Set;
import spotify.your_library.esperanto.proto.PinResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class icx0 implements Function, Init, t2n, com.spotify.mobius.functions.Function, BiFunction, BiPredicate, Predicate, s2i1, y190 {
    public final /* synthetic */ byte a;
    public static final icx0 b = new icx0(0);
    public static final icx0 c = new icx0(1);
    public static final icx0 d = new icx0(2);
    public static final icx0 e = new icx0(3);
    public static final icx0 f = new icx0(4);
    public static final icx0 g = new icx0(5);
    public static final icx0 h = new icx0(7);
    public static final icx0 i = new icx0(8);
    public static final icx0 t = new icx0(9);
    public static final icx0 X = new icx0(10);
    public static final icx0 Y = new icx0(11);
    public static final icx0 Z = new icx0(12);
    public static final icx0 N0 = new icx0(13);
    public static final icx0 O0 = new icx0(14);
    public static final icx0 P0 = new icx0(15);
    public static final icx0 Q0 = new icx0(16);
    public static final icx0 R0 = new icx0(17);
    public static final icx0 S0 = new icx0(18);
    public static final icx0 T0 = new icx0(19);
    public static final icx0 U0 = new icx0(20);
    public static final icx0 V0 = new icx0(21);
    public static final icx0 W0 = new icx0(22);
    public static final icx0 X0 = new icx0(23);
    public static final icx0 Y0 = new icx0(24);
    public static final icx0 Z0 = new icx0(25);
    public static final icx0 a1 = new icx0(26);

    public /* synthetic */ icx0(byte b2) {
        this.a = b2;
    }

    public static bw31 a(hi90 hi90Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, sfu0 sfu0Var) {
        if (hi90Var instanceof vh90) {
            return new rv31((vh90) hi90Var);
        }
        boolean z8 = false;
        if (hi90Var instanceof bh90) {
            bh90 bh90Var = (bh90) hi90Var;
            boolean z9 = bh90Var.d;
            if (z3 && bh90Var.e) {
                z8 = true;
            }
            return new wu31(bh90Var, z8, z9);
        }
        if (hi90Var instanceof oh90) {
            return new iv31((oh90) hi90Var);
        }
        if (hi90Var instanceof ch90) {
            ch90 ch90Var = (ch90) hi90Var;
            return new xu31(ch90Var, ch90Var.d);
        }
        if (hi90Var instanceof yh90) {
            yh90 yh90Var = (yh90) hi90Var;
            boolean z10 = yh90Var.h;
            boolean z11 = yh90Var.g;
            boolean z12 = yh90Var.Y;
            boolean z13 = yh90Var.t;
            return new wv31(yh90Var, ((z5 && z10) || (z4 && z11 && !z12) || z13) ? false : true, z7 && z11 && !((!z4 && !z6) || z13 || z12 || (z10 && z5)), z2, z3 && yh90Var.i, (z6 && z11 && !z12) || z13 != 0, b(sfu0Var, yh90Var.f), z ? 1 : 2);
        }
        if (!(hi90Var instanceof jh90)) {
            if (!(hi90Var instanceof eh90)) {
                eg.o();
                return null;
            }
            eh90 eh90Var = (eh90) hi90Var;
            return new yu31(eh90Var, (z4 && eh90Var.h) ? false : true, b(sfu0Var, eh90Var.f), z ? 1 : 2);
        }
        jh90 jh90Var = (jh90) hi90Var;
        int i2 = z ? 1 : 2;
        nv31 nv31VarB = b(sfu0Var, jh90Var.e);
        if ((!z5 || !jh90Var.h) && (!z4 || !jh90Var.g)) {
            z8 = true;
        }
        return new bv31(jh90Var, z8, nv31VarB, i2);
    }

    public static nv31 b(sfu0 sfu0Var, String str) {
        if (str.length() == 0) {
            return kv31.a;
        }
        boolean z = sfu0Var instanceof kfu0;
        lv31 lv31Var = lv31.a;
        if (z) {
            kfu0 kfu0Var = (kfu0) sfu0Var;
            if (str.equals(kfu0Var.a)) {
                return new mv31(kfu0Var.b, 0.0f);
            }
        } else if (sfu0Var instanceof rfu0) {
            rfu0 rfu0Var = (rfu0) sfu0Var;
            if (u890.j(rfu0Var.a, str)) {
                return new mv31(rfu0Var.b, rfu0Var.c);
            }
        } else if (!(sfu0Var instanceof ofu0) && (sfu0Var instanceof lfu0) && u890.j(((lfu0) sfu0Var).a, str)) {
            return jv31.a;
        }
        return lv31Var;
    }

    public Object apply(Object obj) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean boolValueOf;
        boolean zBooleanValue = false;
        switch (this.a) {
            case 0:
                return (eww0) ((spq0) obj).b();
            case 1:
                return crn0.a;
            case 2:
                rgz0 rgz0Var = (rgz0) obj;
                String str = rgz0Var.a;
                String str2 = rgz0Var.b;
                String str3 = rgz0Var.c;
                String str4 = rgz0Var.d;
                Long l = rgz0Var.e;
                j2u0 j2u0Var = rgz0Var.f;
                boolean zBooleanValue2 = (j2u0Var == null || (bool3 = j2u0Var.a) == null) ? false : bool3.booleanValue();
                boolean zBooleanValue3 = (j2u0Var == null || (bool2 = j2u0Var.b) == null) ? false : bool2.booleanValue();
                if (j2u0Var != null && (bool = j2u0Var.c) != null) {
                    zBooleanValue = bool.booleanValue();
                }
                return new qy01(new tx01(str, str2, str3, str4, l, zBooleanValue2, zBooleanValue3, zBooleanValue, rgz0Var.g));
            case 3:
                return new v810(((Boolean) obj).booleanValue());
            case 4:
                return (fvf1) ((mmr0) obj).a;
            case 5:
            case 6:
            case 7:
            case 12:
            case 13:
            case 19:
            case 23:
            default:
                PlayerState playerState = (PlayerState) obj;
                if (playerState.track().c() && l4o1.P((ContextTrack) playerState.track().b())) {
                    zBooleanValue = true;
                }
                return Boolean.valueOf(zBooleanValue);
            case 8:
                return (Long) ((spq0) obj).b();
            case 9:
                return Boolean.valueOf(((String) obj).equals("1"));
            case 10:
                oy21 oy21Var = (py21) obj;
                if (oy21Var instanceof ly21) {
                    boolValueOf = Boolean.FALSE;
                } else {
                    if (!(oy21Var instanceof oy21)) {
                        eg.o();
                        return null;
                    }
                    boolValueOf = Boolean.valueOf(((wsc0) oy21Var.a).f.w.b);
                }
                return boolValueOf;
            case 11:
                return ((tp81) obj).a;
            case 14:
                return new k3a1((String) obj);
            case 15:
                Boolean bool4 = (Boolean) ((cma1) obj).a;
                return Boolean.valueOf(bool4 != null ? bool4.booleanValue() : false);
            case 16:
                return ((Boolean) obj).booleanValue() ? new qfc1(1) : new qfc1(2);
            case 17:
                String message = ((Throwable) obj).getMessage();
                if (message == null) {
                    message = "Transport unavailable";
                }
                return new y0f1(message);
            case 18:
                return (Single) obj;
            case 20:
                n57.t("Error while trying to fetch availability state for instance share.", (Throwable) obj);
                Set set = s4b1.f;
                return new ern0(uic.x(nik1.z0.a));
            case 21:
                return Boolean.valueOf(l4o1.Y((ContextTrack) obj));
            case 22:
                return ((mrk1) obj).a;
            case 24:
                PinResponse pinResponse = (PinResponse) obj;
                int i2 = xxm1.a[pinResponse.p().ordinal()];
                if (i2 != -1) {
                    if (i2 == 1) {
                        return tum1.a;
                    }
                    if (i2 != 2) {
                        if (i2 != 3 && i2 != 4) {
                            eg.o();
                            return null;
                        }
                    } else if (pinResponse.n()) {
                        return new rum1(pinResponse.o());
                    }
                }
                return sum1.a;
        }
    }

    public First e0(Object obj) {
        return First.b((xi21) obj);
    }

    public v190 findValueByNumber(int i2) {
        return b01.a(i2);
    }

    public Object g(Object obj) {
        return Double.valueOf(((uz21) obj).f());
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        return new ghl1(xkg0Var, str2, str);
    }

    public boolean test(Object obj, Object obj2) {
        jdu0 jdu0Var = (jdu0) obj;
        jdu0 jdu0Var2 = (jdu0) obj2;
        return u890.j(jdu0Var.a, jdu0Var2.a) && u890.j(jdu0Var.c, jdu0Var2.c) && u890.j(jdu0Var.d, jdu0Var2.d);
    }

    public boolean test(Object obj) {
        wv00 wv00Var = (uv00) obj;
        return wv00Var.c() || !wv00Var.f;
    }

    public Object apply(Object obj, Object obj2) {
        return Boolean.valueOf(((Boolean) obj).booleanValue() || ((Boolean) obj2).booleanValue());
    }
}
