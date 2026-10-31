package p;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.util.Size;
import androidx.car.app.model.Alert;
import androidx.media3.transformer.ExportException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class twr implements gwg {
    public final Context a;
    public final pkj1 b;
    public final boolean c;

    public twr(oi oiVar) {
        this.a = (Context) oiVar.c;
        this.b = (pkj1) oiVar.d;
        this.c = oiVar.b;
    }

    public static ExportException d(String str, ie30 ie30Var) {
        return ExportException.c(new IllegalArgumentException(str), 4003, new m3c(ie30Var.toString(), asj0.o(ie30Var.f66p), (String) null, false));
    }

    public static ExportException f(ie30 ie30Var, boolean z) {
        String str;
        x8h x8hVar = ie30Var.H;
        if (z && x8h.h(x8hVar)) {
            str = "No MIME type is supported by both encoder and muxer. Requested HDR colorInfo: " + x8hVar;
        } else {
            str = "No MIME type is supported by both encoder and muxer.";
        }
        return ExportException.c(new IllegalArgumentException(str), 4003, new m3c(ie30Var.toString(), z, (String) null, false));
    }

    public static b380 g(b380 b380Var, rwr rwrVar) {
        ArrayList arrayList = new ArrayList(b380Var.size());
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < b380Var.size(); i2++) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) b380Var.get(i2);
            int iA = rwrVar.a(mediaCodecInfo);
            if (iA != Integer.MAX_VALUE) {
                if (iA < i) {
                    arrayList.clear();
                    arrayList.add(mediaCodecInfo);
                    i = iA;
                } else if (iA == i) {
                    arrayList.add(mediaCodecInfo);
                }
            }
        }
        return b380.p(arrayList);
    }

    public final boolean a() {
        return !this.b.equals(pkj1.h);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.transformer.ExportException */
    public final fmr b(ie30 ie30Var, LogSessionId logSessionId) throws ExportException {
        iir iirVar;
        if (ie30Var.k == -1) {
            ge30 ge30VarA = ie30Var.a();
            ge30VarA.i = 131072;
            ie30Var = new ie30(ge30VarA);
        }
        String str = ie30Var.f66p;
        if (str == null) {
            throw f(ie30Var, false);
        }
        MediaFormat mediaFormatO = x74.o(ie30Var);
        b380 b380VarE = abx.e(str);
        if (b380VarE.isEmpty()) {
            throw d("No audio media codec found", ie30Var);
        }
        MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) b380VarE.get(0);
        int i = ie30Var.L;
        if (b380VarE.isEmpty()) {
            iirVar = null;
        } else {
            ArrayList arrayList = new ArrayList(b380VarE.size());
            int i2 = Integer.MAX_VALUE;
            for (int i3 = 0; i3 < b380VarE.size(); i3++) {
                MediaCodecInfo mediaCodecInfo2 = (MediaCodecInfo) b380VarE.get(i3);
                int iAbs = Math.abs(abx.c(mediaCodecInfo2, str, i) - i);
                if (iAbs != Integer.MAX_VALUE) {
                    if (iAbs < i2) {
                        arrayList.clear();
                        arrayList.add(mediaCodecInfo2);
                        i2 = iAbs;
                    } else if (iAbs == i2) {
                        arrayList.add(mediaCodecInfo2);
                    }
                }
            }
            MediaCodecInfo mediaCodecInfo3 = (MediaCodecInfo) b380.p(arrayList).get(0);
            int iC = abx.c(mediaCodecInfo3, str, i);
            ge30 ge30VarA2 = ie30Var.a();
            ge30VarA2.K = iC;
            iirVar = new iir(mediaCodecInfo3, new ie30(ge30VarA2), (byte) 7);
        }
        if (iirVar != null) {
            mediaCodecInfo = (MediaCodecInfo) iirVar.b;
            ie30Var = (ie30) iirVar.c;
            mediaFormatO = x74.o(ie30Var);
        }
        ie30 ie30Var2 = ie30Var;
        MediaFormat mediaFormat = mediaFormatO;
        if (Build.VERSION.SDK_INT >= 35 && logSessionId != null) {
            mb4.I(mediaFormat, logSessionId);
        }
        return new fmr(this.a, ie30Var2, mediaFormat, mediaCodecInfo.getName(), false, null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.transformer.ExportException */
    /* JADX WARN: Code duplicated, block: B:102:0x0260  */
    /* JADX WARN: Code duplicated, block: B:103:0x0262  */
    /* JADX WARN: Code duplicated, block: B:106:0x026f  */
    /* JADX WARN: Code duplicated, block: B:152:0x032b  */
    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:53:0x012a  */
    /* JADX WARN: Code duplicated, block: B:56:0x013c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0173  */
    /* JADX WARN: Code duplicated, block: B:93:0x023d  */
    public final fmr c(ie30 ie30Var, LogSessionId logSessionId) throws ExportException {
        ge30 ge30VarA;
        b380 b380VarG;
        b380 b380VarG2;
        int i;
        int i2;
        swr swrVar;
        String strC;
        int iB;
        boolean z;
        ie30 ie30Var2 = ie30Var;
        if (ie30Var2.B == -1.0f || (Build.VERSION.SDK_INT < 30 && Build.DEVICE.equals("joyeuse"))) {
            ge30 ge30VarA2 = ie30Var2.a();
            ge30VarA2.c(30.0f);
            ie30Var2 = new ie30(ge30VarA2);
        }
        final int i3 = ie30Var2.x;
        final int i4 = ie30Var2.w;
        final String str = ie30Var2.f66p;
        x8h x8hVar = ie30Var2.H;
        if (str == null) {
            throw f(ie30Var2, true);
        }
        final byte b = 0;
        dm5.m(i4 != -1);
        dm5.m(i3 != -1);
        dm5.m(ie30Var2.C == 0);
        pkj1 pkj1Var = this.b;
        int i5 = pkj1Var.c;
        int i6 = pkj1Var.b;
        int i7 = ie30Var2.i;
        AbstractCollection abstractCollectionE = abx.e(str);
        AbstractCollection abstractCollectionO = b380.o(hr80.o(abstractCollectionE, new omv0() { // from class: p.yax
            /* JADX WARN: Code duplicated, block: B:18:0x004e  */
            public final boolean apply(Object obj) {
                byte b2 = b;
                boolean zX = false;
                String str2 = str;
                switch (b2) {
                    case 0:
                        MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) obj;
                        q36 q36Var = abx.a;
                        int i8 = Build.VERSION.SDK_INT;
                        if (i8 >= 29) {
                            return x74.W(mediaCodecInfo);
                        }
                        if (i8 >= 29) {
                            zX = x74.X(mediaCodecInfo);
                        } else if (asj0.k(str2)) {
                            zX = true;
                        } else {
                            String strW = eth.W(mediaCodecInfo.getName());
                            if (!strW.startsWith("arc.") && (strW.startsWith("omx.google.") || strW.startsWith("omx.ffmpeg.") || ((strW.startsWith("omx.sec.") && strW.contains(".sw.")) || strW.equals("omx.qcom.video.decoder.hevcswvdec") || strW.startsWith("c2.android.") || strW.startsWith("c2.google.") || (!strW.startsWith("omx.") && !strW.startsWith("c2."))))) {
                                zX = true;
                            }
                        }
                        return !zX;
                    default:
                        String str3 = (String) ((Map.Entry) obj).getKey();
                        StringBuilder sb = new StringBuilder();
                        sb.append(str3);
                        sb.append(".");
                        return str2.startsWith(sb.toString()) || str2.equals(str3);
                }
            }
        }));
        if (!abstractCollectionO.isEmpty()) {
            abstractCollectionE = abstractCollectionO;
        }
        if (abstractCollectionE.isEmpty()) {
            swrVar = null;
        } else {
            b380 b380VarP = (Build.VERSION.SDK_INT < 33 || !x8h.h(x8hVar)) ? b380.p(abstractCollectionE) : g(abstractCollectionE, new uk4(str, x8hVar, (byte) 13));
            if (b380VarP.isEmpty()) {
                swrVar = null;
            } else {
                final boolean z2 = this.c;
                b380 b380VarG3 = g(b380VarP, new rwr() { // from class: p.qwr
                    public final int a(MediaCodecInfo mediaCodecInfo) {
                        String str2 = str;
                        int i8 = i4;
                        int i9 = i3;
                        Size sizeG = abx.g(mediaCodecInfo, str2, i8, i9);
                        if (sizeG == null) {
                            return Alert.DURATION_SHOW_INDEFINITELY;
                        }
                        if (z2) {
                            return Math.abs((i8 * i9) - (sizeG.getHeight() * sizeG.getWidth()));
                        }
                        if (sizeG.getWidth() == i8 && sizeG.getHeight() == i9) {
                            return 0;
                        }
                        return Alert.DURATION_SHOW_INDEFINITELY;
                    }
                });
                if (b380VarG3.isEmpty()) {
                    swrVar = null;
                } else {
                    Size sizeG = abx.g((MediaCodecInfo) b380VarG3.get(0), str, i4, i3);
                    sizeG.getClass();
                    int width = sizeG.getWidth();
                    int height = sizeG.getHeight();
                    ge30 ge30VarA3 = ie30Var2.a();
                    ge30VarA3.v = width;
                    ge30VarA3.w = height;
                    ie30 ie30Var3 = new ie30(ge30VarA3);
                    int i8 = pkj1Var.a;
                    int i9 = pkj1Var.g;
                    int i10 = pkj1Var.f;
                    int i11 = pkj1Var.e;
                    float f = pkj1Var.d;
                    if (i8 != -1) {
                        oon1.s("Using bitrate from user-provided VideoEncoderSettings");
                        i7 = i8;
                    } else {
                        if (i7 != -1) {
                            oon1.s("Using bitrate from requested Format");
                        } else {
                            oon1.s("Using Kush Gauge bitrate");
                            i7 = (int) (((double) (width * height * ie30Var2.B)) * 0.07d * 2.0d);
                        }
                        ge30VarA = ie30Var3.a();
                        b380VarG = g(b380VarG3, new pwr(str, i7, (byte) 0));
                        if (b380VarG.isEmpty()) {
                            swrVar = null;
                        } else {
                            b380VarG2 = g(b380VarG, new hfr(str, (byte) 2));
                            if (b380VarG2.isEmpty()) {
                                swrVar = null;
                            } else {
                                MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) b380VarG2.get(0);
                                MediaCodecInfo.VideoCapabilities videoCapabilities = mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities();
                                videoCapabilities.getClass();
                                int iIntValue = ((Integer) videoCapabilities.getBitrateRange().clamp(Integer.valueOf(i7))).intValue();
                                ge30VarA.i = iIntValue;
                                if (i6 != -1 || i5 == -1 || i5 > abx.b(mediaCodecInfo, str, i6)) {
                                    i = -1;
                                    i2 = -1;
                                } else {
                                    i2 = i5;
                                    i = i6;
                                }
                                swrVar = new swr(mediaCodecInfo, new ie30(ge30VarA), new pkj1(iIntValue, i, i2, f, i11, i10, i9));
                            }
                        }
                    }
                    ge30VarA = ie30Var3.a();
                    b380VarG = g(b380VarG3, new pwr(str, i7, (byte) 0));
                    if (b380VarG.isEmpty()) {
                        swrVar = null;
                    } else {
                        b380VarG2 = g(b380VarG, new hfr(str, (byte) 2));
                        if (b380VarG2.isEmpty()) {
                            swrVar = null;
                        } else {
                            MediaCodecInfo mediaCodecInfo2 = (MediaCodecInfo) b380VarG2.get(0);
                            MediaCodecInfo.VideoCapabilities videoCapabilities2 = mediaCodecInfo2.getCapabilitiesForType(str).getVideoCapabilities();
                            videoCapabilities2.getClass();
                            int iIntValue2 = ((Integer) videoCapabilities2.getBitrateRange().clamp(Integer.valueOf(i7))).intValue();
                            ge30VarA.i = iIntValue2;
                            if (i6 != -1) {
                                i = -1;
                                i2 = -1;
                            } else {
                                i = -1;
                                i2 = -1;
                            }
                            swrVar = new swr(mediaCodecInfo2, new ie30(ge30VarA), new pkj1(iIntValue2, i, i2, f, i11, i10, i9));
                        }
                    }
                }
            }
        }
        if (swrVar == null) {
            throw d("The requested video encoding format is not supported.", ie30Var2);
        }
        MediaCodecInfo mediaCodecInfo3 = (MediaCodecInfo) ((iir) swrVar).b;
        ie30 ie30Var4 = (ie30) ((iir) swrVar).c;
        pkj1 pkj1Var2 = swrVar.d;
        String str2 = ie30Var4.f66p;
        str2.getClass();
        MediaFormat mediaFormatO = x74.o(ie30Var4);
        int i12 = pkj1Var2.c;
        mediaFormatO.setInteger("bitrate-mode", 1);
        mediaFormatO.setInteger("frame-rate", Math.round(ie30Var4.B));
        int i13 = pkj1Var2.b;
        if (i13 != -1 && i12 != -1) {
            mediaFormatO.setInteger("profile", i13);
            mediaFormatO.setInteger("level", i12);
        } else if (x8h.h(x8hVar)) {
            x8hVar.getClass();
            mediaFormatO.setInteger("profile", ((Integer) abx.d(x8hVar.c, str2).get(0)).intValue());
        }
        if (str2.equals("video/avc")) {
            int i14 = Build.VERSION.SDK_INT;
            int iIntValue3 = 8;
            if (i14 >= 29) {
                if (x8hVar != null) {
                    bg11 bg11VarD = abx.d(x8hVar.c, "video/avc");
                    if (!bg11VarD.isEmpty()) {
                        iIntValue3 = ((Integer) bg11VarD.get(0)).intValue();
                    }
                }
                int iB2 = abx.b(mediaCodecInfo3, "video/avc", iIntValue3);
                if (iB2 != -1) {
                    mediaFormatO.setInteger("profile", iIntValue3);
                    if (!mediaFormatO.containsKey("level")) {
                        mediaFormatO.setInteger("level", iB2);
                    }
                }
            } else if (i14 < 26) {
                iB = abx.b(mediaCodecInfo3, "video/avc", 1);
                if (iB != -1) {
                    z = true;
                } else {
                    z = false;
                }
                dm5.y(z);
                mediaFormatO.setInteger("profile", 1);
                if (!mediaFormatO.containsKey("level")) {
                    mediaFormatO.setInteger("level", iB);
                }
            } else {
                if (i14 == 27) {
                    String str3 = Build.DEVICE;
                    if (str3.equals("ASUS_X00T_3") || str3.equals("TC77")) {
                        iB = abx.b(mediaCodecInfo3, "video/avc", 1);
                        if (iB != -1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        dm5.y(z);
                        mediaFormatO.setInteger("profile", 1);
                        if (!mediaFormatO.containsKey("level")) {
                            mediaFormatO.setInteger("level", iB);
                        }
                    }
                }
                int iB3 = abx.b(mediaCodecInfo3, "video/avc", 8);
                if (iB3 != -1) {
                    mediaFormatO.setInteger("profile", 8);
                    if (!mediaFormatO.containsKey("level")) {
                        mediaFormatO.setInteger("level", iB3);
                    }
                    mediaFormatO.setInteger("latency", 1);
                }
            }
        }
        int i15 = Build.VERSION.SDK_INT;
        if (i15 < 31 || !x8h.h(x8hVar)) {
            mediaFormatO.setInteger("color-format", 2130708361);
        } else {
            if (i15 < 33 || !b380.p(bmq0.f(mediaCodecInfo3.getCapabilitiesForType(str2).colorFormats)).contains(2130750114)) {
                throw d("Encoding HDR is not supported on this device.", ie30Var2);
            }
            mediaFormatO.setInteger("color-format", 2130750114);
        }
        float f2 = pkj1Var2.d;
        if (i15 >= 25) {
            mediaFormatO.setFloat("i-frame-interval", f2);
        } else {
            mediaFormatO.setInteger("i-frame-interval", (f2 <= 0.0f || f2 > 1.0f) ? (int) Math.floor(f2) : 1);
        }
        if (i15 >= 25) {
            mediaFormatO.setInteger("priority", 1);
            if (i15 == 26) {
                mediaFormatO.setInteger("operating-rate", 30);
            } else if (i15 < 31 || i15 > 34) {
                mediaFormatO.setInteger("operating-rate", Alert.DURATION_SHOW_INDEFINITELY);
            } else {
                String str4 = Build.SOC_MODEL;
                if (str4.equals("SM8550") || str4.equals("SM7450") || str4.equals("SM6450") || str4.equals("SC9863A") || str4.equals("T612") || str4.equals("T606") || str4.equals("T603")) {
                    mediaFormatO.setInteger("operating-rate", 1000);
                } else {
                    mediaFormatO.setInteger("operating-rate", Alert.DURATION_SHOW_INDEFINITELY);
                }
            }
        }
        if (i15 >= 35) {
            mediaFormatO.setInteger("importance", Math.max(0, 2000));
            if (logSessionId != null) {
                mb4.I(mediaFormatO, logSessionId);
            }
        }
        int i16 = pkj1Var2.e;
        if (i15 >= 29 && i16 != -1) {
            mediaFormatO.setInteger("max-bframes", i16);
        }
        int i17 = pkj1Var2.f;
        int i18 = pkj1Var2.g;
        if (i15 >= 29 && i17 >= 0) {
            if (i17 == 0) {
                strC = "none";
            } else if (i18 > 0) {
                Locale locale = Locale.ROOT;
                strC = cy30.i(i17, "android.generic.", i18, "+");
            } else {
                Locale locale2 = Locale.ROOT;
                strC = f4i1.c(i17, "android.generic.");
            }
            mediaFormatO.setString("ts-schema", strC);
        }
        return new fmr(this.a, ie30Var4, mediaFormatO, mediaCodecInfo3.getName(), false, null);
    }

    public final boolean e() {
        return !true;
    }
}
