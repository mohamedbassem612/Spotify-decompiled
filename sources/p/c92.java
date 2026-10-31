package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class c92 extends k9 {
    public final /* synthetic */ byte c = 0;

    public c92(d92 d92Var, byte b, char c) {
        super(l4b0.class, (byte) 8);
    }

    public final Object H0(u8 u8Var) {
        switch (this.c) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                a92 a92Var = (a92) u8Var;
                x82 x82VarQ = y82.q();
                x82VarQ.d();
                ((we40) x82VarQ).b.u();
                byte[] bArrA = eqz0.a(a92Var.m());
                ghc ghcVarD = ohc.d(0, bArrA, bArrA.length);
                x82VarQ.d();
                ((we40) x82VarQ).b.s(ghcVarD);
                e92 e92VarN = a92Var.n();
                x82VarQ.d();
                ((we40) x82VarQ).b.t(e92VarN);
                return x82VarQ.a();
            case 1:
                h92 h92Var = (h92) u8Var;
                ypa0[] ypa0VarArr = {new b92(o980.class, (byte) 2)};
                HashMap map = new HashMap();
                for (ypa0 ypa0Var : ypa0VarArr) {
                    boolean zContainsKey = map.containsKey(ypa0Var.a);
                    Class cls = ypa0Var.a;
                    if (zContainsKey) {
                        hhg1.n(cy30.k(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                        return null;
                    }
                    map.put(cls, ypa0Var);
                }
                if (ypa0VarArr.length > 0) {
                    Class cls2 = ypa0VarArr[0].a;
                }
                Collections.unmodifiableMap(map);
                m92 m92VarM = h92Var.m();
                k92 k92VarQ = l92.q();
                n92 n92VarO = m92VarM.o();
                k92VarQ.d();
                ((l92) ((we40) k92VarQ).b).s(n92VarO);
                byte[] bArrA2 = eqz0.a(m92VarM.n());
                ghc ghcVarD2 = ohc.d(0, bArrA2, bArrA2.length);
                k92VarQ.d();
                ((l92) ((we40) k92VarQ).b).r(ghcVarD2);
                k92VarQ.d();
                ((l92) ((we40) k92VarQ).b).t();
                l92 l92Var = (l92) k92VarQ.a();
                ypa0[] ypa0VarArr2 = {new xl60(iuf0.class)};
                HashMap map2 = new HashMap();
                for (ypa0 ypa0Var2 : ypa0VarArr2) {
                    boolean zContainsKey2 = map2.containsKey(ypa0Var2.a);
                    Class cls3 = ypa0Var2.a;
                    if (zContainsKey2) {
                        hhg1.n(cy30.k(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                        return null;
                    }
                    map2.put(cls3, ypa0Var2);
                }
                if (ypa0VarArr2.length > 0) {
                    Class cls4 = ypa0VarArr2[0].a;
                }
                Collections.unmodifiableMap(map2);
                wl60 wl60VarN = h92Var.n();
                ul60 ul60VarR = vl60.r();
                ul60VarR.i();
                ul60VarR.h(wl60VarN.o());
                byte[] bArrA3 = eqz0.a(wl60VarN.n());
                ul60VarR.g(ohc.d(0, bArrA3, bArrA3.length));
                vl60 vl60VarA = ul60VarR.a();
                f92 f92VarQ = g92.q();
                f92VarQ.d();
                ((we40) f92VarQ).b.s(l92Var);
                f92VarQ.d();
                ((we40) f92VarQ).b.t(vl60VarA);
                f92VarQ.d();
                ((we40) f92VarQ).b.u();
                return f92VarQ.a();
            case 2:
                r92 r92Var = (r92) u8Var;
                p92 p92VarQ = q92.q();
                byte[] bArrA4 = eqz0.a(r92Var.m());
                ghc ghcVarD3 = ohc.d(0, bArrA4, bArrA4.length);
                p92VarQ.d();
                ((we40) p92VarQ).b.s(ghcVarD3);
                s92 s92VarN = r92Var.n();
                p92VarQ.d();
                ((we40) p92VarQ).b.t(s92VarN);
                p92VarQ.d();
                ((we40) p92VarQ).b.u();
                return p92VarQ.a();
            case 3:
                u92 u92VarO = v92.o();
                byte[] bArrA5 = eqz0.a(((x92) u8Var).m());
                ghc ghcVarD4 = ohc.d(0, bArrA5, bArrA5.length);
                u92VarO.d();
                ((we40) u92VarO).b.q(ghcVarD4);
                u92VarO.d();
                ((we40) u92VarO).b.r();
                return u92VarO.a();
            case 4:
                z92 z92VarP = aa2.p();
                byte[] bArrA6 = eqz0.a(((ba2) u8Var).m());
                ghc ghcVarD5 = ohc.d(0, bArrA6, bArrA6.length);
                z92VarP.d();
                ((we40) z92VarP).b.r(ghcVarD5);
                z92VarP.d();
                ((we40) z92VarP).b.s();
                return z92VarP.a();
            case 5:
                da2 da2VarO = ea2.o();
                byte[] bArrA7 = eqz0.a(((ga2) u8Var).m());
                ghc ghcVarD6 = ohc.d(0, bArrA7, bArrA7.length);
                da2VarO.d();
                ((we40) da2VarO).b.q(ghcVarD6);
                da2VarO.d();
                ((we40) da2VarO).b.r();
                return da2VarO.a();
            case 6:
                pbe pbeVarP = qbe.p();
                pbeVarP.d();
                ((we40) pbeVarP).b.s();
                byte[] bArrA8 = eqz0.a(32);
                ghc ghcVarD7 = ohc.d(0, bArrA8, bArrA8.length);
                pbeVarP.d();
                ((we40) pbeVarP).b.r(ghcVarD7);
                return pbeVarP.a();
            case 7:
                e4b0 e4b0VarP = f4b0.p();
                e4b0VarP.d();
                ((we40) e4b0VarP).b.r((g4b0) u8Var);
                e4b0VarP.d();
                ((we40) e4b0VarP).b.s();
                return e4b0VarP.a();
            case 8:
                j4b0 j4b0VarP = k4b0.p();
                j4b0VarP.d();
                ((we40) j4b0VarP).b.r((l4b0) u8Var);
                j4b0VarP.d();
                ((we40) j4b0VarP).b.s();
                return j4b0VarP.a();
            default:
                zjm1 zjm1VarP = akm1.p();
                zjm1VarP.d();
                ((we40) zjm1VarP).b.s();
                byte[] bArrA9 = eqz0.a(32);
                ghc ghcVarD8 = ohc.d(0, bArrA9, bArrA9.length);
                zjm1VarP.d();
                ((we40) zjm1VarP).b.r(ghcVarD8);
                return zjm1VarP.a();
        }
    }

    public final u8 j1(ohc ohcVar) {
        switch (this.c) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return a92.o(ohcVar, tz00.a());
            case 1:
                return h92.o(ohcVar, tz00.a());
            case 2:
                return r92.o(ohcVar, tz00.a());
            case 3:
                return x92.o(ohcVar, tz00.a());
            case 4:
                return ba2.n(ohcVar, tz00.a());
            case 5:
                return ga2.o(ohcVar, tz00.a());
            case 6:
                return rbe.m(ohcVar, tz00.a());
            case 7:
                return g4b0.o(ohcVar, tz00.a());
            case 8:
                return l4b0.p(ohcVar, tz00.a());
            default:
                return bkm1.m(ohcVar, tz00.a());
        }
    }

    public final void u1(u8 u8Var) throws InvalidAlgorithmParameterException {
        switch (this.c) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                a92 a92Var = (a92) u8Var;
                d92.c0(a92Var.n());
                if (a92Var.m() == 32) {
                    return;
                }
                k220.r("AesCmacKey size wrong, must be 32 bytes");
                return;
            case 1:
                h92 h92Var = (h92) u8Var;
                ypa0[] ypa0VarArr = {new b92(o980.class, (byte) 2)};
                HashMap map = new HashMap();
                for (ypa0 ypa0Var : ypa0VarArr) {
                    boolean zContainsKey = map.containsKey(ypa0Var.a);
                    Class cls = ypa0Var.a;
                    if (zContainsKey) {
                        hhg1.n(cy30.k(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                        return;
                    }
                    map.put(cls, ypa0Var);
                }
                if (ypa0VarArr.length > 0) {
                    Class cls2 = ypa0VarArr[0].a;
                }
                Collections.unmodifiableMap(map);
                m92 m92VarM = h92Var.m();
                gsi1.a(m92VarM.n());
                n92 n92VarO = m92VarM.o();
                if (n92VarO.n() < 12 || n92VarO.n() > 16) {
                    k220.r("invalid IV size");
                    return;
                }
                ypa0[] ypa0VarArr2 = {new xl60(iuf0.class)};
                HashMap map2 = new HashMap();
                for (ypa0 ypa0Var2 : ypa0VarArr2) {
                    boolean zContainsKey2 = map2.containsKey(ypa0Var2.a);
                    Class cls3 = ypa0Var2.a;
                    if (zContainsKey2) {
                        hhg1.n(cy30.k(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                        return;
                    }
                    map2.put(cls3, ypa0Var2);
                }
                if (ypa0VarArr2.length > 0) {
                    Class cls4 = ypa0VarArr2[0].a;
                }
                Collections.unmodifiableMap(map2);
                wl60 wl60VarN = h92Var.n();
                if (wl60VarN.n() < 16) {
                    k220.r("key too short");
                    return;
                } else {
                    zl60.Q(wl60VarN.o());
                    gsi1.a(h92Var.m().n());
                    return;
                }
            case 2:
                r92 r92Var = (r92) u8Var;
                gsi1.a(r92Var.m());
                if (r92Var.n().n() == 12 || r92Var.n().n() == 16) {
                    return;
                }
                k220.r("invalid IV size; acceptable values have 12 or 16 bytes");
                return;
            case 3:
                gsi1.a(((x92) u8Var).m());
                return;
            case 4:
                gsi1.a(((ba2) u8Var).m());
                return;
            case 5:
                ga2 ga2Var = (ga2) u8Var;
                if (ga2Var.m() == 64) {
                    return;
                }
                throw new InvalidAlgorithmParameterException("invalid key size: " + ga2Var.m() + ". Valid keys must have 64 bytes.");
            case 6:
                return;
            case 7:
                return;
            case 8:
                return;
            default:
                return;
        }
    }

    public c92(d92 d92Var, byte b, byte b2) {
        super(g4b0.class, (byte) 8);
    }

    public /* synthetic */ c92(Class cls) {
        super(cls, (byte) 8);
    }

    public c92(d92 d92Var, char c) {
        super(x92.class, (byte) 8);
    }

    public c92(d92 d92Var, byte b) {
        super(r92.class, (byte) 8);
    }

    public c92(d92 d92Var, byte b, boolean z) {
        super(rbe.class, (byte) 8);
    }

    public c92(d92 d92Var, int i) {
        super(ba2.class, (byte) 8);
    }

    public c92(d92 d92Var, short s) {
        super(ga2.class, (byte) 8);
    }

    public c92(d92 d92Var, byte b, int i) {
        super(bkm1.class, (byte) 8);
    }

    public c92(d92 d92Var) {
        super(h92.class, (byte) 8);
    }
}
