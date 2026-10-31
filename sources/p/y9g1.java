package p;

import android.content.Context;
import android.graphics.Matrix;
import android.text.Layout;
import android.view.View;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.mobius.Next;
import io.reactivex.rxjava3.core.Flowable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class y9g1 {
    public static b180 a;

    public static final String A(Set set) {
        String str;
        Set set2 = set;
        ArrayList arrayList = new ArrayList(q7h.U(set2, 10));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            int iOrdinal = ((ko90) it.next()).ordinal();
            if (iOrdinal == 0) {
                str = "broadcast";
            } else if (iOrdinal == 1) {
                str = "frictionless";
            } else if (iOrdinal == 2) {
                str = "bluetooth";
            } else if (iOrdinal == 3) {
                str = "user";
            } else {
                if (iOrdinal != 4) {
                    eg.o();
                    return null;
                }
                str = "listening_activity";
            }
            arrayList.add(str);
        }
        return o7h.y0(o7h.a1(arrayList, sd31.a), ",", (String) null, (String) null, (iu30) null, 62);
    }

    public static final void a(String str, gt40 gt40Var, kee1 kee1Var, float f, b0k b0kVar, int i, int i2) {
        gt40 gt40Var2;
        kee1 kee1Var2;
        float f2;
        kee1 kee1Var3;
        float f3;
        gt40 gt40Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2025914054);
        int i3 = (x340Var.g(str) ? 4 : 2) | i | 48 | (((i2 & 4) == 0 && x340Var.i(kee1Var)) ? 256 : 128) | (((i2 & 8) == 0 && x340Var.d(f)) ? 2048 : 1024);
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                kee1Var3 = (i2 & 4) != 0 ? fim1.f : kee1Var;
                int i4 = i2 & 8;
                gt40 gt40Var4 = et40.a;
                f3 = i4 != 0 ? 32.0f : f;
                gt40Var3 = gt40Var4;
            } else {
                x340Var.b0();
                gt40Var3 = gt40Var;
                kee1Var3 = kee1Var;
                f3 = f;
            }
            x340Var.s();
            j2h1.b(eqr0.F(ila0.m(dm5.Q(gt40Var3, 48.0f), new p05(2131230997)), f3, 4.0f), ql3.g, apo.r(634040604, new hj8(str, kee1Var3, (byte) 23), x340Var), x340Var, 384, 0);
            gt40Var2 = gt40Var3;
            kee1Var2 = kee1Var3;
            f2 = f3;
        } else {
            x340Var.b0();
            gt40Var2 = gt40Var;
            kee1Var2 = kee1Var;
            f2 = f;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ffc(str, gt40Var2, kee1Var2, f2, i, i2, (byte) 0);
        }
    }

    public static final void b(int i, String str, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(1845334308);
        j06 j06Var = ((x340) b0kVar2).a;
        int i2 = i | (b0kVar2.g(str) ? 4 : 2) | 48;
        if (b0kVar2.Y(i2 & 1, (i2 & 19) != 18)) {
            d36 d36Var = new d36(16.0f, true, new um5(false));
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            mbh mbhVarA = jbh.a(d36Var, een.P0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarF);
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
            uwr uwrVar = cbx.a;
            hr80.d((qim0) null, 1.0f, cbx.a(b0kVar2).a.b.c(), b0kVar2, 0, 1);
            fra fraVar = een.N0;
            d36 d36Var2 = new d36(8.0f, true, new um5(false));
            qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
            jw31 jw31VarA = ew31.a(d36Var2, fraVar, b0kVar2, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarF2);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(jw31VarA, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            b0kVar2 = b0kVar2;
            w0h1.a(xrx.c, isl.a, u291.r(qim0Var3, 16.0f), cbx.a(b0kVar2).b.a, 0L, false, b0kVar2, xrx.d | 48, 48);
            uwo1.e(str, (qim0) null, cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, i2 & 14, 0, 2034);
            b0kVar2.r(true);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new rj(str, qim0Var2, i, (byte) 17);
        }
    }

    public static final void c(float f, int i, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        float f2 = f;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(819456032);
        int i2 = i | 6 | (x340Var.d(f2) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            long jB = u7h.b(cbx.a(x340Var).a.c, f2, 0.0f, 0.0f, 0.0f, 14);
            f2 = f;
            long jB2 = u7h.b(cbx.a(x340Var).b.a, f2, 0.0f, 0.0f, 0.0f, 14);
            qim0Var2 = nim0.a;
            qim0 qim0VarN = anm1.N("workout_timeline_cue_dot", u291.r(qim0Var2, 10.0f));
            boolean zF = x340Var.f(jB) | x340Var.d(3.0f) | x340Var.f(jB2);
            Object objT = x340Var.T();
            if (zF || objT == fkj0.X) {
                qna qnaVar = new qna((byte) 21, jB, jB2);
                x340Var.s0(qnaVar);
                objT = qnaVar;
            }
            j0o1.b(0, x340Var, (iu30) objT, qim0VarN);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ou(qim0Var2, f2, i, (byte) 11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x019e  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:107:0x01be  */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:83:0x013f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0141  */
    /* JADX WARN: Code duplicated, block: B:87:0x0150  */
    /* JADX WARN: Code duplicated, block: B:88:0x0152  */
    /* JADX WARN: Code duplicated, block: B:92:0x0162  */
    /* JADX WARN: Code duplicated, block: B:97:0x018d  */
    public static final void d(String str, c380 c380Var, kl1 kl1Var, iu30 iu30Var, xtb0 xtb0Var, boolean z, b0k b0kVar, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        xtb0 xtb0Var2;
        x340 x340Var;
        boolean z4;
        h311 h311VarV;
        Object objT;
        m4c m4cVar;
        ven0 ven0Var;
        boolean z5;
        int i5;
        boolean z6;
        boolean z7;
        Object objT2;
        ven0 ven0Var2;
        mr20 mr20VarE;
        ven0 ven0VarG;
        Integer num;
        boolean z8;
        boolean z9;
        boolean zI;
        Object on1Var;
        Integer num2;
        ven0 ven0Var3;
        ven0 ven0Var4;
        boolean zI2;
        Object objT3;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1781588974);
        if ((i & 6) == 0) {
            i3 = (x340Var2.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var2.g(c380Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var2.i(kl1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= x340Var2.i(iu30Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= x340Var2.i(xtb0Var) ? 16384 : 8192;
        }
        int i6 = i2 & 32;
        if (i6 == 0) {
            if ((196608 & i) == 0) {
                z2 = z;
                i3 |= x340Var2.h(z2) ? 131072 : 65536;
            }
            i4 = i3;
            if ((74899 & i4) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var2.Y(i4 & 1, z3)) {
                if (i6 != 0) {
                    z2 = false;
                }
                objT = x340Var2.T();
                m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = v8r.q(null);
                    x340Var2.s0(objT);
                }
                ven0Var = (ven0) objT;
                if ((i4 & 14) == 4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                i5 = i4 & 112;
                if (i5 == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                z7 = z5 | z6;
                objT2 = x340Var2.T();
                if (!z7 || objT2 == m4cVar) {
                    if (kl1Var.a) {
                        mr20VarE = rqt0.u(new pzs(((xd0) kl1Var.b).c, c380Var, (byte) 22));
                        ven0Var2 = ven0Var;
                    } else {
                        Flowable flowable = (Flowable) ((idd1) kl1Var.f).getValue();
                        vbm[] vbmVarArr = q601.a;
                        ven0Var2 = ven0Var;
                        mr20VarE = hu20.e(new ld2(rqt0.u(new xy0(new kge(flowable), (byte) 26)), str, (byte) 10), new m53(kl1Var, c380Var, iu30Var, (lnm) null, (byte) 4));
                    }
                    objT2 = mr20VarE;
                    x340Var2.s0(objT2);
                } else {
                    i5 = i5;
                    ven0Var2 = ven0Var;
                }
                ven0VarG = rwq.g((mr20) objT2, (Object) null, (o8n) null, x340Var2, 48, 2);
                x340Var = x340Var2;
                num = (Integer) ven0VarG.getValue();
                boolean zI3 = x340Var.i(ven0VarG);
                if (i5 == 32) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean zI4 = zI3 | z8 | x340Var.i(ven0Var2);
                if ((458752 & i4) == 131072) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                zI = zI4 | z9 | x340Var.i(xtb0Var);
                Object objT4 = x340Var.T();
                if (!zI || objT4 == m4cVar) {
                    num2 = num;
                    ven0 ven0Var5 = ven0Var2;
                    on1Var = new on1(ven0VarG, c380Var, z2, xtb0Var, ven0Var5, (lnm) null);
                    ven0Var3 = ven0VarG;
                    xtb0Var2 = xtb0Var;
                    ven0Var4 = ven0Var5;
                    x340Var.s0(on1Var);
                } else {
                    xtb0Var2 = xtb0Var;
                    num2 = num;
                    on1Var = objT4;
                    ven0Var3 = ven0VarG;
                    ven0Var4 = ven0Var2;
                }
                qxd0.t(num2, x340Var, (vu30) on1Var);
                zI2 = x340Var.i(xtb0Var2) | x340Var.i(ven0Var3) | (i5 == 32) | x340Var.i(ven0Var4);
                objT3 = x340Var.T();
                if (zI2 || objT3 == m4cVar) {
                    lqv lqvVar = new lqv(xtb0Var2, c380Var, ven0Var3, ven0Var4, (lnm) null, (byte) 3);
                    x340Var.s0(lqvVar);
                    objT3 = lqvVar;
                }
                qxd0.t(xtb0Var2, x340Var, (vu30) objT3);
            } else {
                xtb0Var2 = xtb0Var;
                x340Var = x340Var2;
                x340Var.b0();
            }
            z4 = z2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new yc5(str, c380Var, kl1Var, iu30Var, xtb0Var2, z4, i, i2);
            }
        }
        i3 |= 196608;
        z2 = z;
        i4 = i3;
        if ((74899 & i4) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (x340Var2.Y(i4 & 1, z3)) {
            if (i6 != 0) {
                z2 = false;
            }
            objT = x340Var2.T();
            m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(null);
                x340Var2.s0(objT);
            }
            ven0Var = (ven0) objT;
            if ((i4 & 14) == 4) {
                z5 = true;
            } else {
                z5 = false;
            }
            i5 = i4 & 112;
            if (i5 == 32) {
                z6 = true;
            } else {
                z6 = false;
            }
            z7 = z5 | z6;
            objT2 = x340Var2.T();
            if (z7) {
                if (kl1Var.a) {
                    mr20VarE = rqt0.u(new pzs(((xd0) kl1Var.b).c, c380Var, (byte) 22));
                    ven0Var2 = ven0Var;
                } else {
                    Flowable flowable2 = (Flowable) ((idd1) kl1Var.f).getValue();
                    vbm[] vbmVarArr2 = q601.a;
                    ven0Var2 = ven0Var;
                    mr20VarE = hu20.e(new ld2(rqt0.u(new xy0(new kge(flowable2), (byte) 26)), str, (byte) 10), new m53(kl1Var, c380Var, iu30Var, (lnm) null, (byte) 4));
                }
                objT2 = mr20VarE;
                x340Var2.s0(objT2);
            } else {
                if (kl1Var.a) {
                    mr20VarE = rqt0.u(new pzs(((xd0) kl1Var.b).c, c380Var, (byte) 22));
                    ven0Var2 = ven0Var;
                } else {
                    Flowable flowable3 = (Flowable) ((idd1) kl1Var.f).getValue();
                    vbm[] vbmVarArr3 = q601.a;
                    ven0Var2 = ven0Var;
                    mr20VarE = hu20.e(new ld2(rqt0.u(new xy0(new kge(flowable3), (byte) 26)), str, (byte) 10), new m53(kl1Var, c380Var, iu30Var, (lnm) null, (byte) 4));
                }
                objT2 = mr20VarE;
                x340Var2.s0(objT2);
            }
            ven0VarG = rwq.g((mr20) objT2, (Object) null, (o8n) null, x340Var2, 48, 2);
            x340Var = x340Var2;
            num = (Integer) ven0VarG.getValue();
            boolean zI5 = x340Var.i(ven0VarG);
            if (i5 == 32) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean zI6 = zI5 | z8 | x340Var.i(ven0Var2);
            if ((458752 & i4) == 131072) {
                z9 = true;
            } else {
                z9 = false;
            }
            zI = zI6 | z9 | x340Var.i(xtb0Var);
            Object objT5 = x340Var.T();
            if (zI) {
                num2 = num;
                ven0 ven0Var6 = ven0Var2;
                on1Var = new on1(ven0VarG, c380Var, z2, xtb0Var, ven0Var6, (lnm) null);
                ven0Var3 = ven0VarG;
                xtb0Var2 = xtb0Var;
                ven0Var4 = ven0Var6;
                x340Var.s0(on1Var);
            } else {
                num2 = num;
                ven0 ven0Var7 = ven0Var2;
                on1Var = new on1(ven0VarG, c380Var, z2, xtb0Var, ven0Var7, (lnm) null);
                ven0Var3 = ven0VarG;
                xtb0Var2 = xtb0Var;
                ven0Var4 = ven0Var7;
                x340Var.s0(on1Var);
            }
            qxd0.t(num2, x340Var, (vu30) on1Var);
            zI2 = x340Var.i(xtb0Var2) | x340Var.i(ven0Var3) | (i5 == 32) | x340Var.i(ven0Var4);
            objT3 = x340Var.T();
            if (zI2) {
                lqv lqvVar2 = new lqv(xtb0Var2, c380Var, ven0Var3, ven0Var4, (lnm) null, (byte) 3);
                x340Var.s0(lqvVar2);
                objT3 = lqvVar2;
            } else {
                lqv lqvVar3 = new lqv(xtb0Var2, c380Var, ven0Var3, ven0Var4, (lnm) null, (byte) 3);
                x340Var.s0(lqvVar3);
                objT3 = lqvVar3;
            }
            qxd0.t(xtb0Var2, x340Var, (vu30) objT3);
        } else {
            xtb0Var2 = xtb0Var;
            x340Var = x340Var2;
            x340Var.b0();
        }
        z4 = z2;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yc5(str, c380Var, kl1Var, iu30Var, xtb0Var2, z4, i, i2);
        }
    }

    public static final void e(dsx dsxVar, dsx dsxVar2, qim0 qim0Var, Brush brush, Brush brush2, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(923778050);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(dsxVar) : x340Var.i(dsxVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(dsxVar2) : x340Var.i(dsxVar2) ? 32 : 16;
        }
        int i3 = i & 384;
        isl islVar = isl.a;
        if (i3 == 0) {
            i2 |= x340Var.g(islVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(qim0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(brush) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(brush2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.h(false) ? 1048576 : 524288;
        }
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            x340Var.i0(-1307512004);
            wat watVar = (wat) x340Var.k(t4k.h);
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            float fX0 = watVar.X0(16.0f);
            x340Var.r(false);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            b180 b180Var = ((Boolean) ven0Var.getValue()).booleanValue() ? dsxVar.a : dsxVar.b;
            boolean zI = x340Var.i(ven0Var) | x340Var.d(fX0);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new og6((byte) 1, fX0, ven0Var);
                x340Var.s0(objT2);
            }
            qim0 qim0VarU = lrn1.u(qim0Var, (iu30) objT2);
            boolean zI2 = x340Var.i(brush);
            Object objT3 = x340Var.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new hk6(brush, (byte) 3);
                x340Var.s0(objT3);
            }
            nl70.b(b180Var, (String) null, exd0.r(qim0VarU, (iu30) objT3), u7h.f, x340Var, 0, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kyq((byte) 15, i, (Object) dsxVar, (Object) dsxVar2, (Object) qim0Var, (Object) brush, (Object) brush2);
        }
    }

    public static final void f(hux huxVar, qim0 qim0Var, Brush brush, Brush brush2, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-193429124);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(huxVar) : x340Var.i(huxVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(isl.a) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(brush) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(brush2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.h(false) ? 131072 : 65536;
        }
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            int i3 = i2 << 3;
            e(huxVar.a, huxVar.b, qim0Var, brush, brush2, x340Var, (i3 & 896) | 72 | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (i3 & 3670016));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ke20((byte) 5, i, huxVar, brush, brush2, qim0Var);
        }
    }

    public static final void g(p0g0 p0g0Var, j2i j2iVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1345409523);
        int i2 = (x340Var.g(p0g0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = r4p1.k(p0g0Var.c, 100L);
                x340Var.s0(objT);
            }
            ven0 ven0VarG = rwq.g((mr20) objT, (Object) null, (o8n) null, x340Var, 48, 2);
            if (((v0g0) ven0VarG.getValue()) != null) {
                x340Var.i0(-460017860);
                x340Var.f0(-153386436, (v0g0) ven0VarG.getValue());
                v0g0 v0g0Var = (v0g0) ven0VarG.getValue();
                v0g0Var.getClass();
                j2iVar.invoke(v0g0Var, x340Var, 48);
                x340Var.r(false);
                x340Var.r(false);
            } else {
                x340Var.i0(-459963083);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q0g0(p0g0Var, j2iVar, i, (byte) 0);
        }
    }

    public static final void h(int i, String str, String str2, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        int i2;
        String str3;
        String str4;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-879743786);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str3 = str;
            i2 |= b0kVar3.g(str3) ? 32 : 16;
        } else {
            str3 = str;
        }
        if ((i & 384) == 0) {
            str4 = str2;
            i2 |= b0kVar3.g(str4) ? 256 : 128;
        } else {
            str4 = str2;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.g(qim0Var) ? 16384 : 8192;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            hux huxVar = z ? aux.c : ztx.c;
            String str5 = z ? str4 : str3;
            boolean z2 = (i2 & 7168) == 2048;
            Object objT = b0kVar3.T();
            if (z2 || objT == fkj0.X) {
                objT = new kek0(function0, (byte) 10);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            wro1.h(new gbx(z50.c, (Function0) objT), ldx.c, qim0Var, (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, apo.r(1233721837, new cp9(huxVar, str5, (byte) 6), b0kVar3), b0kVar2, ((i2 >> 6) & 896) | 48, 6, 1016);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ahu(str3, str4, function0, qim0Var, z, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:84:0x015c  */
    public static final void i(kvq0 kvq0Var, Function0 function0, Function0 function1, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        iu30 iu30Var2;
        ven0 ven0Var;
        boolean z;
        View view;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(730023770);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(kvq0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            iu30Var2 = iu30Var;
            i2 |= x340Var.i(iu30Var2) ? 2048 : 1024;
        } else {
            iu30Var2 = iu30Var;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = v8r.q(null);
                x340Var.s0(objT);
            }
            ven0 ven0Var2 = (ven0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT2);
            }
            ven0 ven0Var3 = (ven0) objT2;
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = v8r.q(null);
                x340Var.s0(objT3);
            }
            ven0 ven0Var4 = (ven0) objT3;
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                objT4 = v8r.q(null);
                x340Var.s0(objT4);
            }
            ven0 ven0Var5 = (ven0) objT4;
            Object objT5 = x340Var.T();
            if (objT5 == m4cVar) {
                objT5 = new dxb();
                x340Var.s0(objT5);
            }
            dxb dxbVar = (dxb) objT5;
            View view2 = (View) x340Var.k(AndroidCompositionLocals_androidKt.f);
            nxb nxbVar = (nxb) ven0Var2.getValue();
            boolean z2 = (nxbVar != null ? nxbVar.d : 0) != 2;
            Object objT6 = x340Var.T();
            if (objT6 == m4cVar) {
                objT6 = v8r.q(fxb.a);
                x340Var.s0(objT6);
            }
            ven0 ven0Var6 = (ven0) objT6;
            boolean zG = x340Var.g((nxb) ven0Var2.getValue());
            Object objT7 = x340Var.T();
            if (zG || objT7 == m4cVar) {
                objT7 = yv91.a(new q2j0(ven0Var2, (byte) 16));
                x340Var.s0(objT7);
            }
            ymd0 ymd0Var = (ymd0) ((tob1) objT7).getValue();
            if (ymd0Var == null) {
                x340Var.i0(-1575207817);
                x340Var.r(false);
                ven0Var = null;
            } else {
                x340Var.i0(1473207498);
                ven0 ven0VarB = b2p1.B(ymd0Var, ymd0Var.e(), x340Var, 0);
                x340Var.r(false);
                ven0Var = ven0VarB;
            }
            nxb nxbVar2 = (nxb) ven0Var2.getValue();
            if (nxbVar2 == null || !nxbVar2.i) {
                nxb nxbVar3 = (nxb) ven0Var2.getValue();
                if ((nxbVar3 != null ? nxbVar3.b : null) == ixb.b) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
            nxb nxbVar4 = (nxb) ven0Var2.getValue();
            boolean z3 = nxbVar4 != null ? nxbVar4.h : true;
            boolean z4 = z;
            nxb nxbVar5 = (nxb) ven0Var2.getValue();
            boolean z5 = nxbVar5 != null ? nxbVar5.g : true;
            zf11 zf11Var = (zf11) x340Var.k(t331.a);
            boolean zI = x340Var.i(view2) | x340Var.i(dxbVar);
            Object objT8 = x340Var.T();
            if (zI || objT8 == m4cVar) {
                objT8 = new ozp0(view2, dxbVar, (byte) 10);
                x340Var.s0(objT8);
            }
            qxd0.h(view2, dxbVar, (iu30) objT8, x340Var);
            cxb cxbVar = (cxb) ven0Var4.getValue();
            hcr0 hcr0Var = (hcr0) ven0Var5.getValue();
            boolean zI2 = x340Var.i(dxbVar);
            Object objT9 = x340Var.T();
            if (zI2 || objT9 == m4cVar) {
                view = view2;
                rwm0 rwm0Var = new rwm0(dxbVar, ven0Var4, ven0Var5, (lnm) null, (byte) 12);
                ven0Var5 = ven0Var5;
                x340Var.s0(rwm0Var);
                objT9 = rwm0Var;
            } else {
                view = view2;
            }
            qxd0.s(cxbVar, hcr0Var, (vu30) objT9, x340Var);
            hr80.a((nxb) ven0Var2.getValue(), apo.r(1623632108, new gvq0(z3, z4, z5, zf11Var, ven0Var, function0, ven0Var6, ven0Var2, ven0Var5, ven0Var4, ven0Var3, z2, view, dxbVar, kvq0Var, function1, iu30Var2), x340Var), x340Var, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new etg0(kvq0Var, function0, function1, iu30Var, i, (byte) 21);
        }
    }

    public static final void j(float f, float f2, int i, int i2, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(701059659);
        int i3 = i2 | (x340Var.e(i) ? 4 : 2) | 48 | (x340Var.d(f) ? 256 : 128) | (x340Var.d(f2) ? 2048 : 1024);
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            long jB = u7h.b(cbx.a(x340Var).b.a, f2 * 0.4f, 0.0f, 0.0f, 0.0f, 14);
            avw0 avw0Var = cbx.b(x340Var).c;
            avw0 avw0Var2 = cbx.b(x340Var).c;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("workout_timeline_line", u291.c(u291.v(qim0Var3, f), 1.0f));
            boolean zD = x340Var.d(1.0f) | x340Var.d(4.0f) | x340Var.f(jB);
            Object objT = x340Var.T();
            if (zD || objT == fkj0.X) {
                objT = new vfe1((byte) 11, jB);
                x340Var.s0(objT);
            }
            w2g0.c(exd0.r(qim0VarN, (iu30) objT), null, apo.r(-2045188555, new xd5(i, f2), x340Var), x340Var, 3072, 6);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wbk0(i, qim0Var2, f, f2, i2);
        }
    }

    public static final smc0 k(eww0 eww0Var, qo90 qo90Var) {
        smc0 smc0VarN = k4p1.n();
        String str = eww0Var.a;
        String str2 = eww0Var.b;
        String str3 = eww0Var.f;
        smc0VarN.add(new phx(8, 0L, str3 == null ? "" : str3, str, str2));
        List<po90> list = qo90Var.d;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (po90 po90Var : list) {
            String str4 = po90Var.b;
            String str5 = po90Var.a;
            String str6 = po90Var.c;
            arrayList.add(new phx(8, 0L, str6 == null ? "" : str6, str4, str5));
        }
        smc0VarN.addAll(arrayList);
        return k4p1.k(smc0VarN);
    }

    public static float l(float f, int i, Context context, String str, kee1 kee1Var) {
        if ((i & 4) != 0) {
            kee1Var = fim1.f;
        }
        if ((i & 8) != 0) {
            f = 32.0f;
        }
        return (f * 2.0f) + (Layout.getDesiredWidth(str, ph5.X(context, kee1Var)) / z1a1.b(context).a);
    }

    public static final List m(Set set, b0a0 b0a0Var) {
        hux huxVar;
        if (!((no4) b0a0Var.a.get()).v0()) {
            return z6x.a;
        }
        Set set2 = set;
        ArrayList arrayList = new ArrayList(q7h.U(set2, 10));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            int iOrdinal = ((ko90) it.next()).ordinal();
            if (iOrdinal == 0) {
                huxVar = eux.c;
            } else if (iOrdinal == 1) {
                huxVar = vsx.c;
            } else if (iOrdinal == 2) {
                huxVar = wkx.c;
            } else if (iOrdinal == 3) {
                huxVar = dnx.c;
            } else {
                if (iOrdinal != 4) {
                    eg.o();
                    return null;
                }
                huxVar = vlx.c;
            }
            arrayList.add(huxVar);
        }
        return arrayList;
    }

    public static List n() {
        return Collections.singletonList(rc11.a.b(xa20.class));
    }

    public static final void o(String str) {
        throw new IllegalArgumentException(f4i1.f("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static final ptf1 p(lqw lqwVar, iu30 iu30Var) {
        return new ptf1(lqwVar, iu30Var, (byte) 3);
    }

    public static final qgg1 q(mqw mqwVar, iu30 iu30Var) {
        return new qgg1(mqwVar, iu30Var);
    }

    public static final rgg1 r(rqw rqwVar, iu30 iu30Var) {
        return new rgg1(rqwVar, iu30Var);
    }

    public static final qim0 s(qim0 qim0Var, iu30 iu30Var) {
        return qim0Var.then(new gpa0(iu30Var, (iu30) null));
    }

    public static final qim0 t(qim0 qim0Var, iu30 iu30Var) {
        return qim0Var.then(new gpa0((iu30) null, iu30Var));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public static final Object u(xtb0 xtb0Var, int i, int i2, iu30 iu30Var, lnm lnmVar) {
        lsy lsyVar;
        Object next;
        int i3;
        int i4;
        Object objPrevious;
        iu30 iu30Var2;
        mmr0 mmr0Var;
        iu30 iu30Var3;
        Object next2;
        int i5;
        if (lnmVar instanceof lsy) {
            lsyVar = (lsy) lnmVar;
            int i6 = lsyVar.c;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                lsyVar.c = i6 - Integer.MIN_VALUE;
            } else {
                lsyVar = new lsy(lnmVar);
            }
        } else {
            lsyVar = new lsy(lnmVar);
        }
        Object obj = lsyVar.b;
        int i7 = lsyVar.c;
        rih1 rih1Var = rih1.a;
        int i8 = 2;
        int i9 = 1;
        if (i7 == 0) {
            hm5.M(obj);
            ptb0 ptb0VarH = xtb0Var.h();
            List list = ptb0VarH.l;
            int i10 = ptb0VarH.n;
            int i11 = ptb0VarH.m;
            if (!list.isEmpty() && ptb0VarH.o != 0) {
                List list2 = list;
                Iterator it = list2.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((qtb0) next).p < i11);
                qtb0 qtb0Var = (qtb0) next;
                int i12 = qtb0Var != null ? qtb0Var.a : -1;
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        i3 = i8;
                        i4 = i9;
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    i4 = i9;
                    qtb0 qtb0Var2 = (qtb0) objPrevious;
                    i3 = i8;
                    if (qtb0Var2.p + qtb0Var2.q <= i10) {
                        break;
                    }
                    i9 = i4;
                    i8 = i3;
                }
                qtb0 qtb0Var3 = (qtb0) objPrevious;
                int i13 = qtb0Var3 != null ? qtb0Var3.a : -1;
                int i14 = i - 1;
                if (i14 < 0) {
                    i14 = 0;
                }
                int i15 = i + 1;
                int i16 = i2 - 1;
                if (i15 > i16) {
                    i15 = i16;
                }
                if (i12 >= 0 && i13 >= 0 && i14 >= i12 && i15 <= i13) {
                    iu30Var.invoke((Object) null);
                    return rih1Var;
                }
                d9n d9nVar = d9n.a;
                if (i == 0 || i == i16) {
                    lsyVar.a = iu30Var;
                    lsyVar.c = i4;
                    if (xtb0Var.f(i, 0, lsyVar) != d9nVar) {
                        iu30Var2 = iu30Var;
                        iu30Var2.invoke((Object) null);
                    }
                } else {
                    if (i12 < 0 || i13 < 0) {
                        mmr0Var = new mmr0(-1, -1);
                    } else {
                        int i17 = i10 - i11;
                        Iterator it2 = list2.iterator();
                        do {
                            if (!it2.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it2.next();
                        } while (((qtb0) next2).a != i);
                        qtb0 qtb0Var4 = (qtb0) next2;
                        if (qtb0Var4 != null) {
                            i5 = qtb0Var4.q;
                        } else {
                            qtb0 qtb0Var5 = (qtb0) o7h.s0(list);
                            i5 = qtb0Var5 != null ? qtb0Var5.q : 0;
                        }
                        mmr0Var = new mmr0(Integer.valueOf(i), Integer.valueOf(i5 > 0 ? (-(i17 - i5)) / 2 : -50));
                    }
                    int iIntValue = ((Number) mmr0Var.a).intValue();
                    int iIntValue2 = ((Number) mmr0Var.b).intValue();
                    if (iIntValue > -1) {
                        lsyVar.a = iu30Var;
                        lsyVar.c = i3;
                        if (xtb0Var.f(iIntValue, iIntValue2, lsyVar) != d9nVar) {
                            iu30Var3 = iu30Var;
                            iu30Var3.invoke((Object) null);
                            return rih1Var;
                        }
                    }
                }
                return d9nVar;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                iu30Var3 = lsyVar.a;
                hm5.M(obj);
                iu30Var3.invoke((Object) null);
                return rih1Var;
            }
            iu30Var2 = lsyVar.a;
            hm5.M(obj);
            iu30Var2.invoke((Object) null);
        }
        return rih1Var;
    }

    public static final void v(Matrix matrix, float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[12];
        float f11 = fArr[13];
        float f12 = fArr[15];
        fArr[0] = f;
        fArr[1] = f5;
        fArr[2] = f10;
        fArr[3] = f2;
        fArr[4] = f6;
        fArr[5] = f11;
        fArr[6] = f4;
        fArr[7] = f8;
        fArr[8] = f12;
        matrix.setValues(fArr);
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
        fArr[8] = f9;
    }

    public static final void w(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        fArr[0] = f;
        fArr[1] = f4;
        fArr[2] = 0.0f;
        fArr[3] = f7;
        fArr[4] = f2;
        fArr[5] = f5;
        fArr[6] = 0.0f;
        fArr[7] = f8;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f3;
        fArr[13] = f6;
        fArr[14] = 0.0f;
        fArr[15] = f9;
    }

    public static final boolean x(int i, iix0 iix0Var) {
        boolean zG = iix0Var.g();
        int iC = l1d.C(i);
        if (iC == 0) {
            return zG;
        }
        if (iC == 1) {
            return (iix0Var instanceof hix0) && zG;
        }
        eg.o();
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0060  */
    /* JADX WARN: Code duplicated, block: B:16:0x007f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0087  */
    /* JADX WARN: Code duplicated, block: B:20:0x008d  */
    /* JADX WARN: Code duplicated, block: B:22:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:24:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:28:0x0102  */
    /* JADX WARN: Code duplicated, block: B:30:0x010d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0144  */
    /* JADX WARN: Code duplicated, block: B:34:0x0163  */
    /* JADX WARN: Code duplicated, block: B:36:0x0167  */
    /* JADX WARN: Code duplicated, block: B:38:0x016b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0170  */
    /* JADX WARN: Code duplicated, block: B:42:0x0174  */
    /* JADX WARN: Code duplicated, block: B:44:0x017a  */
    /* JADX WARN: Code duplicated, block: B:46:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:48:0x01c3  */
    public static final Next y(m9g1 m9g1Var, q9g1 q9g1Var) {
        long j;
        long j2;
        q9g1 q9g1VarA;
        boolean z;
        o9g1 o9g1Var;
        l9g1 l9g1Var;
        String str;
        w8g1 w8g1Var = m9g1Var.e;
        boolean z2 = w8g1Var.b;
        long jLongValue = ((Number) w8g1Var.c.invoke()).longValue();
        u9g1 u9g1Var = m9g1Var.c;
        boolean z3 = u9g1Var instanceof r9g1;
        if (!z3) {
            if (u9g1Var instanceof t9g1) {
                j = ((t9g1) u9g1Var).b;
            } else {
                if (!(u9g1Var instanceof s9g1)) {
                    eg.o();
                    return null;
                }
                j = 0;
                j2 = 0;
            }
            q9g1VarA = q9g1.a(q9g1Var, z2, jLongValue, j, w8g1Var.a, m9g1Var.d, null, null, null, m9g1Var.f, m9g1Var.g, m9g1Var.h, 224);
            z = m9g1Var.b;
            o9g1Var = o9g1.a;
            if (!z) {
                return Next.h(q9g1.a(q9g1VarA, false, 0L, 0L, false, false, null, null, o9g1Var, false, false, null, 1919));
            }
            l9g1Var = q9g1Var.g;
            if (l9g1Var instanceof h9g1) {
                if (l9g1Var instanceof k9g1) {
                    return Next.h(q9g1VarA);
                }
                if (l9g1Var instanceof i9g1) {
                    return w8g1Var.b ? Next.h(q9g1.a(q9g1VarA, false, 0L, 0L, false, false, null, null, new n9g1(((i9g1) l9g1Var).a), false, false, null, 1919)) : Next.h(q9g1.a(q9g1VarA, false, 0L, 0L, false, false, null, null, o9g1Var, false, false, null, 1919));
                }
                return Next.h(q9g1VarA);
            }
            str = m9g1Var.a;
            if (u9g1Var instanceof t9g1) {
                t9g1 t9g1Var = (t9g1) u9g1Var;
                String str2 = t9g1Var.a;
                return Next.i(q9g1.a(q9g1VarA, false, 0L, 0L, false, false, null, new k9g1(str2), null, false, false, null, 1983), Collections.singleton(new x8g1(t9g1Var.b, Long.valueOf(t9g1Var.c), str2)));
            }
            if (u9g1Var instanceof s9g1) {
                return Next.i(q9g1.a(q9g1VarA, false, 0L, 0L, false, false, null, new k9g1(str), null, false, false, null, 1983), Collections.singleton(new x8g1(0L, (Long) null, str)));
            }
            if (z3) {
                r9g1 r9g1Var = (r9g1) u9g1Var;
                return r9g1Var.a.length() > 0 ? Next.i(q9g1.a(q9g1VarA, false, 0L, 0L, false, false, null, new k9g1(str), null, false, false, null, 1983), Collections.singleton(new x8g1(r9g1Var.b, Long.valueOf(r9g1Var.c), str))) : Next.h(q9g1.a(q9g1VarA, false, 0L, 0L, false, false, null, f9g1.a, o9g1Var, false, false, null, 1855));
            }
            eg.o();
            return null;
        }
        j = ((r9g1) u9g1Var).b;
        j2 = 0;
        q9g1VarA = q9g1.a(q9g1Var, z2, jLongValue, j, w8g1Var.a, m9g1Var.d, null, null, null, m9g1Var.f, m9g1Var.g, m9g1Var.h, 224);
        z = m9g1Var.b;
        o9g1Var = o9g1.a;
        if (!z) {
            return Next.h(q9g1.a(q9g1VarA, false, 0L, 0L, false, false, null, null, o9g1Var, false, false, null, 1919));
        }
        l9g1Var = q9g1Var.g;
        if (l9g1Var instanceof h9g1) {
            if (l9g1Var instanceof k9g1) {
                return Next.h(q9g1VarA);
            }
            if (l9g1Var instanceof i9g1) {
                if (w8g1Var.b) {
                }
            }
            return Next.h(q9g1VarA);
        }
        str = m9g1Var.a;
        if (u9g1Var instanceof t9g1) {
            t9g1 t9g1Var2 = (t9g1) u9g1Var;
            String str3 = t9g1Var2.a;
            return Next.i(q9g1.a(q9g1VarA, false, 0L, 0L, false, false, null, new k9g1(str3), null, false, false, null, 1983), Collections.singleton(new x8g1(t9g1Var2.b, Long.valueOf(t9g1Var2.c), str3)));
        }
        if (u9g1Var instanceof s9g1) {
            return Next.i(q9g1.a(q9g1VarA, false, 0L, 0L, false, false, null, new k9g1(str), null, false, false, null, 1983), Collections.singleton(new x8g1(0L, (Long) null, str)));
        }
        if (z3) {
            r9g1 r9g1Var2 = (r9g1) u9g1Var;
            if (r9g1Var2.a.length() > 0) {
            }
        }
        eg.o();
        return null;
    }

    public static final Next z(q9g1 q9g1Var, d9g1 d9g1Var) {
        gcg1 gcg1Var = q9g1Var.f;
        if (d9g1Var instanceof c9g1) {
            gcg1 gcg1Var2 = ((c9g1) d9g1Var).a;
            l9g1 l9g1Var = q9g1Var.g;
            return l9g1Var instanceof j9g1 ? Next.i(q9g1.a(q9g1Var, false, 0L, 0L, false, false, gcg1Var2, null, null, false, false, null, 2015), Collections.singleton(new y8g1(((j9g1) l9g1Var).a, gcg1Var2))) : Next.h(q9g1.a(q9g1Var, false, 0L, 0L, false, false, gcg1Var2, null, null, false, false, null, 2015));
        }
        boolean z = d9g1Var instanceof b9g1;
        g9g1 g9g1Var = g9g1.a;
        o9g1 o9g1Var = o9g1.a;
        if (z) {
            mwz0 mwz0Var = ((b9g1) d9g1Var).a;
            if (mwz0Var.a.isEmpty()) {
                return Next.h(q9g1.a(q9g1Var, false, 0L, 0L, false, false, null, g9g1Var, o9g1Var, false, false, null, 1855));
            }
            return gcg1Var.a == 0 ? Next.h(q9g1.a(q9g1Var, false, 0L, 0L, false, false, null, new j9g1(mwz0Var), null, false, false, null, 1983)) : Next.i(q9g1.a(q9g1Var, false, 0L, 0L, false, false, null, new j9g1(mwz0Var), null, false, false, null, 1983), Collections.singleton(new y8g1(mwz0Var, gcg1Var)));
        }
        if (d9g1Var instanceof a9g1) {
            jyv0 jyv0Var = ((a9g1) d9g1Var).a;
            q9g1 q9g1VarA = q9g1.a(q9g1Var, false, 0L, 0L, false, false, null, new i9g1(jyv0Var), null, false, false, null, 1983);
            return q9g1VarA.a ? Next.h(q9g1.a(q9g1VarA, false, 0L, 0L, false, false, null, null, new n9g1(jyv0Var), false, false, null, 1919)) : Next.h(q9g1.a(q9g1VarA, false, 0L, 0L, false, false, null, null, o9g1Var, false, false, null, 1919));
        }
        if (d9g1Var instanceof z8g1) {
            return Next.h(q9g1.a(q9g1Var, false, 0L, 0L, false, false, null, g9g1Var, o9g1Var, false, false, null, 1855));
        }
        eg.o();
        return null;
    }
}
