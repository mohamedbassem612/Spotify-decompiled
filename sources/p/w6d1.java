package p;

import android.content.Context;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.View;
import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class w6d1 {
    public static final acn1 a = new acn1("InvalidModuleNotifier", (byte) 7);
    public static b180 b;

    public static final fai0 A(ymd0 ymd0Var, iu30 iu30Var) {
        ymd0 ymd0Var2;
        p811 p811Var = new p811();
        Object obj = ymd0Var.e;
        Object obj2 = ymd0.X;
        fai0 fai0Var = (obj == obj2 || (ymd0Var2 = (ymd0) iu30Var.invoke(ymd0Var.e())) == null || ymd0Var2.e == obj2) ? new fai0() : new fai0(ymd0Var2.e());
        fai0Var.n(ymd0Var, new es3(new d5e1(iu30Var, p811Var, fai0Var), (byte) 9));
        return fai0Var;
    }

    public static Next B(d4m1 d4m1Var, iu30 iu30Var) {
        return !d4m1Var.b ? Next.j() : Next.h((d4m1) iu30Var.invoke(d4m1Var));
    }

    public static boolean C(Object obj) {
        if (obj == null) {
            List list = he41.a;
            return true;
        }
        List list2 = he41.a;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((Class) it.next()).isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    public static final void a(oll ollVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(930265690);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(ollVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            irn1.u((qim0) null, hfi.a, (vu30) null, (erl1) null, apo.r(-1630233919, new e6j(ollVar, iu30Var), x340Var), x340Var, 24624, 13);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nok((byte) 2, i, ollVar, qim0Var2, iu30Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [int] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19, types: [int] */
    /* JADX WARN: Type inference failed for: r7v20 */
    public static final void b(oll ollVar, iu30 iu30Var, vzq0 vzq0Var, b0k b0kVar, int i) {
        iu30 iu30Var2;
        int i2;
        int i3;
        wf51 wf51Var;
        float f;
        boolean z;
        int i4;
        iu30 iu30Var3 = iu30Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1794396235);
        int i5 = (i & 6) == 0 ? (x340Var.g(ollVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i5 |= x340Var.i(iu30Var3) ? 32 : 16;
        }
        int i6 = i & 384;
        qim0 qim0Var = nim0.a;
        if (i6 == 0) {
            i5 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= x340Var.i(vzq0Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i5 & 1, (i5 & 1171) != 1170)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = new lkl(iu30Var3);
                x340Var.s0(objT);
            }
            maa maaVar = (lkl) objT;
            float f2 = 16.0f;
            d36 d36Var = new d36(16.0f, true, new um5(false));
            x340Var.i0(1695866722);
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, uyn1.w(l6o1.H(qim0Var, l6o1.C(0, 0, 1, x340Var), false, 14), vzq0Var));
            x340Var.r(false);
            mbh mbhVarA = jbh.a(d36Var, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
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
            x340Var.i0(1922325660);
            int i7 = 0;
            for (Object obj : ollVar.b) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    p7h.T();
                    throw null;
                }
                wf51 wf51Var2 = (wf51) obj;
                if (wf51Var2.a.length() > 0) {
                    x340Var.i0(1137636905);
                    int i9 = i5;
                    String str = wf51Var2.a;
                    uwr uwrVar = cbx.a;
                    x340 x340Var2 = x340Var;
                    float f3 = f2;
                    z = false;
                    f = f3;
                    i2 = i9;
                    i3 = i7;
                    wf51Var = wf51Var2;
                    i4 = 32;
                    uwo1.e(str, uyn1.B(qim0Var, 0.0f, f3, 0.0f, 0.0f, 13), cbx.d(x340Var).e, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2032);
                    x340Var = x340Var2;
                    x340Var.r(false);
                } else {
                    i2 = i5;
                    i3 = i7;
                    wf51Var = wf51Var2;
                    f = f2;
                    z = false;
                    i4 = 32;
                    x340Var.i0(1137835119);
                    x340Var.r(false);
                }
                x340Var.i0(1922335070);
                ?? r13 = z;
                for (Object obj2 : wf51Var.b) {
                    int i10 = r13 + 1;
                    if (r13 < 0) {
                        p7h.T();
                        throw null;
                    }
                    otw.c(maaVar, new jkl(i3, (int) r13, (xrd) obj2), (qim0) null, (ipb1) null, x340Var, 0, 12);
                    r13 = i10;
                }
                maa maaVar2 = maaVar;
                x340Var.r(z);
                x340Var.i0(1922343603);
                ?? r7 = z;
                for (Object obj3 : wf51Var.c) {
                    int i11 = r7 + 1;
                    if (r7 < 0) {
                        p7h.T();
                        throw null;
                    }
                    b10 b10Var = (b10) obj3;
                    boolean z2 = (i2 & 112) == i4 ? true : z;
                    Object objT2 = x340Var.T();
                    if (z2 || objT2 == m4cVar) {
                        objT2 = new ip0(iu30Var, (byte) 23);
                        x340Var.s0(objT2);
                    }
                    x340 x340Var3 = x340Var;
                    wpb1.b(b10Var, i3, r7, (xu30) objT2, null, x340Var3, 0);
                    x340Var = x340Var3;
                    r7 = i11;
                }
                x340Var.r(z);
                maaVar = maaVar2;
                iu30Var3 = iu30Var;
                i7 = i8;
                qim0Var = qim0Var;
                f2 = f;
                i5 = i2;
            }
            iu30Var2 = iu30Var3;
            x340Var.r(false);
            x340Var.r(true);
        } else {
            iu30Var2 = iu30Var3;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nok(ollVar, iu30Var2, vzq0Var, i);
        }
    }

    public static final void c(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(501718898);
        if (x340Var.Y(i & 1, i != 0)) {
            gra graVar = een.h;
            qim0 qim0VarN = anm1.N("dsl_loading_indicator", u291.d(nim0.a, 1.0f));
            gfh0 gfh0VarC = t1c.c(graVar, false);
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
            xto1.e((qim0) null, 4, 0L, 0L, x340Var, 48, 13);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new htu(i, (byte) 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x010e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:105:0x0115  */
    /* JADX WARN: Code duplicated, block: B:108:0x0128  */
    /* JADX WARN: Code duplicated, block: B:109:0x012a  */
    /* JADX WARN: Code duplicated, block: B:112:0x0133  */
    /* JADX WARN: Code duplicated, block: B:114:0x0150  */
    /* JADX WARN: Code duplicated, block: B:137:0x0189 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x018b  */
    /* JADX WARN: Code duplicated, block: B:139:0x018d  */
    /* JADX WARN: Code duplicated, block: B:141:0x0191  */
    /* JADX WARN: Code duplicated, block: B:144:0x0197  */
    /* JADX WARN: Code duplicated, block: B:147:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:148:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:151:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:152:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:155:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:156:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:159:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:162:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:163:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:166:0x020a  */
    /* JADX WARN: Code duplicated, block: B:167:0x023e  */
    /* JADX WARN: Code duplicated, block: B:169:0x026f  */
    /* JADX WARN: Code duplicated, block: B:171:0x0276  */
    /* JADX WARN: Code duplicated, block: B:172:0x027c  */
    /* JADX WARN: Code duplicated, block: B:175:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:177:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:180:0x030f  */
    /* JADX WARN: Code duplicated, block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0073  */
    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x008f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:83:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:86:0x00df  */
    /* JADX WARN: Code duplicated, block: B:88:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:90:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:91:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:94:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:97:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:99:0x0103  */
    public static final void d(String str, qim0 qim0Var, u7h u7hVar, lee1 lee1Var, long j, float f, float f2, float f3, djc0 djc0Var, int i, b0k b0kVar, int i2, int i3) {
        int i4;
        int i5;
        u7h u7hVar2;
        int i6;
        lee1 lee1Var2;
        long j2;
        float f4;
        float f5;
        float f6;
        djc0 djc0Var2;
        int i7;
        boolean z;
        qim0 qim0Var2;
        u7h u7hVar3;
        long j3;
        float f7;
        float f8;
        float f9;
        djc0 djc0Var3;
        int i8;
        h311 h311VarV;
        int i9;
        qim0 qim0Var3;
        qim0 qim0Var4;
        float f10;
        float f11;
        float f12;
        int i10;
        djc0 djc0Var4;
        qim0 qim0VarY;
        jw31 jw31VarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        int i11;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(428459254);
        if ((i2 & 6) == 0) {
            i4 = (x340Var.g(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i12 = i3 & 2;
        if (i12 == 0) {
            if ((i2 & 48) == 0) {
                i4 |= x340Var.i(qim0Var) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                if ((i2 & 384) == 0) {
                    u7hVar2 = u7hVar;
                    if (x340Var.g(u7hVar2)) {
                        i6 = 256;
                    } else {
                        i6 = 128;
                    }
                    i4 |= i6;
                }
                if ((i2 & 3072) == 0) {
                    lee1Var2 = lee1Var;
                    if (x340Var.i(lee1Var2)) {
                        i11 = 2048;
                    } else {
                        i11 = 1024;
                    }
                    i4 |= i11;
                } else {
                    lee1Var2 = lee1Var;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        j2 = j;
                        int i13 = x340Var.f(j2) ? 16384 : 8192;
                        i4 |= i13;
                    } else {
                        j2 = j;
                    }
                    i4 |= i13;
                } else {
                    j2 = j;
                }
                if ((196608 & i2) == 0) {
                    if ((i3 & 32) == 0) {
                        f4 = f;
                        int i14 = x340Var.d(f4) ? 131072 : 65536;
                        i4 |= i14;
                    } else {
                        f4 = f;
                    }
                    i4 |= i14;
                } else {
                    f4 = f;
                }
                if ((1572864 & i2) == 0) {
                    if ((i3 & 64) == 0) {
                        f5 = f2;
                        int i15 = x340Var.d(f5) ? 1048576 : 524288;
                        i4 |= i15;
                    } else {
                        f5 = f2;
                    }
                    i4 |= i15;
                } else {
                    f5 = f2;
                }
                if ((12582912 & i2) == 0) {
                    if ((i3 & 128) == 0) {
                        f6 = f3;
                        int i16 = x340Var.d(f6) ? 8388608 : 4194304;
                        i4 |= i16;
                    } else {
                        f6 = f3;
                    }
                    i4 |= i16;
                } else {
                    f6 = f3;
                }
                if ((100663296 & i2) == 0) {
                    if ((i3 & 256) == 0) {
                        djc0Var2 = djc0Var;
                        int i17 = x340Var.i(djc0Var2) ? 67108864 : 33554432;
                        i4 |= i17;
                    } else {
                        djc0Var2 = djc0Var;
                    }
                    i4 |= i17;
                } else {
                    djc0Var2 = djc0Var;
                }
                if ((i2 & 805306368) == 0) {
                    i7 = i4 | (((i3 & 512) == 0 || !x340Var.e(i)) ? 268435456 : 536870912);
                } else {
                    i7 = i4;
                }
                if ((i7 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i7 & 1, z)) {
                    x340Var.d0();
                    i9 = i2 & 1;
                    qim0Var3 = nim0.a;
                    if (i9 != 0 || x340Var.E()) {
                        if (i12 != 0) {
                            qim0Var4 = qim0Var3;
                        } else {
                            qim0Var4 = qim0Var;
                        }
                        if (i5 != 0) {
                            u7hVar2 = null;
                        }
                        if ((i3 & 16) != 0) {
                            uwr uwrVar = cbx.a;
                            j2 = cbx.a(x340Var).a.c;
                            i7 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            uwr uwrVar2 = cbx.a;
                            cvx cvxVar = cbx.b(x340Var).b;
                            i7 &= -458753;
                            f10 = 6.0f;
                        } else {
                            f10 = f4;
                        }
                        if ((i3 & 64) != 0) {
                            uwr uwrVar3 = cbx.a;
                            cvx cvxVar2 = cbx.b(x340Var).b;
                            i7 &= -3670017;
                            f11 = 2.0f;
                        } else {
                            f11 = f5;
                        }
                        if ((i3 & 128) != 0) {
                            uwr uwrVar4 = cbx.a;
                            cua cuaVar = cbx.b(x340Var).f;
                            i7 &= -29360129;
                            f12 = 4.0f;
                        } else {
                            f12 = f6;
                        }
                        if ((i3 & 256) != 0) {
                            djc0Var2 = bjc0.a;
                            i7 &= -234881025;
                        }
                        if ((i3 & 512) != 0) {
                            i7 &= -1879048193;
                            i10 = 1;
                        } else {
                            i10 = i;
                        }
                    } else {
                        x340Var.b0();
                        if ((i3 & 16) != 0) {
                            i7 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            i7 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            i7 &= -3670017;
                        }
                        if ((i3 & 128) != 0) {
                            i7 &= -29360129;
                        }
                        if ((i3 & 256) != 0) {
                            i7 &= -234881025;
                        }
                        if ((i3 & 512) != 0) {
                            i7 &= -1879048193;
                        }
                        qim0Var4 = qim0Var;
                        i10 = i;
                        f10 = f4;
                        f11 = f5;
                        f12 = f6;
                    }
                    djc0Var4 = djc0Var2;
                    x340Var.s();
                    qim0VarY = uyn1.y(dug.f(i1p1.q(qim0Var4, er31.b(f12)), j2, d4o1.a), f10, f11);
                    if (u7hVar2 == null) {
                        x340Var.i0(-412475504);
                        uwo1.e(str, qim0VarY, lee1Var2, 0L, (a0e1) null, (iu30) null, i10, false, djc0Var4, 0, (qx8) null, x340Var, (i7 & 14) | ((i7 >> 3) & 896) | ((i7 >> 9) & 3670016) | (i7 & 234881024), 0, 1720);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(-412304477);
                        jw31VarA = ew31.a(new d36(f10, true, new um5(false)), een.N0, x340Var, 0);
                        iHashCode = Long.hashCode(x340Var.T);
                        xos0VarM = x340Var.m();
                        qim0VarE = zr7.E(x340Var, qim0VarY);
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
                        nko1.H(jw31VarA, x340Var, y580.O0);
                        nko1.H(xos0VarM, x340Var, y580.N0);
                        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                        nko1.F(x340Var);
                        nko1.H(qim0VarE, x340Var, y580.Y);
                        t1c.a(anm1.N("OverMediaPillDot", dug.f(u291.r(qim0Var3, 8.0f), u7hVar2.a, er31.a)), x340Var, 0);
                        uwo1.e(str, new wnb0(1.0f, false), lee1Var, 0L, (a0e1) null, (iu30) null, i10, false, djc0Var4, 0, (qx8) null, x340Var, (i7 & 14) | ((i7 >> 3) & 896) | ((i7 >> 9) & 3670016) | (i7 & 234881024), 0, 1720);
                        x340Var.r(true);
                        x340Var.r(false);
                    }
                    qim0Var2 = qim0Var4;
                    u7hVar3 = u7hVar2;
                    i8 = i10;
                    long j4 = j2;
                    f7 = f10;
                    j3 = j4;
                    f8 = f11;
                    f9 = f12;
                    djc0Var3 = djc0Var4;
                } else {
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                    u7hVar3 = u7hVar2;
                    j3 = j2;
                    f7 = f4;
                    f8 = f5;
                    f9 = f6;
                    djc0Var3 = djc0Var2;
                    i8 = i;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new ouq0(str, qim0Var2, u7hVar3, lee1Var, j3, f7, f8, f9, djc0Var3, i8, i2, i3);
                }
            }
            i4 |= 384;
            u7hVar2 = u7hVar;
            if ((i2 & 3072) == 0) {
                lee1Var2 = lee1Var;
                if (x340Var.i(lee1Var2)) {
                    i11 = 2048;
                } else {
                    i11 = 1024;
                }
                i4 |= i11;
            } else {
                lee1Var2 = lee1Var;
            }
            if ((i2 & 24576) == 0) {
                if ((i3 & 16) == 0) {
                    j2 = j;
                    if (x340Var.f(j2)) {
                    }
                    i4 |= i13;
                } else {
                    j2 = j;
                }
                i4 |= i13;
            } else {
                j2 = j;
            }
            if ((196608 & i2) == 0) {
                if ((i3 & 32) == 0) {
                    f4 = f;
                    if (x340Var.d(f4)) {
                    }
                    i4 |= i14;
                } else {
                    f4 = f;
                }
                i4 |= i14;
            } else {
                f4 = f;
            }
            if ((1572864 & i2) == 0) {
                if ((i3 & 64) == 0) {
                    f5 = f2;
                    if (x340Var.d(f5)) {
                    }
                    i4 |= i15;
                } else {
                    f5 = f2;
                }
                i4 |= i15;
            } else {
                f5 = f2;
            }
            if ((12582912 & i2) == 0) {
                if ((i3 & 128) == 0) {
                    f6 = f3;
                    if (x340Var.d(f6)) {
                    }
                    i4 |= i16;
                } else {
                    f6 = f3;
                }
                i4 |= i16;
            } else {
                f6 = f3;
            }
            if ((100663296 & i2) == 0) {
                if ((i3 & 256) == 0) {
                    djc0Var2 = djc0Var;
                    if (x340Var.i(djc0Var2)) {
                    }
                    i4 |= i17;
                } else {
                    djc0Var2 = djc0Var;
                }
                i4 |= i17;
            } else {
                djc0Var2 = djc0Var;
            }
            if ((i2 & 805306368) == 0) {
                i7 = i4 | (((i3 & 512) == 0 || !x340Var.e(i)) ? 268435456 : 536870912);
            } else {
                i7 = i4;
            }
            if ((i7 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i7 & 1, z)) {
                x340Var.d0();
                i9 = i2 & 1;
                qim0Var3 = nim0.a;
                if (i9 != 0) {
                    if (i12 != 0) {
                        qim0Var4 = qim0Var3;
                    } else {
                        qim0Var4 = qim0Var;
                    }
                    if (i5 != 0) {
                        u7hVar2 = null;
                    }
                    if ((i3 & 16) != 0) {
                        uwr uwrVar5 = cbx.a;
                        j2 = cbx.a(x340Var).a.c;
                        i7 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        uwr uwrVar6 = cbx.a;
                        cvx cvxVar3 = cbx.b(x340Var).b;
                        i7 &= -458753;
                        f10 = 6.0f;
                    } else {
                        f10 = f4;
                    }
                    if ((i3 & 64) != 0) {
                        uwr uwrVar7 = cbx.a;
                        cvx cvxVar4 = cbx.b(x340Var).b;
                        i7 &= -3670017;
                        f11 = 2.0f;
                    } else {
                        f11 = f5;
                    }
                    if ((i3 & 128) != 0) {
                        uwr uwrVar8 = cbx.a;
                        cua cuaVar2 = cbx.b(x340Var).f;
                        i7 &= -29360129;
                        f12 = 4.0f;
                    } else {
                        f12 = f6;
                    }
                    if ((i3 & 256) != 0) {
                        djc0Var2 = bjc0.a;
                        i7 &= -234881025;
                    }
                    if ((i3 & 512) != 0) {
                        i7 &= -1879048193;
                        i10 = 1;
                    } else {
                        i10 = i;
                    }
                } else {
                    if (i12 != 0) {
                        qim0Var4 = qim0Var3;
                    } else {
                        qim0Var4 = qim0Var;
                    }
                    if (i5 != 0) {
                        u7hVar2 = null;
                    }
                    if ((i3 & 16) != 0) {
                        uwr uwrVar9 = cbx.a;
                        j2 = cbx.a(x340Var).a.c;
                        i7 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        uwr uwrVar10 = cbx.a;
                        cvx cvxVar5 = cbx.b(x340Var).b;
                        i7 &= -458753;
                        f10 = 6.0f;
                    } else {
                        f10 = f4;
                    }
                    if ((i3 & 64) != 0) {
                        uwr uwrVar11 = cbx.a;
                        cvx cvxVar6 = cbx.b(x340Var).b;
                        i7 &= -3670017;
                        f11 = 2.0f;
                    } else {
                        f11 = f5;
                    }
                    if ((i3 & 128) != 0) {
                        uwr uwrVar12 = cbx.a;
                        cua cuaVar3 = cbx.b(x340Var).f;
                        i7 &= -29360129;
                        f12 = 4.0f;
                    } else {
                        f12 = f6;
                    }
                    if ((i3 & 256) != 0) {
                        djc0Var2 = bjc0.a;
                        i7 &= -234881025;
                    }
                    if ((i3 & 512) != 0) {
                        i7 &= -1879048193;
                        i10 = 1;
                    } else {
                        i10 = i;
                    }
                }
                djc0Var4 = djc0Var2;
                x340Var.s();
                qim0VarY = uyn1.y(dug.f(i1p1.q(qim0Var4, er31.b(f12)), j2, d4o1.a), f10, f11);
                if (u7hVar2 == null) {
                    x340Var.i0(-412475504);
                    uwo1.e(str, qim0VarY, lee1Var2, 0L, (a0e1) null, (iu30) null, i10, false, djc0Var4, 0, (qx8) null, x340Var, (i7 & 14) | ((i7 >> 3) & 896) | ((i7 >> 9) & 3670016) | (i7 & 234881024), 0, 1720);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-412304477);
                    jw31VarA = ew31.a(new d36(f10, true, new um5(false)), een.N0, x340Var, 0);
                    iHashCode = Long.hashCode(x340Var.T);
                    xos0VarM = x340Var.m();
                    qim0VarE = zr7.E(x340Var, qim0VarY);
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
                    nko1.H(jw31VarA, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    t1c.a(anm1.N("OverMediaPillDot", dug.f(u291.r(qim0Var3, 8.0f), u7hVar2.a, er31.a)), x340Var, 0);
                    uwo1.e(str, new wnb0(1.0f, false), lee1Var, 0L, (a0e1) null, (iu30) null, i10, false, djc0Var4, 0, (qx8) null, x340Var, (i7 & 14) | ((i7 >> 3) & 896) | ((i7 >> 9) & 3670016) | (i7 & 234881024), 0, 1720);
                    x340Var.r(true);
                    x340Var.r(false);
                }
                qim0Var2 = qim0Var4;
                u7hVar3 = u7hVar2;
                i8 = i10;
                long j5 = j2;
                f7 = f10;
                j3 = j5;
                f8 = f11;
                f9 = f12;
                djc0Var3 = djc0Var4;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
                u7hVar3 = u7hVar2;
                j3 = j2;
                f7 = f4;
                f8 = f5;
                f9 = f6;
                djc0Var3 = djc0Var2;
                i8 = i;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ouq0(str, qim0Var2, u7hVar3, lee1Var, j3, f7, f8, f9, djc0Var3, i8, i2, i3);
            }
        }
        i4 |= 48;
        i5 = i3 & 4;
        if (i5 != 0) {
            if ((i2 & 384) == 0) {
                u7hVar2 = u7hVar;
                if (x340Var.g(u7hVar2)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i4 |= i6;
            }
            if ((i2 & 3072) == 0) {
                lee1Var2 = lee1Var;
                if (x340Var.i(lee1Var2)) {
                    i11 = 2048;
                } else {
                    i11 = 1024;
                }
                i4 |= i11;
            } else {
                lee1Var2 = lee1Var;
            }
            if ((i2 & 24576) == 0) {
                if ((i3 & 16) == 0) {
                    j2 = j;
                    if (x340Var.f(j2)) {
                    }
                    i4 |= i13;
                } else {
                    j2 = j;
                }
                i4 |= i13;
            } else {
                j2 = j;
            }
            if ((196608 & i2) == 0) {
                if ((i3 & 32) == 0) {
                    f4 = f;
                    if (x340Var.d(f4)) {
                    }
                    i4 |= i14;
                } else {
                    f4 = f;
                }
                i4 |= i14;
            } else {
                f4 = f;
            }
            if ((1572864 & i2) == 0) {
                if ((i3 & 64) == 0) {
                    f5 = f2;
                    if (x340Var.d(f5)) {
                    }
                    i4 |= i15;
                } else {
                    f5 = f2;
                }
                i4 |= i15;
            } else {
                f5 = f2;
            }
            if ((12582912 & i2) == 0) {
                if ((i3 & 128) == 0) {
                    f6 = f3;
                    if (x340Var.d(f6)) {
                    }
                    i4 |= i16;
                } else {
                    f6 = f3;
                }
                i4 |= i16;
            } else {
                f6 = f3;
            }
            if ((100663296 & i2) == 0) {
                if ((i3 & 256) == 0) {
                    djc0Var2 = djc0Var;
                    if (x340Var.i(djc0Var2)) {
                    }
                    i4 |= i17;
                } else {
                    djc0Var2 = djc0Var;
                }
                i4 |= i17;
            } else {
                djc0Var2 = djc0Var;
            }
            if ((i2 & 805306368) == 0) {
                i7 = i4 | (((i3 & 512) == 0 || !x340Var.e(i)) ? 268435456 : 536870912);
            } else {
                i7 = i4;
            }
            if ((i7 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i7 & 1, z)) {
                x340Var.d0();
                i9 = i2 & 1;
                qim0Var3 = nim0.a;
                if (i9 != 0) {
                    if (i12 != 0) {
                        qim0Var4 = qim0Var3;
                    } else {
                        qim0Var4 = qim0Var;
                    }
                    if (i5 != 0) {
                        u7hVar2 = null;
                    }
                    if ((i3 & 16) != 0) {
                        uwr uwrVar13 = cbx.a;
                        j2 = cbx.a(x340Var).a.c;
                        i7 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        uwr uwrVar14 = cbx.a;
                        cvx cvxVar7 = cbx.b(x340Var).b;
                        i7 &= -458753;
                        f10 = 6.0f;
                    } else {
                        f10 = f4;
                    }
                    if ((i3 & 64) != 0) {
                        uwr uwrVar15 = cbx.a;
                        cvx cvxVar8 = cbx.b(x340Var).b;
                        i7 &= -3670017;
                        f11 = 2.0f;
                    } else {
                        f11 = f5;
                    }
                    if ((i3 & 128) != 0) {
                        uwr uwrVar16 = cbx.a;
                        cua cuaVar4 = cbx.b(x340Var).f;
                        i7 &= -29360129;
                        f12 = 4.0f;
                    } else {
                        f12 = f6;
                    }
                    if ((i3 & 256) != 0) {
                        djc0Var2 = bjc0.a;
                        i7 &= -234881025;
                    }
                    if ((i3 & 512) != 0) {
                        i7 &= -1879048193;
                        i10 = 1;
                    } else {
                        i10 = i;
                    }
                } else {
                    if (i12 != 0) {
                        qim0Var4 = qim0Var3;
                    } else {
                        qim0Var4 = qim0Var;
                    }
                    if (i5 != 0) {
                        u7hVar2 = null;
                    }
                    if ((i3 & 16) != 0) {
                        uwr uwrVar17 = cbx.a;
                        j2 = cbx.a(x340Var).a.c;
                        i7 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        uwr uwrVar18 = cbx.a;
                        cvx cvxVar9 = cbx.b(x340Var).b;
                        i7 &= -458753;
                        f10 = 6.0f;
                    } else {
                        f10 = f4;
                    }
                    if ((i3 & 64) != 0) {
                        uwr uwrVar19 = cbx.a;
                        cvx cvxVar10 = cbx.b(x340Var).b;
                        i7 &= -3670017;
                        f11 = 2.0f;
                    } else {
                        f11 = f5;
                    }
                    if ((i3 & 128) != 0) {
                        uwr uwrVar110 = cbx.a;
                        cua cuaVar5 = cbx.b(x340Var).f;
                        i7 &= -29360129;
                        f12 = 4.0f;
                    } else {
                        f12 = f6;
                    }
                    if ((i3 & 256) != 0) {
                        djc0Var2 = bjc0.a;
                        i7 &= -234881025;
                    }
                    if ((i3 & 512) != 0) {
                        i7 &= -1879048193;
                        i10 = 1;
                    } else {
                        i10 = i;
                    }
                }
                djc0Var4 = djc0Var2;
                x340Var.s();
                qim0VarY = uyn1.y(dug.f(i1p1.q(qim0Var4, er31.b(f12)), j2, d4o1.a), f10, f11);
                if (u7hVar2 == null) {
                    x340Var.i0(-412475504);
                    uwo1.e(str, qim0VarY, lee1Var2, 0L, (a0e1) null, (iu30) null, i10, false, djc0Var4, 0, (qx8) null, x340Var, (i7 & 14) | ((i7 >> 3) & 896) | ((i7 >> 9) & 3670016) | (i7 & 234881024), 0, 1720);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-412304477);
                    jw31VarA = ew31.a(new d36(f10, true, new um5(false)), een.N0, x340Var, 0);
                    iHashCode = Long.hashCode(x340Var.T);
                    xos0VarM = x340Var.m();
                    qim0VarE = zr7.E(x340Var, qim0VarY);
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
                    nko1.H(jw31VarA, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    t1c.a(anm1.N("OverMediaPillDot", dug.f(u291.r(qim0Var3, 8.0f), u7hVar2.a, er31.a)), x340Var, 0);
                    uwo1.e(str, new wnb0(1.0f, false), lee1Var, 0L, (a0e1) null, (iu30) null, i10, false, djc0Var4, 0, (qx8) null, x340Var, (i7 & 14) | ((i7 >> 3) & 896) | ((i7 >> 9) & 3670016) | (i7 & 234881024), 0, 1720);
                    x340Var.r(true);
                    x340Var.r(false);
                }
                qim0Var2 = qim0Var4;
                u7hVar3 = u7hVar2;
                i8 = i10;
                long j6 = j2;
                f7 = f10;
                j3 = j6;
                f8 = f11;
                f9 = f12;
                djc0Var3 = djc0Var4;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
                u7hVar3 = u7hVar2;
                j3 = j2;
                f7 = f4;
                f8 = f5;
                f9 = f6;
                djc0Var3 = djc0Var2;
                i8 = i;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ouq0(str, qim0Var2, u7hVar3, lee1Var, j3, f7, f8, f9, djc0Var3, i8, i2, i3);
            }
        }
        i4 |= 384;
        u7hVar2 = u7hVar;
        if ((i2 & 3072) == 0) {
            lee1Var2 = lee1Var;
            if (x340Var.i(lee1Var2)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i4 |= i11;
        } else {
            lee1Var2 = lee1Var;
        }
        if ((i2 & 24576) == 0) {
            if ((i3 & 16) == 0) {
                j2 = j;
                if (x340Var.f(j2)) {
                }
                i4 |= i13;
            } else {
                j2 = j;
            }
            i4 |= i13;
        } else {
            j2 = j;
        }
        if ((196608 & i2) == 0) {
            if ((i3 & 32) == 0) {
                f4 = f;
                if (x340Var.d(f4)) {
                }
                i4 |= i14;
            } else {
                f4 = f;
            }
            i4 |= i14;
        } else {
            f4 = f;
        }
        if ((1572864 & i2) == 0) {
            if ((i3 & 64) == 0) {
                f5 = f2;
                if (x340Var.d(f5)) {
                }
                i4 |= i15;
            } else {
                f5 = f2;
            }
            i4 |= i15;
        } else {
            f5 = f2;
        }
        if ((12582912 & i2) == 0) {
            if ((i3 & 128) == 0) {
                f6 = f3;
                if (x340Var.d(f6)) {
                }
                i4 |= i16;
            } else {
                f6 = f3;
            }
            i4 |= i16;
        } else {
            f6 = f3;
        }
        if ((100663296 & i2) == 0) {
            if ((i3 & 256) == 0) {
                djc0Var2 = djc0Var;
                if (x340Var.i(djc0Var2)) {
                }
                i4 |= i17;
            } else {
                djc0Var2 = djc0Var;
            }
            i4 |= i17;
        } else {
            djc0Var2 = djc0Var;
        }
        if ((i2 & 805306368) == 0) {
            i7 = i4 | (((i3 & 512) == 0 || !x340Var.e(i)) ? 268435456 : 536870912);
        } else {
            i7 = i4;
        }
        if ((i7 & 306783379) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i7 & 1, z)) {
            x340Var.d0();
            i9 = i2 & 1;
            qim0Var3 = nim0.a;
            if (i9 != 0) {
                if (i12 != 0) {
                    qim0Var4 = qim0Var3;
                } else {
                    qim0Var4 = qim0Var;
                }
                if (i5 != 0) {
                    u7hVar2 = null;
                }
                if ((i3 & 16) != 0) {
                    uwr uwrVar111 = cbx.a;
                    j2 = cbx.a(x340Var).a.c;
                    i7 &= -57345;
                }
                if ((i3 & 32) != 0) {
                    uwr uwrVar112 = cbx.a;
                    cvx cvxVar11 = cbx.b(x340Var).b;
                    i7 &= -458753;
                    f10 = 6.0f;
                } else {
                    f10 = f4;
                }
                if ((i3 & 64) != 0) {
                    uwr uwrVar113 = cbx.a;
                    cvx cvxVar12 = cbx.b(x340Var).b;
                    i7 &= -3670017;
                    f11 = 2.0f;
                } else {
                    f11 = f5;
                }
                if ((i3 & 128) != 0) {
                    uwr uwrVar114 = cbx.a;
                    cua cuaVar6 = cbx.b(x340Var).f;
                    i7 &= -29360129;
                    f12 = 4.0f;
                } else {
                    f12 = f6;
                }
                if ((i3 & 256) != 0) {
                    djc0Var2 = bjc0.a;
                    i7 &= -234881025;
                }
                if ((i3 & 512) != 0) {
                    i7 &= -1879048193;
                    i10 = 1;
                } else {
                    i10 = i;
                }
            } else {
                if (i12 != 0) {
                    qim0Var4 = qim0Var3;
                } else {
                    qim0Var4 = qim0Var;
                }
                if (i5 != 0) {
                    u7hVar2 = null;
                }
                if ((i3 & 16) != 0) {
                    uwr uwrVar115 = cbx.a;
                    j2 = cbx.a(x340Var).a.c;
                    i7 &= -57345;
                }
                if ((i3 & 32) != 0) {
                    uwr uwrVar116 = cbx.a;
                    cvx cvxVar13 = cbx.b(x340Var).b;
                    i7 &= -458753;
                    f10 = 6.0f;
                } else {
                    f10 = f4;
                }
                if ((i3 & 64) != 0) {
                    uwr uwrVar117 = cbx.a;
                    cvx cvxVar14 = cbx.b(x340Var).b;
                    i7 &= -3670017;
                    f11 = 2.0f;
                } else {
                    f11 = f5;
                }
                if ((i3 & 128) != 0) {
                    uwr uwrVar118 = cbx.a;
                    cua cuaVar7 = cbx.b(x340Var).f;
                    i7 &= -29360129;
                    f12 = 4.0f;
                } else {
                    f12 = f6;
                }
                if ((i3 & 256) != 0) {
                    djc0Var2 = bjc0.a;
                    i7 &= -234881025;
                }
                if ((i3 & 512) != 0) {
                    i7 &= -1879048193;
                    i10 = 1;
                } else {
                    i10 = i;
                }
            }
            djc0Var4 = djc0Var2;
            x340Var.s();
            qim0VarY = uyn1.y(dug.f(i1p1.q(qim0Var4, er31.b(f12)), j2, d4o1.a), f10, f11);
            if (u7hVar2 == null) {
                x340Var.i0(-412475504);
                uwo1.e(str, qim0VarY, lee1Var2, 0L, (a0e1) null, (iu30) null, i10, false, djc0Var4, 0, (qx8) null, x340Var, (i7 & 14) | ((i7 >> 3) & 896) | ((i7 >> 9) & 3670016) | (i7 & 234881024), 0, 1720);
                x340Var.r(false);
            } else {
                x340Var.i0(-412304477);
                jw31VarA = ew31.a(new d36(f10, true, new um5(false)), een.N0, x340Var, 0);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarY);
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
                nko1.H(jw31VarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                t1c.a(anm1.N("OverMediaPillDot", dug.f(u291.r(qim0Var3, 8.0f), u7hVar2.a, er31.a)), x340Var, 0);
                uwo1.e(str, new wnb0(1.0f, false), lee1Var, 0L, (a0e1) null, (iu30) null, i10, false, djc0Var4, 0, (qx8) null, x340Var, (i7 & 14) | ((i7 >> 3) & 896) | ((i7 >> 9) & 3670016) | (i7 & 234881024), 0, 1720);
                x340Var.r(true);
                x340Var.r(false);
            }
            qim0Var2 = qim0Var4;
            u7hVar3 = u7hVar2;
            i8 = i10;
            long j7 = j2;
            f7 = f10;
            j3 = j7;
            f8 = f11;
            f9 = f12;
            djc0Var3 = djc0Var4;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            u7hVar3 = u7hVar2;
            j3 = j2;
            f7 = f4;
            f8 = f5;
            f9 = f6;
            djc0Var3 = djc0Var2;
            i8 = i;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ouq0(str, qim0Var2, u7hVar3, lee1Var, j3, f7, f8, f9, djc0Var3, i8, i2, i3);
        }
    }

    public static int e(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return j(view.getVisibility());
    }

    public static final boolean f(fpd fpdVar, Integer num) {
        Collection collectionU1 = o7h.u1(fpdVar.getItems());
        if ((collectionU1 instanceof Collection) && collectionU1.isEmpty()) {
            return false;
        }
        ca80 it = collectionU1.iterator();
        while (true) {
            ca80 ca80Var = it;
            if (!((Iterator) ca80Var.c).hasNext()) {
                return false;
            }
            aa80 aa80Var = (aa80) ca80Var.next();
            int i = aa80Var.a;
            apd apdVar = (apd) aa80Var.b;
            if (num == null || i != num.intValue()) {
                j80 j80Var = apdVar.d;
                j80 j80Var2 = j80Var instanceof j80 ? j80Var : null;
                if ((j80Var2 != null ? j80Var2.b : null) != null) {
                    return true;
                }
            }
        }
    }

    public static zzq0 g(b0k b0kVar) {
        nx61 nx61Var = vu40.h;
        ((vu40) ((x340) b0kVar).k(wu40.a)).c.getClass();
        return new zzq0(16.0f, 8.0f, 16.0f, 8.0f);
    }

    public static final fai0 h(kdn0 kdn0Var) {
        fai0 fai0Var;
        l811 l811Var = new l811();
        l811Var.a = true;
        if (((ymd0) kdn0Var).e != ymd0.X) {
            l811Var.a = false;
            fai0Var = new fai0(kdn0Var.e());
        } else {
            fai0Var = new fai0();
        }
        fai0Var.n(kdn0Var, new es3(new vae1(fai0Var, l811Var, (byte) 1), (byte) 9));
        return fai0Var;
    }

    public static int i(Context context, int i) {
        return (int) ((i * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int j(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 4) {
            return 4;
        }
        if (i == 8) {
            return 3;
        }
        hhg1.n(f4i1.c(i, "Unknown visibility "));
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0031  */
    public static final ArrayList k(d4m1 d4m1Var) {
        ArrayList arrayList = new ArrayList();
        d7 d7Var = new d7(ws61.e, (byte) 0);
        while (d7Var.hasNext()) {
            Object next = d7Var.next();
            int iOrdinal = ((ws61) next).ordinal();
            boolean z = true;
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        z = d4m1Var.x;
                    } else if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            eg.o();
                            return null;
                        }
                        if (d4m1Var.o <= 0) {
                            z = false;
                        }
                    }
                } else if (d4m1Var.s.isEmpty() && !d4m1Var.v) {
                    z = false;
                }
            } else if (d4m1Var.i <= 0) {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static float l(b0k b0kVar) {
        nx61 nx61Var = vu40.h;
        ((vu40) ((x340) b0kVar).k(wu40.a)).f.getClass();
        return 32.0f;
    }

    public static float m(b0k b0kVar) {
        nx61 nx61Var = vu40.h;
        ((vu40) ((x340) b0kVar).k(wu40.a)).c.getClass();
        return 6.0f;
    }

    public static final ucn0 n(kf30 kf30Var, tka0 tka0Var) {
        return new ucn0(tka0Var, kf30Var.a.a, new vcn0(tka0Var, kf30Var), new vcn0(kf30Var, tka0Var));
    }

    public static final int o(MotionEvent motionEvent) {
        if (!motionEvent.isFromSource(2097152)) {
            hhg1.n("MotionEvent must be a touch navigation source");
            return 0;
        }
        InputDevice device = motionEvent.getDevice();
        if (device != null) {
            InputDevice.MotionRange motionRange = device.getMotionRange(0);
            InputDevice.MotionRange motionRange2 = device.getMotionRange(1);
            if (motionRange == null || motionRange2 != null) {
                if (motionRange2 != null && motionRange == null) {
                    return 2;
                }
                if (motionRange != null && motionRange2 != null) {
                    float range = motionRange.getRange();
                    float range2 = motionRange2.getRange();
                    if (range <= range2 || (range2 != 0.0f && range / range2 < 5.0f)) {
                        if (range2 > range && (range == 0.0f || range2 / range >= 5.0f)) {
                            return 2;
                        }
                    }
                }
            }
            return 1;
        }
        return 0;
    }

    public static bzf0 p(j6a j6aVar, zob1 zob1Var) {
        return new bzf0(j6aVar, rih1.a, zob1Var);
    }

    public static final fai0 q(ymd0 ymd0Var, iu30 iu30Var) {
        fai0 fai0Var = ymd0Var.e != ymd0.X ? new fai0(iu30Var.invoke(ymd0Var.e())) : new fai0();
        fai0Var.n(ymd0Var, new es3(new vae1(fai0Var, iu30Var, (byte) 2), (byte) 9));
        return fai0Var;
    }

    public static float r(int i) {
        if (i == 1) {
            return 48.0f;
        }
        if (i == 2) {
            return 72.0f;
        }
        hhg1.n(f4i1.f("Unknown size ", gvg.e(i, "ButtonSize(value=", ")"), "."));
        return 0.0f;
    }

    public static final String s(int i, String str) {
        int i2 = i;
        while (i2 < str.length() && Character.isDigit(str.charAt(i2))) {
            i2++;
        }
        String strSubstring = str.substring(i, i2);
        if (strSubstring.length() > 0) {
            return strSubstring;
        }
        return null;
    }

    public static final String t(int i, String str) {
        int i2 = i;
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '-') {
                break;
            }
            i2++;
        }
        String strSubstring = str.substring(i, i2);
        if (strSubstring.length() > 0) {
            return strSubstring;
        }
        return null;
    }

    public static final List u(List list, int i, Object obj) {
        if (i < 0 || i >= list.size()) {
            n57.e("[CAL] Cannot replace index " + i + " in list of size " + list.size());
            return list;
        }
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        int i2 = 0;
        while (i2 < size) {
            arrayList.add(i2 == i ? obj : list.get(i2));
            i2++;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object v(ut21 ut21Var, String str, String str2, onm onmVar) {
        yba0 yba0Var;
        if (onmVar instanceof yba0) {
            yba0Var = (yba0) onmVar;
            int i = yba0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                yba0Var.d = i - Integer.MIN_VALUE;
            } else {
                yba0Var = new yba0(onmVar);
            }
        } else {
            yba0Var = new yba0(onmVar);
        }
        Object objA = yba0Var.c;
        int i2 = yba0Var.d;
        if (i2 == 0) {
            hm5.M(objA);
            yba0Var.a = str;
            yba0Var.b = str2;
            yba0Var.d = 1;
            objA = ut21Var.a(str, yba0Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = yba0Var.b;
            str = yba0Var.a;
            hm5.M(objA);
        }
        e1a0 e1a0Var = (f1a0) objA;
        os osVar = new os(str2, str, (byte) 18);
        if (e1a0Var instanceof d1a0) {
            return rba0.a;
        }
        if (e1a0Var instanceof e1a0) {
            return osVar.invoke(e1a0Var.a);
        }
        eg.o();
        return null;
    }

    public static void w(rtb0 rtb0Var, List list, mv51 mv51Var, int i, int i2) {
        String str = (i2 & 4) != 0 ? "" : "curated";
        if ((i2 & 8) != 0) {
            i = 0;
        }
        rtb0Var.e(list.size(), new da((Object) new qeu(str, (byte) 5), (Object) list, (byte) 20), new f1m(list, (byte) 24), new j2i(2039820996, new idv(list, i, mv51Var), true));
    }

    public static final ArrayList x(List list, Set set) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (set.contains(new f3n0(((xi40) obj).a))) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        return o7h.N0(arrayList2, arrayList);
    }

    public static final int y(int i, String str) {
        while (i < str.length() && eth.H(str.charAt(i))) {
            i++;
        }
        return i;
    }

    public static final xj61 z(g7d1 g7d1Var) {
        xj61 xj61Var = new xj61();
        xj61Var.add(new e5d1(g7d1Var));
        if (u890.j(g7d1Var.k, "topic_survey") && !g7d1Var.i) {
            xj61Var.add(v4d1.a);
        }
        return cwl1.j(xj61Var);
    }
}
