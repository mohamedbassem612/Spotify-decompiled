package p;

import android.content.Context;
import android.content.res.Resources;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import j$.time.Clock;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wv60 extends hab0 implements bv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wv60(Object obj, byte b) {
        super(5);
        this.a = b;
        this.b = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        hax haxVar;
        boolean z;
        ly80 ly80Var = (ly80) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        jy80 jy80Var = ly80Var.u;
        ven0 ven0VarS = v8r.s(ly80Var, x340Var);
        ven0 ven0VarS2 = v8r.s(iu30Var, x340Var);
        bz80 bz80Var = (bz80) this.b;
        fq2 fq2Var = bz80Var.i;
        bp60 bp60Var = (bp60) fq2Var.b0.getValue();
        boolean z2 = ly80Var.h;
        if (!z2 || bp60Var == null) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(763117170);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(762980708);
            boolean zI = x340Var3.i(bp60Var) | x340Var3.i(ven0VarS2);
            Object objT = x340Var3.T();
            if (zI || objT == m4cVar) {
                objT = new x060(bp60Var, ven0VarS2, (lnm) null, (byte) 23);
                x340Var3.s0(objT);
            }
            qxd0.t(bp60Var, x340Var3, (vu30) objT);
            x340Var3.r(false);
        }
        if (z2) {
            x340 x340Var4 = x340Var;
            x340Var4.i0(763162988);
            boolean zI2 = x340Var4.i(bz80Var) | x340Var4.i(ven0VarS2);
            Object objT2 = x340Var4.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new x060(bz80Var, ven0VarS2, (lnm) null, (byte) 24);
                x340Var4.s0(objT2);
            }
            qxd0.t(fq2Var, x340Var4, (vu30) objT2);
            x340Var4.r(false);
        } else {
            x340 x340Var5 = x340Var;
            x340Var5.i0(763414770);
            x340Var5.r(false);
        }
        int i = jy80Var == null ? -1 : zy80.a[jy80Var.ordinal()];
        boolean z3 = true;
        if (i == -1) {
            x340 x340Var6 = x340Var;
            x340Var6.i0(1271567902);
            haxVar = (max) bz80Var.Z.invoke(x340Var6, 0);
            x340Var6.r(false);
        } else if (i == 1) {
            x340 x340Var7 = x340Var;
            x340Var7.i0(1271556552);
            haxVar = new hax(cwl1.o0(x340Var7, 2131956727));
            x340Var7.r(false);
        } else if (i != 2) {
            if (i != 3) {
                throw p3d1.k(x340Var, 1271553712, false);
            }
            x340 x340Var8 = x340Var;
            x340Var8.i0(1271567902);
            haxVar = (max) bz80Var.Z.invoke(x340Var8, 0);
            x340Var8.r(false);
        } else {
            x340 x340Var9 = x340Var;
            x340Var9.i0(1271562659);
            haxVar = new hax(cwl1.o0(x340Var9, 2131956735));
            x340Var9.r(false);
        }
        hax haxVar2 = haxVar;
        if (ly80Var.s) {
            x340 x340Var10 = x340Var;
            x340Var10.i0(763986534);
            String str = ly80Var.r;
            boolean z4 = jy80Var != null;
            if (z2) {
                x340Var10.i0(1271582702);
                z = !((Boolean) h7w.y(x340Var10).getValue()).booleanValue();
                x340Var10.r(false);
            } else {
                x340Var10.i0(764359335);
                x340Var10.r(false);
                z = false;
            }
            tra0 tra0Var = z ? bz80Var.Y : null;
            w9u0 w9u0Var = bz80Var.e;
            boolean z5 = ly80Var.n;
            String str2 = ly80Var.f27p;
            int i2 = (iIntValue & 896) ^ 384;
            boolean z6 = (i2 > 256 && x340Var10.g(iu30Var)) || (iIntValue & 384) == 256;
            Object objT3 = x340Var10.T();
            if (z6 || objT3 == m4cVar) {
                objT3 = new zi80(iu30Var, (byte) 7);
                x340Var10.s0(objT3);
            }
            Function0 function0 = (Function0) objT3;
            boolean z7 = (i2 > 256 && x340Var10.g(iu30Var)) || (iIntValue & 384) == 256;
            Object objT4 = x340Var10.T();
            if (z7 || objT4 == m4cVar) {
                objT4 = new bv70(iu30Var, (byte) 11);
                x340Var10.s0(objT4);
            }
            iu30 iu30Var2 = (iu30) objT4;
            if ((i2 <= 256 || !x340Var10.g(iu30Var)) && (iIntValue & 384) != 256) {
                z3 = false;
            }
            Object objT5 = x340Var10.T();
            if (z3 || objT5 == m4cVar) {
                objT5 = new zi80(iu30Var, (byte) 8);
                x340Var10.s0(objT5);
            }
            nz80.d(str, function0, iu30Var2, null, haxVar2, tra0Var, w9u0Var, z5, str2, (Function0) objT5, z4, x340Var10, 0);
            x340Var10.r(false);
        } else {
            x340 x340Var11 = x340Var;
            x340Var11.i0(764766866);
            x340Var11.r(false);
            Object objT6 = x340Var11.T();
            if (objT6 == m4cVar) {
                objT6 = kvp.b(bz80Var.d, bz80Var.e, bz80Var.f, new st60(bz80Var, ven0VarS, ven0VarS2, (byte) 20), new i030(ven0VarS2, (byte) 24), new i030(ven0VarS2, (byte) 25), (gqa0) null, new enk1(0L, tmk1.a, bz80Var.t.x(), 15), (qim0) null, (bp9) null, (Function0) null, 4000);
                x340Var11.s0(objT6);
            }
            orm0 orm0Var = (orm0) objT6;
            boolean z8 = (((iIntValue & 896) ^ 384) > 256 && x340Var11.g(iu30Var)) || (iIntValue & 384) == 256;
            Object objT7 = x340Var11.T();
            if (z8 || objT7 == m4cVar) {
                objT7 = new zi80(iu30Var, (byte) 9);
                x340Var11.s0(objT7);
            }
            Function0 function1 = (Function0) objT7;
            boolean z9 = ly80Var.b;
            String str3 = ly80Var.r;
            if (str3 == null) {
                str3 = ly80Var.a;
            }
            nz80.f(function1, null, z9, str3, haxVar2, 0.0f, jy80Var != null, apo.r(371751052, new yy80(orm0Var, (byte) 0), x340Var11), x340Var11, 12582912, 34);
        }
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        i2c i2cVar = (i2c) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 6) == 0) {
            i = (x340Var.g(i2cVar) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= x340Var.h(zBooleanValue) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var.h(zBooleanValue2) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 1171) != 1170)) {
            int i2 = i & 14;
            int i3 = i << 3;
            nln.g(i2cVar, (mq20) this.b, zBooleanValue, zBooleanValue2, x340Var2, i2 | (i3 & 896) | (i3 & 7168));
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        gex0 d36Var;
        qim0 qim0VarB;
        sl90 sl90Var = (sl90) obj2;
        x340 x340Var = (b0k) obj4;
        ((Number) obj5).intValue();
        vl90 vl90Var = (vl90) this.b;
        if (sl90Var instanceof ql90) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-976833531);
            ql90 ql90Var = (ql90) sl90Var;
            String strN0 = cwl1.n0(2131956883, new Object[]{Integer.valueOf(ql90Var.a), Integer.valueOf(ql90Var.b)}, x340Var2);
            fra fraVar = een.N0;
            boolean z = vl90Var.b;
            if (z) {
                x340Var2.i0(-976650135);
                x340Var2.r(false);
                d36Var = h36.a;
            } else {
                x340Var2.i0(-976600287);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                d36Var = new d36(4.0f, true, new um5(false));
                x340Var2.r(false);
            }
            boolean zG = x340Var2.g(strN0);
            Object objT = x340Var2.T();
            if (zG || objT == fkj0.X) {
                objT = new ry40(strN0, (byte) 22);
                x340Var2.s0(objT);
            }
            qim0 qim0Var = nim0.a;
            qim0 qim0VarB2 = s161.b(qim0Var, true, (iu30) objT);
            jw31 jw31VarA = ew31.a(d36Var, fraVar, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarB2);
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
            nko1.H(jw31VarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            String str = z ? " • " : "•";
            uwr uwrVar2 = cbx.a;
            uwo1.e(str, (qim0) null, cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2034);
            uwo1.e(f4i1.f("\u2068", strN0, "\u2069"), (qim0) null, cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2034);
            float f = ql90Var.c;
            if (z) {
                x340Var2.i0(422725970);
                cvx cvxVar2 = cbx.b(x340Var2).b;
                qim0VarB = uyn1.B(qim0Var, 4.0f, 0.0f, 0.0f, 0.0f, 14);
                x340Var2.r(false);
            } else {
                x340Var2.i0(422828487);
                x340Var2.r(false);
                qim0VarB = qim0Var;
            }
            zov0 zov0Var = cbx.b(x340Var2).g;
            tto1.d(f, 0, 12, 0L, 0L, x340Var2, u291.v(qim0VarB, 88.0f));
            x340Var2.r(true);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(-975373772);
            x340Var3.r(false);
        }
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        xp90 xp90Var = (xp90) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        svh0 svh0Var = (svh0) ((qj0) this.b).e;
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new bv70(iu30Var, (byte) 12);
            x340Var2.s0(objT);
        }
        vzn1.c(svh0Var, (iu30) objT, apo.r(1284449933, new jj50(xp90Var, iu30Var, (byte) 26), x340Var2), x340Var2, 392);
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        tu8 su8Var;
        pu8 pu8Var;
        os90 os90Var = (os90) obj2;
        b0k b0kVar = (b0k) obj4;
        ((Number) obj5).intValue();
        if (os90Var instanceof ns90) {
            ns90 ns90Var = (ns90) os90Var;
            m4o0 m4o0Var = ns90Var.a;
            boolean z = ns90Var.b;
            String str = ns90Var.c;
            h4o0 h4o0Var = h4o0.a;
            boolean zJ = u890.j(m4o0Var, h4o0Var);
            xo90 xo90Var = ns90Var.d;
            if (xo90Var == xo90.a && z && zJ) {
                su8Var = new su8(2131962307);
            } else if (xo90Var == xo90.c) {
                su8Var = new qu8();
            } else {
                if (xo90Var == xo90.b) {
                    pu8Var = new pu8(2131962307, new ys90(str, new bt90(true, !u890.j(m4o0Var, h4o0Var))));
                } else if (!zJ) {
                    pu8Var = new pu8(2131962307, new ys90(str, m4o0Var instanceof i4o0 ? new bt90(false, true) : zs90.a));
                } else {
                    if (z) {
                        eg.m("Invalid state");
                        return null;
                    }
                    su8Var = new pu8(2131962307, new ys90(str, at90.a));
                }
                su8Var = pu8Var;
            }
        } else {
            if (!(os90Var instanceof ms90)) {
                eg.o();
                return null;
            }
            ms90 ms90Var = (ms90) os90Var;
            int iOrdinal = ms90Var.b.ordinal();
            if (iOrdinal == 0) {
                su8Var = new su8(2131962309);
            } else if (iOrdinal == 1) {
                su8Var = new pu8(2131962309, new ys90(ms90Var.a, new bt90(true, false)));
            } else {
                if (iOrdinal != 2) {
                    eg.o();
                    return null;
                }
                su8Var = new qu8();
            }
        }
        qxd0.o(su8Var, ((ts90) this.b).d, b0kVar, 0);
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        boolean z;
        ys90 ys90Var = (ys90) obj2;
        iu30 iu30Var = (iu30) obj3;
        int iIntValue = ((Number) obj5).intValue();
        x340 x340Var = (b0k) obj4;
        x340Var.i0(-1275920906);
        et90 et90Var = (et90) this.b;
        StringBuilder sb = new StringBuilder(16);
        ArrayList arrayListM = xvj1.m();
        new ArrayList();
        ct90 ct90Var = ys90Var.b;
        if (ct90Var instanceof bt90) {
            i = 2131962312;
        } else if (ct90Var instanceof zs90) {
            i = 2131962306;
        } else {
            if (!(ct90Var instanceof at90)) {
                eg.o();
                return null;
            }
            i = 2131962310;
        }
        sb.append(cwl1.o0(x340Var, i));
        String string = sb.toString();
        ArrayList arrayList = new ArrayList(arrayListM.size());
        int size = arrayListM.size();
        int iG = 0;
        while (true) {
            z = true;
            if (iG >= size) {
                break;
            }
            iG = c13.g(sb, (xe5) arrayListM.get(iG), arrayList, iG, 1);
        }
        af5 af5Var = new af5(string, arrayList);
        x340Var.r(false);
        uwr uwrVar = cbx.a;
        lee1 lee1Var = cbx.d(x340Var).k;
        long j = cbx.a(x340Var).b.c;
        boolean zI = x340Var.i(et90Var) | ((((iIntValue & 112) ^ 48) > 32 && x340Var.i(ys90Var)) || (iIntValue & 48) == 32);
        if ((((iIntValue & 896) ^ 384) <= 256 || !x340Var.g(iu30Var)) && (iIntValue & 384) != 256) {
            z = false;
        }
        boolean z2 = zI | z;
        Object objT = x340Var.T();
        if (z2 || objT == fkj0.X) {
            objT = new dt90(et90Var, ys90Var, iu30Var, (byte) 0);
            x340Var.s0(objT);
        }
        uwo1.d(af5Var, j, anm1.N("autoInviteNearbyActionLinkButton", bin.x(nim0.a, false, (String) null, (pm31) null, (idn0) null, (Function0) objT, 15)), lee1Var, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var, 0, 0, 4080);
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        tt90 tt90Var = (tt90) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        res resVar = (res) this.b;
        svh0 svh0Var = (svh0) resVar.h;
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new bv70(iu30Var, (byte) 15);
            x340Var2.s0(objT);
        }
        vzn1.c(svh0Var, (iu30) objT, apo.r(-225155832, new mb90(resVar, tt90Var, iu30Var, (byte) 6), x340Var2), x340Var2, 392);
        return rih1.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        nw90 nw90Var = (nw90) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        qim0 qim0VarC = u291.c(nim0.a, 1.0f);
        rw90 rw90Var = (rw90) this.b;
        gfh0 gfh0VarC = t1c.c(een.d, false);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarC);
        hzj.A.getClass();
        x340 x340Var3 = x340Var;
        if (x340Var3.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var3.m0();
        if (x340Var3.S) {
            x340Var3.l(hmb0.t1);
        } else {
            x340Var3.v0();
        }
        nko1.H(gfh0VarC, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        acq0.p(nw90Var, rw90Var.b, rw90Var.c, rw90Var.d, rw90Var.e, rw90Var.f, rw90Var.a.h.a(), iu30Var, x340Var, ((iIntValue >> 3) & 14) | ((iIntValue << 15) & 29360128));
        x340Var3.r(true);
        return rih1.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        j2i j2iVarR;
        py90 py90Var = (py90) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        ew90 ew90Var = py90Var.b;
        boolean z = py90Var.d == 2;
        boolean z2 = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z2 || objT == fkj0.X) {
            objT = new ux90(iu30Var, (byte) 1);
            x340Var2.s0(objT);
        }
        Function0 function0 = (Function0) objT;
        if (ew90Var.h) {
            x340Var2.i0(305922436);
            j2iVarR = apo.r(-1367270013, new vx90((ldo) this.b, py90Var, (byte) 1), x340Var2);
            x340Var2.r(false);
        } else {
            x340Var2.i0(306242480);
            x340Var2.r(false);
            j2iVarR = null;
        }
        lmt0.f(ew90Var, z, function0, j2iVarR, x340Var2, 0);
        return rih1.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        w5a0 w5a0Var = (w5a0) obj2;
        int iIntValue = ((Number) obj5).intValue();
        x5a0 x5a0Var = w5a0Var.c;
        b0k b0kVar = (x340) ((b0k) obj4);
        b0kVar.i0(-1903213414);
        ((y5a0) this.b).j(w5a0Var.b, x5a0Var, (iu30) obj3, b0kVar, iIntValue & 896);
        b0kVar.r(false);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        boolean z;
        qim0 qim0VarX;
        vg41 vg41Var;
        nt80 nt80Var;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        n4k n4kVar = hmb0.t1;
        rih1 rih1Var = rih1.a;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                boolean z2 = true;
                tv60 tv60Var = (tv60) obj2;
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                m4c m4cVar = fkj0.X;
                xv60 xv60Var = (xv60) obj6;
                if (tv60Var instanceof rv60) {
                    x340 x340Var2 = x340Var;
                    x340Var2.i0(2129038996);
                    boolean zI = x340Var2.i(xv60Var);
                    Object objT = x340Var2.T();
                    if (zI || objT == m4cVar) {
                        objT = new n3s(xv60Var, (lnm) null, (byte) 24);
                        x340Var2.s0(objT);
                    }
                    qxd0.t(rih1Var, x340Var2, (vu30) objT);
                    x340Var2.r(false);
                } else {
                    if (!(tv60Var instanceof sv60)) {
                        throw p3d1.k(x340Var, 2129038277, false);
                    }
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(1575794205);
                    svh0 svh0Var = xv60Var.X;
                    if ((((iIntValue & 896) ^ 384) <= 256 || !x340Var3.g(iu30Var)) && (iIntValue & 384) != 256) {
                        z2 = false;
                    }
                    Object objT2 = x340Var3.T();
                    if (z2 || objT2 == m4cVar) {
                        objT2 = new z720(iu30Var, (byte) 24);
                        x340Var3.s0(objT2);
                    }
                    vzn1.c(svh0Var, (iu30) objT2, apo.r(664975114, new bp50(xv60Var, iu30Var, tv60Var, (byte) 11), x340Var3), x340Var3, 392);
                    x340Var3.r(false);
                }
                return rih1Var;
            case 1:
                dw60 dw60Var = (dw60) obj2;
                x340 x340Var4 = (b0k) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                Context context = (Context) ((ng20) obj6).b;
                if (dw60Var instanceof bw60) {
                    x340 x340Var5 = x340Var4;
                    x340Var5.i0(-1099982076);
                    x340Var5.r(false);
                } else {
                    if (!(dw60Var instanceof cw60)) {
                        throw p3d1.k(x340Var4, -1282410271, false);
                    }
                    x340 x340Var6 = x340Var4;
                    x340Var6.i0(-1099947573);
                    cw60 cw60Var = (cw60) dw60Var;
                    int i = cw60Var.d;
                    boolean z3 = cw60Var.e;
                    int i2 = z3 ? 2131820943 : i == 1 ? 2131820942 : 2131820941;
                    Resources resources = context.getResources();
                    int i3 = cw60Var.c;
                    xto1.j(cw60Var, resources.getQuantityString(i2, i3, cw60Var.b.b, Integer.valueOf(i3 - 1)), z3 ? context.getString(2131962992) : i == 1 ? context.getString(2131962987) : context.getString(2131962985), x340Var6, (iIntValue2 >> 3) & 14);
                    x340Var6.r(false);
                }
                return rih1Var;
            case 2:
                ww60 ww60Var = (ww60) obj2;
                iu30 iu30Var2 = (iu30) obj3;
                x340 x340Var7 = (b0k) obj4;
                int iIntValue3 = ((Number) obj5).intValue();
                m4c m4cVar2 = fkj0.X;
                cm0 cm0Var = (cm0) obj6;
                int i4 = (iIntValue3 & 48) == 0 ? (x340Var7.g(ww60Var) ? 32 : 16) | iIntValue3 : iIntValue3;
                if ((iIntValue3 & 384) == 0) {
                    i4 |= x340Var7.i(iu30Var2) ? 256 : 128;
                }
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(i4 & 1, (i4 & 1169) != 1168)) {
                    los losVar = (los) cm0Var.h;
                    int i5 = i4 & 896;
                    boolean z4 = i5 == 256;
                    Object objT3 = x340Var8.T();
                    if (z4 || objT3 == m4cVar2) {
                        objT3 = new u460(iu30Var2, (byte) 13);
                        x340Var8.s0(objT3);
                    }
                    Function0 function0 = (Function0) objT3;
                    boolean z5 = i5 == 256;
                    Object objT4 = x340Var8.T();
                    if (z5 || objT4 == m4cVar2) {
                        objT4 = new u460(iu30Var2, (byte) 14);
                        x340Var8.s0(objT4);
                    }
                    i9p1.k(losVar, function0, (Function0) objT4, x340Var8, 0);
                    yto1.g(ww60Var, (Context) cm0Var.d, (pkp) cm0Var.e, (qkp) cm0Var.f, (rkp) cm0Var.g, (vbl0) cm0Var.i, x340Var8, (i4 >> 3) & 14);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 3:
                ksw kswVar = (ksw) obj;
                r070 r070Var = (r070) obj2;
                iu30 iu30Var3 = (iu30) obj3;
                int iIntValue4 = ((Number) obj5).intValue();
                res resVar = (res) obj6;
                x340 x340Var9 = (b0k) obj4;
                boolean zI2 = x340Var9.i(resVar) | ((((iIntValue4 & 896) ^ 384) > 256 && x340Var9.g(iu30Var3)) || (iIntValue4 & 384) == 256);
                Object objT5 = x340Var9.T();
                if (zI2 || objT5 == fkj0.X) {
                    objT5 = new fz40(resVar, iu30Var3, (byte) 25);
                    x340Var9.s0(objT5);
                }
                n9p1.e(kswVar, (iu30) objT5, x340Var9, iIntValue4 & 14);
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var9, 0);
                int iHashCode = Long.hashCode(x340Var9.T);
                xos0 xos0VarM = x340Var9.m();
                qim0 qim0VarE = zr7.E(x340Var9, qim0VarD);
                hzj.A.getClass();
                if (x340Var9.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var9.m0();
                if (x340Var9.S) {
                    x340Var9.l(n4kVar);
                } else {
                    x340Var9.v0();
                }
                nko1.H(mbhVarA, x340Var9, y580.O0);
                nko1.H(xos0VarM, x340Var9, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var9, y580.R0);
                nko1.F(x340Var9);
                nko1.H(qim0VarE, x340Var9, y580.Y);
                f6o1.b(r070Var.a.a.c, (String) null, hti1.d, u291.f(nim0Var, 1.0f), (String) null, (Function0) null, apo.r(-92619306, new bp50(resVar, iu30Var3, r070Var, (byte) 16), x340Var9), x340Var9, 1573296, 48);
                uwr uwrVar = cbx.a;
                w2g0.c(dug.f(nim0Var, cbx.a(x340Var9).a.b.c(), d4o1.a), (tl3) null, apo.r(316340960, new cy00((Object) r070Var, (Object) iu30Var3, (Object) resVar, (byte) 15), x340Var9), x340Var9, 3072, 6);
                x340Var9.r(true);
                return rih1Var;
            case 4:
                yr70 yr70Var = (yr70) obj2;
                iu30 iu30Var4 = (iu30) obj3;
                x340 x340Var10 = (b0k) obj4;
                int iIntValue5 = ((Number) obj5).intValue();
                m4c m4cVar3 = fkj0.X;
                ng20 ng20Var = (ng20) obj6;
                boolean z6 = (((iIntValue5 & 112) ^ 48) > 32 && x340Var10.g(yr70Var)) || (iIntValue5 & 48) == 32;
                x340 x340Var11 = x340Var10;
                boolean zI3 = z6 | x340Var11.i(ng20Var);
                Object objT6 = x340Var11.T();
                if (zI3 || objT6 == m4cVar3) {
                    objT6 = new hs20(yr70Var, ng20Var, (byte) 25);
                    x340Var11.s0(objT6);
                }
                Function0 function1 = (Function0) objT6;
                z = (((iIntValue5 & 896) ^ 384) > 256 && x340Var11.g(iu30Var4)) || (iIntValue5 & 384) == 256;
                Object objT7 = x340Var11.T();
                if (z || objT7 == m4cVar3) {
                    objT7 = new z720(iu30Var4, (byte) 26);
                    x340Var11.s0(objT7);
                }
                i1p1.h(yr70Var, function1, (iu30) objT7, x340Var11, (iIntValue5 >> 3) & 14);
                return rih1Var;
            case 5:
                zs70 zs70Var = (zs70) obj2;
                iu30 iu30Var5 = (iu30) obj3;
                x340 x340Var12 = (b0k) obj4;
                int iIntValue6 = ((Number) obj5).intValue();
                nl9 nl9Var = (nl9) obj6;
                int i6 = (iIntValue6 & 48) == 0 ? iIntValue6 | (x340Var12.g(zs70Var) ? 32 : 16) : iIntValue6;
                if ((iIntValue6 & 384) == 0) {
                    i6 |= x340Var12.i(iu30Var5) ? 256 : 128;
                }
                x340 x340Var13 = x340Var12;
                if (x340Var13.Y(i6 & 1, (i6 & 1169) != 1168)) {
                    mod.c(new ely0[]{ige0.a.a((pkh0) nl9Var.b), ige0.c.a((cie1) nl9Var.e), ige0.b.a((ift0) nl9Var.f), ige0.d.a((gt70) nl9Var.g)}, apo.r(944686387, new ct70(zs70Var, iu30Var5, (byte) 0), x340Var13), x340Var13, 56);
                } else {
                    x340Var13.b0();
                }
                return rih1Var;
            case 6:
                tv70 tv70Var = (tv70) obj2;
                iu30 iu30Var6 = (iu30) obj3;
                x340 x340Var14 = (b0k) obj4;
                int iIntValue7 = ((Number) obj5).intValue();
                bmt bmtVar = (bmt) ((idd1) ((nm1) obj6).i).getValue();
                z = (((iIntValue7 & 896) ^ 384) > 256 && x340Var14.g(iu30Var6)) || (iIntValue7 & 384) == 256;
                x340 x340Var15 = x340Var14;
                Object objT8 = x340Var15.T();
                if (z || objT8 == fkj0.X) {
                    objT8 = new u460(iu30Var6, (byte) 21);
                    x340Var15.s0(objT8);
                }
                v1p1.a(tv70Var, bmtVar, (Function0) objT8, (qim0) null, x340Var15, (iIntValue7 >> 3) & 14);
                return rih1Var;
            case 7:
                o180 o180Var = (o180) obj2;
                iu30 iu30Var7 = (iu30) obj3;
                x340 x340Var16 = (b0k) obj4;
                int iIntValue8 = ((Number) obj5).intValue();
                q180 q180Var = (q180) obj6;
                z = (((iIntValue8 & 896) ^ 384) > 256 && x340Var16.g(iu30Var7)) || (iIntValue8 & 384) == 256;
                x340 x340Var17 = x340Var16;
                boolean zI4 = x340Var17.i(q180Var) | z;
                Object objT9 = x340Var17.T();
                if (zI4 || objT9 == fkj0.X) {
                    objT9 = new hs20(iu30Var7, q180Var, (byte) 29);
                    x340Var17.s0(objT9);
                }
                cpn1.b(196608, 30, (Function0) objT9, apo.r(-953175898, new p180(o180Var, iu30Var7, (byte) 1), x340Var17), x340Var17, (qim0) null, false, false);
                return rih1Var;
            case 8:
                uwr uwrVar2 = cbx.a;
                x340 x340Var18 = (b0k) obj4;
                ((Number) obj5).intValue();
                String strO0 = cwl1.o0(x340Var18, 2131956665);
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                if (((c880) obj2).b) {
                    x340 x340Var19 = x340Var18;
                    x340Var19.i0(1993968883);
                    qim0VarX = uyn1.z(cbx.b(x340Var19).b.b, 0.0f, 2, nim0Var);
                    x340Var19.r(false);
                } else {
                    x340 x340Var20 = x340Var18;
                    x340Var20.i0(1993971302);
                    qim0VarX = uyn1.x(nim0Var, cbx.b(x340Var20).b.b);
                    x340Var20.r(false);
                }
                qim0 qim0VarN = anm1.N("inbound_hint_container", qim0VarF.then(qim0VarX));
                era eraVar = een.Q0;
                cvx cvxVar = cbx.b(x340Var18).b;
                cx0 cx0Var = (cx0) obj6;
                mbh mbhVarA2 = jbh.a(new d36(16.0f, true, new um5(false)), eraVar, x340Var18, 0);
                x340 x340Var21 = x340Var18;
                int iHashCode2 = Long.hashCode(x340Var21.T);
                xos0 xos0VarM2 = x340Var21.m();
                qim0 qim0VarE2 = zr7.E(x340Var18, qim0VarN);
                hzj.A.getClass();
                x340 x340Var22 = x340Var18;
                if (x340Var22.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var22.m0();
                if (x340Var22.S) {
                    x340Var22.l(n4kVar);
                } else {
                    x340Var22.v0();
                }
                nko1.H(mbhVarA2, x340Var18, y580.O0);
                nko1.H(xos0VarM2, x340Var18, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var18, y580.R0);
                nko1.F(x340Var18);
                nko1.H(qim0VarE2, x340Var18, y580.Y);
                cx0Var.g(strO0, x340Var18, 0);
                x340Var22.r(true);
                return rih1Var;
            case 9:
                m880 m880Var = (n880) obj2;
                iu30 iu30Var8 = (iu30) obj3;
                x340 x340Var23 = (b0k) obj4;
                int iIntValue9 = ((Number) obj5).intValue();
                q880 q880Var = (q880) obj6;
                ji41 ji41Var = m880Var instanceof m880 ? m880Var.a : gi41.b;
                if (u890.j(ji41Var, gi41.d)) {
                    vg41Var = vg41.b;
                } else if (u890.j(ji41Var, gi41.e)) {
                    vg41Var = vg41.c;
                } else {
                    vg41Var = u890.j(ji41Var, gi41.f) ? vg41.d : vg41.a;
                }
                vg41 vg41Var2 = vg41Var;
                x340 x340Var24 = x340Var23;
                boolean zI5 = x340Var24.i(ji41Var) | ((((iIntValue9 & 896) ^ 384) > 256 && x340Var24.g(iu30Var8)) || (iIntValue9 & 384) == 256) | x340Var24.i(q880Var);
                Object objT10 = x340Var24.T();
                if (zI5 || objT10 == fkj0.X) {
                    objT10 = new piu(ji41Var, iu30Var8, q880Var, (lnm) null, (byte) 28);
                    x340Var24.s0(objT10);
                }
                qxd0.t(ji41Var, x340Var24, (vu30) objT10);
                boolean zA = q880Var.h.a();
                j2i j2iVarR = apo.r(-1326594924, new zs(q880Var, ji41Var, zA, (byte) 23), x340Var24);
                j2i j2iVarR2 = apo.r(-2145347338, new wr1(q880Var, zA, j2iVarR, vg41Var2, iu30Var8, ji41Var), x340Var24);
                if (zA) {
                    x340Var24.i0(-521366669);
                    uwr uwrVar3 = cbx.a;
                    fap1.a(j2iVarR2, j2iVarR, cbx.a(x340Var24).a.d, (qim0) null, x340Var24, 54);
                    x340Var24.r(false);
                } else {
                    x340Var24.i0(-521212041);
                    j2iVarR2.invoke(x340Var24, 6);
                    x340Var24.r(false);
                }
                return rih1Var;
            case 10:
                qb80 qb80Var = (qb80) obj2;
                x340 x340Var25 = (b0k) obj4;
                int iIntValue10 = ((Number) obj5).intValue();
                cb0 cb0Var = (cb0) obj6;
                if ((iIntValue10 & 48) == 0) {
                    iIntValue10 |= (iIntValue10 & 64) == 0 ? x340Var25.g(qb80Var) : x340Var25.i(qb80Var) ? 32 : 16;
                }
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(iIntValue10 & 1, (iIntValue10 & 1041) != 1040)) {
                    pb80 pb80Var = qb80Var.a;
                    if (pb80Var.equals(ob80.a)) {
                        x340Var26.i0(-1061788384);
                        cb0Var.e(2131954267, x340Var26, 0);
                        x340Var26.r(false);
                    } else {
                        if (!pb80Var.equals(nb80.a)) {
                            throw p3d1.k(x340Var26, -1061789634, false);
                        }
                        x340Var26.i0(-1061785796);
                        cb0Var.e(2131959129, x340Var26, 0);
                        x340Var26.r(false);
                    }
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case 11:
                b0k b0kVar = (b0k) obj4;
                ((Number) obj5).intValue();
                cm0 cm0Var2 = (cm0) obj6;
                mod.b(oi7.a.a((gw70) cm0Var2.d), apo.r(470597866, new cb60((ksw) obj, cm0Var2, (zf80) obj2, (iu30) obj3, (byte) 8), b0kVar), b0kVar, 56);
                return rih1Var;
            case 12:
                wi80 wi80Var = (wi80) obj2;
                xi80 xi80Var = (xi80) obj6;
                h7p1.b((iu30) obj3, xi80Var.a, !(xi80Var.b instanceof ti80), wi80Var.a, wi80Var.c, wi80Var.d, wi80Var.e, wi80Var.f, wi80Var.b, xi80Var.c, xi80Var.d, xi80Var.e, xi80Var.f, (b0k) obj4, (((Number) obj5).intValue() >> 6) & 14);
                return rih1Var;
            case 13:
                b0k b0kVar2 = (b0k) obj4;
                ((Number) obj5).intValue();
                nyx.a(2, (wux) null, apo.r(-934379396, new bp50((yxb0) obj6, (iu30) obj3, (yl80) obj2, (byte) 26), b0kVar2), b0kVar2, 3078, 6);
                return rih1Var;
            case 14:
                bn80 bn80Var = (bn80) obj2;
                iu30 iu30Var9 = (iu30) obj3;
                int iIntValue11 = ((Number) obj5).intValue();
                m4c m4cVar4 = fkj0.X;
                rwj rwjVar = (rwj) obj6;
                d0r d0rVar = (d0r) rwjVar.e;
                x340 x340Var27 = (b0k) obj4;
                boolean zG = x340Var27.g(d0rVar);
                Object objT11 = x340Var27.T();
                if (zG || objT11 == m4cVar4) {
                    objT11 = (kl80) szq.b(d0rVar, new pd3((kly0) rwjVar.d, (byte) 8));
                    x340Var27.s0(objT11);
                }
                kl80 kl80Var = (kl80) objT11;
                List list = bn80Var.h;
                Set set = bn80Var.g;
                boolean z7 = bn80Var.e;
                boolean z8 = bn80Var.f;
                int i7 = (iIntValue11 & 896) ^ 384;
                boolean z9 = (i7 > 256 && x340Var27.g(iu30Var9)) || (iIntValue11 & 384) == 256;
                Object objT12 = x340Var27.T();
                if (z9 || objT12 == m4cVar4) {
                    objT12 = new bv70(iu30Var9, (byte) 8);
                    x340Var27.s0(objT12);
                }
                iu30 iu30Var10 = (iu30) objT12;
                boolean z10 = (i7 > 256 && x340Var27.g(iu30Var9)) || (iIntValue11 & 384) == 256;
                Object objT13 = x340Var27.T();
                if (z10 || objT13 == m4cVar4) {
                    objT13 = new bv70(iu30Var9, (byte) 9);
                    x340Var27.s0(objT13);
                }
                iu30 iu30Var11 = (iu30) objT13;
                boolean z11 = (i7 > 256 && x340Var27.g(iu30Var9)) || (iIntValue11 & 384) == 256;
                Object objT14 = x340Var27.T();
                if (z11 || objT14 == m4cVar4) {
                    objT14 = new zi80(iu30Var9, (byte) 6);
                    x340Var27.s0(objT14);
                }
                Function0 function2 = (Function0) objT14;
                z = (i7 > 256 && x340Var27.g(iu30Var9)) || (iIntValue11 & 384) == 256;
                Object objT15 = x340Var27.T();
                if (z || objT15 == m4cVar4) {
                    objT15 = new bv70(iu30Var9, (byte) 10);
                    x340Var27.s0(objT15);
                }
                im80.e(list, iu30Var10, iu30Var11, (qim0) null, set, kl80Var, z7, z8, function2, (iu30) objT15, (Clock) null, x340Var27, 0);
                return rih1Var;
            case 15:
                so80 so80Var = (so80) obj2;
                iu30 iu30Var12 = (iu30) obj3;
                x340 x340Var28 = (b0k) obj4;
                int iIntValue12 = ((Number) obj5).intValue();
                res resVar2 = (res) obj6;
                int i8 = (iIntValue12 & 48) == 0 ? iIntValue12 | (x340Var28.g(so80Var) ? 32 : 16) : iIntValue12;
                if ((iIntValue12 & 384) == 0) {
                    i8 |= x340Var28.i(iu30Var12) ? 256 : 128;
                }
                x340 x340Var29 = x340Var28;
                if (x340Var29.Y(i8 & 1, (i8 & 1169) != 1168)) {
                    boolean zBooleanValue = ((Boolean) rwq.h(((tg80) resVar2.e).l, x340Var29, 0).getValue()).booleanValue();
                    boolean zG2 = x340Var29.g(resVar2);
                    Object objT16 = x340Var29.T();
                    if (zG2 || objT16 == fkj0.X) {
                        objT16 = new ux70(resVar2, (byte) 10);
                        x340Var29.s0(objT16);
                    }
                    qxd0.i(rih1Var, (iu30) objT16, x340Var29);
                    mod.b(oi7.a.a((gw70) resVar2.d), apo.r(342064561, new zs(so80Var, iu30Var12, zBooleanValue, (byte) 24), x340Var29), x340Var29, 56);
                } else {
                    x340Var29.b0();
                }
                return rih1Var;
            case 16:
                wo80 wo80Var = (wo80) obj2;
                x340 x340Var30 = (b0k) obj4;
                int iIntValue13 = ((Number) obj5).intValue();
                if ((iIntValue13 & 48) == 0) {
                    iIntValue13 |= x340Var30.g(wo80Var) ? 32 : 16;
                }
                x340 x340Var31 = x340Var30;
                if (x340Var31.Y(iIntValue13 & 1, (iIntValue13 & 1041) != 1040)) {
                    s9p1.n(wo80Var, (res) ((ng20) obj6).b, (qim0) null, x340Var31, (iIntValue13 >> 3) & 14);
                } else {
                    x340Var31.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                ot80 ot80Var = (ot80) obj2;
                x340 x340Var32 = (b0k) obj4;
                ((Number) obj5).intValue();
                pt80 pt80Var = (pt80) obj6;
                ven0 ven0VarS = v8r.s(pt80Var.b, x340Var32);
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                mbh mbhVarA3 = jbh.a(h36.c, een.P0, x340Var32, 0);
                x340 x340Var33 = x340Var32;
                int iHashCode3 = Long.hashCode(x340Var33.T);
                xos0 xos0VarM3 = x340Var33.m();
                qim0 qim0VarE3 = zr7.E(x340Var32, qim0VarF2);
                hzj.A.getClass();
                x340 x340Var34 = x340Var32;
                if (x340Var34.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var34.m0();
                if (x340Var34.S) {
                    x340Var34.l(n4kVar);
                } else {
                    x340Var34.v0();
                }
                nko1.H(mbhVarA3, x340Var32, y580.O0);
                nko1.H(xos0VarM3, x340Var32, y580.N0);
                nko1.H(Integer.valueOf(iHashCode3), x340Var32, y580.R0);
                nko1.F(x340Var32);
                nko1.H(qim0VarE3, x340Var32, y580.Y);
                x340Var34.i0(1039673282);
                int i9 = 0;
                for (Object obj7 : ot80Var.a) {
                    int i10 = i9 + 1;
                    if (i9 < 0) {
                        p7h.T();
                        throw null;
                    }
                    dp20 dp20Var = (dp20) obj7;
                    iys0 iys0Var = dp20Var.a;
                    boolean zG3 = x340Var34.g(iys0Var);
                    Object objT17 = x340Var34.T();
                    if (zG3 || objT17 == fkj0.X) {
                        ifp ifpVar = pt80Var.a;
                        jj50 jj50Var = new jj50(iys0Var, ven0VarS, (byte) 21);
                        switch (ifpVar.a) {
                            case 0:
                                nt80Var = new nt80(jj50Var);
                                break;
                            case 1:
                                nt80Var = new nt80(jj50Var);
                                break;
                            case 2:
                                nt80Var = new nt80(jj50Var);
                                break;
                            case 3:
                                nt80Var = new nt80(jj50Var);
                                break;
                            default:
                                nt80Var = new nt80(jj50Var);
                                break;
                        }
                        objT17 = nt80Var;
                        x340Var34.s0(objT17);
                    }
                    otw.c((nt80) objT17, new mt80(iys0Var.e, iys0Var.g, iys0Var.k, iys0Var.f, i9, dp20Var.b, iys0Var.j, iys0Var.i), (qim0) null, (ipb1) null, x340Var32, 0, 12);
                    i9 = i10;
                }
                x340Var34.r(false);
                x340Var34.r(true);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return a(obj, obj2, obj3, obj4, obj5);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                o990 o990Var = (o990) obj2;
                iu30 iu30Var13 = (iu30) obj3;
                x340 x340Var35 = (b0k) obj4;
                int iIntValue14 = ((Number) obj5).intValue();
                r990 r990Var = (r990) obj6;
                lzj.a(o990Var.e, r990Var.f, r990Var.e, x340Var35, 0);
                z = (((iIntValue14 & 896) ^ 384) > 256 && x340Var35.g(iu30Var13)) || (iIntValue14 & 384) == 256;
                x340 x340Var36 = x340Var35;
                Object objT18 = x340Var36.T();
                if (z || objT18 == fkj0.X) {
                    objT18 = new zi80(iu30Var13, (byte) 14);
                    x340Var36.s0(objT18);
                }
                bin.g(o990Var, (Function0) objT18, r990Var.c, r990Var.d, x340Var36, (iIntValue14 >> 3) & 14);
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return d(obj, obj2, obj3, obj4, obj5);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return e(obj, obj2, obj3, obj4, obj5);
            case 22:
                return f(obj, obj2, obj3, obj4, obj5);
            case 23:
                return g(obj, obj2, obj3, obj4, obj5);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return h(obj, obj2, obj3, obj4, obj5);
            case 25:
                return i(obj, obj2, obj3, obj4, obj5);
            case 26:
                return j(obj, obj2, obj3, obj4, obj5);
            case 27:
                return k(obj, obj2, obj3, obj4, obj5);
            case 28:
                return m(obj, obj2, obj3, obj4, obj5);
            default:
                b6a0 b6a0Var = (b6a0) obj2;
                x340 x340Var37 = (b0k) obj4;
                ((Number) obj5).intValue();
                qj0 qj0Var = (qj0) obj6;
                era eraVar2 = een.P0;
                f36 f36Var = h36.c;
                mbh mbhVarA4 = jbh.a(f36Var, eraVar2, x340Var37, 0);
                x340 x340Var38 = x340Var37;
                int iHashCode4 = Long.hashCode(x340Var38.T);
                xos0 xos0VarM4 = x340Var38.m();
                nim0 nim0Var2 = nim0.a;
                qim0 qim0VarE4 = zr7.E(x340Var37, nim0Var2);
                hzj.A.getClass();
                x340 x340Var39 = x340Var37;
                if (x340Var39.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var39.m0();
                if (x340Var39.S) {
                    x340Var39.l(n4kVar);
                } else {
                    x340Var39.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(mbhVarA4, x340Var37, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM4, x340Var37, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode4);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var37, lljVar3);
                nko1.F(x340Var37);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE4, x340Var37, lljVar4);
                otw.c((maa) ((ynb0) qj0Var.d).get(), b6a0Var.a, (qim0) null, (ipb1) null, x340Var37, 0, 12);
                uwr uwrVar4 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var37).b;
                cvx cvxVar3 = cbx.b(x340Var37).b;
                cvx cvxVar4 = cbx.b(x340Var37).b;
                qim0 qim0VarB = uyn1.B(nim0Var2, 12.0f, 0.0f, 12.0f, 12.0f, 2);
                mbh mbhVarA5 = jbh.a(f36Var, eraVar2, x340Var37, 0);
                int iHashCode5 = Long.hashCode(x340Var39.T);
                xos0 xos0VarM5 = x340Var39.m();
                qim0 qim0VarE5 = zr7.E(x340Var37, qim0VarB);
                x340Var39.m0();
                if (x340Var39.S) {
                    x340Var39.l(n4kVar);
                } else {
                    x340Var39.v0();
                }
                nko1.H(mbhVarA5, x340Var37, lljVar);
                nko1.H(xos0VarM5, x340Var37, lljVar2);
                i3a.l(iHashCode5, x340Var37, lljVar3, x340Var37);
                nko1.H(qim0VarE5, x340Var37, lljVar4);
                ot11.b(b6a0Var.b, (yqg) qj0Var.e, x340Var37, 0);
                x340Var39.r(true);
                x340Var39.r(true);
                return rih1Var;
        }
    }
}
