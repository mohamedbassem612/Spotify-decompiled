package p;

import android.content.Context;
import android.content.Intent;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Trace;
import android.view.Surface;
import com.comscore.streaming.AdvertisementType;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mka implements c290, vjm1, Function, ypb0, egp0, av30, dab1, BiPredicate, xjh0 {
    public final /* synthetic */ byte a;

    public mka(daq daqVar, teq teqVar) {
        this.a = (byte) 5;
    }

    public static final boolean a(Context context) {
        Pattern pattern = j0u.b;
        return context.getPackageManager().hasSystemFeature("org.chromium.arc.device_management");
    }

    public static final boolean b() {
        Pattern pattern = j0u.b;
        String str = Build.DEVICE;
        return str != null && j0u.b.matcher(str).matches();
    }

    public static String c(String str) {
        Set set = s4b1.f;
        String strZ = uic.y(str).z();
        strZ.getClass();
        return strZ;
    }

    public static dcx d(String str) {
        Object next;
        Iterator it = l().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u890.j(((dcx) next).a, str));
        dcx dcxVar = (dcx) next;
        return dcxVar == null ? new pbx(str) : dcxVar;
    }

    public static MediaCodec e(g2z g2zVar) throws IOException {
        String str = ((bkh0) g2zVar.a).a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return mediaCodecCreateByCodecName;
    }

    public static heg f(String str, boolean z) {
        String strW;
        int iV0 = ihc1.v0(str, '`', 0, 6);
        if (iV0 == -1) {
            iV0 = str.length();
        }
        int iB0 = ihc1.B0(str, "/", iV0, 4);
        String str2 = "";
        if (iB0 == -1) {
            strW = nhc1.W(str, "`", "");
        } else {
            String strReplace = str.substring(0, iB0).replace('/', '.');
            strW = nhc1.W(str.substring(iB0 + 1), "`", "");
            str2 = strReplace;
        }
        return new heg(new kf30(str2), new kf30(strW), z);
    }

    public static Intent g(q19 q19Var) {
        q0s0 q0s0Var = q19Var.c;
        if (q0s0Var == null) {
            return null;
        }
        Intent intent = new Intent();
        intent.putExtra("error", jup0.i(q0s0Var.a));
        intent.putExtra("error_message", q0s0Var.b);
        return intent;
    }

    public static String k() {
        return UUID.randomUUID().toString();
    }

    public static List l() {
        return p7h.M(new dcx[]{rbx.b, sbx.b, vbx.b, ybx.b, acx.b, ccx.b, ubx.b, xbx.b, tbx.b, wbx.b, zbx.b, bcx.b, qbx.b});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r26v2, types: [java.lang.Throwable] */
    public static List m(int i, int i2, ArrayList arrayList, blb0 blb0Var) {
        mmr0 mmr0Var;
        float fFloatValue;
        float f = blb0Var.c;
        float f2 = blb0Var.b;
        if (i == 0 || i2 == 0) {
            return z6x.a;
        }
        Float fValueOf = Float.valueOf(0.0f);
        int size = arrayList.size();
        List list = null;
        int i3 = 2;
        int i4 = 1;
        if (size == 1) {
            mmr0Var = new mmr0(new Float[]{Float.valueOf(f2)}, new Float[]{Float.valueOf(f)});
        } else if (size == 2) {
            mmr0Var = new mmr0(new Float[]{Float.valueOf(-f2), Float.valueOf(f2)}, new Float[]{Float.valueOf(-f), Float.valueOf(f)});
        } else {
            if (size != 3) {
                bhn0.w();
                return null;
            }
            mmr0Var = new mmr0(new Float[]{Float.valueOf(-f2), fValueOf, Float.valueOf(f2)}, new Float[]{Float.valueOf(-f), fValueOf, Float.valueOf(f)});
        }
        Float[] fArr = (Float[]) mmr0Var.a;
        Float[] fArr2 = (Float[]) mmr0Var.b;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i6 = i5 + 1;
            if (i5 < 0) {
                ?? r26 = list;
                p7h.T();
                throw r26;
            }
            int iC = l1d.C(((zwh0) next).c);
            if (iC == 0 || iC == i4) {
                fFloatValue = fArr[i5].floatValue();
            } else {
                fFloatValue = iC != i3 ? 0.0f : fArr2[i5].floatValue();
            }
            double radians = Math.toRadians(fFloatValue);
            double dAbs = Math.abs(Math.cos(radians));
            double dAbs2 = Math.abs(Math.sin(radians));
            List list2 = list;
            double d = i;
            Iterator it2 = it;
            double d2 = i2;
            float fMin = Math.min(i / Integer.valueOf((int) ((d2 * dAbs2) + (d * dAbs))).intValue(), i2 / Integer.valueOf((int) ((d2 * dAbs) + (d * dAbs2))).intValue());
            if (Float.isNaN(fMin) || Float.isInfinite(fMin)) {
                fMin = 1.0f;
            }
            arrayList2.add(new zoh0(fFloatValue, fMin));
            it = it2;
            list = list2;
            i5 = i6;
            i3 = 2;
            i4 = 1;
        }
        List list3 = list;
        Iterator it3 = arrayList2.iterator();
        if (!it3.hasNext()) {
            hhg1.k();
            return list3;
        }
        Object next2 = it3.next();
        if (it3.hasNext()) {
            float f3 = ((zoh0) next2).b;
            do {
                Object next3 = it3.next();
                float f4 = ((zoh0) next3).b;
                if (Float.compare(f3, f4) > 0) {
                    next2 = next3;
                    f3 = f4;
                }
            } while (it3.hasNext());
        }
        float f5 = ((zoh0) next2).b;
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            arrayList3.add(new zoh0(((zoh0) it4.next()).a, f5));
        }
        return arrayList3;
    }

    public static heg n(kf30 kf30Var) {
        return new heg(kf30Var.b(), kf30Var.a.g());
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 12:
                return nn40.b.get(obj);
            default:
                return w801.b.get(obj);
        }
    }

    public Object convert(int i) {
        Object obj = null;
        switch (this.a) {
            case 4:
                rl10 rl10VarA = rl10.a(i);
                return rl10VarA == null ? rl10.h : rl10VarA;
            case 24:
                switch (i) {
                    case 0:
                        obj = p751.ENTITY_TYPE_UNSPECIFIED;
                        break;
                    case 1:
                        obj = p751.ENTITY_TYPE_ARTIST;
                        break;
                    case 2:
                        obj = p751.ENTITY_TYPE_TRACK;
                        break;
                    case 3:
                        obj = p751.ENTITY_TYPE_ALBUM;
                        break;
                    case 4:
                        obj = p751.ENTITY_TYPE_PODCAST;
                        break;
                    case 5:
                        obj = p751.ENTITY_TYPE_EPISODE;
                        break;
                    case 6:
                        obj = p751.ENTITY_TYPE_AUDIOBOOK;
                        break;
                    case 7:
                        obj = p751.ENTITY_TYPE_PLAYLIST;
                        break;
                }
                return obj == null ? p751.UNRECOGNIZED : obj;
            default:
                if (i == 0) {
                    obj = dki1.BIO_VIOLATION_UNSPECIFIED;
                } else if (i == 1) {
                    obj = dki1.BIO_VIOLATION_TOO_LONG;
                } else if (i == 2) {
                    obj = dki1.BIO_VIOLATION_CONTAINS_EMAIL;
                } else if (i == 3) {
                    obj = dki1.BIO_VIOLATION_CONTAINS_PHONE;
                } else if (i == 4) {
                    obj = dki1.BIO_VIOLATION_MODERATION_BLOCKED;
                }
                return obj == null ? dki1.UNRECOGNIZED : obj;
        }
    }

    public Object create() {
        jyo1 jyo1Var = rd70.c.a;
        if (!u890.j(((qd70) jyo1Var).c, "hubs/placeholder")) {
            jyo1 pd70Var = new pd70(jyo1Var);
            ((pd70) pd70Var).c = "hubs/placeholder";
            jyo1Var = pd70Var;
        }
        return jyo1Var.f();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    public StackTraceElement[] h(StackTraceElement[] stackTraceElementArr) {
        int i;
        HashMap map = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            Integer num = (Integer) map.get(stackTraceElement);
            if (num == null) {
                stackTraceElementArr2[i3] = stackTraceElementArr[i2];
                i3++;
                i4 = 1;
                i = i2;
                break;
                break;
            }
            int iIntValue = num.intValue();
            int i5 = i2 - iIntValue;
            if (i2 + i5 <= stackTraceElementArr.length) {
                int i6 = 0;
                while (true) {
                    if (i6 >= i5) {
                        int iIntValue2 = i2 - num.intValue();
                        if (i4 < 10) {
                            System.arraycopy(stackTraceElementArr, i2, stackTraceElementArr2, i3, iIntValue2);
                            i3 += iIntValue2;
                            i4++;
                        }
                        i = (iIntValue2 - 1) + i2;
                        break;
                    }
                    if (!stackTraceElementArr[iIntValue + i6].equals(stackTraceElementArr[i2 + i6])) {
                        stackTraceElementArr2[i3] = stackTraceElementArr[i2];
                        i3++;
                        i4 = 1;
                        i = i2;
                        break;
                        break;
                    }
                    i6++;
                }
            } else {
                stackTraceElementArr2[i3] = stackTraceElementArr[i2];
                i3++;
                i4 = 1;
                i = i2;
                break;
            }
            map.put(stackTraceElement, Integer.valueOf(i2));
            i2 = i + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i3];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i3);
        return i3 < stackTraceElementArr.length ? stackTraceElementArr3 : stackTraceElementArr;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    public yjh0 i(g2z g2zVar) throws Throwable {
        MediaCodec mediaCodecE = null;
        try {
            mediaCodecE = e(g2zVar);
            Trace.beginSection("configureCodec");
            Surface surface = (Surface) g2zVar.d;
            mediaCodecE.configure((MediaFormat) g2zVar.b, surface, (MediaCrypto) g2zVar.e, (surface == null && ((bkh0) g2zVar.a).h && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodecE.start();
            Trace.endSection();
            return new vdf0(mediaCodecE, (vdf0) g2zVar.f);
        } catch (IOException e) {
            e = e;
            if (mediaCodecE != null) {
                mediaCodecE.release();
            }
            throw e;
        } catch (RuntimeException e2) {
            e = e2;
            if (mediaCodecE != null) {
                mediaCodecE.release();
            }
            throw e;
        }
    }

    public qwa j(String str, int i, int i2, int i3, Map map) {
        int i4;
        qwa qwaVar;
        int i5;
        int i6;
        if (str.isEmpty()) {
            hhg1.n("Found empty contents");
            return null;
        }
        if (i != 6) {
            hhg1.n("Can only encode DATA_MATRIX, but got ".concat(l1d.D(i)));
            return null;
        }
        EnumMap enumMap = (EnumMap) map;
        acd1 acd1Var = (acd1) enumMap.get(qax.c);
        if (acd1Var == null) {
            acd1Var = acd1.a;
        }
        if (enumMap.get(qax.d) != null) {
            bhn0.d();
            return null;
        }
        if (enumMap.get(qax.e) != null) {
            bhn0.d();
            return null;
        }
        int i7 = 0;
        int i8 = 1;
        tax[] taxVarArr = {new a4x0((byte) 27), new vhc((byte) 0), new g4e1((byte) 0), new g4e1((byte) 1), new l7c((byte) 8), new hgx0((byte) 29)};
        xax xaxVar = new xax(str);
        xaxVar.b = acd1Var;
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            xaxVar.d((char) 236);
            xaxVar.g = (byte) 2;
            xaxVar.d += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            xaxVar.d((char) 237);
            xaxVar.g = (byte) 2;
            xaxVar.d += 7;
        }
        int i9 = 0;
        while (xaxVar.b()) {
            taxVarArr[i9].c(xaxVar);
            int i10 = xaxVar.e;
            if (i10 >= 0) {
                xaxVar.e = -1;
                i9 = i10;
            }
        }
        StringBuilder sb = xaxVar.c;
        int length = sb.length();
        xaxVar.c(sb.length());
        short s = xaxVar.f.b;
        if (length < s && i9 != 0 && i9 != 5 && i9 != 4) {
            xaxVar.d((char) 254);
        }
        if (sb.length() < s) {
            sb.append((char) 129);
        }
        while (sb.length() < s) {
            int length2 = ((sb.length() + 1) * 149) % 253;
            int i11 = length2 + 130;
            if (i11 > 254) {
                i11 = length2 - 124;
            }
            sb.append((char) i11);
        }
        String string = sb.toString();
        zbd1 zbd1VarE = zbd1.e(string.length(), acd1Var);
        byte b = zbd1VarE.e;
        byte b2 = zbd1VarE.d;
        int[] iArr = ngz.a;
        int length3 = string.length();
        short s2 = zbd1VarE.b;
        short s3 = zbd1VarE.c;
        if (length3 != s2) {
            hhg1.n("The number of codewords does not match the selected symbol");
            return null;
        }
        StringBuilder sb2 = new StringBuilder(s2 + s3);
        sb2.append(string);
        int iC = zbd1VarE.c();
        if (iC == 1) {
            sb2.append(ngz.a(s3, string));
        } else {
            sb2.setLength(sb2.capacity());
            int[] iArr2 = new int[iC];
            int[] iArr3 = new int[iC];
            int[] iArr4 = new int[iC];
            int i12 = 0;
            while (i12 < iC) {
                int i13 = i12 + 1;
                iArr2[i12] = zbd1VarE.a(i13);
                iArr3[i12] = zbd1VarE.h;
                iArr4[i12] = 0;
                if (i12 > 0) {
                    iArr4[i12] = iArr4[i12 - 1] + iArr2[i12];
                }
                i12 = i13;
            }
            for (int i14 = 0; i14 < iC; i14++) {
                StringBuilder sb3 = new StringBuilder(iArr2[i14]);
                for (int i15 = i14; i15 < s2; i15 += iC) {
                    sb3.append(string.charAt(i15));
                }
                String strA = ngz.a(iArr3[i14], sb3.toString());
                int i16 = i14;
                int i17 = 0;
                while (i16 < iArr3[i14] * iC) {
                    sb2.setCharAt(s2 + i16, strA.charAt(i17));
                    i16 += iC;
                    i17++;
                }
            }
        }
        String string2 = sb2.toString();
        int iB = zbd1VarE.b() * b2;
        int iD = zbd1VarE.d() * b;
        w4c0 w4c0Var = new w4c0(string2, iB, iD);
        int i18 = w4c0Var.c;
        byte[] bArr = (byte[]) w4c0Var.e;
        int i19 = 0;
        int i20 = 0;
        int i21 = 4;
        while (true) {
            if (i21 == iD && i19 == 0) {
                int i22 = iD - 1;
                w4c0Var.x(i22, i7, i20, i8);
                w4c0Var.x(i22, i8, i20, 2);
                w4c0Var.x(i22, 2, i20, 3);
                w4c0Var.x(i7, iB - 2, i20, 4);
                int i23 = iB - 1;
                w4c0Var.x(i7, i23, i20, 5);
                w4c0Var.x(1, i23, i20, 6);
                w4c0Var.x(2, i23, i20, 7);
                w4c0Var.x(3, i23, i20, 8);
                i20++;
            }
            i4 = iD - 2;
            if (i21 == i4 && i19 == 0 && iB % 4 != 0) {
                w4c0Var.x(iD - 3, 0, i20, 1);
                w4c0Var.x(i4, 0, i20, 2);
                w4c0Var.x(iD - 1, 0, i20, 3);
                w4c0Var.x(0, iB - 4, i20, 4);
                w4c0Var.x(0, iB - 3, i20, 5);
                w4c0Var.x(0, iB - 2, i20, 6);
                int i24 = iB - 1;
                w4c0Var.x(0, i24, i20, 7);
                w4c0Var.x(1, i24, i20, 8);
                i20++;
            }
            if (i21 == i4 && i19 == 0 && iB % 8 == 4) {
                w4c0Var.x(iD - 3, 0, i20, 1);
                w4c0Var.x(i4, 0, i20, 2);
                w4c0Var.x(iD - 1, 0, i20, 3);
                w4c0Var.x(0, iB - 2, i20, 4);
                int i25 = iB - 1;
                w4c0Var.x(0, i25, i20, 5);
                w4c0Var.x(1, i25, i20, 6);
                w4c0Var.x(2, i25, i20, 7);
                w4c0Var.x(3, i25, i20, 8);
                i20++;
            }
            if (i21 == iD + 4 && i19 == 2 && iB % 8 == 0) {
                int i26 = iD - 1;
                w4c0Var.x(i26, 0, i20, 1);
                int i27 = iB - 1;
                w4c0Var.x(i26, i27, i20, 2);
                int i28 = iB - 3;
                w4c0Var.x(0, i28, i20, 3);
                int i29 = iB - 2;
                w4c0Var.x(0, i29, i20, 4);
                w4c0Var.x(0, i27, i20, 5);
                w4c0Var.x(1, i28, i20, 6);
                w4c0Var.x(1, i29, i20, 7);
                w4c0Var.x(1, i27, i20, 8);
                i20++;
            }
            while (true) {
                if (i21 < iD && i19 >= 0 && bArr[(i21 * i18) + i19] < 0) {
                    w4c0Var.N(i21, i19, i20);
                    i20++;
                }
                int i30 = i21 - 2;
                int i31 = i19 + 2;
                if (i30 < 0 || i31 >= iB) {
                    break;
                }
                i21 = i30;
                i19 = i31;
            }
            int i32 = i21 - 1;
            int i33 = i19 + 5;
            while (true) {
                if (i32 >= 0 && i33 < iB && bArr[(i32 * i18) + i33] < 0) {
                    w4c0Var.N(i32, i33, i20);
                    i20++;
                }
                int i34 = i32 + 2;
                int i35 = i33 - 2;
                if (i34 >= iD || i35 < 0) {
                    break;
                }
                i32 = i34;
                i33 = i35;
            }
            i21 = i32 + 5;
            i19 = i33 - 1;
            if (i21 >= iD && i19 >= iB) {
                break;
            }
            i8 = 1;
            i18 = i18;
            i7 = 0;
            zbd1VarE = zbd1VarE;
        }
        int i36 = iB - 1;
        boolean z = true;
        int i37 = iD - 1;
        if (bArr[(i37 * i18) + i36] < 0) {
            bArr[(i37 * i18) + i36] = 1;
            bArr[(i4 * i18) + (iB - 2)] = 1;
        }
        int iB2 = zbd1VarE.b() * b2;
        int iD2 = zbd1VarE.d() * b;
        pyp0 pyp0Var = new pyp0((zbd1VarE.b() * b2) + (zbd1VarE.b() << 1), (zbd1VarE.d() * b) + (zbd1VarE.d() << 1));
        int i38 = 0;
        int i39 = 0;
        while (i39 < iD2) {
            int i40 = i39 % b;
            if (i40 == 0) {
                int i41 = 0;
                int i42 = 0;
                while (i41 < (zbd1VarE.b() * b2) + (zbd1VarE.b() << 1)) {
                    pyp0Var.x(i42, i38, i41 % 2 == 0 ? z : false);
                    i42++;
                    i41++;
                    z = true;
                }
                i38++;
            }
            int i43 = 0;
            for (int i44 = 0; i44 < iB2; i44++) {
                int i45 = i44 % b2;
                if (i45 == 0) {
                    pyp0Var.x(i43, i38, true);
                    i43++;
                }
                pyp0Var.x(i43, i38, bArr[(i39 * i18) + i44] == 1);
                int i46 = i43 + 1;
                if (i45 == b2 - 1) {
                    pyp0Var.x(i46, i38, i39 % 2 == 0);
                    i43 += 2;
                } else {
                    i43 = i46;
                }
            }
            int i47 = i38 + 1;
            if (i40 == b - 1) {
                int i48 = 0;
                for (int i49 = 0; i49 < (zbd1VarE.b() * b2) + (zbd1VarE.b() << 1); i49++) {
                    pyp0Var.x(i48, i47, true);
                    i48++;
                }
                i38 += 2;
            } else {
                i38 = i47;
            }
            i39++;
            z = true;
        }
        int i50 = pyp0Var.b;
        int i51 = pyp0Var.c;
        int iMax = Math.max(AdvertisementType.OTHER, i50);
        int iMax2 = Math.max(AdvertisementType.OTHER, i51);
        int iMin = Math.min(iMax / i50, iMax2 / i51);
        int i52 = (iMax - (i50 * iMin)) / 2;
        int i53 = (iMax2 - (i51 * iMin)) / 2;
        if (200 < i51 || 200 < i50) {
            qwaVar = new qwa(i50, i51);
            i5 = 0;
            i6 = 0;
        } else {
            qwaVar = new qwa(AdvertisementType.OTHER, AdvertisementType.OTHER);
            i5 = i52;
            i6 = i53;
        }
        int[] iArr5 = qwaVar.d;
        int length4 = iArr5.length;
        for (int i54 = 0; i54 < length4; i54++) {
            iArr5[i54] = 0;
        }
        int i55 = i6;
        int i56 = 0;
        while (i56 < i51) {
            int i57 = i5;
            int i58 = 0;
            while (i58 < i50) {
                if (pyp0Var.q(i58, i56) == 1) {
                    qwaVar.d(i57, i55, iMin, iMin);
                }
                i58++;
                i57 += iMin;
            }
            i56++;
            i55 += iMin;
        }
        return qwaVar;
    }

    public boolean test(Object obj, Object obj2) {
        PlayerState playerState = (PlayerState) obj;
        PlayerState playerState2 = (PlayerState) obj2;
        bma1 bma1Var = c6b1.f;
        return u890.j(playerState.restrictions().disallowSkippingPrevReasons(), playerState2.restrictions().disallowSkippingPrevReasons()) && u890.j(playerState.restrictions().disallowSkippingNextReasons(), playerState2.restrictions().disallowSkippingNextReasons()) && c6b1.a(playerState) == c6b1.a(playerState2) && c6b1.b(playerState) == c6b1.b(playerState2);
    }
}
