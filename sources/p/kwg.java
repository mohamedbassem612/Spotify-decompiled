package p;

import android.R;
import android.util.Pair;
import androidx.car.app.model.Action;
import androidx.car.app.navigation.model.Maneuver;
import app.p000rive.runtime.kotlin.renderers.RendererMetrics;
import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.AdvertisementType;
import com.comscore.streaming.ContentType;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class kwg {
    public static final byte[] a = {0, 0, 0, 1};
    public static final String[] b = {"", "A", "B", "C"};
    public static final Pattern c = Pattern.compile("^\\D?(\\d+)$");

    public static String a(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        Object[] objArr = {b[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(z ? 'H' : 'L'), Integer.valueOf(i4)};
        String str = zoi1.a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i5 = 0; i5 < length; i5++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i5])));
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007a  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c9  */
    public static byte[] b(ByteBuffer byteBuffer) {
        int iG;
        boolean z;
        int iIntValue;
        int iIntValue2;
        int i;
        int i2;
        Pair pairCreate;
        int iMin = Math.min(byteBuffer.remaining(), SemanticState.Focused);
        byte[] bArr = new byte[iMin];
        byteBuffer.get(bArr, 0, iMin);
        bae baeVar = new bae(bArr, iMin);
        dm5.y(byteBuffer.remaining() >= 5);
        if (baeVar.g(2) == 2 && (((iG = baeVar.g(1) | (baeVar.g(1) << 1)) != 3 || (baeVar.b() >= 1 && !baeVar.f())) && !baeVar.f())) {
            int iG2 = baeVar.g(1);
            boolean zF = baeVar.f();
            boolean zF2 = baeVar.f();
            boolean z2 = iG2 == 0;
            if (z2) {
                z = z2;
            } else {
                int iG3 = !zF ? baeVar.g(1) : 0;
                if (!zF2) {
                    baeVar.o(2);
                }
                if (iG3 != 0) {
                    z = iG > 0;
                    z2 = true;
                } else {
                    z = z2;
                }
            }
            if (z2 && baeVar.g(24) == 4817730) {
                if (z) {
                    if (iG >= 2) {
                        i = baeVar.f() ? 12 : 10;
                    } else {
                        i = 8;
                    }
                    if (baeVar.g(3) != 7) {
                        baeVar.o(1);
                        if (iG == 1 || iG == 3) {
                            int iG4 = baeVar.g(1);
                            int iG5 = baeVar.g(1);
                            if (iG4 != 1 || iG5 != 1) {
                                if (iG4 == 1 && iG5 == 0) {
                                    i2 = 2;
                                } else if (iG4 == 0 && iG5 == 0) {
                                    i2 = 3;
                                }
                            }
                            pairCreate = null;
                        } else {
                            i2 = 0;
                        }
                        pairCreate = Pair.create(Integer.valueOf(i), Integer.valueOf(i2));
                    } else {
                        i2 = 3;
                        pairCreate = Pair.create(Integer.valueOf(i), Integer.valueOf(i2));
                    }
                    if (pairCreate != null) {
                        iIntValue2 = ((Integer) pairCreate.first).intValue();
                        iIntValue = ((Integer) pairCreate.second).intValue();
                    }
                } else {
                    iIntValue = 0;
                    iIntValue2 = 8;
                }
                return (byte[]) b380.t(new byte[]{1, 1, (byte) iG, 2, 1, 0, 3, 1, (byte) iIntValue2, 4, 1, (byte) iIntValue}).get(0);
            }
        }
        return null;
    }

    public static Pair c(ie30 ie30Var) {
        jwg jwgVarE = e(ie30Var);
        if (jwgVarE == null || !jwgVarE.c) {
            return null;
        }
        return new Pair(Integer.valueOf(jwgVarE.c()), Integer.valueOf(jwgVarE.b()));
    }

    public static jwg d(String str, String[] strArr, x8h x8hVar) {
        int i;
        Integer numValueOf = null;
        if (strArr.length < 4) {
            ktd.r("Ignoring malformed HEVC codec string: ", str);
            return null;
        }
        Matcher matcher = c.matcher(strArr[1]);
        if (!matcher.matches()) {
            ktd.r("Ignoring malformed HEVC codec string: ", str);
            return null;
        }
        String strGroup = matcher.group(1);
        boolean zEquals = "1".equals(strGroup);
        byte b2 = 6;
        jwg jwgVar = jwg.d;
        if (zEquals) {
            i = 1;
        } else {
            if (!"2".equals(strGroup)) {
                ktd.r("Unknown HEVC profile string: ", strGroup);
                return jwgVar;
            }
            i = (x8hVar == null || x8hVar.c != 6) ? 2 : 4096;
        }
        String str2 = strArr[3];
        str2.getClass();
        switch (str2.hashCode()) {
            case 70821:
                b2 = !str2.equals("H30") ? (byte) -1 : (byte) 0;
                break;
            case 70914:
                b2 = !str2.equals("H60") ? (byte) -1 : (byte) 1;
                break;
            case 70917:
                b2 = !str2.equals("H63") ? (byte) -1 : (byte) 2;
                break;
            case 71007:
                b2 = !str2.equals("H90") ? (byte) -1 : (byte) 3;
                break;
            case 71010:
                b2 = !str2.equals("H93") ? (byte) -1 : (byte) 4;
                break;
            case 74665:
                b2 = !str2.equals("L30") ? (byte) -1 : (byte) 5;
                break;
            case 74758:
                if (!str2.equals("L60")) {
                    b2 = -1;
                }
                break;
            case 74761:
                b2 = !str2.equals("L63") ? (byte) -1 : (byte) 7;
                break;
            case 74851:
                b2 = !str2.equals("L90") ? (byte) -1 : (byte) 8;
                break;
            case 74854:
                b2 = !str2.equals("L93") ? (byte) -1 : (byte) 9;
                break;
            case 2193639:
                b2 = !str2.equals("H120") ? (byte) -1 : (byte) 10;
                break;
            case 2193642:
                b2 = !str2.equals("H123") ? (byte) -1 : (byte) 11;
                break;
            case 2193732:
                b2 = !str2.equals("H150") ? (byte) -1 : (byte) 12;
                break;
            case 2193735:
                b2 = !str2.equals("H153") ? (byte) -1 : (byte) 13;
                break;
            case 2193738:
                b2 = !str2.equals("H156") ? (byte) -1 : (byte) 14;
                break;
            case 2193825:
                b2 = !str2.equals("H180") ? (byte) -1 : (byte) 15;
                break;
            case 2193828:
                b2 = !str2.equals("H183") ? (byte) -1 : (byte) 16;
                break;
            case 2193831:
                b2 = !str2.equals("H186") ? (byte) -1 : (byte) 17;
                break;
            case 2312803:
                b2 = !str2.equals("L120") ? (byte) -1 : (byte) 18;
                break;
            case 2312806:
                b2 = !str2.equals("L123") ? (byte) -1 : (byte) 19;
                break;
            case 2312896:
                b2 = !str2.equals("L150") ? (byte) -1 : (byte) 20;
                break;
            case 2312899:
                b2 = !str2.equals("L153") ? (byte) -1 : (byte) 21;
                break;
            case 2312902:
                b2 = !str2.equals("L156") ? (byte) -1 : (byte) 22;
                break;
            case 2312989:
                b2 = !str2.equals("L180") ? (byte) -1 : (byte) 23;
                break;
            case 2312992:
                b2 = !str2.equals("L183") ? (byte) -1 : (byte) 24;
                break;
            case 2312995:
                b2 = !str2.equals("L186") ? (byte) -1 : (byte) 25;
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                numValueOf = 2;
                break;
            case 1:
                numValueOf = 8;
                break;
            case 2:
                numValueOf = 32;
                break;
            case 3:
                numValueOf = Integer.valueOf(SemanticState.Focused);
                break;
            case 4:
                numValueOf = 512;
                break;
            case 5:
                numValueOf = 1;
                break;
            case 6:
                numValueOf = 4;
                break;
            case 7:
                numValueOf = 16;
                break;
            case 8:
                numValueOf = 64;
                break;
            case 9:
                numValueOf = Integer.valueOf(SemanticState.Hidden);
                break;
            case 10:
                numValueOf = Integer.valueOf(SemanticState.Modal);
                break;
            case 11:
                numValueOf = Integer.valueOf(SemanticState.Multiline);
                break;
            case 12:
                numValueOf = 32768;
                break;
            case 13:
                numValueOf = 131072;
                break;
            case 14:
                numValueOf = 524288;
                break;
            case 15:
                numValueOf = 2097152;
                break;
            case 16:
                numValueOf = 8388608;
                break;
            case 17:
                numValueOf = 33554432;
                break;
            case 18:
                numValueOf = Integer.valueOf(SemanticState.ReadOnly);
                break;
            case 19:
                numValueOf = Integer.valueOf(SemanticState.Obscured);
                break;
            case 20:
                numValueOf = Integer.valueOf(TlsSocketProvider.READ_BUFFER_SIZE);
                break;
            case 21:
                numValueOf = 65536;
                break;
            case 22:
                numValueOf = 262144;
                break;
            case 23:
                numValueOf = 1048576;
                break;
            case 24:
                numValueOf = 4194304;
                break;
            case 25:
                numValueOf = 16777216;
                break;
        }
        if (numValueOf != null) {
            return new jwg(i, numValueOf.intValue(), true);
        }
        oon1.H("Unknown HEVC level string: ".concat(str2));
        return jwgVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:154:0x0236  */
    /* JADX WARN: Code duplicated, block: B:17:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:231:0x0336  */
    /* JADX WARN: Code duplicated, block: B:492:0x0668 A[PHI: r3
      0x0668: PHI (r3v43 int) = (r3v42 int), (r3v45 int), (r3v46 int), (r3v47 int), (r3v48 int) binds: [B:473:0x063b, B:476:0x0641, B:478:0x0645, B:480:0x0649, B:482:0x064d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:510:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:80:0x0157  */
    /* JADX WARN: Code duplicated, block: B:920:0x0b88  */
    public static jwg e(ie30 ie30Var) {
        byte b2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        char c2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Integer num;
        Integer numValueOf = Integer.valueOf(SemanticState.ReadOnly);
        Integer numValueOf2 = Integer.valueOf(SemanticState.Modal);
        Integer numValueOf3 = Integer.valueOf(SemanticState.Obscured);
        Integer numValueOf4 = Integer.valueOf(SemanticState.Hidden);
        Integer numValueOf5 = Integer.valueOf(SemanticState.Focused);
        String str = ie30Var.l;
        x8h x8hVar = ie30Var.H;
        if (str != null) {
            String[] strArrSplit = str.split("\\.");
            boolean zEquals = "video/dolby-vision".equals(ie30Var.f66p);
            jwg jwgVar = jwg.d;
            if (zEquals) {
                if (strArrSplit.length < 3) {
                    ktd.r("Ignoring malformed Dolby Vision codec string: ", str);
                    return null;
                }
                Matcher matcher = c.matcher(strArrSplit[1]);
                if (!matcher.matches()) {
                    ktd.r("Ignoring malformed Dolby Vision codec string: ", str);
                    return null;
                }
                String strGroup = matcher.group(1);
                strGroup.getClass();
                switch (strGroup) {
                    case "00":
                        num = 1;
                        break;
                    case "01":
                        num = 2;
                        break;
                    case "02":
                        num = 4;
                        break;
                    case "03":
                        num = 8;
                        break;
                    case "04":
                        num = 16;
                        break;
                    case "05":
                        num = 32;
                        break;
                    case "06":
                        num = 64;
                        break;
                    case "07":
                        num = numValueOf5;
                        break;
                    case "08":
                        num = numValueOf4;
                        break;
                    case "09":
                        num = 512;
                        break;
                    case "10":
                        num = numValueOf;
                        break;
                    default:
                        num = null;
                        break;
                }
                if (num == null) {
                    oon1.H("Unknown Dolby Vision profile string: ".concat(strGroup));
                    return jwgVar;
                }
                String str2 = strArrSplit[2];
                str2.getClass();
                switch (str2) {
                    case "01":
                        numValueOf = 1;
                        break;
                    case "02":
                        numValueOf = 2;
                        break;
                    case "03":
                        numValueOf = 4;
                        break;
                    case "04":
                        numValueOf = 8;
                        break;
                    case "05":
                        numValueOf = 16;
                        break;
                    case "06":
                        numValueOf = 32;
                        break;
                    case "07":
                        numValueOf = 64;
                        break;
                    case "08":
                        numValueOf = numValueOf5;
                        break;
                    case "09":
                        numValueOf = numValueOf4;
                        break;
                    case "10":
                        numValueOf = 512;
                        break;
                    case "11":
                        break;
                    case "12":
                        numValueOf = numValueOf2;
                        break;
                    case "13":
                        numValueOf = numValueOf3;
                        break;
                    default:
                        numValueOf = null;
                        break;
                }
                if (numValueOf != null) {
                    return new jwg(num.intValue(), numValueOf.intValue(), true);
                }
                oon1.H("Unknown Dolby Vision level string: ".concat(str2));
                return null;
            }
            String str3 = strArrSplit[0];
            str3.getClass();
            switch (str3) {
                case "ac-4":
                    b2 = 0;
                    break;
                case "apv1":
                    b2 = 1;
                    break;
                case "av01":
                    b2 = 2;
                    break;
                case "avc1":
                    b2 = 3;
                    break;
                case "avc2":
                    b2 = 4;
                    break;
                case "hev1":
                    b2 = 5;
                    break;
                case "hvc1":
                    b2 = 6;
                    break;
                case "iamf":
                    b2 = 7;
                    break;
                case "mp4a":
                    b2 = 8;
                    break;
                case "s263":
                    b2 = 9;
                    break;
                case "vp09":
                    b2 = 10;
                    break;
                case "vvc1":
                    b2 = 11;
                    break;
                case "vvi1":
                    b2 = 12;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            int i21 = 1028;
            int i22 = 20;
            switch (b2) {
                case 0:
                    if (strArrSplit.length != 4) {
                        ktd.r("Ignoring malformed AC-4 codec string: ", str);
                        return null;
                    }
                    try {
                        int i23 = Integer.parseInt(strArrSplit[1]);
                        int i24 = Integer.parseInt(strArrSplit[2]);
                        int i25 = Integer.parseInt(strArrSplit[3]);
                        if (i23 != 0) {
                            if (i23 != 1) {
                                if (i23 != 2) {
                                    i = -1;
                                    i21 = -1;
                                } else if (i24 == 1) {
                                    i = -1;
                                    i21 = 1026;
                                } else if (i24 == 2) {
                                    i = -1;
                                } else {
                                    i = -1;
                                    i21 = -1;
                                }
                            } else if (i24 == 0) {
                                i = -1;
                                i21 = 513;
                            } else if (i24 == 1) {
                                i = -1;
                                i21 = 514;
                            } else {
                                i = -1;
                                i21 = -1;
                            }
                        } else if (i24 == 0) {
                            i = -1;
                            i21 = 257;
                        } else {
                            i = -1;
                            i21 = -1;
                        }
                        if (i21 == i) {
                            oon1.H("Unknown AC-4 profile: " + i23 + "." + i24);
                            return jwgVar;
                        }
                        if (i25 != 0) {
                            if (i25 == 1) {
                                i3 = 2;
                            } else if (i25 == 2) {
                                i3 = 4;
                            } else if (i25 != 3) {
                                i2 = i25 != 4 ? -1 : 16;
                            } else {
                                i2 = 8;
                            }
                            i2 = i3;
                        } else {
                            i2 = 1;
                        }
                        if (i2 != -1) {
                            return new jwg(i21, i2, true);
                        }
                        td6.p(i25, "Unknown AC-4 level: ");
                        return jwgVar;
                    } catch (NumberFormatException unused) {
                        ktd.r("Ignoring malformed AC-4 codec string: ", str);
                        return null;
                    }
                case 1:
                    if (strArrSplit.length < 4) {
                        ktd.r("Ignoring malformed APV codec string: ", str);
                        return null;
                    }
                    try {
                        int i26 = Integer.parseInt(strArrSplit[1].substring(4));
                        int i27 = Integer.parseInt(strArrSplit[2].substring(4));
                        int i28 = Integer.parseInt(strArrSplit[3].substring(4));
                        if (i26 == 33) {
                            i4 = 1;
                        } else {
                            if (i26 != 44) {
                                td6.p(i26, "Unrecognized APV profile: ");
                                return jwgVar;
                            }
                            i4 = 8192;
                        }
                        switch (i27) {
                            case RendererMetrics.SAMPLES /* 30 */:
                                if (i28 == 0) {
                                    i5 = 257;
                                } else if (i28 == 1) {
                                    i5 = 258;
                                } else if (i28 == 2) {
                                    i5 = 260;
                                } else if (i28 == 3) {
                                    i5 = 264;
                                } else {
                                    td6.p(i28, "Unrecognized APV band: ");
                                    i5 = -1;
                                }
                                break;
                            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                                if (i28 == 0) {
                                    i5 = 513;
                                } else if (i28 == 1) {
                                    i5 = 514;
                                } else if (i28 == 2) {
                                    i5 = 516;
                                } else if (i28 == 3) {
                                    i5 = 520;
                                } else {
                                    td6.p(i28, "Unrecognized APV band: ");
                                    i5 = -1;
                                }
                                break;
                            case 60:
                                if (i28 == 0) {
                                    i5 = 1025;
                                } else if (i28 == 1) {
                                    i5 = 1026;
                                } else if (i28 == 2) {
                                    i5 = 1028;
                                } else if (i28 == 3) {
                                    i5 = 1032;
                                } else {
                                    td6.p(i28, "Unrecognized APV band: ");
                                    i5 = -1;
                                }
                                break;
                            case 63:
                                if (i28 == 0) {
                                    i5 = 2049;
                                } else if (i28 == 1) {
                                    i5 = 2050;
                                } else if (i28 == 2) {
                                    i5 = 2052;
                                } else if (i28 == 3) {
                                    i5 = 2056;
                                } else {
                                    td6.p(i28, "Unrecognized APV band: ");
                                    i5 = -1;
                                }
                                break;
                            case 90:
                                if (i28 == 0) {
                                    i5 = 4097;
                                } else if (i28 == 1) {
                                    i5 = 4098;
                                } else if (i28 == 2) {
                                    i5 = 4100;
                                } else if (i28 == 3) {
                                    i5 = 4104;
                                } else {
                                    td6.p(i28, "Unrecognized APV band: ");
                                    i5 = -1;
                                }
                                break;
                            case 93:
                                if (i28 == 0) {
                                    i5 = 8193;
                                } else if (i28 == 1) {
                                    i5 = 8194;
                                } else if (i28 == 2) {
                                    i5 = 8196;
                                } else if (i28 == 3) {
                                    i5 = 8200;
                                } else {
                                    td6.p(i28, "Unrecognized APV band: ");
                                    i5 = -1;
                                }
                                break;
                            case 120:
                                if (i28 == 0) {
                                    i5 = 16385;
                                } else if (i28 == 1) {
                                    i5 = 16386;
                                } else if (i28 == 2) {
                                    i5 = 16388;
                                } else if (i28 == 3) {
                                    i5 = 16392;
                                } else {
                                    td6.p(i28, "Unrecognized APV band: ");
                                    i5 = -1;
                                }
                                break;
                            case ContentType.USER_GENERATED_LIVE /* 123 */:
                                if (i28 == 0) {
                                    i5 = 32769;
                                } else if (i28 == 1) {
                                    i5 = 32770;
                                } else if (i28 == 2) {
                                    i5 = 32772;
                                } else if (i28 == 3) {
                                    i5 = 32776;
                                } else {
                                    td6.p(i28, "Unrecognized APV band: ");
                                    i5 = -1;
                                }
                                break;
                            case 150:
                                if (i28 == 0) {
                                    i5 = 65537;
                                } else if (i28 == 1) {
                                    i5 = Action.TYPE_APP_ICON;
                                } else if (i28 == 2) {
                                    i5 = Action.TYPE_PAN;
                                } else if (i28 == 3) {
                                    i5 = 65544;
                                } else {
                                    td6.p(i28, "Unrecognized APV band: ");
                                    i5 = -1;
                                }
                                break;
                            case 153:
                                if (i28 == 0) {
                                    i5 = 131073;
                                } else if (i28 == 1) {
                                    i5 = 131074;
                                } else if (i28 == 2) {
                                    i5 = 131076;
                                } else if (i28 == 3) {
                                    i5 = 131080;
                                } else {
                                    td6.p(i28, "Unrecognized APV band: ");
                                    i5 = -1;
                                }
                                break;
                            case 180:
                                if (i28 == 0) {
                                    i5 = 262145;
                                } else if (i28 == 1) {
                                    i5 = 262146;
                                } else if (i28 == 2) {
                                    i5 = 262148;
                                } else if (i28 == 3) {
                                    i5 = 262152;
                                } else {
                                    td6.p(i28, "Unrecognized APV band: ");
                                    i5 = -1;
                                }
                                break;
                            case 183:
                                if (i28 == 0) {
                                    i5 = 524289;
                                } else if (i28 == 1) {
                                    i5 = 524290;
                                } else if (i28 == 2) {
                                    i5 = 524292;
                                } else if (i28 == 3) {
                                    i5 = 524296;
                                } else {
                                    td6.p(i28, "Unrecognized APV band: ");
                                    i5 = -1;
                                }
                                break;
                            case 210:
                                if (i28 == 0) {
                                    i5 = 1048577;
                                } else if (i28 == 1) {
                                    i5 = 1048578;
                                } else if (i28 == 2) {
                                    i5 = 1048580;
                                } else if (i28 == 3) {
                                    i5 = 1048584;
                                } else {
                                    td6.p(i28, "Unrecognized APV band: ");
                                    i5 = -1;
                                }
                                break;
                            case AdvertisementType.ON_DEMAND_POST_ROLL /* 213 */:
                                if (i28 == 0) {
                                    i5 = 2097153;
                                } else if (i28 == 1) {
                                    i5 = 2097154;
                                } else if (i28 == 2) {
                                    i5 = 2097156;
                                } else if (i28 == 3) {
                                    i5 = 2097160;
                                } else {
                                    td6.p(i28, "Unrecognized APV band: ");
                                    i5 = -1;
                                }
                                break;
                            default:
                                td6.p(i27, "Unrecognized APV level index: ");
                                i5 = -1;
                                break;
                        }
                        if (i5 != -1) {
                            return new jwg(i4, i5, true);
                        }
                        return jwgVar;
                    } catch (NumberFormatException e) {
                        oon1.I("Ignoring malformed APV codec string: " + str, e);
                        return null;
                    }
                case 2:
                    if (strArrSplit.length < 4) {
                        ktd.r("Ignoring malformed AV1 codec string: ", str);
                        return null;
                    }
                    try {
                        int i29 = Integer.parseInt(strArrSplit[1]);
                        int i30 = Integer.parseInt(strArrSplit[2].substring(0, 2));
                        int i31 = Integer.parseInt(strArrSplit[3]);
                        if (i29 != 0) {
                            td6.p(i29, "Unknown AV1 profile: ");
                            return jwgVar;
                        }
                        int i32 = 8;
                        if (i31 != 8 && i31 != 10) {
                            td6.p(i31, "Unknown AV1 bit depth: ");
                            return jwgVar;
                        }
                        int i33 = i31 == 8 ? 1 : (x8hVar == null || !(x8hVar.d != null || (i6 = x8hVar.c) == 7 || i6 == 6)) ? 2 : SemanticState.Obscured;
                        switch (i30) {
                            case 0:
                                i32 = 1;
                                break;
                            case 1:
                                i32 = 2;
                                break;
                            case 2:
                                i32 = 4;
                                break;
                            case 3:
                                break;
                            case 4:
                                i32 = 16;
                                break;
                            case 5:
                                i32 = 32;
                                break;
                            case 6:
                                i32 = 64;
                                break;
                            case 7:
                                i32 = SemanticState.Focused;
                                break;
                            case 8:
                                i32 = SemanticState.Hidden;
                                break;
                            case 9:
                                i32 = 512;
                                break;
                            case 10:
                                i32 = SemanticState.ReadOnly;
                                break;
                            case 11:
                                i32 = SemanticState.Modal;
                                break;
                            case 12:
                                i32 = SemanticState.Obscured;
                                break;
                            case 13:
                                i32 = 8192;
                                break;
                            case 14:
                                i32 = 16384;
                                break;
                            case 15:
                                i32 = 32768;
                                break;
                            case 16:
                                i32 = 65536;
                                break;
                            case 17:
                                i32 = 131072;
                                break;
                            case 18:
                                i32 = 262144;
                                break;
                            case 19:
                                i32 = 524288;
                                break;
                            case 20:
                                i32 = 1048576;
                                break;
                            case 21:
                                i32 = 2097152;
                                break;
                            case 22:
                                i32 = 4194304;
                                break;
                            case 23:
                                i32 = 8388608;
                                break;
                            default:
                                i32 = -1;
                                break;
                        }
                        if (i32 != -1) {
                            return new jwg(i33, i32, true);
                        }
                        td6.p(i30, "Unknown AV1 level: ");
                        return jwgVar;
                    } catch (NumberFormatException unused2) {
                        ktd.r("Ignoring malformed AV1 codec string: ", str);
                        return null;
                    }
                case 3:
                case 4:
                    if (strArrSplit.length < 2) {
                        ktd.r("Ignoring malformed AVC codec string: ", str);
                        return null;
                    }
                    try {
                        if (strArrSplit[1].length() == 6) {
                            i7 = 16;
                            i8 = Integer.parseInt(strArrSplit[1].substring(0, 2), 16);
                            i9 = Integer.parseInt(strArrSplit[1].substring(4), 16);
                        } else {
                            i7 = 16;
                            if (strArrSplit.length < 3) {
                                oon1.H("Ignoring malformed AVC codec string: " + str);
                                return null;
                            }
                            i8 = Integer.parseInt(strArrSplit[1]);
                            i9 = Integer.parseInt(strArrSplit[2]);
                        }
                        if (i8 == 66) {
                            i10 = -1;
                            i11 = 1;
                        } else if (i8 == 77) {
                            i10 = -1;
                            i11 = 2;
                        } else if (i8 == 88) {
                            i10 = -1;
                            i11 = 4;
                        } else if (i8 == 100) {
                            i10 = -1;
                            i11 = 8;
                        } else if (i8 == 110) {
                            i11 = i7;
                            i10 = -1;
                        } else if (i8 == 122) {
                            i10 = -1;
                            i11 = 32;
                        } else if (i8 != 244) {
                            i10 = -1;
                            i11 = -1;
                        } else {
                            i10 = -1;
                            i11 = 64;
                        }
                        if (i11 == i10) {
                            td6.p(i8, "Unknown AVC profile: ");
                            return jwgVar;
                        }
                        switch (i9) {
                            case 10:
                                i7 = 1;
                                break;
                            case 11:
                                i7 = 4;
                                break;
                            case 12:
                                i7 = 8;
                                break;
                            case 13:
                                break;
                            default:
                                switch (i9) {
                                    case 20:
                                        i7 = 32;
                                        break;
                                    case 21:
                                        i7 = 64;
                                        break;
                                    case 22:
                                        i7 = SemanticState.Focused;
                                        break;
                                    default:
                                        switch (i9) {
                                            case RendererMetrics.SAMPLES /* 30 */:
                                                i7 = SemanticState.Hidden;
                                                break;
                                            case 31:
                                                i7 = 512;
                                                break;
                                            case 32:
                                                i7 = SemanticState.ReadOnly;
                                                break;
                                            default:
                                                switch (i9) {
                                                    case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                                                        i7 = SemanticState.Modal;
                                                        break;
                                                    case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                                                        i7 = SemanticState.Obscured;
                                                        break;
                                                    case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                                                        i7 = 8192;
                                                        break;
                                                    default:
                                                        switch (i9) {
                                                            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                                                i7 = 16384;
                                                                break;
                                                            case 51:
                                                                i7 = 32768;
                                                                break;
                                                            case 52:
                                                                i7 = 65536;
                                                                break;
                                                            default:
                                                                i7 = -1;
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        if (i7 != -1) {
                            return new jwg(i11, i7, true);
                        }
                        td6.p(i9, "Unknown AVC level: ");
                        return jwgVar;
                    } catch (NumberFormatException unused3) {
                        ktd.r("Ignoring malformed AVC codec string: ", str);
                        return null;
                    }
                case 5:
                case 6:
                    return d(str, strArrSplit, x8hVar);
                case 7:
                    if (strArrSplit.length < 4) {
                        ktd.r("Ignoring malformed IAMF codec string: ", str);
                        return null;
                    }
                    try {
                        try {
                            int i34 = Integer.parseInt(strArrSplit[1]);
                            String str4 = strArrSplit[3];
                            str4.getClass();
                            switch (str4) {
                                case "Opus":
                                    if (i34 != 0) {
                                        if (i34 == 1) {
                                            i12 = R.id.checkbox;
                                        } else if (i34 == 2) {
                                            i12 = R.string.copy;
                                        } else {
                                            td6.p(i34, "Unrecognized IAMF Opus profile: ");
                                            i12 = -1;
                                        }
                                        break;
                                    } else {
                                        i12 = R.attr.label;
                                        break;
                                    }
                                    break;
                                case "fLaC":
                                    if (i34 != 0) {
                                        if (i34 == 1) {
                                            i12 = R.id.empty;
                                        } else if (i34 == 2) {
                                            i12 = R.string.defaultVoiceMailAlphaTag;
                                        } else {
                                            td6.p(i34, "Unrecognized IAMF FLAC profile: ");
                                            i12 = -1;
                                        }
                                        break;
                                    } else {
                                        i12 = R.attr.manageSpaceActivity;
                                        break;
                                    }
                                    break;
                                case "ipcm":
                                    if (i34 != 0) {
                                        if (i34 == 1) {
                                            i12 = R.id.icon2;
                                        } else if (i34 == 2) {
                                            i12 = R.string.httpErrorUnsupportedScheme;
                                        } else {
                                            td6.p(i34, "Unrecognized IAMF PCM profile: ");
                                            i12 = -1;
                                        }
                                        break;
                                    } else {
                                        i12 = R.attr.writePermission;
                                        break;
                                    }
                                    break;
                                case "mp4a":
                                    if (i34 != 0) {
                                        if (i34 == 1) {
                                            i12 = R.id.content;
                                        } else if (i34 == 2) {
                                            i12 = R.string.copyUrl;
                                        } else {
                                            td6.p(i34, "Unrecognized IAMF AAC profile: ");
                                            i12 = -1;
                                        }
                                        break;
                                    } else {
                                        i12 = R.attr.icon;
                                        break;
                                    }
                                    break;
                                default:
                                    oon1.H("Unrecognized codec identifier for IAMF auxiliary profile: ".concat(str4));
                                    i12 = -1;
                                    break;
                            }
                            if (i12 != -1) {
                                return new jwg(i12, 0, true);
                            }
                            return jwgVar;
                        } catch (NumberFormatException e2) {
                            e = e2;
                            c2 = 1;
                            oon1.I("Ignoring malformed primary profile in IAMF codec string: " + strArrSplit[c2], e);
                            return null;
                        }
                    } catch (NumberFormatException e3) {
                        e = e3;
                        c2 = 1;
                    }
                    break;
                case 8:
                    if (strArrSplit.length != 3) {
                        ktd.r("Ignoring malformed MP4A codec string: ", str);
                        return null;
                    }
                    try {
                        if ("audio/mp4a-latm".equals(asj0.f(Integer.parseInt(strArrSplit[1], 16)))) {
                            int i35 = Integer.parseInt(strArrSplit[2]);
                            int i36 = 17;
                            if (i35 == 17) {
                                i22 = i36;
                                i13 = -1;
                            } else if (i35 != 20) {
                                i36 = 23;
                                if (i35 != 23) {
                                    i36 = 29;
                                    if (i35 != 29) {
                                        i36 = 39;
                                        if (i35 != 39) {
                                            i36 = 42;
                                            if (i35 != 42) {
                                                switch (i35) {
                                                    case 1:
                                                        i13 = -1;
                                                        i22 = 1;
                                                        break;
                                                    case 2:
                                                        i13 = -1;
                                                        i22 = 2;
                                                        break;
                                                    case 3:
                                                        i13 = -1;
                                                        i22 = 3;
                                                        break;
                                                    case 4:
                                                        i13 = -1;
                                                        i22 = 4;
                                                        break;
                                                    case 5:
                                                        i22 = 5;
                                                        break;
                                                    case 6:
                                                        i13 = -1;
                                                        i22 = 6;
                                                        break;
                                                    default:
                                                        i13 = -1;
                                                        i22 = -1;
                                                        break;
                                                }
                                            } else {
                                                i22 = i36;
                                            }
                                            i13 = -1;
                                        } else {
                                            i22 = i36;
                                            i13 = -1;
                                        }
                                    } else {
                                        i22 = i36;
                                        i13 = -1;
                                    }
                                } else {
                                    i22 = i36;
                                    i13 = -1;
                                }
                            } else {
                                i13 = -1;
                            }
                            if (i22 != i13) {
                                return new jwg(i22, 0, true);
                            }
                            oon1.H("Unrecognized MP4A profile: " + i22);
                            return jwgVar;
                        }
                    } catch (NumberFormatException unused4) {
                        ktd.r("Ignoring malformed MP4A codec string: ", str);
                        return null;
                    }
                    break;
                case 9:
                    if (strArrSplit.length < 3) {
                        ktd.r("Ignoring malformed H263 codec string: ", str);
                        return null;
                    }
                    try {
                        int i37 = Integer.parseInt(strArrSplit[1]);
                        int i38 = Integer.parseInt(strArrSplit[2]);
                        switch (i37) {
                            case 0:
                                i14 = -1;
                                i15 = 1;
                                break;
                            case 1:
                                i14 = -1;
                                i15 = 2;
                                break;
                            case 2:
                                i14 = -1;
                                i15 = 4;
                                break;
                            case 3:
                                i14 = -1;
                                i15 = 8;
                                break;
                            case 4:
                                i14 = -1;
                                i15 = 16;
                                break;
                            case 5:
                                i14 = -1;
                                i15 = 32;
                                break;
                            case 6:
                                i14 = -1;
                                i15 = 64;
                                break;
                            case 7:
                                i14 = -1;
                                i15 = SemanticState.Focused;
                                break;
                            case 8:
                                i14 = -1;
                                i15 = SemanticState.Hidden;
                                break;
                            default:
                                i14 = -1;
                                i15 = -1;
                                break;
                        }
                        if (i15 == i14) {
                            td6.p(i37, "Unknown H263 profile: ");
                            return jwgVar;
                        }
                        if (i38 == 10) {
                            i16 = -1;
                            i17 = 1;
                        } else if (i38 == 20) {
                            i16 = -1;
                            i17 = 2;
                        } else if (i38 == 30) {
                            i16 = -1;
                            i17 = 4;
                        } else if (i38 == 40) {
                            i16 = -1;
                            i17 = 8;
                        } else if (i38 == 45) {
                            i16 = -1;
                            i17 = 16;
                        } else if (i38 == 50) {
                            i16 = -1;
                            i17 = 32;
                        } else if (i38 == 60) {
                            i16 = -1;
                            i17 = 64;
                        } else if (i38 != 70) {
                            i16 = -1;
                            i17 = -1;
                        } else {
                            i16 = -1;
                            i17 = SemanticState.Focused;
                        }
                        if (i17 != i16) {
                            return new jwg(i15, i17, true);
                        }
                        td6.p(i38, "Unknown H263 level: ");
                        return jwgVar;
                    } catch (NumberFormatException unused5) {
                        ktd.r("Ignoring malformed H263 codec string: ", str);
                        return null;
                    }
                case 10:
                    if (strArrSplit.length < 3) {
                        ktd.r("Ignoring malformed VP9 codec string: ", str);
                        return null;
                    }
                    try {
                        int i39 = Integer.parseInt(strArrSplit[1]);
                        int i40 = Integer.parseInt(strArrSplit[2]);
                        if (i39 == 0) {
                            i18 = 1;
                        } else if (i39 == 1) {
                            i18 = 2;
                        } else if (i39 != 2) {
                            i18 = i39 != 3 ? -1 : 8;
                        } else {
                            i18 = 4;
                        }
                        if (i18 == -1) {
                            td6.p(i39, "Unknown VP9 profile: ");
                            return jwgVar;
                        }
                        if (i40 == 10) {
                            i19 = 1;
                        } else if (i40 == 11) {
                            i19 = 2;
                        } else if (i40 == 20) {
                            i19 = 4;
                        } else if (i40 == 21) {
                            i19 = 8;
                        } else if (i40 == 30) {
                            i19 = 16;
                        } else if (i40 == 31) {
                            i19 = 32;
                        } else if (i40 == 40) {
                            i19 = 64;
                        } else if (i40 == 41) {
                            i19 = SemanticState.Focused;
                        } else if (i40 == 50) {
                            i19 = SemanticState.Hidden;
                        } else if (i40 != 51) {
                            switch (i40) {
                                case 60:
                                    i19 = SemanticState.Modal;
                                    break;
                                case 61:
                                    i19 = SemanticState.Obscured;
                                    break;
                                case 62:
                                    i19 = 8192;
                                    break;
                                default:
                                    i19 = -1;
                                    break;
                            }
                        } else {
                            i19 = 512;
                        }
                        if (i19 != -1) {
                            return new jwg(i18, i19, true);
                        }
                        td6.p(i40, "Unknown VP9 level: ");
                        return jwgVar;
                    } catch (NumberFormatException unused6) {
                        ktd.r("Ignoring malformed VP9 codec string: ", str);
                        return null;
                    }
                case 11:
                case 12:
                    if (strArrSplit.length < 3) {
                        ktd.r("Ignoring malformed VVC codec string: ", str);
                        return null;
                    }
                    try {
                        int i41 = Integer.parseInt(strArrSplit[1]);
                        if (i41 == 1) {
                            i20 = (x8hVar == null || x8hVar.c != 6) ? (x8hVar == null || x8hVar.e != 8) ? 2 : 1 : SemanticState.Obscured;
                        } else {
                            if (i41 != 65) {
                                oon1.H("Unknown VVC profile IDC: " + strArrSplit[1]);
                                return jwgVar;
                            }
                            i20 = 4;
                        }
                        String str5 = strArrSplit[2];
                        str5.getClass();
                        switch (str5) {
                            case "H64":
                                numValueOf = 64;
                                break;
                            case "H67":
                                numValueOf = numValueOf4;
                                break;
                            case "H80":
                                break;
                            case "H83":
                                numValueOf = numValueOf3;
                                break;
                            case "H86":
                                numValueOf = Integer.valueOf(TlsSocketProvider.READ_BUFFER_SIZE);
                                break;
                            case "H96":
                                numValueOf = 65536;
                                break;
                            case "L16":
                                numValueOf = 1;
                                break;
                            case "L32":
                                numValueOf = 2;
                                break;
                            case "L35":
                                numValueOf = 4;
                                break;
                            case "L48":
                                numValueOf = 8;
                                break;
                            case "L51":
                                numValueOf = 16;
                                break;
                            case "L64":
                                numValueOf = 32;
                                break;
                            case "L67":
                                numValueOf = numValueOf5;
                                break;
                            case "L80":
                                numValueOf = 512;
                                break;
                            case "L83":
                                numValueOf = numValueOf2;
                                break;
                            case "L86":
                                numValueOf = Integer.valueOf(SemanticState.Multiline);
                                break;
                            case "L96":
                                numValueOf = 32768;
                                break;
                            case "H112":
                                numValueOf = 262144;
                                break;
                            case "H128":
                                numValueOf = 1048576;
                                break;
                            case "H144":
                                numValueOf = 4194304;
                                break;
                            case "L112":
                                numValueOf = 131072;
                                break;
                            case "L128":
                                numValueOf = 524288;
                                break;
                            case "L144":
                                numValueOf = 2097152;
                                break;
                            default:
                                numValueOf = null;
                                break;
                        }
                        if (numValueOf != null) {
                            return new jwg(i20, numValueOf.intValue(), true);
                        }
                        oon1.H("Unknown VVC level string: ".concat(str5));
                        return jwgVar;
                    } catch (NumberFormatException unused7) {
                        ktd.r("Ignoring malformed VVC codec string: ", str);
                        return null;
                    }
            }
        }
        return null;
    }
}
