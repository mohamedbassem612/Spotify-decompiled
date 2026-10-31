package p;

import android.os.Parcel;
import com.spotify.offline.offlineplugin_proto.EsOfflinePlugin;
import com.spotify.podcastexperience.showpreferencesimpl.DefaultShowSortOrderPreferences;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class d7p1 {
    public static b180 a;
    public static b180 b;

    public static final void a(ei1 ei1Var, fi1 fi1Var, los losVar, iu30 iu30Var, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1576347868);
        int i2 = i | (x340Var.i(ei1Var) ? 4 : 2) | (x340Var.i(fi1Var) ? 32 : 16) | (x340Var.i(losVar) ? 256 : 128) | (x340Var.i(iu30Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zG = x340Var.g(ei1Var) | x340Var.g(losVar);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean zG2 = x340Var.g(ei1Var) | x340Var.g(losVar);
            Object objT2 = x340Var.T();
            if (zG2 || objT2 == m4cVar) {
                objT2 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT2);
            }
            i1o1.e(ei1Var, fi1Var, ei1Var.a, null, null, null, apo.r(1897819386, new wf((Object) iu30Var, (Object) fi1Var, (byte) 8), x340Var), 0, apo.r(-459244849, new n891(ven0Var, losVar, (ven0) objT2, (byte) 8), x340Var), x340Var, (i2 & 14) | 102236160 | (i2 & 112), 92);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x2(i, (Object) ei1Var, (Object) fi1Var, (Object) losVar, (Object) iu30Var, (byte) 12);
        }
    }

    public static final void b(akh akhVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        byte b2;
        qim0 qim0Var2;
        h311 h311VarV;
        du0 bkhVar;
        j2i j2iVarR;
        xu30 xu30Var;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(1532673904);
        if ((i & 6) == 0) {
            i2 = (b0kVar2.g(akhVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (b0kVar2.Y(i3 & 1, (i3 & 19) != 18)) {
            if (ihc1.y0(akhVar.a)) {
                h311VarV = b0kVar2.v();
                if (h311VarV == null) {
                    return;
                } else {
                    bkhVar = new du0(akhVar, i);
                }
            } else {
                uwr uwrVar = cbx.a;
                long jA = cbx.a(b0kVar2).a.a.a();
                u5j1 u5j1Var = d4o1.a;
                qim0 qim0Var3 = nim0.a;
                qim0 qim0VarF = dug.f(qim0Var3, jA, u5j1Var);
                mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
                int iHashCode = Long.hashCode(((x340) b0kVar2).T);
                xos0 xos0VarM = b0kVar2.m();
                qim0 qim0VarE = zr7.E(b0kVar2, qim0VarF);
                hzj.A.getClass();
                if (((x340) b0kVar2).a == null) {
                    tgp1.p();
                    throw null;
                }
                b0kVar2.m0();
                if (((x340) b0kVar2).S) {
                    b0kVar2.l(hmb0.t1);
                } else {
                    b0kVar2.v0();
                }
                nko1.H(mbhVarA, b0kVar2, y580.O0);
                nko1.H(xos0VarM, b0kVar2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
                nko1.F(b0kVar2);
                nko1.H(qim0VarE, b0kVar2, y580.Y);
                Object objT = b0kVar2.T();
                if (objT == fkj0.X) {
                    objT = cgh.c1;
                    b0kVar2.s0(objT);
                }
                qim0 qim0VarB = s161.b(qim0Var3, true, (iu30) objT);
                uvx uvxVar = new uvx((pgx) null, 3, (tvx) null, (p3v) null, 27);
                String str = akhVar.c;
                if (str == null) {
                    b0kVar2.i0(-1214079679);
                    b0kVar2.r(false);
                    j2iVarR = null;
                } else {
                    b0kVar2.i0(-1214079678);
                    j2iVarR = apo.r(-1221639287, new kaf(str, (byte) 7), b0kVar2);
                    b0kVar2.r(false);
                }
                String str2 = akhVar.b;
                if (str2 == null) {
                    b0kVar2.i0(-1213590189);
                    b0kVar2.r(false);
                    xu30Var = null;
                } else {
                    b0kVar2.i0(-1213590188);
                    xu30 xu30VarR = apo.r(1596865166, new kaf(str2, (byte) 8), b0kVar2);
                    b0kVar2.r(false);
                    xu30Var = xu30VarR;
                }
                b2 = 0;
                jto1.b(qim0VarB, uvxVar, null, false, null, null, null, null, null, j2iVarR, null, xu30Var, null, null, null, apo.r(-1393731978, new okg(akhVar, (byte) 9), b0kVar2), b0kVar2, 64, 196608, 30204);
                b0kVar2 = b0kVar2;
                rqo1.g(0, 1, b0kVar2, null);
                b0kVar2.r(true);
                qim0Var2 = qim0Var3;
            }
            h311VarV.d = bkhVar;
        }
        b2 = 0;
        b0kVar2.b0();
        qim0Var2 = qim0Var;
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            bkhVar = new bkh(akhVar, qim0Var2, i, b2);
            h311VarV.d = bkhVar;
        }
    }

    public static final void c(boolean z, qim0 qim0Var, yf yfVar, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        yf yfVar2;
        b0k b0kVar2;
        qim0 qim0Var2;
        qim0 qim0Var3;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1316066468);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            yfVar2 = yfVar;
            i3 |= b0kVar3.i(yfVar2) ? 256 : 128;
        } else {
            yfVar2 = yfVar;
        }
        if ((i & 3072) == 0) {
            i3 |= b0kVar3.i(iu30Var) ? 2048 : 1024;
        }
        if (b0kVar3.Y(i3 & 1, (i3 & 1171) != 1170)) {
            b0kVar3.d0();
            if ((i & 1) == 0 || b0kVar3.E()) {
                qim0Var3 = nim0.a;
            } else {
                b0kVar3.b0();
                qim0Var3 = qim0Var;
            }
            b0kVar3.s();
            String strO0 = cwl1.o0(b0kVar3, z ? 2131954750 : 2131954742);
            String strO1 = cwl1.o0(b0kVar3, z ? 2131954744 : 2131954743);
            boolean z2 = (i3 & 7168) == 2048;
            Object objT = b0kVar3.T();
            if (z2 || objT == fkj0.X) {
                objT = new y720(iu30Var, (byte) 21);
                b0kVar3.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            int i4 = (i3 >> 3) & 112;
            qim0Var2 = qim0Var3;
            b0kVar2 = b0kVar3;
            foo1.c(new gbx(new y50(strO0), function0), yfVar2, anm1.N("curation_button", qim0Var3), null, yla.s(b0kVar3), null, null, null, null, null, apo.r(1209728155, new ps00(strO1, (byte) 13), b0kVar3), b0kVar2, i4, 48, 2008);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new d30(z, qim0Var2, yfVar, iu30Var, i, (byte) 20);
        }
    }

    public static final String d(String str, hry0 hry0Var) {
        StringBuilder sb = new StringBuilder(str);
        k8f0 k8f0Var = hry0Var.b;
        if (k8f0Var.a.length() > 0) {
            if (str.length() > 0) {
                sb.append(k8f0Var.b);
            }
            sb.append(k8f0Var.a);
        }
        return sb.toString();
    }

    public static nsn0 e(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return qqn1.g(parcel);
        }
        return null;
    }

    public static mga f(zjd1 zjd1Var, o8n o8nVar, vu30 vu30Var, zfa zfaVar, iu30 iu30Var, iu30 iu30Var2, int i) {
        if ((i & 2) != 0) {
            vu30Var = new s55(2, (lnm) null, (byte) 2);
        }
        vu30 vu30Var2 = vu30Var;
        if ((i & 4) != 0) {
            zfaVar = new y6x0((byte) 27);
        }
        zfa zfaVar2 = zfaVar;
        if ((i & 16) != 0) {
            iu30Var2 = xj.X;
        }
        return new mga(zjd1Var, zfaVar2, o8nVar, iu30Var, iu30Var2, vu30Var2);
    }

    public static mga g(zjd1 zjd1Var, q8n q8nVar, vu30 vu30Var, vu30 vu30Var2, eoc eocVar) {
        s55 s55Var = new s55(2, (lnm) null, (byte) 3);
        return new mga(zjd1Var, eocVar, q8nVar, new kd8(vu30Var, vu30Var2, (byte) 11), yda.c, s55Var);
    }

    public static eea0 h(rsk0 rsk0Var) {
        return new eea0(rsk0Var.b(), (byte) 25);
    }

    public static final xfa1 i(rps rpsVar, String str) {
        xfa1 xfa1Var = xfa1.a;
        xfa1 xfa1Var2 = xfa1.b;
        xfa1 xfa1Var3 = xfa1.c;
        List listM = p7h.M(new xfa1[]{xfa1Var, xfa1Var2, xfa1Var3});
        ywb0 ywb0VarU = rpsVar.a.u();
        DefaultShowSortOrderPreferences.SortOrderJsonModel sortOrderJsonModel = (DefaultShowSortOrderPreferences.SortOrderJsonModel) (ywb0VarU != null ? ywb0VarU.get(str) : null);
        if (sortOrderJsonModel != null) {
            int i = qps.a[sortOrderJsonModel.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    xfa1Var2 = xfa1Var3;
                } else {
                    if (i != 3) {
                        eg.o();
                        return null;
                    }
                    xfa1Var2 = xfa1Var;
                }
            }
        } else {
            xfa1Var2 = null;
        }
        xfa1 xfa1Var4 = o7h.i0(listM, xfa1Var2) ? xfa1Var2 : null;
        return xfa1Var4 == null ? xfa1Var : xfa1Var4;
    }

    public static final l4r j(iu30 iu30Var) {
        return new l4r(jd0.v, 1, td80.d, new j4r(new bv70(iu30Var, (byte) 6)), td80.e);
    }

    public static final xkk1 k(String str) {
        return new xkk1(new mq70(Collections.singletonList(new up70(new so20(nhc1.X(str, "spotify:local", "spotify:localfileimage")), vp70.c)), 6), (mq70) null, (mq70) null, 62);
    }

    public static p6r0 l(String str) {
        Set set = s4b1.f;
        switch (uic.x(str).c.ordinal()) {
            case 653:
            case 654:
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                return yon1.V3();
            case 655:
                AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                return yon1.W3();
            case 656:
            case 658:
                AtomicReferenceArray atomicReferenceArray3 = p6r0.e;
                return yon1.U3();
            case 657:
                AtomicReferenceArray atomicReferenceArray4 = p6r0.e;
                return yon1.X3();
            default:
                AtomicReferenceArray atomicReferenceArray5 = p6r0.e;
                return yon1.H5();
        }
    }

    public static lik1 m(s4b1 s4b1Var) {
        String strZ = s4b1Var.z();
        strZ.getClass();
        switch (s4b1Var.c.ordinal()) {
            case 653:
                return nik1.b.b(strZ);
            case 654:
                return nik1.d.b(strZ);
            case 655:
                return nik1.c.b(strZ);
            case 656:
                return nik1.a.b(strZ);
            case 657:
                return nik1.E0;
            default:
                return nik1.D0;
        }
    }

    public static final void n(esa1 esa1Var, i4e1 i4e1Var, i4e1 i4e1Var2, xid xidVar, boolean z) {
        bfn0 bfn0Var = (bfn0) xidVar.b;
        int i = bfn0Var.c;
        if (i > 1) {
            esa1Var.y(new vee1(0, i4e1Var.d.toString(), i4e1Var2.d.toString(), i4e1Var.e, i4e1Var2.e, 0L, false, 32));
            return;
        }
        if (i == 1) {
            dfe dfeVar = (dfe) bfn0Var.a[0];
            long jE = e6p1.e(dfeVar.c, dfeVar.d);
            dfe dfeVar2 = (dfe) ((bfn0) xidVar.b).a[0];
            long jE2 = e6p1.e(dfeVar2.a, dfeVar2.b);
            if (nbe1.d(jE) && nbe1.d(jE2)) {
                return;
            }
            esa1Var.y(new vee1(nbe1.g(jE), e6p1.o(jE, i4e1Var), e6p1.o(jE2, i4e1Var2), i4e1Var.e, i4e1Var2.e, 0L, z, 32));
        }
    }

    public static final Single o(EsOfflinePlugin.RemoveCommand removeCommand, pmf0 pmf0Var, Scheduler scheduler) {
        return Observable.defer(new g921(removeCommand)).subscribeOn(scheduler).map(h921.a).toList().flatMap(new m021(pmf0Var, scheduler, (byte) 2));
    }

    public static void p(nsn0 nsn0Var, Parcel parcel) {
        if (nsn0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            qqn1.a0(nsn0Var, parcel);
        }
    }
}
