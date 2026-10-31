package p;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import io.reactivex.rxjava3.core.Flowable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z72 implements xpw, cvl1 {
    public final Object X;
    public final Object Y;
    public Object Z;
    public final /* synthetic */ byte a;
    public final js20 b;
    public final Object c;
    public final psw d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object t;

    public z72(String str, koc0 koc0Var, lzn0 lzn0Var, pe peVar, joe joeVar, tra0 tra0Var, yo2 yo2Var, ruz ruzVar) {
        this.a = (byte) 0;
        this.e = str;
        this.f = lzn0Var;
        this.g = peVar;
        this.h = joeVar;
        this.i = tra0Var;
        this.t = yo2Var;
        this.X = ruzVar;
        this.Y = mno1.a(-2, 0, 6);
        this.Z = ygn0.a();
        this.b = x3p1.m(rqt0.u(new x72(((roc0) koc0Var).d(), (byte) 0)), ny1.P0, ah1.Q0, (o8n) null, new jm1(this, (byte) 10), 8);
        this.c = n3o1.q(this).a(new yxl1(this, (byte) 24), new v72(this, (byte) 0));
        j2i j2iVar = new j2i(-1069182294, new r1(this, (byte) 24), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public static int i(int i, List list) {
        q8f1 q8f1Var = (q8f1) o7h.t0(i, list);
        if (q8f1Var == null) {
            return 1;
        }
        List list2 = q8f1Var.t;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return 1;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (!((m8f1) it.next()).e) {
                return 2;
            }
        }
        return 1;
    }

    public static lis0 j(q8f1 q8f1Var) {
        ais0 ais0Var = new ais0(q8f1Var.a, q8f1Var.g, q8f1Var.d);
        List<m8f1> list = q8f1Var.t;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (m8f1 m8f1Var : list) {
            arrayList.add(new kis0(m8f1Var.b, m8f1Var.c, m8f1Var.a, m8f1Var.d, m8f1Var.e));
        }
        return new lis0(ais0Var, arrayList);
    }

    public final rqw a() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                return (ia00) obj;
            case 1:
                return (ia00) obj;
            case 2:
                return (qdk) obj;
            case 3:
                return (eih1) obj;
            case 4:
                return (ia00) obj;
            case 5:
                return (ia00) obj;
            case 6:
                return (i7h1) obj;
            case 7:
                return (ia00) obj;
            default:
                return n3o1.r(this).c(new nsb1(this, (byte) 19), new zbb1(this, (byte) 5));
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
        }
        return this.d;
    }

    public void e(e8y0 e8y0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        boolean z;
        oex oexVar;
        Object ndp0Var;
        int i3 = e8y0Var.d;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1202280316);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(e8y0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            String strO0 = cwl1.o0(x340Var, 2131960635);
            String strO1 = cwl1.o0(x340Var, 2131960636);
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).b.e;
            int[] iArr = h8y0.a;
            if (iArr[l1d.C(i3)] == 1) {
                x340Var.i0(45197715);
                boolean zF = x340Var.f(j);
                Object objT2 = x340Var.T();
                if (zF || objT2 == m4cVar) {
                    objT2 = new q9j0((byte) 14, j);
                    x340Var.s0(objT2);
                }
                vu30 vu30Var = (vu30) objT2;
                vu30 vu30Var2 = ((pgx) ogx.e).b;
                boolean zF2 = x340Var.f(j);
                Object objT3 = x340Var.T();
                if (zF2 || objT3 == m4cVar) {
                    objT3 = new q9j0((byte) 15, j);
                    x340Var.s0(objT3);
                }
                oexVar = new oex(0, vu30Var, vu30Var2, (vu30) objT3, 1);
                z = false;
                x340Var.r(false);
            } else {
                z = false;
                x340Var.i0(45203954);
                x340Var.r(false);
                oexVar = pex.b;
            }
            String strK = iArr[l1d.C(i3)] == 2 ? x0d.k(x340Var, 45208355, 2131960634, x340Var, z) : x0d.k(x340Var, 45211162, 2131960633, x340Var, z);
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            zzq0 zzq0Var = new zzq0(8.0f, 4.0f, 8.0f, 4.0f);
            lex lexVarZ = yoo1.z(x340Var);
            int i4 = i2 & 112;
            boolean zI = x340Var.i(this) | x340Var.i(e8y0Var) | (i4 == 32) | x340Var.g(strO1) | x340Var.g(strO0) | x340Var.i(ven0Var);
            Object objT4 = x340Var.T();
            if (zI || objT4 == m4cVar) {
                ndp0Var = new ndp0(this, e8y0Var, iu30Var, strO1, strO0, ven0Var, (byte) 4);
                x340Var.s0(ndp0Var);
            } else {
                ndp0Var = objT4;
            }
            poo1.e(new gbx(z50.c, (Function0) ndp0Var), oexVar, lexVarZ, (qim0) null, 0, (String) null, (max) null, apo.r(-1058075212, new nk7(e8y0Var, j, (byte) 8), x340Var), (vu30) null, (idn0) null, (ga80) null, false, zzq0Var, apo.r(-976646463, new psr0(strK, (byte) 29), x340Var), x340Var, 12582912, 3072, 3960);
            x340Var = x340Var;
            cio cioVar = e8y0Var.f;
            if (!((Boolean) ven0Var.getValue()).booleanValue() || cioVar == null) {
                x340Var.i0(1403888198);
                x340Var.r(false);
            } else {
                x340Var.i0(1403472085);
                asn asnVar = (asn) this.t;
                String str = (String) this.e;
                boolean zI2 = x340Var.i(ven0Var) | (i4 == 32);
                Object objT5 = x340Var.T();
                if (zI2 || objT5 == m4cVar) {
                    objT5 = new i5r0(iu30Var, ven0Var, (byte) 2);
                    x340Var.s0(objT5);
                }
                iu30 iu30Var2 = (iu30) objT5;
                boolean zI3 = x340Var.i(ven0Var) | (i4 == 32);
                Object objT6 = x340Var.T();
                if (zI3 || objT6 == m4cVar) {
                    objT6 = new i5r0(iu30Var, ven0Var, (byte) 3);
                    x340Var.s0(objT6);
                }
                iu30 iu30Var3 = (iu30) objT6;
                boolean zI4 = x340Var.i(ven0Var);
                Object objT7 = x340Var.T();
                if (zI4 || objT7 == m4cVar) {
                    objT7 = new g8y0(ven0Var, (byte) 0);
                    x340Var.s0(objT7);
                }
                asnVar.c(str, cioVar, iu30Var2, iu30Var3, (Function0) objT7, x340Var, 0);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j5w0(this, e8y0Var, iu30Var, i, (byte) 9);
        }
    }

    public rqw f(hba0 hba0Var) {
        return lba0.a[hba0Var.b.ordinal()] == 1 ? (rqw) ((idd1) this.Y).getValue() : (rqw) ((idd1) this.Z).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(mcb1 mcb1Var, kcb1 kcb1Var, tqw tqwVar, onm onmVar) {
        scb1 scb1Var;
        tv80 tv80VarY;
        if (onmVar instanceof scb1) {
            scb1Var = (scb1) onmVar;
            int i = scb1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                scb1Var.d = i - Integer.MIN_VALUE;
            } else {
                scb1Var = new scb1(this, onmVar);
            }
        } else {
            scb1Var = new scb1(this, onmVar);
        }
        Object obj = scb1Var.b;
        int i2 = scb1Var.d;
        rih1 rih1Var = rih1.a;
        if (i2 == 0) {
            hm5.M(obj);
            if (!(kcb1Var instanceof hcb1)) {
                boolean z = kcb1Var instanceof jcb1;
                d9n d9nVar = d9n.a;
                if (z) {
                    if (tqwVar != null) {
                        tv80VarY = n3o1.y(tqwVar);
                        any anyVarD = ((roc0) ((koc0) this.g)).d();
                        scb1Var.a = tv80VarY;
                        scb1Var.d = 1;
                        Object objI = b5p1.i(anyVarD, scb1Var);
                        if (objI != d9nVar) {
                            obj = objI;
                        }
                    }
                } else {
                    if (!(kcb1Var instanceof icb1)) {
                        eg.o();
                        return null;
                    }
                    d0r d0rVar = ((rbt) this.h).b;
                    jd0 jd0Var = jd0.x;
                    zf90 zf90Var = new zf90(true);
                    scb1Var.d = 2;
                    if (d0r.d(d0rVar, jd0Var, rih1Var, zf90Var, scb1Var) != d9nVar) {
                        return rih1Var;
                    }
                }
                return d9nVar;
            }
            if (tqwVar != null) {
                ((lzn0) this.f).a(ktv.d(mcb1Var.a), n3o1.y(tqwVar), (Bundle) null);
                return rih1Var;
            }
            return null;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        tv80VarY = scb1Var.a;
        hm5.M(obj);
        Parcelable parcelableU = fyo1.u((cxc0) obj);
        in8 in8Var = (in8) this.i;
        String str = (String) this.e;
        lzn0 lzn0Var = in8Var.a;
        Bundle bundle = new Bundle();
        bundle.putString("key_list_uri", str);
        bundle.putParcelable("key_entity", parcelableU);
        lzn0Var.a("spotify:internal:playlist-sorting", tv80VarY, bundle);
        return rih1Var;
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
        }
        return this.b;
    }

    public void h(tqw tqwVar) {
        try {
            Bundle bundle = new Bundle();
            bundle.putParcelable("martini-launch-parameters", new i6h0((String) this.e));
            bundle.putBoolean("martini-open-with-keyboard", true);
            ((lzn0) this.f).i(new dwn0(nik1.w6.a, "", false, false, 0, 0, false, (a690) null, (Bundle) null, tqwVar != null ? new bwn0(n3o1.y(tqwVar)) : null), bundle);
        } catch (Exception e) {
            n57.t("Failed to navigate to Martini", e);
        }
    }

    public void k(boolean z) {
        if (z) {
            bpb1 bpb1Var = (bpb1) this.Y;
            Boolean bool = Boolean.TRUE;
            bpb1Var.getClass();
            bpb1Var.m((Object) null, bool);
        }
        bpb1 bpb1Var2 = (bpb1) this.X;
        m251 m251VarA = m251.a((m251) bpb1Var2.getValue(), null, z, 1);
        bpb1Var2.getClass();
        bpb1Var2.m((Object) null, m251VarA);
    }

    public void l(String str) {
        bpb1 bpb1Var = (bpb1) this.X;
        String str2 = ((m251) bpb1Var.getValue()).a;
        m251 m251VarA = m251.a((m251) bpb1Var.getValue(), str, false, 2);
        bpb1Var.getClass();
        bpb1Var.m((Object) null, m251VarA);
        if (u890.j(str2, str)) {
            return;
        }
        ((iu30) this.t).invoke(new k051(str, ejb.f()));
        if (ihc1.y0(str)) {
            return;
        }
        ((hc51) this.g).d(2);
    }

    public z72(urk0 urk0Var, ejb ejbVar, e8r0 e8r0Var, hc51 hc51Var, di4 di4Var, l651 l651Var, iu30 iu30Var, String str, boolean z) {
        this.a = (byte) 6;
        this.e = urk0Var;
        this.f = e8r0Var;
        this.g = hc51Var;
        this.h = di4Var;
        this.i = l651Var;
        this.t = iu30Var;
        bpb1 bpb1VarB = gio1.b(new m251(str, z));
        this.X = bpb1VarB;
        this.Y = gio1.b(Boolean.TRUE);
        this.Z = d5p1.h(bpb1VarB);
        this.c = new i7h1(vs31.W0, new z821(this, (byte) 13));
        this.b = x3p1.m(bpb1VarB, ej41.N0, jh31.P0, (o8n) null, new mn41(this, (byte) 5), 8);
        j2i j2iVar = new j2i(1530068788, new t20(this, str, (byte) 25), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public z72(uic uicVar, iir iirVar, vt90 vt90Var, los losVar, lzn0 lzn0Var, i8h1 i8h1Var, bbl0 bbl0Var) {
        this.a = (byte) 2;
        this.e = uicVar;
        this.g = iirVar;
        this.h = vt90Var;
        this.f = lzn0Var;
        this.i = i8h1Var;
        this.t = bbl0Var;
        this.X = new svh0(losVar, (byte) 16);
        this.Y = new idd1(new oba0(this, (byte) 1));
        byte b = 0;
        this.Z = new idd1(new oba0(this, b));
        this.b = x3p1.n(new mba0(this, (byte) 0), mr90.N0, ul90.P0, (o8n) null, new mba0(this, (byte) 1), 8);
        this.c = new qdk(this, (byte) 2);
        j2i j2iVar = new j2i(-2104325262, new pba0(this, b), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public z72(gw70 gw70Var, lzn0 lzn0Var, js6 js6Var, i4q i4qVar, yhm yhmVar, em6 em6Var, fg60 fg60Var, l6m0 l6m0Var, pt ptVar, zc80 zc80Var) {
        this.a = (byte) 8;
        this.e = gw70Var;
        this.f = lzn0Var;
        this.g = js6Var;
        this.h = i4qVar;
        this.i = yhmVar;
        this.t = em6Var;
        this.X = fg60Var;
        this.Y = l6m0Var;
        this.Z = ptVar;
        this.c = zc80Var;
        byte b = 1;
        this.b = x3p1.n(new t8f1(this, (byte) 0), new t8f1(this, b), ppd1.Y0, (o8n) null, new t8f1(this, (byte) 2), 8);
        j2i j2iVar = new j2i(-1966153246, new y2f1(this, b), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public z72(ynb0 ynb0Var, ynb0 ynb0Var2, ynb0 ynb0Var3, ynb0 ynb0Var4, jly0 jly0Var, p20 p20Var, ruc0 ruc0Var, gw70 gw70Var, mdp0 mdp0Var) {
        this.a = (byte) 4;
        this.e = ynb0Var;
        this.f = ynb0Var2;
        this.g = ynb0Var3;
        this.h = ynb0Var4;
        this.i = jly0Var;
        this.t = p20Var;
        this.X = ruc0Var;
        this.Y = gw70Var;
        this.Z = mdp0Var;
        this.b = x3p1.n(new cnp0(this, (byte) 6), mmp0.Y0, new nso0(this, (byte) 9), (o8n) null, (iu30) null, 24);
        this.c = n3o1.q(this).a(rmp0.h, rmp0.i);
        j2i j2iVar = new j2i(-2078436246, new aso0(this, (byte) 14), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public z72(joe joeVar, a1r0 a1r0Var, Flowable flowable, mr4 mr4Var, tra0 tra0Var, ynb0 ynb0Var, pe peVar, w9u0 w9u0Var) {
        this.a = (byte) 3;
        this.h = joeVar;
        this.e = a1r0Var;
        this.f = mr4Var;
        this.i = tra0Var;
        this.t = ynb0Var;
        this.g = peVar;
        this.X = w9u0Var;
        this.Y = mno1.a(-2, 0, 6);
        this.Z = ygn0.a();
        vbm[] vbmVarArr = q601.a;
        this.b = x3p1.m(rqt0.u(new dy20(new kge(flowable), (byte) 12)), pzo0.t, ofo0.P0, (o8n) null, new y3o0(this, (byte) 26), 8);
        this.c = new eih1();
        j2i j2iVar = new j2i(-526345159, new aso0(this, (byte) 4), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public z72(lzn0 lzn0Var, String str, koc0 koc0Var, rbt rbtVar, in8 in8Var, yt91 yt91Var, mr20 mr20Var, ktv ktvVar, wp20 wp20Var, zob1 zob1Var) {
        this.a = (byte) 7;
        this.f = lzn0Var;
        this.e = str;
        this.g = koc0Var;
        this.h = rbtVar;
        this.i = in8Var;
        this.t = yt91Var;
        this.X = mr20Var;
        this.Y = wp20Var;
        this.Z = zob1Var;
        byte b = 1;
        this.b = x3p1.n(new rcb1(this, (byte) 0), v3b1.a1, new wh91(this, (byte) 19), (o8n) null, new rcb1(this, b), 8);
        this.c = n3o1.q(this).a(vva1.Z, new zbb1(this, b));
        j2i j2iVar = new j2i(-884611081, new u491(this, (byte) 21), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public z72(Context context, f1n0 f1n0Var, q7r0 q7r0Var, kt91 kt91Var, zxm1 zxm1Var, op31 op31Var, spn spnVar, q8n q8nVar, vwm1 vwm1Var) {
        this.a = (byte) 1;
        this.e = context;
        this.f = f1n0Var;
        this.g = q7r0Var;
        this.h = kt91Var;
        this.i = zxm1Var;
        this.t = op31Var;
        this.X = spnVar;
        this.Y = q8nVar;
        this.b = x3p1.n(new zas(vwm1Var, this), c6s.U0, szr.g, (o8n) null, new vas(this, (byte) 1), 8);
        this.c = n3o1.q(this).a(zyr.X0, zyr.Y0);
        j2i j2iVar = new j2i(-863005382, new i6r(this, (byte) 11), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public z72(lzn0 lzn0Var, String str, kt91 kt91Var, xvo xvoVar, zwz0 zwz0Var, asn asnVar, i5y0 i5y0Var, iz31 iz31Var, x1i1 x1i1Var) {
        this.a = (byte) 5;
        this.f = lzn0Var;
        this.e = str;
        this.g = kt91Var;
        this.h = xvoVar;
        this.i = zwz0Var;
        this.t = asnVar;
        this.X = i5y0Var;
        this.Y = iz31Var;
        this.Z = x1i1Var;
        this.b = x3p1.n(new i8y0(this, (byte) 0), e6y0.N0, j8y0.b, (o8n) null, new i8y0(this, (byte) 1), 8);
        j2i j2iVar = new j2i(-1101766774, new qsu0(this, (byte) 24), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
        this.c = n3o1.q(this).a(cnx0.U0, new ixt0(this, (byte) 17));
    }
}
