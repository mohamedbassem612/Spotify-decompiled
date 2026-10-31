package p;

import java.lang.reflect.Array;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rgt extends b7 {
    public static final /* synthetic */ mma0[] f = {new cey0(rgt.class, "classifier", "getClassifier()Lkotlin/reflect/KClassifier;", 0), new cey0(rgt.class, "arguments", "getArguments()Ljava/util/List;", 0)};
    public final a8b0 b;
    public final boolean c;
    public final mc11 d;
    public final mc11 e;

    public rgt(a8b0 a8b0Var, Function0 function0, boolean z) {
        super(function0);
        this.b = a8b0Var;
        this.c = z;
        this.d = jhc1.A((jyc) null, new pgt(this, (byte) 0));
        this.e = jhc1.A((jyc) null, new na((Object) this, (Object) function0, (byte) 10));
    }

    @Override // p.b7
    public final b7 A(boolean z) {
        a8b0 a8b0Var = this.b;
        return ((a8b0Var.w0() instanceof dq20) || a8b0Var.u0() != z) ? new rgt(o1h1.g(a8b0Var, z)) : this;
    }

    @Override // p.b7
    public final b7 B() {
        gmh1 gmh1VarW0 = this.b.w0();
        if (gmh1VarW0 instanceof dq20) {
            return new rgt(((dq20) gmh1VarW0).c);
        }
        return null;
    }

    public final jla0 C(a8b0 a8b0Var) {
        bla0 bla0VarW;
        bla0 bla0VarW2;
        a8b0 a8b0VarB;
        if (this.c) {
            jfg jfgVarS = a8b0Var.t0().s();
            ego0 ego0Var = jfgVarS instanceof ego0 ? (ego0) jfgVarS : null;
            if (ego0Var != null) {
                return new pma0(kht.g(ego0Var));
            }
        }
        jfg jfgVarS2 = a8b0Var.t0().s();
        if (jfgVarS2 instanceof beg) {
            Class clsP = bpi1.p((beg) jfgVarS2);
            if (clsP != null) {
                if (!g6b0.z(a8b0Var)) {
                    if (o1h1.e(a8b0Var)) {
                        return new bla0(clsP);
                    }
                    Class cls = (Class) bb11.b.get(clsP);
                    if (cls != null) {
                        clsP = cls;
                    }
                    return new bla0(clsP);
                }
                e1h1 e1h1Var = (e1h1) o7h.X0(a8b0Var.r0());
                if (e1h1Var == null || (a8b0VarB = e1h1Var.b()) == null) {
                    return new bla0(clsP);
                }
                jla0 jla0VarC = C(o1h1.g(a8b0VarB, true));
                if (jla0VarC != null) {
                    return new bla0(Array.newInstance((Class<?>) j2h1.t(jhc1.r(jla0VarC)), 0).getClass());
                }
                mna0.d(this, "Cannot determine classifier for array element type: ");
                return null;
            }
        } else if (jfgVarS2 instanceof y0h1) {
            y0h1 y0h1Var = (y0h1) jfgVarS2;
            n9r n9rVarK = y0h1Var.k();
            if (n9rVarK instanceof beg) {
                bla0VarW2 = zpn1.w((beg) n9rVarK);
            } else if (n9rVarK instanceof jyc) {
                n9r n9rVarK2 = ((jyc) n9rVarK).k();
                if (n9rVarK2 instanceof beg) {
                    bla0VarW = zpn1.w((beg) n9rVarK2);
                } else {
                    ait aitVar = n9rVarK instanceof ait ? (ait) n9rVarK : null;
                    if (aitVar == null) {
                        mna0.d(n9rVarK, "Non-class callable descriptor must be deserialized: ");
                        return null;
                    }
                    xht xhtVarH = aitVar.H();
                    if (xhtVarH instanceof lja0) {
                        jc11 jc11Var = ((lja0) xhtVarH).c;
                        jc11 jc11Var2 = jc11Var != null ? jc11Var : null;
                        if (jc11Var2 == null) {
                            ofr.i("Container of top-level deserialized member is not resolved: ", aitVar, " (", jc11Var);
                            return null;
                        }
                        bla0VarW = (ema0) rc11.a.c(jc11Var2.a);
                    } else if (xhtVarH instanceof ide0) {
                        bla0VarW = ((ide0) xhtVarH).a;
                    } else {
                        if (!(xhtVarH instanceof oc11)) {
                            mna0.d(aitVar, "Container of deserialized member is not resolved: ");
                            return null;
                        }
                        bla0VarW = m6x.b;
                    }
                }
                Object objR = n9rVarK.r(new oql(bla0VarW), rih1.a);
                objR.getClass();
                bla0VarW2 = (rma0) objR;
            } else {
                mna0.d(n9rVarK, "Unknown type parameter container: ");
            }
            return new qma0(bla0VarW2, y0h1Var);
        }
        return null;
    }

    public final a8b0 D() {
        return this.b;
    }

    @Override // p.b7
    public final oma0 e() {
        gmh1 gmh1VarW0 = this.b.w0();
        x xVar = gmh1VarW0 instanceof x ? (x) gmh1VarW0 : null;
        qx81 qx81Var = xVar != null ? xVar.c : null;
        if (qx81Var != null) {
            return new rgt(qx81Var, this.a, true);
        }
        return null;
    }

    @Override // p.b7
    public final boolean equals(Object obj) {
        if (!oed1.a) {
            return super.equals(obj);
        }
        if (!(obj instanceof rgt)) {
            return false;
        }
        rgt rgtVar = (rgt) obj;
        return u890.j(this.b, rgtVar.b) && u890.j(k(), rgtVar.k()) && v().equals(rgtVar.v());
    }

    public final List getAnnotations() {
        return bpi1.d(this.b);
    }

    @Override // p.b7
    public final int hashCode() {
        if (!oed1.a) {
            return super.hashCode();
        }
        int iHashCode = this.b.hashCode() * 31;
        jla0 jla0VarK = k();
        return v().hashCode() + ((iHashCode + (jla0VarK != null ? jla0VarK.hashCode() : 0)) * 31);
    }

    @Override // p.oma0
    public final boolean i() {
        return this.b.u0();
    }

    @Override // p.oma0
    public final jla0 k() {
        mma0 mma0Var = f[0];
        return (jla0) this.d.invoke();
    }

    @Override // p.b7
    public final tka0 n() {
        jfg jfgVarS = this.b.t0().s();
        beg begVar = jfgVarS instanceof beg ? (beg) jfgVarS : null;
        if (begVar != null) {
            String str = j8a0.a;
            if (j8a0.j.containsKey(iht.f(begVar))) {
                return oed1.a ? new ucn0(k(), kht.g(begVar).a.a, new qgt(begVar, (byte) 0), new qgt(begVar, (byte) 1)) : w6d1.n(kht.g(begVar), k());
            }
        }
        return null;
    }

    @Override // p.b7
    public final boolean s() {
        return this.b.w0() instanceof g4t;
    }

    @Override // p.b7
    public final boolean t() {
        a8b0 a8b0Var = this.b;
        if (a8b0Var != null) {
            ajn0 ajn0Var = g6b0.e;
            return g6b0.B(a8b0Var, rfb1.b);
        }
        g6b0.a(138);
        throw null;
    }

    @Override // p.oma0
    public final List v() {
        mma0 mma0Var = f[1];
        return (List) this.e.invoke();
    }

    @Override // p.b7
    public final boolean w() {
        return this.b instanceof nwz0;
    }

    @Override // p.b7
    public final boolean x() {
        jfg jfgVarS = this.b.t0().s();
        yv30 yv30VarA = null;
        if (jfgVarS != null && (jfgVarS instanceof beg) && g6b0.K(jfgVarS)) {
            int i = kht.a;
            yv30VarA = kbb.A(iht.f(jfgVarS));
        }
        return u890.j(yv30VarA, xv30.d);
    }

    @Override // p.b7
    public final b7 y() {
        gmh1 gmh1VarW0 = this.b.w0();
        if (gmh1VarW0 instanceof dq20) {
            return new rgt(((dq20) gmh1VarW0).b);
        }
        return null;
    }

    @Override // p.b7
    public final b7 z(boolean z) {
        a8b0 a8b0VarP;
        a8b0 a8b0Var = this.b;
        if (z) {
            a8b0VarP = l7c.p(a8b0Var.w0(), true);
            if (a8b0VarP == null) {
                return this;
            }
        } else {
            g4t g4tVar = a8b0Var instanceof g4t ? (g4t) a8b0Var : null;
            if (g4tVar == null || (a8b0VarP = g4tVar.b) == null) {
                return this;
            }
        }
        return new rgt(a8b0VarP);
    }

    public rgt(a8b0 a8b0Var) {
        this(a8b0Var, null, false);
    }

    public rgt(a8b0 a8b0Var, Function0 function0) {
        this(a8b0Var, function0, false);
    }
}
