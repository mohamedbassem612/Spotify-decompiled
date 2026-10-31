package p;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Single;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class r4p1 {
    public static b180 a;
    public static b180 b;

    public static final void a(t71 t71Var, iu30 iu30Var, uk81 uk81Var, spv spvVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-371798102);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(t71Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(uk81Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(spvVar) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            Object objT = x340Var.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = new kse0(new qj(iu30Var, (byte) 20));
                x340Var.s0(objT);
            }
            kse0 kse0Var = (kse0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == obj) {
                objT2 = new f9t0(new qj(iu30Var, (byte) 21), true);
                x340Var.s0(objT2);
            }
            f9t0 f9t0Var = (f9t0) objT2;
            Object objT3 = x340Var.T();
            if (objT3 == obj) {
                objT3 = new fgg0();
                x340Var.s0(objT3);
            }
            fgg0 fgg0Var = (fgg0) objT3;
            kiv kivVar = vvx.a;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            mod.b(kivVar.a(new uvx(0, (pgx) null, 0, (vzq0) null, uyn1.h(2, 4.0f, 0.0f), (tvx) null, (hw61) null, 0, (p3v) null, 495)), apo.r(614433898, new k40(uk81Var, t71Var, kse0Var, spvVar, fgg0Var, f9t0Var), x340Var), x340Var, 56);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hy0((byte) 1, i, t71Var, iu30Var, uk81Var, spvVar, qim0Var2);
        }
    }

    public static final void b(uoa uoaVar, float f, qim0 qim0Var, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1588246112);
        int i2 = (x340Var.i(uoaVar) ? 4 : 2) | i | (x340Var.d(f) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean zI = x340Var.i(uoaVar);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new cu0(uoaVar, (byte) 2);
                x340Var.s0(objT);
            }
            iu30 iu30Var = (iu30) objT;
            qim0 qim0VarH = u291.h(u291.f(qim0Var, 1.0f), f);
            boolean zI2 = x340Var.i(uoaVar);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new cu0(uoaVar, (byte) 3);
                x340Var.s0(objT2);
            }
            dm5.b(iu30Var, qim0VarH, (iu30) null, (iu30) objT2, (iu30) null, x340Var, 0, 20);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gf(uoaVar, f, qim0Var, i, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004d  */
    /* JADX WARN: Code duplicated, block: B:24:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x007e  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:44:0x0110  */
    /* JADX WARN: Code duplicated, block: B:46:0x013a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0144  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:33:0x007e, please report this as an issue */
    public static final void c(n6r n6rVar, qim0 qim0Var, String str, b0k b0kVar, int i, int i2) {
        String str2;
        boolean z;
        String str3;
        h311 h311VarV;
        Locale locale;
        boolean zF;
        Object objT;
        List listQ0;
        Object obj;
        pe30 pe30Var;
        boolean zG;
        Object objT2;
        m4c m4cVar = fkj0.X;
        long j = n6rVar.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(204678222);
        int i3 = (x340Var.i(n6rVar) ? 4 : 2) | i | (x340Var.g(qim0Var) ? 32 : 16);
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                str2 = str;
                i3 |= x340Var.g(str2) ? 256 : 128;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                if (i4 != 0) {
                    str3 = "DateOverlayTestTag";
                } else {
                    str3 = str2;
                }
                locale = ((Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a)).getLocales().get(0);
                zF = x340Var.f(j) | x340Var.g(locale);
                objT = x340Var.T();
                if (zF || objT == m4cVar) {
                    locale.getClass();
                    Date date = new Date(j * 1000);
                    listQ0 = ihc1.Q0(new SimpleDateFormat("MMM dd", locale).format(date), new String[]{" "}, 0, 6);
                    if (listQ0.size() > 0) {
                        obj = listQ0.get(0);
                    } else {
                        obj = "";
                    }
                    pe30 pe30Var2 = new pe30((String) obj, (String) (1 < listQ0.size() ? listQ0.get(1) : ""), new SimpleDateFormat("yyyy", locale).format(date), new SimpleDateFormat("d MMMM yyyy", locale).format(date));
                    x340Var.s0(pe30Var2);
                    objT = pe30Var2;
                }
                pe30Var = (pe30) objT;
                long jK = f5p1.k(x340Var, 2131101282);
                float fM = dsa0.m(x340Var, 2131165620);
                float fM2 = dsa0.m(x340Var, 2131165621);
                float fM3 = dsa0.m(x340Var, 2131165619);
                qim0 qim0VarF = dug.f(u291.d(qim0Var, 1.0f), jK, d4o1.a);
                zG = x340Var.g(pe30Var);
                objT2 = x340Var.T();
                if (zG || objT2 == m4cVar) {
                    objT2 = new m4r(pe30Var, (byte) 3);
                    x340Var.s0(objT2);
                }
                w2g0.c(anm1.N(str3, s161.b(qim0VarF, false, (iu30) objT2)), een.h, apo.r(319430180, new o6r(fM, pe30Var, fM3, fM2), x340Var), x340Var, 3120, 4);
            } else {
                x340Var.b0();
                str3 = str2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new dg6(n6rVar, qim0Var, str3, i, i2, (byte) 3);
            }
        }
        i3 |= 384;
        str2 = str;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            if (i4 != 0) {
                str3 = "DateOverlayTestTag";
            } else {
                str3 = str2;
            }
            locale = ((Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a)).getLocales().get(0);
            zF = x340Var.f(j) | x340Var.g(locale);
            objT = x340Var.T();
            if (zF) {
                locale.getClass();
                Date date2 = new Date(j * 1000);
                listQ0 = ihc1.Q0(new SimpleDateFormat("MMM dd", locale).format(date2), new String[]{" "}, 0, 6);
                if (listQ0.size() > 0) {
                    obj = listQ0.get(0);
                } else {
                    obj = "";
                }
                pe30 pe30Var3 = new pe30((String) obj, (String) (1 < listQ0.size() ? listQ0.get(1) : ""), new SimpleDateFormat("yyyy", locale).format(date2), new SimpleDateFormat("d MMMM yyyy", locale).format(date2));
                x340Var.s0(pe30Var3);
                objT = pe30Var3;
            } else {
                locale.getClass();
                Date date3 = new Date(j * 1000);
                listQ0 = ihc1.Q0(new SimpleDateFormat("MMM dd", locale).format(date3), new String[]{" "}, 0, 6);
                if (listQ0.size() > 0) {
                    obj = listQ0.get(0);
                } else {
                    obj = "";
                }
                pe30 pe30Var4 = new pe30((String) obj, (String) (1 < listQ0.size() ? listQ0.get(1) : ""), new SimpleDateFormat("yyyy", locale).format(date3), new SimpleDateFormat("d MMMM yyyy", locale).format(date3));
                x340Var.s0(pe30Var4);
                objT = pe30Var4;
            }
            pe30Var = (pe30) objT;
            long jK2 = f5p1.k(x340Var, 2131101282);
            float fM4 = dsa0.m(x340Var, 2131165620);
            float fM5 = dsa0.m(x340Var, 2131165621);
            float fM6 = dsa0.m(x340Var, 2131165619);
            qim0 qim0VarF2 = dug.f(u291.d(qim0Var, 1.0f), jK2, d4o1.a);
            zG = x340Var.g(pe30Var);
            objT2 = x340Var.T();
            if (zG) {
                objT2 = new m4r(pe30Var, (byte) 3);
                x340Var.s0(objT2);
            } else {
                objT2 = new m4r(pe30Var, (byte) 3);
                x340Var.s0(objT2);
            }
            w2g0.c(anm1.N(str3, s161.b(qim0VarF2, false, (iu30) objT2)), een.h, apo.r(319430180, new o6r(fM4, pe30Var, fM6, fM5), x340Var), x340Var, 3120, 4);
        } else {
            x340Var.b0();
            str3 = str2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dg6(n6rVar, qim0Var, str3, i, i2, (byte) 3);
        }
    }

    public static final void d(pe30 pe30Var, float f, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(720174720);
        int i2 = i | (x340Var.g(pe30Var) ? 4 : 2) | (x340Var.d(f) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).b.a;
            float f2 = f / 2.0f;
            mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var, 54);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwo1.e(pe30Var.a, eqr0.D(0.0f, -f2, 1, nim0Var), cbx.d(x340Var).j, j, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
            uwo1.e(pe30Var.b, null, cbx.d(x340Var).e, j, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2018);
            uwo1.e(pe30Var.c, eqr0.D(0.0f, f2, 1, nim0Var), cbx.d(x340Var).j, j, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p6r(pe30Var, f, i, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x005b  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x0081  */
    /* JADX WARN: Code duplicated, block: B:44:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x009c A[PHI: r4 r7 r17
      0x009c: PHI (r4v8 p.qim0) = (r4v4 p.qim0), (r4v10 p.qim0) binds: [B:59:0x00b0, B:50:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x009c: PHI (r7v19 int) = (r7v4 int), (r7v20 int) binds: [B:59:0x00b0, B:50:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x009c: PHI (r17v3 p.pgx) = (r17v0 p.pgx), (r17v4 p.pgx) binds: [B:59:0x00b0, B:50:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:63:0x0104  */
    /* JADX WARN: Code duplicated, block: B:64:0x0106  */
    /* JADX WARN: Code duplicated, block: B:67:0x010d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0111  */
    /* JADX WARN: Code duplicated, block: B:72:0x0123  */
    /* JADX WARN: Code duplicated, block: B:73:0x0188  */
    /* JADX WARN: Code duplicated, block: B:75:0x018e  */
    /* JADX WARN: Code duplicated, block: B:78:0x019c  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    public static final void e(cs11 cs11Var, qim0 qim0Var, pgx pgxVar, int i, iu30 iu30Var, b0k b0kVar, int i2, int i3) {
        qim0 qim0Var2;
        int i4;
        pgx pgxVar2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        byte b2;
        byte b3;
        boolean z;
        b0k b0kVar2;
        qim0 qim0Var3;
        pgx pgxVar3;
        int i11;
        h311 h311VarV;
        qim0 qim0Var4;
        int i12;
        pgx pgxVar4;
        int i13;
        qim0 qim0VarN;
        byte b4;
        uvx uvxVarA;
        pgx pgxVar5;
        boolean z2;
        Object objT;
        Function0 function0;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1511951437);
        byte b5 = 2;
        int i14 = (b0kVar3.g(cs11Var) ? 4 : 2) | i2;
        int i15 = i3 & 2;
        if (i15 != 0) {
            i4 = i14 | 48;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i4 = i14 | (b0kVar3.i(qim0Var2) ? 32 : 16);
        }
        if ((i3 & 4) == 0) {
            pgxVar2 = pgxVar;
            int i16 = b0kVar3.i(pgxVar2) ? 256 : 128;
            i5 = i4 | i16;
            i6 = i3 & 8;
            if (i6 != 0) {
                if ((i2 & 3072) == 0) {
                    i7 = i;
                    if (b0kVar3.e(i7)) {
                        i8 = 2048;
                    } else {
                        i8 = 1024;
                    }
                    i5 |= i8;
                }
                if (b0kVar3.i(iu30Var)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i10 = i5 | i9;
                b2 = 0;
                b3 = 1;
                if ((i10 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i10 & 1, z)) {
                    b0kVar3.d0();
                    if ((i2 & 1) != 0 || b0kVar3.E()) {
                        if (i15 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if ((i3 & 4) != 0) {
                            i10 &= -897;
                            pgxVar2 = ngx.e;
                        }
                        i12 = i10;
                        pgxVar4 = pgxVar2;
                        if (i6 != 0) {
                            i13 = 1;
                        }
                        b0kVar3.s();
                        qim0VarN = anm1.N("release_row", u291.f(qim0Var4, 1.0f));
                        uvx uvxVar = (uvx) b0kVar3.k(vvx.a);
                        b4 = 3;
                        zzq0 zzq0VarP = gto1.p(3, b0kVar3, 5);
                        uwr uwrVar = cbx.a;
                        cvx cvxVar = cbx.b(b0kVar3).b;
                        p3v p3vVar = new p3v(16.0f);
                        uvxVarA = uvx.a(uvxVar, pgxVar4, 5, new axq0(p3vVar, (p3v) null, p3vVar, (p3v) null, zzq0VarP), (vzq0) null, (tvx) null, (p3v) null, 497);
                        pgxVar5 = pgxVar4;
                        if ((i12 & 57344) == 16384) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objT = b0kVar3.T();
                        if (z2 || objT == fkj0.X) {
                            objT = new dv11(iu30Var, (byte) 0);
                            b0kVar3.s0(objT);
                        }
                        function0 = (Function0) objT;
                        if (ihc1.y0("Open release")) {
                            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                            return;
                        }
                        b0kVar2 = b0kVar3;
                        jto1.b(qim0VarN, uvxVarA, null, false, null, null, new gbx(new y50("Open release"), function0), null, null, apo.r(-965842122, new ev11(cs11Var, b2), b0kVar3), apo.r(2085536438, new ev11(cs11Var, b3), b0kVar3), apo.r(428530197, new ev11(cs11Var, b5), b0kVar3), apo.r(-1228476044, new ev11(cs11Var, b4), b0kVar3), null, null, apo.r(-1904527471, new fv11(cs11Var, i13), b0kVar3), b0kVar2, 805306432, 197046, 25020);
                        qim0 qim0Var5 = qim0Var4;
                        i11 = i13;
                        qim0Var3 = qim0Var5;
                        pgxVar3 = pgxVar5;
                    } else {
                        b0kVar3.b0();
                        if ((i3 & 4) != 0) {
                            i10 &= -897;
                        }
                        qim0Var4 = qim0Var2;
                        pgxVar4 = pgxVar2;
                        i12 = i10;
                    }
                    i13 = i7;
                    b0kVar3.s();
                    qim0VarN = anm1.N("release_row", u291.f(qim0Var4, 1.0f));
                    uvx uvxVar2 = (uvx) b0kVar3.k(vvx.a);
                    b4 = 3;
                    zzq0 zzq0VarP2 = gto1.p(3, b0kVar3, 5);
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar2 = cbx.b(b0kVar3).b;
                    p3v p3vVar2 = new p3v(16.0f);
                    uvxVarA = uvx.a(uvxVar2, pgxVar4, 5, new axq0(p3vVar2, (p3v) null, p3vVar2, (p3v) null, zzq0VarP2), (vzq0) null, (tvx) null, (p3v) null, 497);
                    pgxVar5 = pgxVar4;
                    if ((i12 & 57344) == 16384) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objT = b0kVar3.T();
                    if (z2) {
                        objT = new dv11(iu30Var, (byte) 0);
                        b0kVar3.s0(objT);
                    } else {
                        objT = new dv11(iu30Var, (byte) 0);
                        b0kVar3.s0(objT);
                    }
                    function0 = (Function0) objT;
                    if (ihc1.y0("Open release")) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return;
                    }
                    b0kVar2 = b0kVar3;
                    jto1.b(qim0VarN, uvxVarA, null, false, null, null, new gbx(new y50("Open release"), function0), null, null, apo.r(-965842122, new ev11(cs11Var, b2), b0kVar3), apo.r(2085536438, new ev11(cs11Var, b3), b0kVar3), apo.r(428530197, new ev11(cs11Var, b5), b0kVar3), apo.r(-1228476044, new ev11(cs11Var, b4), b0kVar3), null, null, apo.r(-1904527471, new fv11(cs11Var, i13), b0kVar3), b0kVar2, 805306432, 197046, 25020);
                    qim0 qim0Var6 = qim0Var4;
                    i11 = i13;
                    qim0Var3 = qim0Var6;
                    pgxVar3 = pgxVar5;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var3 = qim0Var2;
                    pgxVar3 = pgxVar2;
                    i11 = i7;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new gv11(cs11Var, qim0Var3, pgxVar3, i11, iu30Var, i2, i3);
                }
            }
            i5 |= 3072;
            i7 = i;
            if (b0kVar3.i(iu30Var)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i10 = i5 | i9;
            b2 = 0;
            b3 = 1;
            if ((i10 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i10 & 1, z)) {
                b0kVar3.d0();
                if ((i2 & 1) != 0) {
                    if (i15 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if ((i3 & 4) != 0) {
                        i10 &= -897;
                        pgxVar2 = ngx.e;
                    }
                    i12 = i10;
                    pgxVar4 = pgxVar2;
                    if (i6 != 0) {
                        i13 = 1;
                    } else {
                        i13 = i7;
                    }
                } else {
                    if (i15 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if ((i3 & 4) != 0) {
                        i10 &= -897;
                        pgxVar2 = ngx.e;
                    }
                    i12 = i10;
                    pgxVar4 = pgxVar2;
                    if (i6 != 0) {
                        i13 = 1;
                    } else {
                        i13 = i7;
                    }
                }
                b0kVar3.s();
                qim0VarN = anm1.N("release_row", u291.f(qim0Var4, 1.0f));
                uvx uvxVar3 = (uvx) b0kVar3.k(vvx.a);
                b4 = 3;
                zzq0 zzq0VarP3 = gto1.p(3, b0kVar3, 5);
                uwr uwrVar3 = cbx.a;
                cvx cvxVar3 = cbx.b(b0kVar3).b;
                p3v p3vVar3 = new p3v(16.0f);
                uvxVarA = uvx.a(uvxVar3, pgxVar4, 5, new axq0(p3vVar3, (p3v) null, p3vVar3, (p3v) null, zzq0VarP3), (vzq0) null, (tvx) null, (p3v) null, 497);
                pgxVar5 = pgxVar4;
                if ((i12 & 57344) == 16384) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objT = b0kVar3.T();
                if (z2) {
                    objT = new dv11(iu30Var, (byte) 0);
                    b0kVar3.s0(objT);
                } else {
                    objT = new dv11(iu30Var, (byte) 0);
                    b0kVar3.s0(objT);
                }
                function0 = (Function0) objT;
                if (ihc1.y0("Open release")) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                b0kVar2 = b0kVar3;
                jto1.b(qim0VarN, uvxVarA, null, false, null, null, new gbx(new y50("Open release"), function0), null, null, apo.r(-965842122, new ev11(cs11Var, b2), b0kVar3), apo.r(2085536438, new ev11(cs11Var, b3), b0kVar3), apo.r(428530197, new ev11(cs11Var, b5), b0kVar3), apo.r(-1228476044, new ev11(cs11Var, b4), b0kVar3), null, null, apo.r(-1904527471, new fv11(cs11Var, i13), b0kVar3), b0kVar2, 805306432, 197046, 25020);
                qim0 qim0Var7 = qim0Var4;
                i11 = i13;
                qim0Var3 = qim0Var7;
                pgxVar3 = pgxVar5;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var3 = qim0Var2;
                pgxVar3 = pgxVar2;
                i11 = i7;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new gv11(cs11Var, qim0Var3, pgxVar3, i11, iu30Var, i2, i3);
            }
        }
        pgxVar2 = pgxVar;
        i5 = i4 | i16;
        i6 = i3 & 8;
        if (i6 != 0) {
            if ((i2 & 3072) == 0) {
                i7 = i;
                if (b0kVar3.e(i7)) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i5 |= i8;
            }
            if (b0kVar3.i(iu30Var)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i10 = i5 | i9;
            b2 = 0;
            b3 = 1;
            if ((i10 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i10 & 1, z)) {
                b0kVar3.d0();
                if ((i2 & 1) != 0) {
                    if (i15 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if ((i3 & 4) != 0) {
                        i10 &= -897;
                        pgxVar2 = ngx.e;
                    }
                    i12 = i10;
                    pgxVar4 = pgxVar2;
                    if (i6 != 0) {
                        i13 = 1;
                    } else {
                        i13 = i7;
                    }
                } else {
                    if (i15 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if ((i3 & 4) != 0) {
                        i10 &= -897;
                        pgxVar2 = ngx.e;
                    }
                    i12 = i10;
                    pgxVar4 = pgxVar2;
                    if (i6 != 0) {
                        i13 = 1;
                    } else {
                        i13 = i7;
                    }
                }
                b0kVar3.s();
                qim0VarN = anm1.N("release_row", u291.f(qim0Var4, 1.0f));
                uvx uvxVar4 = (uvx) b0kVar3.k(vvx.a);
                b4 = 3;
                zzq0 zzq0VarP4 = gto1.p(3, b0kVar3, 5);
                uwr uwrVar4 = cbx.a;
                cvx cvxVar4 = cbx.b(b0kVar3).b;
                p3v p3vVar4 = new p3v(16.0f);
                uvxVarA = uvx.a(uvxVar4, pgxVar4, 5, new axq0(p3vVar4, (p3v) null, p3vVar4, (p3v) null, zzq0VarP4), (vzq0) null, (tvx) null, (p3v) null, 497);
                pgxVar5 = pgxVar4;
                if ((i12 & 57344) == 16384) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objT = b0kVar3.T();
                if (z2) {
                    objT = new dv11(iu30Var, (byte) 0);
                    b0kVar3.s0(objT);
                } else {
                    objT = new dv11(iu30Var, (byte) 0);
                    b0kVar3.s0(objT);
                }
                function0 = (Function0) objT;
                if (ihc1.y0("Open release")) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                b0kVar2 = b0kVar3;
                jto1.b(qim0VarN, uvxVarA, null, false, null, null, new gbx(new y50("Open release"), function0), null, null, apo.r(-965842122, new ev11(cs11Var, b2), b0kVar3), apo.r(2085536438, new ev11(cs11Var, b3), b0kVar3), apo.r(428530197, new ev11(cs11Var, b5), b0kVar3), apo.r(-1228476044, new ev11(cs11Var, b4), b0kVar3), null, null, apo.r(-1904527471, new fv11(cs11Var, i13), b0kVar3), b0kVar2, 805306432, 197046, 25020);
                qim0 qim0Var8 = qim0Var4;
                i11 = i13;
                qim0Var3 = qim0Var8;
                pgxVar3 = pgxVar5;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var3 = qim0Var2;
                pgxVar3 = pgxVar2;
                i11 = i7;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new gv11(cs11Var, qim0Var3, pgxVar3, i11, iu30Var, i2, i3);
            }
        }
        i5 |= 3072;
        i7 = i;
        if (b0kVar3.i(iu30Var)) {
            i9 = 16384;
        } else {
            i9 = 8192;
        }
        i10 = i5 | i9;
        b2 = 0;
        b3 = 1;
        if ((i10 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i10 & 1, z)) {
            b0kVar3.d0();
            if ((i2 & 1) != 0) {
                if (i15 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if ((i3 & 4) != 0) {
                    i10 &= -897;
                    pgxVar2 = ngx.e;
                }
                i12 = i10;
                pgxVar4 = pgxVar2;
                if (i6 != 0) {
                    i13 = 1;
                } else {
                    i13 = i7;
                }
            } else {
                if (i15 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if ((i3 & 4) != 0) {
                    i10 &= -897;
                    pgxVar2 = ngx.e;
                }
                i12 = i10;
                pgxVar4 = pgxVar2;
                if (i6 != 0) {
                    i13 = 1;
                } else {
                    i13 = i7;
                }
            }
            b0kVar3.s();
            qim0VarN = anm1.N("release_row", u291.f(qim0Var4, 1.0f));
            uvx uvxVar5 = (uvx) b0kVar3.k(vvx.a);
            b4 = 3;
            zzq0 zzq0VarP5 = gto1.p(3, b0kVar3, 5);
            uwr uwrVar5 = cbx.a;
            cvx cvxVar5 = cbx.b(b0kVar3).b;
            p3v p3vVar5 = new p3v(16.0f);
            uvxVarA = uvx.a(uvxVar5, pgxVar4, 5, new axq0(p3vVar5, (p3v) null, p3vVar5, (p3v) null, zzq0VarP5), (vzq0) null, (tvx) null, (p3v) null, 497);
            pgxVar5 = pgxVar4;
            if ((i12 & 57344) == 16384) {
                z2 = true;
            } else {
                z2 = false;
            }
            objT = b0kVar3.T();
            if (z2) {
                objT = new dv11(iu30Var, (byte) 0);
                b0kVar3.s0(objT);
            } else {
                objT = new dv11(iu30Var, (byte) 0);
                b0kVar3.s0(objT);
            }
            function0 = (Function0) objT;
            if (ihc1.y0("Open release")) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarN, uvxVarA, null, false, null, null, new gbx(new y50("Open release"), function0), null, null, apo.r(-965842122, new ev11(cs11Var, b2), b0kVar3), apo.r(2085536438, new ev11(cs11Var, b3), b0kVar3), apo.r(428530197, new ev11(cs11Var, b5), b0kVar3), apo.r(-1228476044, new ev11(cs11Var, b4), b0kVar3), null, null, apo.r(-1904527471, new fv11(cs11Var, i13), b0kVar3), b0kVar2, 805306432, 197046, 25020);
            qim0 qim0Var9 = qim0Var4;
            i11 = i13;
            qim0Var3 = qim0Var9;
            pgxVar3 = pgxVar5;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var3 = qim0Var2;
            pgxVar3 = pgxVar2;
            i11 = i7;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new gv11(cs11Var, qim0Var3, pgxVar3, i11, iu30Var, i2, i3);
        }
    }

    public static final void f(pe30 pe30Var, float f, b0k b0kVar, int i) {
        byte b2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(993669406);
        int i2 = i | (x340Var.g(pe30Var) ? 4 : 2) | (x340Var.d(f) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).b.a;
            mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var, 54);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwo1.e(pe30Var.a, eqr0.D(0.0f, f, 1, nim0Var), cbx.d(x340Var).m, j, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
            uwo1.e(pe30Var.b, null, cbx.d(x340Var).h, j, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2018);
            b2 = 1;
            uwo1.e(pe30Var.c, eqr0.D(0.0f, -f, 1, nim0Var), cbx.d(x340Var).m, j, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
            x340Var.r(true);
        } else {
            b2 = 1;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p6r(pe30Var, f, i, b2);
        }
    }

    public static final void g(hwj1 hwj1Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        jax haxVar;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-490022480);
        if ((i & 6) == 0) {
            i2 = i | (b0kVar3.g(hwj1Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(function0) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (b0kVar3.Y(i3 & 1, (i3 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("video_quality_selection_entry_point_row", qim0Var3);
            if (hwj1Var.a) {
                b0kVar3.i0(334391161);
                b0kVar3.r(false);
                haxVar = jax.a;
            } else {
                b0kVar3.i0(334426284);
                haxVar = new hax(cwl1.o0(b0kVar3, 2131963780));
                b0kVar3.r(false);
            }
            String strO0 = cwl1.o0(b0kVar3, 2131963778);
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new mah1(hwj1Var, function0, (byte) 28);
                b0kVar3.s0(objT);
            }
            Function0 function1 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                b0kVar2 = b0kVar3;
                jto1.b(qim0VarN, null, haxVar, false, null, null, new gbx(new y50(strO0), function1), null, tqj.a, null, null, apo.r(-446493832, new g2j1(hwj1Var, (byte) 12), b0kVar3), tqj.b, null, null, tqj.c, b0kVar2, 100663296, 197040, 26298);
                qim0Var2 = qim0Var3;
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ixi1((byte) 9, i, hwj1Var, qim0Var2, function0);
        }
    }

    public static void h(Context context, TextView textView, String str) {
        int i;
        String upperCase = str.toUpperCase(Locale.US);
        upperCase.getClass();
        switch (upperCase) {
            case "LYRICS":
                i = 5;
                break;
            case "EXPLICIT":
                i = 2;
                break;
            case "19":
                i = 3;
                break;
            case "PREMIUM":
                i = 4;
                break;
            default:
                i = 1;
                break;
        }
        int iC = l1d.C(i);
        if (iC == 1) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            i(context, textView, (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) ? "E" : "EXPLICIT", 2);
        } else if (iC == 2) {
            i(context, textView, "19", 3);
        } else if (iC != 3) {
            i(context, textView, str, i);
        } else {
            i(context, textView, "PREMIUM", 4);
        }
    }

    public static void i(Context context, TextView textView, String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        CharSequence text = textView.getText();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence charSequenceY = y(text.subSequence(0, 0));
        CharSequence charSequenceY2 = y(text.subSequence(0, text.length()));
        if (!TextUtils.isEmpty(charSequenceY)) {
            spannableStringBuilder.append(charSequenceY);
            spannableStringBuilder.append(' ');
        }
        spannableStringBuilder.append((CharSequence) str);
        if (!TextUtils.isEmpty(charSequenceY2)) {
            spannableStringBuilder.append(' ');
            spannableStringBuilder.append(charSequenceY2);
        }
        spannableStringBuilder.setSpan(i != 3 ? new gx40(context, 2130970028, a8o.y(3.0f, context.getResources())) : new gx40(context, 2130970027, a8o.y(4.0f, context.getResources())), 0, str.length(), 33);
        textView.setText(spannableStringBuilder);
    }

    public static final huz j(zcd zcdVar, iu30 iu30Var) {
        return m(zcdVar, iu30Var);
    }

    public static final mr20 k(mr20 mr20Var, long j) {
        if (j >= 0) {
            return j == 0 ? mr20Var : m(mr20Var, new gc4((byte) 4, j));
        }
        hhg1.n("Debounce timeout should not be negative");
        return null;
    }

    public static final huz l(mr20 mr20Var, iu30 iu30Var) {
        return m(mr20Var, new dqc(iu30Var, (byte) 2));
    }

    public static final huz m(mr20 mr20Var, iu30 iu30Var) {
        return new huz(new ys20(iu30Var, mr20Var, (lnm) null), (byte) 6);
    }

    public static final float n(Layout layout, int i, Paint paint) {
        float lineLeft = layout.getLineLeft(i);
        ThreadLocal threadLocal = bae1.a;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment == null ? -1 : q980.a[paragraphAlignment.ordinal()]) == 1) {
            return c13.d(layout.getWidth(), fMeasureText, 2.0f, Math.abs(lineLeft));
        }
        return (layout.getWidth() - fMeasureText) + Math.abs(lineLeft);
    }

    public static final float p(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = bae1.a;
        if (layout.getEllipsisCount(i) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment != null ? q980.a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object r(zeu0 zeu0Var, String str, onm onmVar) {
        afu0 afu0Var;
        if (onmVar instanceof afu0) {
            afu0Var = (afu0) onmVar;
            int i = afu0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                afu0Var.c = i - Integer.MIN_VALUE;
            } else {
                afu0Var = new afu0(onmVar);
            }
        } else {
            afu0Var = new afu0(onmVar);
        }
        Object objJ = afu0Var.b;
        int i2 = afu0Var.c;
        boolean z = false;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                Single singleZ = zeu0Var.c().z();
                afu0Var.a = str;
                afu0Var.c = 1;
                objJ = fc11.j(singleZ, afu0Var);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = afu0Var.a;
                hm5.M(objJ);
            }
            PlayerState playerState = (PlayerState) objJ;
            if (u890.j(playerState.contextUri(), str) && u890.j(playerState.contextMetadata().get("player.arch"), "3")) {
                z = true;
            }
        } catch (Throwable unused) {
        }
        return Boolean.valueOf(z);
    }

    public static final boolean s(String str) {
        return nzy.g(str) || nzy.c(str) || nzy.a(str) || nzy.f(str) || nzy.d(str);
    }

    public static final Set t(xx71 xx71Var, Set set) {
        List list = xx71Var.d;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((wx71) it.next()).e);
        }
        ArrayList<String> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (s((String) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (String str : arrayList2) {
            Set set2 = s4b1.f;
            String strZ = uic.x(str).z();
            if (strZ != null) {
                arrayList3.add(strZ);
            }
        }
        Set setV0 = dm61.v0(o7h.p1(arrayList3), set);
        return setV0.isEmpty() ? w7x.a : Collections.singleton(new tw71(setV0));
    }

    public static bqk0 u() {
        return new bqk0((byte) 4);
    }

    public static final huz v(mr20 mr20Var, long j) {
        return w(mr20Var, j);
    }

    public static final huz w(mr20 mr20Var, long j) {
        return new huz(new dt20(j, mr20Var, (lnm) null), (byte) 6);
    }

    public static final lw71 x(xx71 xx71Var) {
        String str = xx71Var.a;
        ew71 ew71Var = xx71Var.j;
        return new lw71(str, ew71Var != null ? ew71Var.e : null, xx71Var.k.c, xx71Var.l);
    }

    public static CharSequence y(CharSequence charSequence) {
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zIsWhitespace = Character.isWhitespace(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zIsWhitespace) {
                    break;
                }
                length--;
            } else if (zIsWhitespace) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }
}
