package p;

import android.content.Context;
import android.content.Intent;
import com.spotify.extendedmetadata.extensions.concertcampaignroutingimpl.proto.LatLon;
import com.spotify.extendedmetadata.extensions.concertcampaignroutingimpl.proto.Location;
import com.spotify.extendedmetadata.extensions.concertcampaignroutingimpl.proto.PhysicalLocation;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Update;
import com.spotify.widgets.npvwidget.WidgetInteraction;
import com.spotify.wrapped.v1.proto.StoryCard;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class cxm {
    public static final t9b a = new t9b();
    public static b180 b;
    public static b180 c;

    public static final ohe0 A(Location location) {
        iie0 hie0Var;
        String name = location.getName();
        int iO = location.o();
        if ((iO == 0 ? -1 : zdk.a[l1d.C(iO)]) == 1) {
            PhysicalLocation physicalLocationP = location.p();
            String strN = physicalLocationP.n();
            LatLon latLonP = physicalLocationP.p();
            hie0Var = new hie0(strN, new vgb0(latLonP.o(), latLonP.p()));
        } else {
            hie0Var = gie0.a;
        }
        return new ohe0(name, hie0Var, location.r() ? location.q() : null);
    }

    public static final void B(String str, xgm1 xgm1Var, int i, boolean z) {
        StoryCard storyCard = ((wgm1) xgm1Var.getState().getValue()).a;
        if (u890.j(storyCard != null ? storyCard.getId() : null, str)) {
            if (z) {
                xgm1Var.a(new qgm1(Integer.valueOf(i), false));
                xgm1Var.a(sgm1.a);
            } else {
                xgm1Var.a(hgm1.a);
                xgm1Var.a(new qgm1(Integer.valueOf(i), false));
            }
        }
    }

    public static final r920 C(r920 r920Var, bpo bpoVar, s69 s69Var) {
        int iOrdinal = bpoVar.ordinal();
        if (iOrdinal == 4 || iOrdinal == 5) {
            return r920.a(r920Var, s69Var, (s69) null, 6);
        }
        return (iOrdinal == 12 || iOrdinal == 13) ? r920.a(r920Var, (s69) null, s69Var, 3) : r920Var;
    }

    public static final void a(okb okbVar, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1573936352);
        int i2 = (x340Var.i(qim0Var) ? 32 : 16) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            t1c.a(dug.e(qim0Var, okbVar.a, (hw61) null, 0.0f, 6), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hj8(okbVar, qim0Var, i, (byte) 16);
        }
    }

    public static float b(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static int c(int i, int i2, List list) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i2, i);
        List list2 = list;
        int size = list2.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            afh0 afh0Var = (afh0) list.get(i3);
            float fV = x760.v(x760.t(afh0Var));
            if (fV == 0.0f) {
                int iMin2 = Math.min(afh0Var.C(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, afh0Var.d(iMin2));
            } else if (fV > 0.0f) {
                f += fV;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            afh0 afh0Var2 = (afh0) list.get(i4);
            float fV2 = x760.v(x760.t(afh0Var2));
            if (fV2 > 0.0f) {
                iMax = Math.max(iMax, afh0Var2.d(iRound != Integer.MAX_VALUE ? Math.round(iRound * fV2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public static int d(int i, int i2, List list) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            afh0 afh0Var = (afh0) list.get(i4);
            float fV = x760.v(x760.t(afh0Var));
            int iC = afh0Var.C(i);
            if (fV == 0.0f) {
                i3 += iC;
            } else if (fV > 0.0f) {
                f += fV;
                iMax = Math.max(iMax, Math.round(iC / fV));
            }
        }
        return ((list.size() - 1) * i2) + Math.round(iMax * f) + i3;
    }

    public static int e(int i, int i2, List list) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i2, i);
        List list2 = list;
        int size = list2.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            afh0 afh0Var = (afh0) list.get(i3);
            float fV = x760.v(x760.t(afh0Var));
            if (fV == 0.0f) {
                int iMin2 = Math.min(afh0Var.C(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, afh0Var.n(iMin2));
            } else if (fV > 0.0f) {
                f += fV;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            afh0 afh0Var2 = (afh0) list.get(i4);
            float fV2 = x760.v(x760.t(afh0Var2));
            if (fV2 > 0.0f) {
                iMax = Math.max(iMax, afh0Var2.n(iRound != Integer.MAX_VALUE ? Math.round(iRound * fV2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public static int f(int i, int i2, List list) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            afh0 afh0Var = (afh0) list.get(i4);
            float fV = x760.v(x760.t(afh0Var));
            int iW = afh0Var.w(i);
            if (fV == 0.0f) {
                i3 += iW;
            } else if (fV > 0.0f) {
                f += fV;
                iMax = Math.max(iMax, Math.round(iW / fV));
            }
        }
        return ((list.size() - 1) * i2) + Math.round(iMax * f) + i3;
    }

    public static final void g(gt40 gt40Var, float f, float f2, int i, b0k b0kVar, int i2, int i3) {
        gt40 gt40Var2;
        int i4;
        float f3;
        float f4;
        b0k b0kVar2;
        gt40 gt40Var3;
        float f5;
        float f6;
        int i5;
        float f7;
        float f8;
        int i6;
        gt40 gt40Var4;
        float f9;
        float f10;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1439280086);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i4 = i2 | 6;
            gt40Var2 = gt40Var;
        } else {
            gt40Var2 = gt40Var;
            i4 = (b0kVar3.i(gt40Var2) ? 4 : 2) | i2;
        }
        if ((i2 & 48) == 0) {
            if ((i3 & 2) == 0) {
                f3 = f;
                int i8 = b0kVar3.d(f3) ? 32 : 16;
                i4 |= i8;
            } else {
                f3 = f;
            }
            i4 |= i8;
        } else {
            f3 = f;
        }
        if ((i2 & 384) == 0) {
            if ((i3 & 4) == 0) {
                f4 = f2;
                int i9 = b0kVar3.d(f4) ? 256 : 128;
                i4 |= i9;
            } else {
                f4 = f2;
            }
            i4 |= i9;
        } else {
            f4 = f2;
        }
        int i10 = i3 & 8;
        if (i10 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= b0kVar3.e(i == 0 ? -1 : l1d.C(i)) ? 2048 : 1024;
        }
        if (b0kVar3.Y(i4 & 1, (i4 & 1171) != 1170)) {
            b0kVar3.d0();
            if ((i2 & 1) == 0 || b0kVar3.E()) {
                gt40 gt40Var5 = i7 != 0 ? et40.a : gt40Var2;
                if ((i3 & 2) != 0) {
                    i4 &= -113;
                    f7 = 48.0f;
                } else {
                    f7 = f3;
                }
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                    f8 = 8.0f;
                } else {
                    f8 = f4;
                }
                if (i10 != 0) {
                    gt40Var4 = gt40Var5;
                    f9 = f7;
                    f10 = f8;
                    i6 = 7;
                } else {
                    i6 = i;
                    gt40Var4 = gt40Var5;
                    f9 = f7;
                    f10 = f8;
                }
            } else {
                b0kVar3.b0();
                if ((i3 & 2) != 0) {
                    i4 &= -113;
                }
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                }
                i6 = i;
                gt40Var4 = gt40Var2;
                f9 = f3;
                f10 = f4;
            }
            b0kVar3.s();
            Context context = (Context) b0kVar3.k(p4k.b);
            String str = (String) b0kVar3.k(wol1.a);
            String str2 = (String) b0kVar3.k(wol1.b);
            String str3 = (String) b0kVar3.k(wol1.c);
            boolean zG = b0kVar3.g(str2) | b0kVar3.g(str3);
            Object objT = b0kVar3.T();
            if (zG || objT == fkj0.X) {
                objT = new r3f0(str2, str3);
                b0kVar3.s0(objT);
            }
            Intent intentB = dro.B((String) null, str, (WidgetInteraction) ((Function0) objT).invoke());
            intentB.setFlags(268435456);
            whb1 whb1Var = new whb1(intentB, w0h1.A((y60[]) Arrays.copyOf(new y60[0], 0)), apl1.a());
            int i11 = i4 << 18;
            b0kVar2 = b0kVar3;
            czo1.c(2131233395, u7h.b, context.getString(2131959288), whb1Var, gt40Var4, 0L, false, f9, f10, i6, b0kVar2, ((i4 << 12) & 57344) | (29360128 & i11) | (234881024 & i11) | (i11 & 1879048192), 96);
            gt40Var3 = gt40Var4;
            f5 = f9;
            f6 = f10;
            i5 = i6;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            gt40Var3 = gt40Var2;
            f5 = f3;
            f6 = f4;
            i5 = i;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new q3f0(gt40Var3, f5, f6, i5, i2, i3);
        }
    }

    public static final void h(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1403439864);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            gpx gpxVar = gpx.c;
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).b.b;
            jsl jslVar = new jsl(cwl1.o0(x340Var, 2131958386));
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new us21(function0, (byte) 10);
                x340Var.s0(objT);
            }
            qim0Var2 = nim0.a;
            w0h1.a(gpxVar, jslVar, u291.r(uyn1.x(bin.x(qim0Var2, false, (String) null, (pm31) null, (idn0) null, (Function0) objT, 15), 12.0f), 24.0f), j, 0L, false, x340Var, gpx.d, 48);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new t531(function0, qim0Var2, i, (byte) 1);
        }
    }

    public static float i(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static final void j(int i, j2i j2iVar, b0k b0kVar, vu30 vu30Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1302703572);
        j06 j06Var = x340Var.a;
        int i2 = (x340Var.i(j2iVar) ? 4 : 2) | i | (x340Var.i(vu30Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarB = uyn1.B(nim0Var, 16.0f, 0.0f, 8.0f, 0.0f, 10);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = new td4((byte) 18);
                x340Var.s0(objT);
            }
            gfh0 gfh0Var = (gfh0) objT;
            int iK = tgp1.k(x340Var);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            nko1.H(gfh0Var, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            llj lljVar3 = y580.R0;
            if (x340Var.S || !u890.j(x340Var.T(), Integer.valueOf(iK))) {
                z5c.f(iK, x340Var, iK, lljVar3);
            }
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarZ = uyn1.z(0.0f, 6.0f, 1, t3k1.x(nim0Var, "text"));
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iK2 = tgp1.k(x340Var);
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
            if (x340Var.S || !u890.j(x340Var.T(), Integer.valueOf(iK2))) {
                z5c.f(iK2, x340Var, iK2, lljVar3);
            }
            nko1.H(qim0VarE2, x340Var, lljVar4);
            dv20.l(i2 & 14, j2iVar, x340Var, true);
            qim0 qim0VarX = t3k1.x(nim0Var, "action");
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iK3 = tgp1.k(x340Var);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarX);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            if (x340Var.S || !u890.j(x340Var.T(), Integer.valueOf(iK3))) {
                z5c.f(iK3, x340Var, iK3, lljVar3);
            }
            nko1.H(qim0VarE3, x340Var, lljVar4);
            us71.k((i2 >> 3) & 14, vu30Var, x340Var, true, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rs91(j2iVar, vu30Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:235:0x0401  */
    public static final void k(gg31 gg31Var, String str, String str2, boolean z, z201 z201Var, c101 c101Var, fqm fqmVar, sve sveVar, lgq lgqVar, h4q h4qVar, s880 s880Var, apl aplVar, ngs0 ngs0Var, boolean z2, boolean z3, iu30 iu30Var, qim0 qim0Var, boolean z4, boolean z5, boolean z6, b0k b0kVar, int i, int i2) {
        b0k b0kVar2;
        qim0 qim0Var2;
        fa0 fa0Var;
        Object next;
        float f;
        float f2;
        char c2;
        z90 z90Var;
        List listI0;
        String str3 = gg31Var.j;
        m4c m4cVar = fkj0.X;
        cg31 cg31Var = gg31Var.n;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(115816570);
        int i3 = (i & 6) == 0 ? (b0kVar3.i(gg31Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= b0kVar3.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= b0kVar3.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= b0kVar3.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= b0kVar3.i(z201Var) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= b0kVar3.i(c101Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= b0kVar3.i(fqmVar) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= (i & 16777216) == 0 ? b0kVar3.g(sveVar) : b0kVar3.i(sveVar) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= b0kVar3.i(lgqVar) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= b0kVar3.i(h4qVar) ? 536870912 : 268435456;
        }
        int i4 = (i2 & 6) == 0 ? i2 | (b0kVar3.i(s880Var) ? 4 : 2) : i2;
        if ((i2 & 48) == 0) {
            i4 |= b0kVar3.i(aplVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= b0kVar3.i(ngs0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= b0kVar3.h(z2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= b0kVar3.h(z3) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= b0kVar3.i(iu30Var) ? 131072 : 65536;
        }
        int i5 = i4 | 1572864;
        if ((i2 & 12582912) == 0) {
            i5 |= b0kVar3.h(z4) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i5 |= b0kVar3.h(z5) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i5 |= b0kVar3.h(z6) ? 536870912 : 268435456;
        }
        int i6 = i5;
        if (b0kVar3.Y(i3 & 1, ((i3 & 306783379) == 306783378 && (i6 & 306783379) == 306783378) ? false : true)) {
            boolean zJ = u890.j(gg31Var.l.a, str2);
            Iterator it = gg31Var.q.iterator();
            do {
                fa0Var = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!u890.j(((gxz0) next).c.a, str2));
            gxz0 gxz0Var = (gxz0) next;
            String str4 = gxz0Var != null ? gxz0Var.b : null;
            boolean zG = b0kVar3.g(str4);
            Object objT = b0kVar3.T();
            if (zG || objT == m4cVar) {
                objT = z201Var.a(str4);
                b0kVar3.s0(objT);
            }
            ven0 ven0VarG = rwq.g((mr20) objT, z201.b, (o8n) null, b0kVar3, 0, 2);
            boolean z7 = cg31Var instanceof cg31;
            tob1 tob1VarB = z95.b((z7 && cg31Var.a) ? 0.5f : 1.0f, irn1.o0(150, 0, mlv.d, 2), "dimAlpha", (iu30) null, b0kVar3, 3072, 20);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar3, 0);
            String str5 = str4;
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
            if (gg31Var.v) {
                b0kVar3.i0(-1119004264);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(b0kVar3).b;
                b0kVar3.r(false);
                f = 8.0f;
            } else {
                b0kVar3.i0(-1119002632);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(b0kVar3).b;
                b0kVar3.r(false);
                f = 4.0f;
            }
            op71.g(b0kVar3, u291.h(qim0Var3, f));
            boolean zG2 = b0kVar3.g(str3) | ((i6 & 1879048192) == 536870912);
            Object objT2 = b0kVar3.T();
            if (zG2 || objT2 == m4cVar) {
                objT2 = h4qVar.a(str3, z6);
                b0kVar3.s0(objT2);
            }
            u201 u201Var = (u201) objT2;
            tom tomVar = new tom(gg31Var.j, str, gg31Var.l, gg31Var.o, true, aplVar, (rom) null, (ArrayList) null, (ArrayList) null, (nom) null, gg31Var.k, (xo2) null, 3008);
            boolean zG3 = b0kVar3.g(tomVar);
            Object objT3 = b0kVar3.T();
            if (zG3 || objT3 == m4cVar) {
                objT3 = lgqVar.a(tomVar, new ug31(gg31Var, (byte) 1));
                b0kVar3.s0(objT3);
            }
            oa0 oa0Var = (oa0) objT3;
            float f3 = gg31Var.m;
            c380 c380Var = (c380) ven0VarG.getValue();
            boolean z8 = gg31Var.p && !z7;
            boolean z9 = gg31Var.t;
            boolean z10 = gg31Var.u;
            boolean z11 = gg31Var.k;
            if (z7) {
                listI0 = Collections.singletonList(aa0.d);
                f2 = f3;
            } else {
                if ((aplVar instanceof mpl) || (aplVar instanceof wol)) {
                    f2 = f3;
                } else {
                    if (!(aplVar instanceof ppl)) {
                        eg.o();
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (opl oplVar : ((ppl) aplVar).b) {
                        mg31 mg31Var = oplVar.c;
                        if (mg31Var != null) {
                            String str6 = mg31Var.b;
                            int iC = l1d.C(oplVar.b);
                            if (iC == 0) {
                                arrayList.add(new ca0(str6, mg31Var.c, mg31Var.d));
                            } else {
                                if (iC != 1) {
                                    eg.o();
                                    return;
                                }
                                arrayList2.add(new da0(str6));
                            }
                        }
                        f3 = f3;
                    }
                    f2 = f3;
                    ea0 ea0Var = (arrayList.isEmpty() && arrayList2.isEmpty()) ? null : new ea0(arrayList, arrayList2);
                    if (!zJ && (aplVar instanceof ppl)) {
                        fa0Var = fa0.d;
                    }
                    if (zJ || !z11) {
                        c2 = 1;
                        z90Var = ba0.d;
                    } else {
                        c2 = 1;
                        z90Var = new z90(true);
                    }
                    ga0[] ga0VarArr = new ga0[3];
                    ga0VarArr[0] = ea0Var;
                    ga0VarArr[c2] = fa0Var;
                    ga0VarArr[2] = z90Var;
                    listI0 = f46.i0(ga0VarArr);
                }
                if (!zJ) {
                    fa0Var = fa0.d;
                }
                if (zJ) {
                    c2 = 1;
                    z90Var = ba0.d;
                } else {
                    c2 = 1;
                    z90Var = ba0.d;
                }
                ga0[] ga0VarArr2 = new ga0[3];
                ga0VarArr2[0] = ea0Var;
                ga0VarArr2[c2] = fa0Var;
                ga0VarArr2[2] = z90Var;
                listI0 = f46.i0(ga0VarArr2);
            }
            c9 c9VarF = mqo1.F(listI0);
            int i7 = i6 & 458752;
            boolean zI = b0kVar3.i(gg31Var) | (i7 == 131072);
            Object objT4 = b0kVar3.T();
            if (zI || objT4 == m4cVar) {
                objT4 = new tg31(gg31Var, iu30Var, (byte) 0);
                b0kVar3.s0(objT4);
            }
            iu30 iu30Var2 = (iu30) objT4;
            boolean zI2 = b0kVar3.i(gg31Var) | (i7 == 131072);
            Object objT5 = b0kVar3.T();
            if (zI2 || objT5 == m4cVar) {
                objT5 = new tg31(gg31Var, iu30Var, (byte) 1);
                b0kVar3.s0(objT5);
            }
            iu30 iu30Var3 = (iu30) objT5;
            boolean zI3 = b0kVar3.i(gg31Var);
            Object objT6 = b0kVar3.T();
            if (zI3 || objT6 == m4cVar) {
                objT6 = new ug31(gg31Var, (byte) 0);
                b0kVar3.s0(objT6);
            }
            b0kVar2 = b0kVar3;
            exd0.h(u201Var, oa0Var, f2, null, z10, zJ, z8, z9, str5, c9VarF, iu30Var2, c380Var, iu30Var3, (Function0) objT6, apo.r(951691511, new xg31(gg31Var, str2, z2, z3, z, zJ, str, aplVar, s880Var, sveVar, tob1VarB, iu30Var, z4, z5, fqmVar, c101Var, ngs0Var), b0kVar2), b0kVar2, 0, 8);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new yg31(gg31Var, str, str2, z, z201Var, c101Var, fqmVar, sveVar, lgqVar, h4qVar, s880Var, aplVar, ngs0Var, z2, z3, iu30Var, qim0Var2, z4, z5, z6, i, i2);
        }
    }

    public static final void l(final qim0 qim0Var, final vu30 vu30Var, final hw61 hw61Var, final long j, final long j2, final float f, final j2i j2iVar, b0k b0kVar, final int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-662779944);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(qim0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(vu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.h(false) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.g(hw61Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.f(j) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar3.f(j2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= b0kVar3.d(f) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= b0kVar3.i(j2iVar) ? 8388608 : 4194304;
        }
        if (b0kVar3.Y(i2 & 1, (4793491 & i2) != 4793490)) {
            b0kVar3.d0();
            if ((i & 1) != 0 && !b0kVar3.E()) {
                b0kVar3.b0();
            }
            b0kVar3.s();
            int i3 = i2 >> 6;
            b0kVar2 = b0kVar3;
            puo1.i(qim0Var, hw61Var, j, j2, f, apo.r(-1429068516, new rs91(vu30Var, j2iVar, (byte) 1), b0kVar3), b0kVar2, (i2 & 14) | 1572864 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | ((i2 >> 3) & 458752), 16);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.xs91
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    cxm.l(qim0Var, vu30Var, hw61Var, j, j2, f, j2iVar, (b0k) obj, czo1.p(i | 1));
                    return rih1.a;
                }
            };
        }
    }

    public static final void m(final xr91 xr91Var, qim0 qim0Var, hw61 hw61Var, long j, long j2, long j3, float f, b0k b0kVar, final int i, final int i2) {
        int i3;
        final hw61 hw61Var2;
        final long jT;
        final long jC;
        b0k b0kVar2;
        final qim0 qim0Var2;
        final long jT2;
        final float f2;
        int i4;
        qim0 qim0Var3;
        float f3;
        j2i j2iVarR;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(258660814);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? b0kVar3.g(xr91Var) : b0kVar3.i(xr91Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i3 | 432;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                hw61Var2 = hw61Var;
                int i6 = b0kVar3.g(hw61Var2) ? 2048 : 1024;
                i5 |= i6;
            } else {
                hw61Var2 = hw61Var;
            }
            i5 |= i6;
        } else {
            hw61Var2 = hw61Var;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                jT = j;
                int i7 = b0kVar3.f(jT) ? 16384 : 8192;
                i5 |= i7;
            } else {
                jT = j;
            }
            i5 |= i7;
        } else {
            jT = j;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                jC = j2;
                int i8 = b0kVar3.f(jC) ? 131072 : 65536;
                i5 |= i8;
            } else {
                jC = j2;
            }
            i5 |= i8;
        } else {
            jC = j2;
        }
        if ((1572864 & i) == 0) {
            i5 |= 524288;
        }
        int i9 = 12582912;
        int i10 = i5 | 12582912;
        if (b0kVar3.Y(i10 & 1, (4793491 & i10) != 4793490)) {
            b0kVar3.d0();
            if ((i & 1) == 0 || b0kVar3.E()) {
                if ((i2 & 8) != 0) {
                    hw61Var2 = ((ox61) b0kVar3.k(qx61.a)).a;
                    i10 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    kiv kivVar = cbh.a;
                    jT = z4p1.t(u7h.b(((bbh) b0kVar3.k(kivVar)).a(), 0.8f, 0.0f, 0.0f, 0.0f, 14), ((bbh) b0kVar3.k(kivVar)).c());
                    i10 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    jC = ((bbh) b0kVar3.k(cbh.a)).c();
                    i10 &= -458753;
                }
                bbh bbhVar = (bbh) b0kVar3.k(cbh.a);
                jT2 = bbhVar.d() ? z4p1.t(u7h.b(bbhVar.c(), 0.6f, 0.0f, 0.0f, 0.0f, 14), bbhVar.b()) : ((u7h) bbhVar.b.getValue()).a;
                i4 = i10 & (-3670017);
                qim0Var3 = nim0.a;
                f3 = 6.0f;
            } else {
                b0kVar3.b0();
                if ((i2 & 8) != 0) {
                    i10 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    i10 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    i10 &= -458753;
                }
                i4 = i10 & (-3670017);
                qim0Var3 = qim0Var;
                f3 = f;
                i9 = 12582912;
                jT2 = j3;
            }
            hw61 hw61Var3 = hw61Var2;
            long j4 = jT;
            long j5 = jC;
            b0kVar3.s();
            String str = xr91Var.b;
            if (str != null) {
                b0kVar3.i0(593497188);
                j2iVarR = apo.r(1843479216, new ts91(jT2, xr91Var, str), b0kVar3);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(593796152);
                b0kVar3.r(false);
                j2iVarR = null;
            }
            b0kVar2 = b0kVar3;
            l(uyn1.x(qim0Var3, 12.0f), j2iVarR, hw61Var3, j4, j5, f3, apo.r(-261845785, new w9(xr91Var, (byte) 24), b0kVar3), b0kVar2, (i4 & 896) | i9 | (i4 & 7168) | (57344 & i4) | (458752 & i4) | ((i4 >> 3) & 3670016));
            qim0Var2 = qim0Var3;
            hw61Var2 = hw61Var3;
            jT = j4;
            jC = j5;
            f2 = f3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
            jT2 = j3;
            f2 = f;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.ws91
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    cxm.m(xr91Var, qim0Var2, hw61Var2, jT, jC, jT2, f2, (b0k) obj, czo1.p(i | 1), i2);
                    return rih1.a;
                }
            };
        }
    }

    public static final void n(int i, j2i j2iVar, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(343813818);
        j06 j06Var = x340Var.a;
        int i2 = (x340Var.i(j2iVar) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = td4.l;
                x340Var.s0(objT);
            }
            gfh0 gfh0Var = (gfh0) objT;
            int iK = tgp1.k(x340Var);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
            nko1.H(gfh0Var, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            llj lljVar3 = y580.R0;
            if (x340Var.S || !u890.j(x340Var.T(), Integer.valueOf(iK))) {
                z5c.f(iK, x340Var, iK, lljVar3);
            }
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarY = uyn1.y(nim0Var, 16.0f, 6.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iK2 = tgp1.k(x340Var);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarY);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            if (x340Var.S || !u890.j(x340Var.T(), Integer.valueOf(iK2))) {
                z5c.f(iK2, x340Var, iK2, lljVar3);
            }
            nko1.H(qim0VarE2, x340Var, lljVar4);
            k4s0.i(i2 & 14, j2iVar, x340Var, true, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ai3(j2iVar, i, (byte) 5);
        }
    }

    public static int o(int i, int i2, List list) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            afh0 afh0Var = (afh0) list.get(i4);
            float fV = x760.v(x760.t(afh0Var));
            int iD = afh0Var.d(i);
            if (fV == 0.0f) {
                i3 += iD;
            } else if (fV > 0.0f) {
                f += fV;
                iMax = Math.max(iMax, Math.round(iD / fV));
            }
        }
        return ((list.size() - 1) * i2) + Math.round(iMax * f) + i3;
    }

    public static int p(int i, int i2, List list) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i2, i);
        List list2 = list;
        int size = list2.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            afh0 afh0Var = (afh0) list.get(i3);
            float fV = x760.v(x760.t(afh0Var));
            if (fV == 0.0f) {
                int iMin2 = Math.min(afh0Var.d(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, afh0Var.C(iMin2));
            } else if (fV > 0.0f) {
                f += fV;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            afh0 afh0Var2 = (afh0) list.get(i4);
            float fV2 = x760.v(x760.t(afh0Var2));
            if (fV2 > 0.0f) {
                iMax = Math.max(iMax, afh0Var2.C(iRound != Integer.MAX_VALUE ? Math.round(iRound * fV2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public static int q(int i, int i2, List list) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            afh0 afh0Var = (afh0) list.get(i4);
            float fV = x760.v(x760.t(afh0Var));
            int iN = afh0Var.n(i);
            if (fV == 0.0f) {
                i3 += iN;
            } else if (fV > 0.0f) {
                f += fV;
                iMax = Math.max(iMax, Math.round(iN / fV));
            }
        }
        return ((list.size() - 1) * i2) + Math.round(iMax * f) + i3;
    }

    public static int r(int i, int i2, List list) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i2, i);
        List list2 = list;
        int size = list2.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            afh0 afh0Var = (afh0) list.get(i3);
            float fV = x760.v(x760.t(afh0Var));
            if (fV == 0.0f) {
                int iMin2 = Math.min(afh0Var.d(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, afh0Var.w(iMin2));
            } else if (fV > 0.0f) {
                f += fV;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            afh0 afh0Var2 = (afh0) list.get(i4);
            float fV2 = x760.v(x760.t(afh0Var2));
            if (fV2 > 0.0f) {
                iMax = Math.max(iMax, afh0Var2.w(iRound != Integer.MAX_VALUE ? Math.round(iRound * fV2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public static final void s(kly0 kly0Var, cce cceVar, v9l1 v9l1Var, hcl1 hcl1Var, o0i o0iVar, iu30 iu30Var, iu30 iu30Var2, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1574772160);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(kly0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(cceVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(v9l1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(hcl1Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? x340Var.g(o0iVar) : x340Var.i(o0iVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(iu30Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.i(iu30Var2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            qim0Var2 = qim0Var;
            i2 |= x340Var.g(qim0Var2) ? 8388608 : 4194304;
        } else {
            qim0Var2 = qim0Var;
        }
        if (x340Var.Y(i2 & 1, (4793491 & i2) != 4793490)) {
            gfx.g(7, apo.r(-1617280403, new wy51(v9l1Var, qim0Var2, cceVar, o0iVar, kly0Var, hcl1Var, iu30Var, iu30Var2), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new f1c(kly0Var, cceVar, v9l1Var, hcl1Var, o0iVar, iu30Var, iu30Var2, qim0Var, i);
        }
    }

    public static int t(int i, int i2, float f) {
        if (i == i2 || f <= 0.0f) {
            return i;
        }
        if (f >= 1.0f) {
            return i2;
        }
        float f2 = ((i >> 24) & 255) / 255.0f;
        float f3 = ((i2 >> 24) & 255) / 255.0f;
        float fB = b(((i >> 16) & 255) / 255.0f);
        float fB2 = b(((i >> 8) & 255) / 255.0f);
        float fB3 = b((i & 255) / 255.0f);
        float fB4 = b(((i2 >> 16) & 255) / 255.0f);
        float fB5 = b(((i2 >> 8) & 255) / 255.0f);
        float fB6 = b((i2 & 255) / 255.0f);
        float fE = l1d.e(f3, f2, f, f2);
        float fE2 = l1d.e(fB4, fB, f, fB);
        float fE3 = l1d.e(fB5, fB2, f, fB2);
        float fE4 = l1d.e(fB6, fB3, f, fB3);
        float fI = i(fE2) * 255.0f;
        float fI2 = i(fE3) * 255.0f;
        return Math.round(i(fE4) * 255.0f) | (Math.round(fI) << 16) | (Math.round(fE * 255.0f) << 24) | (Math.round(fI2) << 8);
    }

    public static g0u u(String str) {
        Object next;
        d7 d7Var = new d7(g0u.t, (byte) 0);
        do {
            if (!d7Var.hasNext()) {
                next = null;
                break;
            }
            next = d7Var.next();
        } while (!nhc1.S(((g0u) next).name(), str, true));
        g0u g0uVar = (g0u) next;
        return g0uVar == null ? g0u.a : g0uVar;
    }

    public static final e7m0 v(Object obj, Update update, Connectable connectable, vu30 vu30Var, iu30 iu30Var) {
        return sbl.z(obj, update, connectable, vu30Var, iu30Var);
    }

    public static final e7m0 w(gi00 gi00Var, dq7 dq7Var, Connectable connectable, z691 z691Var, djx djxVar) {
        return sbl.A(gi00Var, dq7Var, connectable, z691Var, djxVar);
    }

    public static final void x(r6f1 r6f1Var, int i, String str, xgm1 xgm1Var, k7b1 k7b1Var) {
        rx7 rx7Var;
        StoryCard storyCard = ((wgm1) xgm1Var.getState().getValue()).a;
        if (u890.j(storyCard != null ? storyCard.getId() : null, str) && (rx7Var = r6f1Var.f) != null) {
            k7b1Var.invoke(Integer.valueOf(i));
            xgm1Var.a(new lgm1(rx7Var.a, rx7Var.b, rx7Var.c));
        }
    }

    public static final r920 y(r920 r920Var, bpo bpoVar, s69 s69Var) {
        int iOrdinal = bpoVar.ordinal();
        if (iOrdinal == 4 || iOrdinal == 5) {
            s69 s69Var2 = r920Var.a;
            if (s69Var2 != null) {
                s69Var = s69Var2;
            }
            return r920.a(r920Var, s69Var, (s69) null, 6);
        }
        if (iOrdinal != 12 && iOrdinal != 13) {
            return r920Var;
        }
        s69 s69Var3 = r920Var.c;
        if (s69Var3 != null) {
            s69Var = s69Var3;
        }
        return r920.a(r920Var, (s69) null, s69Var, 3);
    }

    public static final ven0 z(b0k b0kVar) {
        Object[] objArr = new Object[0];
        x7e1 x7e1Var = new x7e1((byte) 1);
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        if (objT == fkj0.X) {
            objT = ou1.N0;
            x340Var.s0(objT);
        }
        return (ven0) k5p1.u(objArr, x7e1Var, (Function0) objT, x340Var, 384);
    }
}
