package p;

import android.graphics.Color;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.highlightsstats.EntityImage;
import com.spotify.highlightsstats.data.proto.v2.Artwork;
import com.spotify.highlightsstats.data.proto.v2.RankedListItem;
import com.spotify.highlightsstats.data.proto.v2.RankedListSection;
import com.spotify.highlightsstats.data.proto.v2.StackItem;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class ilo1 {
    public static final mie1 a = new mie1(lhe1.b, true);
    public static b180 b;

    public static Integer A(String str) {
        Integer m231Var;
        try {
            m231Var = Integer.valueOf(Color.parseColor(str));
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (m231Var instanceof m231) {
            m231Var = null;
        }
        return m231Var;
    }

    public static o8n B(m8n m8nVar, o8n o8nVar) {
        return flo1.l((o8n) m8nVar, o8nVar);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002f A[PHI: r3
      0x002f: PHI (r3v3 int) = (r3v2 int), (r3v4 int) binds: [B:7:0x001f, B:13:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0031 A[PHI: r5
      0x0031: PHI (r5v1 int) = (r5v0 int), (r5v2 int) binds: [B:9:0x0022, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    public static k37 C(EntityImage entityImage) {
        String imageUrl = entityImage.getImageUrl();
        int i = 1;
        boolean z = entityImage.o() == vgy.d;
        int i2 = eb60.b[entityImage.o().ordinal()];
        int i3 = 3;
        if (i2 != 1) {
            int i4 = 2;
            if (i2 != 2) {
                i4 = 4;
                if (i2 != 3) {
                    i3 = 5;
                    if (i2 == 4) {
                        i = i3;
                    } else if (i2 == 5) {
                        i = 6;
                    }
                } else {
                    i = i4;
                }
            } else {
                i = i4;
            }
        } else {
            i = i3;
        }
        return new k37(imageUrl, i, z);
    }

    public static final g4a D(iyr0 iyr0Var) {
        int iOrdinal = iyr0Var.ordinal();
        if (iOrdinal == 0) {
            return g4a.d;
        }
        if (iOrdinal == 1) {
            return g4a.c;
        }
        eg.o();
        return null;
    }

    public static final Object E(Object obj, r261 r261Var) {
        Object objL = r261Var.l(obj);
        if (objL instanceof pge) {
            return ((qge) jo31.t(o6x.a, new sxa(r261Var, obj, (lnm) null, (byte) 21))).a;
        }
        return rih1.a;
    }

    public static final byte[] F(File file) {
        return y520.G(file);
    }

    public static final void G(File file, byte[] bArr) {
        if (!file.exists() || file.delete()) {
            y520.J(file, bArr);
        } else {
            k220.i("Unable to delete existing encrypted file");
        }
    }

    public static final void a(String str, List list, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1144628142);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(list) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            flb0 flb0Var = (flb0) x340Var.k(t4k.n);
            WeakHashMap weakHashMap = osl1.x;
            vk80 vk80VarX = poo1.x(lhc.g(x340Var).e, x340Var);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            kiv kivVar = xce0.a;
            qim0 qim0VarF2 = dug.f(zr7.i(qim0VarF, gce0.c), cbx.a(x340Var).a.a.a(), er31.d(16.0f, 16.0f, 0.0f, 0.0f, 12));
            zzq0 zzq0VarJ = uyn1.j(uyn1.n(vk80VarX, flb0Var), 0.0f, uyn1.m(vk80VarX, flb0Var), vk80VarX.a() + cvxVar.a, 2);
            boolean zI = x340Var.i(cvxVar) | ((i2 & 14) == 4) | x340Var.i(list) | ((i2 & 896) == 256);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new db(list, cvxVar, str, iu30Var);
                x340Var.s0(objT);
            }
            ujo1.d(qim0VarF2, null, zzq0VarJ, false, null, null, null, false, null, (iu30) objT, x340Var, 0, 506);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wb6((Object) str, (Object) list, iu30Var, (Object) qim0Var2, i, (byte) 6);
        }
    }

    public static final void b(kb6 kb6Var, Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(53518791);
        int i2 = (b0kVar3.i(kb6Var) ? 4 : 2) | i | (b0kVar3.i(function0) ? 32 : 16);
        byte b2 = 0;
        byte b3 = 1;
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            b0kVar2 = b0kVar3;
            jto1.b(anm1.N("artist_list_sheet_row", uyn1.z(12.0f, 0.0f, 2, qim0VarF)), null, null, false, null, null, new gbx(z50.c, function0), null, null, apo.r(-563030480, new lr6(kb6Var, b2), b0kVar3), null, null, null, null, null, apo.r(249631499, new lr6(kb6Var, b3), b0kVar3), b0kVar2, 805306368, 196608, 32190);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new pp5(kb6Var, function0, i, (byte) 11);
        }
    }

    public static final void c(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2039022816);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            gfx.b(4, apo.r(1352403989, new s721(function0, str, (byte) 7), x340Var), x340Var, 54);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new o82(str, function0, qim0Var2, i, (byte) 15);
        }
    }

    public static final void d(int i, String str, String str2, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(210811413);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            uwo1.e(str, anm1.N("DialogTitle", uyn1.z(24.0f, 0.0f, 2, qim0VarF)), cbx.d(x340Var).e, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, i2 & 14, 0, 2024);
            lee1 lee1Var = kk0.p(qim0Var3, 16.0f, x340Var, x340Var).j;
            long j = cbx.a(x340Var).b.b;
            qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
            zov0 zov0Var2 = cbx.b(x340Var).g;
            uwo1.e(str2, anm1.N("DialogDescription", uyn1.z(24.0f, 0.0f, 2, qim0VarF2)), lee1Var, j, new a0e1(3), null, 0, false, null, 0, null, x340Var, (i2 >> 3) & 14, 0, 2016);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b071(str, str2, qim0Var2, i, (byte) 2);
        }
    }

    public static final void e(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-916864525);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("DismissButton", qim0Var3);
            ldx ldxVar = ldx.c;
            String strO0 = cwl1.o0(x340Var, 2131954999);
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                foo1.c(new gbx(new y50(strO0), function0), ldxVar, qim0VarN, null, yla.r(x340Var), null, null, null, null, null, fpj.a, x340Var, 0, 48, 2008);
                qim0Var2 = qim0Var3;
            }
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new t531(function0, qim0Var2, i, (byte) 13);
        }
    }

    public static final void f(jdv jdvVar, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        du1 du1Var = jdvVar.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1655559422);
        int i2 = (x340Var.g(jdvVar) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            era eraVar = een.Q0;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarX = uyn1.x(qim0VarD, cbx.b(x340Var).b.b);
            mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            long j = cbx.a(x340Var).b.a;
            lee1 lee1Var = cbx.d(x340Var).d;
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(cwl1.o0(x340Var, du1Var.a), uyn1.B(qim0Var3, 0.0f, 0.0f, 0.0f, 8.0f, 7), lee1Var, j, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
            uwo1.e(cwl1.o0(x340Var, du1Var.b), null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2018);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ozw(jdvVar, qim0Var2, i, (byte) 6);
        }
    }

    public static final void g(qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1581898286);
        int i2 = i | 6;
        if (b0kVar3.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            uvx uvxVar = new uvx(1, (pgx) null, 3, (vzq0) null, uyn1.h(2, 4.0f, 0.0f), (tvx) null, (hw61) null, 0, (p3v) null, 490);
            j2i j2iVar = sni.a;
            j2i j2iVar2 = sni.b;
            j2i j2iVar3 = sni.c;
            b0kVar2 = b0kVar3;
            qim0Var2 = nim0.a;
            jto1.b(qim0Var2, uvxVar, null, false, null, null, null, null, null, j2iVar, null, j2iVar2, null, null, null, j2iVar3, b0kVar2, 805306438, 196656, 30204);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wdk(qim0Var2, i, (byte) 24);
        }
    }

    public static final void h(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(602192828);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarF = dug.f(i1p1.q(u291.r(qim0Var, 18.0f), er31.a), u7h.f, d4o1.a);
            gfh0 gfh0VarC = t1c.c(een.h, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            rtx rtxVar = rtx.c;
            jsl jslVar = new jsl(cwl1.o0(x340Var, 2131957667));
            qim0 qim0VarR = u291.r(nim0.a, 10.0f);
            uwr uwrVar = cbx.a;
            w0h1.a(rtxVar, jslVar, qim0VarR, cbx.a(x340Var).a.c, 0L, true, x340Var, rtx.d | 196608, 16);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wfe1(qim0Var, i, (byte) 12);
        }
    }

    public static final void i(String str, String str2, String str3, String str4, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1919755496);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.g(str3) ? 256 : 128) | (x340Var.g(str4) ? 2048 : 1024) | 24576;
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarV = u291.v(qim0Var3, 327.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarZ = uyn1.z(0.0f, 20.0f, 1, dug.f(qim0VarV, ((vex) zex.a.e).i, er31.b(12.0f)));
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
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
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0Var3);
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
            k(str2, str3, str4, null, x340Var, (i2 >> 3) & 1022);
            j(i2 & 14, str, x340Var, null);
            x340Var.r(true);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yld0(str, str2, str3, str4, qim0Var2, i, (byte) 2);
        }
    }

    public static final void j(int i, String str, b0k b0kVar, qim0 qim0Var) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(867274615);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarQ = i1p1.q(u291.v(qim0Var3, 131.0f), d4o1.a);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarQ);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
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
            qim0 qim0VarR = u291.r(anm1.N("MiniCardCoverImage", qim0Var3), 101.0f);
            gra graVar2 = een.i;
            h2c h2cVar = h2c.a;
            qim0Var2 = qim0Var3;
            eso1.e(Uri.parse(str), new jsl(cwl1.o0(x340Var, 2131954623)), eqr0.D(30.0f, 0.0f, 2, h2cVar.a(qim0VarR, graVar2)), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 3072, 0, 4080);
            qim0 qim0VarA = h2cVar.a(u291.h(u291.v(qim0Var2, 54.0f), 50.0f), een.g);
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarA);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            o(null, x340Var, 0);
            h(h2cVar.a(qim0Var2, een.Y), x340Var, 0);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gy0(str, qim0Var2, i, (byte) 19);
        }
    }

    public static final void k(String str, String str2, String str3, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(46762511);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(str3) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, u291.v(qim0Var3, 226.0f));
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            vbe.s(str3, anm1.N("PremiumSignifier", qim0Var3), 0L, 0L, (lee1) null, false, x340Var, (i3 >> 6) & 14, 60);
            op71.g(x340Var, u291.h(qim0Var3, 12.0f));
            m(i3 & 14, str, x340Var, null);
            if (str2.length() > 0) {
                v8i0.i(16.0f, 273729008, x340Var, x340Var, qim0Var3);
                l((i3 >> 3) & 14, str2, x340Var, null);
                x340Var.r(false);
            } else {
                x340Var.i0(273845289);
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c5(str, str2, str3, qim0Var2, i, (byte) 3);
        }
    }

    public static final void l(int i, String str, b0k b0kVar, qim0 qim0Var) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1450489880);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("MiniCardFooter", qim0Var3);
            uwr uwrVar = cbx.a;
            uwo1.e(str, qim0VarN, cbx.d(x340Var).j, ((vex) zex.a.e).n, null, null, 2, false, new cjc0(3), 0, null, x340Var, i3 & 14, 0, 1712);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gy0(str, qim0Var2, i, (byte) 20);
        }
    }

    public static final void m(int i, String str, b0k b0kVar, qim0 qim0Var) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2084316571);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("MiniCardTitle", qim0Var3);
            uwr uwrVar = cbx.a;
            uwo1.e(str, qim0VarN, cbx.d(x340Var).h, cbx.a(x340Var).b.a, null, null, 2, false, new cjc0(3), 0, null, x340Var, i3 & 14, 0, 1712);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gy0(str, qim0Var2, i, (byte) 21);
        }
    }

    public static final void n(zro0 zro0Var, qj0 qj0Var, umf0 umf0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1445202684);
        if ((i & 6) == 0) {
            i2 = (b0kVar2.g(zro0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? b0kVar2.g(qj0Var) : b0kVar2.i(qj0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? b0kVar2.g(umf0Var) : b0kVar2.i(umf0Var) ? 256 : 128;
        }
        if (b0kVar2.Y(i2 & 1, (i2 & 147) != 146)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarH = l6o1.H(voo1.y(u291.d(nim0Var, 1.0f), voo1.c), l6o1.C(0, 0, 1, b0kVar2), false, 14);
            uwr uwrVar = cbx.a;
            qim0 qim0VarX = uyn1.x(qim0VarH, cbx.b(b0kVar2).b.c);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarX);
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
            pbh pbhVar = pbh.a;
            op71.g(b0kVar2, pbhVar.a(1.0f, nim0Var, true));
            cwl1.f(i3o1.n(2131233703, b0kVar2, 0), (String) null, u291.a(nim0Var, 1.0f, 1.0f), (tl3) null, (j6m) null, 0.0f, (ColorFilter) null, b0kVar2, 56, 120);
            op71.g(b0kVar2, u291.h(nim0Var, 40.0f));
            uwo1.e(zro0Var.a, null, cbx.d(b0kVar2).d, 0L, new a0e1(3), null, 0, false, null, 0, null, b0kVar2, 0, 0, 2026);
            op71.g(b0kVar2, u291.h(nim0Var, 16.0f));
            uwo1.e(zro0Var.b, null, cbx.d(b0kVar2).g, 0L, new a0e1(3), null, 0, false, null, 0, null, b0kVar2, 0, 0, 2026);
            op71.g(b0kVar2, u291.h(nim0Var, 40.0f));
            int i3 = i2;
            b0kVar2 = b0kVar2;
            otw.c(qj0Var, new za(zro0Var.c), (qim0) null, (ipb1) null, b0kVar2, ((i3 >> 3) & 14) | 8, 12);
            op71.g(b0kVar2, u291.h(nim0Var, 20.0f));
            otw.c(umf0Var, new v9r(zro0Var.d), (qim0) null, (ipb1) null, b0kVar2, 8 | ((i3 >> 6) & 14), 12);
            op71.g(b0kVar2, u291.h(nim0Var, 56.0f));
            uwo1.e(zro0Var.e, null, cbx.d(b0kVar2).j, 0L, new a0e1(3), null, 0, false, null, 0, null, b0kVar2, 0, 0, 2026);
            op71.g(b0kVar2, pbhVar.a(1.0f, nim0Var, true));
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new jmk0(zro0Var, qj0Var, umf0Var, i, (byte) 7);
        }
    }

    public static final void o(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(606469971);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarQ = i1p1.q(u291.r(qim0Var2, 48.0f), er31.a);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarQ, cbx.a(x340Var).c.c, d4o1.a);
            gfh0 gfh0VarC = t1c.c(een.h, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            w0h1.a(xpx.c, new jsl(cwl1.o0(x340Var, 2131959808)), (qim0) null, cbx.a(x340Var).a.c, 0L, false, x340Var, xpx.d, 52);
            x340Var.r(true);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wfe1(qim0Var, i, (byte) 13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003d  */
    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    public static final void p(float f, float f2, float f3, b0k b0kVar, int i, int i2) {
        float f4;
        int i3;
        boolean z;
        float f5;
        h311 h311VarV;
        float f6;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(250428478);
        int i4 = i | (x340Var.d(f) ? 4 : 2) | (x340Var.d(f2) ? 32 : 16);
        if ((i2 & 4) == 0) {
            f4 = f3;
            int i5 = x340Var.d(f4) ? 256 : 128;
            i3 = i4 | i5;
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                x340Var.d0();
                if ((i & 1) != 0 || x340Var.E()) {
                    if ((i2 & 4) != 0) {
                        f6 = 0.0f;
                    }
                    x340Var.s();
                    qim0 qim0VarB = uyn1.B(u291.h(u291.v(nim0.a, f), f2), 0.0f, f6, 0.0f, 0.0f, 13);
                    uwr uwrVar = cbx.a;
                    long jA = cbx.a(x340Var).a.b.a();
                    cua cuaVar = cbx.b(x340Var).f;
                    t1c.a(cwl1.l0(dug.f(qim0VarB, jA, er31.b(4.0f)), 0L, (hw61) null, 15), x340Var, 0);
                    f5 = f6;
                } else {
                    x340Var.b0();
                    int i6 = i2 & 4;
                }
                f6 = f4;
                x340Var.s();
                qim0 qim0VarB2 = uyn1.B(u291.h(u291.v(nim0.a, f), f2), 0.0f, f6, 0.0f, 0.0f, 13);
                uwr uwrVar2 = cbx.a;
                long jA2 = cbx.a(x340Var).a.b.a();
                cua cuaVar2 = cbx.b(x340Var).f;
                t1c.a(cwl1.l0(dug.f(qim0VarB2, jA2, er31.b(4.0f)), 0L, (hw61) null, 15), x340Var, 0);
                f5 = f6;
            } else {
                x340Var.b0();
                f5 = f4;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ly00(f, f2, f5, i, i2, (byte) 0);
            }
        }
        f4 = f3;
        i3 = i4 | i5;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                if ((i2 & 4) != 0) {
                    f6 = 0.0f;
                } else {
                    f6 = f4;
                }
            } else if ((i2 & 4) != 0) {
                f6 = 0.0f;
            } else {
                f6 = f4;
            }
            x340Var.s();
            qim0 qim0VarB3 = uyn1.B(u291.h(u291.v(nim0.a, f), f2), 0.0f, f6, 0.0f, 0.0f, 13);
            uwr uwrVar3 = cbx.a;
            long jA3 = cbx.a(x340Var).a.b.a();
            cua cuaVar3 = cbx.b(x340Var).f;
            t1c.a(cwl1.l0(dug.f(qim0VarB3, jA3, er31.b(4.0f)), 0L, (hw61) null, 15), x340Var, 0);
            f5 = f6;
        } else {
            x340Var.b0();
            f5 = f4;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ly00(f, f2, f5, i, i2, (byte) 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    public static final void q(oyh1 oyh1Var, htl1 htl1Var, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        Function0 function2;
        qim0 qim0Var2;
        boolean z;
        qim0 qim0Var3;
        float f;
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2022318662);
        j06 j06Var = x340Var.a;
        int i3 = i | (x340Var.g(oyh1Var) ? 4 : 2) | (x340Var.i(htl1Var) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(function1) ? 2048 : 1024) | (x340Var.i(qim0Var) ? 16384 : 8192);
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            boolean zJ = u890.j(htl1Var != null ? htl1Var.b : null, brl1.b);
            qim0 qim0VarB = uyn1.B(u291.f(qim0Var, 1.0f), 0.0f, 32.0f, 0.0f, 0.0f, 13);
            mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0Var4 = nim0.a;
            if (zJ) {
                qim0Var2 = qim0Var4;
                z = true;
                qim0Var3 = null;
                f = 24.0f;
                i2 = 0;
                x340Var.i0(1106205778);
                x340Var.r(false);
            } else {
                x340Var.i0(1105871350);
                qim0 qim0VarZ = uyn1.z(8.0f, 0.0f, 2, qim0Var4);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarZ);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC, x340Var, lljVar);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar4);
                qim0Var2 = qim0Var4;
                z = true;
                qim0Var3 = null;
                i2 = 0;
                i(oyh1Var.e, oyh1Var.d, oyh1Var.f, oyh1Var.g, null, x340Var, 0);
                x340Var.r(true);
                f = 24.0f;
                op71.g(x340Var, u291.h(qim0Var2, 24.0f));
                x340Var.r(false);
            }
            d(i2, oyh1Var.b, oyh1Var.c, x340Var, qim0Var3);
            op71.g(x340Var, u291.h(qim0Var2, f));
            c((i3 >> 3) & 112, oyh1Var.a, function0, x340Var, qim0Var3);
            op71.g(x340Var, u291.h(qim0Var2, 12.0f));
            ?? r10 = (i3 & 7168) == 2048 ? z : i2;
            Object objT = x340Var.T();
            if (r10 != 0 || objT == fkj0.X) {
                function2 = function1;
                objT = new sah1(function2, (byte) 5);
                x340Var.s0(objT);
            } else {
                function2 = function1;
            }
            e(i2, (Function0) objT, x340Var, qim0Var3);
            x0d.s(qim0Var2, 52.0f, x340Var, z);
        } else {
            function2 = function1;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tte1((byte) 8, i, oyh1Var, htl1Var, function0, function2, qim0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    public static final ixg s(gw70 gw70Var, aai0 aai0Var, p370 p370Var, Uri uri) {
        Uri uri2;
        char c;
        int i;
        Uri uriB = aai0.b(uri);
        bg11 bg11Var = p370.a;
        Uri uriA = uriB == null ? Uri.EMPTY : p370.a(uriB.toString());
        String queryParameter = uri.getQueryParameter("fallback");
        if (jhc1.F(queryParameter)) {
            uri2 = null;
        } else {
            uri2 = Uri.parse(queryParameter);
            if (!"android.resource".equals(uri2.getScheme()) || !aai0Var.b.getPackageName().equals(uri2.getAuthority())) {
                uri2 = null;
            }
        }
        String queryParameter2 = uri.getQueryParameter("transformation");
        char c2 = 0;
        if (queryParameter2 == null || queryParameter2.isEmpty()) {
            c = 3;
        } else {
            String upperCase = queryParameter2.toUpperCase(Locale.ENGLISH);
            if (upperCase == null) {
                bhn0.i("Name is null");
            } else if (upperCase.equals("CIRCULAR")) {
                c = 1;
            } else if (upperCase.equals("ROUNDED_CORNER")) {
                c = 2;
            } else if (upperCase.equals("NONE")) {
                c = 3;
            } else {
                hhg1.n("No enum constant com.spotify.mediasession.imageprovider.MediaUriUtil.Transformation.".concat(upperCase));
            }
            c = 0;
        }
        ixg ixgVarC = uri2 != null ? gw70Var.c(new c3i1(uriA, Collections.singletonList(uri2))) : gw70Var.b(uriA);
        ixgVarC.e();
        ixgVarC.g = false;
        if (c == 1) {
            ixgVarC.s(new kcg());
        } else if (c == 2) {
            ixgVarC.s(new fr31((Integer) null));
        }
        String queryParameter3 = uri.getQueryParameter("dimension");
        if (!jhc1.F(queryParameter3)) {
            String upperCase2 = queryParameter3.toUpperCase(Locale.ENGLISH);
            if (upperCase2 == null) {
                bhn0.i("Name is null");
            } else if (upperCase2.equals("LARGE")) {
                c2 = 1;
            } else if (upperCase2.equals("NORMAL")) {
                c2 = 2;
            } else if (upperCase2.equals("SMALL")) {
                c2 = 3;
            } else {
                hhg1.n("No enum constant com.spotify.mediasession.imageprovider.MediaUriUtil.ImageDimension.".concat(upperCase2));
            }
        }
        if (c2 != 0) {
            if (c2 == 1) {
                i = 640;
            } else if (c2 == 2) {
                i = 320;
            } else {
                if (c2 != 3) {
                    throw null;
                }
                i = 160;
            }
            ixgVarC.p(i, i, 3);
            ixgVarC.d();
        }
        return ixgVarC;
    }

    public static Object t(m8n m8nVar, Object obj, vu30 vu30Var) {
        return vu30Var.invoke(obj, m8nVar);
    }

    public static m8n u(m8n m8nVar, n8n n8nVar) {
        if (u890.j(m8nVar.getKey(), n8nVar)) {
            return m8nVar;
        }
        return null;
    }

    public static final String v(String str, String str2) {
        Object next;
        Iterator it = ihc1.Q0(str, new String[]{"&"}, 0, 6).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!ihc1.h0((String) next, str2, false));
        String str3 = (String) next;
        if (str3 == null) {
            str3 = "";
        }
        List listQ0 = ihc1.Q0(str3, new String[]{"="}, 2, 2);
        return listQ0.size() < 2 ? "" : (String) listQ0.get(1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static da60 w(Artwork artwork) {
        int iN = artwork.n();
        switch (iN == 0 ? -1 : eb60.c[l1d.C(iN)]) {
            case SplitInstallErrorCode.ACTIVE_SESSIONS_LIMIT_EXCEEDED /* -1 */:
            case 8:
                return null;
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
            default:
                eg.o();
                return null;
            case 1:
                ArrayList<kf50> arrayListU = zpn1.u(artwork.r());
                if (arrayListU != null) {
                    ArrayList arrayList = new ArrayList(q7h.U(arrayListU, 10));
                    for (kf50 kf50Var : arrayListU) {
                        arrayList.add(new ra60(kf50Var.a, kf50Var.b));
                    }
                    return new x960(arrayList);
                }
                return null;
            case 2:
                return new z960(C(artwork.t().o()));
            case 3:
                return new y960(C(artwork.s().o()), C(artwork.s().p()));
            case 4:
                return new ba60(C(artwork.v().o()), C(artwork.v().p()));
            case 5:
                return new ca60(C(artwork.w().o()), C(artwork.w().p()), C(artwork.w().q()));
            case 6:
                return new aa60(C(artwork.u().o()), C(artwork.u().p()), C(artwork.u().q()));
            case 7:
                return new w960(artwork.q().o().q(), artwork.q().o().getName(), artwork.q().p().q(), artwork.q().p().getName());
        }
    }

    public static va60 x(RankedListSection rankedListSection) {
        EntityImage entityImageN = rankedListSection.n();
        ya60 wa60Var = entityImageN.getImageUrl().length() == 0 ? null : eb60.b[entityImageN.o().ordinal()] == 1 ? new wa60(entityImageN.getImageUrl()) : new xa60(entityImageN.getImageUrl());
        String title = rankedListSection.getTitle();
        List<RankedListItem> itemsList = rankedListSection.getItemsList();
        ArrayList arrayList = new ArrayList(q7h.U(itemsList, 10));
        for (RankedListItem rankedListItem : itemsList) {
            arrayList.add(new ua60(rankedListItem.o(), rankedListItem.n()));
        }
        return new va60(wa60Var, title, arrayList);
    }

    public static za60 y(StackItem stackItem) {
        d761 d761Var = new d761(stackItem.q().toByteArray());
        d761 d761Var2 = new d761(stackItem.p().toByteArray());
        String str = null;
        if (stackItem.r()) {
            String imageUrl = stackItem.o().getImageUrl();
            imageUrl.getClass();
            if (imageUrl.length() > 0) {
                str = imageUrl;
            }
        }
        return new za60(d761Var, d761Var2, str);
    }

    public static o8n z(m8n m8nVar, n8n n8nVar) {
        return u890.j(m8nVar.getKey(), n8nVar) ? o6x.a : (o8n) m8nVar;
    }
}
