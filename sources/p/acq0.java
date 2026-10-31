package p;

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
import androidx.credentials.exceptions.GetCredentialCustomException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import androidx.credentials.internal.FrameworkClassParsingException;
import io.reactivex.rxjava3.core.Flowable;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class acq0 implements jcq0, vjm1 {
    public static final j690 a = new j690((byte) 7);
    public static b180 b;

    public static final String A(z6j1 z6j1Var) {
        w6j1 w6j1Var = z6j1Var.a;
        if (w6j1Var instanceof w6j1) {
            return w6j1Var.a.a;
        }
        if (w6j1Var instanceof x6j1) {
            return wqn1.n(((x6j1) w6j1Var).a);
        }
        eg.o();
        return null;
    }

    public static final mr20 B(g0l g0lVar, Flowable flowable, qq0 qq0Var) {
        return rqt0.u(hu20.e(rqt0.u(new wef(yoi1.g(((inr) g0lVar).d()), (byte) 6)), new qd0((lnm) null, (Object) flowable, (Object) qq0Var, (byte) 8)));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.credentials.internal.FrameworkClassParsingException */
    public static GetCredentialException C(String str, String str2) {
        Exception excW;
        try {
            GetPublicKeyCredentialDomException getPublicKeyCredentialDomException = new GetPublicKeyCredentialDomException((String) null, new w0((byte) 26));
            if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ABORT_ERROR")) {
                excW = crm0.w(new w0((byte) 0), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_CONSTRAINT_ERROR")) {
                excW = crm0.w(new w0((byte) 1), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_CLONE_ERROR")) {
                excW = crm0.w(new w0((byte) 2), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR")) {
                excW = crm0.w(new w0((byte) 3), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ENCODING_ERROR")) {
                excW = crm0.w(new w0((byte) 4), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR")) {
                excW = crm0.w(new w0((byte) 5), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR")) {
                excW = crm0.w(new w0((byte) 6), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_CHARACTER_ERROR")) {
                excW = crm0.w(new w0((byte) 7), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR")) {
                excW = crm0.w(new w0((byte) 8), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR")) {
                excW = crm0.w(new w0((byte) 9), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_STATE_ERROR")) {
                excW = crm0.w(new w0((byte) 10), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NAMESPACE_ERROR")) {
                excW = crm0.w(new w0((byte) 11), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NETWORK_ERROR")) {
                excW = crm0.w(new w0((byte) 12), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR")) {
                excW = crm0.w(new w0((byte) 13), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_ALLOWED_ERROR")) {
                excW = crm0.w(new w0((byte) 14), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_FOUND_ERROR")) {
                excW = crm0.w(new w0((byte) 15), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_READABLE_ERROR")) {
                excW = crm0.w(new w0((byte) 16), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_SUPPORTED_ERROR")) {
                excW = crm0.w(new w0((byte) 17), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPERATION_ERROR")) {
                excW = crm0.w(new w0((byte) 18), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPT_OUT_ERROR")) {
                excW = crm0.w(new w0((byte) 19), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR")) {
                excW = crm0.w(new w0((byte) 20), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_READ_ONLY_ERROR")) {
                excW = crm0.w(new w0((byte) 21), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SECURITY_ERROR")) {
                excW = crm0.w(new w0((byte) 22), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SYNTAX_ERROR")) {
                excW = crm0.w(new w0((byte) 23), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TIMEOUT_ERROR")) {
                excW = crm0.w(new w0((byte) 24), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR")) {
                excW = crm0.w(new w0((byte) 25), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_UNKNOWN_ERROR")) {
                excW = crm0.w(new w0((byte) 26), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_VERSION_ERROR")) {
                excW = crm0.w(new w0((byte) 27), str2, getPublicKeyCredentialDomException);
            } else {
                if (!str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR")) {
                    throw new FrameworkClassParsingException();
                }
                excW = crm0.w(new w0((byte) 28), str2, getPublicKeyCredentialDomException);
            }
            return (GetCredentialException) excW;
        } catch (FrameworkClassParsingException unused) {
            return new GetCredentialCustomException(str, str2);
        }
    }

    public static final guj D(maa maaVar, Object obj, ipb1 ipb1Var, ggh gghVar) {
        return new guj(maaVar, obj, ipb1Var, gghVar);
    }

    public static final k1r H(List list, Map map, boolean z) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        List arrayList2 = null;
        while (it.hasNext()) {
            e1r e1rVar = (e1r) it.next();
            g3p1 g3p1VarB = e1rVar.b(map);
            ppa0 ppa0Var = e1rVar.c;
            iu30 iu30Var = e1rVar.e;
            int i = e1rVar.b;
            boolean z2 = g3p1VarB instanceof d1r;
            i1r h1rVar = j1r.a;
            if (z2) {
                jh5 jh5Var = ((d1r) g3p1VarB).c;
                h3r h3rVar = (k3r) map.get(jh5Var);
                int iC = l1d.C(i);
                if (iC == 0) {
                    if (!(h3rVar instanceof i3r)) {
                        if (h3rVar instanceof j3r) {
                            Object obj = ((j3r) h3rVar).a;
                            if (((Boolean) iu30Var.invoke(obj)).booleanValue()) {
                                arrayList.add(obj);
                            } else {
                                arrayList2 = arrayList2;
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(new xyq(jh5Var, obj));
                            }
                        } else if (h3rVar instanceof h3r) {
                            arrayList2 = arrayList2;
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(new wyq(jh5Var, h3rVar.a));
                        } else if (ppa0Var == null) {
                            arrayList2 = arrayList2;
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(new vyq(jh5Var));
                        }
                    }
                    return h1rVar;
                }
                if (iC != 1) {
                    if (iC != 2) {
                        eg.o();
                        return null;
                    }
                    if (!(h3rVar instanceof i3r)) {
                        if (h3rVar instanceof j3r) {
                            Object obj2 = ((j3r) h3rVar).a;
                            h1rVar = ((Boolean) iu30Var.invoke(obj2)).booleanValue() ? new i1r(obj2, (Integer) null) : new h1r(new xyq(jh5Var, obj2));
                        } else if (h3rVar instanceof h3r) {
                            h1rVar = new h1r(new wyq(jh5Var, h3rVar.a));
                        } else if (jh5Var.a() || ppa0Var == null) {
                            h1rVar = new h1r(new vyq(jh5Var));
                        }
                    }
                    arrayList.add(h1rVar);
                } else if (h3rVar instanceof j3r) {
                    Object obj3 = ((j3r) h3rVar).a;
                    if (((Boolean) iu30Var.invoke(obj3)).booleanValue()) {
                        arrayList.add(obj3);
                    } else if (z) {
                        arrayList2 = arrayList2;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(new xyq(jh5Var, obj3));
                    } else {
                        arrayList.add(null);
                    }
                } else if (!(h3rVar instanceof h3r)) {
                    arrayList.add(null);
                } else if (z) {
                    arrayList2 = arrayList2;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(new wyq(jh5Var, h3rVar.a));
                } else {
                    arrayList.add(null);
                }
            } else if (g3p1VarB instanceof c1r) {
                int iC2 = l1d.C(i);
                if (iC2 == 0) {
                    return h1rVar;
                }
                if (iC2 == 1) {
                    arrayList.add(null);
                } else {
                    if (iC2 != 2) {
                        eg.o();
                        return null;
                    }
                    arrayList.add(h1rVar);
                }
            } else {
                if (!(g3p1VarB instanceof b1r)) {
                    eg.o();
                    return null;
                }
                int iC3 = l1d.C(i);
                if (iC3 == 0) {
                    arrayList2 = arrayList2;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    b1r b1rVar = (b1r) g3p1VarB;
                    arrayList2.add(new wyq(b1rVar.c, b1rVar.d));
                } else if (iC3 != 1) {
                    if (iC3 != 2) {
                        eg.o();
                        return null;
                    }
                    b1r b1rVar2 = (b1r) g3p1VarB;
                    arrayList.add(new h1r(new wyq(b1rVar2.c, b1rVar2.d)));
                } else if (z) {
                    arrayList2 = arrayList2;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    b1r b1rVar3 = (b1r) g3p1VarB;
                    arrayList2.add(new wyq(b1rVar3.c, b1rVar3.d));
                } else {
                    arrayList.add(null);
                }
            }
        }
        List list2 = arrayList2;
        if (list2 != null) {
            return list2.size() == 1 ? new h1r((yyq) o7h.q0(list2)) : new h1r(new uyq(list2));
        }
        return new i1r(arrayList, (Integer) null);
    }

    public static final String M(String str, xca1 xca1Var, String str2) {
        if (str == null) {
            str = "all";
        }
        return str + ":" + ((uca1) xca1Var).c + ":" + str2;
    }

    public static final String N(fw90 fw90Var, String str) {
        if (fw90Var instanceof ew90) {
            return f4i1.f(str, "-", ((ew90) fw90Var).a);
        }
        if (fw90Var instanceof dw90) {
            return str.concat("-anon");
        }
        eg.o();
        return null;
    }

    public static final lsm0 O(pjw0 pjw0Var, String str, String str2, boolean z, hwt hwtVar, nrl nrlVar) {
        String strA;
        jsm0 jsm0Var;
        long j;
        long jH;
        njw0 njw0Var = pjw0Var.b;
        q8i0 q8i0VarB = kno1.B(pjw0Var, hwtVar);
        Set set = s4b1.f;
        blc0 blc0Var = blc0.ed;
        boolean zG = uic.g(str, blc0Var);
        l8i0 l8i0Var = l8i0.a;
        int i = 1;
        boolean z2 = q8i0VarB.equals(l8i0Var) && zG;
        boolean z3 = njw0Var instanceof mjw0;
        Long lValueOf = null;
        m8i0 m8i0Var = m8i0.a;
        if (z3) {
            if (q8i0VarB.equals(m8i0Var)) {
                strA = A(((mjw0) njw0Var).a);
            } else {
                if (!q8i0VarB.equals(l8i0Var)) {
                    eg.o();
                    return null;
                }
                if (zG) {
                    strA = A(((mjw0) njw0Var).a);
                } else {
                    ko7 ko7Var = ((mjw0) njw0Var).a.c;
                    strA = ko7Var != null ? ko7Var.a.a.a : null;
                    if (strA == null) {
                        strA = "";
                    }
                }
            }
        } else {
            if (!(njw0Var instanceof ljw0)) {
                eg.o();
                return null;
            }
            strA = ((ljw0) njw0Var).a.a.a.a;
        }
        boolean zG2 = uic.g(str, blc0Var);
        mjw0 mjw0Var = z3 ? (mjw0) njw0Var : null;
        ojw0 ojw0Var = mjw0Var != null ? mjw0Var.b : null;
        boolean zEquals = q8i0VarB.equals(l8i0Var);
        ngv ngvVar = ngv.e;
        if (zEquals) {
            if (zG2) {
                if (z) {
                    jH = 0;
                    j = 0;
                } else if (ojw0Var != null) {
                    j = 0;
                    jH = jfv.h(ojw0Var.a);
                } else {
                    j = 0;
                    jH = 0;
                }
                Long lValueOf2 = Long.valueOf(jH);
                if (!z && ojw0Var != null) {
                    long j2 = ojw0Var.b;
                    if (jfv.u(j2, ngvVar) != j) {
                        lValueOf = Long.valueOf(jfv.h(j2));
                    }
                }
                jsm0Var = new jsm0(lValueOf2, lValueOf);
            } else {
                jsm0Var = new jsm0(0L, (Long) null);
            }
        } else {
            if (!q8i0VarB.equals(m8i0Var)) {
                eg.o();
                return null;
            }
            Long lValueOf3 = Long.valueOf((z || ojw0Var == null) ? 0L : jfv.h(ojw0Var.a));
            if (!z && ojw0Var != null) {
                long j3 = ojw0Var.b;
                if (jfv.u(j3, ngvVar) != 0) {
                    lValueOf = Long.valueOf(jfv.h(j3));
                }
            }
            jsm0Var = new jsm0(lValueOf3, lValueOf);
        }
        jsm0 jsm0Var2 = jsm0Var;
        ksm0 ksm0VarF = fap1.f(str, str2, pjw0Var.c, z);
        if (!(nrlVar instanceof irl)) {
            i = nrlVar instanceof jrl ? 2 : 3;
        }
        return new lsm0(strA, ksm0VarF, false, false, jsm0Var2, 0L, (ism0) null, "", z2, i, 1096);
    }

    public static final yo90 P(int i, boolean z) {
        xo90 xo90Var;
        int iC = l1d.C(i);
        xo90 xo90Var2 = xo90.c;
        if (iC == 0 || iC == 1) {
            xo90Var = xo90Var2;
        } else if (iC == 2) {
            xo90Var = xo90.a;
        } else {
            if (iC != 3) {
                eg.o();
                return null;
            }
            xo90Var = xo90.b;
        }
        xo90 xo90Var3 = z ? xo90Var : null;
        if (xo90Var3 != null) {
            xo90Var2 = xo90Var3;
        }
        return new yo90(xo90Var2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(p791 p791Var, String str, a2r0 a2r0Var, Function0 function0, Function0 function1, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        byte b2;
        int i3;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2009235643);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.e(p791Var.ordinal()) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i4 = i2 | (x340Var.g(str) ? 32 : 16) | (x340Var.i(a2r0Var) ? 256 : 128) | (x340Var.i(function0) ? 2048 : 1024) | (x340Var.i(function1) ? 16384 : 8192);
        if (x340Var.Y(i4 & 1, (i4 & 9363) != 9362)) {
            int i5 = i4 & 112;
            boolean zI = x340Var.i(a2r0Var) | (i5 == 32) | ((i4 & 14) == 4);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                b2 = 0;
                i3 = i5;
                hb1 hb1Var = new hb1(a2r0Var, str, p791Var, (lnm) null, (byte) 14);
                x340Var.s0(hb1Var);
                objT = hb1Var;
            } else {
                i3 = i5;
                b2 = 0;
            }
            qxd0.t(rih1.a, x340Var, (vu30) objT);
            int iOrdinal = p791Var.ordinal();
            z50 z50Var = z50.c;
            if (iOrdinal == 0) {
                boolean z = b2;
                x340Var.i0(-1859786242);
                String strO0 = cwl1.o0(x340Var, 2131952269);
                String strO1 = cwl1.o0(x340Var, 2131952270);
                boolean z2 = (x340Var.i(a2r0Var) ? 1 : 0) | (i3 == 32 ? true : z ? 1 : 0) | ((i4 & 57344) == 16384 ? true : z ? 1 : 0);
                Object objT2 = x340Var.T();
                Object obj = objT2;
                if (z2 || objT2 == m4cVar) {
                    eu3 eu3Var = new eu3(a2r0Var, str, function1, (byte) 2);
                    x340Var.s0(eu3Var);
                    obj = eu3Var;
                }
                mqo1.d(function1, (i3u) null, (hux) null, (String) null, strO0, new zgx(strO1, new gbx(z50Var, (Function0) obj)), (zgx) null, x340Var, ((i4 >> 12) & 14) | 262144, 78);
                x340Var.r(z);
            } else {
                if (iOrdinal != 1) {
                    throw p3d1.k(x340Var, -1859816649, b2);
                }
                x340Var.i0(-1859815536);
                String strO2 = cwl1.o0(x340Var, 2131952281);
                String strO3 = cwl1.o0(x340Var, 2131952278);
                String strO4 = cwl1.o0(x340Var, 2131952280);
                int i6 = (x340Var.i(a2r0Var) ? 1 : 0) | (i3 == 32 ? (byte) 1 : b2) | ((i4 & 7168) == 2048 ? (byte) 1 : b2);
                Object objT3 = x340Var.T();
                Object obj2 = objT3;
                if (i6 != 0 || objT3 == m4cVar) {
                    eu3 eu3Var2 = new eu3(a2r0Var, str, function0, b2);
                    x340Var.s0(eu3Var2);
                    obj2 = eu3Var2;
                }
                zgx zgxVar = new zgx(strO4, new gbx(z50Var, (Function0) obj2));
                String strO5 = cwl1.o0(x340Var, 2131952279);
                int i7 = (((i3 == 32 ? (byte) 1 : b2) | (x340Var.i(a2r0Var) ? 1 : 0)) == true ? 1 : 0) | ((i4 & 57344) == 16384 ? (byte) 1 : b2);
                Object objT4 = x340Var.T();
                Object obj3 = objT4;
                if (i7 != 0 || objT4 == m4cVar) {
                    eu3 eu3Var3 = new eu3(a2r0Var, str, function1, (byte) 1);
                    x340Var.s0(eu3Var3);
                    obj3 = eu3Var3;
                }
                mqo1.d(function1, (i3u) null, (hux) null, strO2, strO3, zgxVar, new zgx(strO5, new gbx(z50Var, (Function0) obj3)), x340Var, ((i4 >> 12) & 14) | 2359296, 6);
                x340Var.r(b2);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ik2(p791Var, str, a2r0Var, function0, function1, i, (byte) 1);
        }
    }

    public static final void b(dw90 dw90Var, b0k b0kVar, int i) {
        int i2;
        int i3 = dw90Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-708138570);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(dw90Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarN = anm1.N("anonymizedRow", uyn1.z(0.0f, 8.0f, 1, qim0VarF));
            cvx cvxVar2 = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), een.N0, x340Var, 0);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            shx.a(ezn1.p(x340Var, i3), (qim0) null, hcx.d, (idn0) null, x340Var, 392, 58);
            uwo1.e(cwl1.U(2131820719, i3, new Object[]{Integer.valueOf(i3)}, x340Var), (qim0) null, cbx.d(x340Var).g, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ug50(dw90Var, i, (byte) 3);
        }
    }

    public static final void c(lw90 lw90Var, y5a0 y5a0Var, b0k b0kVar, int i) {
        boolean z;
        y5a0 y5a0Var2 = y5a0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2110222035);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(lw90Var) ? 4 : 2) | (x340Var.i(y5a0Var2) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            iw90 iw90Var = lw90Var instanceof iw90 ? (iw90) lw90Var : null;
            yv90 yv90Var = iw90Var != null ? iw90Var.e : null;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            t1c.a(dug.e(u291.h(qim0VarF2, cbx.b(x340Var).b.b), v9c.s(p7h.M(new u7h[]{new u7h(u7h.j), new u7h(cbx.a(x340Var).a.a.a())}), 0.0f, 0.0f, 14), (hw61) null, 0.0f, 6), x340Var, 0);
            u5j1 u5j1Var = d4o1.a;
            if (yv90Var == null) {
                x340Var.i0(255472318);
                t1c.a(dug.f(u291.h(u291.f(nim0Var, 1.0f), cbx.b(x340Var).b.b), cbx.a(x340Var).a.a.a(), u5j1Var), x340Var, 0);
                x340Var.r(false);
                y5a0Var2 = y5a0Var;
                z = true;
            } else {
                x340Var.i0(255683645);
                qim0 qim0VarF3 = dug.f(u291.f(nim0Var, 1.0f), cbx.a(x340Var).a.a.a(), u5j1Var);
                cvx cvxVar = cbx.b(x340Var).b;
                qim0 qim0VarB = uyn1.B(uyn1.z(16.0f, 0.0f, 2, qim0VarF3), 0.0f, 0.0f, 0.0f, cbx.b(x340Var).b.e, 7);
                mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, 0);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA2, x340Var, lljVar);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar4);
                u(x340Var, 0);
                qim0 qim0VarN = anm1.N("autoInviteNearbySection", nim0Var);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0VarN);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC, x340Var, lljVar);
                nko1.H(xos0VarM3, x340Var, lljVar2);
                x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE3, x340Var, lljVar4);
                y5a0Var2 = y5a0Var;
                otw.c(y5a0Var2, new w5a0(((iw90) lw90Var).d.a, yv90Var.a, new x5a0(yv90Var.b, 3)), (qim0) null, (ipb1) null, x340Var, (i2 >> 3) & 14, 12);
                z = true;
                us71.m(x340Var, true, true, false);
            }
            x340Var.r(z);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tw90(lw90Var, y5a0Var2, i);
        }
    }

    public static final void d(int i, Function0 function0, b0k b0kVar, boolean z) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2126550667);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean z2 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new me8(z, function0, null, (byte) 2);
                x340Var.s0(objT);
            }
            qxd0.t(boolValueOf, x340Var, (vu30) objT);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new u2y((byte) 0, i, function0, z);
        }
    }

    public static final void e(int i, int i2, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        int i3 = (kk0.t(-1668103538, i, x340Var) ? 4 : 2) | i2 | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            gfx.g(1, apo.r(965195579, new mq2(i, qim0Var), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mq2((byte) 9, i, i2, qim0Var);
        }
    }

    public static final void f(v3y v3yVar, iu30 iu30Var, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        v3y v3yVar2 = v3yVar;
        Function0 function1 = function0;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1390838092);
        int i2 = i | (b0kVar3.g(v3yVar2) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | 384 | (b0kVar3.i(function1) ? 2048 : 1024);
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = new bs91();
                b0kVar3.s0(objT);
            }
            bs91 bs91Var = (bs91) objT;
            wat watVar = (wat) b0kVar3.k(t4k.h);
            boolean zG = b0kVar3.g(watVar);
            Object objT2 = b0kVar3.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new pj(watVar, (byte) 5);
                b0kVar3.s0(objT2);
            }
            Function0 function2 = (Function0) objT2;
            boolean zG2 = b0kVar3.g(watVar);
            Object objT3 = b0kVar3.T();
            if (zG2 || objT3 == m4cVar) {
                objT3 = new pj(watVar, (byte) 6);
                b0kVar3.s0(objT3);
            }
            Function0 function3 = (Function0) objT3;
            boolean z = (i2 & 7168) == 2048;
            Object objT4 = b0kVar3.T();
            if (z || objT4 == m4cVar) {
                objT4 = new xet(function1, (byte) 6);
                b0kVar3.s0(objT4);
            }
            iyb iybVarS = t890.s(new vy71(true, function2, function3, xy71.b, (iu30) objT4, 32), bs91Var, b0kVar3, 48, 0);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(b0kVar3).f;
            cua cuaVar2 = cbx.b(b0kVar3).f;
            t890.a(apo.r(-131547709, new k8(function0, v3yVar2, iu30Var, bs91Var, (byte) 29), b0kVar3), iybVarS, 0.0f, 0.0f, er31.d(16.0f, 16.0f, 0.0f, 0.0f, 12), 0L, 0L, 8.0f, (vu30) null, false, bmi.b, 0L, 0L, bmi.c, b0kVar3, 805306422, 1575942, 55768);
            v3yVar2 = v3yVar;
            b0kVar2 = b0kVar3;
            function1 = function0;
            d((i2 >> 6) & 112, function1, b0kVar2, v3yVar2.e);
            qim0Var2 = nim0.a;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new qfx((Object) v3yVar2, iu30Var, (Object) qim0Var2, (Object) function1, i, (byte) 6);
        }
    }

    public static final void g(v3y v3yVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        Object obj;
        iu30 iu30Var2;
        boolean z;
        Object obj2;
        ven0 ven0Var;
        Object obj3;
        jax haxVar;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(2123780610);
        int i2 = i | (b0kVar2.g(v3yVar) ? 4 : 2) | (b0kVar2.i(iu30Var) ? 32 : 16) | 384;
        if (b0kVar2.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = b0kVar2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                obj = objT;
                hrr0 hrr0VarQ = v8r.q("");
                b0kVar2.s0(hrr0VarQ);
                obj = hrr0VarQ;
            }
            obj = objT;
            ven0 ven0Var2 = (ven0) obj;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarZ = uyn1.z(0.0f, 24.0f, 1, u291.c(qim0Var3, 1.0f));
            era eraVar = een.P0;
            mbh mbhVarA = jbh.a(h36.c, eraVar, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarZ);
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
            String strO0 = cwl1.o0(b0kVar2, 2131955942);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, uyn1.z(16.0f, 0.0f, 2, new tq60(eraVar)), cbx.d(b0kVar2).e, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2040);
            c380 c380Var = v3yVar.a;
            qim0 qim0VarB = uyn1.B(uyn1.z(16.0f, 0.0f, 2, qim0Var3), 0.0f, 16.0f, 0.0f, 0.0f, 13);
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object objT2 = b0kVar2.T();
            if (z2 || objT2 == m4cVar) {
                iu30Var2 = iu30Var;
                z = false;
                v2y v2yVar = new v2y(iu30Var2, false ? 1 : 0);
                b0kVar2.s0(v2yVar);
                obj2 = v2yVar;
            } else {
                iu30Var2 = iu30Var;
                z = false;
                obj2 = objT2;
            }
            i(48, b0kVar2, (iu30) obj2, c380Var, qim0VarB);
            String str = (String) ven0Var2.getValue();
            lj80 lj80Var = v3yVar.b;
            era eraVar2 = een.Q0;
            qim0 qim0VarF = u291.f(uyn1.x(new tq60(eraVar2), 16.0f), 1.0f);
            Object objT3 = b0kVar2.T();
            if (objT3 == m4cVar) {
                ven0Var = ven0Var2;
                d7v d7vVar = new d7v(ven0Var, (byte) 12);
                b0kVar2.s0(d7vVar);
                obj3 = d7vVar;
            } else {
                ven0Var = ven0Var2;
                obj3 = objT3;
            }
            h(str, lj80Var, qim0VarF, (iu30) obj3, b0kVar2, 3072);
            boolean z3 = i3 == 32 ? true : z;
            Object objT4 = b0kVar2.T();
            Object obj4 = objT4;
            if (z3 || objT4 == m4cVar) {
                wq9 wq9Var = new wq9(iu30Var2, ven0Var, (byte) 15);
                b0kVar2.s0(wq9Var);
                obj4 = wq9Var;
            }
            gbx gbxVar = new gbx(z50.c, (Function0) obj4);
            if (v3yVar.c) {
                b0kVar2.i0(1460252876);
                b0kVar2.r(z);
                haxVar = jax.a;
            } else {
                b0kVar2.i0(1460303437);
                haxVar = new hax(cwl1.o0(b0kVar2, 2131962979));
                b0kVar2.r(z);
            }
            foo1.c(gbxVar, new idx(4), ktd.m(eraVar2, uyn1.B(qim0Var3, 0.0f, 20.0f, 0.0f, 0.0f, 13)), haxVar, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, bmi.d, b0kVar2, 0, 48, 2024);
            b0kVar2 = b0kVar2;
            k(u291.f(uyn1.B(uyn1.z(16.0f, 0.0f, 2, qim0Var3), 0.0f, 22.0f, 0.0f, 0.0f, 13), 1.0f), b0kVar2, 6);
            uwo1.e(cwl1.o0(b0kVar2, 2131955935), uyn1.B(uyn1.z(16.0f, 0.0f, 2, qim0Var3), 0.0f, 12.0f, 0.0f, 0.0f, 13), cbx.d(b0kVar2).j, z4p1.f(167, 167, 167, 255), (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 3120, 0, 2032);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new g6w(v3yVar, iu30Var, qim0Var2, i, (byte) 16);
        }
    }

    public static final void h(String str, lj80 lj80Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1266784483);
        int i2 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.g(lj80Var) ? 32 : 16) | (x340Var2.g(qim0Var) ? 256 : 128);
        if (!x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            x340Var = x340Var2;
            x340Var.b0();
        } else if (lj80Var.a) {
            x340Var2.i0(1101455168);
            boolean z = lj80Var.b;
            kua0 kua0Var = new kua0(3, Boolean.TRUE, 1, 7, 80);
            long jF = z4p1.f(31, 215, 96, 255);
            long jF2 = z4p1.f(41, 41, 41, 255);
            long jF3 = z4p1.f(94, 94, 94, 255);
            long j = u7h.j;
            t3p1.q(str, iu30Var, qim0Var, z, (lee1) null, bmi.e, (elk1) null, kua0Var, (bua0) null, 1, 0, er31.b(4.0f), i5x0.h(jF2, jF3, jF, j, j, j, x340Var2, 2147469007), x340Var2, (i2 & 896) | (i2 & 14) | 12582960);
            x340Var = x340Var2;
            x340Var.r(false);
        } else {
            x340Var = x340Var2;
            x340Var.i0(1102448005);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qfx(i, (Object) str, (Object) lj80Var, (Object) qim0Var, (Object) iu30Var, (byte) 7);
        }
    }

    public static final void i(int i, b0k b0kVar, iu30 iu30Var, c380 c380Var, qim0 qim0Var) {
        Function0 function0;
        vu30 vu30Var = y580.Y;
        llj lljVar = y580.R0;
        llj lljVar2 = y580.N0;
        llj lljVar3 = y580.O0;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(822838349);
        j06 j06Var = ((x340) b0kVar2).a;
        int i2 = 256;
        int i3 = (b0kVar2.g(c380Var) ? 4 : 2) | i | (b0kVar2.i(iu30Var) ? 256 : 128);
        if (b0kVar2.Y(i3 & 1, (i3 & 147) != 146)) {
            qim0 qim0VarF = nho1.F(qim0Var);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z = ((x340) b0kVar2).S;
            Function0 function1 = hmb0.t1;
            if (z) {
                b0kVar2.l(function1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, lljVar3);
            nko1.H(xos0VarM, b0kVar2, lljVar2);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, lljVar);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, vu30Var);
            b0kVar2.i0(-728305297);
            ArrayList<t3y> arrayList = new ArrayList();
            for (Object obj : c380Var) {
                if (!(((t3y) obj) instanceof q3y)) {
                    arrayList.add(obj);
                }
            }
            for (t3y t3yVar : arrayList) {
                qim0 qim0VarF2 = u291.f(nim0.a, 1.0f);
                boolean zF = t3yVar.f();
                boolean enabled = t3yVar.getEnabled();
                pm31 pm31Var = new pm31(3);
                boolean zI = ((i3 & 896) == i2) | b0kVar2.i(t3yVar);
                Object objT = b0kVar2.T();
                if (zI || objT == fkj0.X) {
                    objT = new t3x((Object) iu30Var, (Object) t3yVar, (byte) 5);
                    b0kVar2.s0(objT);
                }
                qim0 qim0VarZ = uyn1.z(0.0f, 12.0f, 1, dgo1.q(qim0VarF2, zF, enabled, pm31Var, (Function0) objT, 8));
                jw31 jw31VarA = ew31.a(h36.a, een.Z, b0kVar2, 0);
                Function0 function2 = function1;
                int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
                xos0 xos0VarM2 = b0kVar2.m();
                qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarZ);
                hzj.A.getClass();
                b0kVar2.m0();
                if (((x340) b0kVar2).S) {
                    function0 = function2;
                    b0kVar2.l(function0);
                } else {
                    function0 = function2;
                    b0kVar2.v0();
                }
                nko1.H(jw31VarA, b0kVar2, lljVar3);
                nko1.H(xos0VarM2, b0kVar2, lljVar2);
                nko1.H(Integer.valueOf(iHashCode2), b0kVar2, lljVar);
                nko1.F(b0kVar2);
                nko1.H(qim0VarE2, b0kVar2, vu30Var);
                String strO0 = cwl1.o0(b0kVar2, t3yVar.g());
                uwr uwrVar = cbx.a;
                b0k b0kVar3 = b0kVar2;
                uwo1.e(strO0, new wnb0(1.0f, true), cbx.d(b0kVar2).g, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar3, 0, 0, 2040);
                b0kVar2 = b0kVar3;
                byo1.b(48, b0kVar2, (qim0) null, t3yVar.f(), t3yVar.getEnabled());
                b0kVar2.r(true);
                vu30Var = vu30Var;
                function1 = function0;
                i2 = 256;
                i3 = i3;
            }
            b0kVar2.r(false);
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new w2y(i, iu30Var, c380Var, qim0Var);
        }
    }

    public static final void k(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1333964102);
        if (x340Var.Y(i & 1, (i & 3) != 2)) {
            ye5 ye5VarO = kk0.o(2039251202, x340Var);
            ye5VarO.g(cwl1.o0(x340Var, 2131957233));
            ye5VarO.l(new ljc0("https://contentreporting.spotify.com/mobile/content-policy", new pae1(new zma1(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.c, (Shadow) null, (PlatformSpanStyle) null, 61439), (zma1) null, 14), (rjc0) null, 4));
            x340Var.i0(2039261937);
            int iO = ye5VarO.o(new zma1(u7h.f, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
            try {
                ye5VarO.g(cwl1.o0(x340Var, 2131961266));
                ye5VarO.k(iO);
                x340Var.r(false);
                ye5VarO.j();
                af5 af5VarP = ye5VarO.p();
                x340Var.r(false);
                uwo1.f(af5VarP, qim0Var, (lee1) null, (x9h) null, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var, 48, 0, 4092);
            } catch (Throwable th) {
                ye5VarO.k(iO);
                throw th;
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wdk(qim0Var, i, (byte) 20);
        }
    }

    public static final void l(bu91 bu91Var, bs91 bs91Var, Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-35878493);
        int i2 = (x340Var.g(bu91Var) ? 4 : 2) | i | (x340Var.i(function0) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = qxd0.M(o6x.a, x340Var);
                x340Var.s0(objT);
            }
            c9n c9nVar = (c9n) objT;
            boolean zI = ((i2 & 14) == 4) | x340Var.i(c9nVar) | ((i2 & 896) == 256);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                sr1 sr1Var = new sr1(bu91Var, c9nVar, bs91Var, function0, (lnm) null, (byte) 17);
                x340Var.s0(sr1Var);
                objT2 = sr1Var;
            }
            qxd0.t(bu91Var, x340Var, (vu30) objT2);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g6w(bu91Var, bs91Var, function0, i, (byte) 17);
        }
    }

    public static final void m(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1694296506);
        j06 j06Var = ((x340) b0kVar2).a;
        int i2 = i | 6 | (b0kVar2.i(function0) ? 32 : 16);
        if (b0kVar2.Y(i2 & 1, (i2 & 19) != 18)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(b0kVar2, qim0Var3);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z = ((x340) b0kVar2).S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, b0kVar2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, lljVar4);
            qim0 qim0VarA = uyn1.A(u291.f(qim0Var3, 1.0f), 16.0f, 28.0f, 16.0f, 16.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarA);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(gfh0VarC, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            olx olxVar = olx.c;
            jsl jslVar = new jsl(cwl1.o0(b0kVar2, 2131953950));
            gra graVar = een.g;
            h2c h2cVar = h2c.a;
            w0h1.a(olxVar, jslVar, bin.x(h2cVar.a(qim0Var3, graVar), false, (String) null, (pm31) null, (idn0) null, function0, 15), 0L, 0L, false, b0kVar2, olx.d, 56);
            String strO0 = cwl1.o0(b0kVar2, 2131955944);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(b0kVar2).h;
            b0kVar2 = b0kVar2;
            uwo1.e(strO0, h2cVar.a(qim0Var3, een.h), lee1Var, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2040);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
            op71.g(b0kVar2, dug.f(u291.h(u291.f(qim0Var2, 1.0f), 1.0f), u7h.b(u7h.f, 0.1f, 0.0f, 0.0f, 0.0f, 14), d4o1.a));
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new vd1(qim0Var2, function0, i, (byte) 25);
        }
    }

    public static final void n(lw90 lw90Var, tob1 tob1Var, y5a0 y5a0Var, ldo ldoVar, ng20 ng20Var, boolean z, iu30 iu30Var, d6o0 d6o0Var, b0k b0kVar, int i) {
        int i2;
        d6o0 d6o0Var2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(684576441);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(lw90Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(tob1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(y5a0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(ldoVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.i(ng20Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar3.h(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            d6o0Var2 = d6o0Var;
            i2 |= b0kVar3.i(d6o0Var2) ? 8388608 : 4194304;
        } else {
            d6o0Var2 = d6o0Var;
        }
        int i3 = i2;
        if (b0kVar3.Y(i3 & 1, (4793491 & i3) != 4793490)) {
            b0kVar2 = b0kVar3;
            ggo1.s(tob1Var, apo.r(-603385908, new tw90(lw90Var, y5a0Var), b0kVar3), (qim0) null, 0.0f, u7h.j, (iu30) null, apo.r(1296148819, new j6v((Object) lw90Var, (Object) d6o0Var2, (Object) ldoVar, (Object) ng20Var, z, iu30Var, (byte) 3), b0kVar3), b0kVar2, ((i3 >> 3) & 14) | 1572912, 36);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new brf(lw90Var, tob1Var, y5a0Var, ldoVar, ng20Var, z, iu30Var, d6o0Var, i);
        }
    }

    public static final void o(iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-71625465);
        int i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarN = anm1.N("inviteFriendsRow", nim0.a);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            zzq0 zzq0VarH = uyn1.h(1, 0.0f, 8.0f);
            String strO0 = cwl1.o0(x340Var, 2131956924);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new zi80(iu30Var, (byte) 25);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            cwl1.b(qim0VarN, (tl3) null, (hw61) null, (pgx) null, zzq0VarH, (max) null, false, (idn0) null, (ga80) null, new gbx(new y50(strO0), function0), (gbx) null, uti.a, x340Var, 0, 48, 1518);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new d720(iu30Var, i, (byte) 15);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void p(nw90 nw90Var, tob1 tob1Var, d6o0 d6o0Var, y5a0 y5a0Var, ldo ldoVar, ng20 ng20Var, boolean z, iu30 iu30Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        d6o0 d6o0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2079395222);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(nw90Var) : x340Var.i(nw90Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(tob1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            d6o0Var2 = d6o0Var;
            i2 |= x340Var.i(d6o0Var2) ? 256 : 128;
        } else {
            d6o0Var2 = d6o0Var;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(y5a0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(ldoVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(ng20Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.h(z) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= x340Var.i(iu30Var) ? 8388608 : 4194304;
        }
        if (!x340Var.Y(i2 & 1, (4793491 & i2) != 4793490)) {
            x340Var.b0();
        } else if (nw90Var instanceof mw90) {
            x340Var.i0(-949313834);
            x340Var.r(false);
        } else {
            if (!(nw90Var instanceof lw90)) {
                throw p3d1.k(x340Var, -1139002608, false);
            }
            x340Var.i0(-1139000442);
            int i3 = i2 >> 3;
            n((lw90) nw90Var, tob1Var, y5a0Var, ldoVar, ng20Var, z, iu30Var, d6o0Var2, x340Var, (i2 & 126) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (i3 & 3670016) | ((i2 << 15) & 29360128));
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new brf(nw90Var, tob1Var, d6o0Var, y5a0Var, ldoVar, ng20Var, z, iu30Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    /* JADX WARN: Code duplicated, block: B:16:0x003c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0047  */
    /* JADX WARN: Code duplicated, block: B:20:0x0049  */
    /* JADX WARN: Code duplicated, block: B:23:0x0053  */
    /* JADX WARN: Code duplicated, block: B:24:0x0055  */
    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x007b  */
    /* JADX WARN: Code duplicated, block: B:38:0x007f  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:51:0x0102  */
    /* JADX WARN: Code duplicated, block: B:54:0x0114  */
    /* JADX WARN: Code duplicated, block: B:57:0x012e  */
    /* JADX WARN: Code duplicated, block: B:60:0x013d  */
    /* JADX WARN: Code duplicated, block: B:61:0x013f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0148  */
    /* JADX WARN: Code duplicated, block: B:68:0x0166  */
    /* JADX WARN: Code duplicated, block: B:70:0x0173  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:77:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    public static final void q(boolean z, qim0 qim0Var, String str, String str2, iu30 iu30Var, b0k b0kVar, int i, int i2) {
        String strO0;
        int i3;
        int i4;
        int i5;
        boolean z2;
        x340 x340Var;
        qim0 qim0Var2;
        String str3;
        h311 h311VarV;
        int i6;
        qim0 qim0Var3;
        int i7;
        qim0 qim0Var4;
        gfh0 gfh0VarC;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z3;
        Object objT;
        jax haxVar;
        boolean zG;
        Object objT2;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(585009016);
        int i8 = i | (x340Var2.h(z) ? 4 : 2) | 48;
        if ((i2 & 4) == 0) {
            strO0 = str;
            int i9 = x340Var2.g(strO0) ? 256 : 128;
            int i10 = i8 | i9;
            if (x340Var2.g(str2)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            int i11 = i10 | i3;
            if (x340Var2.i(iu30Var)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i5 = i11 | i4;
            if ((i5 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var2.Y(i5 & 1, z2)) {
                x340Var2.d0();
                i6 = i & 1;
                qim0Var3 = nim0.a;
                if (i6 != 0 || x340Var2.E()) {
                    if ((i2 & 4) != 0) {
                        strO0 = cwl1.o0(x340Var2, 2131957894);
                        i5 &= -897;
                    }
                    i7 = i5;
                    qim0Var4 = qim0Var3;
                } else {
                    x340Var2.b0();
                    if ((i2 & 4) != 0) {
                        i5 &= -897;
                    }
                    i7 = i5;
                    qim0Var4 = qim0Var;
                }
                x340Var2.s();
                qim0 qim0VarB = uyn1.B(u291.f(anm1.N("#LyricsFullscreenSelectionFooterTag", qim0Var4), 1.0f), 0.0f, 16.0f, 0.0f, 0.0f, 13);
                gfh0VarC = t1c.c(een.e, false);
                iHashCode = Long.hashCode(x340Var2.T);
                xos0VarM = x340Var2.m();
                qim0VarE = zr7.E(x340Var2, qim0VarB);
                hzj.A.getClass();
                if (x340Var2.a != null) {
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
                if (z) {
                    x340Var2.i0(-1837962729);
                    if (str2 == null) {
                        x340Var2.i0(-1142269750);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-1142269749);
                        zG = x340Var2.g(str2);
                        objT2 = x340Var2.T();
                        if (zG || objT2 == m4cVar) {
                            objT2 = new z9b0(str2, (byte) 20);
                            x340Var2.s0(objT2);
                        }
                        t1c.a(s161.b(qim0Var3, false, (iu30) objT2), x340Var2, 0);
                        x340Var2.r(false);
                    }
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-1142055260);
                    x340Var2.r(false);
                }
                if ((i7 & 57344) == 16384) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objT = x340Var2.T();
                if (z3 || objT == m4cVar) {
                    objT = new uef0(iu30Var, (byte) 11);
                    x340Var2.s0(objT);
                }
                gbx gbxVar = new gbx(new y50(strO0), (Function0) objT);
                idx idxVar = new idx(6);
                if (z) {
                    x340Var2.i0(-1837946926);
                    x340Var2.r(false);
                    haxVar = jax.a;
                } else {
                    x340Var2.i0(-1837945368);
                    haxVar = new hax(cwl1.o0(x340Var2, 2131957893));
                    x340Var2.r(false);
                }
                foo1.c(gbxVar, idxVar, (qim0) null, haxVar, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, cyi.a, x340Var2, 0, 48, 2028);
                x340Var = x340Var2;
                x340Var.r(true);
                qim0Var2 = qim0Var4;
                str3 = strO0;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                qim0Var2 = qim0Var;
                str3 = strO0;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new sqb(z, qim0Var2, str3, str2, iu30Var, i, i2);
            }
        }
        strO0 = str;
        int i12 = i8 | i9;
        if (x340Var2.g(str2)) {
            i3 = 2048;
        } else {
            i3 = 1024;
        }
        int i13 = i12 | i3;
        if (x340Var2.i(iu30Var)) {
            i4 = 16384;
        } else {
            i4 = 8192;
        }
        i5 = i13 | i4;
        if ((i5 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (x340Var2.Y(i5 & 1, z2)) {
            x340Var2.d0();
            i6 = i & 1;
            qim0Var3 = nim0.a;
            if (i6 != 0) {
                if ((i2 & 4) != 0) {
                    strO0 = cwl1.o0(x340Var2, 2131957894);
                    i5 &= -897;
                }
                i7 = i5;
                qim0Var4 = qim0Var3;
            } else {
                if ((i2 & 4) != 0) {
                    strO0 = cwl1.o0(x340Var2, 2131957894);
                    i5 &= -897;
                }
                i7 = i5;
                qim0Var4 = qim0Var3;
            }
            x340Var2.s();
            qim0 qim0VarB2 = uyn1.B(u291.f(anm1.N("#LyricsFullscreenSelectionFooterTag", qim0Var4), 1.0f), 0.0f, 16.0f, 0.0f, 0.0f, 13);
            gfh0VarC = t1c.c(een.e, false);
            iHashCode = Long.hashCode(x340Var2.T);
            xos0VarM = x340Var2.m();
            qim0VarE = zr7.E(x340Var2, qim0VarB2);
            hzj.A.getClass();
            if (x340Var2.a != null) {
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
            if (z) {
                x340Var2.i0(-1837962729);
                if (str2 == null) {
                    x340Var2.i0(-1142269750);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-1142269749);
                    zG = x340Var2.g(str2);
                    objT2 = x340Var2.T();
                    if (zG) {
                        objT2 = new z9b0(str2, (byte) 20);
                        x340Var2.s0(objT2);
                    } else {
                        objT2 = new z9b0(str2, (byte) 20);
                        x340Var2.s0(objT2);
                    }
                    t1c.a(s161.b(qim0Var3, false, (iu30) objT2), x340Var2, 0);
                    x340Var2.r(false);
                }
                x340Var2.r(false);
            } else {
                x340Var2.i0(-1142055260);
                x340Var2.r(false);
            }
            if ((i7 & 57344) == 16384) {
                z3 = true;
            } else {
                z3 = false;
            }
            objT = x340Var2.T();
            if (z3) {
                objT = new uef0(iu30Var, (byte) 11);
                x340Var2.s0(objT);
            } else {
                objT = new uef0(iu30Var, (byte) 11);
                x340Var2.s0(objT);
            }
            gbx gbxVar2 = new gbx(new y50(strO0), (Function0) objT);
            idx idxVar2 = new idx(6);
            if (z) {
                x340Var2.i0(-1837946926);
                x340Var2.r(false);
                haxVar = jax.a;
            } else {
                x340Var2.i0(-1837945368);
                haxVar = new hax(cwl1.o0(x340Var2, 2131957893));
                x340Var2.r(false);
            }
            foo1.c(gbxVar2, idxVar2, (qim0) null, haxVar, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, cyi.a, x340Var2, 0, 48, 2028);
            x340Var = x340Var2;
            x340Var.r(true);
            qim0Var2 = qim0Var4;
            str3 = strO0;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
            str3 = strO0;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sqb(z, qim0Var2, str3, str2, iu30Var, i, i2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void r(fw90 fw90Var, int i, pp90 pp90Var, int i2, ldo ldoVar, b0k b0kVar, int i3) throws NoWhenBranchMatchedException {
        int i4;
        ldo ldoVar2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1795656226);
        if ((i3 & 6) == 0) {
            i4 = ((i3 & 8) == 0 ? x340Var.g(fw90Var) : x340Var.i(fw90Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= x340Var.e(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= x340Var.i(pp90Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= x340Var.e(l1d.C(i2)) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= x340Var.i(ldoVar) ? 16384 : 8192;
        }
        if (!x340Var.Y(i4 & 1, (i4 & 9363) != 9362)) {
            ldoVar2 = ldoVar;
            x340Var.b0();
        } else if (fw90Var instanceof ew90) {
            x340Var.i0(951226686);
            ldoVar2 = ldoVar;
            otw.c(ldoVar2, new py90(pp90Var.a, (ew90) fw90Var, i, i2), (qim0) null, (ipb1) null, x340Var, (i4 >> 12) & 14, 12);
            x340Var.r(false);
        } else {
            ldoVar2 = ldoVar;
            if (!(fw90Var instanceof dw90)) {
                throw p3d1.k(x340Var, 951225615, false);
            }
            x340Var.i0(951235345);
            b((dw90) fw90Var, x340Var, i4 & 14);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ek0(fw90Var, i, pp90Var, i2, ldoVar2, i3);
        }
    }

    public static final void s(String str, boolean z, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1214514040);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarN = anm1.N("sectionHeader", uyn1.B(qim0VarF, 0.0f, 12.0f, 0.0f, 4.0f, 5));
            jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var, 0);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            wnb0 wnb0VarQ = kk0.q(x340Var, qim0VarE, y580.Y, 1.0f, false);
            cvx cvxVar3 = cbx.b(x340Var).b;
            uwo1.e(str, uyn1.B(wnb0VarQ, 0.0f, 0.0f, 8.0f, 0.0f, 11), cbx.d(x340Var).k, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, i2 & 14, 0, 2032);
            x340Var = x340Var;
            if (z) {
                x340Var.i0(65950990);
                qim0 qim0VarN2 = anm1.N("settingsButton", nim0Var);
                String strO0 = cwl1.o0(x340Var, 2131956927);
                boolean z2 = (i2 & 896) == 256;
                Object objT = x340Var.T();
                if (z2 || objT == fkj0.X) {
                    objT = new zi80(iu30Var, (byte) 26);
                    x340Var.s0(objT);
                }
                Function0 function0 = (Function0) objT;
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                } else {
                    foo1.c(new gbx(new y50(strO0), function0), kdx.c, qim0VarN2, (max) null, yla.s(x340Var), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, uti.b, x340Var, 0, 48, 2008);
                    x340Var.r(false);
                }
            } else {
                x340Var.i0(66910254);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uw90(str, z, iu30Var, i, (byte) 0);
        }
    }

    public static final void t(lw90 lw90Var, d6o0 d6o0Var, ldo ldoVar, ng20 ng20Var, boolean z, iu30 iu30Var, float f, b0k b0kVar, int i) {
        lw90 lw90Var2;
        int i2;
        boolean z2;
        iu30 iu30Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2077878726);
        if ((i & 6) == 0) {
            lw90Var2 = lw90Var;
            i2 = (x340Var.g(lw90Var2) ? 4 : 2) | i;
        } else {
            lw90Var2 = lw90Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(d6o0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(ldoVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(ng20Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            z2 = z;
            i2 |= x340Var.h(z2) ? 16384 : 8192;
        } else {
            z2 = z;
        }
        if ((196608 & i) == 0) {
            iu30Var2 = iu30Var;
            i2 |= x340Var.i(iu30Var2) ? 131072 : 65536;
        } else {
            iu30Var2 = iu30Var;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.d(f) ? 1048576 : 524288;
        }
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            qim0 qim0VarL = bmq0.L(nim0.a, d6o0Var, (g6o0) null);
            zzq0 zzq0VarJ = uyn1.j(0.0f, 0.0f, 0.0f, f, 7);
            era eraVar = een.P0;
            boolean zI = ((i2 & 14) == 4) | ((458752 & i2) == 131072) | x340Var.i(ldoVar) | x340Var.i(ng20Var) | ((i2 & 57344) == 16384);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                o96 o96Var = new o96(lw90Var2, iu30Var2, ldoVar, ng20Var, z2);
                x340Var.s0(o96Var);
                objT = o96Var;
            }
            ujo1.d(qim0VarL, (xtb0) null, zzq0VarJ, false, h36.c, eraVar, (iq20) null, false, (hxq0) null, (iu30) objT, x340Var, 0, 458);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ww90(lw90Var, d6o0Var, ldoVar, ng20Var, z, iu30Var, f, i);
        }
    }

    public static final void u(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(200701547);
        if (x340Var.Y(i & 1, i != 0)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            rqo1.g(0, 0, x340Var, uyn1.z(0.0f, 8.0f, 1, nim0.a));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yg20(i, (byte) 27);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void v(qw90 qw90Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        String strN0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2072338543);
        int i2 = (x340Var.g(qw90Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            if (qw90Var instanceof pw90) {
                strN0 = x0d.k(x340Var, 1347488428, 2131956929, x340Var, false);
            } else {
                if (!(qw90Var instanceof ow90)) {
                    throw p3d1.k(x340Var, 1347487199, false);
                }
                x340Var.i0(1347490231);
                strN0 = cwl1.n0(2131956923, new Object[]{((ow90) qw90Var).a}, x340Var);
                x340Var.r(false);
            }
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            uwo1.e(strN0, anm1.N("sheetTitle", uyn1.y(nim0.a, 16.0f, 8.0f)), cbx.d(x340Var).h, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2024);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gs90(qw90Var, i, (byte) 2);
        }
    }

    public static final void w(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(220078976);
        if (x340Var.Y(i & 1, i != 0)) {
            crm0.o(cwl1.o0(x340Var, 2131962751), "song_dna_search_results_empty", x340Var, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new t491(i, (byte) 11);
        }
    }

    public static final void x(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1886564764);
        if (x340Var.Y(i & 1, i != 0)) {
            crm0.o(cwl1.o0(x340Var, 2131962758), "song_dna_search_results_failed", x340Var, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new t491(i, (byte) 12);
        }
    }

    public static final void y(vtf1 vtf1Var, boolean z, boolean z2, boolean z3, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1309993087);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(vtf1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.h(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.h(z3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.g(qim0Var) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            xb10 xb10VarO = x4p1.o(x340Var);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = yv91.a(new q27(xb10VarO, (byte) 2));
                x340Var.s0(objT);
            }
            qim0 qim0VarF = dug.f(u291.d(qim0Var, 1.0f), ((u7h) ((tob1) objT).getValue()).a, d4o1.a);
            x340Var.j0(475845883);
            wat watVar = (wat) x340Var.k(t4k.h);
            x340Var.j0(-492369756);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = x0d.o(watVar, x340Var);
            }
            x340Var.r(false);
            ufh0 ufh0Var = (ufh0) objT2;
            x340Var.j0(-492369756);
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = x0d.m(x340Var);
            }
            x340Var.r(false);
            xhl xhlVar = (xhl) objT3;
            x340Var.j0(-492369756);
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                objT4 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT4);
            }
            x340Var.r(false);
            ven0 ven0Var = (ven0) objT4;
            x340Var.j0(-492369756);
            Object objT5 = x340Var.T();
            if (objT5 == m4cVar) {
                objT5 = x0d.n(xhlVar, x340Var);
            }
            x340Var.r(false);
            nil nilVar = (nil) objT5;
            x340Var.j0(-492369756);
            Object objT6 = x340Var.T();
            if (objT6 == m4cVar) {
                objT6 = bb00.i(rih1.a, f331.X0, x340Var);
            }
            x340Var.r(false);
            ven0 ven0Var2 = (ven0) objT6;
            who1.h(s161.b(qim0VarF, false, new tu(ufh0Var, (byte) 24)), apo.i(x340Var, -1488813576, new eob0(ven0Var2, xhlVar, new su(ven0Var, nilVar, (byte) 20), vtf1Var, z, z2, z3, xb10VarO)), new ru(ven0Var2, ufh0Var, nilVar, ven0Var, (byte) 20), x340Var, 48);
            x340Var.r(false);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vre(vtf1Var, z, z2, z3, qim0Var, i, (byte) 2);
        }
    }

    public static int z(boolean[] zArr, int i, int[] iArr, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            int i4 = 0;
            while (i4 < i3) {
                zArr[i] = z;
                i4++;
                i++;
            }
            i2 += i3;
            z = !z;
        }
        return i2;
    }

    public abstract boolean[] E(String str);

    public int F() {
        return 10;
    }

    public abstract void G(int i);

    public abstract void J(boolean z);

    public abstract void K(int i);

    public abstract void L(int i);

    public qwa j(String str, int i, int i2, int i3, Map map) {
        if (str.isEmpty()) {
            hhg1.n("Found empty contents");
            return null;
        }
        int iF = F();
        EnumMap enumMap = (EnumMap) map;
        qax qaxVar = qax.f;
        if (enumMap.containsKey(qaxVar)) {
            iF = Integer.parseInt(enumMap.get(qaxVar).toString());
        }
        boolean[] zArrE = E(str);
        int length = zArrE.length;
        int i4 = iF + length;
        int iMax = Math.max(200, i4);
        int iMax2 = Math.max(1, 200);
        int i5 = iMax / i4;
        int i6 = (iMax - (length * i5)) / 2;
        qwa qwaVar = new qwa(iMax, iMax2);
        int i7 = 0;
        while (i7 < length) {
            if (zArrE[i7]) {
                qwaVar.d(i6, 0, i5, iMax2);
            }
            i7++;
            i6 += i5;
        }
        return qwaVar;
    }

    public void I(boolean z) {
    }
}
