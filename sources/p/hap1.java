package p;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class hap1 {
    public static b180 a;
    public static b180 b;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:100:0x0184  */
    /* JADX WARN: Code duplicated, block: B:102:0x0190  */
    /* JADX WARN: Code duplicated, block: B:104:0x019a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:105:0x019c  */
    /* JADX WARN: Code duplicated, block: B:108:0x01ac A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:116:0x01db  */
    /* JADX WARN: Code duplicated, block: B:119:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:120:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:123:0x01fb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:126:0x0200  */
    /* JADX WARN: Code duplicated, block: B:128:0x0216  */
    /* JADX WARN: Code duplicated, block: B:130:0x0220  */
    /* JADX WARN: Code duplicated, block: B:132:0x0233  */
    /* JADX WARN: Code duplicated, block: B:134:0x0237  */
    /* JADX WARN: Code duplicated, block: B:136:0x0245  */
    /* JADX WARN: Code duplicated, block: B:137:0x0248  */
    /* JADX WARN: Code duplicated, block: B:140:0x024f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:141:0x0251  */
    /* JADX WARN: Code duplicated, block: B:143:0x0263  */
    /* JADX WARN: Code duplicated, block: B:145:0x0267  */
    /* JADX WARN: Code duplicated, block: B:147:0x0275  */
    /* JADX WARN: Code duplicated, block: B:148:0x0278  */
    /* JADX WARN: Code duplicated, block: B:151:0x027f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x0281  */
    /* JADX WARN: Code duplicated, block: B:154:0x0294  */
    /* JADX WARN: Code duplicated, block: B:156:0x0298  */
    /* JADX WARN: Code duplicated, block: B:158:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:159:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:162:0x02b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:163:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:165:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:167:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:168:0x02db  */
    /* JADX WARN: Code duplicated, block: B:170:0x02df  */
    /* JADX WARN: Code duplicated, block: B:172:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:173:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:176:0x02f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:177:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:183:0x032e  */
    /* JADX WARN: Code duplicated, block: B:185:0x0333  */
    /* JADX WARN: Code duplicated, block: B:187:0x033f  */
    /* JADX WARN: Code duplicated, block: B:190:0x034a  */
    /* JADX WARN: Code duplicated, block: B:193:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x010b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x031f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:85:0x0110  */
    /* JADX WARN: Code duplicated, block: B:86:0x0113  */
    /* JADX WARN: Code duplicated, block: B:89:0x0134  */
    /* JADX WARN: Code duplicated, block: B:91:0x013b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0141  */
    /* JADX WARN: Code duplicated, block: B:96:0x0169  */
    /* JADX WARN: Code duplicated, block: B:98:0x0174  */
    public static final void a(ee30 ee30Var, iu30 iu30Var, mr20 mr20Var, mr20 mr20Var2, qim0 qim0Var, gpv0 gpv0Var, b0k b0kVar, int i, int i2) throws NoWhenBranchMatchedException {
        qim0 qim0Var2;
        int i3;
        gpv0 gpv0Var2;
        int i4;
        boolean z;
        qim0 qim0Var3;
        gpv0 gpv0Var3;
        h311 h311VarV;
        qim0 qim0Var4;
        qim0 qim0VarB;
        ArrayList arrayList;
        Iterator it;
        Object next;
        s220 s220Var;
        String str;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        Iterator itN;
        s220 s220Var2;
        boolean z2;
        boolean z3;
        Object objT;
        boolean z4;
        Object objT2;
        boolean z5;
        Object objT3;
        boolean z6;
        Object objT4;
        s220 s220Var3;
        String str2;
        boolean zG;
        Object objT5;
        boolean z7;
        boolean z8;
        Object objT6;
        m4c m4cVar = fkj0.X;
        c380 c380Var = ee30Var.e;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1558774275);
        int i5 = (i & 6) == 0 ? ((i & 8) == 0 ? x340Var.g(ee30Var) : x340Var.i(ee30Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i5 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= x340Var.i(mr20Var) ? 256 : 128;
        }
        mr20 mr20Var3 = mr20Var2;
        if ((i & 3072) == 0) {
            i5 |= x340Var.i(mr20Var3) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 == 0) {
            if ((i & 24576) == 0) {
                qim0Var2 = qim0Var;
                i5 |= x340Var.i(qim0Var2) ? 16384 : 8192;
            }
            i3 = i2 & 32;
            if (i3 != 0) {
                if ((196608 & i) == 0) {
                    gpv0Var2 = gpv0Var;
                    if (x340Var.i(gpv0Var2)) {
                        i4 = 131072;
                    } else {
                        i4 = 65536;
                    }
                    i5 |= i4;
                }
                if ((74899 & i5) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i5 & 1, z)) {
                    qim0Var4 = nim0.a;
                    if (i6 != 0) {
                        qim0Var3 = qim0Var4;
                    } else {
                        qim0Var3 = qim0Var2;
                    }
                    if (i3 != 0) {
                        gpv0Var2 = null;
                    }
                    if (c380Var.isEmpty()) {
                        x340Var.i0(-255417179);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(-257691866);
                        uwr uwrVar = cbx.a;
                        qim0VarB = uyn1.B(qim0Var4, 0.0f, cbx.b(x340Var).b.a, 0.0f, 0.0f, 13);
                        arrayList = new ArrayList();
                        for (Object obj : c380Var) {
                            if (obj instanceof s220) {
                                arrayList.add(obj);
                            }
                        }
                        it = arrayList.iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (((s220) next).h == null);
                        s220Var = (s220) next;
                        if (s220Var != null) {
                            str = s220Var.a;
                        } else {
                            str = null;
                        }
                        mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                        iHashCode = Long.hashCode(x340Var.T);
                        xos0VarM = x340Var.m();
                        qim0VarE = zr7.E(x340Var, qim0Var3);
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
                        nko1.H(mbhVarA, x340Var, y580.O0);
                        nko1.H(xos0VarM, x340Var, y580.N0);
                        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                        nko1.F(x340Var);
                        itN = kk0.n(x340Var, qim0VarE, y580.Y, 526594479, c380Var);
                        while (itN.hasNext()) {
                            s220Var2 = (w220) itN.next();
                            if (s220Var2 instanceof s220) {
                                x340Var.i0(-1345111184);
                                s220Var3 = s220Var2;
                                String str3 = s220Var3.h;
                                str2 = s220Var3.a;
                                if (s220Var3.c == 5) {
                                    x340Var.r(false);
                                    itN = itN;
                                } else {
                                    zG = x340Var.g(str2);
                                    objT5 = x340Var.T();
                                    if (zG || objT5 == m4cVar) {
                                        objT5 = new j5c();
                                        x340Var.s0(objT5);
                                    }
                                    j5c j5cVar = (j5c) objT5;
                                    if (u890.j(str2, str) || str3 == null) {
                                        itN = itN;
                                        z7 = true;
                                        x340Var.i0(-1344795604);
                                        x340Var.r(false);
                                    } else {
                                        x340Var.i0(-1344891704);
                                        boolean zI = x340Var.i(j5cVar);
                                        Object objT7 = x340Var.T();
                                        if (zI || objT7 == m4cVar) {
                                            z7 = true;
                                            objT7 = new kw10(j5cVar, (lnm) null, (byte) 1);
                                            x340Var.s0(objT7);
                                        } else {
                                            z7 = true;
                                        }
                                        qxd0.t(str3, x340Var, (vu30) objT7);
                                        x340Var.r(false);
                                    }
                                    qim0 qim0VarN = aym.n(qim0VarB, j5cVar);
                                    if ((i5 & 112) == 32) {
                                        z8 = z7;
                                    } else {
                                        z8 = false;
                                    }
                                    objT6 = x340Var.T();
                                    if (z8 || objT6 == m4cVar) {
                                        objT6 = new z720(iu30Var, (byte) 4);
                                        x340Var.s0(objT6);
                                    }
                                    j7p1.e(s220Var3, (iu30) objT6, qim0VarN, x340Var, 0);
                                    x340Var.r(false);
                                }
                            } else {
                                itN = itN;
                                z2 = false;
                                if (s220Var2 instanceof v220) {
                                    x340Var.i0(-1344496454);
                                    q3p1.f((v220) s220Var2, qim0VarB, x340Var, 0);
                                    x340Var.r(false);
                                } else if (s220Var2 instanceof q220) {
                                    x340Var.i0(-1344392635);
                                    q220 q220Var = (q220) s220Var2;
                                    if ((i5 & 112) == 32) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    objT4 = x340Var.T();
                                    if (z6 || objT4 == m4cVar) {
                                        objT4 = new z720(iu30Var, (byte) 5);
                                        x340Var.s0(objT4);
                                    }
                                    z2 = false;
                                    vpb1.b(q220Var, (iu30) objT4, qim0VarB, x340Var, 0);
                                    x340Var.r(false);
                                } else if (s220Var2 instanceof p220) {
                                    x340Var.i0(-1344118967);
                                    p220 p220Var = (p220) s220Var2;
                                    if ((i5 & 112) == 32) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    objT3 = x340Var.T();
                                    if (z5 || objT3 == m4cVar) {
                                        objT3 = new z720(iu30Var, (byte) 6);
                                        x340Var.s0(objT3);
                                    }
                                    z2 = false;
                                    nyo1.d(p220Var, (iu30) objT3, qim0VarB, x340Var, 0);
                                    x340Var.r(false);
                                } else if (s220Var2 instanceof o220) {
                                    x340Var.i0(-1343875803);
                                    o220 o220Var = (o220) s220Var2;
                                    if ((i5 & 112) == 32) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    objT2 = x340Var.T();
                                    if (z4 || objT2 == m4cVar) {
                                        objT2 = new z720(iu30Var, (byte) 7);
                                        x340Var.s0(objT2);
                                    }
                                    z2 = false;
                                    wxo1.d(o220Var, (iu30) objT2, qim0VarB, x340Var, 0);
                                    x340Var.r(false);
                                } else {
                                    z2 = false;
                                    if (s220Var2 instanceof r220) {
                                        x340Var.i0(-1343594323);
                                        b6p1.e((r220) s220Var2, qim0VarB, x340Var, 0);
                                        x340Var.r(false);
                                    } else {
                                        if (s220Var2 instanceof t220) {
                                            throw p3d1.k(x340Var, 1480629878, false);
                                        }
                                        x340Var.i0(-1343479685);
                                        t220 t220Var = (t220) s220Var2;
                                        if ((i5 & 112) == 32) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        objT = x340Var.T();
                                        if (z3 || objT == m4cVar) {
                                            objT = new z720(iu30Var, (byte) 8);
                                            x340Var.s0(objT);
                                        }
                                        no80.d(t220Var, (iu30) objT, mr20Var, mr20Var3, qim0VarB, gpv0Var2, x340Var, 466816 & i5);
                                        x340Var.r(false);
                                    }
                                    mr20Var3 = mr20Var2;
                                    itN = itN;
                                }
                            }
                            mr20Var3 = mr20Var2;
                            itN = itN;
                        }
                        us71.m(x340Var, false, true, false);
                    }
                } else {
                    x340Var.b0();
                    qim0Var3 = qim0Var2;
                }
                gpv0Var3 = gpv0Var2;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new bd5(ee30Var, iu30Var, mr20Var, mr20Var2, qim0Var3, gpv0Var3, i, i2, (byte) 8);
                }
            }
            i5 |= 196608;
            gpv0Var2 = gpv0Var;
            if ((74899 & i5) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i5 & 1, z)) {
                qim0Var4 = nim0.a;
                if (i6 != 0) {
                    qim0Var3 = qim0Var4;
                } else {
                    qim0Var3 = qim0Var2;
                }
                if (i3 != 0) {
                    gpv0Var2 = null;
                }
                if (c380Var.isEmpty()) {
                    x340Var.i0(-257691866);
                    uwr uwrVar2 = cbx.a;
                    qim0VarB = uyn1.B(qim0Var4, 0.0f, cbx.b(x340Var).b.a, 0.0f, 0.0f, 13);
                    arrayList = new ArrayList();
                    while (r15.hasNext()) {
                        if (obj instanceof s220) {
                            arrayList.add(obj);
                        }
                    }
                    it = arrayList.iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((s220) next).h == null);
                    s220Var = (s220) next;
                    if (s220Var != null) {
                        str = s220Var.a;
                    } else {
                        str = null;
                    }
                    mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                    iHashCode = Long.hashCode(x340Var.T);
                    xos0VarM = x340Var.m();
                    qim0VarE = zr7.E(x340Var, qim0Var3);
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
                    nko1.H(mbhVarA, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    nko1.F(x340Var);
                    itN = kk0.n(x340Var, qim0VarE, y580.Y, 526594479, c380Var);
                    while (itN.hasNext()) {
                        s220Var2 = (w220) itN.next();
                        if (s220Var2 instanceof s220) {
                            x340Var.i0(-1345111184);
                            s220Var3 = s220Var2;
                            String str4 = s220Var3.h;
                            str2 = s220Var3.a;
                            if (s220Var3.c == 5) {
                                x340Var.r(false);
                                itN = itN;
                            } else {
                                zG = x340Var.g(str2);
                                objT5 = x340Var.T();
                                if (zG) {
                                    objT5 = new j5c();
                                    x340Var.s0(objT5);
                                } else {
                                    objT5 = new j5c();
                                    x340Var.s0(objT5);
                                }
                                j5c j5cVar2 = (j5c) objT5;
                                if (u890.j(str2, str)) {
                                    itN = itN;
                                    z7 = true;
                                    x340Var.i0(-1344795604);
                                    x340Var.r(false);
                                } else {
                                    itN = itN;
                                    z7 = true;
                                    x340Var.i0(-1344795604);
                                    x340Var.r(false);
                                }
                                qim0 qim0VarN2 = aym.n(qim0VarB, j5cVar2);
                                if ((i5 & 112) == 32) {
                                    z8 = z7;
                                } else {
                                    z8 = false;
                                }
                                objT6 = x340Var.T();
                                if (z8) {
                                    objT6 = new z720(iu30Var, (byte) 4);
                                    x340Var.s0(objT6);
                                } else {
                                    objT6 = new z720(iu30Var, (byte) 4);
                                    x340Var.s0(objT6);
                                }
                                j7p1.e(s220Var3, (iu30) objT6, qim0VarN2, x340Var, 0);
                                x340Var.r(false);
                            }
                        } else {
                            itN = itN;
                            z2 = false;
                            if (s220Var2 instanceof v220) {
                                x340Var.i0(-1344496454);
                                q3p1.f((v220) s220Var2, qim0VarB, x340Var, 0);
                                x340Var.r(false);
                            } else if (s220Var2 instanceof q220) {
                                x340Var.i0(-1344392635);
                                q220 q220Var2 = (q220) s220Var2;
                                if ((i5 & 112) == 32) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                objT4 = x340Var.T();
                                if (z6) {
                                    objT4 = new z720(iu30Var, (byte) 5);
                                    x340Var.s0(objT4);
                                } else {
                                    objT4 = new z720(iu30Var, (byte) 5);
                                    x340Var.s0(objT4);
                                }
                                z2 = false;
                                vpb1.b(q220Var2, (iu30) objT4, qim0VarB, x340Var, 0);
                                x340Var.r(false);
                            } else if (s220Var2 instanceof p220) {
                                x340Var.i0(-1344118967);
                                p220 p220Var2 = (p220) s220Var2;
                                if ((i5 & 112) == 32) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                objT3 = x340Var.T();
                                if (z5) {
                                    objT3 = new z720(iu30Var, (byte) 6);
                                    x340Var.s0(objT3);
                                } else {
                                    objT3 = new z720(iu30Var, (byte) 6);
                                    x340Var.s0(objT3);
                                }
                                z2 = false;
                                nyo1.d(p220Var2, (iu30) objT3, qim0VarB, x340Var, 0);
                                x340Var.r(false);
                            } else if (s220Var2 instanceof o220) {
                                x340Var.i0(-1343875803);
                                o220 o220Var2 = (o220) s220Var2;
                                if ((i5 & 112) == 32) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                objT2 = x340Var.T();
                                if (z4) {
                                    objT2 = new z720(iu30Var, (byte) 7);
                                    x340Var.s0(objT2);
                                } else {
                                    objT2 = new z720(iu30Var, (byte) 7);
                                    x340Var.s0(objT2);
                                }
                                z2 = false;
                                wxo1.d(o220Var2, (iu30) objT2, qim0VarB, x340Var, 0);
                                x340Var.r(false);
                            } else {
                                z2 = false;
                                if (s220Var2 instanceof r220) {
                                    x340Var.i0(-1343594323);
                                    b6p1.e((r220) s220Var2, qim0VarB, x340Var, 0);
                                    x340Var.r(false);
                                } else {
                                    if (s220Var2 instanceof t220) {
                                        throw p3d1.k(x340Var, 1480629878, false);
                                    }
                                    x340Var.i0(-1343479685);
                                    t220 t220Var2 = (t220) s220Var2;
                                    if ((i5 & 112) == 32) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    objT = x340Var.T();
                                    if (z3) {
                                        objT = new z720(iu30Var, (byte) 8);
                                        x340Var.s0(objT);
                                    } else {
                                        objT = new z720(iu30Var, (byte) 8);
                                        x340Var.s0(objT);
                                    }
                                    no80.d(t220Var2, (iu30) objT, mr20Var, mr20Var3, qim0VarB, gpv0Var2, x340Var, 466816 & i5);
                                    x340Var.r(false);
                                }
                                mr20Var3 = mr20Var2;
                                itN = itN;
                            }
                        }
                        mr20Var3 = mr20Var2;
                        itN = itN;
                    }
                    us71.m(x340Var, false, true, false);
                } else {
                    x340Var.i0(-255417179);
                    x340Var.r(false);
                }
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
            }
            gpv0Var3 = gpv0Var2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new bd5(ee30Var, iu30Var, mr20Var, mr20Var2, qim0Var3, gpv0Var3, i, i2, (byte) 8);
            }
        }
        i5 |= 24576;
        qim0Var2 = qim0Var;
        i3 = i2 & 32;
        if (i3 != 0) {
            if ((196608 & i) == 0) {
                gpv0Var2 = gpv0Var;
                if (x340Var.i(gpv0Var2)) {
                    i4 = 131072;
                } else {
                    i4 = 65536;
                }
                i5 |= i4;
            }
            if ((74899 & i5) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i5 & 1, z)) {
                qim0Var4 = nim0.a;
                if (i6 != 0) {
                    qim0Var3 = qim0Var4;
                } else {
                    qim0Var3 = qim0Var2;
                }
                if (i3 != 0) {
                    gpv0Var2 = null;
                }
                if (c380Var.isEmpty()) {
                    x340Var.i0(-257691866);
                    uwr uwrVar3 = cbx.a;
                    qim0VarB = uyn1.B(qim0Var4, 0.0f, cbx.b(x340Var).b.a, 0.0f, 0.0f, 13);
                    arrayList = new ArrayList();
                    while (r15.hasNext()) {
                        if (obj instanceof s220) {
                            arrayList.add(obj);
                        }
                    }
                    it = arrayList.iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((s220) next).h == null);
                    s220Var = (s220) next;
                    if (s220Var != null) {
                        str = s220Var.a;
                    } else {
                        str = null;
                    }
                    mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                    iHashCode = Long.hashCode(x340Var.T);
                    xos0VarM = x340Var.m();
                    qim0VarE = zr7.E(x340Var, qim0Var3);
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
                    nko1.H(mbhVarA, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    nko1.F(x340Var);
                    itN = kk0.n(x340Var, qim0VarE, y580.Y, 526594479, c380Var);
                    while (itN.hasNext()) {
                        s220Var2 = (w220) itN.next();
                        if (s220Var2 instanceof s220) {
                            x340Var.i0(-1345111184);
                            s220Var3 = s220Var2;
                            String str5 = s220Var3.h;
                            str2 = s220Var3.a;
                            if (s220Var3.c == 5) {
                                x340Var.r(false);
                                itN = itN;
                            } else {
                                zG = x340Var.g(str2);
                                objT5 = x340Var.T();
                                if (zG) {
                                    objT5 = new j5c();
                                    x340Var.s0(objT5);
                                } else {
                                    objT5 = new j5c();
                                    x340Var.s0(objT5);
                                }
                                j5c j5cVar3 = (j5c) objT5;
                                if (u890.j(str2, str)) {
                                    itN = itN;
                                    z7 = true;
                                    x340Var.i0(-1344795604);
                                    x340Var.r(false);
                                } else {
                                    itN = itN;
                                    z7 = true;
                                    x340Var.i0(-1344795604);
                                    x340Var.r(false);
                                }
                                qim0 qim0VarN3 = aym.n(qim0VarB, j5cVar3);
                                if ((i5 & 112) == 32) {
                                    z8 = z7;
                                } else {
                                    z8 = false;
                                }
                                objT6 = x340Var.T();
                                if (z8) {
                                    objT6 = new z720(iu30Var, (byte) 4);
                                    x340Var.s0(objT6);
                                } else {
                                    objT6 = new z720(iu30Var, (byte) 4);
                                    x340Var.s0(objT6);
                                }
                                j7p1.e(s220Var3, (iu30) objT6, qim0VarN3, x340Var, 0);
                                x340Var.r(false);
                            }
                        } else {
                            itN = itN;
                            z2 = false;
                            if (s220Var2 instanceof v220) {
                                x340Var.i0(-1344496454);
                                q3p1.f((v220) s220Var2, qim0VarB, x340Var, 0);
                                x340Var.r(false);
                            } else if (s220Var2 instanceof q220) {
                                x340Var.i0(-1344392635);
                                q220 q220Var3 = (q220) s220Var2;
                                if ((i5 & 112) == 32) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                objT4 = x340Var.T();
                                if (z6) {
                                    objT4 = new z720(iu30Var, (byte) 5);
                                    x340Var.s0(objT4);
                                } else {
                                    objT4 = new z720(iu30Var, (byte) 5);
                                    x340Var.s0(objT4);
                                }
                                z2 = false;
                                vpb1.b(q220Var3, (iu30) objT4, qim0VarB, x340Var, 0);
                                x340Var.r(false);
                            } else if (s220Var2 instanceof p220) {
                                x340Var.i0(-1344118967);
                                p220 p220Var3 = (p220) s220Var2;
                                if ((i5 & 112) == 32) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                objT3 = x340Var.T();
                                if (z5) {
                                    objT3 = new z720(iu30Var, (byte) 6);
                                    x340Var.s0(objT3);
                                } else {
                                    objT3 = new z720(iu30Var, (byte) 6);
                                    x340Var.s0(objT3);
                                }
                                z2 = false;
                                nyo1.d(p220Var3, (iu30) objT3, qim0VarB, x340Var, 0);
                                x340Var.r(false);
                            } else if (s220Var2 instanceof o220) {
                                x340Var.i0(-1343875803);
                                o220 o220Var3 = (o220) s220Var2;
                                if ((i5 & 112) == 32) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                objT2 = x340Var.T();
                                if (z4) {
                                    objT2 = new z720(iu30Var, (byte) 7);
                                    x340Var.s0(objT2);
                                } else {
                                    objT2 = new z720(iu30Var, (byte) 7);
                                    x340Var.s0(objT2);
                                }
                                z2 = false;
                                wxo1.d(o220Var3, (iu30) objT2, qim0VarB, x340Var, 0);
                                x340Var.r(false);
                            } else {
                                z2 = false;
                                if (s220Var2 instanceof r220) {
                                    x340Var.i0(-1343594323);
                                    b6p1.e((r220) s220Var2, qim0VarB, x340Var, 0);
                                    x340Var.r(false);
                                } else {
                                    if (s220Var2 instanceof t220) {
                                        throw p3d1.k(x340Var, 1480629878, false);
                                    }
                                    x340Var.i0(-1343479685);
                                    t220 t220Var3 = (t220) s220Var2;
                                    if ((i5 & 112) == 32) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    objT = x340Var.T();
                                    if (z3) {
                                        objT = new z720(iu30Var, (byte) 8);
                                        x340Var.s0(objT);
                                    } else {
                                        objT = new z720(iu30Var, (byte) 8);
                                        x340Var.s0(objT);
                                    }
                                    no80.d(t220Var3, (iu30) objT, mr20Var, mr20Var3, qim0VarB, gpv0Var2, x340Var, 466816 & i5);
                                    x340Var.r(false);
                                }
                                mr20Var3 = mr20Var2;
                                itN = itN;
                            }
                        }
                        mr20Var3 = mr20Var2;
                        itN = itN;
                    }
                    us71.m(x340Var, false, true, false);
                } else {
                    x340Var.i0(-255417179);
                    x340Var.r(false);
                }
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
            }
            gpv0Var3 = gpv0Var2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new bd5(ee30Var, iu30Var, mr20Var, mr20Var2, qim0Var3, gpv0Var3, i, i2, (byte) 8);
            }
        }
        i5 |= 196608;
        gpv0Var2 = gpv0Var;
        if ((74899 & i5) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i5 & 1, z)) {
            qim0Var4 = nim0.a;
            if (i6 != 0) {
                qim0Var3 = qim0Var4;
            } else {
                qim0Var3 = qim0Var2;
            }
            if (i3 != 0) {
                gpv0Var2 = null;
            }
            if (c380Var.isEmpty()) {
                x340Var.i0(-257691866);
                uwr uwrVar4 = cbx.a;
                qim0VarB = uyn1.B(qim0Var4, 0.0f, cbx.b(x340Var).b.a, 0.0f, 0.0f, 13);
                arrayList = new ArrayList();
                while (r15.hasNext()) {
                    if (obj instanceof s220) {
                        arrayList.add(obj);
                    }
                }
                it = arrayList.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((s220) next).h == null);
                s220Var = (s220) next;
                if (s220Var != null) {
                    str = s220Var.a;
                } else {
                    str = null;
                }
                mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0Var3);
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
                nko1.H(mbhVarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                itN = kk0.n(x340Var, qim0VarE, y580.Y, 526594479, c380Var);
                while (itN.hasNext()) {
                    s220Var2 = (w220) itN.next();
                    if (s220Var2 instanceof s220) {
                        x340Var.i0(-1345111184);
                        s220Var3 = s220Var2;
                        String str6 = s220Var3.h;
                        str2 = s220Var3.a;
                        if (s220Var3.c == 5) {
                            x340Var.r(false);
                            itN = itN;
                        } else {
                            zG = x340Var.g(str2);
                            objT5 = x340Var.T();
                            if (zG) {
                                objT5 = new j5c();
                                x340Var.s0(objT5);
                            } else {
                                objT5 = new j5c();
                                x340Var.s0(objT5);
                            }
                            j5c j5cVar4 = (j5c) objT5;
                            if (u890.j(str2, str)) {
                                itN = itN;
                                z7 = true;
                                x340Var.i0(-1344795604);
                                x340Var.r(false);
                            } else {
                                itN = itN;
                                z7 = true;
                                x340Var.i0(-1344795604);
                                x340Var.r(false);
                            }
                            qim0 qim0VarN4 = aym.n(qim0VarB, j5cVar4);
                            if ((i5 & 112) == 32) {
                                z8 = z7;
                            } else {
                                z8 = false;
                            }
                            objT6 = x340Var.T();
                            if (z8) {
                                objT6 = new z720(iu30Var, (byte) 4);
                                x340Var.s0(objT6);
                            } else {
                                objT6 = new z720(iu30Var, (byte) 4);
                                x340Var.s0(objT6);
                            }
                            j7p1.e(s220Var3, (iu30) objT6, qim0VarN4, x340Var, 0);
                            x340Var.r(false);
                        }
                    } else {
                        itN = itN;
                        z2 = false;
                        if (s220Var2 instanceof v220) {
                            x340Var.i0(-1344496454);
                            q3p1.f((v220) s220Var2, qim0VarB, x340Var, 0);
                            x340Var.r(false);
                        } else if (s220Var2 instanceof q220) {
                            x340Var.i0(-1344392635);
                            q220 q220Var4 = (q220) s220Var2;
                            if ((i5 & 112) == 32) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            objT4 = x340Var.T();
                            if (z6) {
                                objT4 = new z720(iu30Var, (byte) 5);
                                x340Var.s0(objT4);
                            } else {
                                objT4 = new z720(iu30Var, (byte) 5);
                                x340Var.s0(objT4);
                            }
                            z2 = false;
                            vpb1.b(q220Var4, (iu30) objT4, qim0VarB, x340Var, 0);
                            x340Var.r(false);
                        } else if (s220Var2 instanceof p220) {
                            x340Var.i0(-1344118967);
                            p220 p220Var4 = (p220) s220Var2;
                            if ((i5 & 112) == 32) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            objT3 = x340Var.T();
                            if (z5) {
                                objT3 = new z720(iu30Var, (byte) 6);
                                x340Var.s0(objT3);
                            } else {
                                objT3 = new z720(iu30Var, (byte) 6);
                                x340Var.s0(objT3);
                            }
                            z2 = false;
                            nyo1.d(p220Var4, (iu30) objT3, qim0VarB, x340Var, 0);
                            x340Var.r(false);
                        } else if (s220Var2 instanceof o220) {
                            x340Var.i0(-1343875803);
                            o220 o220Var4 = (o220) s220Var2;
                            if ((i5 & 112) == 32) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            objT2 = x340Var.T();
                            if (z4) {
                                objT2 = new z720(iu30Var, (byte) 7);
                                x340Var.s0(objT2);
                            } else {
                                objT2 = new z720(iu30Var, (byte) 7);
                                x340Var.s0(objT2);
                            }
                            z2 = false;
                            wxo1.d(o220Var4, (iu30) objT2, qim0VarB, x340Var, 0);
                            x340Var.r(false);
                        } else {
                            z2 = false;
                            if (s220Var2 instanceof r220) {
                                x340Var.i0(-1343594323);
                                b6p1.e((r220) s220Var2, qim0VarB, x340Var, 0);
                                x340Var.r(false);
                            } else {
                                if (s220Var2 instanceof t220) {
                                    throw p3d1.k(x340Var, 1480629878, false);
                                }
                                x340Var.i0(-1343479685);
                                t220 t220Var4 = (t220) s220Var2;
                                if ((i5 & 112) == 32) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                objT = x340Var.T();
                                if (z3) {
                                    objT = new z720(iu30Var, (byte) 8);
                                    x340Var.s0(objT);
                                } else {
                                    objT = new z720(iu30Var, (byte) 8);
                                    x340Var.s0(objT);
                                }
                                no80.d(t220Var4, (iu30) objT, mr20Var, mr20Var3, qim0VarB, gpv0Var2, x340Var, 466816 & i5);
                                x340Var.r(false);
                            }
                            mr20Var3 = mr20Var2;
                            itN = itN;
                        }
                    }
                    mr20Var3 = mr20Var2;
                    itN = itN;
                }
                us71.m(x340Var, false, true, false);
            } else {
                x340Var.i0(-255417179);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        gpv0Var3 = gpv0Var2;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bd5(ee30Var, iu30Var, mr20Var, mr20Var2, qim0Var3, gpv0Var3, i, i2, (byte) 8);
        }
    }

    public static final void b(gmp0 gmp0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        String strN0;
        af5 af5VarP;
        m4c m4cVar = fkj0.X;
        String str = gmp0Var.a;
        boolean z = gmp0Var.b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1601704139);
        int i2 = i | (x340Var.g(gmp0Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            if (z) {
                strN0 = x0d.k(x340Var, -718435772, 2131953691, x340Var, false);
            } else {
                x340Var.i0(-718346895);
                strN0 = cwl1.n0(2131953690, new Object[]{str}, x340Var);
                x340Var.r(false);
            }
            boolean z2 = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z2 || objT == m4cVar) {
                objT = new tro0(iu30Var, (byte) 16);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            x340Var.i0(-76005062);
            if (z) {
                x340Var.i0(-818742424);
                x340Var.r(false);
                ye5 ye5Var = new ye5();
                ye5Var.g(cwl1.n0(2131953689, new Object[]{str}, x340Var));
                ye5Var.g(" ");
                String strO0 = cwl1.o0(x340Var, 2131953685);
                uwr uwrVar = cbx.a;
                FontFamily fontFamily = cbx.d(x340Var).n.a.f;
                zma1 zma1Var = new zma1(cbx.a(x340Var).b.a, 0L, cbx.d(x340Var).n.a.c, cbx.d(x340Var).n.a.d, (FontSynthesis) null, fontFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65490);
                boolean zG = x340Var.g(function0);
                Object objT2 = x340Var.T();
                if (zG || objT2 == m4cVar) {
                    objT2 = new hii0(function0, (byte) 3);
                    x340Var.s0(objT2);
                }
                vhg.a(ye5Var, strO0, "manageSocialSettings", zma1Var, (iu30) objT2);
                af5VarP = ye5Var.p();
            } else {
                x340Var.i0(-818870237);
                af5VarP = new af5(cwl1.n0(2131953688, new Object[]{str}, x340Var));
                x340Var.r(false);
            }
            x340Var.r(false);
            qim0 qim0Var3 = nim0.a;
            o6p1.b(strN0, af5VarP, anm1.N("off-platform-chat-request-view-test-tag", qim0Var3), apo.r(1065061496, new ipy(iu30Var, (byte) 25), x340Var), x340Var, 3072, 0);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vbn0(gmp0Var, iu30Var, qim0Var2, i, (byte) 13);
        }
    }

    public static final void c(boolean z, long j, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        boolean z2;
        j2i j2iVar2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(519039035);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(j2iVar) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            z2 = z;
            fq7.g(z2, (qim0) null, xay.e(3, (ni20) null).a(xay.g(0.0f, 3, j, (ni20) null)), xay.f(3, (ni20) null).a(xay.h((ni20) null, j, 3)), (String) null, j2iVar, x340Var, (i2 & 14) | ((i2 << 9) & 458752), 18);
            j2iVar2 = j2iVar;
        } else {
            z2 = z;
            j2iVar2 = j2iVar;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jp30(z2, j, j2iVar2, i);
        }
    }

    public static final void d(c10 c10Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1733544485);
        int i2 = i | (x340Var2.g(c10Var) ? 4 : 2) | 48 | (x340Var2.i(iu30Var) ? 256 : 128);
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            d36 d36Var = new d36(16.0f, true, new um5(false));
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var2).a.a.a();
            cr31 cr31VarB = er31.b(8.0f);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarX = uyn1.x(u291.f(dug.f(qim0Var3, jA, cr31VarB), 1.0f), 16.0f);
            Object objT = x340Var2.T();
            if (objT == m4cVar) {
                objT = ktd.n(x340Var2);
            }
            idn0 idn0Var = (idn0) objT;
            jtr jtrVar = jtr.f;
            boolean z = ((i2 & 14) == 4) | ((i2 & 896) == 256);
            Object objT2 = x340Var2.T();
            if (z || objT2 == m4cVar) {
                objT2 = new lb80(iu30Var, c10Var, (byte) 4);
                x340Var2.s0(objT2);
            }
            qim0 qim0VarV = bin.v(qim0VarX, idn0Var, jtrVar, false, null, null, (Function0) objT2, 28);
            mbh mbhVarA = jbh.a(d36Var, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarV);
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
            qim0Var2 = qim0Var3;
            uwo1.e(c10Var.b, u291.f(qim0Var3, 1.0f), cbx.d(x340Var2).h, cbx.a(x340Var2).b.a, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2032);
            x340Var = x340Var2;
            if (c10Var.c.length() > 0) {
                x340Var.i0(-1031766260);
                uwo1.e(c10Var.c, u291.f(qim0Var2, 1.0f), cbx.d(x340Var).g, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                x340Var.i0(-1031580601);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qm71((byte) 8, i, c10Var, qim0Var2, iu30Var);
        }
    }

    public static final String e(moe0 moe0Var) {
        if (moe0Var == null) {
            return "none";
        }
        if (moe0Var instanceof goe0) {
            return "Dismiss";
        }
        if (moe0Var instanceof joe0) {
            return "NavigateTo(" + ((joe0) moe0Var).a + ")";
        }
        if (moe0Var instanceof eoe0) {
            return f4i1.f("Callback(", ((eoe0) moe0Var).a, ")");
        }
        if (moe0Var instanceof loe0) {
            return f4i1.f("ShowDialog(", ((loe0) moe0Var).a, ")");
        }
        if (moe0Var instanceof koe0) {
            return f4i1.f("ShowBottomSheet(", ((koe0) moe0Var).c, ")");
        }
        if (moe0Var instanceof foe0) {
            return "CloseApp";
        }
        if (moe0Var instanceof hoe0) {
            return "DismissOverlay";
        }
        if (moe0Var instanceof ioe0) {
            return "Empty";
        }
        eg.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void f(lnm lnmVar) {
        l4t l4tVar;
        if (lnmVar instanceof l4t) {
            l4tVar = (l4t) lnmVar;
            int i = l4tVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                l4tVar.b = i - Integer.MIN_VALUE;
            } else {
                l4tVar = new l4t(lnmVar);
            }
        } else {
            l4tVar = new l4t(lnmVar);
        }
        Object obj = l4tVar.a;
        int i2 = l4tVar.b;
        if (i2 == 0) {
            hm5.M(obj);
            l4tVar.b = 1;
            ohd ohdVar = new ohd(1, aym.t(l4tVar));
            ohdVar.t();
            if (ohdVar.r() == d9n.a) {
                return;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            hm5.M(obj);
        }
        jah.d();
    }

    public static String g(int i) {
        return f4i1.c(i, "BetamaxPlayerPool.ConfiguredSize.");
    }

    public static final nml h(op80 op80Var) {
        jp80 jp80VarA = op80Var.a(vgp1.R0);
        if (jp80VarA != null) {
            return jp80VarA.b;
        }
        return null;
    }

    public static final Object i(long j, lnm lnmVar) {
        if (j > 0) {
            ohd ohdVar = new ohd(1, aym.t(lnmVar));
            ohdVar.t();
            if (j < Long.MAX_VALUE) {
                l(ohdVar.e).c(j, ohdVar);
            }
            Object objR = ohdVar.r();
            if (objR == d9n.a) {
                return objR;
            }
        }
        return rih1.a;
    }

    public static final Object j(long j, lnm lnmVar) {
        Object objI = i(u(j), lnmVar);
        return objI == d9n.a ? objI : rih1.a;
    }

    public static final uxk0 k(pje1 pje1Var, op80 op80Var) {
        r6h1 r6h1Var;
        int i;
        h3h1 h3h1VarC;
        iu30 iu30Var;
        Integer numN;
        int iIntValue = (op80Var == null || (numN = l0o1.n(op80Var)) == null) ? 0 : numN.intValue();
        if (op80Var == null || (h3h1VarC = j0o1.C(op80Var)) == null || (iu30Var = h3h1VarC.b) == null || (r6h1Var = (r6h1) iu30Var.invoke(Integer.valueOf(iIntValue))) == null) {
            r6h1Var = r6h1.c;
        }
        py9 py9Var = new py9(pje1Var.a, r6h1Var, (byte) 23);
        int iC = l1d.C(pje1Var.b);
        int i2 = 2;
        if (iC == 0) {
            i = 2;
        } else {
            if (iC != 1) {
                eg.o();
                return null;
            }
            i = 1;
        }
        Integer numValueOf = Integer.valueOf(pje1Var.c);
        switch (l1d.C(pje1Var.d)) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                i2 = 6;
                break;
            case 1:
                i2 = 7;
                break;
            case 2:
                i2 = 1;
                break;
            case 3:
                i2 = 3;
                break;
            case 4:
                i2 = 5;
                break;
            case 5:
                break;
            case 6:
                i2 = 4;
                break;
            default:
                eg.o();
                return null;
        }
        return new uxk0(new jpk0(py9Var, i, numValueOf, i2), pje1Var.e, pje1Var.f);
    }

    public static final k4t l(o8n o8nVar) {
        k4t k4tVarA = o8nVar.A(wdu0.Y);
        k4t k4tVar = k4tVarA instanceof k4t ? k4tVarA : null;
        return k4tVar == null ? lyr.a : k4tVar;
    }

    public static bbr0 m(View view) {
        bbr0 bbr0VarN = n(view);
        if (bbr0VarN != null) {
            return bbr0VarN;
        }
        try {
            zf30 zf30VarI = th30.I(view);
            if (zf30VarI == null) {
                throw new IllegalStateException("View " + view + " does not have a Fragment set");
            }
            bbr0 bbr0Var = zf30VarI instanceof bbr0 ? (bbr0) zf30VarI : null;
            if (bbr0Var == null) {
                dg30 dg30VarF0 = zf30VarI.f0();
                bbr0Var = dg30VarF0 instanceof bbr0 ? (bbr0) dg30VarF0 : null;
            }
            if (bbr0Var == null) {
                Iterator it = z561.c0(eak1.O0, view.getContext()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        bbr0Var = null;
                        break;
                    }
                    Context context = (Context) it.next();
                    bbr0 bbr0Var2 = context instanceof bbr0 ? (bbr0) context : null;
                    if (bbr0Var2 != null) {
                        bbr0Var = bbr0Var2;
                        break;
                    }
                }
                if (bbr0Var == null) {
                    eg.m("No page properties in view hierarchy");
                    return null;
                }
            }
            return bbr0Var;
        } catch (IllegalStateException unused) {
        }
    }

    public static bbr0 n(View view) {
        Object tag = view.getTag(2131431634);
        bbr0 bbr0Var = tag instanceof bbr0 ? (bbr0) tag : null;
        if (bbr0Var != null) {
            return bbr0Var;
        }
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            return n(view2);
        }
        return null;
    }

    public static final String o(String str, xkg0 xkg0Var) {
        Uri.Builder builderAppendQueryParameter = Uri.parse("https://contentreporting.spotify.com/mobile/content-policy").buildUpon().appendQueryParameter("platform", "android").appendQueryParameter("uri", str);
        if (xkg0Var != null) {
            for (Map.Entry entry : xkg0Var.entrySet()) {
                builderAppendQueryParameter.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return builderAppendQueryParameter.build().toString();
    }

    public static final boolean q(dlb dlbVar) {
        if ((dlbVar instanceof zkb) || (dlbVar instanceof alb)) {
            return false;
        }
        if (dlbVar instanceof blb) {
            if (((blb) dlbVar).d == 3) {
                return true;
            }
        } else if (dlbVar instanceof clb) {
            if (((clb) dlbVar).d == 3) {
                return true;
            }
        } else if (dlbVar != null) {
            eg.o();
            return false;
        }
        return false;
    }

    public static tdl0 r() {
        return new tdl0((byte) 2);
    }

    public static void s(View view, WeakReference weakReference) {
        view.setTag(2131431633, weakReference);
        q7r0 q7r0Var = (q7r0) weakReference.get();
        view.setTag(2131431634, q7r0Var != null ? q7r0Var.d.b().a() : null);
    }

    public static final o3r t(me30 me30Var) {
        return w3p1.o(new l4r(pwc0.b, 2, ny1.e, new j4r(ny1.g), ny1.f), new jm1(me30Var, (byte) 6));
    }

    public static final long u(long j) {
        boolean zO = jfv.o(j);
        if (zO) {
            return jfv.h(jfv.q(j, fdg1.l0(999999L, ngv.b)));
        }
        if (!zO) {
            return 0L;
        }
        eg.o();
        return 0L;
    }

    public static final String v(yvh yvhVar) {
        if (yvhVar instanceof wvh) {
            return ((wvh) yvhVar).a;
        }
        if (yvhVar instanceof xvh) {
            return ((xvh) yvhVar).a;
        }
        if (yvhVar instanceof uvh) {
            return ((uvh) yvhVar).a.a.a;
        }
        if (yvhVar instanceof vvh) {
            return ((vvh) yvhVar).a;
        }
        eg.o();
        return null;
    }

    public static final m511 w(View view) {
        return x(view, new int[2]);
    }

    public static final m511 x(View view, int[] iArr) {
        view.getLocationInWindow(iArr);
        float f = iArr[0];
        float f2 = iArr[1];
        return new m511(f, f2, view.getWidth() + f, view.getHeight() + f2);
    }
}
