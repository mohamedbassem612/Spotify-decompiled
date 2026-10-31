package p;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.google.zxing.WriterException;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.base.java.logging.Logger;
import com.spotify.common.uri.SpotifyUriParserException;
import com.spotify.mainlayout.ui.view.MainLayout;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.recommendedsearches.v1.RecommendedSearches;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.regex.Pattern;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pob implements Init, p02, gc10, xi7, Function, vjm1, c290 {
    public final /* synthetic */ byte a;

    public pob() {
        this.a = (byte) 7;
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    public static final void a(File file) {
        if (file.exists()) {
            if (file.delete()) {
                return;
            }
            Logger.d("Failed to delete old (possibly stale) native library", new Object[0]);
            throw new UnsatisfiedLinkError("Failed to delete old (possibly stale) native library");
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            eg.m("Required value was null.");
            return;
        }
        if (parentFile.exists()) {
            if (parentFile.isDirectory()) {
                return;
            }
            Logger.d("Unexpected file where native lib dir expected!", new Object[0]);
            throw new UnsatisfiedLinkError("Unexpected file where native lib dir expected!");
        }
        if (parentFile.mkdirs()) {
            return;
        }
        Logger.d("Failed to create directory for native library extraction", new Object[0]);
        throw new UnsatisfiedLinkError("Failed to create directory for native library extraction");
    }

    public static final boolean b(String str) {
        Pattern pattern = v9e.a;
        try {
            v6b1 v6b1Var = new y6b1(str, false).c;
            return (v6b1Var == v6b1.E1 || v6b1Var == v6b1.b) ? false : true;
        } catch (SpotifyUriParserException unused) {
        }
    }

    public static na30 e(Context context, o930 o930Var) {
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{o930Var}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        return n930.a(context, Collections.unmodifiableList(arrayList));
    }

    public static String f(gyh gyhVar) {
        int iOrdinal = gyhVar.ordinal();
        if (iOrdinal == 0) {
            return "qac";
        }
        if (iOrdinal == 1) {
            return "submit";
        }
        if (iOrdinal == 2) {
            return "link";
        }
        if (iOrdinal == 3) {
            return "recommended_query";
        }
        if (iOrdinal == 4) {
            return "related_query";
        }
        eg.o();
        return null;
    }

    public static int g(zfc1 zfc1Var) {
        switch (zfc1Var.ordinal()) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                hhg1.n("Cannot provide bitrate for Unknown");
                return 0;
            case 1:
                return 2131957774;
            case 2:
                return 2131957776;
            case 3:
                return 2131957767;
            case 4:
                return 2131957779;
            case 5:
                return 2131957770;
            case 6:
                return 2131957772;
            default:
                eg.o();
                return 0;
        }
    }

    public static int h(zfc1 zfc1Var) {
        switch (zfc1Var.ordinal()) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return 2131957777;
            case 1:
                return 2131957773;
            case 2:
                return 2131957775;
            case 3:
                return 2131957766;
            case 4:
                return 2131957778;
            case 5:
                return 2131957769;
            case 6:
                return 2131957771;
            default:
                eg.o();
                return 0;
        }
    }

    public static void k(Context context, p930 p930Var) {
        context.getContentResolver().unregisterContentObserver(p930Var);
    }

    public static idd1 m(MainLayout mainLayout, int i) {
        return new idd1(new gf6(mainLayout, i, (byte) 6));
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 14:
                return new x7c0(eg90.a, obj);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return huv0.a((Throwable) obj);
            case 22:
                h290<b311> h290VarN = ((RecommendedSearches) obj).n();
                ArrayList arrayList = new ArrayList(q7h.U(h290VarN, 10));
                for (b311 b311Var : h290VarN) {
                    arrayList.add(new u211(b311Var.d(), b311Var.getUri()));
                }
                return arrayList;
            default:
                sy21 sy21Var = (sy21) obj;
                if (!sy21Var.a.Q0) {
                    Single singleError = Single.error(new HttpException(sy21Var));
                    singleError.getClass();
                    return singleError;
                }
                ga61 ga61Var = (ga61) sy21Var.b;
                if (ga61Var == null) {
                    ga61Var = ga61.C;
                }
                Single singleJust = Single.just(ga61Var);
                singleJust.getClass();
                return singleJust;
        }
    }

    @Override // p.p02
    public n8d0 begin(Context context) {
        b280 b280Var = b280.e;
        if (b280Var == null) {
            b280Var = new b280();
        }
        l1d.z("\n            ", "begin", " was used. This should not happen as the Dummy is only injected if the rollout flag is disabled.\"\n        ");
        return b280Var;
    }

    public void c(fn51 fn51Var) {
        switch (this.a) {
            case 10:
                throw new UnsupportedOperationException();
            default:
                return;
        }
    }

    public Object convert(int i) {
        l471 l471Var = null;
        switch (this.a) {
            case 23:
                switch (i) {
                    case SplitInstallErrorCode.NO_ERROR /* 0 */:
                        l471Var = m7r.b;
                        break;
                    case 1:
                        l471Var = m7r.c;
                        break;
                    case 2:
                        l471Var = m7r.d;
                        break;
                    case 3:
                        l471Var = m7r.e;
                        break;
                    case 4:
                        l471Var = m7r.f;
                        break;
                    case 5:
                        l471Var = m7r.g;
                        break;
                    case 6:
                        l471Var = m7r.h;
                        break;
                    case 7:
                        l471Var = m7r.i;
                        break;
                }
                return l471Var == null ? m7r.t : l471Var;
            default:
                switch (i) {
                    case SplitInstallErrorCode.NO_ERROR /* 0 */:
                        l471Var = l471.b;
                        break;
                    case 2:
                        l471Var = l471.c;
                        break;
                    case 3:
                        l471Var = l471.d;
                        break;
                    case 4:
                        l471Var = l471.e;
                        break;
                    case 5:
                        l471Var = l471.f;
                        break;
                    case 6:
                        l471Var = l471.g;
                        break;
                    case 8:
                        l471Var = l471.h;
                        break;
                    case 9:
                        l471Var = l471.i;
                        break;
                    case 10:
                        l471Var = l471.t;
                        break;
                    case grn1.d /* 12 */:
                        l471Var = l471.X;
                        break;
                    case 13:
                        l471Var = l471.Y;
                        break;
                    case 14:
                        l471Var = l471.Z;
                        break;
                }
                return l471Var == null ? l471.N0 : l471Var;
        }
    }

    public First e0(Object obj) {
        switch (this.a) {
            case 3:
                ebn ebnVar = (ebn) obj;
                van vanVar = ebnVar.a;
                return First.b(ebn.a(ebnVar, (String) null, s321.c(ebnVar.b, vanVar.d, vanVar.c), 3));
            default:
                fwk1 fwk1Var = (fwk1) obj;
                xj61 xj61Var = new xj61();
                if (fwk1Var.d == 0) {
                    xj61Var.add(new kvk1(fwk1Var.b));
                }
                return First.c(fwk1Var, cwl1.j(xj61Var));
        }
    }

    /* JADX WARN: Code duplicated, block: B:357:0x066d  */
    /* JADX WARN: Code duplicated, block: B:359:0x0674  */
    /* JADX WARN: Code duplicated, block: B:384:0x06df  */
    /* JADX WARN: Code duplicated, block: B:39:0x008e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0098  */
    /* JADX WARN: Code duplicated, block: B:442:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:443:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ba A[EDGE_INSN: B:57:0x00ba->B:60:0x00c1 BREAK  A[LOOP:0: B:40:0x0092->B:54:0x00b3]] */
    /* JADX WARN: Code duplicated, block: B:58:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00bf A[EDGE_INSN: B:59:0x00bf->B:60:0x00c1 BREAK  A[LOOP:0: B:40:0x0092->B:54:0x00b3]] */
    public qwa j(String str, int i, int i2, int i3, Map map) {
        rfm0 rfm0Var;
        int i4;
        int i5;
        w3j1 w3j1VarA;
        int i6;
        int i7;
        int i8;
        int i9;
        char c;
        hne hneVar;
        int i10;
        boolean z;
        boolean z2;
        char cCharAt;
        int i11;
        if (str.isEmpty()) {
            hhg1.n("Found empty contents");
            return null;
        }
        if (i != 12) {
            hhg1.n("Can only encode QR_CODE, but got ".concat(l1d.D(i)));
            return null;
        }
        if (i2 < 0 || i3 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i2 + 'x' + i3);
        }
        qax qaxVar = qax.a;
        ogz ogzVarValueOf = map.containsKey(qaxVar) ? ogz.valueOf(map.get(qaxVar).toString()) : ogz.L;
        qax qaxVar2 = qax.f;
        int i12 = map.containsKey(qaxVar2) ? Integer.parseInt(map.get(qaxVar2).toString()) : 4;
        qax qaxVar3 = qax.b;
        boolean zContainsKey = map.containsKey(qaxVar3);
        String string = zContainsKey ? map.get(qaxVar3).toString() : "ISO-8859-1";
        boolean zEquals = "Shift_JIS".equals(string);
        int[] iArr = yah0.a;
        rfm0 rfm0Var2 = rfm0.e;
        if (!zEquals) {
            i10 = 0;
            z = false;
            z2 = false;
            while (true) {
                if (i10 < str.length()) {
                    cCharAt = str.charAt(i10);
                    if (cCharAt >= '0') {
                        if (cCharAt < '`') {
                            i11 = iArr[cCharAt];
                        } else {
                            i11 = -1;
                        }
                        if (i11 != -1) {
                            z = true;
                        }
                    } else {
                        if (cCharAt < '`') {
                            i11 = iArr[cCharAt];
                        } else {
                            i11 = -1;
                        }
                        if (i11 != -1) {
                            z = true;
                        }
                    }
                    i10++;
                } else {
                    if (z) {
                        rfm0Var = rfm0.d;
                        break;
                    }
                    if (z2) {
                        rfm0Var = rfm0.c;
                        break;
                    }
                }
                rfm0Var = rfm0Var2;
                break;
            }
        }
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                i10 = 0;
                z = false;
                z2 = false;
                while (true) {
                    if (i10 < str.length()) {
                        cCharAt = str.charAt(i10);
                        if (cCharAt >= '0' || cCharAt > '9') {
                            if (cCharAt < '`') {
                                i11 = iArr[cCharAt];
                            } else {
                                i11 = -1;
                            }
                            if (i11 != -1) {
                                z = true;
                            }
                        } else {
                            z2 = true;
                        }
                        i10++;
                    } else {
                        if (z) {
                            rfm0Var = rfm0.d;
                            break;
                        }
                        if (z2) {
                            rfm0Var = rfm0.c;
                            break;
                        }
                    }
                    rfm0Var = rfm0Var2;
                    break;
                }
            }
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    rfm0Var = rfm0.f;
                } else {
                    int i14 = bytes[i13] & 255;
                    if ((i14 < 129 || i14 > 159) && (i14 < 224 || i14 > 235)) {
                        i10 = 0;
                        z = false;
                        z2 = false;
                        while (true) {
                            if (i10 < str.length()) {
                                cCharAt = str.charAt(i10);
                                if (cCharAt >= '0') {
                                    if (cCharAt < '`') {
                                        i11 = iArr[cCharAt];
                                    } else {
                                        i11 = -1;
                                    }
                                    if (i11 != -1) {
                                        z = true;
                                    }
                                } else {
                                    if (cCharAt < '`') {
                                        i11 = iArr[cCharAt];
                                    } else {
                                        i11 = -1;
                                    }
                                    if (i11 != -1) {
                                        z = true;
                                    }
                                }
                                i10++;
                            } else {
                                if (z) {
                                    rfm0Var = rfm0.d;
                                    break;
                                }
                                if (z2) {
                                    rfm0Var = rfm0.c;
                                    break;
                                }
                            }
                            rfm0Var = rfm0Var2;
                            break;
                        }
                    }
                    i13 += 2;
                }
            }
        } catch (UnsupportedEncodingException unused) {
        }
        int[] iArr2 = rfm0Var.a;
        owa owaVar = new owa();
        if (rfm0Var == rfm0Var2 && zContainsKey && (hneVar = (hne) hne.d.get(string)) != null) {
            owaVar.b(7, 4);
            owaVar.b(hneVar.a[0], 8);
        }
        qax qaxVar4 = qax.Y;
        if (map.containsKey(qaxVar4) && Boolean.valueOf(map.get(qaxVar4).toString()).booleanValue()) {
            i4 = 4;
            owaVar.b(5, 4);
        } else {
            i4 = 4;
        }
        owaVar.b(rfm0Var.b, i4);
        owa owaVar2 = new owa();
        int iOrdinal = rfm0Var.ordinal();
        int i15 = 10;
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                int length2 = str.length();
                int i16 = 0;
                while (i16 < length2) {
                    char cCharAt2 = str.charAt(i16);
                    int i17 = cCharAt2 < '`' ? iArr[cCharAt2] : -1;
                    if (i17 == -1) {
                        throw new WriterException();
                    }
                    int i18 = i16 + 1;
                    if (i18 < length2) {
                        char cCharAt3 = str.charAt(i18);
                        int i19 = cCharAt3 < '`' ? iArr[cCharAt3] : -1;
                        if (i19 == -1) {
                            throw new WriterException();
                        }
                        owaVar2.b((i17 * 45) + i19, 11);
                        i16 += 2;
                    } else {
                        owaVar2.b(i17, 6);
                        i16 = i18;
                    }
                    i12 = i12;
                }
            } else if (iOrdinal == 4) {
                try {
                    for (byte b : str.getBytes(string)) {
                        owaVar2.b(b, 8);
                    }
                } catch (UnsupportedEncodingException e) {
                    throw new WriterException(e);
                }
            } else {
                if (iOrdinal != 6) {
                    throw new WriterException("Invalid mode: ".concat(String.valueOf(rfm0Var)));
                }
                try {
                    byte[] bytes2 = str.getBytes("Shift_JIS");
                    int length3 = bytes2.length;
                    for (int i20 = 0; i20 < length3; i20 += 2) {
                        int i21 = ((bytes2[i20] & 255) << 8) | (bytes2[i20 + 1] & 255);
                        int i22 = (i21 < 33088 || i21 > 40956) ? (i21 < 57408 || i21 > 60351) ? -1 : i21 - 49472 : i21 - 33088;
                        if (i22 == -1) {
                            throw new WriterException("Invalid byte sequence");
                        }
                        owaVar2.b(((i22 >> 8) * 192) + (i22 & 255), 13);
                    }
                } catch (UnsupportedEncodingException e2) {
                    throw new WriterException(e2);
                }
            }
            i5 = i12;
        } else {
            i5 = i12;
            int length4 = str.length();
            int i23 = 0;
            while (i23 < length4) {
                int iCharAt = str.charAt(i23) - '0';
                int i24 = i23 + 2;
                if (i24 < length4) {
                    owaVar2.b(((str.charAt(i23 + 1) - '0') * 10) + (iCharAt * 100) + (str.charAt(i24) - '0'), i15);
                    i23 += 3;
                } else {
                    i23++;
                    if (i23 < length4) {
                        owaVar2.b((iCharAt * 10) + (str.charAt(i23) - '0'), 7);
                        i23 = i24;
                    } else {
                        owaVar2.b(iCharAt, 4);
                    }
                }
                i15 = 10;
            }
        }
        qax qaxVar5 = qax.X;
        if (map.containsKey(qaxVar5)) {
            w3j1VarA = w3j1.a(Integer.parseInt(map.get(qaxVar5).toString()));
            int i25 = owaVar.b;
            byte b2 = w3j1VarA.a;
            int i26 = iArr2[b2 <= 9 ? (char) 0 : b2 <= 26 ? (char) 1 : (char) 2] + i25 + owaVar2.b;
            int i27 = w3j1VarA.c;
            ovn1 ovn1Var = w3j1VarA.b[ogzVarValueOf.ordinal()];
            byte b3 = ovn1Var.a;
            int i28 = 0;
            for (v3j1 v3j1Var : (v3j1[]) ovn1Var.b) {
                i28 += v3j1Var.a;
            }
            if (i27 - (i28 * b3) < (i26 + 7) / 8) {
                throw new WriterException("Data too big for requested version");
            }
        } else {
            w3j1 w3j1VarA2 = w3j1.a(1);
            int i29 = owaVar.b;
            byte b4 = w3j1VarA2.a;
            int i30 = iArr2[b4 <= 9 ? (char) 0 : b4 <= 26 ? (char) 1 : (char) 2] + i29 + owaVar2.b;
            int i31 = 1;
            while (true) {
                if (i31 > 40) {
                    throw new WriterException("Data too big");
                }
                w3j1 w3j1VarA3 = w3j1.a(i31);
                int i32 = w3j1VarA3.c;
                ovn1 ovn1Var2 = w3j1VarA3.b[ogzVarValueOf.ordinal()];
                byte b5 = ovn1Var2.a;
                v3j1[] v3j1VarArr = (v3j1[]) ovn1Var2.b;
                int length5 = v3j1VarArr.length;
                int i33 = 0;
                int i34 = i30;
                int i35 = 0;
                while (i35 < length5) {
                    int i36 = i35;
                    i33 += v3j1VarArr[i36].a;
                    i35 = i36 + 1;
                }
                if (i32 - (i33 * b5) >= (i34 + 7) / 8) {
                    int i37 = owaVar.b;
                    byte b6 = w3j1VarA3.a;
                    int i38 = iArr2[b6 <= 9 ? (char) 0 : b6 <= 26 ? (char) 1 : (char) 2] + i37 + owaVar2.b;
                    int i39 = 1;
                    while (true) {
                        if (i39 > 40) {
                            throw new WriterException("Data too big");
                        }
                        w3j1 w3j1VarA4 = w3j1.a(i39);
                        int i40 = w3j1VarA4.c;
                        ovn1 ovn1Var3 = w3j1VarA4.b[ogzVarValueOf.ordinal()];
                        byte b7 = ovn1Var3.a;
                        v3j1[] v3j1VarArr2 = (v3j1[]) ovn1Var3.b;
                        int i41 = 0;
                        int i42 = i38;
                        int i43 = 0;
                        for (int length6 = v3j1VarArr2.length; i43 < length6; length6 = length6) {
                            i41 += v3j1VarArr2[i43].a;
                            i43++;
                        }
                        if (i40 - (i41 * b7) >= (i42 + 7) / 8) {
                            w3j1VarA = w3j1VarA4;
                            break;
                        }
                        i39++;
                        i38 = i42;
                    }
                } else {
                    i31++;
                    i30 = i34;
                }
            }
        }
        byte b8 = w3j1VarA.a;
        int i44 = w3j1VarA.c;
        owa owaVar3 = new owa();
        int i45 = owaVar.b;
        owaVar3.d(i45);
        for (int i46 = 0; i46 < i45; i46++) {
            owaVar3.a(owaVar.e(i46));
        }
        int iG = rfm0Var == rfm0Var2 ? owaVar2.g() : str.length();
        int i47 = iArr2[b8 <= 9 ? (char) 0 : b8 <= 26 ? (char) 1 : (char) 2];
        int i48 = 1 << i47;
        if (iG >= i48) {
            StringBuilder sb = new StringBuilder();
            sb.append(iG);
            sb.append(" is bigger than ");
            sb.append(i48 - 1);
            throw new WriterException(sb.toString());
        }
        owaVar3.b(iG, i47);
        int i49 = owaVar2.b;
        owaVar3.d(owaVar3.b + i49);
        for (int i50 = 0; i50 < i49; i50++) {
            owaVar3.a(owaVar2.e(i50));
        }
        ovn1 ovn1Var4 = w3j1VarA.b[ogzVarValueOf.ordinal()];
        byte b9 = ovn1Var4.a;
        v3j1[] v3j1VarArr3 = (v3j1[]) ovn1Var4.b;
        int i51 = 0;
        for (v3j1 v3j1Var2 : v3j1VarArr3) {
            i51 += v3j1Var2.a;
        }
        int i52 = i44 - (i51 * b9);
        int i53 = i52 << 3;
        if (owaVar3.b > i53) {
            throw new WriterException("data bits cannot fit in the QR Code" + owaVar3.b + " > " + i53);
        }
        for (int i54 = 0; i54 < 4 && owaVar3.b < i53; i54++) {
            owaVar3.a(false);
        }
        boolean z3 = false;
        int i55 = owaVar3.b & 7;
        if (i55 > 0) {
            while (i55 < 8) {
                owaVar3.a(z3);
                i55++;
                z3 = false;
            }
        }
        int iG2 = i52 - owaVar3.g();
        for (int i56 = 0; i56 < iG2; i56++) {
            owaVar3.b((i56 & 1) == 0 ? 236 : 17, 8);
        }
        if (owaVar3.b != i53) {
            throw new WriterException("Bits size does not equal capacity");
        }
        int i57 = 0;
        for (v3j1 v3j1Var3 : v3j1VarArr3) {
            i57 += v3j1Var3.a;
        }
        if (owaVar3.g() != i52) {
            throw new WriterException("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(i57);
        int i58 = 0;
        int i59 = 0;
        int iMax = 0;
        int iMax2 = 0;
        while (i58 < i57) {
            int[] iArr3 = new int[1];
            byte b10 = b8;
            int[] iArr4 = new int[1];
            if (i58 >= i57) {
                throw new WriterException("Block ID too large");
            }
            int i60 = i44 % i57;
            int i61 = i57 - i60;
            int i62 = i44 / i57;
            int i63 = i52 / i57;
            int i64 = i63 + 1;
            int i65 = i62 - i63;
            int i66 = (i62 + 1) - i64;
            if (i65 != i66) {
                throw new WriterException("EC bytes mismatch");
            }
            if (i57 != i61 + i60) {
                throw new WriterException("RS blocks mismatch");
            }
            if (i44 != ((i64 + i66) * i60) + ((i63 + i65) * i61)) {
                throw new WriterException("Total bytes mismatch");
            }
            if (i58 < i61) {
                c = 0;
                iArr3[0] = i63;
                iArr4[0] = i65;
            } else {
                c = 0;
                iArr3[0] = i64;
                iArr4[0] = i66;
            }
            int i67 = iArr3[c];
            byte[] bArr = new byte[i67];
            int i68 = i59 << 3;
            int i69 = 0;
            while (i69 < i67) {
                int i70 = i58;
                int i71 = i69;
                int i72 = i68;
                int i73 = i57;
                int i74 = 0;
                for (int i75 = 0; i75 < 8; i75++) {
                    if (owaVar3.e(i72)) {
                        i74 = (1 << (7 - i75)) | i74;
                    }
                    i72++;
                }
                bArr[i71] = (byte) i74;
                i57 = i73;
                i58 = i70;
                i68 = i72;
                i69 = i71 + 1;
            }
            int i76 = i58;
            int i77 = i57;
            int i78 = iArr4[0];
            int[] iArr5 = new int[i67 + i78];
            for (int i79 = 0; i79 < i67; i79++) {
                iArr5[i79] = bArr[i79] & 255;
            }
            new uxy0(ai40.k).u(i78, iArr5);
            byte[] bArr2 = new byte[i78];
            int i80 = 0;
            while (i80 < i78) {
                int[] iArr6 = iArr5;
                bArr2[i80] = (byte) iArr6[i67 + i80];
                i80++;
                iArr5 = iArr6;
            }
            arrayList.add(new r6b(bArr, bArr2));
            iMax = Math.max(iMax, i67);
            iMax2 = Math.max(iMax2, i78);
            i59 += iArr3[0];
            i58 = i76 + 1;
            b8 = b10;
            i57 = i77;
        }
        byte b11 = b8;
        if (i52 != i59) {
            throw new WriterException("Data bytes does not match offset");
        }
        owa owaVar4 = new owa();
        for (int i81 = 0; i81 < iMax; i81++) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] bArr3 = ((r6b) it.next()).a;
                if (i81 < bArr3.length) {
                    owaVar4.b(bArr3[i81], 8);
                }
            }
        }
        for (int i82 = 0; i82 < iMax2; i82++) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] bArr4 = ((r6b) it2.next()).b;
                if (i82 < bArr4.length) {
                    owaVar4.b(bArr4[i82], 8);
                }
            }
        }
        if (i44 != owaVar4.g()) {
            StringBuilder sbR = cy30.r(i44, "Interleaving error: ", " and ");
            sbR.append(owaVar4.g());
            sbR.append(" differ.");
            throw new WriterException(sbR.toString());
        }
        int i83 = (b11 * 4) + 17;
        pyp0 pyp0Var = new pyp0(i83, i83);
        int i84 = pyp0Var.c;
        int i85 = pyp0Var.b;
        int i86 = Integer.MAX_VALUE;
        int i87 = 0;
        int i88 = -1;
        while (i87 < 8) {
            cpn1.k(owaVar4, ogzVarValueOf, w3j1VarA, i87, pyp0Var);
            int iL = y3o1.l(pyp0Var, false) + y3o1.l(pyp0Var, true);
            byte[][] bArr5 = (byte[][]) pyp0Var.d;
            int i89 = 0;
            int i90 = 0;
            while (i89 < i84 - 1) {
                byte[] bArr6 = bArr5[i89];
                int i91 = i90;
                int i92 = 0;
                while (i92 < i85 - 1) {
                    byte b12 = bArr6[i92];
                    int i93 = i92 + 1;
                    int i94 = i89;
                    if (b12 == bArr6[i93]) {
                        byte[] bArr7 = bArr5[i94 + 1];
                        if (b12 == bArr7[i92] && b12 == bArr7[i93]) {
                            i91++;
                        }
                    }
                    i92 = i93;
                    i89 = i94;
                }
                i89++;
                i90 = i91;
            }
            int i95 = (i90 * 3) + iL;
            int i96 = 0;
            int i97 = 0;
            while (i96 < i84) {
                int i98 = 0;
                while (i98 < i85) {
                    byte[] bArr8 = bArr5[i96];
                    int i99 = i97;
                    int i100 = i98 + 6;
                    if (i100 < i85) {
                        i6 = i87;
                        if (bArr8[i98] == 1 && bArr8[i98 + 1] == 0 && bArr8[i98 + 2] == 1 && bArr8[i98 + 3] == 1 && bArr8[i98 + 4] == 1 && bArr8[i98 + 5] == 0 && bArr8[i100] == 1) {
                            int iMax3 = Math.max(i98 - 4, 0);
                            int iMin = Math.min(i98, bArr8.length);
                            while (true) {
                                if (iMax3 < iMin) {
                                    int i101 = iMax3;
                                    int i102 = iMin;
                                    if (bArr8[i101] == 1) {
                                        i7 = i98;
                                        int iMax4 = Math.max(i98 + 7, 0);
                                        int iMin2 = Math.min(i98 + 11, bArr8.length);
                                        while (true) {
                                            if (iMax4 < iMin2) {
                                                int i103 = iMax4;
                                                if (bArr8[iMax4] != 1) {
                                                    iMax4 = i103 + 1;
                                                }
                                            }
                                        }
                                    } else {
                                        iMax3 = i101 + 1;
                                        iMin = i102;
                                    }
                                } else {
                                    i7 = i98;
                                }
                                i97 = i99 + 1;
                                i8 = i96 + 6;
                                if (i8 < i84) {
                                    byte b13 = 1;
                                    if (bArr5[i96][i7] != 1 && bArr5[i96 + 1][i7] == 0 && bArr5[i96 + 2][i7] == 1 && bArr5[i96 + 3][i7] == 1 && bArr5[i96 + 4][i7] == 1 && bArr5[i96 + 5][i7] == 0 && bArr5[i8][i7] == 1) {
                                        int iMax5 = Math.max(i96 - 4, 0);
                                        int iMin3 = Math.min(i96, bArr5.length);
                                        while (true) {
                                            if (iMax5 < iMin3) {
                                                i9 = i96;
                                                if (bArr5[iMax5][i7] == b13) {
                                                    int iMax6 = Math.max(i9 + 7, 0);
                                                    int iMin4 = Math.min(i9 + 11, bArr5.length);
                                                    while (true) {
                                                        if (iMax6 < iMin4) {
                                                            if (bArr5[iMax6][i7] == 1) {
                                                                break;
                                                            }
                                                            iMax6++;
                                                        }
                                                    }
                                                } else {
                                                    iMax5++;
                                                    i96 = i9;
                                                    b13 = 1;
                                                }
                                            } else {
                                                i9 = i96;
                                            }
                                            i97++;
                                            break;
                                        }
                                    } else {
                                        i9 = i96;
                                    }
                                } else {
                                    i9 = i96;
                                }
                                i98 = i7 + 1;
                                i87 = i6;
                                i96 = i9;
                            }
                        }
                        i97 = i99;
                        i8 = i96 + 6;
                        if (i8 < i84) {
                            byte b14 = 1;
                            if (bArr5[i96][i7] != 1) {
                                i9 = i96;
                            } else {
                                i9 = i96;
                            }
                        } else {
                            i9 = i96;
                        }
                        i98 = i7 + 1;
                        i87 = i6;
                        i96 = i9;
                    } else {
                        i6 = i87;
                    }
                    i7 = i98;
                    i97 = i99;
                    i8 = i96 + 6;
                    if (i8 < i84) {
                        byte b15 = 1;
                        if (bArr5[i96][i7] != 1) {
                            i9 = i96;
                        } else {
                            i9 = i96;
                        }
                    } else {
                        i9 = i96;
                    }
                    i98 = i7 + 1;
                    i87 = i6;
                    i96 = i9;
                }
                i96++;
            }
            int i104 = i87;
            int i105 = (i97 * 40) + i95;
            int i106 = 0;
            for (int i107 = 0; i107 < i84; i107++) {
                byte[] bArr9 = bArr5[i107];
                for (int i108 = 0; i108 < i85; i108++) {
                    int i109 = i106;
                    i106 = bArr9[i108] == 1 ? i109 + 1 : i109;
                }
            }
            int i110 = i84 * i85;
            int iAbs = (((Math.abs((i106 << 1) - i110) * 10) / i110) * 10) + i105;
            if (iAbs < i86) {
                i86 = iAbs;
                i88 = i104;
            }
            i87 = i104 + 1;
        }
        cpn1.k(owaVar4, ogzVarValueOf, w3j1VarA, i88, pyp0Var);
        int i111 = i5 << 1;
        int i112 = i85 + i111;
        int i113 = i111 + i84;
        int iMax7 = Math.max(i2, i112);
        int iMax8 = Math.max(i3, i113);
        int iMin5 = Math.min(iMax7 / i112, iMax8 / i113);
        int i114 = (iMax7 - (i85 * iMin5)) / 2;
        int i115 = (iMax8 - (i84 * iMin5)) / 2;
        qwa qwaVar = new qwa(iMax7, iMax8);
        int i116 = 0;
        while (i116 < i84) {
            int i117 = i114;
            int i118 = 0;
            while (i118 < i85) {
                if (pyp0Var.q(i118, i116) == 1) {
                    qwaVar.d(i117, i115, iMin5, iMin5);
                }
                i118++;
                i117 += iMin5;
            }
            i116++;
            i115 += iMin5;
        }
        return qwaVar;
    }

    public Single l(Intent intent, th61 th61Var) {
        vjq0 vjq0Var = (vjq0) ila0.s(intent, "push_data", vjq0.class);
        String strZ = vjq0Var != null ? vjq0Var.d : null;
        if (strZ == null) {
            Set set = s4b1.f;
            strZ = uic.x(String.valueOf(intent.getData())).z();
        }
        if (strZ == null) {
            Set set2 = s4b1.f;
            return Single.just(new ern0(uic.x("spotify:home")));
        }
        Set set3 = s4b1.f;
        s4b1 s4b1VarX = uic.x(strZ);
        String strZ2 = s4b1VarX.z();
        if (strZ2 != null) {
            return Single.just(new hrn0(gwd0.class, new vzd0(strZ2, u890.j(s4b1VarX.n("action"), "share") ? 1 : 0), a6w0.a));
        }
        hhg1.n("Required value was null.");
        return null;
    }

    public void s() {
        switch (this.a) {
            case 10:
                throw new UnsupportedOperationException();
            default:
                return;
        }
    }

    @Override // p.p02
    public p02 verifyRecordingInfo() {
        l1d.z("\n            ", "verifyRecordingInfo", " was used. This should not happen as the Dummy is only injected if the rollout flag is disabled.\"\n        ");
        return this;
    }

    public gtf1 w(int i, int i2) {
        switch (this.a) {
            case 10:
                throw new UnsupportedOperationException();
            default:
                return new x6u();
        }
    }

    @Override // p.p02
    public p02 withCoDoing(gug gugVar, Optional optional) {
        l1d.z("\n            ", "withCoDoing", " was used. This should not happen as the Dummy is only injected if the rollout flag is disabled.\"\n        ");
        return this;
    }

    public /* synthetic */ pob(byte b, boolean z) {
        this.a = b;
    }

    private final void d() {
    }

    private final void i(fn51 fn51Var) {
    }
}
