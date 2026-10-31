package p;

import android.graphics.Bitmap;
import android.hardware.camera2.CameraDevice;
import android.net.Uri;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaDescriptionCompat;
import android.view.View;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.comscore.android.ConnectivityType;
import com.spotify.concertcampaignview.v1.CtaType;
import com.spotify.mediabrowserservice.mediabrowserservice.SpotifyMediaBrowserService;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class kqn1 {
    public static final String[] a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] b = {44100, 48000, 32000};
    public static final int[] c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] f = {32000, ConnectivityType.UNKNOWN, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] g = {8000, 16000, 24000, 32000, ConnectivityType.UNKNOWN, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};
    public static b180 h;

    public static final void a(int i, String str, b0k b0kVar, qim0 qim0Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1339929230);
        if ((i & 6) == 0) {
            i2 = (x340Var.g("19") ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(str) ? 256 : 128;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            qim0 qim0VarU = u291.u(qim0Var, 12.0f, 12.0f, 0.0f, 0.0f, 12);
            boolean z = (((i3 & 896) ^ 384) > 256 && x340Var.g(str)) || (i3 & 384) == 256;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new kak(str, (byte) 16);
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarU, false, (iu30) objT);
            uwr uwrVar = cbx.a;
            qim0 qim0VarE = d1u.E(0.9f, cbx.a(x340Var).b.d, qim0VarB, er31.a);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarE);
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
            nko1.H(qim0VarE2, x340Var, y580.Y);
            uwo1.e("19", h2c.a.a(uyn1.z(2.1f, 0.0f, 2, nim0.a), een.h), lee1.a(cbx.d(x340Var).n, 0L, fc11.G(9), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213), cbx.a(x340Var).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var, i3 & 14, 0, 2016);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gy0(qim0Var, str, i, (byte) 6);
        }
    }

    public static final void b(int i, j2i j2iVar, b0k b0kVar, qim0 qim0Var, boolean z) {
        qim0 qim0Var2;
        boolean z2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1723635532);
        int i2 = (x340Var.h(z) ? 4 : 2) | i | (x340Var.g(qim0Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= x340Var.i(j2iVar) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0Var2 = qim0Var;
            z2 = z;
            fq7.g(z2, qim0Var2, xay.e(3, (ni20) null), xay.f(3, (ni20) null), (String) null, apo.r(1356599668, new rv71(j2iVar, (byte) 3), x340Var), x340Var, (i2 & 14) | 200064 | (i2 & 112), 16);
        } else {
            qim0Var2 = qim0Var;
            z2 = z;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qa5(i, j2iVar, qim0Var2, z2);
        }
    }

    public static final void c(String str, xb10 xb10Var, yqi1 yqi1Var, b0k b0kVar, int i) {
        String str2;
        int i2;
        xb10 xb10Var2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(1047256205);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (b0kVar2.g(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            xb10Var2 = xb10Var;
            i2 |= b0kVar2.g(xb10Var2) ? 32 : 16;
        } else {
            xb10Var2 = xb10Var;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar2.i(yqi1Var) ? 256 : 128;
        }
        if (b0kVar2.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 14) == 4;
            Object objT = b0kVar2.T();
            if (z || objT == fkj0.X) {
                objT = !ihc1.y0(str2) ? Uri.parse(str2) : Uri.EMPTY;
                b0kVar2.s0(objT);
            }
            Uri uri = (Uri) objT;
            fwx fwxVarG = hso1.G(grx.c, f5p1.k(b0kVar2, 2131102506), f5p1.k(b0kVar2, 2131102504), b0kVar2, grx.d, 20);
            jsl jslVar = new jsl(cwl1.o0(b0kVar2, 2131955199));
            uri.getClass();
            ni7 ni7VarA = oi7.a(uri, (gw70) null, xb10Var2, yqi1Var, fwxVarG, fwxVarG, false, false, (j6m) null, (iu30) null, (iu30) null, (iu30) null, 0L, b0kVar2, ((i2 << 6) & 64512) | 2359296, 0, 130950);
            b0kVar2 = b0kVar2;
            eso1.h(ni7VarA, jslVar, (qim0) null, new p3v(295.0f), (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, b0kVar2, 3072, CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new x8t(str, xb10Var, yqi1Var, i, (byte) 14);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:36:0x007e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0086  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    public static final void d(int i, int i2, int i3, b0k b0kVar, qim0 qim0Var) throws NoWhenBranchMatchedException {
        int i4;
        qim0 qim0Var2;
        boolean z;
        qim0 qim0Var3;
        h311 h311VarV;
        qim0 qim0Var4;
        int iC;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1004670929);
        if ((i2 & 6) == 0) {
            i4 = i2 | (x340Var.e(l1d.C(i)) ? 4 : 2);
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 == 0) {
            if ((i2 & 48) == 0) {
                qim0Var2 = qim0Var;
                i4 |= x340Var.i(qim0Var2) ? 32 : 16;
            }
            if ((i4 & 19) != 18) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i4 & 1, z)) {
                if (i5 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                iC = l1d.C(i);
                if (iC != 0) {
                    x340Var.i0(1475617772);
                    a((i4 & 112) | 6, cwl1.o0(x340Var, 2131959472), x340Var, qim0Var4);
                    x340Var.r(false);
                } else if (iC != 1) {
                    x340Var.i0(1475827363);
                    suo1.h(i4 & 112, 0, cwl1.o0(x340Var, 2131955842), cwl1.o0(x340Var, 2131955840), x340Var, qim0Var4);
                    x340Var.r(false);
                } else {
                    if (iC == 2) {
                        throw p3d1.k(x340Var, 878882874, false);
                    }
                    x340Var.i0(1476080292);
                    suo1.h(i4 & 112, 0, cwl1.o0(x340Var, 2131955841), cwl1.o0(x340Var, 2131955840), x340Var, qim0Var4);
                    x340Var.r(false);
                }
                qim0Var3 = qim0Var4;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new h13((byte) 1, i, i2, i3, qim0Var3);
            }
        }
        i4 |= 48;
        qim0Var2 = qim0Var;
        if ((i4 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i4 & 1, z)) {
            if (i5 != 0) {
                qim0Var4 = nim0.a;
            } else {
                qim0Var4 = qim0Var2;
            }
            iC = l1d.C(i);
            if (iC != 0) {
                x340Var.i0(1475617772);
                a((i4 & 112) | 6, cwl1.o0(x340Var, 2131959472), x340Var, qim0Var4);
                x340Var.r(false);
            } else if (iC != 1) {
                x340Var.i0(1475827363);
                suo1.h(i4 & 112, 0, cwl1.o0(x340Var, 2131955842), cwl1.o0(x340Var, 2131955840), x340Var, qim0Var4);
                x340Var.r(false);
            } else {
                if (iC == 2) {
                    throw p3d1.k(x340Var, 878882874, false);
                }
                x340Var.i0(1476080292);
                suo1.h(i4 & 112, 0, cwl1.o0(x340Var, 2131955841), cwl1.o0(x340Var, 2131955840), x340Var, qim0Var4);
                x340Var.r(false);
            }
            qim0Var3 = qim0Var4;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new h13((byte) 1, i, i2, i3, qim0Var3);
        }
    }

    public static final void e(Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1074809946);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            gdx gdxVarR = yla.r(x340Var);
            idx idxVar = new idx(8);
            String strO0 = cwl1.o0(x340Var, 2131955200);
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            foo1.c(new gbx(new y50(strO0), function0), idxVar, null, null, gdxVarR, null, null, null, null, null, yki.a, x340Var, 0, 48, 2012);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wk1((byte) 7, i, function0, false);
        }
    }

    public static final void f(String str, vzq0 vzq0Var, qim0 qim0Var, boolean z, Function0 function0, j2i j2iVar, b0k b0kVar, int i) {
        j2i j2iVar2;
        qim0 qim0Var2;
        long jE;
        rmr0 rmr0VarB;
        String str2 = str;
        Function0 function1 = function0;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1946878778);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(str2) ? 4 : 2) | (x340Var.g(vzq0Var) ? 32 : 16) | 384 | (x340Var.h(z) ? 2048 : 1024) | (x340Var.i(function1) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            yqi1 yqi1Var = z ? yqi1.b : null;
            xb10 xb10VarO = x4p1.o(x340Var);
            boolean zG = ((i2 & 7168) == 2048) | x340Var.g(xb10VarO.a());
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                if (z) {
                    u7h u7hVarQ = ywo1.q(xb10VarO.a());
                    if (u7hVarQ != null) {
                        jE = mue1.v(u7hVarQ.a);
                    } else {
                        uwr uwrVar = cbx.a;
                        jE = ((yex) zex.a.d).f;
                    }
                } else {
                    smr0 smr0VarA = xb10VarO.a();
                    uwr uwrVar2 = cbx.a;
                    jE = ((yex) zex.a.d).f;
                    if (smr0VarA == null || (rmr0VarB = smr0VarA.b(grd1.h)) == null) {
                        rmr0VarB = smr0VarA != null ? smr0VarA.b(grd1.e) : null;
                    }
                    if (rmr0VarB != null) {
                        jE = z4p1.e(rmr0VarB.d);
                    }
                }
                u7h u7hVar = new u7h(jE);
                x340Var.s0(u7hVar);
                objT = u7hVar;
            }
            u7h u7hVar2 = (u7h) objT;
            long j = u7hVar2.a;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L);
            uwr uwrVar3 = cbx.a;
            mic0 mic0Var = new mic0(0, jFloatToRawIntBits, jFloatToRawIntBits2, p7h.M(new u7h[]{u7hVar2, new u7h(((yex) zex.a.d).a)}), (List) null);
            gra graVar = een.h;
            qim0Var2 = nim0.a;
            qim0 qim0VarH = l6o1.H(dug.e(too1.i(u291.d(qim0Var2, 1.0f), vzq0Var), mic0Var, null, 0.0f, 6), l6o1.C(0, 0, 1, x340Var), false, 14);
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarH);
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
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarW = uyn1.w(u291.z(u291.f(qim0Var2, 1.0f), (fra) null, 3), vzq0Var);
            mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var, 54);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarW);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            str2 = str;
            c(str2, xb10VarO, yqi1Var, x340Var, i2 & 14);
            op71.g(x340Var, u291.h(qim0Var2, 56.0f));
            function1 = function0;
            e(function1, x340Var, (i2 >> 12) & 14);
            op71.g(x340Var, u291.h(qim0Var2, 28.0f));
            j2iVar2 = j2iVar;
            j2iVar2.invoke(x340Var, 6);
            op71.g(x340Var, u291.h(qim0Var2, 28.0f));
            x340Var.r(true);
            x340Var.r(true);
        } else {
            j2iVar2 = j2iVar;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wr1(str2, (Object) vzq0Var, qim0Var2, z, (Object) function1, (cv30) j2iVar2, i, (byte) 8);
        }
    }

    public static final void g(w4i1 w4i1Var, c380 c380Var, int i, String str, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i2) {
        int i3;
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1711089996);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? b0kVar3.g(w4i1Var) : b0kVar3.i(w4i1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? b0kVar3.g(c380Var) : b0kVar3.i(c380Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= b0kVar3.e(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= b0kVar3.g(str) ? 2048 : 1024;
        }
        j2i j2iVarR = null;
        if ((i2 & 24576) == 0) {
            i3 |= b0kVar3.g((Object) null) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= b0kVar3.i(iu30Var) ? 131072 : 65536;
        }
        int i4 = i3 | 1572864;
        if (b0kVar3.Y(i4 & 1, (599187 & i4) != 599186)) {
            uvx uvxVar = (uvx) b0kVar3.k(vvx.a);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            if (((add) b0kVar3.k(ade0.c)).e()) {
                b0kVar3.i0(-1884345956);
                j2iVarR = apo.r(260558578, new ipy(iu30Var, (byte) 7), b0kVar3);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-1883976623);
                b0kVar3.r(false);
            }
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarF, uvxVar, null, false, null, null, null, null, apo.r(-1086443902, new ac8(3, (byte) 13), b0kVar3), null, null, apo.r(107936388, new f13(i, (byte) 8), b0kVar3), j2iVarR, null, null, apo.r(367665544, new cy00(str, c380Var, w4i1Var, (byte) 11), b0kVar3), b0kVar2, 100663360, 196656, 26364);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bxy(w4i1Var, c380Var, i, str, iu30Var, qim0Var2, i2, (byte) 1);
        }
    }

    public static final void h(tna0 tna0Var, iu30 iu30Var, yqg yqgVar, xho xhoVar, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(671299517);
        int i2 = i | (b0kVar3.i(tna0Var) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | (b0kVar3.g(yqgVar) ? 256 : 128) | (b0kVar3.i(xhoVar) ? 2048 : 1024) | 24576;
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            sna0 sna0Var = tna0Var.a;
            int i3 = sna0Var.f;
            boolean z = sna0Var.d;
            String str = sna0Var.c;
            boolean zE = b0kVar3.e(l1d.C(i3)) | b0kVar3.h(z) | b0kVar3.g(str);
            Object objT = b0kVar3.T();
            if (zE || objT == m4cVar) {
                smc0 smc0VarN = k4p1.n();
                if (i3 != 3) {
                    smc0VarN.add(new ra51(i3));
                }
                if (z && str != null && str.length() != 0) {
                    smc0VarN.add(sa51.d);
                }
                objT = mqo1.F(k4p1.k(smc0VarN));
                b0kVar3.s0(objT);
            }
            c9 c9Var = (c9) objT;
            c380 c380VarA = mqo1.A(z6x.a);
            String str2 = sna0Var.b;
            int i4 = tna0Var.b;
            if ((118 & 1) != 0) {
                str2 = "Title";
            }
            va51 va51Var = new va51(str2, (118 & 2) != 0 ? c380VarA : null, ai4.b, (118 & 8) != 0 ? 3 : i4, (118 & 16) != 0 ? 1 : 2, false, (118 & 64) != 0 ? 0 : 2);
            boolean zG = b0kVar3.g(str) | b0kVar3.g(c9Var);
            Object objT2 = b0kVar3.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new ta51(str == null ? "" : str, c9Var);
                b0kVar3.s0(objT2);
            }
            ta51 ta51Var = (ta51) objT2;
            pa51 pa51Var = new pa51((238 & 1) != 0 ? null : sna0Var.e, false, (238 & 4) != 0 ? oa51.a : null, (238 & 8) != 0 ? 1 : 0, (238 & 16) != 0 ? na51.i : na51.f, (238 & 32) != 0 ? "" : null, false, false);
            boolean z2 = ((str == null || str.length() == 0) && c9Var.isEmpty()) ? false : true;
            boolean z3 = sgy.a(sna0Var.a) && tna0Var.d && !o0c.F(i3, tna0Var.e, tna0Var.f);
            boolean z4 = (i2 & 112) == 32;
            Object objT3 = b0kVar3.T();
            if (z4 || objT3 == m4cVar) {
                objT3 = new ux90(iu30Var, (byte) 24);
                b0kVar3.s0(objT3);
            }
            j2i j2iVarR = apo.r(611585988, new qw1(tna0Var, iu30Var, yqgVar, z2, ta51Var, pa51Var, xhoVar, sna0Var, va51Var), b0kVar3);
            b0kVar2 = b0kVar3;
            n3o1.h(z3, (Function0) objT3, null, j2iVarR, b0kVar2, 3072);
            qim0Var2 = nim0.a;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new uk20((byte) 18, i, (Object) tna0Var, (Object) iu30Var, (Object) yqgVar, (Object) xhoVar, (Object) qim0Var2);
        }
    }

    public static final void i(ofg0 ofg0Var, iu30 iu30Var, o3e0 o3e0Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1360030427);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(ofg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? x340Var.g(o3e0Var) : x340Var.i(o3e0Var) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            WeakHashMap weakHashMap = osl1.x;
            bgc0 bgc0Var = new bgc0(lhc.g(x340Var).g, 32);
            qim0 qim0Var3 = nim0.a;
            irn1.u(qim0Var3, apo.r(-1038151544, new q0g0(o3e0Var, iu30Var, (byte) 4), x340Var), null, bgc0Var, apo.r(1538096770, new iwf0(ofg0Var, o3e0Var, iu30Var, (byte) 10), x340Var), x340Var, ((i3 >> 9) & 14) | 24624, 4);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nca0(i, ofg0Var, iu30Var, o3e0Var, qim0Var2, (byte) 27);
        }
    }

    public static final void j(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1241429914);
        int i2 = (x340Var.g((Object) null) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.i0(-524099672);
            x340Var.r(false);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new one0(qim0Var, i, (byte) 18);
        }
    }

    public static final void k(Set set, rxx0 rxx0Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var;
        h311 h311VarV;
        zpx0 zpx0Var;
        Object obj = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(120174142);
        int i2 = i | (x340Var2.g(set) ? 4 : 2) | (x340Var2.e(rxx0Var.ordinal()) ? 32 : 16) | (x340Var2.i(qim0Var) ? 256 : 128);
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objT = x340Var2.T();
            if (z || objT == obj) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : set) {
                    if (((vpx0) obj2).b().contains(rxx0Var)) {
                        arrayList.add(obj2);
                    }
                }
                objT = o7h.a1(arrayList, new xvd((Object) rxx0Var, (byte) 21));
                x340Var2.s0(objT);
            }
            x340Var2.i0(-476756068);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : (List) objT) {
                x340 x340Var3 = x340Var2;
                if (((Boolean) rwq.g(((vpx0) obj3).isVisible(), Boolean.FALSE, null, x340Var3, 48, 2).getValue()).booleanValue()) {
                    arrayList2.add(obj3);
                }
                x340Var2 = x340Var3;
            }
            x340 x340Var4 = x340Var2;
            x340Var4.r(false);
            if (arrayList2.isEmpty()) {
                h311VarV = x340Var4.v();
                if (h311VarV == null) {
                    return;
                } else {
                    zpx0Var = new zpx0(set, rxx0Var, qim0Var, i, (byte) 0);
                }
            } else {
                xtb0 xtb0VarA = aub0.a(0, x340Var4, 3);
                vpx0 vpx0Var = (vpx0) o7h.s0(arrayList2);
                String id = vpx0Var != null ? vpx0Var.getId() : null;
                boolean zI = x340Var4.i(xtb0VarA);
                Object objT2 = x340Var4.T();
                if (zI || objT2 == obj) {
                    objT2 = new pw1(xtb0VarA, (lnm) null, (byte) 8);
                    x340Var4.s0(objT2);
                }
                qxd0.t(id, x340Var4, (vu30) objT2);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var4).b;
                cvx cvxVar2 = cbx.b(x340Var4).b;
                zzq0 zzq0VarJ = uyn1.j(16.0f, 0.0f, 16.0f, 0.0f, 10);
                boolean zI2 = x340Var4.i(arrayList2);
                Object objT3 = x340Var4.T();
                if (zI2 || objT3 == obj) {
                    objT3 = new ib5(arrayList2, (byte) 29);
                    x340Var4.s0(objT3);
                }
                too1.b(qim0Var, xtb0VarA, zzq0VarJ, (iu30) objT3, x340Var4, (i2 >> 6) & 14, 0);
                x340Var = x340Var4;
            }
            h311VarV.d = zpx0Var;
        }
        x340Var = x340Var2;
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            zpx0Var = new zpx0(set, rxx0Var, qim0Var, i, (byte) 1);
            h311VarV.d = zpx0Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object l(ct41 ct41Var, float f2, fe5 fe5Var, onm onmVar) {
        or41 or41Var;
        m811 m811Var;
        if (onmVar instanceof or41) {
            or41Var = (or41) onmVar;
            int i = or41Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                or41Var.c = i - Integer.MIN_VALUE;
            } else {
                or41Var = new or41(onmVar);
            }
        } else {
            or41Var = new or41(onmVar);
        }
        Object obj = or41Var.b;
        int i2 = or41Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            m811 m811Var2 = new m811();
            wj40 wj40Var = new wj40(f2, fe5Var, m811Var2, (lnm) null);
            or41Var.a = m811Var2;
            or41Var.c = 1;
            Object objA = ct41Var.a(hfn0.a, wj40Var, or41Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
            m811Var = m811Var2;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m811Var = or41Var.a;
            hm5.M(obj);
        }
        return new Float(m811Var.a);
    }

    public static ArrayList n(List list) {
        List<phh0> list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (phh0 phh0Var : list2) {
            MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(phh0Var.a, phh0Var.b, phh0Var.c, (CharSequence) null, (Bitmap) null, phh0Var.e, phh0Var.f, phh0Var.d);
            int i = SpotifyMediaBrowserService.N0;
            int i2 = phh0Var.g;
            int i3 = (i2 & 1) != 0 ? 1 : 0;
            if ((i2 & 2) != 0) {
                i3 |= 2;
            }
            arrayList.add(new MediaBrowserCompat.MediaItem(mediaDescriptionCompat, i3));
        }
        return arrayList;
    }

    public static CameraDevice.StateCallback o(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return new i3d();
        }
        return arrayList.size() == 1 ? (CameraDevice.StateCallback) arrayList.get(0) : new h3d(arrayList);
    }

    public static final ArrayList p(List list, int i, Set set, as3 as3Var, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ttm1 ttm1Var = (ttm1) list.get(i2);
            int i3 = i + i2;
            arrayList.add(new bhy(i3, ttm1Var, z2, as3Var, i3, z, set.contains(ttm1Var.a)));
        }
        return arrayList;
    }

    public static final gon0 q(View view) {
        gon0 gon0Var = (gon0) z561.W(z561.f0(sbn0.c1, z561.c0(sbn0.b1, view)));
        if (gon0Var != null) {
            return gon0Var;
        }
        bhn0.u("View ", view, " does not have a NavController set");
        return null;
    }

    public static final u380 r(mdz mdzVar) {
        return mqo1.C(dm61.B0(new lyl[]{mdzVar.a().contains(jdz.b) ? kyl.a : null, mdzVar.a().contains(jdz.a) ? jyl.a : null}));
    }

    public static final Set s(boolean z, boolean z2) {
        return dm61.B0(new yp21[]{new yp21(mdz.class), new yp21(b9v0.class), new yp21(e2k1.class), z ? new yp21(v740.class) : null, z2 ? new yp21(xkk1.class) : null});
    }

    public static int t(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = b[i5];
        if (i2 == 2) {
            i7 /= 2;
        } else if (i2 == 0) {
            i7 /= 4;
        }
        int i8 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? c[i4 - 1] : d[i4 - 1]) * 12) / i7) + i8) * 4;
        }
        if (i2 == 3) {
            i6 = i3 == 2 ? e[i4 - 1] : f[i4 - 1];
        } else {
            i6 = g[i4 - 1];
        }
        if (i2 == 3) {
            return ywx0.j(i6, 144, i7, i8);
        }
        return ywx0.j(i3 == 1 ? 72 : 144, i6, i7, i8);
    }

    public static long u(izr0 izr0Var, int i, int i2) {
        izr0Var.R(i);
        if (izr0Var.a() < 5) {
            return -9223372036854775807L;
        }
        int iQ = izr0Var.q();
        if ((8388608 & iQ) != 0 || ((2096896 & iQ) >> 8) != i2 || (iQ & 32) == 0 || izr0Var.E() < 7 || izr0Var.a() < 7 || (izr0Var.E() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        izr0Var.o(0, bArr, 6);
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[4]) & 255) >> 7);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object v(ct41 ct41Var, float f2, onm onmVar) {
        pr41 pr41Var;
        m811 m811Var;
        if (onmVar instanceof pr41) {
            pr41Var = (pr41) onmVar;
            int i = pr41Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pr41Var.c = i - Integer.MIN_VALUE;
            } else {
                pr41Var = new pr41(onmVar);
            }
        } else {
            pr41Var = new pr41(onmVar);
        }
        Object obj = pr41Var.b;
        int i2 = pr41Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            m811 m811Var2 = new m811();
            kxx kxxVar = new kxx(m811Var2, f2, (lnm) null);
            pr41Var.a = m811Var2;
            pr41Var.c = 1;
            Object objA = ct41Var.a(hfn0.a, kxxVar, pr41Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
            m811Var = m811Var2;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m811Var = pr41Var.a;
            hm5.M(obj);
        }
        return new Float(m811Var.a);
    }
}
