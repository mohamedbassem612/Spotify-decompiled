package p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
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
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class mue1 {
    public static final khc a = new khc((byte) 7);
    public static b180 b;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object A(uu00 uu00Var, String str, onm onmVar) {
        qry qryVar;
        if (onmVar instanceof qry) {
            qryVar = (qry) onmVar;
            int i = qryVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qryVar.c = i - Integer.MIN_VALUE;
            } else {
                qryVar = new qry(onmVar);
            }
        } else {
            qryVar = new qry(onmVar);
        }
        Object objL = qryVar.b;
        int i2 = qryVar.c;
        if (i2 == 0) {
            hm5.M(objL);
            Observable observableFilter = ((zu00) uu00Var).b(new oi("EntitySegmentPlaybackHandlerMetadataLoader", false, new kov(str, (byte) 16))).filter(qzs0.c1);
            qryVar.a = str;
            qryVar.c = 1;
            objL = fc11.l(observableFilter, 1, (Object) null, qryVar);
            d9n d9nVar = d9n.a;
            if (objL == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = qryVar.a;
            hm5.M(objL);
        }
        return ((uv00) objL).a(jo70.class, str).b;
    }

    public static String B(Context context, yoh0 yoh0Var) {
        soh0 soh0Var = yoh0Var.b;
        if (soh0Var == null) {
            return null;
        }
        String str = soh0Var.b;
        Uri uri = soh0Var.a;
        if (str == null) {
            if (Objects.equals(uri.getScheme(), "content")) {
                return context.getContentResolver().getType(uri);
            }
            String path = uri.getPath();
            if (path == null) {
                return null;
            }
            int iLastIndexOf = path.lastIndexOf(".");
            if (iLastIndexOf >= 0) {
                if (iLastIndexOf < path.length() - 1) {
                    String strW = eth.W(path.substring(iLastIndexOf + 1));
                    strW.getClass();
                    switch (strW) {
                        case "arw":
                        case "cr2":
                        case "k25":
                        case "raw":
                            return "image/raw";
                        case "bmp":
                        case "dib":
                            return "image/bmp";
                        case "gif":
                            return "image/gif";
                        case "ico":
                            return "image/x-icon";
                        case "jfi":
                        case "jif":
                        case "jpe":
                        case "jpg":
                        case "jfif":
                        case "jpeg":
                            return "image/jpeg";
                        case "png":
                            return "image/png";
                        case "svg":
                        case "svgz":
                            return "image/svg+xml";
                        case "tif":
                        case "tiff":
                            return "image/tiff";
                        case "avif":
                            return "image/avif";
                        case "heic":
                            return "image/heic";
                        case "heif":
                            return "image/heif";
                        case "webp":
                            return "image/webp";
                        default:
                            return null;
                    }
                }
            }
        }
        return str;
    }

    public static final int C(Bundle bundle, String str) {
        int i = bundle.getInt(str, Integer.MIN_VALUE);
        if (i != Integer.MIN_VALUE || bundle.getInt(str, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i;
        }
        y9g1.o(str);
        throw null;
    }

    public static final String D(h661 h661Var, nfa0 nfa0Var, int i) {
        P(nfa0Var, h661Var);
        return h661Var.e(i);
    }

    public static final int E(h661 h661Var, nfa0 nfa0Var, String str) {
        P(nfa0Var, h661Var);
        int iC = h661Var.c(str);
        if (iC != -3 || !nfa0Var.a.k) {
            return iC;
        }
        l7m0 l7m0Var = nfa0Var.c;
        qga0 qga0Var = new qga0(h661Var, nfa0Var, (byte) 0);
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) l7m0Var.b;
        Map map = (Map) concurrentHashMap.get(h661Var);
        khc khcVar = a;
        Object obj = map != null ? map.get(khcVar) : null;
        Object objInvoke = obj != null ? obj : null;
        if (objInvoke == null) {
            objInvoke = qga0Var.invoke();
            Object objM = concurrentHashMap.get(h661Var);
            if (objM == null) {
                objM = ppo1.m(2);
                concurrentHashMap.put(h661Var, objM);
            }
            ((Map) objM).put(khcVar, objInvoke);
        }
        Integer num = (Integer) ((Map) objInvoke).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public static final int F(h661 h661Var, nfa0 nfa0Var, String str, String str2) throws SerializationException {
        int iE = E(h661Var, nfa0Var, str);
        if (iE != -3) {
            return iE;
        }
        throw new SerializationException(h661Var.h() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static int G(String str) {
        int i = asj0.i(str);
        if (i == 4) {
            return 2;
        }
        return i;
    }

    public static final Bundle H(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        y9g1.o(str);
        throw null;
    }

    public static final ArrayList I(Bundle bundle) {
        return bundle.getStringArrayList("classes_to_restore");
    }

    public static final boolean J(nfa0 nfa0Var, h661 h661Var) {
        if (nfa0Var.a.b) {
            return true;
        }
        List annotations = h661Var.getAnnotations();
        if ((annotations instanceof Collection) && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof lga0) {
                return true;
            }
        }
        return false;
    }

    public static final boolean K(Bundle bundle) {
        return bundle.isEmpty();
    }

    public static final boolean L(nue1 nue1Var, uvg1 uvg1Var) {
        if (uvg1Var.a < 0 || uvg1Var.b > nue1Var.a.a) {
            return false;
        }
        long jMax = Math.max(1000L, nue1Var.i);
        long jMin = Math.min(nue1Var.j, nue1Var.a.a);
        long j = uvg1Var.c;
        return jMax <= j && j <= jMin;
    }

    public static final gmh1 M(gmh1 gmh1Var, boolean z) {
        g4t g4tVarP = l7c.p(gmh1Var, z);
        if (g4tVarP != null) {
            return g4tVarP;
        }
        qx81 qx81VarN = N(gmh1Var);
        return qx81VarN != null ? qx81VarN : gmh1Var.x0(false);
    }

    public static final qx81 N(gmh1 gmh1Var) {
        e890 e890Var;
        e890 e890VarT0 = gmh1Var.t0();
        e890 e890Var2 = e890VarT0 instanceof e890 ? e890VarT0 : null;
        if (e890Var2 != null) {
            LinkedHashSet<gmh1> linkedHashSet = e890Var2.b;
            ArrayList arrayList = new ArrayList(q7h.U(linkedHashSet, 10));
            boolean z = false;
            for (gmh1 gmh1VarM : linkedHashSet) {
                if (o1h1.e(gmh1VarM)) {
                    gmh1VarM = M(gmh1VarM.w0(), false);
                    z = true;
                }
                arrayList.add(gmh1VarM);
            }
            if (z) {
                gmh1 gmh1VarM2 = e890Var2.a;
                if (gmh1VarM2 == null) {
                    gmh1VarM2 = null;
                } else if (o1h1.e(gmh1VarM2)) {
                    gmh1VarM2 = M(gmh1VarM2.w0(), false);
                }
                arrayList.isEmpty();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList);
                linkedHashSet2.hashCode();
                e890Var = new e890(linkedHashSet2);
                e890Var.a = gmh1VarM2;
            } else {
                e890Var = null;
            }
            if (e890Var != null) {
                return e890Var.a();
            }
        }
        return null;
    }

    public static float O(ie30 ie30Var, b380 b380Var) {
        int i = ie30Var.C;
        int i2 = ie30Var.x;
        int i3 = ie30Var.w;
        int i4 = i % 180;
        int i5 = i4 == 0 ? i3 : i2;
        int i6 = i4 == 0 ? i2 : i3;
        float f = 0.0f;
        for (int i7 = 0; i7 < b380Var.size(); i7++) {
            ig41 ig41Var = (siw) b380Var.get(i7);
            if (!(ig41Var instanceof js40)) {
                return -1.0f;
            }
            js40 js40Var = (js40) ig41Var;
            if (ig41Var instanceof ig41) {
                float f2 = ig41Var.a;
                if (f2 % 90.0f != 0.0f) {
                    return -1.0f;
                }
                f += f2;
                float f3 = f % 180.0f;
                i5 = f3 == 0.0f ? i3 : i2;
                i6 = f3 == 0.0f ? i2 : i3;
            } else if (!js40Var.e(i5, i6)) {
                return -1.0f;
            }
        }
        float f4 = f % 360.0f;
        if (f4 % 90.0f == 0.0f) {
            return f4;
        }
        return -1.0f;
    }

    public static final void P(nfa0 nfa0Var, h661 h661Var) {
        u890.j(h661Var.getKind(), uic1.h);
    }

    public static final float Q(iix0 iix0Var) {
        if (!(iix0Var instanceof gix0)) {
            if (iix0Var instanceof hix0) {
                return 0.0f;
            }
            eg.o();
            return 0.0f;
        }
        gix0 gix0Var = (gix0) iix0Var;
        long j = gix0Var.b;
        if (j == 0) {
            return 0.0f;
        }
        long j2 = gix0Var.c;
        if (j2 > j) {
            j2 = j;
        }
        return j2 / j;
    }

    public static final f811 R(nue1 nue1Var, n10 n10Var) {
        l00 l00Var;
        long j;
        float f;
        float fO;
        long jR;
        uvg1 uvg1Var;
        uvg1 uvg1Var2;
        long j2;
        long jR2;
        uvg1 uvg1Var3;
        int i;
        float f2 = nue1Var.e;
        long j3 = nue1Var.j;
        long j4 = nue1Var.i;
        d161 d161Var = nue1Var.d;
        uvg1 uvg1Var4 = nue1Var.b;
        ejk1 ejk1Var = nue1Var.a;
        boolean z = n10Var instanceof lz;
        kaw kawVar = kaw.a;
        if (z) {
            int i2 = ((lz) n10Var).a;
            z061 z061Var = new z061(i2, uvg1Var4, 0.0f);
            int iC = l1d.C(i2);
            if (iC == 0) {
                i = 1;
            } else {
                if (iC != 1) {
                    eg.o();
                    return null;
                }
                i = 2;
            }
            return new f811(nue1.a(nue1Var, null, null, null, z061Var, i2 == 1 ? 0.0f : 1.0f, false, i, null, 0L, 0L, 0L, 1959), Collections.singletonList(kawVar));
        }
        if (n10Var instanceof mz) {
            float f3 = ((mz) n10Var).a;
            z061 z061Var2 = d161Var instanceof z061 ? (z061) d161Var : null;
            if (z061Var2 == null) {
                return new f811(nue1Var);
            }
            uvg1 uvg1Var5 = z061Var2.b;
            int i3 = z061Var2.a;
            float fB = ejk1Var.b();
            long j5 = ejk1Var.a;
            if (fB <= 0.0f) {
                return new f811(nue1Var);
            }
            int iC2 = l1d.C(i3);
            if (iC2 == 0) {
                j2 = uvg1Var5.a;
            } else {
                if (iC2 != 1) {
                    eg.o();
                    return null;
                }
                j2 = uvg1Var5.b;
            }
            long j6 = uvg1Var5.a;
            long j7 = j2;
            long j8 = uvg1Var5.b;
            long j9 = j7 + ((long) (f3 / fB));
            long jMax = Math.max(1000L, j4);
            long jMin = Math.min(j3, j5);
            int iC3 = l1d.C(i3);
            if (iC3 == 0) {
                long jMax2 = Math.max(0L, j8 - jMin);
                long j10 = j8 - jMax;
                if (jMax2 > j10) {
                    return new f811(nue1Var);
                }
                jR2 = yoi1.r(j9, jMax2, j10);
            } else {
                if (iC3 != 1) {
                    eg.o();
                    return null;
                }
                long j11 = j6 + jMax;
                long jMin2 = Math.min(j5, jMin + j6);
                if (j11 > jMin2) {
                    return new f811(nue1Var);
                }
                jR2 = yoi1.r(j9, j11, jMin2);
            }
            int iC4 = l1d.C(i3);
            if (iC4 == 0) {
                uvg1Var3 = new uvg1(jR2, j8);
            } else {
                if (iC4 != 1) {
                    eg.o();
                    return null;
                }
                uvg1Var3 = new uvg1(j6, jR2);
            }
            uvg1 uvg1VarV = V(nue1Var, uvg1Var3, i3);
            return new f811(nue1.a(nue1Var, null, uvg1Var3, uvg1VarV, z061.a(z061Var2, null, ktd.e(jR2 - j7, fB, f3, 10.0f), 3), 0.0f, false, 0, null, 0L, 0L, 0L, 2033), Collections.singletonList(new zew(uvg1VarV)));
        }
        boolean z2 = n10Var instanceof jz;
        jaw jawVar = jaw.a;
        b161 b161Var = b161.a;
        if (z2) {
            z061 z061Var3 = d161Var instanceof z061 ? (z061) d161Var : null;
            if (z061Var3 == null) {
                return new f811(nue1Var);
            }
            uvg1 uvg1VarV2 = V(nue1Var, uvg1Var4, z061Var3.a);
            return new f811(nue1.a(nue1Var, ejk1.c(ejk1Var, uvg1VarV2), uvg1VarV2, uvg1VarV2, b161Var, 0.0f, false, 4, null, 0L, 0L, uvg1VarV2.c, 944), p7h.M(new kiw[]{new zew(uvg1VarV2), jawVar}));
        }
        if (n10Var instanceof i00) {
            return new f811(nue1.a(nue1Var, null, null, null, new a161(f2), 0.0f, false, 3, null, 0L, 0L, 0L, 1975), Collections.singletonList(kew.a));
        }
        if (n10Var instanceof j00) {
            j00 j00Var = (j00) n10Var;
            a161 a161Var = d161Var instanceof a161 ? (a161) d161Var : null;
            if (a161Var == null) {
                return new f811(nue1Var);
            }
            float fB2 = ejk1Var.b() * uvg1Var4.c;
            if (fB2 <= 0.0f) {
                return new f811(nue1Var);
            }
            float fO2 = yoi1.o((j00Var.a / fB2) + a161Var.a, 0.0f, 1.0f);
            return new f811(nue1.a(nue1Var, null, null, null, null, fO2, false, 0, null, 0L, 0L, 0L, 2031), Collections.singletonList(new jew(fO2)));
        }
        if (n10Var instanceof h00) {
            return new f811(nue1.a(nue1Var, null, null, null, b161Var, 0.0f, false, 4, null, 0L, 0L, 0L, 1975), Collections.singletonList(new lew(f2)));
        }
        if (n10Var instanceof k00) {
            float f4 = ((k00) n10Var).a;
            float fB3 = ejk1Var.b();
            long jB = ejk1Var.c;
            if (fB3 > 0.0f) {
                jB += (long) (f4 / ejk1Var.b());
            }
            long jR3 = yoi1.r(jB, uvg1Var4.a, uvg1Var4.b);
            long j12 = uvg1Var4.c;
            float fO3 = j12 > 0 ? yoi1.o((jR3 - uvg1Var4.a) / j12, 0.0f, 1.0f) : 0.0f;
            return new f811(nue1.a(nue1Var, null, null, null, null, fO3, false, 0, null, 0L, 0L, 0L, 2031), Collections.singletonList(new lew(fO3)));
        }
        if (!(n10Var instanceof gz)) {
            if (n10Var instanceof t00) {
                return new f811(nue1.a(nue1Var, null, null, null, c161.a, 0.0f, false, 0, null, 0L, 0L, 0L, 2039), Collections.singletonList(kawVar));
            }
            if (n10Var instanceof u00) {
                u00 u00Var = (u00) n10Var;
                float fB4 = ejk1Var.b();
                if (fB4 <= 0.0f) {
                    return new f811(nue1Var);
                }
                long j13 = (long) (u00Var.a / fB4);
                if (j13 == 0) {
                    return new f811(nue1Var);
                }
                long j14 = uvg1Var4.c;
                long j15 = uvg1Var4.a;
                long jR4 = yoi1.r(j15 + j13, 0L, ejk1Var.a - j14);
                uvg1 uvg1Var6 = new uvg1(jR4, j14 + jR4);
                long j16 = jR4 - j15;
                if (j16 == 0) {
                    return new f811(nue1Var);
                }
                ejk1 ejk1VarA = ejk1.a(ejk1Var, 0L, 0.0f, ejk1Var.c + j16, ejk1Var.d + j16, 3);
                uvg1 uvg1VarW = W(nue1Var, uvg1Var6);
                return new f811(nue1.a(nue1Var, ejk1VarA, uvg1Var6, uvg1VarW, null, 0.0f, false, 0, null, 0L, 0L, 0L, 2040), Collections.singletonList(new zew(uvg1VarW)));
            }
            if (n10Var instanceof s00) {
                uvg1 uvg1VarW2 = W(nue1Var, uvg1Var4);
                return new f811(nue1.a(nue1Var, ejk1.c(ejk1Var, uvg1VarW2), uvg1VarW2, uvg1VarW2, b161Var, 0.0f, false, 0, null, 0L, 0L, 0L, 2032), p7h.M(new kiw[]{new zew(uvg1VarW2), jawVar}));
            }
            if (n10Var instanceof pz) {
                return new f811(nue1.a(nue1Var, ejk1.c(ejk1.a(ejk1Var, 0L, ((pz) n10Var).a, 0L, 0L, 13), uvg1Var4), null, null, null, 0.0f, false, 0, null, 0L, 0L, 0L, 2046));
            }
            if (!(n10Var instanceof l00)) {
                eg.o();
                return null;
            }
            l00 l00Var2 = (l00) n10Var;
            if ((d161Var instanceof z061) || (d161Var instanceof c161)) {
                nue1 nue1VarA = nue1.a(nue1Var, null, null, null, null, 0.0f, l00Var2.d, 0, l00Var2.e, l00Var2.f, l00Var2.g, 0L, 1119);
                if (nue1VarA.equals(nue1Var)) {
                    nue1VarA = nue1Var;
                }
                return new f811(nue1VarA);
            }
            if (d161Var instanceof a161) {
                uvg1 uvg1Var7 = l00Var2.a;
                return new f811(nue1.a(nue1Var, null, uvg1Var7, uvg1Var7, null, 0.0f, l00Var2.d, 0, l00Var2.e, l00Var2.f, l00Var2.g, uvg1Var7.c, 89));
            }
            if (!(d161Var instanceof b161)) {
                eg.o();
                return null;
            }
            uvg1 uvg1Var8 = l00Var2.a;
            nue1 nue1VarA2 = nue1.a(nue1Var, null, uvg1Var8, uvg1Var8, null, l00Var2.c, l00Var2.d, l00Var2.d ? 5 : 4, l00Var2.e, l00Var2.f, l00Var2.g, !u890.j(uvg1Var8, uvg1Var4) ? uvg1Var8.c : nue1Var.k, 9);
            if (u890.j(uvg1Var8, uvg1Var4)) {
                l00Var = l00Var2;
                if (l00Var.b != ejk1Var.a) {
                }
                return new f811(nue1VarA2);
            }
            l00Var = l00Var2;
            nue1VarA2 = nue1.a(nue1VarA2, ejk1.c(ejk1.a(nue1VarA2.a, l00Var.b, 0.0f, 0L, 0L, 14), nue1VarA2.b), null, null, null, 0.0f, false, 0, null, 0L, 0L, 0L, 2046);
            return new f811(nue1VarA2);
        }
        z061 z061Var4 = d161Var instanceof z061 ? (z061) d161Var : null;
        if (z061Var4 == null) {
            return new f811(nue1Var);
        }
        int i4 = z061Var4.a;
        float f5 = ejk1Var.b;
        long j17 = ejk1Var.c;
        long j18 = ejk1Var.a;
        if (f5 <= 0.0f) {
            return new f811(nue1Var);
        }
        int iC5 = l1d.C(i4);
        if (iC5 == 0) {
            j = uvg1Var4.a;
        } else {
            if (iC5 != 1) {
                eg.o();
                return null;
            }
            j = uvg1Var4.b;
        }
        long j19 = j;
        float fB5 = ejk1Var.b() * (j19 - j17);
        float f6 = ejk1Var.b;
        float f7 = 0.1f * f6;
        int iC6 = l1d.C(i4);
        if (iC6 == 0) {
            f = 1.0f;
            if (fB5 >= f7) {
                return new f811(nue1Var);
            }
            fO = yoi1.o(fB5 / f7, 0.0f, 1.0f);
        } else {
            if (iC6 != 1) {
                eg.o();
                return null;
            }
            if (fB5 <= f6 - f7) {
                return new f811(nue1Var);
            }
            f = 1.0f;
            fO = yoi1.o((f6 - fB5) / f7, 0.0f, 1.0f);
        }
        float f8 = f - fO;
        float fB6 = ejk1Var.b();
        if (fB6 <= 0.0f) {
            return new f811(nue1Var);
        }
        float f9 = (f8 * 8.0f) / fB6;
        uvg1 uvg1Var9 = z061Var4.b;
        int iC7 = l1d.C(i4);
        if (iC7 == 0) {
            f9 = -f9;
        } else if (iC7 != 1) {
            eg.o();
            return null;
        }
        long jMax3 = Math.max(1000L, j4);
        long jMin3 = Math.min(j3, j18);
        long j20 = (long) f9;
        long j21 = j19 + j20;
        int iC8 = l1d.C(i4);
        if (iC8 == 0) {
            long jMax4 = Math.max(0L, uvg1Var9.b - jMin3);
            long j22 = uvg1Var9.b - jMax3;
            if (jMax4 > j22) {
                return new f811(nue1Var);
            }
            jR = yoi1.r(j21, jMax4, j22);
        } else {
            if (iC8 != 1) {
                eg.o();
                return null;
            }
            long j23 = uvg1Var9.a;
            long j24 = j23 + jMax3;
            long jMin4 = Math.min(j18, j23 + jMin3);
            if (j24 > jMin4) {
                return new f811(nue1Var);
            }
            jR = yoi1.r(j21, j24, jMin4);
        }
        if (jR == j19) {
            return new f811(nue1Var);
        }
        int iC9 = l1d.C(i4);
        if (iC9 == 0) {
            uvg1Var = new uvg1(jR, uvg1Var9.b);
        } else {
            if (iC9 != 1) {
                eg.o();
                return null;
            }
            uvg1Var = new uvg1(uvg1Var9.a, jR);
        }
        uvg1 uvg1Var10 = uvg1Var;
        int iC10 = l1d.C(i4);
        if (iC10 == 0) {
            uvg1Var2 = new uvg1(uvg1Var9.a + j20, uvg1Var9.b);
        } else {
            if (iC10 != 1) {
                eg.o();
                return null;
            }
            uvg1Var2 = new uvg1(uvg1Var9.a, uvg1Var9.b + j20);
        }
        ejk1 ejk1VarA2 = ejk1.a(ejk1Var, 0L, 0.0f, j17 + j20, ejk1Var.d + j20, 3);
        uvg1 uvg1VarV3 = V(nue1Var, uvg1Var10, i4);
        return new f811(nue1.a(nue1Var, ejk1VarA2, uvg1Var10, uvg1VarV3, z061.a(z061Var4, uvg1Var2, 0.0f, 5), 0.0f, false, 0, null, 0L, 0L, 0L, 2032), Collections.singletonList(new zew(uvg1VarV3)));
    }

    public static final ifn0 S(mga mgaVar, urm urmVar, q8n q8nVar) {
        return new ifn0(mgaVar, urmVar, q8nVar, u2m.N0);
    }

    public static final float T(long j) {
        return (U(u7h.d(j)) * 0.0722f) + (U(u7h.f(j)) * 0.7152f) + (U(u7h.g(j)) * 0.2126f);
    }

    public static final float U(float f) {
        return f <= 0.03928f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static final uvg1 V(nue1 nue1Var, uvg1 uvg1Var, int i) {
        uvg1 uvg1Var2;
        if (nue1Var.h.isEmpty()) {
            return uvg1Var;
        }
        smc0 smc0VarX = X(nue1Var.h);
        int iC = l1d.C(i);
        if (iC == 0) {
            uvg1Var2 = (uvg1) z561.g0(z561.T(new k7b1(1, nue1Var, mue1.class, "isValidSelection", "isValidSelection(Lcom/spotify/mediatrimmer/timelineselector/model/TimelineSelectorState;Lcom/spotify/mediatrimmer/mediatrimmermodels/TrimOffset;)Z", 1, (byte) 21), new sgg1(new kue1(uvg1Var, (byte) 0), new i46(smc0VarX, (byte) 1))), new f57(new jue1(uvg1Var, (byte) 0), nue1Var, (byte) 3));
        } else {
            if (iC != 1) {
                eg.o();
                return null;
            }
            uvg1Var2 = (uvg1) z561.g0(z561.T(new k7b1(1, nue1Var, mue1.class, "isValidSelection", "isValidSelection(Lcom/spotify/mediatrimmer/timelineselector/model/TimelineSelectorState;Lcom/spotify/mediatrimmer/mediatrimmermodels/TrimOffset;)Z", 1, (byte) 22), new sgg1(new kue1(uvg1Var, (byte) 1), new i46(smc0VarX, (byte) 1))), new f57(new jue1(uvg1Var, (byte) 1), nue1Var, (byte) 4));
        }
        return uvg1Var2 == null ? nue1Var.c : uvg1Var2;
    }

    public static final uvg1 W(nue1 nue1Var, uvg1 uvg1Var) {
        if (nue1Var.h.isEmpty()) {
            return uvg1Var;
        }
        List list = nue1Var.h;
        long j = nue1Var.k;
        long jMax = Math.max(1000L, nue1Var.i);
        long jMin = Math.min(nue1Var.j, nue1Var.a.a);
        uvg1 uvg1Var2 = null;
        uvg1Var2 = null;
        if (!list.isEmpty() && jMax <= jMin) {
            smc0 smc0VarX = X(list);
            Long lValueOf = j > 0 ? Long.valueOf(j) : null;
            long jLongValue = lValueOf != null ? lValueOf.longValue() : uvg1Var.c;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            u(linkedHashSet, uvg1Var.a, smc0VarX);
            u(linkedHashSet2, uvg1Var.b, smc0VarX);
            for (Iterator it = linkedHashSet2.iterator(); it.hasNext(); it = it) {
                long jLongValue2 = ((Number) it.next()).longValue();
                u(linkedHashSet, jLongValue2 - jLongValue, smc0VarX);
                u(linkedHashSet, jLongValue2 - jMax, smc0VarX);
                u(linkedHashSet, jLongValue2 - jMin, smc0VarX);
            }
            for (Iterator it2 = linkedHashSet.iterator(); it2.hasNext(); it2 = it2) {
                long jLongValue3 = ((Number) it2.next()).longValue();
                u(linkedHashSet2, jLongValue3 + jLongValue, smc0VarX);
                u(linkedHashSet2, jLongValue3 + jMax, smc0VarX);
                u(linkedHashSet2, jLongValue3 + jMin, smc0VarX);
            }
            uvg1Var2 = (uvg1) z561.g0(z561.T(new qna((byte) 20, jMax, jMin), z561.X(new nqv(linkedHashSet2, (byte) 3), new i46(linkedHashSet, (byte) 1))), new f57(new lue1(new lue1(jLongValue, uvg1Var), jLongValue), uvg1Var, (byte) 5));
        }
        return uvg1Var2 == null ? nue1Var.c : uvg1Var2;
    }

    public static final smc0 X(List list) {
        smc0 smc0VarN = k4p1.n();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            n5f0 n5f0Var = (n5f0) it.next();
            Long l = (Long) o7h.C0(smc0VarN);
            long j = n5f0Var.a;
            long j2 = n5f0Var.b;
            if (l == null || l.longValue() != j) {
                smc0VarN.add(Long.valueOf(n5f0Var.a));
            }
            Long l2 = (Long) o7h.C0(smc0VarN);
            if (l2 == null || l2.longValue() != j2) {
                smc0VarN.add(Long.valueOf(j2));
            }
        }
        return k4p1.k(smc0VarN);
    }

    public static final qx81 Y(qx81 qx81Var, qx81 qx81Var2) {
        return d4o1.i(qx81Var) ? qx81Var : new x(qx81Var, qx81Var2);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0115  */
    /* JADX WARN: Code duplicated, block: B:102:0x0117  */
    /* JADX WARN: Code duplicated, block: B:105:0x0120  */
    /* JADX WARN: Code duplicated, block: B:120:0x014f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x0151  */
    /* JADX WARN: Code duplicated, block: B:124:0x0156  */
    /* JADX WARN: Code duplicated, block: B:127:0x0164  */
    /* JADX WARN: Code duplicated, block: B:129:0x0172  */
    /* JADX WARN: Code duplicated, block: B:133:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:135:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:138:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:141:0x01df  */
    /* JADX WARN: Code duplicated, block: B:142:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:148:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:149:0x0209  */
    /* JADX WARN: Code duplicated, block: B:151:0x021e  */
    /* JADX WARN: Code duplicated, block: B:157:0x023a  */
    /* JADX WARN: Code duplicated, block: B:160:0x0253  */
    /* JADX WARN: Code duplicated, block: B:169:0x0266  */
    /* JADX WARN: Code duplicated, block: B:170:0x027b  */
    /* JADX WARN: Code duplicated, block: B:192:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:195:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:196:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:199:0x0303  */
    /* JADX WARN: Code duplicated, block: B:201:0x034f  */
    /* JADX WARN: Code duplicated, block: B:204:0x035f  */
    /* JADX WARN: Code duplicated, block: B:206:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x008e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:57:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00af  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00df  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:89:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:93:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:95:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:96:0x0102  */
    /* JADX WARN: Code duplicated, block: B:98:0x0107  */
    public static final void a(final Function0 function0, final qim0 qim0Var, boolean z, hw61 hw61Var, cec cecVar, xec xecVar, vzq0 vzq0Var, final j2i j2iVar, b0k b0kVar, final int i, final int i2) {
        int i3;
        boolean z2;
        hw61 hw61VarB;
        cec cecVar2;
        xec xecVar2;
        int i4;
        int i5;
        vzq0 vzq0Var2;
        int i6;
        int i7;
        boolean z3;
        b0k b0kVar2;
        final boolean z4;
        final hw61 hw61Var2;
        final cec cecVar3;
        final vzq0 vzq0Var3;
        final xec xecVar3;
        h311 h311VarV;
        dah dahVar;
        xec xecVar4;
        boolean z5;
        int i8;
        cec cecVar4;
        Object objT;
        idn0 idn0Var;
        long j;
        long j2;
        Object objT2;
        bw91 bw91Var;
        boolean zG;
        Object objT3;
        qt80 qt80Var;
        float f;
        Object objT4;
        o95 o95Var;
        boolean zI;
        Object objT5;
        boolean z6;
        xec xecVar5;
        ie5 ie5Var;
        float f2;
        Object objT6;
        int i9;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1310015664);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.i(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar3.g(qim0Var) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 == 0) {
            if ((i & 384) == 0) {
                z2 = z;
                i3 |= b0kVar3.h(z2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    hw61VarB = hw61Var;
                    int i11 = b0kVar3.g(hw61VarB) ? 2048 : 1024;
                    i3 |= i11;
                } else {
                    hw61VarB = hw61Var;
                }
                i3 |= i11;
            } else {
                hw61VarB = hw61Var;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    cecVar2 = cecVar;
                    int i12 = b0kVar3.g(cecVar2) ? 16384 : 8192;
                    i3 |= i12;
                } else {
                    cecVar2 = cecVar;
                }
                i3 |= i12;
            } else {
                cecVar2 = cecVar;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    xecVar2 = xecVar;
                    int i13 = b0kVar3.g(xecVar2) ? 131072 : 65536;
                    i3 |= i13;
                } else {
                    xecVar2 = xecVar;
                }
                i3 |= i13;
            } else {
                xecVar2 = xecVar;
            }
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (b0kVar3.g((Object) null)) {
                    i4 = 1048576;
                } else {
                    i4 = 524288;
                }
                i3 |= i4;
            }
            i5 = i2 & 128;
            if (i5 != 0) {
                i3 |= 12582912;
                vzq0Var2 = vzq0Var;
            } else {
                vzq0Var2 = vzq0Var;
                if ((i & 12582912) == 0) {
                    if (b0kVar3.g(vzq0Var2)) {
                        i6 = 8388608;
                    } else {
                        i6 = 4194304;
                    }
                    i3 |= i6;
                }
            }
            if ((i2 & 256) != 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (b0kVar3.g((Object) null)) {
                    i7 = 67108864;
                } else {
                    i7 = 33554432;
                }
                i3 |= i7;
            }
            if ((805306368 & i) != 0) {
                if (b0kVar3.i(j2iVar)) {
                    i9 = 536870912;
                } else {
                    i9 = 268435456;
                }
                i3 |= i9;
            }
            if ((i3 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (b0kVar3.Y(i3 & 1, z3)) {
                b0kVar3.d0();
                if ((i & 1) != 0 || b0kVar3.E()) {
                    if (i10 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        zzq0 zzq0Var = sec.a;
                        i3 &= -7169;
                        hw61VarB = px61.b(b0kVar3, 7);
                    }
                    if ((i2 & 16) != 0) {
                        zzq0 zzq0Var2 = sec.a;
                        dahVar = (dah) b0kVar3.k(eah.a);
                        cecVar2 = dahVar.W;
                        if (cecVar2 == null) {
                            cecVar2 = new cec(eah.d(dahVar, 26), eah.d(dahVar, 10), u7h.b(eah.d(dahVar, 18), 0.1f, 0.0f, 0.0f, 0.0f, 14), u7h.b(eah.d(dahVar, 19), 0.38f, 0.0f, 0.0f, 0.0f, 14));
                            dahVar.W = cecVar2;
                        }
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        zzq0 zzq0Var3 = sec.a;
                        i3 &= -458753;
                        xecVar2 = new xec();
                    }
                    if (i5 != 0) {
                        vzq0Var2 = sec.a;
                    }
                } else {
                    b0kVar3.b0();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                }
                hw61 hw61Var3 = hw61VarB;
                xecVar4 = xecVar2;
                z5 = z2;
                i8 = i3;
                cecVar4 = cecVar2;
                b0kVar3.s();
                b0kVar3.i0(1691738187);
                objT = b0kVar3.T();
                if (objT == m4cVar) {
                    objT = ktd.n(b0kVar3);
                }
                idn0Var = (idn0) objT;
                b0kVar3.r(false);
                if (z5) {
                    j = cecVar4.a;
                } else {
                    j = cecVar4.c;
                }
                long j3 = j;
                if (z5) {
                    j2 = cecVar4.b;
                } else {
                    j2 = cecVar4.d;
                }
                if (xecVar4 == null) {
                    b0kVar3.i0(1691921830);
                    b0kVar3.r(false);
                    xecVar5 = xecVar4;
                    j2 = j2;
                    idn0Var = idn0Var;
                    z6 = z5;
                    ie5Var = null;
                } else {
                    b0kVar3.i0(-499611205);
                    int i14 = ((i8 >> 6) & 14) | ((i8 >> 9) & 896);
                    objT2 = b0kVar3.T();
                    if (objT2 == m4cVar) {
                        objT2 = new bw91();
                        b0kVar3.s0(objT2);
                    }
                    bw91Var = (bw91) objT2;
                    zG = b0kVar3.g(idn0Var);
                    objT3 = b0kVar3.T();
                    if (zG || objT3 == m4cVar) {
                        objT3 = new vec(idn0Var, bw91Var, (lnm) null, (byte) 0);
                        b0kVar3.s0(objT3);
                    }
                    qxd0.t(idn0Var, b0kVar3, (vu30) objT3);
                    qt80Var = (qt80) o7h.C0(bw91Var);
                    if (z5 || (qt80Var instanceof r9w0) || !(qt80Var instanceof dy60)) {
                        f = 0.0f;
                    } else {
                        f = 1.0f;
                    }
                    objT4 = b0kVar3.T();
                    if (objT4 == m4cVar) {
                        objT4 = new o95(new p3v(f), rno1.c, (Object) null, 12);
                        b0kVar3.s0(objT4);
                    }
                    o95Var = (o95) objT4;
                    p3v p3vVar = new p3v(f);
                    zI = b0kVar3.i(o95Var) | b0kVar3.d(f) | ((((i14 & 14) ^ 6) <= 4 && b0kVar3.h(z5)) || (i14 & 6) == 4) | ((((i14 & 896) ^ 384) <= 256 && b0kVar3.g(xecVar4)) || (i14 & 384) == 256) | b0kVar3.i(qt80Var);
                    objT5 = b0kVar3.T();
                    if (!zI || objT5 == m4cVar) {
                        z6 = z5;
                        objT5 = new wec(o95Var, f, z6, xecVar4, qt80Var, (lnm) null, (byte) 0);
                        xecVar5 = xecVar4;
                        b0kVar3.s0(objT5);
                    } else {
                        xecVar5 = xecVar4;
                        z6 = z5;
                    }
                    qxd0.t(p3vVar, b0kVar3, (vu30) objT5);
                    ie5Var = o95Var.c;
                    b0kVar3.r(false);
                }
                if (ie5Var != null) {
                    f2 = ((p3v) ie5Var.b.getValue()).a;
                } else {
                    f2 = 0.0f;
                }
                objT6 = b0kVar3.T();
                if (objT6 == m4cVar) {
                    objT6 = new u1c((byte) 1);
                    b0kVar3.s0(objT6);
                }
                vzq0 vzq0Var4 = vzq0Var2;
                boolean z7 = z6;
                b0kVar2 = b0kVar3;
                w3d1.b(function0, s161.b(qim0Var, false, (iu30) objT6), z7, hw61Var3, j3, j2, 0.0f, f2, idn0Var, apo.r(-535639973, new gfc(j2, vzq0Var4, j2iVar, (byte) 0), b0kVar3), b0kVar2, (i8 & 8078) | (234881024 & (i8 << 6)), 64);
                vzq0Var3 = vzq0Var4;
                hw61Var2 = hw61Var3;
                cecVar3 = cecVar4;
                xecVar3 = xecVar5;
                z4 = z7;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                z4 = z2;
                hw61Var2 = hw61VarB;
                cecVar3 = cecVar2;
                vzq0Var3 = vzq0Var2;
                xecVar3 = xecVar2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new vu30() { // from class: p.cfc
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        mue1.a(function0, qim0Var, z4, hw61Var2, cecVar3, xecVar3, vzq0Var3, j2iVar, (b0k) obj, czo1.p(i | 1), i2);
                        return rih1.a;
                    }
                };
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                hw61VarB = hw61Var;
                if (b0kVar3.g(hw61VarB)) {
                }
                i3 |= i11;
            } else {
                hw61VarB = hw61Var;
            }
            i3 |= i11;
        } else {
            hw61VarB = hw61Var;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                cecVar2 = cecVar;
                if (b0kVar3.g(cecVar2)) {
                }
                i3 |= i12;
            } else {
                cecVar2 = cecVar;
            }
            i3 |= i12;
        } else {
            cecVar2 = cecVar;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                xecVar2 = xecVar;
                if (b0kVar3.g(xecVar2)) {
                }
                i3 |= i13;
            } else {
                xecVar2 = xecVar;
            }
            i3 |= i13;
        } else {
            xecVar2 = xecVar;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            if (b0kVar3.g((Object) null)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i3 |= i4;
        }
        i5 = i2 & 128;
        if (i5 != 0) {
            i3 |= 12582912;
            vzq0Var2 = vzq0Var;
        } else {
            vzq0Var2 = vzq0Var;
            if ((i & 12582912) == 0) {
                if (b0kVar3.g(vzq0Var2)) {
                    i6 = 8388608;
                } else {
                    i6 = 4194304;
                }
                i3 |= i6;
            }
        }
        if ((i2 & 256) != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            if (b0kVar3.g((Object) null)) {
                i7 = 67108864;
            } else {
                i7 = 33554432;
            }
            i3 |= i7;
        }
        if ((805306368 & i) != 0) {
            if (b0kVar3.i(j2iVar)) {
                i9 = 536870912;
            } else {
                i9 = 268435456;
            }
            i3 |= i9;
        }
        if ((i3 & 306783379) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (b0kVar3.Y(i3 & 1, z3)) {
            b0kVar3.d0();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    z2 = true;
                }
                if ((i2 & 8) != 0) {
                    zzq0 zzq0Var4 = sec.a;
                    i3 &= -7169;
                    hw61VarB = px61.b(b0kVar3, 7);
                }
                if ((i2 & 16) != 0) {
                    zzq0 zzq0Var5 = sec.a;
                    dahVar = (dah) b0kVar3.k(eah.a);
                    cecVar2 = dahVar.W;
                    if (cecVar2 == null) {
                        cecVar2 = new cec(eah.d(dahVar, 26), eah.d(dahVar, 10), u7h.b(eah.d(dahVar, 18), 0.1f, 0.0f, 0.0f, 0.0f, 14), u7h.b(eah.d(dahVar, 19), 0.38f, 0.0f, 0.0f, 0.0f, 14));
                        dahVar.W = cecVar2;
                    }
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    zzq0 zzq0Var6 = sec.a;
                    i3 &= -458753;
                    xecVar2 = new xec();
                }
                if (i5 != 0) {
                    vzq0Var2 = sec.a;
                }
            } else {
                if (i10 != 0) {
                    z2 = true;
                }
                if ((i2 & 8) != 0) {
                    zzq0 zzq0Var7 = sec.a;
                    i3 &= -7169;
                    hw61VarB = px61.b(b0kVar3, 7);
                }
                if ((i2 & 16) != 0) {
                    zzq0 zzq0Var8 = sec.a;
                    dahVar = (dah) b0kVar3.k(eah.a);
                    cecVar2 = dahVar.W;
                    if (cecVar2 == null) {
                        cecVar2 = new cec(eah.d(dahVar, 26), eah.d(dahVar, 10), u7h.b(eah.d(dahVar, 18), 0.1f, 0.0f, 0.0f, 0.0f, 14), u7h.b(eah.d(dahVar, 19), 0.38f, 0.0f, 0.0f, 0.0f, 14));
                        dahVar.W = cecVar2;
                    }
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    zzq0 zzq0Var9 = sec.a;
                    i3 &= -458753;
                    xecVar2 = new xec();
                }
                if (i5 != 0) {
                    vzq0Var2 = sec.a;
                }
            }
            hw61 hw61Var4 = hw61VarB;
            xecVar4 = xecVar2;
            z5 = z2;
            i8 = i3;
            cecVar4 = cecVar2;
            b0kVar3.s();
            b0kVar3.i0(1691738187);
            objT = b0kVar3.T();
            if (objT == m4cVar) {
                objT = ktd.n(b0kVar3);
            }
            idn0Var = (idn0) objT;
            b0kVar3.r(false);
            if (z5) {
                j = cecVar4.a;
            } else {
                j = cecVar4.c;
            }
            long j4 = j;
            if (z5) {
                j2 = cecVar4.b;
            } else {
                j2 = cecVar4.d;
            }
            if (xecVar4 == null) {
                b0kVar3.i0(1691921830);
                b0kVar3.r(false);
                xecVar5 = xecVar4;
                j2 = j2;
                idn0Var = idn0Var;
                z6 = z5;
                ie5Var = null;
            } else {
                b0kVar3.i0(-499611205);
                int i15 = ((i8 >> 6) & 14) | ((i8 >> 9) & 896);
                objT2 = b0kVar3.T();
                if (objT2 == m4cVar) {
                    objT2 = new bw91();
                    b0kVar3.s0(objT2);
                }
                bw91Var = (bw91) objT2;
                zG = b0kVar3.g(idn0Var);
                objT3 = b0kVar3.T();
                if (zG) {
                    objT3 = new vec(idn0Var, bw91Var, (lnm) null, (byte) 0);
                    b0kVar3.s0(objT3);
                } else {
                    objT3 = new vec(idn0Var, bw91Var, (lnm) null, (byte) 0);
                    b0kVar3.s0(objT3);
                }
                qxd0.t(idn0Var, b0kVar3, (vu30) objT3);
                qt80Var = (qt80) o7h.C0(bw91Var);
                if (z5) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                objT4 = b0kVar3.T();
                if (objT4 == m4cVar) {
                    objT4 = new o95(new p3v(f), rno1.c, (Object) null, 12);
                    b0kVar3.s0(objT4);
                }
                o95Var = (o95) objT4;
                p3v p3vVar2 = new p3v(f);
                zI = b0kVar3.i(o95Var) | b0kVar3.d(f) | ((((i15 & 14) ^ 6) <= 4 && b0kVar3.h(z5)) || (i15 & 6) == 4) | ((((i15 & 896) ^ 384) <= 256 && b0kVar3.g(xecVar4)) || (i15 & 384) == 256) | b0kVar3.i(qt80Var);
                objT5 = b0kVar3.T();
                if (zI) {
                    z6 = z5;
                    objT5 = new wec(o95Var, f, z6, xecVar4, qt80Var, (lnm) null, (byte) 0);
                    xecVar5 = xecVar4;
                    b0kVar3.s0(objT5);
                } else {
                    z6 = z5;
                    objT5 = new wec(o95Var, f, z6, xecVar4, qt80Var, (lnm) null, (byte) 0);
                    xecVar5 = xecVar4;
                    b0kVar3.s0(objT5);
                }
                qxd0.t(p3vVar2, b0kVar3, (vu30) objT5);
                ie5Var = o95Var.c;
                b0kVar3.r(false);
            }
            if (ie5Var != null) {
                f2 = ((p3v) ie5Var.b.getValue()).a;
            } else {
                f2 = 0.0f;
            }
            objT6 = b0kVar3.T();
            if (objT6 == m4cVar) {
                objT6 = new u1c((byte) 1);
                b0kVar3.s0(objT6);
            }
            vzq0 vzq0Var5 = vzq0Var2;
            boolean z8 = z6;
            b0kVar2 = b0kVar3;
            w3d1.b(function0, s161.b(qim0Var, false, (iu30) objT6), z8, hw61Var4, j4, j2, 0.0f, f2, idn0Var, apo.r(-535639973, new gfc(j2, vzq0Var5, j2iVar, (byte) 0), b0kVar3), b0kVar2, (i8 & 8078) | (234881024 & (i8 << 6)), 64);
            vzq0Var3 = vzq0Var5;
            hw61Var2 = hw61Var4;
            cecVar3 = cecVar4;
            xecVar3 = xecVar5;
            z4 = z8;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            z4 = z2;
            hw61Var2 = hw61VarB;
            cecVar3 = cecVar2;
            vzq0Var3 = vzq0Var2;
            xecVar3 = xecVar2;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.cfc
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    mue1.a(function0, qim0Var, z4, hw61Var2, cecVar3, xecVar3, vzq0Var3, j2iVar, (b0k) obj, czo1.p(i | 1), i2);
                    return rih1.a;
                }
            };
        }
    }

    public static final void b(bix0 bix0Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var;
        boolean z;
        String str = bix0Var.a;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1917356655);
        int i2 = (x340Var2.g(bix0Var) ? 4 : 2) | i | (x340Var2.i(qim0Var) ? 32 : 16);
        if (x340Var2.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var2).c.f;
            long jC = cbx.a(x340Var2).a.b.c();
            mbh mbhVarA = jbh.a(new d36(8.0f, true, new um5(false)), een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0Var);
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
            qim0 qim0VarH = u291.h(u291.f(nim0.a, 1.0f), 36.0f);
            boolean zF = ((i2 & 14) == 4) | x340Var2.f(jC) | x340Var2.f(j);
            Object objT = x340Var2.T();
            if (zF || objT == fkj0.X) {
                da5 da5Var = new da5(jC, j, bix0Var);
                x340Var2.s0(da5Var);
                objT = da5Var;
            }
            j0o1.b(0, x340Var2, (iu30) objT, qim0VarH);
            if (str.length() > 0) {
                x340Var2.i0(146944899);
                z = true;
                uwo1.e(str, (qim0) null, cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2034);
                x340Var = x340Var2;
                x340Var.r(false);
            } else {
                x340Var = x340Var2;
                z = true;
                x340Var.i0(147092893);
                x340Var.r(false);
            }
            x340Var.r(z);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jjk(bix0Var, qim0Var, i, (byte) 12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0105 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0107  */
    /* JADX WARN: Code duplicated, block: B:46:0x0118  */
    /* JADX WARN: Code duplicated, block: B:47:0x011b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0179  */
    /* JADX WARN: Code duplicated, block: B:60:0x0193  */
    /* JADX WARN: Code duplicated, block: B:62:0x0196  */
    /* JADX WARN: Code duplicated, block: B:66:0x019e  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:75:0x022b  */
    /* JADX WARN: Code duplicated, block: B:86:0x025e  */
    public static final void c(iix0 iix0Var, int i, long j, qim0 qim0Var, b0k b0kVar, int i2) {
        qim0 qim0Var2;
        int i3;
        int iC;
        int i4;
        boolean z;
        qim0 qim0Var3;
        boolean zG;
        int iC2;
        qim0 qim0Var4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1273109733);
        int i5 = i2 | (x340Var.i(iix0Var) ? 4 : 2) | (x340Var.e(l1d.C(i)) ? 32 : 16) | (x340Var.f(j) ? 256 : 128) | 3072;
        if (x340Var.Y(i5 & 1, (i5 & 1171) != 1170)) {
            Resources resources = ((Context) x340Var.k(AndroidCompositionLocals_androidKt.b)).getResources();
            jw31 jw31VarA = ew31.a(new d36(4.0f, true, new um5(false)), een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var5 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var5);
            hzj.A.getClass();
            rle1 rle1Var = null;
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
            resources.getClass();
            boolean z2 = iix0Var instanceof gix0;
            ngv ngvVar = ngv.d;
            if (z2) {
                ogv ogvVar = new ogv(resources, (byte) 0);
                ytw0 ytw0Var = jfv.b;
                gix0 gix0Var = (gix0) iix0Var;
                rle1Var = (rle1) ogvVar.invoke(new jfv(fdg1.l0(gix0Var.b - gix0Var.c, ngvVar)));
            } else {
                if (!(iix0Var instanceof hix0)) {
                    eg.o();
                    return;
                }
                long j2 = ((hix0) iix0Var).b;
                if (j2 != 0) {
                    i3 = 1;
                    ogv ogvVar2 = new ogv(resources, (byte) 1);
                    ytw0 ytw0Var2 = jfv.b;
                    rle1Var = (rle1) ogvVar2.invoke(new jfv(fdg1.l0(j2, ngvVar)));
                }
                iC = l1d.C(i);
                if (iC == 0) {
                    i4 = i3;
                } else if (iC == i3) {
                    eg.o();
                    return;
                } else if (!z2 || ((iix0Var instanceof hix0) && !((hix0) iix0Var).a)) {
                    i4 = i3;
                } else {
                    i4 = 0;
                }
                if (i4 != 0 || rle1Var == null) {
                    z = false;
                    qim0Var3 = qim0Var5;
                    x340Var.i0(100113241);
                    x340Var.r(false);
                } else {
                    x340Var.i0(99906440);
                    boolean zI = x340Var.i(rle1Var);
                    Object objT = x340Var.T();
                    if (zI || objT == fkj0.X) {
                        objT = new wfv(rle1Var, (byte) 0);
                        x340Var.s0(objT);
                    }
                    qim0 qim0VarB = s161.b(qim0Var5, false, (iu30) objT);
                    String str = rle1Var.a;
                    uwr uwrVar = cbx.a;
                    int i6 = (i5 << 3) & 7168;
                    z = false;
                    qim0Var3 = qim0Var5;
                    uwo1.e(str, qim0VarB, cbx.d(x340Var).j, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, i6, 0, 2032);
                    x340Var.r(false);
                }
                zG = iix0Var.g();
                iC2 = l1d.C(i);
                if (iC2 != 0) {
                    if (iC2 == 1) {
                        eg.o();
                        return;
                    } else if ((iix0Var instanceof hix0) || !zG) {
                        zG = z;
                    } else {
                        zG = true;
                    }
                }
                if (zG) {
                    x340Var.i0(100282532);
                    if (i4 != 0) {
                        x340Var.i0(100294188);
                        uwr uwrVar2 = cbx.a;
                        uwo1.e("•", (qim0) null, cbx.d(x340Var).j, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 6, 0, 2042);
                        x340Var.r(z);
                    } else {
                        x340Var.i0(100368185);
                        x340Var.r(z);
                    }
                    String strO0 = cwl1.o0(x340Var, 2131960577);
                    uwr uwrVar3 = cbx.a;
                    uwo1.e(strO0, (qim0) null, cbx.d(x340Var).j, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, (i5 << 3) & 7168, 0, 2034);
                    qim0Var4 = qim0Var3;
                    w0h1.a(klx.c, isl.a, anm1.N("durationProgressIcon", u291.r(qim0Var4, 12.0f)), cbx.a(x340Var).c.c, 0L, false, x340Var, klx.d | 48, 48);
                    x340Var.r(z);
                } else {
                    qim0Var4 = qim0Var3;
                    x340Var.i0(100794745);
                    x340Var.r(z);
                }
                if (!z2 || (Q(iix0Var) > 0.0f && (Q(iix0Var) < 1.0d || !iix0Var.g()))) {
                    x340Var.i0(100847631);
                    tto1.d(Q(iix0Var), 0, 12, 0L, 0L, x340Var, anm1.N("durationProgressProgress", u291.v(qim0Var4, 88.0f)));
                    x340Var.r(z);
                } else {
                    x340Var.i0(101011001);
                    x340Var.r(z);
                }
                x340Var.r(true);
                qim0Var2 = qim0Var4;
            }
            i3 = 1;
            iC = l1d.C(i);
            if (iC == 0) {
                i4 = i3;
            } else if (iC == i3) {
                eg.o();
                return;
            } else if (z2) {
                i4 = i3;
            } else {
                i4 = i3;
            }
            if (i4 != 0) {
                z = false;
                qim0Var3 = qim0Var5;
                x340Var.i0(100113241);
                x340Var.r(false);
            } else {
                z = false;
                qim0Var3 = qim0Var5;
                x340Var.i0(100113241);
                x340Var.r(false);
            }
            zG = iix0Var.g();
            iC2 = l1d.C(i);
            if (iC2 != 0) {
                if (iC2 == 1) {
                    eg.o();
                    return;
                } else if (iix0Var instanceof hix0) {
                    zG = z;
                } else {
                    zG = z;
                }
            }
            if (zG) {
                x340Var.i0(100282532);
                if (i4 != 0) {
                    x340Var.i0(100294188);
                    uwr uwrVar4 = cbx.a;
                    uwo1.e("•", (qim0) null, cbx.d(x340Var).j, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 6, 0, 2042);
                    x340Var.r(z);
                } else {
                    x340Var.i0(100368185);
                    x340Var.r(z);
                }
                String strO1 = cwl1.o0(x340Var, 2131960577);
                uwr uwrVar5 = cbx.a;
                uwo1.e(strO1, (qim0) null, cbx.d(x340Var).j, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, (i5 << 3) & 7168, 0, 2034);
                qim0Var4 = qim0Var3;
                w0h1.a(klx.c, isl.a, anm1.N("durationProgressIcon", u291.r(qim0Var4, 12.0f)), cbx.a(x340Var).c.c, 0L, false, x340Var, klx.d | 48, 48);
                x340Var.r(z);
            } else {
                qim0Var4 = qim0Var3;
                x340Var.i0(100794745);
                x340Var.r(z);
            }
            if (z2) {
                x340Var.i0(100847631);
                tto1.d(Q(iix0Var), 0, 12, 0L, 0L, x340Var, anm1.N("durationProgressProgress", u291.v(qim0Var4, 88.0f)));
                x340Var.r(z);
            } else {
                x340Var.i0(100847631);
                tto1.d(Q(iix0Var), 0, 12, 0L, 0L, x340Var, anm1.N("durationProgressProgress", u291.v(qim0Var4, 88.0f)));
                x340Var.r(z);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var4;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new je3(iix0Var, i, j, qim0Var2, i2);
        }
    }

    public static final void d(hux huxVar, String str, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(440667983);
        int i2 = i | (x340Var.i(huxVar) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            jw31 jw31VarA = ew31.a(h36.e, een.N0, x340Var, 0);
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
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(huxVar, isl.a, u291.r(qim0Var3, 16.0f), cbx.a(x340Var).d.a, 0L, false, x340Var, 56 | (i2 & 14), 48);
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(str, (qim0) null, ktd.l(qim0Var3, 6.0f, x340Var, x340Var).j, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, (i2 >> 3) & 14, 0, 2042);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l42(huxVar, str, qim0Var2, i, (byte) 2);
        }
    }

    public static final void e(c380 c380Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2081857959);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(c380Var) : x340Var.i(c380Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0Var2 = nim0.a;
            fc11.a(c380Var, uyn1.x(qim0Var2, 16.0f), hcx.d, (hux) null, false, 0, (gbx) null, (String) null, (idn0) null, x340Var, 392 | (i3 & 14), 504);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new an9(c380Var, qim0Var, i, (byte) 3);
        }
    }

    public static final void f(c380 c380Var, String str, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1707224344);
        int i2 = i | (x340Var.i(c380Var) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = z ? 2131952476 : 2131956972;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
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
            e(c380Var, null, x340Var, (i2 & 14) | 8);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(qim0Var3, 12.0f));
            i(i3, i2 & 112, str, x340Var, null);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qy90(c380Var, str, z, qim0Var2, i, (byte) 3);
        }
    }

    public static final void g(boolean z, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        int i2;
        Function0 function2;
        Function0 function3;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-266550921);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function2 = function0;
            i2 |= b0kVar3.i(function2) ? 32 : 16;
        } else {
            function2 = function0;
        }
        if ((i & 384) == 0) {
            function3 = function1;
            i2 |= b0kVar3.i(function3) ? 256 : 128;
        } else {
            function3 = function1;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            String strK = z ? x0d.k(b0kVar3, 576213388, 2131952475, b0kVar3, false) : x0d.k(b0kVar3, 576281619, 2131956953, b0kVar3, false);
            Function0 function4 = z ? function3 : function2;
            if (ihc1.y0(strK)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                b0kVar2 = b0kVar3;
                foo1.c(new gbx(new y50(strK), function4), new idx(13), (qim0) null, (max) null, yla.r(b0kVar3), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-2057618122, new dz40(strK, (byte) 27), b0kVar3), b0kVar2, 0, 48, 2012);
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bub(z, function2, function1, i, (byte) 1);
        }
    }

    public static final void h(int i, b0k b0kVar, qim0 qim0Var, boolean z) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1389848693);
        int i2 = (x340Var.h(z) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            int i3 = z ? 2131956971 : 2131956970;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            uwo1.e(cwl1.o0(x340Var, i3), uyn1.z(cbx.b(x340Var).b.c, 0.0f, 2, qim0VarF), cbx.d(x340Var).m, cbx.a(x340Var).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2016);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uc0(z, qim0Var2, i, (byte) 20);
        }
    }

    public static final void i(int i, int i2, String str, b0k b0kVar, qim0 qim0Var) {
        int i3;
        String str2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1381402626);
        if ((i2 & 6) == 0) {
            i3 = i2 | (x340Var.e(i) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            str2 = str;
            i3 |= x340Var.g(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        int i4 = i3 | 384;
        if (x340Var.Y(i4 & 1, (i4 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(cwl1.n0(i, new Object[]{str2}, x340Var), uyn1.z(16.0f, 0.0f, 2, qim0VarF), cbx.d(x340Var).e, cbx.a(x340Var).b.a, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2016);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hk2(i, str, qim0Var2, i2, (byte) 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x00be  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f6 A[LOOP:0: B:55:0x00ed->B:57:0x00f6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x0163  */
    /* JADX WARN: Code duplicated, block: B:62:0x0181  */
    /* JADX WARN: Code duplicated, block: B:63:0x0183  */
    /* JADX WARN: Code duplicated, block: B:66:0x018a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:69:0x0190  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:76:0x01db  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:81:0x014c A[EDGE_INSN: B:81:0x014c->B:58:0x014c BREAK  A[LOOP:0: B:55:0x00ed->B:57:0x00f6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    public static final void j(c380 c380Var, qim0 qim0Var, boolean z, Function0 function0, b0k b0kVar, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        Function0 function1;
        int i5;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Function0 function2;
        qim0 qim0Var2;
        h311 h311VarV;
        qim0 qim0Var3;
        float f;
        jw31 jw31VarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        Iterator itN;
        boolean zHasNext;
        isl islVar;
        boolean z7;
        qim0 qim0Var4;
        Function0 function3;
        boolean z8;
        Function0 function4;
        qim0 qim0Var5;
        boolean z9;
        Object objT;
        Object objT2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1552020402);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? x340Var.g(c380Var) : x340Var.i(c380Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i3 | 48;
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                z2 = z;
                i6 |= x340Var.h(z2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    function1 = function0;
                    if (x340Var.i(function1)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i6 |= i5;
                }
                z3 = true;
                z4 = false;
                if ((i6 & 1171) != 1170) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (x340Var.Y(i6 & 1, z5)) {
                    if (i7 != 0) {
                        z2 = false;
                    }
                    if (i4 != 0) {
                        objT2 = x340Var.T();
                        if (objT2 == m4cVar) {
                            objT2 = lx70.Z0;
                            x340Var.s0(objT2);
                        }
                        function1 = (Function0) objT2;
                    }
                    qim0Var3 = nim0.a;
                    qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var).b;
                    f = 16.0f;
                    qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF);
                    jw31VarA = ew31.a(h36.e, een.Z, x340Var, 0);
                    iHashCode = Long.hashCode(x340Var.T);
                    xos0VarM = x340Var.m();
                    qim0VarE = zr7.E(x340Var, qim0VarZ);
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
                    itN = kk0.n(x340Var, qim0VarE, y580.Y, -18986126, c380Var);
                    while (true) {
                        zHasNext = itN.hasNext();
                        islVar = isl.a;
                        if (zHasNext) {
                            break;
                        }
                        hux huxVar = (hux) itN.next();
                        uwr uwrVar2 = cbx.a;
                        zov0 zov0Var = cbx.b(x340Var).g;
                        w0h1.a(huxVar, islVar, u291.r(qim0Var3, f), u7h.b(u7h.f, 0.2f, 0.0f, 0.0f, 0.0f, 14), 0L, false, x340Var, 56, 48);
                        z2 = z2;
                        z4 = z4;
                        f = f;
                        function1 = function1;
                        qim0Var3 = qim0Var3;
                        z3 = true;
                    }
                    z7 = z2;
                    qim0Var4 = qim0Var3;
                    function3 = function1;
                    z8 = z4;
                    x340Var.r(z8);
                    op71.g(x340Var, new wnb0(1.0f, true));
                    if (z7) {
                        x340Var.i0(-588240498);
                        fux fuxVar = fux.c;
                        uwr uwrVar3 = cbx.a;
                        zov0 zov0Var2 = cbx.b(x340Var).g;
                        qim0Var5 = qim0Var4;
                        qim0 qim0VarR = u291.r(qim0Var5, 24.0f);
                        if ((i6 & 7168) == 2048) {
                            z9 = true;
                        } else {
                            z9 = z8;
                        }
                        objT = x340Var.T();
                        if (!z9 || objT == m4cVar) {
                            function4 = function3;
                            objT = new aba0(function4, (byte) 1);
                            x340Var.s0(objT);
                        } else {
                            function4 = function3;
                        }
                        w0h1.a(fuxVar, islVar, bin.x(qim0VarR, false, (String) null, (pm31) null, (idn0) null, (Function0) objT, 15), 0L, 0L, false, x340Var, fux.d | 48, 56);
                        x340Var.r(z8);
                    } else {
                        function4 = function3;
                        qim0Var5 = qim0Var4;
                        x340Var.i0(-588017360);
                        x340Var.r(z8);
                    }
                    x340Var.r(true);
                    function2 = function4;
                    qim0Var2 = qim0Var5;
                    z6 = z7;
                } else {
                    x340Var.b0();
                    z6 = z2;
                    function2 = function1;
                    qim0Var2 = qim0Var;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new ilf(c380Var, qim0Var2, z6, function2, i, i2);
                }
            }
            i6 |= 3072;
            function1 = function0;
            z3 = true;
            z4 = false;
            if ((i6 & 1171) != 1170) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (x340Var.Y(i6 & 1, z5)) {
                if (i7 != 0) {
                    z2 = false;
                }
                if (i4 != 0) {
                    objT2 = x340Var.T();
                    if (objT2 == m4cVar) {
                        objT2 = lx70.Z0;
                        x340Var.s0(objT2);
                    }
                    function1 = (Function0) objT2;
                }
                qim0Var3 = nim0.a;
                qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
                uwr uwrVar4 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var).b;
                f = 16.0f;
                qim0 qim0VarZ2 = uyn1.z(16.0f, 0.0f, 2, qim0VarF2);
                jw31VarA = ew31.a(h36.e, een.Z, x340Var, 0);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarZ2);
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
                itN = kk0.n(x340Var, qim0VarE, y580.Y, -18986126, c380Var);
                while (true) {
                    zHasNext = itN.hasNext();
                    islVar = isl.a;
                    if (zHasNext) {
                        break;
                        break;
                    }
                    hux huxVar2 = (hux) itN.next();
                    uwr uwrVar5 = cbx.a;
                    zov0 zov0Var3 = cbx.b(x340Var).g;
                    w0h1.a(huxVar2, islVar, u291.r(qim0Var3, f), u7h.b(u7h.f, 0.2f, 0.0f, 0.0f, 0.0f, 14), 0L, false, x340Var, 56, 48);
                    z2 = z2;
                    z4 = z4;
                    f = f;
                    function1 = function1;
                    qim0Var3 = qim0Var3;
                    z3 = true;
                }
                z7 = z2;
                qim0Var4 = qim0Var3;
                function3 = function1;
                z8 = z4;
                x340Var.r(z8);
                op71.g(x340Var, new wnb0(1.0f, true));
                if (z7) {
                    x340Var.i0(-588240498);
                    fux fuxVar2 = fux.c;
                    uwr uwrVar6 = cbx.a;
                    zov0 zov0Var4 = cbx.b(x340Var).g;
                    qim0Var5 = qim0Var4;
                    qim0 qim0VarR2 = u291.r(qim0Var5, 24.0f);
                    if ((i6 & 7168) == 2048) {
                        z9 = true;
                    } else {
                        z9 = z8;
                    }
                    objT = x340Var.T();
                    if (z9) {
                        function4 = function3;
                        objT = new aba0(function4, (byte) 1);
                        x340Var.s0(objT);
                    } else {
                        function4 = function3;
                        objT = new aba0(function4, (byte) 1);
                        x340Var.s0(objT);
                    }
                    w0h1.a(fuxVar2, islVar, bin.x(qim0VarR2, false, (String) null, (pm31) null, (idn0) null, (Function0) objT, 15), 0L, 0L, false, x340Var, fux.d | 48, 56);
                    x340Var.r(z8);
                } else {
                    function4 = function3;
                    qim0Var5 = qim0Var4;
                    x340Var.i0(-588017360);
                    x340Var.r(z8);
                }
                x340Var.r(true);
                function2 = function4;
                qim0Var2 = qim0Var5;
                z6 = z7;
            } else {
                x340Var.b0();
                z6 = z2;
                function2 = function1;
                qim0Var2 = qim0Var;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ilf(c380Var, qim0Var2, z6, function2, i, i2);
            }
        }
        i6 = i3 | 432;
        z2 = z;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                function1 = function0;
                if (x340Var.i(function1)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i6 |= i5;
            }
            z3 = true;
            z4 = false;
            if ((i6 & 1171) != 1170) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (x340Var.Y(i6 & 1, z5)) {
                if (i7 != 0) {
                    z2 = false;
                }
                if (i4 != 0) {
                    objT2 = x340Var.T();
                    if (objT2 == m4cVar) {
                        objT2 = lx70.Z0;
                        x340Var.s0(objT2);
                    }
                    function1 = (Function0) objT2;
                }
                qim0Var3 = nim0.a;
                qim0 qim0VarF3 = u291.f(qim0Var3, 1.0f);
                uwr uwrVar7 = cbx.a;
                cvx cvxVar3 = cbx.b(x340Var).b;
                f = 16.0f;
                qim0 qim0VarZ3 = uyn1.z(16.0f, 0.0f, 2, qim0VarF3);
                jw31VarA = ew31.a(h36.e, een.Z, x340Var, 0);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarZ3);
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
                itN = kk0.n(x340Var, qim0VarE, y580.Y, -18986126, c380Var);
                while (true) {
                    zHasNext = itN.hasNext();
                    islVar = isl.a;
                    if (zHasNext) {
                        break;
                        break;
                    }
                    hux huxVar3 = (hux) itN.next();
                    uwr uwrVar8 = cbx.a;
                    zov0 zov0Var5 = cbx.b(x340Var).g;
                    w0h1.a(huxVar3, islVar, u291.r(qim0Var3, f), u7h.b(u7h.f, 0.2f, 0.0f, 0.0f, 0.0f, 14), 0L, false, x340Var, 56, 48);
                    z2 = z2;
                    z4 = z4;
                    f = f;
                    function1 = function1;
                    qim0Var3 = qim0Var3;
                    z3 = true;
                }
                z7 = z2;
                qim0Var4 = qim0Var3;
                function3 = function1;
                z8 = z4;
                x340Var.r(z8);
                op71.g(x340Var, new wnb0(1.0f, true));
                if (z7) {
                    x340Var.i0(-588240498);
                    fux fuxVar3 = fux.c;
                    uwr uwrVar9 = cbx.a;
                    zov0 zov0Var6 = cbx.b(x340Var).g;
                    qim0Var5 = qim0Var4;
                    qim0 qim0VarR3 = u291.r(qim0Var5, 24.0f);
                    if ((i6 & 7168) == 2048) {
                        z9 = true;
                    } else {
                        z9 = z8;
                    }
                    objT = x340Var.T();
                    if (z9) {
                        function4 = function3;
                        objT = new aba0(function4, (byte) 1);
                        x340Var.s0(objT);
                    } else {
                        function4 = function3;
                        objT = new aba0(function4, (byte) 1);
                        x340Var.s0(objT);
                    }
                    w0h1.a(fuxVar3, islVar, bin.x(qim0VarR3, false, (String) null, (pm31) null, (idn0) null, (Function0) objT, 15), 0L, 0L, false, x340Var, fux.d | 48, 56);
                    x340Var.r(z8);
                } else {
                    function4 = function3;
                    qim0Var5 = qim0Var4;
                    x340Var.i0(-588017360);
                    x340Var.r(z8);
                }
                x340Var.r(true);
                function2 = function4;
                qim0Var2 = qim0Var5;
                z6 = z7;
            } else {
                x340Var.b0();
                z6 = z2;
                function2 = function1;
                qim0Var2 = qim0Var;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ilf(c380Var, qim0Var2, z6, function2, i, i2);
            }
        }
        i6 |= 3072;
        function1 = function0;
        z3 = true;
        z4 = false;
        if ((i6 & 1171) != 1170) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (x340Var.Y(i6 & 1, z5)) {
            if (i7 != 0) {
                z2 = false;
            }
            if (i4 != 0) {
                objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = lx70.Z0;
                    x340Var.s0(objT2);
                }
                function1 = (Function0) objT2;
            }
            qim0Var3 = nim0.a;
            qim0 qim0VarF4 = u291.f(qim0Var3, 1.0f);
            uwr uwrVar10 = cbx.a;
            cvx cvxVar4 = cbx.b(x340Var).b;
            f = 16.0f;
            qim0 qim0VarZ4 = uyn1.z(16.0f, 0.0f, 2, qim0VarF4);
            jw31VarA = ew31.a(h36.e, een.Z, x340Var, 0);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarZ4);
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
            itN = kk0.n(x340Var, qim0VarE, y580.Y, -18986126, c380Var);
            while (true) {
                zHasNext = itN.hasNext();
                islVar = isl.a;
                if (zHasNext) {
                    break;
                    break;
                }
                hux huxVar4 = (hux) itN.next();
                uwr uwrVar11 = cbx.a;
                zov0 zov0Var7 = cbx.b(x340Var).g;
                w0h1.a(huxVar4, islVar, u291.r(qim0Var3, f), u7h.b(u7h.f, 0.2f, 0.0f, 0.0f, 0.0f, 14), 0L, false, x340Var, 56, 48);
                z2 = z2;
                z4 = z4;
                f = f;
                function1 = function1;
                qim0Var3 = qim0Var3;
                z3 = true;
            }
            z7 = z2;
            qim0Var4 = qim0Var3;
            function3 = function1;
            z8 = z4;
            x340Var.r(z8);
            op71.g(x340Var, new wnb0(1.0f, true));
            if (z7) {
                x340Var.i0(-588240498);
                fux fuxVar4 = fux.c;
                uwr uwrVar12 = cbx.a;
                zov0 zov0Var8 = cbx.b(x340Var).g;
                qim0Var5 = qim0Var4;
                qim0 qim0VarR4 = u291.r(qim0Var5, 24.0f);
                if ((i6 & 7168) == 2048) {
                    z9 = true;
                } else {
                    z9 = z8;
                }
                objT = x340Var.T();
                if (z9) {
                    function4 = function3;
                    objT = new aba0(function4, (byte) 1);
                    x340Var.s0(objT);
                } else {
                    function4 = function3;
                    objT = new aba0(function4, (byte) 1);
                    x340Var.s0(objT);
                }
                w0h1.a(fuxVar4, islVar, bin.x(qim0VarR4, false, (String) null, (pm31) null, (idn0) null, (Function0) objT, 15), 0L, 0L, false, x340Var, fux.d | 48, 56);
                x340Var.r(z8);
            } else {
                function4 = function3;
                qim0Var5 = qim0Var4;
                x340Var.i0(-588017360);
                x340Var.r(z8);
            }
            x340Var.r(true);
            function2 = function4;
            qim0Var2 = qim0Var5;
            z6 = z7;
        } else {
            x340Var.b0();
            z6 = z2;
            function2 = function1;
            qim0Var2 = qim0Var;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ilf(c380Var, qim0Var2, z6, function2, i, i2);
        }
    }

    public static final void k(m0g0 m0g0Var, v0g0 v0g0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(67493869);
        int i2 = (x340Var.g(m0g0Var) ? 4 : 2) | i | (x340Var.g(v0g0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            c921.m(6, apo.r(673799669, new iwf0(m0g0Var, v0g0Var, (jzf0) x340Var.k(kzf0.a), (byte) 1), x340Var), x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new d0e0(m0g0Var, v0g0Var, i, (byte) 29);
        }
    }

    public static final void l(l0g0 l0g0Var, b0k b0kVar, int i) {
        m7p0 m7p0Var = l0g0Var.c;
        boolean z = l0g0Var.d;
        siq siqVar = l0g0Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-556318783);
        int i2 = (x340Var.g(l0g0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            Flowable flowable = l0g0Var.b;
            Object obj = fkj0.X;
            boolean zG = x340Var.g(flowable);
            Object objT = x340Var.T();
            if (zG || objT == obj) {
                vbm[] vbmVarArr = q601.a;
                mr20 mr20VarU = rqt0.u(new kge(flowable));
                ytw0 ytw0Var = jfv.b;
                objT = rqt0.u(new f8f0(r4p1.k(mr20VarU, hap1.u(fdg1.k0(100, ngv.d))), (byte) 6));
                x340Var.s0(objT);
            }
            ven0 ven0VarG = rwq.g((mr20) objT, (Object) null, (o8n) null, x340Var, 48, 2);
            p811 p811Var = new p811();
            Object[] objArr = new Object[0];
            v0g0.a.getClass();
            df41 df41Var = r0g0.b;
            Object objT2 = x340Var.T();
            if (objT2 == obj) {
                objT2 = lxf0.d;
                x340Var.s0(objT2);
            }
            p811Var.a = k5p1.v(objArr, df41Var, (Function0) objT2, x340Var, 384);
            qxd0.t((v0g0) ven0VarG.getValue(), x340Var, new e9c0(p811Var, ven0VarG, (lnm) null, (byte) 27));
            ven0 ven0Var = (ven0) p811Var.a;
            boolean zG2 = x340Var.g(siqVar) | x340Var.h(z) | x340Var.g(m7p0Var);
            Object objT3 = x340Var.T();
            if (zG2 || objT3 == obj) {
                objT3 = new m0g0(siqVar, m7p0Var, z);
                x340Var.s0(objT3);
            }
            k((m0g0) objT3, (v0g0) ven0Var.getValue(), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mbf0(l0g0Var, i, (byte) 12);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.gra */
    public static final void m(c380 c380Var, qim0 qim0Var, b0k b0kVar, int i) throws gra {
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(821477253);
        j06 j06Var = x340Var.a;
        int i2 = (x340Var.g(c380Var) ? 4 : 2) | i | (x340Var.g(qim0Var) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = rfq0.a1;
                x340Var.s0(objT);
            }
            qim0 qim0VarC = i541.C(qim0Var, (iu30) objT);
            jw31 jw31VarA = ew31.a(new d36(-4.0f, true, new um5(false)), een.Z, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarC);
            hzj.A.getClass();
            gra graVar = null;
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            Function0 function0 = hmb0.t1;
            if (z) {
                x340Var.l(function0);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar4);
            nko1.H(xos0VarM, x340Var, lljVar3);
            x0d.q(iHashCode, x340Var, lljVar2, x340Var);
            Iterator itN = kk0.n(x340Var, qim0VarE, lljVar, -501597180, c380Var);
            int i3 = 0;
            while (itN.hasNext()) {
                Object next = itN.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    gra graVar2 = graVar;
                    p7h.T();
                    throw graVar2;
                }
                iu50 iu50Var = (iu50) next;
                nim0 nim0Var = nim0.a;
                qim0 qim0VarB = u291.B(nim0Var, graVar, 3);
                Object objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = new nrj0(1, (byte) 29);
                    x340Var.s0(objT2);
                }
                qim0 qim0VarX = lrn1.x(exd0.s(qim0VarB, (iu30) objT2), -i3);
                gfh0 gfh0VarC = t1c.c(een.h, false);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarX);
                hzj.A.getClass();
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(function0);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC, x340Var, lljVar4);
                nko1.H(xos0VarM2, x340Var, lljVar3);
                x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar);
                x340 x340Var2 = x340Var;
                eso1.e(Uri.parse(iu50Var.a), isl.a, i1p1.q(u291.r(nim0Var, 18.0f), er31.a), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var2, 27696, 0, 4064);
                x340Var = x340Var2;
                x340Var.r(true);
                graVar = null;
                i3 = i4;
                m4cVar = m4cVar;
                function0 = function0;
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e(c380Var, qim0Var, i, (byte) 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x031f  */
    public static final void n(l2u0 l2u0Var, boolean z, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        l2u0 l2u0Var2;
        x340 x340Var;
        float fFloatValue;
        float f;
        x340 x340Var2;
        l2u0 l2u0Var3;
        tob1 tob1Var;
        boolean z2;
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(716451083);
        int i2 = i | (x340Var3.g(l2u0Var) ? 4 : 2) | (x340Var3.h(z) ? 32 : 16) | (x340Var3.i(iu30Var) ? 256 : 128) | (x340Var3.g(qim0Var) ? 2048 : 1024);
        if (x340Var3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0VarX = lrn1.x(u291.c(qim0Var, 1.0f), 99.0f);
            Object objT = x340Var3.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = kex0.h;
                x340Var3.s0(objT);
            }
            qim0 qim0VarC = i541.C(qim0VarX, (iu30) objT);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var3.T);
            xos0 xos0VarM = x340Var3.m();
            qim0 qim0VarE = zr7.E(x340Var3, qim0VarC);
            hzj.A.getClass();
            if (x340Var3.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var3.m0();
            if (x340Var3.S) {
                x340Var3.l(hmb0.t1);
            } else {
                x340Var3.v0();
            }
            nko1.H(gfh0VarC, x340Var3, y580.O0);
            nko1.H(xos0VarM, x340Var3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
            nko1.F(x340Var3);
            nko1.H(qim0VarE, x340Var3, y580.Y);
            Object objT2 = x340Var3.T();
            if (objT2 == obj) {
                objT2 = v8r.q("");
                x340Var3.s0(objT2);
            }
            ven0 ven0Var = (ven0) objT2;
            Object objT3 = x340Var3.T();
            if (objT3 == obj) {
                objT3 = v8r.q(Boolean.FALSE);
                x340Var3.s0(objT3);
            }
            ven0 ven0Var2 = (ven0) objT3;
            tm51 tm51Var = (tm51) x340Var3.k(die1.a);
            Object objT4 = x340Var3.T();
            if (objT4 == obj) {
                objT4 = qxd0.M(o6x.a, x340Var3);
                x340Var3.s0(objT4);
            }
            c9n c9nVar = (c9n) objT4;
            wat watVar = (wat) x340Var3.k(t4k.h);
            Object objT5 = x340Var3.T();
            if (objT5 == obj) {
                objT5 = v8r.q((Object) null);
                x340Var3.s0(objT5);
            }
            tob1 tob1Var2 = (ven0) objT5;
            Object objT6 = x340Var3.T();
            if (objT6 == obj) {
                objT6 = v8r.q((Object) null);
                x340Var3.s0(objT6);
            }
            ven0 ven0Var3 = (ven0) objT6;
            if (l2u0Var != null) {
                x340Var3.i0(152612448);
                long j = l2u0Var.b;
                long j2 = l2u0Var.c;
                boolean z3 = l2u0Var.a;
                float f2 = l2u0Var.f;
                Object objT7 = x340Var3.T();
                if (objT7 == obj) {
                    objT7 = us71.i(0.0f, x340Var3);
                }
                drr0 drr0Var = (drr0) objT7;
                boolean zF = x340Var3.f(j2) | x340Var3.d(drr0Var.s());
                Object objT8 = x340Var3.T();
                if (zF || objT8 == obj) {
                    objT8 = Float.valueOf(j2 > 0 ? drr0Var.s() / j2 : 0.0f);
                    x340Var3.s0(objT8);
                }
                fFloatValue = ((Number) objT8).floatValue();
                Object[] objArr = {Long.valueOf(j), Boolean.valueOf(z3), Long.valueOf(j2), Float.valueOf(f2)};
                boolean zH = x340Var3.h(z3) | x340Var3.f(j2) | x340Var3.f(j) | x340Var3.d(f2);
                Object objT9 = x340Var3.T();
                if (zH || objT9 == obj) {
                    objT9 = new efx0(z3, j2, j, drr0Var, f2, (lnm) null);
                    x340Var3.s0(objT9);
                }
                qxd0.u(objArr, (vu30) objT9, x340Var3);
                x340Var3.r(false);
            } else {
                x340Var3.i0(152831401);
                x340Var3.r(false);
                fFloatValue = 0.0f;
            }
            Object objT10 = x340Var3.T();
            if (objT10 == obj) {
                objT10 = new wfx0();
                x340Var3.s0(objT10);
            }
            wfx0 wfx0Var = (wfx0) objT10;
            ven0Var2.setValue(Boolean.valueOf(wfx0Var.a()));
            tob1 tob1VarB = z95.b(wfx0Var.a() ? 1.0f : 0.0f, irn1.l0(0.0f, 200.0f, (Object) null, 5), (String) null, (iu30) null, x340Var3, 48, 28);
            Boolean boolValueOf = Boolean.valueOf(wfx0Var.a());
            Object objT11 = x340Var3.T();
            if (objT11 == obj) {
                objT11 = new rwm0((Object) wfx0Var, (Object) tob1Var2, (Object) ven0Var3, (lnm) null, (byte) 28);
                x340Var3.s0(objT11);
            }
            qxd0.t(boolValueOf, x340Var3, (vu30) objT11);
            int i3 = i2 & 14;
            boolean zG = (i3 == 4) | x340Var3.g(watVar) | x340Var3.g(tm51Var) | x340Var3.i(c9nVar);
            Object objT12 = x340Var3.T();
            if (zG || objT12 == obj) {
                f = 1.0f;
                x340Var2 = x340Var3;
                l2u0Var3 = l2u0Var;
                qi1 qi1Var = new qi1(l2u0Var3, watVar, tm51Var, c9nVar, ven0Var, ven0Var3, wfx0Var, tob1Var2);
                tob1Var = tob1Var2;
                x340Var2.s0(qi1Var);
                objT12 = qi1Var;
            } else {
                l2u0Var3 = l2u0Var;
                x340Var2 = x340Var3;
                tob1Var = tob1Var2;
                f = 1.0f;
            }
            iu30 iu30Var2 = (iu30) objT12;
            boolean z4 = (i3 == 4) | ((i2 & 896) == 256);
            Object objT13 = x340Var2.T();
            if (z4 || objT13 == obj) {
                objT13 = new ozu0(l2u0Var3, iu30Var, tob1Var, (byte) 10);
                x340Var2.s0(objT13);
            }
            j2i j2iVar = caj.a;
            j2i j2iVarR = apo.r(-2048807152, new qdd0(tob1VarB, (byte) 2), x340Var2);
            nim0 nim0Var = nim0.a;
            l2u0Var2 = l2u0Var3;
            tob1 tob1Var3 = tob1Var;
            x340 x340Var4 = x340Var2;
            mym.h(fFloatValue, z, wfx0Var, iu30Var2, (iu30) objT13, j2iVarR, u291.d(nim0Var, f), x340Var4, (i2 & 112) | 14352768);
            String str = (String) ven0Var.getValue();
            boolean zBooleanValue = ((Boolean) ven0Var2.getValue()).booleanValue();
            qim0 qim0VarD = eqr0.D(0.0f, -56.0f, 1, h2c.a.a(nim0Var, een.e));
            if (l2u0Var2 != null) {
                Integer num = l2u0Var2.i;
                Integer num2 = l2u0Var2.h;
                if (num2 == null || num == null || num2.intValue() <= num.intValue()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            } else {
                z2 = false;
            }
            vgo1.m(str, zBooleanValue, z2, qim0VarD, (Bitmap) tob1Var3.getValue(), x340Var4, 0);
            x340Var = x340Var4;
            x340Var.r(true);
        } else {
            l2u0Var2 = l2u0Var;
            x340Var = x340Var3;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qy90(l2u0Var2, z, iu30Var, qim0Var, i, (byte) 21);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    /* JADX WARN: Code duplicated, block: B:16:0x003c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x006c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0079  */
    /* JADX WARN: Code duplicated, block: B:32:0x0085  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:35:0x00af  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    public static final void o(final Function0 function0, qim0 qim0Var, boolean z, hw61 hw61Var, cec cecVar, vzq0 vzq0Var, final j2i j2iVar, b0k b0kVar, final int i, final int i2) {
        cec cecVar2;
        int i3;
        boolean z2;
        final qim0 qim0Var2;
        final boolean z3;
        final hw61 hw61Var2;
        final vzq0 vzq0Var2;
        final cec cecVar3;
        h311 h311VarV;
        int i4;
        cec cecVar4;
        int i5;
        vzq0 vzq0Var3;
        qim0 qim0Var3;
        hw61 hw61Var3;
        boolean z4;
        cec cecVar5;
        dah dahVar;
        cec cecVar6;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1061374109);
        int i6 = i | (x340Var.i(function0) ? 4 : 2) | 1456;
        if ((i2 & 16) == 0) {
            cecVar2 = cecVar;
            int i7 = x340Var.g(cecVar2) ? 16384 : 8192;
            i3 = i6 | i7 | 115015680;
            if ((306783379 & i3) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var.Y(i3 & 1, z2)) {
                x340Var.d0();
                if ((i & 1) != 0 || x340Var.E()) {
                    zzq0 zzq0Var = sec.a;
                    hw61 hw61VarB = px61.b(x340Var, 7);
                    i4 = i3 & (-7169);
                    if ((i2 & 16) != 0) {
                        dahVar = (dah) x340Var.k(eah.a);
                        cecVar6 = dahVar.X;
                        if (cecVar6 == null) {
                            long j = u7h.j;
                            cecVar4 = new cec(j, eah.d(dahVar, 26), j, u7h.b(eah.d(dahVar, 19), 0.38f, 0.0f, 0.0f, 0.0f, 14));
                            dahVar.X = cecVar4;
                        } else {
                            cecVar4 = cecVar6;
                        }
                        i5 = i3 & (-64513);
                    } else {
                        cecVar4 = cecVar2;
                        i5 = i4;
                    }
                    vzq0Var3 = sec.b;
                    qim0Var3 = nim0.a;
                    hw61Var3 = hw61VarB;
                    z4 = true;
                    cecVar5 = cecVar4;
                } else {
                    x340Var.b0();
                    int i8 = i3 & (-7169);
                    if ((i2 & 16) != 0) {
                        i8 = i3 & (-64513);
                    }
                    hw61Var3 = hw61Var;
                    vzq0Var3 = vzq0Var;
                    cecVar5 = cecVar2;
                    i5 = i8;
                    qim0Var3 = qim0Var;
                    z4 = z;
                }
                x340Var.s();
                a(function0, qim0Var3, z4, hw61Var3, cecVar5, null, vzq0Var3, j2iVar, x340Var, i5 & 2147483646, 0);
                qim0Var2 = qim0Var3;
                z3 = z4;
                hw61Var2 = hw61Var3;
                cecVar3 = cecVar5;
                vzq0Var2 = vzq0Var3;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
                z3 = z;
                hw61Var2 = hw61Var;
                vzq0Var2 = vzq0Var;
                cecVar3 = cecVar2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                final byte b2 = 0;
                h311VarV.d = new vu30(function0, qim0Var2, z3, hw61Var2, cecVar3, vzq0Var2, j2iVar, i, i2, b2) { // from class: p.zec
                    public final /* synthetic */ byte a;
                    public final /* synthetic */ Function0 b;
                    public final /* synthetic */ qim0 c;
                    public final /* synthetic */ boolean d;
                    public final /* synthetic */ hw61 e;
                    public final /* synthetic */ j2i f;
                    public final /* synthetic */ short g;
                    public final /* synthetic */ Object h;
                    public final /* synthetic */ Object i;

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.a = b2;
                        this.g = i2;
                    }

                    public final Object invoke(Object obj, Object obj2) {
                        byte b3 = this.a;
                        rih1 rih1Var = rih1.a;
                        Object obj3 = this.i;
                        Object obj4 = this.h;
                        switch (b3) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iP = czo1.p(805306369);
                                mue1.o(this.b, this.c, this.d, this.e, (cec) obj4, (vzq0) obj3, this.f, (b0k) obj, iP, this.g);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iP2 = czo1.p(100663297);
                                l4o1.a(this.b, this.c, this.d, this.e, (qsd) obj4, (ltd) obj3, this.f, (b0k) obj, iP2, this.g);
                                break;
                        }
                        return rih1Var;
                    }
                };
            }
        }
        cecVar2 = cecVar;
        i3 = i6 | i7 | 115015680;
        if ((306783379 & i3) != 306783378) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (x340Var.Y(i3 & 1, z2)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                zzq0 zzq0Var2 = sec.a;
                hw61 hw61VarB2 = px61.b(x340Var, 7);
                i4 = i3 & (-7169);
                if ((i2 & 16) != 0) {
                    dahVar = (dah) x340Var.k(eah.a);
                    cecVar6 = dahVar.X;
                    if (cecVar6 == null) {
                        long j2 = u7h.j;
                        cecVar4 = new cec(j2, eah.d(dahVar, 26), j2, u7h.b(eah.d(dahVar, 19), 0.38f, 0.0f, 0.0f, 0.0f, 14));
                        dahVar.X = cecVar4;
                    } else {
                        cecVar4 = cecVar6;
                    }
                    i5 = i3 & (-64513);
                } else {
                    cecVar4 = cecVar2;
                    i5 = i4;
                }
                vzq0Var3 = sec.b;
                qim0Var3 = nim0.a;
                hw61Var3 = hw61VarB2;
                z4 = true;
                cecVar5 = cecVar4;
            } else {
                zzq0 zzq0Var3 = sec.a;
                hw61 hw61VarB3 = px61.b(x340Var, 7);
                i4 = i3 & (-7169);
                if ((i2 & 16) != 0) {
                    dahVar = (dah) x340Var.k(eah.a);
                    cecVar6 = dahVar.X;
                    if (cecVar6 == null) {
                        long j3 = u7h.j;
                        cecVar4 = new cec(j3, eah.d(dahVar, 26), j3, u7h.b(eah.d(dahVar, 19), 0.38f, 0.0f, 0.0f, 0.0f, 14));
                        dahVar.X = cecVar4;
                    } else {
                        cecVar4 = cecVar6;
                    }
                    i5 = i3 & (-64513);
                } else {
                    cecVar4 = cecVar2;
                    i5 = i4;
                }
                vzq0Var3 = sec.b;
                qim0Var3 = nim0.a;
                hw61Var3 = hw61VarB3;
                z4 = true;
                cecVar5 = cecVar4;
            }
            x340Var.s();
            a(function0, qim0Var3, z4, hw61Var3, cecVar5, null, vzq0Var3, j2iVar, x340Var, i5 & 2147483646, 0);
            qim0Var2 = qim0Var3;
            z3 = z4;
            hw61Var2 = hw61Var3;
            cecVar3 = cecVar5;
            vzq0Var2 = vzq0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            z3 = z;
            hw61Var2 = hw61Var;
            vzq0Var2 = vzq0Var;
            cecVar3 = cecVar2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            final byte b3 = 0;
            h311VarV.d = new vu30(function0, qim0Var2, z3, hw61Var2, cecVar3, vzq0Var2, j2iVar, i, i2, b3) { // from class: p.zec
                public final /* synthetic */ byte a;
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ qim0 c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ hw61 e;
                public final /* synthetic */ j2i f;
                public final /* synthetic */ short g;
                public final /* synthetic */ Object h;
                public final /* synthetic */ Object i;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.a = b3;
                    this.g = i2;
                }

                public final Object invoke(Object obj, Object obj2) {
                    byte b4 = this.a;
                    rih1 rih1Var = rih1.a;
                    Object obj3 = this.i;
                    Object obj4 = this.h;
                    switch (b4) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iP = czo1.p(805306369);
                            mue1.o(this.b, this.c, this.d, this.e, (cec) obj4, (vzq0) obj3, this.f, (b0k) obj, iP, this.g);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iP2 = czo1.p(100663297);
                            l4o1.a(this.b, this.c, this.d, this.e, (qsd) obj4, (ltd) obj3, this.f, (b0k) obj, iP2, this.g);
                            break;
                    }
                    return rih1Var;
                }
            };
        }
    }

    public static final void p(int i, long j, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(672954219);
        int i2 = (x340Var.g(qim0Var) ? 4 : 2) | i | 16;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                uwr uwrVar = cbx.a;
                j = ((vex) zex.a.e).n;
            } else {
                x340Var.b0();
            }
            x340Var.s();
            qim0 qim0VarR = u291.r(qim0Var, 10.0f);
            boolean zF = x340Var.f(j);
            Object objT = x340Var.T();
            if (zF || objT == fkj0.X) {
                objT = new ps((byte) 21, j);
                x340Var.s0(objT);
            }
            j0o1.b(0, x340Var, (iu30) objT, qim0VarR);
        } else {
            x340Var.b0();
        }
        long j2 = j;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e82(qim0Var, j2, i, (byte) 8);
        }
    }

    public static final void q(float f, qim0 qim0Var, long j, long j2, b0k b0kVar, int i) {
        int i2;
        long j3;
        long j4;
        long j5;
        int i3;
        long j6;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1696449117);
        if ((i & 6) == 0) {
            i2 = (x340Var.d(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                uwr uwrVar = cbx.a;
                vex vexVar = (vex) zex.a.e;
                j5 = vexVar.j;
                i3 = i2 & (-8065);
                j6 = vexVar.n;
            } else {
                x340Var.b0();
                i3 = i2 & (-8065);
                j5 = j;
                j6 = j2;
            }
            x340Var.s();
            boolean zF = x340Var.f(j5) | x340Var.f(j6) | ((i3 & 14) == 4);
            Object objT = x340Var.T();
            if (zF || objT == fkj0.X) {
                dub dubVar = new dub(j5, j6, f, (byte) 4);
                x340Var.s0(dubVar);
                objT = dubVar;
            }
            j0o1.b((i3 >> 3) & 14, x340Var, (iu30) objT, qim0Var);
            j3 = j5;
            j4 = j6;
        } else {
            x340Var.b0();
            j3 = j;
            j4 = j2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ufx0(f, qim0Var, j3, j4, i);
        }
    }

    public static final void r(b5m1 b5m1Var, boolean z, quc0 quc0Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        int i2;
        long j;
        m4c m4cVar = fkj0.X;
        List list = b5m1Var.d;
        Integer num = b5m1Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-666350488);
        j06 j06Var = x340Var.a;
        int i3 = i | (x340Var.g(b5m1Var) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.i(quc0Var) ? 256 : 128) | (x340Var.i(function0) ? 2048 : 1024) | 24576;
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarF, 16.0f, 8.0f);
            vq60 vq60Var = jw80.a;
            qim0 qim0VarThen = qim0VarY.then(tsj0.a);
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF2 = dug.f(i1p1.q(qim0VarThen, er31.b(6.0f)), ((vex) zex.a.e).i, d4o1.a);
            String strO0 = cwl1.o0(x340Var, 2131963925);
            boolean z2 = (i3 & 7168) == 2048;
            Object objT = x340Var.T();
            if (z2 || objT == m4cVar) {
                objT = new tpj1(function0, (byte) 23);
                x340Var.s0(objT);
            }
            qim0 qim0VarX = bin.x(qim0VarF2, false, strO0, (pm31) null, (idn0) null, (Function0) objT, 13);
            cvx cvxVar3 = cbx.b(x340Var).b;
            cvx cvxVar4 = cbx.b(x340Var).b;
            qim0 qim0VarN = anm1.N("workout_summary_bar", uyn1.y(qim0VarX, 6.0f, 12.0f));
            cvx cvxVar5 = cbx.b(x340Var).b;
            d36 d36Var = new d36(8.0f, true, new um5(false));
            fra fraVar = een.N0;
            jw31 jw31VarA = ew31.a(d36Var, fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            x340Var.i0(1500336544);
            smc0 smc0VarN = k4p1.n();
            if (num == null) {
                x340Var.i0(945661454);
                i2 = 0;
                x340Var.r(false);
            } else {
                x340Var.i0(945661455);
                int iIntValue = num.intValue();
                smc0VarN.add(cwl1.U(2131820950, iIntValue, new Object[]{Integer.valueOf(iIntValue)}, x340Var));
                i2 = 0;
                x340Var.r(false);
            }
            String strX = x(b5m1Var, x340Var, i2);
            if (strX != null) {
                smc0VarN.add(strX);
            }
            if (!list.isEmpty()) {
                smc0VarN.add(quc0Var.a(list));
            }
            smc0VarN.add(cwl1.o0(x340Var, z ? 2131963929 : 2131963928));
            smc0 smc0VarK = k4p1.k(smc0VarN);
            x340Var.r(false);
            String strY0 = o7h.y0(smc0VarK, ". ", (String) null, (String) null, (iu30) null, 62);
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            wnb0 wnb0Var = new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            boolean zG = x340Var.g(strY0);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new bek1(strY0, (byte) 13);
                x340Var.s0(objT2);
            }
            qim0 qim0VarA = s161.a(wnb0Var, (iu30) objT2);
            cvx cvxVar6 = cbx.b(x340Var).b;
            jw31 jw31VarA2 = ew31.a(new d36(8.0f, true, new um5(false)), fraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarA);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            pl70.a(i3o1.n(2131233413, x340Var, 0), (qim0) null, cbx.a(x340Var).b.a, x340Var, 56, 4);
            x340Var.i0(2095445450);
            smc0 smc0VarN2 = k4p1.n();
            if (num == 0) {
                x340Var.i0(1193577550);
                x340Var.r(false);
            } else {
                x340Var.i0(1193577551);
                int iIntValue2 = num.intValue();
                smc0VarN2.add(cwl1.U(2131820949, iIntValue2, new Object[]{Integer.valueOf(iIntValue2)}, x340Var));
                x340Var.r(false);
            }
            String strX2 = x(b5m1Var, x340Var, 2);
            if (strX2 != null) {
                smc0VarN2.add(strX2);
            }
            x340Var.i0(1985328371);
            String strN0 = (String) o7h.s0(list);
            if (strN0 == null) {
                x340Var.r(false);
                strN0 = null;
            } else {
                int size = list.size() - 1;
                if (size > 0) {
                    x340Var.i0(-1076967616);
                    strN0 = cwl1.n0(2131963926, new Object[]{strN0, Integer.valueOf(size)}, x340Var);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1076885280);
                    x340Var.r(false);
                }
                x340Var.r(false);
            }
            if (strN0 != null) {
                smc0VarN2.add(strN0);
            }
            smc0VarN2.add(cwl1.o0(x340Var, z ? 2131963929 : 2131963928));
            smc0 smc0VarK2 = k4p1.k(smc0VarN2);
            x340Var.r(false);
            String strO1 = cwl1.o0(x340Var, 2131963927);
            long j2 = cbx.a(x340Var).b.b;
            ye5 ye5Var = new ye5();
            rmc0 rmc0VarListIterator = smc0VarK2.listIterator(0);
            int i4 = 0;
            while (true) {
                rmc0 rmc0Var = rmc0VarListIterator;
                if (!rmc0Var.hasNext()) {
                    af5 af5VarP = ye5Var.p();
                    uwr uwrVar2 = cbx.a;
                    lee1 lee1Var = cbx.d(x340Var).j;
                    long j3 = cbx.a(x340Var).b.a;
                    cjc0 cjc0Var = new cjc0(1);
                    if (1.0f <= 0.0d) {
                        of80.a("invalid weight; must be greater than zero");
                    }
                    uwo1.d(af5VarP, j3, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), lee1Var, (a0e1) null, (iu30) null, 2, false, cjc0Var, 0, (qx8) null, (cqs0) null, x340Var, 0, 0, 3760);
                    x340Var.r(true);
                    plx plxVar = plx.c;
                    long j4 = cbx.a(x340Var).b.a;
                    zov0 zov0Var = cbx.b(x340Var).g;
                    w0h1.a(plxVar, isl.a, u291.r(qim0Var3, 16.0f), j4, 0L, false, x340Var, plx.d | 48, 48);
                    x340Var = x340Var;
                    x340Var.r(true);
                    qim0Var2 = qim0Var3;
                    break;
                }
                Object next = rmc0Var.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    p7h.T();
                    throw null;
                }
                String str = (String) next;
                if (i4 > 0) {
                    j = j2;
                    int iO = ye5Var.o(new zma1(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                    try {
                        ye5Var.g(strO1);
                        ye5Var.k(iO);
                    } catch (Throwable th) {
                        ye5Var.k(iO);
                        throw th;
                    }
                } else {
                    j = j2;
                }
                ye5Var.g(str);
                i4 = i5;
                j2 = j;
            }
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ofi0(b5m1Var, z, quc0Var, function0, qim0Var2, i);
        }
    }

    public static final void s(d5m1 d5m1Var, quc0 quc0Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        zen0 zen0Var;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1339253008);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? b0kVar3.g(d5m1Var) : b0kVar3.i(d5m1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(quc0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(function0) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        boolean z = false;
        if (!b0kVar3.Y(i3 & 1, (i3 & 1171) != 1170)) {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        } else {
            if (!d5m1Var.d) {
                h311 h311VarV = b0kVar3.v();
                if (h311VarV != null) {
                    h311VarV.d = new ixi1(d5m1Var, quc0Var, function0, i);
                    return;
                }
                return;
            }
            Object[] objArr = new Object[0];
            int i4 = i3 & 14;
            boolean z2 = i4 == 4 || ((i3 & 8) != 0 && b0kVar3.i(d5m1Var));
            Object objT = b0kVar3.T();
            if (z2 || objT == m4cVar) {
                objT = new bkk1(d5m1Var, (byte) 21);
                b0kVar3.s0(objT);
            }
            ven0 ven0Var = (ven0) k5p1.s(objArr, (Function0) objT, b0kVar3, 0);
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                Boolean bool = (Boolean) ven0Var.getValue();
                bool.getClass();
                objT2 = new zen0(bool);
                b0kVar3.s0(objT2);
            }
            zen0 zen0Var2 = (zen0) objT2;
            Boolean boolValueOf = Boolean.valueOf(d5m1Var.a);
            boolean zI = b0kVar3.i(zen0Var2);
            if (i4 == 4 || ((i3 & 8) != 0 && b0kVar3.i(d5m1Var))) {
                z = true;
            }
            boolean zI2 = zI | z | b0kVar3.i(ven0Var);
            Object objT3 = b0kVar3.T();
            if (zI2 || objT3 == m4cVar) {
                zen0Var = zen0Var2;
                mxj1 mxj1Var = new mxj1(zen0Var, d5m1Var, ven0Var, (lnm) null, (byte) 9);
                b0kVar3.s0(mxj1Var);
                objT3 = mxj1Var;
            } else {
                zen0Var = zen0Var2;
            }
            qxd0.t(boolValueOf, b0kVar3, (vu30) objT3);
            bby bbyVarD = xay.d((ni20) null, een.Z, 13);
            Object objT4 = b0kVar3.T();
            if (objT4 == m4cVar) {
                objT4 = owl1.d1;
                b0kVar3.s0(objT4);
            }
            bby bbyVarA = bbyVarD.a(xay.p(1, (iu30) objT4)).a(xay.e(3, (ni20) null));
            Object objT5 = b0kVar3.T();
            if (objT5 == m4cVar) {
                objT5 = owl1.e1;
                b0kVar3.s0(objT5);
            }
            ln00 ln00VarA = xay.t(1, (iu30) objT5).a(xay.l(13, (ni20) null)).a(xay.f(3, (ni20) null));
            j2i j2iVarR = apo.r(-18264088, new p8e1(d5m1Var, quc0Var, function0, (byte) 14), b0kVar3);
            int i5 = 196608 | ((i3 >> 6) & 112);
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            fq7.d(zen0Var, qim0Var3, bbyVarA, ln00VarA, (String) null, j2iVarR, b0kVar2, i5, 16);
            qim0Var2 = qim0Var3;
        }
        h311 h311VarV2 = b0kVar2.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new swk1(i, d5m1Var, quc0Var, function0, qim0Var2, (byte) 9);
        }
    }

    public static final int t(LogRecord logRecord) {
        int iIntValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        if (iIntValue > level.intValue()) {
            return 5;
        }
        return logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
    }

    public static final void u(LinkedHashSet linkedHashSet, long j, smc0 smc0Var) {
        int i = 0;
        rmc0 rmc0VarListIterator = smc0Var.listIterator(0);
        while (true) {
            rmc0 rmc0Var = rmc0VarListIterator;
            if (!rmc0Var.hasNext()) {
                i = -1;
                break;
            } else if (((Number) rmc0Var.next()).longValue() >= j) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            linkedHashSet.add(o7h.A0(smc0Var));
            return;
        }
        linkedHashSet.add(smc0Var.get(i));
        if (i > 0) {
            linkedHashSet.add(smc0Var.get(i - 1));
        }
    }

    public static long v(long j) {
        float f;
        float fFloatValue;
        long j2 = u7h.f;
        float[] fArr = new float[3];
        Color.colorToHSV(z4p1.G(j), fArr);
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        kv7 kv7Var = new kv7(f2, f3, j2, (byte) 1);
        float fFloatValue2 = ((Number) kv7Var.invoke(Float.valueOf(0.0f))).floatValue();
        float fFloatValue3 = ((Number) kv7Var.invoke(Float.valueOf(1.0f))).floatValue();
        float f5 = 4.5f;
        if (fFloatValue2 < 4.5f && fFloatValue3 < 4.5f) {
            return fFloatValue2 > fFloatValue3 ? y(f2, f3, 0.0f) : y(f2, f3, 1.0f);
        }
        float fT = T(j2);
        float f6 = 0.0f;
        int i = 0;
        float f7 = 1.0f;
        while (true) {
            f = f5;
            if (i >= 20) {
                break;
            }
            float f8 = (f6 + f7) / 2.0f;
            if (T(y(f2, f3, f8)) < fT) {
                f6 = f8;
            } else {
                f7 = f8;
            }
            i++;
            f5 = f;
        }
        float f9 = (f6 + f7) / 2.0f;
        Float fValueOf = fFloatValue2 >= f ? Float.valueOf(w(0.0f, f9, kv7Var, true)) : null;
        Float fValueOf2 = fFloatValue3 >= f ? Float.valueOf(w(f9, 1.0f, kv7Var, false)) : null;
        if (fValueOf != null && fValueOf2 != null) {
            fFloatValue = Math.abs(fValueOf.floatValue() - f4) <= Math.abs(fValueOf2.floatValue() - f4) ? fValueOf.floatValue() : fValueOf2.floatValue();
        } else if (fValueOf != null) {
            fFloatValue = fValueOf.floatValue();
        } else {
            fValueOf2.getClass();
            fFloatValue = fValueOf2.floatValue();
        }
        return y(f2, f3, fFloatValue);
    }

    public static final float w(float f, float f2, kv7 kv7Var, boolean z) {
        for (int i = 0; i < 20; i++) {
            float f3 = (f + f2) / 2.0f;
            if ((((Number) kv7Var.invoke(Float.valueOf(f3))).floatValue() >= 4.5f) == z) {
                f = f3;
            } else {
                f2 = f3;
            }
        }
        return z ? f : f2;
    }

    public static final String x(b5m1 b5m1Var, b0k b0kVar, int i) {
        String strN0;
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(1268223792);
        boolean z = (i & 2) == 0;
        h3c h3cVar = b5m1Var.c;
        if (!(h3cVar instanceof h3c)) {
            x340Var.r(false);
            return null;
        }
        s2c s2cVar = h3cVar.a;
        if (s2cVar == null) {
            String str = b5m1Var.b;
            x340Var.r(false);
            return str;
        }
        int i2 = s2cVar.b;
        int i3 = s2cVar.a;
        if (i3 == i2) {
            x340Var.i0(-1007639246);
            strN0 = cwl1.n0(2131963924, new Object[]{Integer.valueOf(i3)}, x340Var);
            x340Var.r(false);
        } else if (z) {
            x340Var.i0(-1007636127);
            strN0 = cwl1.n0(2131963923, new Object[]{Integer.valueOf(i3), Integer.valueOf(i2)}, x340Var);
            x340Var.r(false);
        } else {
            x340Var.i0(-1007633124);
            strN0 = cwl1.n0(2131963922, new Object[]{Integer.valueOf(i3), Integer.valueOf(i2)}, x340Var);
            x340Var.r(false);
        }
        x340Var.r(false);
        return strN0;
    }

    public static final long y(float f, float f2, float f3) {
        return z4p1.e(Color.HSVToColor(new float[]{f, f2, yoi1.o(f3, 0.0f, 1.0f)}));
    }

    public static final boolean z(Bundle bundle, String str) {
        return bundle.containsKey(str);
    }
}
