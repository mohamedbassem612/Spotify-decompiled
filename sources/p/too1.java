package p;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ravelin.core.model.RavelinError;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class too1 {
    public static b180 a;

    public static final void a(String str, gw70 gw70Var, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-456909038);
        int i4 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(gw70Var) ? 32 : 16);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
        } else {
            i3 = i4 | (x340Var.g(qim0Var) ? 256 : 128);
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            if (i5 != 0) {
                qim0Var = nim0.a;
            }
            mod.b(oi7.a.a(gw70Var), apo.r(423252562, new rj(qim0Var, str, (byte) 6), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new r27(str, gw70Var, qim0Var2, i, i2, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00be  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:75:0x0102  */
    /* JADX WARN: Code duplicated, block: B:77:0x0123  */
    /* JADX WARN: Code duplicated, block: B:80:0x012e  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    public static final void b(qim0 qim0Var, xtb0 xtb0Var, vzq0 vzq0Var, iu30 iu30Var, b0k b0kVar, int i, int i2) {
        qim0 qim0Var2;
        int i3;
        xtb0 xtb0Var2;
        vzq0 vzq0Var2;
        boolean z;
        xtb0 xtb0Var3;
        vzq0 vzq0Var3;
        h311 h311VarV;
        qim0 qim0Var3;
        xtb0 xtb0VarA;
        qim0 qim0Var4;
        vzq0 vzq0VarH;
        xtb0 xtb0Var4;
        kex kexVar;
        boolean z2;
        boolean zG;
        Object objT;
        int i4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-208669306);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            qim0Var2 = qim0Var;
        } else if ((i & 6) == 0) {
            qim0Var2 = qim0Var;
            i3 = (x340Var.g(qim0Var2) ? 4 : 2) | i;
        } else {
            qim0Var2 = qim0Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                xtb0Var2 = xtb0Var;
                int i6 = x340Var.g(xtb0Var2) ? 32 : 16;
                i3 |= i6;
            } else {
                xtb0Var2 = xtb0Var;
            }
            i3 |= i6;
        } else {
            xtb0Var2 = xtb0Var;
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                vzq0Var2 = vzq0Var;
                i3 |= x340Var.g(vzq0Var2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if (x340Var.i(iu30Var)) {
                    i4 = 2048;
                } else {
                    i4 = 1024;
                }
                i3 |= i4;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                x340Var.d0();
                if ((i & 1) != 0 || x340Var.E()) {
                    if (i5 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var2;
                    }
                    if ((i2 & 2) != 0) {
                        xtb0VarA = aub0.a(0, x340Var, 3);
                        i3 &= -113;
                    } else {
                        xtb0VarA = xtb0Var2;
                    }
                    if (i7 != 0) {
                        qim0Var4 = qim0Var3;
                        xtb0Var4 = xtb0VarA;
                        vzq0VarH = uyn1.h(3, 0.0f, 0.0f);
                    } else {
                        qim0Var4 = qim0Var3;
                        vzq0VarH = vzq0Var2;
                        xtb0Var4 = xtb0VarA;
                    }
                } else {
                    x340Var.b0();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    qim0Var4 = qim0Var2;
                    vzq0VarH = vzq0Var2;
                    xtb0Var4 = xtb0Var2;
                }
                x340Var.s();
                kexVar = new kex();
                iu30Var.invoke(kexVar);
                if (x340Var.k(t4k.n) == flb0.a) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                d36 d36Var = new d36(8.0f, true, new um5(false));
                fra fraVar = een.N0;
                zG = x340Var.g(kexVar) | x340Var.h(z2);
                objT = x340Var.T();
                if (zG || objT == fkj0.X) {
                    objT = new cb8(kexVar, z2, (byte) 6);
                    x340Var.s0(objT);
                }
                ujo1.e(qim0Var4, xtb0Var4, vzq0VarH, d36Var, fraVar, null, false, null, (iu30) objT, x340Var, (i3 & 112) | 196608 | (i3 & 896), 456);
                qim0Var2 = qim0Var4;
                xtb0Var3 = xtb0Var4;
                vzq0Var3 = vzq0VarH;
            } else {
                x340Var.b0();
                xtb0Var3 = xtb0Var2;
                vzq0Var3 = vzq0Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new nj2(qim0Var2, xtb0Var3, vzq0Var3, iu30Var, i, i2);
            }
        }
        i3 |= 384;
        vzq0Var2 = vzq0Var;
        if ((i & 3072) == 0) {
            if (x340Var.i(iu30Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    qim0Var3 = nim0.a;
                } else {
                    qim0Var3 = qim0Var2;
                }
                if ((i2 & 2) != 0) {
                    xtb0VarA = aub0.a(0, x340Var, 3);
                    i3 &= -113;
                } else {
                    xtb0VarA = xtb0Var2;
                }
                if (i7 != 0) {
                    qim0Var4 = qim0Var3;
                    xtb0Var4 = xtb0VarA;
                    vzq0VarH = uyn1.h(3, 0.0f, 0.0f);
                } else {
                    qim0Var4 = qim0Var3;
                    vzq0VarH = vzq0Var2;
                    xtb0Var4 = xtb0VarA;
                }
            } else {
                if (i5 != 0) {
                    qim0Var3 = nim0.a;
                } else {
                    qim0Var3 = qim0Var2;
                }
                if ((i2 & 2) != 0) {
                    xtb0VarA = aub0.a(0, x340Var, 3);
                    i3 &= -113;
                } else {
                    xtb0VarA = xtb0Var2;
                }
                if (i7 != 0) {
                    qim0Var4 = qim0Var3;
                    xtb0Var4 = xtb0VarA;
                    vzq0VarH = uyn1.h(3, 0.0f, 0.0f);
                } else {
                    qim0Var4 = qim0Var3;
                    vzq0VarH = vzq0Var2;
                    xtb0Var4 = xtb0VarA;
                }
            }
            x340Var.s();
            kexVar = new kex();
            iu30Var.invoke(kexVar);
            if (x340Var.k(t4k.n) == flb0.a) {
                z2 = true;
            } else {
                z2 = false;
            }
            uwr uwrVar2 = cbx.a;
            cvx cvxVar2 = cbx.b(x340Var).b;
            d36 d36Var2 = new d36(8.0f, true, new um5(false));
            fra fraVar2 = een.N0;
            zG = x340Var.g(kexVar) | x340Var.h(z2);
            objT = x340Var.T();
            if (zG) {
                objT = new cb8(kexVar, z2, (byte) 6);
                x340Var.s0(objT);
            } else {
                objT = new cb8(kexVar, z2, (byte) 6);
                x340Var.s0(objT);
            }
            ujo1.e(qim0Var4, xtb0Var4, vzq0VarH, d36Var2, fraVar2, null, false, null, (iu30) objT, x340Var, (i3 & 112) | 196608 | (i3 & 896), 456);
            qim0Var2 = qim0Var4;
            xtb0Var3 = xtb0Var4;
            vzq0Var3 = vzq0VarH;
        } else {
            x340Var.b0();
            xtb0Var3 = xtb0Var2;
            vzq0Var3 = vzq0Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nj2(qim0Var2, xtb0Var3, vzq0Var3, iu30Var, i, i2);
        }
    }

    public static final void c(ta60 ta60Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        ta60 ta60Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(997765284);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(ta60Var) : x340Var.i(ta60Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        byte b = 3;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            ta60Var2 = ta60Var;
            ulo1.b(ta60Var2, "HighlightStacked2Card", null, apo.r(-188589151, new nc60(ta60Var, b), x340Var), x340Var, (i3 & 14) | 24624 | ((i3 << 3) & 896), 8);
            qim0Var = nim0.a;
        } else {
            ta60Var2 = ta60Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oc60(ta60Var2, qim0Var, i, (byte) 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(fwb0 fwb0Var, vu30 vu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var;
        qim0 qim0Var2;
        boolean z = fwb0Var.b;
        m4c m4cVar = fkj0.X;
        ewb0 ewb0Var = fwb0Var.a;
        dwb0 dwb0Var = ewb0Var.b;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(479983415);
        int i2 = 2;
        int i3 = i | (x340Var2.g(fwb0Var) ? 4 : 2) | (x340Var2.i(vu30Var) ? 32 : 16) | 384;
        byte b = 1;
        boolean z2 = false;
        if (x340Var2.Y(i3 & 1, (i3 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            d36 d36Var = new d36(8.0f, true, new um5(false));
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("leaderboard-container", u291.f(qim0Var3, 1.0f));
            mbh mbhVarA = jbh.a(d36Var, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarN);
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
            x340Var2.i0(-1819188937);
            int i4 = 0;
            for (Object obj : o7h.d1(ewb0Var.a, 10)) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    p7h.T();
                    throw null;
                }
                dwb0 dwb0Var2 = (dwb0) obj;
                boolean z3 = (dwb0Var2.h || (dwb0Var2.t != i2 && z)) ? z2 : b;
                int i6 = ((i3 & 112) == 32 ? b : (byte) 0) | (x340Var2.e(i4) ? 1 : 0);
                Object objT = x340Var2.T();
                if (i6 != 0 || objT == m4cVar) {
                    objT = new t7m(vu30Var, i4, b);
                    x340Var2.s0(objT);
                }
                x340 x340Var3 = x340Var2;
                e(dwb0Var2, z3, (iu30) objT, null, x340Var3, 0);
                x340Var2 = x340Var3;
                i4 = i5;
                z2 = false;
                qim0Var3 = qim0Var3;
                i2 = 2;
                b = 1;
            }
            boolean z4 = z2;
            x340Var = x340Var2;
            qim0 qim0Var4 = qim0Var3;
            x340Var.r(z4);
            if (dwb0Var != null) {
                x340Var.i0(-560026168);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var).b;
                cvx cvxVar3 = cbx.b(x340Var).b;
                cvx cvxVar4 = cbx.b(x340Var).b;
                i3o1.e(z4 ? 1 : 0, z4 ? 1 : 0, x340Var, uyn1.A(qim0Var4, 16.0f, 8.0f, 16.0f, 0.0f));
                boolean z5 = (dwb0Var.h || (dwb0Var.t != 2 && z)) ? z4 ? 1 : 0 : true;
                boolean z6 = (i3 & 112) == 32 ? true : z4 ? 1 : 0;
                Object objT2 = x340Var.T();
                Object obj2 = objT2;
                if (z6 || objT2 == m4cVar) {
                    pm0 pm0Var = new pm0(vu30Var, (byte) 3);
                    x340Var.s0(pm0Var);
                    obj2 = pm0Var;
                }
                e(dwb0Var, z5, (iu30) obj2, null, x340Var, 0);
                x340Var = x340Var;
                x340Var.r(z4);
            } else {
                x340Var.i0(-559490891);
                x340Var.r(z4);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var4;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mb90(fwb0Var, vu30Var, qim0Var2, i, (byte) 19);
        }
    }

    public static final void e(dwb0 dwb0Var, boolean z, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1669451136);
        int i2 = i | (b0kVar3.g(dwb0Var) ? 4 : 2) | (b0kVar3.h(z) ? 32 : 16) | (b0kVar3.i(iu30Var) ? 256 : 128) | 3072;
        byte b = 0;
        byte b2 = 1;
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            String strO0 = cwl1.o0(b0kVar3, 2131957185);
            String str = dwb0Var.c;
            if (str == null) {
                str = "";
            }
            String str2 = String.format(strO0, Arrays.copyOf(new Object[]{str}, 1));
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarZ = u291.z(u291.f(qim0Var3, 1.0f), (fra) null, 3);
            String str3 = String.format("leaderboard-row-%s", Arrays.copyOf(new Object[]{dwb0Var.a}, 1));
            int i3 = i2 & 14;
            boolean z2 = ((i2 & 896) == 256) | (i3 == 4);
            Object objT = b0kVar3.T();
            if (z2 || objT == m4cVar) {
                objT = new x680(iu30Var, dwb0Var, (byte) 21);
                b0kVar3.s0(objT);
            }
            qim0 qim0VarI = zr7.i(qim0VarZ, new pa5(!z, cwl1.o0(b0kVar3, 2131957184), (Function0) objT, str3, (byte) 0));
            boolean zG = ((i2 & 112) == 32) | b0kVar3.g(str2) | (i3 == 4);
            Object objT2 = b0kVar3.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new c30(z, str2, dwb0Var, (byte) 19);
                b0kVar3.s0(objT2);
            }
            b0kVar2 = b0kVar3;
            jto1.b(s161.a(qim0VarI, (iu30) objT2), new uvx((pgx) null, 3, (tvx) null, (p3v) null, 26), null, false, null, null, null, null, apo.r(1204546102, new yy80(dwb0Var, (byte) 23), b0kVar3), apo.r(-946937033, new awb0(dwb0Var, z, b), b0kVar3), null, null, apo.r(1641917881, new awb0(dwb0Var, z, b2), b0kVar3), null, null, apo.r(-517564228, new awb0(dwb0Var, z, (byte) 2), b0kVar3), b0kVar2, 905969728, 196992, 27900);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new qy90((Object) dwb0Var, z, (Object) iu30Var, (Object) qim0Var2, i, (byte) 4);
        }
    }

    public static final void f(int i, Function0 function0, b0k b0kVar, boolean z) {
        b0k b0kVar2;
        long j;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1675883130);
        int i2 = (b0kVar3.h(z) ? 4 : 2) | i | (b0kVar3.i(function0) ? 32 : 16);
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            View view = (View) b0kVar3.k(AndroidCompositionLocals_androidKt.f);
            boolean zI = b0kVar3.i(view);
            Object objT = b0kVar3.T();
            if (zI || objT == m4cVar) {
                objT = new r7p0(view, (lnm) null, (byte) 0);
                b0kVar3.s0(objT);
            }
            qxd0.t(view, b0kVar3, (vu30) objT);
            String strO0 = cwl1.o0(b0kVar3, 2131959272);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarV = bin.v(anm1.N("npv_agent_button", u291.d(nim0Var, 1.0f)), null, ny3.a, false, null, null, function0, 28);
            boolean zG = b0kVar3.g(strO0);
            Object objT2 = b0kVar3.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new fki0(strO0, (byte) 26);
                b0kVar3.s0(objT2);
            }
            qim0 qim0VarB = s161.b(qim0VarV, false, (iu30) objT2);
            gfh0 gfh0VarC = t1c.c(een.h, false);
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
            nko1.H(gfh0VarC, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            if (z) {
                b0kVar3.i0(-364774595);
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(b0kVar3).g;
                t1c.a(dug.f(u291.r(nim0Var, 40.0f), cbx.a(b0kVar3).a.b.a(), er31.a), b0kVar3, 0);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-364585278);
                b0kVar3.r(false);
            }
            if (z) {
                b0kVar3.i0(-565946360);
                b0kVar3.r(false);
                uwr uwrVar2 = cbx.a;
                j = ((xex) ((gmt) zex.a.c).b).m;
            } else {
                b0kVar3.i0(-565944988);
                uwr uwrVar3 = cbx.a;
                j = cbx.a(b0kVar3).b.a;
                b0kVar3.r(false);
            }
            b0kVar2 = b0kVar3;
            i9p1.j(null, false, j, b0kVar2, 48, 1);
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ie1((byte) 14, i, function0, z);
        }
    }

    public static final void g(dwb0 dwb0Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1811765021);
        int i2 = i | (x340Var.g(dwb0Var) ? 4 : 2) | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            xxh xxhVar = dwb0Var.d;
            boolean z = xxhVar instanceof wxh;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarU = u291.u(qim0Var3, 24.0f, 0.0f, 0.0f, 0.0f, 14);
            mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarU);
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
            vxh vxhVar = vxh.a;
            if (!z || u890.j(xxhVar, vxhVar)) {
                x340Var.i0(53583029);
                x340Var.r(false);
            } else {
                x340Var.i0(53521525);
                lap1.a(xxhVar, null, x340Var, 0);
                x340Var.r(false);
            }
            String str = dwb0Var.c;
            str.getClass();
            uwr uwrVar = cbx.a;
            uwo1.e(str, null, cbx.d(x340Var).h, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            if (z || u890.j(xxhVar, vxhVar)) {
                x340Var.i0(53853845);
                x340Var.r(false);
            } else {
                x340Var.i0(53792341);
                lap1.a(xxhVar, null, x340Var, 0);
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vx90(dwb0Var, qim0Var2, i, (byte) 13);
        }
    }

    public static final void h(ja60 ja60Var, long j, xd60 xd60Var, b0k b0kVar, int i) {
        long j2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(693225197);
        j06 j06Var = ((x340) b0kVar2).a;
        int i2 = i | (b0kVar2.g(ja60Var) ? 4 : 2) | (b0kVar2.f(j) ? 32 : 16) | (b0kVar2.i(xd60Var) ? 256 : 128);
        if (b0kVar2.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarB = uyn1.B(u291.d(nim0Var, 1.0f), 0.0f, xd60Var.b, 0.0f, 0.0f, 13);
            era eraVar = een.P0;
            mbh mbhVarA = jbh.a(h36.g, eraVar, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z = ((x340) b0kVar2).S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, b0kVar2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, lljVar4);
            hb60.a(ja60Var.a, j, xd60Var.g, uyn1.w(u291.f(nim0Var, 1.0f), xd60Var.c), xd60Var.a, 0, b0kVar2, i2 & 112, 32);
            j2 = j;
            b0kVar2 = b0kVar2;
            zko1.f(ja60Var.d, uyn1.z(cvxVar.b, 0.0f, 2, u291.f(nim0Var, 1.0f)).then(ulo1.p(b0kVar2, 1)), null, 0L, b0kVar2, 0, 12);
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            mbh mbhVarA2 = jbh.a(h36.c, eraVar, b0kVar2, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarF);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA2, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            wd60.a(ja60Var.b, (qim0) null, (u7h) null, (djc0) null, xd60Var.d, b0kVar2, 8, 14);
            wd60.a(ja60Var.c, (qim0) null, new u7h(j2), (djc0) null, xd60Var.e, b0kVar2, 8 | ((i2 << 3) & 896), 10);
            b0kVar2.r(true);
            b0kVar2.r(true);
        } else {
            j2 = j;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new qi6((Object) ja60Var, j2, (Object) xd60Var, i, (byte) 9);
        }
    }

    public static final qim0 i(qim0 qim0Var, vzq0 vzq0Var) {
        return qim0Var.then(new wzq0(vzq0Var));
    }

    public static final qim0 j(qim0 qim0Var, erl1 erl1Var) {
        return qim0Var.then(new nih1(erl1Var));
    }

    public static final h4k k(hmb0 hmb0Var, v3k v3kVar) {
        ViewGroup.LayoutParams layoutParams = ljm1.a;
        return new h4k(v3kVar, new wch1(hmb0Var));
    }

    public static final h4k l(hmb0 hmb0Var, v3k v3kVar) {
        ViewGroup.LayoutParams layoutParams = ljm1.a;
        return new h4k(v3kVar, new wch1(hmb0Var));
    }

    public static final int m(Context context, int i) {
        return context.getResources().getDimensionPixelSize(i);
    }

    public static final Object o(Object obj, String str, vr20 vr20Var, a8d1 a8d1Var) {
        Throwable thA = e331.a(obj);
        d9n d9nVar = d9n.a;
        if (thA == null) {
            goe goeVar = (goe) obj;
            Object objEmit = vr20Var.emit(new k1f(goeVar.a, goeVar.f, str), a8d1Var);
            if (objEmit == d9nVar) {
                return objEmit;
            }
        } else {
            op71.x(a8d1Var.getContext());
            Object objEmit2 = vr20Var.emit(new j1f(str), a8d1Var);
            if (objEmit2 == d9nVar) {
                return objEmit2;
            }
        }
        return rih1.a;
    }

    public static final boolean p(jre jreVar) {
        return (jreVar instanceof ire) || (jreVar instanceof dre) || (jreVar instanceof gre);
    }

    public static final String q(jre jreVar) {
        hre hreVar = jreVar instanceof hre ? (hre) jreVar : null;
        if (hreVar != null) {
            return hreVar.b;
        }
        return null;
    }

    public static mf61 r() {
        return (mf61) wi20.c().b(mf61.class);
    }

    public static final qim0 s(qim0 qim0Var, iu30 iu30Var) {
        return qim0Var.then(new yjl(iu30Var));
    }

    public static y8s0 t(nha0 nha0Var, fcf0 fcf0Var) {
        return new y8s0(fcf0Var, uua0.b(nha0Var, fcf0Var, qpi1.c(), een.p1, nha0Var.o() == 3, false));
    }

    /* JADX WARN: Code duplicated, block: B:40:0x010e  */
    public static hob1 v(iob1 iob1Var) {
        Object next;
        yaw0 yaw0Var;
        boolean z;
        String str = iob1Var.b;
        Long l = iob1Var.x;
        String str2 = iob1Var.q;
        String str3 = iob1Var.n;
        Iterator it = f46.i0(new String[]{str2, str3}).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!bbp1.k((String) next));
        String str4 = (String) next;
        boolean z2 = iob1Var.v;
        wiv0 wiv0Var = (!z2 || str4 == null) ? null : new wiv0(str4, str3, l, (iu30) null);
        String str5 = str2 == null ? str : str2;
        String str6 = iob1Var.e;
        wcm wcmVar = new wcm(str5, (String) null, (String) null, scm.a, (Function0) null, new z8i0(iob1Var, (byte) 2), false, str6, (String) null, 854);
        String str7 = iob1Var.a;
        String str8 = iob1Var.d;
        String str9 = iob1Var.n;
        boolean z3 = iob1Var.s;
        boolean z4 = iob1Var.t;
        cr00 cr00Var = iob1Var.h;
        String str10 = iob1Var.f;
        if (str10 == null) {
            str10 = "";
        }
        String str11 = str8;
        String str12 = iob1Var.m;
        String str13 = iob1Var.l;
        String str14 = iob1Var.E;
        String str15 = iob1Var.i;
        lfi0 lfi0Var = new lfi0((String) null, str6, str10, str14, str12, iob1Var.F, str13, str15 != null ? str15 : "", str, (k4m) null, wcmVar, false, false, false, false, false, false, false, (String) null, (Float) null, 33485953);
        if (z2) {
            yaw0Var = null;
        } else {
            yaw0 yaw0Var2 = new yaw0(8144, str7, str11, iob1Var.o, iob1Var.p, (String) null, (k4m) null, iob1Var.z, false, false, false);
            str11 = str11;
            yaw0Var = yaw0Var2;
        }
        if (z2) {
            z = false;
        } else {
            e6p1 e6p1Var = iob1Var.A;
            if ((e6p1Var instanceof l281) || (e6p1Var instanceof n281) || (e6p1Var instanceof o281)) {
                z = false;
            } else {
                z = true;
            }
        }
        set0 set0Var = new set0(str11, z, "medium_audio_promo", "home", (Function0) null, false, false, (Function0) null, (String) null, (String) null, false, 2032);
        uho uhoVar = (z2 || str2 == null) ? null : new uho(str2, str, qho.a, (nho) null, str6, (Function0) null, 232);
        Long l2 = z2 ? l : null;
        String str16 = iob1Var.w;
        return new hob1(str7, str, str11, str9, "", z3, z4, cr00Var, false, (mbw0) null, lfi0Var, yaw0Var, (xfn0) null, set0Var, wcmVar, uhoVar, wiv0Var, (uiv0) null, (String) null, l2, (iiv0) null, str16 != null ? new v9n(str16) : null, iob1Var.D, (ch7) null, iob1Var.y, 0L, false, false, (Integer) null, false, false, false, iob1Var.j, iob1Var.B, iob1Var.C, false, (sq51) null, (String) null, (String) null, false, false, (String) null, (c5v0) null, -23981312, 2040);
    }

    public static iob1 w(mey0 mey0Var, t810 t810Var, yqg yqgVar, fza fzaVar, hvp0 hvp0Var, ytp0 ytp0Var, ebi0 ebi0Var) {
        goj0 goj0VarA;
        goj0 goj0VarA2;
        goj0 goj0VarA3;
        goj0 goj0VarA4;
        goj0 goj0VarA5;
        ioj0 ioj0Var = t810Var.a;
        String str = mey0Var.h;
        if (str == null) {
            str = mey0Var.c;
        }
        hoj0 hoj0VarC = ioj0Var.c(nbw0.class, mey0Var.d);
        ez00 ez00Var = null;
        nbw0 nbw0Var = (nbw0) ((hoj0VarC == null || (goj0VarA5 = hoj0VarC.a()) == null) ? null : (ez00) goj0VarA5.a);
        hoj0 hoj0VarC2 = ioj0Var.c(pjw0.class, str);
        pjw0 pjw0Var = (pjw0) ((hoj0VarC2 == null || (goj0VarA4 = hoj0VarC2.a()) == null) ? null : (ez00) goj0VarA4.a);
        hoj0 hoj0VarC3 = ioj0Var.c(w281.class, str);
        w281 w281Var = (w281) ((hoj0VarC3 == null || (goj0VarA3 = hoj0VarC3.a()) == null) ? null : (ez00) goj0VarA3.a);
        hoj0 hoj0VarC4 = ioj0Var.c(prl.class, str);
        prl prlVar = (prl) ((hoj0VarC4 == null || (goj0VarA2 = hoj0VarC4.a()) == null) ? null : (ez00) goj0VarA2.a);
        hoj0 hoj0VarC5 = ioj0Var.c(e2k1.class, str);
        if (hoj0VarC5 != null && (goj0VarA = hoj0VarC5.a()) != null) {
            ez00Var = (ez00) goj0VarA.a;
        }
        return x(mey0Var, nbw0Var, pjw0Var, w281Var, prlVar, (e2k1) ez00Var, t810Var, yqgVar, hvp0Var, ytp0Var, ebi0Var);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x013d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0158  */
    /* JADX WARN: Code duplicated, block: B:114:0x0172  */
    /* JADX WARN: Code duplicated, block: B:119:0x017e  */
    /* JADX WARN: Code duplicated, block: B:122:0x0184  */
    /* JADX WARN: Code duplicated, block: B:124:0x018b  */
    /* JADX WARN: Code duplicated, block: B:126:0x018f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0193 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:132:0x019c  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:136:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:137:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:142:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:147:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:149:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:152:0x0213  */
    /* JADX WARN: Code duplicated, block: B:153:0x0216  */
    /* JADX WARN: Code duplicated, block: B:155:0x021a  */
    /* JADX WARN: Code duplicated, block: B:156:0x021d  */
    /* JADX WARN: Code duplicated, block: B:159:0x0237  */
    /* JADX WARN: Code duplicated, block: B:161:0x023c  */
    /* JADX WARN: Code duplicated, block: B:164:0x025b  */
    /* JADX WARN: Code duplicated, block: B:165:0x025e  */
    /* JADX WARN: Code duplicated, block: B:168:0x0271  */
    /* JADX WARN: Code duplicated, block: B:170:0x027b  */
    /* JADX WARN: Code duplicated, block: B:172:0x027f  */
    /* JADX WARN: Code duplicated, block: B:174:0x0283  */
    /* JADX WARN: Code duplicated, block: B:175:0x0286  */
    /* JADX WARN: Code duplicated, block: B:178:0x028b  */
    /* JADX WARN: Code duplicated, block: B:179:0x028e  */
    /* JADX WARN: Code duplicated, block: B:181:0x0291  */
    /* JADX WARN: Code duplicated, block: B:182:0x0294  */
    /* JADX WARN: Code duplicated, block: B:184:0x0297  */
    /* JADX WARN: Code duplicated, block: B:185:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:187:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    /* JADX WARN: Code duplicated, block: B:190:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:193:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:195:0x02bd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:199:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:19:0x0040  */
    /* JADX WARN: Code duplicated, block: B:202:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:203:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:206:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:208:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:209:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:212:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:213:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:216:0x0303  */
    /* JADX WARN: Code duplicated, block: B:217:0x0308  */
    /* JADX WARN: Code duplicated, block: B:219:0x030b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    /* JADX WARN: Code duplicated, block: B:220:0x0310  */
    /* JADX WARN: Code duplicated, block: B:223:0x0314  */
    /* JADX WARN: Code duplicated, block: B:224:0x0316  */
    /* JADX WARN: Code duplicated, block: B:227:0x0321 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:228:0x0323  */
    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    /* JADX WARN: Code duplicated, block: B:230:0x0327  */
    /* JADX WARN: Code duplicated, block: B:232:0x032b  */
    /* JADX WARN: Code duplicated, block: B:233:0x032d  */
    /* JADX WARN: Code duplicated, block: B:238:0x0335  */
    /* JADX WARN: Code duplicated, block: B:240:0x0338  */
    /* JADX WARN: Code duplicated, block: B:241:0x033b  */
    /* JADX WARN: Code duplicated, block: B:244:0x034e  */
    /* JADX WARN: Code duplicated, block: B:246:0x0353  */
    /* JADX WARN: Code duplicated, block: B:249:0x0364  */
    /* JADX WARN: Code duplicated, block: B:24:0x004f  */
    /* JADX WARN: Code duplicated, block: B:250:0x0367  */
    /* JADX WARN: Code duplicated, block: B:252:0x036b  */
    /* JADX WARN: Code duplicated, block: B:253:0x0372  */
    /* JADX WARN: Code duplicated, block: B:255:0x0376  */
    /* JADX WARN: Code duplicated, block: B:257:0x037e  */
    /* JADX WARN: Code duplicated, block: B:258:0x0383  */
    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e A[PHI: r15
      0x005e: PHI (r15v15 java.lang.String) = (r15v2 java.lang.String), (r15v3 java.lang.String), (r15v18 java.lang.String) binds: [B:39:0x0075, B:35:0x006a, B:28:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:73:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:86:0x0107  */
    /* JADX WARN: Code duplicated, block: B:88:0x010c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0111  */
    /* JADX WARN: Code duplicated, block: B:92:0x0113  */
    /* JADX WARN: Code duplicated, block: B:97:0x0129  */
    /* JADX WARN: Code duplicated, block: B:99:0x0130  */
    public static iob1 x(mey0 mey0Var, nbw0 nbw0Var, pjw0 pjw0Var, w281 w281Var, prl prlVar, e2k1 e2k1Var, t810 t810Var, yqg yqgVar, hvp0 hvp0Var, ytp0 ytp0Var, ebi0 ebi0Var) {
        String str;
        String strX;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        r4p1 r4p1VarH;
        iob1 iob1VarE;
        String str7;
        boolean z;
        String str8;
        Long lValueOf;
        Long l;
        boolean z2;
        int i;
        iob1 iob1Var;
        boolean z3;
        String strN;
        String str9;
        String str10;
        d2k1 d2k1VarJ;
        String str11;
        m4m m4mVarX;
        y2u0 y2u0Var;
        boolean z4;
        boolean z5;
        boolean z6;
        String str12;
        r4p1 r4p1Var;
        iob1 iob1Var2;
        int i2;
        lsm0 lsm0Var;
        iob1 iob1Var3;
        iob1 iob1Var4;
        iob1 iob1Var5;
        iob1 iob1Var6;
        iob1 iob1Var7;
        long jH;
        hwt hwtVar;
        boolean z7;
        boolean z8;
        iob1 iob1Var8;
        iob1 iob1Var9;
        String str13;
        int i3;
        int i4;
        int i5;
        int i6;
        String str14;
        iob1 iob1Var10;
        String str15;
        iob1 iob1Var11;
        int i7;
        iob1 iob1Var12;
        u281 u281Var;
        iob1 iob1VarQ;
        nrl nrlVar;
        ljw0 ljw0Var;
        ko7 ko7Var;
        String str16;
        String str17;
        int i8;
        int i9;
        Set set;
        long jP;
        Long lValueOf2;
        String str18;
        ijo ijoVar = t810Var.d;
        String str19 = mey0Var.h;
        prb1 prb1Var = mey0Var.e;
        String str20 = mey0Var.c;
        String str21 = str19 == null ? str20 : str19;
        boolean z9 = pjw0Var != null;
        if (nbw0Var == null) {
            if (prb1Var != null) {
                strX = nho1.x(prb1Var);
            } else {
                str = "";
            }
            if (nbw0Var != null) {
                str2 = nbw0Var.g;
            } else {
                str2 = null;
            }
            if (nbw0Var != null) {
                str3 = nbw0Var.c;
            } else {
                str3 = null;
            }
            if (nbw0Var != null) {
                str5 = nbw0Var.p.a;
                if (ihc1.y0(str5)) {
                    str5 = null;
                }
                if (str5 == null) {
                    str4 = str5;
                } else if (prb1Var != null) {
                    if (prb1Var instanceof i460) {
                        str6 = ((i460) prb1Var).b;
                    } else {
                        if (prb1Var instanceof prb1) {
                            str6 = prb1Var.b;
                        } else {
                            str5 = null;
                        }
                        str4 = str5;
                    }
                    str5 = str6;
                    str4 = str5;
                } else {
                    str4 = null;
                }
            } else if (prb1Var != null) {
                if (prb1Var instanceof i460) {
                    str6 = ((i460) prb1Var).b;
                } else {
                    if (prb1Var instanceof prb1) {
                        str6 = prb1Var.b;
                    } else {
                        str5 = null;
                    }
                    str4 = str5;
                }
                str5 = str6;
                str4 = str5;
            } else {
                str4 = null;
            }
            if (nbw0Var != null) {
                str18 = nbw0Var.j;
                if (str18.length() <= 0) {
                    str18 = null;
                }
                if (str18 != null) {
                    r4p1VarH = fza.h(str18);
                } else {
                    r4p1VarH = j8h.c;
                }
            } else {
                r4p1VarH = j8h.c;
            }
            if (nbw0Var != null) {
                jP = nbw0Var.h.p();
                lValueOf2 = Long.valueOf(jP);
                if (jP <= 0) {
                    lValueOf2 = null;
                }
                if (lValueOf2 != null) {
                    iob1VarE = hvp0Var.e(lValueOf2.longValue());
                } else {
                    iob1VarE = null;
                }
            } else {
                iob1VarE = null;
            }
            if (nbw0Var != null) {
                str7 = nbw0Var.f;
            } else {
                str7 = null;
            }
            if (str7 != null || ijoVar == null || (set = ijoVar.a) == null || !set.contains(str7)) {
                z = false;
            } else {
                z = true;
            }
            if (nbw0Var != null) {
                str20 = nbw0Var.e;
            }
            zkm zkmVar = t810Var.b;
            boolean zS = p2o1.s(zkmVar, str21);
            boolean zV = p2o1.v(zkmVar, str21);
            str8 = str21;
            if (nbw0Var != null) {
                lValueOf = Long.valueOf(nbw0Var.i);
            } else {
                lValueOf = null;
            }
            if (lValueOf != null || lValueOf.longValue() <= 0) {
                l = null;
            } else {
                l = lValueOf;
            }
            if (l == null && l.longValue() > yqgVar.b()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (nbw0Var != null) {
                i = nbw0Var.q;
            } else {
                i = 0;
            }
            iob1Var = iob1VarE;
            if (i == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 || z2 || l == null) {
                strN = null;
            } else {
                strN = ytp0Var.n(l.longValue());
            }
            if (z3 == 0 || nbw0Var == null) {
                str10 = null;
            } else {
                str9 = nbw0Var.b;
                if (ihc1.y0(str9)) {
                    str10 = null;
                } else {
                    str10 = str9;
                }
            }
            if (z3 != 0 || z2) {
                d2k1VarJ = null;
            } else {
                d2k1VarJ = e6p1.j(e2k1Var != null ? Long.valueOf(e2k1Var.a) : null, lValueOf, yqgVar.b());
            }
            if (z2 || l == null) {
                str11 = null;
            } else {
                str11 = new SimpleDateFormat("MMMM d", Locale.forLanguageTag(upn1.p())).format(l);
            }
            if (nbw0Var != null || (i9 = nbw0Var.l) == 0) {
                m4mVarX = m4m.c;
            } else {
                m4mVarX = aqo1.x(i9);
            }
            y2u0Var = t810Var.p;
            if (y2u0Var != null) {
                z4 = true;
                boolean z10 = y2u0Var.a(m4mVarX);
                if (pjw0Var != null || z2 || z10) {
                    z5 = false;
                } else {
                    z5 = z4;
                }
                String str22 = str11;
                String str23 = mey0Var.b;
                String str24 = mey0Var.a;
                if (z5) {
                    if (prlVar != null) {
                        nrlVar = prlVar.c;
                    } else {
                        nrlVar = null;
                    }
                    ljw0Var = pjw0Var.b;
                    if (ljw0Var instanceof ljw0) {
                        str16 = ljw0Var.a.a.a.a;
                    } else {
                        if (ljw0Var instanceof mjw0) {
                            eg.o();
                            return null;
                        }
                        ko7Var = ((mjw0) ljw0Var).a.c;
                        if (ko7Var != null) {
                            str16 = ko7Var.a.a.a;
                        } else {
                            str16 = null;
                        }
                        if (str16 == null) {
                            str17 = "";
                        }
                        jsm0 jsm0Var = new jsm0(0L, (Long) null);
                        str12 = str7;
                        iob1Var2 = null;
                        r4p1Var = r4p1VarH;
                        z6 = true;
                        i2 = 2;
                        ksm0 ksm0Var = new ksm0(new gec1("f9dcb11cef0d4b0e979134b802af06ee"), pjw0Var.c, str8, "audiobrowse-client-native", str8, (String) null, 448);
                        if (nrlVar instanceof irl) {
                            i8 = 1;
                        } else if (nrlVar instanceof jrl) {
                            i8 = 2;
                        } else {
                            i8 = 3;
                        }
                        lsm0Var = new lsm0(str17, ksm0Var, false, false, jsm0Var, 0L, (ism0) null, "", true, i8, 1096);
                    }
                    str17 = str16;
                    jsm0 jsm0Var2 = new jsm0(0L, (Long) null);
                    str12 = str7;
                    iob1Var2 = null;
                    r4p1Var = r4p1VarH;
                    z6 = true;
                    i2 = 2;
                    ksm0 ksm0Var2 = new ksm0(new gec1("f9dcb11cef0d4b0e979134b802af06ee"), pjw0Var.c, str8, "audiobrowse-client-native", str8, (String) null, 448);
                    if (nrlVar instanceof irl) {
                        i8 = 1;
                    } else if (nrlVar instanceof jrl) {
                        i8 = 2;
                    } else {
                        i8 = 3;
                    }
                    lsm0Var = new lsm0(str17, ksm0Var2, false, false, jsm0Var2, 0L, (ism0) null, "", true, i8, 1096);
                } else {
                    z6 = z4;
                    str12 = str7;
                    r4p1Var = r4p1VarH;
                    iob1Var2 = null;
                    i2 = 2;
                    ubw0.a.getClass();
                    lsm0Var = rbw0.b;
                }
                lsm0 lsm0Var2 = lsm0Var;
                if (ebi0Var.d) {
                    iob1Var3 = 3000L;
                } else {
                    iob1Var3 = iob1Var2;
                }
                sbw0 sbw0Var = new sbw0(str23, str24, lsm0Var2, 0L, false, z5, !ebi0Var.c, iob1Var3, 512);
                if (pjw0Var != null) {
                    iob1VarQ = bs51.q(pjw0Var);
                    if (iob1VarQ.length() == 0) {
                        iob1VarQ = iob1Var2;
                    }
                    iob1Var4 = iob1VarQ;
                } else {
                    iob1Var4 = iob1Var2;
                }
                if (pjw0Var != null) {
                    iob1Var5 = pjw0Var.b;
                } else {
                    iob1Var5 = iob1Var2;
                }
                if (iob1Var5 instanceof mjw0) {
                    iob1Var6 = (mjw0) iob1Var5;
                } else {
                    iob1Var6 = iob1Var2;
                }
                if (iob1Var6 != null) {
                    iob1Var7 = ((mjw0) iob1Var6).b;
                } else {
                    iob1Var7 = iob1Var2;
                }
                if (iob1Var7 != null) {
                    jH = jfv.h(((ojw0) iob1Var7).a);
                } else {
                    jH = 0;
                }
                long jH2 = iob1Var7 != null ? jfv.h(((ojw0) iob1Var7).b) : 0L;
                hwtVar = t810Var.c;
                if (hwtVar == null && hwtVar.d == z6) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (pjw0Var != null || z2 || z10 || iob1Var4 == null) {
                    z8 = z7;
                    iob1Var8 = iob1Var2;
                } else {
                    z8 = z7;
                    iob1 m9g1Var = new m9g1(str8, z8, new r9g1(jH, jH2, iob1Var4), new w8g1(), false);
                    str8 = str8;
                    iob1Var8 = m9g1Var;
                }
                if (ebi0Var.b) {
                    if (w281Var != null || (u281Var = w281Var.g) == null) {
                        iob1Var12 = iob1Var2;
                    } else {
                        iob1Var12 = u281Var.a;
                    }
                    if (iob1Var12 == null) {
                        iob1Var9 = "";
                    } else {
                        iob1Var9 = iob1Var12;
                    }
                } else {
                    iob1Var9 = "";
                }
                if (str3 == null) {
                    str13 = "";
                } else {
                    str13 = str3;
                }
                if (nbw0Var != null) {
                    i3 = nbw0Var.o.a;
                } else {
                    i3 = 0;
                }
                if (nbw0Var != null) {
                    i4 = nbw0Var.o.b;
                } else {
                    i4 = 0;
                }
                if (i4 == 0) {
                    i5 = -1;
                } else {
                    i5 = tbi0.a[l1d.C(i4)];
                }
                if (i5 == -1) {
                    i6 = 1;
                } else {
                    if (i5 != 1) {
                        i7 = i2;
                    } else if (i5 != i2) {
                        i6 = 4;
                        if (i5 != 3) {
                            if (i5 != 4 && i5 != 5) {
                                eg.o();
                                return iob1Var2;
                            }
                            i6 = 1;
                        }
                    } else {
                        i7 = 3;
                    }
                    i6 = i7;
                }
                ar00 ar00Var = new ar00(str13, iob1Var9, new br00(i3, i6, iob1Var2), (String) null, 24);
                if (str2 == null) {
                    str14 = "";
                } else {
                    str14 = str2;
                }
                r4p1 r4p1Var2 = r4p1Var;
                cr00 cr00Var = new cr00(z8, ar00Var, str14, r4p1Var2);
                String str25 = mey0Var.a;
                boolean z11 = z8;
                String str26 = str8;
                String str27 = mey0Var.d;
                x360 x360Var = mey0Var.e;
                if (z3) {
                    iob1Var10 = iob1Var;
                } else {
                    iob1Var10 = iob1Var2;
                }
                if (nbw0Var != null) {
                    str15 = nbw0Var.m.a;
                } else {
                    str15 = "";
                }
                String str28 = nbw0Var != null ? nbw0Var.m.b : "";
                if (w281Var != null) {
                    iob1Var11 = w281Var.a;
                } else {
                    iob1Var11 = iob1Var2;
                }
                return new iob1(str25, str26, str27, str26, str, str4, str3, cr00Var, str2, x360Var, r4p1Var2, iob1Var10, strN, str20, str15, str28, str12, z9, zV, zS, z, z2, str22, lValueOf, sbw0Var, z11, iob1Var11, m4mVarX, t810Var.p, iob1Var8, str10, d2k1VarJ);
            }
            z4 = true;
            if (pjw0Var != null) {
                z5 = false;
            } else {
                z5 = false;
            }
            String str29 = str11;
            String str210 = mey0Var.b;
            String str211 = mey0Var.a;
            if (z5) {
                if (prlVar != null) {
                    nrlVar = prlVar.c;
                } else {
                    nrlVar = null;
                }
                ljw0Var = pjw0Var.b;
                if (ljw0Var instanceof ljw0) {
                    str16 = ljw0Var.a.a.a.a;
                } else {
                    if (ljw0Var instanceof mjw0) {
                        eg.o();
                        return null;
                    }
                    ko7Var = ((mjw0) ljw0Var).a.c;
                    if (ko7Var != null) {
                        str16 = ko7Var.a.a.a;
                    } else {
                        str16 = null;
                    }
                    if (str16 == null) {
                        str17 = "";
                    }
                    jsm0 jsm0Var3 = new jsm0(0L, (Long) null);
                    str12 = str7;
                    iob1Var2 = null;
                    r4p1Var = r4p1VarH;
                    z6 = true;
                    i2 = 2;
                    ksm0 ksm0Var3 = new ksm0(new gec1("f9dcb11cef0d4b0e979134b802af06ee"), pjw0Var.c, str8, "audiobrowse-client-native", str8, (String) null, 448);
                    if (nrlVar instanceof irl) {
                        i8 = 1;
                    } else if (nrlVar instanceof jrl) {
                        i8 = 2;
                    } else {
                        i8 = 3;
                    }
                    lsm0Var = new lsm0(str17, ksm0Var3, false, false, jsm0Var3, 0L, (ism0) null, "", true, i8, 1096);
                }
                str17 = str16;
                jsm0 jsm0Var4 = new jsm0(0L, (Long) null);
                str12 = str7;
                iob1Var2 = null;
                r4p1Var = r4p1VarH;
                z6 = true;
                i2 = 2;
                ksm0 ksm0Var4 = new ksm0(new gec1("f9dcb11cef0d4b0e979134b802af06ee"), pjw0Var.c, str8, "audiobrowse-client-native", str8, (String) null, 448);
                if (nrlVar instanceof irl) {
                    i8 = 1;
                } else if (nrlVar instanceof jrl) {
                    i8 = 2;
                } else {
                    i8 = 3;
                }
                lsm0Var = new lsm0(str17, ksm0Var4, false, false, jsm0Var4, 0L, (ism0) null, "", true, i8, 1096);
            } else {
                z6 = z4;
                str12 = str7;
                r4p1Var = r4p1VarH;
                iob1Var2 = null;
                i2 = 2;
                ubw0.a.getClass();
                lsm0Var = rbw0.b;
            }
            lsm0 lsm0Var3 = lsm0Var;
            if (ebi0Var.d) {
                iob1Var3 = 3000L;
            } else {
                iob1Var3 = iob1Var2;
            }
            sbw0 sbw0Var2 = new sbw0(str210, str211, lsm0Var3, 0L, false, z5, !ebi0Var.c, iob1Var3, 512);
            if (pjw0Var != null) {
                iob1VarQ = bs51.q(pjw0Var);
                if (iob1VarQ.length() == 0) {
                    iob1VarQ = iob1Var2;
                }
                iob1Var4 = iob1VarQ;
            } else {
                iob1Var4 = iob1Var2;
            }
            if (pjw0Var != null) {
                iob1Var5 = pjw0Var.b;
            } else {
                iob1Var5 = iob1Var2;
            }
            if (iob1Var5 instanceof mjw0) {
                iob1Var6 = (mjw0) iob1Var5;
            } else {
                iob1Var6 = iob1Var2;
            }
            if (iob1Var6 != null) {
                iob1Var7 = ((mjw0) iob1Var6).b;
            } else {
                iob1Var7 = iob1Var2;
            }
            if (iob1Var7 != null) {
                jH = jfv.h(((ojw0) iob1Var7).a);
            } else {
                jH = 0;
            }
            long jH3 = iob1Var7 != null ? jfv.h(((ojw0) iob1Var7).b) : 0L;
            hwtVar = t810Var.c;
            if (hwtVar == null) {
                z7 = false;
            } else {
                z7 = false;
            }
            if (pjw0Var != null) {
                z8 = z7;
                iob1Var8 = iob1Var2;
            } else {
                z8 = z7;
                iob1Var8 = iob1Var2;
            }
            if (ebi0Var.b) {
                iob1Var9 = "";
            } else {
                if (w281Var != null) {
                    iob1Var12 = iob1Var2;
                } else {
                    iob1Var12 = iob1Var2;
                }
                if (iob1Var12 == null) {
                    iob1Var9 = "";
                } else {
                    iob1Var9 = iob1Var12;
                }
            }
            if (str3 == null) {
                str13 = "";
            } else {
                str13 = str3;
            }
            if (nbw0Var != null) {
                i3 = nbw0Var.o.a;
            } else {
                i3 = 0;
            }
            if (nbw0Var != null) {
                i4 = nbw0Var.o.b;
            } else {
                i4 = 0;
            }
            if (i4 == 0) {
                i5 = -1;
            } else {
                i5 = tbi0.a[l1d.C(i4)];
            }
            if (i5 == -1) {
                i6 = 1;
            } else {
                if (i5 != 1) {
                    i7 = i2;
                } else if (i5 != i2) {
                    i6 = 4;
                    if (i5 != 3) {
                        if (i5 != 4) {
                            eg.o();
                            return iob1Var2;
                        }
                        i6 = 1;
                    }
                } else {
                    i7 = 3;
                }
                i6 = i7;
            }
            ar00 ar00Var2 = new ar00(str13, iob1Var9, new br00(i3, i6, iob1Var2), (String) null, 24);
            if (str2 == null) {
                str14 = "";
            } else {
                str14 = str2;
            }
            r4p1 r4p1Var3 = r4p1Var;
            cr00 cr00Var2 = new cr00(z8, ar00Var2, str14, r4p1Var3);
            String str212 = mey0Var.a;
            boolean z12 = z8;
            String str213 = str8;
            String str214 = mey0Var.d;
            x360 x360Var2 = mey0Var.e;
            if (z3) {
                iob1Var10 = iob1Var;
            } else {
                iob1Var10 = iob1Var2;
            }
            if (nbw0Var != null) {
                str15 = nbw0Var.m.a;
            } else {
                str15 = "";
            }
            if (nbw0Var != null) {
            }
            if (w281Var != null) {
                iob1Var11 = w281Var.a;
            } else {
                iob1Var11 = iob1Var2;
            }
            return new iob1(str212, str213, str214, str213, str, str4, str3, cr00Var2, str2, x360Var2, r4p1Var3, iob1Var10, strN, str20, str15, str28, str12, z9, zV, zS, z, z2, str29, lValueOf, sbw0Var2, z12, iob1Var11, m4mVarX, t810Var.p, iob1Var8, str10, d2k1VarJ);
        }
        strX = nbw0Var.a;
        str = strX;
        if (nbw0Var != null) {
            str2 = nbw0Var.g;
        } else {
            str2 = null;
        }
        if (nbw0Var != null) {
            str3 = nbw0Var.c;
        } else {
            str3 = null;
        }
        if (nbw0Var != null) {
            str5 = nbw0Var.p.a;
            if (ihc1.y0(str5)) {
                str5 = null;
            }
            if (str5 == null) {
                str4 = str5;
            } else if (prb1Var != null) {
                if (prb1Var instanceof i460) {
                    str6 = ((i460) prb1Var).b;
                } else {
                    if (prb1Var instanceof prb1) {
                        str6 = prb1Var.b;
                    } else {
                        str5 = null;
                    }
                    str4 = str5;
                }
                str5 = str6;
                str4 = str5;
            } else {
                str4 = null;
            }
        } else if (prb1Var != null) {
            if (prb1Var instanceof i460) {
                str6 = ((i460) prb1Var).b;
            } else {
                if (prb1Var instanceof prb1) {
                    str6 = prb1Var.b;
                } else {
                    str5 = null;
                }
                str4 = str5;
            }
            str5 = str6;
            str4 = str5;
        } else {
            str4 = null;
        }
        if (nbw0Var != null) {
            str18 = nbw0Var.j;
            if (str18.length() <= 0) {
                str18 = null;
            }
            if (str18 != null) {
                r4p1VarH = fza.h(str18);
            } else {
                r4p1VarH = j8h.c;
            }
        } else {
            r4p1VarH = j8h.c;
        }
        if (nbw0Var != null) {
            jP = nbw0Var.h.p();
            lValueOf2 = Long.valueOf(jP);
            if (jP <= 0) {
                lValueOf2 = null;
            }
            if (lValueOf2 != null) {
                iob1VarE = hvp0Var.e(lValueOf2.longValue());
            } else {
                iob1VarE = null;
            }
        } else {
            iob1VarE = null;
        }
        if (nbw0Var != null) {
            str7 = nbw0Var.f;
        } else {
            str7 = null;
        }
        if (str7 != null) {
            z = false;
        } else {
            z = false;
        }
        if (nbw0Var != null) {
            str20 = nbw0Var.e;
        }
        zkm zkmVar2 = t810Var.b;
        boolean zS2 = p2o1.s(zkmVar2, str21);
        boolean zV2 = p2o1.v(zkmVar2, str21);
        str8 = str21;
        if (nbw0Var != null) {
            lValueOf = Long.valueOf(nbw0Var.i);
        } else {
            lValueOf = null;
        }
        if (lValueOf != null) {
            l = null;
        } else {
            l = null;
        }
        if (l == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (nbw0Var != null) {
            i = nbw0Var.q;
        } else {
            i = 0;
        }
        iob1Var = iob1VarE;
        if (i == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            strN = null;
        } else {
            strN = null;
        }
        if (z3 == 0) {
            str10 = null;
        } else {
            str9 = nbw0Var.b;
            if (ihc1.y0(str9)) {
                str10 = str9;
            } else {
                str10 = null;
            }
        }
        if (z3 != 0) {
            d2k1VarJ = null;
        } else {
            d2k1VarJ = null;
        }
        if (z2) {
            str11 = null;
        } else {
            str11 = null;
        }
        if (nbw0Var != null) {
            m4mVarX = m4m.c;
        } else {
            m4mVarX = m4m.c;
        }
        y2u0Var = t810Var.p;
        if (y2u0Var != null) {
            z4 = true;
            if (y2u0Var.a(m4mVarX)) {
            }
            if (pjw0Var != null) {
                z5 = false;
            } else {
                z5 = false;
            }
            String str215 = str11;
            String str216 = mey0Var.b;
            String str217 = mey0Var.a;
            if (z5) {
                if (prlVar != null) {
                    nrlVar = prlVar.c;
                } else {
                    nrlVar = null;
                }
                ljw0Var = pjw0Var.b;
                if (ljw0Var instanceof ljw0) {
                    str16 = ljw0Var.a.a.a.a;
                } else {
                    if (ljw0Var instanceof mjw0) {
                        eg.o();
                        return null;
                    }
                    ko7Var = ((mjw0) ljw0Var).a.c;
                    if (ko7Var != null) {
                        str16 = ko7Var.a.a.a;
                    } else {
                        str16 = null;
                    }
                    if (str16 == null) {
                        str17 = "";
                    }
                    jsm0 jsm0Var5 = new jsm0(0L, (Long) null);
                    str12 = str7;
                    iob1Var2 = null;
                    r4p1Var = r4p1VarH;
                    z6 = true;
                    i2 = 2;
                    ksm0 ksm0Var5 = new ksm0(new gec1("f9dcb11cef0d4b0e979134b802af06ee"), pjw0Var.c, str8, "audiobrowse-client-native", str8, (String) null, 448);
                    if (nrlVar instanceof irl) {
                        i8 = 1;
                    } else if (nrlVar instanceof jrl) {
                        i8 = 2;
                    } else {
                        i8 = 3;
                    }
                    lsm0Var = new lsm0(str17, ksm0Var5, false, false, jsm0Var5, 0L, (ism0) null, "", true, i8, 1096);
                }
                str17 = str16;
                jsm0 jsm0Var6 = new jsm0(0L, (Long) null);
                str12 = str7;
                iob1Var2 = null;
                r4p1Var = r4p1VarH;
                z6 = true;
                i2 = 2;
                ksm0 ksm0Var6 = new ksm0(new gec1("f9dcb11cef0d4b0e979134b802af06ee"), pjw0Var.c, str8, "audiobrowse-client-native", str8, (String) null, 448);
                if (nrlVar instanceof irl) {
                    i8 = 1;
                } else if (nrlVar instanceof jrl) {
                    i8 = 2;
                } else {
                    i8 = 3;
                }
                lsm0Var = new lsm0(str17, ksm0Var6, false, false, jsm0Var6, 0L, (ism0) null, "", true, i8, 1096);
            } else {
                z6 = z4;
                str12 = str7;
                r4p1Var = r4p1VarH;
                iob1Var2 = null;
                i2 = 2;
                ubw0.a.getClass();
                lsm0Var = rbw0.b;
            }
            lsm0 lsm0Var4 = lsm0Var;
            if (ebi0Var.d) {
                iob1Var3 = 3000L;
            } else {
                iob1Var3 = iob1Var2;
            }
            sbw0 sbw0Var3 = new sbw0(str216, str217, lsm0Var4, 0L, false, z5, !ebi0Var.c, iob1Var3, 512);
            if (pjw0Var != null) {
                iob1VarQ = bs51.q(pjw0Var);
                if (iob1VarQ.length() == 0) {
                    iob1VarQ = iob1Var2;
                }
                iob1Var4 = iob1VarQ;
            } else {
                iob1Var4 = iob1Var2;
            }
            if (pjw0Var != null) {
                iob1Var5 = pjw0Var.b;
            } else {
                iob1Var5 = iob1Var2;
            }
            if (iob1Var5 instanceof mjw0) {
                iob1Var6 = (mjw0) iob1Var5;
            } else {
                iob1Var6 = iob1Var2;
            }
            if (iob1Var6 != null) {
                iob1Var7 = ((mjw0) iob1Var6).b;
            } else {
                iob1Var7 = iob1Var2;
            }
            if (iob1Var7 != null) {
                jH = jfv.h(((ojw0) iob1Var7).a);
            } else {
                jH = 0;
            }
            long jH4 = iob1Var7 != null ? jfv.h(((ojw0) iob1Var7).b) : 0L;
            hwtVar = t810Var.c;
            if (hwtVar == null) {
                z7 = false;
            } else {
                z7 = false;
            }
            if (pjw0Var != null) {
                z8 = z7;
                iob1Var8 = iob1Var2;
            } else {
                z8 = z7;
                iob1Var8 = iob1Var2;
            }
            if (ebi0Var.b) {
                iob1Var9 = "";
            } else {
                if (w281Var != null) {
                    iob1Var12 = iob1Var2;
                } else {
                    iob1Var12 = iob1Var2;
                }
                if (iob1Var12 == null) {
                    iob1Var9 = "";
                } else {
                    iob1Var9 = iob1Var12;
                }
            }
            if (str3 == null) {
                str13 = "";
            } else {
                str13 = str3;
            }
            if (nbw0Var != null) {
                i3 = nbw0Var.o.a;
            } else {
                i3 = 0;
            }
            if (nbw0Var != null) {
                i4 = nbw0Var.o.b;
            } else {
                i4 = 0;
            }
            if (i4 == 0) {
                i5 = -1;
            } else {
                i5 = tbi0.a[l1d.C(i4)];
            }
            if (i5 == -1) {
                i6 = 1;
            } else {
                if (i5 != 1) {
                    i7 = i2;
                } else if (i5 != i2) {
                    i6 = 4;
                    if (i5 != 3) {
                        if (i5 != 4) {
                            eg.o();
                            return iob1Var2;
                        }
                        i6 = 1;
                    }
                } else {
                    i7 = 3;
                }
                i6 = i7;
            }
            ar00 ar00Var3 = new ar00(str13, iob1Var9, new br00(i3, i6, iob1Var2), (String) null, 24);
            if (str2 == null) {
                str14 = "";
            } else {
                str14 = str2;
            }
            r4p1 r4p1Var4 = r4p1Var;
            cr00 cr00Var3 = new cr00(z8, ar00Var3, str14, r4p1Var4);
            String str218 = mey0Var.a;
            boolean z13 = z8;
            String str219 = str8;
            String str2110 = mey0Var.d;
            x360 x360Var3 = mey0Var.e;
            if (z3) {
                iob1Var10 = iob1Var;
            } else {
                iob1Var10 = iob1Var2;
            }
            if (nbw0Var != null) {
                str15 = nbw0Var.m.a;
            } else {
                str15 = "";
            }
            if (nbw0Var != null) {
            }
            if (w281Var != null) {
                iob1Var11 = w281Var.a;
            } else {
                iob1Var11 = iob1Var2;
            }
            return new iob1(str218, str219, str2110, str219, str, str4, str3, cr00Var3, str2, x360Var3, r4p1Var4, iob1Var10, strN, str20, str15, str28, str12, z9, zV2, zS2, z, z2, str215, lValueOf, sbw0Var3, z13, iob1Var11, m4mVarX, t810Var.p, iob1Var8, str10, d2k1VarJ);
        }
        z4 = true;
        if (pjw0Var != null) {
            z5 = false;
        } else {
            z5 = false;
        }
        String str2111 = str11;
        String str2112 = mey0Var.b;
        String str2113 = mey0Var.a;
        if (z5) {
            if (prlVar != null) {
                nrlVar = prlVar.c;
            } else {
                nrlVar = null;
            }
            ljw0Var = pjw0Var.b;
            if (ljw0Var instanceof ljw0) {
                str16 = ljw0Var.a.a.a.a;
            } else {
                if (ljw0Var instanceof mjw0) {
                    eg.o();
                    return null;
                }
                ko7Var = ((mjw0) ljw0Var).a.c;
                if (ko7Var != null) {
                    str16 = ko7Var.a.a.a;
                } else {
                    str16 = null;
                }
                if (str16 == null) {
                    str17 = "";
                }
                jsm0 jsm0Var7 = new jsm0(0L, (Long) null);
                str12 = str7;
                iob1Var2 = null;
                r4p1Var = r4p1VarH;
                z6 = true;
                i2 = 2;
                ksm0 ksm0Var7 = new ksm0(new gec1("f9dcb11cef0d4b0e979134b802af06ee"), pjw0Var.c, str8, "audiobrowse-client-native", str8, (String) null, 448);
                if (nrlVar instanceof irl) {
                    i8 = 1;
                } else if (nrlVar instanceof jrl) {
                    i8 = 2;
                } else {
                    i8 = 3;
                }
                lsm0Var = new lsm0(str17, ksm0Var7, false, false, jsm0Var7, 0L, (ism0) null, "", true, i8, 1096);
            }
            str17 = str16;
            jsm0 jsm0Var8 = new jsm0(0L, (Long) null);
            str12 = str7;
            iob1Var2 = null;
            r4p1Var = r4p1VarH;
            z6 = true;
            i2 = 2;
            ksm0 ksm0Var8 = new ksm0(new gec1("f9dcb11cef0d4b0e979134b802af06ee"), pjw0Var.c, str8, "audiobrowse-client-native", str8, (String) null, 448);
            if (nrlVar instanceof irl) {
                i8 = 1;
            } else if (nrlVar instanceof jrl) {
                i8 = 2;
            } else {
                i8 = 3;
            }
            lsm0Var = new lsm0(str17, ksm0Var8, false, false, jsm0Var8, 0L, (ism0) null, "", true, i8, 1096);
        } else {
            z6 = z4;
            str12 = str7;
            r4p1Var = r4p1VarH;
            iob1Var2 = null;
            i2 = 2;
            ubw0.a.getClass();
            lsm0Var = rbw0.b;
        }
        lsm0 lsm0Var5 = lsm0Var;
        if (ebi0Var.d) {
            iob1Var3 = 3000L;
        } else {
            iob1Var3 = iob1Var2;
        }
        sbw0 sbw0Var4 = new sbw0(str2112, str2113, lsm0Var5, 0L, false, z5, !ebi0Var.c, iob1Var3, 512);
        if (pjw0Var != null) {
            iob1VarQ = bs51.q(pjw0Var);
            if (iob1VarQ.length() == 0) {
                iob1VarQ = iob1Var2;
            }
            iob1Var4 = iob1VarQ;
        } else {
            iob1Var4 = iob1Var2;
        }
        if (pjw0Var != null) {
            iob1Var5 = pjw0Var.b;
        } else {
            iob1Var5 = iob1Var2;
        }
        if (iob1Var5 instanceof mjw0) {
            iob1Var6 = (mjw0) iob1Var5;
        } else {
            iob1Var6 = iob1Var2;
        }
        if (iob1Var6 != null) {
            iob1Var7 = ((mjw0) iob1Var6).b;
        } else {
            iob1Var7 = iob1Var2;
        }
        if (iob1Var7 != null) {
            jH = jfv.h(((ojw0) iob1Var7).a);
        } else {
            jH = 0;
        }
        long jH5 = iob1Var7 != null ? jfv.h(((ojw0) iob1Var7).b) : 0L;
        hwtVar = t810Var.c;
        if (hwtVar == null) {
            z7 = false;
        } else {
            z7 = false;
        }
        if (pjw0Var != null) {
            z8 = z7;
            iob1Var8 = iob1Var2;
        } else {
            z8 = z7;
            iob1Var8 = iob1Var2;
        }
        if (ebi0Var.b) {
            iob1Var9 = "";
        } else {
            if (w281Var != null) {
                iob1Var12 = iob1Var2;
            } else {
                iob1Var12 = iob1Var2;
            }
            if (iob1Var12 == null) {
                iob1Var9 = "";
            } else {
                iob1Var9 = iob1Var12;
            }
        }
        if (str3 == null) {
            str13 = "";
        } else {
            str13 = str3;
        }
        if (nbw0Var != null) {
            i3 = nbw0Var.o.a;
        } else {
            i3 = 0;
        }
        if (nbw0Var != null) {
            i4 = nbw0Var.o.b;
        } else {
            i4 = 0;
        }
        if (i4 == 0) {
            i5 = -1;
        } else {
            i5 = tbi0.a[l1d.C(i4)];
        }
        if (i5 == -1) {
            i6 = 1;
        } else {
            if (i5 != 1) {
                i7 = i2;
            } else if (i5 != i2) {
                i6 = 4;
                if (i5 != 3) {
                    if (i5 != 4) {
                        eg.o();
                        return iob1Var2;
                    }
                    i6 = 1;
                }
            } else {
                i7 = 3;
            }
            i6 = i7;
        }
        ar00 ar00Var4 = new ar00(str13, iob1Var9, new br00(i3, i6, iob1Var2), (String) null, 24);
        if (str2 == null) {
            str14 = "";
        } else {
            str14 = str2;
        }
        r4p1 r4p1Var5 = r4p1Var;
        cr00 cr00Var4 = new cr00(z8, ar00Var4, str14, r4p1Var5);
        String str2114 = mey0Var.a;
        boolean z14 = z8;
        String str2115 = str8;
        String str2116 = mey0Var.d;
        x360 x360Var4 = mey0Var.e;
        if (z3) {
            iob1Var10 = iob1Var;
        } else {
            iob1Var10 = iob1Var2;
        }
        if (nbw0Var != null) {
            str15 = nbw0Var.m.a;
        } else {
            str15 = "";
        }
        if (nbw0Var != null) {
        }
        if (w281Var != null) {
            iob1Var11 = w281Var.a;
        } else {
            iob1Var11 = iob1Var2;
        }
        return new iob1(str2114, str2115, str2116, str2115, str, str4, str3, cr00Var4, str2, x360Var4, r4p1Var5, iob1Var10, strN, str20, str15, str28, str12, z9, zV2, zS2, z, z2, str2111, lValueOf, sbw0Var4, z14, iob1Var11, m4mVarX, t810Var.p, iob1Var8, str10, d2k1VarJ);
    }

    public static final qim0 y(qim0 qim0Var, erl1 erl1Var) {
        return qim0Var.then(new sk80(erl1Var));
    }

    public void A(rfp1 rfp1Var, rfp1 rfp1Var2) {
        ofp1.c.lazySet(rfp1Var, rfp1Var2);
    }

    public boolean B(tfp1 tfp1Var, rfp1 rfp1Var, rfp1 rfp1Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ofp1.d;
        while (!atomicReferenceFieldUpdater.compareAndSet(tfp1Var, rfp1Var, rfp1Var2)) {
            if (atomicReferenceFieldUpdater.get(tfp1Var) != rfp1Var) {
                return false;
            }
        }
        return true;
    }

    public boolean C(tfp1 tfp1Var, lfp1 lfp1Var, lfp1 lfp1Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ofp1.e;
        while (!atomicReferenceFieldUpdater.compareAndSet(tfp1Var, lfp1Var, lfp1Var2)) {
            if (atomicReferenceFieldUpdater.get(tfp1Var) != lfp1Var) {
                return false;
            }
        }
        return true;
    }

    public rfp1 D(tfp1 tfp1Var) {
        return (rfp1) ofp1.d.getAndSet(tfp1Var, rfp1.c);
    }

    public lfp1 E(tfp1 tfp1Var) {
        return (lfp1) ofp1.e.getAndSet(tfp1Var, lfp1.d);
    }

    public boolean F(tfp1 tfp1Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ofp1.f;
        while (!atomicReferenceFieldUpdater.compareAndSet(tfp1Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(tfp1Var) != obj) {
                return false;
            }
        }
        return true;
    }

    public abstract void n(RavelinError ravelinError);

    public void z(rfp1 rfp1Var, Thread thread) {
        ofp1.b.lazySet(rfp1Var, thread);
    }

    public void u(Object obj) {
    }
}
