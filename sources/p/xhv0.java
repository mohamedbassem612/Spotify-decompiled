package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xhv0 implements o1i {
    public final oj3 a;
    public final g7h b;
    public final lik1 c;
    public final bcl1 d;
    public final lzn0 e;
    public final bbm f;
    public final abm g;
    public final i8h1 h;
    public final o241 i;
    public final uu00 j;
    public final yp10 k;
    public final qzh l;

    public xhv0(hjc hjcVar, oj3 oj3Var, g7h g7hVar, lik1 lik1Var, bcl1 bcl1Var, lzn0 lzn0Var, bbm bbmVar, abm abmVar, i8h1 i8h1Var, o241 o241Var, uu00 uu00Var, yp10 yp10Var) {
        this.a = oj3Var;
        this.b = g7hVar;
        this.c = lik1Var;
        this.d = bcl1Var;
        this.e = lzn0Var;
        this.f = bbmVar;
        this.g = abmVar;
        this.h = i8h1Var;
        this.i = o241Var;
        this.j = uu00Var;
        this.k = yp10Var;
        this.l = hjcVar.a(null);
    }

    public final x0i b(z0i z0iVar, o0i o0iVar) {
        vhv0 vhv0Var = (vhv0) z0iVar;
        return new x0i(new w0i(o0iVar.e, "prerelease_card", vhv0Var.a, vhv0Var.i));
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void a(vhv0 vhv0Var, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        Observable observableCombineLatest;
        boolean z;
        String str = vhv0Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-247963514);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(vhv0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(o0iVar) : x340Var.i(o0iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            ezc ezcVarG = yoi1.g(g7h.d(this.b, "", new String[]{str}).map(new t4o(str, (byte) 7)).onErrorComplete().distinctUntilChanged());
            Boolean bool = Boolean.FALSE;
            ven0 ven0VarG = rwq.g(ezcVarG, bool, (o8n) null, x340Var, 48, 2);
            if (this.g.a()) {
                observableCombineLatest = Observable.combineLatest(this.i.a.map(dj10.c1).distinctUntilChanged(), this.j.b(new oi("prerelease-card", false, new zqu0(str, (byte) 9))).map(new acn1(str, (byte) 10)).distinctUntilChanged(), fj10.c1);
            } else {
                observableCombineLatest = Observable.just(bool);
            }
            ven0 ven0VarG2 = rwq.g(yoi1.g(observableCombineLatest), bool, (o8n) null, x340Var, 48, 2);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                z = false;
                objT = yv91.a(new odp0(vhv0Var, this, ven0VarG2, ven0VarG, (byte) 8));
                x340Var.s0(objT);
            } else {
                z = false;
            }
            tob1 tob1Var = (tob1) objT;
            boolean zI = x340Var.i(this);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new n5u0(this, (byte) 23);
                x340Var.s0(objT2);
            }
            iu30 iu30Var = (iu30) objT2;
            boolean zI2 = x340Var.i(this) | (((i2 & 112) == 32 || ((i2 & 64) != 0 && x340Var.i(o0iVar))) ? true : z);
            if ((i2 & 14) == 4) {
                z = true;
            }
            boolean z2 = zI2 | z;
            Object objT3 = x340Var.T();
            if (z2 || objT3 == m4cVar) {
                vvu0 vvu0Var = new vvu0(this, tob1Var, o0iVar, vhv0Var, (byte) 2);
                x340Var.s0(vvu0Var);
                objT3 = vvu0Var;
            }
            dm5.a(iu30Var, qim0Var, (iu30) objT3, x340Var, (i2 >> 3) & 112, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lzs0(i, this, vhv0Var, o0iVar, qim0Var, (byte) 7);
        }
    }

    public final tv80 d(o0i o0iVar, String str, boolean z) {
        return bcl1.f(this.d, o0iVar.e, "prerelease_card", str, (String) null, new cl1(z, str, (byte) 25), 8);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0088  */
    /* JADX WARN: Code duplicated, block: B:40:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x009c  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object e(o0i o0iVar, String str, boolean z, onm onmVar) {
        whv0 whv0Var;
        tv80 tv80VarD;
        o0i o0iVar2;
        nj3 m231Var;
        String str2;
        boolean z2;
        nj3 nj3Var;
        boolean zJ;
        yp10 yp10Var;
        String str3 = str;
        if (onmVar instanceof whv0) {
            whv0Var = (whv0) onmVar;
            int i = whv0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                whv0Var.f = i - Integer.MIN_VALUE;
            } else {
                whv0Var = new whv0(this, onmVar);
            }
        } else {
            whv0Var = new whv0(this, onmVar);
        }
        Object objJ = whv0Var.d;
        int i2 = whv0Var.f;
        if (i2 == 0) {
            hm5.M(objJ);
            tv80VarD = !z ? d(o0iVar, str3, true) : null;
            try {
                Single singleC = this.a.c(Collections.singletonList(str3), this.c.a, "", z, new gj3(27, tv80VarD));
                whv0Var.a = o0iVar;
                whv0Var.b = str3;
                whv0Var.c = tv80VarD;
                whv0Var.f = 1;
                objJ = fc11.j(singleC, whv0Var);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
                o0iVar2 = o0iVar;
                m231Var = (nj3) objJ;
            } catch (Throwable th) {
                th = th;
                o0iVar2 = o0iVar;
                m231Var = new m231(th);
                str2 = str3;
                z2 = m231Var instanceof m231;
                if (!z2) {
                    if (z2) {
                        m231Var = null;
                    }
                    nj3Var = m231Var;
                    zJ = u890.j(nj3Var, new kj3((dsa0) null));
                    yp10Var = this.k;
                    if (zJ) {
                        if (tv80VarD == null) {
                            d(o0iVar2, str2, true);
                        }
                        yp10Var.a(2, Collections.singletonMap("itemUri", str2));
                    } else if (u890.j(nj3Var, new lj3((dsa0) null))) {
                        d(o0iVar2, str2, false);
                        yp10Var.a(3, Collections.singletonMap("itemUri", str2));
                    } else if (u890.j(nj3Var, new mj3())) {
                        bcl1.f(this.d, o0iVar2.e, "prerelease_card", str2, (String) null, o5v0.b1, 8);
                    }
                }
                return rih1.a;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tv80 tv80Var = whv0Var.c;
            str3 = whv0Var.b;
            o0i o0iVar3 = whv0Var.a;
            try {
                hm5.M(objJ);
                tv80VarD = tv80Var;
                o0iVar2 = o0iVar3;
                try {
                    m231Var = (nj3) objJ;
                } catch (Throwable th2) {
                    th = th2;
                    m231Var = new m231(th);
                }
            } catch (Throwable th3) {
                th = th3;
                tv80VarD = tv80Var;
                o0iVar2 = o0iVar3;
                m231Var = new m231(th);
                str2 = str3;
                z2 = m231Var instanceof m231;
                if (!z2) {
                    if (z2) {
                        m231Var = null;
                    }
                    nj3Var = m231Var;
                    zJ = u890.j(nj3Var, new kj3((dsa0) null));
                    yp10Var = this.k;
                    if (zJ) {
                        if (tv80VarD == null) {
                            d(o0iVar2, str2, true);
                        }
                        yp10Var.a(2, Collections.singletonMap("itemUri", str2));
                    } else if (u890.j(nj3Var, new lj3((dsa0) null))) {
                        d(o0iVar2, str2, false);
                        yp10Var.a(3, Collections.singletonMap("itemUri", str2));
                    } else if (u890.j(nj3Var, new mj3())) {
                        bcl1.f(this.d, o0iVar2.e, "prerelease_card", str2, (String) null, o5v0.b1, 8);
                    }
                }
                return rih1.a;
            }
        }
        str2 = str3;
        z2 = m231Var instanceof m231;
        if (!z2) {
            if (z2) {
                m231Var = null;
            }
            nj3Var = m231Var;
            zJ = u890.j(nj3Var, new kj3((dsa0) null));
            yp10Var = this.k;
            if (zJ) {
                if (tv80VarD == null) {
                    d(o0iVar2, str2, true);
                }
                yp10Var.a(2, Collections.singletonMap("itemUri", str2));
            } else if (u890.j(nj3Var, new lj3((dsa0) null))) {
                d(o0iVar2, str2, false);
                yp10Var.a(3, Collections.singletonMap("itemUri", str2));
            } else if (u890.j(nj3Var, new mj3())) {
                bcl1.f(this.d, o0iVar2.e, "prerelease_card", str2, (String) null, o5v0.b1, 8);
            }
        }
        return rih1.a;
    }
}
