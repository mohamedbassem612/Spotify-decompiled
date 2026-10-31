package p;

import com.spotify.esperanto.esperanto.Transport;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.puffin_esperanto.proto.PuffinLibraryVersionResponseOuterClass;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c4x0 implements Function, wv91, Init, efg, s2i1, uga1, av30, ya {
    public final /* synthetic */ byte a;
    public static final c4x0 b = new c4x0(0);
    public static final c4x0 c = new c4x0(1);
    public static final c4x0 d = new c4x0(2);
    public static final c4x0 e = new c4x0(3);
    public static final c4x0 f = new c4x0(4);
    public static final c4x0 g = new c4x0(5);
    public static final c4x0 h = new c4x0(6);
    public static final c4x0 i = new c4x0(7);
    public static final c4x0 t = new c4x0(8);
    public static final c4x0 X = new c4x0(9);
    public static final c4x0 Y = new c4x0(10);
    public static final c4x0 Z = new c4x0(11);
    public static final c4x0 N0 = new c4x0(12);
    public static final c4x0 O0 = new c4x0(13);
    public static final c4x0 P0 = new c4x0(14);
    public static final c4x0 Q0 = new c4x0(15);
    public static final c4x0 R0 = new c4x0(16);
    public static final c4x0 S0 = new c4x0(17);
    public static final c4x0 T0 = new c4x0(18);
    public static final c4x0 U0 = new c4x0(19);
    public static final c4x0 V0 = new c4x0(20);
    public static final c4x0 W0 = new c4x0(21);
    public static final c4x0 X0 = new c4x0(22);
    public static final c4x0 Y0 = new c4x0(23);
    public static final c4x0 Z0 = new c4x0(24);
    public static final c4x0 a1 = new c4x0(25);
    public static final c4x0 b1 = new c4x0(26);

    public /* synthetic */ c4x0(byte b2) {
        this.a = b2;
    }

    public /* bridge */ int A(wod wodVar) {
        return d0p1.u(wodVar);
    }

    public int B(c0h1 c0h1Var) {
        if (c0h1Var instanceof qh31) {
            return d0p1.m((e8b0) c0h1Var);
        }
        if (c0h1Var instanceof x26) {
            return ((x26) c0h1Var).size();
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(c0h1Var);
        nkx0.r(rc11.a.b(c0h1Var.getClass()), sb);
        return 0;
    }

    public /* bridge */ qx81 C(a8b0 a8b0Var) {
        return d0p1.r(a8b0Var);
    }

    public /* bridge */ boolean D(i0h1 i0h1Var) {
        return d0p1.J(i0h1Var);
    }

    public e8b0 E(e8b0 e8b0Var) {
        return d0p1.b0(e8b0Var);
    }

    public boolean F(e8b0 e8b0Var) {
        return !u890.j(d0p1.n0(X(e8b0Var)), d0p1.n0(O(e8b0Var)));
    }

    public i0h1 G(e8b0 e8b0Var) {
        qh31 qh31VarR = d0p1.r(e8b0Var);
        if (qh31VarR == null) {
            qh31VarR = X(e8b0Var);
        }
        return d0p1.n0(qh31VarR);
    }

    public /* bridge */ c0h1 H(qh31 qh31Var) {
        return d0p1.n(qh31Var);
    }

    public boolean I(e8b0 e8b0Var) {
        qx81 qx81VarR = d0p1.r(e8b0Var);
        return (qx81VarR != null ? d0p1.p(qx81VarR) : null) != null;
    }

    public /* bridge */ boolean J(d0h1 d0h1Var) {
        return d0p1.V(d0h1Var);
    }

    public boolean K(qh31 qh31Var) {
        return d0p1.p(qh31Var) != null;
    }

    public /* bridge */ gq20 L(e8b0 e8b0Var) {
        return d0p1.q(e8b0Var);
    }

    public /* bridge */ vod M(wod wodVar) {
        return d0p1.m0(wodVar);
    }

    public e8b0 N(e8b0 e8b0Var) {
        qx81 qx81VarQ0;
        qx81 qx81VarR = d0p1.r(e8b0Var);
        return (qx81VarR == null || (qx81VarQ0 = d0p1.q0(qx81VarR, true)) == null) ? e8b0Var : qx81VarQ0;
    }

    public qh31 O(e8b0 e8b0Var) {
        qx81 qx81VarO0;
        dq20 dq20VarQ = d0p1.q(e8b0Var);
        if (dq20VarQ != null && (qx81VarO0 = d0p1.o0(dq20VarQ)) != null) {
            return qx81VarO0;
        }
        qx81 qx81VarR = d0p1.r(e8b0Var);
        qx81VarR.getClass();
        return qx81VarR;
    }

    public boolean P(e8b0 e8b0Var) {
        return d0p1.Q(X(e8b0Var)) != d0p1.Q(O(e8b0Var));
    }

    public /* bridge */ boolean Q(wod wodVar) {
        return d0p1.U(wodVar);
    }

    public /* bridge */ int R(i0h1 i0h1Var) {
        return d0p1.d0(i0h1Var);
    }

    public /* bridge */ wod S(sx81 sx81Var) {
        return d0p1.o(this, sx81Var);
    }

    public void T(e8b0 e8b0Var) {
        d0p1.q(e8b0Var);
    }

    public /* bridge */ qh31 U(qh31 qh31Var, boolean z) {
        return d0p1.q0(qh31Var, false);
    }

    public /* bridge */ int V(d0h1 d0h1Var) {
        return d0p1.E(d0h1Var);
    }

    public /* bridge */ boolean W(i0h1 i0h1Var, i0h1 i0h1Var2) {
        return d0p1.l(i0h1Var, i0h1Var2);
    }

    public qh31 X(e8b0 e8b0Var) {
        qx81 qx81VarZ;
        dq20 dq20VarQ = d0p1.q(e8b0Var);
        if (dq20VarQ != null && (qx81VarZ = d0p1.Z(dq20VarQ)) != null) {
            return qx81VarZ;
        }
        qx81 qx81VarR = d0p1.r(e8b0Var);
        qx81VarR.getClass();
        return qx81VarR;
    }

    public /* bridge */ boolean Y(i0h1 i0h1Var) {
        return d0p1.L(i0h1Var);
    }

    public /* bridge */ qh31 Z(qh31 qh31Var) {
        return d0p1.t(qh31Var);
    }

    public wod a(qh31 qh31Var) {
        qx81 qx81Var;
        g4t g4tVarP = d0p1.p(qh31Var);
        if (g4tVarP == null || (qx81Var = g4tVarP.b) == null) {
            qx81Var = (sx81) qh31Var;
        }
        return d0p1.o(this, qx81Var);
    }

    public boolean a0(e8b0 e8b0Var) {
        return e8b0Var instanceof zgo0;
    }

    public boolean accept(Object obj) {
        return ((ksk) obj).c == le30.f;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return Boolean.FALSE;
            case 1:
                return Integer.valueOf(((PuffinLibraryVersionResponseOuterClass.PuffinLibraryVersionResponse) obj).n());
            case 2:
                return d8z0.a;
            case 3:
                return new uxo0((n701) obj);
            case 4:
            case 6:
            case 12:
            case 14:
            case 15:
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
            default:
                prm1 prm1Var = (prm1) ((Map) prm1.g.getValue()).get((String) obj);
                if (prm1Var == null) {
                    prm1Var = prm1.i;
                }
                return prm1Var.c;
            case 5:
                return ((mlv0) ((ln41) obj).a).f().a.getResolveClient();
            case 7:
                ly21 ly21Var = (py21) obj;
                if (ly21Var instanceof ly21) {
                    return Completable.j(new Throwable(ly21Var.a.b()));
                }
                if (ly21Var instanceof oy21) {
                    return CompletableEmpty.a;
                }
                eg.o();
                return null;
            case 8:
                return new e331(new m231(new Exception("")));
            case 9:
                return Boolean.TRUE;
            case 10:
                Boolean bool = (Boolean) ((cma1) obj).a;
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            case 11:
                return new rp81((gxw) obj);
            case 13:
                return Boolean.valueOf(y7y0.L((Map) obj));
            case 16:
                return new t4c1(((ec31) obj).a, 0);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return (Boolean) obj;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return ((a5g1) obj).a.b;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                String message = ((Throwable) obj).getMessage();
                return new w7z0(message != null ? message : "");
            case 22:
                return rih1.a;
            case 23:
                return (Transport) ((spq0) obj).b();
        }
    }

    public /* bridge */ int b(a1h1 a1h1Var) {
        return d0p1.F(a1h1Var);
    }

    public /* bridge */ boolean b0(i0h1 i0h1Var) {
        return d0p1.O(i0h1Var);
    }

    public /* bridge */ d0h1 c(vod vodVar) {
        return d0p1.f0(vodVar);
    }

    public /* bridge */ e8b0 c0(e8b0 e8b0Var) {
        return d0p1.p0(this, e8b0Var);
    }

    public boolean d(wod wodVar) {
        return wodVar instanceof qod;
    }

    public /* bridge */ boolean d0(qh31 qh31Var, qh31 qh31Var2) {
        return d0p1.H(qh31Var, qh31Var2);
    }

    public g6b0 e() {
        throw new UnsupportedOperationException("Not supported");
    }

    public First e0(Object obj) {
        switch (this.a) {
            case 6:
                return First.b((n531) obj);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return First.b((x1j1) obj);
            default:
                return First.b((hx3) obj);
        }
    }

    public /* bridge */ qh31 f(gq20 gq20Var) {
        return d0p1.Z(gq20Var);
    }

    public /* bridge */ int f0(e8b0 e8b0Var) {
        return d0p1.m(e8b0Var);
    }

    public /* bridge */ qh31 g(gq20 gq20Var) {
        return d0p1.o0(gq20Var);
    }

    public /* bridge */ void g0(qh31 qh31Var) {
        d0p1.W(qh31Var);
    }

    public /* bridge */ Collection h(qh31 qh31Var) {
        return d0p1.e0(this, qh31Var);
    }

    public /* bridge */ a1h1 h0(i0h1 i0h1Var, int i2) {
        return d0p1.z(i0h1Var, i2);
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        switch (this.a) {
            case 14:
                return new l0a1(xkg0Var, str2, str);
            default:
                return new uwd1(str2, str, xkg0Var);
        }
    }

    public /* bridge */ gmh1 i0(sx81 sx81Var, sx81 sx81Var2) {
        return d0p1.v(this, sx81Var, sx81Var2);
    }

    public /* bridge */ ltn1 j(qh31 qh31Var) {
        return d0p1.j0(this, qh31Var);
    }

    public /* bridge */ qh31 j0(e8b0 e8b0Var) {
        return d0p1.r(e8b0Var);
    }

    public /* bridge */ boolean k(qh31 qh31Var) {
        return d0p1.M(qh31Var);
    }

    public boolean k0(qh31 qh31Var) {
        return d0p1.R(G(qh31Var)) && !d0p1.S(qh31Var);
    }

    public boolean l(qh31 qh31Var) {
        return d0p1.O(d0p1.n0(qh31Var));
    }

    public boolean l0(qh31 qh31Var) {
        return d0p1.J(d0p1.n0(qh31Var));
    }

    public /* bridge */ d0h1 m(e8b0 e8b0Var) {
        return d0p1.s(e8b0Var);
    }

    public /* bridge */ d0h1 m0(e8b0 e8b0Var, int i2) {
        return d0p1.x(e8b0Var, i2);
    }

    public /* bridge */ e8b0 n(d0h1 d0h1Var) {
        return d0p1.C(this, d0h1Var);
    }

    public /* bridge */ boolean n0(a1h1 a1h1Var, i0h1 i0h1Var) {
        return d0p1.G(a1h1Var, i0h1Var);
    }

    public boolean o(qh31 qh31Var) {
        qx81 qx81VarR = d0p1.r(qh31Var);
        return (qx81VarR != null ? a(qx81VarR) : null) != null;
    }

    public /* bridge */ boolean o0(i0h1 i0h1Var) {
        return d0p1.I(i0h1Var);
    }

    public /* bridge */ Collection p(i0h1 i0h1Var) {
        return d0p1.k0(i0h1Var);
    }

    public /* bridge */ void p0(qh31 qh31Var) {
        d0p1.X(qh31Var);
    }

    public /* bridge */ i0h1 q(qh31 qh31Var) {
        return d0p1.n0(qh31Var);
    }

    public d0h1 q0(c0h1 c0h1Var, int i2) {
        if (c0h1Var instanceof sx81) {
            return d0p1.x((e8b0) c0h1Var, i2);
        }
        if (c0h1Var instanceof x26) {
            return (d0h1) ((x26) c0h1Var).get(i2);
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(c0h1Var);
        nkx0.r(rc11.a.b(c0h1Var.getClass()), sb);
        return null;
    }

    public d0h1 r(qh31 qh31Var, int i2) {
        if (i2 < 0 || i2 >= d0p1.m(qh31Var)) {
            return null;
        }
        return d0p1.x(qh31Var, i2);
    }

    public teb r0() {
        return c0p1.k(false, this, (f8b0) null, 24);
    }

    public /* bridge */ qx81 s(qh31 qh31Var) {
        return d0p1.q0(qh31Var, true);
    }

    public /* bridge */ boolean t(e8b0 e8b0Var) {
        return d0p1.Q(e8b0Var);
    }

    public String toString() {
        switch (this.a) {
            case 4:
                return "ReferentialEqualityPolicy";
            default:
                return super.toString();
        }
    }

    public /* bridge */ boolean u(i0h1 i0h1Var) {
        return d0p1.K(i0h1Var);
    }

    public e8b0 v(ArrayList arrayList) {
        return sok.w(arrayList);
    }

    public /* bridge */ boolean w(i0h1 i0h1Var) {
        return d0p1.P(i0h1Var);
    }

    public boolean x(Object obj, Object obj2) {
        return obj == obj2;
    }

    public /* bridge */ boolean y(i0h1 i0h1Var) {
        return d0p1.R(i0h1Var);
    }

    public /* bridge */ e8b0 z(wod wodVar) {
        return d0p1.a0(wodVar);
    }

    /* JADX INFO: renamed from: f, reason: collision with other method in class */
    public /* bridge */ qx81 m246f(gq20 gq20Var) {
        return d0p1.Z(gq20Var);
    }

    /* JADX INFO: renamed from: g, reason: collision with other method in class */
    public /* bridge */ qx81 m247g(gq20 gq20Var) {
        return d0p1.o0(gq20Var);
    }
}
