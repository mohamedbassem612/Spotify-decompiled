package p;

import android.graphics.Color;
import androidx.compose.ui.geometry.Offset;
import com.spotify.player.esperanto.proto.EsPlayOrigin;
import com.spotify.player.model.PlayerState;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class w3p1 {
    public static b180 a;
    public static b180 b;

    public static final void a(Function0 function0, j2i j2iVar, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(843110148);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            s1q0 s1q0VarA = vfe0.a(x340Var);
            r1q0 r1q0VarJ = s1q0VarA != null ? s1q0VarA.J() : null;
            Object[] objArr = new Object[0];
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = cu9.b;
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) k5p1.s(objArr, (Function0) objT, x340Var, 48);
            boolean z = !((Boolean) ven0Var.getValue()).booleanValue();
            boolean zI = ((i2 & 14) == 4) | x340Var.i(ven0Var);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new cb(function0, ven0Var, (byte) 3);
                x340Var.s0(objT2);
            }
            q3p1.b(0, 0, (Function0) objT2, x340Var, z);
            j2iVar.invoke(x340Var, 6);
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                x340Var.i0(126199465);
                boolean zI2 = x340Var.i(ven0Var) | x340Var.i(r1q0VarJ);
                Object objT3 = x340Var.T();
                if (zI2 || objT3 == m4cVar) {
                    objT3 = new z77(r1q0VarJ, ven0Var, (byte) 19);
                    x340Var.s0(objT3);
                }
                Function0 function1 = (Function0) objT3;
                boolean zI3 = x340Var.i(ven0Var);
                Object objT4 = x340Var.T();
                if (zI3 || objT4 == m4cVar) {
                    objT4 = new bp9(ven0Var, (byte) 1);
                    x340Var.s0(objT4);
                }
                rwq.b(function1, (Function0) objT4, x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(126373406);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bu9(function0, j2iVar, i, (byte) 0);
        }
    }

    public static final void b(e5h e5hVar, y0q0 y0q0Var, Function0 function0, Function0 function1, Function0 function2, vu30 vu30Var, d0r d0rVar, ycm ycmVar, l6q l6qVar, me30 me30Var, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        Function0 function3;
        Function0 function4;
        Function0 function5;
        ycm ycmVar2;
        b0k b0kVar2;
        qim0 qim0Var2;
        String str = e5hVar.a;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(2108833571);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(e5hVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(y0q0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function3 = function0;
            i2 |= b0kVar3.i(function3) ? 256 : 128;
        } else {
            function3 = function0;
        }
        if ((i & 3072) == 0) {
            function4 = function1;
            i2 |= b0kVar3.i(function4) ? 2048 : 1024;
        } else {
            function4 = function1;
        }
        if ((i & 24576) == 0) {
            function5 = function2;
            i2 |= b0kVar3.i(function5) ? 16384 : 8192;
        } else {
            function5 = function2;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar3.i(vu30Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= b0kVar3.i(d0rVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            ycmVar2 = ycmVar;
            i2 |= b0kVar3.i(ycmVar2) ? 8388608 : 4194304;
        } else {
            ycmVar2 = ycmVar;
        }
        if ((i & 100663296) == 0) {
            i2 |= (i & 134217728) == 0 ? b0kVar3.g(l6qVar) : b0kVar3.i(l6qVar) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= b0kVar3.i(me30Var) ? 536870912 : 268435456;
        }
        if (b0kVar3.Y(i2 & 1, ((306783379 & i2) == 306783378 && (((b0kVar3.h(z) ? (char) 4 : (char) 2) | '0') & 19) == 18) ? false : true)) {
            cr31 cr31VarB = er31.b(dsa0.m(b0kVar3, 2131166074));
            Object objT = b0kVar3.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = new j260();
                b0kVar3.s0(objT);
            }
            j260 j260Var = (j260) objT;
            boolean zG = b0kVar3.g(str) | b0kVar3.g(d0rVar);
            Object objT2 = b0kVar3.T();
            if (zG || objT2 == obj) {
                objT2 = new j5h(d0rVar, str, me30Var);
                b0kVar3.s0(objT2);
            }
            b0kVar2 = b0kVar3;
            mod.b(o5h.a.a(j260Var), apo.r(1878422499, new bdg1(cr31VarB, function3, j260Var, e5hVar, function4, function5, vu30Var, l6qVar, d0rVar, (j5h) objT2, y0q0Var, z, ycmVar2), b0kVar2), b0kVar2, 56);
            qim0Var2 = nim0.a;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new hs9(e5hVar, y0q0Var, function0, function1, function2, vu30Var, d0rVar, ycmVar, l6qVar, me30Var, z, qim0Var2, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:46:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:50:0x009f  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:63:0x010e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0112  */
    /* JADX WARN: Code duplicated, block: B:66:0x0137  */
    /* JADX WARN: Code duplicated, block: B:68:0x0147  */
    /* JADX WARN: Code duplicated, block: B:70:0x014b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0155  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    public static final void c(boolean z, qim0 qim0Var, boolean z2, j2i j2iVar, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        boolean z3;
        qim0 qim0Var3;
        h311 h311VarV;
        qim0 qim0Var4;
        qim0 qim0VarK;
        gfh0 gfh0VarC;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z4;
        n4k n4kVar;
        llj lljVar;
        llj lljVar2;
        llj lljVar3;
        llj lljVar4;
        boolean z5;
        boolean z6;
        int i4;
        int i5;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(420517444);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i3 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                qim0Var2 = qim0Var;
                i3 |= x340Var.i(qim0Var2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if (x340Var.h(z2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                if (x340Var.i(j2iVar)) {
                    i4 = 2048;
                } else {
                    i4 = 1024;
                }
                i3 |= i4;
            }
            if ((i3 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i3 & 1, z3)) {
                qim0Var4 = nim0.a;
                if (i6 != 0) {
                    qim0Var3 = qim0Var4;
                } else {
                    qim0Var3 = qim0Var2;
                }
                if (z2) {
                    qim0VarK = qim0Var3;
                } else {
                    qim0VarK = d9y0.k(qim0Var3, 0.3f);
                }
                gfh0VarC = t1c.c(een.d, false);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarK);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                z4 = x340Var.S;
                n4kVar = hmb0.t1;
                if (z4) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                lljVar = y580.O0;
                nko1.H(gfh0VarC, x340Var, lljVar);
                lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var, lljVar3);
                nko1.F(x340Var);
                lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var, lljVar4);
                if (z || !z2) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                vby0.a(384, apo.r(1770719828, new ak10(j2iVar, (byte) 14), x340Var), x340Var, (qim0) null, z5);
                if (z5) {
                    x340Var.i0(1561002926);
                    qim0 qim0VarB = h2c.a.b(qim0Var4);
                    gfh0 gfh0VarC2 = t1c.c(een.h, false);
                    int iHashCode2 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM2 = x340Var.m();
                    qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var, lljVar);
                    nko1.H(xos0VarM2, x340Var, lljVar2);
                    x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE2, x340Var, lljVar4);
                    lap1.b(null, 0, 0L, nwi.a, x340Var, 3072, 7);
                    z6 = true;
                    x340Var.r(true);
                    x340Var.r(false);
                } else {
                    z6 = true;
                    x340Var.i0(1561147076);
                    x340Var.r(false);
                }
                x340Var.r(z6);
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ibh(z, qim0Var3, z2, j2iVar, i, i2);
            }
        }
        i3 |= 48;
        qim0Var2 = qim0Var;
        if ((i & 384) == 0) {
            if (x340Var.h(z2)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i & 3072) == 0) {
            if (x340Var.i(j2iVar)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i3 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (x340Var.Y(i3 & 1, z3)) {
            qim0Var4 = nim0.a;
            if (i6 != 0) {
                qim0Var3 = qim0Var4;
            } else {
                qim0Var3 = qim0Var2;
            }
            if (z2) {
                qim0VarK = qim0Var3;
            } else {
                qim0VarK = d9y0.k(qim0Var3, 0.3f);
            }
            gfh0VarC = t1c.c(een.d, false);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarK);
            hzj.A.getClass();
            if (j06Var != null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            z4 = x340Var.S;
            n4kVar = hmb0.t1;
            if (z4) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar);
            lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            lljVar3 = y580.R0;
            nko1.H(numValueOf2, x340Var, lljVar3);
            nko1.F(x340Var);
            lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            if (z) {
                z5 = false;
            } else {
                z5 = false;
            }
            vby0.a(384, apo.r(1770719828, new ak10(j2iVar, (byte) 14), x340Var), x340Var, (qim0) null, z5);
            if (z5) {
                x340Var.i0(1561002926);
                qim0 qim0VarB2 = h2c.a.b(qim0Var4);
                gfh0 gfh0VarC3 = t1c.c(een.h, false);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0VarB2);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC3, x340Var, lljVar);
                nko1.H(xos0VarM3, x340Var, lljVar2);
                x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE3, x340Var, lljVar4);
                lap1.b(null, 0, 0L, nwi.a, x340Var, 3072, 7);
                z6 = true;
                x340Var.r(true);
                x340Var.r(false);
            } else {
                z6 = true;
                x340Var.i0(1561147076);
                x340Var.r(false);
            }
            x340Var.r(z6);
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ibh(z, qim0Var3, z2, j2iVar, i, i2);
        }
    }

    public static final void d(kly0 kly0Var, o0i o0iVar, s3t0 s3t0Var, boolean z, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(533945717);
        int i2 = i | (x340Var.i(kly0Var) ? 4 : 2) | (x340Var.i(o0iVar) ? 32 : 16) | (x340Var.g(s3t0Var) ? 256 : 128) | (x340Var.h(z) ? 2048 : 1024) | (x340Var.i(iu30Var) ? 16384 : 8192) | (x340Var.g(qim0Var) ? 131072 : 65536);
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = (v3t0) kly0Var.get();
                x340Var.s0(objT);
            }
            v3t0 v3t0Var = (v3t0) objT;
            String str = s3t0Var.b;
            String str2 = s3t0Var.e.a;
            String str3 = s3t0Var.f;
            cr31 cr31VarB = er31.b(12.0f);
            dq70 dq70Var = s3t0Var.k;
            String str4 = dq70Var != null ? dq70Var.a : null;
            int i3 = i2 & 896;
            boolean z2 = (i3 == 256) | ((i2 & 57344) == 16384);
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new vx70(iu30Var, s3t0Var, (byte) 1);
                x340Var.s0(objT2);
            }
            Function0 function0 = (Function0) objT2;
            boolean zI = ((i2 & 7168) == 2048) | x340Var.i(v3t0Var) | (i3 == 256);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new wq01(z, v3t0Var, s3t0Var, (byte) 9);
                x340Var.s0(objT3);
            }
            xto.f(str, str2, str3, function0, qim0Var, cr31VarB, str4, null, false, null, null, (iu30) objT3, null, x340Var, (i2 >> 3) & 57344, 6016);
            boolean zI2 = x340Var.i(v3t0Var);
            Object objT4 = x340Var.T();
            if (zI2 || objT4 == m4cVar) {
                objT4 = new xaj1(v3t0Var, (byte) 18);
                x340Var.s0(objT4);
            }
            oto1.c(s3t0Var, o0iVar, (iu30) objT4, x340Var, ((i2 >> 6) & 14) | 64 | (i2 & 112));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j2g1((byte) 2, i, kly0Var, o0iVar, s3t0Var, iu30Var, qim0Var, z);
        }
    }

    public static final long e(ggg1 ggg1Var, r7e1 r7e1Var, aae1 aae1Var, long j) {
        long j2;
        long jN = r7e1Var.n();
        if ((9223372034707292159L & jN) != 9205357640488583168L && ggg1Var.h().d.length() != 0) {
            long j3 = ggg1Var.h().e;
            qr50 qr50VarL = r7e1Var.l();
            int i = qr50VarL == null ? -1 : f6e1.a[qr50VarL.ordinal()];
            if (i != -1) {
                if (i == 1 || i == 2) {
                    int i2 = nbe1.c;
                    j2 = j3 >> 32;
                } else {
                    if (i != 3) {
                        eg.o();
                        return 0L;
                    }
                    int i3 = nbe1.c;
                    j2 = j3 & 4294967295L;
                }
                int i4 = (int) j2;
                y9e1 y9e1VarC = aae1Var.c();
                if (y9e1VarC != null) {
                    zrm0 zrm0Var = y9e1VarC.b;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jN >> 32));
                    int iD = zrm0Var.d(i4);
                    float fG = y9e1VarC.g(iD);
                    float fH = y9e1VarC.h(iD);
                    float fO = yoi1.o(fIntBitsToFloat, Math.min(fG, fH), Math.max(fG, fH));
                    if (yr80.b(j, 0L) || Math.abs(fIntBitsToFloat - fO) <= ((int) (j >> 32)) / 2) {
                        float f = zrm0Var.f(iD);
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(((zrm0Var.b(iD) - f) / 2.0f) + f)) & 4294967295L) | (((long) Float.floatToRawIntBits(fO)) << 32);
                        elb0 elb0VarE = aae1Var.e();
                        Offset offset = null;
                        if (elb0VarE != null) {
                            if (!elb0VarE.a()) {
                                elb0VarE = null;
                            }
                            if (elb0VarE != null) {
                                jFloatToRawIntBits = z4p1.s(jFloatToRawIntBits, ljo1.u(elb0VarE));
                            }
                        }
                        elb0 elb0VarE2 = aae1Var.e();
                        if (elb0VarE2 == null) {
                            return jFloatToRawIntBits;
                        }
                        if (!elb0VarE2.a()) {
                            elb0VarE2 = null;
                        }
                        if (elb0VarE2 == null) {
                            return jFloatToRawIntBits;
                        }
                        elb0 elb0Var = (elb0) aae1Var.e.getValue();
                        if (elb0Var != null) {
                            if (!elb0Var.a()) {
                                elb0Var = null;
                            }
                            if (elb0Var != null) {
                                offset = new Offset(elb0Var.K(elb0VarE2, jFloatToRawIntBits));
                            }
                        }
                        return offset != null ? offset.a : jFloatToRawIntBits;
                    }
                }
            }
        }
        return 9205357640488583168L;
    }

    public static final o3r f(l4r l4rVar, l4r l4rVar2, l4r l4rVar3, l4r l4rVar4, l4r l4rVar5, l4r l4rVar6, l4r l4rVar7, l4r l4rVar8, l4r l4rVar9, l4r l4rVar10, l4r l4rVar11, ju30 ju30Var) {
        return new o3r(p7h.M(new l4r[]{l4rVar, l4rVar2, l4rVar3, l4rVar4, l4rVar5, l4rVar6, l4rVar7, l4rVar8, l4rVar9, l4rVar10, l4rVar11}), new v3r(ju30Var, l4rVar, l4rVar2, l4rVar3, l4rVar4, l4rVar5, l4rVar6, l4rVar7, l4rVar8, l4rVar9, l4rVar10, l4rVar11, (byte) 0), false);
    }

    public static final o3r g(l4r l4rVar, l4r l4rVar2, l4r l4rVar3, l4r l4rVar4, l4r l4rVar5, l4r l4rVar6, l4r l4rVar7, l4r l4rVar8, l4r l4rVar9, gv30 gv30Var) {
        return new o3r(p7h.M(new l4r[]{l4rVar, l4rVar2, l4rVar3, l4rVar4, l4rVar5, l4rVar6, l4rVar7, l4rVar8, l4rVar9}), new x3r(l4rVar, l4rVar2, l4rVar3, l4rVar4, l4rVar5, l4rVar6, l4rVar7, l4rVar8, l4rVar9, gv30Var), false);
    }

    public static final o3r h(l4r l4rVar, l4r l4rVar2, l4r l4rVar3, l4r l4rVar4, l4r l4rVar5, l4r l4rVar6, l4r l4rVar7, l4r l4rVar8, fv30 fv30Var) {
        return new o3r(p7h.M(new l4r[]{l4rVar, l4rVar2, l4rVar3, l4rVar4, l4rVar5, l4rVar6, l4rVar7, l4rVar8}), new vd6(fv30Var, l4rVar, l4rVar2, l4rVar3, l4rVar4, l4rVar5, l4rVar6, l4rVar7, l4rVar8, (byte) 3), false);
    }

    public static final o3r i(l4r l4rVar, l4r l4rVar2, l4r l4rVar3, l4r l4rVar4, l4r l4rVar5, l4r l4rVar6, l4r l4rVar7, ev30 ev30Var) {
        return new o3r(p7h.M(new l4r[]{l4rVar, l4rVar2, l4rVar3, l4rVar4, l4rVar5, l4rVar6, l4rVar7}), new qi1(ev30Var, l4rVar, l4rVar2, l4rVar3, l4rVar4, l4rVar5, l4rVar6, l4rVar7, (byte) 3), false);
    }

    public static final o3r j(l4r l4rVar, l4r l4rVar2, l4r l4rVar3, l4r l4rVar4, l4r l4rVar5, l4r l4rVar6, dv30 dv30Var) {
        return new o3r(p7h.M(new l4r[]{l4rVar, l4rVar2, l4rVar3, l4rVar4, l4rVar5, l4rVar6}), new z1(dv30Var, l4rVar, l4rVar2, l4rVar3, l4rVar4, l4rVar5, l4rVar6, (byte) 5), false);
    }

    public static final o3r k(l4r l4rVar, l4r l4rVar2, l4r l4rVar3, l4r l4rVar4, l4r l4rVar5, bv30 bv30Var) {
        return new o3r(p7h.M(new l4r[]{l4rVar, l4rVar2, l4rVar3, l4rVar4, l4rVar5}), new j96(bv30Var, l4rVar, l4rVar2, l4rVar3, l4rVar4, l4rVar5, (byte) 8), false);
    }

    public static final o3r l(l4r l4rVar, l4r l4rVar2, l4r l4rVar3, l4r l4rVar4, zu30 zu30Var) {
        return new o3r(p7h.M(new l4r[]{l4rVar, l4rVar2, l4rVar3, l4rVar4}), new uh0(zu30Var, l4rVar, l4rVar2, l4rVar3, l4rVar4, (byte) 19), false);
    }

    public static final o3r m(l4r l4rVar, l4r l4rVar2, l4r l4rVar3, xu30 xu30Var) {
        return new o3r(p7h.M(new l4r[]{l4rVar, l4rVar2, l4rVar3}), new ggh(xu30Var, l4rVar, l4rVar2, l4rVar3, (byte) 16), false);
    }

    public static final o3r n(l4r l4rVar, l4r l4rVar2, vu30 vu30Var) {
        return new o3r(p7h.M(new l4r[]{l4rVar, l4rVar2}), new m3n(vu30Var, l4rVar, l4rVar2, (byte) 6), false);
    }

    public static final o3r o(l4r l4rVar, iu30 iu30Var) {
        return new o3r(Collections.singletonList(l4rVar), new d(iu30Var, l4rVar, (byte) 4), false);
    }

    public static js20 p(mr20 mr20Var, iu30 iu30Var, vu30 vu30Var, o8n o8nVar, iu30 iu30Var2, int i) {
        if ((i & 8) != 0) {
            o8nVar = igu.b;
        }
        o8n o8nVar2 = o8nVar;
        if ((i & 16) != 0) {
            iu30Var2 = ll20.Z0;
        }
        qtr qtrVar = new qtr();
        iu30Var2.invoke(qtrVar);
        return new js20(new hdo(mr20Var, (byte) 1), iu30Var, vu30Var, qtrVar, false, o8nVar2, false);
    }

    public static js20 q(iu30 iu30Var, iu30 iu30Var2, vu30 vu30Var, o8n o8nVar, iu30 iu30Var3, int i) {
        if ((i & 8) != 0) {
            o8nVar = igu.b;
        }
        if ((i & 16) != 0) {
            iu30Var3 = a9o.Q0;
        }
        return a4p1.h(iu30Var, iu30Var2, vu30Var, o8nVar, iu30Var3);
    }

    public static final yyr r(ufx ufxVar, zu30 zu30Var) {
        return new yyr(ufxVar.a, ufxVar.b, zu30Var);
    }

    public static final j380 s(Map map, Class cls, iu30 iu30Var) {
        if (map == null || map.isEmpty()) {
            return gg11.g;
        }
        if (map instanceof j380) {
            j380 j380Var = (j380) map;
            Collection collectionValues = j380Var.values();
            if (collectionValues == null || !collectionValues.isEmpty()) {
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    if (!it.next().getClass().equals(cls)) {
                    }
                }
            }
            return j380Var;
        }
        h380 h380VarA = j380.a();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object objInvoke = iu30Var.invoke(entry.getValue());
            if (objInvoke != null) {
                h380VarA.e(key, objInvoke);
            }
        }
        return h380VarA.b(true);
    }

    public static final on3 t(tr3 tr3Var, fp3 fp3Var) {
        v8k1 t8k1Var;
        boolean z;
        boolean z2;
        boolean z3;
        sxc0 sxc0Var = tr3Var.b;
        aey aeyVar = fp3Var.d;
        bzu0 bzu0VarC = oxu0.a.c(fp3Var.a);
        bzu0 bzu0Var = bzu0VarC instanceof bzu0 ? bzu0VarC : null;
        String str = fp3Var.a;
        tv80 tv80Var = fp3Var.b;
        if (bzu0Var != null) {
            boolean zO = h4p1.o(tr3Var, aeyVar);
            bqq0 bqq0Var = sxc0Var.a;
            bqq0 bqq0Var2 = sxc0Var.a;
            List list = bqq0Var.d;
            if ((list instanceof Collection) && list.isEmpty()) {
                z = false;
            } else {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        d6c0 d6c0Var = (d6c0) it.next();
                        if ((d6c0Var instanceof i5c0) || (d6c0Var instanceof a5c0)) {
                            z = true;
                        }
                    } else {
                        z = false;
                    }
                }
            }
            List list2 = bqq0Var2.d;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                z2 = false;
            } else {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        d6c0 d6c0Var2 = (d6c0) it2.next();
                        if ((d6c0Var2 instanceof h5c0) || (d6c0Var2 instanceof z4c0)) {
                            z2 = true;
                        }
                    } else {
                        z2 = false;
                    }
                }
            }
            List list3 = bqq0Var2.d;
            if ((list3 instanceof Collection) && list3.isEmpty()) {
                z3 = false;
            } else {
                Iterator it3 = list3.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        d6c0 d6c0Var3 = (d6c0) it3.next();
                        if ((d6c0Var3 instanceof w5c0) || (d6c0Var3 instanceof d5c0)) {
                            z3 = true;
                        }
                    } else {
                        z3 = false;
                    }
                }
            }
            t8k1Var = new v8k1(str, tv80Var, zO, z, z2, z3);
        } else {
            t8k1Var = new t8k1(str, fp3Var.c, tv80Var, h4p1.o(tr3Var, aeyVar));
        }
        return new on3(t8k1Var);
    }

    public static final Integer u(PlayerState playerState, String str) {
        String str2 = (String) playerState.contextMetadata().get(str);
        if (str2 == null) {
            return null;
        }
        try {
            return Integer.valueOf(Color.parseColor(str2));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static final int v(long j, yqg yqgVar) {
        ZoneOffset zoneOffset = ZoneOffset.UTC;
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(yqgVar.b()), zoneOffset);
        LocalDateTime localDateTimeOfInstant2 = LocalDateTime.ofInstant(Instant.ofEpochMilli(j), zoneOffset);
        if (localDateTimeOfInstant2.isAfter(localDateTimeOfInstant.plusWeeks(2L))) {
            return 5;
        }
        if (localDateTimeOfInstant2.isAfter(localDateTimeOfInstant.plusHours(24L))) {
            return 4;
        }
        if (localDateTimeOfInstant2.isAfter(localDateTimeOfInstant)) {
            return 3;
        }
        if (localDateTimeOfInstant2.isAfter(localDateTimeOfInstant.minusDays(7L))) {
            return 2;
        }
        return localDateTimeOfInstant2.isAfter(localDateTimeOfInstant.minusMonths(6L)) ? 1 : 0;
    }

    public static final y0q0 w(String str, String str2, String str3, zwp zwpVar, b0d0 b0d0Var, d0r d0rVar, ruz ruzVar, iac0 iac0Var, String str4, p6r0 p6r0Var, b0k b0kVar, int i) {
        boolean z = (((i & 14) ^ 6) > 4 && ((x340) b0kVar).g(str)) || (i & 6) == 4;
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        if (z || objT == fkj0.X) {
            huz huzVar = new huz(w7x.a, (byte) 10);
            huz huzVar2 = new huz((Object) null, (byte) 10);
            zpz zpzVarY = EsPlayOrigin.PlayOrigin.y();
            zpzVarY.w(nik1.w6.a);
            zpzVarY.s(p6r0Var.d);
            zpzVarY.u(str4);
            EsPlayOrigin.PlayOrigin playOriginBuild = zpzVarY.build();
            huz huzVar3 = new huz(b7x.a, (byte) 10);
            xkg0 xkg0Var = new xkg0();
            xkg0Var.put("agentic_product_type", "martini");
            if (!ihc1.y0(str2)) {
                xkg0Var.put("martini_conversation_id", str2);
            }
            if (!ihc1.y0(str3)) {
                xkg0Var.put("play_context_decision_id", str3);
            }
            objT = zwpVar.a(d0rVar, new ult0(b0d0Var.b(str, huzVar, iac0Var, ruzVar, huzVar2, playOriginBuild, huzVar3, new huz(xkg0Var.b(), (byte) 10))));
            x340Var.s0(objT);
        }
        return (y0q0) objT;
    }

    public static final aey x(tr3 tr3Var, aey aeyVar, String str) {
        Object obj;
        aey aeyVar2;
        if (aeyVar == aey.N0) {
            Object objA = tr3Var.c.a(xy3.a);
            sy3 sy3Var = null;
            uy3 uy3Var = objA instanceof uy3 ? (uy3) objA : null;
            if (uy3Var != null) {
                ArrayList arrayList = uy3Var.a;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        obj = null;
                        break;
                    }
                    obj = arrayList.get(i);
                    if (u890.j(((ttm1) obj).a, str)) {
                        break;
                    }
                    i++;
                }
                ttm1 ttm1Var = (ttm1) obj;
                if (ttm1Var != null) {
                    if (u890.j(ttm1.i.get(ttm1Var.e), sy3.class)) {
                        nb10 nb10Var = ttm1Var.g;
                        if (nb10Var == null) {
                            bhn0.i("null cannot be cast to non-null type com.spotify.yourlibrary.yourlibraryx.shared.domain.AlsoAvailableOfflineExtraInfo");
                            return null;
                        }
                        sy3Var = (sy3) nb10Var;
                    }
                    if (sy3Var != null && (aeyVar2 = sy3Var.a) != null) {
                        return aeyVar2;
                    }
                }
            }
        }
        return aeyVar;
    }

    public static final int y(azb azbVar, azb azbVar2, boolean z) {
        if (azbVar2 instanceof xyb) {
            return 1;
        }
        if (!(azbVar2 instanceof ryb) || z) {
            return azbVar.equals(azbVar2) ? 2 : 3;
        }
        return 1;
    }
}
