package p;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Matrix;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class ywo1 {
    public static b180 a;

    public static final void a(r5f1 r5f1Var, String str, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2022670932);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(r5f1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            gfx.b(8, apo.r(1395367841, new ozw(r5f1Var, str, (byte) 19), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bkh(r5f1Var, str, i, (byte) 29);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:47:0x009d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:48:0x009f  */
    /* JADX WARN: Code duplicated, block: B:53:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:63:0x0102  */
    /* JADX WARN: Code duplicated, block: B:66:0x010d  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    public static final void b(String str, ryx ryxVar, qim0 qim0Var, mfv0 mfv0Var, j2i j2iVar, b0k b0kVar, int i, int i2) {
        int i3;
        mfv0 mfv0Var2;
        int i4;
        boolean z;
        qim0 qim0Var2;
        mfv0 mfv0Var3;
        h311 h311VarV;
        qim0 qim0Var3;
        int iI0;
        boolean zE;
        Object objT;
        boolean z2;
        Object objT2;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1500139444);
        int i5 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(ryxVar) ? 32 : 16);
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 = i5 | 384;
        } else {
            i3 = i5 | (x340Var.g(qim0Var) ? 256 : 128);
        }
        if ((i2 & 8) == 0) {
            mfv0Var2 = mfv0Var;
            int i7 = x340Var.g(mfv0Var2) ? 2048 : 1024;
            i4 = i3 | i7;
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i4 & 1, z)) {
                x340Var.d0();
                if ((i & 1) != 0 || x340Var.E()) {
                    if (i6 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var;
                    }
                    if ((i2 & 8) != 0) {
                        iI0 = ((wat) x340Var.k(t4k.h)).i0(s3v.a(m4f1.a));
                        zE = x340Var.e(iI0);
                        objT = x340Var.T();
                        if (zE || objT == obj) {
                            objT = new l4f1(iI0);
                            x340Var.s0(objT);
                        }
                        i4 &= -7169;
                        mfv0Var2 = (l4f1) objT;
                    }
                } else {
                    x340Var.b0();
                    if ((i2 & 8) != 0) {
                        i4 &= -7169;
                    }
                    qim0Var3 = qim0Var;
                }
                x340Var.s();
                kiv kivVar = pyx.a;
                d3j0 d3j0VarD = ryxVar.d();
                z2 = (i4 & 112) == 32;
                objT2 = x340Var.T();
                if (z2 || objT2 == obj) {
                    objT2 = new d4e(ryxVar, (byte) 25);
                    x340Var.s0(objT2);
                }
                mym.e(kivVar, d3j0VarD, (Function0) objT2, x340Var, 6);
                if (ryxVar instanceof ryx) {
                    eg.o();
                    return;
                }
                qim0 qim0Var4 = qim0Var3;
                mfv0 mfv0Var4 = mfv0Var2;
                v4f1.b(mfv0Var4, apo.r(-1847058263, new kaf(str, (byte) 29), x340Var), ryxVar, qim0Var4, false, j2iVar, x340Var, ((i4 >> 9) & 14) | 100663344, 240);
                mfv0Var3 = mfv0Var4;
                qim0Var2 = qim0Var4;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
                mfv0Var3 = mfv0Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ik2(str, ryxVar, qim0Var2, mfv0Var3, j2iVar, i, i2, (byte) 3);
            }
        }
        mfv0Var2 = mfv0Var;
        i4 = i3 | i7;
        if ((i4 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i4 & 1, z)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                if (i6 != 0) {
                    qim0Var3 = nim0.a;
                } else {
                    qim0Var3 = qim0Var;
                }
                if ((i2 & 8) != 0) {
                    iI0 = ((wat) x340Var.k(t4k.h)).i0(s3v.a(m4f1.a));
                    zE = x340Var.e(iI0);
                    objT = x340Var.T();
                    if (zE) {
                        objT = new l4f1(iI0);
                        x340Var.s0(objT);
                    } else {
                        objT = new l4f1(iI0);
                        x340Var.s0(objT);
                    }
                    i4 &= -7169;
                    mfv0Var2 = (l4f1) objT;
                }
            } else {
                if (i6 != 0) {
                    qim0Var3 = nim0.a;
                } else {
                    qim0Var3 = qim0Var;
                }
                if ((i2 & 8) != 0) {
                    iI0 = ((wat) x340Var.k(t4k.h)).i0(s3v.a(m4f1.a));
                    zE = x340Var.e(iI0);
                    objT = x340Var.T();
                    if (zE) {
                        objT = new l4f1(iI0);
                        x340Var.s0(objT);
                    } else {
                        objT = new l4f1(iI0);
                        x340Var.s0(objT);
                    }
                    i4 &= -7169;
                    mfv0Var2 = (l4f1) objT;
                }
            }
            x340Var.s();
            kiv kivVar2 = pyx.a;
            d3j0 d3j0VarD2 = ryxVar.d();
            if ((i4 & 112) == 32) {
            }
            objT2 = x340Var.T();
            if (z2) {
                objT2 = new d4e(ryxVar, (byte) 25);
                x340Var.s0(objT2);
            } else {
                objT2 = new d4e(ryxVar, (byte) 25);
                x340Var.s0(objT2);
            }
            mym.e(kivVar2, d3j0VarD2, (Function0) objT2, x340Var, 6);
            if (ryxVar instanceof ryx) {
                eg.o();
                return;
            }
            qim0 qim0Var5 = qim0Var3;
            mfv0 mfv0Var5 = mfv0Var2;
            v4f1.b(mfv0Var5, apo.r(-1847058263, new kaf(str, (byte) 29), x340Var), ryxVar, qim0Var5, false, j2iVar, x340Var, ((i4 >> 9) & 14) | 100663344, 240);
            mfv0Var3 = mfv0Var5;
            qim0Var2 = qim0Var5;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            mfv0Var3 = mfv0Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ik2(str, ryxVar, qim0Var2, mfv0Var3, j2iVar, i, i2, (byte) 3);
        }
    }

    public static final void c(String str, u7h u7hVar, Function0 function0, b0k b0kVar, int i, int i2) {
        u7h u7hVar2;
        int i3;
        u7h u7hVar3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2099020748);
        int i4 = i | (x340Var.g(str) ? 4 : 2);
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
            u7hVar2 = u7hVar;
        } else {
            u7hVar2 = u7hVar;
            i3 = i4 | (x340Var.g(u7hVar2) ? 32 : 16);
        }
        int i6 = i3 | (x340Var.i(function0) ? 256 : 128);
        if (x340Var.Y(i6 & 1, (i6 & 147) != 146)) {
            u7h u7hVar4 = i5 != 0 ? null : u7hVar2;
            foo1.c(new gbx(z50.c, function0), ldx.c, null, null, yla.s(x340Var), null, null, null, apo.r(-1848758332, new jsf(u7hVar4, (byte) 0), x340Var), null, apo.r(1307592469, new ksf(str, u7hVar4), x340Var), x340Var, 805306368, 48, 1500);
            u7hVar3 = u7hVar4;
        } else {
            x340Var.b0();
            u7hVar3 = u7hVar2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new r27(str, u7hVar3, function0, i, i2, (byte) 3);
        }
    }

    public static final void d(cce cceVar, o0i o0iVar, q9l1 q9l1Var, int i, z0i z0iVar, Integer num, qim0 qim0Var, b0k b0kVar, int i2) {
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1000849129);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.i(cceVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? x340Var.g(o0iVar) : x340Var.i(o0iVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.i(q9l1Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.e(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var.g(z0iVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= x340Var.g(num) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= x340Var.g(qim0Var) ? 1048576 : 524288;
        }
        if (x340Var.Y(i3 & 1, (599187 & i3) != 599186)) {
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 48);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            nim0 nim0Var = nim0.a;
            if (i > 1) {
                x340Var.i0(1819108364);
                boolean zI = x340Var.i(q9l1Var);
                Object objT = x340Var.T();
                if (zI || objT == m4cVar) {
                    z3 = false;
                    objT = new x3t0(q9l1Var, (byte) 0);
                    x340Var.s0(objT);
                } else {
                    z3 = false;
                }
                iu30 iu30Var = (iu30) objT;
                qim0 qim0VarB = uyn1.B(u291.B(nim0Var, (gra) null, 3), 0.0f, 8.0f, 0.0f, 0.0f, 13);
                boolean z4 = ((i3 & 7168) == 2048 ? true : z3) | ((458752 & i3) == 131072 ? true : z3);
                Object objT2 = x340Var.T();
                if (z4 || objT2 == m4cVar) {
                    objT2 = new ym(i, (Object) num, (byte) 19);
                    x340Var.s0(objT2);
                }
                z2 = z3;
                z = true;
                dm5.a(iu30Var, qim0VarB, (iu30) objT2, x340Var, 48, 0);
                x340Var.r(z2);
            } else {
                z = true;
                z2 = false;
                x340Var.i0(1819511023);
                x340Var.r(false);
            }
            if (z0iVar == null) {
                x340Var.i0(1819540379);
                x340Var.r(z2);
            } else {
                x340Var.i0(1819540380);
                cceVar.a(((i3 >> 3) & 14) | 392 | ((i3 >> 9) & 112) | ((i3 << 9) & 7168), o0iVar, z0iVar, x340Var, u291.f(nim0Var, 1.0f));
                x340Var.r(z2);
            }
            x340Var.r(z);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new y3t0(cceVar, o0iVar, q9l1Var, i, z0iVar, num, qim0Var, i2);
        }
    }

    public static final void e(int i, j2i j2iVar, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2093947411);
        if (x340Var.Y(i & 1, (i & 3) != 2)) {
            m0n0 m0n0VarB = zj20.b((View) x340Var.k(AndroidCompositionLocals_androidKt.f));
            if (m0n0VarB != null) {
                x340Var.i0(-682119439);
                m0n0VarB.b(6, j2iVar, x340Var);
                x340Var.r(false);
            } else {
                x340Var.i0(-682047550);
                j2iVar.invoke(x340Var, 6);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ak10(j2iVar, i, (byte) 24);
        }
    }

    public static final void f(ez61 ez61Var, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1471655741);
        int i2 = (x340Var.g(ez61Var) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            float f = ez61Var.a;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarI = zr7.i(d7e.r(f, qim0Var3, false), gce0.a1);
            uwr uwrVar = cbx.a;
            l4o1.b(dug.f(qim0VarI, cbx.a(x340Var).a.b.c(), d4o1.a), null, null, null, null, apo.r(289534219, new rv71(j2iVar, (byte) 26), x340Var), x340Var, 196608, 30);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hl11(ez61Var, qim0Var2, j2iVar, i, (byte) 27);
        }
    }

    public static boolean g(String str, String str2, boolean z) {
        if (str == null || ihc1.y0(str) || str2 == null || ihc1.y0(str2)) {
            return false;
        }
        String string = ihc1.e1(str).toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string.toLowerCase(locale);
        String strH0 = ihc1.H0(ihc1.e1(str2).toString().toLowerCase(locale), "projectiondevice-");
        return z ? nhc1.Y(strH0, lowerCase, false) : strH0.equals(lowerCase);
    }

    public static final CursorAnchorInfo h(CursorAnchorInfo.Builder builder, c8e1 c8e1Var, hyp0 hyp0Var, y9e1 y9e1Var, Matrix matrix, n511 n511Var, n511 n511Var2, boolean z, boolean z2, boolean z3, boolean z4) {
        builder.reset();
        builder.setMatrix(matrix);
        long j = c8e1Var.b;
        nbe1 nbe1Var = c8e1Var.c;
        int iG = nbe1.g(j);
        builder.setSelectionRange(iG, nbe1.f(c8e1Var.b));
        if (z && iG >= 0) {
            int iO = hyp0Var.o(iG);
            n511 n511VarC = y9e1Var.c(iO);
            float fO = yoi1.o(n511VarC.a, 0.0f, (int) (y9e1Var.c >> 32));
            boolean zM = m(n511Var, fO, n511VarC.b);
            boolean zM2 = m(n511Var, fO, n511VarC.d);
            boolean z5 = y9e1Var.a(iO) == 2;
            int i = (zM || zM2) ? 1 : 0;
            if (!zM || !zM2) {
                i |= 2;
            }
            if (z5) {
                i |= 4;
            }
            float f = n511VarC.b;
            float f2 = n511VarC.d;
            builder.setInsertionMarkerLocation(fO, f, f2, f2, i);
        }
        if (z2) {
            int iG2 = nbe1Var != null ? nbe1.g(nbe1Var.a) : -1;
            int iF = nbe1Var != null ? nbe1.f(nbe1Var.a) : -1;
            if (iG2 >= 0 && iG2 < iF) {
                builder.setComposingText(iG2, c8e1Var.a.b.subSequence(iG2, iF));
                int iO2 = hyp0Var.o(iG2);
                int iO3 = hyp0Var.o(iF);
                float[] fArr = new float[(iO3 - iO2) * 4];
                y9e1Var.b.a(e6p1.e(iO2, iO3), fArr);
                for (int i2 = iG2; i2 < iF; i2++) {
                    int iO4 = hyp0Var.o(i2);
                    int i3 = (iO4 - iO2) * 4;
                    float f3 = fArr[i3];
                    float f4 = fArr[i3 + 1];
                    float f5 = fArr[i3 + 2];
                    float f6 = fArr[i3 + 3];
                    int i4 = (n511Var.a < f5 ? 1 : 0) & (f3 < n511Var.c ? 1 : 0) & (n511Var.b < f6 ? 1 : 0) & (f4 < n511Var.d ? 1 : 0);
                    if (!m(n511Var, f3, f4) || !m(n511Var, f5, f6)) {
                        i4 |= 2;
                    }
                    if (y9e1Var.a(iO4) == 2) {
                        i4 |= 4;
                    }
                    builder.addCharacterBounds(i2, f3, f4, f5, f6, i4);
                }
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 33 && z3) {
            gg.L(builder, n511Var2);
        }
        if (i5 >= 34 && z4) {
            sf.b(builder, y9e1Var, n511Var);
        }
        return builder.build();
    }

    public static void i(View view) {
        view.setFocusable(false);
        view.setOnClickListener(null);
        view.setClickable(false);
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
    }

    public static final float j(lo41 lo41Var, long j, boolean z) {
        float f = lo41Var.c * lo41Var.d;
        float f2 = lo41Var.a.e / j;
        float f3 = 0.0f;
        if (z) {
            float f4 = lo41Var.b;
            if (30.0f <= f4 && f4 <= 80.0f) {
                f3 = -(yoi1.o((25.0f - Math.abs(25.0f - (f4 - 30.0f))) / 25.0f, 0.0f, 1.0f) * 2.0f);
            }
        }
        return f + f2 + f3;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:77:0x013f  */
    public static qi k(List list, cn70 cn70Var) {
        Object next;
        Object next2;
        Object next3;
        ak akVar;
        Object next4;
        Object next5;
        Boolean bool;
        boolean zBooleanValue;
        String str;
        String str2;
        axo1 axo1Var;
        List list2 = list;
        Iterator it = list2.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((hi) next).i.b(ak.c));
        qi qiVar = (hi) next;
        Iterator it2 = list2.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!((hi) next2).i.b(ak.a));
        qi qiVar2 = (hi) next2;
        Iterator it3 = list2.iterator();
        do {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it3.next();
        } while (!((hi) next3).i.b(ak.d));
        qi qiVar3 = (hi) next3;
        Iterator it4 = list2.iterator();
        do {
            boolean zHasNext = it4.hasNext();
            akVar = ak.b;
            if (!zHasNext) {
                next4 = null;
                break;
            }
            next4 = it4.next();
        } while (!((hi) next4).i.b(akVar));
        qi qiVar4 = (hi) next4;
        Iterator it5 = list2.iterator();
        do {
            if (!it5.hasNext()) {
                next5 = null;
                break;
            }
            next5 = it5.next();
        } while (!((hi) next5).i.b(ak.f));
        qi qiVar5 = (hi) next5;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (((hi) obj).i.b(akVar)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            zBooleanValue = false;
        } else if (arrayList.size() == 1) {
            Boolean bool2 = ((hi) o7h.q0(arrayList)).g;
            if (bool2 != null) {
                zBooleanValue = bool2.booleanValue();
            } else {
                zBooleanValue = false;
            }
        } else {
            if (qiVar2 == null || (bool = qiVar2.g) == null) {
                bool = qiVar3 != null ? qiVar3.g : null;
                if (bool == null) {
                    zBooleanValue = false;
                }
            }
            zBooleanValue = bool.booleanValue();
        }
        boolean z = ((hi) list.get(0)).e == 4;
        qi qiVar6 = (qi) list.get(0);
        if (z) {
            if (qiVar2 == null || (str = qiVar2.c) == null) {
                str = qiVar4 != null ? qiVar4.c : null;
                if (str == null) {
                    if (qiVar3 != null) {
                        str = qiVar3.c;
                    } else {
                        str2 = null;
                    }
                }
            }
            str2 = str;
        } else if (qiVar != null) {
            str = qiVar.c;
            str2 = str;
        } else {
            str2 = null;
        }
        String str3 = qiVar != null ? qiVar.d : null;
        List list3 = qiVar2 != null ? qiVar2.f : null;
        List list4 = z6x.a;
        if (list3 == null) {
            list3 = list4;
        }
        List list5 = qiVar != null ? qiVar.f : null;
        if (list5 != null) {
            list4 = list5;
        }
        List listJ0 = o7h.j0(o7h.N0(list4, list3));
        if (qiVar5 == null || (axo1Var = qiVar5.h) == null) {
            axo1Var = ((hi) list.get(0)).h;
        }
        return qi.c(qiVar6, (String) null, str2, str3, listJ0, Boolean.valueOf(zBooleanValue), axo1Var, cn70Var, 9);
    }

    public static boolean l(Object obj, Object obj2, ezb1 ezb1Var) {
        u0e u0eVar = (u0e) obj;
        u0e u0eVar2 = (u0e) obj2;
        ContextTrack contextTrack = u0eVar.a;
        ContextTrack contextTrack2 = u0eVar2.a;
        if (((r3g1) ezb1Var.b).g) {
            if (u0eVar.b == u0eVar2.b) {
                return true;
            }
        } else if (contextTrack.uid().equals(contextTrack2.uid()) && TextUtils.equals((CharSequence) contextTrack.metadata().get("title"), (CharSequence) contextTrack2.metadata().get("title")) && s3o1.v(contextTrack, false) == s3o1.v(contextTrack2, false)) {
            return true;
        }
        return false;
    }

    public static final boolean m(n511 n511Var, float f, float f2) {
        float f3 = n511Var.a;
        if (f > n511Var.c || f3 > f) {
            return false;
        }
        return f2 <= n511Var.d && n511Var.b <= f2;
    }

    public static ArrayList n(ArrayList arrayList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : arrayList) {
            String str = ((hi) obj).b;
            Object objH = linkedHashMap.get(str);
            if (objH == null) {
                objH = cfm0.h(str, linkedHashMap);
            }
            ((List) objH).add(obj);
        }
        Collection<List> collectionValues = linkedHashMap.values();
        ArrayList arrayList2 = new ArrayList(q7h.U(collectionValues, 10));
        for (List list : collectionValues) {
            arrayList2.add(k(list, p(list)));
        }
        return arrayList2;
    }

    public static final go80 o(klm klmVar, zcp0 zcp0Var) {
        return klmVar.a("DevicePredictabilityProximityDetectorForegroundSchedulerDaemon", new nbp0(zcp0Var, (byte) 4));
    }

    public static cn70 p(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((hi) it.next()).i.a);
        }
        return new cn70(q7h.V(arrayList));
    }

    public static final u7h q(smr0 smr0Var) {
        float f;
        Object next;
        if (smr0Var != null) {
            List<rmr0> listUnmodifiableList = Collections.unmodifiableList(smr0Var.a);
            ArrayList arrayList = new ArrayList(q7h.U(listUnmodifiableList, 10));
            for (rmr0 rmr0Var : listUnmodifiableList) {
                rmr0Var.getClass();
                int i = rmr0Var.d;
                float[] fArr = new float[3];
                Color.RGBToHSV(Color.red(i), Color.green(i), Color.blue(i), fArr);
                arrayList.add(new lo41(rmr0Var, fArr));
            }
            Iterator it = arrayList.iterator();
            long j = 0;
            while (it.hasNext()) {
                j += (long) ((lo41) it.next()).a.e;
            }
            if (j < 1) {
                j = 1;
            }
            ArrayList<lo41> arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((lo41) obj).d >= 0.2f) {
                    arrayList2.add(obj);
                }
            }
            Iterator it2 = arrayList2.iterator();
            long j2 = 0;
            while (it2.hasNext()) {
                j2 += (long) ((lo41) it2.next()).a.e;
            }
            if (j2 == 0) {
                f = 0.0f;
            } else {
                double d = 0.0d;
                for (lo41 lo41Var : arrayList2) {
                    d += (double) (lo41Var.c * lo41Var.a.e);
                }
                f = (float) (d / j2);
            }
            if (f >= 0.1f) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : arrayList) {
                    lo41 lo41Var2 = (lo41) obj2;
                    float f2 = lo41Var2.a.e / j;
                    if (lo41Var2.c >= 0.2f && lo41Var2.d >= 0.2f && f2 >= 0.0016f) {
                        arrayList3.add(obj2);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    boolean z = false;
                    if (!arrayList3.isEmpty()) {
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            float f3 = ((lo41) it3.next()).b;
                            if (30.0f > f3 || f3 > 80.0f) {
                                z = true;
                                break;
                            }
                        }
                    }
                    Iterator it4 = arrayList3.iterator();
                    if (it4.hasNext()) {
                        next = it4.next();
                        if (it4.hasNext()) {
                            float fJ = j((lo41) next, j, z);
                            do {
                                Object next2 = it4.next();
                                float fJ2 = j((lo41) next2, j, z);
                                if (Float.compare(fJ, fJ2) < 0) {
                                    next = next2;
                                    fJ = fJ2;
                                }
                            } while (it4.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    lo41 lo41Var3 = (lo41) next;
                    if (lo41Var3 != null) {
                        return new u7h(z4p1.e(lo41Var3.a.d));
                    }
                }
            }
        }
        return null;
    }

    public static final void r(Intent intent, a690 a690Var) {
        intent.putExtra("FeatureIdentifier.InternalReferrer.Persistable", a690Var.a.getName());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:43|22|(3:25|26|27)|34) */
    /* JADX WARN: Code duplicated, block: B:25:0x0088  */
    /* JADX WARN: Code duplicated, block: B:30:0x009f  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0093, code lost:
    
        r12 = r0;
        r0 = 0;
        r13 = r7;
        r7 = r9;
        r16 = r1;
        r1 = r8;
        r8 = r16;
        r2 = r7;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00bd -> B:13:0x0038). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object s(int r18, long r19, p.iu30 r21, p.onm r22) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ywo1.s(int, long, p.iu30, p.onm):java.lang.Object");
    }

    public static final tgm t(wa8 wa8Var, String str) {
        return new tgm(str, false, false, false, false, false, wa8Var.a, (yh10) null, false, false, 0, false, false, false, false, false, (iu30) null, false, false, (g371) null, wa8Var.b, false, wa8Var.c, (iu30) null, (p860) null, (mgo0) null, false, false, -41943170, 1);
    }

    public static final eq01 u(aw70 aw70Var, agc0 agc0Var) {
        String str = aw70Var.h;
        boolean zR = eyo1.r(str);
        String str2 = aw70Var.c;
        String str3 = aw70Var.d;
        xt70 xt70Var = aw70Var.f;
        return new eq01(str, str2, str3, xt70Var.a, aw70Var.g, aw70Var.k, aw70Var.o && !zR, aw70Var.t, false, aw70Var.p, aw70Var.l, aw70Var.m, aw70Var.n, xt70Var.b, eyo1.p(str), lrn1.q(str, agc0Var));
    }
}
