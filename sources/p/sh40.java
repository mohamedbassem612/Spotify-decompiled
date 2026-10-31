package p;

import io.reactivex.rxjava3.core.Single;
import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sh40 implements o1i {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public sh40(lik1 lik1Var, bcl1 bcl1Var, g7h g7hVar, tjq tjqVar, t75 t75Var, yp10 yp10Var) {
        this.a = (byte) 1;
        this.b = lik1Var;
        this.c = bcl1Var;
        this.d = g7hVar;
        this.e = tjqVar;
        this.f = t75Var;
        this.g = yp10Var;
    }

    public final /* bridge */ /* synthetic */ void a(int i, o0i o0iVar, z0i z0iVar, b0k b0kVar, qim0 qim0Var) {
        switch (this.a) {
            case 0:
                c((rh40) z0iVar, o0iVar, qim0Var, b0kVar, i);
                break;
            case 1:
                d((x9b0) z0iVar, o0iVar, qim0Var, b0kVar, i);
                break;
            default:
                e((tam1) z0iVar, o0iVar, qim0Var, b0kVar, i);
                break;
        }
    }

    public void c(rh40 rh40Var, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1024399142);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(rh40Var) ? 4 : 2) | i;
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
            zbm zbmVar = new zbm(1, "");
            String str = rh40Var.f;
            boolean zI = ((i2 & 112) == 32 || ((i2 & 64) != 0 && x340Var.i(o0iVar))) | x340Var.i(this) | ((i2 & 14) == 4);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new xvy(this, o0iVar, rh40Var, (byte) 11);
                x340Var.s0(objT);
            }
            mp10.d(zbmVar, str, (Function0) objT, qim0Var, x340Var, (i2 << 3) & 7168);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ke20(i, (Object) this, (Object) rh40Var, (Object) o0iVar, (Object) qim0Var, (byte) 4);
        }
    }

    public void d(x9b0 x9b0Var, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        tob1 tob1Var;
        boolean z;
        yf yfVar;
        m4c m4cVar = fkj0.X;
        aec aecVar = x9b0Var.g;
        lfc lfcVar = x9b0Var.f;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-696635308);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(x9b0Var) ? 4 : 2) | i;
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
            String str = x9b0Var.a;
            tob1 tob1VarG = rwq.g(yoi1.g(g7h.d((g7h) this.d, "", new String[]{str}).map(new x390(this, str, (byte) 16)).distinctUntilChanged()), Boolean.FALSE, (o8n) null, x340Var, 48, 2);
            String str2 = ((Boolean) tob1VarG.getValue()).booleanValue() ? x9b0Var.b : x9b0Var.c;
            String str3 = ((Boolean) tob1VarG.getValue()).booleanValue() ? x9b0Var.d : x9b0Var.e;
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            int i3 = i2;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            ilx ilxVar = ((Boolean) tob1VarG.getValue()).booleanValue() ? ilx.c : hrx.c;
            boolean zI = ((i3 & 112) == 32 || ((i3 & 64) != 0 && x340Var.i(o0iVar))) | x340Var.i(this) | ((i3 & 14) == 4) | x340Var.g(tob1VarG);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                tob1Var = tob1VarG;
                z = false;
                jzm jzmVar = new jzm(o0iVar, this, x9b0Var, tob1Var, (byte) 22);
                x340Var.s0(jzmVar);
                objT = jzmVar;
            } else {
                tob1Var = tob1VarG;
                z = false;
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            if (((Boolean) tob1Var.getValue()).booleanValue() && lfcVar == lfc.a && aecVar == aec.a) {
                x340Var.i0(-1345485457);
                Object objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = k9b0.X;
                    x340Var.s0(objT2);
                }
                yf hdxVar = new hdx(18, (vu30) null, (vu30) objT2, (vu30) null, (hw61) null, 26);
                x340Var.r(z);
                yfVar = hdxVar;
            } else {
                x340Var.i0(-1345054774);
                x340Var.r(z);
                yfVar = null;
            }
            vbe.u(lfcVar, aecVar, str2, str3, ilxVar, gbxVar, (qim0) null, yfVar, x340Var, 32768, 64);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nca0(i, this, x9b0Var, o0iVar, qim0Var, (byte) 2);
        }
    }

    public void e(tam1 tam1Var, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(332091461);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(tam1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(o0iVar) : x340Var.i(o0iVar) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1043) != 1042)) {
            nyx.a(0, (wux) null, apo.r(-402796462, new pej1(tam1Var, o0iVar, this, (byte) 20), x340Var), x340Var, 3072, 7);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new swk1(i, this, tam1Var, o0iVar, qim0Var, (byte) 11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00af  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:51:0x0111  */
    /* JADX WARN: Code duplicated, block: B:53:0x011c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    public Object f(o0i o0iVar, String str, boolean z, onm onmVar) {
        y9b0 y9b0Var;
        tv80 tv80Var;
        Object objJ;
        String str2;
        nj3 m231Var;
        boolean z2;
        nj3 nj3Var;
        o0i o0iVar2 = o0iVar;
        String str3 = str;
        yp10 yp10Var = (yp10) this.g;
        if (onmVar instanceof y9b0) {
            y9b0Var = (y9b0) onmVar;
            int i = y9b0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                y9b0Var.f = i - Integer.MIN_VALUE;
            } else {
                y9b0Var = new y9b0(this, onmVar);
            }
        } else {
            y9b0Var = new y9b0(this, onmVar);
        }
        y9b0 y9b0Var2 = y9b0Var;
        Object obj = y9b0Var2.d;
        int i2 = y9b0Var2.f;
        Object obj2 = this.c;
        if (i2 == 0) {
            hm5.M(obj);
            tv80 tv80VarF = !z ? bcl1.f((bcl1) obj2, o0iVar2.e, "labeled_add_to_collection_button", str3, (String) null, new ry40(str3, (byte) 29), 8) : null;
            try {
                Single singleK = ((tjq) this.e).k(Collections.singletonList(str3), ((lik1) this.b).a, z, "", tv80VarF);
                tv80Var = tv80VarF;
                try {
                    y9b0Var2.a = o0iVar2;
                    y9b0Var2.b = str3;
                    y9b0Var2.c = tv80Var;
                    y9b0Var2.f = 1;
                    objJ = fc11.j(singleK, y9b0Var2);
                    d9n d9nVar = d9n.a;
                    if (objJ == d9nVar) {
                        return d9nVar;
                    }
                    str2 = str3;
                    m231Var = (nj3) objJ;
                } catch (Throwable th) {
                    th = th;
                    m231Var = new m231(th);
                    str2 = str3;
                    z2 = m231Var instanceof m231;
                    if (!z2) {
                        if (z2) {
                            m231Var = null;
                        }
                        nj3Var = m231Var;
                        if (u890.j(nj3Var, new kj3((dsa0) null))) {
                            if (tv80Var == null) {
                                bcl1.f((bcl1) obj2, o0iVar2.e, "labeled_add_to_collection_button", str2, (String) null, new ry40(str2, (byte) 29), 8);
                            }
                            yp10Var.a(2, Collections.singletonMap("itemUri", str2));
                        } else if (u890.j(nj3Var, new lj3((dsa0) null))) {
                            bcl1.f((bcl1) obj2, o0iVar2.e, "labeled_add_to_collection_button", str2, (String) null, new z9b0(str2, (byte) 0), 8);
                            yp10Var.a(3, Collections.singletonMap("itemUri", str2));
                        } else if (u890.j(nj3Var, new mj3())) {
                            bcl1.f((bcl1) obj2, o0iVar2.e, "labeled_add_to_collection_button", str2, (String) null, j9b0.Y0, 8);
                        }
                    }
                    return rih1.a;
                }
            } catch (Throwable th2) {
                th = th2;
                tv80Var = tv80VarF;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tv80 tv80Var2 = y9b0Var2.c;
            str2 = y9b0Var2.b;
            o0i o0iVar3 = y9b0Var2.a;
            try {
                hm5.M(obj);
                objJ = obj;
                tv80Var = tv80Var2;
                o0iVar2 = o0iVar3;
                try {
                    m231Var = (nj3) objJ;
                } catch (Throwable th3) {
                    th = th3;
                    str3 = str2;
                    m231Var = new m231(th);
                    str2 = str3;
                }
            } catch (Throwable th4) {
                th = th4;
                tv80Var = tv80Var2;
                str3 = str2;
                o0iVar2 = o0iVar3;
                m231Var = new m231(th);
                str2 = str3;
                z2 = m231Var instanceof m231;
                if (!z2) {
                    if (z2) {
                        m231Var = null;
                    }
                    nj3Var = m231Var;
                    if (u890.j(nj3Var, new kj3((dsa0) null))) {
                        if (tv80Var == null) {
                            bcl1.f((bcl1) obj2, o0iVar2.e, "labeled_add_to_collection_button", str2, (String) null, new ry40(str2, (byte) 29), 8);
                        }
                        yp10Var.a(2, Collections.singletonMap("itemUri", str2));
                    } else if (u890.j(nj3Var, new lj3((dsa0) null))) {
                        bcl1.f((bcl1) obj2, o0iVar2.e, "labeled_add_to_collection_button", str2, (String) null, new z9b0(str2, (byte) 0), 8);
                        yp10Var.a(3, Collections.singletonMap("itemUri", str2));
                    } else if (u890.j(nj3Var, new mj3())) {
                        bcl1.f((bcl1) obj2, o0iVar2.e, "labeled_add_to_collection_button", str2, (String) null, j9b0.Y0, 8);
                    }
                }
                return rih1.a;
            }
        }
        z2 = m231Var instanceof m231;
        if (!z2) {
            if (z2) {
                m231Var = null;
            }
            nj3Var = m231Var;
            if (u890.j(nj3Var, new kj3((dsa0) null))) {
                if (tv80Var == null) {
                    bcl1.f((bcl1) obj2, o0iVar2.e, "labeled_add_to_collection_button", str2, (String) null, new ry40(str2, (byte) 29), 8);
                }
                yp10Var.a(2, Collections.singletonMap("itemUri", str2));
            } else if (u890.j(nj3Var, new lj3((dsa0) null))) {
                bcl1.f((bcl1) obj2, o0iVar2.e, "labeled_add_to_collection_button", str2, (String) null, new z9b0(str2, (byte) 0), 8);
                yp10Var.a(3, Collections.singletonMap("itemUri", str2));
            } else if (u890.j(nj3Var, new mj3())) {
                bcl1.f((bcl1) obj2, o0iVar2.e, "labeled_add_to_collection_button", str2, (String) null, j9b0.Y0, 8);
            }
        }
        return rih1.a;
    }

    public /* synthetic */ sh40(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
        this.b = obj5;
        this.c = obj6;
    }
}
