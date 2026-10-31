package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.view.View;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class h7p1 {
    public static b180 a;
    public static b180 b;

    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    public static final ulh A(tlh tlhVar, int i) {
        c380 c380VarA;
        String str = tlhVar.a;
        String str2 = tlhVar.b;
        alr0 alr0Var = tlhVar.c;
        if (alr0Var != null) {
            ArrayList arrayList = alr0Var.a;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                mlh mlhVarZ = z((som) it.next());
                if (mlhVarZ != null) {
                    arrayList2.add(mlhVarZ);
                }
            }
            c380VarA = mqo1.A(arrayList2);
            if (c380VarA == null) {
                c380VarA = fg91.b;
            }
        } else {
            c380VarA = fg91.b;
        }
        return new ulh(str, str2, c380VarA, alr0Var != null ? alr0Var.b : null, alr0Var == null ? 2 : 1, (Throwable) null, i);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0130  */
    /* JADX WARN: Code duplicated, block: B:104:0x014c  */
    /* JADX WARN: Code duplicated, block: B:107:0x015d  */
    /* JADX WARN: Code duplicated, block: B:109:0x0178  */
    /* JADX WARN: Code duplicated, block: B:110:0x017a  */
    /* JADX WARN: Code duplicated, block: B:116:0x0194  */
    /* JADX WARN: Code duplicated, block: B:118:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:120:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:121:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:127:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:133:0x0221 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:134:0x0223  */
    /* JADX WARN: Code duplicated, block: B:135:0x0237  */
    /* JADX WARN: Code duplicated, block: B:140:0x0268 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x026a  */
    /* JADX WARN: Code duplicated, block: B:142:0x0271  */
    /* JADX WARN: Code duplicated, block: B:145:0x027b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:146:0x027d  */
    /* JADX WARN: Code duplicated, block: B:147:0x027f  */
    /* JADX WARN: Code duplicated, block: B:152:0x0298  */
    /* JADX WARN: Code duplicated, block: B:155:0x02da  */
    /* JADX WARN: Code duplicated, block: B:158:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:68:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:88:0x0104  */
    /* JADX WARN: Code duplicated, block: B:89:0x0108  */
    /* JADX WARN: Code duplicated, block: B:91:0x010e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0112  */
    /* JADX WARN: Code duplicated, block: B:95:0x0121  */
    /* JADX WARN: Code duplicated, block: B:96:0x0123  */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v7 */
    public static final void a(pk1 pk1Var, gbx gbxVar, qim0 qim0Var, max maxVar, gdx gdxVar, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        gdx gdxVarR;
        boolean z;
        b0k b0kVar2;
        max maxVar2;
        qim0 qim0Var3;
        gdx gdxVar2;
        h311 h311VarV;
        qim0 qim0Var4;
        max maxVar3;
        int i4;
        qim0 qim0Var5;
        max maxVar4;
        tk1 tk1Var;
        boolean zJ;
        rk1 rk1Var;
        int i5;
        int i6;
        fcf0 fcf0VarX;
        fcf0 fcf0VarX2;
        fcf0 fcf0Var;
        boolean zG;
        Object objT;
        kbf0 kbf0Var;
        boolean zG2;
        Object objT2;
        ven0 ven0Var;
        kbf0 kbf0Var2;
        ven0 ven0Var2;
        fcf0 fcf0Var2;
        int i7;
        int i8;
        boolean z2;
        boolean zI;
        Object nk1Var;
        pk1 pk1Var2;
        mmr0 mmr0Var;
        int iIntValue;
        int iIntValue2;
        int i9;
        String[] strArr;
        int iOrdinal;
        String strN0;
        boolean zG3;
        Object objT3;
        boolean z3;
        boolean zI2;
        Object nk1Var2;
        boolean z4;
        m4c m4cVar = fkj0.X;
        String str = pk1Var.c;
        j7p1 j7p1Var = pk1Var.e;
        qk1 qk1Var = pk1Var.a;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1174631401);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.g(pk1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar3.i(gbxVar) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 == 0) {
            if ((i & 384) == 0) {
                qim0Var2 = qim0Var;
                i3 |= b0kVar3.i(qim0Var2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                i3 |= ((i2 & 8) == 0 || !b0kVar3.i(maxVar)) ? 1024 : 2048;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    gdxVarR = gdxVar;
                    int i11 = b0kVar3.i(gdxVarR) ? 16384 : 8192;
                    i3 |= i11;
                } else {
                    gdxVarR = gdxVar;
                }
                i3 |= i11;
            } else {
                gdxVarR = gdxVar;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i3 & 1, z)) {
                b0kVar3.d0();
                if ((i & 1) != 0 || b0kVar3.E()) {
                    if (i10 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        maxVar3 = jax.a;
                    } else {
                        maxVar3 = maxVar;
                    }
                    if ((i2 & 16) != 0) {
                        i4 = i3 & (-57345);
                        maxVar4 = maxVar3;
                        gdxVarR = yla.r(b0kVar3);
                        qim0Var5 = qim0Var4;
                    } else {
                        i4 = i3;
                        qim0Var5 = qim0Var4;
                        maxVar4 = maxVar3;
                    }
                } else {
                    b0kVar3.b0();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    maxVar4 = maxVar;
                    i4 = i3;
                    qim0Var5 = qim0Var2;
                }
                b0kVar3.s();
                tk1Var = tk1.c;
                zJ = u890.j(j7p1Var, tk1Var);
                rk1Var = rk1.c;
                if (zJ) {
                    i5 = 2131886216;
                } else if (u890.j(j7p1Var, rk1Var)) {
                    i5 = 2131886212;
                } else {
                    i5 = 2131886215;
                }
                if (u890.j(j7p1Var, tk1Var)) {
                    i6 = 2131886214;
                } else if (u890.j(j7p1Var, rk1Var)) {
                    i6 = 2131886212;
                } else {
                    i6 = 2131886213;
                }
                fcf0VarX = x(b0kVar3, i5);
                fcf0VarX2 = x(b0kVar3, i6);
                if (qk1Var == qk1.a) {
                    fcf0Var = fcf0VarX;
                } else {
                    fcf0Var = fcf0VarX2;
                }
                zG = b0kVar3.g(fcf0Var);
                objT = b0kVar3.T();
                if (zG || objT == m4cVar) {
                    objT = new kbf0();
                    b0kVar3.s0(objT);
                }
                kbf0Var = (kbf0) objT;
                zG2 = b0kVar3.g(fcf0VarX) | b0kVar3.g(fcf0VarX2);
                objT2 = b0kVar3.T();
                if (zG2 || objT2 == m4cVar) {
                    objT2 = v8r.q(Boolean.TRUE);
                    b0kVar3.s0(objT2);
                }
                ven0Var = (ven0) objT2;
                if (u890.j(j7p1Var, rk1Var)) {
                    b0kVar3.i0(1950388170);
                    boolean zI3 = b0kVar3.i(ven0Var) | b0kVar3.i(kbf0Var) | b0kVar3.i(fcf0VarX);
                    if ((i4 & 14) == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    zI2 = zI3 | z3 | b0kVar3.i(fcf0VarX2);
                    Object objT4 = b0kVar3.T();
                    if (!zI2 || objT4 == m4cVar) {
                        fcf0Var2 = fcf0Var;
                        i7 = 1;
                        z4 = false;
                        ven0Var2 = ven0Var;
                        nk1Var2 = new nk1(kbf0Var, fcf0VarX, pk1Var, fcf0VarX2, ven0Var2, (lnm) null);
                        kbf0Var2 = kbf0Var;
                        b0kVar3.s0(nk1Var2);
                    } else {
                        kbf0Var2 = kbf0Var;
                        nk1Var2 = objT4;
                        fcf0Var2 = fcf0Var;
                        i7 = 1;
                        z4 = false;
                        ven0Var2 = ven0Var;
                    }
                    qxd0.s(qk1Var, kbf0Var2, (vu30) nk1Var2, b0kVar3);
                    b0kVar3.r(z4);
                    pk1Var2 = pk1Var;
                    i8 = z4;
                } else {
                    kbf0Var2 = kbf0Var;
                    ven0Var2 = ven0Var;
                    fcf0Var2 = fcf0Var;
                    i7 = 1;
                    i8 = 0;
                    b0kVar3.i0(1950959841);
                    if ((i4 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zI = b0kVar3.i(fcf0VarX) | z2 | b0kVar3.i(fcf0VarX2) | b0kVar3.i(ven0Var2) | b0kVar3.i(kbf0Var2);
                    Object objT5 = b0kVar3.T();
                    if (!zI || objT5 == m4cVar) {
                        pk1Var2 = pk1Var;
                        nk1Var = new nk1(pk1Var2, fcf0VarX, fcf0VarX2, kbf0Var2, ven0Var2, (lnm) null);
                        b0kVar3.s0(nk1Var);
                    } else {
                        nk1Var = objT5;
                        pk1Var2 = pk1Var;
                    }
                    qxd0.s(qk1Var, kbf0Var2, (vu30) nk1Var, b0kVar3);
                    b0kVar3.r(false);
                }
                String str2 = pk1Var2.d;
                if (str == null && str2 != null) {
                    mmr0Var = new mmr0(2131951917, 2131951918);
                } else if (str != null) {
                    mmr0Var = new mmr0(2131951919, 2131951920);
                } else {
                    mmr0Var = new mmr0(2131951915, 2131951916);
                }
                iIntValue = ((Number) mmr0Var.a).intValue();
                iIntValue2 = ((Number) mmr0Var.b).intValue();
                if (str == null && str2 != null) {
                    strArr = new String[2];
                    strArr[i8] = str;
                    strArr[i7] = str2;
                    i9 = i7;
                } else if (str != null) {
                    i9 = i7;
                    strArr = new String[i9];
                    strArr[i8] = str;
                } else {
                    i9 = i7;
                    strArr = new String[i8];
                }
                iOrdinal = qk1Var.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == i9) {
                        eg.o();
                        return;
                    }
                    iIntValue = iIntValue2;
                }
                strN0 = cwl1.n0(iIntValue, Arrays.copyOf(strArr, strArr.length), b0kVar3);
                zG3 = b0kVar3.g(strN0);
                objT3 = b0kVar3.T();
                if (zG3 || objT3 == m4cVar) {
                    objT3 = new v1(strN0, (byte) 12);
                    b0kVar3.s0(objT3);
                }
                qim0 qim0VarB = s161.b(qim0Var5, i8, (iu30) objT3);
                pk1 pk1Var3 = pk1Var2;
                fcf0 fcf0Var3 = fcf0Var2;
                b0kVar2 = b0kVar3;
                dxo1.f(gbxVar, qim0VarB, maxVar4, gdxVarR, apo.r(-151097339, new x2((Object) fcf0Var3, (Object) ven0Var2, (Object) pk1Var3, (Object) kbf0Var2, (byte) 14), b0kVar3), b0kVar2, ((i4 >> 3) & 14) | 1572864 | (i4 & 7168) | (57344 & i4), 36);
                qim0Var3 = qim0Var5;
                maxVar2 = maxVar4;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                maxVar2 = maxVar;
                qim0Var3 = qim0Var2;
            }
            gdxVar2 = gdxVarR;
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new j90(pk1Var, gbxVar, qim0Var3, maxVar2, gdxVar2, i, i2, (byte) 1);
            }
        }
        i3 |= 384;
        qim0Var2 = qim0Var;
        if ((i & 3072) != 0) {
            i3 |= ((i2 & 8) == 0 || !b0kVar3.i(maxVar)) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                gdxVarR = gdxVar;
                if (b0kVar3.i(gdxVarR)) {
                }
                i3 |= i11;
            } else {
                gdxVarR = gdxVar;
            }
            i3 |= i11;
        } else {
            gdxVarR = gdxVar;
        }
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i3 & 1, z)) {
            b0kVar3.d0();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    maxVar3 = jax.a;
                } else {
                    maxVar3 = maxVar;
                }
                if ((i2 & 16) != 0) {
                    i4 = i3 & (-57345);
                    maxVar4 = maxVar3;
                    gdxVarR = yla.r(b0kVar3);
                    qim0Var5 = qim0Var4;
                } else {
                    i4 = i3;
                    qim0Var5 = qim0Var4;
                    maxVar4 = maxVar3;
                }
            } else {
                if (i10 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    maxVar3 = jax.a;
                } else {
                    maxVar3 = maxVar;
                }
                if ((i2 & 16) != 0) {
                    i4 = i3 & (-57345);
                    maxVar4 = maxVar3;
                    gdxVarR = yla.r(b0kVar3);
                    qim0Var5 = qim0Var4;
                } else {
                    i4 = i3;
                    qim0Var5 = qim0Var4;
                    maxVar4 = maxVar3;
                }
            }
            b0kVar3.s();
            tk1Var = tk1.c;
            zJ = u890.j(j7p1Var, tk1Var);
            rk1Var = rk1.c;
            if (zJ) {
                i5 = 2131886216;
            } else if (u890.j(j7p1Var, rk1Var)) {
                i5 = 2131886212;
            } else {
                i5 = 2131886215;
            }
            if (u890.j(j7p1Var, tk1Var)) {
                i6 = 2131886214;
            } else if (u890.j(j7p1Var, rk1Var)) {
                i6 = 2131886212;
            } else {
                i6 = 2131886213;
            }
            fcf0VarX = x(b0kVar3, i5);
            fcf0VarX2 = x(b0kVar3, i6);
            if (qk1Var == qk1.a) {
                fcf0Var = fcf0VarX;
            } else {
                fcf0Var = fcf0VarX2;
            }
            zG = b0kVar3.g(fcf0Var);
            objT = b0kVar3.T();
            if (zG) {
                objT = new kbf0();
                b0kVar3.s0(objT);
            } else {
                objT = new kbf0();
                b0kVar3.s0(objT);
            }
            kbf0Var = (kbf0) objT;
            zG2 = b0kVar3.g(fcf0VarX) | b0kVar3.g(fcf0VarX2);
            objT2 = b0kVar3.T();
            if (zG2) {
                objT2 = v8r.q(Boolean.TRUE);
                b0kVar3.s0(objT2);
            } else {
                objT2 = v8r.q(Boolean.TRUE);
                b0kVar3.s0(objT2);
            }
            ven0Var = (ven0) objT2;
            if (u890.j(j7p1Var, rk1Var)) {
                b0kVar3.i0(1950388170);
                boolean zI4 = b0kVar3.i(ven0Var) | b0kVar3.i(kbf0Var) | b0kVar3.i(fcf0VarX);
                if ((i4 & 14) == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zI2 = zI4 | z3 | b0kVar3.i(fcf0VarX2);
                Object objT6 = b0kVar3.T();
                if (zI2) {
                    fcf0Var2 = fcf0Var;
                    i7 = 1;
                    z4 = false;
                    ven0Var2 = ven0Var;
                    nk1Var2 = new nk1(kbf0Var, fcf0VarX, pk1Var, fcf0VarX2, ven0Var2, (lnm) null);
                    kbf0Var2 = kbf0Var;
                    b0kVar3.s0(nk1Var2);
                } else {
                    fcf0Var2 = fcf0Var;
                    i7 = 1;
                    z4 = false;
                    ven0Var2 = ven0Var;
                    nk1Var2 = new nk1(kbf0Var, fcf0VarX, pk1Var, fcf0VarX2, ven0Var2, (lnm) null);
                    kbf0Var2 = kbf0Var;
                    b0kVar3.s0(nk1Var2);
                }
                qxd0.s(qk1Var, kbf0Var2, (vu30) nk1Var2, b0kVar3);
                b0kVar3.r(z4);
                pk1Var2 = pk1Var;
                i8 = z4;
            } else {
                kbf0Var2 = kbf0Var;
                ven0Var2 = ven0Var;
                fcf0Var2 = fcf0Var;
                i7 = 1;
                i8 = 0;
                b0kVar3.i0(1950959841);
                if ((i4 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zI = b0kVar3.i(fcf0VarX) | z2 | b0kVar3.i(fcf0VarX2) | b0kVar3.i(ven0Var2) | b0kVar3.i(kbf0Var2);
                Object objT7 = b0kVar3.T();
                if (zI) {
                    pk1Var2 = pk1Var;
                    nk1Var = new nk1(pk1Var2, fcf0VarX, fcf0VarX2, kbf0Var2, ven0Var2, (lnm) null);
                    b0kVar3.s0(nk1Var);
                } else {
                    pk1Var2 = pk1Var;
                    nk1Var = new nk1(pk1Var2, fcf0VarX, fcf0VarX2, kbf0Var2, ven0Var2, (lnm) null);
                    b0kVar3.s0(nk1Var);
                }
                qxd0.s(qk1Var, kbf0Var2, (vu30) nk1Var, b0kVar3);
                b0kVar3.r(false);
            }
            String str3 = pk1Var2.d;
            if (str == null) {
                if (str != null) {
                    mmr0Var = new mmr0(2131951919, 2131951920);
                } else {
                    mmr0Var = new mmr0(2131951915, 2131951916);
                }
            } else if (str != null) {
                mmr0Var = new mmr0(2131951919, 2131951920);
            } else {
                mmr0Var = new mmr0(2131951915, 2131951916);
            }
            iIntValue = ((Number) mmr0Var.a).intValue();
            iIntValue2 = ((Number) mmr0Var.b).intValue();
            if (str == null) {
                if (str != null) {
                    i9 = i7;
                    strArr = new String[i9];
                    strArr[i8] = str;
                } else {
                    i9 = i7;
                    strArr = new String[i8];
                }
            } else if (str != null) {
                i9 = i7;
                strArr = new String[i9];
                strArr[i8] = str;
            } else {
                i9 = i7;
                strArr = new String[i8];
            }
            iOrdinal = qk1Var.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == i9) {
                    eg.o();
                    return;
                }
                iIntValue = iIntValue2;
            }
            strN0 = cwl1.n0(iIntValue, Arrays.copyOf(strArr, strArr.length), b0kVar3);
            zG3 = b0kVar3.g(strN0);
            objT3 = b0kVar3.T();
            if (zG3) {
                objT3 = new v1(strN0, (byte) 12);
                b0kVar3.s0(objT3);
            } else {
                objT3 = new v1(strN0, (byte) 12);
                b0kVar3.s0(objT3);
            }
            qim0 qim0VarB2 = s161.b(qim0Var5, i8, (iu30) objT3);
            pk1 pk1Var4 = pk1Var2;
            fcf0 fcf0Var4 = fcf0Var2;
            b0kVar2 = b0kVar3;
            dxo1.f(gbxVar, qim0VarB2, maxVar4, gdxVarR, apo.r(-151097339, new x2((Object) fcf0Var4, (Object) ven0Var2, (Object) pk1Var4, (Object) kbf0Var2, (byte) 14), b0kVar3), b0kVar2, ((i4 >> 3) & 14) | 1572864 | (i4 & 7168) | (57344 & i4), 36);
            qim0Var3 = qim0Var5;
            maxVar2 = maxVar4;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            maxVar2 = maxVar;
            qim0Var3 = qim0Var2;
        }
        gdxVar2 = gdxVarR;
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new j90(pk1Var, gbxVar, qim0Var3, maxVar2, gdxVar2, i, i2, (byte) 1);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:125:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:126:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:129:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:130:0x01df  */
    /* JADX WARN: Code duplicated, block: B:133:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:134:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:138:0x0206  */
    /* JADX WARN: Code duplicated, block: B:145:0x023d  */
    /* JADX WARN: Code duplicated, block: B:150:0x0246  */
    /* JADX WARN: Code duplicated, block: B:154:0x024d  */
    /* JADX WARN: Code duplicated, block: B:156:0x0250  */
    /* JADX WARN: Code duplicated, block: B:158:0x026e  */
    /* JADX WARN: Code duplicated, block: B:160:0x0271  */
    /* JADX WARN: Code duplicated, block: B:161:0x0289 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:162:0x028b  */
    /* JADX WARN: Code duplicated, block: B:163:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:165:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:166:0x02c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:167:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:168:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:171:0x0315  */
    /* JADX WARN: Code duplicated, block: B:173:0x031c  */
    /* JADX WARN: Code duplicated, block: B:174:0x0322  */
    /* JADX WARN: Code duplicated, block: B:177:0x0342  */
    /* JADX WARN: Code duplicated, block: B:179:0x034b  */
    /* JADX WARN: Code duplicated, block: B:180:0x034d  */
    /* JADX WARN: Code duplicated, block: B:183:0x0354 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:184:0x0356  */
    /* JADX WARN: Code duplicated, block: B:186:0x036e  */
    /* JADX WARN: Code duplicated, block: B:188:0x037a  */
    /* JADX WARN: Code duplicated, block: B:190:0x0381  */
    /* JADX WARN: Code duplicated, block: B:193:0x03ac A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:195:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:197:0x0408  */
    public static final void b(iu30 iu30Var, lz20 lz20Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Uri uri, String str, boolean z7, boolean z8, boolean z9, b0k b0kVar, int i) throws Throwable {
        int i2;
        int i3;
        x340 x340Var;
        boolean z10;
        boolean z11;
        int i4;
        int i5;
        String strK;
        boolean z12;
        boolean z13;
        int i6;
        boolean z14;
        boolean zI;
        Object objT;
        Throwable th;
        x340 x340Var2;
        boolean z15;
        iu30 iu30Var2;
        y7e1 y7e1Var;
        Function0 function0;
        boolean z16;
        boolean z17;
        boolean z18;
        int i7;
        int i8;
        Function0 function1;
        Throwable thR;
        nim0 nim0Var;
        Throwable th2;
        mbh mbhVarA;
        Function0 function2;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        kys0 kys0Var;
        boolean z19;
        Object objT2;
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(855880541);
        if ((i & 6) == 0) {
            i2 = (x340Var3.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var3.i(lz20Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var3.h(z) ? 256 : 128;
        }
        int i9 = i2;
        if ((i & 3072) == 0) {
            i3 = i9 | (x340Var3.h(z2) ? 2048 : 1024);
        } else {
            i3 = i9;
        }
        if ((i & 24576) == 0) {
            i3 |= x340Var3.h(z3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= x340Var3.h(z4) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= x340Var3.h(z5) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= x340Var3.h(z6) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= x340Var3.g(uri) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= x340Var3.g(str) ? 536870912 : 268435456;
        }
        int i10 = i3;
        if (x340Var3.Y(i10 & 1, ((i10 & 306783379) == 306783378 && ((((3072 | (x340Var3.h(z7) ? (char) 4 : (char) 2)) | (x340Var3.h(z8) ? ' ' : (char) 16)) | (x340Var3.h(z9) ? (char) 256 : (char) 128)) & 1171) == 1170) ? false : true)) {
            az20 az20Var = (az20) x340Var3.k(t4k.i);
            String strO0 = cwl1.o0(x340Var3, 2131958298);
            y7e1 y7e1VarD = c4p1.D(0, 3, null, x340Var3);
            Object objT3 = x340Var3.T();
            m4c m4cVar = fkj0.X;
            if (objT3 == m4cVar) {
                objT3 = c13.l(z8, x340Var3);
            }
            ven0 ven0Var = (ven0) objT3;
            Object objT4 = x340Var3.T();
            if (objT4 == m4cVar) {
                objT4 = bb00.h(1, x340Var3);
            }
            err0 err0Var = (hdn0) objT4;
            boolean zI2 = x340Var3.i(y7e1VarD);
            Object objT5 = x340Var3.T();
            if (zI2 || objT5 == m4cVar) {
                objT5 = new no70(y7e1VarD, (lnm) null, (byte) 4);
                x340Var3.s0(objT5);
            }
            qxd0.t(y7e1VarD, x340Var3, (vu30) objT5);
            boolean z20 = (ihc1.y0(y7e1VarD.d().d) && uri == null) ? false : true;
            boolean zG = vqo1.g(err0Var.s(), y7e1VarD.d().d.toString());
            if (z4) {
                z10 = zG;
                z11 = false;
                if (str == null || str.length() == 0) {
                    i4 = -2132474443;
                    i5 = 2131958300;
                } else {
                    x340Var3.i0(-2132475444);
                    x340Var3.r(false);
                    strK = str;
                }
                if ((57344 & i10) == 16384) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if ((i10 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean zH = z13 | z12 | x340Var3.h(z20);
                i6 = i10 & 14;
                if (i6 == 4) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zI = zH | z14 | x340Var3.i(y7e1VarD) | x340Var3.i(az20Var);
                objT = x340Var3.T();
                if (!zI || objT == m4cVar) {
                    th = null;
                    x340Var2 = x340Var3;
                    z15 = z20;
                    iu30Var2 = iu30Var;
                    cj80 cj80Var = new cj80(z3, z2, z15, iu30Var2, y7e1VarD, az20Var);
                    y7e1Var = y7e1VarD;
                    x340Var2.s0(cj80Var);
                    objT = cj80Var;
                } else {
                    y7e1Var = y7e1VarD;
                    z15 = z20;
                    th = null;
                    x340Var2 = x340Var3;
                    iu30Var2 = iu30Var;
                }
                function0 = (Function0) objT;
                if (z || z15) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                if (z5 || z15 || z3) {
                    z17 = false;
                } else {
                    z17 = true;
                }
                if (z15 || z3) {
                    z18 = false;
                } else {
                    z18 = true;
                }
                if (z6) {
                    x340Var2.i0(-1681578105);
                    thR = apo.r(1499603784, new d720(iu30Var2, (byte) 11), x340Var2);
                    i7 = 0;
                    x340Var2.r(false);
                } else {
                    i7 = 0;
                    if (z3) {
                        x340Var2.i0(-1681449920);
                        thR = apo.r(-1901085903, new d720(iu30Var2, (byte) 12), x340Var2);
                        x340Var2.r(false);
                    } else if (z18) {
                        x340Var2.i0(-1681313024);
                        i8 = 0;
                        function1 = function0;
                        thR = apo.r(520667856, new hy(z7, z2, (Object) ven0Var, (Object) iu30Var2, (cv30) function0, (byte) 15), x340Var2);
                        x340Var2.r(false);
                    } else {
                        i8 = 0;
                        function1 = function0;
                        if (z17) {
                            x340Var2.i0(-1680858316);
                            thR = apo.r(-1352545681, new st8(z16, z2, iu30Var2, (byte) 1), x340Var2);
                            x340Var2.r(false);
                        } else if (z16) {
                            x340Var2.i0(-1680322977);
                            thR = apo.r(1069208078, new zm9(iu30Var2, z2), x340Var2);
                            x340Var2.r(false);
                        } else {
                            x340Var2.i0(-1680209952);
                            x340Var2.r(false);
                            thR = th;
                        }
                    }
                    nim0Var = nim0.a;
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    th2 = thR;
                    mbhVarA = jbh.a(h36.c, een.P0, x340Var2, i8);
                    function2 = function1;
                    iHashCode = Long.hashCode(x340Var2.T);
                    xos0VarM = x340Var2.m();
                    qim0VarE = zr7.E(x340Var2, qim0VarF);
                    hzj.A.getClass();
                    if (x340Var2.a != null) {
                        tgp1.p();
                        throw th;
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
                    if (uri != null) {
                        x340Var2.i0(-988702286);
                        if (i6 == 4) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        objT2 = x340Var2.T();
                        if (z19 || objT2 == m4cVar) {
                            objT2 = new u460(iu30Var2, (byte) 29);
                            x340Var2.s0(objT2);
                        }
                        i(uri, (Function0) objT2, x340Var2, (i10 >> 24) & 14);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-988570629);
                        x340Var2.r(false);
                    }
                    if (th2 != null) {
                        kys0Var = kys0.b;
                    } else {
                        kys0Var = jys0.b;
                    }
                    kys0 kys0Var2 = kys0Var;
                    qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    cvx cvxVar2 = cbx.b(x340Var2).b;
                    cvx cvxVar3 = cbx.b(x340Var2).b;
                    qim0 qim0VarB = uyn1.B(qim0VarF2, 16.0f, 12.0f, 16.0f, 0.0f, 8);
                    if (z9 || z3) {
                        x340Var2.i0(-987911135);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-987993812);
                        Throwable thR2 = apo.r(358681027, new d720(iu30Var2, (byte) 10), x340Var2);
                        x340Var2.r(false);
                        th = thR2;
                    }
                    boolean z21 = z10;
                    String str2 = strK;
                    x340 x340Var4 = x340Var2;
                    rqo1.d(apo.r(1382916498, new aj80(z3, str2, function2, strO0, lz20Var, iu30Var2, y7e1Var, th2, err0Var, z21), x340Var2), qim0VarB, p7f.f, z21, th, null, kys0Var2, x340Var4, 6, 32);
                    x340Var = x340Var4;
                    x340Var.r(true);
                }
                i8 = i7;
                function1 = function0;
                nim0Var = nim0.a;
                qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
                th2 = thR;
                mbhVarA = jbh.a(h36.c, een.P0, x340Var2, i8);
                function2 = function1;
                iHashCode = Long.hashCode(x340Var2.T);
                xos0VarM = x340Var2.m();
                qim0VarE = zr7.E(x340Var2, qim0VarF3);
                hzj.A.getClass();
                if (x340Var2.a != null) {
                    tgp1.p();
                    throw th;
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
                if (uri != null) {
                    x340Var2.i0(-988702286);
                    if (i6 == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objT2 = x340Var2.T();
                    if (z19) {
                        objT2 = new u460(iu30Var2, (byte) 29);
                        x340Var2.s0(objT2);
                    } else {
                        objT2 = new u460(iu30Var2, (byte) 29);
                        x340Var2.s0(objT2);
                    }
                    i(uri, (Function0) objT2, x340Var2, (i10 >> 24) & 14);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-988570629);
                    x340Var2.r(false);
                }
                if (th2 != null) {
                    kys0Var = kys0.b;
                } else {
                    kys0Var = jys0.b;
                }
                kys0 kys0Var3 = kys0Var;
                qim0 qim0VarF4 = u291.f(nim0Var, 1.0f);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar4 = cbx.b(x340Var2).b;
                cvx cvxVar5 = cbx.b(x340Var2).b;
                cvx cvxVar6 = cbx.b(x340Var2).b;
                qim0 qim0VarB2 = uyn1.B(qim0VarF4, 16.0f, 12.0f, 16.0f, 0.0f, 8);
                if (z9) {
                    x340Var2.i0(-987911135);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-987911135);
                    x340Var2.r(false);
                }
                boolean z22 = z10;
                String str3 = strK;
                x340 x340Var5 = x340Var2;
                rqo1.d(apo.r(1382916498, new aj80(z3, str3, function2, strO0, lz20Var, iu30Var2, y7e1Var, th2, err0Var, z22), x340Var2), qim0VarB2, p7f.f, z22, th, null, kys0Var3, x340Var5, 6, 32);
                x340Var = x340Var5;
                x340Var.r(true);
            } else {
                i4 = -2132478757;
                z10 = zG;
                i5 = 2131958301;
                z11 = false;
            }
            strK = x0d.k(x340Var3, i4, i5, x340Var3, z11);
            if ((57344 & i10) == 16384) {
                z12 = true;
            } else {
                z12 = false;
            }
            if ((i10 & 7168) == 2048) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean zH2 = z13 | z12 | x340Var3.h(z20);
            i6 = i10 & 14;
            if (i6 == 4) {
                z14 = true;
            } else {
                z14 = false;
            }
            zI = zH2 | z14 | x340Var3.i(y7e1VarD) | x340Var3.i(az20Var);
            objT = x340Var3.T();
            if (zI) {
                th = null;
                x340Var2 = x340Var3;
                z15 = z20;
                iu30Var2 = iu30Var;
                cj80 cj80Var2 = new cj80(z3, z2, z15, iu30Var2, y7e1VarD, az20Var);
                y7e1Var = y7e1VarD;
                x340Var2.s0(cj80Var2);
                objT = cj80Var2;
            } else {
                th = null;
                x340Var2 = x340Var3;
                z15 = z20;
                iu30Var2 = iu30Var;
                cj80 cj80Var3 = new cj80(z3, z2, z15, iu30Var2, y7e1VarD, az20Var);
                y7e1Var = y7e1VarD;
                x340Var2.s0(cj80Var3);
                objT = cj80Var3;
            }
            function0 = (Function0) objT;
            if (z) {
                z16 = false;
            } else {
                z16 = false;
            }
            if (z5) {
                z17 = false;
            } else {
                z17 = false;
            }
            if (z15) {
                z18 = false;
            } else {
                z18 = false;
            }
            if (z6) {
                x340Var2.i0(-1681578105);
                thR = apo.r(1499603784, new d720(iu30Var2, (byte) 11), x340Var2);
                i7 = 0;
                x340Var2.r(false);
            } else {
                i7 = 0;
                if (z3) {
                    x340Var2.i0(-1681449920);
                    thR = apo.r(-1901085903, new d720(iu30Var2, (byte) 12), x340Var2);
                    x340Var2.r(false);
                } else if (z18) {
                    x340Var2.i0(-1681313024);
                    i8 = 0;
                    function1 = function0;
                    thR = apo.r(520667856, new hy(z7, z2, (Object) ven0Var, (Object) iu30Var2, (cv30) function0, (byte) 15), x340Var2);
                    x340Var2.r(false);
                } else {
                    i8 = 0;
                    function1 = function0;
                    if (z17) {
                        x340Var2.i0(-1680858316);
                        thR = apo.r(-1352545681, new st8(z16, z2, iu30Var2, (byte) 1), x340Var2);
                        x340Var2.r(false);
                    } else if (z16) {
                        x340Var2.i0(-1680322977);
                        thR = apo.r(1069208078, new zm9(iu30Var2, z2), x340Var2);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-1680209952);
                        x340Var2.r(false);
                        thR = th;
                    }
                }
                nim0Var = nim0.a;
                qim0 qim0VarF5 = u291.f(nim0Var, 1.0f);
                th2 = thR;
                mbhVarA = jbh.a(h36.c, een.P0, x340Var2, i8);
                function2 = function1;
                iHashCode = Long.hashCode(x340Var2.T);
                xos0VarM = x340Var2.m();
                qim0VarE = zr7.E(x340Var2, qim0VarF5);
                hzj.A.getClass();
                if (x340Var2.a != null) {
                    tgp1.p();
                    throw th;
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
                if (uri != null) {
                    x340Var2.i0(-988702286);
                    if (i6 == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objT2 = x340Var2.T();
                    if (z19) {
                        objT2 = new u460(iu30Var2, (byte) 29);
                        x340Var2.s0(objT2);
                    } else {
                        objT2 = new u460(iu30Var2, (byte) 29);
                        x340Var2.s0(objT2);
                    }
                    i(uri, (Function0) objT2, x340Var2, (i10 >> 24) & 14);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-988570629);
                    x340Var2.r(false);
                }
                if (th2 != null) {
                    kys0Var = kys0.b;
                } else {
                    kys0Var = jys0.b;
                }
                kys0 kys0Var4 = kys0Var;
                qim0 qim0VarF6 = u291.f(nim0Var, 1.0f);
                uwr uwrVar3 = cbx.a;
                cvx cvxVar7 = cbx.b(x340Var2).b;
                cvx cvxVar8 = cbx.b(x340Var2).b;
                cvx cvxVar9 = cbx.b(x340Var2).b;
                qim0 qim0VarB3 = uyn1.B(qim0VarF6, 16.0f, 12.0f, 16.0f, 0.0f, 8);
                if (z9) {
                    x340Var2.i0(-987911135);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-987911135);
                    x340Var2.r(false);
                }
                boolean z23 = z10;
                String str4 = strK;
                x340 x340Var6 = x340Var2;
                rqo1.d(apo.r(1382916498, new aj80(z3, str4, function2, strO0, lz20Var, iu30Var2, y7e1Var, th2, err0Var, z23), x340Var2), qim0VarB3, p7f.f, z23, th, null, kys0Var4, x340Var6, 6, 32);
                x340Var = x340Var6;
                x340Var.r(true);
            }
            i8 = i7;
            function1 = function0;
            nim0Var = nim0.a;
            qim0 qim0VarF7 = u291.f(nim0Var, 1.0f);
            th2 = thR;
            mbhVarA = jbh.a(h36.c, een.P0, x340Var2, i8);
            function2 = function1;
            iHashCode = Long.hashCode(x340Var2.T);
            xos0VarM = x340Var2.m();
            qim0VarE = zr7.E(x340Var2, qim0VarF7);
            hzj.A.getClass();
            if (x340Var2.a != null) {
                tgp1.p();
                throw th;
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
            if (uri != null) {
                x340Var2.i0(-988702286);
                if (i6 == 4) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                objT2 = x340Var2.T();
                if (z19) {
                    objT2 = new u460(iu30Var2, (byte) 29);
                    x340Var2.s0(objT2);
                } else {
                    objT2 = new u460(iu30Var2, (byte) 29);
                    x340Var2.s0(objT2);
                }
                i(uri, (Function0) objT2, x340Var2, (i10 >> 24) & 14);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-988570629);
                x340Var2.r(false);
            }
            if (th2 != null) {
                kys0Var = kys0.b;
            } else {
                kys0Var = jys0.b;
            }
            kys0 kys0Var5 = kys0Var;
            qim0 qim0VarF8 = u291.f(nim0Var, 1.0f);
            uwr uwrVar4 = cbx.a;
            cvx cvxVar10 = cbx.b(x340Var2).b;
            cvx cvxVar11 = cbx.b(x340Var2).b;
            cvx cvxVar12 = cbx.b(x340Var2).b;
            qim0 qim0VarB4 = uyn1.B(qim0VarF8, 16.0f, 12.0f, 16.0f, 0.0f, 8);
            if (z9) {
                x340Var2.i0(-987911135);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-987911135);
                x340Var2.r(false);
            }
            boolean z24 = z10;
            String str5 = strK;
            x340 x340Var7 = x340Var2;
            rqo1.d(apo.r(1382916498, new aj80(z3, str5, function2, strO0, lz20Var, iu30Var2, y7e1Var, th2, err0Var, z24), x340Var2), qim0VarB4, p7f.f, z24, th, null, kys0Var5, x340Var7, 6, 32);
            x340Var = x340Var7;
            x340Var.r(true);
        } else {
            x340Var = x340Var3;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bj80(iu30Var, lz20Var, z, z2, z3, z4, z5, z6, uri, str, z7, z8, z9, i);
        }
    }

    public static final void c(int i, Function0 function0, Function0 function1, b0k b0kVar, boolean z, boolean z2) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(63631727);
        byte b2 = 2;
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(function1) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            String strO0 = cwl1.o0(x340Var, 2131958309);
            boolean z3 = (i2 & 896) == 256;
            Object objT = x340Var.T();
            if (z3 || objT == fkj0.X) {
                objT = new xet(function0, (byte) 20);
                x340Var.s0(objT);
            }
            vqo1.a(z, (iu30) objT, apo.r(-1974911809, new mv8(z, strO0, b2), x340Var), apo.r(1635825182, new ie1(z2, function1, (byte) 7), x340Var), null, null, 0, 0.0f, null, x340Var, (i2 & 14) | 3456, 496);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cla(z, z2, function0, function1, i, (byte) 3);
        }
    }

    public static final void d(Function0 function0, b0k b0kVar, int i) {
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1665650605);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131958308);
            function1 = function0;
            j(blx.c, strO0, strO0, function1, false, null, x340Var, blx.d | ((i2 << 9) & 7168), 48);
        } else {
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vgz(function1, i, (byte) 21);
        }
    }

    public static final void e(e730 e730Var, iu30 iu30Var, gu8 gu8Var, b0k b0kVar, int i) {
        int i2;
        iu30 iu30Var2;
        b0k b0kVar2;
        String strN0;
        jax haxVar;
        m4c m4cVar = fkj0.X;
        String str = e730Var.b;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1230146765);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(e730Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            iu30Var2 = iu30Var;
            i2 |= b0kVar3.i(iu30Var2) ? 32 : 16;
        } else {
            iu30Var2 = iu30Var;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(gu8Var) ? 256 : 128;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            View view = (View) b0kVar3.k(AndroidCompositionLocals_androidKt.f);
            String strO0 = cwl1.o0(b0kVar3, 2131958510);
            if (e730Var.c) {
                b0kVar3.i0(-1653337910);
                strN0 = cwl1.n0(2131958509, new Object[]{str}, b0kVar3);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-1653224977);
                strN0 = cwl1.n0(2131958511, new Object[]{str}, b0kVar3);
                b0kVar3.r(false);
            }
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            qim0 qim0VarZ = uyn1.z(4.0f, 0.0f, 2, nim0.a);
            boolean zG = b0kVar3.g(strN0);
            Object objT = b0kVar3.T();
            if (zG || objT == m4cVar) {
                objT = new kq00(strN0, (byte) 20);
                b0kVar3.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarZ, false, (iu30) objT);
            if (e730Var.d) {
                b0kVar3.i0(1055060129);
                b0kVar3.r(false);
                haxVar = jax.a;
            } else {
                b0kVar3.i0(1055061621);
                haxVar = new hax(cwl1.o0(b0kVar3, 2131958508));
                b0kVar3.r(false);
            }
            jax jaxVar = haxVar;
            boolean zI = ((i2 & 14) == 4) | b0kVar3.i(gu8Var) | ((i2 & 112) == 32) | b0kVar3.i(view);
            Object objT2 = b0kVar3.T();
            if (zI || objT2 == m4cVar) {
                jzm jzmVar = new jzm(e730Var, gu8Var, iu30Var2, view, (byte) 18);
                b0kVar3.s0(jzmVar);
                objT2 = jzmVar;
            }
            Function0 function0 = (Function0) objT2;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                b0kVar2 = b0kVar3;
                jto1.b(qim0VarB, null, jaxVar, false, null, null, new gbx(new y50(strO0), function0), null, null, null, null, null, apo.r(800428294, new mp20(e730Var, (byte) 3), b0kVar3), null, null, apo.r(-1307359223, new z3y(strO0, (byte) 6), b0kVar3), b0kVar2, 0, 196992, 28602);
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ze10(e730Var, iu30Var, gu8Var, i, (byte) 7);
        }
    }

    public static final void f(String str, lee1 lee1Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1808181140);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(lee1Var) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = x340Var.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = bb00.h(0, x340Var);
            }
            err0 err0Var = (hdn0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == obj) {
                objT2 = bb00.h(0, x340Var);
            }
            err0 err0Var2 = (hdn0) objT2;
            wat watVar = (wat) x340Var.k(t4k.h);
            boolean z = x340Var.k(t4k.n) == flb0.b;
            boolean zH = x340Var.h(z) | ((i2 & 14) == 4);
            Object objT3 = x340Var.T();
            if (zH || objT3 == obj) {
                ye5 ye5Var = new ye5();
                if (z) {
                    ye5Var.g("\u2067");
                }
                ye5Var.g(str);
                if (z) {
                    ye5Var.g("\u2069");
                }
                ye5Var.g(" ");
                z6p1.r(ye5Var, "aiPersonaBadge", "�");
                objT3 = ye5Var.p();
                x340Var.s0(objT3);
            }
            af5 af5Var = (af5) objT3;
            err0 err0Var3 = err0Var;
            err0 err0Var4 = err0Var2;
            boolean zE = x340Var.e(err0Var3.s()) | x340Var.e(err0Var4.s()) | x340Var.g(watVar);
            Object objT4 = x340Var.T();
            if (zE || objT4 == obj) {
                objT4 = (err0Var3.s() <= 0 || err0Var4.s() <= 0) ? dqs0.e : mqo1.t(new mmr0("aiPersonaBadge", new gh80(new d6t0(4, watVar.s(watVar.M0(err0Var3.s())), watVar.s(watVar.M0(err0Var4.s()))), dii.b)));
                x340Var.s0(objT4);
            }
            cqs0 cqs0Var = (cqs0) objT4;
            Object objT5 = x340Var.T();
            if (objT5 == obj) {
                objT5 = new g2(err0Var, err0Var2, (byte) 3);
                x340Var.s0(objT5);
            }
            gfh0 gfh0Var = (gfh0) objT5;
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, nim0.a);
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
            nko1.H(gfh0Var, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            k1u.a((qim0) null, 2, 0, (Function0) null, x340Var, 48, 13);
            uwo1.f(af5Var, qim0Var, lee1Var, null, null, null, 2, false, new cjc0(2), 0, null, cqs0Var, x340Var, ((i2 << 3) & 896) | ((i2 >> 3) & 112), 0, 1720);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new h2(str, lee1Var, qim0Var, i, (byte) 1);
        }
    }

    public static final void g(int i, Function0 function0, b0k b0kVar, boolean z) {
        Function0 function1;
        boolean z2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-722915185);
        int i2 = (x340Var.h(z) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131958299);
            function1 = function0;
            z2 = z;
            j(wox.c, strO0, strO0, function1, z2, cwl1.o0(x340Var, 2131958305), x340Var, wox.d | ((i2 << 6) & 7168) | ((i2 << 12) & 57344), 0);
        } else {
            function1 = function0;
            z2 = z;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ie1((byte) 8, i, function1, z2);
        }
    }

    public static final void h(y120 y120Var, int i, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i2) {
        qim0 qim0Var2;
        String strB;
        iu30 iu30Var2 = iu30Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1097777131);
        j06 j06Var = x340Var.a;
        int i3 = i2 | (x340Var.g(y120Var) ? 4 : 2) | (x340Var.e(i) ? 32 : 16) | (x340Var.i(iu30Var2) ? 256 : 128) | 3072;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = bb00.h(i, x340Var);
            }
            err0 err0Var = (hdn0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = new mju();
                x340Var.s0(objT2);
            }
            mju mjuVar = (mju) objT2;
            err0 err0Var2 = err0Var;
            int iS = err0Var2.s();
            String str = y120Var.e;
            String str2 = y120Var.f;
            if (str == null) {
                strB = String.valueOf(iS);
            } else {
                LinkedHashMap linkedHashMapM = sqg0.M(new mmr0[]{new mmr0("value", String.valueOf(iS))});
                if (str2.length() > 0) {
                    linkedHashMapM.put("unit", str2);
                }
                mjuVar.getClass();
                strB = mju.b(str, linkedHashMapM);
            }
            String str3 = strB;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarZ = uyn1.z(0.0f, cbx.b(x340Var).b.a, 1, qim0VarF);
            era eraVar = een.Q0;
            mbh mbhVarA = jbh.a(h36.e, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
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
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = pzo0.T0;
                x340Var.s0(objT3);
            }
            qim0 qim0VarA = s161.a(qim0Var3, (iu30) objT3);
            mbh mbhVarA2 = jbh.a(h36.c, eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarA);
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
            String strValueOf = String.valueOf(err0Var2.s());
            lee1 lee1VarA = lee1.a(cbx.d(x340Var).a, 0L, cbx.b(x340Var).a.j, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213);
            long j = cbx.a(x340Var).b.a;
            a0e1 a0e1Var = new a0e1(3);
            yfu yfuVar = ajx.a;
            Object obj = yfuVar.b;
            gxo1.c(strValueOf, null, lee1VarA, j, a0e1Var, 0, false, null, null, 150.0f, (FontWeight) ((bjx) yfuVar.c).f, null, x340Var, 0, 0, 2530);
            uwo1.e(y120Var.f, null, cbx.d(x340Var).h, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            x340Var = x340Var;
            x340Var.r(true);
            int iS2 = err0Var2.s();
            tr80 tr80Var = new tr80(y120Var.b, y120Var.c, 1);
            int i4 = y120Var.d;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0Var3, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            boolean zI = x340Var.i(err0Var) | ((i3 & 896) == 256);
            Object objT4 = x340Var.T();
            if (zI || objT4 == m4cVar) {
                iu30Var2 = iu30Var;
                objT4 = new rj0(iu30Var2, err0Var, (byte) 2);
                x340Var.s0(objT4);
            } else {
                iu30Var2 = iu30Var;
            }
            f7p1.b(iS2, tr80Var, i4, i4, (iu30) objT4, qim0VarB, 3, (iu30) null, (iu30) null, str3, x340Var, 1572864);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jmk0(y120Var, i, iu30Var2, qim0Var2, i2);
        }
    }

    public static final void i(Uri uri, Function0 function0, b0k b0kVar, int i) {
        int i2;
        byte b2;
        h311 h311VarV;
        dj80 dj80Var;
        m4c m4cVar = fkj0.X;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1973707810);
        j06 j06Var = ((x340) b0kVar2).a;
        if ((i & 6) == 0) {
            i2 = (b0kVar2.g(uri) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar2.i(function0) ? 32 : 16;
        }
        int i3 = i2;
        if (b0kVar2.Y(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) b0kVar2.k(AndroidCompositionLocals_androidKt.b);
            String strO0 = cwl1.o0(b0kVar2, 2131958303);
            boolean zI = ((i3 & 14) == 4) | b0kVar2.i(context);
            Object objT = b0kVar2.T();
            if (zI || objT == m4cVar) {
                objT = new fj80(context, uri, (lnm) null, (byte) 0);
                b0kVar2.s0(objT);
            }
            Bitmap bitmap = (Bitmap) yto.p(null, uri, (vu30) objT, b0kVar2, ((i3 << 3) & 112) | 6).getValue();
            if (bitmap == null) {
                h311VarV = b0kVar2.v();
                if (h311VarV == null) {
                    return;
                } else {
                    dj80Var = new dj80(uri, function0, i, (byte) 1);
                }
            } else {
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(b0kVar2).b;
                cvx cvxVar2 = cbx.b(b0kVar2).b;
                nim0 nim0Var = nim0.a;
                qim0 qim0VarB = uyn1.B(nim0Var, 16.0f, 16.0f, 0.0f, 0.0f, 12);
                gfh0 gfh0VarC = t1c.c(een.d, false);
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
                nko1.H(gfh0VarC, b0kVar2, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, b0kVar2, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, b0kVar2, lljVar3);
                nko1.F(b0kVar2);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, b0kVar2, lljVar4);
                cwl1.g(new yk4(bitmap), cwl1.o0(b0kVar2, 2131958297), i1p1.q(u291.r(nim0Var, 96.0f), er31.b(8.0f)), mif1.P0, 0, b0kVar2, 0, 232);
                qim0 qim0VarR = u291.r(eqr0.C(h2c.a.a(nim0Var, een.f), 4.0f, -4.0f), 20.0f);
                boolean zG = b0kVar2.g(strO0);
                Object objT2 = b0kVar2.T();
                if (zG || objT2 == m4cVar) {
                    objT2 = new ry40(strO0, (byte) 16);
                    b0kVar2.s0(objT2);
                }
                qim0 qim0VarF = dug.f(s161.b(qim0VarR, true, (iu30) objT2), cbx.a(b0kVar2).a.a.a(), er31.a);
                pm31 pm31Var = new pm31(0);
                boolean z2 = (i3 & 112) == 32;
                Object objT3 = b0kVar2.T();
                if (z2 || objT3 == m4cVar) {
                    objT3 = new j160(function0, (byte) 8);
                    b0kVar2.s0(objT3);
                }
                qim0 qim0VarX = bin.x(qim0VarF, false, strO0, pm31Var, null, (Function0) objT3, 9);
                gfh0 gfh0VarC2 = t1c.c(een.h, false);
                int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
                xos0 xos0VarM2 = b0kVar2.m();
                qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarX);
                b0kVar2.m0();
                if (((x340) b0kVar2).S) {
                    b0kVar2.l(n4kVar);
                } else {
                    b0kVar2.v0();
                }
                nko1.H(gfh0VarC2, b0kVar2, lljVar);
                nko1.H(xos0VarM2, b0kVar2, lljVar2);
                x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
                nko1.H(qim0VarE2, b0kVar2, lljVar4);
                b0kVar2 = b0kVar2;
                b2 = 0;
                w0h1.a(fux.c, isl.a, u291.r(nim0Var, 12.0f), cbx.a(b0kVar2).b.a, 0L, false, b0kVar2, fux.d | 48, 48);
                b0kVar2.r(true);
                b0kVar2.r(true);
            }
            h311VarV.d = dj80Var;
        }
        b2 = 0;
        b0kVar2.b0();
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            dj80Var = new dj80(uri, function0, i, b2);
            h311VarV.d = dj80Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:78:0x00de  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:88:0x013d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0143  */
    /* JADX WARN: Code duplicated, block: B:93:0x0150  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    public static final void j(hux huxVar, String str, String str2, Function0 function0, boolean z, String str3, b0k b0kVar, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        String str4;
        int i5;
        boolean z3;
        b0k b0kVar2;
        boolean z4;
        String str5;
        h311 h311VarV;
        boolean z5;
        String str6;
        boolean z6;
        Object objT;
        Function0 function1;
        jax haxVar;
        String str7;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-372586287);
        byte b2 = 4;
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? b0kVar3.g(huxVar) : b0kVar3.i(huxVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar3.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= b0kVar3.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= b0kVar3.i(function0) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 == 0) {
            if ((i & 24576) == 0) {
                z2 = z;
                i3 |= b0kVar3.h(z2) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    str4 = str3;
                    if (b0kVar3.g(str4)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i3 |= i5;
                }
                if ((74899 & i3) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (b0kVar3.Y(i3 & 1, z3)) {
                    if (i6 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i4 != 0) {
                        str6 = null;
                    } else {
                        str6 = str4;
                    }
                    z6 = (i3 & 7168) == 2048;
                    objT = b0kVar3.T();
                    if (z6 || objT == fkj0.X) {
                        objT = new j160(function0, (byte) 9);
                        b0kVar3.s0(objT);
                    }
                    function1 = (Function0) objT;
                    if (!ihc1.y0(str2)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return;
                    }
                    gbx gbxVar = new gbx(new y50(str2), function1);
                    ldx ldxVar = ldx.c;
                    if (z5) {
                        haxVar = jax.a;
                    } else {
                        if (str6 == null) {
                            str7 = str;
                        } else {
                            str7 = str6;
                        }
                        haxVar = new hax(str7);
                    }
                    jax jaxVar = haxVar;
                    gdx gdxVarS = yla.s(b0kVar3);
                    uwr uwrVar = cbx.a;
                    mta mtaVar = cbx.b(b0kVar3).d;
                    qim0 qim0VarR = u291.r(nim0.a, 32.0f);
                    cvx cvxVar = cbx.b(b0kVar3).b;
                    b0kVar2 = b0kVar3;
                    wro1.h(gbxVar, ldxVar, qim0VarR, jaxVar, gdxVarS, new zzq0(4.0f, 4.0f, 4.0f, 4.0f), false, null, null, apo.r(-908623448, new cp9(huxVar, str, b2), b0kVar3), b0kVar2, 12582912, 6, 776);
                    z4 = z5;
                    str5 = str6;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    z4 = z2;
                    str5 = str4;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new yc5(huxVar, str, str2, function0, z4, str5, i, i2);
                }
            }
            i3 |= 196608;
            str4 = str3;
            if ((74899 & i3) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (b0kVar3.Y(i3 & 1, z3)) {
                if (i6 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i4 != 0) {
                    str6 = null;
                } else {
                    str6 = str4;
                }
                if ((i3 & 7168) == 2048) {
                }
                objT = b0kVar3.T();
                if (z6) {
                    objT = new j160(function0, (byte) 9);
                    b0kVar3.s0(objT);
                } else {
                    objT = new j160(function0, (byte) 9);
                    b0kVar3.s0(objT);
                }
                function1 = (Function0) objT;
                if (!ihc1.y0(str2)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                gbx gbxVar2 = new gbx(new y50(str2), function1);
                ldx ldxVar2 = ldx.c;
                if (z5) {
                    haxVar = jax.a;
                } else {
                    if (str6 == null) {
                        str7 = str;
                    } else {
                        str7 = str6;
                    }
                    haxVar = new hax(str7);
                }
                jax jaxVar2 = haxVar;
                gdx gdxVarS2 = yla.s(b0kVar3);
                uwr uwrVar2 = cbx.a;
                mta mtaVar2 = cbx.b(b0kVar3).d;
                qim0 qim0VarR2 = u291.r(nim0.a, 32.0f);
                cvx cvxVar2 = cbx.b(b0kVar3).b;
                b0kVar2 = b0kVar3;
                wro1.h(gbxVar2, ldxVar2, qim0VarR2, jaxVar2, gdxVarS2, new zzq0(4.0f, 4.0f, 4.0f, 4.0f), false, null, null, apo.r(-908623448, new cp9(huxVar, str, b2), b0kVar3), b0kVar2, 12582912, 6, 776);
                z4 = z5;
                str5 = str6;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                z4 = z2;
                str5 = str4;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new yc5(huxVar, str, str2, function0, z4, str5, i, i2);
            }
        }
        i3 |= 24576;
        z2 = z;
        i4 = i2 & 32;
        if (i4 != 0) {
            if ((196608 & i) == 0) {
                str4 = str3;
                if (b0kVar3.g(str4)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i3 |= i5;
            }
            if ((74899 & i3) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (b0kVar3.Y(i3 & 1, z3)) {
                if (i6 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i4 != 0) {
                    str6 = null;
                } else {
                    str6 = str4;
                }
                if ((i3 & 7168) == 2048) {
                }
                objT = b0kVar3.T();
                if (z6) {
                    objT = new j160(function0, (byte) 9);
                    b0kVar3.s0(objT);
                } else {
                    objT = new j160(function0, (byte) 9);
                    b0kVar3.s0(objT);
                }
                function1 = (Function0) objT;
                if (!ihc1.y0(str2)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                gbx gbxVar3 = new gbx(new y50(str2), function1);
                ldx ldxVar3 = ldx.c;
                if (z5) {
                    haxVar = jax.a;
                } else {
                    if (str6 == null) {
                        str7 = str;
                    } else {
                        str7 = str6;
                    }
                    haxVar = new hax(str7);
                }
                jax jaxVar3 = haxVar;
                gdx gdxVarS3 = yla.s(b0kVar3);
                uwr uwrVar3 = cbx.a;
                mta mtaVar3 = cbx.b(b0kVar3).d;
                qim0 qim0VarR3 = u291.r(nim0.a, 32.0f);
                cvx cvxVar3 = cbx.b(b0kVar3).b;
                b0kVar2 = b0kVar3;
                wro1.h(gbxVar3, ldxVar3, qim0VarR3, jaxVar3, gdxVarS3, new zzq0(4.0f, 4.0f, 4.0f, 4.0f), false, null, null, apo.r(-908623448, new cp9(huxVar, str, b2), b0kVar3), b0kVar2, 12582912, 6, 776);
                z4 = z5;
                str5 = str6;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                z4 = z2;
                str5 = str4;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new yc5(huxVar, str, str2, function0, z4, str5, i, i2);
            }
        }
        i3 |= 196608;
        str4 = str3;
        if ((74899 & i3) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (b0kVar3.Y(i3 & 1, z3)) {
            if (i6 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            if (i4 != 0) {
                str6 = null;
            } else {
                str6 = str4;
            }
            if ((i3 & 7168) == 2048) {
            }
            objT = b0kVar3.T();
            if (z6) {
                objT = new j160(function0, (byte) 9);
                b0kVar3.s0(objT);
            } else {
                objT = new j160(function0, (byte) 9);
                b0kVar3.s0(objT);
            }
            function1 = (Function0) objT;
            if (!ihc1.y0(str2)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar4 = new gbx(new y50(str2), function1);
            ldx ldxVar4 = ldx.c;
            if (z5) {
                haxVar = jax.a;
            } else {
                if (str6 == null) {
                    str7 = str;
                } else {
                    str7 = str6;
                }
                haxVar = new hax(str7);
            }
            jax jaxVar4 = haxVar;
            gdx gdxVarS4 = yla.s(b0kVar3);
            uwr uwrVar4 = cbx.a;
            mta mtaVar4 = cbx.b(b0kVar3).d;
            qim0 qim0VarR4 = u291.r(nim0.a, 32.0f);
            cvx cvxVar4 = cbx.b(b0kVar3).b;
            b0kVar2 = b0kVar3;
            wro1.h(gbxVar4, ldxVar4, qim0VarR4, jaxVar4, gdxVarS4, new zzq0(4.0f, 4.0f, 4.0f, 4.0f), false, null, null, apo.r(-908623448, new cp9(huxVar, str, b2), b0kVar3), b0kVar2, 12582912, 6, 776);
            z4 = z5;
            str5 = str6;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            z4 = z2;
            str5 = str4;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new yc5(huxVar, str, str2, function0, z4, str5, i, i2);
        }
    }

    public static final void k(boolean z, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1334592667);
        byte b2 = 2;
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z2 = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new ijd0(iu30Var, (byte) 5);
                x340Var.s0(objT);
            }
            mqo1.e((Function0) objT, null, null, cxi.a, cxi.b, apo.r(-345777379, new zm9(iu30Var, z, b2), x340Var), apo.r(2135397214, new d720(iu30Var, (byte) 26), x340Var), x340Var, 1797120, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new a30((byte) 3, i, iu30Var, z);
        }
    }

    public static final void l(int i, Function0 function0, b0k b0kVar, boolean z) {
        jax haxVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2995633);
        int i2 = (x340Var.h(z) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131958302);
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO0), function0);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = g070.T0;
                x340Var.s0(objT);
            }
            vu30 vu30Var = (vu30) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = g070.U0;
                x340Var.s0(objT2);
            }
            hdx hdxVar = new hdx(0, vu30Var, (vu30) objT2, (vu30) null, (hw61) null, 25);
            if (z) {
                x340Var.i0(1416177123);
                x340Var.r(false);
                haxVar = jax.a;
            } else {
                x340Var.i0(1416178618);
                haxVar = new hax(cwl1.o0(x340Var, 2131958305));
                x340Var.r(false);
            }
            wro1.h(gbxVar, hdxVar, null, haxVar, yla.s(x340Var), null, false, null, null, apo.r(1422646182, new dz40(strO0, (byte) 10), x340Var), x340Var, 12582912, 6, 844);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ie1((byte) 9, i, function0, z);
        }
    }

    public static final void m(vb21 vb21Var, k811 k811Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1789933639);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(vb21Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(k811Var) : x340Var.i(k811Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            WeakHashMap weakHashMap = osl1.x;
            irn1.u(qim0VarD, fdj.b, null, new bgc0(lhc.g(x340Var).g, 32), apo.r(1761446208, new hho0(vb21Var, k811Var, iu30Var, (byte) 28), x340Var), x340Var, 24624, 4);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lzs0(vb21Var, k811Var, qim0Var2, iu30Var, i, (byte) 25);
        }
    }

    public static final void n(boolean z, boolean z2, boolean z3, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        Function0 function2;
        Function0 function3;
        boolean z4;
        boolean z5;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1482486708);
        int i2 = (x340Var.h(z) ? 4 : 2) | i | (x340Var.h(z2) ? 32 : 16) | (x340Var.h(z3) ? 256 : 128) | (x340Var.i(function0) ? 2048 : 1024) | (x340Var.i(function1) ? 16384 : 8192);
        if (!x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            function2 = function1;
            function3 = function0;
            z4 = z3;
            z5 = z2;
            x340Var.b0();
        } else if (z) {
            x340Var.i0(-386994910);
            function2 = function1;
            c((i2 >> 3) & 8190, function0, function2, x340Var, z2, z3);
            function3 = function0;
            z5 = z2;
            z4 = z3;
            x340Var.r(false);
        } else {
            function2 = function1;
            function3 = function0;
            z4 = z3;
            z5 = z2;
            x340Var.i0(-386821434);
            o(((i2 >> 6) & 14) | ((i2 >> 9) & 112), function2, x340Var, z4);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gj80(z, z5, z4, function3, function2, i);
        }
    }

    public static final void o(int i, Function0 function0, b0k b0kVar, boolean z) {
        int i2;
        jax haxVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(842146693);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131958304);
            boolean z2 = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new j160(function0, (byte) 10);
                x340Var.s0(objT);
            }
            Function0 function1 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO0), function1);
            idx idxVar = new idx();
            if (z) {
                x340Var.i0(1488462935);
                x340Var.r(false);
                haxVar = jax.a;
            } else {
                x340Var.i0(1488508691);
                haxVar = new hax(cwl1.o0(x340Var, 2131958305));
                x340Var.r(false);
            }
            gdx gdxVarS = yla.s(x340Var);
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var).d;
            qim0 qim0VarR = u291.r(nim0.a, 32.0f);
            cvx cvxVar = cbx.b(x340Var).b;
            wro1.h(gbxVar, idxVar, qim0VarR, haxVar, gdxVarS, new zzq0(4.0f, 4.0f, 4.0f, 4.0f), false, null, null, apo.r(-753215538, new dz40(strO0, (byte) 11), x340Var), x340Var, 12582912, 6, 776);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new u2y((byte) 1, i, function0, z);
        }
    }

    public static final void p(zb81 zb81Var, kb81 kb81Var, kls0 kls0Var, et90 et90Var, u961 u961Var, s24 s24Var, j7a1 j7a1Var, qim0 qim0Var, b0k b0kVar, int i) {
        zb81 zb81Var2;
        qim0 qim0Var2;
        x340 x340Var;
        qim0 qim0Var3;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-520432891);
        int i2 = i | (x340Var2.g(zb81Var) ? 4 : 2) | (x340Var2.i(kb81Var) ? 32 : 16) | (x340Var2.i(kls0Var) ? 256 : 128) | (x340Var2.i(et90Var) ? 2048 : 1024) | (x340Var2.i(u961Var) ? 16384 : 8192) | (x340Var2.i(s24Var) ? 131072 : 65536) | (x340Var2.i(j7a1Var) ? 1048576 : 524288) | (x340Var2.i(qim0Var) ? 8388608 : 4194304);
        if (x340Var2.Y(i2 & 1, (4793491 & i2) != 4793490)) {
            if (zb81Var instanceof wb81) {
                x340Var2.i0(-1919786215);
                otw.c(kls0Var, zb81Var, qim0Var, (ipb1) null, x340Var2, ((i2 >> 6) & 14) | ((i2 << 3) & 112) | ((i2 >> 15) & 896), 8);
                zb81Var2 = zb81Var;
                qim0Var3 = qim0Var;
                x340Var2.r(false);
                x340Var = x340Var2;
            } else {
                zb81Var2 = zb81Var;
                qim0Var3 = qim0Var;
                if (zb81Var2 instanceof ub81) {
                    x340Var2.i0(-1919781931);
                    ub81 ub81Var = (ub81) zb81Var2;
                    boolean zI = x340Var2.i(kb81Var);
                    Object objT = x340Var2.T();
                    if (zI || objT == m4cVar) {
                        x340Var = x340Var2;
                        d061 d061Var = new d061(1, kb81Var, kb81.class, "onShortcutTapped", "onShortcutTapped(Ljava/lang/String;)V", 0, (byte) 7);
                        x340Var.s0(d061Var);
                        objT = d061Var;
                    } else {
                        x340Var = x340Var2;
                    }
                    z5p1.i(ub81Var, (iu30) objT, qim0Var3, x340Var, (i2 & 14) | ((i2 >> 15) & 896));
                    x340Var.r(false);
                } else {
                    x340Var = x340Var2;
                    if (zb81Var2 instanceof qb81) {
                        x340Var.i0(-1919775604);
                        qb81 qb81Var = (qb81) zb81Var2;
                        boolean zI2 = x340Var.i(kb81Var);
                        Object objT2 = x340Var.T();
                        if (zI2 || objT2 == m4cVar) {
                            d061 d061Var2 = new d061(1, kb81Var, kb81.class, "onBenefitsHeaderExploreAllTapped", "onBenefitsHeaderExploreAllTapped(Ljava/lang/String;)V", 0, (byte) 8);
                            x340Var.s0(d061Var2);
                            objT2 = d061Var2;
                        }
                        d9p1.b(qb81Var, (iu30) objT2, qim0Var3, x340Var, (i2 & 14) | ((i2 >> 15) & 896));
                        x340Var.r(false);
                    } else if (zb81Var2 instanceof rb81) {
                        x340Var.i0(-1919768734);
                        int i3 = i2 >> 9;
                        zgo1.b((rb81) zb81Var2, u961Var, s24Var, qim0Var3, x340Var, (i2 & 14) | (i3 & 112) | (i3 & 896) | ((i2 >> 12) & 7168));
                        x340Var.r(false);
                        qim0Var2 = qim0Var;
                    } else if ((zb81Var2 instanceof xb81) || (zb81Var2 instanceof yb81)) {
                        qim0Var2 = qim0Var;
                        x340Var = x340Var;
                        x340Var.i0(-1919756151);
                        x340Var.r(false);
                    } else if (zb81Var2 instanceof tb81) {
                        x340Var.i0(-1919754180);
                        otw.c(et90Var, new fmd0((tb81) zb81Var2), qim0Var, (ipb1) null, x340Var, ((i2 >> 9) & 14) | ((i2 >> 15) & 896), 8);
                        x340Var.r(false);
                        qim0Var2 = qim0Var;
                        x340Var = x340Var;
                    } else if (zb81Var2 instanceof vb81) {
                        x340Var.i0(-1919747890);
                        otw.c(j7a1Var, new h7a1((vb81) zb81Var2), qim0Var, (ipb1) null, x340Var, ((i2 >> 18) & 14) | ((i2 >> 15) & 896), 8);
                        qim0Var2 = qim0Var;
                        x340Var = x340Var;
                        x340Var.r(false);
                    } else {
                        qim0Var2 = qim0Var;
                        if (!(zb81Var2 instanceof sb81)) {
                            x340Var = x340Var;
                            throw p3d1.k(x340Var, -1919786961, false);
                        }
                        x340Var.i0(-1919741798);
                        sb81 sb81Var = (sb81) zb81Var2;
                        boolean zI3 = x340Var.i(kb81Var);
                        Object objT3 = x340Var.T();
                        if (zI3 || objT3 == m4cVar) {
                            x340Var = x340Var;
                            d061 d061Var3 = new d061(1, kb81Var, kb81.class, "onBottomCtaButtonTapped", "onBottomCtaButtonTapped(Ljava/lang/String;)V", 0, (byte) 9);
                            x340Var.s0(d061Var3);
                            objT3 = d061Var3;
                        }
                        rjo1.a(sb81Var, (iu30) objT3, qim0Var2, x340Var, (i2 & 14) | ((i2 >> 15) & 896));
                        x340Var.r(false);
                    }
                }
            }
            qim0Var2 = qim0Var3;
        } else {
            zb81Var2 = zb81Var;
            qim0Var2 = qim0Var;
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wy51((Object) zb81Var2, (Object) kb81Var, (Object) kls0Var, (Object) et90Var, (Object) u961Var, (Object) s24Var, (Object) j7a1Var, (Object) qim0Var2, i, (byte) 2);
        }
    }

    public static final void q(Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1247568578);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131958306);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new j160(function0, (byte) 11);
                x340Var.s0(objT);
            }
            Function0 function1 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO0), function1);
            idx idxVar = new idx();
            gdx gdxVarS = yla.s(x340Var);
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var).d;
            qim0 qim0VarR = u291.r(nim0.a, 32.0f);
            cvx cvxVar = cbx.b(x340Var).b;
            wro1.h(gbxVar, idxVar, qim0VarR, null, gdxVarS, new zzq0(4.0f, 4.0f, 4.0f, 4.0f), false, null, null, apo.r(-112749237, new dz40(strO0, (byte) 12), x340Var), x340Var, 12582912, 6, 792);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vgz(function0, i, (byte) 22);
        }
    }

    public static final void r(Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1007085503);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131958307);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new j160(function0, (byte) 12);
                x340Var.s0(objT);
            }
            Function0 function1 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO0), function1);
            idx idxVar = new idx();
            gdx gdxVarS = yla.s(x340Var);
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var).d;
            qim0 qim0VarR = u291.r(nim0.a, 32.0f);
            cvx cvxVar = cbx.b(x340Var).b;
            wro1.h(gbxVar, idxVar, qim0VarR, null, gdxVarS, new zzq0(4.0f, 4.0f, 4.0f, 4.0f), false, null, null, apo.r(-227264808, new dz40(strO0, (byte) 13), x340Var), x340Var, 12582912, 6, 792);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vgz(function0, i, (byte) 23);
        }
    }

    public static final void s(iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1196783676);
        int i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            uwo1.d(wmo1.A(2131961192, 2131961191, "https://support.spotify.com/article/managed-accounts-for-premium-family/plain/", new zma1(cbx.a(x340Var).b.c, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.c, (Shadow) null, (PlatformSpanStyle) null, 61438), iu30Var, x340Var, ((i2 << 12) & 57344) | 384, 0), cbx.a(x340Var).b.b, u291.f(nim0.a, 1.0f), cbx.d(x340Var).j, null, null, 0, false, null, 0, null, null, x340Var, 0, 0, 4080);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new iuy0(iu30Var, i, (byte) 8);
        }
    }

    public static e5l0 t(r6h1 r6h1Var) {
        return new e5l0(r6h1Var, (byte) 0);
    }

    public static final tl7 u(View view) {
        return (tl7) z561.W(z561.f0(eak1.g, z561.c0(eak1.f, view)));
    }

    public static DecimalFormatSymbols v(Locale locale) {
        return DecimalFormatSymbols.getInstance(locale);
    }

    public static final boolean w(hia hiaVar) {
        return hiaVar.c == 1 && hiaVar.e > 0.0f;
    }

    public static final fcf0 x(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
        boolean zG = x340Var.g(context) | x340Var.e(i);
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            objT = kcf0.f(i, context, kcf0.l(context, i)).a;
            x340Var.s0(objT);
        }
        return (fcf0) objT;
    }

    public static final int y(hia hiaVar) {
        return jch0.U(hiaVar.a * 1000.0f);
    }

    public static final mlh z(som somVar) {
        String str;
        lum lumVar = somVar.c;
        lum lumVar2 = lumVar instanceof lum ? lumVar : null;
        if (lumVar2 == null || (str = somVar.d) == null) {
            return null;
        }
        return new mlh(somVar.a, str, lumVar2.c, somVar.e);
    }
}
