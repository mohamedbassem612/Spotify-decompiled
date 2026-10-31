package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.performancesdk.observationplatform.proto.ObservationPlatformProto;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class i0p1 {
    public static b180 a;
    public static b180 b;

    public static final void a(String str, if5 if5Var, String str2, gbx gbxVar, iu30 iu30Var, if5 if5Var2, qim0 qim0Var, lax laxVar, b0k b0kVar, int i) {
        qim0 qim0Var2;
        qim0 qim0Var3;
        qim0 qim0Var4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1502030917);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(if5Var) ? 32 : 16) | (x340Var.g(str2) ? 256 : 128) | (x340Var.i(gbxVar) ? 2048 : 1024) | (x340Var.i(iu30Var) ? 16384 : 8192) | (x340Var.i(if5Var2) ? 131072 : 65536) | 1572864 | (x340Var.g(laxVar) ? 8388608 : 4194304);
        if (x340Var.Y(i2 & 1, (i2 & 4793491) != 4793490)) {
            x340Var.d0();
            int i3 = i & 1;
            qim0 qim0Var5 = nim0.a;
            if (i3 == 0 || x340Var.E()) {
                qim0Var3 = qim0Var5;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var;
            }
            x340Var.s();
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var3);
            hzj.A.getClass();
            xu30 xu30VarB = null;
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
            if (if5Var == null) {
                x340Var.i0(-1121604382);
                x340Var.r(false);
                qim0Var4 = qim0Var3;
            } else {
                x340Var.i0(1626387199);
                qim0Var4 = qim0Var3;
                xu30VarB = if5Var.b((qim0) null, (lee1) null, (u7h) null, x340Var, 4096 | ((i2 << 6) & 7168), 7);
                x340Var.r(false);
            }
            xu30 xu30Var = xu30VarB;
            qim0 qim0VarF = u291.f(qim0Var5, 1.0f);
            boolean zI = x340Var.i(gbxVar);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new o70(gbxVar, (byte) 0);
                x340Var.s0(objT);
            }
            jto1.b(anm1.N("ActionSettingRow", s161.b(qim0VarF, true, (iu30) objT)), null, mmo1.z(laxVar, x340Var), false, null, null, null, null, null, null, null, xu30Var, apo.r(1051313752, new p70(str2, gbxVar, laxVar, iu30Var), x340Var), null, null, apo.r(326221813, new p3(str, (byte) 10), x340Var), x340Var, 0, 196992, 26618);
            int i4 = i2 >> 15;
            cso1.s(if5Var2, null, laxVar, null, x340Var, (i4 & 14) | 8 | (i4 & 896), 10);
            x340Var.r(true);
            qim0Var2 = qim0Var4;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n(str, if5Var, str2, gbxVar, iu30Var, if5Var2, qim0Var2, laxVar, i);
        }
    }

    public static final void b(iu30 iu30Var, qim0 qim0Var, int i, int i2, b0k b0kVar, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        b0k b0kVar2;
        qim0 qim0Var2;
        int i8;
        int i9;
        int i10;
        int i11;
        qim0 qim0Var3;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(781033044);
        if ((i3 & 6) == 0) {
            i5 = (b0kVar3.i(iu30Var) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i12 = i5 | 48;
        if ((i3 & 384) == 0) {
            if ((i4 & 4) == 0) {
                i6 = i;
                int i13 = b0kVar3.e(i6) ? 256 : 128;
                i12 |= i13;
            } else {
                i6 = i;
            }
            i12 |= i13;
        } else {
            i6 = i;
        }
        if ((i3 & 3072) == 0) {
            if ((i4 & 8) == 0) {
                i7 = i2;
                int i14 = b0kVar3.e(i7) ? 2048 : 1024;
                i12 |= i14;
            } else {
                i7 = i2;
            }
            i12 |= i14;
        } else {
            i7 = i2;
        }
        if (b0kVar3.Y(i12 & 1, (i12 & 1171) != 1170)) {
            b0kVar3.d0();
            if ((i3 & 1) == 0 || b0kVar3.E()) {
                if ((i4 & 4) != 0) {
                    i12 &= -897;
                    i6 = 2131952154;
                }
                int i15 = i4 & 8;
                qim0 qim0Var4 = nim0.a;
                if (i15 != 0) {
                    i12 &= -7169;
                    i7 = 2131952155;
                }
                i10 = i12;
                i11 = i6;
                qim0Var3 = qim0Var4;
            } else {
                b0kVar3.b0();
                if ((i4 & 4) != 0) {
                    i12 &= -897;
                }
                if ((i4 & 8) != 0) {
                    i12 &= -7169;
                }
                i10 = i12;
                i11 = i6;
                qim0Var3 = qim0Var;
            }
            b0kVar3.s();
            String strO0 = cwl1.o0(b0kVar3, 2131952156);
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = zhi1.t;
                b0kVar3.s0(objT);
            }
            kgx kgxVar = new kgx(3, (vu30) objT, (vu30) null, (vu30) null, 12);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            cvx cvxVar3 = cbx.b(b0kVar3).b;
            cvx cvxVar4 = cbx.b(b0kVar3).b;
            vzq0 zzq0Var = new zzq0(12.0f, 12.0f, 12.0f, 12.0f);
            cvx cvxVar5 = cbx.b(b0kVar3).b;
            cvx cvxVar6 = cbx.b(b0kVar3).b;
            ydx ydxVar = new ydx((22 & 1) != 0 ? 4.0f : 8.0f, (22 & 2) == 0 ? 0.0f : 12.0f, (22 & 4) != 0 ? 8.0f : 0.0f, (22 & 8) != 0 ? zzq0Var : new zzq0(16.0f, 16.0f, 16.0f, 16.0f), (22 & 16) != 0 ? vdx.a : wdx.a);
            boolean z = (i10 & 14) == 4;
            Object objT2 = b0kVar3.T();
            if (z || objT2 == m4cVar) {
                objT2 = new y0j1(iu30Var, (byte) 8);
                b0kVar3.s0(objT2);
            }
            Function0 function0 = (Function0) objT2;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            b0kVar2 = b0kVar3;
            ioo1.c(qim0Var3, kgxVar, ydxVar, null, null, null, null, new gbx(new y50(strO0), function0), null, null, null, null, apo.r(-129274419, new zo7(i7, strO0, iu30Var, (byte) 9), b0kVar3), null, null, null, apo.r(1519334985, new f13(i11, (byte) 24), b0kVar3), b0kVar2, ((i10 >> 3) & 14) | 512, 1573248, 61304);
            i9 = i7;
            i8 = i11;
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
            i8 = i6;
            i9 = i7;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new g13(iu30Var, qim0Var2, i8, i9, i3, i4);
        }
    }

    public static final void c(Function0 function0, u7h u7hVar, u7h u7hVar2, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(145297085);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(u7hVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(u7hVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(nim0.a) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            gfx.b(8, apo.r(2027102194, new tbs0(function0, u7hVar, u7hVar2), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jmk0(function0, u7hVar, u7hVar2, i);
        }
    }

    public static final void d(boolean z, z2a z2aVar, iu30 iu30Var, i8h1 i8h1Var, String str, qim0 qim0Var, qn30 qn30Var, List list, b0k b0kVar, int i) {
        int i2;
        i8h1 i8h1Var2;
        String str2;
        x340 x340Var;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(706474445);
        if ((i & 6) == 0) {
            i2 = (x340Var2.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var2.g(z2aVar) : x340Var2.i(z2aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i8h1Var2 = i8h1Var;
            i2 |= x340Var2.i(i8h1Var2) ? 2048 : 1024;
        } else {
            i8h1Var2 = i8h1Var;
        }
        if ((i & 24576) == 0) {
            str2 = str;
            i2 |= x340Var2.g(str2) ? 16384 : 8192;
        } else {
            str2 = str;
        }
        int i3 = i2 | 196608;
        if ((1572864 & i) == 0) {
            i3 |= x340Var2.g(qn30Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= x340Var2.i(list) ? 8388608 : 4194304;
        }
        if (x340Var2.Y(i3 & 1, (4793491 & i3) != 4793490)) {
            scx scxVarM = pno1.m(x340Var2);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zI = ((i3 & 14) == 4) | x340Var2.i(scxVarM);
            Object objT = x340Var2.T();
            if (zI || objT == m4cVar) {
                objT = new b0f1(z, scxVarM, (lnm) null);
                x340Var2.s0(objT);
            }
            qxd0.t(boolValueOf, x340Var2, (vu30) objT);
            if (z) {
                x340Var2.i0(1241083785);
                boolean z2 = (i3 & 896) == 256;
                Object objT2 = x340Var2.T();
                if (z2 || objT2 == m4cVar) {
                    objT2 = new y0j1(iu30Var, (byte) 9);
                    x340Var2.s0(objT2);
                }
                x74.f((Function0) objT2, scxVarM, (mfx) null, false, false, 0.0f, false, Boolean.TRUE, false, false, (vu30) null, apo.r(-1264204173, new mse(list, i8h1Var2, str2, z2aVar, qn30Var, iu30Var), x340Var2), x340Var2, 12582912, 48, 1916);
                x340Var = x340Var2;
                x340Var.r(false);
            } else {
                x340Var = x340Var2;
                x340Var.i0(1242079381);
                x340Var.r(false);
            }
            qim0Var2 = nim0.a;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new brf(z, z2aVar, iu30Var, i8h1Var, str, qim0Var2, qn30Var, list, i);
        }
    }

    public static final void e(ArrayList arrayList, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2095731529);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(arrayList) : x340Var.i(arrayList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            fra fraVar = een.N0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0Var3, 0.0f, 12.0f, 0.0f, 8.0f, 5);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            qim0Var2 = qim0Var3;
            uwo1.e(cwl1.o0(x340Var, 2131952451), null, cbx.d(x340Var).e, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2042);
            cvx cvxVar3 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.v(qim0Var2, 4.0f));
            p9p1.b(null, 0, 0, x340Var, 0, 7);
            x340Var.r(true);
            eko1.b(mqo1.A(arrayList), (qim0) null, false, false, (xu30) null, x340Var, 384, 26);
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new heb1(arrayList, qim0Var2, i, (byte) 24);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:103:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:107:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:113:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:116:0x0205  */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:54:0x009e  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00db  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:76:0x0118  */
    /* JADX WARN: Code duplicated, block: B:80:0x0120  */
    /* JADX WARN: Code duplicated, block: B:88:0x0156  */
    /* JADX WARN: Code duplicated, block: B:89:0x0159  */
    /* JADX WARN: Code duplicated, block: B:92:0x0165 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:93:0x0167  */
    /* JADX WARN: Code duplicated, block: B:96:0x0195  */
    public static final void f(z2a z2aVar, iu30 iu30Var, i8h1 i8h1Var, String str, qim0 qim0Var, qn30 qn30Var, List list, b0k b0kVar, int i, int i2) throws NoWhenBranchMatchedException {
        int i3;
        qn30 qn30Var2;
        int i4;
        boolean z;
        qim0 qim0Var2;
        b0k b0kVar2;
        qn30 qn30Var3;
        h311 h311VarV;
        Object objT;
        m4c m4cVar;
        ven0 ven0Var;
        boolean z2;
        qim0 qim0Var3;
        boolean z3;
        boolean z4;
        ven0 ven0Var2;
        boolean zI;
        Object objT2;
        boolean z5;
        boolean zI2;
        Object objT3;
        boolean z6;
        boolean zI3;
        Object objT4;
        int i5;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1723882431);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? b0kVar3.g(z2aVar) : b0kVar3.i(z2aVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= b0kVar3.i(i8h1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= b0kVar3.g(str) ? 2048 : 1024;
        }
        int i6 = i3 | 24576;
        int i7 = i2 & 32;
        if (i7 == 0) {
            if ((196608 & i) == 0) {
                qn30Var2 = qn30Var;
                i6 |= b0kVar3.g(qn30Var2) ? 131072 : 65536;
            }
            if ((1572864 & i) == 0) {
                if (b0kVar3.i(list)) {
                    i5 = 1048576;
                } else {
                    i5 = 524288;
                }
                i6 |= i5;
            }
            i4 = i6;
            if ((599187 & i4) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i4 & 1, z)) {
                if (i7 != 0) {
                    qn30Var2 = null;
                }
                boolean z7 = z2aVar instanceof w2a;
                Object[] objArr = new Object[0];
                objT = b0kVar3.T();
                m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = vbh1.S0;
                    b0kVar3.s0(objT);
                }
                ven0Var = (ven0) k5p1.s(objArr, (Function0) objT, b0kVar3, 48);
                z2 = z7;
                qim0Var3 = nim0.a;
                if (z2) {
                    qn30Var2 = qn30Var2;
                    qim0Var3 = qim0Var3;
                    ven0Var = ven0Var;
                    z2 = z2;
                    z3 = false;
                    m4cVar = m4cVar;
                    b0kVar3.i0(1258573347);
                    b0kVar3.r(false);
                } else {
                    b0kVar3.i0(1257992779);
                    if (z2aVar instanceof x2a) {
                        b0kVar3.i0(-1206344063);
                        if ((i4 & 112) == 32) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        zI3 = z6 | b0kVar3.i(ven0Var);
                        objT4 = b0kVar3.T();
                        if (zI3 || objT4 == m4cVar) {
                            objT4 = new rc21(iu30Var, ven0Var, (byte) 14);
                            b0kVar3.s0(objT4);
                        }
                        n((Function0) objT4, b0kVar3, (i4 >> 9) & 112);
                        b0kVar3.r(false);
                        z3 = false;
                    } else if (!(z2aVar instanceof r2a) || (z2aVar instanceof s2a)) {
                        b0kVar3.i0(-1206335288);
                        if ((i4 & 112) == 32) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        zI2 = z5 | b0kVar3.i(ven0Var);
                        objT3 = b0kVar3.T();
                        if (zI2 || objT3 == m4cVar) {
                            objT3 = new rc21(iu30Var, ven0Var, (byte) 15);
                            b0kVar3.s0(objT3);
                        }
                        z3 = false;
                        k1u.a(qim0Var3, 3, 0, (Function0) objT3, b0kVar3, ((i4 >> 12) & 14) | 48, 4);
                        b0kVar3.r(false);
                    } else {
                        if (!z2aVar.equals(w2a.a)) {
                            throw p3d1.k(b0kVar3, -1206345577, false);
                        }
                        b0kVar3.i0(1258561505);
                        b0kVar3.r(false);
                        z3 = false;
                    }
                    b0kVar3.r(z3);
                }
                if (((Boolean) ven0Var.getValue()).booleanValue() || (z2 && qn30Var2 == null)) {
                    z4 = z3;
                } else {
                    z4 = true;
                }
                ven0Var2 = ven0Var;
                zI = b0kVar3.i(ven0Var2) | ((i4 & 112) != 32 ? z3 : true);
                objT2 = b0kVar3.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new i5r0(iu30Var, ven0Var2, (byte) 7);
                    b0kVar3.s0(objT2);
                }
                b0kVar2 = b0kVar3;
                qn30Var3 = qn30Var2;
                d(z4, z2aVar, (iu30) objT2, i8h1Var, str, null, qn30Var3, list, b0kVar2, (i4 << 3) & 33094768);
                qim0Var2 = qim0Var3;
            } else {
                b0kVar3.b0();
                qim0Var2 = qim0Var;
                b0kVar2 = b0kVar3;
                qn30Var3 = qn30Var2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new ra5(z2aVar, iu30Var, i8h1Var, str, qim0Var2, qn30Var3, list, i, i2);
            }
        }
        i6 = 221184 | i3;
        qn30Var2 = qn30Var;
        if ((1572864 & i) == 0) {
            if (b0kVar3.i(list)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i6 |= i5;
        }
        i4 = i6;
        if ((599187 & i4) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i4 & 1, z)) {
            if (i7 != 0) {
                qn30Var2 = null;
            }
            boolean z8 = z2aVar instanceof w2a;
            Object[] objArr2 = new Object[0];
            objT = b0kVar3.T();
            m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = vbh1.S0;
                b0kVar3.s0(objT);
            }
            ven0Var = (ven0) k5p1.s(objArr2, (Function0) objT, b0kVar3, 48);
            z2 = z8;
            qim0Var3 = nim0.a;
            if (z2) {
                b0kVar3.i0(1257992779);
                if (z2aVar instanceof x2a) {
                    b0kVar3.i0(-1206344063);
                    if ((i4 & 112) == 32) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    zI3 = z6 | b0kVar3.i(ven0Var);
                    objT4 = b0kVar3.T();
                    if (zI3) {
                        objT4 = new rc21(iu30Var, ven0Var, (byte) 14);
                        b0kVar3.s0(objT4);
                    } else {
                        objT4 = new rc21(iu30Var, ven0Var, (byte) 14);
                        b0kVar3.s0(objT4);
                    }
                    n((Function0) objT4, b0kVar3, (i4 >> 9) & 112);
                    b0kVar3.r(false);
                    z3 = false;
                } else if (z2aVar instanceof r2a) {
                    b0kVar3.i0(-1206335288);
                    if ((i4 & 112) == 32) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    zI2 = z5 | b0kVar3.i(ven0Var);
                    objT3 = b0kVar3.T();
                    if (zI2) {
                        objT3 = new rc21(iu30Var, ven0Var, (byte) 15);
                        b0kVar3.s0(objT3);
                    } else {
                        objT3 = new rc21(iu30Var, ven0Var, (byte) 15);
                        b0kVar3.s0(objT3);
                    }
                    z3 = false;
                    k1u.a(qim0Var3, 3, 0, (Function0) objT3, b0kVar3, ((i4 >> 12) & 14) | 48, 4);
                    b0kVar3.r(false);
                } else {
                    b0kVar3.i0(-1206335288);
                    if ((i4 & 112) == 32) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    zI2 = z5 | b0kVar3.i(ven0Var);
                    objT3 = b0kVar3.T();
                    if (zI2) {
                        objT3 = new rc21(iu30Var, ven0Var, (byte) 15);
                        b0kVar3.s0(objT3);
                    } else {
                        objT3 = new rc21(iu30Var, ven0Var, (byte) 15);
                        b0kVar3.s0(objT3);
                    }
                    z3 = false;
                    k1u.a(qim0Var3, 3, 0, (Function0) objT3, b0kVar3, ((i4 >> 12) & 14) | 48, 4);
                    b0kVar3.r(false);
                }
                b0kVar3.r(z3);
            } else {
                qn30Var2 = qn30Var2;
                qim0Var3 = qim0Var3;
                ven0Var = ven0Var;
                z2 = z2;
                z3 = false;
                m4cVar = m4cVar;
                b0kVar3.i0(1258573347);
                b0kVar3.r(false);
            }
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                z4 = z3;
            } else {
                z4 = z3;
            }
            ven0Var2 = ven0Var;
            zI = b0kVar3.i(ven0Var2) | ((i4 & 112) != 32 ? z3 : true);
            objT2 = b0kVar3.T();
            if (zI) {
                objT2 = new i5r0(iu30Var, ven0Var2, (byte) 7);
                b0kVar3.s0(objT2);
            } else {
                objT2 = new i5r0(iu30Var, ven0Var2, (byte) 7);
                b0kVar3.s0(objT2);
            }
            b0kVar2 = b0kVar3;
            qn30Var3 = qn30Var2;
            d(z4, z2aVar, (iu30) objT2, i8h1Var, str, null, qn30Var3, list, b0kVar2, (i4 << 3) & 33094768);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar3.b0();
            qim0Var2 = qim0Var;
            b0kVar2 = b0kVar3;
            qn30Var3 = qn30Var2;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ra5(z2aVar, iu30Var, i8h1Var, str, qim0Var2, qn30Var3, list, i, i2);
        }
    }

    public static final void g(z2a z2aVar, iu30 iu30Var, ArrayList arrayList, qn30 qn30Var, b0k b0kVar, int i) {
        ArrayList arrayList2;
        int i2;
        boolean z;
        iu30 iu30Var2 = iu30Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(564344703);
        int i3 = i | (x340Var.g(z2aVar) ? 4 : 2) | (x340Var.i(iu30Var2) ? 32 : 16) | (x340Var.g(arrayList) ? 256 : 128);
        nim0 nim0Var = nim0.a;
        int i4 = i3 | (x340Var.i(nim0Var) ? 2048 : 1024) | (x340Var.g(qn30Var) ? 16384 : 8192);
        if (x340Var.Y(i4 & 1, (i4 & 9363) != 9362)) {
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var).g, 32, qim0VarF);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarP, 16.0f, 16.0f);
            era eraVar = een.Q0;
            cvx cvxVar3 = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(12.0f, true, new um5(false)), eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
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
            if ((z2aVar instanceof w2a) && qn30Var == null) {
                x340Var.i0(-1130361415);
                x340Var.r(false);
                i2 = i4;
                z = false;
            } else {
                x340Var.i0(-1130521902);
                i2 = i4;
                z = false;
                uwo1.e(cwl1.o0(x340Var, 2131963725), null, cbx.d(x340Var).e, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2042);
                x340Var = x340Var;
                x340Var.r(false);
            }
            if (z2aVar instanceof r2a) {
                x340Var.i0(517727949);
                b(iu30Var2, null, 0, 0, x340Var, (i2 >> 3) & 14, 14);
                x340Var.r(z);
                iu30Var2 = iu30Var;
            } else if (z2aVar instanceof s2a) {
                x340Var.i0(517730829);
                iu30Var2 = iu30Var;
                b(iu30Var2, null, 2131957335, 2131957336, x340Var, (i2 >> 3) & 14, 2);
                x340Var.r(z);
            } else {
                iu30Var2 = iu30Var;
                if (z2aVar instanceof x2a) {
                    x340Var.i0(517738988);
                    o((i2 >> 3) & 14, x340Var, iu30Var2, null);
                    x340Var.r(z);
                } else {
                    if (!z2aVar.equals(w2a.a)) {
                        throw p3d1.k(x340Var, 517726684, z);
                    }
                    x340Var.i0(-1129901065);
                    x340Var.r(z);
                }
            }
            if (qn30Var != null) {
                x340Var.i0(-1129843715);
                i(qn30Var, iu30Var2, null, x340Var, ((i2 >> 12) & 14) | (i2 & 112));
                x340Var.r(z);
            } else {
                x340Var.i0(-1129693799);
                x340Var.r(z);
            }
            if (arrayList.isEmpty()) {
                arrayList2 = arrayList;
                x340Var.i0(-1129612455);
                x340Var.r(z);
            } else {
                x340Var.i0(-1129657622);
                arrayList2 = arrayList;
                e(arrayList2, null, x340Var, (i2 >> 6) & 14);
                x340Var.r(z);
            }
            x340Var.r(true);
        } else {
            arrayList2 = arrayList;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l3j1(i, z2aVar, iu30Var2, arrayList2, qn30Var, (byte) 0);
        }
    }

    public static final void h(k620 k620Var, c380 c380Var, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1343500764);
        int i2 = (x340Var.e(k620Var.ordinal()) ? 4 : 2) | i | (x340Var.g(c380Var) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            c9 c9Var = ya20.c;
            ArrayList arrayListV = i1p1.v(c380Var);
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            zzq0 zzq0Var = new zzq0(16.0f, 8.0f, 16.0f, 8.0f);
            boolean zG = ((i2 & 14) == 4) | x340Var.g(arrayListV) | ((i2 & 896) == 256);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new djx(arrayListV, k620Var, iu30Var, (byte) 20);
                x340Var.s0(objT);
            }
            too1.b(qim0VarF, null, zzq0Var, (iu30) objT, x340Var, 0, 2);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xx00(k620Var, c380Var, iu30Var, i, (byte) 9);
        }
    }

    public static final void i(qn30 qn30Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1592221801);
        if ((i & 6) == 0) {
            i2 = i | (b0kVar3.g(qn30Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (b0kVar3.Y(i3 & 1, (i3 & 147) != 146)) {
            String strO0 = cwl1.o0(b0kVar3, 2131956146);
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = zhi1.X;
                b0kVar3.s0(objT);
            }
            kgx kgxVar = new kgx(3, (vu30) objT, (vu30) null, (vu30) null, 12);
            boolean z = (i3 & 112) == 32;
            Object objT2 = b0kVar3.T();
            if (z || objT2 == m4cVar) {
                objT2 = new y0j1(iu30Var, (byte) 10);
                b0kVar3.s0(objT2);
            }
            Function0 function0 = (Function0) objT2;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO0), function0);
            j2i j2iVarR = apo.r(-2130842498, new jpy(strO0, iu30Var, (byte) 2), b0kVar3);
            j2i j2iVarR2 = apo.r(-1076054398, new g2j1(qn30Var, (byte) 3), b0kVar3);
            int i4 = (i3 >> 6) & 14;
            qim0Var2 = nim0.a;
            b0kVar2 = b0kVar3;
            ioo1.c(qim0Var2, kgxVar, null, null, null, null, null, gbxVar, null, null, null, null, j2iVarR, null, null, null, j2iVarR2, b0kVar2, i4, 1573248, 61308);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ixi1(qn30Var, iu30Var, qim0Var2, i, (byte) 3);
        }
    }

    public static final void j(wzz0 wzz0Var, h001 h001Var, b0k b0kVar, int i) {
        wzz0 wzz0Var2;
        h001 h001Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(176080641);
        int i2 = (x340Var.g(wzz0Var) ? 4 : 2) | i | (x340Var.i(h001Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            wzz0Var2 = wzz0Var;
            h001Var2 = h001Var;
            otw.c(h001Var2, wzz0Var2, (qim0) null, (ipb1) null, x340Var, ((i2 >> 3) & 14) | ((i2 << 3) & 112), 12);
        } else {
            wzz0Var2 = wzz0Var;
            h001Var2 = h001Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vx90(wzz0Var2, h001Var2, i, (byte) 26);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void k(vdo vdoVar, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1682179078);
        int i2 = (x340Var.i(vdoVar) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            u7h u7hVar = vdoVar.l;
            u7h u7hVar2 = vdoVar.m;
            alc0 alc0Var = vdoVar.k;
            if (alc0Var instanceof zkc0) {
                x340Var.i0(118764209);
                c(function0, u7hVar, u7hVar2, x340Var, ((i2 >> 3) & 14) | 3072);
                x340Var.r(false);
            } else {
                if (!(alc0Var instanceof alc0)) {
                    throw p3d1.k(x340Var, 1666397559, false);
                }
                x340Var.i0(118967476);
                String str = alc0Var.b;
                if (ihc1.y0(str)) {
                    x340Var.i0(118995779);
                    c(function0, u7hVar, u7hVar2, x340Var, ((i2 >> 3) & 14) | 3072);
                    x340Var.r(false);
                } else {
                    x340Var.i0(119186398);
                    m(str, function0, u7hVar, u7hVar2, x340Var, (i2 & 112) | 24576);
                    x340Var.r(false);
                }
                x340Var.r(false);
            }
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tbs0(vdoVar, function0, qim0Var2, i, (byte) 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003d  */
    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0048 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x006c  */
    /* JADX WARN: Code duplicated, block: B:33:0x009e  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:40:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:48:0x0101  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    public static final void l(Function0 function0, qim0 qim0Var, vu30 vu30Var, b0k b0kVar, int i, int i2) {
        vu30 vu30Var2;
        boolean z;
        qim0 qim0Var2;
        vu30 vu30Var3;
        h311 h311VarV;
        Object objT;
        m4c m4cVar;
        lz20 lz20Var;
        qim0 qim0Var3;
        Object objT2;
        gfh0 gfh0VarC;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean zI;
        Object objT3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1036652965);
        int i3 = (x340Var.i(function0) ? 4 : 2) | i;
        int i4 = i3 | 48;
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                vu30Var2 = vu30Var;
                i4 |= x340Var.i(vu30Var2) ? 256 : 128;
            }
            if ((i4 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i4 & 1, z)) {
                if (i5 != 0) {
                    vu30Var2 = kmj.a;
                }
                objT = x340Var.T();
                m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = pzm.i(x340Var);
                }
                lz20Var = (lz20) objT;
                qim0Var3 = nim0.a;
                qim0 qim0VarP = vby0.p(u291.d(qim0Var3, 1.0f), lz20Var);
                objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = ktd.n(x340Var);
                }
                qim0 qim0VarV = bin.v(qim0VarP, (idn0) objT2, null, false, null, null, function0, 28);
                gfh0VarC = t1c.c(een.d, false);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarV);
                hzj.A.getClass();
                if (x340Var.a != null) {
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
                us71.j((i4 >> 6) & 14, vu30Var2, x340Var, true);
                zI = x340Var.i(lz20Var);
                objT3 = x340Var.T();
                if (zI || objT3 == m4cVar) {
                    objT3 = new fx1(lz20Var, null, (byte) 12);
                    x340Var.s0(objT3);
                }
                qxd0.t(rih1.a, x340Var, (vu30) objT3);
                qim0Var2 = qim0Var3;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
            }
            vu30Var3 = vu30Var2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new dg6(function0, qim0Var2, vu30Var3, i, i2, (byte) 9);
            }
        }
        i4 = i3 | 432;
        vu30Var2 = vu30Var;
        if ((i4 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i4 & 1, z)) {
            if (i5 != 0) {
                vu30Var2 = kmj.a;
            }
            objT = x340Var.T();
            m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = pzm.i(x340Var);
            }
            lz20Var = (lz20) objT;
            qim0Var3 = nim0.a;
            qim0 qim0VarP2 = vby0.p(u291.d(qim0Var3, 1.0f), lz20Var);
            objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = ktd.n(x340Var);
            }
            qim0 qim0VarV2 = bin.v(qim0VarP2, (idn0) objT2, null, false, null, null, function0, 28);
            gfh0VarC = t1c.c(een.d, false);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarV2);
            hzj.A.getClass();
            if (x340Var.a != null) {
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
            us71.j((i4 >> 6) & 14, vu30Var2, x340Var, true);
            zI = x340Var.i(lz20Var);
            objT3 = x340Var.T();
            if (zI) {
                objT3 = new fx1(lz20Var, null, (byte) 12);
                x340Var.s0(objT3);
            } else {
                objT3 = new fx1(lz20Var, null, (byte) 12);
                x340Var.s0(objT3);
            }
            qxd0.t(rih1.a, x340Var, (vu30) objT3);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        vu30Var3 = vu30Var2;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dg6(function0, qim0Var2, vu30Var3, i, i2, (byte) 9);
        }
    }

    public static final void m(String str, Function0 function0, u7h u7hVar, u7h u7hVar2, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1929768256);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(u7hVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(u7hVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(nim0.a) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            gfx.b(8, apo.r(582155381, new b2o0(function0, u7hVar, u7hVar2, str), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lzs0(str, function0, u7hVar, u7hVar2, i);
        }
    }

    public static final void n(Function0 function0, b0k b0kVar, int i) {
        int i2;
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-470574886);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i & 48;
        int i5 = i2;
        nim0 nim0Var = nim0.a;
        if (i4 == 0) {
            i3 = (x340Var.i(nim0Var) ? 32 : 16) | i5;
        } else {
            i3 = i5;
        }
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cwl1.b(nim0Var, (tl3) null, d4o1.a, (pgx) null, uyn1.h(1, 0.0f, 8.0f), (max) null, false, (idn0) null, (ga80) null, new gbx(z50.c, function0), (gbx) null, gqj.a, x340Var, (i3 >> 3) & 14, 48, 1514);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m3j1(i, function0);
        }
    }

    public static final void o(int i, b0k b0kVar, iu30 iu30Var, qim0 qim0Var) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(150531726);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (b0kVar3.Y(i3 & 1, (i3 & 19) != 18)) {
            String strO0 = cwl1.o0(b0kVar3, 2131963727);
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = zhi1.Y;
                b0kVar3.s0(objT);
            }
            kgx kgxVar = new kgx(3, (vu30) objT, (vu30) null, (vu30) null, 12);
            boolean z = (i3 & 14) == 4;
            Object objT2 = b0kVar3.T();
            if (z || objT2 == m4cVar) {
                objT2 = new y0j1(iu30Var, (byte) 11);
                b0kVar3.s0(objT2);
            }
            Function0 function0 = (Function0) objT2;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                b0kVar2 = b0kVar3;
                qim0Var2 = nim0.a;
                ioo1.c(qim0Var2, kgxVar, null, null, null, null, null, new gbx(new y50(strO0), function0), null, null, null, null, apo.r(1776427765, new jpy(strO0, iu30Var, (byte) 3), b0kVar3), null, null, null, gqj.b, b0kVar2, (i3 >> 3) & 14, 1573248, 61308);
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new n52(iu30Var, qim0Var2, i, (byte) 13);
        }
    }

    public static final String p(PlayerState playerState) {
        return (String) playerState.contextMetadata().get("format_list_type");
    }

    public static final boolean q(PlayerState playerState) {
        char c;
        String str = (String) playerState.contextMetadata().get("like-feedback-available");
        char c2 = 3;
        if ("1".equals(str)) {
            c = 1;
        } else {
            c = "0".equals(str) ? (char) 2 : (char) 3;
        }
        String str2 = (String) playerState.contextMetadata().get("dislike-feedback-available");
        if ("1".equals(str2)) {
            c2 = 1;
        } else if ("0".equals(str2)) {
            c2 = 2;
        }
        return c == 1 || c2 == 1;
    }

    public static final boolean r(PlayerState playerState) {
        String str = (String) playerState.contextMetadata().get("isAlgotorial");
        if (str != null) {
            return Boolean.parseBoolean(str);
        }
        return false;
    }

    public static h9n s(toj0 toj0Var) {
        return new h9n(toj0Var, (byte) 4);
    }

    public static final yf t(u7h u7hVar, u7h u7hVar2) {
        if (u7hVar != null && u7hVar2 != null) {
            return new hdx(0, new q9j0((byte) 7, u7hVar2.a), new q9j0((byte) 8, u7hVar.a), (vu30) null, (hw61) null, 25);
        }
        if (u7hVar != null) {
            return new hdx(0, (vu30) null, new q9j0((byte) 9, u7hVar.a), (vu30) null, (hw61) null, 27);
        }
        return u7hVar2 != null ? new hdx(0, new q9j0((byte) 10, u7hVar2.a), (vu30) null, (vu30) null, (hw61) null, 29) : new idx(8);
    }

    public static phc u(xg60 xg60Var) {
        vhp0 vhp0VarP = ObservationPlatformProto.Histogram.p();
        vhp0VarP.n(xg60Var.a);
        List list = xg60Var.b;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((Number) it.next()).intValue()));
        }
        vhp0VarP.q(arrayList);
        vhp0VarP.r(xg60Var.c);
        vhp0VarP.s(xg60Var.d);
        return vhp0VarP.build().toByteString();
    }

    public static final boolean v(vhc1 vhc1Var) {
        if (!(vhc1Var instanceof thc1)) {
            return false;
        }
        String str = (String) ((thc1) vhc1Var).j.get("recsplanation");
        if (str == null) {
            str = "";
        }
        return !ihc1.y0(str);
    }

    public static final go80 w(klm klmVar, wbp0 wbp0Var, wbp0 wbp0Var2, wbp0 wbp0Var3, wbp0 wbp0Var4, wbp0 wbp0Var5, wbp0 wbp0Var6) {
        return klmVar.a("MusicBranchLoginDaemon", new dy7(wbp0Var, wbp0Var2, wbp0Var3, wbp0Var4, wbp0Var5, wbp0Var6, (byte) 23));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v16 java.lang.Object, still in use, count: 2, list:
          (r4v16 java.lang.Object) from 0x0151: PHI (r4 I:??) = (r4v13 java.lang.Object), (r4v16 java.lang.Object) binds: [B:60:0x0150, B:121:0x0151] A[DONT_GENERATE, DONT_INLINE]
          (r4v16 java.lang.Object) from 0x0145: CHECK_CAST (p.dal0) (r4v16 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static final p.w7h1 x(com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ClickAction r11, p.g5l0 r12) {
        /*
            Method dump skipped, instruction units count: 742
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.i0p1.x(com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ClickAction, p.g5l0):p.w7h1");
    }

    public static final xa71 y(ya71 ya71Var, Class cls) {
        kly0 kly0Var = (kly0) ya71Var.a.get(cls);
        xa71 xa71Var = kly0Var != null ? (xa71) kly0Var.get() : null;
        if (xa71Var == null) {
            xa71Var = null;
        }
        if (xa71Var != null) {
            return xa71Var;
        }
        bhn0.k("Plugin ", cls, " is required but could not be found in ShareMenuPluginRegistry.");
        return null;
    }

    public static final i79 z(bpo bpoVar, Map map) {
        g79 g79Var;
        i79 i79Var;
        switch (bpoVar.ordinal()) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
            case 1:
                g79Var = g79.a;
                break;
            case 2:
            case 3:
                g79Var = g79.b;
                break;
            case 4:
            case 5:
                g79Var = g79.c;
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                g79Var = g79.d;
                break;
            case grn1.d /* 12 */:
            case 13:
                g79Var = g79.e;
                break;
            default:
                eg.o();
                return null;
        }
        if (map == null || (i79Var = (i79) map.get(g79Var)) == null || i79Var.a != g79Var) {
            return null;
        }
        return i79Var;
    }
}
