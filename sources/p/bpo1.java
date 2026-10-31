package p;

import android.net.Uri;
import androidx.compose.ui.text.font.FontWeight;
import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class bpo1 {
    public static b180 a;

    public static final e9p0 A(q8n q8nVar, dmj1 dmj1Var) {
        return new e9p0(q8nVar, dmj1Var);
    }

    public static final long B(long j, String str) {
        Long lD0;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (('0' <= cCharAt && cCharAt < ':') || (('A' <= cCharAt && cCharAt < 'G') || ('a' <= cCharAt && cCharAt < 'g'))) {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        if (string.length() != 6 || (lD0 = nhc1.d0(16, string)) == null) {
            return j;
        }
        long jLongValue = lD0.longValue();
        return z4p1.f((int) ((jLongValue >> 16) & 255), (int) ((jLongValue >> 8) & 255), (int) (jLongValue & 255), 255);
    }

    public static final boolean C(ji0 ji0Var, jjh1 jjh1Var, i44 i44Var) {
        return i44Var.c() && !y(ji0Var, jjh1Var);
    }

    public static i6m1 D(tl3 tl3Var, boolean z) {
        return new i6m1(3, z, new h6m1(tl3Var, (byte) 2), tl3Var);
    }

    public static i6m1 E(nl3 nl3Var, boolean z) {
        return new i6m1(2, z, new h6m1(nl3Var, (byte) 0), nl3Var);
    }

    public static String F(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (iIndexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, iIndexOf);
            sb.append(G(objArr[i]));
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(G(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String G(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String strQ = l1d.q(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strQ), (Throwable) e);
            String name2 = e.getClass().getName();
            StringBuilder sb = new StringBuilder(strQ.length() + 8 + name2.length() + 1);
            bb00.j(sb, "<", strQ, " threw ", name2);
            sb.append(">");
            return sb.toString();
        }
    }

    public static final void a(wb81 wb81Var, Function0 function0, b0k b0kVar, int i) {
        ArrayList<lb81> arrayList = wb81Var.f;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(680337755);
        int i2 = (x340Var.g(wb81Var) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            if (arrayList.isEmpty()) {
                x340Var.i0(-274652181);
                x340Var.r(false);
            } else {
                x340Var.i0(-274925105);
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                for (lb81 lb81Var : arrayList) {
                    arrayList2.add(new phx(10, 0L, lb81Var.b, (String) null, lb81Var.a));
                }
                fc11.a(mqo1.A(arrayList2), (qim0) null, hcx.c, (hux) null, true, 6, (gbx) null, (String) null, (idn0) null, x340Var, 221576, 458);
                x340Var.r(false);
            }
            op71.g(x340Var, new wnb0(1.0f, true));
            if (ihc1.y0("Manage")) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50("Manage"), function0);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = nva1.c1;
                x340Var.s0(objT);
            }
            vu30 vu30Var = (vu30) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = nva1.d1;
                x340Var.s0(objT2);
            }
            foo1.c(gbxVar, new hdx(0, vu30Var, (vu30) null, (vu30) objT2, (hw61) null, 21), null, null, yla.s(x340Var), null, null, null, null, null, slj.a, x340Var, 0, 48, 2012);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sdb1(wb81Var, function0, i, (byte) 7);
        }
    }

    public static final void b(zkn zknVar, iu30 iu30Var, wn50 wn50Var, q251 q251Var, gv51 gv51Var, d6o0 d6o0Var, v361 v361Var, fm50 fm50Var, cb0 cb0Var, qim0 qim0Var, b0k b0kVar, int i) {
        zkn zknVar2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-534751762);
        int i2 = i | (b0kVar3.g(zknVar) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | (b0kVar3.i(wn50Var) ? 256 : 128) | (b0kVar3.i(q251Var) ? 2048 : 1024) | (b0kVar3.i(gv51Var) ? 16384 : 8192) | (b0kVar3.i(d6o0Var) ? 131072 : 65536) | (b0kVar3.i(v361Var) ? 1048576 : 524288) | (b0kVar3.g(fm50Var) ? 8388608 : 4194304) | (b0kVar3.i(cb0Var) ? 67108864 : 33554432);
        if (b0kVar3.Y(i2 & 1, (306783379 & i2) != 306783378)) {
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            Object[] objArr = new Object[0];
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = lmm.N0;
                b0kVar3.s0(objT2);
            }
            ven0 ven0Var2 = (ven0) k5p1.s(objArr, (Function0) objT2, b0kVar3, 48);
            j2i j2iVarR = apo.r(-2063832738, new jjk(zknVar, iu30Var, (byte) 26), b0kVar3);
            zknVar2 = zknVar;
            j2i j2iVarR2 = apo.r(-737859859, new jkn(zknVar, iu30Var, d6o0Var, wn50Var, v361Var, gv51Var, cb0Var, ven0Var2, fm50Var, ven0Var), b0kVar3);
            boolean zG = b0kVar3.g(ven0Var2);
            Object objT3 = b0kVar3.T();
            if (zG || objT3 == m4cVar) {
                objT3 = new bzm(ven0Var2, (byte) 3);
                b0kVar3.s0(objT3);
            }
            b0kVar2 = b0kVar3;
            fuo1.a(j2iVarR, j2iVarR2, q251Var, (iu30) objT3, qim0Var, !zknVar2.b.isEmpty(), b0kVar2, ((i2 >> 3) & 896) | 24630, 0);
            if (((Boolean) ven0Var.getValue()).booleanValue() || zknVar2.k) {
                b0kVar2.i0(-741881967);
                nim0 nim0Var = nim0.a;
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                uwr uwrVar = cbx.a;
                qim0 qim0VarF = dug.f(qim0VarD, u7h.b(cbx.a(b0kVar2).a.c, 0.6f, 0.0f, 0.0f, 0.0f, 14), d4o1.a);
                Object objT4 = b0kVar2.T();
                if (objT4 == m4cVar) {
                    objT4 = ktd.n(b0kVar2);
                }
                idn0 idn0Var = (idn0) objT4;
                Object objT5 = b0kVar2.T();
                if (objT5 == m4cVar) {
                    objT5 = lmm.Z;
                    b0kVar2.s0(objT5);
                }
                qim0 qim0VarV = bin.v(qim0VarF, idn0Var, null, false, null, null, (Function0) objT5, 28);
                Object objT6 = b0kVar2.T();
                if (objT6 == m4cVar) {
                    objT6 = y6n.d1;
                    b0kVar2.s0(objT6);
                }
                qim0 qim0VarB = s161.b(qim0VarV, false, (iu30) objT6);
                gfh0 gfh0VarC = t1c.c(een.h, false);
                int iHashCode = Long.hashCode(((x340) b0kVar2).T);
                xos0 xos0VarM = b0kVar2.m();
                qim0 qim0VarE = zr7.E(b0kVar2, qim0VarB);
                hzj.A.getClass();
                if (((x340) b0kVar2).a == null) {
                    tgp1.p();
                    throw null;
                }
                b0kVar2.m0();
                if (((x340) b0kVar2).S) {
                    b0kVar2.l(hmb0.t1);
                } else {
                    b0kVar2.v0();
                }
                nko1.H(gfh0VarC, b0kVar2, y580.O0);
                nko1.H(xos0VarM, b0kVar2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
                nko1.F(b0kVar2);
                nko1.H(qim0VarE, b0kVar2, y580.Y);
                xto1.e(u291.B(nim0Var, (gra) null, 3), 6, 0L, 0L, b0kVar2, 54, 12);
                b0kVar2.r(true);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(-741356300);
                b0kVar2.r(false);
            }
        } else {
            zknVar2 = zknVar;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new o06(zknVar2, iu30Var, wn50Var, q251Var, gv51Var, d6o0Var, v361Var, fm50Var, cb0Var, qim0Var, i, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:46:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x0095  */
    /* JADX WARN: Code duplicated, block: B:51:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    public static final void c(String str, String str2, qim0 qim0Var, k9 k9Var, boolean z, long j, boolean z2, b0k b0kVar, int i, int i2) {
        qim0 qim0Var2;
        int i3;
        int i4;
        int i5;
        boolean z3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z4;
        b0k b0kVar2;
        boolean z5;
        qim0 qim0Var3;
        boolean z6;
        long j2;
        h311 h311VarV;
        qim0 qim0Var4;
        boolean z7;
        long j3;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1512133557);
        int i11 = (b0kVar3.g(str) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i11 |= b0kVar3.g(str2) ? 32 : 16;
        }
        int i12 = i2 & 4;
        if (i12 == 0) {
            if ((i & 384) == 0) {
                qim0Var2 = qim0Var;
                i11 |= b0kVar3.g(qim0Var2) ? 256 : 128;
            }
            if (b0kVar3.g(k9Var)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i4 = i11 | i3;
            i5 = i2 & 16;
            if (i5 != 0) {
                if ((i & 24576) == 0) {
                    z3 = z;
                    if (b0kVar3.h(z3)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i4 |= i6;
                }
                i7 = i2 & 32;
                if (i7 != 0) {
                    i9 = i4 | 196608;
                } else {
                    if (b0kVar3.f(j)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i9 = i4 | i8;
                }
                i10 = i9 | 14155776;
                if ((4793491 & i10) != 4793490) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (b0kVar3.Y(i10 & 1, z4)) {
                    if (i12 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i5 != 0) {
                        z7 = true;
                    } else {
                        z7 = z3;
                    }
                    if (i7 != 0) {
                        j3 = u7h.d;
                    } else {
                        j3 = j;
                    }
                    int i13 = i10 & 8176;
                    int i14 = i10 << 3;
                    b0kVar2 = b0kVar3;
                    d(Uri.parse(str), str2, qim0Var4, k9Var, null, z7, j3, b0kVar2, (i14 & 3670016) | i13 | (458752 & i14) | 113246208);
                    qim0Var3 = qim0Var4;
                    z6 = z7;
                    j2 = j3;
                    z5 = true;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    z5 = z2;
                    qim0Var3 = qim0Var2;
                    z6 = z3;
                    j2 = j;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new l37(str, str2, qim0Var3, k9Var, z6, j2, z5, i, i2);
                }
            }
            i4 |= 24576;
            z3 = z;
            i7 = i2 & 32;
            if (i7 != 0) {
                i9 = i4 | 196608;
            } else {
                if (b0kVar3.f(j)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i9 = i4 | i8;
            }
            i10 = i9 | 14155776;
            if ((4793491 & i10) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (b0kVar3.Y(i10 & 1, z4)) {
                if (i12 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i5 != 0) {
                    z7 = true;
                } else {
                    z7 = z3;
                }
                if (i7 != 0) {
                    j3 = u7h.d;
                } else {
                    j3 = j;
                }
                int i15 = i10 & 8176;
                int i16 = i10 << 3;
                b0kVar2 = b0kVar3;
                d(Uri.parse(str), str2, qim0Var4, k9Var, null, z7, j3, b0kVar2, (i16 & 3670016) | i15 | (458752 & i16) | 113246208);
                qim0Var3 = qim0Var4;
                z6 = z7;
                j2 = j3;
                z5 = true;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                z5 = z2;
                qim0Var3 = qim0Var2;
                z6 = z3;
                j2 = j;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new l37(str, str2, qim0Var3, k9Var, z6, j2, z5, i, i2);
            }
        }
        i11 |= 384;
        qim0Var2 = qim0Var;
        if (b0kVar3.g(k9Var)) {
            i3 = 2048;
        } else {
            i3 = 1024;
        }
        i4 = i11 | i3;
        i5 = i2 & 16;
        if (i5 != 0) {
            if ((i & 24576) == 0) {
                z3 = z;
                if (b0kVar3.h(z3)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i4 |= i6;
            }
            i7 = i2 & 32;
            if (i7 != 0) {
                i9 = i4 | 196608;
            } else {
                if (b0kVar3.f(j)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i9 = i4 | i8;
            }
            i10 = i9 | 14155776;
            if ((4793491 & i10) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (b0kVar3.Y(i10 & 1, z4)) {
                if (i12 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i5 != 0) {
                    z7 = true;
                } else {
                    z7 = z3;
                }
                if (i7 != 0) {
                    j3 = u7h.d;
                } else {
                    j3 = j;
                }
                int i17 = i10 & 8176;
                int i18 = i10 << 3;
                b0kVar2 = b0kVar3;
                d(Uri.parse(str), str2, qim0Var4, k9Var, null, z7, j3, b0kVar2, (i18 & 3670016) | i17 | (458752 & i18) | 113246208);
                qim0Var3 = qim0Var4;
                z6 = z7;
                j2 = j3;
                z5 = true;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                z5 = z2;
                qim0Var3 = qim0Var2;
                z6 = z3;
                j2 = j;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new l37(str, str2, qim0Var3, k9Var, z6, j2, z5, i, i2);
            }
        }
        i4 |= 24576;
        z3 = z;
        i7 = i2 & 32;
        if (i7 != 0) {
            i9 = i4 | 196608;
        } else {
            if (b0kVar3.f(j)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i9 = i4 | i8;
        }
        i10 = i9 | 14155776;
        if ((4793491 & i10) != 4793490) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (b0kVar3.Y(i10 & 1, z4)) {
            if (i12 != 0) {
                qim0Var4 = nim0.a;
            } else {
                qim0Var4 = qim0Var2;
            }
            if (i5 != 0) {
                z7 = true;
            } else {
                z7 = z3;
            }
            if (i7 != 0) {
                j3 = u7h.d;
            } else {
                j3 = j;
            }
            int i19 = i10 & 8176;
            int i110 = i10 << 3;
            b0kVar2 = b0kVar3;
            d(Uri.parse(str), str2, qim0Var4, k9Var, null, z7, j3, b0kVar2, (i110 & 3670016) | i19 | (458752 & i110) | 113246208);
            qim0Var3 = qim0Var4;
            z6 = z7;
            j2 = j3;
            z5 = true;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            z5 = z2;
            qim0Var3 = qim0Var2;
            z6 = z3;
            j2 = j;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new l37(str, str2, qim0Var3, k9Var, z6, j2, z5, i, i2);
        }
    }

    public static final void d(Uri uri, String str, qim0 qim0Var, k9 k9Var, jmr0 jmr0Var, boolean z, long j, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        jmr0 jmr0Var2;
        int i3;
        jmr0 jmr0Var3;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-928073355);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(uri) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.g(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.g(k9Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar3.h(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= b0kVar3.f(j) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= b0kVar3.g((Object) null) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= b0kVar3.h(true) ? 67108864 : 33554432;
        }
        if (b0kVar3.Y(i2 & 1, (38347923 & i2) != 38347922)) {
            b0kVar3.d0();
            if ((i & 1) == 0 || b0kVar3.E()) {
                jmr0 jmr0VarE = hso1.E(2131232011, 0L, false, 0L, b0kVar3, 0, 14);
                b0kVar3 = b0kVar3;
                i3 = i2 & (-57345);
                jmr0Var3 = jmr0VarE;
            } else {
                b0kVar3.b0();
                i3 = i2 & (-57345);
                jmr0Var3 = jmr0Var;
            }
            b0kVar3.s();
            b0kVar3.i0(-1528430677);
            b0kVar3.r((boolean) r12);
            nim0 nim0Var = nim0.a;
            b0kVar2 = b0kVar3;
            jmr0 jmr0Var4 = jmr0Var3;
            cso1.f(oi7.a(uri, (gw70) null, (xb10) null, (yqi1) null, jmr0Var3, (jmr0) null, false, false, (j6m) null, (iu30) null, (iu30) null, (iu30) null, 0L, b0kVar2, (i3 & 14) | 262144, 0, 131030), (str == null || ihc1.y0(str)) ? isl.a : new jsl(str), dug.f(d7e.r(1.0f, nim0Var, false).then(z ? sto1.o(nim0Var, 24.0f, (cr31) k9Var.b, false, 0L, 0L, 28) : i1p1.q(nim0Var, (cr31) k9Var.b)), j, d4o1.a).then(qim0Var), null, null, b0kVar2, 0, 56);
            jmr0Var2 = jmr0Var4;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            jmr0Var2 = jmr0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new fa5(uri, str, qim0Var, k9Var, jmr0Var2, z, j, i);
        }
    }

    public static final spw e(long j, long j2, long j3) {
        return new spw(j, j2, j3);
    }

    public static final void f(String str, long j, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(81578734);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.f(j) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            long jB = u7h.b(j, 0.0f, u7h.g(j) * 0.9f, u7h.f(j) * 0.9f, u7h.d(j) * 0.9f, 1);
            fra fraVar = een.N0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            d36 d36Var = new d36(6.0f, true, new um5(false));
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            cua cuaVar = cbx.b(x340Var).f;
            cua cuaVar2 = cbx.b(x340Var).f;
            qim0 qim0VarX = uyn1.x(dug.f(qim0VarF, jB, er31.d(0.0f, 0.0f, 8.0f, 8.0f, 3)), cbx.b(x340Var).b.a);
            jw31 jw31VarA = ew31.a(d36Var, fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
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
            ktx ktxVar = ktx.c;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(ktxVar, isl.a, u291.r(nim0Var, 12.0f), u7h.b(cbx.a(x340Var).b.a, 0.7f, 0.0f, 0.0f, 0.0f, 14), 0L, false, x340Var, ktx.d | 48, 48);
            uwo1.e(str, null, cbx.d(x340Var).j, u7h.b(cbx.a(x340Var).b.a, 0.7f, 0.0f, 0.0f, 0.0f, 14), null, null, 0, false, null, 0, null, x340Var, i2 & 14, 0, 2034);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new icc(str, j, i, (byte) 9);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void g(String str, ie60 ie60Var, j2i j2iVar, j2i j2iVar2, j2i j2iVar3, j2i j2iVar4, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1199460674);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(ie60Var) : x340Var.i(ie60Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(j2iVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(j2iVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(j2iVar3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(j2iVar4) ? 131072 : 65536;
        }
        if (!x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            x340Var.b0();
        } else if (ie60Var.equals(he60.a)) {
            x340Var.i0(1630484118);
            j2iVar.invoke(str, x340Var, Integer.valueOf(((i2 >> 3) & 112) | (i2 & 14)));
            x340Var.r(false);
        } else if (ie60Var.equals(fe60.a)) {
            x340Var.i0(1630486166);
            j2iVar2.invoke(str, x340Var, Integer.valueOf(((i2 >> 6) & 112) | (i2 & 14)));
            x340Var.r(false);
        } else if (ie60Var instanceof ge60) {
            x340Var.i0(1630488159);
            j2iVar3.J(str, ((ge60) ie60Var).a, x340Var, Integer.valueOf(((i2 >> 6) & 896) | (i2 & 14)));
            x340Var.r(false);
        } else {
            if (!ie60Var.equals(ee60.a)) {
                throw p3d1.k(x340Var, 1630482341, false);
            }
            x340Var.i0(1630490552);
            j2iVar4.invoke(str, x340Var, Integer.valueOf(((i2 >> 12) & 112) | (i2 & 14)));
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wc0(str, ie60Var, j2iVar, j2iVar2, j2iVar3, j2iVar4, i, (byte) 20);
        }
    }

    public static final void h(boolean z, String str, String str2, vu30 vu30Var, vu30 vu30Var2, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        String str3;
        Function0 function0;
        boolean z2;
        boolean z3 = z;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(986859759);
        j06 j06Var = ((x340) b0kVar3).a;
        int i2 = i | (b0kVar3.h(z3) ? 4 : 2) | (b0kVar3.g(str) ? 32 : 16) | (b0kVar3.g(str2) ? 256 : 128) | (b0kVar3.i(vu30Var) ? 2048 : 1024) | (b0kVar3.i(vu30Var2) ? 16384 : 8192) | (b0kVar3.i(qim0Var) ? 131072 : 65536);
        if (b0kVar3.Y(i2 & 1, (i2 & 74899) != 74898)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            qim0 qim0VarB = uyn1.B(qim0Var, 12.0f, 0.0f, 16.0f, 0.0f, 10);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            boolean z4 = ((x340) b0kVar3).S;
            Function0 function1 = hmb0.t1;
            if (z4) {
                b0kVar3.l(function1);
            } else {
                b0kVar3.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, b0kVar3, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar3, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar3, lljVar3);
            nko1.F(b0kVar3);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar3, lljVar4);
            uwo1.e(str, null, null, 0L, null, null, 0, false, null, 0, null, b0kVar3, (i2 >> 3) & 14, 0, 2046);
            b0kVar2 = b0kVar3;
            cvx cvxVar3 = cbx.b(b0kVar2).b;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarB2 = uyn1.B(nim0Var, 0.0f, 16.0f, 0.0f, 0.0f, 13);
            fra fraVar = een.N0;
            gex0 gex0Var = h36.a;
            jw31 jw31VarA = ew31.a(gex0Var, fraVar, b0kVar2, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarB2);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                function0 = function1;
                b0kVar2.l(function0);
            } else {
                function0 = function1;
                b0kVar2.v0();
            }
            nko1.H(jw31VarA, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            if (vu30Var == null) {
                b0kVar2.i0(1556866084);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(-1612346499);
                us71.j((i2 >> 9) & 14, vu30Var, b0kVar2, false);
            }
            if (str2 == null) {
                b0kVar2.i0(1556898014);
                b0kVar2.r(false);
                z2 = true;
                z3 = z;
                str3 = str2;
            } else {
                b0kVar2.i0(1556898015);
                cvx cvxVar4 = cbx.b(b0kVar2).b;
                Function0 function2 = function0;
                qim0 qim0VarB3 = uyn1.B(nim0Var, 8.0f, 0.0f, 0.0f, 0.0f, 14);
                jw31 jw31VarA2 = ew31.a(gex0Var, fraVar, b0kVar2, 0);
                int iHashCode3 = Long.hashCode(((x340) b0kVar2).T);
                xos0 xos0VarM3 = b0kVar2.m();
                qim0 qim0VarE3 = zr7.E(b0kVar2, qim0VarB3);
                b0kVar2.m0();
                if (((x340) b0kVar2).S) {
                    b0kVar2.l(function2);
                } else {
                    b0kVar2.v0();
                }
                nko1.H(jw31VarA2, b0kVar2, lljVar);
                nko1.H(xos0VarM3, b0kVar2, lljVar2);
                x0d.q(iHashCode3, b0kVar2, lljVar3, b0kVar2);
                nko1.H(qim0VarE3, b0kVar2, lljVar4);
                z3 = z;
                str3 = str2;
                i((i2 << 3) & 112, str3, b0kVar2, z3);
                z2 = true;
                b0kVar2.r(true);
                b0kVar2.r(false);
            }
            b0kVar2.r(z2);
            vu30 vu30Var3 = (vu30Var2 == null || !z3) ? null : vu30Var2;
            if (vu30Var3 == null) {
                b0kVar2.i0(-279167744);
            } else {
                c13.o(b0kVar2, 129541921, 0, vu30Var3, b0kVar2);
            }
            b0kVar2.r(false);
            b0kVar2.r(z2);
        } else {
            b0kVar2 = b0kVar3;
            str3 = str2;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wr1(z3, str, (Object) str3, (Object) vu30Var, (Object) vu30Var2, qim0Var, i, (byte) 19);
        }
    }

    public static final void i(int i, String str, b0k b0kVar, boolean z) {
        int i2;
        lee1 lee1Var;
        long j;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2005747527);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean zY = nhc1.Y(str, "***", false);
            String strX = nhc1.X(str, "***", "");
            if (zY) {
                x340Var.i0(1639833132);
                int i3 = i2;
                fpx fpxVar = fpx.c;
                uwr uwrVar = cbx.a;
                long j2 = cbx.a(x340Var).b.b;
                long j3 = cbx.a(x340Var).b.a;
                cvx cvxVar = cbx.b(x340Var).b;
                w0h1.a(fpxVar, isl.a, uyn1.B(nim0.a, 0.0f, 0.0f, 6.0f, 0.0f, 11), j2, j3, z, x340Var, fpx.d | 48 | ((i3 << 12) & 458752), 0);
                x340Var.r(false);
            } else {
                x340Var.i0(1640128283);
                x340Var.r(false);
            }
            if (z) {
                x340Var.i0(-916921196);
                uwr uwrVar2 = cbx.a;
                lee1Var = cbx.d(x340Var).k;
            } else {
                x340Var.i0(-916920016);
                uwr uwrVar3 = cbx.a;
                lee1Var = cbx.d(x340Var).j;
            }
            x340Var.r(false);
            lee1 lee1Var2 = lee1Var;
            if (z) {
                x340Var.i0(-916918101);
                j = cbx.a(x340Var).b.a;
            } else {
                x340Var.i0(-916917106);
                j = cbx.a(x340Var).b.b;
            }
            x340Var.r(false);
            uwo1.e(strX, null, lee1Var2, j, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fkd0((byte) 1, i, str, z);
        }
    }

    public static final void j(long j, b0k b0kVar, int i) {
        long j2 = j;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1737405956);
        int i2 = i | (x340Var.f(j2) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            fra fraVar = een.N0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(4.0f, true, new um5(false)), fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
            wsx wsxVar = wsx.c;
            zov0 zov0Var = cbx.b(x340Var).g;
            int i3 = (i2 << 9) & 7168;
            w0h1.a(wsxVar, isl.a, u291.r(nim0Var, 16.0f), j2, 0L, false, x340Var, wsx.d | 48 | i3, 48);
            j2 = j;
            uwo1.e("Premium", null, cbx.d(x340Var).k, j2, null, null, 0, false, null, 0, null, x340Var, i3 | 6, 0, 2034);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q9j0(j2, i, (byte) 23);
        }
    }

    public static final void k(boolean z, boolean z2, String str, iu30 iu30Var, u201 u201Var, iu30 iu30Var2, c380 c380Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(42585804);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.h(z2) ? 32 : 16) | (x340Var.g(str) ? 256 : 128) | (x340Var.i(u201Var) ? 16384 : 8192) | (x340Var.i(c380Var) ? 1048576 : 524288);
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            hap1.c(z2, z ? sgc1.u(1.0f, 1.0f) : sgc1.u(0.0f, 1.0f), apo.r(184380015, new n2y0(u201Var, c380Var, str, iu30Var, iu30Var2, (byte) 1), x340Var), x340Var, ((i2 >> 3) & 14) | 384);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vl(z, z2, str, iu30Var, u201Var, iu30Var2, c380Var, i);
        }
    }

    public static final void l(wb81 wb81Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-678952834);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(wb81Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(function0) ? 32 : 16;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            String str = wb81Var.e;
            uwr uwrVar = cbx.a;
            long jB = B(cbx.a(b0kVar3).a.c, str);
            long jB2 = B(u7h.f, wb81Var.d);
            String str2 = wb81Var.c;
            if (str2.length() == 0) {
                str2 = wb81Var.b;
            }
            String str3 = str2;
            cua cuaVar = cbx.b(b0kVar3).f;
            j2i j2iVarR = apo.r(828421894, new ync1(jB, er31.b(8.0f), wb81Var, jB2, str3, function0), b0kVar3);
            b0kVar2 = b0kVar3;
            gfx.a(jB, 0L, j2iVarR, b0kVar2, 384);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new heb1(wb81Var, function0, i, (byte) 9);
        }
    }

    public static final void m(String str, String str2, String str3, String str4, hcx hcxVar, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-736358161);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.g(str3) ? 256 : 128) | (x340Var.g(str4) ? 2048 : 1024) | (x340Var.e(hcxVar.ordinal()) ? 16384 : 8192) | 196608;
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(8.0f, true, new g21(een.Q0, (byte) 29)), een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var3);
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
            bmq0.a(Uri.parse(str3 == null ? "" : str3), (qim0) null, hcxVar, str, str2 == null ? str : str2, 0L, 0L, false, x340Var, ((i2 >> 6) & 896) | ((i2 << 9) & 7168), 226);
            gxo1.c(str4, null, cbx.d(x340Var).g, cbx.a(x340Var).b.a, new a0e1(3), 2, false, new cjc0(1), new px8(fc11.G(8), fc11.G(16), 0L, new mx8(1), 4), 96.0f, (FontWeight) ((bjx) ajx.a.c).b, null, x340Var, ((i2 >> 9) & 14) | 134217728, 0, 2114);
            x340Var = x340Var;
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wyy0(str, str2, str3, str4, hcxVar, qim0Var2, i, (byte) 18);
        }
    }

    public static final int n(String str) {
        String str2;
        if (str != null) {
            int i = 0;
            for (int i2 : l1d.H(3)) {
                if (i2 == 1) {
                    str2 = "UNAVAILABLE";
                } else if (i2 == 2) {
                    str2 = "ENABLED";
                } else {
                    if (i2 != 3) {
                        throw null;
                    }
                    str2 = "DISABLED";
                }
                if (str2.equalsIgnoreCase(str)) {
                    i = i2;
                    break;
                }
            }
            if (i != 0) {
                return i;
            }
        }
        return 1;
    }

    public static final int o(String str) {
        String str2;
        int i = 0;
        if (str == null) {
            return 0;
        }
        for (int i2 : l1d.H(4)) {
            if (i2 == 1) {
                str2 = "UNKNOWN_SESSION_TYPE";
            } else if (i2 == 2) {
                str2 = "IN_PERSON";
            } else if (i2 == 3) {
                str2 = "REMOTE";
            } else {
                if (i2 != 4) {
                    throw null;
                }
                str2 = "REMOTE_V2";
            }
            if (str2.equalsIgnoreCase(str)) {
                i = i2;
                break;
            }
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public static wcm p(String str, yh10 yh10Var, boolean z, boolean z2, boolean z3, boolean z4, Function0 function0, pm0 pm0Var, String str2, boolean z5, iu30 iu30Var, boolean z6, mgo0 mgo0Var, g371 g371Var, int i) {
        yh10 yh10Var2 = (i & 2) != 0 ? null : yh10Var;
        boolean z7 = (i & 4) != 0;
        boolean z8 = (i & 8) == 0;
        boolean z9 = (i & 64) != 0 ? true : z3;
        boolean z10 = (i & 128) != 0 ? true : z4;
        Function0 function1 = (i & 256) != 0 ? null : function0;
        pm0 pm0Var2 = (i & 512) != 0 ? null : pm0Var;
        boolean z11 = (i & 2048) != 0 ? false : z5;
        iu30 iu30Var2 = (i & 4096) != 0 ? null : iu30Var;
        boolean z12 = (i & 8192) != 0 ? false : z6;
        mgo0 mgo0Var2 = (i & 16384) != 0 ? null : mgo0Var;
        g371 g371Var2 = (i & 32768) != 0 ? new g371() : g371Var;
        Set set = s4b1.f;
        return new wcm(str, (String) null, (String) null, scm.a, function1, new aim(uic.g(str, blc0.ed), z9 && (!z || z2), z7, yh10Var2, z8, pm0Var2, z11, iu30Var2, z10, z12, mgo0Var2, g371Var2), false, str2, (String) null, 838);
    }

    public static final uho q(String str, String str2, String str3) {
        return new uho(str, str2, qho.a, (nho) null, str3, (Function0) null, 232);
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0168  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a1  */
    public static lfi0 r(nbw0 nbw0Var, xkk1 xkk1Var, xkk1 xkk1Var2, ytp0 ytp0Var, hvp0 hvp0Var, boolean z, k4m k4mVar, wcm wcmVar, String str, d2k1 d2k1Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, String str2, String str3, String str4, String str5, boolean z11, boolean z12, String str6, Float f, int i) {
        mmr0 mmr0Var;
        String str7;
        String str8;
        String strL;
        xkk1 xkk1Var3 = (i & 4) != 0 ? null : xkk1Var2;
        hvp0 hvp0Var2 = (i & 16) != 0 ? null : hvp0Var;
        String str9 = (i & 256) != 0 ? null : str;
        d2k1 d2k1Var2 = (i & 512) != 0 ? null : d2k1Var;
        boolean z13 = (i & 1024) != 0 ? false : z2;
        boolean z14 = (i & 2048) != 0 ? false : z3;
        boolean z15 = (i & 8192) != 0 ? false : z5;
        boolean z16 = (i & 16384) != 0 ? false : z6;
        boolean z17 = (32768 & i) != 0 ? true : z7;
        boolean z18 = (65536 & i) != 0 ? false : z8;
        boolean z19 = (131072 & i) != 0 ? false : z9;
        boolean z20 = (262144 & i) != 0 ? false : z10;
        String str10 = (524288 & i) != 0 ? null : str2;
        String str11 = (1048576 & i) != 0 ? null : str3;
        String str12 = (i & 2097152) != 0 ? null : str4;
        String strE = (i & 4194304) != 0 ? null : str5;
        boolean z21 = (i & 8388608) != 0 ? false : z11;
        boolean z22 = (i & 16777216) != 0 ? false : z12;
        String str13 = (i & 33554432) != 0 ? null : str6;
        Float f2 = (i & 67108864) != 0 ? null : f;
        String str14 = nbw0Var.e;
        String str15 = nbw0Var.a;
        String str16 = nbw0Var.d;
        Float f3 = f2;
        tyl tylVar = nbw0Var.p;
        if (str10 != null) {
            mmr0Var = new mmr0(str10, str11);
        } else {
            String str17 = tylVar.a;
            mmr0 mmr0Var2 = z14 ? new mmr0(str17, str15) : new mmr0(str15, str17);
            String str18 = (String) mmr0Var2.a;
            String str19 = (String) mmr0Var2.b;
            if (str11 == null) {
                str11 = str19;
            }
            mmr0Var = new mmr0(str18, str11);
        }
        String str20 = (String) mmr0Var.a;
        String str21 = (String) mmr0Var.b;
        Set set = s4b1.f;
        boolean zG = uic.g(str16, blc0.ed);
        boolean z23 = zG || uic.h(str16, new blc0[]{blc0.Pg, blc0.Qg, blc0.Rg, blc0.Ug, blc0.Vg, blc0.z6, blc0.B6, blc0.C6});
        if (z20) {
            str7 = str20;
            String str22 = tylVar.b;
            if (str22.length() <= 0) {
                str22 = null;
            }
            if (str22 != null) {
                str14 = str22;
            }
        } else {
            str7 = str20;
        }
        if (str12 == null) {
            str12 = (zG && str10 == null) ? nbw0Var.b : null;
        }
        String strN = z22 ? null : ytp0Var.n(nbw0Var.i);
        if (z21) {
            strN = strN;
            str8 = null;
        } else {
            if (strE == null) {
                if (z16 || hvp0Var2 == null) {
                    strN = strN;
                    str8 = null;
                } else {
                    strE = hvp0Var2.e(nbw0Var.h.p());
                }
            }
            str8 = strE;
        }
        String str23 = !z21 ? str13 : null;
        Float f4 = !z21 ? f3 : null;
        if (z20 && z4) {
            String str24 = tylVar.c;
            if (str24.length() > 0) {
                strL = str24;
            } else {
                strL = null;
            }
        } else if (!z || z4) {
            strL = null;
        } else {
            strL = o2p1.l(z23 ? xkk1Var3 : xkk1Var, nbw0Var.g);
        }
        if (str9 == null) {
            str9 = str16;
        }
        return new lfi0(str14, str7, str21, str12, strN, d2k1Var2, str8, strL, str9, k4mVar, wcmVar, z13, z, z4, z && z15, !z || z17, z18, z19, str23, f4, 7348352);
    }

    /* JADX WARN: Code duplicated, block: B:5:0x0022  */
    public static final set0 s(String str, w281 w281Var, boolean z, Function0 function0, boolean z2, String str2, String str3, boolean z3, boolean z4) {
        boolean z5;
        Set set = s4b1.f;
        boolean z6 = false;
        if (uic.h(str, new blc0[]{blc0.Pg, blc0.Qg, blc0.Rg, blc0.Ug, blc0.Vg, blc0.z6, blc0.B6, blc0.C6})) {
            if (!z4) {
                z6 = true;
            }
        } else if (!z4) {
            if (w281Var == null) {
                z5 = true;
            } else {
                e6p1 e6p1Var = w281Var.a;
                z5 = ((e6p1Var instanceof o281) || (e6p1Var instanceof l281)) ? false : w281Var.c;
            }
            if (z5) {
                z6 = true;
            }
        }
        return new set0(str, z6, "audiobrowse-client-native", "home", (Function0) null, z, z2, function0, str2, str3, z3, 16);
    }

    public static yaw0 u(int i, String str, String str2, String str3, String str4, String str5, k4m k4mVar, boolean z, boolean z2, boolean z3, boolean z4) {
        return new yaw0(3584, str, str2, str3, str5, (i & 8) != 0 ? null : str4, (i & 128) != 0 ? k4m.d : k4mVar, z, z2, z3, (i & 512) != 0 ? false : z4);
    }

    public static final mbw0 v(x360 x360Var) {
        String strX;
        String str;
        String strB;
        boolean z = x360Var instanceof hvl1;
        gim0 gim0Var = null;
        if (z || (x360Var instanceof may) || (x360Var instanceof prb1)) {
            strX = nho1.x(x360Var);
        } else {
            if (!(x360Var instanceof i460)) {
                eg.o();
                return null;
            }
            strX = ((i460) x360Var).a;
        }
        if (z) {
            str = ((hvl1) x360Var).d;
        } else {
            str = x360Var instanceof may ? ((may) x360Var).a().b : null;
        }
        if (z) {
            strB = ((hvl1) x360Var).b;
        } else {
            strB = x360Var instanceof may ? ((may) x360Var).b() : null;
        }
        if (strB != null && strB.length() != 0) {
            gim0Var = new gim0(strB);
        }
        return new mbw0(strX, gim0Var, str);
    }

    public static boolean w(goe goeVar, String str) {
        int i;
        List<tom> list = goeVar.f;
        if ((list instanceof Collection) && list.isEmpty()) {
            i = 0;
        } else {
            i = 0;
            for (tom tomVar : list) {
                if (u890.j(tomVar.c.a, str)) {
                    lpl lplVar = tomVar.f;
                    if (!(lplVar instanceof vol)) {
                        if (lplVar instanceof lpl) {
                            if (lplVar.e != null) {
                                continue;
                            }
                        } else if (!(lplVar instanceof apl)) {
                            if (!(lplVar instanceof npl) && !(lplVar instanceof uol)) {
                                eg.o();
                                return false;
                            }
                        }
                    }
                    i++;
                    if (i < 0) {
                        p7h.S();
                        throw null;
                    }
                }
            }
        }
        return i >= 2;
    }

    public static i6m1 x(pl3 pl3Var, boolean z) {
        return new i6m1(1, z, new h6m1(pl3Var, (byte) 1), pl3Var);
    }

    public static final boolean y(ji0 ji0Var, jjh1 jjh1Var) {
        if (ji0Var.c1 == 2) {
            return ((ji0) jjh1Var.a.get(ji0Var.a)) == null;
        }
        return false;
    }

    public static final boolean z(hcz0 hcz0Var) {
        List list = hcz0Var.d;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (h4o1.o((ContextTrack) it.next())) {
                return true;
            }
        }
        return false;
    }
}
