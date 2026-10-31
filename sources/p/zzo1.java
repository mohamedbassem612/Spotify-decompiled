package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import j$.time.Clock;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class zzo1 {
    public static b180 a;
    public static b180 b;

    public static final void a(u39 u39Var, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        float f;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1990058843);
        int i2 = i | (b0kVar3.g(u39Var) ? 4 : 2) | (b0kVar3.i(function0) ? 32 : 16) | (b0kVar3.i(function1) ? 256 : 128) | 3072;
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            int i3 = u39Var.g ? 1 : 2;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            if (u39Var.d) {
                b0kVar3.i0(1186123135);
                cvx cvxVar3 = cbx.b(b0kVar3).b;
                b0kVar3.r(false);
                f = 16.0f;
            } else {
                b0kVar3.i0(1186124771);
                cvx cvxVar4 = cbx.b(b0kVar3).b;
                b0kVar3.r(false);
                f = 8.0f;
            }
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarF, new uvx(1, (pgx) null, i3, uyn1.j(16.0f, 8.0f, 0.0f, f, 4), (zzq0) null, (tvx) null, (hw61) null, 0, (p3v) null, 498), null, false, null, null, new gbx(z50.c, function0), null, apo.r(-1361622939, new ub3(u39Var, (byte) 23), b0kVar3), null, null, null, null, null, null, apo.r(-1381843553, new ef8(u39Var, function1, (byte) 3), b0kVar3), b0kVar2, 100663360, 196608, 32444);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wb6(i, (Object) u39Var, (Object) function0, (Object) function1, (Object) qim0Var2, (byte) 18);
        }
    }

    public static final void b(Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-219865367);
        if ((i & 6) == 0) {
            i2 = i | (x340Var2.i(function0) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            d36 d36Var = new d36(16.0f, true, new um5(false));
            cvx cvxVar2 = cbx.b(x340Var2).b;
            qim0 qim0VarY = uyn1.y(nim0.a, 16.0f, cbx.b(x340Var2).b.b);
            mbh mbhVarA = jbh.a(d36Var, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarY);
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
            uwo1.e(cwl1.o0(x340Var2, 2131957385), null, cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2034);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var2.T();
            if (z || objT == fkj0.X) {
                objT = new aba0(function0, (byte) 17);
                x340Var2.s0(objT);
            }
            foo1.c(new gbx(z50.c, (Function0) objT), new idx(), null, null, yla.s(x340Var2), null, null, null, null, null, xvi.b, x340Var2, 0, 48, 2012);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wk1((byte) 18, i, function0, false);
        }
    }

    public static final void c(qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-633046697);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean zI = x340Var.i(ven0Var);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new hj6(ven0Var, (lnm) null, (byte) 11);
                x340Var.s0(objT2);
            }
            rih1 rih1Var = rih1.a;
            qxd0.t(rih1Var, x340Var, (vu30) objT2);
            float f = ((Boolean) ven0Var.getValue()).booleanValue() ? 1.0f : 0.0f;
            uwr uwrVar = cbx.a;
            qim0 qim0VarK = d9y0.k(f8d1.b(anm1.N("listening_activity_carousel", qim0Var), rih1Var, new jt((ViewGroup) x340Var.k(AndroidCompositionLocals_androidKt.f), (byte) 1)), ((Number) z95.b(f, irn1.o0((int) jfv.h(cbx.c(x340Var).b.b), 0, null, 6), (String) null, (iu30) null, x340Var, 0, 28).getValue()).floatValue());
            cvx cvxVar = cbx.b(x340Var).b;
            zzq0 zzq0VarH = uyn1.h(2, 8.0f, 0.0f);
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = ecd0.e;
                x340Var.s0(objT3);
            }
            ujo1.e(qim0VarK, null, zzq0VarH, null, null, null, false, null, (iu30) objT3, x340Var, 805306368, 506);
            x340Var = x340Var;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mq2(qim0Var, i, (byte) 17);
        }
    }

    public static final void d(x720 x720Var, iu30 iu30Var, qim0 qim0Var, Clock clock, b0k b0kVar, int i) {
        qim0 qim0Var2;
        Clock clock2;
        qim0 qim0Var3;
        Clock clock3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1477270249);
        int i2 = i | (x340Var.g(x720Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | 1408;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                Clock clockSystemDefaultZone = Clock.systemDefaultZone();
                qim0Var3 = nim0.a;
                clock3 = clockSystemDefaultZone;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var;
                clock3 = clock;
            }
            x340Var.s();
            qim0 qim0Var4 = qim0Var3;
            nyx.a(2, (wux) null, apo.r(1248445226, new uuy((Object) x720Var, (Object) qim0Var4, (Object) iu30Var, (Object) dem0.f(6, 2, x340Var, (iu30) null, true), cwl1.o0(x340Var, 2131952994), (Object) clock3, (byte) 3), x340Var), x340Var, 3078, 6);
            qim0Var2 = qim0Var4;
            clock2 = clock3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            clock2 = clock;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qfx(x720Var, iu30Var, qim0Var2, clock2, i, (byte) 15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:114:0x0218  */
    /* JADX WARN: Code duplicated, block: B:116:0x021c  */
    /* JADX WARN: Code duplicated, block: B:118:0x0236  */
    /* JADX WARN: Code duplicated, block: B:119:0x0239  */
    /* JADX WARN: Code duplicated, block: B:121:0x023d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0252  */
    /* JADX WARN: Code duplicated, block: B:126:0x0255  */
    /* JADX WARN: Code duplicated, block: B:130:0x025e  */
    /* JADX WARN: Code duplicated, block: B:134:0x028e  */
    /* JADX WARN: Code duplicated, block: B:136:0x0292  */
    /* JADX WARN: Code duplicated, block: B:139:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:141:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:143:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:144:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:146:0x02da  */
    /* JADX WARN: Code duplicated, block: B:150:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:153:0x0327  */
    /* JADX WARN: Code duplicated, block: B:155:0x032b  */
    /* JADX WARN: Code duplicated, block: B:156:0x034e  */
    /* JADX WARN: Code duplicated, block: B:158:0x0353  */
    /* JADX WARN: Code duplicated, block: B:173:0x02e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x0384 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x028a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x025a A[SYNTHETIC] */
    public static final void e(ccd0 ccd0Var, ud1 ud1Var, ng20 ng20Var, zo10 zo10Var, zo10 zo10Var2, zo10 zo10Var3, boolean z, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        zo10 zo10Var4;
        boolean z2;
        qim0 qim0Var2;
        Iterator it;
        String str;
        rih1 rih1Var;
        rih1 rih1Var2;
        String str2;
        String str3;
        ArrayList arrayList;
        nbd0 nbd0Var;
        yk50 yk50Var;
        kbd0 kbd0Var;
        gl50 fl50Var;
        kbd0 kbd0Var2;
        po10 oo10Var;
        int iC;
        ko10 ko10Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2049716077);
        int i2 = (i & 6) == 0 ? (x340Var.i(ccd0Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= x340Var.i(ud1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(ng20Var) ? 256 : 128;
        }
        zo10 zo10Var5 = zo10Var;
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(zo10Var5) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(zo10Var2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            zo10Var4 = zo10Var3;
            i2 |= x340Var.i(zo10Var4) ? 131072 : 65536;
        } else {
            zo10Var4 = zo10Var3;
        }
        if ((1572864 & i) == 0) {
            z2 = z;
            i2 |= x340Var.h(z2) ? 1048576 : 524288;
        } else {
            z2 = z;
        }
        if ((12582912 & i) == 0) {
            i2 |= x340Var.i(function0) ? 8388608 : 4194304;
        }
        int i3 = i2 | 100663296;
        if (x340Var.Y(i3 & 1, (38347923 & i3) != 38347922)) {
            acd0 acd0Var = ccd0Var.b;
            boolean z3 = acd0Var instanceof wbd0;
            qim0 qim0Var3 = nim0.a;
            if (z3) {
                x340Var.i0(-1612823600);
                b(function0, x340Var, (i3 >> 21) & 14);
                x340Var.r(false);
            } else {
                if (acd0Var instanceof ybd0) {
                    x340Var.i0(-1612821549);
                    c(qim0Var3, x340Var, (i3 >> 24) & 14);
                    x340Var.r(false);
                } else {
                    if (!(acd0Var instanceof xbd0) && !(acd0Var instanceof zbd0)) {
                        throw p3d1.k(x340Var, -1612821121, false);
                    }
                    x340Var.i0(1542350645);
                    ViewGroup viewGroup = (ViewGroup) x340Var.k(AndroidCompositionLocals_androidKt.f);
                    qim0 qim0VarN = anm1.N("listening_activity_carousel", qim0Var3);
                    jt jtVar = new jt(viewGroup, (byte) 1);
                    rih1 rih1Var3 = rih1.a;
                    qim0 qim0VarT = l6o1.t(f8d1.b(qim0VarN, rih1Var3, jtVar), l6o1.C(0, 0, 1, x340Var), 14);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var).b;
                    qim0 qim0VarZ = uyn1.z(8.0f, 0.0f, 2, qim0VarT);
                    boolean z4 = false;
                    jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
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
                    nko1.H(jw31VarA, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    x340Var.i0(-1833651166);
                    for (Iterator it2 = ccd0Var.a.iterator(); it2.hasNext(); it2 = it) {
                        obd0 obd0Var = (tbd0) it2.next();
                        boolean z5 = obd0Var instanceof obd0;
                        if (z5) {
                            it = it2;
                            str = obd0Var.a;
                        } else {
                            it = it2;
                            if (obd0Var instanceof qbd0) {
                                str = ((qbd0) obd0Var).a;
                            } else if (obd0Var instanceof sbd0) {
                                str = "your_activity";
                            } else if (obd0Var instanceof jbd0) {
                                str = "add_friends";
                            } else {
                                if (!(obd0Var instanceof rbd0)) {
                                    eg.o();
                                    return;
                                }
                                str = "invite";
                            }
                            x340Var.f0(-1117477170, str);
                            if (obd0Var instanceof sbd0) {
                                x340Var.i0(-1117468886);
                                otw.b(zo10Var5, qnm1.a, new joa0("your_activity"), (qim0) null, x340Var, (i3 >> 9) & 14, 8);
                                x340Var.r(false);
                                z4 = false;
                            } else if (z5) {
                                x340Var.i0(-1117458658);
                                obd0 obd0Var2 = obd0Var;
                                String str4 = obd0Var2.a;
                                long j = ccd0Var.c;
                                nbd0 nbd0Var2 = obd0Var2.b;
                                String str5 = nbd0Var2.a;
                                String str6 = nbd0Var2.b;
                                kbd0Var2 = nbd0Var2.c;
                                if (kbd0Var2 instanceof lbd0) {
                                    oo10Var = po10.a;
                                } else {
                                    if (kbd0Var2 instanceof kbd0) {
                                        eg.o();
                                        return;
                                    }
                                    oo10Var = new oo10(kbd0Var2.a);
                                }
                                fo10 fo10Var = new fo10(str5, str6, oo10Var);
                                iC = l1d.C(obd0Var2.c);
                                if (iC != 0) {
                                    ko10Var = lo10.a;
                                } else {
                                    if (iC == 1) {
                                        eg.o();
                                        return;
                                    }
                                    ko10Var = ko10.a;
                                }
                                otw.b(zo10Var2, new ro10(str4, fo10Var, j, ko10Var, z2), new joa0(obd0Var2.a), (qim0) null, x340Var, (i3 >> 12) & 14, 8);
                                z4 = false;
                                x340Var.r(false);
                            } else {
                                if (obd0Var instanceof qbd0) {
                                    x340Var.i0(-1117406925);
                                    qbd0 qbd0Var = (qbd0) obd0Var;
                                    str2 = qbd0Var.b;
                                    str3 = qbd0Var.a;
                                    ArrayList<pbd0> arrayList2 = qbd0Var.c;
                                    arrayList = new ArrayList(q7h.U(arrayList2, 10));
                                    for (pbd0 pbd0Var : arrayList2) {
                                        String str7 = pbd0Var.a;
                                        nbd0Var = pbd0Var.b;
                                        if (nbd0Var != null) {
                                            String str8 = nbd0Var.a;
                                            String str9 = nbd0Var.b;
                                            kbd0Var = nbd0Var.c;
                                            if (kbd0Var instanceof lbd0) {
                                                fl50Var = gl50.a;
                                            } else {
                                                if (kbd0Var instanceof kbd0) {
                                                    eg.o();
                                                    return;
                                                }
                                                fl50Var = new fl50(kbd0Var.a);
                                            }
                                            yk50Var = new yk50(str8, str9, fl50Var);
                                        } else {
                                            yk50Var = null;
                                        }
                                        arrayList.add(new el50(str7, yk50Var));
                                        str2 = str2;
                                        str3 = str3;
                                    }
                                    otw.b(zo10Var4, new il50(ccd0Var.c, str2, str3, arrayList), new joa0(qbd0Var.a), (qim0) null, x340Var, (i3 >> 15) & 14, 8);
                                    z4 = false;
                                    x340Var.r(false);
                                } else if (obd0Var instanceof jbd0) {
                                    x340Var.i0(-1117380891);
                                    rih1Var2 = rih1Var3;
                                    otw.b(ud1Var, rih1Var2, new joa0("add_friends"), (qim0) null, x340Var, ((i3 >> 3) & 14) | 48, 8);
                                    z4 = false;
                                    x340Var.r(false);
                                } else {
                                    rih1Var = rih1Var3;
                                    if (obd0Var instanceof rbd0) {
                                        throw p3d1.k(x340Var, -1117467882, false);
                                    }
                                    x340Var.i0(-1117373284);
                                    rih1Var2 = rih1Var;
                                    otw.b(ng20Var, rih1Var2, new joa0("invite"), (qim0) null, x340Var, ((i3 >> 6) & 14) | 48, 8);
                                    z4 = false;
                                    x340Var.r(false);
                                }
                                x340Var.r(z4);
                                zo10Var5 = zo10Var;
                                zo10Var4 = zo10Var3;
                                z2 = z;
                                rih1Var3 = rih1Var2;
                            }
                            rih1Var2 = rih1Var3;
                            x340Var.r(z4);
                            zo10Var5 = zo10Var;
                            zo10Var4 = zo10Var3;
                            z2 = z;
                            rih1Var3 = rih1Var2;
                        }
                        x340Var.f0(-1117477170, str);
                        if (obd0Var instanceof sbd0) {
                            x340Var.i0(-1117468886);
                            otw.b(zo10Var5, qnm1.a, new joa0("your_activity"), (qim0) null, x340Var, (i3 >> 9) & 14, 8);
                            x340Var.r(false);
                            z4 = false;
                        } else if (z5) {
                            x340Var.i0(-1117458658);
                            obd0 obd0Var3 = obd0Var;
                            String str10 = obd0Var3.a;
                            long j2 = ccd0Var.c;
                            nbd0 nbd0Var3 = obd0Var3.b;
                            String str11 = nbd0Var3.a;
                            String str12 = nbd0Var3.b;
                            kbd0Var2 = nbd0Var3.c;
                            if (kbd0Var2 instanceof lbd0) {
                                oo10Var = po10.a;
                            } else {
                                if (kbd0Var2 instanceof kbd0) {
                                    eg.o();
                                    return;
                                }
                                oo10Var = new oo10(kbd0Var2.a);
                            }
                            fo10 fo10Var2 = new fo10(str11, str12, oo10Var);
                            iC = l1d.C(obd0Var3.c);
                            if (iC != 0) {
                                ko10Var = lo10.a;
                            } else {
                                if (iC == 1) {
                                    eg.o();
                                    return;
                                }
                                ko10Var = ko10.a;
                            }
                            otw.b(zo10Var2, new ro10(str10, fo10Var2, j2, ko10Var, z2), new joa0(obd0Var3.a), (qim0) null, x340Var, (i3 >> 12) & 14, 8);
                            z4 = false;
                            x340Var.r(false);
                        } else {
                            if (obd0Var instanceof qbd0) {
                                x340Var.i0(-1117406925);
                                qbd0 qbd0Var2 = (qbd0) obd0Var;
                                str2 = qbd0Var2.b;
                                str3 = qbd0Var2.a;
                                ArrayList<pbd0> arrayList3 = qbd0Var2.c;
                                arrayList = new ArrayList(q7h.U(arrayList3, 10));
                                while (r4.hasNext()) {
                                    String str13 = pbd0Var.a;
                                    nbd0Var = pbd0Var.b;
                                    if (nbd0Var != null) {
                                        String str14 = nbd0Var.a;
                                        String str15 = nbd0Var.b;
                                        kbd0Var = nbd0Var.c;
                                        if (kbd0Var instanceof lbd0) {
                                            fl50Var = gl50.a;
                                        } else {
                                            if (kbd0Var instanceof kbd0) {
                                                eg.o();
                                                return;
                                            }
                                            fl50Var = new fl50(kbd0Var.a);
                                        }
                                        yk50Var = new yk50(str14, str15, fl50Var);
                                    } else {
                                        yk50Var = null;
                                    }
                                    arrayList.add(new el50(str13, yk50Var));
                                    str2 = str2;
                                    str3 = str3;
                                }
                                otw.b(zo10Var4, new il50(ccd0Var.c, str2, str3, arrayList), new joa0(qbd0Var2.a), (qim0) null, x340Var, (i3 >> 15) & 14, 8);
                                z4 = false;
                                x340Var.r(false);
                            } else if (obd0Var instanceof jbd0) {
                                x340Var.i0(-1117380891);
                                rih1Var2 = rih1Var3;
                                otw.b(ud1Var, rih1Var2, new joa0("add_friends"), (qim0) null, x340Var, ((i3 >> 3) & 14) | 48, 8);
                                z4 = false;
                                x340Var.r(false);
                            } else {
                                rih1Var = rih1Var3;
                                if (obd0Var instanceof rbd0) {
                                    throw p3d1.k(x340Var, -1117467882, false);
                                }
                                x340Var.i0(-1117373284);
                                rih1Var2 = rih1Var;
                                otw.b(ng20Var, rih1Var2, new joa0("invite"), (qim0) null, x340Var, ((i3 >> 6) & 14) | 48, 8);
                                z4 = false;
                                x340Var.r(false);
                            }
                            x340Var.r(z4);
                            zo10Var5 = zo10Var;
                            zo10Var4 = zo10Var3;
                            z2 = z;
                            rih1Var3 = rih1Var2;
                        }
                        rih1Var2 = rih1Var3;
                        x340Var.r(z4);
                        zo10Var5 = zo10Var;
                        zo10Var4 = zo10Var3;
                        z2 = z;
                        rih1Var3 = rih1Var2;
                    }
                    us71.m(x340Var, z4, true, z4);
                }
                qim0Var2 = qim0Var3;
            }
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ob8(ccd0Var, ud1Var, ng20Var, zo10Var, zo10Var2, zo10Var3, z, function0, qim0Var2, i);
        }
    }

    public static final void f(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2051331310);
        if (x340Var.Y(i & 1, i != 0)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarB = uyn1.B(u291.f(nim0Var, 1.0f), 0.0f, 32.0f, 0.0f, 48.0f, 5);
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            rhx0.a(h2c.a.a(u291.v(nim0Var, 32.0f), een.h), 0L, 0.0f, 0L, 0, 0.0f, x340Var, 0, 62);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new htu(i, (byte) 26);
        }
    }

    public static final void g(String str, c380 c380Var, vu30 vu30Var, float f, qim0 qim0Var, Brush brush, String str2, Function0 function0, float f2, j2i j2iVar, b0k b0kVar, int i, int i2) {
        int i3;
        vu30 vu30Var2;
        float f3;
        qim0 qim0Var2;
        Brush brush2;
        String str3;
        Function0 function1;
        float f4;
        int i4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-186743434);
        if ((i & 6) == 0) {
            i3 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? x340Var.g(c380Var) : x340Var.i(c380Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            vu30Var2 = vu30Var;
            i3 |= x340Var.i(vu30Var2) ? 256 : 128;
        } else {
            vu30Var2 = vu30Var;
        }
        if ((i & 3072) == 0) {
            f3 = f;
            i3 |= x340Var.d(f3) ? 2048 : 1024;
        } else {
            f3 = f;
        }
        if ((i & 24576) == 0) {
            qim0Var2 = qim0Var;
            i3 |= x340Var.i(qim0Var2) ? 16384 : 8192;
        } else {
            qim0Var2 = qim0Var;
        }
        int i5 = i3 | 196608;
        if ((i & 1572864) == 0) {
            brush2 = brush;
            i5 |= x340Var.i(brush2) ? 1048576 : 524288;
        } else {
            brush2 = brush;
        }
        if ((12582912 & i) == 0) {
            str3 = str2;
            i5 |= x340Var.g(str3) ? 8388608 : 4194304;
        } else {
            str3 = str2;
        }
        if ((100663296 & i) == 0) {
            function1 = function0;
            i5 |= x340Var.i(function1) ? 67108864 : 33554432;
        } else {
            function1 = function0;
        }
        if ((805306368 & i) == 0) {
            f4 = f2;
            i5 |= x340Var.d(f4) ? 536870912 : 268435456;
        } else {
            f4 = f2;
        }
        int i6 = i5;
        if ((i2 & 6) == 0) {
            i4 = i2 | (x340Var.i(j2iVar) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (x340Var.Y(i6 & 1, ((i6 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            int i7 = i6 >> 9;
            d0p1.j(str, qim0Var2, null, brush2, str3, function1, apo.r(1269556902, new ub9(f4, c380Var, vu30Var2, j2iVar, f3), x340Var), x340Var, (i6 & 14) | 1572864 | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (57344 & i7) | (i7 & 458752));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e411(str, c380Var, vu30Var, f, qim0Var, brush, str2, function0, f2, j2iVar, i, i2);
        }
    }

    public static final void h(la71 la71Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(917068710);
        int i2 = (x340Var.g(la71Var) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            t1c.a(anm1.N("share.media.container.color", dug.e(qim0Var, v9c.s(p7h.M(new u7h[]{new u7h(la71Var.a), new u7h(la71Var.b)}), 0.0f, 0.0f, 14), null, 0.0f, 6)), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jt41(la71Var, qim0Var, i, (byte) 20);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0131  */
    /* JADX WARN: Code duplicated, block: B:103:0x0140  */
    /* JADX WARN: Code duplicated, block: B:105:0x016d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:106:0x016f  */
    /* JADX WARN: Code duplicated, block: B:110:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:113:0x0209  */
    /* JADX WARN: Code duplicated, block: B:115:0x0210  */
    /* JADX WARN: Code duplicated, block: B:116:0x0216  */
    /* JADX WARN: Code duplicated, block: B:120:0x023e  */
    /* JADX WARN: Code duplicated, block: B:122:0x0248  */
    /* JADX WARN: Code duplicated, block: B:124:0x025e  */
    /* JADX WARN: Code duplicated, block: B:125:0x0260  */
    /* JADX WARN: Code duplicated, block: B:128:0x026c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:129:0x026e  */
    /* JADX WARN: Code duplicated, block: B:131:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:133:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:135:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:143:0x0334  */
    /* JADX WARN: Code duplicated, block: B:145:0x0345  */
    /* JADX WARN: Code duplicated, block: B:150:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:152:0x03af  */
    /* JADX WARN: Code duplicated, block: B:155:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:160:0x012a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x032e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x038b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0090  */
    /* JADX WARN: Code duplicated, block: B:58:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d4 A[PHI: r2 r5 r7 r8
      0x00d4: PHI (r2v32 int) = (r2v14 int), (r2v34 int), (r2v35 int) binds: [B:88:0x00fe, B:76:0x00d0, B:77:0x00d2] A[DONT_GENERATE, DONT_INLINE]
      0x00d4: PHI (r5v12 p.qim0) = (r5v3 p.qim0), (r5v2 p.qim0), (r5v2 p.qim0) binds: [B:88:0x00fe, B:76:0x00d0, B:77:0x00d2] A[DONT_GENERATE, DONT_INLINE]
      0x00d4: PHI (r7v20 p.lee1) = (r7v9 p.lee1), (r7v6 p.lee1), (r7v6 p.lee1) binds: [B:88:0x00fe, B:76:0x00d0, B:77:0x00d2] A[DONT_GENERATE, DONT_INLINE]
      0x00d4: PHI (r8v26 long) = (r8v4 long), (r8v2 long), (r8v2 long) binds: [B:88:0x00fe, B:76:0x00d0, B:77:0x00d2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x00db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:89:0x0100  */
    /* JADX WARN: Code duplicated, block: B:91:0x0106  */
    /* JADX WARN: Code duplicated, block: B:96:0x011e  */
    public static final void i(c380 c380Var, qim0 qim0Var, lee1 lee1Var, long j, int i, iu30 iu30Var, b0k b0kVar, int i2, int i3) {
        int i4;
        qim0 qim0Var2;
        lee1 lee1Var2;
        long j2;
        int i5;
        iu30 iu30Var2;
        int i6;
        boolean z;
        x340 x340Var;
        qim0 qim0Var3;
        lee1 lee1Var3;
        long j3;
        iu30 iu30Var3;
        h311 h311VarV;
        int i7;
        qim0 qim0Var4;
        Object objT;
        int i8;
        iu30 iu30Var4;
        lee1 lee1Var4;
        long j4;
        Iterator it;
        Object next;
        dor0 dor0Var;
        String str;
        String strE;
        lee1 lee1Var5;
        yae1 yae1VarQ;
        boolean zG;
        Throwable th;
        Object objT2;
        cpr0 cpr0Var;
        Object objT3;
        boolean z2;
        mbh mbhVarA;
        qim0 qim0Var5;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        Iterator itN;
        cor0 cor0Var;
        qim0 qim0Var6;
        String str2;
        boolean z3;
        cpr0 cpr0Var2;
        iu30 iu30Var5;
        long j5;
        lee1 lee1Var6;
        x340 x340Var2;
        String str3;
        cpr0 cpr0Var3;
        boolean z4;
        long j6;
        ye5 ye5VarO;
        int iN;
        cor0 cor0Var2;
        boolean z5;
        boolean zI;
        Object objT4;
        int i9;
        int i10 = i;
        Object obj = fkj0.X;
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(-1113257730);
        if ((i2 & 6) == 0) {
            i4 = (x340Var3.i(c380Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i11 = i3 & 2;
        if (i11 == 0) {
            if ((i2 & 48) == 0) {
                qim0Var2 = qim0Var;
                i4 |= x340Var3.i(qim0Var2) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                if ((i3 & 4) == 0) {
                    lee1Var2 = lee1Var;
                    int i12 = x340Var3.i(lee1Var2) ? 256 : 128;
                    i4 |= i12;
                } else {
                    lee1Var2 = lee1Var;
                }
                i4 |= i12;
            } else {
                lee1Var2 = lee1Var;
            }
            if ((i2 & 3072) == 0) {
                if ((i3 & 8) == 0) {
                    j2 = j;
                    int i13 = x340Var3.f(j2) ? 2048 : 1024;
                    i4 |= i13;
                } else {
                    j2 = j;
                }
                i4 |= i13;
            } else {
                j2 = j;
            }
            if ((i2 & 24576) == 0) {
                if (x340Var3.e(i10)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i4 |= i9;
            }
            i5 = i3 & 32;
            if (i5 != 0) {
                if ((196608 & i2) == 0) {
                    iu30Var2 = iu30Var;
                    if (x340Var3.i(iu30Var2)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i4 |= i6;
                }
                if ((74899 & i4) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var3.Y(i4 & 1, z)) {
                    x340Var3.d0();
                    i7 = i2 & 1;
                    qim0Var4 = nim0.a;
                    if (i7 != 0 || x340Var3.E()) {
                        if (i11 != 0) {
                            qim0Var2 = qim0Var4;
                        }
                        if ((i3 & 4) != 0) {
                            uwr uwrVar = cbx.a;
                            i4 &= -897;
                            lee1Var2 = cbx.d(x340Var3).g;
                        }
                        if ((i3 & 8) != 0) {
                            uwr uwrVar2 = cbx.a;
                            i4 &= -7169;
                            j2 = cbx.a(x340Var3).b.a;
                        }
                        if (i5 != 0) {
                            objT = x340Var3.T();
                            if (objT == obj) {
                                objT = nvi1.Z;
                                x340Var3.s0(objT);
                            }
                            i8 = i4;
                            iu30Var4 = (iu30) objT;
                        }
                        qim0 qim0Var7 = qim0Var2;
                        lee1Var4 = lee1Var2;
                        j4 = j2;
                        x340Var3.s();
                        it = c380Var.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!(((nor0) next) instanceof dor0));
                        dor0Var = (nor0) next;
                        str = " ";
                        if (dor0Var == null) {
                            x340Var3.i0(676820905);
                            x340Var3.r(false);
                            th = null;
                            cpr0Var = null;
                        } else {
                            x340Var3.i0(676820906);
                            strE = f4i1.e(dor0Var.a, " ");
                            lee1Var5 = (lee1) x340Var3.k(q9e1.a);
                            yae1VarQ = d5p1.q(0, x340Var3, 1);
                            zG = x340Var3.g(lee1Var5) | x340Var3.g(yae1VarQ);
                            th = null;
                            objT2 = x340Var3.T();
                            if (zG || objT2 == obj) {
                                objT2 = Integer.valueOf((int) (yae1.a(yae1VarQ, strE, lee1Var5, 0, false, 0, 0L, (flb0) null, (xat) null, 1020).c >> 32));
                                x340Var3.s0(objT2);
                            }
                            cpr0Var = new cpr0(0, 0, 0L, new u8e1(1, 0L, ((wat) x340Var3.k(t4k.h)).I(((Number) objT2).intValue())), (edt0) null, 0, 0, 503);
                            x340Var3.r(false);
                        }
                        objT3 = x340Var3.T();
                        if (objT3 == obj) {
                            objT3 = nvi1.N0;
                            x340Var3.s0(objT3);
                        }
                        z2 = true;
                        qim0 qim0VarB = s161.b(qim0Var4, true, (iu30) objT3);
                        uwr uwrVar3 = cbx.a;
                        cvx cvxVar = cbx.b(x340Var3).b;
                        mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), een.P0, x340Var3, 0);
                        qim0Var5 = qim0Var7;
                        iHashCode = Long.hashCode(x340Var3.T);
                        xos0VarM = x340Var3.m();
                        qim0VarE = zr7.E(x340Var3, qim0VarB);
                        hzj.A.getClass();
                        if (x340Var3.a == null) {
                            tgp1.p();
                            throw th;
                        }
                        x340Var3.m0();
                        if (x340Var3.S) {
                            x340Var3.l(hmb0.t1);
                        } else {
                            x340Var3.v0();
                        }
                        nko1.H(mbhVarA, x340Var3, y580.O0);
                        nko1.H(xos0VarM, x340Var3, y580.N0);
                        nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
                        nko1.F(x340Var3);
                        itN = kk0.n(x340Var3, qim0VarE, y580.Y, -82676075, c380Var);
                        while (itN.hasNext()) {
                            cor0Var = (nor0) itN.next();
                            if (cor0Var instanceof cor0) {
                                x340Var3.i0(1948874223);
                                cor0Var2 = cor0Var;
                                String str4 = cor0Var2.a;
                                String str5 = str;
                                String str6 = cor0Var2.b;
                                if ((i8 & 458752) == 131072) {
                                    z5 = z2;
                                } else {
                                    z5 = false;
                                }
                                zI = x340Var3.i(cor0Var) | z5;
                                objT4 = x340Var3.T();
                                if (zI || objT4 == obj) {
                                    objT4 = new mah1(iu30Var4, cor0Var2, (byte) 15);
                                    x340Var3.s0(objT4);
                                }
                                boolean z6 = z2;
                                cpr0 cpr0Var4 = cpr0Var;
                                iu30Var5 = iu30Var4;
                                qim0 qim0Var8 = qim0Var5;
                                c0p1.f(str4, str6, qim0Var8, lee1Var4, j4, i, (Function0) objT4, x340Var3, (i8 << 3) & 524160);
                                qim0Var6 = qim0Var8;
                                x340Var3.r(false);
                                lee1Var6 = lee1Var4;
                                x340Var2 = x340Var3;
                                str3 = str5;
                                cpr0Var3 = cpr0Var4;
                                j6 = j4;
                                z4 = z6;
                            } else {
                                qim0Var6 = qim0Var5;
                                str2 = str;
                                z3 = z2;
                                cpr0Var2 = cpr0Var;
                                iu30Var5 = iu30Var4;
                                j5 = j4;
                                if (cor0Var instanceof dor0) {
                                    ye5VarO = kk0.o(1949187850, x340Var3);
                                    if (cpr0Var2 == null) {
                                        eg.m("NumberedParagraphStyle should not be null for numbered paragraphs");
                                        return;
                                    }
                                    iN = ye5VarO.n(cpr0Var2);
                                    try {
                                        ye5VarO.g(((dor0) cor0Var).a);
                                        ye5VarO.g(str2);
                                        ye5VarO.g(((dor0) cor0Var).b);
                                        ye5VarO.k(iN);
                                        int i14 = i8 << 3;
                                        x340 x340Var4 = x340Var3;
                                        str3 = str2;
                                        cpr0Var3 = cpr0Var2;
                                        z4 = z3;
                                        lee1 lee1Var7 = lee1Var4;
                                        uwo1.d(ye5VarO.p(), j5, qim0Var6, lee1Var7, new a0e1(i), null, 0, false, null, 0, null, null, x340Var4, (i14 & 896) | ((i8 >> 6) & 112) | (i14 & 7168) | (i8 & 57344), 0, 4064);
                                        j6 = j5;
                                        lee1Var6 = lee1Var7;
                                        x340Var2 = x340Var4;
                                        x340Var2.r(false);
                                    } catch (Throwable th2) {
                                        ye5VarO.k(iN);
                                        throw th2;
                                    }
                                } else {
                                    lee1Var6 = lee1Var4;
                                    x340Var2 = x340Var3;
                                    str3 = str2;
                                    cpr0Var3 = cpr0Var2;
                                    z4 = z3;
                                    if (!(cor0Var instanceof lor0)) {
                                        throw p3d1.k(x340Var2, 755603206, false);
                                    }
                                    x340Var2.i0(1949836804);
                                    uwo1.e(((lor0) cor0Var).a, qim0Var6, lee1Var6, j5, new a0e1(i), null, 0, false, null, 0, null, x340Var2, i8 & 65520, 0, 2016);
                                    qim0Var6 = qim0Var6;
                                    j6 = j5;
                                    x340Var2.r(false);
                                }
                            }
                            str = str3;
                            x340Var3 = x340Var2;
                            j4 = j6;
                            lee1Var4 = lee1Var6;
                            qim0Var5 = qim0Var6;
                            iu30Var4 = iu30Var5;
                            cpr0Var = cpr0Var3;
                            z2 = z4;
                        }
                        iu30 iu30Var6 = iu30Var4;
                        long j7 = j4;
                        x340Var = x340Var3;
                        i10 = i;
                        x340Var.r(false);
                        x340Var.r(z2);
                        j3 = j7;
                        lee1Var3 = lee1Var4;
                        qim0Var3 = qim0Var5;
                        iu30Var3 = iu30Var6;
                    } else {
                        x340Var3.b0();
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                    }
                    i8 = i4;
                    iu30Var4 = iu30Var2;
                    qim0 qim0Var9 = qim0Var2;
                    lee1Var4 = lee1Var2;
                    j4 = j2;
                    x340Var3.s();
                    it = c380Var.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!(((nor0) next) instanceof dor0));
                    dor0Var = (nor0) next;
                    str = " ";
                    if (dor0Var == null) {
                        x340Var3.i0(676820905);
                        x340Var3.r(false);
                        th = null;
                        cpr0Var = null;
                    } else {
                        x340Var3.i0(676820906);
                        strE = f4i1.e(dor0Var.a, " ");
                        lee1Var5 = (lee1) x340Var3.k(q9e1.a);
                        yae1VarQ = d5p1.q(0, x340Var3, 1);
                        zG = x340Var3.g(lee1Var5) | x340Var3.g(yae1VarQ);
                        th = null;
                        objT2 = x340Var3.T();
                        if (zG) {
                            objT2 = Integer.valueOf((int) (yae1.a(yae1VarQ, strE, lee1Var5, 0, false, 0, 0L, (flb0) null, (xat) null, 1020).c >> 32));
                            x340Var3.s0(objT2);
                        } else {
                            objT2 = Integer.valueOf((int) (yae1.a(yae1VarQ, strE, lee1Var5, 0, false, 0, 0L, (flb0) null, (xat) null, 1020).c >> 32));
                            x340Var3.s0(objT2);
                        }
                        cpr0Var = new cpr0(0, 0, 0L, new u8e1(1, 0L, ((wat) x340Var3.k(t4k.h)).I(((Number) objT2).intValue())), (edt0) null, 0, 0, 503);
                        x340Var3.r(false);
                    }
                    objT3 = x340Var3.T();
                    if (objT3 == obj) {
                        objT3 = nvi1.N0;
                        x340Var3.s0(objT3);
                    }
                    z2 = true;
                    qim0 qim0VarB2 = s161.b(qim0Var4, true, (iu30) objT3);
                    uwr uwrVar4 = cbx.a;
                    cvx cvxVar2 = cbx.b(x340Var3).b;
                    mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), een.P0, x340Var3, 0);
                    qim0Var5 = qim0Var9;
                    iHashCode = Long.hashCode(x340Var3.T);
                    xos0VarM = x340Var3.m();
                    qim0VarE = zr7.E(x340Var3, qim0VarB2);
                    hzj.A.getClass();
                    if (x340Var3.a == null) {
                        tgp1.p();
                        throw th;
                    }
                    x340Var3.m0();
                    if (x340Var3.S) {
                        x340Var3.l(hmb0.t1);
                    } else {
                        x340Var3.v0();
                    }
                    nko1.H(mbhVarA, x340Var3, y580.O0);
                    nko1.H(xos0VarM, x340Var3, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
                    nko1.F(x340Var3);
                    itN = kk0.n(x340Var3, qim0VarE, y580.Y, -82676075, c380Var);
                    while (itN.hasNext()) {
                        cor0Var = (nor0) itN.next();
                        if (cor0Var instanceof cor0) {
                            x340Var3.i0(1948874223);
                            cor0Var2 = cor0Var;
                            String str7 = cor0Var2.a;
                            String str8 = str;
                            String str9 = cor0Var2.b;
                            if ((i8 & 458752) == 131072) {
                                z5 = z2;
                            } else {
                                z5 = false;
                            }
                            zI = x340Var3.i(cor0Var) | z5;
                            objT4 = x340Var3.T();
                            if (zI) {
                                objT4 = new mah1(iu30Var4, cor0Var2, (byte) 15);
                                x340Var3.s0(objT4);
                            } else {
                                objT4 = new mah1(iu30Var4, cor0Var2, (byte) 15);
                                x340Var3.s0(objT4);
                            }
                            boolean z7 = z2;
                            cpr0 cpr0Var5 = cpr0Var;
                            iu30Var5 = iu30Var4;
                            qim0 qim0Var10 = qim0Var5;
                            c0p1.f(str7, str9, qim0Var10, lee1Var4, j4, i, (Function0) objT4, x340Var3, (i8 << 3) & 524160);
                            qim0Var6 = qim0Var10;
                            x340Var3.r(false);
                            lee1Var6 = lee1Var4;
                            x340Var2 = x340Var3;
                            str3 = str8;
                            cpr0Var3 = cpr0Var5;
                            j6 = j4;
                            z4 = z7;
                        } else {
                            qim0Var6 = qim0Var5;
                            str2 = str;
                            z3 = z2;
                            cpr0Var2 = cpr0Var;
                            iu30Var5 = iu30Var4;
                            j5 = j4;
                            if (cor0Var instanceof dor0) {
                                ye5VarO = kk0.o(1949187850, x340Var3);
                                if (cpr0Var2 == null) {
                                    eg.m("NumberedParagraphStyle should not be null for numbered paragraphs");
                                    return;
                                }
                                iN = ye5VarO.n(cpr0Var2);
                                ye5VarO.g(((dor0) cor0Var).a);
                                ye5VarO.g(str2);
                                ye5VarO.g(((dor0) cor0Var).b);
                                ye5VarO.k(iN);
                                int i15 = i8 << 3;
                                x340 x340Var5 = x340Var3;
                                str3 = str2;
                                cpr0Var3 = cpr0Var2;
                                z4 = z3;
                                lee1 lee1Var8 = lee1Var4;
                                uwo1.d(ye5VarO.p(), j5, qim0Var6, lee1Var8, new a0e1(i), null, 0, false, null, 0, null, null, x340Var5, (i15 & 896) | ((i8 >> 6) & 112) | (i15 & 7168) | (i8 & 57344), 0, 4064);
                                j6 = j5;
                                lee1Var6 = lee1Var8;
                                x340Var2 = x340Var5;
                                x340Var2.r(false);
                            } else {
                                lee1Var6 = lee1Var4;
                                x340Var2 = x340Var3;
                                str3 = str2;
                                cpr0Var3 = cpr0Var2;
                                z4 = z3;
                                if (!(cor0Var instanceof lor0)) {
                                    throw p3d1.k(x340Var2, 755603206, false);
                                }
                                x340Var2.i0(1949836804);
                                uwo1.e(((lor0) cor0Var).a, qim0Var6, lee1Var6, j5, new a0e1(i), null, 0, false, null, 0, null, x340Var2, i8 & 65520, 0, 2016);
                                qim0Var6 = qim0Var6;
                                j6 = j5;
                                x340Var2.r(false);
                            }
                        }
                        str = str3;
                        x340Var3 = x340Var2;
                        j4 = j6;
                        lee1Var4 = lee1Var6;
                        qim0Var5 = qim0Var6;
                        iu30Var4 = iu30Var5;
                        cpr0Var = cpr0Var3;
                        z2 = z4;
                    }
                    iu30 iu30Var7 = iu30Var4;
                    long j8 = j4;
                    x340Var = x340Var3;
                    i10 = i;
                    x340Var.r(false);
                    x340Var.r(z2);
                    j3 = j8;
                    lee1Var3 = lee1Var4;
                    qim0Var3 = qim0Var5;
                    iu30Var3 = iu30Var7;
                } else {
                    x340Var = x340Var3;
                    x340Var.b0();
                    qim0Var3 = qim0Var2;
                    lee1Var3 = lee1Var2;
                    j3 = j2;
                    iu30Var3 = iu30Var2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new uvr0(c380Var, qim0Var3, lee1Var3, j3, i10, iu30Var3, i2, i3);
                }
            }
            i4 |= 196608;
            iu30Var2 = iu30Var;
            if ((74899 & i4) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var3.Y(i4 & 1, z)) {
                x340Var3.d0();
                i7 = i2 & 1;
                qim0Var4 = nim0.a;
                if (i7 != 0) {
                    if (i11 != 0) {
                        qim0Var2 = qim0Var4;
                    }
                    if ((i3 & 4) != 0) {
                        uwr uwrVar5 = cbx.a;
                        i4 &= -897;
                        lee1Var2 = cbx.d(x340Var3).g;
                    }
                    if ((i3 & 8) != 0) {
                        uwr uwrVar6 = cbx.a;
                        i4 &= -7169;
                        j2 = cbx.a(x340Var3).b.a;
                    }
                    if (i5 != 0) {
                        objT = x340Var3.T();
                        if (objT == obj) {
                            objT = nvi1.Z;
                            x340Var3.s0(objT);
                        }
                        i8 = i4;
                        iu30Var4 = (iu30) objT;
                    } else {
                        i8 = i4;
                        iu30Var4 = iu30Var2;
                    }
                } else {
                    if (i11 != 0) {
                        qim0Var2 = qim0Var4;
                    }
                    if ((i3 & 4) != 0) {
                        uwr uwrVar7 = cbx.a;
                        i4 &= -897;
                        lee1Var2 = cbx.d(x340Var3).g;
                    }
                    if ((i3 & 8) != 0) {
                        uwr uwrVar8 = cbx.a;
                        i4 &= -7169;
                        j2 = cbx.a(x340Var3).b.a;
                    }
                    if (i5 != 0) {
                        objT = x340Var3.T();
                        if (objT == obj) {
                            objT = nvi1.Z;
                            x340Var3.s0(objT);
                        }
                        i8 = i4;
                        iu30Var4 = (iu30) objT;
                    } else {
                        i8 = i4;
                        iu30Var4 = iu30Var2;
                    }
                }
                qim0 qim0Var11 = qim0Var2;
                lee1Var4 = lee1Var2;
                j4 = j2;
                x340Var3.s();
                it = c380Var.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((nor0) next) instanceof dor0));
                dor0Var = (nor0) next;
                str = " ";
                if (dor0Var == null) {
                    x340Var3.i0(676820905);
                    x340Var3.r(false);
                    th = null;
                    cpr0Var = null;
                } else {
                    x340Var3.i0(676820906);
                    strE = f4i1.e(dor0Var.a, " ");
                    lee1Var5 = (lee1) x340Var3.k(q9e1.a);
                    yae1VarQ = d5p1.q(0, x340Var3, 1);
                    zG = x340Var3.g(lee1Var5) | x340Var3.g(yae1VarQ);
                    th = null;
                    objT2 = x340Var3.T();
                    if (zG) {
                        objT2 = Integer.valueOf((int) (yae1.a(yae1VarQ, strE, lee1Var5, 0, false, 0, 0L, (flb0) null, (xat) null, 1020).c >> 32));
                        x340Var3.s0(objT2);
                    } else {
                        objT2 = Integer.valueOf((int) (yae1.a(yae1VarQ, strE, lee1Var5, 0, false, 0, 0L, (flb0) null, (xat) null, 1020).c >> 32));
                        x340Var3.s0(objT2);
                    }
                    cpr0Var = new cpr0(0, 0, 0L, new u8e1(1, 0L, ((wat) x340Var3.k(t4k.h)).I(((Number) objT2).intValue())), (edt0) null, 0, 0, 503);
                    x340Var3.r(false);
                }
                objT3 = x340Var3.T();
                if (objT3 == obj) {
                    objT3 = nvi1.N0;
                    x340Var3.s0(objT3);
                }
                z2 = true;
                qim0 qim0VarB3 = s161.b(qim0Var4, true, (iu30) objT3);
                uwr uwrVar9 = cbx.a;
                cvx cvxVar3 = cbx.b(x340Var3).b;
                mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), een.P0, x340Var3, 0);
                qim0Var5 = qim0Var11;
                iHashCode = Long.hashCode(x340Var3.T);
                xos0VarM = x340Var3.m();
                qim0VarE = zr7.E(x340Var3, qim0VarB3);
                hzj.A.getClass();
                if (x340Var3.a == null) {
                    tgp1.p();
                    throw th;
                }
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(hmb0.t1);
                } else {
                    x340Var3.v0();
                }
                nko1.H(mbhVarA, x340Var3, y580.O0);
                nko1.H(xos0VarM, x340Var3, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
                nko1.F(x340Var3);
                itN = kk0.n(x340Var3, qim0VarE, y580.Y, -82676075, c380Var);
                while (itN.hasNext()) {
                    cor0Var = (nor0) itN.next();
                    if (cor0Var instanceof cor0) {
                        x340Var3.i0(1948874223);
                        cor0Var2 = cor0Var;
                        String str10 = cor0Var2.a;
                        String str11 = str;
                        String str12 = cor0Var2.b;
                        if ((i8 & 458752) == 131072) {
                            z5 = z2;
                        } else {
                            z5 = false;
                        }
                        zI = x340Var3.i(cor0Var) | z5;
                        objT4 = x340Var3.T();
                        if (zI) {
                            objT4 = new mah1(iu30Var4, cor0Var2, (byte) 15);
                            x340Var3.s0(objT4);
                        } else {
                            objT4 = new mah1(iu30Var4, cor0Var2, (byte) 15);
                            x340Var3.s0(objT4);
                        }
                        boolean z8 = z2;
                        cpr0 cpr0Var6 = cpr0Var;
                        iu30Var5 = iu30Var4;
                        qim0 qim0Var12 = qim0Var5;
                        c0p1.f(str10, str12, qim0Var12, lee1Var4, j4, i, (Function0) objT4, x340Var3, (i8 << 3) & 524160);
                        qim0Var6 = qim0Var12;
                        x340Var3.r(false);
                        lee1Var6 = lee1Var4;
                        x340Var2 = x340Var3;
                        str3 = str11;
                        cpr0Var3 = cpr0Var6;
                        j6 = j4;
                        z4 = z8;
                    } else {
                        qim0Var6 = qim0Var5;
                        str2 = str;
                        z3 = z2;
                        cpr0Var2 = cpr0Var;
                        iu30Var5 = iu30Var4;
                        j5 = j4;
                        if (cor0Var instanceof dor0) {
                            ye5VarO = kk0.o(1949187850, x340Var3);
                            if (cpr0Var2 == null) {
                                eg.m("NumberedParagraphStyle should not be null for numbered paragraphs");
                                return;
                            }
                            iN = ye5VarO.n(cpr0Var2);
                            ye5VarO.g(((dor0) cor0Var).a);
                            ye5VarO.g(str2);
                            ye5VarO.g(((dor0) cor0Var).b);
                            ye5VarO.k(iN);
                            int i16 = i8 << 3;
                            x340 x340Var6 = x340Var3;
                            str3 = str2;
                            cpr0Var3 = cpr0Var2;
                            z4 = z3;
                            lee1 lee1Var9 = lee1Var4;
                            uwo1.d(ye5VarO.p(), j5, qim0Var6, lee1Var9, new a0e1(i), null, 0, false, null, 0, null, null, x340Var6, (i16 & 896) | ((i8 >> 6) & 112) | (i16 & 7168) | (i8 & 57344), 0, 4064);
                            j6 = j5;
                            lee1Var6 = lee1Var9;
                            x340Var2 = x340Var6;
                            x340Var2.r(false);
                        } else {
                            lee1Var6 = lee1Var4;
                            x340Var2 = x340Var3;
                            str3 = str2;
                            cpr0Var3 = cpr0Var2;
                            z4 = z3;
                            if (!(cor0Var instanceof lor0)) {
                                throw p3d1.k(x340Var2, 755603206, false);
                            }
                            x340Var2.i0(1949836804);
                            uwo1.e(((lor0) cor0Var).a, qim0Var6, lee1Var6, j5, new a0e1(i), null, 0, false, null, 0, null, x340Var2, i8 & 65520, 0, 2016);
                            qim0Var6 = qim0Var6;
                            j6 = j5;
                            x340Var2.r(false);
                        }
                    }
                    str = str3;
                    x340Var3 = x340Var2;
                    j4 = j6;
                    lee1Var4 = lee1Var6;
                    qim0Var5 = qim0Var6;
                    iu30Var4 = iu30Var5;
                    cpr0Var = cpr0Var3;
                    z2 = z4;
                }
                iu30 iu30Var8 = iu30Var4;
                long j9 = j4;
                x340Var = x340Var3;
                i10 = i;
                x340Var.r(false);
                x340Var.r(z2);
                j3 = j9;
                lee1Var3 = lee1Var4;
                qim0Var3 = qim0Var5;
                iu30Var3 = iu30Var8;
            } else {
                x340Var = x340Var3;
                x340Var.b0();
                qim0Var3 = qim0Var2;
                lee1Var3 = lee1Var2;
                j3 = j2;
                iu30Var3 = iu30Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new uvr0(c380Var, qim0Var3, lee1Var3, j3, i10, iu30Var3, i2, i3);
            }
        }
        i4 |= 48;
        qim0Var2 = qim0Var;
        if ((i2 & 384) == 0) {
            if ((i3 & 4) == 0) {
                lee1Var2 = lee1Var;
                if (x340Var3.i(lee1Var2)) {
                }
                i4 |= i12;
            } else {
                lee1Var2 = lee1Var;
            }
            i4 |= i12;
        } else {
            lee1Var2 = lee1Var;
        }
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                j2 = j;
                if (x340Var3.f(j2)) {
                }
                i4 |= i13;
            } else {
                j2 = j;
            }
            i4 |= i13;
        } else {
            j2 = j;
        }
        if ((i2 & 24576) == 0) {
            if (x340Var3.e(i10)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i4 |= i9;
        }
        i5 = i3 & 32;
        if (i5 != 0) {
            if ((196608 & i2) == 0) {
                iu30Var2 = iu30Var;
                if (x340Var3.i(iu30Var2)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i4 |= i6;
            }
            if ((74899 & i4) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var3.Y(i4 & 1, z)) {
                x340Var3.d0();
                i7 = i2 & 1;
                qim0Var4 = nim0.a;
                if (i7 != 0) {
                    if (i11 != 0) {
                        qim0Var2 = qim0Var4;
                    }
                    if ((i3 & 4) != 0) {
                        uwr uwrVar10 = cbx.a;
                        i4 &= -897;
                        lee1Var2 = cbx.d(x340Var3).g;
                    }
                    if ((i3 & 8) != 0) {
                        uwr uwrVar11 = cbx.a;
                        i4 &= -7169;
                        j2 = cbx.a(x340Var3).b.a;
                    }
                    if (i5 != 0) {
                        objT = x340Var3.T();
                        if (objT == obj) {
                            objT = nvi1.Z;
                            x340Var3.s0(objT);
                        }
                        i8 = i4;
                        iu30Var4 = (iu30) objT;
                    } else {
                        i8 = i4;
                        iu30Var4 = iu30Var2;
                    }
                } else {
                    if (i11 != 0) {
                        qim0Var2 = qim0Var4;
                    }
                    if ((i3 & 4) != 0) {
                        uwr uwrVar12 = cbx.a;
                        i4 &= -897;
                        lee1Var2 = cbx.d(x340Var3).g;
                    }
                    if ((i3 & 8) != 0) {
                        uwr uwrVar13 = cbx.a;
                        i4 &= -7169;
                        j2 = cbx.a(x340Var3).b.a;
                    }
                    if (i5 != 0) {
                        objT = x340Var3.T();
                        if (objT == obj) {
                            objT = nvi1.Z;
                            x340Var3.s0(objT);
                        }
                        i8 = i4;
                        iu30Var4 = (iu30) objT;
                    } else {
                        i8 = i4;
                        iu30Var4 = iu30Var2;
                    }
                }
                qim0 qim0Var13 = qim0Var2;
                lee1Var4 = lee1Var2;
                j4 = j2;
                x340Var3.s();
                it = c380Var.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((nor0) next) instanceof dor0));
                dor0Var = (nor0) next;
                str = " ";
                if (dor0Var == null) {
                    x340Var3.i0(676820905);
                    x340Var3.r(false);
                    th = null;
                    cpr0Var = null;
                } else {
                    x340Var3.i0(676820906);
                    strE = f4i1.e(dor0Var.a, " ");
                    lee1Var5 = (lee1) x340Var3.k(q9e1.a);
                    yae1VarQ = d5p1.q(0, x340Var3, 1);
                    zG = x340Var3.g(lee1Var5) | x340Var3.g(yae1VarQ);
                    th = null;
                    objT2 = x340Var3.T();
                    if (zG) {
                        objT2 = Integer.valueOf((int) (yae1.a(yae1VarQ, strE, lee1Var5, 0, false, 0, 0L, (flb0) null, (xat) null, 1020).c >> 32));
                        x340Var3.s0(objT2);
                    } else {
                        objT2 = Integer.valueOf((int) (yae1.a(yae1VarQ, strE, lee1Var5, 0, false, 0, 0L, (flb0) null, (xat) null, 1020).c >> 32));
                        x340Var3.s0(objT2);
                    }
                    cpr0Var = new cpr0(0, 0, 0L, new u8e1(1, 0L, ((wat) x340Var3.k(t4k.h)).I(((Number) objT2).intValue())), (edt0) null, 0, 0, 503);
                    x340Var3.r(false);
                }
                objT3 = x340Var3.T();
                if (objT3 == obj) {
                    objT3 = nvi1.N0;
                    x340Var3.s0(objT3);
                }
                z2 = true;
                qim0 qim0VarB4 = s161.b(qim0Var4, true, (iu30) objT3);
                uwr uwrVar14 = cbx.a;
                cvx cvxVar4 = cbx.b(x340Var3).b;
                mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), een.P0, x340Var3, 0);
                qim0Var5 = qim0Var13;
                iHashCode = Long.hashCode(x340Var3.T);
                xos0VarM = x340Var3.m();
                qim0VarE = zr7.E(x340Var3, qim0VarB4);
                hzj.A.getClass();
                if (x340Var3.a == null) {
                    tgp1.p();
                    throw th;
                }
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(hmb0.t1);
                } else {
                    x340Var3.v0();
                }
                nko1.H(mbhVarA, x340Var3, y580.O0);
                nko1.H(xos0VarM, x340Var3, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
                nko1.F(x340Var3);
                itN = kk0.n(x340Var3, qim0VarE, y580.Y, -82676075, c380Var);
                while (itN.hasNext()) {
                    cor0Var = (nor0) itN.next();
                    if (cor0Var instanceof cor0) {
                        x340Var3.i0(1948874223);
                        cor0Var2 = cor0Var;
                        String str13 = cor0Var2.a;
                        String str14 = str;
                        String str15 = cor0Var2.b;
                        if ((i8 & 458752) == 131072) {
                            z5 = z2;
                        } else {
                            z5 = false;
                        }
                        zI = x340Var3.i(cor0Var) | z5;
                        objT4 = x340Var3.T();
                        if (zI) {
                            objT4 = new mah1(iu30Var4, cor0Var2, (byte) 15);
                            x340Var3.s0(objT4);
                        } else {
                            objT4 = new mah1(iu30Var4, cor0Var2, (byte) 15);
                            x340Var3.s0(objT4);
                        }
                        boolean z9 = z2;
                        cpr0 cpr0Var7 = cpr0Var;
                        iu30Var5 = iu30Var4;
                        qim0 qim0Var14 = qim0Var5;
                        c0p1.f(str13, str15, qim0Var14, lee1Var4, j4, i, (Function0) objT4, x340Var3, (i8 << 3) & 524160);
                        qim0Var6 = qim0Var14;
                        x340Var3.r(false);
                        lee1Var6 = lee1Var4;
                        x340Var2 = x340Var3;
                        str3 = str14;
                        cpr0Var3 = cpr0Var7;
                        j6 = j4;
                        z4 = z9;
                    } else {
                        qim0Var6 = qim0Var5;
                        str2 = str;
                        z3 = z2;
                        cpr0Var2 = cpr0Var;
                        iu30Var5 = iu30Var4;
                        j5 = j4;
                        if (cor0Var instanceof dor0) {
                            ye5VarO = kk0.o(1949187850, x340Var3);
                            if (cpr0Var2 == null) {
                                eg.m("NumberedParagraphStyle should not be null for numbered paragraphs");
                                return;
                            }
                            iN = ye5VarO.n(cpr0Var2);
                            ye5VarO.g(((dor0) cor0Var).a);
                            ye5VarO.g(str2);
                            ye5VarO.g(((dor0) cor0Var).b);
                            ye5VarO.k(iN);
                            int i17 = i8 << 3;
                            x340 x340Var7 = x340Var3;
                            str3 = str2;
                            cpr0Var3 = cpr0Var2;
                            z4 = z3;
                            lee1 lee1Var10 = lee1Var4;
                            uwo1.d(ye5VarO.p(), j5, qim0Var6, lee1Var10, new a0e1(i), null, 0, false, null, 0, null, null, x340Var7, (i17 & 896) | ((i8 >> 6) & 112) | (i17 & 7168) | (i8 & 57344), 0, 4064);
                            j6 = j5;
                            lee1Var6 = lee1Var10;
                            x340Var2 = x340Var7;
                            x340Var2.r(false);
                        } else {
                            lee1Var6 = lee1Var4;
                            x340Var2 = x340Var3;
                            str3 = str2;
                            cpr0Var3 = cpr0Var2;
                            z4 = z3;
                            if (!(cor0Var instanceof lor0)) {
                                throw p3d1.k(x340Var2, 755603206, false);
                            }
                            x340Var2.i0(1949836804);
                            uwo1.e(((lor0) cor0Var).a, qim0Var6, lee1Var6, j5, new a0e1(i), null, 0, false, null, 0, null, x340Var2, i8 & 65520, 0, 2016);
                            qim0Var6 = qim0Var6;
                            j6 = j5;
                            x340Var2.r(false);
                        }
                    }
                    str = str3;
                    x340Var3 = x340Var2;
                    j4 = j6;
                    lee1Var4 = lee1Var6;
                    qim0Var5 = qim0Var6;
                    iu30Var4 = iu30Var5;
                    cpr0Var = cpr0Var3;
                    z2 = z4;
                }
                iu30 iu30Var9 = iu30Var4;
                long j10 = j4;
                x340Var = x340Var3;
                i10 = i;
                x340Var.r(false);
                x340Var.r(z2);
                j3 = j10;
                lee1Var3 = lee1Var4;
                qim0Var3 = qim0Var5;
                iu30Var3 = iu30Var9;
            } else {
                x340Var = x340Var3;
                x340Var.b0();
                qim0Var3 = qim0Var2;
                lee1Var3 = lee1Var2;
                j3 = j2;
                iu30Var3 = iu30Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new uvr0(c380Var, qim0Var3, lee1Var3, j3, i10, iu30Var3, i2, i3);
            }
        }
        i4 |= 196608;
        iu30Var2 = iu30Var;
        if ((74899 & i4) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var3.Y(i4 & 1, z)) {
            x340Var3.d0();
            i7 = i2 & 1;
            qim0Var4 = nim0.a;
            if (i7 != 0) {
                if (i11 != 0) {
                    qim0Var2 = qim0Var4;
                }
                if ((i3 & 4) != 0) {
                    uwr uwrVar15 = cbx.a;
                    i4 &= -897;
                    lee1Var2 = cbx.d(x340Var3).g;
                }
                if ((i3 & 8) != 0) {
                    uwr uwrVar16 = cbx.a;
                    i4 &= -7169;
                    j2 = cbx.a(x340Var3).b.a;
                }
                if (i5 != 0) {
                    objT = x340Var3.T();
                    if (objT == obj) {
                        objT = nvi1.Z;
                        x340Var3.s0(objT);
                    }
                    i8 = i4;
                    iu30Var4 = (iu30) objT;
                } else {
                    i8 = i4;
                    iu30Var4 = iu30Var2;
                }
            } else {
                if (i11 != 0) {
                    qim0Var2 = qim0Var4;
                }
                if ((i3 & 4) != 0) {
                    uwr uwrVar17 = cbx.a;
                    i4 &= -897;
                    lee1Var2 = cbx.d(x340Var3).g;
                }
                if ((i3 & 8) != 0) {
                    uwr uwrVar18 = cbx.a;
                    i4 &= -7169;
                    j2 = cbx.a(x340Var3).b.a;
                }
                if (i5 != 0) {
                    objT = x340Var3.T();
                    if (objT == obj) {
                        objT = nvi1.Z;
                        x340Var3.s0(objT);
                    }
                    i8 = i4;
                    iu30Var4 = (iu30) objT;
                } else {
                    i8 = i4;
                    iu30Var4 = iu30Var2;
                }
            }
            qim0 qim0Var15 = qim0Var2;
            lee1Var4 = lee1Var2;
            j4 = j2;
            x340Var3.s();
            it = c380Var.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((nor0) next) instanceof dor0));
            dor0Var = (nor0) next;
            str = " ";
            if (dor0Var == null) {
                x340Var3.i0(676820905);
                x340Var3.r(false);
                th = null;
                cpr0Var = null;
            } else {
                x340Var3.i0(676820906);
                strE = f4i1.e(dor0Var.a, " ");
                lee1Var5 = (lee1) x340Var3.k(q9e1.a);
                yae1VarQ = d5p1.q(0, x340Var3, 1);
                zG = x340Var3.g(lee1Var5) | x340Var3.g(yae1VarQ);
                th = null;
                objT2 = x340Var3.T();
                if (zG) {
                    objT2 = Integer.valueOf((int) (yae1.a(yae1VarQ, strE, lee1Var5, 0, false, 0, 0L, (flb0) null, (xat) null, 1020).c >> 32));
                    x340Var3.s0(objT2);
                } else {
                    objT2 = Integer.valueOf((int) (yae1.a(yae1VarQ, strE, lee1Var5, 0, false, 0, 0L, (flb0) null, (xat) null, 1020).c >> 32));
                    x340Var3.s0(objT2);
                }
                cpr0Var = new cpr0(0, 0, 0L, new u8e1(1, 0L, ((wat) x340Var3.k(t4k.h)).I(((Number) objT2).intValue())), (edt0) null, 0, 0, 503);
                x340Var3.r(false);
            }
            objT3 = x340Var3.T();
            if (objT3 == obj) {
                objT3 = nvi1.N0;
                x340Var3.s0(objT3);
            }
            z2 = true;
            qim0 qim0VarB5 = s161.b(qim0Var4, true, (iu30) objT3);
            uwr uwrVar19 = cbx.a;
            cvx cvxVar5 = cbx.b(x340Var3).b;
            mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), een.P0, x340Var3, 0);
            qim0Var5 = qim0Var15;
            iHashCode = Long.hashCode(x340Var3.T);
            xos0VarM = x340Var3.m();
            qim0VarE = zr7.E(x340Var3, qim0VarB5);
            hzj.A.getClass();
            if (x340Var3.a == null) {
                tgp1.p();
                throw th;
            }
            x340Var3.m0();
            if (x340Var3.S) {
                x340Var3.l(hmb0.t1);
            } else {
                x340Var3.v0();
            }
            nko1.H(mbhVarA, x340Var3, y580.O0);
            nko1.H(xos0VarM, x340Var3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
            nko1.F(x340Var3);
            itN = kk0.n(x340Var3, qim0VarE, y580.Y, -82676075, c380Var);
            while (itN.hasNext()) {
                cor0Var = (nor0) itN.next();
                if (cor0Var instanceof cor0) {
                    x340Var3.i0(1948874223);
                    cor0Var2 = cor0Var;
                    String str16 = cor0Var2.a;
                    String str17 = str;
                    String str18 = cor0Var2.b;
                    if ((i8 & 458752) == 131072) {
                        z5 = z2;
                    } else {
                        z5 = false;
                    }
                    zI = x340Var3.i(cor0Var) | z5;
                    objT4 = x340Var3.T();
                    if (zI) {
                        objT4 = new mah1(iu30Var4, cor0Var2, (byte) 15);
                        x340Var3.s0(objT4);
                    } else {
                        objT4 = new mah1(iu30Var4, cor0Var2, (byte) 15);
                        x340Var3.s0(objT4);
                    }
                    boolean z10 = z2;
                    cpr0 cpr0Var8 = cpr0Var;
                    iu30Var5 = iu30Var4;
                    qim0 qim0Var16 = qim0Var5;
                    c0p1.f(str16, str18, qim0Var16, lee1Var4, j4, i, (Function0) objT4, x340Var3, (i8 << 3) & 524160);
                    qim0Var6 = qim0Var16;
                    x340Var3.r(false);
                    lee1Var6 = lee1Var4;
                    x340Var2 = x340Var3;
                    str3 = str17;
                    cpr0Var3 = cpr0Var8;
                    j6 = j4;
                    z4 = z10;
                } else {
                    qim0Var6 = qim0Var5;
                    str2 = str;
                    z3 = z2;
                    cpr0Var2 = cpr0Var;
                    iu30Var5 = iu30Var4;
                    j5 = j4;
                    if (cor0Var instanceof dor0) {
                        ye5VarO = kk0.o(1949187850, x340Var3);
                        if (cpr0Var2 == null) {
                            eg.m("NumberedParagraphStyle should not be null for numbered paragraphs");
                            return;
                        }
                        iN = ye5VarO.n(cpr0Var2);
                        ye5VarO.g(((dor0) cor0Var).a);
                        ye5VarO.g(str2);
                        ye5VarO.g(((dor0) cor0Var).b);
                        ye5VarO.k(iN);
                        int i18 = i8 << 3;
                        x340 x340Var8 = x340Var3;
                        str3 = str2;
                        cpr0Var3 = cpr0Var2;
                        z4 = z3;
                        lee1 lee1Var11 = lee1Var4;
                        uwo1.d(ye5VarO.p(), j5, qim0Var6, lee1Var11, new a0e1(i), null, 0, false, null, 0, null, null, x340Var8, (i18 & 896) | ((i8 >> 6) & 112) | (i18 & 7168) | (i8 & 57344), 0, 4064);
                        j6 = j5;
                        lee1Var6 = lee1Var11;
                        x340Var2 = x340Var8;
                        x340Var2.r(false);
                    } else {
                        lee1Var6 = lee1Var4;
                        x340Var2 = x340Var3;
                        str3 = str2;
                        cpr0Var3 = cpr0Var2;
                        z4 = z3;
                        if (!(cor0Var instanceof lor0)) {
                            throw p3d1.k(x340Var2, 755603206, false);
                        }
                        x340Var2.i0(1949836804);
                        uwo1.e(((lor0) cor0Var).a, qim0Var6, lee1Var6, j5, new a0e1(i), null, 0, false, null, 0, null, x340Var2, i8 & 65520, 0, 2016);
                        qim0Var6 = qim0Var6;
                        j6 = j5;
                        x340Var2.r(false);
                    }
                }
                str = str3;
                x340Var3 = x340Var2;
                j4 = j6;
                lee1Var4 = lee1Var6;
                qim0Var5 = qim0Var6;
                iu30Var4 = iu30Var5;
                cpr0Var = cpr0Var3;
                z2 = z4;
            }
            iu30 iu30Var10 = iu30Var4;
            long j11 = j4;
            x340Var = x340Var3;
            i10 = i;
            x340Var.r(false);
            x340Var.r(z2);
            j3 = j11;
            lee1Var3 = lee1Var4;
            qim0Var3 = qim0Var5;
            iu30Var3 = iu30Var10;
        } else {
            x340Var = x340Var3;
            x340Var.b0();
            qim0Var3 = qim0Var2;
            lee1Var3 = lee1Var2;
            j3 = j2;
            iu30Var3 = iu30Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uvr0(c380Var, qim0Var3, lee1Var3, j3, i10, iu30Var3, i2, i3);
        }
    }

    public static boolean j(jyc jycVar) {
        if (!ecc.d.contains(jycVar.getName())) {
            return false;
        }
        if (o7h.i0(ecc.c, kht.c(jycVar)) && jycVar.F().isEmpty()) {
            return true;
        }
        if (!g6b0.A(jycVar)) {
            return false;
        }
        Collection<jyc> collectionL = jycVar.l();
        if (collectionL.isEmpty()) {
            return false;
        }
        for (jyc jycVar2 : collectionL) {
            jycVar2.getClass();
            if (j(jycVar2)) {
                return true;
            }
        }
        return false;
    }

    public static void k(m2b1 m2b1Var, jgu jguVar) {
        ((pzo) m2b1Var).a = jguVar;
    }

    public static final go80 l(klm klmVar, wbp0 wbp0Var) {
        return klmVar.a("MediaRouterXDaemon", new nbp0(wbp0Var, (byte) 21));
    }

    public static ii5 m(izr0 izr0Var) {
        String str;
        int iQ = izr0Var.q();
        if (izr0Var.q() != 1684108385) {
            oon1.H("Failed to parse cover art attribute");
            return null;
        }
        int iQ2 = izr0Var.q();
        byte[] bArr = e2c.a;
        int i = iQ2 & 16777215;
        if (i == 13) {
            str = "image/jpeg";
        } else {
            str = i == 14 ? "image/png" : null;
        }
        if (str == null) {
            td6.p(i, "Unrecognized cover art flags: ");
            return null;
        }
        izr0Var.S(4);
        int i2 = iQ - 16;
        byte[] bArr2 = new byte[i2];
        izr0Var.o(0, bArr2, i2);
        return new ii5(3, str, (String) null, bArr2);
    }

    public static v8e1 n(int i, String str, izr0 izr0Var) {
        int iQ = izr0Var.q();
        if (izr0Var.q() == 1684108385 && iQ >= 22) {
            izr0Var.S(10);
            int iL = izr0Var.L();
            if (iL > 0) {
                String strC = f4i1.c(iL, "");
                int iL2 = izr0Var.L();
                if (iL2 > 0) {
                    strC = l1d.k(iL2, strC, "/");
                }
                return new v8e1(str, (String) null, b380.t(strC));
            }
        }
        oon1.H("Failed to parse index/count attribute: ".concat(dn90.d(i)));
        return null;
    }

    public static int o(izr0 izr0Var) {
        int iQ = izr0Var.q();
        if (izr0Var.q() == 1684108385) {
            izr0Var.S(8);
            int i = iQ - 16;
            if (i == 1) {
                return izr0Var.E();
            }
            if (i == 2) {
                return izr0Var.L();
            }
            if (i == 3) {
                return izr0Var.H();
            }
            if (i == 4 && (izr0Var.n() & 128) == 0) {
                return izr0Var.I();
            }
        }
        oon1.H("Failed to parse data atom to int");
        return -1;
    }

    public static am70 p(int i, String str, izr0 izr0Var, boolean z, boolean z2) {
        int iO = o(izr0Var);
        if (z2) {
            iO = Math.min(1, iO);
        }
        if (iO >= 0) {
            return z ? new v8e1(str, (String) null, b380.t(Integer.toString(iO))) : new igh("und", str, Integer.toString(iO));
        }
        oon1.H("Failed to parse uint8 attribute: ".concat(dn90.d(i)));
        return null;
    }

    public static v8e1 q(int i, String str, izr0 izr0Var) {
        int iQ = izr0Var.q();
        if (izr0Var.q() == 1684108385) {
            izr0Var.S(8);
            return new v8e1(str, (String) null, b380.t(izr0Var.A(iQ - 16)));
        }
        oon1.H("Failed to parse text attribute: ".concat(dn90.d(i)));
        return null;
    }

    public static final void r(HlsMediaSource.Factory factory, o5n o5nVar, String str, int i, bnh0 bnh0Var) {
        factory.g = new b8p1(o5nVar, str, i, bnh0Var, (byte) 21);
    }

    public static void s(int i, hjj0 hjj0Var, ge30 ge30Var, hjj0 hjj0Var2, hjj0... hjj0VarArr) {
        if (hjj0Var2 == null) {
            hjj0Var2 = new hjj0(new rij0[0]);
        }
        if (hjj0Var != null) {
            w280 w280VarR = hjj0Var.c(yeh0.class).r(0);
            while (w280VarR.hasNext()) {
                rij0 rij0Var = (yeh0) w280VarR.next();
                if (!((yeh0) rij0Var).a.equals("com.android.capture.fps") || i == 2) {
                    hjj0Var2 = hjj0Var2.a(new rij0[]{rij0Var});
                }
            }
        }
        for (hjj0 hjj0Var3 : hjj0VarArr) {
            hjj0Var2 = hjj0Var2.b(hjj0Var3);
        }
        if (hjj0Var2.a.length > 0) {
            ge30Var.l = hjj0Var2;
        }
    }

    public static final void t(TextView textView, j4b1 j4b1Var) {
        Context context = textView.getContext();
        g4b1 g4b1Var = new g4b1(context, j4b1Var, context.getResources().getDimension(2131167135));
        g4b1Var.b(context.getColor(2131104462));
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) g4b1Var, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public static void u(String str, ByteBuffer byteBuffer) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            byteBuffer.put((byte) str.charAt(i));
        }
        byteBuffer.put((byte) 0);
    }
}
