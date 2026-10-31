package p;

import android.net.Uri;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.mobius.EventSource;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class b3o1 {
    public static final byte[] a = {48, 49, 53, 0};
    public static final byte[] b = {48, 49, 48, 0};
    public static final byte[] c = {48, 48, 57, 0};
    public static final byte[] d = {48, 48, 53, 0};
    public static final byte[] e = {48, 48, 49, 0};
    public static final byte[] f = {48, 48, 49, 0};
    public static final byte[] g = {48, 48, 50, 0};
    public static b180 h;

    public static final eih1 A() {
        return new eih1();
    }

    public static final h3j1 B(String str, xf4 xf4Var) {
        return new h3j1(str, xf4Var.g(), xf4Var.B(), xf4Var.z(), xf4Var.A());
    }

    public static final gjn1 C(Object obj, Object obj2) {
        gjn1 gjn1VarA = (gjn1) obj;
        gjn1 gjn1Var = (gjn1) obj2;
        if (!gjn1Var.isEmpty()) {
            if (!gjn1VarA.a) {
                gjn1VarA = gjn1VarA.a();
            }
            gjn1VarA.d();
            if (!gjn1Var.isEmpty()) {
                gjn1VarA.putAll(gjn1Var);
            }
        }
        return gjn1VarA;
    }

    public static final void a(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1853113255);
        if (x340Var.Y(i & 1, i != 0)) {
            xto1.e(anm1.N("apple_tv_pairing_loading", nim0.a), 2, 0L, 0L, x340Var, 48, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bom1((byte) 19, i, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(rz5 rz5Var, iu30 iu30Var, los losVar, j2i j2iVar, j2i j2iVar2, b0k b0kVar, int i) {
        int i2;
        j2i j2iVar3;
        b0k b0kVar2;
        iu30 iu30Var2;
        j2i j2iVar4;
        Object uh0Var;
        tob1 tob1Var;
        j06 j06Var;
        y7e1 y7e1Var;
        ven0 ven0Var;
        char c2;
        k6a1 k6a1Var;
        boolean z;
        Object ur1Var;
        lz20 lz20Var;
        b0k b0kVar3;
        int i3;
        int i4;
        boolean z2;
        byte b2;
        hax haxVar;
        Object obj = fkj0.X;
        String str = rz5Var.a;
        fz5 fz5Var = rz5Var.c;
        b0k b0kVar4 = (x340) b0kVar;
        b0kVar4.k0(-1255444413);
        j06 j06Var2 = ((x340) b0kVar4).a;
        if ((i & 6) == 0) {
            i2 = (b0kVar4.g(rz5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar4.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar4.i(losVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar4.i(j2iVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar4.i(j2iVar2) ? 16384 : 8192;
        }
        if (b0kVar4.Y(i2 & 1, (i2 & 9363) != 9362)) {
            y7e1 y7e1VarD = c4p1.D(0, 2, str, b0kVar4);
            int i5 = i2 & 112;
            boolean zI = b0kVar4.i(y7e1VarD) | (i5 == 32);
            Object objT = b0kVar4.T();
            if (zI || objT == obj) {
                objT = new qy5(y7e1VarD, iu30Var, (lnm) null, (byte) 0);
                b0kVar4.s0(objT);
            }
            qxd0.s(y7e1VarD, str, (vu30) objT, b0kVar4);
            int i6 = i2 & 14;
            boolean zI2 = b0kVar4.i(y7e1VarD) | (i6 == 4);
            Object objT2 = b0kVar4.T();
            if (zI2 || objT2 == obj) {
                objT2 = new ry5(y7e1VarD, rz5Var, (lnm) null, (byte) 0);
                b0kVar4.s0(objT2);
            }
            qxd0.t(str, b0kVar4, (vu30) objT2);
            Object objT3 = b0kVar4.T();
            if (objT3 == obj) {
                objT3 = pzm.i(b0kVar4);
            }
            lz20 lz20Var2 = (lz20) objT3;
            k6a1 k6a1Var2 = (k6a1) b0kVar4.k(t4k.q);
            az20 az20Var = (az20) b0kVar4.k(t4k.i);
            boolean zG = b0kVar4.g(losVar);
            Object objT4 = b0kVar4.T();
            if (zG || objT4 == obj) {
                objT4 = v8r.q(Boolean.FALSE);
                b0kVar4.s0(objT4);
            }
            tob1 tob1Var2 = (ven0) objT4;
            boolean zG2 = b0kVar4.g(losVar);
            Object objT5 = b0kVar4.T();
            if (zG2 || objT5 == obj) {
                objT5 = v8r.q(Boolean.FALSE);
                b0kVar4.s0(objT5);
            }
            ven0 ven0Var2 = (ven0) objT5;
            boolean zI3 = b0kVar4.i(tob1Var2) | b0kVar4.i(k6a1Var2) | b0kVar4.i(ven0Var2) | b0kVar4.i(az20Var) | b0kVar4.i(losVar);
            Object objT6 = b0kVar4.T();
            if (zI3 || objT6 == obj) {
                tob1Var = tob1Var2;
                j06Var = j06Var2;
                y7e1Var = y7e1VarD;
                ven0Var = ven0Var2;
                c2 = 4;
                k6a1Var = k6a1Var2;
                z = false;
                uh0Var = new uh0(losVar, k6a1Var, tob1Var, az20Var, ven0Var, (byte) 3);
                b0kVar4.s0(uh0Var);
            } else {
                j06Var = j06Var2;
                y7e1Var = y7e1VarD;
                tob1Var = tob1Var2;
                ven0Var = ven0Var2;
                c2 = 4;
                uh0Var = objT6;
                k6a1Var = k6a1Var2;
                z = false;
            }
            int i7 = i2 >> 6;
            qxd0.g(losVar, az20Var, k6a1Var, (iu30) uh0Var, b0kVar4);
            Boolean bool = (Boolean) tob1Var.getValue();
            bool.booleanValue();
            Boolean boolValueOf = Boolean.valueOf(rz5Var.g());
            boolean zI4 = b0kVar4.i(tob1Var) | (i6 == c2 ? true : z) | b0kVar4.i(lz20Var2) | b0kVar4.i(k6a1Var) | b0kVar4.i(az20Var);
            Object objT7 = b0kVar4.T();
            if (zI4 || objT7 == obj) {
                lz20Var = lz20Var2;
                tob1 tob1Var3 = tob1Var;
                b0kVar3 = b0kVar4;
                ur1Var = new ur1(rz5Var, lz20Var, k6a1Var, az20Var, tob1Var3, (lnm) null, (byte) 3);
                b0kVar3.s0(ur1Var);
            } else {
                lz20Var = lz20Var2;
                b0kVar3 = b0kVar4;
                ur1Var = objT7;
            }
            qxd0.s(bool, boolValueOf, (vu30) ur1Var, b0kVar3);
            boolean z3 = (i5 == 32 ? true : z) | (i6 == 4 ? true : z);
            Object objT8 = b0kVar3.T();
            if (z3 || objT8 == obj) {
                i3 = 1;
                objT8 = new wy5(rz5Var, iu30Var, (byte) 1);
                b0kVar3.s0(objT8);
            } else {
                i3 = 1;
            }
            Function0 function0 = (Function0) objT8;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarH = l6o1.H(voo1.y(voo1.y(u291.f(nim0Var, 1.0f), voo1.g), voo1.f), l6o1.C(z, z, i3, b0kVar3), z, 14);
            uwr uwrVar = cbx.a;
            qim0 qim0VarX = uyn1.x(qim0VarH, cbx.b(b0kVar3).e.b);
            cvx cvxVar = cbx.b(b0kVar3).b;
            mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(z)), een.P0, b0kVar3, z);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarX);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            boolean z4 = ((x340) b0kVar3).S;
            n4k n4kVar = hmb0.t1;
            if (z4) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, b0kVar3, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar3, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar3, lljVar3);
            nko1.F(b0kVar3);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar3, lljVar4);
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            era eraVar = een.Q0;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            ven0 ven0Var3 = ven0Var;
            lz20 lz20Var3 = lz20Var;
            mbh mbhVarA2 = jbh.a(new d36(6.0f, true, new um5(false)), eraVar, b0kVar3, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM2 = b0kVar3.m();
            qim0 qim0VarE2 = zr7.E(b0kVar3, qim0VarF);
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            nko1.H(mbhVarA2, b0kVar3, lljVar);
            nko1.H(xos0VarM2, b0kVar3, lljVar2);
            x0d.q(iHashCode2, b0kVar3, lljVar3, b0kVar3);
            nko1.H(qim0VarE2, b0kVar3, lljVar4);
            b0k b0kVar5 = b0kVar3;
            j2iVar3 = j2iVar;
            j2iVar4 = j2iVar2;
            uwo1.e(cwl1.o0(b0kVar3, 2131952392), u291.f(nim0Var, 1.0f), cbx.d(b0kVar3).e, cbx.a(b0kVar3).b.a, new a0e1(3), null, 0, false, null, 0, null, b0kVar5, 0, 0, 2016);
            uwo1.e(cwl1.o0(b0kVar5, 2131952391), u291.f(nim0Var, 1.0f), cbx.d(b0kVar5).j, cbx.a(b0kVar5).b.b, new a0e1(3), null, 0, false, null, 0, null, b0kVar5, 0, 0, 2016);
            b0k b0kVar6 = b0kVar5;
            b0kVar6.r(true);
            boolean zF = rz5Var.f();
            hax haxVar2 = jax.a;
            if (zF || rz5Var.d) {
                i4 = i6;
                z2 = false;
                b0kVar6.i0(758429845);
                b0kVar6.r(false);
            } else {
                b0kVar6.i0(756330835);
                long j = cbx.a(b0kVar6).b.a;
                long j2 = cbx.a(b0kVar6).b.b;
                long j3 = cbx.a(b0kVar6).b.b;
                long j4 = cbx.a(b0kVar6).b.a;
                long j5 = cbx.a(b0kVar6).d.b;
                long j6 = cbx.a(b0kVar6).d.b;
                long j7 = cbx.a(b0kVar6).b.c;
                long j8 = u7h.j;
                fyx fyxVar = new fyx(new zxx(j, j2, j3, j4, j5, j6, j7, j8, j8, cbx.a(b0kVar6).b.d));
                String strO0 = cwl1.o0(b0kVar6, 2131952390);
                if (rz5Var.g()) {
                    b0kVar6.i0(-1915236735);
                    b2 = 0;
                    b0kVar6.r(false);
                    haxVar = haxVar2;
                } else {
                    b2 = 0;
                    b0kVar6.i0(-1915234589);
                    haxVar = new hax(cwl1.o0(b0kVar6, rz5Var.d() ? 2131952382 : 2131952388));
                    b0kVar6.r(false);
                }
                boolean z5 = (fz5Var == null || !z(fz5Var).b) ? b2 : 1;
                kua0 kua0Var = new kua0(0, (Boolean) null, 3, 7, 115);
                boolean zG3 = b0kVar6.g(function0);
                Object objT9 = b0kVar6.T();
                if (zG3 || objT9 == obj) {
                    objT9 = new uy5(function0, b2);
                    b0kVar6.s0(objT9);
                }
                yta0 yta0Var = (yta0) objT9;
                cvx cvxVar3 = cbx.b(b0kVar6).b;
                float f2 = cbx.b(b0kVar6).b.a;
                zzq0 zzq0Var = new zzq0(16.0f, f2, 16.0f, f2);
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                hax haxVar3 = haxVar;
                i4 = i6;
                boolean zI5 = (i4 == 4) | b0kVar6.i(ven0Var3);
                Object objT10 = b0kVar6.T();
                if (zI5 || objT10 == obj) {
                    objT10 = new cc2(rz5Var, ven0Var3, (byte) 24);
                    b0kVar6.s0(objT10);
                }
                qim0 qim0VarN = anm1.N("apple_tv_pairing_pin_input", vby0.p(d9y0.q(qim0VarF2, (iu30) objT10), lz20Var3));
                Object objT11 = b0kVar6.T();
                if (objT11 == obj) {
                    objT11 = vy5.b;
                    b0kVar6.s0(objT11);
                }
                rwo1.a(y7e1Var, fyxVar, qim0VarN, haxVar3, strO0, null, null, z5, (dk80) objT11, null, kua0Var, yta0Var, d6e1.b, null, null, null, null, zzq0Var, 0.0f, false, b0kVar6, 0, 0, 0, 1819872);
                b0kVar6 = b0kVar6;
                z2 = false;
                b0kVar6.r(false);
            }
            if (fz5Var != null) {
                b0kVar6.i0(758461806);
                j2iVar3.invoke(fz5Var, b0kVar6, Integer.valueOf(i7 & 112));
                b0kVar6.r(z2);
            } else {
                b0kVar6.i0(758499285);
                b0kVar6.r(z2);
            }
            boolean z6 = rz5Var.f() || rz5Var.c() || rz5Var.e();
            boolean z7 = (i4 == 4) | (i5 == 32);
            Object objT12 = b0kVar6.T();
            if (z7 || objT12 == obj) {
                iu30Var2 = iu30Var;
                objT12 = new wy5(rz5Var, iu30Var2, (byte) 0);
                b0kVar6.s0(objT12);
            } else {
                iu30Var2 = iu30Var;
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT12);
            idx idxVar = new idx(4);
            if (z6) {
                b0kVar6.i0(-1915175679);
                b0kVar6.r(false);
            } else {
                b0kVar6.i0(-1915174134);
                hax haxVar4 = new hax(cwl1.o0(b0kVar6, 2131952387));
                b0kVar6.r(false);
                haxVar2 = haxVar4;
            }
            qim0 qim0VarM = ktd.m(eraVar, u291.D(nim0Var, (era) null, 3));
            cvx cvxVar4 = cbx.b(b0kVar6).b;
            b0k b0kVar7 = b0kVar6;
            foo1.c(gbxVar, idxVar, uyn1.B(qim0VarM, 0.0f, 16.0f, 0.0f, 0.0f, 13), haxVar2, null, null, null, null, null, null, apo.r(1508212398, new pp5(rz5Var, j2iVar4, (byte) 1), b0kVar6), b0kVar7, 0, 48, 2024);
            b0kVar2 = b0kVar7;
            b0kVar2.r(true);
        } else {
            j2iVar3 = j2iVar;
            b0kVar2 = b0kVar4;
            iu30Var2 = iu30Var;
            j2iVar4 = j2iVar2;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new hy0((byte) 8, i, rz5Var, iu30Var2, losVar, j2iVar3, j2iVar4);
        }
    }

    public static final void c(fz5 fz5Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(816623995);
        int i2 = i | (x340Var.e(fz5Var.ordinal()) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarN = anm1.N("apple_tv_pairing_error", u291.f(nim0Var, 1.0f));
            fra fraVar = een.N0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(6.0f, true, new um5(false)), fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(eox.c, isl.a, u291.r(nim0Var, 24.0f), cbx.a(x340Var).b.d, 0L, false, x340Var, eox.d | 48, 48);
            uwo1.e(cwl1.o0(x340Var, z(fz5Var).a), null, cbx.d(x340Var).j, cbx.a(x340Var).b.d, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xb2(fz5Var, i, (byte) 21);
        }
    }

    public static final void d(String str, wux wuxVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(579809459);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(wuxVar) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            qim0 qim0VarN = anm1.N("paidPodcastBannerCtaButton", uyn1.y(d1u.E(1.0f, cbx.a(x340Var).c.b, nim0.a, er31.a(50)), 12.0f, 6.0f));
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            uwo1.e(str, null, cbx.d(x340Var).k, 0L, null, null, 0, false, new cjc0(1), 0, null, x340Var, i2 & 14, 0, 1786);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jyo0(str, wuxVar, i, (byte) 21);
        }
    }

    public static final void e(long j, j2i j2iVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-473001194);
        int i2 = (x340Var.f(j) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            mod.c(new ely0[]{qgx.a.a(new u7h(j)), p3d1.o(j, wrl.a)}, j2iVar, x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nk7(i, j, j2iVar);
        }
    }

    public static final void f(lee1 lee1Var, vu30 vu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1966408357);
        int i2 = (x340Var.i(lee1Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= x340Var.i(vu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            mod.c(new ely0[]{rgx.a.a(lee1Var), q9e1.a.a(lee1Var)}, vu30Var, x340Var, (i2 & 112) | 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g8(lee1Var, vu30Var, i, (byte) 14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [boolean, int] */
    public static final void g(usb1 usb1Var, nsq nsqVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        usb1 usb1Var2;
        qim0 qim0Var2;
        llj lljVar;
        qim0 qim0Var3;
        vu30 vu30Var;
        boolean z;
        float f2;
        float f3;
        float f4;
        ?? r9;
        wat watVar;
        vu30 vu30Var2;
        tl3 tl3Var;
        boolean z2;
        float f5;
        tob1 tob1Var;
        boolean z3;
        String str = usb1Var.d;
        pks0 pks0Var = usb1Var.b;
        tl3 tl3Var2 = een.d;
        m4c m4cVar = fkj0.X;
        Map map = usb1Var.c;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1432553111);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = i | (x340Var.i(usb1Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(nsqVar) : x340Var.i(nsqVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            wat watVar2 = (wat) x340Var.k(t4k.h);
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var4, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z4 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z4) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            vu30 vu30Var3 = y580.O0;
            nko1.H(mbhVarA, x340Var, vu30Var3);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            vu30 vu30Var4 = y580.Y;
            nko1.H(qim0VarE, x340Var, vu30Var4);
            xsb1 xsb1Var = xsb1.d;
            btb1 btb1Var = (btb1) map.get(xsb1Var);
            if (btb1Var == null) {
                x340Var.i0(-1001243138);
                x340Var.r(false);
                qim0Var3 = qim0Var4;
                vu30Var = vu30Var3;
                f4 = 0.0f;
                z = true;
                lljVar = lljVar3;
                r9 = 0;
                f3 = 1.0f;
                f2 = 16.0f;
            } else {
                x340Var.i0(-1001243137);
                Object objT = x340Var.T();
                if (objT == m4cVar) {
                    objT = nsqVar.a();
                    x340Var.s0(objT);
                }
                lljVar = lljVar3;
                qim0Var3 = qim0Var4;
                vu30Var = vu30Var3;
                z = true;
                f2 = 16.0f;
                f3 = 1.0f;
                f4 = 0.0f;
                r9 = 0;
                otw.c((qsb1) objT, new ksb1(btb1Var, xsb1Var, pks0Var, 1, str, false, usb1Var.f), u291.j(0.0f, 120.0f, 1, u291.f(qim0Var3, 1.0f)), (ipb1) null, x340Var, 0, 8);
                x340Var = x340Var;
                x340Var.r(false);
            }
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = ktd.o(f4, x340Var);
            }
            tob1 tob1Var2 = (ven0) objT2;
            qim0 qim0VarF2 = u291.f(qim0Var3, f3);
            cvx cvxVar2 = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(f2, z, new um5((boolean) r9)), een.Z, x340Var, (int) r9);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, vu30Var);
            nko1.H(xos0VarM2, x340Var, 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0199: INVOKE (r5v10 'xos0VarM2' p.xos0), (r13v5 'x340Var' p.x340), (r18v0 ?? I:??[OBJECT, ARRAY]) STATIC call: p.nko1.H(java.lang.Object, p.b0k, p.vu30):void A[MD:(java.lang.Object, p.b0k, p.vu30):void (m)] (LINE:410) in method: p.b3o1.g(p.usb1, p.nsq, p.qim0, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes4.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r18v0 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 985
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.b3o1.g(p.usb1, p.nsq, p.qim0, p.b0k, int):void");
        }

        public static final void h(usb1 usb1Var, nsq nsqVar, qim0 qim0Var, b0k b0kVar, int i) {
            qim0 qim0Var2;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-335362367);
            int i2 = (i & 6) == 0 ? i | (x340Var.i(usb1Var) ? 4 : 2) : i;
            if ((i & 48) == 0) {
                i2 |= (i & 64) == 0 ? x340Var.g(nsqVar) : x340Var.i(nsqVar) ? 32 : 16;
            }
            int i3 = i2 | 384;
            if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
                qim0 qim0Var3 = nim0.a;
                qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), een.P0, x340Var, 0);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
                nko1.H(mbhVarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                x340Var.i0(-1362661506);
                Map map = usb1Var.c;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (entry.getKey() != xsb1.c) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                for (Map.Entry entry2 : o7h.a1(linkedHashMap.entrySet(), new be21((byte) 17))) {
                    xsb1 xsb1Var = (xsb1) entry2.getKey();
                    btb1 btb1Var = (btb1) entry2.getValue();
                    boolean zE = x340Var.e(xsb1Var.ordinal());
                    Object objT = x340Var.T();
                    if (zE || objT == fkj0.X) {
                        objT = nsqVar.a();
                        x340Var.s0(objT);
                    }
                    otw.c((qsb1) objT, new ksb1(btb1Var, xsb1Var, usb1Var.b, 2, usb1Var.d, false, usb1Var.f), (qim0) null, (ipb1) null, x340Var, 0, 12);
                }
                x340Var.r(false);
                x340Var.r(true);
                qim0Var2 = qim0Var3;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new w5a1(usb1Var, nsqVar, qim0Var2, i, (byte) 3);
            }
        }

        public static final void i(ylr0 ylr0Var, gw70 gw70Var, Function0 function0, b0k b0kVar, int i) {
            int i2;
            long jA;
            float f2;
            byte b2;
            String str = ylr0Var.e;
            String str2 = ylr0Var.c;
            String str3 = ylr0Var.a;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(1968532852);
            j06 j06Var = x340Var.a;
            if ((i & 6) == 0) {
                i2 = (x340Var.g(ylr0Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= x340Var.i(gw70Var) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= x340Var.i(function0) ? 256 : 128;
            }
            if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                uwr uwrVar = cbx.a;
                wux wuxVarB = cbx.b(x340Var);
                Object objT = x340Var.T();
                Object obj = fkj0.X;
                if (objT == obj) {
                    objT = ktd.n(x340Var);
                }
                idn0 idn0Var = (idn0) objT;
                if (((Boolean) k1u.m(idn0Var, x340Var, 0).getValue()).booleanValue()) {
                    x340Var.i0(1974472697);
                    jA = cbx.a(x340Var).a.a.b();
                    x340Var.r(false);
                } else {
                    x340Var.i0(1974474392);
                    jA = cbx.a(x340Var).a.a.a();
                    x340Var.r(false);
                }
                int i3 = i2;
                tob1 tob1VarA = w191.a(jA, null, "bannerBgColor", x340Var, 384, 10);
                nim0 nim0Var = nim0.a;
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                cvx cvxVar = wuxVarB.b;
                qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                boolean z = (i3 & 896) == 256;
                Object objT2 = x340Var.T();
                if (z || objT2 == obj) {
                    objT2 = new kek0(function0, (byte) 29);
                    x340Var.s0(objT2);
                }
                qim0 qim0VarN = anm1.N("paidPodcastBanner", dug.f(bin.v(qim0VarB, idn0Var, null, false, null, null, (Function0) objT2, 28), ((u7h) tob1VarA.getValue()).a, er31.b(8.0f)));
                jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                boolean z2 = x340Var.S;
                n4k n4kVar = hmb0.t1;
                if (z2) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(jw31VarA, x340Var, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var, lljVar3);
                nko1.F(x340Var);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var, lljVar4);
                op71.g(x340Var, u291.v(nim0Var, 8.0f));
                if (str3.length() > 0) {
                    x340Var.i0(1929783174);
                    boolean zG = x340Var.g(str3);
                    Object objT3 = x340Var.T();
                    if (zG || objT3 == obj) {
                        objT3 = Uri.parse(str3);
                        x340Var.s0(objT3);
                    }
                    b2 = 2;
                    mod.b(oi7.a.a(gw70Var), apo.r(-231852557, new n640((Uri) objT3, wuxVarB, b2), x340Var), x340Var, 56);
                    f2 = 8.0f;
                    ab80.p(nim0Var, 8.0f, x340Var, false);
                } else {
                    f2 = 8.0f;
                    b2 = 2;
                    x340Var.i0(1930348738);
                    op71.g(x340Var, u291.v(nim0Var, 4.0f));
                    x340Var.r(false);
                }
                if (str2.length() > 0) {
                    b2 = 1;
                }
                qim0 qim0VarZ = uyn1.z(0.0f, str2.length() > 0 ? f2 : 10.0f, 1, new wnb0(1.0f, true));
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarZ);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA, x340Var, lljVar);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar4);
                uwo1.e(ylr0Var.b, null, cbx.d(x340Var).k, 0L, null, null, 2, false, new cjc0(b2), 0, null, x340Var, 0, 0, 1722);
                x340Var = x340Var;
                if (str2.length() > 0) {
                    x340Var.i0(746516291);
                    uwo1.e(ylr0Var.c, null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 2, false, new cjc0(1), 0, null, x340Var, 0, 0, 1714);
                    x340Var = x340Var;
                    x340Var.r(false);
                } else {
                    x340Var.i0(746755828);
                    x340Var.r(false);
                }
                x340Var.r(true);
                op71.g(x340Var, u291.v(nim0Var, 8.0f));
                if (str != null) {
                    x340Var.i0(1931270182);
                    d(str, wuxVarB, x340Var, 0);
                    x340Var.r(false);
                } else {
                    x340Var.i0(1931357323);
                    plx plxVar = plx.c;
                    long j = ((yex) zex.a.d).g;
                    zov0 zov0Var = cbx.b(x340Var).g;
                    x340 x340Var2 = x340Var;
                    w0h1.a(plxVar, isl.a, u291.r(nim0Var, 16.0f), j, 0L, true, x340Var2, plx.d | 196656, 16);
                    x340Var = x340Var2;
                    x340Var.r(false);
                }
                ab80.p(nim0Var, 8.0f, x340Var, true);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new jmk0(ylr0Var, gw70Var, function0, i, (byte) 13);
            }
        }

        public static final void j(lee1 lee1Var, long j, j2i j2iVar, b0k b0kVar, int i, int i2) {
            int i3;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-1172395740);
            if ((i & 6) == 0) {
                i3 = (x340Var.i(lee1Var) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
            if ((i & 48) == 0) {
                i3 |= ((i2 & 2) == 0 && x340Var.f(j)) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i3 |= x340Var.i(j2iVar) ? 256 : 128;
            }
            if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
                x340Var.d0();
                if ((i & 1) != 0 && !x340Var.E()) {
                    x340Var.b0();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                } else if ((i2 & 2) != 0) {
                    j = ((u7h) x340Var.k(qgx.a)).a;
                    i3 &= -113;
                }
                x340Var.s();
                mod.c(new ely0[]{qgx.a.a(new u7h(j)), p3d1.o(j, wrl.a), rgx.a.a(lee1Var), q9e1.a.a(lee1Var)}, j2iVar, x340Var, ((i3 >> 3) & 112) | 8);
            } else {
                x340Var.b0();
            }
            long j2 = j;
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ld60(lee1Var, j2, j2iVar, i, i2, (byte) 2);
            }
        }

        public static final void k(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
            int i2;
            x340 x340Var;
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.k0(-1090135955);
            if ((i & 6) == 0) {
                i2 = (x340Var2.g(str) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= x340Var2.i(qim0Var) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= x340Var2.i(function0) ? 256 : 128;
            }
            if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var2, qim0Var);
                hzj.A.getClass();
                if (x340Var2.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(hmb0.t1);
                } else {
                    x340Var2.v0();
                }
                nko1.H(gfh0VarC, x340Var2, y580.O0);
                nko1.H(xos0VarM, x340Var2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                nko1.F(x340Var2);
                nko1.H(qim0VarE, x340Var2, y580.Y);
                y7e1 y7e1VarD = c4p1.D(0, 3, null, x340Var2);
                nim0 nim0Var = nim0.a;
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                uwr uwrVar = cbx.a;
                zxx zxxVar = new zxx(cbx.a(x340Var2).b.a, cbx.a(x340Var2).b.a, cbx.a(x340Var2).b.a, cbx.a(x340Var2).b.d, cbx.a(x340Var2).a.b.a(), cbx.a(x340Var2).a.b.a(), cbx.a(x340Var2).b.c, 0L, 896);
                cvx cvxVar = cbx.b(x340Var2).b;
                cvx cvxVar2 = cbx.b(x340Var2).b;
                rwo1.b(y7e1VarD, qim0VarF, null, str, dfj.b, null, false, false, null, cbx.d(x340Var2).k, null, null, d6e1.b, null, null, null, null, new zzq0(12.0f, 8.0f, 12.0f, 8.0f), 0.0f, false, zxxVar, x340Var2, ((i2 << 9) & 7168) | 24576, 0, 912868);
                x340Var = x340Var2;
                qim0 qim0VarB = h2c.a.b(nim0Var);
                boolean z = (i2 & 14) == 4;
                Object objT = x340Var.T();
                if (z || objT == fkj0.X) {
                    objT = new sc21(str, (byte) 24);
                    x340Var.s0(objT);
                }
                t1c.a(bin.x(s161.b(qim0VarB, false, (iu30) objT), false, str, null, null, function0, 13), x340Var, 0);
                x340Var.r(true);
            } else {
                x340Var = x340Var2;
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new o82(str, qim0Var, function0, i, (byte) 12);
            }
        }

        public static final void l(boolean z, String str, String str2, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(2083652921);
            int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.g(str2) ? 256 : 128) | (x340Var.i(function0) ? 2048 : 1024) | (x340Var.i(function1) ? 16384 : 8192) | (x340Var.i(qim0Var) ? 131072 : 65536);
            if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
                jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
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
                nko1.H(jw31VarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                int i3 = (i2 >> 3) & 14;
                int i4 = i2 >> 6;
                k(i3 | (i4 & 896), str, function1, x340Var, new wnb0(1.0f, false));
                if (z) {
                    x340Var.i0(-207014837);
                    m(i4 & 126, str2, function0, x340Var, uyn1.B(nim0.a, 8.0f, 0.0f, 0.0f, 0.0f, 14));
                    x340Var.r(false);
                } else {
                    x340Var.i0(-206860891);
                    x340Var.r(false);
                }
                x340Var.r(true);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new wr1(z, str, (Object) str2, (Object) function0, (Object) function1, qim0Var, i, (byte) 24);
            }
        }

        public static final void m(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
            String str2;
            int i2;
            b0k b0kVar2;
            b0k b0kVar3 = (x340) b0kVar;
            b0kVar3.k0(-2129685628);
            if ((i & 6) == 0) {
                str2 = str;
                i2 = (b0kVar3.g(str2) ? 4 : 2) | i;
            } else {
                str2 = str;
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= b0kVar3.i(function0) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= b0kVar3.i(qim0Var) ? 256 : 128;
            }
            if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
                String strN0 = cwl1.n0(2131962793, new Object[]{str2}, b0kVar3);
                boolean z = (i2 & 112) == 32;
                Object objT = b0kVar3.T();
                if (z || objT == fkj0.X) {
                    objT = new us21(function0, (byte) 22);
                    b0kVar3.s0(objT);
                }
                Function0 function1 = (Function0) objT;
                if (ihc1.y0(strN0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                gbx gbxVar = new gbx(new y50(strN0), function1);
                uwr uwrVar = cbx.a;
                long jA = cbx.a(b0kVar3).a.b.a();
                cua cuaVar = cbx.b(b0kVar3).f;
                qim0 qim0VarE = d1u.E(0.0f, ((vex) zex.a.e).a, dug.f(qim0Var, jA, er31.b(4.0f)), d4o1.a);
                cr31 cr31VarA = er31.a(50);
                jtr jtrVar = jtr.f;
                kgx kgxVar = new kgx(0, (vu30) null, (vu30) null, (vu30) null, 15);
                cvx cvxVar = cbx.b(b0kVar3).b;
                cvx cvxVar2 = cbx.b(b0kVar3).b;
                b0kVar2 = b0kVar3;
                cwl1.b(qim0VarE, (tl3) null, cr31VarA, kgxVar, new zzq0(12.0f, 8.0f, 12.0f, 8.0f), (max) null, false, (idn0) null, jtrVar, gbxVar, (gbx) null, dfj.a, b0kVar2, 0, 48, 1250);
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
            }
            h311 h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new o82(str2, function0, qim0Var, i, (byte) 13);
            }
        }

        public static final void n(usb1 usb1Var, boolean z, nsq nsqVar, qim0 qim0Var, b0k b0kVar, int i) {
            qim0 qim0Var2;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(216844199);
            int i2 = i | (x340Var.i(usb1Var) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.g(nsqVar) ? 256 : 128) | 3072;
            if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
                qim0Var2 = nim0.a;
                qim0 qim0VarN = anm1.N("stats_container", qim0Var2);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
                if (z) {
                    x340Var.i0(1221171880);
                    h(usb1Var, nsqVar, null, x340Var, ((i2 >> 3) & 112) | (i2 & 14));
                    x340Var.r(false);
                } else {
                    x340Var.i0(1221234376);
                    g(usb1Var, nsqVar, null, x340Var, ((i2 >> 3) & 112) | (i2 & 14));
                    x340Var.r(false);
                }
                x340Var.r(true);
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new x5a1(usb1Var, z, nsqVar, qim0Var2, i, (byte) 1);
            }
        }

        public static final p6h0 o(s4b1 s4b1Var) {
            String strN = s4b1Var.n("threadID");
            if (strN == null) {
                strN = "";
            }
            if (ihc1.y0(strN) && (strN = s4b1Var.n("conversationId")) == null) {
                strN = "";
            }
            String strN2 = s4b1Var.n("messageId");
            String str = strN2 != null ? strN2 : "";
            if (ihc1.y0(strN) || ihc1.y0(str)) {
                return null;
            }
            return new p6h0(strN, str);
        }

        public static final Object p(dxc dxcVar, lnm lnmVar) {
            ohd ohdVar = new ohd(1, aym.t(lnmVar));
            ohdVar.t();
            ohdVar.n(new gla0(dxcVar, (byte) 1));
            dxcVar.p(new d420(ohdVar));
            return ohdVar.r();
        }

        public static final Object q(dxc dxcVar, lnm lnmVar) {
            ohd ohdVar = new ohd(1, aym.t(lnmVar));
            ohdVar.t();
            ohdVar.n(new n6b0(dxcVar, (byte) 1));
            dxcVar.p(new o6b0(ohdVar));
            return ohdVar.r();
        }

        public static final Object r(dxc dxcVar, lnm lnmVar) {
            ohd ohdVar = new ohd(1, aym.t(lnmVar));
            ohdVar.t();
            ohdVar.n(new n6b0(dxcVar, (byte) 0));
            dxcVar.p(new ux40(ohdVar));
            return ohdVar.r();
        }

        public static dlg1 s() {
            return new dlg1();
        }

        public static h8o0 t(mn21 mn21Var, List list) {
            opc cacheEntry = mn21Var.getCacheEntry();
            if (cacheEntry == null) {
                return new h8o0((byte[]) null, true, list);
            }
            TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    treeSet.add(((ev50) it.next()).a);
                }
            }
            ArrayList arrayList = new ArrayList(list);
            List list2 = cacheEntry.h;
            if (list2 != null) {
                if (!list2.isEmpty()) {
                    for (ev50 ev50Var : cacheEntry.h) {
                        if (!treeSet.contains(ev50Var.a)) {
                            arrayList.add(ev50Var);
                        }
                    }
                }
            } else if (!cacheEntry.g.isEmpty()) {
                for (Map.Entry entry : cacheEntry.g.entrySet()) {
                    if (!treeSet.contains(entry.getKey())) {
                        arrayList.add(new ev50((String) entry.getKey(), (String) entry.getValue()));
                    }
                }
            }
            return new h8o0(cacheEntry.a, true, arrayList);
        }

        public static String u(String str) {
            int i = hu50.a;
            return xym0.d.H(str).toString();
        }

        public static byte[] v(InputStream inputStream, int i, mgc mgcVar) throws Throwable {
            byte[] bArrS;
            kdv0 kdv0Var = new kdv0(mgcVar, i);
            try {
                bArrS = mgcVar.s(1024);
                while (true) {
                    try {
                        int i2 = inputStream.read(bArrS);
                        if (i2 == -1) {
                            break;
                        }
                        kdv0Var.write(bArrS, 0, i2);
                    } catch (Throwable th) {
                        th = th;
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                            vqk1.b("Error occurred when closing InputStream", new Object[0]);
                        }
                        mgcVar.N(bArrS);
                        kdv0Var.close();
                        throw th;
                    }
                }
                byte[] byteArray = kdv0Var.toByteArray();
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                    vqk1.b("Error occurred when closing InputStream", new Object[0]);
                }
                mgcVar.N(bArrS);
                kdv0Var.close();
                return byteArray;
            } catch (Throwable th2) {
                th = th2;
                bArrS = null;
            }
        }

        public static final boolean w(ContextTrack contextTrack) {
            return l4o1.a0(contextTrack, "pointer.uri") != null && l4o1.U(contextTrack);
        }

        public static final EventSource x(kly0 kly0Var, h241 h241Var, jqd jqdVar, ypd ypdVar) {
            return RxEventSources.a(new ObservableSource[]{h241Var.b.distinctUntilChanged().filter(wcp1.N0).map(vgp1.N0), yoi1.i(((ck) kly0Var.get()).g, o6x.a).filter(cxo1.O0).flatMap(qqd.a), jqdVar.a.map(xbp1.O0), ((Observable) ypdVar.e.getValue()).filter(o9p1.O0).map(vap1.N0)});
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public static final void y(Throwable th, lnm lnmVar) throws KotlinNothingValueException {
            p6b0 p6b0Var;
            if (lnmVar instanceof p6b0) {
                p6b0Var = (p6b0) lnmVar;
                int i = p6b0Var.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    p6b0Var.b = i - Integer.MIN_VALUE;
                } else {
                    p6b0Var = new p6b0(lnmVar);
                }
            } else {
                p6b0Var = new p6b0(lnmVar);
            }
            Object obj = p6b0Var.a;
            int i2 = p6b0Var.b;
            if (i2 != 0) {
                if (i2 == 1) {
                    throw l1d.v(obj);
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
            } else {
                hm5.M(obj);
                p6b0Var.b = 1;
                igu.a.h(p6b0Var.getContext(), new nx30(p6b0Var, th, (byte) 27));
            }
        }

        public static final iz5 z(fz5 fz5Var) {
            switch (fz5Var.ordinal()) {
                case SplitInstallErrorCode.NO_ERROR /* 0 */:
                case 1:
                    return new iz5(2131952396, true);
                case 2:
                case 4:
                    return new iz5(2131952393, false);
                case 3:
                    return new iz5(2131952394, false);
                case 5:
                    return new iz5(2131952386, false);
                case 6:
                    return new iz5(2131952384, false);
                case 7:
                    return new iz5(2131952385, false);
                case 8:
                case 9:
                    return new iz5(2131952383, false);
                case 10:
                    return new iz5(2131952395, false);
                default:
                    eg.o();
                    return null;
            }
        }
    }
