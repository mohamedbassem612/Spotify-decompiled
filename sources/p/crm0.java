package p;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import androidx.credentials.internal.FrameworkClassParsingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class crm0 {
    public static b180 a;

    public static final boolean A(Intent intent) {
        List<giv> list = hiv.a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (giv givVar : list) {
            if (givVar.b) {
                ComponentName component = intent.getComponent();
                if (u890.j(component != null ? component.getClassName() : null, givVar.a)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void B(Context context, HashMap map) {
        n3c n3cVarH = n3c.h();
        ne neVarZ = ne.z(context);
        if (TextUtils.isEmpty(neVarZ.y("preinstall_partner")) && TextUtils.isEmpty(neVarZ.y("preinstall_campaign"))) {
            f4t f4tVar = f4t.b;
            if (!TextUtils.isEmpty((CharSequence) map.get("utm_campaign"))) {
                String str = (String) map.get("utm_campaign");
                String strD = eqq.d(1);
                ne neVar = n3cVarH.b;
                neVar.getClass();
                try {
                    ((JSONObject) neVar.d).putOpt(strD, str);
                } catch (JSONException e) {
                    i1k0.m(e.getMessage());
                }
            }
            f4t f4tVar2 = f4t.b;
            if (TextUtils.isEmpty((CharSequence) map.get("utm_medium"))) {
                return;
            }
            String str2 = (String) map.get("utm_medium");
            String strD2 = eqq.d(2);
            ne neVar2 = n3cVarH.b;
            neVar2.getClass();
            try {
                ((JSONObject) neVar2.d).putOpt(strD2, str2);
            } catch (JSONException e2) {
                i1k0.m(e2.getMessage());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ee  */
    public static final p041 C(wz31 wz31Var, Resources resources, Locale locale) {
        int i;
        int i2;
        String string;
        String upperCase;
        List listSingletonList;
        int i3;
        TimeZone timeZone = wz31Var.h;
        Calendar calendar = Calendar.getInstance(timeZone, locale);
        long j = wz31Var.g;
        calendar.setTimeInMillis(j);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE", locale);
        simpleDateFormat.setTimeZone(timeZone);
        String str = simpleDateFormat.format(new Date(j - 14400000));
        int i4 = calendar.get(11);
        if (4 <= i4 && i4 < 8) {
            i = 1;
        } else if (8 <= i4 && i4 < 12) {
            i = 2;
        } else if (12 <= i4 && i4 < 17) {
            i = 3;
        } else if (17 > i4 || i4 >= 21) {
            i = (21 > i4 || i4 >= 24) ? 6 : 5;
        } else {
            i = 4;
        }
        int iC = l1d.C(i);
        if (iC == 0) {
            i2 = 2131961361;
        } else if (iC == 1) {
            i2 = 2131961377;
        } else if (iC == 2) {
            i2 = 2131961359;
        } else if (iC == 3) {
            i2 = 2131961362;
        } else if (iC == 4) {
            i2 = 2131961379;
        } else {
            if (iC != 5) {
                eg.o();
                return null;
            }
            i2 = 2131961374;
        }
        String string2 = resources.getString(i2);
        gzl1 gzl1Var = wz31Var.a;
        if (gzl1Var == null) {
            string = resources.getString(2131961387, str, string2);
        } else {
            int iOrdinal = gzl1Var.ordinal();
            if (iOrdinal == 0) {
                i3 = 2131961383;
            } else if (iOrdinal == 1) {
                i3 = 2131961385;
            } else if (iOrdinal == 2) {
                i3 = 2131961381;
            } else {
                if (iOrdinal != 3) {
                    eg.o();
                    return null;
                }
                i3 = 2131961363;
            }
            string = resources.getString(2131961386, str, string2, resources.getString(i3));
            if (string == null) {
                string = resources.getString(2131961387, str, string2);
            }
        }
        String upperCase2 = string.toUpperCase(locale);
        Integer num = wz31Var.b;
        if (num == null) {
            upperCase = "—";
        } else {
            Integer num2 = num.intValue() > 0 ? num : null;
            if (num2 != null) {
                int iIntValue = num2.intValue();
                upperCase = resources.getQuantityString(2131820886, iIntValue, Integer.valueOf(iIntValue)).toUpperCase(locale);
            } else {
                upperCase = "—";
            }
        }
        c380 c380Var = wz31Var.c;
        int size = c380Var.size();
        if (size == 0) {
            listSingletonList = z6x.a;
        } else if (size != 1) {
            listSingletonList = p7h.M(new String[]{c380Var.size() == 2 ? resources.getString(2131961388, c380Var.get(0), c380Var.get(1)) : resources.getString(2131961376, c380Var.get(0), c380Var.get(1), Integer.valueOf(c380Var.size() - 2)), resources.getString(2131961380, c380Var.get(0), Integer.valueOf(c380Var.size() - 1))});
        } else {
            listSingletonList = Collections.singletonList(c380Var.get(0));
        }
        List list = listSingletonList;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((String) it.next()).toUpperCase(locale));
        }
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("MMM", locale);
        simpleDateFormat2.setTimeZone(timeZone);
        return new p041(upperCase2, upperCase, resources.getString(2131961360, simpleDateFormat2.format(calendar.getTime()), Integer.valueOf(calendar.get(5)), Integer.valueOf(calendar.get(1))).toUpperCase(locale), arrayList);
    }

    public static final void a(String str, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2010059641);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            anm1.a(function1, (i3u) null, apo.r(622109840, new bb(str, function0, function1), x340Var), x340Var, ((i2 >> 6) & 14) | 384, 2);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bb(str, function0, function1, i, (byte) 2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void b(ot3 ot3Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        qim0 qim0Var2;
        String strO0;
        String strO1;
        boolean z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1685165056);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(ot3Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            if (ot3Var instanceof mt3) {
                x340Var.i0(1120758727);
                x340Var.r(false);
                strO0 = ((mt3) ot3Var).a;
                strO1 = "";
            } else if (ot3Var instanceof nt3) {
                x340Var.i0(1120882944);
                strO0 = cwl1.n0(2131952275, new Object[]{((nt3) ot3Var).a}, x340Var);
                strO1 = cwl1.o0(x340Var, 2131952274);
                x340Var.r(false);
            } else {
                if (!ot3Var.equals(lt3.a)) {
                    throw p3d1.k(x340Var, -240942982, false);
                }
                x340Var.i0(1121128712);
                strO0 = cwl1.o0(x340Var, 2131952273);
                strO1 = cwl1.o0(x340Var, 2131952272);
                x340Var.r(false);
            }
            String str = strO1;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
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
            era eraVar = een.Q0;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0Var3);
            mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarZ);
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
            if (strO0.length() > 0) {
                x340Var.i0(-1368659500);
                uwr uwrVar = cbx.a;
                qim0Var2 = qim0Var3;
                z = false;
                uwo1.e(strO0, (qim0) null, cbx.d(x340Var).e, cbx.a(x340Var).b.a, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2018);
                x340Var.r(false);
            } else {
                qim0Var2 = qim0Var3;
                z = false;
                x340Var.i0(-1368480506);
                x340Var.r(false);
            }
            if (str.length() > 0) {
                v8i0.i(8.0f, -1368439028, x340Var, x340Var, qim0Var2);
                uwr uwrVar2 = cbx.a;
                uwo1.e(str, (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2018);
                x340Var.r(z);
            } else {
                x340Var.i0(-1368198778);
                x340Var.r(z);
            }
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g90((Object) ot3Var, (Object) qim0Var2, i, (byte) 10);
        }
    }

    public static final void c(List list, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1877723151);
        int i2 = (x340Var.g(list) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                eyz0 eyz0Var = (eyz0) it.next();
                x340Var.f0(1462131117, Long.valueOf(eyz0Var.a));
                boolean zG = ((i2 & 112) == 32) | x340Var.g(eyz0Var);
                Object objT = x340Var.T();
                if (zG || objT == fkj0.X) {
                    objT = new x680(iu30Var, eyz0Var, (byte) 13);
                    x340Var.s0(objT);
                }
                k(eyz0Var, (Function0) objT, qim0Var, x340Var, i2 & 896);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mb90(list, iu30Var, qim0Var, i, (byte) 7);
        }
    }

    public static final void d(int i, b0k b0kVar, qim0 qim0Var, boolean z, boolean z2) {
        qim0 qim0Var2;
        qim0 qim0VarF;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(50437339);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.h(z2) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            int iT = jfv.t(((cwx) x340Var.k(mde0.a)).b.d, ngv.d);
            uwr uwrVar = cbx.a;
            tob1 tob1VarA = w191.a(cbx.a(x340Var).a.c, irn1.o0(iT, 0, (dlv) null, 6), "background color", x340Var, 384, 8);
            tob1 tob1VarA2 = w191.a(cbx.a(x340Var).a.b.a(), irn1.o0(iT, 0, (dlv) null, 6), "background color", x340Var, 384, 8);
            tob1 tob1VarA3 = w191.a(z2 ? ((vex) zex.a.e).d : ((vex) zex.a.e).a, irn1.o0(iT, 0, (dlv) null, 6), "dark overlay color", x340Var, 384, 8);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            u5j1 u5j1Var = d4o1.a;
            if (z) {
                u7h u7hVar = (u7h) tob1VarA.getValue();
                long j = u7hVar.a;
                u7h u7hVar2 = (u7h) tob1VarA2.getValue();
                long j2 = u7hVar2.a;
                qim0VarF = dug.f(dug.e(qim0Var3, new mic0(0, 0L, 9187343241974906880L, p7h.M(new u7h[]{u7hVar, u7hVar2}), (List) null), (hw61) null, 0.0f, 6), ((u7h) tob1VarA3.getValue()).a, u5j1Var);
            } else {
                qim0VarF = dug.f(qim0Var3, ((u7h) tob1VarA.getValue()).a, u5j1Var);
            }
            t1c.a(qim0VarD.then(qim0VarF), x340Var, 0);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ovf(z, z2, qim0Var2, i, (byte) 2);
        }
    }

    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v16 */
    public static final void e(xkf0 xkf0Var, lq41 lq41Var, r9u0 r9u0Var, xym xymVar, iu30 iu30Var, Function0 function0, j2i j2iVar, iu30 iu30Var2, qim0 qim0Var, vu30 vu30Var, b0k b0kVar, int i) {
        int i2;
        lq41 lq41Var2;
        Function0 function1;
        xkf0 xkf0Var2;
        qim0 qim0Var2;
        boolean z;
        ?? r4;
        iu30 iu30Var3 = iu30Var2;
        m4c m4cVar = fkj0.X;
        jkf0 jkf0Var = xkf0Var.m;
        bff0 bff0Var = xkf0Var.b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(851634691);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(xkf0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            lq41Var2 = lq41Var;
            i2 |= x340Var.g(lq41Var2) ? 32 : 16;
        } else {
            lq41Var2 = lq41Var;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(r9u0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(xymVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(iu30Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            function1 = function0;
            i2 |= x340Var.i(function1) ? 131072 : 65536;
        } else {
            function1 = function0;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.i(j2iVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= x340Var.i(iu30Var3) ? 8388608 : 4194304;
        }
        int i3 = i2 | 100663296;
        if ((805306368 & i) == 0) {
            i3 |= x340Var.i(vu30Var) ? 536870912 : 268435456;
        }
        int i4 = i3;
        if (x340Var.Y(i4 & 1, (i4 & 306783379) != 306783378)) {
            g(xkf0Var.j, lq41Var2, function1, iu30Var3, x340Var, (i4 & 112) | ((i4 >> 9) & 896) | ((i4 >> 12) & 7168));
            int i5 = i4 & 29360128;
            boolean z2 = i5 == 8388608;
            Object objT = x340Var.T();
            if (z2 || objT == m4cVar) {
                objT = new uef0(iu30Var3, (byte) 4);
                x340Var.s0(objT);
            }
            q3p1.b(0, 1, (Function0) objT, x340Var, false);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarH = o0c.H(anm1.N("#LyricsFullscreenTag", qim0Var3));
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarH);
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
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = z1f0.X0;
                x340Var.s0(objT2);
            }
            long jC = rwq0.C(bff0Var, (iu30) objT2);
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = z1f0.Y0;
                x340Var.s0(objT3);
            }
            long jC2 = rwq0.C(bff0Var, (iu30) objT3);
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                objT4 = z1f0.Z0;
                x340Var.s0(objT4);
            }
            long jC3 = rwq0.C(bff0Var, (iu30) objT4);
            Object objT5 = x340Var.T();
            if (objT5 == m4cVar) {
                objT5 = z1f0.a1;
                x340Var.s0(objT5);
            }
            long jC4 = rwq0.C(bff0Var, (iu30) objT5);
            Object objT6 = x340Var.T();
            if (objT6 == m4cVar) {
                objT6 = z1f0.b1;
                x340Var.s0(objT6);
            }
            long jC5 = rwq0.C(bff0Var, (iu30) objT6);
            qim0Var2 = qim0Var3;
            xkf0Var2 = xkf0Var;
            gfx.e(jC, jC2, jC3, jC4, jC5, apo.r(415644463, new ta5(xkf0Var, iu30Var3, r9u0Var, xymVar, iu30Var, j2iVar, vu30Var), x340Var), x340Var, 196608);
            x340Var = x340Var;
            if (jkf0Var.equals(fkf0.b)) {
                iu30Var3 = iu30Var2;
                z = false;
                x340Var.i0(-747080199);
                x340Var.r(false);
            } else {
                x340Var.i0(-747383100);
                iu30Var3 = iu30Var2;
                qxd0.w(xkf0Var2.e, xkf0Var2.f, xkf0Var2.h, jkf0Var, xkf0Var2.q, iu30Var3, x340Var, (i4 >> 6) & 458752);
                z = false;
                x340Var.r(false);
            }
            tm21 tm21Var = xkf0Var2.r;
            if (tm21Var == null) {
                x340Var.i0(-747026508);
                x340Var.r(z);
            } else {
                x340Var.i0(-747026507);
                boolean z3 = i5 == 8388608;
                Object objT7 = x340Var.T();
                if (z3 || objT7 == m4cVar) {
                    r4 = 0;
                    objT7 = new yjf0(iu30Var3, (byte) 0);
                    x340Var.s0(objT7);
                } else {
                    r4 = 0;
                }
                f(tm21Var, (iu30) objT7, x340Var, r4);
                x340Var.r((boolean) r4);
            }
            x340Var.r(true);
        } else {
            xkf0Var2 = xkf0Var;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new is9(xkf0Var2, lq41Var, r9u0Var, xymVar, iu30Var, function0, j2iVar, iu30Var3, qim0Var2, vu30Var, i);
        }
    }

    public static final void f(tm21 tm21Var, iu30 iu30Var, b0k b0kVar, int i) {
        tm21 tm21Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(310637188);
        int i2 = (x340Var.g(tm21Var) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new uef0(iu30Var, (byte) 5);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            boolean z2 = i3 == 32;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new yjf0(iu30Var, (byte) 1);
                x340Var.s0(objT2);
            }
            iu30 iu30Var2 = (iu30) objT2;
            boolean z3 = i3 == 32;
            Object objT3 = x340Var.T();
            if (z3 || objT3 == m4cVar) {
                objT3 = new uef0(iu30Var, (byte) 6);
                x340Var.s0(objT3);
            }
            Function0 function1 = (Function0) objT3;
            boolean z4 = i3 == 32;
            Object objT4 = x340Var.T();
            if (z4 || objT4 == m4cVar) {
                objT4 = new uef0(iu30Var, (byte) 7);
                x340Var.s0(objT4);
            }
            Function0 function2 = (Function0) objT4;
            boolean z5 = i3 == 32;
            Object objT5 = x340Var.T();
            if (z5 || objT5 == m4cVar) {
                objT5 = new uef0(iu30Var, (byte) 8);
                x340Var.s0(objT5);
            }
            Function0 function3 = (Function0) objT5;
            boolean z6 = i3 == 32;
            Object objT6 = x340Var.T();
            if (z6 || objT6 == m4cVar) {
                objT6 = new uef0(iu30Var, (byte) 9);
                x340Var.s0(objT6);
            }
            tm21Var2 = tm21Var;
            tm80.j(tm21Var2, function0, iu30Var2, function1, function2, function3, (Function0) objT6, x340Var, i2 & 14);
        } else {
            tm21Var2 = tm21Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new d0e0(tm21Var2, iu30Var, i, (byte) 23);
        }
    }

    public static final void g(boolean z, lq41 lq41Var, Function0 function0, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        iac0 iac0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(38076544);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(lq41Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z2 = true;
            ven0 ven0VarS = v8r.s(function0, x340Var);
            if (z) {
                x340Var.i0(467228063);
                iac0 iac0Var2 = (iac0) x340Var.k(jfe0.a);
                boolean zI = ((i2 & 112) == 32) | x340Var.i(iac0Var2);
                if ((i2 & 7168) != 2048) {
                    z2 = false;
                }
                boolean zG = zI | z2 | x340Var.g(ven0VarS);
                Object objT = x340Var.T();
                if (zG || objT == fkj0.X) {
                    iac0Var = iac0Var2;
                    z290 z290Var = new z290((Object) iac0Var, (Object) lq41Var, (Object) iu30Var, (Object) ven0VarS, (lnm) null, (byte) 20);
                    x340Var.s0(z290Var);
                    objT = z290Var;
                } else {
                    iac0Var = iac0Var2;
                }
                qxd0.t(iac0Var, x340Var, (vu30) objT);
                x340Var.r(false);
            } else {
                x340Var.i0(467538466);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new d30(z, (Object) lq41Var, (Object) function0, (cv30) iu30Var, i, (byte) 29);
        }
    }

    public static final void h(uqm0 uqm0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        boolean z;
        boolean z2;
        List list = uqm0Var.d;
        String str = uqm0Var.b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-766377178);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(uqm0Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ktd.n(x340Var);
            }
            idn0 idn0Var = (idn0) objT;
            jtr jtrVar = jtr.f;
            int i3 = i2 & 112;
            boolean z3 = i3 == 32;
            Object objT2 = x340Var.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new nfk0(iu30Var, (byte) 5);
                x340Var.s0(objT2);
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarH = u291.h(u291.f(i1p1.q(bin.v(qim0Var3, idn0Var, jtrVar, false, (String) null, (pm31) null, (Function0) objT2, 28), er31.b(8.0f)), 1.0f), 200.0f);
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = xjm0.U0;
                x340Var.s0(objT3);
            }
            qim0 qim0VarB = s161.b(qim0VarH, false, (iu30) objT3);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarN = anm1.N("concert_hero_card_image", u291.d(qim0Var3, 1.0f));
            Uri uri = Uri.parse(uqm0Var.c);
            nkx nkxVar = nkx.c;
            eso1.e(uri, isl.a, qim0VarN, (p3v) null, (zvx) null, (ecx) null, mif1.P0, (tl3) null, (ColorFilter) null, new nux(nkxVar, nkxVar), false, false, x340Var, 1073766448, 0, 3496);
            t1c.a(dug.e(u291.d(qim0Var3, 1.0f), v9c.s(p7h.M(new u7h[]{new u7h(u7h.j), new u7h(u7h.b(u7h.b, 0.6f, 0.0f, 0.0f, 0.0f, 14))}), 0.0f, Float.POSITIVE_INFINITY, 8), (hw61) null, 0.0f, 6), x340Var, 0);
            gra graVar = een.t;
            h2c h2cVar = h2c.a;
            qim0 qim0VarX = uyn1.x(u291.f(h2cVar.a(qim0Var3, graVar), 1.0f), 16.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarX);
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
            qim0 qim0VarN2 = anm1.N("concert_hero_card_title", qim0Var3);
            String str2 = uqm0Var.a;
            uwr uwrVar = cbx.a;
            uwo1.e(str2, qim0VarN2, cbx.d(x340Var).c, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, new cjc0(2), 0, (qx8) null, x340Var, 0, 0, 1776);
            x340Var = x340Var;
            if (str.length() > 0) {
                x340Var.i0(-1339873437);
                qim0 qim0VarN3 = anm1.N("concert_hero_card_subtitle", qim0Var3);
                String strU = uqm0Var.e;
                if (strU == null) {
                    x340Var.i0(-1290141351);
                    strU = cwl1.U(2131820773, list.size(), new Object[]{Integer.valueOf(list.size())}, x340Var);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1290142591);
                    x340Var.r(false);
                }
                z = true;
                uwo1.e(f4i1.f(str, " • ", strU), qim0VarN3, cbx.d(x340Var).g, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var, 0, 0, 1776);
                x340Var = x340Var;
                z2 = false;
                x340Var.r(false);
            } else {
                z = true;
                z2 = false;
                x340Var.i0(-1339345600);
                x340Var.r(false);
            }
            x340Var.r(z);
            qim0 qim0VarA = h2cVar.a(uyn1.x(anm1.N("concert_hero_card_arrow_button", qim0Var3), 8.0f), een.Y);
            boolean z5 = i3 == 32 ? z : z2;
            Object objT4 = x340Var.T();
            if (z5 || objT4 == m4cVar) {
                objT4 = new nfk0(iu30Var, (byte) 6);
                x340Var.s0(objT4);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT4);
            Object objT5 = x340Var.T();
            if (objT5 == m4cVar) {
                objT5 = dbm0.P0;
                x340Var.s0(objT5);
            }
            wro1.h(gbxVar, new hdx(0, (vu30) null, (vu30) objT5, (vu30) null, (hw61) null, 27), qim0VarA, (max) null, yla.s(x340Var), (vzq0) null, false, (idn0) null, (ga80) null, r2j.a, x340Var, 0, 6, 984);
            x340Var.r(z);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new arm0(uqm0Var, iu30Var, qim0Var2, i, (byte) 0);
        }
    }

    public static final void i(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-195628092);
        if (x340Var.Y(i & 1, i != 0)) {
            qim0 qim0VarH = u291.h(u291.f(i1p1.q(nim0.a, er31.b(8.0f)), 1.0f), 200.0f);
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.b.a();
            cua cuaVar = cbx.b(x340Var).f;
            t1c.a(cwl1.l0(dug.f(qim0VarH, jA, er31.b(4.0f)), 0L, (hw61) null, 15), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new afm0(i, (byte) 6);
        }
    }

    public static final void j(String str, qim0 qim0Var, ufq0 ufq0Var, qfq0 qfq0Var, b0k b0kVar, int i, int i2) {
        ufq0 ufq0Var2;
        int i3;
        qfq0 qfq0Var2;
        int i4;
        qim0 qim0Var2;
        ufq0 ufq0Var3;
        qfq0 qfq0Var3;
        int i5;
        String strO0;
        m4c m4cVar;
        qim0 qim0Var3;
        boolean z;
        int i6;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-346775085);
        int i7 = i | (x340Var.g(str) ? 4 : 2);
        int i8 = i7 | 48;
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 = i7 | 432;
            ufq0Var2 = ufq0Var;
        } else {
            ufq0Var2 = ufq0Var;
            i3 = i8 | (x340Var.g(ufq0Var2) ? 256 : 128);
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i4 = i3 | 3072;
            qfq0Var2 = qfq0Var;
        } else {
            qfq0Var2 = qfq0Var;
            i4 = i3 | (x340Var.g(qfq0Var2) ? 2048 : 1024);
        }
        int i11 = i4;
        if (x340Var.Y(i11 & 1, (i11 & 1171) != 1170)) {
            ufq0 ufq0Var4 = i9 != 0 ? null : ufq0Var2;
            qfq0 qfq0Var4 = i10 != 0 ? null : qfq0Var2;
            if (ufq0Var4 == null) {
                x340Var.i0(-1379992331);
                x340Var.r(false);
                strO0 = null;
            } else {
                x340Var.i0(-1379992330);
                int iC = l1d.C(ufq0Var4.a);
                if (iC == 0) {
                    i5 = 2131959391;
                } else {
                    if (iC != 1) {
                        eg.o();
                        return;
                    }
                    i5 = 2131959392;
                }
                strO0 = cwl1.o0(x340Var, i5);
                x340Var.r(false);
            }
            cjc0 cjc0Var = ef.b(x340Var).a() ? new cjc0(2) : new cjc0(1);
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var4, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(4.0f, 0.0f, 2, qim0VarF);
            mta mtaVar = cbx.b(x340Var).d;
            qim0 qim0VarJ = u291.j(48.0f, 0.0f, 2, qim0VarZ);
            Object objT = x340Var.T();
            m4c m4cVar2 = fkj0.X;
            if (objT == m4cVar2) {
                objT = rfq0.b;
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarJ, false, (iu30) objT);
            boolean z2 = ((i11 & 896) == 256) | ((i11 & 7168) == 2048);
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar2) {
                objT2 = new qy4(ufq0Var4, qfq0Var4, (byte) 1);
                x340Var.s0(objT2);
            }
            gfh0 gfh0Var = (gfh0) objT2;
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
            nko1.H(gfh0Var, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            if (strO0 == null) {
                x340Var.i0(427658165);
                x340Var.r(false);
                m4cVar = m4cVar2;
                qim0Var3 = qim0Var4;
            } else {
                x340Var.i0(427658166);
                m4cVar = m4cVar2;
                qim0Var3 = qim0Var4;
                q(strO0, ufq0Var4.b, cbx.a(x340Var).b.a, null, false, x340Var, 0, 24);
                x340Var.r(false);
            }
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = rfq0.c;
                x340Var.s0(objT3);
            }
            qfq0 qfq0Var5 = qfq0Var4;
            qim0 qim0Var5 = qim0Var3;
            ufq0 ufq0Var5 = ufq0Var4;
            uwo1.e(str, s161.b(qim0Var3, false, (iu30) objT3), cbx.d(x340Var).h, cbx.a(x340Var).b.a, new a0e1(3), (iu30) null, 2, false, cjc0Var, 0, (qx8) null, x340Var, (i11 & 14) | 1572864, 0, 1696);
            x340Var = x340Var;
            if (qfq0Var5 == null) {
                x340Var.i0(428094242);
                x340Var.r(false);
                z = true;
            } else {
                x340Var.i0(428094243);
                int iC2 = l1d.C(qfq0Var5.a);
                if (iC2 != 0) {
                    z = true;
                    if (iC2 != 1) {
                        eg.o();
                        return;
                    }
                    i6 = 2131959394;
                } else {
                    z = true;
                    i6 = 2131959393;
                }
                q(cwl1.o0(x340Var, i6), qfq0Var5.c, cbx.a(x340Var).b.c, cbx.d(x340Var).k, qfq0Var5.b, x340Var, 0, 0);
                x340Var.r(false);
            }
            x340Var.r(z);
            qfq0Var3 = qfq0Var5;
            qim0Var2 = qim0Var5;
            ufq0Var3 = ufq0Var5;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            ufq0Var3 = ufq0Var2;
            qfq0Var3 = qfq0Var2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lxl(str, qim0Var2, ufq0Var3, qfq0Var3, i, i2);
        }
    }

    public static final void k(eyz0 eyz0Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        int i3;
        boolean z;
        long j = eyz0Var.c;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1248648720);
        int i4 = (i & 6) == 0 ? (x340Var.g(eyz0Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i4 & 1, (i4 & 147) != 146)) {
            wat watVar = (wat) x340Var.k(t4k.h);
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = c97.b(0.0f);
                x340Var.s0(objT);
            }
            o95 o95Var = (o95) objT;
            boolean zF = x340Var.f(j) | x340Var.g(watVar);
            Object objT2 = x340Var.T();
            if (zF || objT2 == m4cVar) {
                List<j0s0> list = fyz0.c;
                i2 = 32;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                for (j0s0 j0s0Var : list) {
                    arrayList.add(new i0s0(j0s0Var.a, j0s0Var.b, Offset.a(j, 2, watVar.X0(j0s0Var.c) + Float.intBitsToFloat((int) (j >> 32)), 0.0f), (((long) Float.floatToRawIntBits(watVar.X0(j0s0Var.d))) << 32) | (((long) Float.floatToRawIntBits(watVar.X0(j0s0Var.e))) & 4294967295L), j0s0Var.f, j0s0Var.g));
                    i4 = i4;
                    j = j;
                }
                i3 = i4;
                x340Var.s0(arrayList);
                objT2 = arrayList;
            } else {
                i3 = i4;
                i2 = 32;
            }
            List list2 = (List) objT2;
            boolean zG = x340Var.g(watVar);
            Object objT3 = x340Var.T();
            Object obj = objT3;
            if (zG || objT3 == m4cVar) {
                Paint paint = new Paint(1);
                paint.setTextAlign(Paint.Align.CENTER);
                paint.setTextSize(new xat(watVar.h(), 1.0f).q0(fc11.Y(20.0f, 4294967296L)));
                x340Var.s0(paint);
                obj = paint;
            }
            Paint paint2 = (Paint) obj;
            float f = (-(paint2.descent() + paint2.ascent())) / 2.0f;
            boolean zI = x340Var.i(o95Var) | ((i3 & 112) == i2);
            Object objT4 = x340Var.T();
            if (zI || objT4 == m4cVar) {
                z = true;
                objT4 = new ss90(o95Var, function0, (lnm) null, (byte) 1);
                x340Var.s0(objT4);
            } else {
                z = true;
            }
            qxd0.t(rih1.a, x340Var, (vu30) objT4);
            Object objT5 = x340Var.T();
            if (objT5 == m4cVar) {
                objT5 = mr90.d;
                x340Var.s0(objT5);
            }
            qim0 qim0VarA = s161.a(qim0Var, (iu30) objT5);
            boolean zI2 = x340Var.i(o95Var) | x340Var.g(list2) | x340Var.i(paint2) | ((i3 & 14) == 4 ? z : false) | x340Var.d(f);
            Object objT6 = x340Var.T();
            if (zI2 || objT6 == m4cVar) {
                lf60 lf60Var = new lf60(o95Var, list2, paint2, eyz0Var, f);
                x340Var.s0(lf60Var);
                objT6 = lf60Var;
            }
            j0o1.b(0, x340Var, (iu30) objT6, qim0VarA);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ri60((Object) eyz0Var, (Object) function0, (Object) qim0Var, i, (byte) 13);
        }
    }

    public static final void l(crf1 crf1Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(768916264);
        int i2 = i | (x340Var.i(crf1Var) ? 4 : 2) | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            xxh xxhVar = crf1Var.f;
            boolean z = xxhVar instanceof wxh;
            uwr uwrVar = cbx.a;
            float f = cbx.b(x340Var).b.b;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarU = u291.u(qim0Var3, f, 0.0f, 0.0f, 0.0f, 14);
            mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarU);
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
            vxh vxhVar = vxh.a;
            if (!z || u890.j(xxhVar, vxhVar)) {
                x340Var.i0(-1930890972);
                x340Var.r(false);
            } else {
                x340Var.i0(-1930952476);
                lap1.a(xxhVar, (qim0) null, x340Var, 0);
                x340Var.r(false);
            }
            uwo1.e(crf1Var.a, (qim0) null, cbx.d(x340Var).h, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
            if (z || u890.j(xxhVar, vxhVar)) {
                x340Var.i0(-1930622140);
                x340Var.r(false);
            } else {
                x340Var.i0(-1930683644);
                lap1.a(xxhVar, (qim0) null, x340Var, 0);
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
            h311VarV.d = new xaf1(crf1Var, qim0Var2, i, (byte) 7);
        }
    }

    public static final void m(qim0 qim0Var, hw61 hw61Var, b0k b0kVar, int i, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1476420353);
        int i3 = (x340Var.i(qim0Var) ? 4 : 2) | i | (((i2 & 2) == 0 && x340Var.i(hw61Var)) ? 32 : 16);
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            } else if ((i2 & 2) != 0) {
                hw61Var = er31.a;
            }
            x340Var.s();
            uwr uwrVar = cbx.a;
            t1c.a(dug.f(qim0Var, cbx.a(x340Var).a.b.a(), hw61Var), x340Var, 0);
        } else {
            x340Var.b0();
        }
        hw61 hw61Var2 = hw61Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g8(qim0Var, hw61Var2, i, i2, (byte) 18);
        }
    }

    public static final void n(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1138660826);
        j06 j06Var = x340Var.a;
        if (x340Var.Y(i & 1, i != 0)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarN = anm1.N("song_dna_search_row_skeleton", u291.f(nim0Var, 1.0f));
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarN, 16.0f, 8.0f);
            cvx cvxVar3 = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
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
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            zov0 zov0Var = cbx.b(x340Var).g;
            qim0 qim0VarR = u291.r(nim0Var, 48.0f);
            cua cuaVar = cbx.b(x340Var).f;
            m(qim0VarR, er31.b(4.0f), x340Var, 0, 0);
            cvx cvxVar4 = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(4.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, nim0Var);
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
            m(u291.h(u291.v(nim0Var, 160.0f), 12.0f), null, x340Var, 0, 2);
            m(u291.h(u291.v(nim0Var, 96.0f), 12.0f), null, x340Var, 0, 2);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new t491(i, (byte) 8);
        }
    }

    public static final void o(String str, String str2, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1989215441);
        int i2 = i | (x340Var.g(str) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            uwo1.e(str, anm1.N(str2, uyn1.y(qim0VarF, cbx.b(x340Var).b.a, cbx.b(x340Var).b.b)), cbx.d(x340Var).g, cbx.a(x340Var).b.b, new a0e1(3), (iu30) null, 0, false, bjc0.a, 0, (qx8) null, x340Var, i2 & 14, 0, 1760);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b4((byte) 20, i, str, str2);
        }
    }

    public static final void p(String str, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-157794000);
        int i2 = (x340Var.g(str) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarN = anm1.N(str, u291.f(nim0.a, 1.0f));
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = bba1.Y;
                x340Var.s0(objT);
            }
            qim0 qim0VarA = s161.a(qim0VarN, (iu30) objT);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
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
            x340Var.i0(1326846623);
            for (int i3 = 0; i3 < 4; i3++) {
                n(x340Var, 0);
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nl41(str, i, (byte) 17);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0050  */
    /* JADX WARN: Code duplicated, block: B:26:0x0058  */
    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0066  */
    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX WARN: Code duplicated, block: B:35:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0081 A[PHI: r2
      0x0081: PHI (r2v14 p.lee1) = (r2v12 p.lee1), (r2v9 p.lee1) binds: [B:47:0x0093, B:40:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0084  */
    /* JADX WARN: Code duplicated, block: B:44:0x0088  */
    /* JADX WARN: Code duplicated, block: B:45:0x0091  */
    /* JADX WARN: Code duplicated, block: B:48:0x0095  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:63:0x011d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0123  */
    /* JADX WARN: Code duplicated, block: B:68:0x0130  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    public static final void q(String str, Function0 function0, long j, lee1 lee1Var, boolean z, b0k b0kVar, int i, int i2) {
        lee1 lee1Var2;
        int i3;
        int i4;
        boolean z2;
        int i5;
        int i6;
        boolean z3;
        b0k b0kVar2;
        boolean z4;
        lee1 lee1Var3;
        h311 h311VarV;
        lee1 lee1Var4;
        boolean z5;
        ldx ldxVar;
        gdx gdxVarS;
        hax haxVar;
        hax haxVar2;
        j2i j2iVarR;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(630647651);
        int i7 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.i(function0) ? 32 : 16) | (b0kVar3.f(j) ? 256 : 128);
        if ((i2 & 8) == 0) {
            lee1Var2 = lee1Var;
            int i8 = b0kVar3.g(lee1Var2) ? 2048 : 1024;
            i3 = i7 | i8;
            i4 = i2 & 16;
            if (i4 != 0) {
                i6 = i3 | 24576;
                z2 = z;
            } else {
                z2 = z;
                if (b0kVar3.h(z2)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i6 = i3 | i5;
            }
            if ((i6 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (b0kVar3.Y(i6 & 1, z3)) {
                b0kVar3.d0();
                if ((i & 1) != 0 || b0kVar3.E()) {
                    if ((i2 & 8) != 0) {
                        uwr uwrVar = cbx.a;
                        lee1Var4 = cbx.d(b0kVar3).j;
                    } else {
                        lee1Var4 = lee1Var2;
                    }
                    lee1Var2 = lee1Var4;
                    if (i4 != 0) {
                        z5 = false;
                    }
                    b0kVar3.s();
                    ldxVar = ldx.c;
                    gdxVarS = yla.s(b0kVar3);
                    if (z5) {
                        b0kVar3.i0(1437526162);
                        haxVar = new hax(cwl1.o0(b0kVar3, 2131959390));
                        b0kVar3.r(false);
                    } else {
                        b0kVar3.i0(1437668793);
                        b0kVar3.r(false);
                        haxVar = jax.a;
                    }
                    haxVar2 = haxVar;
                    if (ihc1.y0(str)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return;
                    }
                    gbx gbxVar = new gbx(new y50(str), function0);
                    if (z5) {
                        b0kVar3.i0(1437802899);
                        j2iVarR = apo.r(-1738857409, new q9j0((byte) 5, j), b0kVar3);
                        b0kVar3.r(false);
                    } else {
                        b0kVar3.i0(1437913321);
                        b0kVar3.r(false);
                        j2iVarR = null;
                    }
                    b0kVar2 = b0kVar3;
                    foo1.c(gbxVar, ldxVar, (qim0) null, haxVar2, gdxVarS, (vzq0) null, (idn0) null, (ga80) null, j2iVarR, (vu30) null, apo.r(-814789918, new sfq0(str, lee1Var2, j, (byte) 0), b0kVar3), b0kVar2, 48, 48, 1484);
                    z4 = z5;
                } else {
                    b0kVar3.b0();
                }
                z5 = z2;
                b0kVar3.s();
                ldxVar = ldx.c;
                gdxVarS = yla.s(b0kVar3);
                if (z5) {
                    b0kVar3.i0(1437526162);
                    haxVar = new hax(cwl1.o0(b0kVar3, 2131959390));
                    b0kVar3.r(false);
                } else {
                    b0kVar3.i0(1437668793);
                    b0kVar3.r(false);
                    haxVar = jax.a;
                }
                haxVar2 = haxVar;
                if (ihc1.y0(str)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                gbx gbxVar2 = new gbx(new y50(str), function0);
                if (z5) {
                    b0kVar3.i0(1437802899);
                    j2iVarR = apo.r(-1738857409, new q9j0((byte) 5, j), b0kVar3);
                    b0kVar3.r(false);
                } else {
                    b0kVar3.i0(1437913321);
                    b0kVar3.r(false);
                    j2iVarR = null;
                }
                b0kVar2 = b0kVar3;
                foo1.c(gbxVar2, ldxVar, (qim0) null, haxVar2, gdxVarS, (vzq0) null, (idn0) null, (ga80) null, j2iVarR, (vu30) null, apo.r(-814789918, new sfq0(str, lee1Var2, j, (byte) 0), b0kVar3), b0kVar2, 48, 48, 1484);
                z4 = z5;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                z4 = z2;
            }
            lee1Var3 = lee1Var2;
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new tfq0(str, function0, j, lee1Var3, z4, i, i2);
            }
        }
        lee1Var2 = lee1Var;
        i3 = i7 | i8;
        i4 = i2 & 16;
        if (i4 != 0) {
            i6 = i3 | 24576;
            z2 = z;
        } else {
            z2 = z;
            if (b0kVar3.h(z2)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i6 = i3 | i5;
        }
        if ((i6 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (b0kVar3.Y(i6 & 1, z3)) {
            b0kVar3.d0();
            if ((i & 1) != 0) {
                if ((i2 & 8) != 0) {
                    uwr uwrVar2 = cbx.a;
                    lee1Var4 = cbx.d(b0kVar3).j;
                } else {
                    lee1Var4 = lee1Var2;
                }
                lee1Var2 = lee1Var4;
                if (i4 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
            } else {
                if ((i2 & 8) != 0) {
                    uwr uwrVar3 = cbx.a;
                    lee1Var4 = cbx.d(b0kVar3).j;
                } else {
                    lee1Var4 = lee1Var2;
                }
                lee1Var2 = lee1Var4;
                if (i4 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
            }
            b0kVar3.s();
            ldxVar = ldx.c;
            gdxVarS = yla.s(b0kVar3);
            if (z5) {
                b0kVar3.i0(1437526162);
                haxVar = new hax(cwl1.o0(b0kVar3, 2131959390));
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(1437668793);
                b0kVar3.r(false);
                haxVar = jax.a;
            }
            haxVar2 = haxVar;
            if (ihc1.y0(str)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar3 = new gbx(new y50(str), function0);
            if (z5) {
                b0kVar3.i0(1437802899);
                j2iVarR = apo.r(-1738857409, new q9j0((byte) 5, j), b0kVar3);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(1437913321);
                b0kVar3.r(false);
                j2iVarR = null;
            }
            b0kVar2 = b0kVar3;
            foo1.c(gbxVar3, ldxVar, (qim0) null, haxVar2, gdxVarS, (vzq0) null, (idn0) null, (ga80) null, j2iVarR, (vu30) null, apo.r(-814789918, new sfq0(str, lee1Var2, j, (byte) 0), b0kVar3), b0kVar2, 48, 48, 1484);
            z4 = z5;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            z4 = z2;
        }
        lee1Var3 = lee1Var2;
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new tfq0(str, function0, j, lee1Var3, z4, i, i2);
        }
    }

    public static final void r(erf1 erf1Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1841068002);
        int i2 = i | (x340Var.i(erf1Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            d36 d36Var = new d36(8.0f, true, new um5(false));
            qim0 qim0VarN = anm1.N("track-list-container", u291.f(qim0Var, 1.0f));
            mbh mbhVarA = jbh.a(d36Var, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            x340Var.i0(-1291317196);
            int i3 = 0;
            for (Object obj : erf1Var.a.a) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    p7h.T();
                    throw null;
                }
                crf1 crf1Var = (crf1) obj;
                srt0 srt0Var = erf1Var.b;
                int i5 = i2 & 112;
                boolean zE = (i5 == 32) | x340Var.e(i3) | x340Var.i(crf1Var);
                Object objT = x340Var.T();
                if (zE || objT == m4cVar) {
                    objT = new rqf1(iu30Var, i3, crf1Var, (byte) 0);
                    x340Var.s0(objT);
                }
                Function0 function0 = (Function0) objT;
                boolean zE2 = (i5 == 32) | x340Var.e(i3) | x340Var.i(crf1Var);
                Object objT2 = x340Var.T();
                if (zE2 || objT2 == m4cVar) {
                    objT2 = new rqf1(iu30Var, i3, crf1Var, (byte) 1);
                    x340Var.s0(objT2);
                }
                t(crf1Var, srt0Var, function0, (Function0) objT2, null, x340Var, 8);
                i3 = i4;
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new juc1(erf1Var, iu30Var, qim0Var, i, (byte) 20);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0083  */
    /* JADX WARN: Code duplicated, block: B:29:0x0089  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:36:0x0104  */
    /* JADX WARN: Code duplicated, block: B:37:0x0118  */
    /* JADX WARN: Code duplicated, block: B:40:0x014f  */
    public static final void s(crf1 crf1Var, srt0 srt0Var, qim0 qim0Var, b0k b0kVar, int i) {
        zkt0 zkt0Var;
        zkt0 zkt0Var2;
        jw31 jw31VarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0Var2;
        qim0 qim0VarE;
        qim0 qim0Var3;
        long j;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1284748848);
        int i2 = i | (x340Var.i(crf1Var) ? 4 : 2) | (x340Var.i(srt0Var) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            String str = crf1Var.e;
            boolean zJ = u890.j(srt0Var, new mrt0(str));
            zkt0 zkt0Var3 = zkt0.c;
            if (zJ) {
                zkt0Var2 = zkt0.a;
            } else {
                if (u890.j(srt0Var, new krt0(str))) {
                    zkt0Var2 = zkt0.b;
                } else {
                    zkt0Var = zkt0Var3;
                }
                jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0Var2 = nim0.a;
                qim0VarE = zr7.E(x340Var, qim0Var2);
                hzj.A.getClass();
                if (x340Var.a != null) {
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
                if (zkt0Var != zkt0Var3) {
                    x340Var.i0(-1217724043);
                    uwr uwrVar = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var).g;
                    qim0Var3 = qim0Var2;
                    wkt0.a(zkt0Var, anm1.N(String.format("track-list-play-indicator-%s", Arrays.copyOf(new Object[]{crf1Var.e}, 1)), u291.r(qim0Var2, 12.0f)), (ksl) null, 0L, false, x340Var, 0, 28);
                    cvx cvxVar = cbx.b(x340Var).b;
                    ab80.p(qim0Var3, 4.0f, x340Var, false);
                } else {
                    qim0Var3 = qim0Var2;
                    x340Var.i0(-1217415562);
                    x340Var.r(false);
                }
                String str2 = crf1Var.b;
                uwr uwrVar2 = cbx.a;
                lee1 lee1Var = cbx.d(x340Var).g;
                zic0 zic0Var = new zic0(1);
                if (zkt0Var == zkt0Var3) {
                    x340Var.i0(-1217183775);
                    j = ((u7h) x340Var.k(qgx.a)).a;
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1217125185);
                    j = cbx.a(x340Var).b.c;
                    x340Var.r(false);
                }
                qim0Var = qim0Var3;
                uwo1.e(str2, (qim0) null, lee1Var, j, (a0e1) null, (iu30) null, 2, false, zic0Var, 0, (qx8) null, x340Var, 0, 0, 1714);
                x340Var.r(true);
            }
            zkt0Var = zkt0Var2;
            jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0Var2 = nim0.a;
            qim0VarE = zr7.E(x340Var, qim0Var2);
            hzj.A.getClass();
            if (x340Var.a != null) {
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
            if (zkt0Var != zkt0Var3) {
                x340Var.i0(-1217724043);
                uwr uwrVar3 = cbx.a;
                zov0 zov0Var2 = cbx.b(x340Var).g;
                qim0Var3 = qim0Var2;
                wkt0.a(zkt0Var, anm1.N(String.format("track-list-play-indicator-%s", Arrays.copyOf(new Object[]{crf1Var.e}, 1)), u291.r(qim0Var2, 12.0f)), (ksl) null, 0L, false, x340Var, 0, 28);
                cvx cvxVar2 = cbx.b(x340Var).b;
                ab80.p(qim0Var3, 4.0f, x340Var, false);
            } else {
                qim0Var3 = qim0Var2;
                x340Var.i0(-1217415562);
                x340Var.r(false);
            }
            String str3 = crf1Var.b;
            uwr uwrVar4 = cbx.a;
            lee1 lee1Var2 = cbx.d(x340Var).g;
            zic0 zic0Var2 = new zic0(1);
            if (zkt0Var == zkt0Var3) {
                x340Var.i0(-1217183775);
                j = ((u7h) x340Var.k(qgx.a)).a;
                x340Var.r(false);
            } else {
                x340Var.i0(-1217125185);
                j = cbx.a(x340Var).b.c;
                x340Var.r(false);
            }
            qim0Var = qim0Var3;
            uwo1.e(str3, (qim0) null, lee1Var2, j, (a0e1) null, (iu30) null, 2, false, zic0Var2, 0, (qx8) null, x340Var, 0, 0, 1714);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        qim0 qim0Var4 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new juc1(crf1Var, srt0Var, qim0Var4, i, (byte) 21);
        }
    }

    public static final void t(crf1 crf1Var, srt0 srt0Var, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1894374133);
        byte b = 2;
        int i2 = i | (b0kVar3.i(crf1Var) ? 4 : 2) | (b0kVar3.i(srt0Var) ? 32 : 16) | (b0kVar3.i(function0) ? 256 : 128) | (b0kVar3.i(function1) ? 2048 : 1024) | 24576;
        byte b2 = 0;
        byte b3 = 1;
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarS = hqn1.s(String.format("track-list-row-%s", Arrays.copyOf(new Object[]{crf1Var.a}, 1)), cwl1.o0(b0kVar3, 2131963624), function0, u291.f(qim0Var3, 1.0f));
            boolean z = (i2 & 14) == 4 || b0kVar3.i(crf1Var);
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new ibf1(crf1Var, (byte) 11);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            jto1.b(s161.a(qim0VarS, (iu30) objT), new uvx((pgx) null, 5, (tvx) null, new p3v(101.0f), 10), (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(-940260459, new sqf1(crf1Var, b2), b0kVar3), apo.r(-637373068, new sqf1(crf1Var, b3), b0kVar3), (xu30) null, apo.r(970571475, new sqf1(crf1Var, b), b0kVar3), apo.r(1273458866, new xw91(function1, crf1Var, (byte) 24), b0kVar3), (xu30) null, (xu30) null, apo.r(-2112846257, new xw91(crf1Var, srt0Var, (byte) 25), b0kVar3), b0kVar2, 907542592, 197040, 25788);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new tte1((byte) 4, i, crf1Var, srt0Var, function0, function1, qim0Var2);
        }
    }

    public static b0y u(ni30 ni30Var, n3u n3uVar) {
        b0y b0yVarA = ni30Var.a();
        Bundle bundle = new Bundle();
        bundle.putSerializable("EndlessErrorDialogFragment.DialogType", n3uVar);
        b0yVarA.T0(bundle);
        return b0yVarA;
    }

    public static final qim0 v(qim0 qim0Var, es41 es41Var, float f, long j) {
        return qim0Var.then(new bh10(es41Var, f, j));
    }

    public static Exception w(ti tiVar, String str, Exception exc) {
        if (exc instanceof CreatePublicKeyCredentialDomException) {
            return new CreatePublicKeyCredentialDomException(str, tiVar);
        }
        if (exc instanceof GetPublicKeyCredentialDomException) {
            return new GetPublicKeyCredentialDomException(str, tiVar);
        }
        throw new FrameworkClassParsingException();
    }

    public static final rj40 x(pj40 pj40Var) {
        return new rj40(pj40Var);
    }

    public static void y(JSONObject jSONObject, n3c n3cVar, Context context) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                if (next.equals("apps") && (jSONObject.get(next) instanceof JSONObject) && jSONObject.getJSONObject(next).get(tqt.t(context)) != null) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next).getJSONObject(tqt.t(context));
                    Iterator<String> itKeys2 = jSONObject2.keys();
                    while (itKeys2.hasNext()) {
                        String next2 = itKeys2.next();
                        if (next2.equals("preinstall_campaign") && TextUtils.isEmpty(ne.z(context).y("preinstall_campaign"))) {
                            String string = jSONObject2.get(next2).toString();
                            String strD = eqq.d(1);
                            ne neVar = n3cVar.b;
                            neVar.getClass();
                            try {
                                ((JSONObject) neVar.d).putOpt(strD, string);
                            } catch (JSONException e) {
                                i1k0.m(e.getMessage());
                            }
                        } else if (next2.equals("preinstall_partner") && TextUtils.isEmpty(ne.z(context).y("preinstall_partner"))) {
                            String string2 = jSONObject2.get(next2).toString();
                            String strD2 = eqq.d(2);
                            ne neVar2 = n3cVar.b;
                            neVar2.getClass();
                            try {
                                ((JSONObject) neVar2.d).putOpt(strD2, string2);
                            } catch (JSONException e2) {
                                i1k0.m(e2.getMessage());
                            }
                        } else {
                            String string3 = jSONObject2.get(next2).toString();
                            JSONObject jSONObject3 = (JSONObject) n3cVar.b.c;
                            if (jSONObject3.has(next2) && string3 == null) {
                                jSONObject3.remove(next2);
                            }
                            try {
                                jSONObject3.put(next2, string3);
                            } catch (JSONException unused) {
                            }
                        }
                    }
                }
            } catch (JSONException e3) {
                i1k0.m(e3.getMessage());
            }
        }
    }

    public static dce z(Activity activity) {
        n8d0 n8d0VarT;
        erw0 erw0Var = erw0.g;
        synchronized (erw0Var.a) {
            n8d0VarT = erw0Var.b;
            if (n8d0VarT == null) {
                n8d0VarT = upn1.t(new x8a0(erw0Var, new d5d(activity), (byte) 26));
                erw0Var.b = n8d0VarT;
            }
        }
        pjq0 pjq0Var = new pjq0(new nt9(activity, (byte) 1), (byte) 24);
        return poz0.J(n8d0VarT, new mev((Object) pjq0Var, (byte) 20), n5u.a());
    }
}
