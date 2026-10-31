package p;

import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.concertcampaignview.v1.CtaType;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class kyo1 {
    public static b180 a;
    public static b180 b;

    public static final void a(boolean z, Function0 function0, j2i j2iVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2062490685);
        int i2 = (x340Var.h(z) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            puo1.c(u291.f(nim0.a, 1.0f), new n9d1(1, function0, vjx.c), null, z, j2iVar, x340Var, ((i2 << 9) & 7168) | 24582, 4);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jdr(z, function0, j2iVar, i, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:57:0x0098  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    public static final void b(Function0 function0, hux huxVar, ksl kslVar, qim0 qim0Var, gbx gbxVar, b0k b0kVar, int i, int i2) {
        int i3;
        gbx gbxVar2;
        boolean z;
        b0k b0kVar2;
        gbx gbxVar3;
        h311 h311VarV;
        gbx gbxVar4;
        boolean z2;
        boolean z3;
        Object objT;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(749126619);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.i(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? b0kVar3.g(huxVar) : b0kVar3.i(huxVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= b0kVar3.g(kslVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= b0kVar3.g(qim0Var) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                gbxVar2 = gbxVar;
                i3 |= b0kVar3.g(gbxVar2) ? 16384 : 8192;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i3 & 1, z)) {
                if (i4 != 0) {
                    gbxVar4 = null;
                } else {
                    gbxVar4 = gbxVar2;
                }
                if ((i3 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = z2 | ((57344 & i3) == 16384);
                objT = b0kVar3.T();
                if (z3 || objT == fkj0.X) {
                    objT = new zkz0(function0, gbxVar4, (byte) 13);
                    b0kVar3.s0(objT);
                }
                gbxVar3 = gbxVar4;
                b0kVar2 = b0kVar3;
                wro1.h(new gbx(z50.c, (Function0) objT), new hdx(0, (vu30) null, (vu30) null, (vu30) null, (hw61) null, 31), qim0Var, null, yla.s(b0kVar3), null, false, null, null, apo.r(1399666994, new kpw0((Object) huxVar, (Object) kslVar, (byte) 25), b0kVar3), b0kVar2, (i3 >> 3) & 896, 6, 984);
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                gbxVar3 = gbxVar2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new j90(function0, huxVar, kslVar, qim0Var, gbxVar3, i, i2, (byte) 16);
            }
        }
        i3 |= 24576;
        gbxVar2 = gbxVar;
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i3 & 1, z)) {
            if (i4 != 0) {
                gbxVar4 = null;
            } else {
                gbxVar4 = gbxVar2;
            }
            if ((i3 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            z3 = z2 | ((57344 & i3) == 16384);
            objT = b0kVar3.T();
            if (z3) {
                objT = new zkz0(function0, gbxVar4, (byte) 13);
                b0kVar3.s0(objT);
            } else {
                objT = new zkz0(function0, gbxVar4, (byte) 13);
                b0kVar3.s0(objT);
            }
            gbxVar3 = gbxVar4;
            b0kVar2 = b0kVar3;
            wro1.h(new gbx(z50.c, (Function0) objT), new hdx(0, (vu30) null, (vu30) null, (vu30) null, (hw61) null, 31), qim0Var, null, yla.s(b0kVar3), null, false, null, null, apo.r(1399666994, new kpw0((Object) huxVar, (Object) kslVar, (byte) 25), b0kVar3), b0kVar2, (i3 >> 3) & 896, 6, 984);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            gbxVar3 = gbxVar2;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new j90(function0, huxVar, kslVar, qim0Var, gbxVar3, i, i2, (byte) 16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0132  */
    /* JADX WARN: Code duplicated, block: B:103:0x0136  */
    /* JADX WARN: Code duplicated, block: B:104:0x0138  */
    /* JADX WARN: Code duplicated, block: B:107:0x013e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0148  */
    /* JADX WARN: Code duplicated, block: B:110:0x014e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0153  */
    /* JADX WARN: Code duplicated, block: B:115:0x015c  */
    /* JADX WARN: Code duplicated, block: B:116:0x015f  */
    /* JADX WARN: Code duplicated, block: B:119:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:120:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:123:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:125:0x01f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:126:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:129:0x020a  */
    /* JADX WARN: Code duplicated, block: B:132:0x0211  */
    /* JADX WARN: Code duplicated, block: B:133:0x0228  */
    /* JADX WARN: Code duplicated, block: B:136:0x0239  */
    /* JADX WARN: Code duplicated, block: B:137:0x0245  */
    /* JADX WARN: Code duplicated, block: B:140:0x0264  */
    /* JADX WARN: Code duplicated, block: B:142:0x027a  */
    /* JADX WARN: Code duplicated, block: B:144:0x0280  */
    /* JADX WARN: Code duplicated, block: B:151:0x028f  */
    /* JADX WARN: Code duplicated, block: B:154:0x0299 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:155:0x029b  */
    /* JADX WARN: Code duplicated, block: B:157:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:159:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:161:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:163:0x0306  */
    /* JADX WARN: Code duplicated, block: B:166:0x0316  */
    /* JADX WARN: Code duplicated, block: B:168:0x031c  */
    /* JADX WARN: Code duplicated, block: B:175:0x032a  */
    /* JADX WARN: Code duplicated, block: B:178:0x0332 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:179:0x0334  */
    /* JADX WARN: Code duplicated, block: B:182:0x0376  */
    /* JADX WARN: Code duplicated, block: B:184:0x037f  */
    /* JADX WARN: Code duplicated, block: B:187:0x0390  */
    /* JADX WARN: Code duplicated, block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:58:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:80:0x00df  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:90:0x010a  */
    /* JADX WARN: Code duplicated, block: B:98:0x012d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x012f  */
    public static final void c(String str, hux huxVar, Function0 function0, qim0 qim0Var, boolean z, String str2, v2g v2gVar, vu30 vu30Var, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        int i4;
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z3;
        String str3;
        v2g u2gVar;
        qim0 qim0Var3;
        boolean z4;
        vu30 vu30Var2;
        h311 h311VarV;
        int i11;
        qim0 qim0Var4;
        String str4;
        int i12;
        vu30 vu30Var3;
        String str5;
        boolean z5;
        float f;
        String str6;
        boolean z6;
        int i13;
        zzq0 zzq0Var;
        String strO0;
        qim0 qim0VarK;
        boolean z7;
        qim0 qim0Var5;
        vu30 vu30VarR;
        vu30 vu30Var4;
        vu30 vu30Var5;
        boolean z8;
        qex qexVarZ;
        boolean z9;
        boolean z10;
        Object objT;
        String str7;
        boolean z11;
        Object objT2;
        boolean zG;
        Object objT3;
        int i14;
        boolean zI;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(40283809);
        if ((i & 6) == 0) {
            i3 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? x340Var.g(huxVar) : x340Var.i(huxVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.i(function0) ? 256 : 128;
        }
        int i15 = i2 & 8;
        if (i15 == 0) {
            if ((i & 3072) == 0) {
                qim0Var2 = qim0Var;
                i3 |= x340Var.i(qim0Var2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    z2 = z;
                    if (x340Var.h(z2)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((196608 & i) == 0) {
                        if (x340Var.g(str2)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    if ((i & 1572864) == 0) {
                        if ((i2 & 64) != 0) {
                            i14 = 524288;
                        } else {
                            if ((i & 2097152) == 0) {
                                zI = x340Var.g(v2gVar);
                            } else {
                                zI = x340Var.i(v2gVar);
                            }
                            if (zI) {
                                i14 = 1048576;
                            } else {
                                i14 = 524288;
                            }
                        }
                        i3 |= i14;
                    }
                    i8 = i2 & 128;
                    if (i8 != 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        if (x340Var.i(vu30Var)) {
                            i9 = 8388608;
                        } else {
                            i9 = 4194304;
                        }
                        i3 |= i9;
                    }
                    i10 = i3;
                    if ((i3 & 4793491) != 4793490) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (x340Var.Y(i10 & 1, z3)) {
                        x340Var.d0();
                        i11 = i & 1;
                        qim0Var4 = nim0.a;
                        if (i11 != 0 || x340Var.E()) {
                            if (i15 != 0) {
                                qim0Var2 = qim0Var4;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if (i6 != 0) {
                                str4 = null;
                            } else {
                                str4 = str2;
                            }
                            if ((i2 & 64) != 0) {
                                u2gVar = new u2g(3, false);
                                i12 = i10 & (-3670017);
                            } else {
                                u2gVar = v2gVar;
                                i12 = i10;
                            }
                            if (i8 != 0) {
                                vu30Var3 = null;
                            } else {
                                vu30Var3 = vu30Var;
                            }
                            str5 = str4;
                        } else {
                            x340Var.b0();
                            if ((i2 & 64) != 0) {
                                str5 = str2;
                                u2gVar = v2gVar;
                                vu30Var3 = vu30Var;
                                i12 = i10 & (-3670017);
                            } else {
                                str5 = str2;
                                u2gVar = v2gVar;
                                vu30Var3 = vu30Var;
                                z5 = z2;
                                i12 = i10;
                            }
                            x340Var.s();
                            if (z5) {
                                f = 1.0f;
                            } else {
                                f = 0.3f;
                            }
                            boolean z12 = z5;
                            str6 = str5;
                            z6 = false;
                            i13 = i12;
                            tob1 tob1VarB = z95.b(f, irn1.o0(CtaType.BUY_TICKETS_FIELD_NUMBER, 0, null, 6), "chipEnabledAlpha", (iu30) null, x340Var, 3072, 20);
                            uwr uwrVar = cbx.a;
                            cvx cvxVar = cbx.b(x340Var).b;
                            cvx cvxVar2 = cbx.b(x340Var).b;
                            zzq0Var = new zzq0(8.0f, 4.0f, 8.0f, 4.0f);
                            strO0 = cwl1.o0(x340Var, 2131962892);
                            x340Var.i0(58074088);
                            x340Var.i0(58064676);
                            qim0VarK = d9y0.k(qim0Var2, ((Number) tob1VarB.getValue()).floatValue());
                            if (u2gVar.c()) {
                                avw0 avw0Var = cbx.b(x340Var).c;
                                qim0VarK = qim0VarK.then(vgo1.x(cbx.a(x340Var).c.a, er31.a));
                                z6 = false;
                            }
                            x340Var.r(z6);
                            if (u2gVar.b()) {
                                zG = x340Var.g(strO0);
                                objT3 = x340Var.T();
                                if (zG || objT3 == m4cVar) {
                                    objT3 = new irf(strO0, (byte) 3);
                                    x340Var.s0(objT3);
                                }
                                z7 = false;
                                qim0VarK = qim0VarK.then(s161.b(qim0Var4, false, (iu30) objT3));
                            } else {
                                z7 = false;
                            }
                            qim0Var5 = qim0VarK;
                            x340Var.r(z7);
                            if (vu30Var3 == null) {
                                x340Var.i0(58081271);
                                vu30VarR = apo.r(-1427046907, new f90(huxVar, (byte) 5), x340Var);
                                x340Var.r(z7);
                            } else {
                                x340Var.i0(58080372);
                                x340Var.r(z7);
                                vu30VarR = vu30Var3;
                            }
                            if (str.length() == 0) {
                                x340Var.i0(1800828348);
                                x340Var.r(z7);
                                vu30Var4 = null;
                            } else {
                                x340Var.i0(1800855133);
                                vu30 vu30VarR2 = apo.r(1165207465, new j3b(str, (byte) 22), x340Var);
                                x340Var.r(z7);
                                vu30Var4 = vu30VarR2;
                            }
                            if (u2gVar instanceof u2g) {
                                x340Var.i0(1801338547);
                                lex lexVarZ = yoo1.z(x340Var);
                                pex pexVar = pex.b;
                                z11 = ((((i13 & 3670016) ^ 1572864) <= 1048576 && x340Var.i(u2gVar)) || (i13 & 1572864) == 1048576) | ((i13 & 896) == 256);
                                objT2 = x340Var.T();
                                if (z11 || objT2 == m4cVar) {
                                    objT2 = new ame(u2gVar, function0, (byte) 14);
                                    x340Var.s0(objT2);
                                }
                                str7 = str6;
                                poo1.e(new gbx(z50.c, (Function0) objT2), pexVar, lexVarZ, qim0Var5, 0, str7, null, vu30VarR, null, null, null, false, zzq0Var, vu30Var4, x340Var, i13 & 458752, 0, 3920);
                                x340Var = x340Var;
                                x340Var.r(false);
                            } else {
                                vu30Var5 = vu30VarR;
                                z8 = true;
                                if (!(u2gVar instanceof t2g)) {
                                    throw p3d1.k(x340Var, 58106215, false);
                                }
                                x340Var.i0(1801791116);
                                t2g t2gVar = (t2g) u2gVar;
                                boolean z13 = t2gVar.a;
                                lex lexVarZ2 = yoo1.z(x340Var);
                                qexVarZ = t2gVar.c;
                                if (qexVarZ == null) {
                                    x340Var.i0(58133505);
                                    qexVarZ = who1.z(w2g.a, x340Var);
                                    z9 = false;
                                } else {
                                    z9 = false;
                                    x340Var.i0(58132947);
                                }
                                x340Var.r(z9);
                                qex qexVar = qexVarZ;
                                boolean z14 = (((i13 & 3670016) ^ 1572864) <= 1048576 && x340Var.i(u2gVar)) || (i13 & 1572864) == 1048576;
                                if ((i13 & 896) != 256) {
                                    z8 = false;
                                }
                                z10 = z8 | z14;
                                objT = x340Var.T();
                                if (z10 || objT == m4cVar) {
                                    objT = new w9f(u2gVar, function0, (byte) 10);
                                    x340Var.s0(objT);
                                }
                                poo1.g(z13, (iu30) objT, qexVar, lexVarZ2, qim0Var5, 0, null, str6, null, vu30Var5, null, null, null, false, zzq0Var, vu30Var4, x340Var, (i13 << 6) & 29360128, 0, 15712);
                                str7 = str6;
                                x340Var = x340Var;
                                x340Var.r(false);
                            }
                            z4 = z12;
                            qim0Var3 = qim0Var2;
                            str3 = str7;
                            vu30Var2 = vu30Var3;
                        }
                        z5 = z2;
                        x340Var.s();
                        if (z5) {
                            f = 1.0f;
                        } else {
                            f = 0.3f;
                        }
                        boolean z15 = z5;
                        str6 = str5;
                        z6 = false;
                        i13 = i12;
                        tob1 tob1VarB2 = z95.b(f, irn1.o0(CtaType.BUY_TICKETS_FIELD_NUMBER, 0, null, 6), "chipEnabledAlpha", (iu30) null, x340Var, 3072, 20);
                        uwr uwrVar2 = cbx.a;
                        cvx cvxVar3 = cbx.b(x340Var).b;
                        cvx cvxVar4 = cbx.b(x340Var).b;
                        zzq0Var = new zzq0(8.0f, 4.0f, 8.0f, 4.0f);
                        strO0 = cwl1.o0(x340Var, 2131962892);
                        x340Var.i0(58074088);
                        x340Var.i0(58064676);
                        qim0VarK = d9y0.k(qim0Var2, ((Number) tob1VarB2.getValue()).floatValue());
                        if (u2gVar.c()) {
                            avw0 avw0Var2 = cbx.b(x340Var).c;
                            qim0VarK = qim0VarK.then(vgo1.x(cbx.a(x340Var).c.a, er31.a));
                            z6 = false;
                        }
                        x340Var.r(z6);
                        if (u2gVar.b()) {
                            zG = x340Var.g(strO0);
                            objT3 = x340Var.T();
                            if (zG) {
                                objT3 = new irf(strO0, (byte) 3);
                                x340Var.s0(objT3);
                            } else {
                                objT3 = new irf(strO0, (byte) 3);
                                x340Var.s0(objT3);
                            }
                            z7 = false;
                            qim0VarK = qim0VarK.then(s161.b(qim0Var4, false, (iu30) objT3));
                        } else {
                            z7 = false;
                        }
                        qim0Var5 = qim0VarK;
                        x340Var.r(z7);
                        if (vu30Var3 == null) {
                            x340Var.i0(58081271);
                            vu30VarR = apo.r(-1427046907, new f90(huxVar, (byte) 5), x340Var);
                            x340Var.r(z7);
                        } else {
                            x340Var.i0(58080372);
                            x340Var.r(z7);
                            vu30VarR = vu30Var3;
                        }
                        if (str.length() == 0) {
                            x340Var.i0(1800828348);
                            x340Var.r(z7);
                            vu30Var4 = null;
                        } else {
                            x340Var.i0(1800855133);
                            vu30 vu30VarR3 = apo.r(1165207465, new j3b(str, (byte) 22), x340Var);
                            x340Var.r(z7);
                            vu30Var4 = vu30VarR3;
                        }
                        if (u2gVar instanceof u2g) {
                            x340Var.i0(1801338547);
                            lex lexVarZ3 = yoo1.z(x340Var);
                            pex pexVar2 = pex.b;
                            z11 = ((((i13 & 3670016) ^ 1572864) <= 1048576 && x340Var.i(u2gVar)) || (i13 & 1572864) == 1048576) | ((i13 & 896) == 256);
                            objT2 = x340Var.T();
                            if (z11) {
                                objT2 = new ame(u2gVar, function0, (byte) 14);
                                x340Var.s0(objT2);
                            } else {
                                objT2 = new ame(u2gVar, function0, (byte) 14);
                                x340Var.s0(objT2);
                            }
                            str7 = str6;
                            poo1.e(new gbx(z50.c, (Function0) objT2), pexVar2, lexVarZ3, qim0Var5, 0, str7, null, vu30VarR, null, null, null, false, zzq0Var, vu30Var4, x340Var, i13 & 458752, 0, 3920);
                            x340Var = x340Var;
                            x340Var.r(false);
                        } else {
                            vu30Var5 = vu30VarR;
                            z8 = true;
                            if (!(u2gVar instanceof t2g)) {
                                throw p3d1.k(x340Var, 58106215, false);
                            }
                            x340Var.i0(1801791116);
                            t2g t2gVar2 = (t2g) u2gVar;
                            boolean z16 = t2gVar2.a;
                            lex lexVarZ4 = yoo1.z(x340Var);
                            qexVarZ = t2gVar2.c;
                            if (qexVarZ == null) {
                                x340Var.i0(58133505);
                                qexVarZ = who1.z(w2g.a, x340Var);
                                z9 = false;
                            } else {
                                z9 = false;
                                x340Var.i0(58132947);
                            }
                            x340Var.r(z9);
                            qex qexVar2 = qexVarZ;
                            if (((i13 & 3670016) ^ 1572864) <= 1048576) {
                            }
                            if ((i13 & 896) != 256) {
                                z8 = false;
                            }
                            z10 = z8 | z14;
                            objT = x340Var.T();
                            if (z10) {
                                objT = new w9f(u2gVar, function0, (byte) 10);
                                x340Var.s0(objT);
                            } else {
                                objT = new w9f(u2gVar, function0, (byte) 10);
                                x340Var.s0(objT);
                            }
                            poo1.g(z16, (iu30) objT, qexVar2, lexVarZ4, qim0Var5, 0, null, str6, null, vu30Var5, null, null, null, false, zzq0Var, vu30Var4, x340Var, (i13 << 6) & 29360128, 0, 15712);
                            str7 = str6;
                            x340Var = x340Var;
                            x340Var.r(false);
                        }
                        z4 = z15;
                        qim0Var3 = qim0Var2;
                        str3 = str7;
                        vu30Var2 = vu30Var3;
                    } else {
                        x340Var.b0();
                        str3 = str2;
                        u2gVar = v2gVar;
                        qim0Var3 = qim0Var2;
                        z4 = z2;
                        vu30Var2 = vu30Var;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new s2g(str, huxVar, function0, qim0Var3, z4, str3, u2gVar, vu30Var2, i, i2);
                    }
                }
                i3 |= 196608;
                if ((i & 1572864) == 0) {
                    if ((i2 & 64) != 0) {
                        i14 = 524288;
                    } else {
                        if ((i & 2097152) == 0) {
                            zI = x340Var.g(v2gVar);
                        } else {
                            zI = x340Var.i(v2gVar);
                        }
                        if (zI) {
                            i14 = 1048576;
                        } else {
                            i14 = 524288;
                        }
                    }
                    i3 |= i14;
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (x340Var.i(vu30Var)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i3 |= i9;
                }
                i10 = i3;
                if ((i3 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (x340Var.Y(i10 & 1, z3)) {
                    x340Var.d0();
                    i11 = i & 1;
                    qim0Var4 = nim0.a;
                    if (i11 != 0) {
                        if (i15 != 0) {
                            qim0Var2 = qim0Var4;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        if ((i2 & 64) != 0) {
                            u2gVar = new u2g(3, false);
                            i12 = i10 & (-3670017);
                        } else {
                            u2gVar = v2gVar;
                            i12 = i10;
                        }
                        if (i8 != 0) {
                            vu30Var3 = null;
                        } else {
                            vu30Var3 = vu30Var;
                        }
                        str5 = str4;
                        z5 = z2;
                    } else {
                        if (i15 != 0) {
                            qim0Var2 = qim0Var4;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        if ((i2 & 64) != 0) {
                            u2gVar = new u2g(3, false);
                            i12 = i10 & (-3670017);
                        } else {
                            u2gVar = v2gVar;
                            i12 = i10;
                        }
                        if (i8 != 0) {
                            vu30Var3 = null;
                        } else {
                            vu30Var3 = vu30Var;
                        }
                        str5 = str4;
                        z5 = z2;
                    }
                    x340Var.s();
                    if (z5) {
                        f = 1.0f;
                    } else {
                        f = 0.3f;
                    }
                    boolean z17 = z5;
                    str6 = str5;
                    z6 = false;
                    i13 = i12;
                    tob1 tob1VarB3 = z95.b(f, irn1.o0(CtaType.BUY_TICKETS_FIELD_NUMBER, 0, null, 6), "chipEnabledAlpha", (iu30) null, x340Var, 3072, 20);
                    uwr uwrVar3 = cbx.a;
                    cvx cvxVar5 = cbx.b(x340Var).b;
                    cvx cvxVar6 = cbx.b(x340Var).b;
                    zzq0Var = new zzq0(8.0f, 4.0f, 8.0f, 4.0f);
                    strO0 = cwl1.o0(x340Var, 2131962892);
                    x340Var.i0(58074088);
                    x340Var.i0(58064676);
                    qim0VarK = d9y0.k(qim0Var2, ((Number) tob1VarB3.getValue()).floatValue());
                    if (u2gVar.c()) {
                        avw0 avw0Var3 = cbx.b(x340Var).c;
                        qim0VarK = qim0VarK.then(vgo1.x(cbx.a(x340Var).c.a, er31.a));
                        z6 = false;
                    }
                    x340Var.r(z6);
                    if (u2gVar.b()) {
                        zG = x340Var.g(strO0);
                        objT3 = x340Var.T();
                        if (zG) {
                            objT3 = new irf(strO0, (byte) 3);
                            x340Var.s0(objT3);
                        } else {
                            objT3 = new irf(strO0, (byte) 3);
                            x340Var.s0(objT3);
                        }
                        z7 = false;
                        qim0VarK = qim0VarK.then(s161.b(qim0Var4, false, (iu30) objT3));
                    } else {
                        z7 = false;
                    }
                    qim0Var5 = qim0VarK;
                    x340Var.r(z7);
                    if (vu30Var3 == null) {
                        x340Var.i0(58081271);
                        vu30VarR = apo.r(-1427046907, new f90(huxVar, (byte) 5), x340Var);
                        x340Var.r(z7);
                    } else {
                        x340Var.i0(58080372);
                        x340Var.r(z7);
                        vu30VarR = vu30Var3;
                    }
                    if (str.length() == 0) {
                        x340Var.i0(1800828348);
                        x340Var.r(z7);
                        vu30Var4 = null;
                    } else {
                        x340Var.i0(1800855133);
                        vu30 vu30VarR4 = apo.r(1165207465, new j3b(str, (byte) 22), x340Var);
                        x340Var.r(z7);
                        vu30Var4 = vu30VarR4;
                    }
                    if (u2gVar instanceof u2g) {
                        x340Var.i0(1801338547);
                        lex lexVarZ5 = yoo1.z(x340Var);
                        pex pexVar3 = pex.b;
                        z11 = ((((i13 & 3670016) ^ 1572864) <= 1048576 && x340Var.i(u2gVar)) || (i13 & 1572864) == 1048576) | ((i13 & 896) == 256);
                        objT2 = x340Var.T();
                        if (z11) {
                            objT2 = new ame(u2gVar, function0, (byte) 14);
                            x340Var.s0(objT2);
                        } else {
                            objT2 = new ame(u2gVar, function0, (byte) 14);
                            x340Var.s0(objT2);
                        }
                        str7 = str6;
                        poo1.e(new gbx(z50.c, (Function0) objT2), pexVar3, lexVarZ5, qim0Var5, 0, str7, null, vu30VarR, null, null, null, false, zzq0Var, vu30Var4, x340Var, i13 & 458752, 0, 3920);
                        x340Var = x340Var;
                        x340Var.r(false);
                    } else {
                        vu30Var5 = vu30VarR;
                        z8 = true;
                        if (!(u2gVar instanceof t2g)) {
                            throw p3d1.k(x340Var, 58106215, false);
                        }
                        x340Var.i0(1801791116);
                        t2g t2gVar3 = (t2g) u2gVar;
                        boolean z18 = t2gVar3.a;
                        lex lexVarZ6 = yoo1.z(x340Var);
                        qexVarZ = t2gVar3.c;
                        if (qexVarZ == null) {
                            x340Var.i0(58133505);
                            qexVarZ = who1.z(w2g.a, x340Var);
                            z9 = false;
                        } else {
                            z9 = false;
                            x340Var.i0(58132947);
                        }
                        x340Var.r(z9);
                        qex qexVar3 = qexVarZ;
                        if (((i13 & 3670016) ^ 1572864) <= 1048576) {
                        }
                        if ((i13 & 896) != 256) {
                            z8 = false;
                        }
                        z10 = z8 | z14;
                        objT = x340Var.T();
                        if (z10) {
                            objT = new w9f(u2gVar, function0, (byte) 10);
                            x340Var.s0(objT);
                        } else {
                            objT = new w9f(u2gVar, function0, (byte) 10);
                            x340Var.s0(objT);
                        }
                        poo1.g(z18, (iu30) objT, qexVar3, lexVarZ6, qim0Var5, 0, null, str6, null, vu30Var5, null, null, null, false, zzq0Var, vu30Var4, x340Var, (i13 << 6) & 29360128, 0, 15712);
                        str7 = str6;
                        x340Var = x340Var;
                        x340Var.r(false);
                    }
                    z4 = z17;
                    qim0Var3 = qim0Var2;
                    str3 = str7;
                    vu30Var2 = vu30Var3;
                } else {
                    x340Var.b0();
                    str3 = str2;
                    u2gVar = v2gVar;
                    qim0Var3 = qim0Var2;
                    z4 = z2;
                    vu30Var2 = vu30Var;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new s2g(str, huxVar, function0, qim0Var3, z4, str3, u2gVar, vu30Var2, i, i2);
                }
            }
            i3 |= 24576;
            z2 = z;
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    if (x340Var.g(str2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((i & 1572864) == 0) {
                    if ((i2 & 64) != 0) {
                        i14 = 524288;
                    } else {
                        if ((i & 2097152) == 0) {
                            zI = x340Var.g(v2gVar);
                        } else {
                            zI = x340Var.i(v2gVar);
                        }
                        if (zI) {
                            i14 = 1048576;
                        } else {
                            i14 = 524288;
                        }
                    }
                    i3 |= i14;
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (x340Var.i(vu30Var)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i3 |= i9;
                }
                i10 = i3;
                if ((i3 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (x340Var.Y(i10 & 1, z3)) {
                    x340Var.d0();
                    i11 = i & 1;
                    qim0Var4 = nim0.a;
                    if (i11 != 0) {
                        if (i15 != 0) {
                            qim0Var2 = qim0Var4;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        if ((i2 & 64) != 0) {
                            u2gVar = new u2g(3, false);
                            i12 = i10 & (-3670017);
                        } else {
                            u2gVar = v2gVar;
                            i12 = i10;
                        }
                        if (i8 != 0) {
                            vu30Var3 = null;
                        } else {
                            vu30Var3 = vu30Var;
                        }
                        str5 = str4;
                        z5 = z2;
                    } else {
                        if (i15 != 0) {
                            qim0Var2 = qim0Var4;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        if ((i2 & 64) != 0) {
                            u2gVar = new u2g(3, false);
                            i12 = i10 & (-3670017);
                        } else {
                            u2gVar = v2gVar;
                            i12 = i10;
                        }
                        if (i8 != 0) {
                            vu30Var3 = null;
                        } else {
                            vu30Var3 = vu30Var;
                        }
                        str5 = str4;
                        z5 = z2;
                    }
                    x340Var.s();
                    if (z5) {
                        f = 1.0f;
                    } else {
                        f = 0.3f;
                    }
                    boolean z19 = z5;
                    str6 = str5;
                    z6 = false;
                    i13 = i12;
                    tob1 tob1VarB4 = z95.b(f, irn1.o0(CtaType.BUY_TICKETS_FIELD_NUMBER, 0, null, 6), "chipEnabledAlpha", (iu30) null, x340Var, 3072, 20);
                    uwr uwrVar4 = cbx.a;
                    cvx cvxVar7 = cbx.b(x340Var).b;
                    cvx cvxVar8 = cbx.b(x340Var).b;
                    zzq0Var = new zzq0(8.0f, 4.0f, 8.0f, 4.0f);
                    strO0 = cwl1.o0(x340Var, 2131962892);
                    x340Var.i0(58074088);
                    x340Var.i0(58064676);
                    qim0VarK = d9y0.k(qim0Var2, ((Number) tob1VarB4.getValue()).floatValue());
                    if (u2gVar.c()) {
                        avw0 avw0Var4 = cbx.b(x340Var).c;
                        qim0VarK = qim0VarK.then(vgo1.x(cbx.a(x340Var).c.a, er31.a));
                        z6 = false;
                    }
                    x340Var.r(z6);
                    if (u2gVar.b()) {
                        zG = x340Var.g(strO0);
                        objT3 = x340Var.T();
                        if (zG) {
                            objT3 = new irf(strO0, (byte) 3);
                            x340Var.s0(objT3);
                        } else {
                            objT3 = new irf(strO0, (byte) 3);
                            x340Var.s0(objT3);
                        }
                        z7 = false;
                        qim0VarK = qim0VarK.then(s161.b(qim0Var4, false, (iu30) objT3));
                    } else {
                        z7 = false;
                    }
                    qim0Var5 = qim0VarK;
                    x340Var.r(z7);
                    if (vu30Var3 == null) {
                        x340Var.i0(58081271);
                        vu30VarR = apo.r(-1427046907, new f90(huxVar, (byte) 5), x340Var);
                        x340Var.r(z7);
                    } else {
                        x340Var.i0(58080372);
                        x340Var.r(z7);
                        vu30VarR = vu30Var3;
                    }
                    if (str.length() == 0) {
                        x340Var.i0(1800828348);
                        x340Var.r(z7);
                        vu30Var4 = null;
                    } else {
                        x340Var.i0(1800855133);
                        vu30 vu30VarR5 = apo.r(1165207465, new j3b(str, (byte) 22), x340Var);
                        x340Var.r(z7);
                        vu30Var4 = vu30VarR5;
                    }
                    if (u2gVar instanceof u2g) {
                        x340Var.i0(1801338547);
                        lex lexVarZ7 = yoo1.z(x340Var);
                        pex pexVar4 = pex.b;
                        z11 = ((((i13 & 3670016) ^ 1572864) <= 1048576 && x340Var.i(u2gVar)) || (i13 & 1572864) == 1048576) | ((i13 & 896) == 256);
                        objT2 = x340Var.T();
                        if (z11) {
                            objT2 = new ame(u2gVar, function0, (byte) 14);
                            x340Var.s0(objT2);
                        } else {
                            objT2 = new ame(u2gVar, function0, (byte) 14);
                            x340Var.s0(objT2);
                        }
                        str7 = str6;
                        poo1.e(new gbx(z50.c, (Function0) objT2), pexVar4, lexVarZ7, qim0Var5, 0, str7, null, vu30VarR, null, null, null, false, zzq0Var, vu30Var4, x340Var, i13 & 458752, 0, 3920);
                        x340Var = x340Var;
                        x340Var.r(false);
                    } else {
                        vu30Var5 = vu30VarR;
                        z8 = true;
                        if (!(u2gVar instanceof t2g)) {
                            throw p3d1.k(x340Var, 58106215, false);
                        }
                        x340Var.i0(1801791116);
                        t2g t2gVar4 = (t2g) u2gVar;
                        boolean z110 = t2gVar4.a;
                        lex lexVarZ8 = yoo1.z(x340Var);
                        qexVarZ = t2gVar4.c;
                        if (qexVarZ == null) {
                            x340Var.i0(58133505);
                            qexVarZ = who1.z(w2g.a, x340Var);
                            z9 = false;
                        } else {
                            z9 = false;
                            x340Var.i0(58132947);
                        }
                        x340Var.r(z9);
                        qex qexVar4 = qexVarZ;
                        if (((i13 & 3670016) ^ 1572864) <= 1048576) {
                        }
                        if ((i13 & 896) != 256) {
                            z8 = false;
                        }
                        z10 = z8 | z14;
                        objT = x340Var.T();
                        if (z10) {
                            objT = new w9f(u2gVar, function0, (byte) 10);
                            x340Var.s0(objT);
                        } else {
                            objT = new w9f(u2gVar, function0, (byte) 10);
                            x340Var.s0(objT);
                        }
                        poo1.g(z110, (iu30) objT, qexVar4, lexVarZ8, qim0Var5, 0, null, str6, null, vu30Var5, null, null, null, false, zzq0Var, vu30Var4, x340Var, (i13 << 6) & 29360128, 0, 15712);
                        str7 = str6;
                        x340Var = x340Var;
                        x340Var.r(false);
                    }
                    z4 = z19;
                    qim0Var3 = qim0Var2;
                    str3 = str7;
                    vu30Var2 = vu30Var3;
                } else {
                    x340Var.b0();
                    str3 = str2;
                    u2gVar = v2gVar;
                    qim0Var3 = qim0Var2;
                    z4 = z2;
                    vu30Var2 = vu30Var;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new s2g(str, huxVar, function0, qim0Var3, z4, str3, u2gVar, vu30Var2, i, i2);
                }
            }
            i3 |= 196608;
            if ((i & 1572864) == 0) {
                if ((i2 & 64) != 0) {
                    i14 = 524288;
                } else {
                    if ((i & 2097152) == 0) {
                        zI = x340Var.g(v2gVar);
                    } else {
                        zI = x340Var.i(v2gVar);
                    }
                    if (zI) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                }
                i3 |= i14;
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (x340Var.i(vu30Var)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i3 |= i9;
            }
            i10 = i3;
            if ((i3 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i10 & 1, z3)) {
                x340Var.d0();
                i11 = i & 1;
                qim0Var4 = nim0.a;
                if (i11 != 0) {
                    if (i15 != 0) {
                        qim0Var2 = qim0Var4;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if (i6 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if ((i2 & 64) != 0) {
                        u2gVar = new u2g(3, false);
                        i12 = i10 & (-3670017);
                    } else {
                        u2gVar = v2gVar;
                        i12 = i10;
                    }
                    if (i8 != 0) {
                        vu30Var3 = null;
                    } else {
                        vu30Var3 = vu30Var;
                    }
                    str5 = str4;
                    z5 = z2;
                } else {
                    if (i15 != 0) {
                        qim0Var2 = qim0Var4;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if (i6 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if ((i2 & 64) != 0) {
                        u2gVar = new u2g(3, false);
                        i12 = i10 & (-3670017);
                    } else {
                        u2gVar = v2gVar;
                        i12 = i10;
                    }
                    if (i8 != 0) {
                        vu30Var3 = null;
                    } else {
                        vu30Var3 = vu30Var;
                    }
                    str5 = str4;
                    z5 = z2;
                }
                x340Var.s();
                if (z5) {
                    f = 1.0f;
                } else {
                    f = 0.3f;
                }
                boolean z111 = z5;
                str6 = str5;
                z6 = false;
                i13 = i12;
                tob1 tob1VarB5 = z95.b(f, irn1.o0(CtaType.BUY_TICKETS_FIELD_NUMBER, 0, null, 6), "chipEnabledAlpha", (iu30) null, x340Var, 3072, 20);
                uwr uwrVar5 = cbx.a;
                cvx cvxVar9 = cbx.b(x340Var).b;
                cvx cvxVar10 = cbx.b(x340Var).b;
                zzq0Var = new zzq0(8.0f, 4.0f, 8.0f, 4.0f);
                strO0 = cwl1.o0(x340Var, 2131962892);
                x340Var.i0(58074088);
                x340Var.i0(58064676);
                qim0VarK = d9y0.k(qim0Var2, ((Number) tob1VarB5.getValue()).floatValue());
                if (u2gVar.c()) {
                    avw0 avw0Var5 = cbx.b(x340Var).c;
                    qim0VarK = qim0VarK.then(vgo1.x(cbx.a(x340Var).c.a, er31.a));
                    z6 = false;
                }
                x340Var.r(z6);
                if (u2gVar.b()) {
                    zG = x340Var.g(strO0);
                    objT3 = x340Var.T();
                    if (zG) {
                        objT3 = new irf(strO0, (byte) 3);
                        x340Var.s0(objT3);
                    } else {
                        objT3 = new irf(strO0, (byte) 3);
                        x340Var.s0(objT3);
                    }
                    z7 = false;
                    qim0VarK = qim0VarK.then(s161.b(qim0Var4, false, (iu30) objT3));
                } else {
                    z7 = false;
                }
                qim0Var5 = qim0VarK;
                x340Var.r(z7);
                if (vu30Var3 == null) {
                    x340Var.i0(58081271);
                    vu30VarR = apo.r(-1427046907, new f90(huxVar, (byte) 5), x340Var);
                    x340Var.r(z7);
                } else {
                    x340Var.i0(58080372);
                    x340Var.r(z7);
                    vu30VarR = vu30Var3;
                }
                if (str.length() == 0) {
                    x340Var.i0(1800828348);
                    x340Var.r(z7);
                    vu30Var4 = null;
                } else {
                    x340Var.i0(1800855133);
                    vu30 vu30VarR6 = apo.r(1165207465, new j3b(str, (byte) 22), x340Var);
                    x340Var.r(z7);
                    vu30Var4 = vu30VarR6;
                }
                if (u2gVar instanceof u2g) {
                    x340Var.i0(1801338547);
                    lex lexVarZ9 = yoo1.z(x340Var);
                    pex pexVar5 = pex.b;
                    z11 = ((((i13 & 3670016) ^ 1572864) <= 1048576 && x340Var.i(u2gVar)) || (i13 & 1572864) == 1048576) | ((i13 & 896) == 256);
                    objT2 = x340Var.T();
                    if (z11) {
                        objT2 = new ame(u2gVar, function0, (byte) 14);
                        x340Var.s0(objT2);
                    } else {
                        objT2 = new ame(u2gVar, function0, (byte) 14);
                        x340Var.s0(objT2);
                    }
                    str7 = str6;
                    poo1.e(new gbx(z50.c, (Function0) objT2), pexVar5, lexVarZ9, qim0Var5, 0, str7, null, vu30VarR, null, null, null, false, zzq0Var, vu30Var4, x340Var, i13 & 458752, 0, 3920);
                    x340Var = x340Var;
                    x340Var.r(false);
                } else {
                    vu30Var5 = vu30VarR;
                    z8 = true;
                    if (!(u2gVar instanceof t2g)) {
                        throw p3d1.k(x340Var, 58106215, false);
                    }
                    x340Var.i0(1801791116);
                    t2g t2gVar5 = (t2g) u2gVar;
                    boolean z112 = t2gVar5.a;
                    lex lexVarZ10 = yoo1.z(x340Var);
                    qexVarZ = t2gVar5.c;
                    if (qexVarZ == null) {
                        x340Var.i0(58133505);
                        qexVarZ = who1.z(w2g.a, x340Var);
                        z9 = false;
                    } else {
                        z9 = false;
                        x340Var.i0(58132947);
                    }
                    x340Var.r(z9);
                    qex qexVar5 = qexVarZ;
                    if (((i13 & 3670016) ^ 1572864) <= 1048576) {
                    }
                    if ((i13 & 896) != 256) {
                        z8 = false;
                    }
                    z10 = z8 | z14;
                    objT = x340Var.T();
                    if (z10) {
                        objT = new w9f(u2gVar, function0, (byte) 10);
                        x340Var.s0(objT);
                    } else {
                        objT = new w9f(u2gVar, function0, (byte) 10);
                        x340Var.s0(objT);
                    }
                    poo1.g(z112, (iu30) objT, qexVar5, lexVarZ10, qim0Var5, 0, null, str6, null, vu30Var5, null, null, null, false, zzq0Var, vu30Var4, x340Var, (i13 << 6) & 29360128, 0, 15712);
                    str7 = str6;
                    x340Var = x340Var;
                    x340Var.r(false);
                }
                z4 = z111;
                qim0Var3 = qim0Var2;
                str3 = str7;
                vu30Var2 = vu30Var3;
            } else {
                x340Var.b0();
                str3 = str2;
                u2gVar = v2gVar;
                qim0Var3 = qim0Var2;
                z4 = z2;
                vu30Var2 = vu30Var;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new s2g(str, huxVar, function0, qim0Var3, z4, str3, u2gVar, vu30Var2, i, i2);
            }
        }
        i3 |= 3072;
        qim0Var2 = qim0Var;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                z2 = z;
                if (x340Var.h(z2)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    if (x340Var.g(str2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((i & 1572864) == 0) {
                    if ((i2 & 64) != 0) {
                        i14 = 524288;
                    } else {
                        if ((i & 2097152) == 0) {
                            zI = x340Var.g(v2gVar);
                        } else {
                            zI = x340Var.i(v2gVar);
                        }
                        if (zI) {
                            i14 = 1048576;
                        } else {
                            i14 = 524288;
                        }
                    }
                    i3 |= i14;
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (x340Var.i(vu30Var)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i3 |= i9;
                }
                i10 = i3;
                if ((i3 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (x340Var.Y(i10 & 1, z3)) {
                    x340Var.d0();
                    i11 = i & 1;
                    qim0Var4 = nim0.a;
                    if (i11 != 0) {
                        if (i15 != 0) {
                            qim0Var2 = qim0Var4;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        if ((i2 & 64) != 0) {
                            u2gVar = new u2g(3, false);
                            i12 = i10 & (-3670017);
                        } else {
                            u2gVar = v2gVar;
                            i12 = i10;
                        }
                        if (i8 != 0) {
                            vu30Var3 = null;
                        } else {
                            vu30Var3 = vu30Var;
                        }
                        str5 = str4;
                        z5 = z2;
                    } else {
                        if (i15 != 0) {
                            qim0Var2 = qim0Var4;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        if ((i2 & 64) != 0) {
                            u2gVar = new u2g(3, false);
                            i12 = i10 & (-3670017);
                        } else {
                            u2gVar = v2gVar;
                            i12 = i10;
                        }
                        if (i8 != 0) {
                            vu30Var3 = null;
                        } else {
                            vu30Var3 = vu30Var;
                        }
                        str5 = str4;
                        z5 = z2;
                    }
                    x340Var.s();
                    if (z5) {
                        f = 1.0f;
                    } else {
                        f = 0.3f;
                    }
                    boolean z113 = z5;
                    str6 = str5;
                    z6 = false;
                    i13 = i12;
                    tob1 tob1VarB6 = z95.b(f, irn1.o0(CtaType.BUY_TICKETS_FIELD_NUMBER, 0, null, 6), "chipEnabledAlpha", (iu30) null, x340Var, 3072, 20);
                    uwr uwrVar6 = cbx.a;
                    cvx cvxVar11 = cbx.b(x340Var).b;
                    cvx cvxVar12 = cbx.b(x340Var).b;
                    zzq0Var = new zzq0(8.0f, 4.0f, 8.0f, 4.0f);
                    strO0 = cwl1.o0(x340Var, 2131962892);
                    x340Var.i0(58074088);
                    x340Var.i0(58064676);
                    qim0VarK = d9y0.k(qim0Var2, ((Number) tob1VarB6.getValue()).floatValue());
                    if (u2gVar.c()) {
                        avw0 avw0Var6 = cbx.b(x340Var).c;
                        qim0VarK = qim0VarK.then(vgo1.x(cbx.a(x340Var).c.a, er31.a));
                        z6 = false;
                    }
                    x340Var.r(z6);
                    if (u2gVar.b()) {
                        zG = x340Var.g(strO0);
                        objT3 = x340Var.T();
                        if (zG) {
                            objT3 = new irf(strO0, (byte) 3);
                            x340Var.s0(objT3);
                        } else {
                            objT3 = new irf(strO0, (byte) 3);
                            x340Var.s0(objT3);
                        }
                        z7 = false;
                        qim0VarK = qim0VarK.then(s161.b(qim0Var4, false, (iu30) objT3));
                    } else {
                        z7 = false;
                    }
                    qim0Var5 = qim0VarK;
                    x340Var.r(z7);
                    if (vu30Var3 == null) {
                        x340Var.i0(58081271);
                        vu30VarR = apo.r(-1427046907, new f90(huxVar, (byte) 5), x340Var);
                        x340Var.r(z7);
                    } else {
                        x340Var.i0(58080372);
                        x340Var.r(z7);
                        vu30VarR = vu30Var3;
                    }
                    if (str.length() == 0) {
                        x340Var.i0(1800828348);
                        x340Var.r(z7);
                        vu30Var4 = null;
                    } else {
                        x340Var.i0(1800855133);
                        vu30 vu30VarR7 = apo.r(1165207465, new j3b(str, (byte) 22), x340Var);
                        x340Var.r(z7);
                        vu30Var4 = vu30VarR7;
                    }
                    if (u2gVar instanceof u2g) {
                        x340Var.i0(1801338547);
                        lex lexVarZ11 = yoo1.z(x340Var);
                        pex pexVar6 = pex.b;
                        z11 = ((((i13 & 3670016) ^ 1572864) <= 1048576 && x340Var.i(u2gVar)) || (i13 & 1572864) == 1048576) | ((i13 & 896) == 256);
                        objT2 = x340Var.T();
                        if (z11) {
                            objT2 = new ame(u2gVar, function0, (byte) 14);
                            x340Var.s0(objT2);
                        } else {
                            objT2 = new ame(u2gVar, function0, (byte) 14);
                            x340Var.s0(objT2);
                        }
                        str7 = str6;
                        poo1.e(new gbx(z50.c, (Function0) objT2), pexVar6, lexVarZ11, qim0Var5, 0, str7, null, vu30VarR, null, null, null, false, zzq0Var, vu30Var4, x340Var, i13 & 458752, 0, 3920);
                        x340Var = x340Var;
                        x340Var.r(false);
                    } else {
                        vu30Var5 = vu30VarR;
                        z8 = true;
                        if (!(u2gVar instanceof t2g)) {
                            throw p3d1.k(x340Var, 58106215, false);
                        }
                        x340Var.i0(1801791116);
                        t2g t2gVar6 = (t2g) u2gVar;
                        boolean z114 = t2gVar6.a;
                        lex lexVarZ12 = yoo1.z(x340Var);
                        qexVarZ = t2gVar6.c;
                        if (qexVarZ == null) {
                            x340Var.i0(58133505);
                            qexVarZ = who1.z(w2g.a, x340Var);
                            z9 = false;
                        } else {
                            z9 = false;
                            x340Var.i0(58132947);
                        }
                        x340Var.r(z9);
                        qex qexVar6 = qexVarZ;
                        if (((i13 & 3670016) ^ 1572864) <= 1048576) {
                        }
                        if ((i13 & 896) != 256) {
                            z8 = false;
                        }
                        z10 = z8 | z14;
                        objT = x340Var.T();
                        if (z10) {
                            objT = new w9f(u2gVar, function0, (byte) 10);
                            x340Var.s0(objT);
                        } else {
                            objT = new w9f(u2gVar, function0, (byte) 10);
                            x340Var.s0(objT);
                        }
                        poo1.g(z114, (iu30) objT, qexVar6, lexVarZ12, qim0Var5, 0, null, str6, null, vu30Var5, null, null, null, false, zzq0Var, vu30Var4, x340Var, (i13 << 6) & 29360128, 0, 15712);
                        str7 = str6;
                        x340Var = x340Var;
                        x340Var.r(false);
                    }
                    z4 = z113;
                    qim0Var3 = qim0Var2;
                    str3 = str7;
                    vu30Var2 = vu30Var3;
                } else {
                    x340Var.b0();
                    str3 = str2;
                    u2gVar = v2gVar;
                    qim0Var3 = qim0Var2;
                    z4 = z2;
                    vu30Var2 = vu30Var;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new s2g(str, huxVar, function0, qim0Var3, z4, str3, u2gVar, vu30Var2, i, i2);
                }
            }
            i3 |= 196608;
            if ((i & 1572864) == 0) {
                if ((i2 & 64) != 0) {
                    i14 = 524288;
                } else {
                    if ((i & 2097152) == 0) {
                        zI = x340Var.g(v2gVar);
                    } else {
                        zI = x340Var.i(v2gVar);
                    }
                    if (zI) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                }
                i3 |= i14;
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (x340Var.i(vu30Var)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i3 |= i9;
            }
            i10 = i3;
            if ((i3 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i10 & 1, z3)) {
                x340Var.d0();
                i11 = i & 1;
                qim0Var4 = nim0.a;
                if (i11 != 0) {
                    if (i15 != 0) {
                        qim0Var2 = qim0Var4;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if (i6 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if ((i2 & 64) != 0) {
                        u2gVar = new u2g(3, false);
                        i12 = i10 & (-3670017);
                    } else {
                        u2gVar = v2gVar;
                        i12 = i10;
                    }
                    if (i8 != 0) {
                        vu30Var3 = null;
                    } else {
                        vu30Var3 = vu30Var;
                    }
                    str5 = str4;
                    z5 = z2;
                } else {
                    if (i15 != 0) {
                        qim0Var2 = qim0Var4;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if (i6 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if ((i2 & 64) != 0) {
                        u2gVar = new u2g(3, false);
                        i12 = i10 & (-3670017);
                    } else {
                        u2gVar = v2gVar;
                        i12 = i10;
                    }
                    if (i8 != 0) {
                        vu30Var3 = null;
                    } else {
                        vu30Var3 = vu30Var;
                    }
                    str5 = str4;
                    z5 = z2;
                }
                x340Var.s();
                if (z5) {
                    f = 1.0f;
                } else {
                    f = 0.3f;
                }
                boolean z115 = z5;
                str6 = str5;
                z6 = false;
                i13 = i12;
                tob1 tob1VarB7 = z95.b(f, irn1.o0(CtaType.BUY_TICKETS_FIELD_NUMBER, 0, null, 6), "chipEnabledAlpha", (iu30) null, x340Var, 3072, 20);
                uwr uwrVar7 = cbx.a;
                cvx cvxVar13 = cbx.b(x340Var).b;
                cvx cvxVar14 = cbx.b(x340Var).b;
                zzq0Var = new zzq0(8.0f, 4.0f, 8.0f, 4.0f);
                strO0 = cwl1.o0(x340Var, 2131962892);
                x340Var.i0(58074088);
                x340Var.i0(58064676);
                qim0VarK = d9y0.k(qim0Var2, ((Number) tob1VarB7.getValue()).floatValue());
                if (u2gVar.c()) {
                    avw0 avw0Var7 = cbx.b(x340Var).c;
                    qim0VarK = qim0VarK.then(vgo1.x(cbx.a(x340Var).c.a, er31.a));
                    z6 = false;
                }
                x340Var.r(z6);
                if (u2gVar.b()) {
                    zG = x340Var.g(strO0);
                    objT3 = x340Var.T();
                    if (zG) {
                        objT3 = new irf(strO0, (byte) 3);
                        x340Var.s0(objT3);
                    } else {
                        objT3 = new irf(strO0, (byte) 3);
                        x340Var.s0(objT3);
                    }
                    z7 = false;
                    qim0VarK = qim0VarK.then(s161.b(qim0Var4, false, (iu30) objT3));
                } else {
                    z7 = false;
                }
                qim0Var5 = qim0VarK;
                x340Var.r(z7);
                if (vu30Var3 == null) {
                    x340Var.i0(58081271);
                    vu30VarR = apo.r(-1427046907, new f90(huxVar, (byte) 5), x340Var);
                    x340Var.r(z7);
                } else {
                    x340Var.i0(58080372);
                    x340Var.r(z7);
                    vu30VarR = vu30Var3;
                }
                if (str.length() == 0) {
                    x340Var.i0(1800828348);
                    x340Var.r(z7);
                    vu30Var4 = null;
                } else {
                    x340Var.i0(1800855133);
                    vu30 vu30VarR8 = apo.r(1165207465, new j3b(str, (byte) 22), x340Var);
                    x340Var.r(z7);
                    vu30Var4 = vu30VarR8;
                }
                if (u2gVar instanceof u2g) {
                    x340Var.i0(1801338547);
                    lex lexVarZ13 = yoo1.z(x340Var);
                    pex pexVar7 = pex.b;
                    z11 = ((((i13 & 3670016) ^ 1572864) <= 1048576 && x340Var.i(u2gVar)) || (i13 & 1572864) == 1048576) | ((i13 & 896) == 256);
                    objT2 = x340Var.T();
                    if (z11) {
                        objT2 = new ame(u2gVar, function0, (byte) 14);
                        x340Var.s0(objT2);
                    } else {
                        objT2 = new ame(u2gVar, function0, (byte) 14);
                        x340Var.s0(objT2);
                    }
                    str7 = str6;
                    poo1.e(new gbx(z50.c, (Function0) objT2), pexVar7, lexVarZ13, qim0Var5, 0, str7, null, vu30VarR, null, null, null, false, zzq0Var, vu30Var4, x340Var, i13 & 458752, 0, 3920);
                    x340Var = x340Var;
                    x340Var.r(false);
                } else {
                    vu30Var5 = vu30VarR;
                    z8 = true;
                    if (!(u2gVar instanceof t2g)) {
                        throw p3d1.k(x340Var, 58106215, false);
                    }
                    x340Var.i0(1801791116);
                    t2g t2gVar7 = (t2g) u2gVar;
                    boolean z116 = t2gVar7.a;
                    lex lexVarZ14 = yoo1.z(x340Var);
                    qexVarZ = t2gVar7.c;
                    if (qexVarZ == null) {
                        x340Var.i0(58133505);
                        qexVarZ = who1.z(w2g.a, x340Var);
                        z9 = false;
                    } else {
                        z9 = false;
                        x340Var.i0(58132947);
                    }
                    x340Var.r(z9);
                    qex qexVar7 = qexVarZ;
                    if (((i13 & 3670016) ^ 1572864) <= 1048576) {
                    }
                    if ((i13 & 896) != 256) {
                        z8 = false;
                    }
                    z10 = z8 | z14;
                    objT = x340Var.T();
                    if (z10) {
                        objT = new w9f(u2gVar, function0, (byte) 10);
                        x340Var.s0(objT);
                    } else {
                        objT = new w9f(u2gVar, function0, (byte) 10);
                        x340Var.s0(objT);
                    }
                    poo1.g(z116, (iu30) objT, qexVar7, lexVarZ14, qim0Var5, 0, null, str6, null, vu30Var5, null, null, null, false, zzq0Var, vu30Var4, x340Var, (i13 << 6) & 29360128, 0, 15712);
                    str7 = str6;
                    x340Var = x340Var;
                    x340Var.r(false);
                }
                z4 = z115;
                qim0Var3 = qim0Var2;
                str3 = str7;
                vu30Var2 = vu30Var3;
            } else {
                x340Var.b0();
                str3 = str2;
                u2gVar = v2gVar;
                qim0Var3 = qim0Var2;
                z4 = z2;
                vu30Var2 = vu30Var;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new s2g(str, huxVar, function0, qim0Var3, z4, str3, u2gVar, vu30Var2, i, i2);
            }
        }
        i3 |= 24576;
        z2 = z;
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                if (x340Var.g(str2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((i & 1572864) == 0) {
                if ((i2 & 64) != 0) {
                    i14 = 524288;
                } else {
                    if ((i & 2097152) == 0) {
                        zI = x340Var.g(v2gVar);
                    } else {
                        zI = x340Var.i(v2gVar);
                    }
                    if (zI) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                }
                i3 |= i14;
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (x340Var.i(vu30Var)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i3 |= i9;
            }
            i10 = i3;
            if ((i3 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i10 & 1, z3)) {
                x340Var.d0();
                i11 = i & 1;
                qim0Var4 = nim0.a;
                if (i11 != 0) {
                    if (i15 != 0) {
                        qim0Var2 = qim0Var4;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if (i6 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if ((i2 & 64) != 0) {
                        u2gVar = new u2g(3, false);
                        i12 = i10 & (-3670017);
                    } else {
                        u2gVar = v2gVar;
                        i12 = i10;
                    }
                    if (i8 != 0) {
                        vu30Var3 = null;
                    } else {
                        vu30Var3 = vu30Var;
                    }
                    str5 = str4;
                    z5 = z2;
                } else {
                    if (i15 != 0) {
                        qim0Var2 = qim0Var4;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if (i6 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if ((i2 & 64) != 0) {
                        u2gVar = new u2g(3, false);
                        i12 = i10 & (-3670017);
                    } else {
                        u2gVar = v2gVar;
                        i12 = i10;
                    }
                    if (i8 != 0) {
                        vu30Var3 = null;
                    } else {
                        vu30Var3 = vu30Var;
                    }
                    str5 = str4;
                    z5 = z2;
                }
                x340Var.s();
                if (z5) {
                    f = 1.0f;
                } else {
                    f = 0.3f;
                }
                boolean z117 = z5;
                str6 = str5;
                z6 = false;
                i13 = i12;
                tob1 tob1VarB8 = z95.b(f, irn1.o0(CtaType.BUY_TICKETS_FIELD_NUMBER, 0, null, 6), "chipEnabledAlpha", (iu30) null, x340Var, 3072, 20);
                uwr uwrVar8 = cbx.a;
                cvx cvxVar15 = cbx.b(x340Var).b;
                cvx cvxVar16 = cbx.b(x340Var).b;
                zzq0Var = new zzq0(8.0f, 4.0f, 8.0f, 4.0f);
                strO0 = cwl1.o0(x340Var, 2131962892);
                x340Var.i0(58074088);
                x340Var.i0(58064676);
                qim0VarK = d9y0.k(qim0Var2, ((Number) tob1VarB8.getValue()).floatValue());
                if (u2gVar.c()) {
                    avw0 avw0Var8 = cbx.b(x340Var).c;
                    qim0VarK = qim0VarK.then(vgo1.x(cbx.a(x340Var).c.a, er31.a));
                    z6 = false;
                }
                x340Var.r(z6);
                if (u2gVar.b()) {
                    zG = x340Var.g(strO0);
                    objT3 = x340Var.T();
                    if (zG) {
                        objT3 = new irf(strO0, (byte) 3);
                        x340Var.s0(objT3);
                    } else {
                        objT3 = new irf(strO0, (byte) 3);
                        x340Var.s0(objT3);
                    }
                    z7 = false;
                    qim0VarK = qim0VarK.then(s161.b(qim0Var4, false, (iu30) objT3));
                } else {
                    z7 = false;
                }
                qim0Var5 = qim0VarK;
                x340Var.r(z7);
                if (vu30Var3 == null) {
                    x340Var.i0(58081271);
                    vu30VarR = apo.r(-1427046907, new f90(huxVar, (byte) 5), x340Var);
                    x340Var.r(z7);
                } else {
                    x340Var.i0(58080372);
                    x340Var.r(z7);
                    vu30VarR = vu30Var3;
                }
                if (str.length() == 0) {
                    x340Var.i0(1800828348);
                    x340Var.r(z7);
                    vu30Var4 = null;
                } else {
                    x340Var.i0(1800855133);
                    vu30 vu30VarR9 = apo.r(1165207465, new j3b(str, (byte) 22), x340Var);
                    x340Var.r(z7);
                    vu30Var4 = vu30VarR9;
                }
                if (u2gVar instanceof u2g) {
                    x340Var.i0(1801338547);
                    lex lexVarZ15 = yoo1.z(x340Var);
                    pex pexVar8 = pex.b;
                    z11 = ((((i13 & 3670016) ^ 1572864) <= 1048576 && x340Var.i(u2gVar)) || (i13 & 1572864) == 1048576) | ((i13 & 896) == 256);
                    objT2 = x340Var.T();
                    if (z11) {
                        objT2 = new ame(u2gVar, function0, (byte) 14);
                        x340Var.s0(objT2);
                    } else {
                        objT2 = new ame(u2gVar, function0, (byte) 14);
                        x340Var.s0(objT2);
                    }
                    str7 = str6;
                    poo1.e(new gbx(z50.c, (Function0) objT2), pexVar8, lexVarZ15, qim0Var5, 0, str7, null, vu30VarR, null, null, null, false, zzq0Var, vu30Var4, x340Var, i13 & 458752, 0, 3920);
                    x340Var = x340Var;
                    x340Var.r(false);
                } else {
                    vu30Var5 = vu30VarR;
                    z8 = true;
                    if (!(u2gVar instanceof t2g)) {
                        throw p3d1.k(x340Var, 58106215, false);
                    }
                    x340Var.i0(1801791116);
                    t2g t2gVar8 = (t2g) u2gVar;
                    boolean z118 = t2gVar8.a;
                    lex lexVarZ16 = yoo1.z(x340Var);
                    qexVarZ = t2gVar8.c;
                    if (qexVarZ == null) {
                        x340Var.i0(58133505);
                        qexVarZ = who1.z(w2g.a, x340Var);
                        z9 = false;
                    } else {
                        z9 = false;
                        x340Var.i0(58132947);
                    }
                    x340Var.r(z9);
                    qex qexVar8 = qexVarZ;
                    if (((i13 & 3670016) ^ 1572864) <= 1048576) {
                    }
                    if ((i13 & 896) != 256) {
                        z8 = false;
                    }
                    z10 = z8 | z14;
                    objT = x340Var.T();
                    if (z10) {
                        objT = new w9f(u2gVar, function0, (byte) 10);
                        x340Var.s0(objT);
                    } else {
                        objT = new w9f(u2gVar, function0, (byte) 10);
                        x340Var.s0(objT);
                    }
                    poo1.g(z118, (iu30) objT, qexVar8, lexVarZ16, qim0Var5, 0, null, str6, null, vu30Var5, null, null, null, false, zzq0Var, vu30Var4, x340Var, (i13 << 6) & 29360128, 0, 15712);
                    str7 = str6;
                    x340Var = x340Var;
                    x340Var.r(false);
                }
                z4 = z117;
                qim0Var3 = qim0Var2;
                str3 = str7;
                vu30Var2 = vu30Var3;
            } else {
                x340Var.b0();
                str3 = str2;
                u2gVar = v2gVar;
                qim0Var3 = qim0Var2;
                z4 = z2;
                vu30Var2 = vu30Var;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new s2g(str, huxVar, function0, qim0Var3, z4, str3, u2gVar, vu30Var2, i, i2);
            }
        }
        i3 |= 196608;
        if ((i & 1572864) == 0) {
            if ((i2 & 64) != 0) {
                i14 = 524288;
            } else {
                if ((i & 2097152) == 0) {
                    zI = x340Var.g(v2gVar);
                } else {
                    zI = x340Var.i(v2gVar);
                }
                if (zI) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
            }
            i3 |= i14;
        }
        i8 = i2 & 128;
        if (i8 != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            if (x340Var.i(vu30Var)) {
                i9 = 8388608;
            } else {
                i9 = 4194304;
            }
            i3 |= i9;
        }
        i10 = i3;
        if ((i3 & 4793491) != 4793490) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (x340Var.Y(i10 & 1, z3)) {
            x340Var.d0();
            i11 = i & 1;
            qim0Var4 = nim0.a;
            if (i11 != 0) {
                if (i15 != 0) {
                    qim0Var2 = qim0Var4;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if (i6 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if ((i2 & 64) != 0) {
                    u2gVar = new u2g(3, false);
                    i12 = i10 & (-3670017);
                } else {
                    u2gVar = v2gVar;
                    i12 = i10;
                }
                if (i8 != 0) {
                    vu30Var3 = null;
                } else {
                    vu30Var3 = vu30Var;
                }
                str5 = str4;
                z5 = z2;
            } else {
                if (i15 != 0) {
                    qim0Var2 = qim0Var4;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if (i6 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if ((i2 & 64) != 0) {
                    u2gVar = new u2g(3, false);
                    i12 = i10 & (-3670017);
                } else {
                    u2gVar = v2gVar;
                    i12 = i10;
                }
                if (i8 != 0) {
                    vu30Var3 = null;
                } else {
                    vu30Var3 = vu30Var;
                }
                str5 = str4;
                z5 = z2;
            }
            x340Var.s();
            if (z5) {
                f = 1.0f;
            } else {
                f = 0.3f;
            }
            boolean z119 = z5;
            str6 = str5;
            z6 = false;
            i13 = i12;
            tob1 tob1VarB9 = z95.b(f, irn1.o0(CtaType.BUY_TICKETS_FIELD_NUMBER, 0, null, 6), "chipEnabledAlpha", (iu30) null, x340Var, 3072, 20);
            uwr uwrVar9 = cbx.a;
            cvx cvxVar17 = cbx.b(x340Var).b;
            cvx cvxVar18 = cbx.b(x340Var).b;
            zzq0Var = new zzq0(8.0f, 4.0f, 8.0f, 4.0f);
            strO0 = cwl1.o0(x340Var, 2131962892);
            x340Var.i0(58074088);
            x340Var.i0(58064676);
            qim0VarK = d9y0.k(qim0Var2, ((Number) tob1VarB9.getValue()).floatValue());
            if (u2gVar.c()) {
                avw0 avw0Var9 = cbx.b(x340Var).c;
                qim0VarK = qim0VarK.then(vgo1.x(cbx.a(x340Var).c.a, er31.a));
                z6 = false;
            }
            x340Var.r(z6);
            if (u2gVar.b()) {
                zG = x340Var.g(strO0);
                objT3 = x340Var.T();
                if (zG) {
                    objT3 = new irf(strO0, (byte) 3);
                    x340Var.s0(objT3);
                } else {
                    objT3 = new irf(strO0, (byte) 3);
                    x340Var.s0(objT3);
                }
                z7 = false;
                qim0VarK = qim0VarK.then(s161.b(qim0Var4, false, (iu30) objT3));
            } else {
                z7 = false;
            }
            qim0Var5 = qim0VarK;
            x340Var.r(z7);
            if (vu30Var3 == null) {
                x340Var.i0(58081271);
                vu30VarR = apo.r(-1427046907, new f90(huxVar, (byte) 5), x340Var);
                x340Var.r(z7);
            } else {
                x340Var.i0(58080372);
                x340Var.r(z7);
                vu30VarR = vu30Var3;
            }
            if (str.length() == 0) {
                x340Var.i0(1800828348);
                x340Var.r(z7);
                vu30Var4 = null;
            } else {
                x340Var.i0(1800855133);
                vu30 vu30VarR10 = apo.r(1165207465, new j3b(str, (byte) 22), x340Var);
                x340Var.r(z7);
                vu30Var4 = vu30VarR10;
            }
            if (u2gVar instanceof u2g) {
                x340Var.i0(1801338547);
                lex lexVarZ17 = yoo1.z(x340Var);
                pex pexVar9 = pex.b;
                z11 = ((((i13 & 3670016) ^ 1572864) <= 1048576 && x340Var.i(u2gVar)) || (i13 & 1572864) == 1048576) | ((i13 & 896) == 256);
                objT2 = x340Var.T();
                if (z11) {
                    objT2 = new ame(u2gVar, function0, (byte) 14);
                    x340Var.s0(objT2);
                } else {
                    objT2 = new ame(u2gVar, function0, (byte) 14);
                    x340Var.s0(objT2);
                }
                str7 = str6;
                poo1.e(new gbx(z50.c, (Function0) objT2), pexVar9, lexVarZ17, qim0Var5, 0, str7, null, vu30VarR, null, null, null, false, zzq0Var, vu30Var4, x340Var, i13 & 458752, 0, 3920);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                vu30Var5 = vu30VarR;
                z8 = true;
                if (!(u2gVar instanceof t2g)) {
                    throw p3d1.k(x340Var, 58106215, false);
                }
                x340Var.i0(1801791116);
                t2g t2gVar9 = (t2g) u2gVar;
                boolean z1110 = t2gVar9.a;
                lex lexVarZ18 = yoo1.z(x340Var);
                qexVarZ = t2gVar9.c;
                if (qexVarZ == null) {
                    x340Var.i0(58133505);
                    qexVarZ = who1.z(w2g.a, x340Var);
                    z9 = false;
                } else {
                    z9 = false;
                    x340Var.i0(58132947);
                }
                x340Var.r(z9);
                qex qexVar9 = qexVarZ;
                if (((i13 & 3670016) ^ 1572864) <= 1048576) {
                }
                if ((i13 & 896) != 256) {
                    z8 = false;
                }
                z10 = z8 | z14;
                objT = x340Var.T();
                if (z10) {
                    objT = new w9f(u2gVar, function0, (byte) 10);
                    x340Var.s0(objT);
                } else {
                    objT = new w9f(u2gVar, function0, (byte) 10);
                    x340Var.s0(objT);
                }
                poo1.g(z1110, (iu30) objT, qexVar9, lexVarZ18, qim0Var5, 0, null, str6, null, vu30Var5, null, null, null, false, zzq0Var, vu30Var4, x340Var, (i13 << 6) & 29360128, 0, 15712);
                str7 = str6;
                x340Var = x340Var;
                x340Var.r(false);
            }
            z4 = z119;
            qim0Var3 = qim0Var2;
            str3 = str7;
            vu30Var2 = vu30Var3;
        } else {
            x340Var.b0();
            str3 = str2;
            u2gVar = v2gVar;
            qim0Var3 = qim0Var2;
            z4 = z2;
            vu30Var2 = vu30Var;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new s2g(str, huxVar, function0, qim0Var3, z4, str3, u2gVar, vu30Var2, i, i2);
        }
    }

    public static final void d(lbt0 lbt0Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        Function0 function0;
        iu30 iu30Var2 = iu30Var;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        era eraVar = een.P0;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2126221298);
        j06 j06Var = x340Var.a;
        int i2 = ((i & 6) == 0 ? (x340Var.g(lbt0Var) ? 4 : 2) | i : i) | 48;
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var2) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.a.a();
            cr31 cr31VarB = er31.b(8.0f);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarX = uyn1.x(u291.f(dug.f(qim0Var3, jA, cr31VarB), 1.0f), 16.0f);
            g36 g36Var = h36.c;
            mbh mbhVarA = jbh.a(g36Var, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            Function0 function1 = hmb0.t1;
            if (z) {
                x340Var.l(function1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar4);
            nko1.H(xos0VarM, x340Var, lljVar3);
            x0d.q(iHashCode, x340Var, lljVar2, x340Var);
            nko1.H(qim0VarE, x340Var, lljVar);
            qim0 qim0Var4 = qim0Var3;
            g36 g36Var2 = g36Var;
            Function0 function2 = function1;
            boolean z2 = false;
            int i3 = i2;
            uwo1.e(lbt0Var.d, uyn1.B(qim0Var3, 0.0f, 0.0f, 0.0f, 16.0f, 7), cbx.d(x340Var).h, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2040);
            x340Var = x340Var;
            x340Var.i0(-1761528375);
            int i4 = 0;
            for (Object obj : lbt0Var.f) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    p7h.T();
                    throw null;
                }
                xe1 xe1Var = (xe1) obj;
                fra fraVar = een.N0;
                d36 d36Var = new d36(12.0f, true, new um5(z2));
                Object objT = x340Var.T();
                if (objT == m4cVar) {
                    objT = ktd.n(x340Var);
                }
                idn0 idn0Var = (idn0) objT;
                jtr jtrVar = jtr.f;
                int i6 = i3;
                boolean zE = ((i6 & 896) == 256) | x340Var.e(i4);
                Object objT2 = x340Var.T();
                if (zE || objT2 == m4cVar) {
                    objT2 = new ck0(iu30Var2, i4, (byte) 17);
                    x340Var.s0(objT2);
                }
                qim0 qim0Var5 = qim0Var4;
                qim0 qim0VarV = bin.v(qim0Var5, idn0Var, jtrVar, false, null, null, (Function0) objT2, 28);
                jw31 jw31VarA = ew31.a(d36Var, fraVar, x340Var, 0);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarV);
                hzj.A.getClass();
                x340Var.m0();
                if (x340Var.S) {
                    function0 = function2;
                    x340Var.l(function0);
                } else {
                    function0 = function2;
                    x340Var.v0();
                }
                nko1.H(jw31VarA, x340Var, lljVar4);
                nko1.H(xos0VarM2, x340Var, lljVar3);
                x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar);
                hux huxVarD = xxq0.d(xe1Var.a);
                qim0 qim0VarX2 = uyn1.x(u291.r(dug.f(qim0Var5, z4p1.g(4280558628L), er31.b(8.0f)), 48.0f), 12.0f);
                Function0 function3 = function0;
                x340 x340Var2 = x340Var;
                w0h1.a(huxVarD, isl.a, qim0VarX2, 0L, 0L, false, x340Var2, 56, 56);
                wnb0 wnb0Var = new wnb0(1.0f, true);
                g36 g36Var3 = g36Var2;
                mbh mbhVarA2 = jbh.a(g36Var3, eraVar, x340Var2, 0);
                int iHashCode3 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM3 = x340Var2.m();
                qim0 qim0VarE3 = zr7.E(x340Var2, wnb0Var);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(function3);
                } else {
                    x340Var2.v0();
                }
                nko1.H(mbhVarA2, x340Var2, lljVar4);
                nko1.H(xos0VarM3, x340Var2, lljVar3);
                x0d.q(iHashCode3, x340Var2, lljVar2, x340Var2);
                nko1.H(qim0VarE3, x340Var2, lljVar);
                String str = xe1Var.b;
                uwr uwrVar2 = cbx.a;
                g36Var2 = g36Var3;
                uwo1.e(str, null, cbx.d(x340Var2).g, 0L, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2042);
                uwo1.e(xe1Var.c, null, cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2034);
                x340Var = x340Var2;
                x340Var.r(true);
                x340Var.r(true);
                op71.g(x340Var, u291.r(qim0Var5, 8.0f));
                qim0Var4 = qim0Var5;
                function2 = function3;
                i4 = i5;
                i3 = i6;
                z2 = false;
                iu30Var2 = iu30Var;
            }
            x340Var.r(z2);
            x340Var.r(true);
            qim0Var2 = qim0Var4;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new act0(lbt0Var, qim0Var2, iu30Var, i, (byte) 1);
        }
    }

    public static final void e(int i, String str, b0k b0kVar, boolean z, boolean z2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1105201029);
        int i2 = (x340Var.h(z) ? 4 : 2) | i | (x340Var.g(str) ? 32 : 16) | (x340Var.h(z2) ? 256 : 128);
        if (!x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.b0();
        } else if (z) {
            x340Var.i0(175585619);
            j((i2 >> 3) & 126, str, x340Var, z2);
            x340Var.r(false);
        } else {
            x340Var.i0(175635591);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new i950(z, str, z2, i);
        }
    }

    public static final void f(int i, String str, Function0 function0, b0k b0kVar, boolean z) {
        int i2;
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(792907450);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = c13.l(!z, x340Var);
            }
            ven0 ven0Var = (ven0) objT;
            tob1 tob1VarB = z95.b(((Boolean) ven0Var.getValue()).booleanValue() ? 180.0f : 0.0f, irn1.o0(250, 0, null, 6), "rotation", (iu30) null, x340Var, 3120, 20);
            jsl jslVar = new jsl(((Context) x340Var.k(AndroidCompositionLocals_androidKt.b)).getString(((Boolean) ven0Var.getValue()).booleanValue() ? 2131953965 : 2131955839, str));
            boolean zG = x340Var.g(tob1VarB);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new lws0(tob1VarB, (byte) 13);
                x340Var.s0(objT2);
            }
            qim0 qim0VarC = i541.C(nim0.a, (iu30) objT2);
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = new g8y0(ven0Var, (byte) 6);
                x340Var.s0(objT3);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT3);
            function1 = function0;
            b(function1, nlx.c, jslVar, qim0VarC, gbxVar, x340Var, ((i2 >> 6) & 14) | (nlx.d << 3), 0);
            x340Var = x340Var;
        } else {
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new odo(z, str, function1, i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void g(String str, boolean z, boolean z2, boolean z3, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        boolean z4;
        fra fraVar = een.N0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-298444363);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.h(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.h(z3) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
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
            if (z) {
                x340Var.i0(87886190);
                klx klxVar = klx.c;
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(x340Var).g;
                z4 = false;
                w0h1.a(klxVar, isl.a, uyn1.B(u291.r(nim0Var, 16.0f), 0.0f, 0.0f, 4.0f, 0.0f, 11).then(new i5j1(fraVar)), cbx.a(x340Var).b.c, 0L, false, x340Var, klx.d | 48, 48);
                x340Var.r(false);
            } else {
                z4 = false;
                x340Var.i0(88171793);
                x340Var.r(false);
            }
            if (z2 || z3) {
                x340Var = x340Var;
                x340Var.i0(88214511);
                kqn1.d(z3 ? 1 : 2, z4 ? 1 : 0, z4 ? 1 : 0, x340Var, uyn1.B(nim0Var, 0.0f, 0.0f, 4.0f, 0.0f, 11).then(new i5j1(fraVar)));
                x340Var.r(z4);
            } else {
                x340Var.i0(88493201);
                x340Var.r(z4);
            }
            if (str == null) {
                x340Var.i0(88515272);
                x340Var.r(z4);
            } else {
                x340Var.i0(88515273);
                if (str.length() > 0) {
                    x340Var.i0(410354788);
                    i5j1 i5j1Var = new i5j1(fraVar);
                    uwr uwrVar2 = cbx.a;
                    uwo1.e(str, i5j1Var, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 2, false, new zic0(2), 0, null, x340Var, 1572864, 0, 1712);
                    z4 = false;
                    x340Var.r(false);
                } else {
                    x340Var.i0(410653907);
                    x340Var.r(z4);
                }
                x340Var.r(z4);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nv01(i, str, z, z2, z3);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void h(idd1 idd1Var, String str, boolean z, String str2, boolean z2, boolean z3, boolean z4, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        h311 h311VarV;
        ov01 ov01Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(845305181);
        int i2 = i | (x340Var.i(idd1Var) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | (x340Var.g(str2) ? 2048 : 1024) | (x340Var.h(z2) ? 16384 : 8192) | (x340Var.h(z3) ? 131072 : 65536) | (x340Var.h(z4) ? 1048576 : 524288);
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            if (z) {
                x340Var.i0(1093616839);
                otw.c((maa) idd1Var.getValue(), new rfv(str), (qim0) null, (ipb1) null, x340Var, 8, 12);
                x340Var.r(false);
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    ov01Var = new ov01(idd1Var, str, z, str2, z2, z3, z4, i, (byte) 0);
                }
            } else {
                x340Var.i0(1093707173);
                x340Var.r(false);
                g(str2, z2, z3, z4, x340Var, (i2 >> 9) & 8190);
            }
            h311VarV.d = ov01Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            ov01Var = new ov01(idd1Var, str, z, str2, z2, z3, z4, i, (byte) 1);
            h311VarV.d = ov01Var;
        }
    }

    public static final void i(int i, String str, b0k b0kVar, qim0 qim0Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1967266501);
        byte b2 = 4;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            b3o1.f(cbx.d(x340Var).k, apo.r(-625524354, new j3b(str), x340Var), x340Var, 48);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gy0(str, qim0Var, i, b2);
        }
    }

    public static final void j(int i, String str, b0k b0kVar, boolean z) {
        int i2;
        long j;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1537728751);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).g;
            if (z) {
                x340Var.i0(-355889538);
                j = cbx.a(x340Var).b.c;
                x340Var.r(false);
            } else {
                x340Var.i0(-355833242);
                j = cbx.a(x340Var).b.a;
                x340Var.r(false);
            }
            uwo1.e(str, null, lee1Var, j, null, null, 2, false, new zic0(2), 0, null, x340Var, (i2 & 14) | 1572864, 0, 1714);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fkd0((byte) 2, i, str, z);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void k(boolean z, String str, String str2, boolean z2, boolean z3, boolean z4, boolean z5, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        boolean z6;
        boolean z7;
        boolean z8;
        String str3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(763900955);
        int i2 = (x340Var.h(z) ? 4 : 2) | i | (x340Var.g(str) ? 32 : 16) | (x340Var.g(str2) ? 256 : 128) | (x340Var.h(z2) ? 2048 : 1024) | (x340Var.h(z3) ? 16384 : 8192) | (x340Var.h(z4) ? 131072 : 65536) | (x340Var.h(z5) ? 1048576 : 524288);
        if (!x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            z6 = z4;
            z7 = z3;
            z8 = z2;
            str3 = str2;
            x340Var.b0();
        } else if (z) {
            x340Var.i0(-1658102353);
            if (str2 == null) {
                x340Var.i0(-1658102354);
                x340Var.r(false);
                z6 = z4;
                z7 = z3;
                z8 = z2;
                str3 = str2;
            } else {
                x340Var.i0(-1658102353);
                int i3 = (i2 >> 12) & 112;
                int i4 = i2 >> 3;
                z6 = z4;
                g(str2, z6, z2, z3, x340Var, i3 | (i4 & 896) | (i4 & 7168));
                str3 = str2;
                z8 = z2;
                z7 = z3;
                x340Var.r(false);
            }
            x340Var.r(false);
        } else {
            z6 = z4;
            z7 = z3;
            z8 = z2;
            str3 = str2;
            x340Var.i0(-1657975501);
            j(((i2 >> 3) & 14) | ((i2 >> 15) & 112), str, x340Var, z5);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uqe(z, str, str3, z8, z7, z6, z5, i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void l(gm50 gm50Var, boolean z, String str, ycm ycmVar, String str2, String str3, Function0 function0, Function0 function1, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1203199841);
        int i2 = i | (x340Var.g(gm50Var) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.g(str) ? 256 : 128) | (x340Var.i(ycmVar) ? 2048 : 1024) | (x340Var.g(str2) ? 16384 : 8192) | (x340Var.g(str3) ? 131072 : 65536) | (x340Var.i(function0) ? 1048576 : 524288) | (x340Var.i(function1) ? 8388608 : 4194304);
        if (!x340Var.Y(i2 & 1, (4793491 & i2) != 4793490)) {
            x340Var.b0();
        } else if (gm50Var.equals(et31.e)) {
            x340Var.i0(-928832792);
            plx plxVar = plx.c;
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = jt01.U0;
                x340Var.s0(objT);
            }
            b(function0, plxVar, isl.a, s161.b(nim0.a, false, (iu30) objT), null, x340Var, ((i2 >> 18) & 14) | 384 | (plx.d << 3), 16);
            x340Var = x340Var;
            x340Var.r(false);
        } else if (gm50Var.equals(et31.d)) {
            x340Var.i0(-928823877);
            f(((i2 >> 15) & 896) | ((i2 >> 3) & 112), str, function1, x340Var, !z);
            x340Var.r(false);
        } else {
            if (!(gm50Var instanceof ft31)) {
                throw p3d1.k(x340Var, -928834196, false);
            }
            x340Var.i0(-928816375);
            otw.c(ycm.a(ycmVar), new wcm(str2, str3, (String) null, (ucm) null, (Function0) null, (Function0) null, false, (String) null, (String) null, 1020), (qim0) null, (ipb1) null, x340Var, 0, 12);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q3(gm50Var, z, str, ycmVar, str2, str3, function0, function1, i);
        }
    }

    public static final osw m(rsw rswVar, iu30 iu30Var) {
        return new osw(new wh(rswVar, iu30Var, (byte) 8));
    }

    public static final aso n(wpw wpwVar, iu30 iu30Var) {
        return new aso(wpwVar, iu30Var);
    }

    public static final bso o(syq syqVar, iu30 iu30Var) {
        return new bso(syqVar, iu30Var);
    }

    public static final go80 p(klm klmVar, obp0 obp0Var, ubp0 ubp0Var, ubp0 ubp0Var2, ubp0 ubp0Var3, ubp0 ubp0Var4) {
        return klmVar.a("GoBluetoothServiceStarterDaemon", new kbp0(ubp0Var, ubp0Var2, ubp0Var3, obp0Var, ubp0Var4, (byte) 4));
    }

    public static boolean q(Uri uri) {
        if (uri == null) {
            return false;
        }
        if (u890.j(uri.getHost(), "auth-callback.spotify.com")) {
            return true;
        }
        return (u890.j(uri.getHost(), "callback") && u890.j(uri.getScheme(), "spotify-auth-music")) || ggo1.K(uri.toString()) != null;
    }

    public static final boolean r(o571 o571Var) {
        return o571Var == d571.d || o571Var == b571.d || o571Var == t471.d || o571Var == n471.d || o571Var == k571.d;
    }

    public static final boolean s(long j, long j2) {
        return j < j2 - 604800000 || j > j2 + 86400000;
    }

    public static final df41 t(iu30 iu30Var, vu30 vu30Var) {
        w9 w9Var = new w9(vu30Var, (byte) 11);
        w0h1.o(1, iu30Var);
        return new df41(iu30Var, w9Var);
    }

    public static final lvl0 u(urk0 urk0Var, svi1 svi1Var) {
        d8r0 d8r0Var = svi1Var.e;
        return new lvl0(new mjl0(new mjl0(urk0Var, d8r0Var.b, d8r0Var.a, d8r0Var.e), d8r0Var.d), svi1Var.f, (byte) 3);
    }

    public static final HubsImmutableComponentBundle v(uga0 uga0Var, boolean z) {
        HubsImmutableComponentBundle hubsImmutableComponentBundle;
        String strB;
        Boolean boolF;
        yxo1 yxo1VarP = HubsImmutableComponentBundle.b.a;
        if (uga0Var != null) {
            for (Map.Entry entry : uga0Var.a.entrySet()) {
                String str = (String) entry.getKey();
                aha0 aha0Var = (ega0) entry.getValue();
                if (aha0Var instanceof uga0) {
                    yxo1VarP = yxo1VarP.p(v((uga0) aha0Var, z), str);
                } else if (aha0Var instanceof pfa0) {
                    pfa0 pfa0Var = (pfa0) aha0Var;
                    List<uga0> list = pfa0Var.a;
                    int i = 0;
                    if (list.isEmpty()) {
                        yxo1VarP = yxo1VarP.K(str, new String[0]);
                    } else {
                        aha0 aha0Var2 = (ega0) o7h.q0(pfa0Var);
                        if (aha0Var2 instanceof uga0) {
                            ArrayList arrayList = new ArrayList(q7h.U(pfa0Var, 10));
                            for (uga0 uga0Var2 : list) {
                                if (uga0Var2 instanceof uga0) {
                                    hubsImmutableComponentBundle = v(uga0Var2, false);
                                } else {
                                    if (!u890.j(uga0Var2, rga0.INSTANCE)) {
                                        tw20.w(uga0Var2, "Unsupported Hubs bundle array value: ");
                                        return null;
                                    }
                                    hubsImmutableComponentBundle = new HubsImmutableComponentBundle();
                                }
                                arrayList.add(hubsImmutableComponentBundle);
                            }
                            yxo1VarP = yxo1VarP.q(str, (HubsImmutableComponentBundle[]) arrayList.toArray(new HubsImmutableComponentBundle[0]));
                        } else {
                            if (!(aha0Var2 instanceof aha0)) {
                                tw20.w(aha0Var2, "Unsupported Hubs array value: ");
                                return null;
                            }
                            aha0 aha0Var3 = aha0Var2;
                            if (aha0Var3.c()) {
                                ArrayList arrayList2 = new ArrayList(q7h.U(pfa0Var, 10));
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    aha0 aha0Var4 = (ega0) it.next();
                                    if (aha0Var4 != rga0.INSTANCE) {
                                        if (aha0Var4 instanceof aha0) {
                                            aha0 aha0Var5 = aha0Var4;
                                            if (aha0Var5.c()) {
                                                strB = aha0Var5.b();
                                            }
                                        }
                                        tw20.w(aha0Var4, "Unsupported Hubs string array value: ");
                                        return null;
                                    }
                                    strB = null;
                                    arrayList2.add(strB);
                                }
                                yxo1VarP = yxo1VarP.K(str, (String[]) arrayList2.toArray(new String[0]));
                            } else if (fga0.f(aha0Var3) != null) {
                                ArrayList arrayList3 = new ArrayList(q7h.U(pfa0Var, 10));
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    aha0 aha0Var6 = (ega0) it2.next();
                                    aha0 aha0Var7 = aha0Var6 instanceof aha0 ? aha0Var6 : null;
                                    if (aha0Var7 == null || (boolF = fga0.f(aha0Var7)) == null) {
                                        tw20.w(aha0Var6, "Unsupported Hubs boolean array value: ");
                                        return null;
                                    }
                                    arrayList3.add(boolF);
                                }
                                yxo1VarP = yxo1VarP.n(str, o7h.f1(arrayList3));
                            } else if (!z || ihc1.i0(aha0Var3.b(), '.')) {
                                ArrayList arrayList4 = new ArrayList(q7h.U(pfa0Var, 10));
                                Iterator it3 = list.iterator();
                                while (it3.hasNext()) {
                                    arrayList4.add(Double.valueOf(Double.parseDouble(((ega0) it3.next()).b())));
                                }
                                double[] dArr = new double[arrayList4.size()];
                                Iterator it4 = arrayList4.iterator();
                                while (it4.hasNext()) {
                                    dArr[i] = ((Number) it4.next()).doubleValue();
                                    i++;
                                }
                                yxo1VarP = yxo1VarP.v(str, dArr);
                            } else {
                                ArrayList arrayList5 = new ArrayList(q7h.U(pfa0Var, 10));
                                Iterator it5 = list.iterator();
                                while (it5.hasNext()) {
                                    arrayList5.add(Long.valueOf(Long.parseLong(((ega0) it5.next()).b())));
                                }
                                yxo1VarP = yxo1VarP.E(str, o7h.m1(arrayList5));
                            }
                        }
                    }
                } else {
                    if (!(aha0Var instanceof aha0)) {
                        eg.o();
                        return null;
                    }
                    if (aha0Var != rga0.INSTANCE) {
                        aha0 aha0Var8 = aha0Var;
                        if (aha0Var8.c()) {
                            yxo1VarP = yxo1VarP.J(str, aha0Var8.b());
                        } else if (fga0.f(aha0Var8) != null) {
                            Boolean boolF2 = fga0.f(aha0Var8);
                            boolF2.getClass();
                            yxo1VarP = yxo1VarP.m(str, boolF2.booleanValue());
                        } else {
                            yxo1VarP = (!z || ihc1.i0(aha0Var8.b(), '.')) ? yxo1VarP.w(str, Double.parseDouble(aha0Var8.b())) : yxo1VarP.F(Long.parseLong(aha0Var8.b()), str);
                        }
                    }
                }
            }
        }
        return yxo1VarP.o();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0035  */
    public static Uri w(wq8 wq8Var, String str, Boolean bool) {
        String language;
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder builderAuthority = builder.scheme("https").authority("accounts.spotify.com");
        Locale locale = Locale.getDefault();
        j380 j380Var = v45.a;
        if (locale == null) {
            language = "";
        } else {
            language = locale.getLanguage();
            String str2 = (String) v45.a.get(language);
            if (str2 != null) {
                language = str2;
            }
            if (v45.b.contains(language)) {
                language.getClass();
            } else {
                language = "";
            }
        }
        Uri.Builder builderAppendEncodedPath = builderAuthority.appendPath(language).appendEncodedPath("oauth2/v2/auth");
        String str3 = wq8Var.a;
        fyq0 fyq0Var = wq8Var.g;
        int i = wq8Var.b;
        builderAppendEncodedPath.appendQueryParameter("client_id", str3).appendQueryParameter("redirect_uri", wq8Var.c).appendQueryParameter("nosignout", Boolean.TRUE.toString()).appendQueryParameter("id_token_hint", str);
        boolean zBooleanValue = bool.booleanValue();
        String str4 = "none";
        if (zBooleanValue) {
            builder.appendQueryParameter("prompt", "none");
        } else if (wq8Var.h) {
            builder.appendQueryParameter("prompt", "consent");
        }
        String str5 = wq8Var.e;
        if (str5 != null) {
            builder.appendQueryParameter("state", str5);
        }
        if (i == 1) {
            str4 = "legacy-token";
        } else if (i == 1) {
            str4 = "token";
        } else if (i == 2) {
            str4 = "code";
        } else if (i != 3) {
            if (i != 4) {
                throw null;
            }
            str4 = "unknown";
        }
        builder.appendQueryParameter("response_type", str4);
        if (fyq0Var != null && i == 2) {
            builder.appendQueryParameter("code_challenge", fyq0Var.a);
            builder.appendQueryParameter("code_challenge_method", fyq0Var.b);
        }
        xig xigVar = wq8Var.d;
        if (xigVar != null) {
            builder.appendQueryParameter("client_app_id", xigVar.a + ":" + xigVar.b);
        }
        List list = wq8Var.f;
        if (!list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            Iterator it = list.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb.append((CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append((CharSequence) " ");
                }
            }
            builder.appendQueryParameter("scope", sb.toString());
        }
        String str6 = wq8Var.i;
        if (str6 != null) {
            builder.appendQueryParameter("utm_source", str6);
        }
        String str7 = wq8Var.j;
        if (str7 != null) {
            builder.appendQueryParameter("utm_medium", str7);
        }
        String str8 = wq8Var.k;
        if (str8 != null) {
            builder.appendQueryParameter("utm_campaign", str8);
        }
        String str9 = wq8Var.l;
        if (str9 != null) {
            builder.appendQueryParameter("associated_content", str9);
        }
        return builder.build();
    }

    public static final Next x(bej0 bej0Var, ydj0 ydj0Var) {
        Map.Entry entry;
        Object next;
        Map map = bej0Var.a;
        Object obj = null;
        if (ydj0Var instanceof udj0) {
            udj0 udj0Var = (udj0) ydj0Var;
            Iterator it = map.entrySet().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!u890.j(((nkk1) ((Map.Entry) next).getValue()).a, udj0Var.a));
            Map.Entry entry2 = (Map.Entry) next;
            return entry2 != null ? Next.i(bej0.a(bej0Var, (LinkedHashMap) null, false, false, 3), Effects.a(new ndj0[]{new ndj0((String) entry2.getKey(), ((nkk1) entry2.getValue()).a)})) : Next.j();
        }
        if (ydj0Var instanceof vdj0) {
            vdj0 vdj0Var = (vdj0) ydj0Var;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry3 : map.entrySet()) {
                if (!u890.j(entry3.getKey(), vdj0Var.a)) {
                    linkedHashMap.put(entry3.getKey(), entry3.getValue());
                }
            }
            return Next.h(bej0.a(bej0Var, linkedHashMap, false, false, 2));
        }
        if (!(ydj0Var instanceof wdj0)) {
            if (ydj0Var instanceof xdj0) {
                xdj0 xdj0Var = (xdj0) ydj0Var;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(map);
                linkedHashMap2.put(xdj0Var.b, new nkk1(xdj0Var.a, xdj0Var.c));
                return Next.h(bej0.a(bej0Var, linkedHashMap2, false, true, 2));
            }
            if (!(ydj0Var instanceof tdj0)) {
                eg.o();
                return null;
            }
            boolean z = ((tdj0) ydj0Var).a;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (z && (entry = (Map.Entry) o7h.r0(map.entrySet())) != null) {
                linkedHashSet.add(new ndj0((String) entry.getKey(), ((nkk1) entry.getValue()).a));
            }
            return Next.i(bej0.a(bej0Var, (LinkedHashMap) null, z, false, 5), linkedHashSet);
        }
        wdj0 wdj0Var = (wdj0) ydj0Var;
        String str = wdj0Var.a;
        dio1 dio1Var = wdj0Var.b;
        bq21 bq21Var = new bq21(str, dio1Var);
        if (bej0Var.b) {
            return Next.a(Effects.a(new odj0[]{new odj0(bq21Var)}));
        }
        Set setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty() && !bej0Var.c) {
            return Next.i(bej0.a(bej0Var, (LinkedHashMap) null, false, true, 3), Effects.a(new pdj0[]{new pdj0(bq21Var)}));
        }
        for (Object obj2 : setEntrySet) {
            if (dio1Var.w().a > ((nkk1) ((Map.Entry) obj2).getValue()).b.a) {
                obj = obj2;
                break;
            }
        }
        Map.Entry entry4 = (Map.Entry) obj;
        return entry4 != null ? Next.a(Effects.a(new mdj0[]{new mdj0(bq21Var, (String) entry4.getKey(), ((nkk1) entry4.getValue()).a)})) : Next.a(Effects.a(new odj0[]{new odj0(bq21Var)}));
    }
}
