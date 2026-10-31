package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.text.BreakIterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pii extends hab0 implements bv30 {
    public static final pii N0;
    public static final pii O0;
    public static final pii P0;
    public static final pii Q0;
    public static final pii R0;
    public static final pii S0;
    public static final pii T0;
    public static final pii U0;
    public static final pii V0;
    public static final pii W0;
    public static final pii X;
    public static final pii X0;
    public static final pii Y;
    public static final pii Y0;
    public static final pii Z;
    public static final pii Z0;
    public static final pii a1;
    public static final pii b;
    public static final pii b1;
    public static final pii c;
    public static final pii c1;
    public static final pii d;
    public static final pii d1;
    public static final pii e;
    public static final pii e1;
    public static final pii f;
    public static final pii g;
    public static final pii h;
    public static final pii i;
    public static final pii t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 5;
        b = new pii(i2, (byte) 0);
        c = new pii(i2, (byte) 1);
        d = new pii(i2, (byte) 2);
        e = new pii(i2, (byte) 3);
        f = new pii(i2, (byte) 4);
        g = new pii(i2, (byte) 5);
        h = new pii(i2, (byte) 6);
        i = new pii(i2, (byte) 7);
        t = new pii(i2, (byte) 8);
        X = new pii(i2, (byte) 9);
        Y = new pii(i2, (byte) 10);
        Z = new pii(i2, (byte) 11);
        N0 = new pii(i2, (byte) 12);
        O0 = new pii(i2, (byte) 13);
        P0 = new pii(i2, (byte) 14);
        Q0 = new pii(i2, (byte) 15);
        R0 = new pii(i2, (byte) 16);
        S0 = new pii(i2, (byte) 17);
        T0 = new pii(i2, (byte) 18);
        U0 = new pii(i2, (byte) 19);
        V0 = new pii(i2, (byte) 20);
        W0 = new pii(i2, (byte) 21);
        X0 = new pii(i2, (byte) 22);
        Y0 = new pii(i2, (byte) 23);
        Z0 = new pii(i2, (byte) 24);
        a1 = new pii(i2, (byte) 25);
        b1 = new pii(i2, (byte) 26);
        c1 = new pii(i2, (byte) 27);
        d1 = new pii(i2, (byte) 28);
        e1 = new pii(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pii(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0153  */
    /* JADX WARN: Code duplicated, block: B:104:0x0159  */
    /* JADX WARN: Code duplicated, block: B:110:0x0166 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:111:0x0168  */
    /* JADX WARN: Code duplicated, block: B:114:0x0179  */
    /* JADX WARN: Code duplicated, block: B:116:0x017f  */
    /* JADX WARN: Code duplicated, block: B:122:0x018c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:123:0x018e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:69:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:76:0x0104  */
    /* JADX WARN: Code duplicated, block: B:78:0x010a A[PHI: r25
      0x010a: PHI (r25v3 java.lang.String) = (r25v1 java.lang.String), (r25v4 java.lang.String) binds: [B:77:0x0108, B:75:0x0101] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x010c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0113 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x0118  */
    /* JADX WARN: Code duplicated, block: B:88:0x0127  */
    /* JADX WARN: Code duplicated, block: B:92:0x0131  */
    /* JADX WARN: Code duplicated, block: B:94:0x0137 A[PHI: r26
      0x0137: PHI (r26v3 kotlin.jvm.functions.Function0) = (r26v1 kotlin.jvm.functions.Function0), (r26v4 kotlin.jvm.functions.Function0) binds: [B:93:0x0135, B:91:0x012e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x0139  */
    /* JADX WARN: Code duplicated, block: B:98:0x0140 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:99:0x0142  */
    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z;
        c380 c380Var;
        boolean z2;
        Object objT;
        String str;
        boolean z3;
        Object objT2;
        Function0 function0;
        Function0 function1;
        boolean z4;
        Object objT3;
        boolean z5;
        Object objT4;
        boolean z6;
        Object objT5;
        knv knvVar = (knv) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        ova ovaVar = knvVar.d;
        gnv gnvVar = knvVar.g;
        String str2 = knvVar.a;
        String str3 = knvVar.b;
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str3);
        int i2 = 0;
        while (characterInstance.next() != -1) {
            i2++;
        }
        boolean z7 = i2 > 150;
        if (u890.j(str3, knvVar.a) && ovaVar == knvVar.c) {
            z = false;
        } else {
            BreakIterator characterInstance2 = BreakIterator.getCharacterInstance();
            characterInstance2.setText(str3);
            int i3 = 0;
            while (characterInstance2.next() != -1) {
                i3++;
            }
            if (i3 <= 150 && !(gnvVar instanceof inv)) {
                z = true;
            } else {
                z = false;
            }
        }
        boolean z8 = gnvVar instanceof inv;
        gnv gnvVar2 = gnvVar instanceof gnv ? gnvVar : null;
        fnv fnvVar = gnvVar2 != null ? gnvVar2.a : null;
        boolean z9 = knvVar.f;
        c380 c380Var2 = knvVar.e;
        int i4 = (iIntValue & 896) ^ 384;
        boolean z10 = (i4 > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT6 = x340Var2.T();
        if (z10 || objT6 == m4cVar) {
            objT6 = new cci(iu30Var, (byte) 12);
            x340Var2.s0(objT6);
        }
        iu30 iu30Var2 = (iu30) objT6;
        boolean z11 = (i4 > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT7 = x340Var2.T();
        if (z11 || objT7 == m4cVar) {
            objT7 = new cci(iu30Var, (byte) 13);
            x340Var2.s0(objT7);
        }
        iu30 iu30Var3 = (iu30) objT7;
        if (i4 <= 256 || !x340Var2.g(iu30Var)) {
            c380Var = c380Var2;
            if ((iIntValue & 384) != 256) {
                z2 = false;
            }
            objT = x340Var2.T();
            if (z2 || objT == m4cVar) {
                objT = new pki(iu30Var, (byte) 0);
                x340Var2.s0(objT);
            }
            Function0 function2 = (Function0) objT;
            if (i4 > 256 || !x340Var2.g(iu30Var)) {
                str = str2;
                if ((iIntValue & 384) != 256) {
                    z3 = false;
                }
                objT2 = x340Var2.T();
                if (z3 || objT2 == m4cVar) {
                    objT2 = new pki(iu30Var, (byte) 1);
                    x340Var2.s0(objT2);
                }
                function0 = (Function0) objT2;
                if (i4 > 256 || !x340Var2.g(iu30Var)) {
                    function1 = function0;
                    if ((iIntValue & 384) != 256) {
                        z4 = false;
                    }
                    objT3 = x340Var2.T();
                    if (z4 || objT3 == m4cVar) {
                        objT3 = new pki(iu30Var, (byte) 2);
                        x340Var2.s0(objT3);
                    }
                    Function0 function3 = (Function0) objT3;
                    z5 = (i4 <= 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
                    objT4 = x340Var2.T();
                    if (z5 || objT4 == m4cVar) {
                        objT4 = new pki(iu30Var, (byte) 3);
                        x340Var2.s0(objT4);
                    }
                    Function0 function4 = (Function0) objT4;
                    z6 = (i4 <= 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
                    objT5 = x340Var2.T();
                    if (z6 || objT5 == m4cVar) {
                        objT5 = new pki(iu30Var, (byte) 4);
                        x340Var2.s0(objT5);
                    }
                    yon1.e(str, z7, z, z8, fnvVar, z9, ovaVar, c380Var, iu30Var2, iu30Var3, function2, function1, function3, function4, (Function0) objT5, x340Var2, 0);
                    return rih1.a;
                }
                function1 = function0;
                z4 = true;
                objT3 = x340Var2.T();
                if (z4) {
                    objT3 = new pki(iu30Var, (byte) 2);
                    x340Var2.s0(objT3);
                } else {
                    objT3 = new pki(iu30Var, (byte) 2);
                    x340Var2.s0(objT3);
                }
                Function0 function5 = (Function0) objT3;
                if (i4 <= 256) {
                }
                objT4 = x340Var2.T();
                if (z5) {
                    objT4 = new pki(iu30Var, (byte) 3);
                    x340Var2.s0(objT4);
                } else {
                    objT4 = new pki(iu30Var, (byte) 3);
                    x340Var2.s0(objT4);
                }
                Function0 function6 = (Function0) objT4;
                if (i4 <= 256) {
                }
                objT5 = x340Var2.T();
                if (z6) {
                    objT5 = new pki(iu30Var, (byte) 4);
                    x340Var2.s0(objT5);
                } else {
                    objT5 = new pki(iu30Var, (byte) 4);
                    x340Var2.s0(objT5);
                }
                yon1.e(str, z7, z, z8, fnvVar, z9, ovaVar, c380Var, iu30Var2, iu30Var3, function2, function1, function5, function6, (Function0) objT5, x340Var2, 0);
                return rih1.a;
            }
            str = str2;
            z3 = true;
            objT2 = x340Var2.T();
            if (z3) {
                objT2 = new pki(iu30Var, (byte) 1);
                x340Var2.s0(objT2);
            } else {
                objT2 = new pki(iu30Var, (byte) 1);
                x340Var2.s0(objT2);
            }
            function0 = (Function0) objT2;
            if (i4 > 256) {
                function1 = function0;
                if ((iIntValue & 384) != 256) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            } else {
                function1 = function0;
                if ((iIntValue & 384) != 256) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            }
            objT3 = x340Var2.T();
            if (z4) {
                objT3 = new pki(iu30Var, (byte) 2);
                x340Var2.s0(objT3);
            } else {
                objT3 = new pki(iu30Var, (byte) 2);
                x340Var2.s0(objT3);
            }
            Function0 function7 = (Function0) objT3;
            if (i4 <= 256) {
            }
            objT4 = x340Var2.T();
            if (z5) {
                objT4 = new pki(iu30Var, (byte) 3);
                x340Var2.s0(objT4);
            } else {
                objT4 = new pki(iu30Var, (byte) 3);
                x340Var2.s0(objT4);
            }
            Function0 function8 = (Function0) objT4;
            if (i4 <= 256) {
            }
            objT5 = x340Var2.T();
            if (z6) {
                objT5 = new pki(iu30Var, (byte) 4);
                x340Var2.s0(objT5);
            } else {
                objT5 = new pki(iu30Var, (byte) 4);
                x340Var2.s0(objT5);
            }
            yon1.e(str, z7, z, z8, fnvVar, z9, ovaVar, c380Var, iu30Var2, iu30Var3, function2, function1, function7, function8, (Function0) objT5, x340Var2, 0);
            return rih1.a;
        }
        c380Var = c380Var2;
        z2 = true;
        objT = x340Var2.T();
        if (z2) {
            objT = new pki(iu30Var, (byte) 0);
            x340Var2.s0(objT);
        } else {
            objT = new pki(iu30Var, (byte) 0);
            x340Var2.s0(objT);
        }
        Function0 function9 = (Function0) objT;
        if (i4 > 256) {
            str = str2;
            if ((iIntValue & 384) != 256) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            str = str2;
            if ((iIntValue & 384) != 256) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        objT2 = x340Var2.T();
        if (z3) {
            objT2 = new pki(iu30Var, (byte) 1);
            x340Var2.s0(objT2);
        } else {
            objT2 = new pki(iu30Var, (byte) 1);
            x340Var2.s0(objT2);
        }
        function0 = (Function0) objT2;
        if (i4 > 256) {
            function1 = function0;
            if ((iIntValue & 384) != 256) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            function1 = function0;
            if ((iIntValue & 384) != 256) {
                z4 = true;
            } else {
                z4 = false;
            }
        }
        objT3 = x340Var2.T();
        if (z4) {
            objT3 = new pki(iu30Var, (byte) 2);
            x340Var2.s0(objT3);
        } else {
            objT3 = new pki(iu30Var, (byte) 2);
            x340Var2.s0(objT3);
        }
        Function0 function10 = (Function0) objT3;
        if (i4 <= 256) {
        }
        objT4 = x340Var2.T();
        if (z5) {
            objT4 = new pki(iu30Var, (byte) 3);
            x340Var2.s0(objT4);
        } else {
            objT4 = new pki(iu30Var, (byte) 3);
            x340Var2.s0(objT4);
        }
        Function0 function11 = (Function0) objT4;
        if (i4 <= 256) {
        }
        objT5 = x340Var2.T();
        if (z6) {
            objT5 = new pki(iu30Var, (byte) 4);
            x340Var2.s0(objT5);
        } else {
            objT5 = new pki(iu30Var, (byte) 4);
            x340Var2.s0(objT5);
        }
        yon1.e(str, z7, z, z8, fnvVar, z9, ovaVar, c380Var, iu30Var2, iu30Var3, function9, function1, function10, function11, (Function0) objT5, x340Var2, 0);
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i2;
        rpv rpvVar = (rpv) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 48) == 0) {
            i2 = (x340Var.g(rpvVar) ? 32 : 16) | iIntValue;
        } else {
            i2 = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i2 & 1, (i2 & 1169) != 1168)) {
            boolean z = rpvVar.a;
            boolean z2 = (i2 & 896) == 256;
            Object objT = x340Var2.T();
            if (z2 || objT == fkj0.X) {
                objT = new pki(iu30Var, (byte) 7);
                x340Var2.s0(objT);
            }
            hqn1.c(0, (Function0) objT, x340Var2, (qim0) null, z);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        c2w c2wVar = (c2w) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        boolean z = c2wVar.d;
        int i2 = c2wVar.b;
        boolean z2 = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z2 || objT == fkj0.X) {
            objT = new pki(iu30Var, (byte) 8);
            x340Var2.s0(objT);
        }
        grn1.c(i2, 0, (Function0) objT, x340Var2, (qim0) null, z);
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x019f A[PHI: r4
      0x019f: PHI (r4v15 p.iu30) = (r4v9 p.iu30), (r4v16 p.iu30) binds: [B:29:0x019d, B:25:0x0196] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:39:0x01be  */
    /* JADX WARN: Code duplicated, block: B:41:0x01f6  */
    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i2;
        qim0 qim0Var;
        x340 x340Var;
        boolean z;
        iu30 iu30Var;
        boolean z2;
        Object objT;
        Function0 function0;
        r7w r7wVar = (r7w) obj2;
        iu30 iu30Var2 = (iu30) obj3;
        x340 x340Var2 = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        qim0 qim0Var2 = nim0.a;
        qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
        jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var2, 0);
        x340 x340Var3 = x340Var2;
        int iHashCode = Long.hashCode(x340Var3.T);
        xos0 xos0VarM = x340Var3.m();
        qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
        hzj.A.getClass();
        x340 x340Var4 = x340Var2;
        if (x340Var4.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var4.m0();
        boolean z3 = x340Var4.S;
        n4k n4kVar = hmb0.t1;
        if (z3) {
            x340Var4.l(n4kVar);
        } else {
            x340Var4.v0();
        }
        llj lljVar = y580.O0;
        nko1.H(jw31VarA, x340Var2, lljVar);
        llj lljVar2 = y580.N0;
        nko1.H(xos0VarM, x340Var2, lljVar2);
        Integer numValueOf = Integer.valueOf(iHashCode);
        llj lljVar3 = y580.R0;
        nko1.H(numValueOf, x340Var2, lljVar3);
        nko1.F(x340Var2);
        llj lljVar4 = y580.Y;
        nko1.H(qim0VarE, x340Var2, lljVar4);
        wnb0 wnb0Var = new wnb0(1.0f, true);
        mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
        int iHashCode2 = Long.hashCode(x340Var4.T);
        xos0 xos0VarM2 = x340Var4.m();
        qim0 qim0VarE2 = zr7.E(x340Var2, wnb0Var);
        x340Var4.m0();
        if (x340Var4.S) {
            x340Var4.l(n4kVar);
        } else {
            x340Var4.v0();
        }
        nko1.H(mbhVarA, x340Var2, lljVar);
        nko1.H(xos0VarM2, x340Var2, lljVar2);
        i3a.l(iHashCode2, x340Var2, lljVar3, x340Var2);
        nko1.H(qim0VarE2, x340Var2, lljVar4);
        String str = r7wVar.b;
        if (str == null || ihc1.y0(str)) {
            i2 = iIntValue;
            qim0Var = qim0Var2;
            x340Var = x340Var4;
            z = false;
            x340Var.i0(-538605733);
            x340Var.r(false);
        } else {
            x340Var4.i0(-538934705);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var2).j;
            long j = cbx.a(x340Var2).b.b;
            String str2 = r7wVar.b;
            cjc0 cjc0Var = new cjc0(1);
            cvx cvxVar = cbx.b(x340Var2).b;
            i2 = iIntValue;
            x340Var = x340Var4;
            qim0Var = qim0Var2;
            z = false;
            uwo1.e(str2, uyn1.B(qim0Var2, 0.0f, 0.0f, 0.0f, 2.0f, 7), lee1Var, j, (a0e1) null, (iu30) null, 2, false, cjc0Var, 0, (qx8) null, x340Var2, 0, 0, 1712);
            x340Var.r(false);
        }
        uwr uwrVar2 = cbx.a;
        lee1 lee1Var2 = cbx.d(x340Var2).e;
        long j2 = cbx.a(x340Var2).b.a;
        String str3 = r7wVar.a;
        cjc0 cjc0Var2 = new cjc0(2);
        Object objT2 = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT2 == m4cVar) {
            objT2 = ovh.a1;
            x340Var.s0(objT2);
        }
        uwo1.e(str3, s161.b(qim0Var, z, (iu30) objT2), lee1Var2, j2, (a0e1) null, (iu30) null, 0, false, cjc0Var2, 0, (qx8) null, x340Var2, 0, 0, 1776);
        x340Var.r(true);
        String str4 = r7wVar.c;
        int i3 = i2;
        if (((i3 & 896) ^ 384) > 256) {
            iu30Var = iu30Var2;
            if (x340Var.g(iu30Var)) {
                z2 = true;
            }
            objT = x340Var.T();
            if (z2 || objT == m4cVar) {
                objT = new pki(iu30Var, (byte) 9);
                x340Var.s0(objT);
            }
            function0 = (Function0) objT;
            if (!ihc1.y0(str4)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return null;
            }
            foo1.c(new gbx(new y50(str4), function0), ldx.c, (qim0) null, (max) null, yla.s(x340Var2), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(1109247614, new l8i(r7wVar, (byte) 8), x340Var2), x340Var2, 0, 48, 2012);
            x340Var.r(true);
            return rih1.a;
        }
        iu30Var = iu30Var2;
        if ((i3 & 384) == 256) {
            z2 = true;
        } else {
            z2 = false;
        }
        objT = x340Var.T();
        if (z2) {
            objT = new pki(iu30Var, (byte) 9);
            x340Var.s0(objT);
        } else {
            objT = new pki(iu30Var, (byte) 9);
            x340Var.s0(objT);
        }
        function0 = (Function0) objT;
        if (!ihc1.y0(str4)) {
            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            return null;
        }
        foo1.c(new gbx(new y50(str4), function0), ldx.c, (qim0) null, (max) null, yla.s(x340Var2), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(1109247614, new l8i(r7wVar, (byte) 8), x340Var2), x340Var2, 0, 48, 2012);
        x340Var.r(true);
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        f6x f6xVar = (f6x) obj2;
        b0k b0kVar = (b0k) obj4;
        ((Number) obj5).intValue();
        String str = f6xVar.a;
        qim0 qim0VarN = anm1.N("search_empty_banner", u291.d(nim0.a, 1.0f));
        uwr uwrVar = cbx.a;
        jap1.l(uyn1.z(cbx.b(b0kVar).b.b, 0.0f, 2, qim0VarN), (qim0) null, str, f6xVar.b, (String) null, (gbx) null, (yf) null, (vu30) null, b0kVar, 0, 498);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        int i2;
        hax haxVar;
        ldx idxVar;
        long j;
        String strK;
        boolean z;
        int i3;
        int i4;
        Float f2;
        byte b2 = this.a;
        nim0 nim0Var = nim0.a;
        boolean z2 = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                b0k b0kVar = (b0k) obj4;
                ((Number) obj5).intValue();
                wsx wsxVar = wsx.c;
                uwr uwrVar = cbx.a;
                long j2 = cbx.a(b0kVar).c.a;
                cvx cvxVar = cbx.b(b0kVar).b;
                qim0 qim0VarX = uyn1.x(nim0Var, 16.0f);
                zov0 zov0Var = cbx.b(b0kVar).g;
                w0h1.a(wsxVar, isl.a, anm1.N("messaging_slate_header_element_icon_tag", u291.r(qim0VarX, 24.0f)), j2, 0L, false, b0kVar, wsx.d | 48, 48);
                return rih1Var;
            case 1:
                ((Number) obj5).intValue();
                x8p1.c((qim0) null, (b0k) obj4, 0);
                return rih1Var;
            case 2:
                bts btsVar = (bts) obj2;
                x340 x340Var = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                if ((iIntValue & 48) == 0) {
                    iIntValue |= x340Var.g(btsVar) ? 32 : 16;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 1041) != 1040)) {
                    int iOrdinal = btsVar.a.ordinal();
                    if (iOrdinal == 0) {
                        x340Var2.i0(1021330368);
                        i9p1.d(cwl1.o0(x340Var2, 2131952285), x340Var2, 0);
                        x340Var2.r(false);
                    } else {
                        if (iOrdinal != 1) {
                            throw p3d1.k(x340Var2, 1021328301, false);
                        }
                        x340Var2.i0(1021334464);
                        i9p1.d(cwl1.o0(x340Var2, 2131952764), x340Var2, 0);
                        x340Var2.r(false);
                    }
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 3:
                d8t d8tVar = (d8t) obj2;
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var3 = (b0k) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                m4c m4cVar = fkj0.X;
                int i5 = (iIntValue2 & 896) ^ 384;
                boolean z3 = (i5 > 256 && x340Var3.g(iu30Var)) || (iIntValue2 & 384) == 256;
                x340 x340Var4 = x340Var3;
                Object objT = x340Var4.T();
                if (z3 || objT == m4cVar) {
                    objT = new jii(iu30Var, (byte) 16);
                    x340Var4.s0(objT);
                }
                Function0 function0 = (Function0) objT;
                boolean z4 = (i5 > 256 && x340Var4.g(iu30Var)) || (iIntValue2 & 384) == 256;
                Object objT2 = x340Var4.T();
                if (z4 || objT2 == m4cVar) {
                    objT2 = new jii(iu30Var, (byte) 17);
                    x340Var4.s0(objT2);
                }
                Function0 function1 = (Function0) objT2;
                boolean z5 = (i5 > 256 && x340Var4.g(iu30Var)) || (iIntValue2 & 384) == 256;
                Object objT3 = x340Var4.T();
                if (z5 || objT3 == m4cVar) {
                    objT3 = new jii(iu30Var, (byte) 18);
                    x340Var4.s0(objT3);
                }
                bbp1.b(d8tVar, function0, function1, (Function0) objT3, null, x340Var4, (iIntValue2 >> 3) & 14);
                return rih1Var;
            case 4:
                jat jatVar = (jat) obj2;
                iu30 iu30Var2 = (iu30) obj3;
                x340 x340Var5 = (b0k) obj4;
                int iIntValue3 = ((Number) obj5).intValue();
                boolean z6 = (((iIntValue3 & 896) ^ 384) > 256 && x340Var5.g(iu30Var2)) || (iIntValue3 & 384) == 256;
                x340 x340Var6 = x340Var5;
                Object objT4 = x340Var6.T();
                if (z6 || objT4 == fkj0.X) {
                    objT4 = new cci(iu30Var2, (byte) 11);
                    x340Var6.s0(objT4);
                }
                xa4.c(jatVar, (qim0) null, (iu30) objT4, x340Var6, (iIntValue3 >> 3) & 14);
                return rih1Var;
            case 5:
                ret retVar = (ret) obj2;
                iu30 iu30Var3 = (iu30) obj3;
                x340 x340Var7 = (b0k) obj4;
                int iIntValue4 = ((Number) obj5).intValue();
                if ((iIntValue4 & 48) == 0) {
                    i2 = (x340Var7.g(retVar) ? 32 : 16) | iIntValue4;
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 384) == 0) {
                    i2 |= x340Var7.i(iu30Var3) ? 256 : 128;
                }
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(i2 & 1, (i2 & 1169) != 1168)) {
                    String str = retVar.a;
                    cd90 cd90Var = retVar.b;
                    boolean z7 = retVar.d;
                    boolean z8 = (i2 & 896) == 256;
                    Object objT5 = x340Var8.T();
                    if (z8 || objT5 == fkj0.X) {
                        objT5 = new jii(iu30Var3, (byte) 19);
                        x340Var8.s0(objT5);
                    }
                    c8o.d(str, cd90Var, z7, (Function0) objT5, x340Var8, 0);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 6:
                fae1.b((rat) obj2, (qim0) null, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 14);
                return rih1Var;
            case 7:
                flt fltVar = (flt) obj2;
                iu30 iu30Var4 = (iu30) obj3;
                x340 x340Var9 = (b0k) obj4;
                int iIntValue5 = ((Number) obj5).intValue();
                String str2 = fltVar.c;
                boolean z9 = ((((iIntValue5 & 896) ^ 384) > 256 && x340Var9.g(iu30Var4)) || (iIntValue5 & 384) == 256) | ((((iIntValue5 & 112) ^ 48) > 32 && x340Var9.g(fltVar)) || (iIntValue5 & 48) == 32);
                x340 x340Var10 = x340Var9;
                Object objT6 = x340Var10.T();
                if (z9 || objT6 == fkj0.X) {
                    objT6 = new dfi(iu30Var4, fltVar, (byte) 2);
                    x340Var10.s0(objT6);
                }
                Function0 function2 = (Function0) objT6;
                if (ihc1.y0(str2)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                poo1.e(new gbx(new y50(str2), function2), pex.b, yoo1.z(x340Var10), (qim0) null, 0, (String) null, (max) null, (vu30) null, (vu30) null, (idn0) null, (ga80) null, false, (vzq0) null, apo.r(-1651242761, new l8i(fltVar, (byte) 6), x340Var10), x340Var10, 0, 3072, 8184);
                return rih1Var;
            case 8:
                iu30 iu30Var5 = (iu30) obj3;
                x340 x340Var11 = (b0k) obj4;
                int iIntValue6 = ((Number) obj5).intValue();
                m4c m4cVar2 = fkj0.X;
                int i6 = (iIntValue6 & 896) ^ 384;
                boolean z10 = (i6 > 256 && x340Var11.g(iu30Var5)) || (iIntValue6 & 384) == 256;
                x340 x340Var12 = x340Var11;
                Object objT7 = x340Var12.T();
                if (z10 || objT7 == m4cVar2) {
                    objT7 = new jii(iu30Var5, (byte) 20);
                    x340Var12.s0(objT7);
                }
                Function0 function3 = (Function0) objT7;
                boolean z11 = (i6 > 256 && x340Var12.g(iu30Var5)) || (iIntValue6 & 384) == 256;
                Object objT8 = x340Var12.T();
                if (z11 || objT8 == m4cVar2) {
                    objT8 = new jii(iu30Var5, (byte) 21);
                    x340Var12.s0(objT8);
                }
                d1u.c(function3, (Function0) objT8, x340Var12, 0);
                return rih1Var;
            case 9:
                a7u a7uVar = (a7u) obj2;
                iu30 iu30Var6 = (iu30) obj3;
                x340 x340Var13 = (b0k) obj4;
                int iIntValue7 = ((Number) obj5).intValue();
                long jK = f5p1.k(x340Var13, 2131102468);
                mbh mbhVarA = jbh.a(h36.e, een.R0, x340Var13, 0);
                x340 x340Var14 = x340Var13;
                int iHashCode = Long.hashCode(x340Var14.T);
                xos0 xos0VarM = x340Var14.m();
                qim0 qim0VarE = zr7.E(x340Var13, nim0Var);
                hzj.A.getClass();
                x340 x340Var15 = x340Var13;
                if (x340Var15.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var15.m0();
                if (x340Var15.S) {
                    x340Var15.l(hmb0.t1);
                } else {
                    x340Var15.v0();
                }
                nko1.H(mbhVarA, x340Var13, y580.O0);
                nko1.H(xos0VarM, x340Var13, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var13, y580.R0);
                nko1.F(x340Var13);
                nko1.H(qim0VarE, x340Var13, y580.Y);
                String strO0 = cwl1.o0(x340Var13, 2131954989);
                String strN0 = cwl1.n0(2131954993, new Object[]{strO0}, x340Var13);
                ye5 ye5VarO = kk0.o(980921497, x340Var15);
                int iO = ye5VarO.o(new zma1(jK, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                try {
                    ye5VarO.g(ihc1.Z0(strN0, strO0));
                    ye5VarO.k(iO);
                    String str3 = a7uVar.a;
                    zma1 zma1Var = new zma1(jK, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.c, (Shadow) null, (PlatformSpanStyle) null, 61438);
                    boolean z12 = ((((iIntValue7 & 112) ^ 48) > 32 && x340Var15.g(a7uVar)) || (iIntValue7 & 48) == 32) | ((((iIntValue7 & 896) ^ 384) > 256 && x340Var15.g(iu30Var6)) || (iIntValue7 & 384) == 256);
                    Object objT9 = x340Var15.T();
                    if (z12 || objT9 == fkj0.X) {
                        objT9 = new puh(iu30Var6, a7uVar, (byte) 8);
                        x340Var15.s0(objT9);
                    }
                    vhg.c(ye5VarO, strO0, str3, zma1Var, (iu30) objT9);
                    int iO2 = ye5VarO.o(new zma1(jK, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                    try {
                        ye5VarO.g(ihc1.U0(strN0, strO0, strN0));
                        ye5VarO.k(iO2);
                        af5 af5VarP = ye5VarO.p();
                        x340Var15.r(false);
                        uwr uwrVar2 = cbx.a;
                        uwo1.d(af5VarP, jK, (qim0) null, cbx.d(x340Var13).m, new a0e1(6), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var13, 0, 0, 4068);
                        x340Var15.r(true);
                        return rih1Var;
                    } catch (Throwable th) {
                        ye5VarO.k(iO2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    ye5VarO.k(iO);
                    throw th2;
                }
            case 10:
                oeu oeuVar = (oeu) obj2;
                iu30 iu30Var7 = (iu30) obj3;
                x340 x340Var16 = (b0k) obj4;
                int iIntValue8 = ((Number) obj5).intValue();
                String strO1 = cwl1.o0(x340Var16, oeuVar.c == c2b0.b ? 2131952287 : 2131952298);
                boolean z13 = (((iIntValue8 & 896) ^ 384) > 256 && x340Var16.g(iu30Var7)) || (iIntValue8 & 384) == 256;
                x340 x340Var17 = x340Var16;
                Object objT10 = x340Var17.T();
                if (z13 || objT10 == fkj0.X) {
                    objT10 = new jii(iu30Var7, (byte) 22);
                    x340Var17.s0(objT10);
                }
                Function0 function4 = (Function0) objT10;
                if (ihc1.y0(strO1)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                gbx gbxVar = new gbx(new y50(strO1), function4);
                idx idxVar2 = new idx(13);
                gdx gdxVarR = yla.r(x340Var17);
                if (oeuVar.a) {
                    x340Var17.i0(1928679499);
                    haxVar = new hax(cwl1.o0(x340Var17, 2131952293));
                    x340Var17.r(false);
                } else {
                    x340Var17.i0(1928829942);
                    x340Var17.r(false);
                    haxVar = jax.a;
                }
                foo1.c(gbxVar, idxVar2, (qim0) null, haxVar, gdxVarR, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-559642431, new pji(strO1, (byte) 0), x340Var17), x340Var17, 0, 48, 1996);
                return rih1Var;
            case 11:
                ((Number) obj5).intValue();
                tm80.g((qim0) null, (b0k) obj4, 0);
                return rih1Var;
            case 12:
                b0k b0kVar2 = (b0k) obj4;
                ((Number) obj5).intValue();
                uwr uwrVar3 = cbx.a;
                cvx cvxVar2 = cbx.b(b0kVar2).b;
                rqo1.g(0, 0, b0kVar2, uyn1.z(16.0f, 0.0f, 2, nim0Var));
                return rih1Var;
            case 13:
                ((Number) obj5).intValue();
                i3o1.e(0, 1, (b0k) obj4, (qim0) null);
                return rih1Var;
            case 14:
                b0k b0kVar3 = (b0k) obj4;
                ((Number) obj5).intValue();
                uwr uwrVar4 = cbx.a;
                cvx cvxVar3 = cbx.b(b0kVar3).b;
                rqo1.g(0, 0, b0kVar3, uyn1.z(16.0f, 0.0f, 2, nim0Var));
                return rih1Var;
            case 15:
                iu30 iu30Var8 = (iu30) obj3;
                x340 x340Var18 = (b0k) obj4;
                int iIntValue9 = ((Number) obj5).intValue();
                int i7 = ((lqu) obj2).a;
                int iC = l1d.C(i7);
                if (iC == 0) {
                    idxVar = new idx();
                } else if (iC == 1) {
                    idxVar = new idx(4);
                } else {
                    if (iC != 2) {
                        eg.o();
                        return null;
                    }
                    idxVar = ldx.c;
                }
                ldx ldxVar = idxVar;
                int iC2 = l1d.C(i7);
                if (iC2 == 0 || iC2 == 1) {
                    x340 x340Var19 = x340Var18;
                    x340Var19.i0(2035735643);
                    x340Var19.r(false);
                    j = u7h.k;
                } else {
                    if (iC2 != 2) {
                        throw p3d1.k(x340Var18, 2035733009, false);
                    }
                    x340 x340Var20 = x340Var18;
                    x340Var20.i0(2035737527);
                    uwr uwrVar5 = cbx.a;
                    j = cbx.a(x340Var20).b.b;
                    x340Var20.r(false);
                }
                int iC3 = l1d.C(1);
                if (iC3 == 0) {
                    x340 x340Var21 = x340Var18;
                    strK = x0d.k(x340Var21, 2035740287, 2131959494, x340Var21, false);
                } else {
                    if (iC3 != 1) {
                        throw p3d1.k(x340Var18, 2035739095, false);
                    }
                    x340 x340Var22 = x340Var18;
                    strK = x0d.k(x340Var22, 2035742528, 2131959492, x340Var22, false);
                }
                z = (((iIntValue9 & 896) ^ 384) > 256 && x340Var18.g(iu30Var8)) || (iIntValue9 & 384) == 256;
                x340 x340Var23 = x340Var18;
                Object objT11 = x340Var23.T();
                if (z || objT11 == fkj0.X) {
                    objT11 = new jii(iu30Var8, (byte) 23);
                    x340Var23.s0(objT11);
                }
                foo1.c(new gbx(z50.c, (Function0) objT11), ldxVar, anm1.N("done_button", nim0Var), (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-1083674895, new icc((byte) 1, j, strK), x340Var23), x340Var23, 0, 48, 2040);
                return rih1Var;
            case 16:
                ((Number) obj5).intValue();
                qqu.c(((oqu) obj2).a, 0, (b0k) obj4, null);
                return rih1Var;
            case 17:
                hyu hyuVar = (hyu) obj2;
                iu30 iu30Var9 = (iu30) obj3;
                x340 x340Var24 = (b0k) obj4;
                int iIntValue10 = ((Number) obj5).intValue();
                m4c m4cVar3 = fkj0.X;
                int i8 = hyuVar.a;
                int i9 = hyuVar.b;
                int i10 = i8 + i9;
                if (i8 <= 0 || i9 <= 0) {
                    i3 = i9 > 0 ? 2131820752 : 2131820750;
                } else {
                    i3 = 2131820751;
                }
                if (i8 <= 0 || i9 <= 0) {
                    i4 = i9 > 0 ? 2131958392 : 2131958390;
                } else {
                    i4 = 2131958391;
                }
                String strO2 = cwl1.o0(x340Var24, 2131958389);
                String strO3 = cwl1.o0(x340Var24, 2131958388);
                int i11 = (iIntValue10 & 896) ^ 384;
                boolean z14 = (i11 > 256 && x340Var24.g(iu30Var9)) || (iIntValue10 & 384) == 256;
                x340 x340Var25 = x340Var24;
                Object objT12 = x340Var25.T();
                if (z14 || objT12 == m4cVar3) {
                    objT12 = new jii(iu30Var9, (byte) 24);
                    x340Var25.s0(objT12);
                }
                Function0 function5 = (Function0) objT12;
                String strU = cwl1.U(i3, i10, new Object[]{Integer.valueOf(i10)}, x340Var25);
                String strO4 = cwl1.o0(x340Var25, i4);
                boolean z15 = (i11 > 256 && x340Var25.g(iu30Var9)) || (iIntValue10 & 384) == 256;
                Object objT13 = x340Var25.T();
                if (z15 || objT13 == m4cVar3) {
                    objT13 = new jii(iu30Var9, (byte) 25);
                    x340Var25.s0(objT13);
                }
                Function0 function6 = (Function0) objT13;
                if (ihc1.y0(strO2)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                zgx zgxVar = new zgx(strO2, new gbx(new y50(strO2), function6));
                z = (i11 > 256 && x340Var25.g(iu30Var9)) || (iIntValue10 & 384) == 256;
                Object objT14 = x340Var25.T();
                if (z || objT14 == m4cVar3) {
                    objT14 = new jii(iu30Var9, (byte) 26);
                    x340Var25.s0(objT14);
                }
                Function0 function7 = (Function0) objT14;
                if (ihc1.y0(strO3)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                mqo1.d(function5, (i3u) null, (hux) null, strU, strO4, zgxVar, new zgx(strO3, new gbx(new y50(strO3), function7)), x340Var25, 2359296, 6);
                return rih1Var;
            case 18:
                iu30 iu30Var10 = (iu30) obj3;
                x340 x340Var26 = (b0k) obj4;
                int iIntValue11 = ((Number) obj5).intValue();
                boolean z16 = (((iIntValue11 & 896) ^ 384) > 256 && x340Var26.g(iu30Var10)) || (iIntValue11 & 384) == 256;
                x340 x340Var27 = x340Var26;
                Object objT15 = x340Var27.T();
                if (z16 || objT15 == fkj0.X) {
                    objT15 = new jii(iu30Var10, (byte) 27);
                    x340Var27.s0(objT15);
                }
                y7y0.e(0, 1, (Function0) objT15, x340Var27, (qim0) null);
                return rih1Var;
            case 19:
                jzu jzuVar = (jzu) obj2;
                ((Number) obj5).intValue();
                boolean z17 = jzuVar.d;
                Object[] objArr = new Object[0];
                x340 x340Var28 = (b0k) obj4;
                Object objT16 = x340Var28.T();
                m4c m4cVar4 = fkj0.X;
                if (objT16 == m4cVar4) {
                    objT16 = fki.b;
                    x340Var28.s0(objT16);
                }
                ven0 ven0Var = (ven0) k5p1.s(objArr, (Function0) objT16, x340Var28, 48);
                Object[] objArr2 = new Object[0];
                Object objT17 = x340Var28.T();
                if (objT17 == m4cVar4) {
                    objT17 = nyf.e1;
                    x340Var28.s0(objT17);
                }
                ven0 ven0Var2 = (ven0) k5p1.s(objArr2, (Function0) objT17, x340Var28, 48);
                Object[] objArr3 = new Object[0];
                Object objT18 = x340Var28.T();
                if (objT18 == m4cVar4) {
                    objT18 = fki.c;
                    x340Var28.s0(objT18);
                }
                ven0 ven0Var3 = (ven0) k5p1.s(objArr3, (Function0) objT18, x340Var28, 48);
                Object[] objArr4 = new Object[0];
                Object objT19 = x340Var28.T();
                if (objT19 == m4cVar4) {
                    objT19 = nyf.d1;
                    x340Var28.s0(objT19);
                }
                ven0 ven0Var4 = (ven0) k5p1.s(objArr4, (Function0) objT19, x340Var28, 48);
                if (z17 && (f2 = jzuVar.a) != null) {
                    ven0Var.setValue(Float.valueOf(f2.floatValue()));
                }
                hzu hzuVar = jzuVar.c;
                if (hzuVar != null) {
                    ven0Var2.setValue(Integer.valueOf(hzuVar.a));
                    ven0Var3.setValue(Integer.valueOf(hzuVar.b));
                }
                ven0Var4.setValue(Boolean.valueOf(z17));
                d9y0.b(((Number) ven0Var.getValue()).floatValue(), jzuVar.b, ((Number) ven0Var3.getValue()).intValue() > 0 ? new hzu(((Number) ven0Var2.getValue()).intValue(), ((Number) ven0Var3.getValue()).intValue(), true) : null, ((Boolean) ven0Var4.getValue()).booleanValue(), u291.f(nim0Var, 1.0f), x340Var28, 0);
                return rih1Var;
            case 20:
                qxy0.e((w0v) obj2, (iu30) obj3, null, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 126);
                return rih1Var;
            case 21:
                yev yevVar = (yev) obj2;
                iu30 iu30Var11 = (iu30) obj3;
                x340 x340Var29 = (b0k) obj4;
                int iIntValue12 = ((Number) obj5).intValue();
                hux huxVar = yevVar.a;
                String strO5 = cwl1.o0(x340Var29, yevVar.b);
                String strO6 = cwl1.o0(x340Var29, yevVar.c);
                if ((((iIntValue12 & 896) ^ 384) <= 256 || !x340Var29.g(iu30Var11)) && (iIntValue12 & 384) != 256) {
                    z2 = false;
                }
                x340 x340Var30 = x340Var29;
                Object objT20 = x340Var30.T();
                if (z2 || objT20 == fkj0.X) {
                    objT20 = new jii(iu30Var11, (byte) 28);
                    x340Var30.s0(objT20);
                }
                kyo1.c(strO5, huxVar, (Function0) objT20, (qim0) null, false, strO6, (v2g) null, (vu30) null, x340Var30, 64, 216);
                return rih1Var;
            case 22:
                iu30 iu30Var12 = (iu30) obj3;
                x340 x340Var31 = (b0k) obj4;
                int iIntValue13 = ((Number) obj5).intValue();
                String str4 = ((qkv) obj2).b;
                if ((((iIntValue13 & 896) ^ 384) <= 256 || !x340Var31.g(iu30Var12)) && (iIntValue13 & 384) != 256) {
                    z2 = false;
                }
                x340 x340Var32 = x340Var31;
                Object objT21 = x340Var32.T();
                if (z2 || objT21 == fkj0.X) {
                    objT21 = new jii(iu30Var12, (byte) 29);
                    x340Var32.s0(objT21);
                }
                ukv.a(0, str4, (Function0) objT21, x340Var32);
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return a(obj, obj2, obj3, obj4, obj5);
            case 24:
                apv apvVar = (apv) obj2;
                iu30 iu30Var13 = (iu30) obj3;
                x340 x340Var33 = (b0k) obj4;
                int iIntValue14 = ((Number) obj5).intValue();
                m4c m4cVar5 = fkj0.X;
                String str5 = apvVar.a;
                boolean z18 = apvVar.b;
                int i12 = (iIntValue14 & 896) ^ 384;
                boolean z19 = (i12 > 256 && x340Var33.g(iu30Var13)) || (iIntValue14 & 384) == 256;
                x340 x340Var34 = x340Var33;
                Object objT22 = x340Var34.T();
                if (z19 || objT22 == m4cVar5) {
                    objT22 = new pki(iu30Var13, (byte) 5);
                    x340Var34.s0(objT22);
                }
                Function0 function8 = (Function0) objT22;
                boolean z20 = (i12 > 256 && x340Var34.g(iu30Var13)) || (iIntValue14 & 384) == 256;
                Object objT23 = x340Var34.T();
                if (z20 || objT23 == m4cVar5) {
                    objT23 = new cci(iu30Var13, (byte) 14);
                    x340Var34.s0(objT23);
                }
                iu30 iu30Var14 = (iu30) objT23;
                if ((i12 <= 256 || !x340Var34.g(iu30Var13)) && (iIntValue14 & 384) != 256) {
                    z2 = false;
                }
                Object objT24 = x340Var34.T();
                if (z2 || objT24 == m4cVar5) {
                    objT24 = new pki(iu30Var13, (byte) 6);
                    x340Var34.s0(objT24);
                }
                xpn1.c(str5, z18, function8, iu30Var14, (Function0) objT24, x340Var34, 0);
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return d(obj, obj2, obj3, obj4, obj5);
            case 26:
                return e(obj, obj2, obj3, obj4, obj5);
            case 27:
                return f(obj, obj2, obj3, obj4, obj5);
            case 28:
                return g(obj, obj2, obj3, obj4, obj5);
            default:
                b0k b0kVar4 = (b0k) obj4;
                ((Number) obj5).intValue();
                nyx.a(0, (wux) null, apo.r(-42942796, new l8i((t6x) obj2, (byte) 9), b0kVar4), b0kVar4, 3072, 7);
                return rih1Var;
        }
    }
}
