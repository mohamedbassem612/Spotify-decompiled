package p;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.TextUnit;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zq30 extends hab0 implements bv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ maa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zq30(maa maaVar, byte b) {
        super(5);
        this.a = b;
        this.b = maaVar;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z;
        hp50 hp50Var = (hp50) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        boolean z2 = hp50Var.b;
        List list = hp50Var.a;
        int i = (iIntValue & 48) == 0 ? (x340Var.g(hp50Var) ? 32 : 16) | iIntValue : iIntValue;
        if ((iIntValue & 384) == 0) {
            i |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(i & 1, (i & 1169) != 1168);
        j06 j06Var = x340Var2.a;
        if (!zY) {
            x340Var2.b0();
        } else if (!list.isEmpty()) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(anm1.N("groupable-devices-section", nim0Var), 1.0f);
            tm tmVar = this.b;
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z3 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            otw.c((maa) ((ynb0) tmVar.d).get(), new jp50(hp50Var.c, z2), (qim0) null, (ipb1) null, x340Var2, 0, 12);
            x340 x340Var3 = x340Var2;
            if (z2) {
                x340Var3.i0(-1602894980);
                boolean z4 = (i & 896) == 256;
                Object objT = x340Var3.T();
                if (z4 || objT == m4cVar) {
                    objT = new g850(iu30Var, (byte) 24);
                    x340Var3.s0(objT);
                }
                bzn1.d(0, (Function0) objT, x340Var3, (qim0) null);
                uwr uwrVar = cbx.a;
                xpv0 xpv0Var = cbx.c(x340Var3).c;
                qim0 qim0VarD = o0c.d(nim0Var, xpv0.k(), 2);
                boolean z5 = (i & 112) == 32;
                Object objT2 = x340Var3.T();
                if (z5 || objT2 == m4cVar) {
                    objT2 = new zi50(hp50Var, (byte) 3);
                    x340Var3.s0(objT2);
                }
                qim0 qim0VarB = s161.b(qim0VarD, false, (iu30) objT2);
                mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var3, 0);
                int iHashCode2 = Long.hashCode(x340Var3.T);
                xos0 xos0VarM2 = x340Var3.m();
                qim0 qim0VarE2 = zr7.E(x340Var3, qim0VarB);
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(n4kVar);
                } else {
                    x340Var3.v0();
                }
                nko1.H(mbhVarA2, x340Var3, lljVar);
                nko1.H(xos0VarM2, x340Var3, lljVar2);
                x0d.q(iHashCode2, x340Var3, lljVar3, x340Var3);
                nko1.H(qim0VarE2, x340Var3, lljVar4);
                x340Var3.i0(175699052);
                int i2 = 0;
                for (Object obj6 : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        p7h.T();
                        throw null;
                    }
                    zv31 zv31Var = (zv31) obj6;
                    x340Var3.f0(-1725651540, zv31Var.a);
                    x340 x340Var4 = x340Var3;
                    otw.c((maa) ((ynb0) tmVar.e).get(), new ep50(zv31Var, i2), (qim0) null, (ipb1) null, x340Var4, 0, 12);
                    x340Var3 = x340Var4;
                    x340Var3.r(false);
                    i2 = i3;
                }
                z = true;
                us71.m(x340Var3, false, true, false);
            } else {
                z = true;
                x340Var3.i0(-1602180957);
                x340Var3.r(false);
            }
            x340Var3.r(z);
        }
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        xp50 xp50Var = (xp50) obj2;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 48) == 0) {
            iIntValue |= x340Var.g(xp50Var) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 1041) != 1040)) {
            uwr uwrVar = cbx.a;
            xpv0 xpv0Var = cbx.c(x340Var2).c;
            qim0 qim0VarD = o0c.d(nim0.a, xpv0.k(), 2);
            Object objT = x340Var2.T();
            if (objT == fkj0.X) {
                objT = em50.i;
                x340Var2.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarD, false, (iu30) objT);
            yp50 yp50Var = this.b;
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
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
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            x340Var2.i0(-1509005007);
            int i = 0;
            for (Object obj6 : xp50Var.a) {
                int i2 = i + 1;
                if (i < 0) {
                    p7h.T();
                    throw null;
                }
                zv31 zv31Var = (zv31) obj6;
                x340Var2.f0(-1687398151, zv31Var.a);
                otw.c((maa) yp50Var.b.get(), new tp50(zv31Var, i), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                x340Var2.r(false);
                i = i2;
            }
            x340Var2.r(false);
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        nq50 nq50Var = (nq50) obj2;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        jd6 jd6Var = this.b;
        m4c m4cVar = fkj0.X;
        if (!nq50Var.a.isEmpty()) {
            String strO0 = cwl1.o0(x340Var, 2131960179);
            xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarS = exd0.s(i541.D(nim0.a, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, (hw61) null, false, 0L, 0L, 1, (f2b) null, 983039), new pq50(xtb0VarA, (byte) 0));
            x340 x340Var2 = x340Var;
            boolean zG = x340Var2.g(strO0);
            Object objT = x340Var2.T();
            if (zG || objT == m4cVar) {
                objT = new ry40(strO0, (byte) 8);
                x340Var2.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarS, false, (iu30) objT);
            float f = cbx.b(x340Var2).e.b;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            zzq0 zzq0Var = new zzq0(f, 8.0f, f, 8.0f);
            cvx cvxVar3 = cbx.b(x340Var2).b;
            d36 d36Var = new d36(8.0f, true, new um5(false));
            boolean zI = x340Var2.i(jd6Var) | ((((iIntValue & 112) ^ 48) > 32 && x340Var2.g(nq50Var)) || (iIntValue & 48) == 32);
            Object objT2 = x340Var2.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new fz40(nq50Var, jd6Var, (byte) 9);
                x340Var2.s0(objT2);
            }
            s3o1.e(qim0VarB, xtb0VarA, zzq0Var, d36Var, (pl3) null, (iq20) null, (h3h1) null, (iu30) objT2, x340Var2, 0, 232);
        }
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        xv50 xv50Var = (xv50) obj2;
        int iIntValue = ((Number) obj5).intValue();
        i0p1.d(xv50Var.b, xv50Var.c, (iu30) obj3, (i8h1) this.b.g, xv50Var.a, (qim0) null, xv50Var.d, xv50Var.e, (b0k) obj4, iIntValue & 896);
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iIntValue = ((Number) obj5).intValue();
        this.b.e((b460) obj2, (b0k) obj4, (iIntValue >> 3) & 14);
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        t660 t660Var = (t660) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 48) == 0) {
            i = (x340Var.g(t660Var) ? 32 : 16) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 1169) != 1168)) {
            this.b.e(t660Var, iu30Var, x340Var2, (i >> 3) & 126);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        b0k b0kVar = (b0k) obj4;
        ((Number) obj5).intValue();
        tm tmVar = this.b;
        nyx.a(2, (wux) null, apo.r(-296268288, new cb60(tmVar, (ab60) obj2, new zfx(((xfx) tmVar.c).c, (byte) 28), iu30Var, (byte) 0), b0kVar), b0kVar, 3078, 6);
        return rih1.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        nb60 nb60Var = (nb60) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        mb60 mb60Var = nb60Var.a;
        ArrayList arrayListA = mb60Var.a();
        cmt cmtVar = mb60Var.c;
        String str = mb60Var.d;
        String str2 = mb60Var.e;
        String str3 = nb60Var.b;
        String str4 = mb60Var.f;
        ob60 ob60Var = this.b;
        ijp ijpVar = ob60Var.a;
        jjp jjpVar = ob60Var.b;
        kjp kjpVar = ob60Var.c;
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new d720(iu30Var, (byte) 9);
            x340Var2.s0(objT);
        }
        mmo1.l(arrayListA, cmtVar, str, str2, str3, str4, ijpVar, jjpVar, kjpVar, (qim0) null, (vu30) objT, x340Var2, 0);
        return rih1.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        b0k b0kVar = (b0k) obj4;
        ((Number) obj5).intValue();
        kiv kivVar = oi7.a;
        pe60 pe60Var = this.b;
        mod.b(kivVar.a(pe60Var.c), apo.r(1910203279, new bp50((me60) obj2, (iu30) obj3, pe60Var, (byte) 8), b0kVar), b0kVar, 56);
        return rih1.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Number) obj5).intValue();
        x340 x340Var = (b0k) obj4;
        wat watVar = (wat) x340Var.k(t4k.h);
        uwr uwrVar = cbx.a;
        lee1 lee1Var = cbx.d(x340Var).k;
        cpr0 cpr0Var = lee1Var.b;
        float fY = TextUnit.e(cpr0Var.c) ? watVar.y(cpr0Var.c) : watVar.y(lee1Var.a.b) * 1.3f;
        float fS = s1p1.s(gf60.d, x340Var);
        nim0 nim0Var = nim0.a;
        qim0 qim0VarB = u291.B(nim0Var, (gra) null, 3);
        gf60 gf60Var = this.b;
        mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
        int iHashCode = Long.hashCode(x340Var.T);
        xos0 xos0VarM = x340Var.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
        gf60Var.e(fS, fS, 0, 4, x340Var, (qim0) null);
        float f = fY;
        gf60Var.e(fS, f, 0, 0, x340Var, uyn1.B(nim0Var, 0.0f, 10.0f, 0.0f, 0.0f, 13));
        gf60Var.e(fS, f, 0, 0, x340Var, uyn1.B(nim0Var, 0.0f, 6.0f, 0.0f, 0.0f, 13));
        mta mtaVar = cbx.b(x340Var).d;
        cvx cvxVar = cbx.b(x340Var).b;
        gf60Var.e(32.0f, 32.0f, 0, 0, x340Var, uyn1.B(nim0Var, 0.0f, 12.0f, 0.0f, 0.0f, 13));
        x340Var.r(true);
        return rih1.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        b0k b0kVar = (b0k) obj4;
        ((Number) obj5).intValue();
        nyx.a(2, (wux) null, apo.r(676311299, new jj50((mf60) obj2, this.b, (byte) 12), b0kVar), b0kVar, 3078, 6);
        return rih1.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        boolean z = ((m980) this.b.d).b;
        urx urxVar = urx.c;
        String strO0 = cwl1.o0(x340Var, z ? 2131953866 : 2131953864);
        String strO1 = cwl1.o0(x340Var, z ? 2131953865 : 2131953863);
        boolean z2 = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z2 || objT == fkj0.X) {
            objT = new u460(iu30Var, (byte) 7);
            x340Var2.s0(objT);
        }
        kyo1.c(strO0, urxVar, (Function0) objT, (qim0) null, false, strO1, (v2g) null, (vu30) null, x340Var2, urx.d << 3, 216);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        d0r d0rVar;
        boolean z;
        boolean z2;
        rih1 rih1Var;
        String str;
        Collection collection;
        j06 j06Var;
        int i;
        boolean z3;
        boolean z4;
        byte b = this.a;
        byte b2 = 17;
        f36 f36Var = h36.c;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        byte b3 = 14;
        boolean z5 = true;
        rih1 rih1Var2 = rih1.a;
        ni60 ni60Var = this.b;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj4;
                ((Number) obj5).intValue();
                mod.b(oi7.a.a(((ar30) ni60Var).d), apo.r(1516535361, new xh00((yq30) obj2, (iu30) obj3, (byte) 20), b0kVar), b0kVar, 56);
                return rih1Var2;
            case 1:
                f140 f140Var = (f140) obj2;
                b0k b0kVar2 = (b0k) obj4;
                ((Number) obj5).intValue();
                g140 g140Var = (g140) ni60Var;
                lzj.a(f140Var.d, g140Var.g, g140Var.f, b0kVar2, 0);
                k4k.g(f140Var.a, f140Var.b, f140Var.c, g140Var.a, g140Var.b, g140Var.c, g140Var.d, g140Var.e, g140Var.g, (qim0) null, b0kVar2, 0);
                return rih1Var2;
            case 2:
                x340 x340Var = (b0k) obj4;
                ((Number) obj5).intValue();
                m4c m4cVar = fkj0.X;
                t540 t540Var = (t540) ni60Var;
                r540 r540Var = ((p540) obj2).a;
                if (r540Var != null) {
                    if (r540Var instanceof r540) {
                        x340 x340Var2 = x340Var;
                        x340Var2.i0(-678415919);
                        Object objT = x340Var2.T();
                        if (objT == m4cVar) {
                            objT = (nzh1) t540Var.a.get();
                            x340Var2.s0(objT);
                        }
                        nzh1 nzh1Var = (nzh1) objT;
                        nzh1Var.getClass();
                        otw.c(nzh1Var, r540Var.a, (qim0) null, (ipb1) null, x340Var2, 0, 12);
                        x340Var2.r(false);
                    } else {
                        if (!(r540Var instanceof q540)) {
                            throw p3d1.k(x340Var, 1640680958, false);
                        }
                        x340 x340Var3 = x340Var;
                        x340Var3.i0(-678247279);
                        Object objT2 = x340Var3.T();
                        if (objT2 == m4cVar) {
                            objT2 = (s7y) t540Var.b.get();
                            x340Var3.s0(objT2);
                        }
                        s7y s7yVar = (s7y) objT2;
                        s7yVar.getClass();
                        otw.c(s7yVar, ((q540) r540Var).a, (qim0) null, (ipb1) null, x340Var3, 0, 12);
                        x340Var3.r(false);
                    }
                }
                return rih1Var2;
            case 3:
                tnb1 tnb1Var = (tnb1) obj2;
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var4 = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                if (tnb1Var.f) {
                    String str2 = tnb1Var.a;
                    String str3 = tnb1Var.b;
                    String str4 = tnb1Var.e;
                    gw70 gw70Var = (gw70) ((el9) ni60Var).i;
                    boolean z6 = (((iIntValue & 896) ^ 384) > 256 && x340Var4.g(iu30Var)) || (iIntValue & 384) == 256;
                    x340 x340Var5 = x340Var4;
                    Object objT3 = x340Var5.T();
                    if (z6 || objT3 == fkj0.X) {
                        objT3 = new bb30(iu30Var, (byte) 13);
                        x340Var5.s0(objT3);
                    }
                    bin.e(str2, str3, str4, gw70Var, (Function0) objT3, (qim0) null, x340Var5, 0);
                }
                return rih1Var2;
            case 4:
                tnb1 tnb1Var2 = (tnb1) obj2;
                iu30 iu30Var2 = (iu30) obj3;
                int iIntValue2 = ((Number) obj5).intValue();
                m4c m4cVar2 = fkj0.X;
                x340 x340Var6 = (b0k) obj4;
                View view = (View) x340Var6.k(AndroidCompositionLocals_androidKt.f);
                boolean z7 = tnb1Var2.f;
                Boolean boolValueOf = Boolean.valueOf(z7);
                boolean zI = x340Var6.i(view) | x340Var6.i(tnb1Var2);
                Object objT4 = x340Var6.T();
                if (zI || objT4 == m4cVar2) {
                    objT4 = new h210(view, tnb1Var2, (lnm) null, (byte) 18);
                    x340Var6.s0(objT4);
                }
                qxd0.t(boolValueOf, x340Var6, (vu30) objT4);
                if (z7) {
                    String str5 = tnb1Var2.a;
                    String str6 = tnb1Var2.b;
                    String str7 = tnb1Var2.e;
                    gw70 gw70Var2 = ((rn8) ni60Var).b;
                    boolean z8 = (((iIntValue2 & 896) ^ 384) > 256 && x340Var6.g(iu30Var2)) || (iIntValue2 & 384) == 256;
                    Object objT5 = x340Var6.T();
                    if (z8 || objT5 == m4cVar2) {
                        objT5 = new bb30(iu30Var2, b3);
                        x340Var6.s0(objT5);
                    }
                    bin.e(str5, str6, str7, gw70Var2, (Function0) objT5, (qim0) null, x340Var6, 0);
                }
                return rih1Var2;
            case 5:
                ne40 ne40Var = (ne40) obj2;
                ((Number) obj5).intValue();
                m4c m4cVar3 = fkj0.X;
                String str8 = ne40Var.a;
                boolean z9 = ne40Var.d;
                boolean z10 = ne40Var.c;
                x340 x340Var7 = (b0k) obj4;
                boolean zH = x340Var7.h(z10);
                tm tmVar = (tm) ni60Var;
                d0r d0rVar2 = (d0r) tmVar.c;
                Object objT6 = x340Var7.T();
                if (zH || objT6 == m4cVar3) {
                    oa11 oa11VarA = z10 ? ((jcq) tmVar.d).a(d0rVar2) : null;
                    x340Var7.s0(oa11VarA);
                    objT6 = oa11VarA;
                }
                tyq tyqVar = (tyq) objT6;
                boolean zH2 = x340Var7.h(z9);
                Object objT7 = x340Var7.T();
                if (zH2 || objT7 == m4cVar3) {
                    qlb qlbVar = z9 ? new qlb(d0rVar2, new jd6(d0rVar2, (e2w) ((d2w) tmVar.e).a.get()), w3p1.o(new l4r(new xv00(rc11.a.b(hll.class)), 2, axv.V0, new j4r(axv.X0), axv.W0), axv.Y0)) : null;
                    x340Var7.s0(qlbVar);
                    objT7 = qlbVar;
                }
                tyq tyqVar2 = (tyq) objT7;
                qim0 qim0VarT = l6o1.t(nim0Var, l6o1.C(0, 0, 1, x340Var7), 14);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var7).b;
                qim0 qim0VarX = j9k1.x(qim0VarT, new ac8(3, (byte) 12));
                cvx cvxVar2 = cbx.b(x340Var7).b;
                jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), een.Z, x340Var7, 0);
                int iHashCode = Long.hashCode(x340Var7.T);
                xos0 xos0VarM = x340Var7.m();
                qim0 qim0VarE = zr7.E(x340Var7, qim0VarX);
                hzj.A.getClass();
                if (x340Var7.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var7.m0();
                if (x340Var7.S) {
                    x340Var7.l(n4kVar);
                } else {
                    x340Var7.v0();
                }
                nko1.H(jw31VarA, x340Var7, y580.O0);
                nko1.H(xos0VarM, x340Var7, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var7, y580.R0);
                nko1.F(x340Var7);
                nko1.H(qim0VarE, x340Var7, y580.Y);
                if (tyqVar == null) {
                    x340Var7.i0(-1971310477);
                    x340Var7.r(false);
                    d0rVar = d0rVar2;
                    z = false;
                } else {
                    x340Var7.i0(-1587611314);
                    d0rVar = d0rVar2;
                    i1o1.e(tyqVar, new ka11(str8), d0rVar, (qim0) null, (ipb1) null, (vu30) null, (xu30) null, 0, (xu30) null, x340Var7, 0, 252);
                    z = false;
                    x340Var7.r(false);
                }
                if (tyqVar2 == null) {
                    x340Var7.i0(-1971146766);
                    x340Var7.r(z);
                } else {
                    x340Var7.i0(-1587606033);
                    i1o1.e(tyqVar2, new c2w(8, str8, ne40Var.b), d0rVar, (qim0) null, (ipb1) null, (vu30) null, (xu30) null, 0, (xu30) null, x340Var7, 0, 252);
                    x340Var7.r(false);
                }
                cvx cvxVar3 = cbx.b(x340Var7).b;
                ab80.p(nim0Var, 8.0f, x340Var7, true);
                return rih1Var2;
            case 6:
                uf40 uf40Var = (uf40) obj2;
                x340 x340Var8 = (b0k) obj4;
                int iIntValue3 = ((Number) obj5).intValue();
                ng20 ng20Var = (ng20) ni60Var;
                mbh mbhVarA = jbh.a(f36Var, een.P0, x340Var8, 0);
                x340 x340Var9 = x340Var8;
                int iHashCode2 = Long.hashCode(x340Var9.T);
                xos0 xos0VarM2 = x340Var9.m();
                qim0 qim0VarE2 = zr7.E(x340Var8, nim0Var);
                hzj.A.getClass();
                x340 x340Var10 = x340Var8;
                if (x340Var10.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var10.m0();
                if (x340Var10.S) {
                    x340Var10.l(n4kVar);
                } else {
                    x340Var10.v0();
                }
                nko1.H(mbhVarA, x340Var8, y580.O0);
                nko1.H(xos0VarM2, x340Var8, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var8, y580.R0);
                nko1.F(x340Var8);
                nko1.H(qim0VarE2, x340Var8, y580.Y);
                vhx0 vhx0Var = uf40Var.c;
                if (vhx0Var == null) {
                    x340Var10.i0(-2137480090);
                    x340Var10.r(false);
                    z2 = false;
                    rih1Var = null;
                } else {
                    x340Var10.i0(-2137480089);
                    dsa0.c(vhx0Var, uf40Var.d, (qim0) null, apo.r(-587903347, new xh00(ng20Var, uf40Var, (byte) 23), x340Var8), x340Var8, 3072);
                    z2 = false;
                    x340Var10.r(false);
                    rih1Var = rih1Var2;
                }
                if (rih1Var == null) {
                    x340Var10.i0(1732171789);
                    ng20Var.h(uf40Var, x340Var8, (iIntValue3 >> 3) & 14);
                } else {
                    x340Var10.i0(1732163667);
                }
                x340Var10.r(z2);
                x340Var10.r(true);
                return rih1Var2;
            case 7:
                rwq0.d((as40) obj2, (qim0) null, ((bs40) ni60Var).a, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 14);
                return rih1Var2;
            case 8:
                yt40 yt40Var = (yt40) obj2;
                iu30 iu30Var3 = (iu30) obj3;
                int iIntValue4 = ((Number) obj5).intValue();
                m4c m4cVar4 = fkj0.X;
                tm tmVar2 = (tm) ni60Var;
                x340 x340Var11 = (b0k) obj4;
                boolean zI2 = x340Var11.i(tmVar2);
                Object objT8 = x340Var11.T();
                if (zI2 || objT8 == m4cVar4) {
                    objT8 = new j020(tmVar2, null, (byte) 16);
                    x340Var11.s0(objT8);
                }
                qxd0.t(rih1Var2, x340Var11, (vu30) objT8);
                boolean z11 = (((iIntValue4 & 112) ^ 48) > 32 && x340Var11.g(yt40Var)) || (iIntValue4 & 48) == 32;
                Object objT9 = x340Var11.T();
                if (z11 || objT9 == m4cVar4) {
                    objT9 = new u830(yt40Var, (byte) 20);
                    x340Var11.s0(objT9);
                }
                qxd0.i(rih1Var2, (iu30) objT9, x340Var11);
                mod.b(oi7.a.a((gw70) tmVar2.e), apo.r(-1466596772, new xh00(yt40Var, iu30Var3, (byte) 24), x340Var11), x340Var11, 56);
                return rih1Var2;
            case 9:
                bz40 bz40Var = (bz40) obj2;
                op71.d(bz40Var.a, bz40Var.b, bz40Var.c, bz40Var.d, ((gdx0) ((pt) ni60Var).f).a.b(), (iu30) obj3, (qim0) null, (b0k) obj4, (((Number) obj5).intValue() << 9) & 458752);
                return rih1Var2;
            case 10:
                ((Number) obj5).intValue();
                xpn1.d(((gf50) ni60Var).a, (qim0) null, (b0k) obj4, 0);
                return rih1Var2;
            case 11:
                llj lljVar = y580.Y;
                llj lljVar2 = y580.R0;
                llj lljVar3 = y580.N0;
                llj lljVar4 = y580.O0;
                ti50 ti50Var = (ti50) obj2;
                ((Number) obj5).intValue();
                String str9 = ti50Var.a;
                Collection collection2 = ti50Var.e;
                x340 x340Var12 = (b0k) obj4;
                boolean zG = x340Var12.g(collection2);
                j06 j06Var2 = x340Var12.a;
                yxb0 yxb0Var = (yxb0) ni60Var;
                Object objT10 = x340Var12.T();
                dwm dwmVar = dwm.a;
                if (zG || objT10 == fkj0.X) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj6 : collection2) {
                        j06 j06Var3 = j06Var2;
                        String str10 = str9;
                        Collection collection3 = collection2;
                        if (u890.j(((jwm) obj6).a.a, (String) yxb0Var.c)) {
                            arrayList2.add(obj6);
                        } else {
                            arrayList.add(obj6);
                        }
                        str9 = str10;
                        j06Var2 = j06Var3;
                        collection2 = collection3;
                    }
                    str = str9;
                    collection = collection2;
                    j06Var = j06Var2;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj7 : arrayList) {
                        if (!u890.j(((jwm) obj7).c, dwmVar)) {
                            arrayList3.add(obj7);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        arrayList4.add(((jwm) it.next()).a);
                    }
                    mmr0 mmr0Var = new mmr0(mqo1.A(arrayList4), ((jwm) o7h.q0(arrayList2)).a);
                    x340Var12.s0(mmr0Var);
                    objT10 = mmr0Var;
                } else {
                    str = str9;
                    collection = collection2;
                    j06Var = j06Var2;
                }
                mmr0 mmr0Var2 = (mmr0) objT10;
                c380 c380Var = (c380) mmr0Var2.a;
                w4i1 w4i1Var = (w4i1) mmr0Var2.b;
                mbh mbhVarA2 = jbh.a(f36Var, een.P0, x340Var12, 0);
                int iHashCode3 = Long.hashCode(x340Var12.T);
                xos0 xos0VarM3 = x340Var12.m();
                qim0 qim0VarE3 = zr7.E(x340Var12, nim0Var);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var12.m0();
                if (x340Var12.S) {
                    x340Var12.l(n4kVar);
                } else {
                    x340Var12.v0();
                }
                nko1.H(mbhVarA2, x340Var12, lljVar4);
                nko1.H(xos0VarM3, x340Var12, lljVar3);
                x0d.q(iHashCode3, x340Var12, lljVar2, x340Var12);
                nko1.H(qim0VarE3, x340Var12, lljVar);
                na9 na9Var = (na9) yxb0Var.d;
                String str11 = ti50Var.a;
                String str12 = ti50Var.b;
                if (collection == null || !collection.isEmpty()) {
                    Iterator it2 = collection.iterator();
                    int i2 = 0;
                    while (it2.hasNext()) {
                        if (!u890.j(((jwm) it2.next()).c, dwmVar) && (i2 = i2 + 1) < 0) {
                            p7h.S();
                            throw null;
                        }
                    }
                    i = i2;
                } else {
                    i = 0;
                }
                si50 si50Var = new si50(str11, str12, w4i1Var, c380Var, i);
                Parcelable.Creator creator = w4i1.CREATOR;
                otw.c(na9Var, si50Var, (qim0) null, (ipb1) null, x340Var12, 0, 12);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar4 = cbx.b(x340Var12).b;
                cvx cvxVar5 = cbx.b(x340Var12).b;
                qim0 qim0VarY = uyn1.y(nim0Var, 16.0f, 8.0f);
                fra fraVar = een.N0;
                cvx cvxVar6 = cbx.b(x340Var12).b;
                jw31 jw31VarA2 = ew31.a(new d36(8.0f, true, new g21(een.Q0, (byte) 29)), fraVar, x340Var12, 0);
                int iHashCode4 = Long.hashCode(x340Var12.T);
                xos0 xos0VarM4 = x340Var12.m();
                qim0 qim0VarE4 = zr7.E(x340Var12, qim0VarY);
                hzj.A.getClass();
                x340Var12.m0();
                if (x340Var12.S) {
                    x340Var12.l(n4kVar);
                } else {
                    x340Var12.v0();
                }
                nko1.H(jw31VarA2, x340Var12, lljVar4);
                nko1.H(xos0VarM4, x340Var12, lljVar3);
                x0d.q(iHashCode4, x340Var12, lljVar2, x340Var12);
                nko1.H(qim0VarE4, x340Var12, lljVar);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode5 = Long.hashCode(x340Var12.T);
                xos0 xos0VarM5 = x340Var12.m();
                qim0 qim0VarE5 = zr7.E(x340Var12, nim0Var);
                x340Var12.m0();
                if (x340Var12.S) {
                    x340Var12.l(n4kVar);
                } else {
                    x340Var12.v0();
                }
                nko1.H(gfh0VarC, x340Var12, lljVar4);
                nko1.H(xos0VarM5, x340Var12, lljVar3);
                x0d.q(iHashCode5, x340Var12, lljVar2, x340Var12);
                nko1.H(qim0VarE5, x340Var12, lljVar);
                String str13 = str;
                otw.c((umf0) yxb0Var.f, new xi50(str13, collection, ti50Var.c.a()), (qim0) null, (ipb1) null, x340Var12, 0, 12);
                x340Var12.r(true);
                otw.c((w4f) yxb0Var.e, new t4f(str, "spotify:chat-details:".concat(str13), (String) yxb0Var.c, ti50Var.d, ti50Var.c), (qim0) null, (ipb1) null, x340Var12, 0, 12);
                x340Var12.r(true);
                x340Var12.r(true);
                return rih1Var2;
            case 12:
                ak50 ak50Var = (ak50) obj2;
                iu30 iu30Var4 = (iu30) obj3;
                x340 x340Var13 = (b0k) obj4;
                int iIntValue5 = ((Number) obj5).intValue();
                if (ak50Var instanceof zj50) {
                    x340 x340Var14 = x340Var13;
                    x340Var14.i0(-1894617047);
                    x340Var14.r(false);
                } else {
                    if (!(ak50Var instanceof yj50)) {
                        throw p3d1.k(x340Var13, -1894618103, false);
                    }
                    x340 x340Var15 = x340Var13;
                    x340Var15.i0(-1894615660);
                    oqn1.d(((yj50) ak50Var).a, ((bk50) ni60Var).b, iu30Var4, x340Var15, iIntValue5 & 896);
                    x340Var15.r(false);
                }
                return rih1Var2;
            case 13:
                cn50 cn50Var = (cn50) obj2;
                iu30 iu30Var5 = (iu30) obj3;
                x340 x340Var16 = (b0k) obj4;
                int iIntValue6 = ((Number) obj5).intValue();
                hn50 hn50Var = (hn50) ni60Var;
                m4c m4cVar5 = fkj0.X;
                int i3 = (iIntValue6 & 896) ^ 384;
                boolean z12 = (i3 > 256 && x340Var16.g(iu30Var5)) || (iIntValue6 & 384) == 256;
                x340 x340Var17 = x340Var16;
                Object objT11 = x340Var17.T();
                if (z12 || objT11 == m4cVar5) {
                    objT11 = new z720(iu30Var5, (byte) 16);
                    x340Var17.s0(objT11);
                }
                add addVar = hn50Var.e;
                ic9 ic9Var = hn50Var.a;
                Context context = (Context) ic9Var.b;
                mqn1.a(0, x340Var17, (iu30) objT11, (qim0) null, addVar.f());
                int i4 = cn50Var.b;
                if (i4 == 0) {
                    x340Var17.i0(-1164513337);
                    x340Var17.r(false);
                    z3 = false;
                } else {
                    x340Var17.i0(-1164513336);
                    int iC = l1d.C(i4);
                    if (iC == 0) {
                        x340Var17.i0(473906557);
                        boolean z13 = (i3 > 256 && x340Var17.g(iu30Var5)) || (iIntValue6 & 384) == 256;
                        Object objT12 = x340Var17.T();
                        if (z13 || objT12 == m4cVar5) {
                            objT12 = new g850(iu30Var5, (byte) 13);
                            x340Var17.s0(objT12);
                        }
                        ic9Var.q(context.getString(2131953684), (Function0) objT12);
                        z3 = false;
                        x340Var17.r(false);
                    } else {
                        if (iC != 1) {
                            throw p3d1.k(x340Var17, 473904956, false);
                        }
                        x340Var17.i0(1806296613);
                        boolean z14 = (i3 > 256 && x340Var17.g(iu30Var5)) || (iIntValue6 & 384) == 256;
                        Object objT13 = x340Var17.T();
                        if (z14 || objT13 == m4cVar5) {
                            objT13 = new g850(iu30Var5, b3);
                            x340Var17.s0(objT13);
                        }
                        ic9Var.q(context.getString(2131958525), (Function0) objT13);
                        z3 = false;
                        x340Var17.r(false);
                    }
                    x340Var17.r(z3);
                }
                int i5 = cn50Var.c;
                if (i5 == 0) {
                    x340Var17.i0(-1164194285);
                    x340Var17.r(z3);
                } else {
                    x340Var17.i0(-1164194284);
                    int iC2 = l1d.C(i5);
                    if (iC2 == 0) {
                        x340Var17.i0(-326829026);
                        boolean z15 = (i3 > 256 && x340Var17.g(iu30Var5)) || (iIntValue6 & 384) == 256;
                        Object objT14 = x340Var17.T();
                        if (z15 || objT14 == m4cVar5) {
                            objT14 = new g850(iu30Var5, (byte) 15);
                            x340Var17.s0(objT14);
                        }
                        Function0 function0 = (Function0) objT14;
                        if ((i3 <= 256 || !x340Var17.g(iu30Var5)) && (iIntValue6 & 384) != 256) {
                            z5 = false;
                        }
                        Object objT15 = x340Var17.T();
                        if (z5 || objT15 == m4cVar5) {
                            objT15 = new g850(iu30Var5, (byte) 16);
                            x340Var17.s0(objT15);
                        }
                        z4 = false;
                        vpb1.c(function0, (Function0) objT15, x340Var17, 0);
                        x340Var17.r(false);
                    } else if (iC2 == 1) {
                        x340Var17.i0(-326820940);
                        List list = hn50Var.b;
                        ArrayList arrayList5 = new ArrayList(q7h.U(list, 10));
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            arrayList5.add(((w4i1) it3.next()).b);
                        }
                        c380 c380VarA = mqo1.A(arrayList5);
                        boolean z16 = (i3 > 256 && x340Var17.g(iu30Var5)) || (iIntValue6 & 384) == 256;
                        Object objT16 = x340Var17.T();
                        if (z16 || objT16 == m4cVar5) {
                            objT16 = new g850(iu30Var5, (byte) 17);
                            x340Var17.s0(objT16);
                        }
                        Function0 function1 = (Function0) objT16;
                        boolean z17 = (i3 > 256 && x340Var17.g(iu30Var5)) || (iIntValue6 & 384) == 256;
                        Object objT17 = x340Var17.T();
                        if (z17 || objT17 == m4cVar5) {
                            objT17 = new g850(iu30Var5, (byte) 18);
                            x340Var17.s0(objT17);
                        }
                        Function0 function2 = (Function0) objT17;
                        if ((i3 <= 256 || !x340Var17.g(iu30Var5)) && (iIntValue6 & 384) != 256) {
                            z5 = false;
                        }
                        Object objT18 = x340Var17.T();
                        if (z5 || objT18 == m4cVar5) {
                            objT18 = new g850(iu30Var5, (byte) 19);
                            x340Var17.s0(objT18);
                        }
                        wpb1.f(c380VarA, function1, function2, (Function0) objT18, x340Var17, 0);
                        x340Var17.r(false);
                        z4 = false;
                    } else {
                        if (iC2 != 2) {
                            throw p3d1.k(x340Var17, -326830411, false);
                        }
                        x340Var17.i0(-326808750);
                        boolean z18 = (i3 > 256 && x340Var17.g(iu30Var5)) || (iIntValue6 & 384) == 256;
                        Object objT19 = x340Var17.T();
                        if (z18 || objT19 == m4cVar5) {
                            objT19 = new g850(iu30Var5, (byte) 20);
                            x340Var17.s0(objT19);
                        }
                        Function0 function3 = (Function0) objT19;
                        if ((i3 <= 256 || !x340Var17.g(iu30Var5)) && (iIntValue6 & 384) != 256) {
                            z5 = false;
                        }
                        Object objT20 = x340Var17.T();
                        if (z5 || objT20 == m4cVar5) {
                            objT20 = new g850(iu30Var5, (byte) 21);
                            x340Var17.s0(objT20);
                        }
                        z4 = false;
                        yap1.a(function3, (Function0) objT20, x340Var17, 0);
                        x340Var17.r(false);
                    }
                    x340Var17.r(z4);
                }
                return rih1Var2;
            case 14:
                un50 un50Var = (un50) obj2;
                iu30 iu30Var6 = (iu30) obj3;
                int iIntValue7 = ((Number) obj5).intValue();
                Object obj8 = fkj0.X;
                String str14 = un50Var.c;
                List list2 = un50Var.a;
                x340 x340Var18 = (b0k) obj4;
                boolean zG2 = x340Var18.g(list2);
                Object objT21 = x340Var18.T();
                if (zG2 || objT21 == obj8) {
                    objT21 = o7h.y0(list2, ", ", (String) null, (String) null, em50.c, 30);
                    x340Var18.s0(objT21);
                }
                String str15 = (String) objT21;
                String str16 = str14.length() == 0 ? str15 : str14;
                if (str14.length() <= 0) {
                    str15 = null;
                }
                rgi1 rgi1Var = new rgi1(list2, str16, str15, new mgi1(new pgi1(cwl1.o0(x340Var18, 2131956490), plx.c, (Function0) null)));
                gw70 gw70Var3 = ((wn50) ni60Var).b;
                if ((((iIntValue7 & 896) ^ 384) <= 256 || !x340Var18.g(iu30Var6)) && (iIntValue7 & 384) != 256) {
                    z5 = false;
                }
                Object objT22 = x340Var18.T();
                if (z5 || objT22 == obj8) {
                    objT22 = new g850(iu30Var6, (byte) 22);
                    x340Var18.s0(objT22);
                }
                ero1.f(rgi1Var, (Function0) objT22, gw70Var3, (qim0) null, x340Var18, 0, 8);
                return rih1Var2;
            case 15:
                b0k b0kVar3 = (b0k) obj4;
                ((Number) obj5).intValue();
                qj0 qj0Var = (qj0) ni60Var;
                ((j2i) qj0Var.e).invoke(apo.r(225979413, new xx00((qo50) obj2, qj0Var, (iu30) obj3, (byte) 29), b0kVar3), b0kVar3, 6);
                return rih1Var2;
            case 16:
                return a(obj, obj2, obj3, obj4, obj5);
            case 17:
                up50 up50Var = (up50) obj2;
                iu30 iu30Var7 = (iu30) obj3;
                x340 x340Var19 = (b0k) obj4;
                int iIntValue8 = ((Number) obj5).intValue();
                int i6 = (iIntValue8 & 48) == 0 ? iIntValue8 | (x340Var19.g(up50Var) ? 32 : 16) : iIntValue8;
                if ((iIntValue8 & 384) == 0) {
                    i6 |= x340Var19.i(iu30Var7) ? 256 : 128;
                }
                x340 x340Var20 = x340Var19;
                if (!x340Var20.Y(i6 & 1, (i6 & 1169) != 1168)) {
                    x340Var20.b0();
                    return rih1Var2;
                }
                zv31 zv31Var = up50Var.a.a;
                wp50 wp50Var = (wp50) ni60Var;
                mbh mbhVarA3 = jbh.a(f36Var, een.P0, x340Var20, 0);
                int iHashCode6 = Long.hashCode(x340Var20.T);
                xos0 xos0VarM6 = x340Var20.m();
                qim0 qim0VarE6 = zr7.E(x340Var20, nim0Var);
                hzj.A.getClass();
                if (x340Var20.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var20.m0();
                if (x340Var20.S) {
                    x340Var20.l(n4kVar);
                } else {
                    x340Var20.v0();
                }
                nko1.H(mbhVarA3, x340Var20, y580.O0);
                nko1.H(xos0VarM6, x340Var20, y580.N0);
                nko1.H(Integer.valueOf(iHashCode6), x340Var20, y580.R0);
                nko1.F(x340Var20);
                nko1.H(qim0VarE6, x340Var20, y580.Y);
                boolean z19 = up50Var.b;
                boolean z20 = (i6 & 896) == 256;
                Object objT23 = x340Var20.T();
                if (z20 || objT23 == fkj0.X) {
                    objT23 = new z720(iu30Var7, b2);
                    x340Var20.s0(objT23);
                }
                nyn1.n(zv31Var, z19, (iu30) objT23, (qim0) null, x340Var20, 0);
                op50 op50Var = (op50) zv31Var.j;
                if (op50Var.e == null || op50Var.g) {
                    x340Var20.i0(603972098);
                    x340Var20.r(false);
                } else {
                    x340Var20.i0(603316696);
                    ryn1.e(6, apo.r(1798344863, new jj50(wp50Var, zv31Var, (byte) 1), x340Var20), x340Var20);
                    x340Var20.r(false);
                }
                x340Var20.r(true);
                return rih1Var2;
            case 18:
                return d(obj, obj2, obj3, obj4, obj5);
            case 19:
                return e(obj, obj2, obj3, obj4, obj5);
            case 20:
                return f(obj, obj2, obj3, obj4, obj5);
            case 21:
                return g(obj, obj2, obj3, obj4, obj5);
            case 22:
                return h(obj, obj2, obj3, obj4, obj5);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return i(obj, obj2, obj3, obj4, obj5);
            case 24:
                return j(obj, obj2, obj3, obj4, obj5);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return k(obj, obj2, obj3, obj4, obj5);
            case 26:
                return m(obj, obj2, obj3, obj4, obj5);
            case 27:
                return n(obj, obj2, obj3, obj4, obj5);
            case 28:
                return o(obj, obj2, obj3, obj4, obj5);
            default:
                int iIntValue9 = ((Number) obj5).intValue() >> 3;
                ni60Var.a.f((zh60) obj2, (iu30) obj3, (b0k) obj4, (iIntValue9 & 112) | (iIntValue9 & 14) | 384);
                return rih1Var2;
        }
    }
}
