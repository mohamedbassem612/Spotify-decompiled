package p;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PointF;
import android.provider.Settings;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class epo1 {
    public static final kim1 a = new kim1((byte) 0);
    public static b180 b;

    public static final pp A(wfx wfxVar) {
        return new pp(wfxVar, (byte) 5);
    }

    public static final fg61 B(wcr wcrVar) {
        return new fg61(wcrVar, (byte) 0);
    }

    public static final String C(vrp0 vrp0Var) {
        blc0 blc0Var;
        w6b1 w6b1VarA;
        int iOrdinal = vrp0Var.ordinal();
        if (iOrdinal == 0) {
            blc0Var = blc0.W3;
        } else if (iOrdinal != 1) {
            blc0Var = iOrdinal != 2 ? null : blc0.F4;
        } else {
            blc0Var = blc0.ac;
        }
        if (blc0Var == null || (w6b1VarA = f7b1.a(blc0Var)) == null) {
            return null;
        }
        return (String) o7h.s0(w6b1VarA.c);
    }

    public static final int D(mey0 mey0Var, yo60 yo60Var) {
        if (yo60Var != null) {
            String str = mey0Var.c;
            Set set = s4b1.f;
            if (!uic.h(str, new blc0[]{blc0.Pg, blc0.Qg, blc0.Rg, blc0.Ug, blc0.Vg, blc0.z6, blc0.B6, blc0.C6}) && !uic.g(str, blc0.fh) && !uic.g(str, blc0.ed)) {
                if (rwq.l(str, mey0Var.d)) {
                    return 2;
                }
                if (uic.h(str, new blc0[]{blc0.ti, blc0.ui})) {
                    String str2 = yo60Var.b;
                    return (str2 == null || str2.length() == 0) ? 2 : 1;
                }
            }
        }
        return 1;
    }

    public static final hob1 H(mey0 mey0Var, t810 t810Var, fza fzaVar, hvp0 hvp0Var, yqg yqgVar, ytp0 ytp0Var, fiv0 fiv0Var, vu30 vu30Var, boolean z, iix0 iix0Var, Resources resources) {
        goj0 goj0VarA;
        goj0 goj0VarA2;
        goj0 goj0VarA3;
        goj0 goj0VarA4;
        goj0 goj0VarA5;
        String str = mey0Var.d;
        ioj0 ioj0Var = t810Var.a;
        String str2 = mey0Var.c;
        hoj0 hoj0VarC = ioj0Var.c(yo60.class, str2);
        ez00 ez00Var = null;
        yo60 yo60Var = (yo60) ((hoj0VarC == null || (goj0VarA5 = hoj0VarC.a()) == null) ? null : (ez00) goj0VarA5.a);
        int iC = l1d.C(D(mey0Var, yo60Var));
        if (iC == 0) {
            return iqo1.v(mey0Var, t810Var, fzaVar, hvp0Var, yqgVar, ytp0Var, fiv0Var, vu30Var, null, z, iix0Var, resources, 128);
        }
        if (iC != 1) {
            eg.o();
            return null;
        }
        if (yo60Var == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        hoj0 hoj0VarC2 = ioj0Var.c(nbw0.class, str);
        ez00 ez00Var2 = (hoj0VarC2 == null || (goj0VarA4 = hoj0VarC2.a()) == null) ? null : (ez00) goj0VarA4.a;
        if (ez00Var2 == null) {
            hhg1.f(f4i1.f(nbw0.class.getSimpleName(), " not found for uri: ", str));
            return null;
        }
        nbw0 nbw0Var = (nbw0) ez00Var2;
        hoj0 hoj0VarC3 = ioj0Var.c(jo70.class, str2);
        jo70 jo70Var = (jo70) ((hoj0VarC3 == null || (goj0VarA3 = hoj0VarC3.a()) == null) ? null : (ez00) goj0VarA3.a);
        hoj0 hoj0VarC4 = ioj0Var.c(prl.class, str2);
        prl prlVar = (prl) ((hoj0VarC4 == null || (goj0VarA2 = hoj0VarC4.a()) == null) ? null : (ez00) goj0VarA2.a);
        hoj0 hoj0VarC5 = ioj0Var.c(xkk1.class, str);
        if (hoj0VarC5 != null && (goj0VarA = hoj0VarC5.a()) != null) {
            ez00Var = (ez00) goj0VarA.a;
        }
        return aqo1.t(mey0Var, t810Var, new hei0(nbw0Var, yo60Var, jo70Var, prlVar, (xkk1) ez00Var), fzaVar, ytp0Var, null);
    }

    public static final me60 I(te60 te60Var) {
        return new me60(te60Var.a, "", te60Var.b, new cu70((j47) null, (String) null, (String) null, (String) null, (String) null, te60Var.c, (bu70) null, 447));
    }

    public static final int J(int i) {
        int iC = l1d.C(i);
        if (iC == 0) {
            return 1;
        }
        if (iC == 1) {
            return 3;
        }
        if (iC == 2) {
            return 2;
        }
        if (iC == 3) {
            return 4;
        }
        eg.o();
        return 0;
    }

    public static void K(Object obj) throws Throwable {
        if (obj instanceof lim1) {
            throw ((lim1) obj).a;
        }
    }

    public static void L(int i, int i2) {
        String strJ;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strJ = upo1.J("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    hhg1.n(f4i1.c(i2, "negative size: "));
                    return;
                }
                strJ = upo1.J("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strJ);
        }
    }

    public static void M(int i, int i2) {
        if (i < 0 || i > i2) {
            eg.g(O(i, i2, "index"));
        }
    }

    public static void N(int i, int i2, int i3) {
        String strO;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strO = O(i, i3, "start index");
            } else {
                strO = (i2 < 0 || i2 > i3) ? O(i2, i3, "end index") : upo1.J("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strO);
        }
    }

    public static String O(int i, int i2, String str) {
        if (i < 0) {
            return upo1.J("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return upo1.J("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        hhg1.n(f4i1.c(i2, "negative size: "));
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:102:0x024f  */
    /* JADX WARN: Code duplicated, block: B:106:0x026d  */
    /* JADX WARN: Code duplicated, block: B:108:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:110:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:113:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:115:0x0306  */
    /* JADX WARN: Code duplicated, block: B:117:0x030d  */
    /* JADX WARN: Code duplicated, block: B:118:0x0317  */
    /* JADX WARN: Code duplicated, block: B:132:0x01a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x01a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:52:0x010b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0115  */
    /* JADX WARN: Code duplicated, block: B:55:0x0127  */
    /* JADX WARN: Code duplicated, block: B:57:0x012b  */
    /* JADX WARN: Code duplicated, block: B:70:0x016a  */
    /* JADX WARN: Code duplicated, block: B:73:0x016f  */
    /* JADX WARN: Code duplicated, block: B:76:0x017d  */
    /* JADX WARN: Code duplicated, block: B:78:0x019e  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:88:0x01da  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:92:0x01f9  */
    public static final void a(q431 q431Var, String str, j6m j6mVar, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        t37 r37Var;
        t37 r37Var2;
        ncf0 ncf0VarG;
        ArrayList arrayList;
        byte b2;
        ddf0 ddf0VarS;
        boolean zI;
        Object objT;
        Object objT2;
        ven0 ven0Var;
        boolean z;
        byte b3;
        kbf0 kbf0VarN;
        boolean zI2;
        Object objT3;
        yvg1 yvg1Var;
        Integer num;
        String str2;
        byte b4;
        u7h m231Var;
        u7h u7hVar;
        edf0 edf0VarT;
        boolean zG;
        Object objT4;
        Object obj;
        h311 h311VarV;
        Object obj2 = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1199683213);
        int i2 = i | (x340Var.g(q431Var) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.i(j6mVar) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024);
        byte b5 = 1;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            ContentResolver contentResolver = ((Context) x340Var.k(AndroidCompositionLocals_androidKt.b)).getContentResolver();
            Object objT5 = x340Var.T();
            if (objT5 == obj2) {
                objT5 = Boolean.valueOf(!(Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) == 0.0f));
                x340Var.s0(objT5);
            }
            boolean zBooleanValue = ((Boolean) objT5).booleanValue();
            boolean z2 = q431Var instanceof o431;
            t37 t37Var = s37.a;
            if (z2) {
                if (zBooleanValue) {
                    r37Var = new t37(((o431) q431Var).c);
                } else {
                    o431 o431Var = (o431) q431Var;
                    r37Var2 = o431Var.f ? t37Var : new r37(o431Var.d);
                }
                if (r37Var2.equals(t37Var)) {
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new n37(q431Var, str, j6mVar, qim0Var, i, (byte) 0);
                        return;
                    }
                    return;
                }
                ncf0VarG = h5p1.G(new pcf0(q431Var.getUrl()), str, null, x340Var, (i2 << 9) & 57344, 46);
                List<ccf0> listB = q431Var.b();
                x340Var.i0(1722602851);
                arrayList = new ArrayList();
                for (ccf0 ccf0Var : listB) {
                    if (ccf0Var instanceof ccf0) {
                        PointF pointF = ndf0.a;
                        ccf0 ccf0Var2 = ccf0Var;
                        yvg1Var = new yvg1(Integer.valueOf(b5), ccf0Var2.a, ccf0Var2.b);
                    } else if (ccf0Var instanceof dcf0) {
                        eg.o();
                        return;
                    } else {
                        PointF pointF2 = ndf0.a;
                        dcf0 dcf0Var = (dcf0) ccf0Var;
                        yvg1Var = new yvg1(2, dcf0Var.a, dcf0Var.b);
                    }
                    num = (Integer) yvg1Var.a;
                    str2 = (String) yvg1Var.b;
                    try {
                        b4 = b5;
                        try {
                            m231Var = new u7h(z4p1.e(Color.parseColor((String) yvg1Var.c)));
                        } catch (Throwable th) {
                            th = th;
                            m231Var = new m231(th);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        b4 = b5;
                    }
                    if (m231Var instanceof m231) {
                        m231Var = null;
                    }
                    u7hVar = m231Var;
                    if (u7hVar != null) {
                        long j = u7hVar.a;
                        zG = x340Var.g(str2);
                        objT4 = x340Var.T();
                        if (zG || objT4 == obj2) {
                            obj = objT4;
                            String[] strArr = new String[2];
                            strArr[0] = str2;
                            strArr[b4] = "**";
                            x340Var.s0(strArr);
                            obj = strArr;
                        }
                        String[] strArr2 = (String[]) obj;
                        edf0VarT = e130.t(num, Integer.valueOf(z4p1.G(j)), (String[]) Arrays.copyOf(strArr2, strArr2.length), x340Var, 0);
                    } else {
                        edf0VarT = null;
                    }
                    if (edf0VarT != null) {
                        arrayList.add(edf0VarT);
                    }
                    b5 = b4;
                }
                b2 = b5;
                x340Var.r(false);
                edf0[] edf0VarArr = (edf0[]) arrayList.toArray(new edf0[0]);
                ddf0VarS = e130.s((edf0[]) Arrays.copyOf(edf0VarArr, edf0VarArr.length), x340Var);
                if (r37Var2 instanceof t37) {
                    x340Var.i0(-1339169907);
                    Object[] objArr = {str};
                    objT2 = x340Var.T();
                    if (objT2 == obj2) {
                        objT2 = ng5.e1;
                        x340Var.s0(objT2);
                    }
                    ven0Var = (ven0) k5p1.s(objArr, (Function0) objT2, x340Var, 48);
                    fcf0 fcf0VarC = ncf0VarG.c();
                    z = r37Var2.a;
                    if (z) {
                        b3 = 2147483647;
                    } else {
                        b3 = b2;
                    }
                    kbf0VarN = zpn1.n(fcf0VarC, !((Boolean) ven0Var.getValue()).booleanValue(), false, null, 0.0f, b3, x340Var, 956);
                    if (!z || ((Boolean) ven0Var.getValue()).booleanValue()) {
                        x340Var.i0(-1338526161);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(-1338660701);
                        boolean zI3 = x340Var.i(kbf0VarN) | x340Var.i(ven0Var);
                        Object objT6 = x340Var.T();
                        if (zI3 || objT6 == obj2) {
                            objT6 = new k96(kbf0VarN, ven0Var, (lnm) null, (byte) 7);
                            x340Var.s0(objT6);
                        }
                        qxd0.t(rih1.a, x340Var, (vu30) objT6);
                        x340Var.r(false);
                    }
                    fcf0 fcf0VarC2 = ncf0VarG.c();
                    zI2 = x340Var.i(ven0Var) | x340Var.i(kbf0VarN);
                    objT3 = x340Var.T();
                    if (zI2 || objT3 == obj2) {
                        objT3 = new wd5(kbf0VarN, ven0Var, b2);
                        x340Var.s0(objT3);
                    }
                    mp10.e(fcf0VarC2, (Function0) objT3, qim0Var, false, false, false, (xc21) null, false, ddf0VarS, (tl3) null, j6mVar, false, false, (Map) null, (jj7) null, false, x340Var, ((i2 >> 3) & 896) | 134217728, (i2 >> 6) & 14, 64248);
                    x340Var = x340Var;
                    x340Var.r(false);
                } else if (r37Var2 instanceof r37) {
                    x340Var.i0(-1338075266);
                    fcf0 fcf0VarC3 = ncf0VarG.c();
                    zI = x340Var.i(ncf0VarG) | x340Var.i(r37Var2);
                    objT = x340Var.T();
                    if (zI || objT == obj2) {
                        objT = new nx2(ncf0VarG, (r37) r37Var2, (byte) 28);
                        x340Var.s0(objT);
                    }
                    mp10.e(fcf0VarC3, (Function0) objT, qim0Var, false, false, false, (xc21) null, false, ddf0VarS, (tl3) null, j6mVar, false, false, (Map) null, (jj7) null, false, x340Var, ((i2 >> 3) & 896) | 134217728, (i2 >> 6) & 14, 64248);
                    x340Var = x340Var;
                    x340Var.r(false);
                } else {
                    if (r37Var2.equals(t37Var)) {
                        throw p3d1.k(x340Var, -1844315360, false);
                    }
                    x340Var.i0(-1844269577);
                    x340Var.r(false);
                }
            } else {
                if (!(q431Var instanceof p431)) {
                    eg.o();
                    return;
                }
                r37Var = new r37(((p431) q431Var).c);
            }
            r37Var2 = r37Var;
            if (r37Var2.equals(t37Var)) {
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new n37(q431Var, str, j6mVar, qim0Var, i, (byte) 0);
                    return;
                }
                return;
            }
            ncf0VarG = h5p1.G(new pcf0(q431Var.getUrl()), str, null, x340Var, (i2 << 9) & 57344, 46);
            List<ccf0> listB2 = q431Var.b();
            x340Var.i0(1722602851);
            arrayList = new ArrayList();
            while (r4.hasNext()) {
                if (ccf0Var instanceof ccf0) {
                    PointF pointF3 = ndf0.a;
                    ccf0 ccf0Var3 = ccf0Var;
                    yvg1Var = new yvg1(Integer.valueOf(b5), ccf0Var3.a, ccf0Var3.b);
                } else if (ccf0Var instanceof dcf0) {
                    eg.o();
                    return;
                } else {
                    PointF pointF4 = ndf0.a;
                    dcf0 dcf0Var2 = (dcf0) ccf0Var;
                    yvg1Var = new yvg1(2, dcf0Var2.a, dcf0Var2.b);
                }
                num = (Integer) yvg1Var.a;
                str2 = (String) yvg1Var.b;
                b4 = b5;
                m231Var = new u7h(z4p1.e(Color.parseColor((String) yvg1Var.c)));
                if (m231Var instanceof m231) {
                    m231Var = null;
                }
                u7hVar = m231Var;
                if (u7hVar != null) {
                    long j2 = u7hVar.a;
                    zG = x340Var.g(str2);
                    objT4 = x340Var.T();
                    if (zG) {
                        obj = objT4;
                        String[] strArr3 = new String[2];
                        strArr3[0] = str2;
                        strArr3[b4] = "**";
                        x340Var.s0(strArr3);
                        obj = strArr3;
                    } else {
                        obj = objT4;
                        String[] strArr4 = new String[2];
                        strArr4[0] = str2;
                        strArr4[b4] = "**";
                        x340Var.s0(strArr4);
                        obj = strArr4;
                    }
                    String[] strArr5 = (String[]) obj;
                    edf0VarT = e130.t(num, Integer.valueOf(z4p1.G(j2)), (String[]) Arrays.copyOf(strArr5, strArr5.length), x340Var, 0);
                } else {
                    edf0VarT = null;
                }
                if (edf0VarT != null) {
                    arrayList.add(edf0VarT);
                }
                b5 = b4;
            }
            b2 = b5;
            x340Var.r(false);
            edf0[] edf0VarArr2 = (edf0[]) arrayList.toArray(new edf0[0]);
            ddf0VarS = e130.s((edf0[]) Arrays.copyOf(edf0VarArr2, edf0VarArr2.length), x340Var);
            if (r37Var2 instanceof t37) {
                x340Var.i0(-1339169907);
                Object[] objArr2 = {str};
                objT2 = x340Var.T();
                if (objT2 == obj2) {
                    objT2 = ng5.e1;
                    x340Var.s0(objT2);
                }
                ven0Var = (ven0) k5p1.s(objArr2, (Function0) objT2, x340Var, 48);
                fcf0 fcf0VarC4 = ncf0VarG.c();
                z = r37Var2.a;
                if (z) {
                    b3 = 2147483647;
                } else {
                    b3 = b2;
                }
                kbf0VarN = zpn1.n(fcf0VarC4, !((Boolean) ven0Var.getValue()).booleanValue(), false, null, 0.0f, b3, x340Var, 956);
                if (z) {
                    x340Var.i0(-1338526161);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1338526161);
                    x340Var.r(false);
                }
                fcf0 fcf0VarC5 = ncf0VarG.c();
                zI2 = x340Var.i(ven0Var) | x340Var.i(kbf0VarN);
                objT3 = x340Var.T();
                if (zI2) {
                    objT3 = new wd5(kbf0VarN, ven0Var, b2);
                    x340Var.s0(objT3);
                } else {
                    objT3 = new wd5(kbf0VarN, ven0Var, b2);
                    x340Var.s0(objT3);
                }
                mp10.e(fcf0VarC5, (Function0) objT3, qim0Var, false, false, false, (xc21) null, false, ddf0VarS, (tl3) null, j6mVar, false, false, (Map) null, (jj7) null, false, x340Var, ((i2 >> 3) & 896) | 134217728, (i2 >> 6) & 14, 64248);
                x340Var = x340Var;
                x340Var.r(false);
            } else if (r37Var2 instanceof r37) {
                x340Var.i0(-1338075266);
                fcf0 fcf0VarC6 = ncf0VarG.c();
                zI = x340Var.i(ncf0VarG) | x340Var.i(r37Var2);
                objT = x340Var.T();
                if (zI) {
                    objT = new nx2(ncf0VarG, (r37) r37Var2, (byte) 28);
                    x340Var.s0(objT);
                } else {
                    objT = new nx2(ncf0VarG, (r37) r37Var2, (byte) 28);
                    x340Var.s0(objT);
                }
                mp10.e(fcf0VarC6, (Function0) objT, qim0Var, false, false, false, (xc21) null, false, ddf0VarS, (tl3) null, j6mVar, false, false, (Map) null, (jj7) null, false, x340Var, ((i2 >> 3) & 896) | 134217728, (i2 >> 6) & 14, 64248);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                if (r37Var2.equals(t37Var)) {
                    throw p3d1.k(x340Var, -1844315360, false);
                }
                x340Var.i0(-1844269577);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV2 = x340Var.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new n37(q431Var, str, j6mVar, qim0Var, i, (byte) 1);
        }
    }

    public static final void b(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1750650915);
        int i2 = i | (x340Var.i(function0) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarZ = uyn1.z(0.0f, 4.0f, 1, qim0Var3);
            idx idxVar = new idx(4);
            gdx gdxVarR = yla.r(x340Var);
            if (ihc1.y0(str)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                foo1.c(new gbx(new y50(str), function0), idxVar, qim0VarZ, null, gdxVarR, null, null, null, null, null, apo.r(-231157954, new zsd1(str, (byte) 17), x340Var), x340Var, 0, 48, 2008);
                qim0Var2 = qim0Var3;
            }
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rl(function0, str, qim0Var2, i, (byte) 26);
        }
    }

    public static final void c(int i, Function0 function0, Function0 function1, b0k b0kVar, iu30 iu30Var, qim0 qim0Var, boolean z) {
        int i2;
        qim0 qim0Var2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-2094785920);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            qim0Var2 = qim0Var;
            i2 |= b0kVar3.i(qim0Var2) ? 16384 : 8192;
        } else {
            qim0Var2 = qim0Var;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            b0kVar2 = b0kVar3;
            cwl1.b(qim0Var2, (tl3) null, (hw61) null, (pgx) null, (vzq0) null, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(-834846615, new k1f1(function1, function0, z, iu30Var), b0kVar3), b0kVar2, (i2 >> 12) & 14, 48, 2046);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new cnr0(z, iu30Var, function0, function1, qim0Var, i);
        }
    }

    public static final void d(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1724193755);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uox uoxVar = uox.c;
            jsl jslVar = new jsl(cwl1.o0(x340Var, 2131963551));
            qim0 qim0Var2 = nim0.a;
            w0h1.a(uoxVar, jslVar, u291.r(qim0Var2, 32.0f), 0L, 0L, false, x340Var, uox.d, 56);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wfe1(qim0Var, i, (byte) 14);
        }
    }

    public static final void e(zkn zknVar, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(734317296);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(zknVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            if (zknVar.d) {
                x340Var.i0(1778249773);
                boolean z = (i2 & 112) == 32;
                Object objT = x340Var.T();
                if (z || objT == fkj0.X) {
                    objT = new jzk(iu30Var, (byte) 28);
                    x340Var.s0(objT);
                }
                x3p1.b(null, (Function0) objT, x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(1778316082);
                x340Var.r(false);
            }
            j2h1.f(cwl1.o0(x340Var, 2131953767), (qim0) null, 0L, 0L, (lee1) null, apo.r(-1984831612, new mzj(zknVar, cwl1.o0(x340Var, 2131953766), iu30Var, (byte) 29), x340Var), x340Var, 1572864, 62);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bkh(zknVar, iu30Var, i, (byte) 13);
        }
    }

    public static final void f(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        Function0 function1;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(81001734);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            long jE = z4p1.e(((Context) x340Var.k(AndroidCompositionLocals_androidKt.b)).getColor(2131101503));
            gra graVar = een.h;
            qim0Var2 = nim0.a;
            qim0 qim0VarR = u291.r(anm1.N("custom-reactions-button-test-tag", qim0Var2), 40.0f);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = ktd.n(x340Var);
            }
            qim0 qim0VarV = bin.v(qim0VarR, (idn0) objT, jtr.f, false, null, new pm31(0), function0, 12);
            cr31 cr31Var = er31.a;
            qim0 qim0VarF = dug.f(sto1.o(qim0VarV, 4.0f, cr31Var, false, 0L, 0L, 24), jE, cr31Var);
            gfh0 gfh0VarC = t1c.c(graVar, false);
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
            tjx tjxVar = tjx.c;
            jsl jslVar = new jsl(cwl1.o0(x340Var, 2131957391));
            uwr uwrVar = cbx.a;
            function1 = function0;
            w0h1.a(tjxVar, jslVar, u291.r(qim0Var2, 24.0f), cbx.a(x340Var).b.b, 0L, false, x340Var, tjx.d, 48);
            x340Var.r(true);
        } else {
            function1 = function0;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bb50(function1, qim0Var2, i, (byte) 25);
        }
    }

    public static final void g(c380 c380Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(703943374);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(c380Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i3 = i & 384;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.i(nim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            ss50 ss50Var = (ss50) x340Var.k(t4k.l);
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            k5p1.d(anm1.N("reaction-picker-row-test-tag", uyn1.x(qim0VarF, 16.0f)), h36.g, null, null, 0, 0, apo.r(-1853964983, new hho0(c380Var, ss50Var, iu30Var, (byte) 14), x340Var), x340Var, 1572864, 60);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kqf(c380Var, iu30Var, i, (byte) 1);
        }
    }

    public static final void h(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1240899332);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | 48 | (x340Var.i(function0) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            gra graVar = een.h;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarX = bin.x(u291.r(qim0Var3, 48.0f), false, cwl1.n0(2131957436, new Object[]{str}, x340Var), null, null, function0, 13);
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
            uwr uwrVar = cbx.a;
            uwo1.e(str, null, cbx.d(x340Var).c, 0L, null, null, 0, false, null, 0, null, x340Var, i2 & 14, 0, 2042);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rl(str, qim0Var2, function0, i, (byte) 16);
        }
    }

    public static final void i(coc1 coc1Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(939607565);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(coc1Var) : x340Var.i(coc1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            d36 d36Var = new d36(8.0f, true, new um5(false));
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            mbh mbhVarA = jbh.a(d36Var, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            gra graVar = een.h;
            String str = coc1Var.m;
            String str2 = coc1Var.k;
            long jC = xxq0.c(str);
            cr31 cr31VarB = er31.b(8.0f);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarR = u291.r(dug.f(nim0Var, jC, cr31VarB), 48.0f);
            gfh0 gfh0VarC = t1c.c(graVar, false);
            x340Var = x340Var;
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarR);
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
            w0h1.a(xxq0.d(str2), isl.a, u291.r(nim0Var, 24.0f), xxq0.c(coc1Var.l), 0L, huj.d(str2), x340Var, 56, 16);
            x340Var.r(true);
            String str3 = coc1Var.d;
            long jC2 = xxq0.c(coc1Var.e);
            uwr uwrVar = cbx.a;
            uwo1.e(str3, null, cbx.d(x340Var).d, jC2, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new heb1(coc1Var, qim0Var, i, (byte) 10);
        }
    }

    public static final void j(eyb0 eyb0Var, Function0 function0, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        qim0 qim0Var3;
        m4c m4cVar = fkj0.X;
        boolean z = eyb0Var.e;
        boolean z2 = eyb0Var.d;
        vxb0 vxb0Var = eyb0Var.a;
        List list = vxb0Var.b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(293182218);
        int i2 = i | (x340Var.i(eyb0Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            String str = azd1.a;
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarZ = u291.z(u291.f(anm1.N(str, qim0Var4), 1.0f), (fra) null, 3);
            long jE = z4p1.e(eyb0Var.c);
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarX = uyn1.x(dug.f(qim0VarZ, jE, er31.b(16.0f)), 16.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            uwo1.e(cwl1.o0(x340Var, (z2 || z) ? 2131957204 : 2131957203), null, cbx.d(x340Var).h, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2042);
            x340Var = x340Var;
            x340Var.i0(1519820463);
            int i3 = 0;
            for (Object obj : o7h.d1(list, eyb0Var.b)) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    p7h.T();
                    throw null;
                }
                ji0 ji0Var = (ji0) obj;
                boolean zG = x340Var.g(ji0Var.a);
                Object objT = x340Var.T();
                if (zG || objT == m4cVar) {
                    objT = (xpw) function0.invoke();
                    x340Var.s0(objT);
                }
                otw.c((xpw) objT, new cxb0(ji0Var, i3, z2 || z, vxb0Var.a), uyn1.z(0.0f, 16.0f, 1, qim0Var4), (ipb1) null, x340Var, 0, 8);
                i3 = i4;
            }
            x340Var.r(false);
            if (eyb0Var.f) {
                x340Var.i0(-129748217);
                int size = list.size();
                boolean z3 = (i2 & 896) == 256;
                Object objT2 = x340Var.T();
                if (z3 || objT2 == m4cVar) {
                    objT2 = new sya0(iu30Var, (byte) 8);
                    x340Var.s0(objT2);
                }
                qim0Var3 = qim0Var4;
                t(size, 0, x340Var, bin.x(qim0Var4, false, null, null, null, (Function0) objT2, 15));
                x340Var.r(false);
            } else {
                qim0Var3 = qim0Var4;
                x340Var.i0(-129618482);
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
            h311VarV.d = new lxb0(eyb0Var, function0, iu30Var, qim0Var2, i, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008e  */
    public static final void k(boolean z, boolean z2, Function0 function0, j2i j2iVar, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        qim0 qim0VarX;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2107989619);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.h(z2) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(j2iVar) ? 2048 : 1024) | 24576;
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, 16.0f, 0.0f, 0.0f, 13);
            if (function0 == null) {
                qim0VarX = qim0VarB;
            } else {
                Function0 function1 = !z2 ? function0 : null;
                if (function1 == null || (qim0VarX = bin.x(qim0VarB, false, null, null, null, function1, 15)) == null) {
                    qim0VarX = qim0VarB;
                }
            }
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
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
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
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
            r(z2, x340Var, (i2 >> 3) & 14);
            j2iVar.invoke(x340Var, Integer.valueOf((i2 >> 9) & 14));
            x340Var.r(true);
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(qim0Var3, 16.0f));
            if (z) {
                x340Var.i0(691409279);
                x340Var.r(false);
            } else {
                x340Var.i0(691273778);
                t1c.a(dug.f(u291.f(u291.h(qim0Var3, 1.0f), 1.0f), ((yex) zex.a.d).e, d4o1.a), x340Var, 0);
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
            h311VarV.d = new hy(z, z2, (Object) function0, (Object) j2iVar, qim0Var2, i, (byte) 20);
        }
    }

    public static final void l(String str, c380 c380Var, dw91 dw91Var, iu30 iu30Var, vu30 vu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        Function0 function0;
        String str2 = str;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1425855922);
        dw91 dw91Var2 = dw91Var;
        int i2 = 2048;
        vu30 vu30Var2 = vu30Var;
        int i3 = i | (x340Var.g(str2 != null ? new zbs0(str2) : null) ? 4 : 2) | (x340Var.g(c380Var) ? 32 : 16) | (x340Var.i(dw91Var2) ? 256 : 128) | (x340Var.i(iu30Var) ? 2048 : 1024) | (x340Var.i(vu30Var2) ? 16384 : 8192) | 196608;
        if (x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = v8r.q((Object) null);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            String str3 = (String) ven0Var.getValue();
            if (str3 == null) {
                x340Var.i0(-446845217);
                x340Var.r(false);
            } else {
                x340Var.i0(-446845216);
                boolean zI = x340Var.i(ven0Var);
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new q2j0(ven0Var, (byte) 23);
                    x340Var.s0(objT2);
                }
                p(0, str3, (Function0) objT2, x340Var);
                x340Var.r(false);
            }
            Iterator it = c380Var.iterator();
            int i4 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i4 = -1;
                    break;
                } else {
                    if (str2 == null ? false : str2.equals(((xbs0) it.next()).a)) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            int i5 = i4;
            x340Var.i0(-152953184);
            ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
            Iterator it2 = c380Var.iterator();
            while (it2.hasNext()) {
                xbs0 xbs0Var = (xbs0) it2.next();
                boolean z = xbs0Var.e != null;
                if (z) {
                    x340Var.i0(-2117164109);
                    boolean zI2 = x340Var.i(ven0Var) | x340Var.i(xbs0Var);
                    Object objT3 = x340Var.T();
                    if (zI2 || objT3 == m4cVar) {
                        objT3 = new shq0(ven0Var, xbs0Var, (byte) 17);
                        x340Var.s0(objT3);
                    }
                    function0 = (Function0) objT3;
                    x340Var.r(false);
                } else {
                    x340Var.i0(-2117266843);
                    boolean zI3 = ((i3 & 7168) == i2) | x340Var.i(xbs0Var);
                    Object objT4 = x340Var.T();
                    if (zI3 || objT4 == m4cVar) {
                        objT4 = new shq0((byte) 16, xbs0Var, iu30Var);
                        x340Var.s0(objT4);
                    }
                    function0 = (Function0) objT4;
                    x340Var.r(false);
                }
                ArrayList arrayList2 = arrayList;
                arrayList2.add(new lxs0(function0, apo.r(1970776345, new ofi0(str2, xbs0Var, dw91Var2, vu30Var2, z), x340Var)));
                str2 = str;
                dw91Var2 = dw91Var;
                vu30Var2 = vu30Var;
                arrayList = arrayList2;
                i2 = 2048;
            }
            x340Var.r(false);
            m(mqo1.A(arrayList), Integer.valueOf(i5), x340Var, 48, 0);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uuy(str, (Object) c380Var, (Object) dw91Var, (Object) iu30Var, (Object) vu30Var, (Object) qim0Var2, i, (byte) 27);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x009a  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:64:0x010d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0111  */
    /* JADX WARN: Code duplicated, block: B:69:0x011b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    public static final void m(c380 c380Var, Integer num, b0k b0kVar, int i, int i2) {
        int i3;
        Integer num2;
        boolean z;
        Integer num3;
        h311 h311VarV;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        Iterator itN;
        int i4;
        Object next;
        int i5;
        boolean z2;
        boolean z3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1369330428);
        if ((i & 6) == 0) {
            i3 = (x340Var.g(c380Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i & 48;
        nim0 nim0Var = nim0.a;
        if (i6 == 0) {
            i3 |= x340Var.i(nim0Var) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                num2 = num;
                i3 |= x340Var.g(num2) ? 256 : 128;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                if (i7 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                uwr uwrVar = cbx.a;
                qim0 qim0VarE2 = d1u.E(1.0f, ((yex) zex.a.d).e, nim0Var, er31.b(4.0f));
                mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarE2);
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
                nko1.H(mbhVarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                itN = kk0.n(x340Var, qim0VarE, y580.Y, -1007051405, c380Var);
                i4 = 0;
                while (itN.hasNext()) {
                    next = itN.next();
                    i5 = i4 + 1;
                    if (i4 >= 0) {
                        p7h.T();
                        throw null;
                    }
                    lxs0 lxs0Var = (lxs0) next;
                    if (num3 == null && i4 == num3.intValue()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (c380Var.size() == i5) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    k(z3, z2, lxs0Var.a, lxs0Var.b, null, x340Var, 0);
                    i4 = i5;
                }
                x340Var.r(false);
                x340Var.r(true);
            } else {
                x340Var.b0();
                num3 = num2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ux1(c380Var, num3, i, i2);
            }
        }
        i3 |= 384;
        num2 = num;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            if (i7 != 0) {
                num3 = null;
            } else {
                num3 = num2;
            }
            uwr uwrVar2 = cbx.a;
            qim0 qim0VarE3 = d1u.E(1.0f, ((yex) zex.a.d).e, nim0Var, er31.b(4.0f));
            mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarE3);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            itN = kk0.n(x340Var, qim0VarE, y580.Y, -1007051405, c380Var);
            i4 = 0;
            while (itN.hasNext()) {
                next = itN.next();
                i5 = i4 + 1;
                if (i4 >= 0) {
                    p7h.T();
                    throw null;
                }
                lxs0 lxs0Var2 = (lxs0) next;
                if (num3 == null) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (c380Var.size() == i5) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                k(z3, z2, lxs0Var2.a, lxs0Var2.b, null, x340Var, 0);
                i4 = i5;
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
            num3 = num2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ux1(c380Var, num3, i, i2);
        }
    }

    public static final void n(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(866968234);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            tr80 tr80Var = new tr80(1, 3, 1);
            ArrayList arrayList = new ArrayList(q7h.U(tr80Var, 10));
            lr80 it = tr80Var.iterator();
            while (((sr80) it).c) {
                it.nextInt();
                arrayList.add(new lxs0((Function0) null, s6j.a));
            }
            m(mqo1.A(arrayList), null, x340Var, 48, 4);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new one0(qim0Var, i, (byte) 24);
        }
    }

    public static final void o(int i, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z, boolean z2) {
        Function0 function1;
        qim0 qim0Var2;
        boolean z3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-781534070);
        int i2 = (x340Var.h(z) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16) | (x340Var.h(z2) ? 256 : 128) | (x340Var.i(function0) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            function1 = function0;
            qpn1.e(function1, qim0Var, z2, apo.r(1848037454, new epe0((byte) 6, z), x340Var), x340Var, ((i2 >> 9) & 14) | 3072 | (i2 & 112) | (i2 & 896), 0);
            qim0Var2 = qim0Var;
            z3 = z2;
        } else {
            function1 = function0;
            qim0Var2 = qim0Var;
            z3 = z2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g9p0(z, qim0Var2, z3, function1, i);
        }
    }

    public static final void p(int i, String str, Function0 function0, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(994915884);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new isr0(function0, (byte) 6);
                x340Var.s0(objT);
            }
            anm1.a((Function0) objT, (i3u) null, apo.r(-1272911819, new psr0(str, (byte) 7), x340Var), x340Var, 384, 2);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ql(str, function0, i, (byte) 26);
        }
    }

    public static final void q(int i, b0k b0kVar, iu30 iu30Var, c380 c380Var, qim0 qim0Var, boolean z) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-926006449);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(c380Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            if (z) {
                x340Var.i0(-82977116);
                int i4 = i3 & 14;
                int i5 = i3 >> 3;
                s(c380Var, iu30Var, x340Var, i4 | (i5 & 112) | (i5 & 896));
                x340Var.r(false);
            } else {
                x340Var.i0(-82829401);
                int i6 = i3 & 14;
                int i7 = i3 >> 3;
                g(c380Var, iu30Var, x340Var, i6 | (i7 & 112) | (i7 & 896));
                x340Var.r(false);
            }
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mk7(c380Var, z, iu30Var, qim0Var2, i);
        }
    }

    public static final void r(boolean z, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(487565631);
        byte b2 = 2;
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            nim0 nim0Var = nim0.a;
            if (z) {
                x340Var.i0(-511614927);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                t1c.a(d1u.E(4.0f, cbx.a(x340Var).c.c, uyn1.x(u291.r(uyn1.B(nim0Var, 12.0f, 0.0f, 0.0f, 0.0f, 14), 24.0f), 4.0f), er31.a(50)), x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(-511368973);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var).b;
                t1c.a(d1u.E(1.0f, ((yex) zex.a.d).e, uyn1.x(u291.r(uyn1.B(nim0Var, 12.0f, 0.0f, 0.0f, 0.0f, 14), 24.0f), 4.0f), er31.a(50)), x340Var, 0);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zdx(b2, i, z);
        }
    }

    public static final void s(c380 c380Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        int i3;
        iu30 iu30Var2 = iu30Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-225196788);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(c380Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var2) ? 32 : 16;
        }
        int i4 = i & 384;
        nim0 nim0Var = nim0.a;
        if (i4 == 0) {
            i2 |= x340Var.i(nim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            ss50 ss50Var = (ss50) x340Var.k(t4k.l);
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarN = anm1.N("reaction-picker-row-test-tag", uyn1.x(qim0VarF, 16.0f));
            gfh0 gfh0VarC = t1c.c(een.i, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
            qim0 qim0VarS = exd0.s(i541.D(uyn1.B(nim0Var, 0.0f, 0.0f, 20.0f, 0.0f, 11), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 1, null, 983039), new pq50(xtb0VarA, (byte) 1));
            zzq0 zzq0VarJ = uyn1.j(0.0f, 0.0f, 28.0f, 0.0f, 11);
            d36 d36Var = new d36(12.0f, true, new um5(false));
            int i5 = i2 & 112;
            boolean zI = x340Var.i(c380Var) | x340Var.i(ss50Var) | (i5 == 32);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new ozu0(c380Var, ss50Var, iu30Var2, (byte) 17);
                x340Var.s0(objT);
            }
            ujo1.e(qim0VarS, xtb0VarA, zzq0VarJ, d36Var, null, null, false, null, (iu30) objT, x340Var, 0, 488);
            boolean zI2 = x340Var.i(ss50Var) | (i5 == 32);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                iu30Var2 = iu30Var;
                i3 = 0;
                objT2 = new uyz0(ss50Var, iu30Var2, (byte) 0);
                x340Var.s0(objT2);
            } else {
                iu30Var2 = iu30Var;
                i3 = 0;
            }
            f(i3, (Function0) objT2, x340Var, null);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kqf(c380Var, iu30Var2, i, (byte) 2);
        }
    }

    public static final void t(int i, int i2, b0k b0kVar, qim0 qim0Var) {
        float f;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-315990097);
        int i3 = i2 | (x340Var.e(i) ? 4 : 2) | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, 16.0f, 16.0f, 0.0f, 9);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
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
            uwo1.e(cwl1.o0(x340Var, 2131957202), new wnb0(1.0f, true), cbx.d(x340Var).h, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2040);
            qim0 qim0Var3 = nim0.a;
            if (i > 1) {
                x340Var.i0(365819593);
                String strValueOf = String.valueOf(i);
                lee1 lee1Var = cbx.d(x340Var).g;
                cvx cvxVar3 = cbx.b(x340Var).b;
                f = 16.0f;
                qim0Var2 = qim0Var3;
                uwo1.e(strValueOf, uyn1.z(16.0f, 0.0f, 2, qim0Var3), lee1Var, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2040);
                x340Var.r(false);
            } else {
                f = 16.0f;
                qim0Var2 = qim0Var3;
                x340Var.i0(365985071);
                x340Var.r(false);
            }
            plx plxVar = plx.c;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(plxVar, isl.a, u291.r(qim0Var2, f).then(new i5j1(een.N0)), 0L, 0L, false, x340Var, plx.d | 48, 56);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mq2((byte) 16, i, i2, qim0Var);
        }
    }

    public static final void u(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1735990129);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            float f = cbx.b(x340Var).b.d;
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarA = uyn1.A(qim0Var2, f, 16.0f, 16.0f, 16.0f);
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
            cvx cvxVar4 = cbx.b(x340Var).b;
            t1c.a(cwl1.l0(u291.f(u291.h(uyn1.B(qim0Var2, 0.0f, 0.0f, 0.0f, 12.0f, 7), cbx.b(x340Var).b.b), 0.65f), 0L, (hw61) null, 15), x340Var, 0);
            cvx cvxVar5 = cbx.b(x340Var).b;
            t1c.a(cwl1.l0(u291.f(u291.h(qim0Var2, 12.0f), 0.2f), 0L, (hw61) null, 15), x340Var, 0);
            x340Var.r(true);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new one0(qim0Var, i, (byte) 25);
        }
    }

    public static final void v(b180 b180Var, boolean z, Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1335324014);
        int i2 = (x340Var.i(b180Var) ? 4 : 2) | i | (x340Var.h(z) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qpn1.e(function0, null, z, apo.r(775015254, new qsn0(b180Var, (byte) 12), x340Var), x340Var, ((i2 >> 6) & 14) | 3072 | ((i2 << 3) & 896), 2);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new r7e0((Object) b180Var, z, (Object) function0, i, (byte) 9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void w(coc1 coc1Var, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) {
        Function0 function1;
        x340 x340Var;
        String str;
        nl3 nl3Var;
        m4c m4cVar;
        pl3 pl3Var;
        Function0 function2;
        int i2;
        Function0 function3;
        c36 c36Var;
        int i3;
        int i4;
        boolean z;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        List<p60> list = coc1Var.i;
        String str2 = coc1Var.f;
        String str3 = coc1Var.a;
        pl3 pl3Var2 = een.N0;
        nl3 nl3Var2 = een.P0;
        m4c m4cVar2 = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(422750142);
        j06 j06Var = x340Var2.a;
        int i5 = (i & 6) == 0 ? i | ((i & 8) == 0 ? x340Var2.g(coc1Var) : x340Var2.i(coc1Var) ? 4 : 2) : i;
        if ((i & 48) == 0) {
            i5 |= x340Var2.i(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= x340Var2.i(function0) ? 256 : 128;
        }
        int i6 = i5;
        if (x340Var2.Y(i6 & 1, (i6 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = u291.f(dug.f(qim0Var, cbx.a(x340Var2).a.a.b(), er31.b(8.0f)), 1.0f);
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, nl3Var2, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z2 = x340Var2.S;
            Function0 function4 = hmb0.t1;
            if (z2) {
                x340Var2.l(function4);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, lljVar4);
            nko1.H(xos0VarM, x340Var2, lljVar3);
            x0d.q(iHashCode, x340Var2, lljVar2, x340Var2);
            nko1.H(qim0VarE, x340Var2, lljVar);
            long jA = cbx.a(x340Var2).a.a.a();
            cr31 cr31VarB = er31.b(8.0f);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF2 = u291.f(dug.f(nim0Var, jA, cr31VarB), 1.0f);
            mbh mbhVarA2 = jbh.a(f36Var, nl3Var2, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarF2);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(function4);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA2, x340Var2, lljVar4);
            nko1.H(xos0VarM2, x340Var2, lljVar3);
            x0d.q(iHashCode2, x340Var2, lljVar2, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar);
            String str4 = coc1Var.h.c;
            List list2 = coc1Var.g;
            String str5 = coc1Var.n;
            if (str3.length() > 0) {
                x340Var2.i0(830326410);
                nl3Var = nl3Var2;
                i2 = 0;
                m4cVar = m4cVar2;
                pl3Var = pl3Var2;
                function2 = function4;
                str = str5;
                uwo1.e(str3, uyn1.y(dug.f(nim0Var, xxq0.c(coc1Var.c), er31.d(8.0f, 0.0f, 8.0f, 0.0f, 10)), 16.0f, 4.0f), cbx.d(x340Var2).k, xxq0.c(coc1Var.b), null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2032);
                x340Var = x340Var2;
                x340Var.r(false);
            } else {
                str = str5;
                nl3Var = nl3Var2;
                m4cVar = m4cVar2;
                x340Var = x340Var2;
                pl3Var = pl3Var2;
                function2 = function4;
                i2 = 0;
                x340Var.i0(830739888);
                x340Var.r(false);
            }
            qim0 qim0VarA = uyn1.A(nim0Var, 16.0f, 16.0f, 16.0f, 8.0f);
            mbh mbhVarA3 = jbh.a(f36Var, nl3Var, x340Var, i2);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarA);
            x340Var.m0();
            if (x340Var.S) {
                function3 = function2;
                x340Var.l(function3);
            } else {
                function3 = function2;
                x340Var.v0();
            }
            nko1.H(mbhVarA3, x340Var, lljVar4);
            nko1.H(xos0VarM3, x340Var, lljVar3);
            x0d.q(iHashCode3, x340Var, lljVar2, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar);
            fra fraVar = een.Z;
            c36 c36Var2 = h36.a;
            jw31 jw31VarA = ew31.a(c36Var2, fraVar, x340Var, i2);
            int iHashCode4 = Long.hashCode(x340Var.T);
            xos0 xos0VarM4 = x340Var.m();
            qim0 qim0VarE4 = zr7.E(x340Var, nim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function3);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar4);
            nko1.H(xos0VarM4, x340Var, lljVar3);
            x0d.q(iHashCode4, x340Var, lljVar2, x340Var);
            nko1.H(qim0VarE4, x340Var, lljVar);
            int length = coc1Var.p.length();
            Function0 function5 = function3;
            ksl kslVar = isl.a;
            if (length > 0) {
                x340Var.i0(857526993);
                if (str.length() > 0) {
                    x340Var.i0(857584467);
                    w0h1.a(xxq0.d(str), kslVar, uyn1.B(u291.r(nim0Var, 16.0f), 0.0f, 0.0f, 4.0f, 0.0f, 11), xxq0.c(coc1Var.o), 0L, huj.d(str), x340Var, 56, 16);
                    x340Var.r(false);
                } else {
                    x340Var.i0(857927978);
                    x340Var.r(false);
                }
                uwo1.e(coc1Var.p, null, cbx.d(x340Var).k, xxq0.c(coc1Var.q), null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
                x340Var.r(false);
            } else {
                kslVar = kslVar;
                function5 = function5;
                x340Var.i0(858135306);
                x340Var.r(false);
            }
            x340Var.r(true);
            uwo1.e(coc1Var.d, null, cbx.d(x340Var).d, xxq0.c(coc1Var.e), null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            if (str2.length() > 0) {
                x340Var.i0(1617320284);
                x340 x340Var3 = x340Var;
                c36Var = c36Var2;
                uwo1.e(str2, uyn1.z(0.0f, 16.0f, 1, nim0Var), cbx.d(x340Var).g, 0L, null, null, 0, false, null, 0, null, x340Var3, 0, 0, 2040);
                x340Var = x340Var3;
                i3 = 0;
                x340Var.r(false);
            } else {
                c36Var = c36Var2;
                i3 = 0;
                v8i0.i(24.0f, 1617501479, x340Var, x340Var, nim0Var);
                x340Var.r(false);
            }
            pl3 pl3Var3 = pl3Var;
            jw31 jw31VarA2 = ew31.a(c36Var, pl3Var3, x340Var, i3);
            int iHashCode5 = Long.hashCode(x340Var.T);
            xos0 xos0VarM5 = x340Var.m();
            qim0 qim0VarE5 = zr7.E(x340Var, nim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function5);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA2, x340Var, lljVar4);
            nko1.H(xos0VarM5, x340Var, lljVar3);
            x0d.q(iHashCode5, x340Var, lljVar2, x340Var);
            nko1.H(qim0VarE5, x340Var, lljVar);
            if (list2.isEmpty()) {
                x340Var.i0(-286407551);
                x340Var.r(false);
            } else {
                x340Var.i0(-286738135);
                List<nni0> list3 = list2;
                ArrayList arrayList = new ArrayList(q7h.U(list3, 10));
                for (nni0 nni0Var : list3) {
                    arrayList.add(new phx(10, 0L, nni0Var.b, (String) null, nni0Var.a));
                }
                fc11.a(mqo1.A(arrayList), (qim0) null, hcx.c, (hux) null, true, 6, (gbx) null, (String) null, (idn0) null, x340Var, 221576, 458);
                x340Var.r(false);
            }
            op71.g(x340Var, u291.h(nim0Var, 1.0f).then(new wnb0(1.0f, true)));
            if (str4.length() > 0) {
                x340Var.i0(-286275615);
                if (ihc1.y0(str4)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                y50 y50Var = new y50(str4);
                function1 = function0;
                gbx gbxVar = new gbx(y50Var, function1);
                boolean z3 = (
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: ?: TERNARY (r15v18 'z3' boolean) = (((wrap int:0x0435: ARITH (r16v5 int) & (14 int) A[WRAPPED] (LINE:1078)) == (4 int) || ((wrap int:0x043a: ARITH (r15v3 'i6' int) & (8 int) A[WRAPPED] (LINE:1083)) != (0 int) && (wrap boolean:0x043e: INVOKE (r10v13 'x340Var' p.x340), (r46v0 'coc1Var' p.coc1) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:1087)) == true))) ? true : false in method: p.epo1.w(p.coc1, p.qim0, kotlin.jvm.functions.Function0, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes4.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r16v5 int
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 1519
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.epo1.w(p.coc1, p.qim0, kotlin.jvm.functions.Function0, p.b0k, int):void");
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public static final void x(coc1 coc1Var, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
                int i2;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(-632547679);
                if ((i & 6) == 0) {
                    i2 = ((i & 8) == 0 ? x340Var.g(coc1Var) : x340Var.i(coc1Var) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= x340Var.i(qim0Var) ? 32 : 16;
                }
                if ((i & 384) == 0) {
                    i2 |= x340Var.i(function0) ? 256 : 128;
                }
                if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                    int iC = l1d.C(coc1Var.j);
                    if (iC == 0) {
                        x340Var.i0(2007042945);
                        w(coc1Var, qim0Var, function0, x340Var, i2 & 1022);
                        x340Var.r(false);
                    } else {
                        if (iC != 1) {
                            throw p3d1.k(x340Var, 2007040928, false);
                        }
                        x340Var.i0(2007048240);
                        i(coc1Var, qim0Var, x340Var, i2 & 126);
                        x340Var.r(false);
                    }
                } else {
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new aoc1(coc1Var, qim0Var, function0, i, (byte) 1);
                }
            }

            public static final void y(e680 e680Var, Function0 function0, z710 z710Var, n9i1 n9i1Var, qim0 qim0Var, b0k b0kVar, int i) {
                qim0 qim0Var2;
                m4c m4cVar = fkj0.X;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(-154198323);
                int i2 = i | (x340Var.i(e680Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(z710Var) ? 256 : 128) | (x340Var.i(n9i1Var) ? 2048 : 1024) | 24576;
                if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
                    ven0 ven0VarH = rwq.h(e680Var.b, x340Var, 0);
                    qim0 qim0Var3 = nim0.a;
                    qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
                    WeakHashMap weakHashMap = osl1.x;
                    qim0 qim0VarP = x0d.p(lhc.g(x340Var).g, 32, qim0VarF);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var).b;
                    qim0 qim0VarD = u291.D(uyn1.x(qim0VarP, 16.0f), een.Q0, 2);
                    boolean zBooleanValue = ((Boolean) ven0VarH.getValue()).booleanValue();
                    boolean zI = x340Var.i(e680Var) | x340Var.i(n9i1Var);
                    Object objT = x340Var.T();
                    if (zI || objT == m4cVar) {
                        objT = new rzf1(e680Var, n9i1Var, (byte) 19);
                        x340Var.s0(objT);
                    }
                    iu30 iu30Var = (iu30) objT;
                    boolean zI2 = x340Var.i(n9i1Var) | x340Var.i(z710Var);
                    Object objT2 = x340Var.T();
                    if (zI2 || objT2 == m4cVar) {
                        objT2 = new mah1(n9i1Var, z710Var, (byte) 8);
                        x340Var.s0(objT2);
                    }
                    c((i2 << 3) & 896, function0, (Function0) objT2, x340Var, iu30Var, qim0VarD, zBooleanValue);
                    qim0Var2 = qim0Var3;
                } else {
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new tte1((byte) 9, i, e680Var, function0, z710Var, n9i1Var, qim0Var2);
                }
            }

            public static final void z(w9p0 w9p0Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
                int i2;
                qim0 qim0Var2;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(-1306856549);
                if ((i & 6) == 0) {
                    i2 = (x340Var.g(w9p0Var) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                int i3 = i2 | 48;
                if ((i & 384) == 0) {
                    i3 |= x340Var.i(iu30Var) ? 256 : 128;
                }
                if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
                    qim0 qim0Var3 = nim0.a;
                    qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
                    nx61 nx61Var = vu40.h;
                    w3d1.a(qim0VarD, (hw61) null, poz0.r(x340Var).f, 0L, 0.0f, 0.0f, (qqb) null, apo.r(981146656, new jyo0(w9p0Var, iu30Var, (byte) 2), x340Var), x340Var, 12582912, 122);
                    qim0Var2 = qim0Var3;
                } else {
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new v7p0(w9p0Var, qim0Var2, iu30Var, i, (byte) 1);
                }
            }

            public abstract String E();

            public abstract zks0 F();

            public abstract c380 G();
        }
