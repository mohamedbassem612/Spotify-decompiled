package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jd6 implements tyq, cvl1 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final f4r c;
    public final mqw d;
    public final psw e;
    public final Object f;
    public final rqw g;

    public jd6(d0r d0rVar, byte b) {
        this.a = b;
        switch (b) {
            case 15:
                this.b = d0rVar;
                jd11 jd11Var = rc11.a;
                this.c = w3p1.n(new l4r(new wlu(jd11Var.b(jo70.class)), 1, k4n0.c, new j4r(czm0.c1), k4n0.d), new l4r(new wlu(jd11Var.b(jo70.class)), 2, czm0.e1, new j4r(czm0.d1), k4n0.b), dbm0.c1);
                this.f = new iik0(this, (byte) 7);
                this.d = z0o1.j(new xkm0(this, (byte) 11), dbm0.b1, null, 12);
                this.g = new eih1();
                j2i j2iVar = new j2i(-1099493911, new hmk0(this, (byte) 16), true);
                ien0 ien0Var = qsw.a;
                this.e = new psw(j2iVar, (byte) 0);
                break;
            case 19:
                this.b = d0rVar;
                this.c = w3p1.o(new l4r(new wlu(rc11.a.b(a7q0.class)), 2, p9a1.Z0, new j4r(p9a1.X0), p9a1.a1), p9a1.Y0);
                this.f = new iik0(this, (byte) 18);
                this.d = z0o1.j(new dr91((Object) this, (byte) 15), h9a1.t, null, 12);
                this.g = new eih1();
                j2i j2iVar2 = new j2i(-624055332, new u491(this, (byte) 12), true);
                ien0 ien0Var2 = qsw.a;
                this.e = new psw(j2iVar2, (byte) 0);
                break;
            case 21:
                this.b = d0rVar;
                this.c = w3p1.n(new l4r(jd0.w, 2, aic1.Z0, new j4r(aic1.X0), aic1.a1), new l4r(new wlu(rc11.a.b(jo70.class)), 2, aic1.b1, new j4r(aic1.Y0), aic1.c1), nva1.b1);
                this.f = new iik0(this, (byte) 24);
                this.d = z0o1.j(new l5b1(this, (byte) 24), nva1.a1, null, 12);
                this.g = new eih1();
                j2i j2iVar3 = new j2i(2014880846, new vsb1(this, (byte) 8), true);
                ien0 ien0Var3 = qsw.a;
                this.e = new psw(j2iVar3, (byte) 0);
                break;
            default:
                this.b = d0rVar;
                jd11 jd11Var2 = rc11.a;
                l4r l4rVar = new l4r(new wlu(jd11Var2.b(jo70.class)), 2, fz6.b, new j4r(cv6.b1), fz6.c);
                l4r l4rVar2 = new l4r(new wlu(jd11Var2.b(xkk1.class)), 2, fz6.d, new j4r(cv6.c1), fz6.e);
                pwc0 pwc0Var = pwc0.b;
                o3r o3rVarL = w3p1.l(l4rVar, l4rVar2, new l4r(pwc0Var, 2, fz6.f, new j4r(cv6.d1), fz6.g), new l4r(pwc0Var, 2, fz6.h, new j4r(cv6.e1), fz6.i), oy5.c1);
                this.c = o3rVarL;
                this.f = o3rVarL;
                this.d = z0o1.j(new rr6(this, (byte) 6), ad5.c1, null, 12);
                this.g = n3o1.q(this).a(oy5.d1, oy5.e1);
                j2i j2iVar4 = new j2i(276504646, new qsj(this, (byte) 25), true);
                ien0 ien0Var4 = qsw.a;
                this.e = new psw(j2iVar4, (byte) 0);
                break;
        }
    }

    public static ijo j(String str, vnb1 vnb1Var) {
        Set setA0 = dm61.A0((vnb1Var == null || !vnb1Var.a) ? null : str);
        if (vnb1Var == null || !vnb1Var.b) {
            str = null;
        }
        return new ijo(12, setA0, dm61.A0(str));
    }

    public static String l(ArrayList arrayList, String str, b0k b0kVar) {
        List listT0 = arrayList;
        if (((x340) b0kVar).k(t4k.n) == flb0.b) {
            listT0 = o7h.T0(arrayList);
        }
        return o7h.y0(listT0, str, (String) null, (String) null, (iu30) null, 62);
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                return this.g;
            case 1:
                return this.g;
            case 2:
                return this.g;
            case 3:
                return this.g;
            case 4:
                return this.g;
            case 5:
                return this.g;
            case 6:
                return this.g;
            case 7:
                return this.g;
            case 8:
                return this.g;
            case 9:
                return this.g;
            case 10:
                return this.g;
            case 11:
                return this.g;
            case 12:
                return this.g;
            case 13:
                return (azg) this.g;
            case 14:
                return this.g;
            case 15:
                return this.g;
            case 16:
                return (hy00) this.g;
            case 17:
                return this.g;
            case 18:
                return this.g;
            case 19:
                return this.g;
            case 20:
                return this.g;
            case 21:
                return this.g;
            default:
                return this.g;
        }
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
        }
        return this.e;
    }

    public final d0r e() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (d0r) obj;
            case 1:
                return (d0r) obj;
            case 2:
                return (d0r) obj;
            case 3:
                return (d0r) obj;
            case 4:
                return (d0r) ((Function0) obj).invoke();
            case 5:
                return (d0r) obj;
            case 6:
                return (d0r) obj;
            case 7:
                return (d0r) obj;
            case 8:
                return (d0r) obj;
            case 9:
                return (d0r) obj;
            case 10:
                return (d0r) obj;
            case 11:
                return (d0r) obj;
            case 12:
                return (d0r) obj;
            case 13:
                return (d0r) obj;
            case 14:
                return (d0r) obj;
            case 15:
                return (d0r) obj;
            case 16:
                return (d0r) obj;
            case 17:
                return (d0r) obj;
            case 18:
                return (d0r) obj;
            case 19:
                return (d0r) obj;
            case 20:
                return (d0r) obj;
            case 21:
                return (d0r) obj;
            default:
                return (d0r) obj;
        }
    }

    public void f(v6o v6oVar, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        boolean z;
        qim0 qim0Var3;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(688918485);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(v6oVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= b0kVar3.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= b0kVar3.i(this) ? 2048 : 1024;
        }
        if (b0kVar3.Y(i3 & 1, (i3 & 1171) != 1170)) {
            tob1 tob1VarZ = cxm.z(b0kVar3);
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                asn asnVar = (asn) this.f;
                ly2 ly2Var = new ly2((d7p) asnVar.a, (d7p) asnVar.b, new lan1((d0r) this.b, (byte) 10), (i8h1) asnVar.c);
                b0kVar3.s0(ly2Var);
                objT = ly2Var;
            }
            ly2 ly2Var2 = (ly2) objT;
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarB = uyn1.B(qim0Var4, 16.0f, 0.0f, 0.0f, 0.0f, 14);
            jw31 jw31VarA = ew31.a(h36.g, een.N0, b0kVar3, 54);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarB);
            hzj.A.getClass();
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(jw31VarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            String strO0 = cwl1.o0(b0kVar3, 2131952590);
            wnb0 wnb0Var = new wnb0(1.0f, true);
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = h4o.R0;
                b0kVar3.s0(objT2);
            }
            qim0 qim0VarB2 = s161.b(wnb0Var, false, (iu30) objT2);
            uwr uwrVar = cbx.a;
            int i4 = i3;
            tob1 tob1Var = tob1VarZ;
            b0kVar2 = b0kVar3;
            uwo1.e(strO0, qim0VarB2, cbx.d(b0kVar3).e, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar2, 1572864, 0, 1720);
            int size = v6oVar.b.size();
            z50 z50Var = z50.c;
            if (size > 3) {
                b0kVar2.i0(587661261);
                tob1Var = tob1Var;
                boolean zG = b0kVar2.g(tob1Var) | ((i4 & 896) == 256) | ((i4 & 14) == 4) | b0kVar2.g(strO0);
                Object objT3 = b0kVar2.T();
                if (zG || objT3 == m4cVar) {
                    jzm jzmVar = new jzm(iu30Var, tob1Var, v6oVar, strO0, (byte) 2);
                    b0kVar2.s0(jzmVar);
                    objT3 = jzmVar;
                }
                foo1.h(new gbx(z50Var, (Function0) objT3), (qim0) null, (max) null, yla.s(b0kVar2), (idn0) null, (vu30) null, ehi.a, b0kVar2, 12582912, 118);
                z = false;
                b0kVar2.r(false);
                qim0Var3 = qim0Var4;
            } else {
                z = false;
                b0kVar2.i0(588566957);
                Object objT4 = b0kVar2.T();
                if (objT4 == m4cVar) {
                    objT4 = lmm.W0;
                    b0kVar2.s0(objT4);
                }
                qim0Var3 = qim0Var4;
                foo1.h(new gbx(z50Var, (Function0) objT4), d9y0.k(qim0Var3, 0.0f), (max) null, yla.s(b0kVar2), (idn0) null, (vu30) null, ehi.b, b0kVar2, 12582960, 116);
                b0kVar2.r(false);
            }
            b0kVar2.r(true);
            jy2 jy2Var = (jy2) tob1Var.getValue();
            if (jy2Var == null) {
                b0kVar2.i0(-2075935541);
            } else {
                b0kVar2.i0(-2075935540);
                ly2Var2.a(jy2Var, b0kVar2);
            }
            b0kVar2.r(z);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new c2i(this, v6oVar, qim0Var2, iu30Var, i);
        }
    }

    public void g(paa1 paa1Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1090701208);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(paa1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qxd0.z(paa1Var.a, mqo1.A(paa1Var.b), (qim0) null, 0, false, (String) null, (String) null, x340Var, 0, 124);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wjz0(this, paa1Var, i, (byte) 28);
        }
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
        }
        return this.d;
    }

    public final f4r getData() {
        byte b = this.a;
        Object obj = this.f;
        o3r o3rVar = this.c;
        switch (b) {
            case 0:
                return o3rVar;
            case 1:
                return (o3r) obj;
            case 2:
                return o3rVar;
            case 3:
                return o3rVar;
            case 4:
                return o3rVar;
            case 5:
                return o3rVar;
            case 6:
                return o3rVar;
            case 7:
                return (o3r) obj;
            case 8:
                return o3rVar;
            case 9:
                return o3rVar;
            case 10:
                return o3rVar;
            case 11:
                return o3rVar;
            case 12:
                return o3rVar;
            case 13:
                return o3rVar;
            case 14:
                return (iik0) obj;
            case 15:
                return (iik0) obj;
            case 16:
                return o3rVar;
            case 17:
                return o3rVar;
            case 18:
                return o3rVar;
            case 19:
                return (iik0) obj;
            case 20:
                return o3rVar;
            case 21:
                return (iik0) obj;
            default:
                return o3rVar;
        }
    }

    public void h(i4n0 i4n0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1237888718);
        int i2 = (i & 6) == 0 ? (x340Var.g(i4n0Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= x340Var.i(this) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            List listM = p7h.M(new String[]{l(i4n0Var.b, ", ", x340Var), i4n0Var.a});
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM) {
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
            String strL = l(arrayList, " • ", x340Var);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, nim0.a);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwr uwrVar = cbx.a;
            uwo1.e(strL, (qim0) null, cbx.d(x340Var).j, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var, 0, 0, 1722);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nbf0(this, i4n0Var, i, (byte) 17);
        }
    }

    public void i(ijc1 ijc1Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(648469413);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(ijc1Var) : x340Var.i(ijc1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, nim0.a);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            x340Var.i0(-364612082);
            x340Var.r(false);
            uwr uwrVar = cbx.a;
            uwo1.e("", (qim0) null, cbx.d(x340Var).j, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var, 0, 0, 1722);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new heb1(this, ijc1Var, i, (byte) 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object k(yfh yfhVar, String str, onm onmVar) {
        dgh dghVar;
        if (onmVar instanceof dgh) {
            dghVar = (dgh) onmVar;
            int i = dghVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                dghVar.d = i - Integer.MIN_VALUE;
            } else {
                dghVar = new dgh(this, onmVar);
            }
        } else {
            dghVar = new dgh(this, onmVar);
        }
        Object obj = dghVar.b;
        int i2 = dghVar.d;
        rih1 rih1Var = rih1.a;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                String string = ihc1.e1(str).toString();
                if (string.length() != 0) {
                    mqm mqmVar = new mqm(yfhVar.a, new lqm(Collections.singletonList(ovm.b), (List) null, (qle1) null, 6));
                    d0r d0rVar = (d0r) this.b;
                    hvm hvmVar = hvm.a;
                    prm prmVar = new prm(yfhVar.a, new lum(string));
                    dghVar.a = yfhVar;
                    dghVar.d = 1;
                    d0rVar.getClass();
                    Object objD = d0r.d(d0rVar, hvmVar, mqmVar, prmVar, dghVar);
                    d9n d9nVar = d9n.a;
                    if (objD == d9nVar) {
                        return d9nVar;
                    }
                }
                return rih1Var;
            }
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            yfhVar = dghVar.a;
            hm5.M(obj);
            ((vos0) this.f).a(o6p1.o(yfhVar));
            return rih1Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public jd6(d0r d0rVar, List list) {
        i13 mchVar;
        this.a = (byte) 18;
        this.b = d0rVar;
        this.f = list;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((tyq) it.next()).getData());
        }
        if (arrayList.isEmpty()) {
            mchVar = i13.j;
        } else {
            mchVar = arrayList.size() == 1 ? (f4r) o7h.q0(arrayList) : new mch(arrayList);
        }
        this.c = mchVar;
        this.d = x3p1.m(r6x.a, rz71.V0, ea71.c1, (o8n) null, (iu30) null, 24);
        this.g = new eih1();
        j2i j2iVar = new j2i(-1708452463, new c771(this, (byte) 20), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public jd6(d0r d0rVar, Optional optional) {
        this.a = (byte) 12;
        this.b = d0rVar;
        this.f = optional;
        jd11 jd11Var = rc11.a;
        this.c = w3p1.n(new l4r(new xv00(jd11Var.b(tlr0.class)), 1, fii0.S0, new j4r(fii0.Q0), fii0.T0), new l4r(new xv00(jd11Var.b(w281.class)), 3, fii0.U0, new j4r(fii0.R0), fii0.V0), ish0.Z0);
        this.d = z0o1.j(new dri0(this, (byte) 0), ish0.Y0, new dri0(this, (byte) 1), 4);
        this.g = n3o1.q(this).a(fri0.b, fri0.c);
        j2i j2iVar = k0j.a;
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public jd6(xgc xgcVar, d0r d0rVar) {
        this.a = (byte) 14;
        this.b = d0rVar;
        this.c = w3p1.o(new l4r(new wlu(rc11.a.b(a7q0.class)), 2, xjm0.b, new j4r(ook0.d1), xjm0.c), ook0.e1);
        this.f = new iik0(this, (byte) 3);
        this.d = x3p1.n(new r7j0(this, (byte) 28), ook0.c1, new afm0(this, (byte) 3), (o8n) null, (iu30) null, 24);
        this.g = new eih1();
        j2i j2iVar = l2j.a;
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public jd6(lzn0 lzn0Var, Function0 function0) {
        this.a = (byte) 4;
        this.f = lzn0Var;
        this.b = function0;
        jd11 jd11Var = rc11.a;
        this.c = w3p1.n(new l4r(new xv00(jd11Var.b(jo70.class)), 1, r1o.S0, new j4r(r1o.O0), r1o.T0), new l4r(new xv00(jd11Var.b(xkk1.class)), 2, r1o.Q0, new j4r(r1o.P0), r1o.R0), wmn.Z);
        this.d = z0o1.j(new n3o(this, (byte) 0), wmn.Y, new n3o(this, (byte) 1), 4);
        this.g = new eih1();
        j2i j2iVar = chi.a;
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public jd6(oj3 oj3Var, d0r d0rVar) {
        this.a = (byte) 6;
        this.f = oj3Var;
        this.b = d0rVar;
        this.c = w3p1.o(new l4r(hvm.b, 2, ywq.c, new j4r(eno.e1), ywq.d), ywq.b);
        this.d = z0o1.j(new fnn(this, (byte) 25), ido.Y, null, 12);
        this.g = new eih1();
        j2i j2iVar = new j2i(-741364386, new bfm(this, (byte) 28), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public jd6(d0r d0rVar, e821 e821Var) {
        this.a = (byte) 20;
        this.b = d0rVar;
        this.f = e821Var;
        this.c = w3p1.o(new l4r(v061.c, 1, cgb1.d1, new j4r(cgb1.b1), cgb1.e1), cgb1.c1);
        this.d = h7w.B(cgb1.a1, (o8n) null, (iu30) null, new nsb1(this, (byte) 1), 6);
        this.g = n3o1.q(this).a(vva1.X0, vva1.Y0);
        j2i j2iVar = dlj.a;
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public jd6(d0r d0rVar, String str) {
        this.a = (byte) 22;
        this.b = d0rVar;
        this.f = str;
        o3r o3rVarO = w3p1.o(new l4r(jd0.D, 2, vxd1.W0, new j4r(new qwc1(this, (byte) 15)), vxd1.X0), vxd1.V0);
        this.c = o3rVarO;
        this.d = z0o1.k(d3p1.H(d0rVar, o3rVarO, rih1.a), ppd1.Y, null, 12);
        j2i j2iVar = wmj.a;
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
        this.g = new eih1();
    }

    public jd6(vos0 vos0Var, d0r d0rVar) {
        this.a = (byte) 3;
        this.f = vos0Var;
        this.b = d0rVar;
        this.c = w3p1.n(new l4r(jd0.k, 3, cgh.e, new j4r(m4h.e1), cgh.f), new l4r(new xv00(rc11.a.b(xkk1.class)), 2, cgh.c, new j4r(cgh.b), cgh.d), rng.V0);
        this.d = x3p1.n(new bgh(this, (byte) 0), new bgh(this, (byte) 1), rng.U0, (o8n) null, new bgh(this, (byte) 2), 8);
        this.g = new eih1();
        j2i j2iVar = mdi.a;
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public jd6(lzn0 lzn0Var, d0r d0rVar, n6r0 n6r0Var) {
        this.a = (byte) 10;
        this.b = d0rVar;
        this.f = new umf0(lzn0Var, n6r0Var);
        this.c = w3p1.o(new l4r(new wlu(rc11.a.b(jo70.class)), 1, em50.Z, new j4r(em50.X), em50.N0), em50.Y);
        this.d = z0o1.j(new zi50(this, (byte) 4), oq50.b, em50.t, 4);
        this.g = new eih1();
        j2i j2iVar = new j2i(2128891475, new zq30(this, (byte) 19), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public jd6(d0r d0rVar, asn asnVar) {
        this.a = (byte) 5;
        this.b = d0rVar;
        this.f = asnVar;
        this.c = w3p1.o(new l4r(new xv00(rc11.a.b(jo70.class)), 2, h4o.V0, new j4r(h4o.T0), h4o.W0), h4o.U0);
        this.d = x3p1.n(new fnn(this, (byte) 12), h4o.S0, wmn.R0, (o8n) null, (iu30) null, 24);
        this.g = n3o1.q(this).a(cnn.R0, cnn.S0);
        j2i j2iVar = new j2i(-1846291940, new bfm(this, (byte) 21), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public jd6(d0r d0rVar, o3e0 o3e0Var, kai0 kai0Var, nwt nwtVar, fza fzaVar, km3 km3Var, gw70 gw70Var, lo60 lo60Var, aru0 aru0Var, ycm ycmVar, aru0 aru0Var2, myq0 myq0Var, vgm vgmVar, dnc dncVar, ytp0 ytp0Var, clm clmVar, tbw0 tbw0Var, iuj iujVar) {
        this.a = (byte) 11;
        this.b = d0rVar;
        kko kkoVar = (kko) o3e0Var.c;
        this.f = kkoVar;
        Function0 function0 = (Function0) o3e0Var.b;
        Function0 function1 = (Function0) o3e0Var.d;
        this.d = x3p1.n(new ntf0(this, nwtVar, clmVar, kai0Var, (byte) 6), y7i0.X, new mai0(fzaVar, km3Var, ytp0Var), (o8n) null, new gnf0(lo60Var, vgmVar, dncVar, (byte) 13), 8);
        this.g = n3o1.q(this).a(h40.R0, ytg0.R0);
        j2i j2iVar = new j2i(-759714704, new tai0(gw70Var, tbw0Var, function0, function1, aru0Var, kkoVar, myq0Var, ycmVar, aru0Var2, iujVar), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
        jd11 jd11Var = rc11.a;
        this.c = w3p1.j(new l4r(new xv00(jd11Var.b(nbw0.class)), 1, y7i0.X0, new j4r(y7i0.Y), y7i0.Y0), new l4r(new xv00(jd11Var.b(yo60.class)), 1, y7i0.Z0, new j4r(y7i0.Z), y7i0.a1), new l4r(new xv00(jd11Var.b(jo70.class)), 1, y7i0.b1, new j4r(y7i0.N0), y7i0.c1), new l4r(new xv00(jd11Var.b(zoy0.class)), 2, y7i0.R0, new j4r(y7i0.O0), y7i0.S0), new l4r(new xv00(jd11Var.b(xkk1.class)), 2, y7i0.T0, new j4r(y7i0.P0), y7i0.U0), new l4r(new xv00(jd11Var.b(prl.class)), 2, y7i0.V0, new j4r(y7i0.Q0), y7i0.W0), mcm.t);
    }

    public jd6(lzn0 lzn0Var, d0r d0rVar, byte b) {
        this.a = b;
        switch (b) {
            case 16:
                this.f = lzn0Var;
                this.b = d0rVar;
                this.c = w3p1.o(new l4r(new xv00(rc11.a.b(jo70.class)), 1, th51.t, new j4r(th51.h), th51.X), th51.i);
                this.d = f2p1.p(new ek51(this, (byte) 0), th51.g, jh31.Y0, new ek51(this, (byte) 1), 8);
                this.g = n3o1.r(this).c(v451.Y, v451.Z);
                j2i j2iVar = ofj.a;
                ien0 ien0Var = qsw.a;
                this.e = new psw(j2iVar, (byte) 0);
                break;
            default:
                this.f = lzn0Var;
                this.b = d0rVar;
                this.d = z0o1.j(new xs00(this, (byte) 0), ys00.a, new xs00(this, (byte) 1), 4);
                jd11 jd11Var = rc11.a;
                this.c = w3p1.l(new l4r(new xv00(jd11Var.b(jo70.class)), 2, fa00.Q0, new j4r(fa00.Z), fa00.R0), new l4r(new xv00(jd11Var.b(xkk1.class)), 2, fa00.S0, new j4r(fa00.N0), fa00.T0), new l4r(new xv00(jd11Var.b(xkk1.class)), 2, fa00.U0, new j4r(fa00.O0), fa00.V0), new l4r(new xv00(jd11Var.b(pjw0.class)), 2, fa00.W0, new j4r(fa00.P0), fa00.X0), jq00.g);
                this.g = n3o1.q(this).a(jq00.h, jq00.i);
                j2i j2iVar2 = mni.a;
                ien0 ien0Var2 = qsw.a;
                this.e = new psw(j2iVar2, (byte) 0);
                break;
        }
    }

    public jd6(d0r d0rVar, e2w e2wVar) {
        this.a = (byte) 8;
        this.b = d0rVar;
        this.f = e2wVar;
        this.c = w3p1.o(new l4r(pwc0.b, 2, axv.T0, new j4r(axv.R0), axv.U0), axv.S0);
        this.d = x3p1.n(new nit(this, (byte) 25), axv.Q0, fdv.N0, (o8n) null, (iu30) null, 24);
        this.g = new eih1();
        j2i j2iVar = new j2i(-1781812628, new ent(this, (byte) 17), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public jd6(d0r d0rVar, xh71 xh71Var) {
        this.a = (byte) 17;
        this.b = d0rVar;
        this.f = xh71Var;
        this.c = w3p1.n(new l4r(new xv00(rc11.a.b(vn71.class)), 2, rq61.O0, new j4r(rq61.Z), rq61.P0), new l4r(pwc0.r, 2, rq61.Q0, new j4r(rq61.N0), rq61.R0), qr51.c1);
        this.d = x3p1.n(new uy61(this, (byte) 0), rq61.Y, qr51.b1, (o8n) null, new uy61(this, (byte) 1), 8);
        this.g = n3o1.q(this).a(vp51.d1, vy61.b);
        j2i j2iVar = wgj.a;
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public jd6(d0r d0rVar, o3r o3rVar) {
        this.a = (byte) 7;
        this.b = d0rVar;
        this.c = o3rVar;
        this.f = o3rVar;
        this.d = x3p1.n(new nit(this, (byte) 15), wvu.X0, qlt.a1, (o8n) null, (iu30) null, 24);
        this.g = new eih1();
        j2i j2iVar = gki.a;
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public jd6(mjm mjmVar, d0r d0rVar, byte b) {
        this.a = b;
        byte b2 = 1;
        switch (b) {
            case 2:
                this.f = mjmVar;
                this.b = d0rVar;
                jd11 jd11Var = rc11.a;
                this.c = w3p1.l(new l4r(new wlu(jd11Var.b(jo70.class)), 2, rza.t, new j4r(rza.f), rza.X), new l4r(new wlu(jd11Var.b(jo70.class)), 2, rza.Y, new j4r(rza.g), rza.Z), new l4r(new wlu(jd11Var.b(xkk1.class)), 2, rza.N0, new j4r(rza.h), rza.O0), new l4r(new wlu(jd11Var.b(xkk1.class)), 2, rza.P0, new j4r(rza.i), rza.Q0), pn9.Z0);
                this.d = z0o1.j(new zza(this, (byte) 0), new qza((avl1) this, b2), new zza(this, (byte) 1), 4);
                this.g = n3o1.q(this).a(pn9.a1, pn9.b1);
                j2i j2iVar = new j2i(-601064538, new zk9(this, (byte) 15), true);
                ien0 ien0Var = qsw.a;
                this.e = new psw(j2iVar, (byte) 0);
                break;
            default:
                this.f = mjmVar;
                this.b = d0rVar;
                jd11 jd11Var2 = rc11.a;
                this.c = w3p1.m(new l4r(new wlu(jd11Var2.b(jo70.class)), 2, t16.N0, new j4r(t16.X), t16.O0), new l4r(new wlu(jd11Var2.b(jo70.class)), 2, t16.P0, new j4r(t16.Y), t16.Q0), new l4r(hvm.c, 2, t16.R0, new j4r(t16.Z), t16.S0), o40.N0);
                this.d = z0o1.j(new ve3(this, (byte) 19), ad5.i, t16.t, 4);
                this.g = new eih1();
                j2i j2iVar2 = new j2i(1609287985, new i43(this, (byte) 10), true);
                ien0 ien0Var2 = qsw.a;
                this.e = new psw(j2iVar2, (byte) 0);
                break;
        }
    }

    public jd6(d0r d0rVar, xu30 xu30Var) {
        this.a = (byte) 13;
        this.b = d0rVar;
        this.f = xu30Var;
        jd11 jd11Var = rc11.a;
        this.c = w3p1.n(new l4r(new xv00(jd11Var.b(ro7.class)), 1, v7k0.e, new j4r(v7k0.b), v7k0.f), new l4r(new xv00(jd11Var.b(hll.class)), 1, v7k0.g, new j4r(v7k0.c), v7k0.h), m2j0.U0);
        this.d = x3p1.n(new u7k0(this, (byte) 0), hxj0.e1, m2j0.T0, (o8n) null, new u7k0(this, (byte) 1), 8);
        this.g = new azg((iu30) v7k0.d, n3o1.q(this).a(eej0.e1, w7k0.b));
        j2i j2iVar = new j2i(-149257611, new xyh(this, (byte) 13), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }
}
