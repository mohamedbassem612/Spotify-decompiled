package p;

import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.URLSpan;
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
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.kidsentitybanning.search.v1.HubArtist;
import com.spotify.kidsentitybanning.search.v1.HubTrack;
import com.spotify.kidsentitybanning.search.v1.ListViewResponse;
import com.spotify.upsells.v1.proto.Image;
import com.spotify.upsells.v1.proto.ImageInstance;
import com.spotify.upsells.v1.proto.Media;
import com.spotify.upsells.v1.proto.SignifierDisplay;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class ulo1 {
    public static final fgv a = new fgv(3, 2);
    public static b180 b;

    public static final void a(r9x r9xVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        qim0 qim0Var3;
        boolean z;
        int i2;
        boolean z2;
        String str = r9xVar.c;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1612171239);
        j06 j06Var = x340Var.a;
        int i3 = i | (x340Var.g(r9xVar) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | 384;
        boolean z3 = true;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarZ = u291.z(u291.f(qim0Var4, 1.0f), (fra) null, 3);
            uwr uwrVar = cbx.a;
            qim0 qim0VarX = uyn1.x(qim0VarZ, cbx.b(x340Var).b.b);
            era eraVar = een.Q0;
            cvx cvxVar = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z4 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z4) {
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
            if (r9xVar.d) {
                x340Var.i0(-1652594481);
                qim0 qim0VarN = anm1.N("icon_cards", qim0Var4);
                jw31 jw31VarA = ew31.a(new d36(-8.0f, true, new g21(eraVar, (byte) 29)), een.Z, x340Var, 0);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarN);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(jw31VarA, x340Var, lljVar);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar4);
                qim0Var3 = qim0Var4;
                i2 = 3;
                c(0.0f, -6.0f, -8.0f, grx.c, null, x340Var, (grx.d << 9) | 6);
                c(1.0f, 0.0f, 0.0f, vtx.c, null, x340Var, (vtx.d << 9) | 6);
                c(0.0f, 6.0f, -8.0f, nkx.c, null, x340Var, (nkx.d << 9) | 6);
                z3 = true;
                x340Var.r(true);
                z = false;
                x340Var.r(false);
            } else {
                qim0Var3 = qim0Var4;
                z = false;
                i2 = 3;
                x340Var.i0(-1652131279);
                x340Var.r(false);
            }
            uwo1.e(r9xVar.a, null, cbx.d(x340Var).e, cbx.a(x340Var).b.a, new a0e1(i2), null, 0, false, null, 0, null, x340Var, 0, 0, 2018);
            x340Var = x340Var;
            if (str.length() > 0) {
                x340Var.i0(-1651881698);
                uwo1.e(str, null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(i2), null, 0, false, null, 0, null, x340Var, 0, 0, 2018);
                x340Var = x340Var;
                z2 = false;
                x340Var.r(false);
            } else {
                z2 = false;
                x340Var.i0(-1651703727);
                x340Var.r(false);
            }
            if (r9xVar.b.length() > 0) {
                x340Var.i0(-1651637294);
                gdx gdxVarS = yla.s(x340Var);
                idx idxVar = new idx();
                boolean z5 = (i3 & 112) == 32 ? true : z2;
                Object objT = x340Var.T();
                if (z5 || objT == fkj0.X) {
                    objT = new q7u(iu30Var, (byte) 22);
                    x340Var.s0(objT);
                }
                x340 x340Var2 = x340Var;
                foo1.c(new gbx(z50.c, (Function0) objT), idxVar, null, null, gdxVarS, null, null, null, null, null, apo.r(-1159102689, new hzw(r9xVar, (byte) 2), x340Var), x340Var2, 0, 48, 2012);
                x340Var = x340Var2;
                x340Var.r(z2);
            } else {
                x340Var.i0(-1651386287);
                x340Var.r(z2);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g6w(r9xVar, iu30Var, qim0Var2, i, (byte) 6);
        }
    }

    public static final void b(ta60 ta60Var, String str, af afVar, j2i j2iVar, b0k b0kVar, int i, int i2) {
        int i3;
        b0k b0kVar2;
        af afVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1301713428);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? b0kVar3.g(ta60Var) : b0kVar3.i(ta60Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar3.g(str) ? 32 : 16;
        }
        int i4 = i & 384;
        nim0 nim0Var = nim0.a;
        if (i4 == 0) {
            i3 |= b0kVar3.i(nim0Var) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= b0kVar3.e(afVar == null ? -1 : afVar.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= b0kVar3.i(j2iVar) ? 16384 : 8192;
        }
        int i6 = i3;
        if (b0kVar3.Y(i6 & 1, (i6 & 9363) != 9362)) {
            af afVar3 = i5 != 0 ? af.e : afVar;
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(b0kVar3).f;
            cr31 cr31VarB = er31.b(8.0f);
            boolean z = ef.b(b0kVar3).compareTo(afVar3) >= 0;
            b0kVar2 = b0kVar3;
            lc60.c((i6 & 896) | 3120, apo.r(2006306443, new ey((Object) str, (Object) cr31VarB, (Object) ta60Var, z, (Object) j2iVar, (byte) 20), b0kVar3), b0kVar2, nim0Var, ta60Var.f, true);
            afVar2 = afVar3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            afVar2 = afVar;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new nj2(ta60Var, str, afVar2, j2iVar, i, i2);
        }
    }

    public static final void c(float f, float f2, float f3, hux huxVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-237766792);
        if ((i & 6) == 0) {
            i2 = (x340Var.d(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.d(f2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.d(f3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? x340Var.g(huxVar) : x340Var.i(huxVar) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            gra graVar = een.h;
            boolean z = ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new e8(f2, f3, (byte) 4);
                x340Var.s0(objT);
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarX = lrn1.x(u291.r(i541.C(qim0Var3, (iu30) objT), 90.0f), f);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF = dug.f(i1p1.q(qim0VarX, er31.b(8.0f)), cbx.a(x340Var).a.a.a(), d4o1.a);
            long j = cbx.a(x340Var).a.c;
            avw0 avw0Var = cbx.b(x340Var).c;
            cua cuaVar2 = cbx.b(x340Var).f;
            qim0 qim0VarE = d1u.E(4.0f, j, qim0VarF, er31.b(8.0f));
            gfh0 gfh0VarC = t1c.c(graVar, false);
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
            long j2 = cbx.a(x340Var).c.b;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(huxVar, isl.a, u291.r(qim0Var3, 32.0f), j2, 0L, false, x340Var, 56 | ((i3 >> 9) & 14), 48);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new atl(f, f2, f3, huxVar, qim0Var2, i);
        }
    }

    public static final void d(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1439862102);
        int i2 = (b0kVar3.i(function0) ? 4 : 2) | i | (b0kVar3.i(qim0Var) ? 32 : 16);
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(b0kVar3, 2131959831);
            String strN0 = cwl1.n0(2131959832, new Object[]{strO0}, b0kVar3);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(b0kVar3).j;
            long j = cbx.a(b0kVar3).b.a;
            long j2 = cbx.a(b0kVar3).b.c;
            FontWeight fontWeight = cbx.d(b0kVar3).k.a.c;
            int iW0 = ihc1.w0(strN0, strO0, 0, false, 6);
            ye5 ye5Var = new ye5();
            int iO = ye5Var.o(new zma1(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
            try {
                ye5Var.g(strN0.substring(0, iW0));
                ye5Var.k(iO);
                ye5Var.m("settings_link", "navigate");
                int iO2 = ye5Var.o(new zma1(j2, 0L, fontWeight, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65530));
                try {
                    ye5Var.g(strO0);
                    ye5Var.k(iO2);
                    ye5Var.j();
                    int length = strO0.length() + iW0;
                    if (length < strN0.length()) {
                        int iO3 = ye5Var.o(new zma1(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                        try {
                            ye5Var.g(strN0.substring(length));
                            ye5Var.k(iO3);
                        } catch (Throwable th) {
                            ye5Var.k(iO3);
                            throw th;
                        }
                    }
                    af5 af5VarP = ye5Var.p();
                    cvx cvxVar = cbx.b(b0kVar3).b;
                    zzq0 zzq0Var = new zzq0(16.0f, 16.0f, 16.0f, 16.0f);
                    long jC = cbx.a(b0kVar3).a.a.c();
                    cua cuaVar = cbx.b(b0kVar3).f;
                    b0kVar2 = b0kVar3;
                    cwl1.b(anm1.N("playback_settings_alert_card", dug.f(qim0Var, jC, er31.b(16.0f))), (tl3) null, (hw61) null, (pgx) null, zzq0Var, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(216996819, new nhg(j, af5VarP, lee1Var, function0), b0kVar3), b0kVar2, 0, 48, 2030);
                } catch (Throwable th2) {
                    ye5Var.k(iO2);
                    throw th2;
                }
            } catch (Throwable th3) {
                ye5Var.k(iO);
                throw th3;
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bb50(function0, qim0Var, i, (byte) 13);
        }
    }

    public static final void e(int i, b0k b0kVar, iu30 iu30Var, qim0 qim0Var) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(903462725);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (b0kVar3.Y(i3 & 1, (i3 & 19) != 18)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("send-chat-invite-row-test-tag", qim0Var3);
            boolean z = (i3 & 14) == 4;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new wg31(iu30Var, (byte) 28);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarN, null, null, false, null, null, new gbx(z50.c, (Function0) objT), null, null, bgj.a, null, bgj.b, null, null, null, bgj.c, b0kVar2, 805306368, 196656, 30142);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new n52(iu30Var, qim0Var2, i, (byte) 11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006f  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    public static final zyh1 f(Media media) {
        int i;
        vp70 vp70Var;
        String str;
        xyh1 xyh1Var;
        up70 up70Var;
        String strN;
        String str2 = null;
        if (media.r()) {
            Image imageP = media.p();
            int i2 = bzh1.a[imageP.o().ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    xyh1Var = null;
                } else {
                    i = 2;
                }
                if (xyh1Var != null) {
                    strN = media.n();
                    if (media.q()) {
                        strN.getClass();
                        if (!ihc1.y0(strN)) {
                            str2 = strN;
                        }
                    }
                    return new zyh1(xyh1Var, str2);
                }
            } else {
                i = 1;
            }
            h290 h290VarQ = imageP.q();
            boolean z = false;
            if (!h290VarQ.isEmpty()) {
                Iterator it = h290VarQ.iterator();
                while (it.hasNext()) {
                    if (((ImageInstance) it.next()).n() == vz70.IMAGE_SIZE_XLARGE) {
                        z = true;
                        break;
                    }
                }
            }
            h290 h290VarQ2 = imageP.q();
            ArrayList arrayList = new ArrayList();
            Iterator it2 = h290VarQ2.iterator();
            while (true) {
                boolean zHasNext = it2.hasNext();
                vp70Var = vp70.c;
                if (!zHasNext) {
                    break;
                }
                ImageInstance imageInstance = (ImageInstance) it2.next();
                if (z && imageInstance.n() == vz70.IMAGE_SIZE_XXLARGE) {
                    up70Var = null;
                } else {
                    imageInstance.getClass();
                    int iOrdinal = imageInstance.n().ordinal();
                    if (iOrdinal == 0) {
                        vp70Var = vp70.a;
                    } else if (iOrdinal == 1) {
                        vp70Var = vp70.b;
                    } else if (iOrdinal != 2) {
                        if (iOrdinal == 3) {
                            vp70Var = vp70.d;
                        } else if (iOrdinal == 4 || iOrdinal == 5) {
                            vp70Var = vp70.e;
                        } else {
                            up70Var = null;
                        }
                    }
                    up70Var = new up70(new so20(imageInstance.getImageUrl()), vp70Var);
                }
                if (up70Var != null) {
                    arrayList.add(up70Var);
                }
            }
            up70 up70VarA = new mq70(arrayList, 6).a(vp70Var);
            if (up70VarA == null || (str = up70VarA.a.a) == null) {
                xyh1Var = null;
            } else {
                String strN2 = imageP.n();
                if (imageP.r()) {
                    strN2.getClass();
                    if (ihc1.y0(strN2)) {
                        strN2 = null;
                    }
                } else {
                    strN2 = null;
                }
                xyh1Var = new xyh1(str, i, strN2);
            }
            if (xyh1Var != null) {
                strN = media.n();
                if (media.q()) {
                    strN.getClass();
                    if (!ihc1.y0(strN)) {
                        str2 = strN;
                    }
                }
                return new zyh1(xyh1Var, str2);
            }
        }
        return null;
    }

    public static final hxy0 g(int i) {
        switch (l1d.C(i)) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return hxy0.c;
            case 1:
                return hxy0.O0;
            case 2:
                return hxy0.P0;
            case 3:
                return hxy0.g;
            case 4:
                return hxy0.d;
            case 5:
                return hxy0.f;
            case 6:
                return hxy0.e;
            case 7:
                return hxy0.X;
            case 8:
                return hxy0.Q0;
            default:
                eg.o();
                return null;
        }
    }

    public static final azh1 h(SignifierDisplay signifierDisplay) {
        String str = null;
        if (signifierDisplay.getTitle().length() <= 0) {
            signifierDisplay = null;
        }
        if (signifierDisplay == null) {
            return null;
        }
        String title = signifierDisplay.getTitle();
        String strN = signifierDisplay.n();
        String strP = signifierDisplay.p();
        if (signifierDisplay.q()) {
            strP.getClass();
            if (strP.length() > 0) {
                str = strP;
            }
        }
        return new azh1(title, strN, str);
    }

    public static final edn0 i(esb0 esb0Var, qsb0 qsb0Var, laz lazVar) {
        int iMin;
        bw91 bw91Var = qsb0Var.a;
        d9 d9Var = pv91.r(bw91Var.a, bw91Var).c;
        bfn0 bfn0Var = (bfn0) lazVar.b;
        int i = 1;
        if (!(bfn0Var.c != 0) && d9Var.isEmpty()) {
            return mr80.a;
        }
        edn0 edn0Var = new edn0();
        if (((bfn0) lazVar.b).c != 0) {
            int i2 = bfn0Var.c;
            if (i2 == 0) {
                bhn0.t("MutableVector is empty.");
                return null;
            }
            Object[] objArr = bfn0Var.a;
            int i3 = ((nrb0) objArr[0]).a;
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = ((nrb0) objArr[i4]).a;
                if (i5 < i3) {
                    i3 = i5;
                }
            }
            if (i3 < 0) {
                tf80.a("negative minIndex");
            }
            int i6 = bfn0Var.c;
            if (i6 == 0) {
                bhn0.t("MutableVector is empty.");
                return null;
            }
            Object[] objArr2 = bfn0Var.a;
            int i7 = ((nrb0) objArr2[0]).b;
            for (int i8 = 0; i8 < i6; i8++) {
                int i9 = ((nrb0) objArr2[i8]).b;
                if (i9 > i7) {
                    i7 = i9;
                }
            }
            iMin = Math.min(i7, esb0Var.a() - 1);
            i = i3;
        } else {
            iMin = 0;
        }
        int iB = d9Var.b();
        for (int i10 = 0; i10 < iB; i10++) {
            nsb0 nsb0Var = (nsb0) d9Var.get(i10);
            int iP = qmo1.p(nsb0Var.c, nsb0Var.a, esb0Var);
            if ((i > iP || iP > iMin) && iP >= 0 && iP < esb0Var.a()) {
                edn0Var.a(iP);
            }
        }
        if (i <= iMin) {
            while (true) {
                edn0Var.a(i);
                if (i == iMin) {
                    break;
                }
                i++;
            }
        }
        int i11 = edn0Var.b;
        if (i11 == 0) {
            return edn0Var;
        }
        f46.D0(i11, edn0Var.a);
        return edn0Var;
    }

    public static final void j(jfe jfeVar, Throwable th) {
        CancellationException cancellationExceptionB = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationExceptionB == null) {
            cancellationExceptionB = lgo1.b("Channel was consumed, consumer had failed", th);
        }
        jfeVar.d(cancellationExceptionB);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final o17 k(String str, g07 g07Var) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1544438277:
                    if (str.equals("episode")) {
                        return new t07(g07Var, false);
                    }
                    break;
                case -1409097913:
                    if (str.equals("artist")) {
                        return new l07(g07Var, false);
                    }
                    break;
                case 3529469:
                    if (str.equals("show")) {
                        return new e17(g07Var);
                    }
                    break;
                case 92896879:
                    if (str.equals("album")) {
                        return new k07(g07Var, false);
                    }
                    break;
                case 1879474642:
                    if (str.equals("playlist")) {
                        return new y07(g07Var, false);
                    }
                    break;
            }
        }
        return new x07(g07Var, true);
    }

    public static final o8n l(o8n o8nVar, o8n o8nVar2, boolean z) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) o8nVar.o(bool, new n75((byte) 21))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) o8nVar2.o(bool, new n75((byte) 21))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return o8nVar.y(o8nVar2);
        }
        p811 p811Var = new p811();
        p811Var.a = o8nVar2;
        fc4 fc4Var = new fc4(p811Var, z, (byte) 2);
        o6x o6xVar = o6x.a;
        o8n o8nVar3 = (o8n) o8nVar.o(o6xVar, fc4Var);
        if (zBooleanValue2) {
            p811Var.a = ((o8n) p811Var.a).o(o6xVar, new n75((byte) 22));
        }
        return o8nVar3.y((o8n) p811Var.a);
    }

    public static final String m(long j) {
        long jL0 = fdg1.l0(j, ngv.d);
        long jU = jfv.u(jL0, ngv.g);
        int iJ = jfv.j(jL0);
        int iL = jfv.l(jL0);
        return jU > 0 ? String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(jU), Integer.valueOf(iJ), Integer.valueOf(iL)}, 3)) : String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iJ), Integer.valueOf(iL)}, 2));
    }

    public static final o8n n(o8n o8nVar, o8n o8nVar2) {
        return !((Boolean) o8nVar2.o(Boolean.FALSE, new n75((byte) 21))).booleanValue() ? o8nVar.y(o8nVar2) : l(o8nVar, o8nVar2, false);
    }

    public static final o8n o(c9n c9nVar, o8n o8nVar) {
        fns fnsVarL = l(c9nVar.J(), o8nVar, true);
        fns fnsVar = igu.a;
        return (fnsVarL == fnsVar || fnsVarL.A(wdu0.Y) != null) ? fnsVarL : fnsVarL.y(fnsVar);
    }

    public static final qim0 p(b0k b0kVar, int i) {
        boolean z = (i & 2) != 0;
        if (ef.b(b0kVar).compareTo(af.e) >= 0) {
            return nim0.a;
        }
        if (!(((double) 1.0f) > 0.0d)) {
            of80.a("invalid weight; must be greater than zero");
        }
        return new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, z);
    }

    public static final r3b0 q(Collection collection, s3b0 s3b0Var) {
        Iterator it = collection.iterator();
        r3b0 r3b0Var = null;
        while (it.hasNext()) {
            r3b0 r3b0Var2 = (r3b0) it.next();
            if (u890.j(r3b0Var2.getType(), s3b0Var)) {
                if (r3b0Var != null) {
                    bhn0.A(s3b0Var, "Multiple extensions handle the same extension type: ");
                    return null;
                }
                r3b0Var = r3b0Var2;
            }
        }
        if (r3b0Var != null) {
            return r3b0Var;
        }
        bhn0.A(s3b0Var, "No extensions handle the extension type: ");
        return null;
    }

    public static final nxr0 r(ListViewResponse listViewResponse) {
        String strN = listViewResponse.n();
        boolean zO = listViewResponse.o();
        List tracksList = listViewResponse.getTracksList();
        ArrayList arrayList = new ArrayList();
        Iterator it = tracksList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String strZ = qqn1.Z(((HubTrack) it.next()).n(), blc0.ti);
            pyr0 pyr0Var = strZ != null ? new pyr0(strZ) : null;
            if (pyr0Var != null) {
                arrayList.add(pyr0Var);
            }
        }
        List artistsList = listViewResponse.getArtistsList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = artistsList.iterator();
        while (it2.hasNext()) {
            String strZ2 = qqn1.Z(((HubArtist) it2.next()).n(), blc0.u1);
            ixr0 ixr0Var = strZ2 != null ? new ixr0(strZ2) : null;
            if (ixr0Var != null) {
                arrayList2.add(ixr0Var);
            }
        }
        return new nxr0(strN, arrayList, arrayList2, zO);
    }

    public static final Spanned s(String str, iu30 iu30Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Html.fromHtml(str, 0));
        for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
            spannableStringBuilder.setSpan(new mmd0(uRLSpan.getURL(), iu30Var), spannableStringBuilder.getSpanStart(uRLSpan), spannableStringBuilder.getSpanEnd(uRLSpan), spannableStringBuilder.getSpanFlags(uRLSpan));
            spannableStringBuilder.removeSpan(uRLSpan);
        }
        return spannableStringBuilder;
    }

    public static final j470 t(iyr0 iyr0Var) {
        int iOrdinal = iyr0Var.ordinal();
        if (iOrdinal == 0) {
            return j470.HUB_VIEW_ALLOWED;
        }
        if (iOrdinal == 1) {
            return j470.HUB_VIEW_BANNED;
        }
        eg.o();
        return null;
    }

    public static final fhh1 u(lnm lnmVar, o8n o8nVar, Object obj) {
        fhh1 fhh1Var = null;
        if ((lnmVar instanceof e9n) && o8nVar.A(xhd.d) != null) {
            e9n callerFrame = (e9n) lnmVar;
            while (!(callerFrame instanceof wfu) && (callerFrame = callerFrame.getCallerFrame()) != null) {
                if (callerFrame instanceof fhh1) {
                    fhh1Var = (fhh1) callerFrame;
                    break;
                }
            }
            if (fhh1Var != null) {
                fhh1Var.E0(o8nVar, obj);
            }
        }
        return fhh1Var;
    }

    public static void v(boolean z, String str) {
        if (z) {
            return;
        }
        eg.m(str);
    }

    public static void w(int i, int i2) {
        String strT;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strT = jmo1.t("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    hhg1.n(gvg.l(new StringBuilder(String.valueOf(i2).length() + 15), "negative size: ", i2));
                    return;
                }
                strT = jmo1.t("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strT);
        }
    }

    public static void x(int i, int i2) {
        if (i < 0 || i > i2) {
            eg.g(z(i, i2, "index"));
        }
    }

    public static void y(int i, int i2, int i3) {
        String strZ;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strZ = z(i, i3, "start index");
            } else {
                strZ = (i2 < 0 || i2 > i3) ? z(i2, i3, "end index") : jmo1.t("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strZ);
        }
    }

    public static String z(int i, int i2, String str) {
        if (i < 0) {
            return jmo1.t("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return jmo1.t("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        hhg1.n(gvg.l(new StringBuilder(String.valueOf(i2).length() + 15), "negative size: ", i2));
        return null;
    }
}
