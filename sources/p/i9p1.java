package p;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.system.Os;
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
import j$.net.URLDecoder;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.json.JsonEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class i9p1 {
    public static owo1 a;
    public static b180 b;
    public static b180 c;

    public static final qn80 A(Context context, String str) throws IOException {
        fna fnaVar;
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse(str), new String[]{"install_referrer", "is_ct", "actual_timestamp"}, null, null, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            if (!cursorQuery.moveToFirst()) {
                i1k0.m("getMetaInstallReferrerDetails - cursor is empty or null for provider ".concat(str));
                cursorQuery.close();
                return null;
            }
            int columnIndex = cursorQuery.getColumnIndex("actual_timestamp");
            int columnIndex2 = cursorQuery.getColumnIndex("is_ct");
            int columnIndex3 = cursorQuery.getColumnIndex("install_referrer");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                long j = cursorQuery.getLong(columnIndex);
                boolean z = cursorQuery.getInt(columnIndex2) == 1;
                String string = cursorQuery.getString(columnIndex3);
                try {
                    String strU0 = ihc1.U0(URLDecoder.decode(string, "UTF-8"), "utm_content=", "");
                    if (strU0.length() == 0) {
                        i1k0.C("getMetaInstallReferrerDetails - utm_content is empty for provider ".concat(str));
                        cursorQuery.close();
                        return null;
                    }
                    StringBuilder sb = new StringBuilder("getMetaInstallReferrerDetails - Got Meta Install Referrer as ");
                    sb.append(z ? "click-through" : "view-through");
                    sb.append(" from provider ");
                    sb.append(str);
                    sb.append(": ");
                    sb.append(string);
                    String string2 = sb.toString();
                    if (i1k0.b && 3 <= i3a.g(i1k0.a) && string2.length() > 0 && (fnaVar = i1k0.c) != null && fnaVar != null) {
                        fnaVar.l(string2, "INFO");
                    }
                    try {
                        long j2 = new JSONObject(strU0).getLong("t");
                        f4t f4tVar = f4t.b;
                        qn80 qn80Var = new qn80("Meta", j2, string, j, (Long) null, (Long) null, z);
                        cursorQuery.close();
                        return qn80Var;
                    } catch (JSONException e) {
                        i1k0.C("getMetaInstallReferrerDetails - JSONException in queryProvider: " + e);
                        cursorQuery.close();
                        return null;
                    }
                } catch (IllegalArgumentException e2) {
                    i1k0.C("getMetaInstallReferrerDetails - Error decoding URL: " + e2);
                    cursorQuery.close();
                    return null;
                }
            }
            i1k0.C("getMetaInstallReferrerDetails - Required column not found in cursor for provider ".concat(str));
            cursorQuery.close();
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u890.p(cursorQuery, th);
                throw th2;
            }
        }
    }

    public static final void B(uif1 uif1Var, Throwable th) throws Throwable {
        esw0 esw0Var = ((mjs0) uif1Var).c;
        Thread threadCurrentThread = Thread.currentThread();
        long id = threadCurrentThread.getId();
        za91 za91VarC = esw0Var.e;
        za91 za91Var = esw0Var.f;
        if (za91VarC == null || ((rge1) za91VarC).d != id) {
            if (za91Var == null || ((rge1) za91Var).d != id) {
                za91VarC = esw0Var.c(id, Os.gettid(), threadCurrentThread.getName());
                esw0Var.f = esw0Var.e;
                esw0Var.e = za91VarC;
            } else {
                za91VarC = za91Var;
            }
        }
        g9x g9xVar = za91VarC.a;
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            stackTraceElement.getClassName();
            stackTraceElement.getMethodName();
            stackTraceElement.getFileName();
            stackTraceElement.getLineNumber();
        }
        throw th;
    }

    public static final j2i C(List list) {
        j2i j2iVar;
        Iterator it = list.iterator();
        do {
            j2iVar = null;
            if (it.hasNext()) {
                m4d1 m4d1Var = (n4d1) it.next();
                if (u890.j(m4d1Var, l4d1.a)) {
                    j2iVar = zhj.a;
                } else if (m4d1Var instanceof m4d1) {
                    j2iVar = new j2i(-1492299053, new dj71(m4d1Var, (byte) 17), true);
                } else if (!u890.j(m4d1Var, k4d1.a)) {
                    eg.o();
                }
            }
            return null;
        } while (j2iVar == null);
        return j2iVar;
    }

    public static void D() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    public static final void a(tu1 tu1Var, Function0 function0, j2i j2iVar, qim0 qim0Var, boolean z, boolean z2, j2i j2iVar2, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(513587276);
        int i2 = i | (b0kVar3.g(tu1Var) ? 4 : 2) | (b0kVar3.i(function0) ? 32 : 16) | 3072 | (b0kVar3.h(z) ? 16384 : 8192) | (b0kVar3.h(z2) ? 131072 : 65536);
        if (b0kVar3.Y(i2 & 1, (599187 & i2) != 599186)) {
            q3p1.b(i2 & 112, 0, function0, b0kVar3, tu1Var.b().size() > 1 && z);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarY = z2 ? voo1.y(qim0Var3, voo1.f) : qim0Var3;
            ru1 ru1VarT = rwo1.t(tu1Var.a().b);
            if (u890.j(ru1VarT != null ? ru1VarT.a : null, "atp")) {
                b0kVar3.i0(1605662405);
                qim0VarY = bmq0.L(qim0VarY, k1o1.q(b0kVar3), (g6o0) null);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(1605747035);
                b0kVar3.r(false);
            }
            qim0 qim0Var4 = qim0VarY;
            uwr uwrVar = cbx.a;
            b0kVar2 = b0kVar3;
            cgj1.n(qim0Var4, apo.r(632169736, new q1((Object) j2iVar, (Object) tu1Var, (Object) function0, (byte) 22), b0kVar3), (vu30) null, (vu30) null, (vu30) null, 0, cbx.a(b0kVar3).a.a.a(), 0L, new mn20(0, 0, 0, 0), apo.r(205151325, new wf((Object) j2iVar2, (Object) tu1Var, (byte) 11), b0kVar3), b0kVar2, 805306416, 188);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new vl(tu1Var, function0, j2iVar, qim0Var2, z, z2, j2iVar2, i, (byte) 1);
        }
    }

    public static final void b(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1287331718);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            gfx.b(8, apo.r(-1585824005, new b5(qim0Var, (byte) 25), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b5(qim0Var, i, (byte) 26);
        }
    }

    public static final void c(c380 c380Var, boolean z, boolean z2, boolean z3, boolean z4, Function0 function0, b0k b0kVar, int i) {
        Function0 function1;
        float f;
        qim0 qim0Var;
        float f2;
        qim0 qim0Var2;
        qim0 qim0VarB;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-193759967);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(c380Var) ? 4 : 2) | (x340Var.h(z2) ? 256 : 128) | (x340Var.h(z3) ? 2048 : 1024) | (x340Var.h(z4) ? 16384 : 8192) | (x340Var.i(function0) ? 131072 : 65536);
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            cr31 cr31VarA = er31.a(50);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarQ = i1p1.q(qim0Var3, cr31VarA);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarQ);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z5 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z5) {
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
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarF2 = dug.f(uyn1.B(qim0VarF, 0.0f, 4.0f, 0.0f, 0.0f, 13), cbx.a(x340Var).a.b.a(), er31.a(50));
            if (z3) {
                x340Var.i0(1926615086);
                cvx cvxVar2 = cbx.b(x340Var).b;
                x340Var.r(false);
                f = 12.0f;
            } else {
                x340Var.i0(1926616811);
                cvx cvxVar3 = cbx.b(x340Var).b;
                x340Var.r(false);
                f = 16.0f;
            }
            qim0 qim0VarJ = u291.j(cbx.b(x340Var).b.d, 0.0f, 2, uyn1.B(qim0VarF2, f, 0.0f, 0.0f, 0.0f, 14));
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarJ);
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
            if (z3) {
                x340Var.i0(1643684182);
                cvx cvxVar4 = cbx.b(x340Var).b;
                qim0Var = qim0Var3;
                int i3 = (i2 >> 9) & 112;
                f2 = 1.0f;
                qim0Var2 = null;
                j(uyn1.B(qim0Var3, 0.0f, 0.0f, 8.0f, 0.0f, 11), z4, 0L, x340Var, i3, 4);
                x340Var.r(false);
            } else {
                qim0Var = qim0Var3;
                f2 = 1.0f;
                qim0Var2 = null;
                x340Var.i0(1643838903);
                x340Var.r(false);
            }
            wnb0 wnb0Var = new wnb0(f2, true);
            cvx cvxVar5 = cbx.b(x340Var).b;
            up31.a(c380Var, uyn1.B(wnb0Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), false, (lee1) null, 0L, new cjc0(1), 0, "compact_cta_rotation", x340Var, (i2 & 14) | 12582912);
            x340Var = x340Var;
            if (z2) {
                x340Var.i0(1644094188);
                if (z) {
                    x340Var.i0(1854155091);
                    x340Var.r(false);
                    qim0VarB = qim0Var;
                } else {
                    x340Var.i0(1854153081);
                    cvx cvxVar6 = cbx.b(x340Var).b;
                    qim0VarB = uyn1.B(qim0Var, 0.0f, 0.0f, 16.0f, 0.0f, 11);
                    x340Var.r(false);
                }
                b(qim0VarB, x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(1644258519);
                x340Var.r(false);
            }
            if (z) {
                x340Var.i0(1644286016);
                function1 = function0;
                i((i2 >> 15) & 14, function1, x340Var, qim0Var2);
                x340Var.r(false);
            } else {
                function1 = function0;
                x340Var.i0(1644338871);
                x340Var.r(false);
            }
            x340Var.r(true);
            x340Var.r(true);
        } else {
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rth(c380Var, z, z2, z3, z4, function1, i);
        }
    }

    public static final void d(String str, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-844205599);
        int i2 = i | (x340Var.g(str) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
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
            uwr uwrVar = cbx.a;
            uwo1.e(str, uyn1.z(cbx.b(x340Var).b.b, 0.0f, 2, h2c.a.a(nim0Var, een.h)), cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var, i2 & 14, 0, 2016);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pji(str, i, (byte) 26);
        }
    }

    public static final void e(fb30 fb30Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(676257706);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(fb30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarZ = u291.z(uyn1.B(anm1.N("DISCLAIMER", nim0.a), 0.0f, 16.0f, 0.0f, 0.0f, 13), (fra) null, 3);
            int i3 = af5.e;
            String str = fb30Var.c;
            pae1 pae1Var = new pae1(new zma1(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.c, (Shadow) null, (PlatformSpanStyle) null, 61439), (zma1) null, 14);
            boolean z = (i2 & 112) == 32;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new lq00(iu30Var, (byte) 1);
                b0kVar3.s0(objT);
            }
            af5 af5VarI = ob51.i(str, pae1Var, (rjc0) objT);
            uwr uwrVar = cbx.a;
            b0kVar2 = b0kVar3;
            uwo1.d(af5VarI, cbx.a(b0kVar3).b.b, qim0VarZ, cbx.d(b0kVar3).m, null, null, 0, false, null, 0, null, null, b0kVar2, 0, 0, 4080);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new say(fb30Var, iu30Var, i, (byte) 12);
        }
    }

    public static final void f(vhd0 vhd0Var, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(398245215);
        int i2 = (x340Var.i(vhd0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            d7 d7Var = new d7(uhd0.e, (byte) 0);
            while (d7Var.hasNext()) {
                uhd0 uhd0Var = (uhd0) d7Var.next();
                boolean zI = x340Var.i(vhd0Var) | x340Var.e(uhd0Var.ordinal());
                Object objT = x340Var.T();
                if (zI || objT == m4cVar) {
                    objT = new kd8(vhd0Var, uhd0Var, (byte) 14);
                    x340Var.s0(objT);
                }
                iu30 iu30Var = (iu30) objT;
                boolean zI2 = x340Var.i(vhd0Var);
                Object objT2 = x340Var.T();
                if (zI2 || objT2 == m4cVar) {
                    qka qkaVar = new qka(1, vhd0Var, vhd0.class, "stopImpression", "stopImpression(Lcom/spotify/ubi/logger/ImpressionToken;)V", 0, (byte) 1);
                    x340Var.s0(qkaVar);
                    objT2 = qkaVar;
                }
                yhm1.a(uhd0Var, iu30Var, (iu30) objT2, x340Var, 0);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cka(vhd0Var, i);
        }
    }

    public static final void g(int i, Function0 function0, Function0 function1, b0k b0kVar, iu30 iu30Var, qim0 qim0Var, boolean z) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1154797374);
        int i2 = i | (b0kVar3.i(iu30Var) ? 4 : 2) | (b0kVar3.i(function0) ? 32 : 16) | (b0kVar3.i(function1) ? 256 : 128) | (b0kVar3.h(z) ? 2048 : 1024) | (b0kVar3.i(qim0Var) ? 16384 : 8192);
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ktd.n(b0kVar3);
            }
            idn0 idn0Var = (idn0) objT;
            lz20 lz20Var = new lz20();
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q("");
                b0kVar3.s0(objT2);
            }
            ven0 ven0Var = (ven0) objT2;
            Boolean boolValueOf = Boolean.valueOf(z);
            int i3 = i2 & 7168;
            boolean zI = (i3 == 2048) | b0kVar3.i(ven0Var) | b0kVar3.i(lz20Var);
            Object objT3 = b0kVar3.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new tfe0(z, ven0Var, lz20Var, (lnm) null);
                b0kVar3.s0(objT3);
            }
            qxd0.t(boolValueOf, b0kVar3, (vu30) objT3);
            uwr uwrVar = cbx.a;
            long jB = u7h.b(cbx.a(b0kVar3).a.b.a(), 0.07f, 0.0f, 0.0f, 0.0f, 14);
            cua cuaVar = cbx.b(b0kVar3).f;
            qim0 qim0VarF = u291.f(u291.h(uyn1.x(dug.f(qim0Var, jB, er31.b(8.0f)), 4.0f), 32.0f), 1.0f);
            boolean z2 = (i2 & 896) == 256;
            Object objT4 = b0kVar3.T();
            if (z2 || objT4 == m4cVar) {
                objT4 = new aba0(function1, (byte) 24);
                b0kVar3.s0(objT4);
            }
            qim0 qim0VarN = anm1.N("SearchField", vby0.p(bin.x(qim0VarF, false, null, null, null, (Function0) objT4, 15), lz20Var));
            String str = (String) ven0Var.getValue();
            n6a1 n6a1Var = new n6a1(cbx.a(b0kVar3).b.c);
            lee1 lee1VarA = lee1.a((lee1) b0kVar3.k(rgx.a), cbx.a(b0kVar3).b.a, fc11.G(16), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777212);
            boolean zI2 = b0kVar3.i(ven0Var) | ((i2 & 14) == 4);
            Object objT5 = b0kVar3.T();
            if (zI2 || objT5 == m4cVar) {
                objT5 = new gp0(ven0Var, iu30Var, (byte) 20);
                b0kVar3.s0(objT5);
            }
            b0kVar2 = b0kVar3;
            xea.a(str, (iu30) objT5, qim0VarN, z, false, lee1VarA, (kua0) null, (bua0) null, true, 0, 0, (elk1) null, (iu30) null, idn0Var, n6a1Var, apo.r(-364781445, new pme0(ven0Var, function0, (byte) 0), b0kVar3), b0kVar2, i3 | 100663296, 196608, 7888);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ey((byte) 26, i, (Object) iu30Var, (Object) function0, (Object) function1, qim0Var, z);
        }
    }

    public static final void h(ome0 ome0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1986579607);
        int i2 = i | (x340Var.g(ome0Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            zsc zscVar = zex.a;
            long j = ((yex) zscVar.d).b;
            u5j1 u5j1Var = d4o1.a;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("SearchHeader", u291.f(uyn1.B(dug.f(qim0Var3, j, u5j1Var), 0.0f, 0.0f, 0.0f, 16.0f, 7), 1.0f));
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            ti5.a(apo.r(1606489756, new s2c0(ome0Var, (byte) 22), x340Var), (qim0) null, apo.r(-1797402918, new d720(iu30Var, (byte) 27), x340Var), (xu30) null, 0.0f, (erl1) null, kkn.C(((yex) zscVar.d).b, 0L, 0L, 0L, 0L, x340Var, 62), x340Var, 390, 186);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new jwa0(iu30Var, (byte) 24);
                x340Var.s0(objT);
            }
            iu30 iu30Var2 = (iu30) objT;
            boolean z2 = i3 == 32;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new ijd0(iu30Var, (byte) 9);
                x340Var.s0(objT2);
            }
            Function0 function0 = (Function0) objT2;
            boolean z3 = i3 == 32;
            Object objT3 = x340Var.T();
            if (z3 || objT3 == m4cVar) {
                objT3 = new ijd0(iu30Var, (byte) 10);
                x340Var.s0(objT3);
            }
            g(0, function0, (Function0) objT3, x340Var, iu30Var2, uyn1.z(16.0f, 0.0f, 2, qim0Var3), ome0Var.b);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qae0(ome0Var, iu30Var, qim0Var2, i, (byte) 2);
        }
    }

    public static final void i(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-96042847);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131958231);
            qim0Var2 = nim0.a;
            qim0 qim0VarV = u291.v(u291.h(qim0Var2, 40.0f), 48.0f);
            gra graVar = een.h;
            qim0 qim0VarR = u291.r(u291.A(qim0VarV, graVar, true), 48.0f);
            boolean zG = x340Var.g(strO0);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new irf(strO0, (byte) 12);
                x340Var.s0(objT);
            }
            qim0 qim0VarX = bin.x(s161.b(qim0VarR, false, (iu30) objT), false, null, new pm31(0), null, function0, 11);
            gfh0 gfh0VarC = t1c.c(graVar, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            wox woxVar = wox.c;
            qim0 qim0VarR2 = u291.r(qim0Var2, 16.0f);
            uwr uwrVar = cbx.a;
            w0h1.a(woxVar, isl.a, qim0VarR2, cbx.a(x340Var).b.b, 0L, false, x340Var, wox.d | 48, 48);
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tx1(function0, qim0Var2, i, (byte) 9);
        }
    }

    public static final void j(qim0 qim0Var, boolean z, long j, b0k b0kVar, int i, int i2) {
        int i3;
        long j2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1544725647);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                j2 = j;
                int i5 = x340Var.f(j2) ? 256 : 128;
                i3 |= i5;
            } else {
                j2 = j;
            }
            i3 |= i5;
        } else {
            j2 = j;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                if (i4 != 0) {
                    qim0Var = nim0.a;
                }
                if ((i2 & 4) != 0) {
                    uwr uwrVar = cbx.a;
                    j2 = cbx.a(x340Var).b.a;
                    i3 &= -897;
                }
            } else {
                x340Var.b0();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            }
            qim0 qim0Var3 = qim0Var;
            x340Var.s();
            k4k.b(qim0Var3, 2, z, false, Integer.valueOf(z4p1.G(j2)), x340Var, (i3 & 14) | 48 | ((i3 << 3) & 896), 8);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        long j3 = j2;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sth(qim0Var2, z, j3, i, i2);
        }
    }

    public static final void k(los losVar, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(690131284);
        int i2 = (x340Var.i(losVar) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean zI = x340Var.i(losVar) | ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new mvn0(losVar, function0, function1, (byte) 8);
                x340Var.s0(objT);
            }
            qxd0.i(rih1.a, (iu30) objT, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vbn0(losVar, function0, function1, i, (byte) 12);
        }
    }

    public static final void l(dhz0 dhz0Var, dhz0 dhz0Var2, dhz0 dhz0Var3, qim0 qim0Var, chz0 chz0Var, boolean z, iu30 iu30Var, b0k b0kVar, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        iu30 iu30Var2;
        int i5;
        qim0 qim0Var2;
        boolean z3;
        iu30 iu30Var3;
        chz0 chz0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-390630990);
        int i6 = i | (x340Var.i(dhz0Var) ? 4 : 2) | (x340Var.i(dhz0Var2) ? 32 : 16) | (x340Var.i(dhz0Var3) ? 256 : 128);
        int i7 = i6 | 3072;
        int i8 = i2 & 16;
        if (i8 != 0) {
            i3 = i6 | 27648;
        } else {
            i3 = (x340Var.e(chz0Var == null ? -1 : chz0Var.ordinal()) ? 16384 : 8192) | i7;
        }
        int i9 = i2 & 32;
        if (i9 != 0) {
            i4 = i3 | 196608;
            z2 = z;
        } else {
            z2 = z;
            i4 = i3 | (x340Var.h(z2) ? 131072 : 65536);
        }
        int i10 = i2 & 64;
        if (i10 != 0) {
            i5 = i4 | 1572864;
            iu30Var2 = iu30Var;
        } else {
            iu30Var2 = iu30Var;
            i5 = i4 | (x340Var.i(iu30Var2) ? 1048576 : 524288);
        }
        int i11 = i5;
        if (x340Var.Y(i11 & 1, (599187 & i11) != 599186)) {
            chz0 chz0Var3 = i8 != 0 ? null : chz0Var;
            boolean z4 = i9 != 0 ? true : z2;
            if (i10 != 0) {
                Object objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = yda.Z;
                    x340Var.s0(objT);
                }
                iu30Var2 = (iu30) objT;
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            int i12 = (i11 >> 9) & 896;
            m(dhz0Var, chz0Var3 == chz0.a, z4, (qim0) iu30Var2.invoke(0), x340Var, (i11 & 14) | 8 | i12);
            m(dhz0Var2, chz0Var3 == chz0.b, z4, (qim0) iu30Var2.invoke(1), x340Var, ((i11 >> 3) & 14) | 8 | i12);
            m(dhz0Var3, chz0Var3 == chz0.c, z4, (qim0) iu30Var2.invoke(2), x340Var, ((i11 >> 6) & 14) | 8 | i12);
            x340Var.r(true);
            chz0 chz0Var4 = chz0Var3;
            iu30Var3 = iu30Var2;
            chz0Var2 = chz0Var4;
            z3 = z4;
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            z3 = z2;
            iu30Var3 = iu30Var2;
            chz0Var2 = chz0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bla(dhz0Var, dhz0Var2, dhz0Var3, qim0Var2, chz0Var2, z3, iu30Var3, i, i2);
        }
    }

    public static final void m(dhz0 dhz0Var, boolean z, boolean z2, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        boolean z3;
        qim0 qim0Var2;
        iec iecVarA;
        Integer num;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1589187592);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(dhz0Var) : x340Var.i(dhz0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z3 = z2;
            i2 |= x340Var.h(z3) ? 256 : 128;
        } else {
            z3 = z2;
        }
        if ((i & 3072) == 0) {
            qim0Var2 = qim0Var;
            i2 |= x340Var.g(qim0Var2) ? 2048 : 1024;
        } else {
            qim0Var2 = qim0Var;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            if (!z || (num = dhz0Var.d) == null) {
                iecVarA = dhz0Var.a;
            } else {
                iec iecVar = dhz0Var.a;
                iecVarA = iec.a(iecVar, gec.a(iecVar.a, null, num, 7), (gec) null, (eec) null, 30);
            }
            kln1.l(iecVarA, qim0Var2, z3, null, true, dhz0Var.c, (vnr0) dhz0Var.b.invoke(x340Var, 0), x340Var, (i2 & 896) | ((i2 >> 6) & 112) | 24584 | 2097152, 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cla((Object) dhz0Var, z, z2, (Object) qim0Var, i, (byte) 0);
        }
    }

    public static final void n(int i, j2i j2iVar, j2i j2iVar2, j2i j2iVar3, qim0 qim0Var, j2i j2iVar4, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(11338051);
        int i3 = i2 | (x340Var.e(i) ? 4 : 2) | (x340Var.g(qim0Var) ? 16384 : 8192);
        if (x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
            boolean z = (i3 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                l8 l8Var = new l8(j2iVar, j2iVar2, j2iVar3, i, j2iVar4);
                x340Var.s0(l8Var);
                objT = l8Var;
            }
            ejo1.l((i3 >> 12) & 14, 0, x340Var, (vu30) objT, qim0Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hy0(i, j2iVar, j2iVar2, j2iVar3, qim0Var, j2iVar4, i2);
        }
    }

    public static final void o(int i, int i2, int i3, long j, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        int i4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1641584501);
        int i5 = i2 | (x340Var.e(i) ? 4 : 2) | (x340Var.f(j) ? 32 : 16);
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 = i5 | 384;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i4 = i5 | (x340Var.i(qim0Var2) ? 256 : 128);
        }
        if (x340Var.Y(i4 & 1, (i4 & 147) != 146)) {
            if (i6 != 0) {
                qim0Var2 = nim0.a;
            }
            String strO0 = cwl1.o0(x340Var, i);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, qim0Var2, cbx.d(x340Var).m, j, null, null, 0, false, null, 0, null, x340Var, ((i4 >> 3) & 112) | ((i4 << 6) & 7168), 0, 2032);
        } else {
            x340Var.b0();
        }
        qim0 qim0Var3 = qim0Var2;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wm81(i, i2, i3, j, qim0Var3);
        }
    }

    public static final void p(int i, List list, j2i j2iVar, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1379633399);
        int i2 = (x340Var.i(list) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            j2i j2iVarC = C(list);
            qim0Var2 = nim0.a;
            q(j2iVar, j2iVarC, qim0Var2, x340Var, 390, 0);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new deo0(list, qim0Var2, j2iVar, i, (byte) 1);
        }
    }

    public static final void q(vu30 vu30Var, vu30 vu30Var2, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1111674422);
        if ((i & 6) == 0) {
            i3 = (x340Var.i(vu30Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.i(vu30Var2) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                qim0Var = nim0.a;
            }
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
            if (vu30Var == null) {
                x340Var.i0(-1753719603);
                x340Var.r(false);
            } else {
                x340Var.i0(81975732);
                us71.j(i3 & 14, vu30Var, x340Var, false);
            }
            if (vu30Var2 == null) {
                x340Var.i0(-1753695795);
                x340Var.r(false);
            } else {
                x340Var.i0(81976500);
                us71.j((i3 >> 3) & 14, vu30Var2, x340Var, false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qx1((byte) 21, i, i2, (Object) vu30Var, (Object) vu30Var2, qim0Var2);
        }
    }

    public static final dhz0 s(dhz0 dhz0Var, ven0 ven0Var, chz0 chz0Var, Function0 function0) {
        iec iecVar = dhz0Var.a;
        return new dhz0(iec.a(iecVar, (gec) null, (gec) null, new dla(ven0Var, chz0Var, function0, iecVar), 15), dhz0Var.b, dhz0Var.c, dhz0Var.d);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.json.JsonEncodingException */
    public static final void t(nfa0 nfa0Var, nma0 nma0Var, nma0 nma0Var2, String str) throws JsonEncodingException {
        h661 descriptor = nma0Var2.getDescriptor();
        mue1.P(nfa0Var, descriptor);
        if (j0o1.p(descriptor).contains(str)) {
            String strH = nma0Var.getDescriptor().h();
            String strH2 = nma0Var2.getDescriptor().h();
            throw new JsonEncodingException(l1d.n(str, "'.", gvg.n("Class '", strH2, "' cannot be serialized ", (nfa0Var.a.l == 2 && u890.j(strH, strH2)) ? "in ALL_JSON_OBJECTS class discriminator mode" : cy30.n("as base class '", strH, '\''), " because it has property name that conflicts with JSON class discriminator '")), "You can either change class discriminator in JsonConfiguration, or rename property with @SerialName annotation.");
        }
    }

    public static final void u(yoi1 yoi1Var) {
        if (yoi1Var instanceof l661) {
            eg.m("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        } else if (yoi1Var instanceof mnw0) {
            eg.m("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        } else if (yoi1Var instanceof scv0) {
            eg.m("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    public static final String v(nfa0 nfa0Var, h661 h661Var) {
        for (ufa0 ufa0Var : h661Var.getAnnotations()) {
            if (ufa0Var instanceof ufa0) {
                return ufa0Var.discriminator();
            }
        }
        return nfa0Var.a.i;
    }

    public static final qn80 w(List list) {
        Object obj;
        Iterator it = o7h.o0(list).iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long j = ((qn80) next).b;
                do {
                    Object next2 = it.next();
                    long j2 = ((qn80) next2).b;
                    if (j < j2) {
                        next = next2;
                        j = j2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (qn80) obj;
    }

    public static final boolean x(File file) {
        return file.isFile() && f46.S0(new String[]{"jpg", "jpeg", "png", "webp"}).contains(y520.F(file).toLowerCase(Locale.ROOT));
    }

    public static ksk0 y(String str) {
        return new ksk0(str, (byte) 14);
    }

    public static final j2i z(List list, j2i j2iVar) {
        j2i j2iVarC = C(list);
        if (j2iVarC == null && j2iVar == null) {
            return null;
        }
        return new j2i(-1377992123, new rt11(j2iVar, j2iVarC, (byte) 27), true);
    }
}
