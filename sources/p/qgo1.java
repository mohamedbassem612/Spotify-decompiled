package p;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.Build;
import com.spotify.concertcampaignview.v1.CtaType;
import com.spotify.userinteractivityservice.usercomments.v1.proto.Comment;
import defpackage.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class qgo1 {
    public static final wq71 a = new wq71((byte) 1);
    public static b180 b;

    public static final void a(Object obj, xf6 xf6Var, String str, xgm1 xgm1Var, iu30 iu30Var, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(651720763);
        int i2 = i | (x340Var.g(obj) ? 4 : 2) | (x340Var.i(xf6Var) ? 32 : 16) | (x340Var.g(str) ? 256 : 128) | (x340Var.i(xgm1Var) ? 2048 : 1024) | (x340Var.i(iu30Var) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            ven0 ven0VarH = rwq.h(xgm1Var.getState(), x340Var, 0);
            boolean zG = ((i2 & 896) == 256) | x340Var.g(ven0VarH);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = yv91.a(new yd6((tob1) ven0VarH, str, (byte) 0));
                x340Var.s0(objT);
            }
            tob1 tob1Var = (tob1) objT;
            ven0 ven0VarS = v8r.s(iu30Var, x340Var);
            Boolean bool = (Boolean) tob1Var.getValue();
            bool.booleanValue();
            boolean zG2 = x340Var.g(tob1Var) | ((i2 & 14) == 4) | x340Var.g(ven0VarS) | x340Var.i(xf6Var);
            Object objT2 = x340Var.T();
            if (zG2 || objT2 == m4cVar) {
                db dbVar = new db(obj, tob1Var, ven0VarS, xf6Var, (byte) 15);
                x340Var.s0(dbVar);
                objT2 = dbVar;
            }
            qxd0.h(obj, bool, (iu30) objT2, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m((byte) 11, i, obj, (Object) xf6Var, (Object) xgm1Var, (Object) iu30Var, str);
        }
    }

    public static final void b(s2o s2oVar, String str, cvm cvmVar, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) {
        cvm cvmVar2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1360212000);
        int i2 = i | (b0kVar3.g(s2oVar) ? 4 : 2) | (b0kVar3.g(str) ? 32 : 16) | (b0kVar3.e(cvmVar.ordinal()) ? 256 : 128) | (b0kVar3.i(qim0Var) ? 2048 : 1024) | (b0kVar3.i(function0) ? 16384 : 8192);
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            cvmVar2 = cvmVar;
            b0kVar2 = b0kVar3;
            cwl1.b(u291.f(qim0Var, 1.0f), (tl3) null, (hw61) null, ngx.e, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), (max) null, false, (idn0) null, (ga80) null, function0 != null ? new gbx(z50.c, function0) : null, (gbx) null, apo.r(-926725929, new nzd(s2oVar, cvmVar2, str, (byte) 9), b0kVar3), b0kVar2, 0, 48, 1510);
        } else {
            cvmVar2 = cvmVar;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new sxj((byte) 13, i, (Object) s2oVar, (Object) cvmVar2, (Object) qim0Var, (Object) function0, str);
        }
    }

    public static final void c(int i, kes kesVar, qim0 qim0Var, boolean z, boolean z2, float f, float f2, long j, long j2, b0k b0kVar, int i2) {
        x340 x340Var;
        char c;
        pxg1 pxg1VarJ0;
        int i3 = i;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1464262241);
        boolean z3 = z2;
        int i4 = i2 | (x340Var2.e(i3) ? 4 : 2) | (x340Var2.g(kesVar) ? 32 : 16) | (x340Var2.g(qim0Var) ? 256 : 128) | (x340Var2.h(z) ? 2048 : 1024) | (x340Var2.h(z3) ? 16384 : 8192);
        if ((i2 & 196608) == 0) {
            i4 |= x340Var2.d(f) ? 131072 : 65536;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= x340Var2.f(j) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= x340Var2.f(j2) ? 67108864 : 33554432;
        }
        if (x340Var2.Y(i4 & 1, (38347923 & i4) != 38347922)) {
            jw31 jw31VarA = ew31.a(new d36(f, true, new um5(false)), een.N0, x340Var2, 48);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0Var);
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
            nko1.H(jw31VarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            x340Var2.i0(-957861237);
            int i5 = 0;
            while (i5 < i3) {
                x340Var2.f0(-1083437034, Integer.valueOf(i5));
                Float fValueOf = Float.valueOf(i5 == ((err0) ((jkr0) kesVar).d.c).s() ? 1.0f : 0.0f);
                if (z) {
                    ilv.a.getClass();
                    c = 2;
                    pxg1VarJ0 = irn1.o0(CtaType.CTA_WAITLISTED_FIELD_NUMBER, 0, flv.i, 2);
                } else {
                    c = 2;
                    pxg1VarJ0 = irn1.j0();
                }
                x340 x340Var3 = x340Var2;
                t1c.a(dug.f(u291.r(nim0.a, f2), z4p1.A(((Number) zod.G(fValueOf, z3, rno1.a, pxg1VarJ0, x340Var3, (i4 >> 9) & 112)).floatValue(), j2, j), er31.a), x340Var3, 0);
                x340Var3.r(false);
                i5++;
                i3 = i;
                x340Var2 = x340Var3;
                z3 = z2;
            }
            x340Var = x340Var2;
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vzd(i, kesVar, qim0Var, z, z2, f, f2, j, j2, i2);
        }
    }

    public static final void d(a470 a470Var, boolean z, qim0 qim0Var, Function0 function0, vnd1 vnd1Var, b0k b0kVar, int i) {
        int i2;
        boolean z2;
        qim0 qim0Var2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-681575505);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? b0kVar3.g(a470Var) : b0kVar3.i(a470Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z2 = z;
            i2 |= b0kVar3.h(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i & 384) == 0) {
            qim0Var2 = qim0Var;
            i2 |= b0kVar3.g(qim0Var2) ? 256 : 128;
        } else {
            qim0Var2 = qim0Var;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? b0kVar3.g(vnd1Var) : b0kVar3.i(vnd1Var) ? 16384 : 8192;
        }
        boolean z3 = true;
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            m4c m4cVar = fkj0.X;
            b0kVar3.i0(1417198612);
            if ((((i2 & 7168) ^ 3072) <= 2048 || !b0kVar3.g(function0)) && (i2 & 3072) != 2048) {
                z3 = false;
            }
            Object objT = b0kVar3.T();
            if (z3 || objT == m4cVar) {
                objT = new sah1(function0, (byte) 2);
                b0kVar3.s0(objT);
            }
            q3p1.b(6, 0, (Function0) objT, b0kVar3, false);
            upb0 upb0VarB = wpb0.b(b0kVar3);
            kiv kivVar = t4k.h;
            float fX0 = ((wat) b0kVar3.k(kivVar)).X0(30.0f);
            float fX1 = ((wat) b0kVar3.k(kivVar)).X0(30.0f);
            float fM = dsa0.m(b0kVar3, 2131167182);
            float fM2 = dsa0.m(b0kVar3, 2131167181);
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = yv91.a(new c1g0(upb0VarB, fX0, fX1, (byte) 2));
                b0kVar3.s0(objT2);
            }
            tob1 tob1Var = (tob1) objT2;
            qim0 qim0Var3 = qim0Var2;
            b0kVar2 = b0kVar3;
            irn1.u(null, apo.r(-1946638393, new wpg1((Object) function0, (Object) a470Var, (Object) tob1Var, (byte) 8), b0kVar3), null, null, apo.r(-648877939, new tkd1(qim0Var3, z2, vnd1Var, fM, fM2, a470Var, upb0VarB, tob1Var), b0kVar3), b0kVar2, 24624, 13);
            b0kVar2.r(false);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new cnr0(a470Var, z, qim0Var, function0, vnd1Var, i);
        }
    }

    public static final void e(som somVar, qim0 qim0Var, b0k b0kVar, int i) {
        String str;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1900175145);
        int i2 = i | (x340Var.i(somVar) ? 4 : 2) | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            mum mumVar = somVar.c;
            cvm cvmVar = somVar.g;
            if (mumVar instanceof mum) {
                str = mumVar.c;
            } else if (mumVar instanceof lum) {
                str = ((lum) mumVar).c;
            } else {
                if (!(mumVar instanceof num)) {
                    eg.o();
                    return;
                }
                str = ((num) mumVar).c;
            }
            boolean zG = x340Var.g(str) | x340Var.e(cvmVar.ordinal());
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                ye5 ye5Var = new ye5();
                if (cvmVar == cvm.b) {
                    zg90.a(ye5Var, str);
                } else {
                    ye5Var.g(str);
                }
                objT = ye5Var.p();
                x340Var.s0(objT);
            }
            uwr uwrVar = cbx.a;
            uwo1.d((af5) objT, cbx.a(x340Var).b.b, qim0Var, cbx.d(x340Var).j, null, null, 0, false, null, 0, null, null, x340Var, (i2 << 3) & 896, 0, 4080);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jjk(somVar, qim0Var, i, (byte) 25);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0116  */
    /* JADX WARN: Code duplicated, block: B:102:0x0122  */
    /* JADX WARN: Code duplicated, block: B:105:0x0137  */
    /* JADX WARN: Code duplicated, block: B:109:0x0146 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:110:0x0148  */
    /* JADX WARN: Code duplicated, block: B:113:0x015d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:114:0x015f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0170  */
    /* JADX WARN: Code duplicated, block: B:125:0x019c  */
    /* JADX WARN: Code duplicated, block: B:127:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:128:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:131:0x01d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:134:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:137:0x0204 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:138:0x0206  */
    /* JADX WARN: Code duplicated, block: B:141:0x0228  */
    /* JADX WARN: Code duplicated, block: B:142:0x0238  */
    /* JADX WARN: Code duplicated, block: B:144:0x023c  */
    /* JADX WARN: Code duplicated, block: B:146:0x0248 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:147:0x024a  */
    /* JADX WARN: Code duplicated, block: B:150:0x0262 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:151:0x0264  */
    /* JADX WARN: Code duplicated, block: B:154:0x0293  */
    /* JADX WARN: Code duplicated, block: B:157:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:161:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:165:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:167:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:170:0x02df  */
    /* JADX WARN: Code duplicated, block: B:173:0x0312  */
    /* JADX WARN: Code duplicated, block: B:176:0x0321  */
    /* JADX WARN: Code duplicated, block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:49:0x007e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:56:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x0096  */
    /* JADX WARN: Code duplicated, block: B:60:0x0099  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d6 A[PHI: r5 r7 r8 r10
      0x00d6: PHI (r5v15 p.qim0) = (r5v5 p.qim0), (r5v2 p.qim0) binds: [B:87:0x00eb, B:76:0x00d3] A[DONT_GENERATE, DONT_INLINE]
      0x00d6: PHI (r7v9 p.a0e1) = (r7v4 p.a0e1), (r7v2 p.a0e1) binds: [B:87:0x00eb, B:76:0x00d3] A[DONT_GENERATE, DONT_INLINE]
      0x00d6: PHI (r8v25 int) = (r8v9 int), (r8v6 int) binds: [B:87:0x00eb, B:76:0x00d3] A[DONT_GENERATE, DONT_INLINE]
      0x00d6: PHI (r10v14 boolean) = (r10v3 boolean), (r10v2 boolean) binds: [B:87:0x00eb, B:76:0x00d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x00db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:94:0x0102  */
    /* JADX WARN: Code duplicated, block: B:95:0x0106  */
    /* JADX WARN: Code duplicated, block: B:98:0x010f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0112  */
    public static final void f(vnr0 vnr0Var, qim0 qim0Var, a0e1 a0e1Var, int i, boolean z, iu30 iu30Var, b0k b0kVar, int i2, int i3) {
        int i4;
        qim0 qim0Var2;
        int i5;
        a0e1 a0e1Var2;
        int i6;
        int i7;
        int i8;
        boolean z2;
        int i9;
        int i10;
        iu30 iu30Var2;
        int i11;
        int i12;
        boolean z3;
        x340 x340Var;
        qim0 qim0Var3;
        a0e1 a0e1Var3;
        boolean z4;
        iu30 iu30Var3;
        int i13;
        h311 h311VarV;
        int i14;
        qim0 qim0Var4;
        Object objT;
        iu30 iu30Var4;
        qim0 qim0Var5;
        a0e1 a0e1Var4;
        boolean z5;
        a0e1 a0e1Var5;
        kor0 kor0Var;
        bor0 bor0VarE;
        String str;
        boolean zG;
        Object objT2;
        ven0 ven0Var;
        Object objT3;
        ven0 ven0Var2;
        boolean z6;
        Paint paint;
        gw70 gw70Var;
        boolean zI;
        Object objT4;
        Object obj;
        ven0 ven0VarP;
        boolean zG2;
        Object objT5;
        float fC;
        u5j1 u5j1Var;
        qim0 qim0VarThen;
        gra graVar;
        boolean zI2;
        Object objT6;
        boolean zI3;
        Object objT7;
        Object obj2;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1565471128);
        if ((i2 & 6) == 0) {
            i4 = (x340Var2.i(vnr0Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i15 = i3 & 2;
        if (i15 == 0) {
            if ((i2 & 48) == 0) {
                qim0Var2 = qim0Var;
                i4 |= x340Var2.i(qim0Var2) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                if ((i2 & 384) == 0) {
                    a0e1Var2 = a0e1Var;
                    if (x340Var2.g(a0e1Var2)) {
                        i6 = 256;
                    } else {
                        i6 = 128;
                    }
                    i4 |= i6;
                }
                if ((i2 & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        i7 = i;
                        int i16 = x340Var2.e(i7) ? 2048 : 1024;
                        i4 |= i16;
                    } else {
                        i7 = i;
                    }
                    i4 |= i16;
                } else {
                    i7 = i;
                }
                i8 = i3 & 16;
                if (i8 != 0) {
                    if ((i2 & 24576) == 0) {
                        z2 = z;
                        if (x340Var2.h(z2)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i4 |= i9;
                    }
                    i10 = i3 & 32;
                    if (i10 != 0) {
                        if ((196608 & i2) == 0) {
                            iu30Var2 = iu30Var;
                            if (x340Var2.i(iu30Var2)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i4 |= i11;
                        }
                        i12 = i4;
                        if ((74899 & i4) != 74898) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (x340Var2.Y(i12 & 1, z3)) {
                            x340Var2.d0();
                            i14 = i2 & 1;
                            qim0Var4 = nim0.a;
                            if (i14 != 0 || x340Var2.E()) {
                                if (i15 != 0) {
                                    qim0Var2 = qim0Var4;
                                }
                                if (i5 != 0) {
                                    a0e1Var2 = null;
                                }
                                if ((i3 & 8) != 0) {
                                    i7 = 2;
                                }
                                if (i8 != 0) {
                                    z2 = true;
                                }
                                if (i10 != 0) {
                                    objT = x340Var2.T();
                                    if (objT == m4cVar) {
                                        objT = q4r0.R0;
                                        x340Var2.s0(objT);
                                    }
                                    iu30Var4 = (iu30) objT;
                                    qim0Var5 = qim0Var2;
                                    a0e1Var4 = a0e1Var2;
                                    z5 = z2;
                                }
                                x340Var2.s();
                                if (a0e1Var4 == null) {
                                    a0e1Var5 = vnr0Var.e;
                                } else {
                                    a0e1Var5 = a0e1Var4;
                                }
                                kor0Var = vnr0Var.c;
                                bor0VarE = kor0Var.e();
                                if (bor0VarE != null) {
                                    str = bor0VarE.b;
                                } else {
                                    str = null;
                                }
                                if (str == null) {
                                    x340Var2.i0(2099902062);
                                    x340Var2.r(false);
                                    str = null;
                                } else {
                                    x340Var2.i0(2099902063);
                                    if (!((Boolean) x340Var2.k(zv40.a)).booleanValue()) {
                                        str = null;
                                    }
                                    x340Var2.r(false);
                                }
                                zG = x340Var2.g(vnr0Var);
                                objT2 = x340Var2.T();
                                if (zG || objT2 == m4cVar) {
                                    objT2 = v8r.q((Object) null);
                                    x340Var2.s0(objT2);
                                }
                                ven0Var = (ven0) objT2;
                                boolean zG3 = x340Var2.g(vnr0Var);
                                iu30 iu30Var5 = iu30Var4;
                                objT3 = x340Var2.T();
                                if (!zG3 || objT3 == m4cVar) {
                                }
                                ven0Var2 = (ven0) objT3;
                                if (bor0VarE != 0 || Build.VERSION.SDK_INT < 33) {
                                    z6 = false;
                                    x340Var2.i0(2100253013);
                                    x340Var2.r(false);
                                    paint = null;
                                } else {
                                    x340Var2.i0(2100190239);
                                    Object objT8 = x340Var2.T();
                                    if (objT8 == m4cVar) {
                                        obj2 = objT8;
                                        idd1 idd1Var = ol10.a;
                                        Paint paint2 = new Paint();
                                        paint2.setShader(rqb.b());
                                        x340Var2.s0(paint2);
                                        obj2 = paint2;
                                    }
                                    obj2 = objT8;
                                    z6 = false;
                                    x340Var2.r(false);
                                    paint = (Paint) obj2;
                                }
                                if (str != null) {
                                    x340Var2.i0(-1179171249);
                                    gw70Var = (gw70) x340Var2.k(oi7.a);
                                    x340Var2.r(z6);
                                } else {
                                    x340Var2.i0(2100409749);
                                    x340Var2.r(z6);
                                    gw70Var = null;
                                }
                                zI = x340Var2.i(gw70Var) | x340Var2.g(str);
                                objT4 = x340Var2.T();
                                if (!zI || objT4 == m4cVar) {
                                    obj = null;
                                    objT4 = new wv40(gw70Var, str, (lnm) null, (byte) 1);
                                    x340Var2.s0(objT4);
                                } else {
                                    obj = null;
                                }
                                ven0VarP = yto.p(obj, str, (vu30) objT4, x340Var2, 6);
                                zG2 = x340Var2.g(vnr0Var);
                                objT5 = x340Var2.T();
                                if (zG2 || objT5 == m4cVar) {
                                    objT5 = x(vnr0Var);
                                    x340Var2.s0(objT5);
                                }
                                af5 af5Var = (af5) objT5;
                                x340Var2.i0(-1179151556);
                                fC = u7h.c(kor0Var.b().a);
                                u5j1Var = d4o1.a;
                                if (fC > 0.0f) {
                                    qim0VarThen = qim0Var5.then(dug.f(qim0Var4, kor0Var.b().a, u5j1Var));
                                } else {
                                    qim0VarThen = qim0Var5;
                                }
                                if (bor0VarE != 0) {
                                    zI2 = x340Var2.i(ven0Var);
                                    objT6 = x340Var2.T();
                                    if (zI2 || objT6 == m4cVar) {
                                        objT6 = new q2j0(ven0Var, (byte) 18);
                                        x340Var2.s0(objT6);
                                    }
                                    Function0 function0 = (Function0) objT6;
                                    zI3 = x340Var2.i(ven0Var2);
                                    objT7 = x340Var2.T();
                                    if (zI3 || objT7 == m4cVar) {
                                        objT7 = new q2j0(ven0Var2, (byte) 19);
                                        x340Var2.s0(objT7);
                                    }
                                    qim0VarThen = qim0VarThen.then(exd0.r(i541.C(qim0Var4, vc40.R0), new aw40(bor0VarE, function0, (Function0) objT7, paint, (Bitmap) ven0VarP.getValue(), (byte) 0)));
                                }
                                x340Var2.r(false);
                                if (kor0Var.b().d.a > 0) {
                                    eor0 eor0Var = kor0Var.b().d;
                                    qim0VarThen = qim0VarThen.then(d1u.E(eor0Var.a, eor0Var.b, qim0Var4, u5j1Var));
                                }
                                qim0 qim0VarY = uyn1.y(qim0VarThen, kor0Var.b().c, kor0Var.b().b);
                                if (a0e1Var5 == null && a0e1Var5.a == 3) {
                                    graVar = een.h;
                                } else if (a0e1Var5 == null && a0e1Var5.a == 6) {
                                    graVar = een.f;
                                } else {
                                    graVar = een.d;
                                }
                                i7 = i7;
                                w2g0.c(qim0VarY, graVar, apo.r(-975688238, new vor0(bor0VarE, ven0Var, iu30Var5, vnr0Var, kor0Var, af5Var, a0e1Var5, i7, z5, ven0Var2), x340Var2), x340Var2, 3072, 4);
                                x340Var = x340Var2;
                                iu30Var3 = iu30Var5;
                                z4 = z5;
                                qim0Var3 = qim0Var5;
                                a0e1Var3 = a0e1Var4;
                            } else {
                                x340Var2.b0();
                            }
                            qim0Var5 = qim0Var2;
                            z5 = z2;
                            iu30Var4 = iu30Var2;
                            a0e1Var4 = a0e1Var2;
                            x340Var2.s();
                            if (a0e1Var4 == null) {
                                a0e1Var5 = vnr0Var.e;
                            } else {
                                a0e1Var5 = a0e1Var4;
                            }
                            kor0Var = vnr0Var.c;
                            bor0VarE = kor0Var.e();
                            if (bor0VarE != null) {
                                str = bor0VarE.b;
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                x340Var2.i0(2099902062);
                                x340Var2.r(false);
                                str = null;
                            } else {
                                x340Var2.i0(2099902063);
                                if (!((Boolean) x340Var2.k(zv40.a)).booleanValue()) {
                                    str = null;
                                }
                                x340Var2.r(false);
                            }
                            zG = x340Var2.g(vnr0Var);
                            objT2 = x340Var2.T();
                            if (zG) {
                                objT2 = v8r.q((Object) null);
                                x340Var2.s0(objT2);
                            } else {
                                objT2 = v8r.q((Object) null);
                                x340Var2.s0(objT2);
                            }
                            ven0Var = (ven0) objT2;
                            boolean zG4 = x340Var2.g(vnr0Var);
                            iu30 iu30Var6 = iu30Var4;
                            objT3 = x340Var2.T();
                            objT3 = !zG4 ? kaa0.h(0L, x340Var2) : kaa0.h(0L, x340Var2);
                            ven0Var2 = (ven0) objT3;
                            if (bor0VarE != 0) {
                                z6 = false;
                                x340Var2.i0(2100253013);
                                x340Var2.r(false);
                                paint = null;
                            } else {
                                z6 = false;
                                x340Var2.i0(2100253013);
                                x340Var2.r(false);
                                paint = null;
                            }
                            if (str != null) {
                                x340Var2.i0(-1179171249);
                                gw70Var = (gw70) x340Var2.k(oi7.a);
                                x340Var2.r(z6);
                            } else {
                                x340Var2.i0(2100409749);
                                x340Var2.r(z6);
                                gw70Var = null;
                            }
                            zI = x340Var2.i(gw70Var) | x340Var2.g(str);
                            objT4 = x340Var2.T();
                            if (zI) {
                                obj = null;
                                objT4 = new wv40(gw70Var, str, (lnm) null, (byte) 1);
                                x340Var2.s0(objT4);
                            } else {
                                obj = null;
                                objT4 = new wv40(gw70Var, str, (lnm) null, (byte) 1);
                                x340Var2.s0(objT4);
                            }
                            ven0VarP = yto.p(obj, str, (vu30) objT4, x340Var2, 6);
                            zG2 = x340Var2.g(vnr0Var);
                            objT5 = x340Var2.T();
                            if (zG2) {
                                objT5 = x(vnr0Var);
                                x340Var2.s0(objT5);
                            } else {
                                objT5 = x(vnr0Var);
                                x340Var2.s0(objT5);
                            }
                            af5 af5Var2 = (af5) objT5;
                            x340Var2.i0(-1179151556);
                            fC = u7h.c(kor0Var.b().a);
                            u5j1Var = d4o1.a;
                            if (fC > 0.0f) {
                                qim0VarThen = qim0Var5.then(dug.f(qim0Var4, kor0Var.b().a, u5j1Var));
                            } else {
                                qim0VarThen = qim0Var5;
                            }
                            if (bor0VarE != 0) {
                                zI2 = x340Var2.i(ven0Var);
                                objT6 = x340Var2.T();
                                if (zI2) {
                                    objT6 = new q2j0(ven0Var, (byte) 18);
                                    x340Var2.s0(objT6);
                                } else {
                                    objT6 = new q2j0(ven0Var, (byte) 18);
                                    x340Var2.s0(objT6);
                                }
                                Function0 function1 = (Function0) objT6;
                                zI3 = x340Var2.i(ven0Var2);
                                objT7 = x340Var2.T();
                                if (zI3) {
                                    objT7 = new q2j0(ven0Var2, (byte) 19);
                                    x340Var2.s0(objT7);
                                } else {
                                    objT7 = new q2j0(ven0Var2, (byte) 19);
                                    x340Var2.s0(objT7);
                                }
                                qim0VarThen = qim0VarThen.then(exd0.r(i541.C(qim0Var4, vc40.R0), new aw40(bor0VarE, function1, (Function0) objT7, paint, (Bitmap) ven0VarP.getValue(), (byte) 0)));
                            }
                            x340Var2.r(false);
                            if (kor0Var.b().d.a > 0) {
                                eor0 eor0Var2 = kor0Var.b().d;
                                qim0VarThen = qim0VarThen.then(d1u.E(eor0Var2.a, eor0Var2.b, qim0Var4, u5j1Var));
                            }
                            qim0 qim0VarY2 = uyn1.y(qim0VarThen, kor0Var.b().c, kor0Var.b().b);
                            if (a0e1Var5 == null) {
                                graVar = een.h;
                            } else if (a0e1Var5 == null) {
                                graVar = een.d;
                            } else {
                                graVar = een.f;
                            }
                            i7 = i7;
                            w2g0.c(qim0VarY2, graVar, apo.r(-975688238, new vor0(bor0VarE, ven0Var, iu30Var6, vnr0Var, kor0Var, af5Var2, a0e1Var5, i7, z5, ven0Var2), x340Var2), x340Var2, 3072, 4);
                            x340Var = x340Var2;
                            iu30Var3 = iu30Var6;
                            z4 = z5;
                            qim0Var3 = qim0Var5;
                            a0e1Var3 = a0e1Var4;
                        } else {
                            x340Var = x340Var2;
                            x340Var.b0();
                            qim0Var3 = qim0Var2;
                            a0e1Var3 = a0e1Var2;
                            z4 = z2;
                            iu30Var3 = iu30Var2;
                        }
                        i13 = i7;
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new wor0(vnr0Var, qim0Var3, a0e1Var3, i13, z4, iu30Var3, i2, i3);
                        }
                    }
                    i4 |= 196608;
                    iu30Var2 = iu30Var;
                    i12 = i4;
                    if ((74899 & i4) != 74898) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (x340Var2.Y(i12 & 1, z3)) {
                        x340Var2.d0();
                        i14 = i2 & 1;
                        qim0Var4 = nim0.a;
                        if (i14 != 0) {
                            if (i15 != 0) {
                                qim0Var2 = qim0Var4;
                            }
                            if (i5 != 0) {
                                a0e1Var2 = null;
                            }
                            if ((i3 & 8) != 0) {
                                i7 = 2;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if (i10 != 0) {
                                objT = x340Var2.T();
                                if (objT == m4cVar) {
                                    objT = q4r0.R0;
                                    x340Var2.s0(objT);
                                }
                                iu30Var4 = (iu30) objT;
                                qim0Var5 = qim0Var2;
                                a0e1Var4 = a0e1Var2;
                                z5 = z2;
                            } else {
                                qim0Var5 = qim0Var2;
                                z5 = z2;
                                iu30Var4 = iu30Var2;
                                a0e1Var4 = a0e1Var2;
                            }
                        } else {
                            if (i15 != 0) {
                                qim0Var2 = qim0Var4;
                            }
                            if (i5 != 0) {
                                a0e1Var2 = null;
                            }
                            if ((i3 & 8) != 0) {
                                i7 = 2;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if (i10 != 0) {
                                objT = x340Var2.T();
                                if (objT == m4cVar) {
                                    objT = q4r0.R0;
                                    x340Var2.s0(objT);
                                }
                                iu30Var4 = (iu30) objT;
                                qim0Var5 = qim0Var2;
                                a0e1Var4 = a0e1Var2;
                                z5 = z2;
                            } else {
                                qim0Var5 = qim0Var2;
                                z5 = z2;
                                iu30Var4 = iu30Var2;
                                a0e1Var4 = a0e1Var2;
                            }
                        }
                        x340Var2.s();
                        if (a0e1Var4 == null) {
                            a0e1Var5 = vnr0Var.e;
                        } else {
                            a0e1Var5 = a0e1Var4;
                        }
                        kor0Var = vnr0Var.c;
                        bor0VarE = kor0Var.e();
                        if (bor0VarE != null) {
                            str = bor0VarE.b;
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            x340Var2.i0(2099902062);
                            x340Var2.r(false);
                            str = null;
                        } else {
                            x340Var2.i0(2099902063);
                            if (!((Boolean) x340Var2.k(zv40.a)).booleanValue()) {
                                str = null;
                            }
                            x340Var2.r(false);
                        }
                        zG = x340Var2.g(vnr0Var);
                        objT2 = x340Var2.T();
                        if (zG) {
                            objT2 = v8r.q((Object) null);
                            x340Var2.s0(objT2);
                        } else {
                            objT2 = v8r.q((Object) null);
                            x340Var2.s0(objT2);
                        }
                        ven0Var = (ven0) objT2;
                        boolean zG5 = x340Var2.g(vnr0Var);
                        iu30 iu30Var7 = iu30Var4;
                        objT3 = x340Var2.T();
                        if (!zG5) {
                        }
                        ven0Var2 = (ven0) objT3;
                        if (bor0VarE != 0) {
                            z6 = false;
                            x340Var2.i0(2100253013);
                            x340Var2.r(false);
                            paint = null;
                        } else {
                            z6 = false;
                            x340Var2.i0(2100253013);
                            x340Var2.r(false);
                            paint = null;
                        }
                        if (str != null) {
                            x340Var2.i0(-1179171249);
                            gw70Var = (gw70) x340Var2.k(oi7.a);
                            x340Var2.r(z6);
                        } else {
                            x340Var2.i0(2100409749);
                            x340Var2.r(z6);
                            gw70Var = null;
                        }
                        zI = x340Var2.i(gw70Var) | x340Var2.g(str);
                        objT4 = x340Var2.T();
                        if (zI) {
                            obj = null;
                            objT4 = new wv40(gw70Var, str, (lnm) null, (byte) 1);
                            x340Var2.s0(objT4);
                        } else {
                            obj = null;
                            objT4 = new wv40(gw70Var, str, (lnm) null, (byte) 1);
                            x340Var2.s0(objT4);
                        }
                        ven0VarP = yto.p(obj, str, (vu30) objT4, x340Var2, 6);
                        zG2 = x340Var2.g(vnr0Var);
                        objT5 = x340Var2.T();
                        if (zG2) {
                            objT5 = x(vnr0Var);
                            x340Var2.s0(objT5);
                        } else {
                            objT5 = x(vnr0Var);
                            x340Var2.s0(objT5);
                        }
                        af5 af5Var3 = (af5) objT5;
                        x340Var2.i0(-1179151556);
                        fC = u7h.c(kor0Var.b().a);
                        u5j1Var = d4o1.a;
                        if (fC > 0.0f) {
                            qim0VarThen = qim0Var5.then(dug.f(qim0Var4, kor0Var.b().a, u5j1Var));
                        } else {
                            qim0VarThen = qim0Var5;
                        }
                        if (bor0VarE != 0) {
                            zI2 = x340Var2.i(ven0Var);
                            objT6 = x340Var2.T();
                            if (zI2) {
                                objT6 = new q2j0(ven0Var, (byte) 18);
                                x340Var2.s0(objT6);
                            } else {
                                objT6 = new q2j0(ven0Var, (byte) 18);
                                x340Var2.s0(objT6);
                            }
                            Function0 function2 = (Function0) objT6;
                            zI3 = x340Var2.i(ven0Var2);
                            objT7 = x340Var2.T();
                            if (zI3) {
                                objT7 = new q2j0(ven0Var2, (byte) 19);
                                x340Var2.s0(objT7);
                            } else {
                                objT7 = new q2j0(ven0Var2, (byte) 19);
                                x340Var2.s0(objT7);
                            }
                            qim0VarThen = qim0VarThen.then(exd0.r(i541.C(qim0Var4, vc40.R0), new aw40(bor0VarE, function2, (Function0) objT7, paint, (Bitmap) ven0VarP.getValue(), (byte) 0)));
                        }
                        x340Var2.r(false);
                        if (kor0Var.b().d.a > 0) {
                            eor0 eor0Var3 = kor0Var.b().d;
                            qim0VarThen = qim0VarThen.then(d1u.E(eor0Var3.a, eor0Var3.b, qim0Var4, u5j1Var));
                        }
                        qim0 qim0VarY3 = uyn1.y(qim0VarThen, kor0Var.b().c, kor0Var.b().b);
                        if (a0e1Var5 == null) {
                            graVar = een.h;
                        } else if (a0e1Var5 == null) {
                            graVar = een.d;
                        } else {
                            graVar = een.f;
                        }
                        i7 = i7;
                        w2g0.c(qim0VarY3, graVar, apo.r(-975688238, new vor0(bor0VarE, ven0Var, iu30Var7, vnr0Var, kor0Var, af5Var3, a0e1Var5, i7, z5, ven0Var2), x340Var2), x340Var2, 3072, 4);
                        x340Var = x340Var2;
                        iu30Var3 = iu30Var7;
                        z4 = z5;
                        qim0Var3 = qim0Var5;
                        a0e1Var3 = a0e1Var4;
                    } else {
                        x340Var = x340Var2;
                        x340Var.b0();
                        qim0Var3 = qim0Var2;
                        a0e1Var3 = a0e1Var2;
                        z4 = z2;
                        iu30Var3 = iu30Var2;
                    }
                    i13 = i7;
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new wor0(vnr0Var, qim0Var3, a0e1Var3, i13, z4, iu30Var3, i2, i3);
                    }
                }
                i4 |= 24576;
                z2 = z;
                i10 = i3 & 32;
                if (i10 != 0) {
                    if ((196608 & i2) == 0) {
                        iu30Var2 = iu30Var;
                        if (x340Var2.i(iu30Var2)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i4 |= i11;
                    }
                    i12 = i4;
                    if ((74899 & i4) != 74898) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (x340Var2.Y(i12 & 1, z3)) {
                        x340Var2.d0();
                        i14 = i2 & 1;
                        qim0Var4 = nim0.a;
                        if (i14 != 0) {
                            if (i15 != 0) {
                                qim0Var2 = qim0Var4;
                            }
                            if (i5 != 0) {
                                a0e1Var2 = null;
                            }
                            if ((i3 & 8) != 0) {
                                i7 = 2;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if (i10 != 0) {
                                objT = x340Var2.T();
                                if (objT == m4cVar) {
                                    objT = q4r0.R0;
                                    x340Var2.s0(objT);
                                }
                                iu30Var4 = (iu30) objT;
                                qim0Var5 = qim0Var2;
                                a0e1Var4 = a0e1Var2;
                                z5 = z2;
                            } else {
                                qim0Var5 = qim0Var2;
                                z5 = z2;
                                iu30Var4 = iu30Var2;
                                a0e1Var4 = a0e1Var2;
                            }
                        } else {
                            if (i15 != 0) {
                                qim0Var2 = qim0Var4;
                            }
                            if (i5 != 0) {
                                a0e1Var2 = null;
                            }
                            if ((i3 & 8) != 0) {
                                i7 = 2;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if (i10 != 0) {
                                objT = x340Var2.T();
                                if (objT == m4cVar) {
                                    objT = q4r0.R0;
                                    x340Var2.s0(objT);
                                }
                                iu30Var4 = (iu30) objT;
                                qim0Var5 = qim0Var2;
                                a0e1Var4 = a0e1Var2;
                                z5 = z2;
                            } else {
                                qim0Var5 = qim0Var2;
                                z5 = z2;
                                iu30Var4 = iu30Var2;
                                a0e1Var4 = a0e1Var2;
                            }
                        }
                        x340Var2.s();
                        if (a0e1Var4 == null) {
                            a0e1Var5 = vnr0Var.e;
                        } else {
                            a0e1Var5 = a0e1Var4;
                        }
                        kor0Var = vnr0Var.c;
                        bor0VarE = kor0Var.e();
                        if (bor0VarE != null) {
                            str = bor0VarE.b;
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            x340Var2.i0(2099902062);
                            x340Var2.r(false);
                            str = null;
                        } else {
                            x340Var2.i0(2099902063);
                            if (!((Boolean) x340Var2.k(zv40.a)).booleanValue()) {
                                str = null;
                            }
                            x340Var2.r(false);
                        }
                        zG = x340Var2.g(vnr0Var);
                        objT2 = x340Var2.T();
                        if (zG) {
                            objT2 = v8r.q((Object) null);
                            x340Var2.s0(objT2);
                        } else {
                            objT2 = v8r.q((Object) null);
                            x340Var2.s0(objT2);
                        }
                        ven0Var = (ven0) objT2;
                        boolean zG6 = x340Var2.g(vnr0Var);
                        iu30 iu30Var8 = iu30Var4;
                        objT3 = x340Var2.T();
                        if (!zG6) {
                        }
                        ven0Var2 = (ven0) objT3;
                        if (bor0VarE != 0) {
                            z6 = false;
                            x340Var2.i0(2100253013);
                            x340Var2.r(false);
                            paint = null;
                        } else {
                            z6 = false;
                            x340Var2.i0(2100253013);
                            x340Var2.r(false);
                            paint = null;
                        }
                        if (str != null) {
                            x340Var2.i0(-1179171249);
                            gw70Var = (gw70) x340Var2.k(oi7.a);
                            x340Var2.r(z6);
                        } else {
                            x340Var2.i0(2100409749);
                            x340Var2.r(z6);
                            gw70Var = null;
                        }
                        zI = x340Var2.i(gw70Var) | x340Var2.g(str);
                        objT4 = x340Var2.T();
                        if (zI) {
                            obj = null;
                            objT4 = new wv40(gw70Var, str, (lnm) null, (byte) 1);
                            x340Var2.s0(objT4);
                        } else {
                            obj = null;
                            objT4 = new wv40(gw70Var, str, (lnm) null, (byte) 1);
                            x340Var2.s0(objT4);
                        }
                        ven0VarP = yto.p(obj, str, (vu30) objT4, x340Var2, 6);
                        zG2 = x340Var2.g(vnr0Var);
                        objT5 = x340Var2.T();
                        if (zG2) {
                            objT5 = x(vnr0Var);
                            x340Var2.s0(objT5);
                        } else {
                            objT5 = x(vnr0Var);
                            x340Var2.s0(objT5);
                        }
                        af5 af5Var4 = (af5) objT5;
                        x340Var2.i0(-1179151556);
                        fC = u7h.c(kor0Var.b().a);
                        u5j1Var = d4o1.a;
                        if (fC > 0.0f) {
                            qim0VarThen = qim0Var5.then(dug.f(qim0Var4, kor0Var.b().a, u5j1Var));
                        } else {
                            qim0VarThen = qim0Var5;
                        }
                        if (bor0VarE != 0) {
                            zI2 = x340Var2.i(ven0Var);
                            objT6 = x340Var2.T();
                            if (zI2) {
                                objT6 = new q2j0(ven0Var, (byte) 18);
                                x340Var2.s0(objT6);
                            } else {
                                objT6 = new q2j0(ven0Var, (byte) 18);
                                x340Var2.s0(objT6);
                            }
                            Function0 function3 = (Function0) objT6;
                            zI3 = x340Var2.i(ven0Var2);
                            objT7 = x340Var2.T();
                            if (zI3) {
                                objT7 = new q2j0(ven0Var2, (byte) 19);
                                x340Var2.s0(objT7);
                            } else {
                                objT7 = new q2j0(ven0Var2, (byte) 19);
                                x340Var2.s0(objT7);
                            }
                            qim0VarThen = qim0VarThen.then(exd0.r(i541.C(qim0Var4, vc40.R0), new aw40(bor0VarE, function3, (Function0) objT7, paint, (Bitmap) ven0VarP.getValue(), (byte) 0)));
                        }
                        x340Var2.r(false);
                        if (kor0Var.b().d.a > 0) {
                            eor0 eor0Var4 = kor0Var.b().d;
                            qim0VarThen = qim0VarThen.then(d1u.E(eor0Var4.a, eor0Var4.b, qim0Var4, u5j1Var));
                        }
                        qim0 qim0VarY4 = uyn1.y(qim0VarThen, kor0Var.b().c, kor0Var.b().b);
                        if (a0e1Var5 == null) {
                            graVar = een.h;
                        } else if (a0e1Var5 == null) {
                            graVar = een.d;
                        } else {
                            graVar = een.f;
                        }
                        i7 = i7;
                        w2g0.c(qim0VarY4, graVar, apo.r(-975688238, new vor0(bor0VarE, ven0Var, iu30Var8, vnr0Var, kor0Var, af5Var4, a0e1Var5, i7, z5, ven0Var2), x340Var2), x340Var2, 3072, 4);
                        x340Var = x340Var2;
                        iu30Var3 = iu30Var8;
                        z4 = z5;
                        qim0Var3 = qim0Var5;
                        a0e1Var3 = a0e1Var4;
                    } else {
                        x340Var = x340Var2;
                        x340Var.b0();
                        qim0Var3 = qim0Var2;
                        a0e1Var3 = a0e1Var2;
                        z4 = z2;
                        iu30Var3 = iu30Var2;
                    }
                    i13 = i7;
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new wor0(vnr0Var, qim0Var3, a0e1Var3, i13, z4, iu30Var3, i2, i3);
                    }
                }
                i4 |= 196608;
                iu30Var2 = iu30Var;
                i12 = i4;
                if ((74899 & i4) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (x340Var2.Y(i12 & 1, z3)) {
                    x340Var2.d0();
                    i14 = i2 & 1;
                    qim0Var4 = nim0.a;
                    if (i14 != 0) {
                        if (i15 != 0) {
                            qim0Var2 = qim0Var4;
                        }
                        if (i5 != 0) {
                            a0e1Var2 = null;
                        }
                        if ((i3 & 8) != 0) {
                            i7 = 2;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if (i10 != 0) {
                            objT = x340Var2.T();
                            if (objT == m4cVar) {
                                objT = q4r0.R0;
                                x340Var2.s0(objT);
                            }
                            iu30Var4 = (iu30) objT;
                            qim0Var5 = qim0Var2;
                            a0e1Var4 = a0e1Var2;
                            z5 = z2;
                        } else {
                            qim0Var5 = qim0Var2;
                            z5 = z2;
                            iu30Var4 = iu30Var2;
                            a0e1Var4 = a0e1Var2;
                        }
                    } else {
                        if (i15 != 0) {
                            qim0Var2 = qim0Var4;
                        }
                        if (i5 != 0) {
                            a0e1Var2 = null;
                        }
                        if ((i3 & 8) != 0) {
                            i7 = 2;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if (i10 != 0) {
                            objT = x340Var2.T();
                            if (objT == m4cVar) {
                                objT = q4r0.R0;
                                x340Var2.s0(objT);
                            }
                            iu30Var4 = (iu30) objT;
                            qim0Var5 = qim0Var2;
                            a0e1Var4 = a0e1Var2;
                            z5 = z2;
                        } else {
                            qim0Var5 = qim0Var2;
                            z5 = z2;
                            iu30Var4 = iu30Var2;
                            a0e1Var4 = a0e1Var2;
                        }
                    }
                    x340Var2.s();
                    if (a0e1Var4 == null) {
                        a0e1Var5 = vnr0Var.e;
                    } else {
                        a0e1Var5 = a0e1Var4;
                    }
                    kor0Var = vnr0Var.c;
                    bor0VarE = kor0Var.e();
                    if (bor0VarE != null) {
                        str = bor0VarE.b;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        x340Var2.i0(2099902062);
                        x340Var2.r(false);
                        str = null;
                    } else {
                        x340Var2.i0(2099902063);
                        if (!((Boolean) x340Var2.k(zv40.a)).booleanValue()) {
                            str = null;
                        }
                        x340Var2.r(false);
                    }
                    zG = x340Var2.g(vnr0Var);
                    objT2 = x340Var2.T();
                    if (zG) {
                        objT2 = v8r.q((Object) null);
                        x340Var2.s0(objT2);
                    } else {
                        objT2 = v8r.q((Object) null);
                        x340Var2.s0(objT2);
                    }
                    ven0Var = (ven0) objT2;
                    boolean zG7 = x340Var2.g(vnr0Var);
                    iu30 iu30Var9 = iu30Var4;
                    objT3 = x340Var2.T();
                    if (!zG7) {
                    }
                    ven0Var2 = (ven0) objT3;
                    if (bor0VarE != 0) {
                        z6 = false;
                        x340Var2.i0(2100253013);
                        x340Var2.r(false);
                        paint = null;
                    } else {
                        z6 = false;
                        x340Var2.i0(2100253013);
                        x340Var2.r(false);
                        paint = null;
                    }
                    if (str != null) {
                        x340Var2.i0(-1179171249);
                        gw70Var = (gw70) x340Var2.k(oi7.a);
                        x340Var2.r(z6);
                    } else {
                        x340Var2.i0(2100409749);
                        x340Var2.r(z6);
                        gw70Var = null;
                    }
                    zI = x340Var2.i(gw70Var) | x340Var2.g(str);
                    objT4 = x340Var2.T();
                    if (zI) {
                        obj = null;
                        objT4 = new wv40(gw70Var, str, (lnm) null, (byte) 1);
                        x340Var2.s0(objT4);
                    } else {
                        obj = null;
                        objT4 = new wv40(gw70Var, str, (lnm) null, (byte) 1);
                        x340Var2.s0(objT4);
                    }
                    ven0VarP = yto.p(obj, str, (vu30) objT4, x340Var2, 6);
                    zG2 = x340Var2.g(vnr0Var);
                    objT5 = x340Var2.T();
                    if (zG2) {
                        objT5 = x(vnr0Var);
                        x340Var2.s0(objT5);
                    } else {
                        objT5 = x(vnr0Var);
                        x340Var2.s0(objT5);
                    }
                    af5 af5Var5 = (af5) objT5;
                    x340Var2.i0(-1179151556);
                    fC = u7h.c(kor0Var.b().a);
                    u5j1Var = d4o1.a;
                    if (fC > 0.0f) {
                        qim0VarThen = qim0Var5.then(dug.f(qim0Var4, kor0Var.b().a, u5j1Var));
                    } else {
                        qim0VarThen = qim0Var5;
                    }
                    if (bor0VarE != 0) {
                        zI2 = x340Var2.i(ven0Var);
                        objT6 = x340Var2.T();
                        if (zI2) {
                            objT6 = new q2j0(ven0Var, (byte) 18);
                            x340Var2.s0(objT6);
                        } else {
                            objT6 = new q2j0(ven0Var, (byte) 18);
                            x340Var2.s0(objT6);
                        }
                        Function0 function4 = (Function0) objT6;
                        zI3 = x340Var2.i(ven0Var2);
                        objT7 = x340Var2.T();
                        if (zI3) {
                            objT7 = new q2j0(ven0Var2, (byte) 19);
                            x340Var2.s0(objT7);
                        } else {
                            objT7 = new q2j0(ven0Var2, (byte) 19);
                            x340Var2.s0(objT7);
                        }
                        qim0VarThen = qim0VarThen.then(exd0.r(i541.C(qim0Var4, vc40.R0), new aw40(bor0VarE, function4, (Function0) objT7, paint, (Bitmap) ven0VarP.getValue(), (byte) 0)));
                    }
                    x340Var2.r(false);
                    if (kor0Var.b().d.a > 0) {
                        eor0 eor0Var5 = kor0Var.b().d;
                        qim0VarThen = qim0VarThen.then(d1u.E(eor0Var5.a, eor0Var5.b, qim0Var4, u5j1Var));
                    }
                    qim0 qim0VarY5 = uyn1.y(qim0VarThen, kor0Var.b().c, kor0Var.b().b);
                    if (a0e1Var5 == null) {
                        graVar = een.h;
                    } else if (a0e1Var5 == null) {
                        graVar = een.d;
                    } else {
                        graVar = een.f;
                    }
                    i7 = i7;
                    w2g0.c(qim0VarY5, graVar, apo.r(-975688238, new vor0(bor0VarE, ven0Var, iu30Var9, vnr0Var, kor0Var, af5Var5, a0e1Var5, i7, z5, ven0Var2), x340Var2), x340Var2, 3072, 4);
                    x340Var = x340Var2;
                    iu30Var3 = iu30Var9;
                    z4 = z5;
                    qim0Var3 = qim0Var5;
                    a0e1Var3 = a0e1Var4;
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                    qim0Var3 = qim0Var2;
                    a0e1Var3 = a0e1Var2;
                    z4 = z2;
                    iu30Var3 = iu30Var2;
                }
                i13 = i7;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new wor0(vnr0Var, qim0Var3, a0e1Var3, i13, z4, iu30Var3, i2, i3);
                }
            }
            i4 |= 384;
            a0e1Var2 = a0e1Var;
            if ((i2 & 3072) == 0) {
                if ((i3 & 8) == 0) {
                    i7 = i;
                    if (x340Var2.e(i7)) {
                    }
                    i4 |= i16;
                } else {
                    i7 = i;
                }
                i4 |= i16;
            } else {
                i7 = i;
            }
            i8 = i3 & 16;
            if (i8 != 0) {
                if ((i2 & 24576) == 0) {
                    z2 = z;
                    if (x340Var2.h(z2)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i4 |= i9;
                }
                i10 = i3 & 32;
                if (i10 != 0) {
                    if ((196608 & i2) == 0) {
                        iu30Var2 = iu30Var;
                        if (x340Var2.i(iu30Var2)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i4 |= i11;
                    }
                    i12 = i4;
                    if ((74899 & i4) != 74898) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (x340Var2.Y(i12 & 1, z3)) {
                        x340Var2.d0();
                        i14 = i2 & 1;
                        qim0Var4 = nim0.a;
                        if (i14 != 0) {
                            if (i15 != 0) {
                                qim0Var2 = qim0Var4;
                            }
                            if (i5 != 0) {
                                a0e1Var2 = null;
                            }
                            if ((i3 & 8) != 0) {
                                i7 = 2;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if (i10 != 0) {
                                objT = x340Var2.T();
                                if (objT == m4cVar) {
                                    objT = q4r0.R0;
                                    x340Var2.s0(objT);
                                }
                                iu30Var4 = (iu30) objT;
                                qim0Var5 = qim0Var2;
                                a0e1Var4 = a0e1Var2;
                                z5 = z2;
                            } else {
                                qim0Var5 = qim0Var2;
                                z5 = z2;
                                iu30Var4 = iu30Var2;
                                a0e1Var4 = a0e1Var2;
                            }
                        } else {
                            if (i15 != 0) {
                                qim0Var2 = qim0Var4;
                            }
                            if (i5 != 0) {
                                a0e1Var2 = null;
                            }
                            if ((i3 & 8) != 0) {
                                i7 = 2;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if (i10 != 0) {
                                objT = x340Var2.T();
                                if (objT == m4cVar) {
                                    objT = q4r0.R0;
                                    x340Var2.s0(objT);
                                }
                                iu30Var4 = (iu30) objT;
                                qim0Var5 = qim0Var2;
                                a0e1Var4 = a0e1Var2;
                                z5 = z2;
                            } else {
                                qim0Var5 = qim0Var2;
                                z5 = z2;
                                iu30Var4 = iu30Var2;
                                a0e1Var4 = a0e1Var2;
                            }
                        }
                        x340Var2.s();
                        if (a0e1Var4 == null) {
                            a0e1Var5 = vnr0Var.e;
                        } else {
                            a0e1Var5 = a0e1Var4;
                        }
                        kor0Var = vnr0Var.c;
                        bor0VarE = kor0Var.e();
                        if (bor0VarE != null) {
                            str = bor0VarE.b;
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            x340Var2.i0(2099902062);
                            x340Var2.r(false);
                            str = null;
                        } else {
                            x340Var2.i0(2099902063);
                            if (!((Boolean) x340Var2.k(zv40.a)).booleanValue()) {
                                str = null;
                            }
                            x340Var2.r(false);
                        }
                        zG = x340Var2.g(vnr0Var);
                        objT2 = x340Var2.T();
                        if (zG) {
                            objT2 = v8r.q((Object) null);
                            x340Var2.s0(objT2);
                        } else {
                            objT2 = v8r.q((Object) null);
                            x340Var2.s0(objT2);
                        }
                        ven0Var = (ven0) objT2;
                        boolean zG8 = x340Var2.g(vnr0Var);
                        iu30 iu30Var10 = iu30Var4;
                        objT3 = x340Var2.T();
                        if (!zG8) {
                        }
                        ven0Var2 = (ven0) objT3;
                        if (bor0VarE != 0) {
                            z6 = false;
                            x340Var2.i0(2100253013);
                            x340Var2.r(false);
                            paint = null;
                        } else {
                            z6 = false;
                            x340Var2.i0(2100253013);
                            x340Var2.r(false);
                            paint = null;
                        }
                        if (str != null) {
                            x340Var2.i0(-1179171249);
                            gw70Var = (gw70) x340Var2.k(oi7.a);
                            x340Var2.r(z6);
                        } else {
                            x340Var2.i0(2100409749);
                            x340Var2.r(z6);
                            gw70Var = null;
                        }
                        zI = x340Var2.i(gw70Var) | x340Var2.g(str);
                        objT4 = x340Var2.T();
                        if (zI) {
                            obj = null;
                            objT4 = new wv40(gw70Var, str, (lnm) null, (byte) 1);
                            x340Var2.s0(objT4);
                        } else {
                            obj = null;
                            objT4 = new wv40(gw70Var, str, (lnm) null, (byte) 1);
                            x340Var2.s0(objT4);
                        }
                        ven0VarP = yto.p(obj, str, (vu30) objT4, x340Var2, 6);
                        zG2 = x340Var2.g(vnr0Var);
                        objT5 = x340Var2.T();
                        if (zG2) {
                            objT5 = x(vnr0Var);
                            x340Var2.s0(objT5);
                        } else {
                            objT5 = x(vnr0Var);
                            x340Var2.s0(objT5);
                        }
                        af5 af5Var6 = (af5) objT5;
                        x340Var2.i0(-1179151556);
                        fC = u7h.c(kor0Var.b().a);
                        u5j1Var = d4o1.a;
                        if (fC > 0.0f) {
                            qim0VarThen = qim0Var5.then(dug.f(qim0Var4, kor0Var.b().a, u5j1Var));
                        } else {
                            qim0VarThen = qim0Var5;
                        }
                        if (bor0VarE != 0) {
                            zI2 = x340Var2.i(ven0Var);
                            objT6 = x340Var2.T();
                            if (zI2) {
                                objT6 = new q2j0(ven0Var, (byte) 18);
                                x340Var2.s0(objT6);
                            } else {
                                objT6 = new q2j0(ven0Var, (byte) 18);
                                x340Var2.s0(objT6);
                            }
                            Function0 function5 = (Function0) objT6;
                            zI3 = x340Var2.i(ven0Var2);
                            objT7 = x340Var2.T();
                            if (zI3) {
                                objT7 = new q2j0(ven0Var2, (byte) 19);
                                x340Var2.s0(objT7);
                            } else {
                                objT7 = new q2j0(ven0Var2, (byte) 19);
                                x340Var2.s0(objT7);
                            }
                            qim0VarThen = qim0VarThen.then(exd0.r(i541.C(qim0Var4, vc40.R0), new aw40(bor0VarE, function5, (Function0) objT7, paint, (Bitmap) ven0VarP.getValue(), (byte) 0)));
                        }
                        x340Var2.r(false);
                        if (kor0Var.b().d.a > 0) {
                            eor0 eor0Var6 = kor0Var.b().d;
                            qim0VarThen = qim0VarThen.then(d1u.E(eor0Var6.a, eor0Var6.b, qim0Var4, u5j1Var));
                        }
                        qim0 qim0VarY6 = uyn1.y(qim0VarThen, kor0Var.b().c, kor0Var.b().b);
                        if (a0e1Var5 == null) {
                            graVar = een.h;
                        } else if (a0e1Var5 == null) {
                            graVar = een.d;
                        } else {
                            graVar = een.f;
                        }
                        i7 = i7;
                        w2g0.c(qim0VarY6, graVar, apo.r(-975688238, new vor0(bor0VarE, ven0Var, iu30Var10, vnr0Var, kor0Var, af5Var6, a0e1Var5, i7, z5, ven0Var2), x340Var2), x340Var2, 3072, 4);
                        x340Var = x340Var2;
                        iu30Var3 = iu30Var10;
                        z4 = z5;
                        qim0Var3 = qim0Var5;
                        a0e1Var3 = a0e1Var4;
                    } else {
                        x340Var = x340Var2;
                        x340Var.b0();
                        qim0Var3 = qim0Var2;
                        a0e1Var3 = a0e1Var2;
                        z4 = z2;
                        iu30Var3 = iu30Var2;
                    }
                    i13 = i7;
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new wor0(vnr0Var, qim0Var3, a0e1Var3, i13, z4, iu30Var3, i2, i3);
                    }
                }
                i4 |= 196608;
                iu30Var2 = iu30Var;
                i12 = i4;
                if ((74899 & i4) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (x340Var2.Y(i12 & 1, z3)) {
                    x340Var2.d0();
                    i14 = i2 & 1;
                    qim0Var4 = nim0.a;
                    if (i14 != 0) {
                        if (i15 != 0) {
                            qim0Var2 = qim0Var4;
                        }
                        if (i5 != 0) {
                            a0e1Var2 = null;
                        }
                        if ((i3 & 8) != 0) {
                            i7 = 2;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if (i10 != 0) {
                            objT = x340Var2.T();
                            if (objT == m4cVar) {
                                objT = q4r0.R0;
                                x340Var2.s0(objT);
                            }
                            iu30Var4 = (iu30) objT;
                            qim0Var5 = qim0Var2;
                            a0e1Var4 = a0e1Var2;
                            z5 = z2;
                        } else {
                            qim0Var5 = qim0Var2;
                            z5 = z2;
                            iu30Var4 = iu30Var2;
                            a0e1Var4 = a0e1Var2;
                        }
                    } else {
                        if (i15 != 0) {
                            qim0Var2 = qim0Var4;
                        }
                        if (i5 != 0) {
                            a0e1Var2 = null;
                        }
                        if ((i3 & 8) != 0) {
                            i7 = 2;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if (i10 != 0) {
                            objT = x340Var2.T();
                            if (objT == m4cVar) {
                                objT = q4r0.R0;
                                x340Var2.s0(objT);
                            }
                            iu30Var4 = (iu30) objT;
                            qim0Var5 = qim0Var2;
                            a0e1Var4 = a0e1Var2;
                            z5 = z2;
                        } else {
                            qim0Var5 = qim0Var2;
                            z5 = z2;
                            iu30Var4 = iu30Var2;
                            a0e1Var4 = a0e1Var2;
                        }
                    }
                    x340Var2.s();
                    if (a0e1Var4 == null) {
                        a0e1Var5 = vnr0Var.e;
                    } else {
                        a0e1Var5 = a0e1Var4;
                    }
                    kor0Var = vnr0Var.c;
                    bor0VarE = kor0Var.e();
                    if (bor0VarE != null) {
                        str = bor0VarE.b;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        x340Var2.i0(2099902062);
                        x340Var2.r(false);
                        str = null;
                    } else {
                        x340Var2.i0(2099902063);
                        if (!((Boolean) x340Var2.k(zv40.a)).booleanValue()) {
                            str = null;
                        }
                        x340Var2.r(false);
                    }
                    zG = x340Var2.g(vnr0Var);
                    objT2 = x340Var2.T();
                    if (zG) {
                        objT2 = v8r.q((Object) null);
                        x340Var2.s0(objT2);
                    } else {
                        objT2 = v8r.q((Object) null);
                        x340Var2.s0(objT2);
                    }
                    ven0Var = (ven0) objT2;
                    boolean zG9 = x340Var2.g(vnr0Var);
                    iu30 iu30Var11 = iu30Var4;
                    objT3 = x340Var2.T();
                    if (!zG9) {
                    }
                    ven0Var2 = (ven0) objT3;
                    if (bor0VarE != 0) {
                        z6 = false;
                        x340Var2.i0(2100253013);
                        x340Var2.r(false);
                        paint = null;
                    } else {
                        z6 = false;
                        x340Var2.i0(2100253013);
                        x340Var2.r(false);
                        paint = null;
                    }
                    if (str != null) {
                        x340Var2.i0(-1179171249);
                        gw70Var = (gw70) x340Var2.k(oi7.a);
                        x340Var2.r(z6);
                    } else {
                        x340Var2.i0(2100409749);
                        x340Var2.r(z6);
                        gw70Var = null;
                    }
                    zI = x340Var2.i(gw70Var) | x340Var2.g(str);
                    objT4 = x340Var2.T();
                    if (zI) {
                        obj = null;
                        objT4 = new wv40(gw70Var, str, (lnm) null, (byte) 1);
                        x340Var2.s0(objT4);
                    } else {
                        obj = null;
                        objT4 = new wv40(gw70Var, str, (lnm) null, (byte) 1);
                        x340Var2.s0(objT4);
                    }
                    ven0VarP = yto.p(obj, str, (vu30) objT4, x340Var2, 6);
                    zG2 = x340Var2.g(vnr0Var);
                    objT5 = x340Var2.T();
                    if (zG2) {
                        objT5 = x(vnr0Var);
                        x340Var2.s0(objT5);
                    } else {
                        objT5 = x(vnr0Var);
                        x340Var2.s0(objT5);
                    }
                    af5 af5Var7 = (af5) objT5;
                    x340Var2.i0(-1179151556);
                    fC = u7h.c(kor0Var.b().a);
                    u5j1Var = d4o1.a;
                    if (fC > 0.0f) {
                        qim0VarThen = qim0Var5.then(dug.f(qim0Var4, kor0Var.b().a, u5j1Var));
                    } else {
                        qim0VarThen = qim0Var5;
                    }
                    if (bor0VarE != 0) {
                        zI2 = x340Var2.i(ven0Var);
                        objT6 = x340Var2.T();
                        if (zI2) {
                            objT6 = new q2j0(ven0Var, (byte) 18);
                            x340Var2.s0(objT6);
                        } else {
                            objT6 = new q2j0(ven0Var, (byte) 18);
                            x340Var2.s0(objT6);
                        }
                        Function0 function6 = (Function0) objT6;
                        zI3 = x340Var2.i(ven0Var2);
                        objT7 = x340Var2.T();
                        if (zI3) {
                            objT7 = new q2j0(ven0Var2, (byte) 19);
                            x340Var2.s0(objT7);
                        } else {
                            objT7 = new q2j0(ven0Var2, (byte) 19);
                            x340Var2.s0(objT7);
                        }
                        qim0VarThen = qim0VarThen.then(exd0.r(i541.C(qim0Var4, vc40.R0), new aw40(bor0VarE, function6, (Function0) objT7, paint, (Bitmap) ven0VarP.getValue(), (byte) 0)));
                    }
                    x340Var2.r(false);
                    if (kor0Var.b().d.a > 0) {
                        eor0 eor0Var7 = kor0Var.b().d;
                        qim0VarThen = qim0VarThen.then(d1u.E(eor0Var7.a, eor0Var7.b, qim0Var4, u5j1Var));
                    }
                    qim0 qim0VarY7 = uyn1.y(qim0VarThen, kor0Var.b().c, kor0Var.b().b);
                    if (a0e1Var5 == null) {
                        graVar = een.h;
                    } else if (a0e1Var5 == null) {
                        graVar = een.d;
                    } else {
                        graVar = een.f;
                    }
                    i7 = i7;
                    w2g0.c(qim0VarY7, graVar, apo.r(-975688238, new vor0(bor0VarE, ven0Var, iu30Var11, vnr0Var, kor0Var, af5Var7, a0e1Var5, i7, z5, ven0Var2), x340Var2), x340Var2, 3072, 4);
                    x340Var = x340Var2;
                    iu30Var3 = iu30Var11;
                    z4 = z5;
                    qim0Var3 = qim0Var5;
                    a0e1Var3 = a0e1Var4;
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                    qim0Var3 = qim0Var2;
                    a0e1Var3 = a0e1Var2;
                    z4 = z2;
                    iu30Var3 = iu30Var2;
                }
                i13 = i7;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new wor0(vnr0Var, qim0Var3, a0e1Var3, i13, z4, iu30Var3, i2, i3);
                }
            }
            i4 |= 24576;
            z2 = z;
            i10 = i3 & 32;
            if (i10 != 0) {
                if ((196608 & i2) == 0) {
                    iu30Var2 = iu30Var;
                    if (x340Var2.i(iu30Var2)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i4 |= i11;
                }
                i12 = i4;
                if ((74899 & i4) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (x340Var2.Y(i12 & 1, z3)) {
                    x340Var2.d0();
                    i14 = i2 & 1;
                    qim0Var4 = nim0.a;
                    if (i14 != 0) {
                        if (i15 != 0) {
                            qim0Var2 = qim0Var4;
                        }
                        if (i5 != 0) {
                            a0e1Var2 = null;
                        }
                        if ((i3 & 8) != 0) {
                            i7 = 2;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if (i10 != 0) {
                            objT = x340Var2.T();
                            if (objT == m4cVar) {
                                objT = q4r0.R0;
                                x340Var2.s0(objT);
                            }
                            iu30Var4 = (iu30) objT;
                            qim0Var5 = qim0Var2;
                            a0e1Var4 = a0e1Var2;
                            z5 = z2;
                        } else {
                            qim0Var5 = qim0Var2;
                            z5 = z2;
                            iu30Var4 = iu30Var2;
                            a0e1Var4 = a0e1Var2;
                        }
                    } else {
                        if (i15 != 0) {
                            qim0Var2 = qim0Var4;
                        }
                        if (i5 != 0) {
                            a0e1Var2 = null;
                        }
                        if ((i3 & 8) != 0) {
                            i7 = 2;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if (i10 != 0) {
                            objT = x340Var2.T();
                            if (objT == m4cVar) {
                                objT = q4r0.R0;
                                x340Var2.s0(objT);
                            }
                            iu30Var4 = (iu30) objT;
                            qim0Var5 = qim0Var2;
                            a0e1Var4 = a0e1Var2;
                            z5 = z2;
                        } else {
                            qim0Var5 = qim0Var2;
                            z5 = z2;
                            iu30Var4 = iu30Var2;
                            a0e1Var4 = a0e1Var2;
                        }
                    }
                    x340Var2.s();
                    if (a0e1Var4 == null) {
                        a0e1Var5 = vnr0Var.e;
                    } else {
                        a0e1Var5 = a0e1Var4;
                    }
                    kor0Var = vnr0Var.c;
                    bor0VarE = kor0Var.e();
                    if (bor0VarE != null) {
                        str = bor0VarE.b;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        x340Var2.i0(2099902062);
                        x340Var2.r(false);
                        str = null;
                    } else {
                        x340Var2.i0(2099902063);
                        if (!((Boolean) x340Var2.k(zv40.a)).booleanValue()) {
                            str = null;
                        }
                        x340Var2.r(false);
                    }
                    zG = x340Var2.g(vnr0Var);
                    objT2 = x340Var2.T();
                    if (zG) {
                        objT2 = v8r.q((Object) null);
                        x340Var2.s0(objT2);
                    } else {
                        objT2 = v8r.q((Object) null);
                        x340Var2.s0(objT2);
                    }
                    ven0Var = (ven0) objT2;
                    boolean zG10 = x340Var2.g(vnr0Var);
                    iu30 iu30Var12 = iu30Var4;
                    objT3 = x340Var2.T();
                    if (!zG10) {
                    }
                    ven0Var2 = (ven0) objT3;
                    if (bor0VarE != 0) {
                        z6 = false;
                        x340Var2.i0(2100253013);
                        x340Var2.r(false);
                        paint = null;
                    } else {
                        z6 = false;
                        x340Var2.i0(2100253013);
                        x340Var2.r(false);
                        paint = null;
                    }
                    if (str != null) {
                        x340Var2.i0(-1179171249);
                        gw70Var = (gw70) x340Var2.k(oi7.a);
                        x340Var2.r(z6);
                    } else {
                        x340Var2.i0(2100409749);
                        x340Var2.r(z6);
                        gw70Var = null;
                    }
                    zI = x340Var2.i(gw70Var) | x340Var2.g(str);
                    objT4 = x340Var2.T();
                    if (zI) {
                        obj = null;
                        objT4 = new wv40(gw70Var, str, (lnm) null, (byte) 1);
                        x340Var2.s0(objT4);
                    } else {
                        obj = null;
                        objT4 = new wv40(gw70Var, str, (lnm) null, (byte) 1);
                        x340Var2.s0(objT4);
                    }
                    ven0VarP = yto.p(obj, str, (vu30) objT4, x340Var2, 6);
                    zG2 = x340Var2.g(vnr0Var);
                    objT5 = x340Var2.T();
                    if (zG2) {
                        objT5 = x(vnr0Var);
                        x340Var2.s0(objT5);
                    } else {
                        objT5 = x(vnr0Var);
                        x340Var2.s0(objT5);
                    }
                    af5 af5Var8 = (af5) objT5;
                    x340Var2.i0(-1179151556);
                    fC = u7h.c(kor0Var.b().a);
                    u5j1Var = d4o1.a;
                    if (fC > 0.0f) {
                        qim0VarThen = qim0Var5.then(dug.f(qim0Var4, kor0Var.b().a, u5j1Var));
                    } else {
                        qim0VarThen = qim0Var5;
                    }
                    if (bor0VarE != 0) {
                        zI2 = x340Var2.i(ven0Var);
                        objT6 = x340Var2.T();
                        if (zI2) {
                            objT6 = new q2j0(ven0Var, (byte) 18);
                            x340Var2.s0(objT6);
                        } else {
                            objT6 = new q2j0(ven0Var, (byte) 18);
                            x340Var2.s0(objT6);
                        }
                        Function0 function7 = (Function0) objT6;
                        zI3 = x340Var2.i(ven0Var2);
                        objT7 = x340Var2.T();
                        if (zI3) {
                            objT7 = new q2j0(ven0Var2, (byte) 19);
                            x340Var2.s0(objT7);
                        } else {
                            objT7 = new q2j0(ven0Var2, (byte) 19);
                            x340Var2.s0(objT7);
                        }
                        qim0VarThen = qim0VarThen.then(exd0.r(i541.C(qim0Var4, vc40.R0), new aw40(bor0VarE, function7, (Function0) objT7, paint, (Bitmap) ven0VarP.getValue(), (byte) 0)));
                    }
                    x340Var2.r(false);
                    if (kor0Var.b().d.a > 0) {
                        eor0 eor0Var8 = kor0Var.b().d;
                        qim0VarThen = qim0VarThen.then(d1u.E(eor0Var8.a, eor0Var8.b, qim0Var4, u5j1Var));
                    }
                    qim0 qim0VarY8 = uyn1.y(qim0VarThen, kor0Var.b().c, kor0Var.b().b);
                    if (a0e1Var5 == null) {
                        graVar = een.h;
                    } else if (a0e1Var5 == null) {
                        graVar = een.d;
                    } else {
                        graVar = een.f;
                    }
                    i7 = i7;
                    w2g0.c(qim0VarY8, graVar, apo.r(-975688238, new vor0(bor0VarE, ven0Var, iu30Var12, vnr0Var, kor0Var, af5Var8, a0e1Var5, i7, z5, ven0Var2), x340Var2), x340Var2, 3072, 4);
                    x340Var = x340Var2;
                    iu30Var3 = iu30Var12;
                    z4 = z5;
                    qim0Var3 = qim0Var5;
                    a0e1Var3 = a0e1Var4;
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                    qim0Var3 = qim0Var2;
                    a0e1Var3 = a0e1Var2;
                    z4 = z2;
                    iu30Var3 = iu30Var2;
                }
                i13 = i7;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new wor0(vnr0Var, qim0Var3, a0e1Var3, i13, z4, iu30Var3, i2, i3);
                }
            }
            i4 |= 196608;
            iu30Var2 = iu30Var;
            i12 = i4;
            if ((74899 & i4) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var2.Y(i12 & 1, z3)) {
                x340Var2.d0();
                i14 = i2 & 1;
                qim0Var4 = nim0.a;
                if (i14 != 0) {
                    if (i15 != 0) {
                        qim0Var2 = qim0Var4;
                    }
                    if (i5 != 0) {
                        a0e1Var2 = null;
                    }
                    if ((i3 & 8) != 0) {
                        i7 = 2;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    if (i10 != 0) {
                        objT = x340Var2.T();
                        if (objT == m4cVar) {
                            objT = q4r0.R0;
                            x340Var2.s0(objT);
                        }
                        iu30Var4 = (iu30) objT;
                        qim0Var5 = qim0Var2;
                        a0e1Var4 = a0e1Var2;
                        z5 = z2;
                    } else {
                        qim0Var5 = qim0Var2;
                        z5 = z2;
                        iu30Var4 = iu30Var2;
                        a0e1Var4 = a0e1Var2;
                    }
                } else {
                    if (i15 != 0) {
                        qim0Var2 = qim0Var4;
                    }
                    if (i5 != 0) {
                        a0e1Var2 = null;
                    }
                    if ((i3 & 8) != 0) {
                        i7 = 2;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    if (i10 != 0) {
                        objT = x340Var2.T();
                        if (objT == m4cVar) {
                            objT = q4r0.R0;
                            x340Var2.s0(objT);
                        }
                        iu30Var4 = (iu30) objT;
                        qim0Var5 = qim0Var2;
                        a0e1Var4 = a0e1Var2;
                        z5 = z2;
                    } else {
                        qim0Var5 = qim0Var2;
                        z5 = z2;
                        iu30Var4 = iu30Var2;
                        a0e1Var4 = a0e1Var2;
                    }
                }
                x340Var2.s();
                if (a0e1Var4 == null) {
                    a0e1Var5 = vnr0Var.e;
                } else {
                    a0e1Var5 = a0e1Var4;
                }
                kor0Var = vnr0Var.c;
                bor0VarE = kor0Var.e();
                if (bor0VarE != null) {
                    str = bor0VarE.b;
                } else {
                    str = null;
                }
                if (str == null) {
                    x340Var2.i0(2099902062);
                    x340Var2.r(false);
                    str = null;
                } else {
                    x340Var2.i0(2099902063);
                    if (!((Boolean) x340Var2.k(zv40.a)).booleanValue()) {
                        str = null;
                    }
                    x340Var2.r(false);
                }
                zG = x340Var2.g(vnr0Var);
                objT2 = x340Var2.T();
                if (zG) {
                    objT2 = v8r.q((Object) null);
                    x340Var2.s0(objT2);
                } else {
                    objT2 = v8r.q((Object) null);
                    x340Var2.s0(objT2);
                }
                ven0Var = (ven0) objT2;
                boolean zG11 = x340Var2.g(vnr0Var);
                iu30 iu30Var13 = iu30Var4;
                objT3 = x340Var2.T();
                if (!zG11) {
                }
                ven0Var2 = (ven0) objT3;
                if (bor0VarE != 0) {
                    z6 = false;
                    x340Var2.i0(2100253013);
                    x340Var2.r(false);
                    paint = null;
                } else {
                    z6 = false;
                    x340Var2.i0(2100253013);
                    x340Var2.r(false);
                    paint = null;
                }
                if (str != null) {
                    x340Var2.i0(-1179171249);
                    gw70Var = (gw70) x340Var2.k(oi7.a);
                    x340Var2.r(z6);
                } else {
                    x340Var2.i0(2100409749);
                    x340Var2.r(z6);
                    gw70Var = null;
                }
                zI = x340Var2.i(gw70Var) | x340Var2.g(str);
                objT4 = x340Var2.T();
                if (zI) {
                    obj = null;
                    objT4 = new wv40(gw70Var, str, (lnm) null, (byte) 1);
                    x340Var2.s0(objT4);
                } else {
                    obj = null;
                    objT4 = new wv40(gw70Var, str, (lnm) null, (byte) 1);
                    x340Var2.s0(objT4);
                }
                ven0VarP = yto.p(obj, str, (vu30) objT4, x340Var2, 6);
                zG2 = x340Var2.g(vnr0Var);
                objT5 = x340Var2.T();
                if (zG2) {
                    objT5 = x(vnr0Var);
                    x340Var2.s0(objT5);
                } else {
                    objT5 = x(vnr0Var);
                    x340Var2.s0(objT5);
                }
                af5 af5Var9 = (af5) objT5;
                x340Var2.i0(-1179151556);
                fC = u7h.c(kor0Var.b().a);
                u5j1Var = d4o1.a;
                if (fC > 0.0f) {
                    qim0VarThen = qim0Var5.then(dug.f(qim0Var4, kor0Var.b().a, u5j1Var));
                } else {
                    qim0VarThen = qim0Var5;
                }
                if (bor0VarE != 0) {
                    zI2 = x340Var2.i(ven0Var);
                    objT6 = x340Var2.T();
                    if (zI2) {
                        objT6 = new q2j0(ven0Var, (byte) 18);
                        x340Var2.s0(objT6);
                    } else {
                        objT6 = new q2j0(ven0Var, (byte) 18);
                        x340Var2.s0(objT6);
                    }
                    Function0 function8 = (Function0) objT6;
                    zI3 = x340Var2.i(ven0Var2);
                    objT7 = x340Var2.T();
                    if (zI3) {
                        objT7 = new q2j0(ven0Var2, (byte) 19);
                        x340Var2.s0(objT7);
                    } else {
                        objT7 = new q2j0(ven0Var2, (byte) 19);
                        x340Var2.s0(objT7);
                    }
                    qim0VarThen = qim0VarThen.then(exd0.r(i541.C(qim0Var4, vc40.R0), new aw40(bor0VarE, function8, (Function0) objT7, paint, (Bitmap) ven0VarP.getValue(), (byte) 0)));
                }
                x340Var2.r(false);
                if (kor0Var.b().d.a > 0) {
                    eor0 eor0Var9 = kor0Var.b().d;
                    qim0VarThen = qim0VarThen.then(d1u.E(eor0Var9.a, eor0Var9.b, qim0Var4, u5j1Var));
                }
                qim0 qim0VarY9 = uyn1.y(qim0VarThen, kor0Var.b().c, kor0Var.b().b);
                if (a0e1Var5 == null) {
                    graVar = een.h;
                } else if (a0e1Var5 == null) {
                    graVar = een.d;
                } else {
                    graVar = een.f;
                }
                i7 = i7;
                w2g0.c(qim0VarY9, graVar, apo.r(-975688238, new vor0(bor0VarE, ven0Var, iu30Var13, vnr0Var, kor0Var, af5Var9, a0e1Var5, i7, z5, ven0Var2), x340Var2), x340Var2, 3072, 4);
                x340Var = x340Var2;
                iu30Var3 = iu30Var13;
                z4 = z5;
                qim0Var3 = qim0Var5;
                a0e1Var3 = a0e1Var4;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                qim0Var3 = qim0Var2;
                a0e1Var3 = a0e1Var2;
                z4 = z2;
                iu30Var3 = iu30Var2;
            }
            i13 = i7;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new wor0(vnr0Var, qim0Var3, a0e1Var3, i13, z4, iu30Var3, i2, i3);
            }
        }
        i4 |= 48;
        qim0Var2 = qim0Var;
        i5 = i3 & 4;
        if (i5 != 0) {
            if ((i2 & 384) == 0) {
                a0e1Var2 = a0e1Var;
                if (x340Var2.g(a0e1Var2)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i4 |= i6;
            }
            if ((i2 & 3072) == 0) {
                if ((i3 & 8) == 0) {
                    i7 = i;
                    if (x340Var2.e(i7)) {
                    }
                    i4 |= i16;
                } else {
                    i7 = i;
                }
                i4 |= i16;
            } else {
                i7 = i;
            }
            i8 = i3 & 16;
            if (i8 != 0) {
                if ((i2 & 24576) == 0) {
                    z2 = z;
                    if (x340Var2.h(z2)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i4 |= i9;
                }
                i10 = i3 & 32;
                if (i10 != 0) {
                    if ((196608 & i2) == 0) {
                        iu30Var2 = iu30Var;
                        if (x340Var2.i(iu30Var2)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i4 |= i11;
                    }
                    i12 = i4;
                    if ((74899 & i4) != 74898) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (x340Var2.Y(i12 & 1, z3)) {
                        x340Var2.d0();
                        i14 = i2 & 1;
                        qim0Var4 = nim0.a;
                        if (i14 != 0) {
                            if (i15 != 0) {
                                qim0Var2 = qim0Var4;
                            }
                            if (i5 != 0) {
                                a0e1Var2 = null;
                            }
                            if ((i3 & 8) != 0) {
                                i7 = 2;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if (i10 != 0) {
                                objT = x340Var2.T();
                                if (objT == m4cVar) {
                                    objT = q4r0.R0;
                                    x340Var2.s0(objT);
                                }
                                iu30Var4 = (iu30) objT;
                                qim0Var5 = qim0Var2;
                                a0e1Var4 = a0e1Var2;
                                z5 = z2;
                            } else {
                                qim0Var5 = qim0Var2;
                                z5 = z2;
                                iu30Var4 = iu30Var2;
                                a0e1Var4 = a0e1Var2;
                            }
                        } else {
                            if (i15 != 0) {
                                qim0Var2 = qim0Var4;
                            }
                            if (i5 != 0) {
                                a0e1Var2 = null;
                            }
                            if ((i3 & 8) != 0) {
                                i7 = 2;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if (i10 != 0) {
                                objT = x340Var2.T();
                                if (objT == m4cVar) {
                                    objT = q4r0.R0;
                                    x340Var2.s0(objT);
                                }
                                iu30Var4 = (iu30) objT;
                                qim0Var5 = qim0Var2;
                                a0e1Var4 = a0e1Var2;
                                z5 = z2;
                            } else {
                                qim0Var5 = qim0Var2;
                                z5 = z2;
                                iu30Var4 = iu30Var2;
                                a0e1Var4 = a0e1Var2;
                            }
                        }
                        x340Var2.s();
                        if (a0e1Var4 == null) {
                            a0e1Var5 = vnr0Var.e;
                        } else {
                            a0e1Var5 = a0e1Var4;
                        }
                        kor0Var = vnr0Var.c;
                        bor0VarE = kor0Var.e();
                        if (bor0VarE != null) {
                            str = bor0VarE.b;
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            x340Var2.i0(2099902062);
                            x340Var2.r(false);
                            str = null;
                        } else {
                            x340Var2.i0(2099902063);
                            if (!((Boolean) x340Var2.k(zv40.a)).booleanValue()) {
                                str = null;
                            }
                            x340Var2.r(false);
                        }
                        zG = x340Var2.g(vnr0Var);
                        objT2 = x340Var2.T();
                        if (zG) {
                            objT2 = v8r.q((Object) null);
                            x340Var2.s0(objT2);
                        } else {
                            objT2 = v8r.q((Object) null);
                            x340Var2.s0(objT2);
                        }
                        ven0Var = (ven0) objT2;
                        boolean zG12 = x340Var2.g(vnr0Var);
                        iu30 iu30Var14 = iu30Var4;
                        objT3 = x340Var2.T();
                        if (!zG12) {
                        }
                        ven0Var2 = (ven0) objT3;
                        if (bor0VarE != 0) {
                            z6 = false;
                            x340Var2.i0(2100253013);
                            x340Var2.r(false);
                            paint = null;
                        } else {
                            z6 = false;
                            x340Var2.i0(2100253013);
                            x340Var2.r(false);
                            paint = null;
                        }
                        if (str != null) {
                            x340Var2.i0(-1179171249);
                            gw70Var = (gw70) x340Var2.k(oi7.a);
                            x340Var2.r(z6);
                        } else {
                            x340Var2.i0(2100409749);
                            x340Var2.r(z6);
                            gw70Var = null;
                        }
                        zI = x340Var2.i(gw70Var) | x340Var2.g(str);
                        objT4 = x340Var2.T();
                        if (zI) {
                            obj = null;
                            objT4 = new wv40(gw70Var, str, (lnm) null, (byte) 1);
                            x340Var2.s0(objT4);
                        } else {
                            obj = null;
                            objT4 = new wv40(gw70Var, str, (lnm) null, (byte) 1);
                            x340Var2.s0(objT4);
                        }
                        ven0VarP = yto.p(obj, str, (vu30) objT4, x340Var2, 6);
                        zG2 = x340Var2.g(vnr0Var);
                        objT5 = x340Var2.T();
                        if (zG2) {
                            objT5 = x(vnr0Var);
                            x340Var2.s0(objT5);
                        } else {
                            objT5 = x(vnr0Var);
                            x340Var2.s0(objT5);
                        }
                        af5 af5Var10 = (af5) objT5;
                        x340Var2.i0(-1179151556);
                        fC = u7h.c(kor0Var.b().a);
                        u5j1Var = d4o1.a;
                        if (fC > 0.0f) {
                            qim0VarThen = qim0Var5.then(dug.f(qim0Var4, kor0Var.b().a, u5j1Var));
                        } else {
                            qim0VarThen = qim0Var5;
                        }
                        if (bor0VarE != 0) {
                            zI2 = x340Var2.i(ven0Var);
                            objT6 = x340Var2.T();
                            if (zI2) {
                                objT6 = new q2j0(ven0Var, (byte) 18);
                                x340Var2.s0(objT6);
                            } else {
                                objT6 = new q2j0(ven0Var, (byte) 18);
                                x340Var2.s0(objT6);
                            }
                            Function0 function9 = (Function0) objT6;
                            zI3 = x340Var2.i(ven0Var2);
                            objT7 = x340Var2.T();
                            if (zI3) {
                                objT7 = new q2j0(ven0Var2, (byte) 19);
                                x340Var2.s0(objT7);
                            } else {
                                objT7 = new q2j0(ven0Var2, (byte) 19);
                                x340Var2.s0(objT7);
                            }
                            qim0VarThen = qim0VarThen.then(exd0.r(i541.C(qim0Var4, vc40.R0), new aw40(bor0VarE, function9, (Function0) objT7, paint, (Bitmap) ven0VarP.getValue(), (byte) 0)));
                        }
                        x340Var2.r(false);
                        if (kor0Var.b().d.a > 0) {
                            eor0 eor0Var10 = kor0Var.b().d;
                            qim0VarThen = qim0VarThen.then(d1u.E(eor0Var10.a, eor0Var10.b, qim0Var4, u5j1Var));
                        }
                        qim0 qim0VarY10 = uyn1.y(qim0VarThen, kor0Var.b().c, kor0Var.b().b);
                        if (a0e1Var5 == null) {
                            graVar = een.h;
                        } else if (a0e1Var5 == null) {
                            graVar = een.d;
                        } else {
                            graVar = een.f;
                        }
                        i7 = i7;
                        w2g0.c(qim0VarY10, graVar, apo.r(-975688238, new vor0(bor0VarE, ven0Var, iu30Var14, vnr0Var, kor0Var, af5Var10, a0e1Var5, i7, z5, ven0Var2), x340Var2), x340Var2, 3072, 4);
                        x340Var = x340Var2;
                        iu30Var3 = iu30Var14;
                        z4 = z5;
                        qim0Var3 = qim0Var5;
                        a0e1Var3 = a0e1Var4;
                    } else {
                        x340Var = x340Var2;
                        x340Var.b0();
                        qim0Var3 = qim0Var2;
                        a0e1Var3 = a0e1Var2;
                        z4 = z2;
                        iu30Var3 = iu30Var2;
                    }
                    i13 = i7;
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new wor0(vnr0Var, qim0Var3, a0e1Var3, i13, z4, iu30Var3, i2, i3);
                    }
                }
                i4 |= 196608;
                iu30Var2 = iu30Var;
                i12 = i4;
                if ((74899 & i4) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (x340Var2.Y(i12 & 1, z3)) {
                    x340Var2.d0();
                    i14 = i2 & 1;
                    qim0Var4 = nim0.a;
                    if (i14 != 0) {
                        if (i15 != 0) {
                            qim0Var2 = qim0Var4;
                        }
                        if (i5 != 0) {
                            a0e1Var2 = null;
                        }
                        if ((i3 & 8) != 0) {
                            i7 = 2;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if (i10 != 0) {
                            objT = x340Var2.T();
                            if (objT == m4cVar) {
                                objT = q4r0.R0;
                                x340Var2.s0(objT);
                            }
                            iu30Var4 = (iu30) objT;
                            qim0Var5 = qim0Var2;
                            a0e1Var4 = a0e1Var2;
                            z5 = z2;
                        } else {
                            qim0Var5 = qim0Var2;
                            z5 = z2;
                            iu30Var4 = iu30Var2;
                            a0e1Var4 = a0e1Var2;
                        }
                    } else {
                        if (i15 != 0) {
                            qim0Var2 = qim0Var4;
                        }
                        if (i5 != 0) {
                            a0e1Var2 = null;
                        }
                        if ((i3 & 8) != 0) {
                            i7 = 2;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if (i10 != 0) {
                            objT = x340Var2.T();
                            if (objT == m4cVar) {
                                objT = q4r0.R0;
                                x340Var2.s0(objT);
                            }
                            iu30Var4 = (iu30) objT;
                            qim0Var5 = qim0Var2;
                            a0e1Var4 = a0e1Var2;
                            z5 = z2;
                        } else {
                            qim0Var5 = qim0Var2;
                            z5 = z2;
                            iu30Var4 = iu30Var2;
                            a0e1Var4 = a0e1Var2;
                        }
                    }
                    x340Var2.s();
                    if (a0e1Var4 == null) {
                        a0e1Var5 = vnr0Var.e;
                    } else {
                        a0e1Var5 = a0e1Var4;
                    }
                    kor0Var = vnr0Var.c;
                    bor0VarE = kor0Var.e();
                    if (bor0VarE != null) {
                        str = bor0VarE.b;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        x340Var2.i0(2099902062);
                        x340Var2.r(false);
                        str = null;
                    } else {
                        x340Var2.i0(2099902063);
                        if (!((Boolean) x340Var2.k(zv40.a)).booleanValue()) {
                            str = null;
                        }
                        x340Var2.r(false);
                    }
                    zG = x340Var2.g(vnr0Var);
                    objT2 = x340Var2.T();
                    if (zG) {
                        objT2 = v8r.q((Object) null);
                        x340Var2.s0(objT2);
                    } else {
                        objT2 = v8r.q((Object) null);
                        x340Var2.s0(objT2);
                    }
                    ven0Var = (ven0) objT2;
                    boolean zG13 = x340Var2.g(vnr0Var);
                    iu30 iu30Var15 = iu30Var4;
                    objT3 = x340Var2.T();
                    if (!zG13) {
                    }
                    ven0Var2 = (ven0) objT3;
                    if (bor0VarE != 0) {
                        z6 = false;
                        x340Var2.i0(2100253013);
                        x340Var2.r(false);
                        paint = null;
                    } else {
                        z6 = false;
                        x340Var2.i0(2100253013);
                        x340Var2.r(false);
                        paint = null;
                    }
                    if (str != null) {
                        x340Var2.i0(-1179171249);
                        gw70Var = (gw70) x340Var2.k(oi7.a);
                        x340Var2.r(z6);
                    } else {
                        x340Var2.i0(2100409749);
                        x340Var2.r(z6);
                        gw70Var = null;
                    }
                    zI = x340Var2.i(gw70Var) | x340Var2.g(str);
                    objT4 = x340Var2.T();
                    if (zI) {
                        obj = null;
                        objT4 = new wv40(gw70Var, str, (lnm) null, (byte) 1);
                        x340Var2.s0(objT4);
                    } else {
                        obj = null;
                        objT4 = new wv40(gw70Var, str, (lnm) null, (byte) 1);
                        x340Var2.s0(objT4);
                    }
                    ven0VarP = yto.p(obj, str, (vu30) objT4, x340Var2, 6);
                    zG2 = x340Var2.g(vnr0Var);
                    objT5 = x340Var2.T();
                    if (zG2) {
                        objT5 = x(vnr0Var);
                        x340Var2.s0(objT5);
                    } else {
                        objT5 = x(vnr0Var);
                        x340Var2.s0(objT5);
                    }
                    af5 af5Var11 = (af5) objT5;
                    x340Var2.i0(-1179151556);
                    fC = u7h.c(kor0Var.b().a);
                    u5j1Var = d4o1.a;
                    if (fC > 0.0f) {
                        qim0VarThen = qim0Var5.then(dug.f(qim0Var4, kor0Var.b().a, u5j1Var));
                    } else {
                        qim0VarThen = qim0Var5;
                    }
                    if (bor0VarE != 0) {
                        zI2 = x340Var2.i(ven0Var);
                        objT6 = x340Var2.T();
                        if (zI2) {
                            objT6 = new q2j0(ven0Var, (byte) 18);
                            x340Var2.s0(objT6);
                        } else {
                            objT6 = new q2j0(ven0Var, (byte) 18);
                            x340Var2.s0(objT6);
                        }
                        Function0 function10 = (Function0) objT6;
                        zI3 = x340Var2.i(ven0Var2);
                        objT7 = x340Var2.T();
                        if (zI3) {
                            objT7 = new q2j0(ven0Var2, (byte) 19);
                            x340Var2.s0(objT7);
                        } else {
                            objT7 = new q2j0(ven0Var2, (byte) 19);
                            x340Var2.s0(objT7);
                        }
                        qim0VarThen = qim0VarThen.then(exd0.r(i541.C(qim0Var4, vc40.R0), new aw40(bor0VarE, function10, (Function0) objT7, paint, (Bitmap) ven0VarP.getValue(), (byte) 0)));
                    }
                    x340Var2.r(false);
                    if (kor0Var.b().d.a > 0) {
                        eor0 eor0Var11 = kor0Var.b().d;
                        qim0VarThen = qim0VarThen.then(d1u.E(eor0Var11.a, eor0Var11.b, qim0Var4, u5j1Var));
                    }
                    qim0 qim0VarY11 = uyn1.y(qim0VarThen, kor0Var.b().c, kor0Var.b().b);
                    if (a0e1Var5 == null) {
                        graVar = een.h;
                    } else if (a0e1Var5 == null) {
                        graVar = een.d;
                    } else {
                        graVar = een.f;
                    }
                    i7 = i7;
                    w2g0.c(qim0VarY11, graVar, apo.r(-975688238, new vor0(bor0VarE, ven0Var, iu30Var15, vnr0Var, kor0Var, af5Var11, a0e1Var5, i7, z5, ven0Var2), x340Var2), x340Var2, 3072, 4);
                    x340Var = x340Var2;
                    iu30Var3 = iu30Var15;
                    z4 = z5;
                    qim0Var3 = qim0Var5;
                    a0e1Var3 = a0e1Var4;
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                    qim0Var3 = qim0Var2;
                    a0e1Var3 = a0e1Var2;
                    z4 = z2;
                    iu30Var3 = iu30Var2;
                }
                i13 = i7;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new wor0(vnr0Var, qim0Var3, a0e1Var3, i13, z4, iu30Var3, i2, i3);
                }
            }
            i4 |= 24576;
            z2 = z;
            i10 = i3 & 32;
            if (i10 != 0) {
                if ((196608 & i2) == 0) {
                    iu30Var2 = iu30Var;
                    if (x340Var2.i(iu30Var2)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i4 |= i11;
                }
                i12 = i4;
                if ((74899 & i4) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (x340Var2.Y(i12 & 1, z3)) {
                    x340Var2.d0();
                    i14 = i2 & 1;
                    qim0Var4 = nim0.a;
                    if (i14 != 0) {
                        if (i15 != 0) {
                            qim0Var2 = qim0Var4;
                        }
                        if (i5 != 0) {
                            a0e1Var2 = null;
                        }
                        if ((i3 & 8) != 0) {
                            i7 = 2;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if (i10 != 0) {
                            objT = x340Var2.T();
                            if (objT == m4cVar) {
                                objT = q4r0.R0;
                                x340Var2.s0(objT);
                            }
                            iu30Var4 = (iu30) objT;
                            qim0Var5 = qim0Var2;
                            a0e1Var4 = a0e1Var2;
                            z5 = z2;
                        } else {
                            qim0Var5 = qim0Var2;
                            z5 = z2;
                            iu30Var4 = iu30Var2;
                            a0e1Var4 = a0e1Var2;
                        }
                    } else {
                        if (i15 != 0) {
                            qim0Var2 = qim0Var4;
                        }
                        if (i5 != 0) {
                            a0e1Var2 = null;
                        }
                        if ((i3 & 8) != 0) {
                            i7 = 2;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if (i10 != 0) {
                            objT = x340Var2.T();
                            if (objT == m4cVar) {
                                objT = q4r0.R0;
                                x340Var2.s0(objT);
                            }
                            iu30Var4 = (iu30) objT;
                            qim0Var5 = qim0Var2;
                            a0e1Var4 = a0e1Var2;
                            z5 = z2;
                        } else {
                            qim0Var5 = qim0Var2;
                            z5 = z2;
                            iu30Var4 = iu30Var2;
                            a0e1Var4 = a0e1Var2;
                        }
                    }
                    x340Var2.s();
                    if (a0e1Var4 == null) {
                        a0e1Var5 = vnr0Var.e;
                    } else {
                        a0e1Var5 = a0e1Var4;
                    }
                    kor0Var = vnr0Var.c;
                    bor0VarE = kor0Var.e();
                    if (bor0VarE != null) {
                        str = bor0VarE.b;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        x340Var2.i0(2099902062);
                        x340Var2.r(false);
                        str = null;
                    } else {
                        x340Var2.i0(2099902063);
                        if (!((Boolean) x340Var2.k(zv40.a)).booleanValue()) {
                            str = null;
                        }
                        x340Var2.r(false);
                    }
                    zG = x340Var2.g(vnr0Var);
                    objT2 = x340Var2.T();
                    if (zG) {
                        objT2 = v8r.q((Object) null);
                        x340Var2.s0(objT2);
                    } else {
                        objT2 = v8r.q((Object) null);
                        x340Var2.s0(objT2);
                    }
                    ven0Var = (ven0) objT2;
                    boolean zG14 = x340Var2.g(vnr0Var);
                    iu30 iu30Var16 = iu30Var4;
                    objT3 = x340Var2.T();
                    if (!zG14) {
                    }
                    ven0Var2 = (ven0) objT3;
                    if (bor0VarE != 0) {
                        z6 = false;
                        x340Var2.i0(2100253013);
                        x340Var2.r(false);
                        paint = null;
                    } else {
                        z6 = false;
                        x340Var2.i0(2100253013);
                        x340Var2.r(false);
                        paint = null;
                    }
                    if (str != null) {
                        x340Var2.i0(-1179171249);
                        gw70Var = (gw70) x340Var2.k(oi7.a);
                        x340Var2.r(z6);
                    } else {
                        x340Var2.i0(2100409749);
                        x340Var2.r(z6);
                        gw70Var = null;
                    }
                    zI = x340Var2.i(gw70Var) | x340Var2.g(str);
                    objT4 = x340Var2.T();
                    if (zI) {
                        obj = null;
                        objT4 = new wv40(gw70Var, str, (lnm) null, (byte) 1);
                        x340Var2.s0(objT4);
                    } else {
                        obj = null;
                        objT4 = new wv40(gw70Var, str, (lnm) null, (byte) 1);
                        x340Var2.s0(objT4);
                    }
                    ven0VarP = yto.p(obj, str, (vu30) objT4, x340Var2, 6);
                    zG2 = x340Var2.g(vnr0Var);
                    objT5 = x340Var2.T();
                    if (zG2) {
                        objT5 = x(vnr0Var);
                        x340Var2.s0(objT5);
                    } else {
                        objT5 = x(vnr0Var);
                        x340Var2.s0(objT5);
                    }
                    af5 af5Var12 = (af5) objT5;
                    x340Var2.i0(-1179151556);
                    fC = u7h.c(kor0Var.b().a);
                    u5j1Var = d4o1.a;
                    if (fC > 0.0f) {
                        qim0VarThen = qim0Var5.then(dug.f(qim0Var4, kor0Var.b().a, u5j1Var));
                    } else {
                        qim0VarThen = qim0Var5;
                    }
                    if (bor0VarE != 0) {
                        zI2 = x340Var2.i(ven0Var);
                        objT6 = x340Var2.T();
                        if (zI2) {
                            objT6 = new q2j0(ven0Var, (byte) 18);
                            x340Var2.s0(objT6);
                        } else {
                            objT6 = new q2j0(ven0Var, (byte) 18);
                            x340Var2.s0(objT6);
                        }
                        Function0 function11 = (Function0) objT6;
                        zI3 = x340Var2.i(ven0Var2);
                        objT7 = x340Var2.T();
                        if (zI3) {
                            objT7 = new q2j0(ven0Var2, (byte) 19);
                            x340Var2.s0(objT7);
                        } else {
                            objT7 = new q2j0(ven0Var2, (byte) 19);
                            x340Var2.s0(objT7);
                        }
                        qim0VarThen = qim0VarThen.then(exd0.r(i541.C(qim0Var4, vc40.R0), new aw40(bor0VarE, function11, (Function0) objT7, paint, (Bitmap) ven0VarP.getValue(), (byte) 0)));
                    }
                    x340Var2.r(false);
                    if (kor0Var.b().d.a > 0) {
                        eor0 eor0Var12 = kor0Var.b().d;
                        qim0VarThen = qim0VarThen.then(d1u.E(eor0Var12.a, eor0Var12.b, qim0Var4, u5j1Var));
                    }
                    qim0 qim0VarY12 = uyn1.y(qim0VarThen, kor0Var.b().c, kor0Var.b().b);
                    if (a0e1Var5 == null) {
                        graVar = een.h;
                    } else if (a0e1Var5 == null) {
                        graVar = een.d;
                    } else {
                        graVar = een.f;
                    }
                    i7 = i7;
                    w2g0.c(qim0VarY12, graVar, apo.r(-975688238, new vor0(bor0VarE, ven0Var, iu30Var16, vnr0Var, kor0Var, af5Var12, a0e1Var5, i7, z5, ven0Var2), x340Var2), x340Var2, 3072, 4);
                    x340Var = x340Var2;
                    iu30Var3 = iu30Var16;
                    z4 = z5;
                    qim0Var3 = qim0Var5;
                    a0e1Var3 = a0e1Var4;
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                    qim0Var3 = qim0Var2;
                    a0e1Var3 = a0e1Var2;
                    z4 = z2;
                    iu30Var3 = iu30Var2;
                }
                i13 = i7;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new wor0(vnr0Var, qim0Var3, a0e1Var3, i13, z4, iu30Var3, i2, i3);
                }
            }
            i4 |= 196608;
            iu30Var2 = iu30Var;
            i12 = i4;
            if ((74899 & i4) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var2.Y(i12 & 1, z3)) {
                x340Var2.d0();
                i14 = i2 & 1;
                qim0Var4 = nim0.a;
                if (i14 != 0) {
                    if (i15 != 0) {
                        qim0Var2 = qim0Var4;
                    }
                    if (i5 != 0) {
                        a0e1Var2 = null;
                    }
                    if ((i3 & 8) != 0) {
                        i7 = 2;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    if (i10 != 0) {
                        objT = x340Var2.T();
                        if (objT == m4cVar) {
                            objT = q4r0.R0;
                            x340Var2.s0(objT);
                        }
                        iu30Var4 = (iu30) objT;
                        qim0Var5 = qim0Var2;
                        a0e1Var4 = a0e1Var2;
                        z5 = z2;
                    } else {
                        qim0Var5 = qim0Var2;
                        z5 = z2;
                        iu30Var4 = iu30Var2;
                        a0e1Var4 = a0e1Var2;
                    }
                } else {
                    if (i15 != 0) {
                        qim0Var2 = qim0Var4;
                    }
                    if (i5 != 0) {
                        a0e1Var2 = null;
                    }
                    if ((i3 & 8) != 0) {
                        i7 = 2;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    if (i10 != 0) {
                        objT = x340Var2.T();
                        if (objT == m4cVar) {
                            objT = q4r0.R0;
                            x340Var2.s0(objT);
                        }
                        iu30Var4 = (iu30) objT;
                        qim0Var5 = qim0Var2;
                        a0e1Var4 = a0e1Var2;
                        z5 = z2;
                    } else {
                        qim0Var5 = qim0Var2;
                        z5 = z2;
                        iu30Var4 = iu30Var2;
                        a0e1Var4 = a0e1Var2;
                    }
                }
                x340Var2.s();
                if (a0e1Var4 == null) {
                    a0e1Var5 = vnr0Var.e;
                } else {
                    a0e1Var5 = a0e1Var4;
                }
                kor0Var = vnr0Var.c;
                bor0VarE = kor0Var.e();
                if (bor0VarE != null) {
                    str = bor0VarE.b;
                } else {
                    str = null;
                }
                if (str == null) {
                    x340Var2.i0(2099902062);
                    x340Var2.r(false);
                    str = null;
                } else {
                    x340Var2.i0(2099902063);
                    if (!((Boolean) x340Var2.k(zv40.a)).booleanValue()) {
                        str = null;
                    }
                    x340Var2.r(false);
                }
                zG = x340Var2.g(vnr0Var);
                objT2 = x340Var2.T();
                if (zG) {
                    objT2 = v8r.q((Object) null);
                    x340Var2.s0(objT2);
                } else {
                    objT2 = v8r.q((Object) null);
                    x340Var2.s0(objT2);
                }
                ven0Var = (ven0) objT2;
                boolean zG15 = x340Var2.g(vnr0Var);
                iu30 iu30Var17 = iu30Var4;
                objT3 = x340Var2.T();
                if (!zG15) {
                }
                ven0Var2 = (ven0) objT3;
                if (bor0VarE != 0) {
                    z6 = false;
                    x340Var2.i0(2100253013);
                    x340Var2.r(false);
                    paint = null;
                } else {
                    z6 = false;
                    x340Var2.i0(2100253013);
                    x340Var2.r(false);
                    paint = null;
                }
                if (str != null) {
                    x340Var2.i0(-1179171249);
                    gw70Var = (gw70) x340Var2.k(oi7.a);
                    x340Var2.r(z6);
                } else {
                    x340Var2.i0(2100409749);
                    x340Var2.r(z6);
                    gw70Var = null;
                }
                zI = x340Var2.i(gw70Var) | x340Var2.g(str);
                objT4 = x340Var2.T();
                if (zI) {
                    obj = null;
                    objT4 = new wv40(gw70Var, str, (lnm) null, (byte) 1);
                    x340Var2.s0(objT4);
                } else {
                    obj = null;
                    objT4 = new wv40(gw70Var, str, (lnm) null, (byte) 1);
                    x340Var2.s0(objT4);
                }
                ven0VarP = yto.p(obj, str, (vu30) objT4, x340Var2, 6);
                zG2 = x340Var2.g(vnr0Var);
                objT5 = x340Var2.T();
                if (zG2) {
                    objT5 = x(vnr0Var);
                    x340Var2.s0(objT5);
                } else {
                    objT5 = x(vnr0Var);
                    x340Var2.s0(objT5);
                }
                af5 af5Var13 = (af5) objT5;
                x340Var2.i0(-1179151556);
                fC = u7h.c(kor0Var.b().a);
                u5j1Var = d4o1.a;
                if (fC > 0.0f) {
                    qim0VarThen = qim0Var5.then(dug.f(qim0Var4, kor0Var.b().a, u5j1Var));
                } else {
                    qim0VarThen = qim0Var5;
                }
                if (bor0VarE != 0) {
                    zI2 = x340Var2.i(ven0Var);
                    objT6 = x340Var2.T();
                    if (zI2) {
                        objT6 = new q2j0(ven0Var, (byte) 18);
                        x340Var2.s0(objT6);
                    } else {
                        objT6 = new q2j0(ven0Var, (byte) 18);
                        x340Var2.s0(objT6);
                    }
                    Function0 function12 = (Function0) objT6;
                    zI3 = x340Var2.i(ven0Var2);
                    objT7 = x340Var2.T();
                    if (zI3) {
                        objT7 = new q2j0(ven0Var2, (byte) 19);
                        x340Var2.s0(objT7);
                    } else {
                        objT7 = new q2j0(ven0Var2, (byte) 19);
                        x340Var2.s0(objT7);
                    }
                    qim0VarThen = qim0VarThen.then(exd0.r(i541.C(qim0Var4, vc40.R0), new aw40(bor0VarE, function12, (Function0) objT7, paint, (Bitmap) ven0VarP.getValue(), (byte) 0)));
                }
                x340Var2.r(false);
                if (kor0Var.b().d.a > 0) {
                    eor0 eor0Var13 = kor0Var.b().d;
                    qim0VarThen = qim0VarThen.then(d1u.E(eor0Var13.a, eor0Var13.b, qim0Var4, u5j1Var));
                }
                qim0 qim0VarY13 = uyn1.y(qim0VarThen, kor0Var.b().c, kor0Var.b().b);
                if (a0e1Var5 == null) {
                    graVar = een.h;
                } else if (a0e1Var5 == null) {
                    graVar = een.d;
                } else {
                    graVar = een.f;
                }
                i7 = i7;
                w2g0.c(qim0VarY13, graVar, apo.r(-975688238, new vor0(bor0VarE, ven0Var, iu30Var17, vnr0Var, kor0Var, af5Var13, a0e1Var5, i7, z5, ven0Var2), x340Var2), x340Var2, 3072, 4);
                x340Var = x340Var2;
                iu30Var3 = iu30Var17;
                z4 = z5;
                qim0Var3 = qim0Var5;
                a0e1Var3 = a0e1Var4;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                qim0Var3 = qim0Var2;
                a0e1Var3 = a0e1Var2;
                z4 = z2;
                iu30Var3 = iu30Var2;
            }
            i13 = i7;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new wor0(vnr0Var, qim0Var3, a0e1Var3, i13, z4, iu30Var3, i2, i3);
            }
        }
        i4 |= 384;
        a0e1Var2 = a0e1Var;
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                i7 = i;
                if (x340Var2.e(i7)) {
                }
                i4 |= i16;
            } else {
                i7 = i;
            }
            i4 |= i16;
        } else {
            i7 = i;
        }
        i8 = i3 & 16;
        if (i8 != 0) {
            if ((i2 & 24576) == 0) {
                z2 = z;
                if (x340Var2.h(z2)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i4 |= i9;
            }
            i10 = i3 & 32;
            if (i10 != 0) {
                if ((196608 & i2) == 0) {
                    iu30Var2 = iu30Var;
                    if (x340Var2.i(iu30Var2)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i4 |= i11;
                }
                i12 = i4;
                if ((74899 & i4) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (x340Var2.Y(i12 & 1, z3)) {
                    x340Var2.d0();
                    i14 = i2 & 1;
                    qim0Var4 = nim0.a;
                    if (i14 != 0) {
                        if (i15 != 0) {
                            qim0Var2 = qim0Var4;
                        }
                        if (i5 != 0) {
                            a0e1Var2 = null;
                        }
                        if ((i3 & 8) != 0) {
                            i7 = 2;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if (i10 != 0) {
                            objT = x340Var2.T();
                            if (objT == m4cVar) {
                                objT = q4r0.R0;
                                x340Var2.s0(objT);
                            }
                            iu30Var4 = (iu30) objT;
                            qim0Var5 = qim0Var2;
                            a0e1Var4 = a0e1Var2;
                            z5 = z2;
                        } else {
                            qim0Var5 = qim0Var2;
                            z5 = z2;
                            iu30Var4 = iu30Var2;
                            a0e1Var4 = a0e1Var2;
                        }
                    } else {
                        if (i15 != 0) {
                            qim0Var2 = qim0Var4;
                        }
                        if (i5 != 0) {
                            a0e1Var2 = null;
                        }
                        if ((i3 & 8) != 0) {
                            i7 = 2;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if (i10 != 0) {
                            objT = x340Var2.T();
                            if (objT == m4cVar) {
                                objT = q4r0.R0;
                                x340Var2.s0(objT);
                            }
                            iu30Var4 = (iu30) objT;
                            qim0Var5 = qim0Var2;
                            a0e1Var4 = a0e1Var2;
                            z5 = z2;
                        } else {
                            qim0Var5 = qim0Var2;
                            z5 = z2;
                            iu30Var4 = iu30Var2;
                            a0e1Var4 = a0e1Var2;
                        }
                    }
                    x340Var2.s();
                    if (a0e1Var4 == null) {
                        a0e1Var5 = vnr0Var.e;
                    } else {
                        a0e1Var5 = a0e1Var4;
                    }
                    kor0Var = vnr0Var.c;
                    bor0VarE = kor0Var.e();
                    if (bor0VarE != null) {
                        str = bor0VarE.b;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        x340Var2.i0(2099902062);
                        x340Var2.r(false);
                        str = null;
                    } else {
                        x340Var2.i0(2099902063);
                        if (!((Boolean) x340Var2.k(zv40.a)).booleanValue()) {
                            str = null;
                        }
                        x340Var2.r(false);
                    }
                    zG = x340Var2.g(vnr0Var);
                    objT2 = x340Var2.T();
                    if (zG) {
                        objT2 = v8r.q((Object) null);
                        x340Var2.s0(objT2);
                    } else {
                        objT2 = v8r.q((Object) null);
                        x340Var2.s0(objT2);
                    }
                    ven0Var = (ven0) objT2;
                    boolean zG16 = x340Var2.g(vnr0Var);
                    iu30 iu30Var18 = iu30Var4;
                    objT3 = x340Var2.T();
                    if (!zG16) {
                    }
                    ven0Var2 = (ven0) objT3;
                    if (bor0VarE != 0) {
                        z6 = false;
                        x340Var2.i0(2100253013);
                        x340Var2.r(false);
                        paint = null;
                    } else {
                        z6 = false;
                        x340Var2.i0(2100253013);
                        x340Var2.r(false);
                        paint = null;
                    }
                    if (str != null) {
                        x340Var2.i0(-1179171249);
                        gw70Var = (gw70) x340Var2.k(oi7.a);
                        x340Var2.r(z6);
                    } else {
                        x340Var2.i0(2100409749);
                        x340Var2.r(z6);
                        gw70Var = null;
                    }
                    zI = x340Var2.i(gw70Var) | x340Var2.g(str);
                    objT4 = x340Var2.T();
                    if (zI) {
                        obj = null;
                        objT4 = new wv40(gw70Var, str, (lnm) null, (byte) 1);
                        x340Var2.s0(objT4);
                    } else {
                        obj = null;
                        objT4 = new wv40(gw70Var, str, (lnm) null, (byte) 1);
                        x340Var2.s0(objT4);
                    }
                    ven0VarP = yto.p(obj, str, (vu30) objT4, x340Var2, 6);
                    zG2 = x340Var2.g(vnr0Var);
                    objT5 = x340Var2.T();
                    if (zG2) {
                        objT5 = x(vnr0Var);
                        x340Var2.s0(objT5);
                    } else {
                        objT5 = x(vnr0Var);
                        x340Var2.s0(objT5);
                    }
                    af5 af5Var14 = (af5) objT5;
                    x340Var2.i0(-1179151556);
                    fC = u7h.c(kor0Var.b().a);
                    u5j1Var = d4o1.a;
                    if (fC > 0.0f) {
                        qim0VarThen = qim0Var5.then(dug.f(qim0Var4, kor0Var.b().a, u5j1Var));
                    } else {
                        qim0VarThen = qim0Var5;
                    }
                    if (bor0VarE != 0) {
                        zI2 = x340Var2.i(ven0Var);
                        objT6 = x340Var2.T();
                        if (zI2) {
                            objT6 = new q2j0(ven0Var, (byte) 18);
                            x340Var2.s0(objT6);
                        } else {
                            objT6 = new q2j0(ven0Var, (byte) 18);
                            x340Var2.s0(objT6);
                        }
                        Function0 function13 = (Function0) objT6;
                        zI3 = x340Var2.i(ven0Var2);
                        objT7 = x340Var2.T();
                        if (zI3) {
                            objT7 = new q2j0(ven0Var2, (byte) 19);
                            x340Var2.s0(objT7);
                        } else {
                            objT7 = new q2j0(ven0Var2, (byte) 19);
                            x340Var2.s0(objT7);
                        }
                        qim0VarThen = qim0VarThen.then(exd0.r(i541.C(qim0Var4, vc40.R0), new aw40(bor0VarE, function13, (Function0) objT7, paint, (Bitmap) ven0VarP.getValue(), (byte) 0)));
                    }
                    x340Var2.r(false);
                    if (kor0Var.b().d.a > 0) {
                        eor0 eor0Var14 = kor0Var.b().d;
                        qim0VarThen = qim0VarThen.then(d1u.E(eor0Var14.a, eor0Var14.b, qim0Var4, u5j1Var));
                    }
                    qim0 qim0VarY14 = uyn1.y(qim0VarThen, kor0Var.b().c, kor0Var.b().b);
                    if (a0e1Var5 == null) {
                        graVar = een.h;
                    } else if (a0e1Var5 == null) {
                        graVar = een.d;
                    } else {
                        graVar = een.f;
                    }
                    i7 = i7;
                    w2g0.c(qim0VarY14, graVar, apo.r(-975688238, new vor0(bor0VarE, ven0Var, iu30Var18, vnr0Var, kor0Var, af5Var14, a0e1Var5, i7, z5, ven0Var2), x340Var2), x340Var2, 3072, 4);
                    x340Var = x340Var2;
                    iu30Var3 = iu30Var18;
                    z4 = z5;
                    qim0Var3 = qim0Var5;
                    a0e1Var3 = a0e1Var4;
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                    qim0Var3 = qim0Var2;
                    a0e1Var3 = a0e1Var2;
                    z4 = z2;
                    iu30Var3 = iu30Var2;
                }
                i13 = i7;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new wor0(vnr0Var, qim0Var3, a0e1Var3, i13, z4, iu30Var3, i2, i3);
                }
            }
            i4 |= 196608;
            iu30Var2 = iu30Var;
            i12 = i4;
            if ((74899 & i4) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var2.Y(i12 & 1, z3)) {
                x340Var2.d0();
                i14 = i2 & 1;
                qim0Var4 = nim0.a;
                if (i14 != 0) {
                    if (i15 != 0) {
                        qim0Var2 = qim0Var4;
                    }
                    if (i5 != 0) {
                        a0e1Var2 = null;
                    }
                    if ((i3 & 8) != 0) {
                        i7 = 2;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    if (i10 != 0) {
                        objT = x340Var2.T();
                        if (objT == m4cVar) {
                            objT = q4r0.R0;
                            x340Var2.s0(objT);
                        }
                        iu30Var4 = (iu30) objT;
                        qim0Var5 = qim0Var2;
                        a0e1Var4 = a0e1Var2;
                        z5 = z2;
                    } else {
                        qim0Var5 = qim0Var2;
                        z5 = z2;
                        iu30Var4 = iu30Var2;
                        a0e1Var4 = a0e1Var2;
                    }
                } else {
                    if (i15 != 0) {
                        qim0Var2 = qim0Var4;
                    }
                    if (i5 != 0) {
                        a0e1Var2 = null;
                    }
                    if ((i3 & 8) != 0) {
                        i7 = 2;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    if (i10 != 0) {
                        objT = x340Var2.T();
                        if (objT == m4cVar) {
                            objT = q4r0.R0;
                            x340Var2.s0(objT);
                        }
                        iu30Var4 = (iu30) objT;
                        qim0Var5 = qim0Var2;
                        a0e1Var4 = a0e1Var2;
                        z5 = z2;
                    } else {
                        qim0Var5 = qim0Var2;
                        z5 = z2;
                        iu30Var4 = iu30Var2;
                        a0e1Var4 = a0e1Var2;
                    }
                }
                x340Var2.s();
                if (a0e1Var4 == null) {
                    a0e1Var5 = vnr0Var.e;
                } else {
                    a0e1Var5 = a0e1Var4;
                }
                kor0Var = vnr0Var.c;
                bor0VarE = kor0Var.e();
                if (bor0VarE != null) {
                    str = bor0VarE.b;
                } else {
                    str = null;
                }
                if (str == null) {
                    x340Var2.i0(2099902062);
                    x340Var2.r(false);
                    str = null;
                } else {
                    x340Var2.i0(2099902063);
                    if (!((Boolean) x340Var2.k(zv40.a)).booleanValue()) {
                        str = null;
                    }
                    x340Var2.r(false);
                }
                zG = x340Var2.g(vnr0Var);
                objT2 = x340Var2.T();
                if (zG) {
                    objT2 = v8r.q((Object) null);
                    x340Var2.s0(objT2);
                } else {
                    objT2 = v8r.q((Object) null);
                    x340Var2.s0(objT2);
                }
                ven0Var = (ven0) objT2;
                boolean zG17 = x340Var2.g(vnr0Var);
                iu30 iu30Var19 = iu30Var4;
                objT3 = x340Var2.T();
                if (!zG17) {
                }
                ven0Var2 = (ven0) objT3;
                if (bor0VarE != 0) {
                    z6 = false;
                    x340Var2.i0(2100253013);
                    x340Var2.r(false);
                    paint = null;
                } else {
                    z6 = false;
                    x340Var2.i0(2100253013);
                    x340Var2.r(false);
                    paint = null;
                }
                if (str != null) {
                    x340Var2.i0(-1179171249);
                    gw70Var = (gw70) x340Var2.k(oi7.a);
                    x340Var2.r(z6);
                } else {
                    x340Var2.i0(2100409749);
                    x340Var2.r(z6);
                    gw70Var = null;
                }
                zI = x340Var2.i(gw70Var) | x340Var2.g(str);
                objT4 = x340Var2.T();
                if (zI) {
                    obj = null;
                    objT4 = new wv40(gw70Var, str, (lnm) null, (byte) 1);
                    x340Var2.s0(objT4);
                } else {
                    obj = null;
                    objT4 = new wv40(gw70Var, str, (lnm) null, (byte) 1);
                    x340Var2.s0(objT4);
                }
                ven0VarP = yto.p(obj, str, (vu30) objT4, x340Var2, 6);
                zG2 = x340Var2.g(vnr0Var);
                objT5 = x340Var2.T();
                if (zG2) {
                    objT5 = x(vnr0Var);
                    x340Var2.s0(objT5);
                } else {
                    objT5 = x(vnr0Var);
                    x340Var2.s0(objT5);
                }
                af5 af5Var15 = (af5) objT5;
                x340Var2.i0(-1179151556);
                fC = u7h.c(kor0Var.b().a);
                u5j1Var = d4o1.a;
                if (fC > 0.0f) {
                    qim0VarThen = qim0Var5.then(dug.f(qim0Var4, kor0Var.b().a, u5j1Var));
                } else {
                    qim0VarThen = qim0Var5;
                }
                if (bor0VarE != 0) {
                    zI2 = x340Var2.i(ven0Var);
                    objT6 = x340Var2.T();
                    if (zI2) {
                        objT6 = new q2j0(ven0Var, (byte) 18);
                        x340Var2.s0(objT6);
                    } else {
                        objT6 = new q2j0(ven0Var, (byte) 18);
                        x340Var2.s0(objT6);
                    }
                    Function0 function14 = (Function0) objT6;
                    zI3 = x340Var2.i(ven0Var2);
                    objT7 = x340Var2.T();
                    if (zI3) {
                        objT7 = new q2j0(ven0Var2, (byte) 19);
                        x340Var2.s0(objT7);
                    } else {
                        objT7 = new q2j0(ven0Var2, (byte) 19);
                        x340Var2.s0(objT7);
                    }
                    qim0VarThen = qim0VarThen.then(exd0.r(i541.C(qim0Var4, vc40.R0), new aw40(bor0VarE, function14, (Function0) objT7, paint, (Bitmap) ven0VarP.getValue(), (byte) 0)));
                }
                x340Var2.r(false);
                if (kor0Var.b().d.a > 0) {
                    eor0 eor0Var15 = kor0Var.b().d;
                    qim0VarThen = qim0VarThen.then(d1u.E(eor0Var15.a, eor0Var15.b, qim0Var4, u5j1Var));
                }
                qim0 qim0VarY15 = uyn1.y(qim0VarThen, kor0Var.b().c, kor0Var.b().b);
                if (a0e1Var5 == null) {
                    graVar = een.h;
                } else if (a0e1Var5 == null) {
                    graVar = een.d;
                } else {
                    graVar = een.f;
                }
                i7 = i7;
                w2g0.c(qim0VarY15, graVar, apo.r(-975688238, new vor0(bor0VarE, ven0Var, iu30Var19, vnr0Var, kor0Var, af5Var15, a0e1Var5, i7, z5, ven0Var2), x340Var2), x340Var2, 3072, 4);
                x340Var = x340Var2;
                iu30Var3 = iu30Var19;
                z4 = z5;
                qim0Var3 = qim0Var5;
                a0e1Var3 = a0e1Var4;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                qim0Var3 = qim0Var2;
                a0e1Var3 = a0e1Var2;
                z4 = z2;
                iu30Var3 = iu30Var2;
            }
            i13 = i7;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new wor0(vnr0Var, qim0Var3, a0e1Var3, i13, z4, iu30Var3, i2, i3);
            }
        }
        i4 |= 24576;
        z2 = z;
        i10 = i3 & 32;
        if (i10 != 0) {
            if ((196608 & i2) == 0) {
                iu30Var2 = iu30Var;
                if (x340Var2.i(iu30Var2)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i4 |= i11;
            }
            i12 = i4;
            if ((74899 & i4) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var2.Y(i12 & 1, z3)) {
                x340Var2.d0();
                i14 = i2 & 1;
                qim0Var4 = nim0.a;
                if (i14 != 0) {
                    if (i15 != 0) {
                        qim0Var2 = qim0Var4;
                    }
                    if (i5 != 0) {
                        a0e1Var2 = null;
                    }
                    if ((i3 & 8) != 0) {
                        i7 = 2;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    if (i10 != 0) {
                        objT = x340Var2.T();
                        if (objT == m4cVar) {
                            objT = q4r0.R0;
                            x340Var2.s0(objT);
                        }
                        iu30Var4 = (iu30) objT;
                        qim0Var5 = qim0Var2;
                        a0e1Var4 = a0e1Var2;
                        z5 = z2;
                    } else {
                        qim0Var5 = qim0Var2;
                        z5 = z2;
                        iu30Var4 = iu30Var2;
                        a0e1Var4 = a0e1Var2;
                    }
                } else {
                    if (i15 != 0) {
                        qim0Var2 = qim0Var4;
                    }
                    if (i5 != 0) {
                        a0e1Var2 = null;
                    }
                    if ((i3 & 8) != 0) {
                        i7 = 2;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    if (i10 != 0) {
                        objT = x340Var2.T();
                        if (objT == m4cVar) {
                            objT = q4r0.R0;
                            x340Var2.s0(objT);
                        }
                        iu30Var4 = (iu30) objT;
                        qim0Var5 = qim0Var2;
                        a0e1Var4 = a0e1Var2;
                        z5 = z2;
                    } else {
                        qim0Var5 = qim0Var2;
                        z5 = z2;
                        iu30Var4 = iu30Var2;
                        a0e1Var4 = a0e1Var2;
                    }
                }
                x340Var2.s();
                if (a0e1Var4 == null) {
                    a0e1Var5 = vnr0Var.e;
                } else {
                    a0e1Var5 = a0e1Var4;
                }
                kor0Var = vnr0Var.c;
                bor0VarE = kor0Var.e();
                if (bor0VarE != null) {
                    str = bor0VarE.b;
                } else {
                    str = null;
                }
                if (str == null) {
                    x340Var2.i0(2099902062);
                    x340Var2.r(false);
                    str = null;
                } else {
                    x340Var2.i0(2099902063);
                    if (!((Boolean) x340Var2.k(zv40.a)).booleanValue()) {
                        str = null;
                    }
                    x340Var2.r(false);
                }
                zG = x340Var2.g(vnr0Var);
                objT2 = x340Var2.T();
                if (zG) {
                    objT2 = v8r.q((Object) null);
                    x340Var2.s0(objT2);
                } else {
                    objT2 = v8r.q((Object) null);
                    x340Var2.s0(objT2);
                }
                ven0Var = (ven0) objT2;
                boolean zG18 = x340Var2.g(vnr0Var);
                iu30 iu30Var110 = iu30Var4;
                objT3 = x340Var2.T();
                if (!zG18) {
                }
                ven0Var2 = (ven0) objT3;
                if (bor0VarE != 0) {
                    z6 = false;
                    x340Var2.i0(2100253013);
                    x340Var2.r(false);
                    paint = null;
                } else {
                    z6 = false;
                    x340Var2.i0(2100253013);
                    x340Var2.r(false);
                    paint = null;
                }
                if (str != null) {
                    x340Var2.i0(-1179171249);
                    gw70Var = (gw70) x340Var2.k(oi7.a);
                    x340Var2.r(z6);
                } else {
                    x340Var2.i0(2100409749);
                    x340Var2.r(z6);
                    gw70Var = null;
                }
                zI = x340Var2.i(gw70Var) | x340Var2.g(str);
                objT4 = x340Var2.T();
                if (zI) {
                    obj = null;
                    objT4 = new wv40(gw70Var, str, (lnm) null, (byte) 1);
                    x340Var2.s0(objT4);
                } else {
                    obj = null;
                    objT4 = new wv40(gw70Var, str, (lnm) null, (byte) 1);
                    x340Var2.s0(objT4);
                }
                ven0VarP = yto.p(obj, str, (vu30) objT4, x340Var2, 6);
                zG2 = x340Var2.g(vnr0Var);
                objT5 = x340Var2.T();
                if (zG2) {
                    objT5 = x(vnr0Var);
                    x340Var2.s0(objT5);
                } else {
                    objT5 = x(vnr0Var);
                    x340Var2.s0(objT5);
                }
                af5 af5Var16 = (af5) objT5;
                x340Var2.i0(-1179151556);
                fC = u7h.c(kor0Var.b().a);
                u5j1Var = d4o1.a;
                if (fC > 0.0f) {
                    qim0VarThen = qim0Var5.then(dug.f(qim0Var4, kor0Var.b().a, u5j1Var));
                } else {
                    qim0VarThen = qim0Var5;
                }
                if (bor0VarE != 0) {
                    zI2 = x340Var2.i(ven0Var);
                    objT6 = x340Var2.T();
                    if (zI2) {
                        objT6 = new q2j0(ven0Var, (byte) 18);
                        x340Var2.s0(objT6);
                    } else {
                        objT6 = new q2j0(ven0Var, (byte) 18);
                        x340Var2.s0(objT6);
                    }
                    Function0 function15 = (Function0) objT6;
                    zI3 = x340Var2.i(ven0Var2);
                    objT7 = x340Var2.T();
                    if (zI3) {
                        objT7 = new q2j0(ven0Var2, (byte) 19);
                        x340Var2.s0(objT7);
                    } else {
                        objT7 = new q2j0(ven0Var2, (byte) 19);
                        x340Var2.s0(objT7);
                    }
                    qim0VarThen = qim0VarThen.then(exd0.r(i541.C(qim0Var4, vc40.R0), new aw40(bor0VarE, function15, (Function0) objT7, paint, (Bitmap) ven0VarP.getValue(), (byte) 0)));
                }
                x340Var2.r(false);
                if (kor0Var.b().d.a > 0) {
                    eor0 eor0Var16 = kor0Var.b().d;
                    qim0VarThen = qim0VarThen.then(d1u.E(eor0Var16.a, eor0Var16.b, qim0Var4, u5j1Var));
                }
                qim0 qim0VarY16 = uyn1.y(qim0VarThen, kor0Var.b().c, kor0Var.b().b);
                if (a0e1Var5 == null) {
                    graVar = een.h;
                } else if (a0e1Var5 == null) {
                    graVar = een.d;
                } else {
                    graVar = een.f;
                }
                i7 = i7;
                w2g0.c(qim0VarY16, graVar, apo.r(-975688238, new vor0(bor0VarE, ven0Var, iu30Var110, vnr0Var, kor0Var, af5Var16, a0e1Var5, i7, z5, ven0Var2), x340Var2), x340Var2, 3072, 4);
                x340Var = x340Var2;
                iu30Var3 = iu30Var110;
                z4 = z5;
                qim0Var3 = qim0Var5;
                a0e1Var3 = a0e1Var4;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                qim0Var3 = qim0Var2;
                a0e1Var3 = a0e1Var2;
                z4 = z2;
                iu30Var3 = iu30Var2;
            }
            i13 = i7;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new wor0(vnr0Var, qim0Var3, a0e1Var3, i13, z4, iu30Var3, i2, i3);
            }
        }
        i4 |= 196608;
        iu30Var2 = iu30Var;
        i12 = i4;
        if ((74899 & i4) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (x340Var2.Y(i12 & 1, z3)) {
            x340Var2.d0();
            i14 = i2 & 1;
            qim0Var4 = nim0.a;
            if (i14 != 0) {
                if (i15 != 0) {
                    qim0Var2 = qim0Var4;
                }
                if (i5 != 0) {
                    a0e1Var2 = null;
                }
                if ((i3 & 8) != 0) {
                    i7 = 2;
                }
                if (i8 != 0) {
                    z2 = true;
                }
                if (i10 != 0) {
                    objT = x340Var2.T();
                    if (objT == m4cVar) {
                        objT = q4r0.R0;
                        x340Var2.s0(objT);
                    }
                    iu30Var4 = (iu30) objT;
                    qim0Var5 = qim0Var2;
                    a0e1Var4 = a0e1Var2;
                    z5 = z2;
                } else {
                    qim0Var5 = qim0Var2;
                    z5 = z2;
                    iu30Var4 = iu30Var2;
                    a0e1Var4 = a0e1Var2;
                }
            } else {
                if (i15 != 0) {
                    qim0Var2 = qim0Var4;
                }
                if (i5 != 0) {
                    a0e1Var2 = null;
                }
                if ((i3 & 8) != 0) {
                    i7 = 2;
                }
                if (i8 != 0) {
                    z2 = true;
                }
                if (i10 != 0) {
                    objT = x340Var2.T();
                    if (objT == m4cVar) {
                        objT = q4r0.R0;
                        x340Var2.s0(objT);
                    }
                    iu30Var4 = (iu30) objT;
                    qim0Var5 = qim0Var2;
                    a0e1Var4 = a0e1Var2;
                    z5 = z2;
                } else {
                    qim0Var5 = qim0Var2;
                    z5 = z2;
                    iu30Var4 = iu30Var2;
                    a0e1Var4 = a0e1Var2;
                }
            }
            x340Var2.s();
            if (a0e1Var4 == null) {
                a0e1Var5 = vnr0Var.e;
            } else {
                a0e1Var5 = a0e1Var4;
            }
            kor0Var = vnr0Var.c;
            bor0VarE = kor0Var.e();
            if (bor0VarE != null) {
                str = bor0VarE.b;
            } else {
                str = null;
            }
            if (str == null) {
                x340Var2.i0(2099902062);
                x340Var2.r(false);
                str = null;
            } else {
                x340Var2.i0(2099902063);
                if (!((Boolean) x340Var2.k(zv40.a)).booleanValue()) {
                    str = null;
                }
                x340Var2.r(false);
            }
            zG = x340Var2.g(vnr0Var);
            objT2 = x340Var2.T();
            if (zG) {
                objT2 = v8r.q((Object) null);
                x340Var2.s0(objT2);
            } else {
                objT2 = v8r.q((Object) null);
                x340Var2.s0(objT2);
            }
            ven0Var = (ven0) objT2;
            boolean zG19 = x340Var2.g(vnr0Var);
            iu30 iu30Var111 = iu30Var4;
            objT3 = x340Var2.T();
            if (!zG19) {
            }
            ven0Var2 = (ven0) objT3;
            if (bor0VarE != 0) {
                z6 = false;
                x340Var2.i0(2100253013);
                x340Var2.r(false);
                paint = null;
            } else {
                z6 = false;
                x340Var2.i0(2100253013);
                x340Var2.r(false);
                paint = null;
            }
            if (str != null) {
                x340Var2.i0(-1179171249);
                gw70Var = (gw70) x340Var2.k(oi7.a);
                x340Var2.r(z6);
            } else {
                x340Var2.i0(2100409749);
                x340Var2.r(z6);
                gw70Var = null;
            }
            zI = x340Var2.i(gw70Var) | x340Var2.g(str);
            objT4 = x340Var2.T();
            if (zI) {
                obj = null;
                objT4 = new wv40(gw70Var, str, (lnm) null, (byte) 1);
                x340Var2.s0(objT4);
            } else {
                obj = null;
                objT4 = new wv40(gw70Var, str, (lnm) null, (byte) 1);
                x340Var2.s0(objT4);
            }
            ven0VarP = yto.p(obj, str, (vu30) objT4, x340Var2, 6);
            zG2 = x340Var2.g(vnr0Var);
            objT5 = x340Var2.T();
            if (zG2) {
                objT5 = x(vnr0Var);
                x340Var2.s0(objT5);
            } else {
                objT5 = x(vnr0Var);
                x340Var2.s0(objT5);
            }
            af5 af5Var17 = (af5) objT5;
            x340Var2.i0(-1179151556);
            fC = u7h.c(kor0Var.b().a);
            u5j1Var = d4o1.a;
            if (fC > 0.0f) {
                qim0VarThen = qim0Var5.then(dug.f(qim0Var4, kor0Var.b().a, u5j1Var));
            } else {
                qim0VarThen = qim0Var5;
            }
            if (bor0VarE != 0) {
                zI2 = x340Var2.i(ven0Var);
                objT6 = x340Var2.T();
                if (zI2) {
                    objT6 = new q2j0(ven0Var, (byte) 18);
                    x340Var2.s0(objT6);
                } else {
                    objT6 = new q2j0(ven0Var, (byte) 18);
                    x340Var2.s0(objT6);
                }
                Function0 function16 = (Function0) objT6;
                zI3 = x340Var2.i(ven0Var2);
                objT7 = x340Var2.T();
                if (zI3) {
                    objT7 = new q2j0(ven0Var2, (byte) 19);
                    x340Var2.s0(objT7);
                } else {
                    objT7 = new q2j0(ven0Var2, (byte) 19);
                    x340Var2.s0(objT7);
                }
                qim0VarThen = qim0VarThen.then(exd0.r(i541.C(qim0Var4, vc40.R0), new aw40(bor0VarE, function16, (Function0) objT7, paint, (Bitmap) ven0VarP.getValue(), (byte) 0)));
            }
            x340Var2.r(false);
            if (kor0Var.b().d.a > 0) {
                eor0 eor0Var17 = kor0Var.b().d;
                qim0VarThen = qim0VarThen.then(d1u.E(eor0Var17.a, eor0Var17.b, qim0Var4, u5j1Var));
            }
            qim0 qim0VarY17 = uyn1.y(qim0VarThen, kor0Var.b().c, kor0Var.b().b);
            if (a0e1Var5 == null) {
                graVar = een.h;
            } else if (a0e1Var5 == null) {
                graVar = een.d;
            } else {
                graVar = een.f;
            }
            i7 = i7;
            w2g0.c(qim0VarY17, graVar, apo.r(-975688238, new vor0(bor0VarE, ven0Var, iu30Var111, vnr0Var, kor0Var, af5Var17, a0e1Var5, i7, z5, ven0Var2), x340Var2), x340Var2, 3072, 4);
            x340Var = x340Var2;
            iu30Var3 = iu30Var111;
            z4 = z5;
            qim0Var3 = qim0Var5;
            a0e1Var3 = a0e1Var4;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var3 = qim0Var2;
            a0e1Var3 = a0e1Var2;
            z4 = z2;
            iu30Var3 = iu30Var2;
        }
        i13 = i7;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wor0(vnr0Var, qim0Var3, a0e1Var3, i13, z4, iu30Var3, i2, i3);
        }
    }

    public static final void g(kc91 kc91Var, qim0 qim0Var, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        if (kc91Var == null) {
            x340Var.i0(771219081);
        } else {
            x340Var.i0(1271804024);
            u890.b(kc91Var, apo.r(-1082840650, new quy(qim0Var, (byte) 1), x340Var), x340Var, 48);
        }
        x340Var.r(false);
    }

    public static final void h(String str, if5 if5Var, c380 c380Var, iu30 iu30Var, iu30 iu30Var2, qim0 qim0Var, lax laxVar, b0k b0kVar, int i) {
        qim0 qim0Var2;
        qim0 qim0Var3;
        char c;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(860647460);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(if5Var) ? 32 : 16) | (x340Var.g(c380Var) ? 256 : 128) | (x340Var.i(iu30Var) ? 2048 : 1024) | (x340Var.i(iu30Var2) ? 16384 : 8192) | 196608 | (x340Var.g(laxVar) ? 1048576 : 524288);
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                qim0Var3 = nim0.a;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var;
            }
            x340Var.s();
            String strO0 = cwl1.o0(x340Var, 2131962039);
            x340Var.i0(-1846460597);
            ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
            Iterator it = c380Var.iterator();
            while (it.hasNext()) {
                k1c1 k1c1Var = (k1c1) it.next();
                String strK = k1c1Var.b ? x0d.k(x340Var, 1241446833, 2131962037, x340Var, false) : x0d.k(x340Var, 1241449738, 2131962038, x340Var, false);
                x340Var.i0(-1518258143);
                StringBuilder sb = new StringBuilder();
                if (!k1c1Var.b) {
                    sb.append(k1c1Var.a);
                    sb.append('\n');
                }
                if (k1c1Var.e) {
                    x340Var.i0(576007769);
                    k(sb, 2131962041, k1c1Var.d, x340Var, 0);
                    c = '\n';
                    sb.append('\n');
                    x340Var.r(false);
                } else {
                    c = '\n';
                    x340Var.i0(576154802);
                    x340Var.r(false);
                }
                qim0 qim0Var4 = qim0Var3;
                k(sb, 2131962040, k1c1Var.f, x340Var, 0);
                sb.append(c);
                k(sb, 2131962042, k1c1Var.g, x340Var, 0);
                String string = sb.toString();
                x340Var.r(false);
                if5 if5Var2 = new if5((Integer) null, string, (b2i) null, (hf5) null, 13);
                boolean z = k1c1Var.c;
                boolean zI = ((i2 & 7168) == 2048) | x340Var.i(k1c1Var);
                Object objT = x340Var.T();
                if (zI || objT == m4cVar) {
                    objT = new k7a1(iu30Var, k1c1Var, (byte) 15);
                    x340Var.s0(objT);
                }
                Function0 function0 = (Function0) objT;
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                gbx gbxVar = new gbx(new y50(strO0), function0);
                boolean z2 = (57344 & i2) == 16384;
                Object objT2 = x340Var.T();
                if (z2 || objT2 == m4cVar) {
                    objT2 = new b1c1(iu30Var2, (byte) 0);
                    x340Var.s0(objT2);
                }
                arrayList.add(new zxm0(strK, if5Var2, (String) null, z, gbxVar, (iu30) objT2, k1c1Var.h, false, false));
                qim0Var3 = qim0Var4;
            }
            qim0 qim0Var5 = qim0Var3;
            x340Var.r(false);
            c921.h(str, if5Var, mqo1.A(arrayList), qim0Var5, (if5) null, laxVar, false, x340Var, (i2 & 14) | 64 | (i2 & 112) | 3584 | ((i2 >> 3) & 458752), 80);
            qim0Var2 = qim0Var5;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ydi0(str, if5Var, c380Var, iu30Var, iu30Var2, qim0Var2, laxVar, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object i(String str, String str2, onm onmVar) {
        rxy0 rxy0Var;
        if (onmVar instanceof rxy0) {
            rxy0Var = (rxy0) onmVar;
            int i = rxy0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                rxy0Var.d = i - Integer.MIN_VALUE;
            } else {
                rxy0Var = new rxy0(onmVar);
            }
        } else {
            rxy0Var = new rxy0(onmVar);
        }
        Object objP = rxy0Var.c;
        int i2 = rxy0Var.d;
        if (i2 == 0) {
            hm5.M(objP);
            rxy0Var.a = str;
            rxy0Var.b = str2;
            rxy0Var.d = 1;
            objP = p(rxy0Var);
            d9n d9nVar = d9n.a;
            if (objP == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = rxy0Var.b;
            str = rxy0Var.a;
            hm5.M(objP);
        }
        t45 t45Var = (t45) objP;
        if (t45Var != null) {
            t45Var.a(str, str2);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object j(String str, String str2, onm onmVar) {
        sxy0 sxy0Var;
        if (onmVar instanceof sxy0) {
            sxy0Var = (sxy0) onmVar;
            int i = sxy0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                sxy0Var.d = i - Integer.MIN_VALUE;
            } else {
                sxy0Var = new sxy0(onmVar);
            }
        } else {
            sxy0Var = new sxy0(onmVar);
        }
        Object objP = sxy0Var.c;
        int i2 = sxy0Var.d;
        if (i2 == 0) {
            hm5.M(objP);
            sxy0Var.a = str;
            sxy0Var.b = str2;
            sxy0Var.d = 1;
            objP = p(sxy0Var);
            d9n d9nVar = d9n.a;
            if (objP == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = sxy0Var.b;
            str = sxy0Var.a;
            hm5.M(objP);
        }
        t45 t45Var = (t45) objP;
        if (t45Var != null) {
            t45Var.b(str, str2);
        }
        return rih1.a;
    }

    public static final void k(StringBuilder sb, int i, Long l, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1494052335);
        int i3 = (x340Var.i(sb) ? 4 : 2) | i2 | (x340Var.e(i) ? 32 : 16) | (x340Var.g(l) ? 256 : 128);
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            sb.append(cwl1.n0(i, new Object[]{oho1.x(l != null ? Double.valueOf(l.longValue() / 1048576.0d) : null, x340Var)}, x340Var));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new heb1(sb, i, l, i2, (byte) 6);
        }
    }

    public static final Executor l(q8n q8nVar) {
        Executor executorN;
        gm00 gm00Var = q8nVar instanceof gm00 ? (gm00) q8nVar : null;
        return (gm00Var == null || (executorN = gm00Var.N()) == null) ? new agu(q8nVar) : executorN;
    }

    public static final gt40 m(ArrayList arrayList) {
        gt40 gt40VarC;
        Iterator it = arrayList.iterator();
        gt40 gt40Var = et40.a;
        while (it.hasNext()) {
            gt40 gt40Var2 = (gt40) it.next();
            if (gt40Var2 != null && (gt40VarC = gt40Var.c(gt40Var2)) != null) {
                gt40Var = gt40VarC;
            }
        }
        return gt40Var;
    }

    public static float n(float f, float f2, float f3) {
        return u(0.0f, 1.0f, Math.max(0.0f, Math.min(1.0f, f == f2 ? 0.0f : (f3 - f) / (f2 - f))));
    }

    public static final LinkedHashMap o(nn51 nn51Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (jn51 jn51Var : nn51Var.c) {
            List list = jn51Var.i;
            ArrayList arrayList = new ArrayList(q7h.U(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Float.valueOf(((Number) it.next()).intValue() / jn51Var.j));
            }
            TreeMap treeMap = new TreeMap();
            int i = 0;
            treeMap.put(0L, 0);
            float fFloatValue = 0.0f;
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    p7h.T();
                    throw null;
                }
                fFloatValue += ((Number) obj).floatValue();
                treeMap.put(Long.valueOf((long) (1000.0f * fFloatValue)), Integer.valueOf(i));
                i = i2;
            }
            linkedHashMap.put(jn51Var, treeMap);
        }
        return linkedHashMap;
    }

    public static final t45 p(onm onmVar) {
        oxy0 oxy0VarA = onmVar.getContext().A(oxy0.c);
        if (oxy0VarA != null) {
            return oxy0VarA.b;
        }
        return null;
    }

    public static final q8n q(Executor executor) {
        q8n q8nVar;
        agu aguVar = executor instanceof agu ? (agu) executor : null;
        return (aguVar == null || (q8nVar = aguVar.a) == null) ? new hm00(executor) : q8nVar;
    }

    public static final mmr0 r(LinkedHashMap linkedHashMap, long j, jn51 jn51Var) {
        NavigableMap navigableMap;
        Map.Entry entryFloorEntry;
        if (j < 0 || (navigableMap = (NavigableMap) linkedHashMap.get(jn51Var)) == null || (entryFloorEntry = navigableMap.floorEntry(Long.valueOf(j))) == null) {
            return null;
        }
        return new mmr0((Integer) entryFloorEntry.getValue(), (Long) entryFloorEntry.getKey());
    }

    public static final String s(nn51 nn51Var, jn51 jn51Var, int i) {
        String strValueOf = (String) o7h.t0(i, jn51Var.h);
        if (strValueOf == null) {
            strValueOf = String.valueOf(i);
        }
        return f4i1.e((String) o7h.q0(nn51Var.a), nhc1.W(nhc1.W((String) nn51Var.b.get(jn51Var.b), "{{variant_id}}", jn51Var.a), "{{panel_id}}", strValueOf));
    }

    public static final mmr0 t(rph rphVar) {
        djb0 djb0Var = rphVar.g;
        w7x w7xVar = w7x.a;
        if (djb0Var == null || !djb0Var.a(rphVar)) {
            return new mmr0(rphVar, w7xVar);
        }
        rph rphVarA = rph.a(rphVar, (ace0) null, (ace0) null, (ace0) null, (ace0) null, (ace0) null, (njb0) null, (kmh) null, (String) null, false, (String) null, (cqs0) null, (LinkedHashSet) null, false, (cqs0) null, (Comment) null, (cqs0) null, (u380) null, false, 524223);
        ace0 ace0Var = rphVarA.e;
        if (djb0Var instanceof djb0) {
            return new mmr0(rphVarA, Collections.singleton(new fnh(djb0Var.a, (String) null, false)));
        }
        boolean z = djb0Var instanceof ejb0;
        l9k1 l9k1Var = l9k1.a;
        snh snhVar = qnh.a;
        if (z) {
            Comment commentB = rphVarA.b(((ejb0) djb0Var).a);
            if (commentB == null) {
                return new mmr0(rphVarA, w7xVar);
            }
            if (commentB.v()) {
                return new mmr0(rphVarA, Collections.singleton(onh.a));
            }
            return !ace0Var.a(Boolean.TRUE) ? new mmr0(rph.a(rphVarA, (ace0) null, (ace0) null, (ace0) null, (ace0) null, (ace0) null, (njb0) null, (kmh) null, (String) null, false, (String) null, (cqs0) null, (LinkedHashSet) null, false, (cqs0) null, commentB, (cqs0) null, (u380) null, false, 491519), f46.S0(new snh[]{snhVar, new fnh(commentB.r(), (String) null, true)})) : new mmr0(rph.a(rphVarA, (ace0) null, (ace0) null, (ace0) null, (ace0) null, (ace0) null, (njb0) null, (kmh) null, (String) null, false, (String) null, (cqs0) null, (LinkedHashSet) null, false, (cqs0) null, commentB, (cqs0) null, (u380) null, false, 491519), f46.S0(new snh[]{new inh(l9k1Var), new fnh(commentB.r(), (String) null, true)}));
        }
        if (djb0Var instanceof fjb0) {
            fjb0 fjb0Var = (fjb0) djb0Var;
            return new mmr0(rphVarA, Collections.singleton(new mnh(rphVarA.a, fjb0Var.a, fjb0Var.b, fjb0Var.c, false)));
        }
        if (djb0Var.equals(gjb0.a)) {
            return ace0Var.a(Boolean.TRUE) ? new mmr0(rphVarA, Collections.singleton(new inh(l9k1Var))) : new mmr0(rphVarA, Collections.singleton(snhVar));
        }
        if (djb0Var instanceof hjb0) {
            return new mmr0(rph.a(rphVarA, (ace0) null, (ace0) null, (ace0) null, (ace0) null, (ace0) null, (njb0) null, (kmh) null, (String) null, false, (String) null, (cqs0) null, (LinkedHashSet) null, false, (cqs0) null, (Comment) null, (cqs0) null, (u380) null, true, 262143), Collections.singleton(new gnh(((hjb0) djb0Var).a)));
        }
        eg.o();
        return null;
    }

    public static float u(float f, float f2, float f3) {
        return l1d.e(f2, f, f3, f);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057  */
    public static final void v(e421 e421Var) {
        ArrayList arrayList = ((s3x) e421Var).b;
        if (!arrayList.isEmpty()) {
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!(((i3x) it.next()) instanceof p3x)) {
                            if (arrayList.size() != 1) {
                                j3x j3xVar = new j3x();
                                r7h.W(arrayList, ((s3x) j3xVar).b);
                                arrayList.clear();
                                arrayList.add(j3xVar);
                            }
                        }
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ArrayList arrayList2 = ((s3x) ((i3x) it2.next())).b;
                if (arrayList2.size() != 1) {
                    j3x j3xVar2 = new j3x();
                    r7h.W(arrayList2, ((s3x) j3xVar2).b);
                    arrayList2.clear();
                    arrayList2.add(j3xVar2);
                }
            }
        } else if (arrayList.size() != 1) {
            j3x j3xVar3 = new j3x();
            r7h.W(arrayList, ((s3x) j3xVar3).b);
            arrayList.clear();
            arrayList.add(j3xVar3);
        }
        w(e421Var);
        y(e421Var);
    }

    public static final void w(s3x s3xVar) {
        ArrayList<s3x> arrayList = s3xVar.b;
        for (s3x s3xVar2 : arrayList) {
            if (s3xVar2 instanceof s3x) {
                w(s3xVar2);
            }
        }
        f660 f660Var = (f660) s3xVar.b().foldIn((Object) null, b5n0.b1);
        b5u b5uVar = z4u.a;
        if (((f660Var != null ? f660Var.a : b5uVar) instanceof z4u) && !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                f660 f660Var2 = (f660) ((i3x) it.next()).b().foldIn((Object) null, b5n0.d1);
                if ((f660Var2 != null ? f660Var2.a : null) instanceof v4u) {
                    s3xVar.c(s3xVar.b().c(new f660(v4u.a)));
                    break;
                }
            }
        }
        iql1 iql1Var = (iql1) s3xVar.b().foldIn((Object) null, b5n0.c1);
        if (iql1Var != null) {
            b5uVar = iql1Var.a;
        }
        if (!(b5uVar instanceof z4u) || arrayList.isEmpty()) {
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            iql1 iql1Var2 = (iql1) ((i3x) it2.next()).b().foldIn((Object) null, b5n0.e1);
            if ((iql1Var2 != null ? iql1Var2.a : null) instanceof v4u) {
                s3xVar.c(dm5.J(s3xVar.b()));
                return;
            }
        }
    }

    public static final af5 x(vnr0 vnr0Var) {
        z6x z6xVar;
        String str = vnr0Var.a;
        StringBuilder sb = new StringBuilder(16);
        ArrayList arrayListM = xvj1.m();
        new ArrayList();
        ior0 ior0Var = vnr0Var.c;
        if (ior0Var instanceof jor0) {
            z6xVar = z6x.a;
        } else {
            if (!(ior0Var instanceof ior0)) {
                eg.o();
                return null;
            }
            z6xVar = ior0Var.a;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : (Iterable) z6xVar) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            mor0 mor0Var = (mor0) obj;
            String str2 = String.format(Locale.ENGLISH, "$%d", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
            int iW0 = ihc1.w0(str, str2, 0, false, 6);
            if (iW0 != -1) {
                arrayList.add(new unr0(iW0, str2.length() + iW0, mor0Var));
            }
            i = i2;
        }
        int i3 = 0;
        for (unr0 unr0Var : o7h.l1(o7h.a1(arrayList, new ktg0((byte) 10)))) {
            int i4 = unr0Var.a;
            mor0 mor0Var2 = unr0Var.c;
            sb.append(str.substring(i3, i4));
            int length = sb.length();
            sb.append(mor0Var2.a);
            arrayListM.add(new xe5(length, sb.length(), 8, mor0Var2.b, (String) null));
            i3 = unr0Var.b;
        }
        if (i3 < str.length()) {
            sb.append(str.substring(i3));
        }
        String string = sb.toString();
        ArrayList arrayList2 = new ArrayList(arrayListM.size());
        int size = arrayListM.size();
        for (int iG = 0; iG < size; iG = c13.g(sb, (xe5) arrayListM.get(iG), arrayList2, iG, 1)) {
        }
        return new af5(string, arrayList2);
    }

    public static final void y(s3x s3xVar) {
        htn0 htn0Var = htn0.c1;
        int i = 0;
        for (Object obj : s3xVar.b) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            s3x s3xVar2 = (i3x) htn0Var.invoke((i3x) obj);
            s3xVar.b.set(i, s3xVar2);
            if (s3xVar2 instanceof s3x) {
                y(s3xVar2);
            }
            i = i2;
        }
    }

    public static final LinkedHashMap z(s3x s3xVar) {
        ArrayList arrayList = s3xVar.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            s3x s3xVar2 = (i3x) obj;
            gt40 gt40VarB = s3xVar2.b();
            mmr0 mmr0Var = gt40VarB.a(htn0.a1) ? (mmr0) gt40VarB.foldIn(new mmr0((Object) null, et40.a), b5n0.Z0) : new mmr0((Object) null, gt40VarB);
            q60 q60Var = (q60) mmr0Var.a;
            gt40 gt40Var = (gt40) mmr0Var.b;
            q10 q10Var = q60Var != null ? q60Var.a : null;
            mmr0 mmr0Var2 = q10Var instanceof iab0 ? new mmr0(q10Var, gt40Var) : new mmr0((Object) null, gt40Var);
            if (s3xVar2 instanceof s3x) {
                for (Map.Entry entry : z(s3xVar2).entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    Object objH = linkedHashMap.get(str);
                    if (objH == null) {
                        objH = cfm0.h(str, linkedHashMap);
                    }
                    ((List) objH).addAll(list);
                }
            }
            i = i2;
        }
        return linkedHashMap;
    }

    public void A(ivo1 ivo1Var, ivo1 ivo1Var2) {
        ivo1Var.b = ivo1Var2;
    }

    public void B(ivo1 ivo1Var, Thread thread) {
        ivo1Var.a = thread;
    }

    public boolean C(fzo1 fzo1Var, zeo1 zeo1Var, zeo1 zeo1Var2) {
        synchronized (fzo1Var) {
            try {
                if (fzo1Var.b != zeo1Var) {
                    return false;
                }
                fzo1Var.b = zeo1Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean D(fzo1 fzo1Var, Object obj, Object obj2) {
        synchronized (fzo1Var) {
            try {
                if (fzo1Var.a != obj) {
                    return false;
                }
                fzo1Var.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean E(fzo1 fzo1Var, ivo1 ivo1Var, ivo1 ivo1Var2) {
        synchronized (fzo1Var) {
            try {
                if (fzo1Var.c != ivo1Var) {
                    return false;
                }
                fzo1Var.c = ivo1Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
