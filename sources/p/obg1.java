package p;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import com.google.protobuf.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class obg1 {
    public static final jpa0 a = new jpa0(new rtw0((byte) 15), (byte) 0);
    public static b180 b;

    public static final void a(final Function0 function0, final qim0 qim0Var, final t6p1 t6p1Var, final hw61 hw61Var, final jkr jkrVar, final vzq0 vzq0Var, final j2i j2iVar, b0k b0kVar, final int i) {
        b0k b0kVar2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1084573925);
        int i2 = i | (b0kVar3.i(function0) ? 4 : 2) | (b0kVar3.g(qim0Var) ? 32 : 16) | (b0kVar3.h(true) ? 256 : 128) | (b0kVar3.g((Object) null) ? 2048 : 1024) | (b0kVar3.g(t6p1Var) ? 16384 : 8192) | (b0kVar3.g(hw61Var) ? 131072 : 65536) | (b0kVar3.g((Object) null) ? 1048576 : 524288) | (b0kVar3.g(jkrVar) ? 8388608 : 4194304) | (b0kVar3.g(vzq0Var) ? 67108864 : 33554432);
        if (b0kVar3.Y(i2 & 1, (306783379 & i2) != 306783378)) {
            b0kVar3.d0();
            if ((i & 1) != 0 && !b0kVar3.E()) {
                b0kVar3.b0();
            }
            b0kVar3.s();
            b0kVar3.i0(497721888);
            Object objT = b0kVar3.T();
            if (objT == m4cVar) {
                objT = ktd.n(b0kVar3);
            }
            idn0 idn0Var = (idn0) objT;
            b0kVar3.r(false);
            int i3 = i2 >> 6;
            b0kVar3.i0(-2133647540);
            ven0 ven0VarS = v8r.s(new u7h(jkrVar.b), b0kVar3);
            b0kVar3.r(false);
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = new u1c((byte) 2);
                b0kVar3.s0(objT2);
            }
            qim0 qim0VarB = s161.b(qim0Var, false, (iu30) objT2);
            b0kVar3.i0(-655254499);
            ven0 ven0VarS2 = v8r.s(new u7h(jkrVar.a), b0kVar3);
            b0kVar3.r(false);
            long j = ((u7h) ven0VarS2.getValue()).a;
            long jB = u7h.b(((u7h) ven0VarS.getValue()).a, 1.0f, 0.0f, 0.0f, 0.0f, 14);
            b0kVar3.i0(498128545);
            b0kVar3.r(false);
            b0kVar2 = b0kVar3;
            puo1.j(function0, qim0VarB, hw61Var, j, jB, 0.0f, idn0Var, apo.r(-20345758, new qg(ven0VarS, vzq0Var, j2iVar, (byte) 2), b0kVar3), b0kVar2, (i2 & 14) | 805306368 | (i2 & 896) | (i3 & 7168) | (i2 & 3670016));
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30(function0, qim0Var, t6p1Var, hw61Var, jkrVar, vzq0Var, j2iVar, i) { // from class: p.dfc
                public final /* synthetic */ Function0 a;
                public final /* synthetic */ qim0 b;
                public final /* synthetic */ hw61 c;
                public final /* synthetic */ jkr d;
                public final /* synthetic */ vzq0 e;
                public final /* synthetic */ j2i f;

                {
                    this.c = hw61Var;
                    this.d = jkrVar;
                    this.e = vzq0Var;
                    this.f = j2iVar;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = czo1.p(805306369);
                    obg1.a(this.a, this.b, null, this.c, this.d, this.e, this.f, (b0k) obj, iP);
                    return rih1.a;
                }
            };
        }
    }

    public static final void b(vca0 vca0Var, Function0 function0, Function0 function1, Function0 function2, b0k b0kVar, int i) {
        int i2;
        Function0 function3 = function2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-446887701);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(vca0Var) : x340Var.i(vca0Var) ? 4 : 2) | i;
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
            i2 |= x340Var.i(function3) ? 2048 : 1024;
        }
        int i3 = i & 24576;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.i(nim0Var) ? 16384 : 8192;
        }
        int i4 = i2;
        if (x340Var.Y(i4 & 1, (i4 & 9363) != 9362)) {
            qim0 qim0VarH = l6o1.H(u291.f(nim0Var, 1.0f), l6o1.C(0, 0, 1, x340Var), false, 14);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var).g, 32, qim0VarH);
            era eraVar = een.Q0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarP);
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
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(2.0f, 0.0f, 2, qim0VarF);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarZ);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            mue1.j(mqo1.A(vca0Var.g), (qim0) null, false, (Function0) null, x340Var, 8, 14);
            mue1.f(mqo1.A(vca0Var.d), vca0Var.a, vca0Var.e, (qim0) null, x340Var, 8);
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 16.0f));
            c(vca0Var, x340Var, (i4 & 14) | 8);
            op71.g(x340Var, u291.h(nim0Var, cbx.b(x340Var).b.b));
            mue1.g(vca0Var.e, function0, function1, x340Var, i4 & 1008);
            x340Var.r(true);
            cvx cvxVar3 = cbx.b(x340Var).b;
            function3 = function2;
            g(function3, x340Var, (i4 >> 6) & 112);
            x0d.s(nim0Var, ywx0.k(nim0Var, cbx.b(x340Var).b.c, x340Var, x340Var).b.a, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nca0(vca0Var, function0, function1, function3, i);
        }
    }

    public static final void c(vca0 vca0Var, b0k b0kVar, int i) {
        int i2;
        String strN0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1647878659);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(vca0Var) : x340Var.i(vca0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            boolean z = vca0Var.f;
            String str = vca0Var.b;
            if (z) {
                x340Var.i0(477027883);
                if (vca0Var.e) {
                    x340Var.i0(477065114);
                    strN0 = cwl1.n0(2131956969, new Object[]{str}, x340Var);
                    x340Var.r(false);
                } else {
                    x340Var.i0(477170886);
                    strN0 = cwl1.n0(2131956968, new Object[]{str}, x340Var);
                    x340Var.r(false);
                }
                x340Var.r(false);
            } else {
                x340Var.i0(477271512);
                strN0 = cwl1.n0(2131956966, new Object[]{vca0Var.a}, x340Var);
                x340Var.r(false);
            }
            mue1.d(vca0Var.c, strN0, (qim0) null, x340Var, 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ug50(vca0Var, i, (byte) 5);
        }
    }

    public static final void d(int i, b0k b0kVar, qim0 qim0Var, boolean z) {
        List listM;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(58557962);
        int i2 = (x340Var.i(qim0Var) ? 32 : 16) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            if (z) {
                x340Var.i0(743741822);
                uwr uwrVar = cbx.a;
                listM = p7h.M(new u7h[]{new u7h(cbx.a(x340Var).d.b), new u7h(u7h.b(cbx.a(x340Var).d.b, 0.0f, 0.0f, 0.0f, 0.0f, 14))});
                x340Var.r(false);
            } else {
                x340Var.i0(743932286);
                uwr uwrVar2 = cbx.a;
                listM = p7h.M(new u7h[]{new u7h(u7h.b(cbx.a(x340Var).d.b, 0.0f, 0.0f, 0.0f, 0.0f, 14)), new u7h(cbx.a(x340Var).d.b)});
                x340Var.r(false);
            }
            t1c.a(dug.e(qim0Var, v9c.s(listM, 0.0f, 0.0f, 14), (hw61) null, 0.0f, 6), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uc0(z, qim0Var, i, (byte) 13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:103:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:104:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:108:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:111:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:112:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:115:0x021a  */
    /* JADX WARN: Code duplicated, block: B:116:0x021f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0235  */
    /* JADX WARN: Code duplicated, block: B:121:0x0257  */
    /* JADX WARN: Code duplicated, block: B:124:0x026b  */
    /* JADX WARN: Code duplicated, block: B:125:0x026d  */
    /* JADX WARN: Code duplicated, block: B:131:0x027a  */
    /* JADX WARN: Code duplicated, block: B:134:0x028e  */
    /* JADX WARN: Code duplicated, block: B:135:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:137:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:139:0x02db  */
    /* JADX WARN: Code duplicated, block: B:142:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0091  */
    /* JADX WARN: Code duplicated, block: B:51:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x009e  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:91:0x015b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0160  */
    /* JADX WARN: Code duplicated, block: B:95:0x0181  */
    /* JADX WARN: Code duplicated, block: B:97:0x018a  */
    /* JADX WARN: Code duplicated, block: B:98:0x018e  */
    public static final void e(boolean z, String str, qim0 qim0Var, float f, boolean z2, String str2, j2i j2iVar, Function0 function0, b0k b0kVar, int i, int i2) {
        int i3;
        boolean z3;
        boolean z4;
        String str3;
        x340 x340Var;
        float f2;
        boolean z5;
        h311 h311VarV;
        float f3;
        boolean z6;
        int i4;
        mic0 mic0VarT;
        qim0 qim0VarH;
        gra graVar;
        gfh0 gfh0VarC;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z7;
        n4k n4kVar;
        llj lljVar;
        llj lljVar2;
        llj lljVar3;
        llj lljVar4;
        nim0 nim0Var;
        float f4;
        h2c h2cVar;
        boolean z8;
        jdx jdxVar;
        boolean z9;
        Object objT;
        Function0 function1;
        boolean z10;
        Object objT2;
        qim0 qim0VarA;
        Object objT3;
        int i5;
        int i6;
        int i7;
        Function0 function2 = function0;
        gra graVar2 = een.X;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(408565975);
        j06 j06Var = x340Var2.a;
        if ((i & 6) == 0) {
            i3 = (x340Var2.h(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var2.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var2.i(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ((i2 & 8) == 0 && x340Var2.d(f)) ? 2048 : 1024;
        }
        int i8 = i2 & 16;
        if (i8 == 0) {
            if ((i & 24576) == 0) {
                z3 = z2;
                i3 |= x340Var2.h(z3) ? 16384 : 8192;
            }
            if ((i & 196608) == 0) {
                if (x340Var2.g(str2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((i & 1572864) == 0) {
                if (x340Var2.i(j2iVar)) {
                    i6 = 1048576;
                } else {
                    i6 = 524288;
                }
                i3 |= i6;
            }
            if ((i & 12582912) == 0) {
                if (x340Var2.i(function2)) {
                    i5 = 8388608;
                } else {
                    i5 = 4194304;
                }
                i3 |= i5;
            }
            if ((i3 & 4793491) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (x340Var2.Y(i3 & 1, z4)) {
                x340Var2.d0();
                if ((i & 1) != 0 || x340Var2.E()) {
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        f3 = 96.0f;
                    } else {
                        f3 = f;
                    }
                    if (i8 != 0) {
                        z3 = false;
                    }
                } else {
                    x340Var2.b0();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    f3 = f;
                }
                z6 = z3;
                x340Var2.s();
                mmr0 mmr0Var = new mmr0(Float.valueOf(0.0f), new u7h(u7h.j));
                Float fValueOf = Float.valueOf(0.75f);
                uwr uwrVar = cbx.a;
                i4 = i3;
                mic0VarT = v9c.t((mmr0[]) Arrays.copyOf(new mmr0[]{mmr0Var, new mmr0(fValueOf, new u7h(cbx.a(x340Var2).a.c)), new mmr0(Float.valueOf(1.0f), new u7h(cbx.a(x340Var2).a.c))}, 3), 0.0f, 0.0f, 14);
                if (z) {
                    qim0VarH = u291.h(qim0Var, f3);
                } else {
                    qim0VarH = qim0Var;
                }
                graVar = een.d;
                gfh0VarC = t1c.c(graVar, false);
                iHashCode = Long.hashCode(x340Var2.T);
                xos0VarM = x340Var2.m();
                qim0VarE = zr7.E(x340Var2, qim0VarH);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                z7 = x340Var2.S;
                n4kVar = hmb0.t1;
                if (z7) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                lljVar = y580.O0;
                nko1.H(gfh0VarC, x340Var2, lljVar);
                lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var2, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var2, lljVar3);
                nko1.F(x340Var2);
                lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var2, lljVar4);
                nim0Var = nim0.a;
                f4 = f3;
                h2cVar = h2c.a;
                if (z) {
                    x340Var2.i0(1938007827);
                    if ((i4 & 458752) == 131072) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objT2 = x340Var2.T();
                    if (z10 || objT2 == m4cVar) {
                        objT2 = new ry40(str2, (byte) 4);
                        x340Var2.s0(objT2);
                    }
                    qim0 qim0VarA2 = s161.a(nim0Var, (iu30) objT2);
                    gfh0 gfh0VarC2 = t1c.c(graVar, false);
                    int iHashCode2 = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM2 = x340Var2.m();
                    qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarA2);
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var2, lljVar);
                    nko1.H(xos0VarM2, x340Var2, lljVar2);
                    x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                    nko1.H(qim0VarE2, x340Var2, lljVar4);
                    j2iVar.invoke(x340Var2, Integer.valueOf((i4 >> 18) & 14));
                    if (z6) {
                        qim0VarA = h2cVar.b(nim0Var);
                    } else {
                        qim0VarA = h2cVar.a(u291.f(u291.h(nim0Var, 64.0f), 1.0f), graVar2);
                    }
                    objT3 = x340Var2.T();
                    if (objT3 == m4cVar) {
                        objT3 = mia.m;
                        x340Var2.s0(objT3);
                    }
                    z8 = false;
                    t1c.a(dug.e(f8d1.b(qim0VarA, rih1.a, (PointerInputEventHandler) objT3), mic0VarT, (hw61) null, 0.0f, 6), x340Var2, 0);
                    x340Var2.r(true);
                    x340Var2.r(false);
                } else {
                    z8 = false;
                    x340Var2.i0(1938424901);
                    x340Var2.r(false);
                }
                jdxVar = jdx.c;
                if ((i4 & 29360128) == 8388608) {
                    z9 = true;
                } else {
                    z9 = z8;
                }
                objT = x340Var2.T();
                if (!z9 || objT == m4cVar) {
                    function2 = function0;
                    objT = new zg20(function2, (byte) 21);
                    x340Var2.s0(objT);
                } else {
                    function2 = function0;
                }
                function1 = (Function0) objT;
                if (!ihc1.y0(str)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                str3 = str;
                foo1.c(new gbx(new y50(str3), function1), jdxVar, h2cVar.a(nim0Var, graVar2), (max) null, yla.s(x340Var2), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-1063057380, new dz40(str3, (byte) 1), x340Var2), x340Var2, 0, 48, 2008);
                x340Var = x340Var2;
                x340Var.r(true);
                z5 = z6;
                f2 = f4;
            } else {
                str3 = str;
                x340Var = x340Var2;
                x340Var.b0();
                f2 = f;
                z5 = z3;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new c750(z, str3, qim0Var, f2, z5, str2, j2iVar, function2, i, i2);
            }
        }
        i3 |= 24576;
        z3 = z2;
        if ((i & 196608) == 0) {
            if (x340Var2.g(str2)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i3 |= i7;
        }
        if ((i & 1572864) == 0) {
            if (x340Var2.i(j2iVar)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i3 |= i6;
        }
        if ((i & 12582912) == 0) {
            if (x340Var2.i(function2)) {
                i5 = 8388608;
            } else {
                i5 = 4194304;
            }
            i3 |= i5;
        }
        if ((i3 & 4793491) != 4793490) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (x340Var2.Y(i3 & 1, z4)) {
            x340Var2.d0();
            if ((i & 1) != 0) {
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    f3 = 96.0f;
                } else {
                    f3 = f;
                }
                if (i8 != 0) {
                    z3 = false;
                }
            } else {
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    f3 = 96.0f;
                } else {
                    f3 = f;
                }
                if (i8 != 0) {
                    z3 = false;
                }
            }
            z6 = z3;
            x340Var2.s();
            mmr0 mmr0Var2 = new mmr0(Float.valueOf(0.0f), new u7h(u7h.j));
            Float fValueOf2 = Float.valueOf(0.75f);
            uwr uwrVar2 = cbx.a;
            i4 = i3;
            mic0VarT = v9c.t((mmr0[]) Arrays.copyOf(new mmr0[]{mmr0Var2, new mmr0(fValueOf2, new u7h(cbx.a(x340Var2).a.c)), new mmr0(Float.valueOf(1.0f), new u7h(cbx.a(x340Var2).a.c))}, 3), 0.0f, 0.0f, 14);
            if (z) {
                qim0VarH = u291.h(qim0Var, f3);
            } else {
                qim0VarH = qim0Var;
            }
            graVar = een.d;
            gfh0VarC = t1c.c(graVar, false);
            iHashCode = Long.hashCode(x340Var2.T);
            xos0VarM = x340Var2.m();
            qim0VarE = zr7.E(x340Var2, qim0VarH);
            hzj.A.getClass();
            if (j06Var != null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            z7 = x340Var2.S;
            n4kVar = hmb0.t1;
            if (z7) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var2, lljVar);
            lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            lljVar3 = y580.R0;
            nko1.H(numValueOf2, x340Var2, lljVar3);
            nko1.F(x340Var2);
            lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            nim0Var = nim0.a;
            f4 = f3;
            h2cVar = h2c.a;
            if (z) {
                x340Var2.i0(1938007827);
                if ((i4 & 458752) == 131072) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objT2 = x340Var2.T();
                if (z10) {
                    objT2 = new ry40(str2, (byte) 4);
                    x340Var2.s0(objT2);
                } else {
                    objT2 = new ry40(str2, (byte) 4);
                    x340Var2.s0(objT2);
                }
                qim0 qim0VarA3 = s161.a(nim0Var, (iu30) objT2);
                gfh0 gfh0VarC3 = t1c.c(graVar, false);
                int iHashCode3 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM3 = x340Var2.m();
                qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarA3);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(gfh0VarC3, x340Var2, lljVar);
                nko1.H(xos0VarM3, x340Var2, lljVar2);
                x0d.q(iHashCode3, x340Var2, lljVar3, x340Var2);
                nko1.H(qim0VarE3, x340Var2, lljVar4);
                j2iVar.invoke(x340Var2, Integer.valueOf((i4 >> 18) & 14));
                if (z6) {
                    qim0VarA = h2cVar.b(nim0Var);
                } else {
                    qim0VarA = h2cVar.a(u291.f(u291.h(nim0Var, 64.0f), 1.0f), graVar2);
                }
                objT3 = x340Var2.T();
                if (objT3 == m4cVar) {
                    objT3 = mia.m;
                    x340Var2.s0(objT3);
                }
                z8 = false;
                t1c.a(dug.e(f8d1.b(qim0VarA, rih1.a, (PointerInputEventHandler) objT3), mic0VarT, (hw61) null, 0.0f, 6), x340Var2, 0);
                x340Var2.r(true);
                x340Var2.r(false);
            } else {
                z8 = false;
                x340Var2.i0(1938424901);
                x340Var2.r(false);
            }
            jdxVar = jdx.c;
            if ((i4 & 29360128) == 8388608) {
                z9 = true;
            } else {
                z9 = z8;
            }
            objT = x340Var2.T();
            if (z9) {
                function2 = function0;
                objT = new zg20(function2, (byte) 21);
                x340Var2.s0(objT);
            } else {
                function2 = function0;
                objT = new zg20(function2, (byte) 21);
                x340Var2.s0(objT);
            }
            function1 = (Function0) objT;
            if (!ihc1.y0(str)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            str3 = str;
            foo1.c(new gbx(new y50(str3), function1), jdxVar, h2cVar.a(nim0Var, graVar2), (max) null, yla.s(x340Var2), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-1063057380, new dz40(str3, (byte) 1), x340Var2), x340Var2, 0, 48, 2008);
            x340Var = x340Var2;
            x340Var.r(true);
            z5 = z6;
            f2 = f4;
        } else {
            str3 = str;
            x340Var = x340Var2;
            x340Var.b0();
            f2 = f;
            z5 = z3;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c750(z, str3, qim0Var, f2, z5, str2, j2iVar, function2, i, i2);
        }
    }

    public static final void f(Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1186268037);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new aba0(function0, (byte) 2);
                x340Var.s0(objT);
            }
            qim0 qim0VarX = bin.x(qim0VarF, false, (String) null, (pm31) null, (idn0) null, (Function0) objT, 15);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(0.0f, 16.0f, 1, qim0VarX);
            jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var, 0);
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
            uwo1.e(cwl1.o0(x340Var, 2131956955), (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
            w0h1.a(plx.c, isl.a, (qim0) null, cbx.a(x340Var).b.b, 0L, false, x340Var, plx.d | 48, 52);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wk1((byte) 11, i, function0, false);
        }
    }

    public static final void g(Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1963773666);
        if ((i & 6) == 0) {
            i2 = (x340Var.d(16.0f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, u291.f(nim0Var, 1.0f));
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            t1c.a(dug.f(u291.h(ab80.o(nim0Var, 16.0f, x340Var, nim0Var, 1.0f), 1.0f), cbx.a(x340Var).d.b, d4o1.a), x340Var, 0);
            f(function0, x340Var, (i2 >> 3) & 14);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wk1((byte) 12, i, function0, false);
        }
    }

    public static final void h(yfn0 yfn0Var, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        max haxVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(419698274);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(yfn0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= x340Var.i(function0) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            qim0Var2 = nim0.a;
            qim0 qim0VarN = anm1.N("MuteButton", qim0Var2);
            gbx gbxVar = new gbx(z50.c, function0);
            ldx ldxVar = ldx.c;
            if (yfn0Var.c) {
                x340Var.i0(581838394);
                x340Var.r(false);
                haxVar = jax.a;
            } else {
                x340Var.i0(581884925);
                haxVar = new hax(cwl1.o0(x340Var, 2131959070));
                x340Var.r(false);
            }
            wro1.h(gbxVar, ldxVar, qim0VarN, haxVar, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, apo.r(579918955, new fhk0(yfn0Var), x340Var), x340Var, 0, 6, 1000);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jmk0(yfn0Var, qim0Var2, function0, i, (byte) 3);
        }
    }

    public static final void i(kvq0 kvq0Var, qim0 qim0Var, Function0 function0, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        boolean z;
        m4c m4cVar = fkj0.X;
        Bundle bundle = kvq0Var.b;
        Class cls = kvq0Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1215423137);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(kvq0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            qim0Var2 = qim0Var;
            i2 |= x340Var.g(qim0Var2) ? 32 : 16;
        } else {
            qim0Var2 = qim0Var;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            x340Var.f0(-209462622, x340Var.K(cls, bundle));
            boolean zG = x340Var.g(cls) | x340Var.g(bundle);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q((Object) null);
                x340Var.s0(objT2);
            }
            ven0 ven0Var2 = (ven0) objT2;
            boolean zG2 = ((i2 & 896) == 256) | x340Var.g(ven0Var);
            Object objT3 = x340Var.T();
            if (zG2 || objT3 == m4cVar) {
                objT3 = new uk90(function0, ven0Var, null, (byte) 1);
                x340Var.s0(objT3);
            }
            qxd0.s(cls, bundle, (vu30) objT3, x340Var);
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                x340Var.i0(2096940109);
                xar0 xar0Var = (xar0) x340Var.k(abr0.a);
                bbr0 bbr0Var = (bbr0) ven0Var2.getValue();
                boolean zI = x340Var.i(xar0Var);
                Object objT4 = x340Var.T();
                if (zI || objT4 == m4cVar) {
                    objT4 = new ozp0(ven0Var2, xar0Var, (byte) 12);
                    x340Var.s0(objT4);
                }
                qxd0.i(bbr0Var, (iu30) objT4, x340Var);
                Class cls2 = kvq0Var.a;
                Bundle bundle2 = kvq0Var.b;
                boolean z2 = (i2 & 7168) == 2048;
                Object objT5 = x340Var.T();
                if (z2 || objT5 == m4cVar) {
                    objT5 = new gp0(iu30Var, ven0Var2, (byte) 29);
                    x340Var.s0(objT5);
                }
                z = false;
                m5n1.a(cls2, qim0Var2, (pi30) null, bundle2, (w8c0) null, (iu30) objT5, x340Var, i2 & 112, 20);
                x340Var.r(false);
            } else {
                z = false;
                x340Var.i0(2097482113);
                x340Var.r(false);
            }
            x340Var.r(z);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new etg0(kvq0Var, qim0Var, function0, iu30Var, i, (byte) 22);
        }
    }

    public static final void j(long j, long j2, long j3, double d, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3;
        int i3;
        long j4;
        qim0 qim0Var2 = qim0Var;
        m4c m4cVar = fkj0.X;
        b0k b0kVar4 = (x340) b0kVar;
        b0kVar4.k0(-2098403187);
        if ((i & 6) == 0) {
            i2 = (b0kVar4.f(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar4.f(j2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar4.f(j3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar4.c(d) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar4.h(z) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= b0kVar4.i(qim0Var2) ? 131072 : 65536;
        }
        if (b0kVar4.Y(i2 & 1, (i2 & 74899) != 74898)) {
            yqg yqgVar = (yqg) b0kVar4.k(cde0.a);
            int i4 = i2 & 14;
            int i5 = i2 & 896;
            boolean z2 = (i5 == 256) | (i4 == 4);
            Object objT = b0kVar4.T();
            if (z2 || objT == m4cVar) {
                long jMin = Math.min(j + ((long) ((yqgVar.b() - j3) * d)), j2);
                if (jMin < 0) {
                    jMin = 0;
                }
                objT = p3d1.m(jMin, b0kVar4);
            }
            frr0 frr0Var = (frr0) objT;
            Object[] objArr = {Long.valueOf(j), Long.valueOf(j3), Double.valueOf(d), Boolean.valueOf(z)};
            boolean zI = (i5 == 256) | (i4 == 4) | ((57344 & i2) == 16384) | b0kVar4.i(frr0Var) | ((i2 & 112) == 32) | ((i2 & 7168) == 2048) | b0kVar4.g(yqgVar);
            Object objT2 = b0kVar4.T();
            if (zI || objT2 == m4cVar) {
                b0kVar3 = b0kVar4;
                i3 = 2;
                yfx0 yfx0Var = new yfx0(z, frr0Var, j, j2, j3, d, yqgVar, null);
                j4 = j2;
                b0kVar3.s0(yfx0Var);
                objT2 = yfx0Var;
            } else {
                b0kVar3 = b0kVar4;
                i3 = 2;
                j4 = j2;
            }
            qxd0.u(objArr, (vu30) objT2, b0kVar3);
            float fO = j4 > 0 ? yoi1.o(frr0Var.s() / j4, 0.0f, 1.0f) : 0.0f;
            long jS = j4 - frr0Var.s();
            int i6 = (int) ((jS >= 0 ? jS : 0L) / 1000);
            String strN = ab80.n("- ", ":", i6 / 60, ihc1.F0(i3, String.valueOf(i6 % 60)));
            jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0Var2 = qim0Var;
            qim0 qim0VarE = zr7.E(b0kVar3, qim0Var2);
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
            nko1.H(jw31VarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            boolean zD = b0kVar3.d(fO);
            Object objT3 = b0kVar3.T();
            if (zD || objT3 == m4cVar) {
                objT3 = new xnn((byte) 5, fO);
                b0kVar3.s0(objT3);
            }
            wnb0 wnb0Var = new wnb0(1.0f, true);
            long j5 = u7h.f;
            b0kVar2 = b0kVar3;
            rhx0.c((Function0) objT3, wnb0Var, j5, u7h.b(j5, 0.3f, 0.0f, 0.0f, 0.0f, 14), 0, 0.0f, (iu30) null, b0kVar2, 0, 112);
            op71.g(b0kVar2, u291.r(nim0.a, 12.0f));
            r9e1.a(strN, (qim0) null, 0L, 0L, (FontWeight) null, 0L, 0, 0L, 0, false, 0, 0, (iu30) null, new lee1(j5, fc11.G(18), FontWeight.Z, (FontFamily) null, 0L, 0L, 0, 0, 0L, (shc0) null, 0, 16777208), b0kVar2, 0, 0, 131070);
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar4;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new zfx0(j, j2, j3, d, z, qim0Var2, i);
        }
    }

    public static final void k(qim0 qim0Var, u7h u7hVar, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-216490099);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i | (x340Var.g(u7hVar) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).a.c;
            boolean zF = x340Var.f(j);
            Object objT = x340Var.T();
            if (zF || objT == m4cVar) {
                objT = v9c.s(p7h.M(new u7h[]{new u7h(u7h.j), new u7h(j)}), 0.0f, 0.0f, 14);
                x340Var.s0(objT);
            }
            Brush brush = (Brush) objT;
            long j2 = (u7hVar == null || z4p1.B(u7hVar.a) <= 0.18f) ? u7h.f : u7h.b;
            jmr0 jmr0VarN = i3o1.n(2131233984, x340Var, 0);
            as80 as80Var = mif1.P0;
            f2b f2bVar = new f2b(j2, 5);
            boolean zI = x340Var.i(brush);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new hk6(brush, (byte) 5);
                x340Var.s0(objT2);
            }
            cwl1.f(jmr0VarN, (String) null, exd0.s(qim0Var, (iu30) objT2), (tl3) null, as80Var, 0.12f, f2bVar, x340Var, 196664, 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yaf1(qim0Var, u7hVar, i, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x01c8  */
    public static final void l(String str, c380 c380Var, String str2, String str3, w460 w460Var, kl1 kl1Var, iu30 iu30Var, j2i j2iVar, b0k b0kVar, int i) {
        j2i j2iVar2;
        String strConcat;
        String str4;
        boolean z;
        boolean z2;
        c380 c380Var2 = c380Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(883659182);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(c380Var2) ? 32 : 16) | (x340Var.g(str2) ? 256 : 128) | (x340Var.g(str3) ? 2048 : 1024) | (x340Var.i(w460Var) ? 16384 : 8192) | (x340Var.i(kl1Var) ? 131072 : 65536) | (x340Var.i(iu30Var) ? 1048576 : 524288);
        if (x340Var.Y(i2 & 1, (i2 & 4793491) != 4793490)) {
            qim0 qim0Var = nim0.a;
            qim0 qim0VarN = anm1.N("entitySegmentsNpvCard", u291.z(u291.f(qim0Var, 1.0f), (fra) null, 3));
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).d.b;
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF = dug.f(qim0VarN, j, er31.b(16.0f));
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(0.0f, 8.0f, 1, qim0VarF);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
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
            qim0 qim0VarJ = u291.j(0.0f, 260.0f, 1, u291.f(qim0Var, 1.0f));
            cua cuaVar2 = cbx.b(x340Var).f;
            qim0 qim0VarQ = i1p1.q(qim0VarJ, er31.b(16.0f));
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarQ);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            qim0 qim0VarThen = uyn1.B(qim0Var, 16.0f, 8.0f, 16.0f, 0.0f, 8).then(str3 != null ? anm1.N("entitySegmentsNpvCardSubtitle", qim0Var) : qim0Var);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarThen);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            String str5 = str2 == null ? "" : str2;
            String strO0 = c380Var.size() > 3 ? cwl1.o0(x340Var, 2131955564) : null;
            Set set = s4b1.f;
            s4b1 s4b1VarX = uic.x(str);
            String strJ = s4b1VarX.j();
            if (strJ != null) {
                int iOrdinal = s4b1VarX.c.ordinal();
                if (iOrdinal == 844) {
                    strConcat = "spotify:internal:entity-segments:bottomsheet:episode:".concat(strJ);
                } else if (iOrdinal != 926) {
                    str4 = null;
                } else {
                    strConcat = "spotify:internal:entity-segments:bottomsheet:track:".concat(strJ);
                }
                str4 = strConcat;
            } else {
                str4 = null;
            }
            otw.c(w460Var, new s460(4, 544, str5, str3, strO0, str4, false), (qim0) null, (ipb1) null, x340Var, ((i2 >> 12) & 14) | 8, 12);
            x340Var.r(true);
            xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
            int i3 = i2 & 112;
            int i4 = i2 >> 9;
            c380Var2 = c380Var;
            y9g1.d(str, c380Var2, kl1Var, iu30Var, xtb0VarA, false, x340Var, (i2 & 126) | (i4 & 896) | (i4 & 7168), 32);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = yv91.a(new rsy(c380Var2, xtb0VarA, (byte) 1));
                x340Var.s0(objT);
            }
            tob1 tob1Var = (tob1) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                z = false;
                objT2 = yv91.a(new rsy(c380Var2, xtb0VarA, (byte) 0));
                x340Var.s0(objT2);
            } else {
                z = false;
            }
            boolean zBooleanValue = ((Boolean) tob1Var.getValue()).booleanValue();
            boolean zBooleanValue2 = ((Boolean) ((tob1) objT2).getValue()).booleanValue();
            qim0 qim0VarD = u291.d(qim0Var, 1.0f);
            gfh0 gfh0VarC2 = t1c.c(graVar, z);
            int iHashCode4 = Long.hashCode(x340Var.T);
            xos0 xos0VarM4 = x340Var.m();
            qim0 qim0VarE4 = zr7.E(x340Var, qim0VarD);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM4, x340Var, lljVar2);
            x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE4, x340Var, lljVar4);
            qim0 qim0VarD2 = u291.d(qim0Var, 1.0f);
            boolean z4 = i3 == 32;
            Object objT3 = x340Var.T();
            if (z4 || objT3 == m4cVar) {
                j2iVar2 = j2iVar;
                objT3 = new w3w((Object) c380Var2, (Object) j2iVar2, (byte) 27);
                x340Var.s0(objT3);
            } else {
                j2iVar2 = j2iVar;
            }
            s3o1.d(qim0VarD2, xtb0VarA, (vzq0) null, (g36) null, (nl3) null, (iq20) null, false, (h3h1) null, (iu30) objT3, x340Var, 12582912, 380);
            h2c h2cVar = h2c.a;
            if (zBooleanValue) {
                x340Var.i0(1977880084);
                qim0 qim0VarF2 = u291.f(qim0Var, 1.0f);
                zov0 zov0Var = cbx.b(x340Var).g;
                d(6, x340Var, h2cVar.a(u291.h(qim0VarF2, 32.0f), graVar), true);
                z2 = false;
                x340Var.r(false);
            } else {
                z2 = false;
                x340Var.i0(1978113917);
                x340Var.r(false);
            }
            if (zBooleanValue2) {
                x340Var.i0(1978180784);
                qim0 qim0VarF3 = u291.f(qim0Var, 1.0f);
                zov0 zov0Var2 = cbx.b(x340Var).g;
                d(6, x340Var, h2cVar.a(u291.h(qim0VarF3, 32.0f), een.t), z2);
                x340Var.r(z2);
            } else {
                x340Var.i0(1978418461);
                x340Var.r(z2);
            }
            us71.m(x340Var, true, true, true);
        } else {
            j2iVar2 = j2iVar;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n(str, c380Var2, str2, str3, w460Var, kl1Var, iu30Var, j2iVar2, i);
        }
    }

    public static final void m(cxc0 cxc0Var, b0k b0kVar, int i) {
        int i2;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1892688705);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(cxc0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strA = cxc0Var.f.d.a(1);
            if (strA.length() == 0) {
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new x5m1(cxc0Var, i, (byte) 0);
                    return;
                }
                return;
            }
            boolean zG = x340Var.g(strA);
            Object objT = x340Var.T();
            if (zG || objT == obj) {
                objT = Uri.parse(strA);
                x340Var.s0(objT);
            }
            Uri uri = (Uri) objT;
            xb10 xb10VarO = x4p1.o(x340Var);
            uri.getClass();
            oi7.a(uri, (gw70) null, xb10VarO, yqi1.b, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) null, (iu30) null, (iu30) null, jhc1.c(100.0f, 100.0f), x340Var, 0, 0, 98278);
            x340Var = x340Var;
            boolean zG2 = x340Var.g(xb10VarO.a());
            Object objT2 = x340Var.T();
            if (zG2 || objT2 == obj) {
                smr0 smr0VarA = xb10VarO.a();
                objT2 = smr0VarA != null ? ywo1.q(smr0VarA) : null;
                x340Var.s0(objT2);
            }
            u7h u7hVar = (u7h) objT2;
            if (u7hVar != null) {
                x340Var.i0(-757757025);
                k(u291.d(nim0.a, 1.0f), u7hVar, x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(-757660925);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV2 = x340Var.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new x5m1(cxc0Var, i, (byte) 1);
        }
    }

    public static final nml n(View view) {
        Object tag = view.getTag(2131431625);
        nml nmlVar = tag instanceof nml ? (nml) tag : null;
        if (nmlVar != null) {
            return nmlVar;
        }
        g8k1 g8k1Var = new g8k1(view);
        view.setTag(2131431625, g8k1Var);
        return g8k1Var;
    }

    public static nt21 o(qe41 qe41Var) {
        return new nt21(new pe41(qe41Var, new ww21(qe41Var, (byte) 4)));
    }

    public static final void p(zrm0 zrm0Var, fid fidVar, Brush brush, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle) {
        fidVar.q();
        ArrayList arrayList = zrm0Var.h;
        if (arrayList.size() <= 1 || (brush instanceof n6a1)) {
            q(zrm0Var, fidVar, brush, f, shadow, textDecoration, drawStyle);
        } else {
            if (!(brush instanceof zv61)) {
                eg.o();
                return;
            }
            int size = arrayList.size();
            float fMax = 0.0f;
            float f2 = 0.0f;
            for (int i = 0; i < size; i++) {
                nw4 nw4Var = ((sor0) arrayList.get(i)).a;
                f2 += nw4Var.f;
                fMax = Math.max(fMax, nw4Var.d());
            }
            Shader shaderC = ((zv61) brush).c((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
            Matrix matrix = new Matrix();
            shaderC.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                nw4 nw4Var2 = ((sor0) arrayList.get(i2)).a;
                nw4Var2.g(fidVar, new w9c(shaderC), f, shadow, textDecoration, drawStyle);
                fidVar.h(0.0f, nw4Var2.f);
                matrix.setTranslate(0.0f, -nw4Var2.f);
                shaderC.setLocalMatrix(matrix);
            }
        }
        fidVar.i();
    }

    public static final void q(zrm0 zrm0Var, fid fidVar, Brush brush, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle) {
        ArrayList arrayList = zrm0Var.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sor0 sor0Var = (sor0) arrayList.get(i);
            sor0Var.a.g(fidVar, brush, f, shadow, textDecoration, drawStyle);
            fidVar.h(0.0f, sor0Var.a.f);
        }
    }

    public static List r() {
        return Collections.singletonList(rc11.a.b(xa20.class));
    }

    public static final xzq s(tyq tyqVar, iu30 iu30Var) {
        return new xzq(tyqVar, iu30Var);
    }

    public static boolean t(sg4 sg4Var) {
        return sg4Var.c();
    }

    public static final Long u(Duration duration) {
        int iO;
        if (duration.p() < 0 || (iO = duration.o()) < 0 || iO >= 1000000000 || duration.p() > 9223372036854775L) {
            return null;
        }
        long jP = duration.p() * 1000;
        long jO = ((long) duration.o()) / 1000000;
        if (jP > Long.MAX_VALUE - jO) {
            return null;
        }
        return Long.valueOf(jP + jO);
    }

    public static final Duration v(long j) {
        ifv ifvVarQ = Duration.q();
        ifvVarQ.q(j / 1000);
        ifvVarQ.n((int) ((j % 1000) * 1000000));
        return ifvVarQ.build();
    }
}
