package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.icu.text.CompactDecimalFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.core.graphics.drawable.IconCompat;
import com.facebook.FacebookException;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.concertcampaignview.v1.CtaType;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class xzo1 {
    public static b180 a;
    public static b180 b;

    public static final void a(int i, String str, Function0 function0, b0k b0kVar) {
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1448188669);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            function1 = function0;
            yzo1.e(cwl1.n0(2131956486, new Object[]{str}, x340Var), function1, null, apo.r(-1090779504, new y5d0(str, (byte) 3), x340Var), x340Var, (i2 & 112) | 3072);
        } else {
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ql(str, function1, i, (byte) 15);
        }
    }

    public static final void b(int i, int i2, int i3, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        Object vcgVar;
        int i4;
        int i5;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(430287509);
        int i6 = i3 | (x340Var.e(i) ? 4 : 2) | (x340Var.e(i2) ? 32 : 16) | 384;
        if (x340Var.Y(i6 & 1, (i6 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            long jC = cbx.a(x340Var).a.a.c();
            long j = cbx.a(x340Var).b.c;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarR = u291.r(qim0Var3, 48.0f);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarR);
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
            qim0 qim0VarB = h2c.a.b(qim0Var3);
            boolean zF = ((i6 & 14) == 4) | x340Var.f(jC) | ((i6 & 112) == 32) | x340Var.f(j);
            Object objT = x340Var.T();
            if (zF || objT == fkj0.X) {
                vcgVar = new vcg(jC, j, i2, i);
                i4 = i2;
                i5 = i;
                x340Var.s0(vcgVar);
            } else {
                vcgVar = objT;
                i5 = i;
                i4 = i2;
            }
            j0o1.b(0, x340Var, (iu30) vcgVar, qim0VarB);
            StringBuilder sb = new StringBuilder();
            sb.append(i5);
            uwo1.e(gvg.l(sb, "/", i4), anm1.N("PROGRESS_LABEL", qim0Var3), cbx.d(x340Var).m, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 48, 0, 2032);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new f0e((byte) 1, i, i2, i3, qim0Var2);
        }
    }

    public static final void c(String str, gbx gbxVar, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(595392960);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(gbxVar) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            foo1.c(gbxVar, ldx.c, qim0Var, null, yla.s(x340Var), null, null, null, loi.a, null, apo.r(-292961119, new ps00(str, (byte) 7), x340Var), x340Var, ((i2 >> 3) & 14) | 805306368 | (i2 & 896), 48, 1496);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l720(str, gbxVar, qim0Var, i, (byte) 0);
        }
    }

    public static final void d(String str, gbx gbxVar, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1087978316);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(gbxVar) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF);
            cua cuaVar = cbx.b(x340Var).f;
            cr31 cr31VarB = er31.b(6.0f);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = wo10.Z;
                x340Var.s0(objT);
            }
            hdx hdxVar = new hdx(0, (vu30) null, (vu30) objT, (vu30) null, cr31VarB, 11);
            gdx gdxVarS = yla.s(x340Var);
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            foo1.c(gbxVar, hdxVar, qim0VarZ, null, gdxVarS, new zzq0(6.0f, 12.0f, 6.0f, 12.0f), null, null, loi.b, loi.c, apo.r(-493557651, new ps00(str, (byte) 8), x340Var), x340Var, ((i2 >> 3) & 14) | 805306368, 54, 408);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l720(str, gbxVar, qim0Var, i, (byte) 1);
        }
    }

    public static final void e(String str, wad0 wad0Var, Function0 function0, b0k b0kVar, int i) {
        String strN0;
        String strN1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(365459361);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(wad0Var) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            if (wad0Var != null) {
                x340Var.i0(-342112963);
                strN0 = cwl1.n0(2131956487, new Object[]{str, wad0Var.a}, x340Var);
                x340Var.r(false);
            } else {
                x340Var.i0(-341948632);
                x340Var.r(false);
                strN0 = str;
            }
            if (wad0Var != null) {
                x340Var.i0(-341869861);
                strN1 = cwl1.n0(2131956488, new Object[]{str, wad0Var.b}, x340Var);
                x340Var.r(false);
            } else {
                x340Var.i0(-341668113);
                strN1 = cwl1.n0(2131956489, new Object[]{str}, x340Var);
                x340Var.r(false);
            }
            yzo1.e(strN1, function0, null, apo.r(-2107829330, new y5d0(strN0, (byte) 4), x340Var), x340Var, ((i2 >> 3) & 112) | 3072);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mb90(str, wad0Var, function0, i, (byte) 25);
        }
    }

    public static final void f(int i, int i2, Function0 function0, b0k b0kVar) {
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1133577441);
        int i3 = (x340Var.e(i) ? 4 : 2) | i2 | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            function1 = function0;
            yzo1.e(cwl1.U(2131820695, i, new Object[]{Integer.valueOf(i)}, x340Var), function1, null, apo.r(135753836, new vx1(i, (byte) 23), x340Var), x340Var, (i3 & 112) | 3072);
        } else {
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wk1(i, function1, i2, (byte) 17);
        }
    }

    public static final void g(Function0 function0, b0k b0kVar, int i) {
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1962356692);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            function1 = function0;
            yzo1.e(cwl1.o0(x340Var, 2131956484), function1, null, uvi.b, x340Var, ((i2 << 3) & 112) | 3072);
        } else {
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vgz(function1, i, (byte) 28);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0089  */
    /* JADX WARN: Code duplicated, block: B:46:0x0094  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    public static final void h(String str, mmr0 mmr0Var, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        boolean z;
        b0k b0kVar2;
        qim0 qim0Var3;
        h311 h311VarV;
        qim0 qim0Var4;
        Object objT;
        m4c m4cVar;
        ven0 ven0Var;
        boolean zI;
        Object objT2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(425373743);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar3.g(mmr0Var) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                qim0Var2 = qim0Var;
                i3 |= b0kVar3.i(qim0Var2) ? 256 : 128;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i3 & 1, z)) {
                if (i4 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                objT = b0kVar3.T();
                m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = v8r.q(mmr0Var);
                    b0kVar3.s0(objT);
                }
                ven0Var = (ven0) objT;
                qim0 qim0VarF = u291.f(qim0Var4, 1.0f);
                Uri uri = Uri.parse(str);
                zI = b0kVar3.i(ven0Var) | ((i3 & 112) == 32);
                objT2 = b0kVar3.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new qtr0(ven0Var, mmr0Var, (byte) 2);
                    b0kVar3.s0(objT2);
                }
                b0kVar2 = b0kVar3;
                eso1.h(oi7.a(uri, (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) objT2, (iu30) null, (iu30) null, 0L, b0kVar2, 0, 0, 126974), isl.a, qim0VarF, (p3v) null, (zvx) null, new ecx(((Number) ((mmr0) ven0Var.getValue()).a).floatValue(), ((Number) ((mmr0) ven0Var.getValue()).b).floatValue()), mif1.S0, (tl3) null, (ColorFilter) null, b0kVar2, 3120, CtaType.CTA_CANT_ATTEND_FIELD_NUMBER);
                qim0Var3 = qim0Var4;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var3 = qim0Var2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new qx1((byte) 25, i, i2, (Object) str, (Object) mmr0Var, qim0Var3);
            }
        }
        i3 |= 384;
        qim0Var2 = qim0Var;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i3 & 1, z)) {
            if (i4 != 0) {
                qim0Var4 = nim0.a;
            } else {
                qim0Var4 = qim0Var2;
            }
            objT = b0kVar3.T();
            m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(mmr0Var);
                b0kVar3.s0(objT);
            }
            ven0Var = (ven0) objT;
            qim0 qim0VarF2 = u291.f(qim0Var4, 1.0f);
            Uri uri2 = Uri.parse(str);
            zI = b0kVar3.i(ven0Var) | ((i3 & 112) == 32);
            objT2 = b0kVar3.T();
            if (zI) {
                objT2 = new qtr0(ven0Var, mmr0Var, (byte) 2);
                b0kVar3.s0(objT2);
            } else {
                objT2 = new qtr0(ven0Var, mmr0Var, (byte) 2);
                b0kVar3.s0(objT2);
            }
            b0kVar2 = b0kVar3;
            eso1.h(oi7.a(uri2, (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) objT2, (iu30) null, (iu30) null, 0L, b0kVar2, 0, 0, 126974), isl.a, qim0VarF2, (p3v) null, (zvx) null, new ecx(((Number) ((mmr0) ven0Var.getValue()).a).floatValue(), ((Number) ((mmr0) ven0Var.getValue()).b).floatValue()), mif1.S0, (tl3) null, (ColorFilter) null, b0kVar2, 3120, CtaType.CTA_CANT_ATTEND_FIELD_NUMBER);
            qim0Var3 = qim0Var4;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var3 = qim0Var2;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new qx1((byte) 25, i, i2, (Object) str, (Object) mmr0Var, qim0Var3);
        }
    }

    public static kp5 i(Context context, af4 af4Var, mbo0 mbo0Var, feo0 feo0Var) {
        mbo0Var.getClass();
        return new kp5(context, af4Var, mbo0Var, feo0Var);
    }

    public static IconCompat j(Icon icon) {
        icon.getClass();
        int iO = o(icon);
        if (iO == 2) {
            return IconCompat.g((Resources) null, m(icon), l(icon));
        }
        if (iO == 4) {
            return IconCompat.e(p(icon));
        }
        if (iO != 6) {
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.b = icon;
            return iconCompat;
        }
        Uri uriP = p(icon);
        PorterDuff.Mode mode = IconCompat.k;
        uriP.getClass();
        String string = uriP.toString();
        string.getClass();
        IconCompat iconCompat2 = new IconCompat(6);
        iconCompat2.b = string;
        return iconCompat2;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0121  */
    /* JADX WARN: Code duplicated, block: B:63:0x0197  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:69:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:70:0x01db  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:79:0x0236  */
    /* JADX WARN: Code duplicated, block: B:81:0x0254  */
    /* JADX WARN: Code duplicated, block: B:84:0x025a  */
    /* JADX WARN: Code duplicated, block: B:88:0x027e A[LOOP:0: B:86:0x0278->B:88:0x027e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:91:0x0295  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final c9 k(jmb1 jmb1Var, String str, yqg yqgVar, b0k b0kVar) {
        x340 x340Var;
        String strK;
        String str2;
        String str3;
        Object obj;
        String strN0;
        String strK2;
        String eoj0Var;
        String strK3;
        String strC;
        boolean zG;
        Object objT;
        ArrayList arrayListH;
        ArrayList arrayList;
        Iterator it;
        ArrayList arrayList2;
        int i;
        int i2;
        m4c m4cVar = fkj0.X;
        Double d = jmb1Var.p;
        bv11 bv11Var = jmb1Var.b;
        o5a1 o5a1Var = bv11Var.q;
        String str4 = bv11Var.n;
        c380 c380Var = bv11Var.k;
        vno1 vno1Var = bv11Var.j;
        if (o5a1Var == null) {
            x340Var = (x340) b0kVar;
            x340Var.i0(1952392873);
        } else {
            x340Var = (x340) b0kVar;
            x340Var.i0(1952392874);
            x340Var.i0(1873153272);
            x340Var.r(false);
        }
        x340Var.r(false);
        u380<lyl> u380VarC = mqo1.C(bv11Var.e);
        kyl kylVar = kyl.a;
        if (u380VarC.contains(kylVar)) {
            x340 x340Var2 = (x340) b0kVar;
            strK = x0d.k(x340Var2, 1891898721, 2131963767, x340Var2, false);
        } else {
            x340 x340Var3 = (x340) b0kVar;
            x340Var3.i0(-1480637152);
            x340Var3.r(false);
            strK = null;
        }
        x340 x340Var4 = (x340) b0kVar;
        boolean zG2 = x340Var4.g(u380VarC) | x340Var4.g(strK);
        Object objT2 = x340Var4.T();
        if (zG2 || objT2 == m4cVar) {
            ArrayList arrayList3 = new ArrayList();
            for (lyl lylVar : u380VarC) {
                if (u890.j(lylVar, jyl.a) || u890.j(lylVar, jyl.b)) {
                    str3 = null;
                } else {
                    if (!u890.j(lylVar, kylVar)) {
                        eg.o();
                        return null;
                    }
                    str3 = strK;
                }
                if (str3 != null) {
                    arrayList3.add(str3);
                }
            }
            str2 = null;
            x340Var4.s0(arrayList3);
            obj = arrayList3;
        } else {
            str2 = null;
            obj = objT2;
        }
        List list = (List) obj;
        if (str != null) {
            String str5 = jmb1Var.a.a;
            Set set = s4b1.f;
            if (uic.g(str5, blc0.M3)) {
                x340Var4.i0(1952606154);
                x340Var4.i0(-1393289559);
                if (str.equals(cwl1.o0(x340Var4, 2131961040))) {
                    i = -1393287068;
                    i2 = 2131961044;
                } else {
                    if (str.equals(cwl1.o0(x340Var4, 2131961041))) {
                        i = -1393283448;
                        i2 = 2131961045;
                    } else {
                        x340Var4.i0(-1393281255);
                        strN0 = cwl1.n0(2131961043, new Object[]{str}, x340Var4);
                        x340Var4.r(false);
                    }
                    x340Var4.r(false);
                    x340Var4.r(false);
                }
                strN0 = x0d.k(x340Var4, i, i2, x340Var4, false);
                x340Var4.r(false);
                x340Var4.r(false);
            } else {
                x340Var4.i0(1952677051);
                x340Var4.r(false);
                strN0 = str2;
            }
        } else {
            x340Var4.i0(1952677051);
            x340Var4.r(false);
            strN0 = str2;
        }
        o5a1 o5a1Var2 = bv11Var.q;
        d2k1 d2k1VarJ = e6p1.j(o5a1Var2 != null ? o5a1Var2.a : str2, bv11Var.c, yqgVar.b());
        CompactDecimalFormat compactDecimalFormat = a2k1.a;
        x340Var4.i0(195396905);
        boolean z = d2k1VarJ instanceof c2k1;
        b2k1 b2k1Var = b2k1.a;
        if (z) {
            x340Var4.i0(1388678890);
            String strC2 = a2k1.c(a2k1.b, (c2k1) d2k1VarJ);
            if (strC2 == null) {
                x340Var4.r(false);
                x340Var4.r(false);
                strK2 = str2;
            } else {
                strK2 = cwl1.n0(2131962683, new Object[]{strC2}, x340Var4);
                x340Var4.r(false);
            }
            if (strK2 == null) {
                x340Var4.i0(388003686);
                x340Var4.r(false);
                eoj0Var = str2;
            } else {
                x340Var4.i0(388003687);
                x340Var4.i0(-451690716);
                if (z) {
                    x340Var4.i0(-185392855);
                    strC = a2k1.c(a2k1.a, (c2k1) d2k1VarJ);
                    if (strC == null) {
                        x340Var4.r(false);
                        x340Var4.r(false);
                        strK3 = str2;
                    } else {
                        strK3 = cwl1.n0(2131962684, new Object[]{strC}, x340Var4);
                        x340Var4.r(false);
                    }
                    eoj0Var = new eoj0(strK2, strK3);
                    x340Var4.r(false);
                } else if (u890.j(d2k1VarJ, b2k1Var)) {
                    strK3 = x0d.k(x340Var4, -283067813, 2131962682, x340Var4, false);
                } else {
                    x340Var4.i0(-185101735);
                    x340Var4.r(false);
                    strK3 = str2;
                }
                x340Var4.r(false);
                eoj0Var = new eoj0(strK2, strK3);
                x340Var4.r(false);
            }
            zG = x340Var4.g(str) | x340Var4.g(str2) | x340Var4.g(list) | x340Var4.g(strN0) | x340Var4.g(eoj0Var) | x340Var4.g(vno1Var) | x340Var4.g(c380Var) | x340Var4.g(str4) | x340Var4.g(d);
            objT = x340Var4.T();
            if (zG || objT == m4cVar) {
                arrayListH = ydh.h((Object) null);
                arrayListH.add(yzo1.n(vno1Var));
                arrayListH.add(yzo1.m(c380Var));
                arrayListH.addAll(list);
                arrayListH.add(str4);
                if (strN0 == null) {
                    strN0 = str;
                }
                arrayListH.add(strN0);
                if (d != null) {
                    arrayListH.add(wm5.y(d.doubleValue()));
                }
                ArrayList arrayListO0 = o7h.o0(arrayListH);
                arrayList = new ArrayList(q7h.U(arrayListO0, 10));
                it = arrayListO0.iterator();
                while (it.hasNext()) {
                    arrayList.add(new eoj0((String) it.next(), (String) null));
                }
                arrayList2 = new ArrayList(arrayList);
                if (eoj0Var != null) {
                    arrayList2.add(0, eoj0Var);
                }
                objT = mqo1.F(arrayList2);
                x340Var4.s0(objT);
            }
            return (c9) objT;
        }
        if (u890.j(d2k1VarJ, b2k1Var)) {
            strK2 = x0d.k(x340Var4, -1202123808, 2131962682, x340Var4, false);
        } else {
            x340Var4.i0(1388933492);
            x340Var4.r(false);
            strK2 = str2;
        }
        x340Var4.r(false);
        if (strK2 == null) {
            x340Var4.i0(388003686);
            x340Var4.r(false);
            eoj0Var = str2;
        } else {
            x340Var4.i0(388003687);
            x340Var4.i0(-451690716);
            if (z) {
                x340Var4.i0(-185392855);
                strC = a2k1.c(a2k1.a, (c2k1) d2k1VarJ);
                if (strC == null) {
                    x340Var4.r(false);
                    x340Var4.r(false);
                    strK3 = str2;
                } else {
                    strK3 = cwl1.n0(2131962684, new Object[]{strC}, x340Var4);
                    x340Var4.r(false);
                }
                eoj0Var = new eoj0(strK2, strK3);
                x340Var4.r(false);
            } else if (u890.j(d2k1VarJ, b2k1Var)) {
                strK3 = x0d.k(x340Var4, -283067813, 2131962682, x340Var4, false);
            } else {
                x340Var4.i0(-185101735);
                x340Var4.r(false);
                strK3 = str2;
            }
            x340Var4.r(false);
            eoj0Var = new eoj0(strK2, strK3);
            x340Var4.r(false);
        }
        zG = x340Var4.g(str) | x340Var4.g(str2) | x340Var4.g(list) | x340Var4.g(strN0) | x340Var4.g(eoj0Var) | x340Var4.g(vno1Var) | x340Var4.g(c380Var) | x340Var4.g(str4) | x340Var4.g(d);
        objT = x340Var4.T();
        if (zG) {
            arrayListH = ydh.h((Object) null);
            arrayListH.add(yzo1.n(vno1Var));
            arrayListH.add(yzo1.m(c380Var));
            arrayListH.addAll(list);
            arrayListH.add(str4);
            if (strN0 == null) {
                strN0 = str;
            }
            arrayListH.add(strN0);
            if (d != null) {
                arrayListH.add(wm5.y(d.doubleValue()));
            }
            ArrayList arrayListO1 = o7h.o0(arrayListH);
            arrayList = new ArrayList(q7h.U(arrayListO1, 10));
            it = arrayListO1.iterator();
            while (it.hasNext()) {
                arrayList.add(new eoj0((String) it.next(), (String) null));
            }
            arrayList2 = new ArrayList(arrayList);
            if (eoj0Var != null) {
                arrayList2.add(0, eoj0Var);
            }
            objT = mqo1.F(arrayList2);
            x340Var4.s0(objT);
        } else {
            arrayListH = ydh.h((Object) null);
            arrayListH.add(yzo1.n(vno1Var));
            arrayListH.add(yzo1.m(c380Var));
            arrayListH.addAll(list);
            arrayListH.add(str4);
            if (strN0 == null) {
                strN0 = str;
            }
            arrayListH.add(strN0);
            if (d != null) {
                arrayListH.add(wm5.y(d.doubleValue()));
            }
            ArrayList arrayListO2 = o7h.o0(arrayListH);
            arrayList = new ArrayList(q7h.U(arrayListO2, 10));
            it = arrayListO2.iterator();
            while (it.hasNext()) {
                arrayList.add(new eoj0((String) it.next(), (String) null));
            }
            arrayList2 = new ArrayList(arrayList);
            if (eoj0Var != null) {
                arrayList2.add(0, eoj0Var);
            }
            objT = mqo1.F(arrayList2);
            x340Var4.s0(objT);
        }
        return (c9) objT;
    }

    public static int l(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return ph5.u(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return 0;
        }
    }

    public static String m(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return ph5.v(obj);
        }
        try {
            return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public static final TextView n(dhd1 dhd1Var) {
        return (TextView) z561.W(z561.T(j141.X, new i46(dhd1Var.e, (byte) 8)));
    }

    public static int o(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return ph5.C(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException unused) {
            Objects.toString(obj);
            return -1;
        } catch (NoSuchMethodException unused2) {
            Objects.toString(obj);
            return -1;
        } catch (InvocationTargetException unused3) {
            Objects.toString(obj);
            return -1;
        }
    }

    public static Uri p(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return ph5.D(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.facebook.FacebookException */
    public static final md50 q(xd xdVar, Uri uri, xhl1 xhl1Var) throws FacebookException {
        String path = uri.getPath();
        boolean zEqualsIgnoreCase = "file".equalsIgnoreCase(uri.getScheme());
        a370 a370Var = a370.b;
        if (zEqualsIgnoreCase && path != null) {
            Parcelable kd50Var = new kd50(ParcelFileDescriptor.open(new File(path), 268435456));
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("file", kd50Var);
            return new md50(xdVar, "me/staging_resources", bundle, a370Var, xhl1Var, 32);
        }
        if (!"content".equalsIgnoreCase(uri.getScheme())) {
            throw new FacebookException("The image Uri must be either a file:// or content:// Uri");
        }
        Parcelable kd50Var2 = new kd50(uri);
        Bundle bundle2 = new Bundle(1);
        bundle2.putParcelable("file", kd50Var2);
        return new md50(xdVar, "me/staging_resources", bundle2, a370Var, xhl1Var, 32);
    }

    public static final String r(String str, String str2) {
        String strH0 = ihc1.H0(str, "spotify:container:");
        if (strH0.length() <= 0 || strH0.equals(str) || ihc1.i0(strH0, ':')) {
            hhg1.n("Expected a spotify:container:<id> container URI");
            return null;
        }
        String strH1 = ihc1.H0(str2, "spotify:album:");
        if (strH1.length() <= 0 || strH1.equals(str2) || ihc1.i0(strH1, ':')) {
            hhg1.n("Expected a spotify:album:<id> album URI");
            return null;
        }
        Set set = s4b1.f;
        String strZ = uic.v("classical-recordings", "container_" + strH0 + ":album_" + strH1).z();
        if (strZ != null) {
            return strZ;
        }
        eg.m("Required value was null.");
        return null;
    }

    public static final void s(dhd1 dhd1Var) {
        ghd1 ghd1Var = dhd1Var.e;
        aiq0.a(ghd1Var, new jyh0(ghd1Var, dhd1Var, (byte) 25));
        TextView textViewN = n(dhd1Var);
        if (textViewN == null) {
            return;
        }
        int dimensionPixelSize = dhd1Var.e.getResources().getDimensionPixelSize(2131165618);
        CharSequence charSequence = dhd1Var.a;
        String string = charSequence != null ? charSequence.toString() : null;
        if (string == null) {
            string = "";
        }
        TextView textView = new TextView(dhd1Var.e.getContext());
        textView.setTextAppearance(2132018004);
        textViewN.setMinimumWidth(Math.max(dimensionPixelSize, textViewN.getPaddingEnd() + textViewN.getPaddingStart() + ((int) Math.ceil(textView.getPaint().measureText(string)))));
    }

    public static final boolean t(v75 v75Var, Exception exc) {
        int i;
        if (v75Var.a()) {
            return (exc instanceof HttpException) && 502 <= (i = ((HttpException) exc).a) && i < 505;
        }
        return true;
    }

    public static final vby u(niy niyVar) {
        h1v k1vVar;
        if (niyVar instanceof diy) {
            return nby.a;
        }
        if (niyVar instanceof eiy) {
            return oby.a;
        }
        if (niyVar instanceof fiy) {
            return new pby(((fiy) niyVar).a);
        }
        if (niyVar instanceof iiy) {
            hiy hiyVar = ((iiy) niyVar).a;
            if (hiyVar.equals(zp8.a1)) {
                k1vVar = h1v.a;
            } else if (hiyVar.equals(m9h.e1)) {
                k1vVar = n1v.a;
            } else if (hiyVar instanceof giy) {
                k1vVar = new k1v(((giy) hiyVar).a);
            } else if (hiyVar.equals(rbc.c1)) {
                k1vVar = i1v.a;
            } else if (hiyVar.equals(uwg.d1)) {
                k1vVar = l1v.a;
            } else {
                if (!hiyVar.equals(vgp1.a1)) {
                    eg.o();
                    return null;
                }
                k1vVar = f1v.a;
            }
            return new qby(k1vVar);
        }
        if (niyVar instanceof jiy) {
            return rby.a;
        }
        if (!(niyVar instanceof kiy)) {
            if (niyVar instanceof liy) {
                return new tby(((liy) niyVar).a);
            }
            if (niyVar instanceof miy) {
                return uby.a;
            }
            eg.o();
            return null;
        }
        int iC = l1d.C(((kiy) niyVar).a);
        int i = 1;
        if (iC != 0) {
            if (iC != 1) {
                i = 3;
                if (iC != 2) {
                    if (iC != 3) {
                        eg.o();
                        return null;
                    }
                    i = 4;
                }
            } else {
                i = 2;
            }
        }
        return new sby(i);
    }

    public static Icon v(IconCompat iconCompat, Context context) {
        Icon iconCreateWithBitmap;
        switch (iconCompat.a) {
            case SplitInstallErrorCode.ACTIVE_SESSIONS_LIMIT_EXCEEDED /* -1 */:
                return (Icon) iconCompat.b;
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
            default:
                hhg1.n("Unknown type");
                return null;
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.b);
                break;
            case 2:
                iconCreateWithBitmap = Icon.createWithResource(iconCompat.i(), iconCompat.e);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.b, iconCompat.e, iconCompat.f);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.b);
                break;
            case 5:
                int i = Build.VERSION.SDK_INT;
                Object obj = iconCompat.b;
                iconCreateWithBitmap = i < 26 ? Icon.createWithBitmap(IconCompat.b((Bitmap) obj, false)) : no80.s((Bitmap) obj);
                break;
            case 6:
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 30) {
                    iconCreateWithBitmap = w081.e(iconCompat.k());
                } else {
                    if (context == null) {
                        tw20.t(iconCompat.k(), "Context is required to resolve the file uri of the icon: ");
                        return null;
                    }
                    InputStream inputStreamL = iconCompat.l(context);
                    if (inputStreamL == null) {
                        bhn0.y(iconCompat.k(), "Cannot load adaptive icon from uri: ");
                        return null;
                    }
                    if (i2 < 26) {
                        iconCreateWithBitmap = Icon.createWithBitmap(IconCompat.b(BitmapFactory.decodeStream(inputStreamL), false));
                    } else {
                        iconCreateWithBitmap = no80.s(BitmapFactory.decodeStream(inputStreamL));
                    }
                }
                break;
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.h;
        if (mode != IconCompat.k) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }

    public static final niy w(vby vbyVar) {
        zp8 giyVar;
        if (vbyVar instanceof nby) {
            return diy.a;
        }
        if (vbyVar instanceof oby) {
            return eiy.a;
        }
        if (vbyVar instanceof qby) {
            k1v k1vVar = ((qby) vbyVar).a;
            if (k1vVar.equals(h1v.a)) {
                giyVar = zp8.a1;
            } else if (k1vVar.equals(i1v.a)) {
                giyVar = rbc.c1;
            } else if (k1vVar instanceof k1v) {
                giyVar = new giy(k1vVar.a);
            } else if (k1vVar.equals(l1v.a)) {
                giyVar = uwg.d1;
            } else if (k1vVar.equals(n1v.a)) {
                giyVar = m9h.e1;
            } else if (k1vVar.equals(f1v.a)) {
                giyVar = vgp1.a1;
            } else {
                if (!k1vVar.equals(m1v.a)) {
                    eg.o();
                    return null;
                }
                giyVar = null;
            }
            if (giyVar != null) {
                return new iiy(giyVar);
            }
        } else {
            if (vbyVar instanceof rby) {
                return jiy.a;
            }
            if (vbyVar instanceof sby) {
                int iC = l1d.C(((sby) vbyVar).a);
                int i = 1;
                if (iC != 0) {
                    if (iC != 1) {
                        i = 3;
                        if (iC != 2) {
                            if (iC != 3) {
                                eg.o();
                                return null;
                            }
                            i = 4;
                        }
                    } else {
                        i = 2;
                    }
                }
                return new kiy(i);
            }
            if (vbyVar instanceof tby) {
                return new liy(((tby) vbyVar).a);
            }
            if (vbyVar instanceof uby) {
                return miy.a;
            }
            if (!(vbyVar instanceof pby)) {
                eg.o();
                return null;
            }
        }
        return null;
    }

    public static final void x(dhd1 dhd1Var) {
        TextView textViewN = n(dhd1Var);
        if (textViewN != null) {
            Context context = dhd1Var.e.getContext();
            TypedValue typedValue = new TypedValue();
            textViewN.setTextAppearance(2132018003);
            context.getTheme().resolveAttribute(2130968791, typedValue, true);
            textViewN.setTextColor(context.getColor(typedValue.resourceId));
        }
    }
}
