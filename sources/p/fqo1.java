package p;

import android.app.DatePickerDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import defpackage.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class fqo1 {
    public static final pl10 a;
    public static final pl10 b;
    public static final pl10[] c;
    public static b180 d;

    static {
        pl10 pl10Var = new pl10("EXECUTE", 1L);
        a = pl10Var;
        pl10 pl10Var2 = new pl10("INIT", 1L);
        b = pl10Var2;
        c = new pl10[]{pl10Var, pl10Var2};
    }

    public static final void A(zci1 zci1Var, iu30 iu30Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        Object bj81Var;
        Boolean bool;
        y7e1 y7e1Var;
        lz20 lz20Var;
        iu30 iu30Var2;
        Object obj;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-2111506277);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(zci1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(function0) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (b0kVar3.Y(i3 & 1, (i3 & 1171) != 1170)) {
            Context context = (Context) b0kVar3.k(AndroidCompositionLocals_androidKt.b);
            es41 es41VarC = l6o1.C(0, 0, 1, b0kVar3);
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = pzm.i(b0kVar3);
            }
            lz20 lz20Var2 = (lz20) objT;
            az20 az20Var = (az20) b0kVar3.k(t4k.i);
            k6a1 k6a1Var = (k6a1) b0kVar3.k(t4k.q);
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = new y7e1(zci1Var.a, 2);
                b0kVar3.s0(objT2);
            }
            y7e1 y7e1Var2 = (y7e1) objT2;
            Object objT3 = b0kVar3.T();
            if (objT3 == m4cVar) {
                objT3 = new y7e1(zci1Var.h, 2);
                b0kVar3.s0(objT3);
            }
            y7e1 y7e1Var3 = (y7e1) objT3;
            Object objT4 = b0kVar3.T();
            if (objT4 == m4cVar) {
                objT4 = new y7e1(zci1Var.i, 2);
                b0kVar3.s0(objT4);
            }
            y7e1 y7e1Var4 = (y7e1) objT4;
            Boolean boolValueOf = Boolean.valueOf(zci1Var.b());
            int i4 = i3 & 112;
            boolean zI = b0kVar3.i(zci1Var) | b0kVar3.i(y7e1Var3) | (i4 == 32) | b0kVar3.i(y7e1Var4);
            Object objT5 = b0kVar3.T();
            if (zI || objT5 == m4cVar) {
                bool = boolValueOf;
                y7e1Var = y7e1Var4;
                lz20Var = lz20Var2;
                bj81Var = new bj81(zci1Var, y7e1Var3, iu30Var, y7e1Var, (lnm) null, (byte) 15);
                y7e1Var3 = y7e1Var3;
                iu30Var2 = iu30Var;
                b0kVar3.s0(bj81Var);
            } else {
                bool = boolValueOf;
                iu30Var2 = iu30Var;
                y7e1Var = y7e1Var4;
                lz20Var = lz20Var2;
                bj81Var = objT5;
            }
            qxd0.r(bool, y7e1Var3, y7e1Var, (vu30) bj81Var, b0kVar3);
            boolean zI2 = b0kVar3.i(y7e1Var2) | (i4 == 32);
            Object objT6 = b0kVar3.T();
            if (zI2 || objT6 == m4cVar) {
                objT6 = new qy5(y7e1Var2, iu30Var2, (lnm) null, (byte) 15);
                b0kVar3.s0(objT6);
            }
            qxd0.t(y7e1Var2, b0kVar3, (vu30) objT6);
            boolean zI3 = b0kVar3.i(lz20Var);
            Object objT7 = b0kVar3.T();
            if (zI3 || objT7 == m4cVar) {
                objT7 = new fx1(lz20Var, null, (byte) 14);
                b0kVar3.s0(objT7);
            }
            qxd0.t(rih1.a, b0kVar3, (vu30) objT7);
            Object objT8 = b0kVar3.T();
            if (objT8 == m4cVar) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(context, 2132017504, new l6r(iu30Var2, (byte) 3), 2000, 0, 1);
                datePickerDialog.getDatePicker().setMaxDate(new Date().getTime());
                b0kVar3.s0(datePickerDialog);
                obj = datePickerDialog;
            } else {
                obj = objT8;
            }
            DatePickerDialog datePickerDialog2 = (DatePickerDialog) obj;
            m6r m6rVar = zci1Var.b;
            Integer num = m6rVar.c;
            Integer num2 = m6rVar.d;
            Integer num3 = m6rVar.e;
            boolean zI4 = b0kVar3.i(zci1Var) | b0kVar3.i(datePickerDialog2);
            Object objT9 = b0kVar3.T();
            if (zI4 || objT9 == m4cVar) {
                objT9 = new kwb1(zci1Var, datePickerDialog2, (lnm) null, (byte) 26);
                b0kVar3.s0(objT9);
            }
            qxd0.r(num, num2, num3, (vu30) objT9, b0kVar3);
            WeakHashMap weakHashMap = osl1.x;
            u85 u85Var = lhc.g(b0kVar3).g;
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            irn1.u(qim0Var3, apo.r(2013431688, new wpg1((Object) zci1Var, (Object) function0, (Object) iu30Var2, (byte) 16), b0kVar3), null, u85Var, apo.r(-1910165502, new jkn(es41VarC, zci1Var, lz20Var, y7e1Var2, az20Var, k6a1Var, datePickerDialog2, y7e1Var3, y7e1Var, iu30Var2), b0kVar3), b0kVar2, ((i3 >> 9) & 14) | 24624, 4);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ncf1(zci1Var, iu30Var, function0, qim0Var2, i, (byte) 17);
        }
    }

    public static final af5 B(String str, String str2, List list, long j, long j2, ira iraVar) {
        ye5 ye5Var = new ye5();
        int iO = ye5Var.o(new zma1(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
        try {
            ye5Var.g(F(str, iraVar));
            ye5Var.k(iO);
            StringBuilder sb = new StringBuilder();
            if (str2.length() > 0) {
                sb.append(str2);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (!ihc1.y0(str3)) {
                    if (sb.length() > 0) {
                        sb.append(" • ");
                    }
                    sb.append(F(str3, iraVar));
                }
            }
            String string = sb.toString();
            if (string.length() > 0) {
                int iO2 = ye5Var.o(new zma1(j2, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                try {
                    ye5Var.g(" • ");
                    ye5Var.g(string);
                } finally {
                    ye5Var.k(iO2);
                }
            }
            return ye5Var.p();
        } catch (Throwable th) {
            ye5Var.k(iO);
            throw th;
        }
    }

    public static final boolean C(hwt hwtVar) {
        return (hwtVar == null || hwtVar.e || hwtVar.a || !hwtVar.d || hwtVar.g) ? false : true;
    }

    public static PendingIntent D(Context context, Intent intent) {
        return PendingIntent.getActivity(context, 0, intent, 201326592);
    }

    public static final boolean E(lfi1 lfi1Var, String str) {
        ifi1 ifi1Var = lfi1Var.a;
        ifi1 ifi1Var2 = ifi1Var instanceof ifi1 ? ifi1Var : null;
        return u890.j(ifi1Var2 != null ? ifi1Var2.b : null, str);
    }

    public static final String F(String str, ira iraVar) {
        return str.length() == 0 ? str : iraVar.e(str);
    }

    public static final String G(ArrayList arrayList, ira iraVar) {
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!ihc1.y0((String) obj)) {
                arrayList2.add(obj);
            }
        }
        return o7h.y0(arrayList2, " • ", (String) null, (String) null, new vfi0(iraVar, (byte) 0), 30);
    }

    public static final y9e1 H(y9e1[] y9e1VarArr, yae1 yae1Var, lee1 lee1Var, int i, pzg1 pzg1Var, int i2) {
        y9e1 y9e1Var = y9e1VarArr[i2];
        if (y9e1Var != null) {
            return y9e1Var;
        }
        y9e1 y9e1VarB = yae1.b(yae1Var, B(pzg1Var.a, pzg1Var.b, o7h.d1(pzg1Var.c, i2), pzg1Var.d, pzg1Var.e, pzg1Var.f), lee1Var, 2, false, 2, jjl.b(0, i, 0, 0, 13), (flb0) null, (wat) null, (f930) null, 1960);
        y9e1VarArr[i2] = y9e1VarB;
        return y9e1VarB;
    }

    public static final qd20 I(ue20 ue20Var) {
        boolean z = ue20Var instanceof se20;
        z6x z6xVar = z6x.a;
        if (z) {
            return new qd20(z6xVar, (xo20) null);
        }
        if (ue20Var instanceof re20) {
            re20 re20Var = (re20) ue20Var;
            return new qd20(re20Var.b, re20Var.a);
        }
        if (ue20Var instanceof te20) {
            return new qd20(z6xVar, (xo20) null);
        }
        eg.o();
        return null;
    }

    public static final sh91 J(te20 te20Var) {
        List<db20> list = te20Var.a;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (db20 db20Var : list) {
            arrayList.add(new oh91(db20Var.a, db20Var.b, db20Var.c));
        }
        return new sh91(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    public static final hpc1 K(ie30 ie30Var) {
        int i;
        int i2;
        hjj0 hjj0Var = ie30Var.m;
        String str = ie30Var.d;
        if (str == null) {
            return null;
        }
        int i3 = ie30Var.f;
        int i4 = 0;
        int i5 = 1;
        boolean z = (i3 & 64) != 0;
        if ((i3 & 1) != 0) {
            i = i5;
        } else if ((i3 & 16) != 0) {
            i5 = 2;
            i = i5;
        } else {
            i = 0;
        }
        if (hjj0Var != null) {
            ArrayList arrayList = new ArrayList();
            xpc1 xpc1Var = new xpc1(new n811(), hjj0Var);
            while (xpc1Var.hasNext()) {
                Object next = xpc1Var.next();
                if (next instanceof wqc1) {
                    arrayList.add(next);
                }
            }
            wqc1 wqc1Var = (wqc1) o7h.s0(arrayList);
            if (wqc1Var != null) {
                i2 = wqc1Var.a;
            } else {
                i2 = 0;
            }
        } else {
            i2 = 0;
        }
        if (hjj0Var != null) {
            ArrayList arrayList2 = new ArrayList();
            xpc1 xpc1Var2 = new xpc1(new n811(), hjj0Var);
            while (xpc1Var2.hasNext()) {
                Object next2 = xpc1Var2.next();
                if (next2 instanceof aqc1) {
                    arrayList2.add(next2);
                }
            }
            aqc1 aqc1Var = (aqc1) o7h.s0(arrayList2);
            if (aqc1Var != null) {
                i4 = aqc1Var.a;
            }
        }
        return new hpc1(str, Boolean.valueOf(z), i2, i, i4);
    }

    public static final zfx L(wfx wfxVar) {
        return new zfx(wfxVar, (byte) 25);
    }

    public static final af5 M(pzg1 pzg1Var, int i) {
        return B(f4i1.e(ihc1.f1(ihc1.c1(i, pzg1Var.a)).toString(), "…"), pzg1Var.b, z6x.a, pzg1Var.d, pzg1Var.e, pzg1Var.f);
    }

    public static final fyx N(b0k b0kVar) {
        uwr uwrVar = cbx.a;
        return new fyx(new zxx(cbx.a(b0kVar).b.a, cbx.a(b0kVar).b.a, cbx.a(b0kVar).b.b, cbx.a(b0kVar).b.d, cbx.a(b0kVar).c.b, cbx.a(b0kVar).d.b, cbx.a(b0kVar).b.c, 0L, 896));
    }

    public static final void a(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2096348329);
        int i2 = (x340Var.h(false) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            ryx ryxVarM = axo1.m((i2 & 14) | 432, x340Var, 0);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = qxd0.M(o6x.a, x340Var);
                x340Var.s0(objT);
            }
            function1 = function0;
            f3o1.b(48, apo.r(2069111353, new m(cwl1.o0(x340Var, 2131953711), ryxVarM, function1, (c9n) objT, cwl1.o0(x340Var, 2131953710)), x340Var), x340Var);
            qim0Var = nim0.a;
        } else {
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vd1(function1, qim0Var, i, (byte) 12);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void b(d4f d4fVar, boolean z, Function0 function0, Function0 function1, Function0 function2, qim0 qim0Var, Function0 function3, String str, String str2, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        qim0 qim0Var2;
        String str3 = str;
        String str4 = str2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2050282418);
        int i2 = i | (x340Var.i(d4fVar) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(function1) ? 2048 : 1024) | (x340Var.i(function2) ? 16384 : 8192) | 196608 | (x340Var.i(function3) ? 1048576 : 524288) | 12582912 | (x340Var.g(str3) ? 67108864 : 33554432) | (x340Var.g(str4) ? 536870912 : 268435456);
        if (x340Var.Y(i2 & 1, (306783379 & i2) != 306783378)) {
            boolean z2 = d4fVar instanceof c4f;
            qim0 qim0Var3 = nim0.a;
            if (z2) {
                x340Var.i0(-1068570796);
                int i3 = (i2 & 1022) | ((i2 >> 9) & 7168) | 221184;
                int i4 = i2 >> 6;
                w((c4f) d4fVar, z, function0, function3, str3, str4, x340Var, i3 | (3670016 & i4) | (i4 & 29360128));
                str3 = str3;
                str4 = str4;
                x340Var.r(false);
            } else {
                if (!(d4fVar instanceof b4f)) {
                    throw p3d1.k(x340Var, -1068572192, false);
                }
                x340Var.i0(1234466379);
                int iC = l1d.C(((b4f) d4fVar).a);
                if (iC == 0) {
                    x340Var.i0(-1068554521);
                    int i5 = ((i2 >> 9) & 14) | 48;
                    int i6 = i2 >> 18;
                    h((i6 & 7168) | i5 | (i6 & 896), str3, str4, function1, x340Var);
                    x340Var.r(false);
                } else {
                    if (iC != 1) {
                        throw p3d1.k(x340Var, -1068557161, false);
                    }
                    x340Var.i0(-1068546009);
                    g((i2 >> 12) & 126, function2, x340Var, qim0Var3);
                    x340Var.r(false);
                }
                x340Var.r(false);
            }
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qw1(d4fVar, z, function0, function1, function2, qim0Var2, function3, str3, str4, i);
        }
    }

    public static final void c(dyh1 dyh1Var, mrn mrnVar, boolean z, iu30 iu30Var, boolean z2, String str, String str2, Uri uri, b0k b0kVar, int i) {
        int i2;
        Uri uri2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-87276503);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(dyh1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? b0kVar3.g(mrnVar) : b0kVar3.i(mrnVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.h(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar3.g(str) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= b0kVar3.g(str2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            uri2 = uri;
            i2 |= b0kVar3.g(uri2) ? 8388608 : 4194304;
        } else {
            uri2 = uri;
        }
        if (b0kVar3.Y(i2 & 1, (4793491 & i2) != 4793490)) {
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = gio1.b(new frn());
                b0kVar3.s0(objT);
            }
            wen0 wen0Var = (wen0) objT;
            ven0 ven0VarH = rwq.h(wen0Var, b0kVar3, 0);
            e1r0 e1r0Var = new e1r0((byte) 2);
            int i3 = i2 & 7168;
            boolean zI = (i3 == 2048) | b0kVar3.i(wen0Var);
            Object objT2 = b0kVar3.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new kjk(wen0Var, iu30Var, (byte) 25);
                b0kVar3.s0(objT2);
            }
            ihg0 ihg0VarE = p1p1.E(e1r0Var, (iu30) objT2, b0kVar3);
            if (z2) {
                b0kVar3.i0(-1597753264);
                Uri uri3 = ((frn) ven0VarH.getValue()).a;
                boolean zI2 = b0kVar3.i(ven0VarH) | (i3 == 2048);
                Object objT3 = b0kVar3.T();
                if (zI2 || objT3 == m4cVar) {
                    objT3 = new h43(ven0VarH, iu30Var, (lnm) null, (byte) 1);
                    b0kVar3.s0(objT3);
                }
                qxd0.t(uri3, b0kVar3, (vu30) objT3);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-1597560103);
                b0kVar3.r(false);
            }
            Boolean boolValueOf = Boolean.valueOf(((frn) ven0VarH.getValue()).b);
            boolean zI3 = b0kVar3.i(ven0VarH) | b0kVar3.i(ihg0VarE);
            Object objT4 = b0kVar3.T();
            if (zI3 || objT4 == m4cVar) {
                objT4 = new eum(ihg0VarE, ven0VarH, (lnm) null, (byte) 5);
                b0kVar3.s0(objT4);
            }
            qxd0.t(boolValueOf, b0kVar3, (vu30) objT4);
            boolean zI4 = ((i2 & 112) == 32 || ((i2 & 64) != 0 && b0kVar3.i(mrnVar))) | b0kVar3.i(wen0Var);
            Object objT5 = b0kVar3.T();
            if (zI4 || objT5 == m4cVar) {
                objT5 = new eum(mrnVar, wen0Var, (lnm) null, (byte) 6);
                b0kVar3.s0(objT5);
            }
            qxd0.t(mrnVar, b0kVar3, (vu30) objT5);
            Uri uri4 = ((frn) ven0VarH.getValue()).a;
            boolean z3 = ((frn) ven0VarH.getValue()).b;
            boolean z4 = z2 && !(dyh1Var instanceof cyh1);
            boolean z5 = ((dyh1Var instanceof cyh1) || mrnVar != null || z) ? false : true;
            boolean zI5 = (i3 == 2048) | b0kVar3.i(wen0Var);
            Object objT6 = b0kVar3.T();
            if (zI5 || objT6 == m4cVar) {
                objT6 = new nrn(iu30Var, wen0Var);
                b0kVar3.s0(objT6);
            }
            Function0 function0 = (Function0) objT6;
            boolean zI6 = (i3 == 2048) | b0kVar3.i(ven0VarH);
            Object objT7 = b0kVar3.T();
            if (zI6 || objT7 == m4cVar) {
                objT7 = new gp0(iu30Var, ven0VarH, (byte) 11);
                b0kVar3.s0(objT7);
            }
            iu30 iu30Var2 = (iu30) objT7;
            boolean zI7 = b0kVar3.i(wen0Var) | (i3 == 2048);
            Object objT8 = b0kVar3.T();
            if (zI7 || objT8 == m4cVar) {
                objT8 = new nrn(wen0Var, iu30Var);
                b0kVar3.s0(objT8);
            }
            b0kVar2 = b0kVar3;
            aqo1.h(uri4, z3, z4, z5, function0, iu30Var2, (Function0) objT8, str, str2, uri2, b0kVar2, (i2 << 6) & 2143289344);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new rf6(dyh1Var, mrnVar, z, iu30Var, z2, str, str2, uri, i);
        }
    }

    public static final void d(int i, String str, String str2, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        long j;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1304002324);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | (x340Var.i(function0) ? 2048 : 1024) | (x340Var.i(qim0Var) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.b.a();
            if (z) {
                x340Var.i0(-445717629);
                j = cbx.a(x340Var).b.d;
                x340Var.r(false);
            } else if (str.length() == 0) {
                x340Var.i0(-445648220);
                j = cbx.a(x340Var).b.b;
                x340Var.r(false);
            } else {
                x340Var.i0(-445600697);
                j = cbx.a(x340Var).b.a;
                x340Var.r(false);
            }
            long j2 = j;
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarX = bin.x(dug.f(qim0VarF, jA, er31.b(4.0f)), false, null, null, null, function0, 15);
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarX, 16.0f, 12.0f);
            gfh0 gfh0VarC = t1c.c(een.g, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
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
            uwo1.e(str.length() == 0 ? str2 : str, null, cbx.d(x340Var).g, j2, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            x0d.s(nim0.a, cbx.b(x340Var).b.a, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new br30(str, str2, z, function0, qim0Var, i, (byte) 5);
        }
    }

    public static final void e(y7e1 y7e1Var, y7e1 y7e1Var2, boolean z, b0k b0kVar, int i) {
        x340 x340Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1824480978);
        int i2 = i | (x340Var2.i(y7e1Var) ? 4 : 2) | (x340Var2.i(y7e1Var2) ? 32 : 16) | (x340Var2.h(z) ? 256 : 128);
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var2, nim0Var);
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
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            String strG = ydh.g(16.0f, 2131963578, x340Var2, x340Var2, nim0Var);
            uwo1.e(strG, null, cbx.d(x340Var2).k, 0L, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2042);
            cvx cvxVar2 = cbx.b(x340Var2).b;
            uwo1.e(ydh.g(8.0f, 2131963577, x340Var2, x340Var2, nim0Var), null, cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2034);
            cvx cvxVar3 = cbx.b(x340Var2).b;
            op71.g(x340Var2, u291.h(nim0Var, 8.0f));
            fyx fyxVarN = N(x340Var2);
            String strO0 = cwl1.o0(x340Var2, 2131963580);
            kua0 kua0Var = new kua0(0, (Boolean) null, 6, 0, 123);
            qim0 qim0VarN = anm1.N("user_info_email_field", u291.f(nim0Var, 1.0f));
            boolean zG = x340Var2.g(strG);
            Object objT = x340Var2.T();
            if (zG || objT == m4cVar) {
                objT = new ysf1(strG, (byte) 18);
                x340Var2.s0(objT);
            }
            d6e1 d6e1Var = d6e1.b;
            rwo1.a(y7e1Var, fyxVarN, s161.b(qim0VarN, false, (iu30) objT), null, strO0, null, null, false, null, null, kua0Var, null, d6e1Var, null, null, null, null, null, 0.0f, false, x340Var2, i2 & 14, 0, 0, 2086888);
            x340Var = x340Var2;
            if (z) {
                x340Var.i0(-2068994013);
                cvx cvxVar4 = cbx.b(x340Var).b;
                String strG2 = ydh.g(16.0f, 2131963571, x340Var, x340Var, nim0Var);
                uwo1.e(strG2, null, cbx.d(x340Var).k, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2042);
                cvx cvxVar5 = cbx.b(x340Var).b;
                op71.g(x340Var, u291.h(nim0Var, 8.0f));
                fyx fyxVarN2 = N(x340Var);
                kua0 kua0Var2 = new kua0(0, (Boolean) null, 6, 0, 123);
                qim0 qim0VarN2 = anm1.N("user_info_confirmation_email_field", u291.f(nim0Var, 1.0f));
                boolean zG2 = x340Var.g(strG2);
                Object objT2 = x340Var.T();
                if (zG2 || objT2 == m4cVar) {
                    objT2 = new ysf1(strG2, (byte) 19);
                    x340Var.s0(objT2);
                }
                rwo1.a(y7e1Var2, fyxVarN2, s161.b(qim0VarN2, false, (iu30) objT2), null, null, null, null, false, null, null, kua0Var2, null, d6e1Var, null, null, null, null, null, 0.0f, false, x340Var, (i2 >> 3) & 14, 0, 0, 2086904);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                x340Var.i0(-2068264614);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ene1(y7e1Var, y7e1Var2, z, i, (byte) 3);
        }
    }

    public static final void f(int i, j2i j2iVar, b0k b0kVar, qim0 qim0Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-779414560);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(j2iVar) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            float f = cbx.b(x340Var).e.b;
            float f2 = cbx.b(x340Var).e.b;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarF, f, 0.0f, f2, 8.0f, 2);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            qim0 qim0VarF2 = u291.f(nim0.a, 1.0f);
            cvx cvxVar2 = cbx.b(x340Var).b;
            t1c.a(dug.f(u291.h(uyn1.B(qim0VarF2, 0.0f, 0.0f, 0.0f, 16.0f, 7), 1.0f), cbx.a(x340Var).d.b, d4o1.a), x340Var, 0);
            dv20.l((i2 >> 3) & 14, j2iVar, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new z3f(qim0Var, j2iVar, i);
        }
    }

    public static final void g(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1738016549);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131953714);
            f(48, apo.r(1975475061, new j3b(strO0, (byte) 16), x340Var), x340Var, bin.x(qim0Var, false, strO0, new pm31(0), null, function0, 9));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tx1(function0, qim0Var, i, (byte) 7);
        }
    }

    public static final void h(int i, String str, String str2, Function0 function0, b0k b0kVar) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1639682600);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.i(nim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(str2) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            f(((i2 >> 3) & 14) | 48, apo.r(2059885682, new tq6(str, str2, function0, (byte) 1), x340Var), x340Var, nim0Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yo6(function0, str, str2, i);
        }
    }

    public static final void i(mg60 mg60Var, ltm1 ltm1Var, b0k b0kVar, int i) {
        int i2;
        LayerDrawable layerDrawableD;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-90961308);
        if ((i & 6) == 0) {
            i2 = (x340Var.e(mg60Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(ltm1Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                int iOrdinal = mg60Var.ordinal();
                if (iOrdinal == 0) {
                    layerDrawableD = ltm1.d(context);
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return;
                    }
                    layerDrawableD = ltm1.e(context);
                }
                objT = layerDrawableD;
                x340Var.s0(objT);
            }
            cso1.f(x7v.a((Drawable) objT, x340Var), isl.a, u291.r(nim0.a, dsa0.m(x340Var, 2131167252)), null, null, x340Var, 56, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lg60(mg60Var, ltm1Var, i, (byte) 0);
        }
    }

    public static final void j(int i, String str, String str2, Function0 function0, b0k b0kVar, boolean z) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1915680311);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.h(z) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            float fM = dsa0.m(x340Var, 2131167252);
            float f = 16.0f;
            if (z) {
                x340Var.i0(1493573200);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                cvx cvxVar2 = cbx.b(x340Var).b;
                f = 16.0f + fM + 16.0f;
                x340Var.r(false);
            } else {
                x340Var.i0(1493681824);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar3 = cbx.b(x340Var).b;
                x340Var.r(false);
            }
            float f2 = f;
            cvx cvxVar4 = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(nim0.a, f2, 0.0f, 16.0f, 0.0f, 10);
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            gfx.b(6, apo.r(955154414, new tq6(str2, str, function0, (byte) 3), x340Var), x340Var, 54);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yx30(i, str, str2, function0, z);
        }
    }

    public static final void k(og60 og60Var, iu30 iu30Var, ltm1 ltm1Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(599912690);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(og60Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(ltm1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(qim0Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            cr31 cr31VarB = er31.b(4.0f);
            qim0 qim0VarF = dug.f(i1p1.q(anm1.N("HINT_CARD_ELEMENT_TEST_TAG", qim0Var), cr31VarB), cbx.a(x340Var).a.d, cr31VarB);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new u460(iu30Var, (byte) 4);
                x340Var.s0(objT);
            }
            qim0 qim0VarX = bin.x(qim0VarF, false, null, null, null, (Function0) objT, 15);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarX, 0.0f, 0.0f, 0.0f, 12.0f, 7);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            String str = og60Var.c;
            String str2 = og60Var.g;
            boolean z2 = i3 == 32;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new u460(iu30Var, (byte) 5);
                x340Var.s0(objT2);
            }
            m(0, str, str2, (Function0) objT2, x340Var);
            cvx cvxVar2 = cbx.b(x340Var).b;
            nim0 nim0Var = nim0.a;
            op71.g(x340Var, u291.h(nim0Var, 12.0f));
            l(og60Var.d, og60Var.e, og60Var.i, ltm1Var, x340Var, (i2 << 3) & 7168);
            String str3 = og60Var.f;
            if (str3 != null) {
                x340Var.i0(1585586703);
                cvx cvxVar3 = cbx.b(x340Var).b;
                op71.g(x340Var, u291.h(nim0Var, 8.0f));
                String str4 = og60Var.h;
                boolean z3 = i3 == 32;
                Object objT3 = x340Var.T();
                if (z3 || objT3 == m4cVar) {
                    objT3 = new u460(iu30Var, (byte) 6);
                    x340Var.s0(objT3);
                }
                j(0, str3, str4, (Function0) objT3, x340Var, og60Var.i != null);
                x340Var.r(false);
            } else {
                x340Var.i0(1585874042);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ke20(i, og60Var, iu30Var, ltm1Var, qim0Var, (byte) 12);
        }
    }

    public static final void l(String str, String str2, mg60 mg60Var, ltm1 ltm1Var, b0k b0kVar, int i) {
        int i2;
        int i3;
        nim0 nim0Var;
        boolean z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-612162337);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.e(mg60Var == null ? -1 : mg60Var.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(ltm1Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            nim0 nim0Var2 = nim0.a;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, nim0Var2);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 48);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
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
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            if (mg60Var != null) {
                x340Var.i0(111974113);
                i(mg60Var, ltm1Var, x340Var, (i2 >> 6) & 126);
                cvx cvxVar2 = cbx.b(x340Var).b;
                ab80.p(nim0Var2, 16.0f, x340Var, false);
            } else {
                x340Var.i0(112133639);
                x340Var.r(false);
            }
            wnb0 wnb0Var = new wnb0(1.0f, true);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, wnb0Var);
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
            if (str != null) {
                x340Var.i0(2081069070);
                i3 = i2;
                nim0Var = nim0Var2;
                uwo1.e(str, anm1.N("hint_card_title", nim0Var2), cbx.d(x340Var).h, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, (i2 & 14) | 48, 0, 2032);
                z = false;
                x340Var.r(false);
            } else {
                i3 = i2;
                nim0Var = nim0Var2;
                z = false;
                x340Var.i0(2081275933);
                x340Var.r(false);
            }
            if (str2 != null) {
                x340Var.i0(2081310033);
                cvx cvxVar3 = cbx.b(x340Var).b;
                nim0 nim0Var3 = nim0Var;
                uwo1.e(str2, anm1.N("hint_card_body", nim0Var3), kk0.p(nim0Var3, 12.0f, x340Var, x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, ((i3 >> 3) & 14) | 48, 0, 2032);
                x340Var.r(false);
            } else {
                x340Var.i0(2081598333);
                x340Var.r(z);
            }
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ke20(i, str, str2, mg60Var, ltm1Var, (byte) 13);
        }
    }

    public static final void m(int i, String str, String str2, Function0 function0, b0k b0kVar) {
        String str3;
        boolean z;
        gbx gbxVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(724039688);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 48);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            wsx wsxVar = wsx.c;
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).c.c;
            cvx cvxVar = cbx.b(x340Var).b;
            w0h1.a(wsxVar, isl.a, u291.r(uyn1.B(nim0Var, 16.0f, 0.0f, 0.0f, 0.0f, 14), dsa0.m(x340Var, 2131167253)), j, 0L, false, x340Var, wsx.d | 48, 48);
            if (str != null) {
                x340Var.i0(-2029956583);
                lee1 lee1Var = cbx.d(x340Var).m;
                long j2 = cbx.a(x340Var).b.b;
                cvx cvxVar2 = cbx.b(x340Var).b;
                qim0 qim0VarN = anm1.N("hint_card_label", uyn1.B(nim0Var, 12.0f, 0.0f, 0.0f, 0.0f, 14));
                if (1.0f <= 0.0d) {
                    of80.a("invalid weight; must be greater than zero");
                }
                uwo1.e(str, qim0VarN.then(new wnb0(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true)), lee1Var, j2, null, null, 0, false, null, 0, null, x340Var, i2 & 14, 0, 2032);
                x340Var = x340Var;
                x340Var.r(false);
                z = true;
            } else {
                x340Var.i0(-2029661494);
                if (1.0f <= 0.0d) {
                    of80.a("invalid weight; must be greater than zero");
                }
                z = true;
                op71.g(x340Var, new wnb0(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
                x340Var.r(false);
            }
            str3 = str2;
            if (str3 == null) {
                gbxVar = new gbx(z50.c, function0);
            } else {
                if (ihc1.y0(str3)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                gbxVar = new gbx(new y50(str3), function0);
            }
            x340 x340Var2 = x340Var;
            wro1.h(gbxVar, ldx.c, anm1.N("hint_card_dismiss", nim0Var), null, yla.s(x340Var), null, false, null, null, isi.a, x340Var2, 432, 6, 984);
            x340Var = x340Var2;
            x340Var.r(z);
        } else {
            str3 = str2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tq6(str, str3, function0, i, (byte) 4);
        }
    }

    public static final void n(int i, String str, String str2, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        Uri uri;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-335863584);
        j06 j06Var = x340Var.a;
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(str2) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarK = d9y0.k(u291.f(qim0Var3, 1.0f), 0.4f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarK);
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
            boolean z2 = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                if (str == null || (uri = Uri.parse(str)) == null) {
                    uri = Uri.EMPTY;
                }
                objT = uri;
                x340Var.s0(objT);
            }
            Uri uri2 = (Uri) objT;
            uri2.getClass();
            qim0Var2 = qim0Var3;
            bmq0.a(uri2, (qim0) null, hcx.c, str2 == null ? "" : str2, (String) null, 0L, 0L, false, x340Var, 384, 242);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarF = dug.f(i1p1.q(u291.h(c13.k(qim0Var2, 12.0f, x340Var, 1.0f, true), 36.0f), er31.b(18.0f)), cbx.a(x340Var).a.b.a(), d4o1.a);
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF);
            gfh0 gfh0VarC = t1c.c(een.g, false);
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
            uwo1.e(cwl1.o0(x340Var, 2131953722), null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            x340Var = x340Var;
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new a4f(qim0Var2, str, str2, i);
        }
    }

    public static final void o(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(475000445);
        if (x340Var.Y(i & 1, i != 0)) {
            String strO0 = cwl1.o0(x340Var, 2131952073);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, null, cbx.d(x340Var).j, cbx.a(x340Var).b.e, null, null, 2, false, new cjc0(1), 0, null, x340Var, 0, 0, 1714);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ry90(i, (byte) 19);
        }
    }

    public static final void p(lfi0 lfi0Var, boolean z, b0k b0kVar, int i) throws Throwable {
        b0k b0kVar2;
        byte b2;
        h311 h311VarV;
        mfi0 mfi0Var;
        Throwable th;
        String strY0;
        boolean z2;
        qim0 qim0VarA;
        lfi0 lfi0Var2 = lfi0Var;
        boolean z3 = z;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        gra graVar = een.d;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1097203661);
        j06 j06Var = ((x340) b0kVar3).a;
        int i2 = (b0kVar3.i(lfi0Var2) ? 4 : 2) | i | (b0kVar3.h(z3) ? 32 : 16);
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            Float f = lfi0Var2.x;
            String str = lfi0Var2.w;
            if (f == null && str == null) {
                b0kVar3.i0(-2092950802);
                q(lfi0Var2, z3, false, b0kVar3, i2 & 126, 4);
                b0kVar3.r(false);
                h311VarV = b0kVar3.v();
                if (h311VarV == null) {
                    return;
                } else {
                    mfi0Var = new mfi0(lfi0Var2, z3, i, (byte) 0);
                }
            } else {
                b0kVar3.i0(-2092857585);
                b0kVar3.r(false);
                if (str == null) {
                    b0kVar3.i0(-2092783682);
                    b0kVar3.r(false);
                    th = null;
                    strY0 = null;
                } else {
                    th = null;
                    b0kVar3.i0(-2092783681);
                    List listI0 = f46.i0(new String[]{lfi0Var2.c, lfi0Var2.e, a2k1.a((Context) b0kVar3.k(AndroidCompositionLocals_androidKt.b), lfi0Var2.f), str, lfi0Var2.d});
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listI0) {
                        if (!ihc1.y0((String) obj)) {
                            arrayList.add(obj);
                        }
                    }
                    strY0 = o7h.y0(arrayList, " • ", (String) null, (String) null, (iu30) null, 62);
                    b0kVar3.r(false);
                }
                qim0 qim0Var = nim0.a;
                if (strY0 != null) {
                    b0kVar3.i0(-2092683489);
                    boolean zG = b0kVar3.g(strY0);
                    Object objT = b0kVar3.T();
                    if (zG || objT == fkj0.X) {
                        objT = new z9b0(strY0, (byte) 29);
                        b0kVar3.s0(objT);
                    }
                    qim0VarA = s161.a(qim0Var, (iu30) objT);
                    z2 = false;
                    b0kVar3.r(false);
                } else {
                    z2 = false;
                    b0kVar3.i0(-2092599975);
                    b0kVar3.r(false);
                    qim0VarA = qim0Var;
                }
                n4k n4kVar = hmb0.t1;
                if (f == null) {
                    b0kVar3.i0(-2092549011);
                    gfh0 gfh0VarC = t1c.c(graVar, z2);
                    int iHashCode = Long.hashCode(((x340) b0kVar3).T);
                    xos0 xos0VarM = b0kVar3.m();
                    qim0 qim0VarE = zr7.E(b0kVar3, qim0VarA);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw th;
                    }
                    b0kVar3.m0();
                    if (((x340) b0kVar3).S) {
                        b0kVar3.l(n4kVar);
                    } else {
                        b0kVar3.v0();
                    }
                    nko1.H(gfh0VarC, b0kVar3, lljVar4);
                    nko1.H(xos0VarM, b0kVar3, lljVar3);
                    x0d.q(iHashCode, b0kVar3, lljVar2, b0kVar3);
                    nko1.H(qim0VarE, b0kVar3, lljVar);
                    z3 = z;
                    b0kVar2 = b0kVar3;
                    q(lfi0Var2, z3, false, b0kVar2, i2 & 126, 4);
                    b0kVar3.r(true);
                    b0kVar3.r(false);
                    b2 = 1;
                    lfi0Var2 = lfi0Var;
                } else {
                    b0kVar3.i0(-2092404365);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(b0kVar3).b;
                    jw31 jw31VarA = ew31.a(new d36(4.0f, true, new um5(z2)), een.N0, b0kVar3, 0);
                    int iHashCode2 = Long.hashCode(((x340) b0kVar3).T);
                    xos0 xos0VarM2 = b0kVar3.m();
                    qim0 qim0VarE2 = zr7.E(b0kVar3, qim0Var);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw th;
                    }
                    b0kVar3.m0();
                    if (((x340) b0kVar3).S) {
                        b0kVar3.l(n4kVar);
                    } else {
                        b0kVar3.v0();
                    }
                    nko1.H(jw31VarA, b0kVar3, lljVar4);
                    nko1.H(xos0VarM2, b0kVar3, lljVar3);
                    x0d.q(iHashCode2, b0kVar3, lljVar2, b0kVar3);
                    qim0 qim0VarThen = kk0.q(b0kVar3, qim0VarE2, lljVar, 1.0f, false).then(qim0VarA);
                    gfh0 gfh0VarC2 = t1c.c(graVar, false);
                    int iHashCode3 = Long.hashCode(((x340) b0kVar3).T);
                    xos0 xos0VarM3 = b0kVar3.m();
                    qim0 qim0VarE3 = zr7.E(b0kVar3, qim0VarThen);
                    b0kVar3.m0();
                    if (((x340) b0kVar3).S) {
                        b0kVar3.l(n4kVar);
                    } else {
                        b0kVar3.v0();
                    }
                    nko1.H(gfh0VarC2, b0kVar3, lljVar4);
                    nko1.H(xos0VarM3, b0kVar3, lljVar3);
                    x0d.q(iHashCode3, b0kVar3, lljVar2, b0kVar3);
                    nko1.H(qim0VarE3, b0kVar3, lljVar);
                    lfi0Var2 = lfi0Var;
                    z3 = z;
                    b0kVar2 = b0kVar3;
                    q(lfi0Var2, z3, true, b0kVar2, (i2 & 14) | 384 | (i2 & 112), 0);
                    b2 = 1;
                    b0kVar2.r(true);
                    v(f.floatValue(), 0, b0kVar2);
                    b0kVar2.r(true);
                    b0kVar2.r(false);
                }
            }
            h311VarV.d = mfi0Var;
        }
        b0kVar2 = b0kVar3;
        b2 = 1;
        b0kVar2.b0();
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            mfi0Var = new mfi0(lfi0Var2, z3, i, b2);
            h311VarV.d = mfi0Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0288  */
    /* JADX WARN: Code duplicated, block: B:103:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x010c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x013b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x0127 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    /* JADX WARN: Code duplicated, block: B:24:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x0087  */
    /* JADX WARN: Code duplicated, block: B:47:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:64:0x012d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0155  */
    /* JADX WARN: Code duplicated, block: B:71:0x0181  */
    /* JADX WARN: Code duplicated, block: B:73:0x0185  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:77:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:79:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:81:0x0210  */
    /* JADX WARN: Code duplicated, block: B:85:0x0217  */
    /* JADX WARN: Code duplicated, block: B:87:0x021a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0226  */
    /* JADX WARN: Code duplicated, block: B:90:0x0228  */
    /* JADX WARN: Code duplicated, block: B:92:0x024a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0255  */
    /* JADX WARN: Code duplicated, block: B:95:0x026d  */
    /* JADX WARN: Code duplicated, block: B:97:0x027e  */
    public static final void q(lfi0 lfi0Var, boolean z, boolean z2, b0k b0kVar, int i, int i2) {
        boolean z3;
        boolean z4;
        boolean z5;
        h311 h311VarV;
        boolean z6;
        String str;
        boolean z7;
        boolean z8;
        boolean zH;
        Object objT;
        ira iraVar;
        ira iraVar2;
        ArrayList arrayList;
        String strY0;
        ArrayList arrayList2;
        ArrayList arrayList3;
        String strY1;
        mmr0 mmr0Var;
        boolean z9;
        long j;
        long j2;
        boolean z10;
        lee1 lee1Var;
        boolean z11;
        lee1 lee1Var2;
        boolean z12;
        boolean z13;
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(428636554);
        int i4 = (x340Var.i(lfi0Var) ? 4 : 2) | i | (x340Var.h(z) ? 32 : 16);
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                z3 = z2;
                i4 |= x340Var.h(z3) ? 256 : 128;
            }
            if ((i4 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (x340Var.Y(i4 & 1, z4)) {
                if (i5 != 0) {
                    z6 = false;
                } else {
                    z6 = z3;
                }
                str = lfi0Var.c;
                z7 = lfi0Var.o;
                if (str != null || ihc1.y0(str)) {
                    str = null;
                }
                if (x340Var.k(t4k.n) == flb0.b) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                zH = x340Var.h(z8);
                objT = x340Var.T();
                if (zH || objT == fkj0.X) {
                    if (z8) {
                        iraVar = ira.e;
                    } else {
                        iraVar = ira.d;
                    }
                    objT = iraVar;
                    x340Var.s0(objT);
                }
                objT.getClass();
                iraVar2 = (ira) objT;
                ArrayList arrayListO0 = o7h.o0(p7h.N(lfi0Var.e));
                arrayList = new ArrayList();
                for (Object obj : arrayListO0) {
                    if (!ihc1.y0((String) obj)) {
                        arrayList.add(obj);
                    }
                }
                strY0 = o7h.y0(arrayList, " • ", (String) null, (String) null, new vfi0(iraVar2, (byte) 1), 30);
                List listI0 = f46.i0(new String[]{a2k1.a((Context) x340Var.k(AndroidCompositionLocals_androidKt.b), lfi0Var.f), lfi0Var.g, lfi0Var.d});
                arrayList2 = new ArrayList();
                for (Object obj2 : listI0) {
                    if (!ihc1.y0((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                List listM = p7h.M(new String[]{strY0, G(arrayList2, iraVar2)});
                arrayList3 = new ArrayList();
                for (Object obj3 : listM) {
                    if (((String) obj3).length() > 0) {
                        arrayList3.add(obj3);
                    }
                }
                strY1 = o7h.y0(arrayList3, " • ", (String) null, (String) null, (iu30) null, 62);
                x340Var.i0(882492202);
                if (z7) {
                    x340Var.i0(-1912227923);
                    uwr uwrVar = cbx.a;
                    mmr0Var = new mmr0(new u7h(cbx.a(x340Var).b.b), new u7h(cbx.a(x340Var).b.b));
                    x340Var.r(false);
                } else {
                    if (lfi0Var.n) {
                        x340Var.i0(-1912225427);
                        uwr uwrVar2 = cbx.a;
                        mmr0Var = new mmr0(new u7h(cbx.a(x340Var).b.b), new u7h(cbx.a(x340Var).b.b));
                        x340Var.r(false);
                    } else {
                        x340Var.i0(-1912222743);
                        x340Var.r(false);
                        uwr uwrVar3 = cbx.a;
                        zsc zscVar = zex.a;
                        mmr0Var = new mmr0(new u7h(((vex) zscVar.e).m), new u7h(((vex) zscVar.e).m));
                        z9 = false;
                    }
                    x340Var.r(z9);
                    j = ((u7h) mmr0Var.a).a;
                    j2 = ((u7h) mmr0Var.b).a;
                    if (z) {
                        x340Var.i0(-397091468);
                        uwr uwrVar4 = cbx.a;
                        lee1Var = cbx.d(x340Var).g;
                        z10 = false;
                    } else {
                        z10 = false;
                        x340Var.i0(-397090381);
                        uwr uwrVar5 = cbx.a;
                        lee1Var = cbx.d(x340Var).j;
                    }
                    x340Var.r(z10);
                    if (!z7 || lfi0Var.p) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (str == null) {
                        x340Var.i0(575265061);
                        if (z11) {
                            i3 = 1;
                        } else {
                            i3 = 2;
                        }
                        uwo1.e(strY1, null, lee1Var, j2, null, null, 2, false, new cjc0(i3), 0, null, x340Var, 0, 0, 1714);
                        x340Var = x340Var;
                        x340Var.r(z10);
                        z13 = z6;
                    } else {
                        lee1Var2 = lee1Var;
                        z12 = z10;
                        if (z11) {
                            x340Var.i0(-397077280);
                            boolean z14 = z6;
                            y(str, strY0, arrayList2, lee1Var2, j, j2, iraVar2, z14, x340Var, (i4 << 15) & 29360128);
                            z13 = z14;
                            x340Var = x340Var;
                            x340Var.r(z12);
                        } else {
                            z13 = z6;
                            x340Var.i0(-397065744);
                            z(str, strY0, arrayList2, lee1Var2, j, j2, iraVar2, x340Var, 0);
                            x340Var.r(z12);
                        }
                    }
                    z5 = z13;
                }
                z9 = false;
                x340Var.r(z9);
                j = ((u7h) mmr0Var.a).a;
                j2 = ((u7h) mmr0Var.b).a;
                if (z) {
                    x340Var.i0(-397091468);
                    uwr uwrVar6 = cbx.a;
                    lee1Var = cbx.d(x340Var).g;
                    z10 = false;
                } else {
                    z10 = false;
                    x340Var.i0(-397090381);
                    uwr uwrVar7 = cbx.a;
                    lee1Var = cbx.d(x340Var).j;
                }
                x340Var.r(z10);
                if (z7) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (str == null) {
                    x340Var.i0(575265061);
                    if (z11) {
                        i3 = 1;
                    } else {
                        i3 = 2;
                    }
                    uwo1.e(strY1, null, lee1Var, j2, null, null, 2, false, new cjc0(i3), 0, null, x340Var, 0, 0, 1714);
                    x340Var = x340Var;
                    x340Var.r(z10);
                    z13 = z6;
                } else {
                    lee1Var2 = lee1Var;
                    z12 = z10;
                    if (z11) {
                        x340Var.i0(-397077280);
                        boolean z15 = z6;
                        y(str, strY0, arrayList2, lee1Var2, j, j2, iraVar2, z15, x340Var, (i4 << 15) & 29360128);
                        z13 = z15;
                        x340Var = x340Var;
                        x340Var.r(z12);
                    } else {
                        z13 = z6;
                        x340Var.i0(-397065744);
                        z(str, strY0, arrayList2, lee1Var2, j, j2, iraVar2, x340Var, 0);
                        x340Var.r(z12);
                    }
                }
                z5 = z13;
            } else {
                x340Var.b0();
                z5 = z3;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new nfi0(lfi0Var, z, z5, i, i2);
            }
        }
        i4 |= 384;
        z3 = z2;
        if ((i4 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (x340Var.Y(i4 & 1, z4)) {
            if (i5 != 0) {
                z6 = false;
            } else {
                z6 = z3;
            }
            str = lfi0Var.c;
            z7 = lfi0Var.o;
            if (str != null) {
                str = null;
            } else {
                str = null;
            }
            if (x340Var.k(t4k.n) == flb0.b) {
                z8 = true;
            } else {
                z8 = false;
            }
            zH = x340Var.h(z8);
            objT = x340Var.T();
            if (zH) {
                if (z8) {
                    iraVar = ira.e;
                } else {
                    iraVar = ira.d;
                }
                objT = iraVar;
                x340Var.s0(objT);
            } else {
                if (z8) {
                    iraVar = ira.e;
                } else {
                    iraVar = ira.d;
                }
                objT = iraVar;
                x340Var.s0(objT);
            }
            objT.getClass();
            iraVar2 = (ira) objT;
            ArrayList arrayListO1 = o7h.o0(p7h.N(lfi0Var.e));
            arrayList = new ArrayList();
            while (r7.hasNext()) {
                if (!ihc1.y0((String) obj)) {
                    arrayList.add(obj);
                }
            }
            strY0 = o7h.y0(arrayList, " • ", (String) null, (String) null, new vfi0(iraVar2, (byte) 1), 30);
            List listI1 = f46.i0(new String[]{a2k1.a((Context) x340Var.k(AndroidCompositionLocals_androidKt.b), lfi0Var.f), lfi0Var.g, lfi0Var.d});
            arrayList2 = new ArrayList();
            while (r8.hasNext()) {
                if (!ihc1.y0((String) obj2)) {
                    arrayList2.add(obj2);
                }
            }
            List listM2 = p7h.M(new String[]{strY0, G(arrayList2, iraVar2)});
            arrayList3 = new ArrayList();
            while (r8.hasNext()) {
                if (((String) obj3).length() > 0) {
                    arrayList3.add(obj3);
                }
            }
            strY1 = o7h.y0(arrayList3, " • ", (String) null, (String) null, (iu30) null, 62);
            x340Var.i0(882492202);
            if (z7) {
                x340Var.i0(-1912227923);
                uwr uwrVar8 = cbx.a;
                mmr0Var = new mmr0(new u7h(cbx.a(x340Var).b.b), new u7h(cbx.a(x340Var).b.b));
                x340Var.r(false);
            } else {
                if (lfi0Var.n) {
                    x340Var.i0(-1912225427);
                    uwr uwrVar9 = cbx.a;
                    mmr0Var = new mmr0(new u7h(cbx.a(x340Var).b.b), new u7h(cbx.a(x340Var).b.b));
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1912222743);
                    x340Var.r(false);
                    uwr uwrVar10 = cbx.a;
                    zsc zscVar2 = zex.a;
                    mmr0Var = new mmr0(new u7h(((vex) zscVar2.e).m), new u7h(((vex) zscVar2.e).m));
                    z9 = false;
                }
                x340Var.r(z9);
                j = ((u7h) mmr0Var.a).a;
                j2 = ((u7h) mmr0Var.b).a;
                if (z) {
                    x340Var.i0(-397091468);
                    uwr uwrVar11 = cbx.a;
                    lee1Var = cbx.d(x340Var).g;
                    z10 = false;
                } else {
                    z10 = false;
                    x340Var.i0(-397090381);
                    uwr uwrVar12 = cbx.a;
                    lee1Var = cbx.d(x340Var).j;
                }
                x340Var.r(z10);
                if (z7) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (str == null) {
                    x340Var.i0(575265061);
                    if (z11) {
                        i3 = 1;
                    } else {
                        i3 = 2;
                    }
                    uwo1.e(strY1, null, lee1Var, j2, null, null, 2, false, new cjc0(i3), 0, null, x340Var, 0, 0, 1714);
                    x340Var = x340Var;
                    x340Var.r(z10);
                    z13 = z6;
                } else {
                    lee1Var2 = lee1Var;
                    z12 = z10;
                    if (z11) {
                        x340Var.i0(-397077280);
                        boolean z16 = z6;
                        y(str, strY0, arrayList2, lee1Var2, j, j2, iraVar2, z16, x340Var, (i4 << 15) & 29360128);
                        z13 = z16;
                        x340Var = x340Var;
                        x340Var.r(z12);
                    } else {
                        z13 = z6;
                        x340Var.i0(-397065744);
                        z(str, strY0, arrayList2, lee1Var2, j, j2, iraVar2, x340Var, 0);
                        x340Var.r(z12);
                    }
                }
                z5 = z13;
            }
            z9 = false;
            x340Var.r(z9);
            j = ((u7h) mmr0Var.a).a;
            j2 = ((u7h) mmr0Var.b).a;
            if (z) {
                x340Var.i0(-397091468);
                uwr uwrVar13 = cbx.a;
                lee1Var = cbx.d(x340Var).g;
                z10 = false;
            } else {
                z10 = false;
                x340Var.i0(-397090381);
                uwr uwrVar14 = cbx.a;
                lee1Var = cbx.d(x340Var).j;
            }
            x340Var.r(z10);
            if (z7) {
                z11 = true;
            } else {
                z11 = true;
            }
            if (str == null) {
                x340Var.i0(575265061);
                if (z11) {
                    i3 = 1;
                } else {
                    i3 = 2;
                }
                uwo1.e(strY1, null, lee1Var, j2, null, null, 2, false, new cjc0(i3), 0, null, x340Var, 0, 0, 1714);
                x340Var = x340Var;
                x340Var.r(z10);
                z13 = z6;
            } else {
                lee1Var2 = lee1Var;
                z12 = z10;
                if (z11) {
                    x340Var.i0(-397077280);
                    boolean z17 = z6;
                    y(str, strY0, arrayList2, lee1Var2, j, j2, iraVar2, z17, x340Var, (i4 << 15) & 29360128);
                    z13 = z17;
                    x340Var = x340Var;
                    x340Var.r(z12);
                } else {
                    z13 = z6;
                    x340Var.i0(-397065744);
                    z(str, strY0, arrayList2, lee1Var2, j, j2, iraVar2, x340Var, 0);
                    x340Var.r(z12);
                }
            }
            z5 = z13;
        } else {
            x340Var.b0();
            z5 = z3;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nfi0(lfi0Var, z, z5, i, i2);
        }
    }

    public static final void r(lfi0 lfi0Var, boolean z, b0k b0kVar, int i) {
        b0k b0kVar2;
        long jS;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-2039976081);
        int i2 = (b0kVar3.i(lfi0Var) ? 4 : 2) | i | (b0kVar3.h(z) ? 32 : 16);
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            lee1 lee1VarA = lee1.a(cbx.d(b0kVar3).k, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 3, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16711679);
            ye5 ye5Var = new ye5();
            if (lfi0Var.j != k4m.d) {
                z6p1.r(ye5Var, "contentRestriction", "�");
            }
            ye5Var.g(lfi0Var.b);
            af5 af5VarP = ye5Var.p();
            b0kVar3.i0(-1911907854);
            wat watVar = (wat) b0kVar3.k(t4k.h);
            if (z) {
                b0kVar3.i0(-545706006);
                zov0 zov0Var = cbx.b(b0kVar3).g;
                jS = watVar.s(16.0f);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-545655383);
                zov0 zov0Var2 = cbx.b(b0kVar3).g;
                jS = watVar.s(12.0f);
                b0kVar3.r(false);
            }
            float f = ((Configuration) b0kVar3.k(AndroidCompositionLocals_androidKt.a)).fontScale;
            fc11.o(jS);
            long jY = fc11.Y(TextUnit.c(jS) * f, 1095216660480L & jS);
            b0kVar3.r(false);
            Map mapSingletonMap = Collections.singletonMap("contentRestriction", new gh80(new d6t0(7, fc11.Y(TextUnit.c(jY) + 4.0f, 4294967296L), jY), apo.r(-1511320233, new zw2((Object) lfi0Var, z, (byte) 17), b0kVar3)));
            Object objT = b0kVar3.T();
            if (objT == fkj0.X) {
                objT = nei0.e1;
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            uwo1.d(af5VarP, cbx.a(b0kVar3).b.a, s161.b(nim0.a, false, (iu30) objT), lee1VarA, null, null, 2, false, new cjc0((lfi0Var.o || !lfi0Var.l || z) ? 2 : 3), 0, null, mqo1.B(mapSingletonMap), b0kVar2, 0, 0, 1712);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new mfi0(lfi0Var, z, i, (byte) 2);
        }
    }

    public static final void s(lfi0 lfi0Var, boolean z, boolean z2, qim0 qim0Var, Function0 function0, Function0 function1, vu30 vu30Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1868544117);
        int i2 = i | (x340Var.i(lfi0Var) ? 4 : 2) | (x340Var.h(z2) ? 256 : 128) | 3072 | (x340Var.i(function0) ? 16384 : 8192) | (x340Var.i(function1) ? 131072 : 65536) | (x340Var.i(vu30Var) ? 1048576 : 524288);
        if (x340Var.Y(i2 & 1, (599171 & i2) != 599170)) {
            nyx.a(2, (wux) null, apo.r(297767454, new ofi0(vu30Var, function0, function1, lfi0Var, z2), x340Var), x340Var, 3078, 6);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vl(lfi0Var, z, z2, qim0Var2, function0, function1, vu30Var, i);
        }
    }

    public static final void t(yxa0 yxa0Var, iu30 iu30Var, b0k b0kVar, int i) {
        iu30 iu30Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-817488014);
        int i2 = (x340Var.i(yxa0Var) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131963587);
            String strO1 = cwl1.o0(x340Var, 2131963581);
            c9 c9VarS = mqo1.s(new mae1(strO0, "https://support.spotify.com/article/managed-accounts/plain/"));
            uwr uwrVar = cbx.a;
            iu30Var2 = iu30Var;
            i8p1.i(strO1, c9VarS, iu30Var2, null, cbx.d(x340Var).m, 0L, f0o1.q(yxa0Var, x340Var), x340Var, (i2 << 3) & 896, 40);
        } else {
            iu30Var2 = iu30Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xaf1(yxa0Var, iu30Var2, i, (byte) 27);
        }
    }

    public static final void u(boolean z, yxa0 yxa0Var, String str, Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1870287258);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.i(yxa0Var) ? 32 : 16) | (x340Var.g(str) ? 256 : 128) | (x340Var.i(function0) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            fra fraVar = een.N0;
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, cbx.b(x340Var).b.c, 0.0f, cbx.b(x340Var).b.a, 5);
            jw31 jw31VarA = ew31.a(h36.e, fraVar, x340Var, 0);
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
            s110.d(yxa0Var, apo.r(-573271932, new c980((byte) 3, str, function0, z), x340Var), x340Var, ((i2 >> 3) & 14) | 48);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zp51(z, yxa0Var, str, function0, i);
        }
    }

    public static final void v(float f, int i, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1729129116);
        int i2 = (x340Var.d(f) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            mod.b(t4k.n.a(flb0.a), apo.r(-268562980, new n5h((byte) 7, f), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n5h((byte) 8, f, i);
        }
    }

    public static final void w(c4f c4fVar, boolean z, Function0 function0, Function0 function1, String str, String str2, b0k b0kVar, int i) {
        int i2;
        String str3;
        String str4;
        int i3;
        int i4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1837511230);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(c4fVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.h(false) ? 16384 : 8192;
        }
        int i5 = 196608 & i;
        nim0 nim0Var = nim0.a;
        if (i5 == 0) {
            i2 |= x340Var.i(nim0Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            str3 = str;
            i2 |= x340Var.g(str3) ? 1048576 : 524288;
        } else {
            str3 = str;
        }
        if ((12582912 & i) == 0) {
            str4 = str2;
            i2 |= x340Var.g(str4) ? 8388608 : 4194304;
        } else {
            str4 = str2;
        }
        int i6 = i2;
        if (x340Var.Y(i6 & 1, (4793491 & i6) != 4793490)) {
            String strO0 = cwl1.o0(x340Var, 2131953719);
            if (c4fVar.b == 2) {
                i3 = -1938390643;
                i4 = 2131953720;
            } else {
                i3 = -1938302417;
                i4 = 2131953718;
            }
            f(((i6 >> 15) & 14) | 48, apo.r(730584156, new q3(strO0, x0d.k(x340Var, i3, i4, x340Var, false), str3, str4, c4fVar, cwl1.o0(x340Var, 2131953711), function1, function0, z), x340Var), x340Var, nim0Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new si2(c4fVar, z, function0, function1, str, str2, i);
        }
    }

    public static final void x(fim0 fim0Var, String str, hfi0 hfi0Var, b0k b0kVar, int i) {
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1407074182);
        int i2 = i | (x340Var2.i(fim0Var) ? 4 : 2) | (x340Var2.g(str) ? 32 : 16) | (x340Var2.i(hfi0Var) ? 256 : 128);
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var2.d0();
            if ((i & 1) != 0 && !x340Var2.E()) {
                x340Var2.b0();
            }
            x340Var2.s();
            x340Var2.i0(734140711);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarQ = i1p1.q(u291.r(nim0Var, 40.0f), (cr31) fim0Var.b.b);
            if (hfi0Var instanceof efi0) {
                qim0VarQ = bin.x(qim0VarQ, false, str, null, null, ((efi0) hfi0Var).a, 13);
            } else if (hfi0Var instanceof gfi0) {
                qim0VarQ = f8d1.b(s161.a(qim0VarQ, pfi0.c), rih1.a, mia.f23p);
            } else if (!(hfi0Var instanceof ffi0)) {
                eg.o();
                return;
            }
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarQ);
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
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            eso1.e(Uri.parse(fim0Var.a), isl.a, h2c.a.b(nim0Var), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var2, 48, 0, 4088);
            x340Var = x340Var2;
            x340Var.r(true);
            x340Var.r(false);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rvg0(fim0Var, str, hfi0Var, i, (byte) 16);
        }
    }

    public static final void y(String str, String str2, ArrayList arrayList, lee1 lee1Var, long j, long j2, ira iraVar, boolean z, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        boolean z2;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1227495818);
        if ((i & 6) == 0) {
            i2 = (x340Var2.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.g(arrayList) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.i(lee1Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var2.f(j) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var2.f(j2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var2.i(iraVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= x340Var2.h(z) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if (x340Var2.Y(i3 & 1, (i3 & 4793491) != 4793490)) {
            String strG = G(arrayList, iraVar);
            boolean z3 = str2.length() > 0;
            boolean z4 = strG.length() > 0;
            yae1 yae1VarQ = d5p1.q(0, x340Var2, 1);
            String str3 = (String) o7h.s0(arrayList);
            String strConcat = str3 != null ? " • ".concat(F(str3, iraVar)) : null;
            boolean zG = x340Var2.g(strConcat) | x340Var2.i(yae1VarQ) | x340Var2.i(lee1Var) | ((i3 & 29360128) == 8388608);
            Object objT = x340Var2.T();
            if (zG || objT == fkj0.X) {
                objT = new qfi0(strConcat, yae1VarQ, lee1Var, z);
                x340Var2.s0(objT);
            }
            gfh0 gfh0Var = (gfh0) objT;
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var2, nim0Var);
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
            nko1.H(gfh0Var, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            int i4 = i3 >> 3;
            int i5 = i4 & 896;
            uwo1.e(F(str, iraVar), t3k1.x(nim0Var, "creator"), lee1Var, j, null, null, 2, false, new cjc0(1), 0, null, x340Var2, i4 & 8064, 0, 1712);
            x340Var = x340Var2;
            if (z3) {
                x340Var.i0(883374267);
                uwo1.e(" • ".concat(str2), t3k1.x(nim0Var, "date"), lee1Var, j2, null, null, 0, false, new cjc0(1), 0, null, x340Var, i5 | ((i3 >> 6) & 7168), 0, 1776);
                z2 = false;
                x340Var.r(false);
            } else {
                z2 = false;
                x340Var.i0(883591701);
                x340Var.r(false);
            }
            if (z4) {
                x340Var = x340Var;
                x340Var.i0(883632528);
                x340 x340Var3 = x340Var;
                uwo1.e(" • ".concat(strG), t3k1.x(nim0Var, "postfix"), lee1Var, j2, null, null, 2, false, new cjc0(1), 0, null, x340Var3, i5 | ((i3 >> 6) & 7168), 0, 1712);
                x340Var = x340Var3;
                x340Var.r(z2);
            } else {
                x340Var = x340Var;
                x340Var.i0(883891285);
                x340Var.r(z2);
            }
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rfi0(str, str2, arrayList, lee1Var, j, j2, iraVar, z, i);
        }
    }

    public static final void z(String str, String str2, ArrayList arrayList, lee1 lee1Var, long j, long j2, ira iraVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-48770326);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.g(arrayList) ? 256 : 128) | (x340Var.i(lee1Var) ? 2048 : 1024) | (x340Var.f(j) ? 16384 : 8192) | (x340Var.f(j2) ? 131072 : 65536) | (x340Var.i(iraVar) ? 1048576 : 524288);
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            w2g0.c((qim0) null, (tl3) null, apo.r(1468399700, new sfi0(str, str2, arrayList, j, j2, iraVar, d5p1.q(0, x340Var, 1), lee1Var), x340Var), x340Var, 3072, 7);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tfi0(str, str2, arrayList, lee1Var, j, j2, iraVar, i);
        }
    }
}
