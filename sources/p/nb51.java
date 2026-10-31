package p;

import android.content.Context;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import com.spotify.mobius.Next;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class nb51 {
    public static b180 a;

    public static final jfl A(uel uelVar) {
        List listC = C(uelVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listC) {
            if (!((vcl) obj).e) {
                arrayList.add(obj);
            }
        }
        List listC2 = C(uelVar);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : listC2) {
            if (((vcl) obj2).e) {
                arrayList2.add(obj2);
            }
        }
        xel xelVar = uelVar.a;
        boolean zJ = u890.j(xelVar, vel.a);
        Set setV0 = w7x.a;
        if (!zJ) {
            if (xelVar instanceof xel) {
                if (arrayList.isEmpty()) {
                    setV0 = dm61.v0(uelVar.d, uelVar.c);
                } else {
                    Set setP1 = o7h.p1(xelVar.a);
                    ArrayList arrayList3 = new ArrayList(q7h.U(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((vcl) it.next()).a);
                    }
                    setV0 = o7h.v0(setP1, o7h.p1(arrayList3));
                }
            } else if (!(xelVar instanceof wel)) {
                eg.o();
                return null;
            }
        }
        ArrayList arrayListN0 = o7h.N0(arrayList2, arrayList);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayListN0) {
            if (setV0.contains(((vcl) obj3).a)) {
                arrayList4.add(obj3);
            }
        }
        int i = 0;
        if (!arrayList.isEmpty()) {
            int size = arrayList4.size();
            if (size != 0) {
                i = 1;
                if (size != 1) {
                    i = 2;
                }
            }
        } else if (!arrayList4.isEmpty()) {
            i = 3;
        }
        vcl vclVar = (vcl) o7h.C0(arrayList4);
        return new jfl(i, vclVar != null ? vclVar.a : null, arrayList, arrayList2);
    }

    public static final Map B(uel uelVar) {
        yel yelVar = uelVar.a;
        if (!(yelVar instanceof xel) && !(yelVar instanceof wel)) {
            return b7x.a;
        }
        Set set = uelVar.d;
        int iS = zno1.s(q7h.U(set, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Object obj : set) {
            linkedHashMap.put(obj, Boolean.valueOf(uelVar.c.contains((String) obj)));
        }
        return linkedHashMap;
    }

    public static final List C(uel uelVar) {
        List list = uelVar.b;
        xel xelVar = uelVar.a;
        if (!u890.j(xelVar, vel.a)) {
            if (xelVar instanceof xel) {
                Set setP1 = o7h.p1(xelVar.a);
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (setP1.contains(((vcl) obj).a)) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
            if (!(xelVar instanceof wel)) {
                eg.o();
                return null;
            }
        }
        return list;
    }

    public static qim0 D(qim0 qim0Var, idn0 idn0Var) {
        return qim0Var.then(new fy60(idn0Var));
    }

    public static final boolean E(qlf1 qlf1Var) {
        return (!o0c.j(qlf1Var.a, qlf1Var.z, qlf1Var.i.equals(gql.b) ^ true) || qlf1Var.t || qlf1Var.f34p) ? false : true;
    }

    public static final boolean F(nyf1 nyf1Var) {
        return (!o0c.j(nyf1Var.a, nyf1Var.x, nyf1Var.h.equals(gql.b) ^ true) || nyf1Var.u || nyf1Var.n) ? false : true;
    }

    public static final boolean G(tdy0 tdy0Var) {
        return tdy0Var.b() == null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00af  */
    /* JADX WARN: Code duplicated, block: B:41:0x010b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0113  */
    /* JADX WARN: Code duplicated, block: B:44:0x0116  */
    /* JADX WARN: Code duplicated, block: B:46:0x011a  */
    /* JADX WARN: Code duplicated, block: B:47:0x011d  */
    /* JADX WARN: Code duplicated, block: B:50:0x012d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0097, code lost:
    
        if (r2 == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c8, code lost:
    
        if (r2 == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ca, code lost:
    
        return r8;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00c8 -> B:28:0x00cb). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object H(p.c9n r19, p.jyv0 r20, long r21, p.xd2 r23, p.onm r24) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.nb51.H(p.c9n, p.jyv0, long, p.xd2, p.onm):java.lang.Object");
    }

    public static final mmr0 I(int i, String str) {
        int iV0;
        String string = ihc1.e1(str).toString();
        if (string.length() == 0 || (iV0 = ihc1.v0(str, ihc1.p0(string), 0, 6)) < 0) {
            iV0 = 0;
        }
        return new mmr0(string, Integer.valueOf(yoi1.p(i - iV0, 0, string.length())));
    }

    public static final Next J(uel uelVar, qel qelVar) {
        uel uelVarA;
        Set set = uelVar.c;
        Set set2 = uelVar.d;
        Object obj = null;
        if (qelVar instanceof jel) {
            for (Object obj2 : C(uelVar)) {
                if (u890.j(((vcl) obj2).a, ((jel) qelVar).a)) {
                    obj = obj2;
                    break;
                }
            }
            vcl vclVar = (vcl) obj;
            return vclVar == null ? Next.j() : Next.i(uelVar, Collections.singleton(new fel(vclVar.g)));
        }
        if (qelVar instanceof oel) {
            if (x(uelVar)) {
                List<vcl> listC = C(uelVar);
                if (!(listC instanceof Collection) || !listC.isEmpty()) {
                    for (vcl vclVar2 : listC) {
                        String str = vclVar2.a;
                        oel oelVar = (oel) qelVar;
                        String str2 = oelVar.a;
                        if (u890.j(str, str2) && vclVar2.e) {
                            return Next.h(uel.a(uelVar, null, oelVar.b ? dm61.x0(str2, set) : dm61.u0(str2, set), dm61.x0(str2, set2), 19));
                        }
                    }
                }
            }
            return Next.j();
        }
        if (qelVar.equals(nel.a)) {
            return Next.i(uelVar, Collections.singleton(gel.a));
        }
        if (qelVar.equals(mel.a)) {
            return Next.j();
        }
        if (!(qelVar instanceof lel)) {
            if (qelVar.equals(kel.a)) {
                return Next.j();
            }
            if (!qelVar.equals(pel.a)) {
                eg.o();
                return null;
            }
            if (uelVar.e) {
                return Next.j();
            }
            uel uelVarA2 = uel.a(uelVar, null, null, null, 15);
            Map mapB = B(uelVar);
            ArrayList arrayList = new ArrayList(mapB.size());
            for (Map.Entry entry : mapB.entrySet()) {
                arrayList.add(new ldl((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
            }
            return Next.i(uelVarA2, Collections.singleton(new hel(new ofl(arrayList))));
        }
        List list = uelVar.b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list) {
            if (((vcl) obj3).e) {
                arrayList2.add(obj3);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((vcl) it.next()).a);
        }
        List list2 = ((lel) qelVar).a;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj4 : list2) {
            if (((vcl) obj4).e) {
                arrayList3.add(obj4);
            }
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            linkedHashSet2.add(((vcl) it2.next()).a);
        }
        LinkedHashSet linkedHashSetV0 = o7h.v0(set, linkedHashSet2);
        xel xelVar = uelVar.a;
        if (u890.j(xelVar, vel.a)) {
            uelVarA = uel.a(uelVar, list2, linkedHashSetV0, null, 25);
        } else if (xelVar instanceof xel) {
            Set setP1 = o7h.p1(xelVar.a);
            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
            for (Object obj5 : setP1) {
                String str3 = (String) obj5;
                if (linkedHashSet.contains(str3) != linkedHashSet2.contains(str3)) {
                    linkedHashSet3.add(obj5);
                }
            }
            uelVarA = uel.a(uelVar, list2, dm61.y0(linkedHashSetV0, o7h.v0(linkedHashSet3, linkedHashSet2)), dm61.y0(set2, linkedHashSet3), 17);
        } else {
            if (!(xelVar instanceof wel)) {
                eg.o();
                return null;
            }
            uelVarA = uel.a(uelVar, list2, dm61.y0(linkedHashSetV0, dm61.v0(linkedHashSet2, linkedHashSet)), dm61.y0(set2, dm61.y0(dm61.v0(linkedHashSet, linkedHashSet2), dm61.v0(linkedHashSet2, linkedHashSet))), 17);
        }
        return uelVarA.equals(uelVar) ? Next.j() : Next.h(uelVarA);
    }

    public static final void a(float f, iu30 iu30Var, Function0 function0, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        Function0 function1;
        b0k b0kVar2;
        long j;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1407221551);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.d(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function1 = function0;
            i2 |= b0kVar3.i(function1) ? 256 : 128;
        } else {
            function1 = function0;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? 16384 : 8192;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            ss50 ss50Var = (ss50) b0kVar3.k(t4k.l);
            Object objT = b0kVar3.T();
            if (objT == m4cVar) {
                objT = bb00.h(-1, b0kVar3);
            }
            hdn0 hdn0Var = (hdn0) objT;
            if (z) {
                b0kVar3.i0(574799864);
                uwr uwrVar = cbx.a;
                j = cbx.a(b0kVar3).c.b;
            } else {
                b0kVar3.i0(574801117);
                uwr uwrVar2 = cbx.a;
                j = cbx.a(b0kVar3).c.c;
            }
            b0kVar3.r(false);
            tr80 tr80Var = new tr80(1, 3, 1);
            ArrayList arrayList = new ArrayList(q7h.U(tr80Var, 10));
            lr80 it = tr80Var.iterator();
            while (((sr80) it).c) {
                arrayList.add(Float.valueOf(it.nextInt() / 4.0f));
            }
            uwr uwrVar3 = cbx.a;
            swx swxVarP = fuo1.p(0L, j, cbx.a(b0kVar3).c.b, b0kVar3, 235);
            boolean zI = b0kVar3.i(hdn0Var) | b0kVar3.i(ss50Var) | ((i2 & 112) == 32);
            Object objT2 = b0kVar3.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new gnf0(hdn0Var, ss50Var, iu30Var, (byte) 27);
                b0kVar3.s0(objT2);
            }
            int i3 = i2 >> 6;
            b0kVar2 = b0kVar3;
            guo1.g(f, (iu30) objT2, qim0Var, (qim0) null, false, (ksg) null, 3, arrayList, (Function0) null, function1, (vu30) null, (vu30) null, (idn0) null, swxVarP, 0, (String) null, false, (zwx) null, b0kVar2, (i2 & 14) | 12582912 | (i3 & 896), i3 & 14, 2079352);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new m140(f, iu30Var, function0, z, qim0Var, i);
        }
    }

    public static final void b(q541 q541Var, int i, String str, b0k b0kVar, int i2) {
        b0k b0kVar2;
        h311 h311VarV;
        v541 v541Var;
        int i3;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(833225542);
        int i4 = (b0kVar3.e(i != 0 ? l1d.C(i) : -1) ? 32 : 16) | i2 | (b0kVar3.e(q541Var == null ? -1 : q541Var.ordinal()) ? 4 : 2) | (b0kVar3.g(str) ? 256 : 128);
        if (b0kVar3.Y(i4 & 1, (i4 & 147) != 146)) {
            if (q541Var == null || i == 0 || str == null) {
                h311VarV = b0kVar3.v();
                if (h311VarV == null) {
                    return;
                } else {
                    v541Var = new v541(q541Var, i, str, i2, (byte) 0);
                }
            } else {
                switch (i) {
                    case 1:
                        i3 = 2131962722;
                        break;
                    case 2:
                        i3 = 2131962724;
                        break;
                    case 3:
                        i3 = 2131962721;
                        break;
                    case 4:
                        i3 = 2131962726;
                        break;
                    case 5:
                        i3 = 2131962723;
                        break;
                    case 6:
                        i3 = 2131962725;
                        break;
                    default:
                        throw null;
                }
                String strO0 = cwl1.o0(b0kVar3, i3);
                String strO1 = cwl1.o0(b0kVar3, q541Var.a);
                int i5 = Integer.parseInt(str);
                int i6 = i5 / 60;
                int i7 = i5 % 60;
                String str2 = i6 + ":" + ihc1.F0(2, String.valueOf(i7));
                String strI = xcg1.i(cwl1.U(2131820920, i6, new Object[]{Integer.valueOf(i6)}, b0kVar3), ", ", cwl1.U(2131820921, i7, new Object[]{Integer.valueOf(i7)}, b0kVar3));
                String strN0 = cwl1.n0(2131962720, new Object[]{strO1, strO0, str2}, b0kVar3);
                String strN1 = cwl1.n0(2131962720, new Object[]{strO1, strO0, strI}, b0kVar3);
                qim0 qim0VarN = anm1.N("sample_info", nim0.a);
                boolean zG = b0kVar3.g(strN1);
                Object objT = b0kVar3.T();
                if (zG || objT == fkj0.X) {
                    objT = new sc21(strN1, (byte) 16);
                    b0kVar3.s0(objT);
                }
                qim0 qim0VarB = s161.b(qim0VarN, false, (iu30) objT);
                uwr uwrVar = cbx.a;
                b0kVar2 = b0kVar3;
                uwo1.e(strN0, qim0VarB, cbx.d(b0kVar3).j, cbx.a(b0kVar3).b.b, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar2, 0, 0, 1712);
            }
            h311VarV.d = v541Var;
        }
        b0kVar2 = b0kVar3;
        b0kVar2.b0();
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            v541Var = new v541(q541Var, i, str, i2, (byte) 1);
            h311VarV.d = v541Var;
        }
    }

    public static final void c(r541 r541Var, tyq tyqVar, idm idmVar, jyo jyoVar, xoq xoqVar, b9u0 b9u0Var, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        int i2;
        q8u0 g641Var;
        String str = r541Var.n;
        jfv jfvVar = r541Var.f;
        Object obj = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(692096050);
        int i3 = i | (b0kVar3.g(r541Var) ? 4 : 2) | (b0kVar3.i(tyqVar) ? 32 : 16) | (b0kVar3.i(idmVar) ? 256 : 128) | (b0kVar3.i(jyoVar) ? 2048 : 1024) | (b0kVar3.g(xoqVar) ? 16384 : 8192) | (b0kVar3.g(b9u0Var) ? 131072 : 65536) | 1572864 | (b0kVar3.i(function0) ? 8388608 : 4194304);
        if (b0kVar3.Y(i3 & 1, (4793491 & i3) != 4793490)) {
            boolean z = jfvVar == null;
            boolean zE = b0kVar3.e(r541Var.l.ordinal()) | b0kVar3.g(str) | b0kVar3.g(jfvVar);
            Object objT = b0kVar3.T();
            if (zE || objT == obj) {
                if (jfvVar != null) {
                    long jH = jfv.h(jfvVar.a);
                    tjq tjqVar = (tjq) xoqVar.a.c;
                    e821 e821Var = (e821) tjqVar.b;
                    yqg yqgVar = (yqg) ((e821) tjqVar.b).b;
                    c8o.l(yqgVar);
                    t8u0 t8u0Var = (t8u0) e821Var.a;
                    krw0 krw0Var = krw0.i;
                    muz muzVarD = t8u0Var.a(krw0Var.f).d();
                    zeu0 zeu0Var = (zeu0) e821Var.c;
                    c8o.l(zeu0Var);
                    i2 = 8388608;
                    g641Var = new g641(yqgVar, muzVarD, zeu0Var, ((t8u0) e821Var.a).a(krw0Var.f).a(), str, jH, b9u0Var);
                } else {
                    i2 = 8388608;
                    g641Var = fgh1.a;
                }
                objT = jyoVar.a(g641Var, new bz0(3, (lnm) null, (byte) 29));
                b0kVar3.s0(objT);
            } else {
                i3 = i3;
                z = z;
                i2 = 8388608;
            }
            gft0 gft0Var = (gft0) objT;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            uvx uvxVar = new uvx(1, (pgx) null, 3, new zzq0(16.0f, 8.0f, 16.0f, 8.0f), (zzq0) null, (tvx) null, (hw61) null, 0, (p3v) null, 498);
            qim0Var2 = nim0.a;
            qim0 qim0VarN = anm1.N("row", u291.f(qim0Var2, 1.0f));
            String strO0 = cwl1.o0(b0kVar3, 2131962719);
            if (ihc1.y0(strO0)) {
                hhg1.n("Please consider providing a non-empty action label to provide a more accessible experience for everyone. You can use SelfDescribed if the content description is sufficient.");
                return;
            }
            y50 y50Var = new y50(strO0);
            boolean z2 = (i3 & 29360128) == i2;
            Object objT2 = b0kVar3.T();
            if (z2 || objT2 == obj) {
                objT2 = new us21(function0, (byte) 13);
                b0kVar3.s0(objT2);
            }
            b0kVar2 = b0kVar3;
            boolean z3 = z;
            jto1.b(qim0VarN, uvxVar, (max) null, false, (idn0) null, (ga80) null, new gbx(y50Var, (Function0) objT2), (gbx) null, (xu30) null, apo.r(-516227365, new lw11(r541Var, (byte) 22), b0kVar3), (xu30) null, apo.r(1380898810, new w541(r541Var, z), b0kVar3), fej.a, (xu30) null, apo.r(99089623, new hh1(r541Var, gft0Var, z3, tyqVar, idmVar, (byte) 12), b0kVar2), apo.r(-328180106, new w541(z3, r541Var), b0kVar2), b0kVar2, 805306432, 221616, 9660);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new n(r541Var, tyqVar, idmVar, jyoVar, xoqVar, b9u0Var, qim0Var2, function0, i);
        }
    }

    public static final void d(b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1642582852);
        if (b0kVar3.Y(i & 1, i != 0)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            b0kVar2 = b0kVar3;
            jto1.b(anm1.N("row", u291.f(nim0.a, 1.0f)), new uvx(1, (pgx) null, 3, new zzq0(16.0f, 8.0f, 16.0f, 8.0f), (zzq0) null, (tvx) null, (hw61) null, 0, (p3v) null, 498), (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, fej.b, (xu30) null, fej.c, fej.d, (xu30) null, (xu30) null, fej.e, b0kVar2, 805306432, 197040, 26108);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new fk01(i, (byte) 11);
        }
    }

    public static final void e(hob1 hob1Var, j2i j2iVar, Function0 function0, Function0 function1, qim0 qim0Var, vu30 vu30Var, vu30 vu30Var2, vu30 vu30Var3, float f, b0k b0kVar, int i) {
        qim0 qim0Var2;
        qim0 qim0Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1445567512);
        int i2 = i | (x340Var.i(hob1Var) ? 4 : 2) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(function1) ? 2048 : 1024) | 24576 | (x340Var.d(f) ? 67108864 : 33554432);
        if (x340Var.Y(i2 & 1, (38347923 & i2) != 38347922)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                qim0Var3 = nim0.a;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var;
            }
            x340Var.s();
            nyx.a(2, (wux) null, apo.r(-1893794069, new ttf0(hob1Var, qim0Var3, f, function1, function0, vu30Var2, vu30Var3, j2iVar, vu30Var), x340Var), x340Var, 3078, 6);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ttf0(hob1Var, j2iVar, function0, function1, qim0Var2, vu30Var, vu30Var2, vu30Var3, f, i);
        }
    }

    public static final void f(String str, int i, long j, long j2, long j3, lee1 lee1Var, b0k b0kVar, int i2) {
        int i3;
        x340 x340Var;
        int i4;
        int i5;
        m4c m4cVar;
        ven0 ven0Var;
        int i6;
        x340 x340Var2;
        float f;
        Object objA;
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(-539814736);
        if ((i2 & 6) == 0) {
            i3 = (x340Var3.g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var3.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var3.f(j) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var3.f(j2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var3.f(j3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= x340Var3.i(lee1Var) ? 131072 : 65536;
        }
        int i7 = i3;
        if (x340Var3.Y(i7 & 1, (74899 & i3) != 74898)) {
            mmr0 mmr0VarI = I(i, str);
            String str2 = (String) mmr0VarI.a;
            int iIntValue = ((Number) mmr0VarI.b).intValue();
            Object objT = x340Var3.T();
            m4c m4cVar2 = fkj0.X;
            if (objT == m4cVar2) {
                objT = v8r.q((Object) null);
                x340Var3.s0(objT);
            }
            ven0 ven0Var2 = (ven0) objT;
            kiv kivVar = t4k.h;
            float fX0 = ((wat) x340Var3.k(kivVar)).X0(2.0f);
            wat watVar = (wat) x340Var3.k(kivVar);
            boolean zG = x340Var3.g(lee1Var);
            Object objT2 = x340Var3.T();
            if (zG || objT2 == m4cVar2) {
                long j4 = lee1Var.a.b;
                long jL = (j4 & 1095216660480L) == 0 ? lee1Var.b.c : watVar.L(watVar.q0(j4) + 8.0f);
                i4 = iIntValue;
                i5 = i7;
                m4cVar = m4cVar2;
                ven0Var = ven0Var2;
                i6 = 4;
                x340Var2 = x340Var3;
                f = fX0;
                objA = lee1.a(lee1Var, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, jL, (u8e1) null, (wdt0) null, (shc0) null, 0, 16646143);
                x340Var2.s0(objA);
            } else {
                x340Var2 = x340Var3;
                m4cVar = m4cVar2;
                i4 = iIntValue;
                i5 = i7;
                ven0Var = ven0Var2;
                i6 = 4;
                objA = objT2;
                f = fX0;
            }
            lee1 lee1Var2 = (lee1) objA;
            cjc0 cjc0Var = new cjc0(i6);
            qim0 qim0VarN = anm1.N("transcript-text", u291.f(nim0.a, 1.0f));
            boolean zI = x340Var2.i(ven0Var) | ((i5 & 57344) == 16384) | x340Var2.d(f);
            Object objT3 = x340Var2.T();
            if (zI || objT3 == m4cVar) {
                of0 of0Var = new of0(j3, f, ven0Var, (byte) 3);
                x340Var2.s0(of0Var);
                objT3 = of0Var;
            }
            qim0 qim0VarQ = exd0.q(qim0VarN, (iu30) objT3);
            int i8 = i4;
            int i9 = i5;
            boolean zI2 = x340Var2.i(ven0Var) | x340Var2.e(i8) | ((i9 & 896) == 256);
            Object objT4 = x340Var2.T();
            if (zI2 || objT4 == m4cVar) {
                objT4 = new ftj0(i8, j, ven0Var);
                x340Var2.s0(objT4);
            }
            qim0 qim0VarS = exd0.s(qim0VarQ, (iu30) objT4);
            a0e1 a0e1Var = new a0e1(5);
            boolean zI3 = x340Var2.i(ven0Var);
            Object objT5 = x340Var2.T();
            if (zI3 || objT5 == m4cVar) {
                objT5 = new i2g1(ven0Var, (byte) 1);
                x340Var2.s0(objT5);
            }
            x340 x340Var4 = x340Var2;
            uwo1.e(str2, qim0VarS, lee1Var2, j2, a0e1Var, (iu30) objT5, 0, false, cjc0Var, 0, (qx8) null, x340Var4, i9 & 7168, 0, 1728);
            x340Var = x340Var4;
        } else {
            x340Var = x340Var3;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new z9g1(str, i, j, j2, j3, lee1Var, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v4 */
    public static final void g(List list, Set set, Integer num, boolean z, iu30 iu30Var, iu30 iu30Var2, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) {
        qim0 qim0Var2;
        vu30 vu30Var;
        qim0 qim0Var3;
        vu30 vu30Var2;
        ?? r5;
        boolean z2;
        long j;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(837308663);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(list) ? 4 : 2) | (x340Var.g(set) ? 32 : 16) | (x340Var.g(num) ? 256 : 128) | (x340Var.h(z) ? 2048 : 1024) | (x340Var.i(iu30Var) ? 16384 : 8192) | (x340Var.i(iu30Var2) ? 131072 : 65536) | 1572864 | (x340Var.i(function0) ? 8388608 : 4194304);
        if (x340Var.Y(i2 & 1, (i2 & 4793491) != 4793490)) {
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var4, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            vu30 vu30Var3 = y580.O0;
            nko1.H(mbhVarA, x340Var, vu30Var3);
            vu30 vu30Var4 = y580.N0;
            nko1.H(xos0VarM, x340Var, vu30Var4);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar);
            nko1.F(x340Var);
            llj lljVar2 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar2);
            if (list.isEmpty()) {
                vu30Var = vu30Var3;
                qim0Var3 = qim0Var4;
                vu30Var2 = vu30Var4;
                r5 = 0;
                x340Var.i0(-429245471);
                x340Var.r(false);
            } else {
                x340Var.i0(-429925859);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                qim0 qim0VarZ = uyn1.z(0.0f, 16.0f, 1, qim0Var4);
                cvx cvxVar2 = cbx.b(x340Var).b;
                zzq0 zzq0VarH = uyn1.h(2, 16.0f, 0.0f);
                cvx cvxVar3 = cbx.b(x340Var).b;
                d36 d36Var = new d36(8.0f, true, new um5(false));
                boolean z4 = ((i2 & 112) == 32) | ((i2 & 14) == 4) | ((i2 & 57344) == 16384);
                Object objT = x340Var.T();
                if (z4 || objT == m4cVar) {
                    objT = new gnf0(list, set, iu30Var, (byte) 28);
                    x340Var.s0(objT);
                }
                qim0Var3 = qim0Var4;
                vu30Var2 = vu30Var4;
                vu30Var = vu30Var3;
                r5 = 0;
                ujo1.e(qim0VarZ, (xtb0) null, zzq0VarH, d36Var, (pl3) null, (iq20) null, false, (hxq0) null, (iu30) objT, x340Var, 0, 490);
                x340Var = x340Var;
                x340Var.r(false);
            }
            if (z) {
                x340Var.i0(-429152440);
                ?? r25 = num == null ? 1 : r5;
                uwr uwrVar2 = cbx.a;
                op71.g(x340Var, u291.h(qim0Var3, cbx.b(x340Var).b.c));
                String strO0 = cwl1.o0(x340Var, r25 != 0 ? 2131963897 : 2131963896);
                lee1 lee1Var = cbx.d(x340Var).h;
                if (r25 != 0) {
                    x340Var.i0(1233100520);
                    j = cbx.a(x340Var).b.b;
                } else {
                    x340Var.i0(1233101605);
                    j = cbx.a(x340Var).b.a;
                }
                x340Var.r((boolean) r5);
                cvx cvxVar4 = cbx.b(x340Var).b;
                cvx cvxVar5 = cbx.b(x340Var).b;
                x340 x340Var2 = x340Var;
                uwo1.e(strO0, uyn1.B(qim0Var3, 16.0f, 0.0f, 16.0f, 0.0f, 10), lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2032);
                float fIntValue = (num != null ? num.intValue() : 50) / 100.0f;
                ?? r11 = (i2 & 458752) == 131072 ? 1 : r5;
                Object objT2 = x340Var2.T();
                if (r11 != 0 || objT2 == m4cVar) {
                    objT2 = new wck0(iu30Var2, (byte) 6);
                    x340Var2.s0(objT2);
                }
                qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
                cvx cvxVar6 = cbx.b(x340Var2).b;
                cvx cvxVar7 = cbx.b(x340Var2).b;
                cvx cvxVar8 = cbx.b(x340Var2).b;
                a(fIntValue, (iu30) objT2, function0, r25, uyn1.B(qim0VarF2, 16.0f, 8.0f, 16.0f, 0.0f, 8), x340Var2, (i2 >> 15) & 896);
                qim0 qim0VarF3 = u291.f(qim0Var3, 1.0f);
                cvx cvxVar9 = cbx.b(x340Var2).b;
                qim0 qim0VarZ2 = uyn1.z(16.0f, 0.0f, 2, qim0VarF3);
                jw31 jw31VarA = ew31.a(h36.g, een.Z, x340Var2, (int) r5);
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarZ2);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(jw31VarA, x340Var2, vu30Var);
                nko1.H(xos0VarM2, x340Var2, vu30Var2);
                x0d.q(iHashCode2, x340Var2, lljVar, x340Var2);
                nko1.H(qim0VarE2, x340Var2, lljVar2);
                uwo1.e(cwl1.o0(x340Var2, 2131963898), (qim0) null, cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2034);
                uwo1.e(cwl1.o0(x340Var2, 2131963899), (qim0) null, cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2034);
                x340Var = x340Var2;
                z2 = true;
                x340Var.r(true);
                x340Var.r((boolean) r5);
            } else {
                z2 = true;
                x340Var.i0(-427252543);
                x340Var.r((boolean) r5);
            }
            x340Var.r(z2);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q3(list, set, num, z, iu30Var, iu30Var2, qim0Var2, function0, i);
        }
    }

    public static final void h(r7x0 r7x0Var, boolean z, qim0 qim0Var, int i, iu30 iu30Var, b0k b0kVar, int i2) {
        iu30 iu30Var2;
        qim0 qim0VarJ;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-929303378);
        int i3 = (x340Var.g(r7x0Var) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i3 |= x340Var.h(z) ? 32 : 16;
        }
        int i4 = i3 | (x340Var.g(qim0Var) ? 256 : 128) | (x340Var.e(i) ? 2048 : 1024);
        if ((i2 & 24576) == 0) {
            iu30Var2 = iu30Var;
            i4 |= x340Var.i(iu30Var2) ? 16384 : 8192;
        } else {
            iu30Var2 = iu30Var;
        }
        if (x340Var.Y(i4 & 1, (i4 & 9363) != 9362)) {
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).a.c;
            wat watVar = (wat) x340Var.k(t4k.h);
            qim0 qim0VarE = dug.e(dug.f(u291.f(qim0Var, 1.0f), z4p1.e(r7x0Var.k), d4o1.a), v9c.s(p7h.M(new u7h[]{new u7h(u7h.b(j, 0.0f, 0.0f, 0.0f, 0.0f, 14)), new u7h(j)}), 0.0f, 0.0f, 14), (hw61) null, 0.0f, 6);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE2, x340Var, y580.Y);
            nim0 nim0Var = nim0.a;
            if (i > 0) {
                x340Var.i0(-1418317248);
                x340Var.r(false);
                qim0VarJ = u291.h(u291.f(nim0Var, 1.0f), watVar.M0(i));
            } else {
                x340Var.i0(-1418214793);
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                u85 u85Var = (erl1) x340Var.k(szf0.b);
                if (u85Var == null) {
                    x340Var.i0(-241884180);
                    WeakHashMap weakHashMap = osl1.x;
                    u85Var = lhc.g(x340Var).g;
                } else {
                    x340Var.i0(-241885792);
                }
                x340Var.r(false);
                qim0 qim0VarY = too1.y(qim0VarF, new bgc0(u85Var, 16));
                mta mtaVar = cbx.b(x340Var).d;
                qim0VarJ = u291.j(56.0f, 0.0f, 2, qim0VarY);
                x340Var.r(false);
            }
            op71.g(x340Var, qim0VarJ);
            j541.f(r7x0Var, z, iu30Var2, (qim0) null, x340Var, (i4 & 126) | ((i4 >> 6) & 896));
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new w7x0(r7x0Var, z, qim0Var, i, iu30Var, i2);
        }
    }

    public static final void i(r7x0 r7x0Var, lww0 lww0Var, boolean z, iu30 iu30Var, b0k b0kVar, int i) {
        lww0 lww0Var2;
        iu30 iu30Var2;
        boolean z2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1712014448);
        int i2 = i | (x340Var.g(r7x0Var) ? 4 : 2) | (x340Var.g(lww0Var) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | (x340Var.i(iu30Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).a.c;
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            int i3 = i2 & 112;
            boolean z3 = i3 == 32;
            Object objT = x340Var.T();
            if (z3 || objT == m4cVar) {
                z2 = false;
                objT = new x7x0(lww0Var, (byte) 0);
                x340Var.s0(objT);
            } else {
                z2 = false;
            }
            qim0 qim0VarU = lrn1.u(nim0Var, (iu30) objT);
            boolean z4 = i3 != 32 ? z2 : true;
            Object objT2 = x340Var.T();
            if (z4 || objT2 == m4cVar) {
                objT2 = new x7x0(lww0Var, (byte) 1);
                x340Var.s0(objT2);
            }
            int i4 = (i2 & 14) | ((i2 >> 3) & 112);
            int i5 = i2 << 3;
            h(r7x0Var, z, i541.C(qim0VarU, (iu30) objT2), lww0Var.b.s(), iu30Var, x340Var, i4 | (i5 & 57344));
            iu30Var2 = iu30Var;
            j(z4p1.e(r7x0Var.k), j, lww0Var, x340Var, i5 & 896);
            lww0Var2 = lww0Var;
            boolean z5 = i3 != 32 ? z2 : true;
            Object objT3 = x340Var.T();
            if (z5 || objT3 == m4cVar) {
                objT3 = new x7x0(lww0Var2, (byte) 2);
                x340Var.s0(objT3);
            }
            qim0 qim0VarU2 = lrn1.u(nim0Var, (iu30) objT3);
            j2i j2iVarR = apo.r(-1206685610, new y6w0(r7x0Var, (byte) 8), x340Var);
            ygr0 ygr0Var = lww0Var2.d;
            if ((i2 & 7168) == 2048) {
                z2 = true;
            }
            Object objT4 = x340Var.T();
            if (z2 || objT4 == m4cVar) {
                objT4 = new h7w0(iu30Var2, (byte) 7);
                x340Var.s0(objT4);
            }
            bzn1.e(qim0VarU2, j2iVarR, false, (vu30) null, rgr0.a, (ngr0) null, ygr0Var, (Function0) objT4, x340Var, 2097200, 44);
            x340Var.r(true);
        } else {
            lww0Var2 = lww0Var;
            iu30Var2 = iu30Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qy90(r7x0Var, lww0Var2, z, iu30Var2, i, (byte) 20);
        }
    }

    public static final void j(long j, long j2, lww0 lww0Var, b0k b0kVar, int i) {
        int i2;
        h311 h311VarV;
        y7x0 y7x0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-659082023);
        if ((i & 6) == 0) {
            i2 = (x340Var.f(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.f(j2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? x340Var.g(lww0Var) : x340Var.i(lww0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            int iS = lww0Var.a.s();
            int iS2 = lww0Var.b.s();
            if (iS <= 0 || iS2 <= 0) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    y7x0Var = new y7x0(j, j2, lww0Var, i, (byte) 0);
                }
            } else {
                wat watVar = (wat) x340Var.k(t4k.h);
                nim0 nim0Var = nim0.a;
                qim0 qim0VarF = dug.f(i1p1.r(u291.h(u291.f(nim0Var, 1.0f), watVar.M0(iS2))), j, d4o1.a);
                gfh0 gfh0VarC = t1c.c(een.d, false);
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
                qim0 qim0VarH = u291.h(u291.y(u291.f(nim0Var, 1.0f), een.Z, true), watVar.M0(iS));
                boolean z = (i2 & 896) == 256 || ((i2 & 512) != 0 && x340Var.i(lww0Var));
                Object objT = x340Var.T();
                if (z || objT == fkj0.X) {
                    objT = new x7x0(lww0Var, (byte) 3);
                    x340Var.s0(objT);
                }
                t1c.a(dug.e(i541.C(qim0VarH, (iu30) objT), v9c.s(p7h.M(new u7h[]{new u7h(u7h.b(j2, 0.0f, 0.0f, 0.0f, 0.0f, 14)), new u7h(j2)}), 0.0f, 0.0f, 14), (hw61) null, 0.0f, 6), x340Var, 0);
                x340Var.r(true);
            }
            h311VarV.d = y7x0Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            y7x0Var = new y7x0(j, j2, lww0Var, i, (byte) 1);
            h311VarV.d = y7x0Var;
        }
    }

    public static final void k(String str, int i, boolean z, long j, long j2, long j3, lee1 lee1Var, b0k b0kVar, int i2) {
        b0k b0kVar2;
        boolean z2;
        boolean z3;
        ven0 ven0Var;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-290093633);
        int i3 = (b0kVar3.g(str) ? 4 : 2) | i2 | (b0kVar3.e(i) ? 32 : 16) | (b0kVar3.h(z) ? 256 : 128);
        if ((i2 & 3072) == 0) {
            i3 |= b0kVar3.f(j) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= b0kVar3.f(j2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= b0kVar3.f(j3) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= b0kVar3.i(lee1Var) ? 1048576 : 524288;
        }
        if (b0kVar3.Y(i3 & 1, (599187 & i3) != 599186)) {
            mmr0 mmr0VarI = I(i, str);
            String str2 = (String) mmr0VarI.a;
            int iIntValue = ((Number) mmr0VarI.b).intValue();
            if (str2.length() == 0) {
                str2 = " ";
            }
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q((Object) null);
                b0kVar3.s0(objT);
            }
            ven0 ven0Var2 = (ven0) objT;
            kiv kivVar = t4k.h;
            float fX0 = ((wat) b0kVar3.k(kivVar)).X0(2.0f);
            float fX1 = ((wat) b0kVar3.k(kivVar)).X0(4.0f);
            cjc0 cjc0Var = new cjc0(1);
            qim0 qim0VarN = anm1.N("transcript-text", u291.f(nim0.a, 1.0f));
            int i4 = i3 & 896;
            int i5 = i3;
            boolean z4 = i4 == 256;
            Object objT2 = b0kVar3.T();
            if (z4 || objT2 == m4cVar) {
                objT2 = new aag1((byte) 0, z);
                b0kVar3.s0(objT2);
            }
            qim0 qim0VarC = i541.C(qim0VarN, (iu30) objT2);
            boolean zI = ((i5 & 458752) == 131072) | b0kVar3.i(ven0Var2) | (i4 == 256) | b0kVar3.d(fX0) | b0kVar3.d(fX1);
            Object objT3 = b0kVar3.T();
            if (zI || objT3 == m4cVar) {
                z2 = false;
                z3 = true;
                bag1 bag1Var = new bag1(z, j3, fX0, fX1, ven0Var2);
                ven0Var = ven0Var2;
                b0kVar3.s0(bag1Var);
                objT3 = bag1Var;
            } else {
                ven0Var = ven0Var2;
                z2 = false;
                z3 = true;
            }
            qim0 qim0VarQ = exd0.q(qim0VarC, (iu30) objT3);
            boolean zI2 = (i4 == 256 ? z3 : z2) | b0kVar3.i(ven0Var) | b0kVar3.e(iIntValue);
            if ((i5 & 7168) != 2048) {
                z3 = z2;
            }
            boolean z5 = zI2 | z3;
            Object objT4 = b0kVar3.T();
            if (z5 || objT4 == m4cVar) {
                cag1 cag1Var = new cag1(z, iIntValue, j, ven0Var);
                b0kVar3.s0(cag1Var);
                objT4 = cag1Var;
            }
            qim0 qim0VarS = exd0.s(qim0VarQ, (iu30) objT4);
            a0e1 a0e1Var = new a0e1(3);
            boolean zI3 = b0kVar3.i(ven0Var);
            Object objT5 = b0kVar3.T();
            if (zI3 || objT5 == m4cVar) {
                objT5 = new i2g1(ven0Var, (byte) 2);
                b0kVar3.s0(objT5);
            }
            b0kVar2 = b0kVar3;
            uwo1.e(str2, qim0VarS, lee1Var, j2, a0e1Var, (iu30) objT5, 0, false, cjc0Var, 0, (qx8) null, b0kVar2, ((i5 >> 12) & 896) | ((i5 >> 3) & 7168), 0, 1728);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new dag1(str, i, z, j, j2, j3, lee1Var, i2);
        }
    }

    public static final void l(vu30 vu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1108393533);
        int i2 = (x340Var.i(vu30Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, nim0.a);
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
            op71.g(x340Var, kk0.q(x340Var, qim0VarE, y580.Y, 1.0f, true));
            if (vu30Var == null) {
                x340Var.i0(739991382);
            } else {
                c13.o(x340Var, 739991383, 0, vu30Var, x340Var);
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new k7f(i, vu30Var);
        }
    }

    public static final void m(q9g1 q9g1Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1876511091);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(q9g1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            boolean z = q9g1Var.h instanceof n9g1;
            Boolean boolValueOf = Boolean.valueOf(z);
            iu30 iu30Var2 = q9g1Var.k;
            boolean zI = x340Var.i(q9g1Var) | x340Var.h(z);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new b0f1(q9g1Var, z, (lnm) null, (byte) 9);
                x340Var.s0(objT);
            }
            qxd0.s(boolValueOf, iu30Var2, (vu30) objT, x340Var);
            qim0 qim0Var3 = nim0.a;
            w2g0.c(u291.f(qim0Var3, 1.0f), (tl3) null, apo.r(1341347017, new xw91(q9g1Var, iu30Var, (byte) 27), x340Var), x340Var, 3072, 6);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new um81((Object) q9g1Var, (Object) iu30Var, qim0Var2, i, (byte) 20);
        }
    }

    public static final void n(String str, int i, String str2, int i2, long j, long j2, long j3, boolean z, lee1 lee1Var, b0k b0kVar, int i3) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(343796675);
        int i4 = i3 | (x340Var.g(str) ? 4 : 2) | (x340Var.e(i) ? 32 : 16) | (x340Var.g(str2) ? 256 : 128) | (x340Var.e(i2) ? 2048 : 1024) | (x340Var.f(j) ? 16384 : 8192) | (x340Var.f(j2) ? 131072 : 65536) | (x340Var.f(j3) ? 1048576 : 524288) | (x340Var.h(z) ? 8388608 : 4194304) | (x340Var.i(lee1Var) ? 67108864 : 33554432);
        if (!x340Var.Y(i4 & 1, (38347923 & i4) != 38347922)) {
            x340Var.b0();
        } else if (z) {
            x340Var.i0(-1449944142);
            f(str.length() == 0 ? str2 : str, str.length() == 0 ? i2 : i, j, j2, j3, lee1Var, x340Var, ((i4 >> 6) & 65408) | ((i4 >> 9) & 458752));
            x340Var.r(false);
        } else {
            x340Var.i0(-1449577691);
            int i5 = i4 >> 3;
            k(str, i, str.length() == 0, j, j2, j3, lee1Var, x340Var, (i4 & 126) | (i5 & 7168) | (57344 & i5) | (i5 & 458752) | (3670016 & (i4 >> 6)));
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new eag1(str, i, str2, i2, j, j2, j3, z, lee1Var, i3);
        }
    }

    public static final ven0 o(idn0 idn0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = v8r.q(Boolean.FALSE);
            x340Var.s0(objT);
        }
        ven0 ven0Var = (ven0) objT;
        boolean z = (((i & 14) ^ 6) > 4 && x340Var.g(idn0Var)) || (i & 6) == 4;
        Object objT2 = x340Var.T();
        if (z || objT2 == m4cVar) {
            objT2 = new k53(idn0Var, ven0Var, (lnm) null, (byte) 10);
            x340Var.s0(objT2);
        }
        qxd0.t(idn0Var, x340Var, (vu30) objT2);
        return ven0Var;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00c0  */
    public static final CharSequence p(af5 af5Var) {
        List listB = af5Var.b();
        String str = af5Var.b;
        if (listB.isEmpty()) {
            return str;
        }
        SpannableString spannableString = new SpannableString(str);
        mev mevVar = new mev();
        mevVar.b = Parcel.obtain();
        List listB2 = af5Var.b();
        int i = 0;
        for (int size = listB2.size(); i < size; size = size) {
            ze5 ze5Var = (ze5) listB2.get(i);
            zma1 zma1Var = (zma1) ze5Var.a;
            int i2 = ze5Var.b;
            int i3 = ze5Var.c;
            ((Parcel) mevVar.b).recycle();
            mevVar.b = Parcel.obtain();
            j8e1 j8e1Var = zma1Var.a;
            long j = zma1Var.l;
            long j2 = zma1Var.h;
            long j3 = zma1Var.b;
            int i4 = i;
            long jA = j8e1Var.a();
            SpannableString spannableString2 = spannableString;
            List list = listB2;
            long j4 = u7h.k;
            if (!z4h1.b(jA, j4)) {
                mevVar.b((byte) 1);
                ((Parcel) mevVar.b).writeLong(w361.v(zma1Var.a.a()));
            }
            long j5 = TextUnit.c;
            byte b = 2;
            if (!TextUnit.a(j3, j5)) {
                mevVar.b((byte) 2);
                mevVar.f(j3);
            }
            FontWeight fontWeight = zma1Var.c;
            if (fontWeight != null) {
                mevVar.b((byte) 3);
                ((Parcel) mevVar.b).writeInt(fontWeight.a);
            }
            FontStyle fontStyle = zma1Var.d;
            if (fontStyle != null) {
                int i5 = fontStyle.a;
                mevVar.b((byte) 4);
                mevVar.b((i5 != 0 && i5 == 1) ? (byte) 1 : (byte) 0);
            }
            FontSynthesis fontSynthesis = zma1Var.e;
            if (fontSynthesis != null) {
                int i6 = fontSynthesis.a;
                mevVar.b((byte) 5);
                if (i6 == 0) {
                    b = 0;
                } else if (i6 == 65535) {
                    b = 1;
                } else if (i6 != 1) {
                    if (i6 == 2) {
                        b = 3;
                    } else {
                        b = 0;
                    }
                }
                mevVar.b(b);
            }
            String str2 = zma1Var.g;
            if (str2 != null) {
                mevVar.b((byte) 6);
                ((Parcel) mevVar.b).writeString(str2);
            }
            if (!TextUnit.a(j2, j5)) {
                mevVar.b((byte) 7);
                mevVar.f(j2);
            }
            BaselineShift baselineShift = zma1Var.i;
            if (baselineShift != null) {
                float f = baselineShift.a;
                mevVar.b((byte) 8);
                mevVar.e(f);
            }
            TextGeometricTransform textGeometricTransform = zma1Var.j;
            if (textGeometricTransform != null) {
                mevVar.b((byte) 9);
                mevVar.e(textGeometricTransform.a);
                mevVar.e(textGeometricTransform.b);
            }
            if (!z4h1.b(j, j4)) {
                mevVar.b((byte) 10);
                ((Parcel) mevVar.b).writeLong(w361.v(j));
            }
            TextDecoration textDecoration = zma1Var.m;
            if (textDecoration != null) {
                mevVar.b((byte) 11);
                ((Parcel) mevVar.b).writeInt(textDecoration.a);
            }
            Shadow shadow = zma1Var.n;
            if (shadow != null) {
                mevVar.b((byte) 12);
                ((Parcel) mevVar.b).writeLong(w361.v(shadow.a));
                long j6 = shadow.b;
                mevVar.e(Float.intBitsToFloat((int) (j6 >> 32)));
                mevVar.e(Float.intBitsToFloat((int) (j6 & 4294967295L)));
                mevVar.e(shadow.c);
            }
            spannableString2.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(((Parcel) mevVar.b).marshall(), 0)), i2, i3, 33);
            i = i4 + 1;
            spannableString = spannableString2;
            listB2 = list;
        }
        return spannableString;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003d A[Catch: all -> 0x0055, TryCatch #1 {all -> 0x0055, blocks: (B:2:0x0000, B:9:0x001b, B:11:0x0034, B:12:0x0037, B:14:0x003d, B:15:0x0040, B:16:0x0050, B:18:0x0052, B:19:0x0054), top: B:35:0x0000, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0040 A[Catch: all -> 0x0055, TryCatch #1 {all -> 0x0055, blocks: (B:2:0x0000, B:9:0x001b, B:11:0x0034, B:12:0x0037, B:14:0x003d, B:15:0x0040, B:16:0x0050, B:18:0x0052, B:19:0x0054), top: B:35:0x0000, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0057  */
    public static zbc q(kf30 kf30Var, s1c1 s1c1Var, zim0 zim0Var, InputStream inputStream) throws IOException {
        egy0 egy0Var;
        t8 t8Var;
        try {
            xbc xbcVar = xbc.f;
            xbc xbcVarQ = j541.q(inputStream);
            xbc xbcVar2 = xbc.f;
            int i = ((ava) xbcVarQ).c;
            int i2 = ((ava) xbcVar2).c;
            int i3 = ((ava) xbcVarQ).b;
            int i4 = ((ava) xbcVar2).b;
            if (i3 == 0) {
                if (i4 == 0 && i == i2) {
                    vz00 vz00Var = new vz00();
                    acc.a(vz00Var);
                    tja0 tja0Var = egy0.X;
                    tja0Var.getClass();
                    mwg mwgVar = new mwg(inputStream);
                    t8Var = (t8) tja0Var.b(mwgVar, vz00Var);
                    try {
                        mwgVar.a(0);
                        if (t8Var.isInitialized()) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
                            invalidProtocolBufferException.a = t8Var;
                            throw invalidProtocolBufferException;
                        }
                        egy0Var = (egy0) t8Var;
                    } catch (InvalidProtocolBufferException e) {
                        e.a = t8Var;
                        throw e;
                    }
                } else {
                    egy0Var = null;
                }
            } else if (i3 != i4 || i > i2) {
                egy0Var = null;
            } else {
                vz00 vz00Var2 = new vz00();
                acc.a(vz00Var2);
                tja0 tja0Var2 = egy0.X;
                tja0Var2.getClass();
                mwg mwgVar2 = new mwg(inputStream);
                t8Var = (t8) tja0Var2.b(mwgVar2, vz00Var2);
                mwgVar2.a(0);
                if (t8Var.isInitialized()) {
                    InvalidProtocolBufferException invalidProtocolBufferException2 = new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
                    invalidProtocolBufferException2.a = t8Var;
                    throw invalidProtocolBufferException2;
                }
                egy0Var = (egy0) t8Var;
            }
            inputStream.close();
            if (egy0Var != null) {
                return new zbc(kf30Var, zim0Var, egy0Var, xbcVarQ);
            }
            throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + xbcVar2 + ", actual " + xbcVarQ + ". Please update Kotlin");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u890.p(inputStream, th);
                throw th2;
            }
        }
    }

    public static cz50 r(bx40 bx40Var) {
        bx40Var.getClass();
        View viewInflate = LayoutInflater.from(bx40Var.getContext()).inflate(2131625028, (ViewGroup) bx40Var, false);
        cz50 cz50Var = new cz50(viewInflate);
        viewInflate.setTag(2131429011, cz50Var);
        return cz50Var;
    }

    public static fz50 s(bx40 bx40Var) {
        bx40Var.getClass();
        View viewInflate = LayoutInflater.from(bx40Var.getContext()).inflate(2131625026, (ViewGroup) bx40Var, false);
        fz50 fz50Var = new fz50(viewInflate);
        viewInflate.setTag(2131429011, fz50Var);
        return fz50Var;
    }

    public static hz50 t(bx40 bx40Var) {
        bx40Var.getClass();
        View viewInflate = LayoutInflater.from(bx40Var.getContext()).inflate(2131625027, (ViewGroup) bx40Var, false);
        hz50 hz50Var = new hz50(viewInflate, (byte) 0);
        viewInflate.setTag(2131429011, hz50Var);
        return hz50Var;
    }

    public static hz50 u(bx40 bx40Var) {
        bx40Var.getClass();
        View viewInflate = LayoutInflater.from(bx40Var.getContext()).inflate(2131625029, (ViewGroup) bx40Var, false);
        hz50 hz50Var = new hz50(viewInflate, (byte) 1);
        viewInflate.setTag(2131429011, hz50Var);
        return hz50Var;
    }

    public static final void v(lsl lslVar, y9e1 y9e1Var, int i, long j) {
        if (y9e1Var == null || i <= 0) {
            return;
        }
        int length = y9e1Var.a.a.b.length();
        tw4 tw4VarK = y9e1Var.k(0, i > length ? length : i);
        cab cabVarA1 = lslVar.a1();
        long jU = cabVarA1.u();
        cabVarA1.p().q();
        try {
            ((dg8) cabVarA1.b).i(tw4VarK, 1);
            w5p1.i(lslVar, y9e1Var, j, 0L, 0.0f, 252);
        } finally {
            i3a.n(cabVarA1, jU);
        }
    }

    public static void w(DrawScope drawScope, y9e1 y9e1Var, long j, long j2, boolean z, float f, int i) {
        float fIntBitsToFloat;
        float fG;
        float f2 = (i & 16) != 0 ? 0.0f : f;
        float f3 = (i & 32) != 0 ? 0.0f : 2.0f;
        zrm0 zrm0Var = y9e1Var.b;
        int i2 = zrm0Var.f;
        for (int i3 = 0; i3 < i2; i3++) {
            float f4 = zrm0Var.f(i3) + f3;
            float fB = zrm0Var.b(i3) - f3;
            if (z) {
                fG = y9e1Var.g(i3) - f2;
                fIntBitsToFloat = (2.0f * f2) + (y9e1Var.h(i3) - y9e1Var.g(i3));
            } else {
                fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() >> 32));
                fG = 0.0f;
            }
            DrawScope.g0(drawScope, j, (((long) Float.floatToRawIntBits(fG)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fB - f4)) & 4294967295L), j2, (DrawStyle) null, 0.0f, 0, 240);
        }
    }

    public static final boolean x(uel uelVar) {
        yel yelVar = uelVar.a;
        if (!u890.j(yelVar, vel.a)) {
            if (!(yelVar instanceof xel)) {
                if (yelVar instanceof wel) {
                    return true;
                }
                eg.o();
                return false;
            }
            if (!C(uelVar).isEmpty() && A(uelVar).a.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static awl1 y(Context context) {
        return awl1.d(context);
    }

    public static final Object z(Optional optional) {
        return optional.isPresent() ? optional.get() : lqh.a;
    }
}
