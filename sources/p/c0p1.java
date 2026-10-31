package p;

import android.net.Uri;
import android.os.Parcel;
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
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class c0p1 {
    public static b180 a;
    public static b180 b;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void a(int i, int i2, Function0 function0, b0k b0kVar) throws NoWhenBranchMatchedException {
        x340 x340Var = (x340) b0kVar;
        int i3 = (kk0.t(-286190530, i, x340Var) ? 4 : 2) | i2 | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            int iC = l1d.C(i);
            if (iC != 0) {
                nim0 nim0Var = nim0.a;
                isl islVar = isl.a;
                if (iC == 1) {
                    x340Var.i0(-391792409);
                    uwr uwrVar = cbx.a;
                    mta mtaVar = cbx.b(x340Var).d;
                    w0h1.a(box.c, islVar, anm1.N("share.media.container.error.icon", u291.r(nim0Var, 48.0f)), 0L, 0L, false, x340Var, box.d | 48, 56);
                    x340Var.r(false);
                } else {
                    if (iC != 2) {
                        throw p3d1.k(x340Var, -151188989, false);
                    }
                    x340Var.i0(-151176221);
                    wrx wrxVar = wrx.c;
                    uwr uwrVar2 = cbx.a;
                    mta mtaVar2 = cbx.b(x340Var).d;
                    w0h1.a(wrxVar, islVar, bin.x(anm1.N("share.media.container.retry.icon", u291.r(nim0Var, 48.0f)), false, null, null, null, function0, 15), u7h.f, 0L, false, x340Var, wrx.d | 48, 48);
                    x340Var.r(false);
                }
            } else {
                x340Var.i0(-151187582);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wk1(i, function0, i2, (byte) 25);
        }
    }

    public static final void b(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1355170062);
        byte b2 = 2;
        int i2 = (x340Var.g(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            wkt0.a(zkt0.a, anm1.N("listening_activity_indicator_play_indicator", qim0Var), (ksl) null, 0L, false, x340Var, 6, 28);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nws0(qim0Var, i, b2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0217  */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static final void c(String str, qim0 qim0Var, String str2, String str3, String str4, k9 k9Var, qux quxVar, Function0 function0, b0k b0kVar, int i, int i2) {
        int i3;
        int i4;
        String str5;
        int i5;
        b0k b0kVar2;
        qim0 qim0Var2;
        String str6;
        k9 k9Var2;
        qux quxVar2;
        String str7;
        k9 k9Var3;
        qux nuxVar;
        String str8;
        qim0 qim0Var3;
        qux quxVar3;
        k9 k9Var4;
        String str9;
        qim0 qim0Var4;
        ?? r9;
        qim0 qim0VarX;
        Object next;
        Uri uri;
        qim0 qim0Var5;
        boolean z;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        era eraVar = een.P0;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1011399576);
        j06 j06Var = ((x340) b0kVar3).a;
        if ((i & 6) == 0) {
            i3 = i | (b0kVar3.g(str) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i6 = i3 | 48;
        int i7 = i2 & 4;
        if (i7 != 0) {
            i4 = i3 | 432;
        } else {
            i4 = i6 | (b0kVar3.g(str2) ? 256 : 128);
        }
        int i8 = i4 | 3072;
        int i9 = i2 & 16;
        if (i9 != 0) {
            i5 = i4 | 27648;
            str5 = str3;
        } else {
            str5 = str3;
            i5 = i8 | (b0kVar3.g(str5) ? 16384 : 8192);
        }
        int i10 = i5 | (b0kVar3.g(str4) ? 131072 : 65536) | (((i2 & 64) == 0 && b0kVar3.g(k9Var)) ? 1048576 : 524288) | (((i2 & 128) == 0 && b0kVar3.i(quxVar)) ? 8388608 : 4194304) | 100663296 | (b0kVar3.i(function0) ? 536870912 : 268435456);
        if (b0kVar3.Y(i10 & 1, (i10 & 306783379) != 306783378)) {
            b0kVar3.d0();
            int i11 = i & 1;
            qim0 qim0Var6 = nim0.a;
            if (i11 == 0 || b0kVar3.E()) {
                String str10 = i7 != 0 ? null : str2;
                if (i9 != 0) {
                    str5 = "";
                }
                if ((i2 & 64) != 0) {
                    k9Var3 = a47.c;
                    i10 &= -3670017;
                } else {
                    k9Var3 = k9Var;
                }
                if ((i2 & 128) != 0) {
                    box boxVar = box.c;
                    nuxVar = new nux(boxVar, boxVar);
                    i10 &= -29360129;
                } else {
                    nuxVar = quxVar;
                }
                str8 = str10;
                qim0Var3 = qim0Var6;
                quxVar3 = nuxVar;
            } else {
                b0kVar3.b0();
                if ((i2 & 64) != 0) {
                    i10 &= -3670017;
                }
                if ((i2 & 128) != 0) {
                    i10 &= -29360129;
                }
                qim0Var3 = qim0Var;
                str8 = str2;
                k9Var3 = k9Var;
                quxVar3 = quxVar;
            }
            String str11 = str5;
            int i12 = i10;
            b0kVar3.s();
            if (function0 == null) {
                b0kVar3.i0(-1408684944);
                b0kVar3.r(false);
                qim0Var4 = qim0Var6;
                str9 = str8;
                r9 = 0;
                k9Var4 = k9Var3;
                qim0VarX = null;
            } else {
                b0kVar3.i0(-1408684943);
                Object objT = b0kVar3.T();
                if (objT == fkj0.X) {
                    objT = a411.t;
                    b0kVar3.s0(objT);
                }
                k9Var4 = k9Var3;
                str9 = str8;
                qim0Var4 = qim0Var6;
                r9 = 0;
                qim0VarX = bin.x(s161.b(qim0Var6, false, (iu30) objT), false, null, null, null, function0, 15);
                b0kVar3.r(false);
            }
            if (qim0VarX == null) {
                qim0VarX = qim0Var4;
            }
            qim0 qim0VarThen = qim0Var3.then(qim0VarX);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            mbh mbhVarA = jbh.a(new d36(8.0f, true, new um5((boolean) r9)), eraVar, b0kVar3, (int) r9);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarThen);
            hzj.A.getClass();
            if (
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r17v17 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 958
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.c0p1.c(java.lang.String, p.qim0, java.lang.String, java.lang.String, java.lang.String, p.k9, p.qux, kotlin.jvm.functions.Function0, p.b0k, int, int):void");
        }

        public static final void d(String str, int i, lee1 lee1Var, Function0 function0, j2i j2iVar, b0k b0kVar, int i2) {
            j2i j2iVar2;
            int i3;
            qim0 qim0VarB;
            m4c m4cVar = fkj0.X;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(161370085);
            int i4 = i2 | (x340Var.g(str) ? 4 : 2) | (x340Var.i(lee1Var) ? 256 : 128) | (x340Var.i(function0) ? 2048 : 1024);
            if (x340Var.Y(i4 & 1, (i4 & 9363) != 9362)) {
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                int iC = l1d.C(i);
                nim0 nim0Var = nim0.a;
                if (iC == 0) {
                    x340Var.i0(457845002);
                    qim0 qim0VarZ = uyn1.z(8.0f, 0.0f, 2, sgc1.H(2, u291.x(0.0f, 300.0f, 1, dug.f(nim0Var, cbx.a(x340Var).a.c, er31.a))));
                    boolean z = (i4 & 7168) == 2048;
                    Object objT = x340Var.T();
                    if (z || objT == m4cVar) {
                        objT = new uuc1(function0, (byte) 5);
                        x340Var.s0(objT);
                    }
                    qim0 qim0VarX = bin.x(qim0VarZ, false, null, null, null, (Function0) objT, 15);
                    Object objT2 = x340Var.T();
                    if (objT2 == m4cVar) {
                        objT2 = pod1.d;
                        x340Var.s0(objT2);
                    }
                    i3 = 0;
                    qim0VarB = s161.b(qim0VarX, false, (iu30) objT2);
                    x340Var.r(false);
                } else {
                    if (iC != 1) {
                        throw p3d1.k(x340Var, 457836367, false);
                    }
                    x340Var.i0(457850218);
                    qim0 qim0VarZ2 = uyn1.z(8.0f, 0.0f, 2, nim0Var);
                    boolean z2 = (i4 & 7168) == 2048;
                    Object objT3 = x340Var.T();
                    if (z2 || objT3 == m4cVar) {
                        objT3 = new uuc1(function0, (byte) 6);
                        x340Var.s0(objT3);
                    }
                    qim0 qim0VarX2 = bin.x(qim0VarZ2, false, null, null, null, (Function0) objT3, 15);
                    Object objT4 = x340Var.T();
                    if (objT4 == m4cVar) {
                        objT4 = pod1.e;
                        x340Var.s0(objT4);
                    }
                    qim0VarB = s161.b(qim0VarX2, false, (iu30) objT4);
                    x340Var.r(false);
                    i3 = 0;
                }
                jw31 jw31VarA = ew31.a(h36.b, een.N0, x340Var, i3);
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
                nko1.H(jw31VarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                boolean z3 = (i4 & 14) == 4;
                Object objT5 = x340Var.T();
                if (z3 || objT5 == m4cVar) {
                    objT5 = v8r.q(str);
                    x340Var.s0(objT5);
                }
                xpv0 xpv0Var = cbx.c(x340Var).c;
                n8b1 n8b1VarJ = xpv0.j();
                String str2 = (String) ((ven0) objT5).getValue();
                qim0 qim0VarF = u291.f(uyn1.B(nim0Var, 8.0f, 0.0f, 12.0f, 0.0f, 10).then(new wnb0(1.0f, true)), 1.0f);
                boolean zI = x340Var.i(n8b1VarJ);
                Object objT6 = x340Var.T();
                if (zI || objT6 == m4cVar) {
                    objT6 = new qwc1(n8b1VarJ, (byte) 9);
                    x340Var.s0(objT6);
                }
                hm5.a(str2, qim0VarF, (iu30) objT6, (tl3) null, "cross fade content", (iu30) null, apo.r(1481809523, new zod1(lee1Var, (byte) 0), x340Var), x340Var, 1597440, 40);
                j2iVar2 = j2iVar;
                dv20.l(6, j2iVar2, x340Var, true);
            } else {
                j2iVar2 = j2iVar;
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new apd1(str, i, lee1Var, function0, j2iVar2, i2, (byte) 0);
            }
        }

        public static final void e(String str, int i, lee1 lee1Var, Function0 function0, j2i j2iVar, b0k b0kVar, int i2) {
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(649410871);
            int i3 = i2 | (x340Var.g(str) ? 4 : 2) | (x340Var.i(lee1Var) ? 256 : 128) | (x340Var.i(function0) ? 2048 : 1024);
            if (!x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
                x340Var.b0();
            } else if (str == null || ihc1.y0(str)) {
                x340Var.i0(2066746313);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                qim0 qim0VarZ = uyn1.z(8.0f, 0.0f, 2, nim0.a);
                gfh0 gfh0VarC = t1c.c(een.d, false);
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
                nko1.H(gfh0VarC, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                k4s0.i(6, j2iVar, x340Var, true, false);
            } else {
                x340Var.i0(2066850473);
                d(str, i, lee1Var, function0, apo.r(-828171782, new j2r0(j2iVar, (byte) 24), x340Var), x340Var, (i3 & 14) | 24624 | (i3 & 896) | (i3 & 7168));
                x340Var.r(false);
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new apd1(str, i, lee1Var, function0, j2iVar, i2, (byte) 1);
            }
        }

        public static final void f(String str, String str2, qim0 qim0Var, lee1 lee1Var, long j, int i, Function0 function0, b0k b0kVar, int i2) {
            b0k b0kVar2;
            af5 af5VarP;
            Object obj = fkj0.X;
            b0k b0kVar3 = (x340) b0kVar;
            b0kVar3.k0(1787455603);
            int i3 = (i2 & 6) == 0 ? (b0kVar3.g(str) ? 4 : 2) | i2 : i2;
            if ((i2 & 48) == 0) {
                i3 |= b0kVar3.g(str2) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                i3 |= b0kVar3.i(qim0Var) ? 256 : 128;
            }
            if ((i2 & 3072) == 0) {
                i3 |= b0kVar3.i(lee1Var) ? 2048 : 1024;
            }
            if ((i2 & 24576) == 0) {
                i3 |= b0kVar3.f(j) ? 16384 : 8192;
            }
            if ((196608 & i2) == 0) {
                i3 |= b0kVar3.e(i) ? 131072 : 65536;
            }
            if ((1572864 & i2) == 0) {
                i3 |= b0kVar3.i(function0) ? 1048576 : 524288;
            }
            if (b0kVar3.Y(i3 & 1, (599187 & i3) != 599186)) {
                b0kVar3.d0();
                if ((i2 & 1) != 0 && !b0kVar3.E()) {
                    b0kVar3.b0();
                }
                b0kVar3.s();
                boolean z = (i3 & 112) == 32;
                Object objT = b0kVar3.T();
                if (z || objT == obj) {
                    URI uri = new URI(str2);
                    String host = uri.getHost();
                    String path = uri.getPath();
                    String query = uri.getQuery();
                    String strConcat = query != null ? "?".concat(query) : null;
                    if (strConcat == null) {
                        strConcat = "";
                    }
                    objT = host + path + strConcat;
                    b0kVar3.s0(objT);
                }
                String str3 = (String) objT;
                boolean z2 = (i3 & 14) == 4;
                Object objT2 = b0kVar3.T();
                if (z2 || objT2 == obj) {
                    objT2 = Integer.valueOf(ihc1.w0(str, str3, 0, false, 6));
                    b0kVar3.s0(objT2);
                }
                int iIntValue = ((Number) objT2).intValue();
                qim0 qim0VarF = u291.f(qim0Var, 1.0f);
                if (iIntValue == -1) {
                    b0kVar3.i0(-242062472);
                    b0kVar3.r(false);
                    StringBuilder sb = new StringBuilder(16);
                    ArrayList arrayListM = xvj1.m();
                    new ArrayList();
                    sb.append(str);
                    String string = sb.toString();
                    ArrayList arrayList = new ArrayList(arrayListM.size());
                    int iG = 0;
                    for (int size = arrayListM.size(); iG < size; size = size) {
                        iG = c13.g(sb, (xe5) arrayListM.get(iG), arrayList, iG, 1);
                    }
                    af5VarP = new af5(string, arrayList);
                } else {
                    b0kVar3.i0(1086071153);
                    ye5 ye5Var = new ye5();
                    ye5Var.e(0, iIntValue, str);
                    uwr uwrVar = cbx.a;
                    zma1 zma1Var = new zma1(cbx.a(b0kVar3).b.c, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.b, (Shadow) null, (PlatformSpanStyle) null, 61438);
                    boolean z3 = (3670016 & i3) == 1048576;
                    Object objT3 = b0kVar3.T();
                    if (z3 || objT3 == obj) {
                        objT3 = new izg1(function0, (byte) 5);
                        b0kVar3.s0(objT3);
                    }
                    vhg.a(ye5Var, str3, "description_link", zma1Var, (iu30) objT3);
                    if (str3.length() + iIntValue < str.length()) {
                        ye5Var.e(str3.length() + iIntValue, str.length(), str);
                    }
                    af5VarP = ye5Var.p();
                    b0kVar3.r(false);
                }
                b0kVar2 = b0kVar3;
                uwo1.d(af5VarP, j, qim0VarF, lee1Var, new a0e1(i), null, 0, false, null, 0, null, null, b0kVar2, ((i3 >> 9) & 112) | (i3 & 7168) | ((i3 >> 3) & 57344), 0, 4064);
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
            }
            h311 h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new j2j1(str, str2, qim0Var, lee1Var, j, i, function0, i2);
            }
        }

        public static final dps0 g(Map map) {
            if (map.isEmpty()) {
                return dps0.d;
            }
            hps0 hps0Var = new hps0(dps0.d);
            for (Map.Entry entry : map.entrySet()) {
                hps0Var.put((String) entry.getKey(), mqo1.G((Map) entry.getValue()));
            }
            return hps0Var.e();
        }

        public static void h(List list, bdn0 bdn0Var) {
            bdn0Var.a.clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                d6c0 d6c0Var = (d6c0) it.next();
                bdn0Var.a.put(iro1.q(d6c0Var), o(d6c0Var));
            }
        }

        public static g5p i(yff yffVar, zuj zujVar, tgf tgfVar, q7r0 q7r0Var, rih1 rih1Var) {
            yffVar.getClass();
            zujVar.getClass();
            rih1Var.getClass();
            return new g5p(yffVar, zujVar, tgfVar, q7r0Var);
        }

        public static String j(Parcel parcel) {
            String string = parcel.readString();
            string.getClass();
            return string;
        }

        public static teb k(boolean z, c4x0 c4x0Var, f8b0 f8b0Var, int i) {
            if ((i & 4) != 0) {
                c4x0Var = c4x0.N0;
            }
            c4x0 c4x0Var2 = c4x0Var;
            if ((i & 8) != 0) {
                f8b0Var = f8b0.b;
            }
            return new teb(z, true, true, c4x0Var2, f8b0Var, g8b0.b);
        }

        public static final ibd0 l(vl10 vl10Var) {
            if (vl10Var instanceof ul10) {
                return ebd0.a;
            }
            if (!(vl10Var instanceof tl10)) {
                eg.o();
                return null;
            }
            td tdVar = ((tl10) vl10Var).b;
            if (tdVar instanceof sd) {
                return gbd0.a;
            }
            return tdVar instanceof od ? hbd0.a : fbd0.a;
        }

        public static ArrayList m(bdn0 bdn0Var) {
            List<mmr0> listS = sqg0.S(bdn0Var.a);
            ArrayList arrayList = new ArrayList(q7h.U(listS, 10));
            for (mmr0 mmr0Var : listS) {
                arrayList.add(iro1.n((String) mmr0Var.a, m((bdn0) mmr0Var.b)));
            }
            return arrayList;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public static final hux n(String str) {
            switch (str.hashCode()) {
                case -2117384923:
                    if (str.equals("TRENDING")) {
                        return ntx.c;
                    }
                    return null;
                case -1853007448:
                    if (str.equals("SEARCH")) {
                        return esx.c;
                    }
                    return null;
                case -132630821:
                    if (str.equals("REPORT_ABUSE")) {
                        return csx.c;
                    }
                    return null;
                case 2458420:
                    if (str.equals("PLAY")) {
                        return xpx.c;
                    }
                    return null;
                case 2544381:
                    if (str.equals("SHOW")) {
                        return mrx.c;
                    }
                    return null;
                case 2614219:
                    if (str.equals("USER")) {
                        return ttx.c;
                    }
                    return null;
                case 81665115:
                    if (str.equals("VIDEO")) {
                        return xtx.c;
                    }
                    return null;
                case 231328061:
                    if (str.equals("RELEASED")) {
                        return xrx.c;
                    }
                    return null;
                case 989877798:
                    if (str.equals("ARROW_RIGHT")) {
                        return jkx.c;
                    }
                    return null;
                case 1055811561:
                    if (str.equals("DISCOVER")) {
                        return rmx.c;
                    }
                    return null;
                case 1939198791:
                    if (str.equals("ARTIST")) {
                        return nkx.c;
                    }
                    return null;
                case 2056967449:
                    if (str.equals("EVENTS")) {
                        return bnx.c;
                    }
                    return null;
                default:
                    return null;
            }
        }

        public static bdn0 o(d6c0 d6c0Var) {
            List<d6c0> listA = d6c0Var.a();
            int iS = zno1.s(q7h.U(listA, 10));
            if (iS < 16) {
                iS = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
            for (d6c0 d6c0Var2 : listA) {
                linkedHashMap.put(iro1.q(d6c0Var2), o(d6c0Var2));
            }
            return new bdn0(new LinkedHashMap(linkedHashMap));
        }
    }
