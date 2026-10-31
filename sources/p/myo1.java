package p;

import android.net.Uri;
import android.os.Build;
import androidx.compose.ui.graphics.ColorFilter;
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
import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class myo1 {
    public static b180 a;
    public static b180 b;

    public static final void a(wzg wzgVar, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-539067295);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? x340Var.g(wzgVar) : x340Var.i(wzgVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3 << 6;
            qim0 qim0Var3 = nim0.a;
            d9p1.e(wzgVar.a(), wzgVar.d(), wzgVar.c(), function0, qim0Var3, 0.0f, apo.r(251331741, new o2((Object) wzgVar, (byte) 3), x340Var), x340Var, (i4 & 7168) | 1572864 | (i4 & 57344), 32);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xx(wzgVar, function0, qim0Var2, i, (byte) 0);
        }
    }

    public static final void b(String str, String str2, String str3, String str4, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        String str5;
        b0k b0kVar2;
        ksl kslVar;
        as80 as80Var = mif1.P0;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1471899522);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            str5 = str3;
            i2 |= b0kVar3.g(str5) ? 256 : 128;
        } else {
            str5 = str3;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.g(str4) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? 16384 : 8192;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0Var);
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
            nko1.H(gfh0VarC, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            int length = str.length();
            nim0 nim0Var = nim0.a;
            ksl kslVar2 = isl.a;
            if (length <= 0 || Build.VERSION.SDK_INT < 31) {
                kslVar = kslVar2;
                b0kVar3.i0(589685307);
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                Uri uri = Uri.parse(str4);
                uwr uwrVar = cbx.a;
                cbx.a.getClass();
                eso1.e(uri, kslVar, qim0VarD, (p3v) null, (zvx) null, uwr.a(), as80Var, (tl3) null, (ColorFilter) null, (qux) null, false, false, b0kVar3, 48, 0, 3992);
                b0kVar2 = b0kVar3;
                b0kVar2.r(false);
            } else {
                b0kVar3.i0(589264699);
                qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
                u5j1 u5j1Var = d4o1.a;
                qim0 qim0VarN = fc11.n(qim0VarD2, 8.0f, 8.0f, u5j1Var);
                Uri uri2 = Uri.parse(str5);
                uwr uwrVar2 = cbx.a;
                cbx.a.getClass();
                kslVar = kslVar2;
                eso1.e(uri2, kslVar, qim0VarN, (p3v) null, (zvx) null, uwr.a(), as80Var, (tl3) null, (ColorFilter) null, (qux) null, false, false, b0kVar3, 48, 0, 3992);
                b0kVar2 = b0kVar3;
                t1c.a(dug.f(u291.d(nim0Var, 1.0f), u7h.b(d9p1.o(str, b0kVar2, i2 & 14), 0.6f, 0.0f, 0.0f, 0.0f, 14), u5j1Var), b0kVar2, 0);
                b0kVar2.r(false);
            }
            Uri uri3 = Uri.parse(str2);
            zov0 zov0Var = cbx.b(b0kVar2).g;
            pox poxVar = pox.c;
            eso1.e(uri3, kslVar, (qim0) null, new p3v(32.0f), (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, new nux(poxVar, poxVar), false, false, b0kVar2, 1073741872, 0, 3572);
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new yx(str, str2, str5, str4, qim0Var, i, (byte) 0);
        }
    }

    public static final void c(int i, String str, Function0 function0, b0k b0kVar, hux huxVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1918419337);
        int i2 = ((i & 8) == 0 ? x340Var.g(huxVar) : x340Var.i(huxVar) ? 4 : 2) | i | (x340Var.g(str) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            j2i j2iVarR = apo.r(-7923220, new cp9(huxVar, str, (byte) 3), x340Var);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            zzq0 zzq0Var = new zzq0(2.0f, 2.0f, 2.0f, 2.0f);
            zov0 zov0Var = cbx.b(x340Var).g;
            qim0 qim0Var3 = nim0.a;
            e(j2iVarR, str, function0, zzq0Var, u291.r(qim0Var3, 32.0f), null, x340Var, (i2 & 112) | 6 | (i2 & 896), 32);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dp9(huxVar, str, function0, qim0Var2, i, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:46:0x0084  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    public static final void d(String str, String str2, Function0 function0, qim0 qim0Var, max maxVar, b0k b0kVar, int i, int i2) {
        int i3;
        max maxVar2;
        int i4;
        boolean z;
        qim0 qim0Var2;
        max maxVar3;
        h311 h311VarV;
        qim0 qim0Var3;
        max maxVar4;
        qim0 qim0Var4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-466545540);
        int i5 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128);
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 = i5 | 3072;
        } else {
            i3 = i5 | (x340Var.i(qim0Var) ? 2048 : 1024);
        }
        if ((i2 & 16) == 0) {
            maxVar2 = maxVar;
            int i7 = x340Var.i(maxVar) ? 16384 : 8192;
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
                    if ((i2 & 16) != 0) {
                        i4 &= -57345;
                        qim0Var4 = qim0Var3;
                        maxVar4 = jax.a;
                    } else {
                        maxVar4 = maxVar2;
                        qim0Var4 = qim0Var3;
                    }
                } else {
                    x340Var.b0();
                    if ((i2 & 16) != 0) {
                        i4 &= -57345;
                    }
                    maxVar4 = maxVar2;
                    qim0Var4 = qim0Var;
                }
                x340Var.s();
                int i8 = (i4 & 112) | 6 | (i4 & 896);
                int i9 = i4 << 3;
                e(apo.r(1431087857, new j3b(str, (byte) 24), x340Var), str2, function0, yoo1.y(x340Var).a, qim0Var4, maxVar4, x340Var, i8 | (57344 & i9) | (i9 & 458752), 0);
                qim0Var2 = qim0Var4;
                maxVar3 = maxVar4;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
                maxVar3 = maxVar2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ik2(str, str2, function0, qim0Var2, maxVar3, i, i2);
            }
        }
        maxVar2 = maxVar;
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
                if ((i2 & 16) != 0) {
                    i4 &= -57345;
                    qim0Var4 = qim0Var3;
                    maxVar4 = jax.a;
                } else {
                    maxVar4 = maxVar2;
                    qim0Var4 = qim0Var3;
                }
            } else {
                if (i6 != 0) {
                    qim0Var3 = nim0.a;
                } else {
                    qim0Var3 = qim0Var;
                }
                if ((i2 & 16) != 0) {
                    i4 &= -57345;
                    qim0Var4 = qim0Var3;
                    maxVar4 = jax.a;
                } else {
                    maxVar4 = maxVar2;
                    qim0Var4 = qim0Var3;
                }
            }
            x340Var.s();
            int i10 = (i4 & 112) | 6 | (i4 & 896);
            int i11 = i4 << 3;
            e(apo.r(1431087857, new j3b(str, (byte) 24), x340Var), str2, function0, yoo1.y(x340Var).a, qim0Var4, maxVar4, x340Var, i10 | (57344 & i11) | (i11 & 458752), 0);
            qim0Var2 = qim0Var4;
            maxVar3 = maxVar4;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            maxVar3 = maxVar2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ik2(str, str2, function0, qim0Var2, maxVar3, i, i2);
        }
    }

    public static final void e(j2i j2iVar, String str, Function0 function0, zzq0 zzq0Var, qim0 qim0Var, max maxVar, b0k b0kVar, int i, int i2) {
        int i3;
        zzq0 zzq0Var2;
        max maxVar2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1618458305);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.i(j2iVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar3.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= b0kVar3.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            zzq0Var2 = zzq0Var;
            i3 |= b0kVar3.i(zzq0Var2) ? 2048 : 1024;
        } else {
            zzq0Var2 = zzq0Var;
        }
        if ((i & 24576) == 0) {
            i3 |= b0kVar3.i(qim0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                maxVar2 = maxVar;
                int i4 = b0kVar3.i(maxVar2) ? 131072 : 65536;
                i3 |= i4;
            } else {
                maxVar2 = maxVar;
            }
            i3 |= i4;
        } else {
            maxVar2 = maxVar;
        }
        if (b0kVar3.Y(i3 & 1, (74899 & i3) != 74898)) {
            b0kVar3.d0();
            if ((i & 1) != 0 && !b0kVar3.E()) {
                b0kVar3.b0();
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                }
            } else if ((i2 & 32) != 0) {
                i3 &= -458753;
                maxVar2 = jax.a;
            }
            max maxVar3 = maxVar2;
            b0kVar3.s();
            if (ihc1.y0(str)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            int i5 = i3 >> 3;
            b0kVar2 = b0kVar3;
            poo1.e(new gbx(new y50(str), function0), pex.b, yoo1.z(b0kVar3), qim0Var, 0, null, maxVar3, null, null, null, null, false, zzq0Var2, apo.r(-850316004, new pu2(j2iVar, (byte) 11), b0kVar3), b0kVar2, (i5 & 7168) | ((i3 << 3) & 3670016), (i5 & 896) | 3072, 4016);
            maxVar2 = maxVar3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bd5(j2iVar, str, function0, zzq0Var, qim0Var, maxVar2, i, i2, (byte) 4);
        }
    }

    public static final void f(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1526702826);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.g(str2) ? 32 : 16) | (b0kVar3.g(str3) ? 256 : 128) | (b0kVar3.g(str4) ? 2048 : 1024) | (b0kVar3.g(str5) ? 16384 : 8192) | (b0kVar3.g(str6) ? 131072 : 65536) | (b0kVar3.g(str7) ? 1048576 : 524288) | (b0kVar3.g(str8) ? 8388608 : 4194304) | 100663296;
        if (b0kVar3.Y(i2 & 1, (38347923 & i2) != 38347922)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(b0kVar3, qim0Var3);
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
            nko1.H(mbhVarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            qim0 qim0VarC = u291.c(u291.f(qim0Var3, 1.0f), 0.5f);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(b0kVar3).f;
            qim0 qim0VarQ = i1p1.q(qim0VarC, er31.b(2.0f));
            Uri uri = Uri.parse(str7);
            cbx.a.getClass();
            qim0Var2 = qim0Var3;
            eso1.e(uri, isl.a, qim0VarQ, (p3v) null, (zvx) null, uwr.a(), mif1.P0, (tl3) null, (ColorFilter) null, (qux) null, true, false, b0kVar3, 48, 6, 2968);
            cvx cvxVar = cbx.b(b0kVar3).b;
            uwo1.e(str, ab80.o(qim0Var2, 8.0f, b0kVar3, qim0Var2, 1.0f), cbx.d(b0kVar3).n, d9p1.o(str3, b0kVar3, (i2 >> 6) & 14), new a0e1(5), null, 2, false, new cjc0(1), 0, null, b0kVar3, i2 & 14, 0, 1696);
            uwo1.e(str2, u291.f(qim0Var2, 1.0f), cbx.d(b0kVar3).n, d9p1.o(str4, b0kVar3, (i2 >> 9) & 14), new a0e1(5), null, 2, false, new cjc0(1), 0, null, b0kVar3, (i2 >> 3) & 14, 0, 1696);
            pbh pbhVar = pbh.a;
            op71.g(b0kVar3, pbhVar.a(1.0f, qim0Var2, true));
            uwo1.e(str6, u291.f(qim0Var2, 1.0f), cbx.d(b0kVar3).o, u7h.b(cbx.a(b0kVar3).b.a, 0.7f, 0.0f, 0.0f, 0.0f, 14), new a0e1(5), null, 0, false, new cjc0(1), 0, null, b0kVar3, (i2 >> 15) & 14, 0, 1760);
            uwo1.e(str5, u291.f(qim0Var2, 1.0f), cbx.d(b0kVar3).p, cbx.a(b0kVar3).b.a, new a0e1(5), null, 0, false, new cjc0(1), 0, null, b0kVar3, (i2 >> 12) & 14, 0, 1760);
            b0kVar2 = b0kVar3;
            op71.g(b0kVar2, pbhVar.a(2.0f, qim0Var2, true));
            d9p1.c((i2 >> 21) & 14, str8, b0kVar2, u291.f(qim0Var2, 1.0f));
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new zx(str, str2, str3, str4, str5, str6, str7, str8, qim0Var2, i, (byte) 0);
        }
    }

    public static final void g(h32 h32Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2130073609);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(h32Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            h32Var.getClass();
            String strO0 = cwl1.o0(x340Var, 2131951996);
            String strO1 = cwl1.o0(x340Var, 2131951995);
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).b.b;
            ye5 ye5Var = new ye5();
            int iO = ye5Var.o(new zma1(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
            try {
                ye5Var.g(strO0 + " ");
                ye5Var.k(iO);
                ye5Var.m("URL", "https://adshelp.spotify.com/HelpCenter/s/article/advertising-policies-US");
                int iO2 = ye5Var.o(new zma1(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.c, (Shadow) null, (PlatformSpanStyle) null, 61438));
                try {
                    ye5Var.g(strO1);
                    ye5Var.k(iO2);
                    int i3 = i2;
                    af5 af5VarP = ye5Var.p();
                    qim0 qim0VarF = u291.f(nim0.a, 1.0f);
                    cvx cvxVar = cbx.b(x340Var).b;
                    qim0 qim0VarZ = uyn1.z(0.0f, 16.0f, 1, qim0VarF);
                    mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
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
                    lee1 lee1Var = cbx.d(x340Var).j;
                    boolean zI = ((i3 & 112) == 32) | x340Var.i(af5VarP);
                    Object objT = x340Var.T();
                    if (zI || objT == fkj0.X) {
                        objT = new j2d0(af5VarP, iu30Var, (byte) 0);
                        x340Var.s0(objT);
                    }
                    l0p1.a(af5VarP, null, lee1Var, false, 0, 0, null, (iu30) objT, x340Var, 0, 122);
                    x340Var.r(true);
                } catch (Throwable th) {
                    ye5Var.k(iO2);
                    throw th;
                }
            } catch (Throwable th2) {
                ye5Var.k(iO);
                throw th2;
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lg60(h32Var, iu30Var, i, (byte) 16);
        }
    }

    public static final void h(r32 r32Var, iu30 iu30Var, iu30 iu30Var2, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1664892957);
        int i2 = (x340Var.g(r32Var) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(iu30Var2) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(0.0f, 4.0f, 1, qim0VarF);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var).g, 32, qim0VarZ);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarP);
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
            x340Var.i0(544278008);
            for (o32 o32Var : r32Var.c) {
                boolean zI = ((i2 & 112) == 32) | x340Var.i(o32Var);
                Object objT = x340Var.T();
                if (zI || objT == fkj0.X) {
                    objT = new bsc0(iu30Var, o32Var, (byte) 3);
                    x340Var.s0(objT);
                }
                j(o32Var, (Function0) objT, x340Var, 0);
            }
            x340Var.r(false);
            h32 h32Var = r32Var.d;
            if (h32Var == null) {
                x340Var.i0(-307170955);
            } else {
                x340Var.i0(-307170954);
                g(h32Var, iu30Var2, x340Var, (i2 >> 3) & 112);
            }
            x340Var.r(false);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cb60((Object) r32Var, iu30Var, (Object) iu30Var2, (Object) qim0Var2, i, (byte) 21);
        }
    }

    public static final void i(String str, String str2, String str3, String str4, String str5, String str6, String str7, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(419001613);
        int i2 = i | (b0kVar2.g(str) ? 4 : 2) | (b0kVar2.g(str2) ? 32 : 16) | (b0kVar2.g(str3) ? 256 : 128) | (b0kVar2.g(str4) ? 2048 : 1024) | (b0kVar2.g(str5) ? 16384 : 8192) | (b0kVar2.g(str6) ? 131072 : 65536) | (b0kVar2.g(str7) ? 1048576 : 524288) | 12582912;
        if (b0kVar2.Y(i2 & 1, (4793491 & i2) != 4793490)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(b0kVar2, qim0Var3);
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
            nko1.H(mbhVarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            qim0 qim0VarC = u291.c(u291.f(qim0Var3, 1.0f), 0.5f);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(b0kVar2).f;
            int i3 = i2 >> 9;
            b(str3, str4, str6, str7, i1p1.q(qim0VarC, er31.b(2.0f)), b0kVar2, ((i2 >> 6) & 126) | (i3 & 896) | (i3 & 7168));
            cvx cvxVar = cbx.b(b0kVar2).b;
            uwo1.e(str, ab80.o(qim0Var3, 6.0f, b0kVar2, qim0Var3, 1.0f), cbx.d(b0kVar2).o, u7h.b(cbx.a(b0kVar2).b.a, 0.7f, 0.0f, 0.0f, 0.0f, 14), new a0e1(5), null, 2, false, new cjc0(1), 0, null, b0kVar2, i2 & 14, 0, 1696);
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            cvx cvxVar3 = ywx0.k(qim0Var3, 4.0f, b0kVar2, b0kVar2).b;
            d9p1.l(u291.f(u291.h(qim0Var3, 6.0f), 0.7f), b0kVar2, 0);
            cvx cvxVar4 = cbx.b(b0kVar2).b;
            cvx cvxVar5 = ywx0.k(qim0Var3, 4.0f, b0kVar2, b0kVar2).b;
            d9p1.l(u291.f(u291.h(qim0Var3, 6.0f), 0.55f), b0kVar2, 0);
            pbh pbhVar = pbh.a;
            op71.g(b0kVar2, pbhVar.a(1.0f, qim0Var3, true));
            uwo1.e(str2, u291.f(qim0Var3, 1.0f), cbx.d(b0kVar2).o, u7h.b(cbx.a(b0kVar2).b.a, 0.7f, 0.0f, 0.0f, 0.0f, 14), new a0e1(5), null, 0, false, new cjc0(1), 0, null, b0kVar2, (i2 >> 3) & 14, 0, 1760);
            b0kVar2 = b0kVar2;
            op71.g(b0kVar2, pbhVar.a(0.5f, qim0Var3, true));
            cvx cvxVar6 = cbx.b(b0kVar2).b;
            d9p1.l(u291.f(u291.h(qim0Var3, 4.0f), 0.4f), b0kVar2, 0);
            op71.g(b0kVar2, pbhVar.a(2.0f, qim0Var3, true));
            d9p1.c((i2 >> 12) & 14, str5, b0kVar2, u291.f(qim0Var3, 1.0f));
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new n(str, str2, str3, str4, str5, str6, str7, qim0Var2, i, (byte) 1);
        }
    }

    public static final void j(o32 o32Var, Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2;
        xu30 xu30Var;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-477478168);
        int i2 = (b0kVar3.g(o32Var) ? 4 : 2) | i | (b0kVar3.i(function0) ? 32 : 16);
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = l1d0.i;
                b0kVar3.s0(objT);
            }
            qim0 qim0VarB = s161.b(nim0.a, true, (iu30) objT);
            boolean z = (i2 & 112) == 32;
            Object objT2 = b0kVar3.T();
            if (z || objT2 == m4cVar) {
                objT2 = new aba0(function0, (byte) 15);
                b0kVar3.s0(objT2);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT2);
            hux huxVar = o32Var.c;
            j2i j2iVar = null;
            if (huxVar == null) {
                b0kVar3.i0(379845027);
                b0kVar3.r(false);
                xu30Var = null;
            } else {
                b0kVar3.i0(379845028);
                xu30 xu30VarR = apo.r(1613303706, new g70(huxVar, (byte) 6), b0kVar3);
                b0kVar3.r(false);
                xu30Var = xu30VarR;
            }
            w32 w32Var = o32Var.d;
            if (w32Var instanceof u32) {
                j2iVar = pvi.a;
            } else if (!(w32Var instanceof v32)) {
                eg.o();
                return;
            }
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarB, null, null, false, null, null, gbxVar, null, xu30Var, null, null, null, j2iVar, null, null, apo.r(-697880532, new k2d0(o32Var, (byte) 0), b0kVar3), b0kVar2, 0, 196608, 28350);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new vx90(o32Var, function0, i, (byte) 20);
        }
    }

    public static final void k(vuv0 vuv0Var, Function0 function0, b0k b0kVar, int i) {
        vuv0 vuv0Var2;
        byte b2;
        Object next;
        String str = vuv0Var.k;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1790134263);
        int i2 = (x340Var.g(vuv0Var) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16);
        if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            vuv0Var2 = vuv0Var;
            b2 = 1;
            x340Var.b0();
        } else {
            if (str == null || ihc1.y0(str)) {
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new bct0(vuv0Var, function0, i, (byte) 0);
                    return;
                }
                return;
            }
            String str2 = vuv0Var.l;
            q7t0.d.getClass();
            t0z t0zVar = q7t0.g;
            ArrayList arrayList = new ArrayList();
            for (Object obj : t0zVar) {
                if (((q7t0) obj) != q7t0.e) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((q7t0) next).a.equals(str2));
            q7t0 q7t0Var = (q7t0) next;
            long j = q7t0Var != null ? q7t0Var.c : q7t0.e.c;
            fra fraVar = een.N0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, nim0Var);
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new hii0(function0, (byte) 10);
                x340Var.s0(objT);
            }
            qim0 qim0VarC = i541.C(qim0VarZ, (iu30) objT);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarC);
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
            long j2 = j;
            w0h1.a(wsx.c, isl.a, u291.r(nim0Var, n660.j), j2, 0L, false, x340Var, wsx.d | 48, 48);
            b2 = 1;
            uwo1.e(str, null, ktd.l(nim0Var, n660.k, x340Var, x340Var).k, j2, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            x340Var = x340Var;
            x340Var.r(true);
            vuv0Var2 = vuv0Var;
        }
        h311 h311VarV2 = x340Var.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new bct0(vuv0Var2, function0, i, b2);
        }
    }

    public static final void l(uhd1 uhd1Var, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1736636824);
        int i2 = i | (x340Var.g(uhd1Var) ? 4 : 2) | (x340Var.g(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            ld41 ld41VarG = sgc1.G(x340Var);
            Object value = uhd1Var.c.getValue();
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new hbz0(uhd1Var, (byte) 23);
                x340Var.s0(objT);
            }
            hm5.a(value, qim0Var, (iu30) objT, (tl3) null, "TabNode", (iu30) null, apo.r(866341353, new wmx0(ld41VarG, j2iVar, (byte) 1), x340Var), x340Var, (i2 & 112) | 1597440, 40);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new y46(uhd1Var, qim0Var, j2iVar, i, (byte) 6);
        }
    }

    public static final void m(tvi1 tvi1Var, iu30 iu30Var, qim0 qim0Var, aod0 aod0Var, yqg yqgVar, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(444809690);
        int i2 = i | (b0kVar3.g(tvi1Var) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | 384 | (b0kVar3.i(aod0Var) ? 2048 : 1024) | (b0kVar3.g(yqgVar) ? 16384 : 8192);
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            boolean z = ((i2 & 57344) == 16384) | ((i2 & 112) == 32);
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new sn8(iu30Var, yqgVar, (byte) 8);
                b0kVar3.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            cvx cvxVar3 = cbx.b(b0kVar3).b;
            zzq0 zzq0Var = new zzq0(16.0f, 8.0f, 0.0f, 8.0f);
            tvx tvxVarB = gto1.B(1, b0kVar3, 3);
            cvx cvxVar4 = cbx.b(b0kVar3).b;
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarF, new uvx(0, (pgx) null, 3, zzq0Var, (zzq0) null, tvx.a(tvxVarB, 2.0f, 6), (hw61) null, 1, (p3v) null, 339), null, false, null, null, gbxVar, null, null, apo.r(-597138799, new vvi1(tvi1Var, (byte) 0), b0kVar3), null, apo.r(-785907438, new vvi1(tvi1Var, (byte) 1), b0kVar3), apo.r(704661267, new sgi1(aod0Var, tvi1Var, (byte) 3), b0kVar3), null, null, apo.r(881400086, new vvi1(tvi1Var, (byte) 2), b0kVar3), b0kVar2, 805306432, 197040, 26044);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new tte1((byte) 11, i, tvi1Var, iu30Var, qim0Var2, aod0Var, yqgVar);
        }
    }

    public static final void n(int i, String str, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2141699044);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarR = u291.r(qim0Var3, 48.0f);
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarQ = i1p1.q(qim0VarR, er31.b(4.0f));
            Uri uri = Uri.parse(str);
            fwx fwxVarG = hso1.G(box.c, 0L, 0L, x340Var, box.d, 30);
            eso1.e(uri, isl.a, qim0VarQ, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, new pux(fwxVarG, fwxVarG), false, false, x340Var, 1073766448, 0, 3560);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uo50(str, qim0Var2, i, (byte) 28);
        }
    }

    public static final o571 o(String str) {
        Object next;
        idd1 idd1Var = o571.c;
        Iterator it = jyo1.i().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((o571) next).a.equals(str)) {
                return (o571) next;
            }
        }
        next = null;
        return (o571) next;
    }

    public static final int[] p(String str, List list) {
        k9p1 k9p1Var = new k9p1(str, (byte) 13);
        int[] iArr = ha71.a;
        List listT = ha71.t(k9p1Var, list, iArr);
        List f670Var = listT.isEmpty() ? Collections.EMPTY_LIST : new f670(listT, (byte) 1);
        Object obj = iArr;
        if (!f670Var.isEmpty()) {
            obj = f670Var.get(0);
        }
        return (int[]) obj;
    }

    public static boolean q(Uri uri) {
        if (uri == null) {
            return false;
        }
        return (!r(uri) && ggo1.K(uri.toString()) == null && xpn1.w(String.valueOf(uri)) == null) ? false : true;
    }

    public static boolean r(Uri uri) {
        if (uri == null) {
            return false;
        }
        if (u890.j(uri.getHost(), "auth-callback.spotify.com")) {
            return true;
        }
        return u890.j(uri.getHost(), "callback") && u890.j(uri.getScheme(), "spotify-auth-music");
    }

    public static nyo1 s(Uri uri) {
        if (xpn1.w(String.valueOf(uri)) != null) {
            bpn0 bpn0VarW = xpn1.w(uri.toString());
            if (bpn0VarW != null) {
                return new bm8(bpn0VarW.a, bpn0VarW.b, bpn0VarW.c, bpn0VarW.d);
            }
        } else if (ggo1.K(uri.toString()) != null) {
            hxw hxwVarK = ggo1.K(uri.toString());
            if (hxwVarK != null) {
                return new am8(hxwVarK.a, hxwVarK.b, hxwVarK.c);
            }
        } else if (r(uri)) {
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
                int iHashCode = lastPathSegment.hashCode();
                if (iHashCode != -902467304) {
                    if (iHashCode != 103149417) {
                        if (iHashCode == 1146808681 && lastPathSegment.equals("request-magiclink")) {
                            return new zl8(uri.getQueryParameter("email"));
                        }
                    } else if (lastPathSegment.equals("login")) {
                        String queryParameter = uri.getQueryParameter("interactRef");
                        if (queryParameter == null) {
                            queryParameter = uri.getQueryParameter("interact_ref");
                        }
                        String queryParameter2 = uri.getQueryParameter("hash");
                        if (queryParameter != null && queryParameter2 != null) {
                            return new yl8(queryParameter, queryParameter2);
                        }
                        eg.m("Missing parameters for login challenge");
                        return null;
                    }
                } else if (lastPathSegment.equals("signup")) {
                    String queryParameter3 = uri.getQueryParameter("sessionId");
                    if (queryParameter3 != null) {
                        return new cm8(queryParameter3);
                    }
                    eg.m("Missing parameters for signup challenge");
                    return null;
                }
            }
            eg.m("Unhandled authentication callback URI");
            return null;
        }
        Logger.d(uri + " is not a valid authentication URI", new Object[0]);
        return xl8.c;
    }

    public static final LinkedHashSet t(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj instanceof n4z0) {
                arrayList.add(obj);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            r7h.W(((n4z0) it.next()).b, linkedHashSet);
        }
        return linkedHashSet;
    }

    public static List u(String str) {
        if (str == null) {
            return z6x.a;
        }
        List listQ0 = ihc1.Q0(str, new String[]{"\n"}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listQ0) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final iy10 v(xvl1 xvl1Var) {
        int iOrdinal = xvl1Var.b.ordinal();
        if (iOrdinal != 2) {
            return (iOrdinal == 3 || iOrdinal == 5) ? gy10.a : hy10.a;
        }
        return new fy10(xvl1Var.d.c("ticket_key"));
    }

    public static final ArrayList w(List list, LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            evb1 evb1Var = (evb1) obj;
            if (!evb1Var.d.isEmpty()) {
                List list2 = evb1Var.d;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (linkedHashSet.contains((String) it.next())) {
                        }
                    }
                }
            }
            arrayList.add(obj);
        }
        return arrayList;
    }
}
