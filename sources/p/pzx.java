package p;

import io.reactivex.rxjava3.core.Single;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pzx implements shm {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public /* synthetic */ pzx(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // p.shm
    public final mr20 a(hti0 hti0Var, rzq rzqVar) {
        boolean zB;
        byte b = 28;
        lnm lnmVar = null;
        switch (this.a) {
            case 0:
                return new huz(g(hti0Var), (byte) 10);
            case 1:
                return new huz(h(hti0Var), (byte) 10);
            case 2:
                qxc0 qxc0Var = hti0Var.d;
                if (qxc0Var == null) {
                    zB = false;
                } else {
                    z6k0 z6k0Var = (z6k0) this.b;
                    Map map = qxc0Var.X;
                    z6k0Var.getClass();
                    zB = z6k0.b(map);
                }
                return !zB ? new huz((Object) null, (byte) 10) : new qsc0(((mnk0) this.c).a, this, hti0Var, (byte) 8);
            case 3:
                return new huz(i(hti0Var), (byte) 10);
            case 4:
                return hu20.e(new te1(d3p1.F(rzqVar, xko.a, hti0Var.a), b), new c6e0(lnmVar, (Object) this, (Object) hti0Var, (byte) 3));
            case 5:
                return new m441(new k1e0((Object) this, (Object) hti0Var, lnmVar, (byte) 20));
            case 6:
                return hu20.e(new te1(d3p1.F(rzqVar, xko.a, hti0Var.a), b), new c6e0(lnmVar, (Object) this, (Object) hti0Var, (byte) 18));
            case 7:
                return new huz(j(hti0Var), (byte) 10);
            default:
                return new huz(k(hti0Var), (byte) 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    @Override // p.shm
    public final Object b(hti0 hti0Var, d0r d0rVar, lnm lnmVar) {
        gyj0 gyj0Var;
        boolean zB;
        String str;
        pzx pzxVar;
        switch (this.a) {
            case 0:
                return g(hti0Var);
            case 1:
                return h(hti0Var);
            case 2:
                if (lnmVar instanceof gyj0) {
                    gyj0Var = (gyj0) lnmVar;
                    int i = gyj0Var.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        gyj0Var.e = i - Integer.MIN_VALUE;
                    } else {
                        gyj0Var = new gyj0(this, (onm) lnmVar);
                    }
                } else {
                    gyj0Var = new gyj0(this, (onm) lnmVar);
                }
                Object objI = gyj0Var.c;
                int i2 = gyj0Var.e;
                if (i2 == 0) {
                    hm5.M(objI);
                    qxc0 qxc0Var = hti0Var.d;
                    if (qxc0Var == null) {
                        zB = false;
                    } else {
                        z6k0 z6k0Var = (z6k0) this.b;
                        Map map = qxc0Var.X;
                        z6k0Var.getClass();
                        zB = z6k0.b(map);
                    }
                    if (!zB) {
                        return null;
                    }
                    str = hti0Var.a;
                    mr20 mr20Var = ((mnk0) this.c).a;
                    gyj0Var.a = this;
                    gyj0Var.b = str;
                    gyj0Var.e = 1;
                    objI = b5p1.i(mr20Var, gyj0Var);
                    d9n d9nVar = d9n.a;
                    if (objI == d9nVar) {
                        return d9nVar;
                    }
                    pzxVar = this;
                } else {
                    if (i2 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = gyj0Var.b;
                    pzxVar = gyj0Var.a;
                    hm5.M(objI);
                }
                return pzxVar.f(str, ((ibk0) objI).equals(ebk0.a));
            case 3:
                return i(hti0Var);
            case 4:
                return smo1.s(new ae1(d0rVar, hti0Var, this, (lnm) null, (byte) 12), lnmVar);
            case 5:
                return e(hti0Var, (onm) lnmVar);
            case 6:
                return smo1.s(new sh6(d0rVar, hti0Var, this, (lnm) null, (byte) 6), lnmVar);
            case 7:
                return j(hti0Var);
            default:
                return k(hti0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(String str, String str2, String str3, onm onmVar) {
        y721 y721Var;
        if (onmVar instanceof y721) {
            y721Var = (y721) onmVar;
            int i = y721Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                y721Var.f = i - Integer.MIN_VALUE;
            } else {
                y721Var = new y721(this, onmVar);
            }
        } else {
            y721Var = new y721(this, onmVar);
        }
        Object objL = y721Var.d;
        int i2 = y721Var.f;
        if (i2 == 0) {
            hm5.M(objL);
            if (str3 != null) {
                tzr0 tzr0Var = (tzr0) this.d;
                y721Var.a = str;
                y721Var.b = str2;
                y721Var.c = str3;
                y721Var.f = 1;
                objL = tzr0Var.l(str, str3, y721Var);
                Object obj = d9n.a;
                if (objL == obj) {
                    return obj;
                }
            }
            return null;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str3 = y721Var.c;
        str2 = y721Var.b;
        str = y721Var.a;
        hm5.M(objL);
        if (((Set) objL).contains(fuu0.a)) {
            return ((kl1) this.c).m(str, str3, str2);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(String str, String str2, onm onmVar) {
        kom0 kom0Var;
        if (onmVar instanceof kom0) {
            kom0Var = (kom0) onmVar;
            int i = kom0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                kom0Var.e = i - Integer.MIN_VALUE;
            } else {
                kom0Var = new kom0(this, onmVar);
            }
        } else {
            kom0Var = new kom0(this, onmVar);
        }
        Object objL = kom0Var.c;
        int i2 = kom0Var.e;
        if (i2 == 0) {
            hm5.M(objL);
            tzr0 tzr0Var = (tzr0) this.d;
            kom0Var.a = str;
            kom0Var.b = str2;
            kom0Var.e = 1;
            objL = tzr0Var.l(str, str2, kom0Var);
            Object obj = d9n.a;
            if (objL == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = kom0Var.b;
            str = kom0Var.a;
            hm5.M(objL);
        }
        if (((Set) objL).contains(euu0.a)) {
            return ((f3b) this.c).a(str, str2);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(hti0 hti0Var, onm onmVar) {
        b2t0 b2t0Var;
        if (onmVar instanceof b2t0) {
            b2t0Var = (b2t0) onmVar;
            int i = b2t0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                b2t0Var.d = i - Integer.MIN_VALUE;
            } else {
                b2t0Var = new b2t0(this, onmVar);
            }
        } else {
            b2t0Var = new b2t0(this, onmVar);
        }
        Object objJ = b2t0Var.b;
        int i2 = b2t0Var.d;
        if (i2 == 0) {
            hm5.M(objJ);
            Single singleFirstOrError = ((zxm1) this.b).b(hti0Var.a, hti0Var.b).firstOrError();
            b2t0Var.a = hti0Var;
            b2t0Var.d = 1;
            objJ = fc11.j(singleFirstOrError, b2t0Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hti0Var = b2t0Var.a;
            hm5.M(objJ);
        }
        vum1 vum1Var = (vum1) objJ;
        boolean zEquals = vum1Var.equals(tum1.a);
        e2t0 e2t0Var = e2t0.Y;
        if (zEquals) {
            return ((dlg1) this.d).i(hti0Var.a, e2t0Var);
        }
        if (vum1Var instanceof uum1) {
            return null;
        }
        return ((tzr0) this.c).g(hti0Var.a, e2t0Var, hti0Var.b);
    }

    public jhm f(String str, boolean z) {
        if (!z) {
            return null;
        }
        p410 p410Var = (p410) this.d;
        byte b = 18;
        return new jhm("list_duplicate_mix", (hux) amx.c, (fhm) null, (Integer) 2131957346, (String) null, false, (tm81) null, new ihm(new ygm(2), new ghm(new r7j0(p410Var, b), new fki0(str, (byte) 9)), new uah0(p410Var, str, b)), 244);
    }

    public jhm g(hti0 hti0Var) {
        if (!((b1y) this.c).a.e()) {
            return null;
        }
        npm1 npm1Var = (npm1) this.b;
        String str = hti0Var.a;
        npm1Var.getClass();
        if (str.equals("spotify:playlist:37i9dQZF1EYkqdzj48dyYq")) {
            return ((efr) this.d).a();
        }
        return null;
    }

    public jhm h(hti0 hti0Var) {
        npm1 npm1Var = (npm1) this.b;
        String str = hti0Var.a;
        npm1Var.getClass();
        if (!str.equals("spotify:playlist:37i9dQZF1EYkqdzj48dyYq") || !((b1y) this.c).a.c()) {
            return null;
        }
        jut jutVar = (jut) this.d;
        return new jhm("endless_dj_feedback", (hux) csx.c, (fhm) null, (Integer) 2131954362, (String) null, false, (tm81) null, new ihm(new bhm(2), new ghm(x0y.t, new oz6(hti0Var.b, (byte) 1)), new i5w(jutVar, (byte) 17)), 244);
    }

    public jhm i(hti0 hti0Var) {
        qxc0 qxc0Var;
        if (!((rxj0) this.b).N || (qxc0Var = hti0Var.d) == null || !qxc0Var.h) {
            return null;
        }
        String str = hti0Var.a;
        return new jhm("list_extended_versions", (hux) gsx.c, (fhm) null, (Integer) 2131957347, (String) null, false, (tm81) null, new ihm(new ygm(2), new ghm(hxj0.h, new fki0(str, (byte) 10)), new uah0(this, str, (byte) 19)), 244);
    }

    public jhm j(hti0 hti0Var) {
        qxc0 qxc0Var;
        if (((vhc) this.d).o(hti0Var.a) || (qxc0Var = hti0Var.d) == null || ((me30) this.c).a(qxc0Var.e) == le30.b || !qxc0Var.Q0) {
            return null;
        }
        return jl21.b((jl21) this.b, hti0Var.a, hti0Var.b);
    }

    public jhm k(hti0 hti0Var) {
        qxc0 qxc0Var;
        if (((vhc) this.d).o(hti0Var.a) || (qxc0Var = hti0Var.d) == null || qxc0Var.i.a()) {
            return null;
        }
        if (qh41.a[((me30) this.b).a(qxc0Var.e).ordinal()] == 1) {
            return null;
        }
        return ((oh41) this.c).a(hti0Var.a);
    }
}
