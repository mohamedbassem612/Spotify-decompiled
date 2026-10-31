package p;

import android.media.MediaCodecInfo;
import android.os.Build;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class hkh0 {
    public static final HashMap a = new HashMap();

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayList.size() == 1 && ((bkh0) arrayList.get(0)).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(bkh0.i("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false));
            }
            Collections.sort(arrayList, new yxh(new swg0((byte) 4), (byte) 1));
        }
        if (Build.VERSION.SDK_INT >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((bkh0) arrayList.get(0)).a)) {
            return;
        }
        arrayList.add((bkh0) arrayList.remove(0));
    }

    public static MediaCodecInfo.CodecProfileLevel b(int i, int i2) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i;
        codecProfileLevel.level = i2;
        return codecProfileLevel;
    }

    public static String c(ie30 ie30Var) {
        jwg jwgVarE;
        String str = ie30Var.p;
        if ("audio/eac3-joc".equals(str)) {
            if (Objects.equals(Build.MANUFACTURER, "Google")) {
                return null;
            }
            return "audio/eac3";
        }
        if ("audio/vnd.dts.hd".equals(str) || "audio/vnd.dts.uhd;profile=p2".equals(str)) {
            return "audio/vnd.dts";
        }
        if ("video/dolby-vision".equals(str) && (jwgVarE = kwg.e(ie30Var)) != null && jwgVarE.d()) {
            int iC = jwgVarE.c();
            if (iC == 16 || iC == 256) {
                return "video/hevc";
            }
            if (iC == 512) {
                return "video/avc";
            }
            if (iC == 1024) {
                x8h x8hVar = ie30Var.H;
                if (x8hVar != null && x8hVar.c == 6 && x8hVar.b == 1) {
                    return null;
                }
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str)) {
            return "video/hevc";
        }
        return null;
    }

    public static String d(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    public static bkh0 e(String str) {
        List listF = f(str, false, false);
        if (listF.isEmpty()) {
            return null;
        }
        return (bkh0) listF.get(0);
    }

    public static synchronized List f(String str, boolean z, boolean z2) {
        try {
            fkh0 fkh0Var = new fkh0(str, z, z2);
            HashMap map = a;
            List list = (List) map.get(fkh0Var);
            if (list != null) {
                return list;
            }
            ArrayList arrayListG = g(fkh0Var, new sw9(z, z2, str.equals("video/mv-hevc")));
            if (z) {
                arrayListG.isEmpty();
            }
            a(str, arrayListG);
            b380 b380VarP = b380.p(arrayListG);
            map.put(fkh0Var, b380VarP);
            return b380VarP;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static ArrayList g(fkh0 fkh0Var, sw9 sw9Var) throws MediaCodecUtil$DecoderQueryException {
        String strD;
        String str;
        String str2;
        try {
            ArrayList arrayList = new ArrayList();
            String str3 = fkh0Var.a;
            boolean z = fkh0Var.b;
            int iX = sw9Var.x();
            for (int i = 0; i < iX; i++) {
                MediaCodecInfo mediaCodecInfoY = sw9Var.y(i);
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 29 || !mediaCodecInfoY.isAlias()) {
                    String name = mediaCodecInfoY.getName();
                    if (!mediaCodecInfoY.isEncoder() && (strD = d(mediaCodecInfoY, name, str3)) != null) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoY.getCapabilitiesForType(strD);
                            boolean zC = sw9.C("tunneled-playback", capabilitiesForType);
                            boolean zB = sw9.B("tunneled-playback", capabilitiesForType);
                            boolean z2 = fkh0Var.c;
                            if ((z2 || !zB) && (!z2 || zC)) {
                                boolean zC2 = sw9.C("secure-playback", capabilitiesForType);
                                boolean zB2 = sw9.B("secure-playback", capabilitiesForType);
                                if ((z || !zB2) && (!z || zC2)) {
                                    boolean zIsVendor = true;
                                    boolean zIsHardwareAccelerated = i2 >= 29 ? mediaCodecInfoY.isHardwareAccelerated() : !i(mediaCodecInfoY, str3);
                                    try {
                                        boolean zI = i(mediaCodecInfoY, str3);
                                        if (i2 >= 29) {
                                            zIsVendor = mediaCodecInfoY.isVendor();
                                        } else {
                                            String strW = eth.W(mediaCodecInfoY.getName());
                                            if (strW.startsWith("omx.google.") || strW.startsWith("c2.android.") || strW.startsWith("c2.google.")) {
                                                zIsVendor = false;
                                            }
                                        }
                                        if (z != zC2) {
                                            continue;
                                        } else {
                                            str = name;
                                            str2 = strD;
                                            try {
                                                arrayList.add(bkh0.i(str, str3, str2, capabilitiesForType, zIsHardwareAccelerated, zI, zIsVendor));
                                            } catch (Exception e) {
                                                e = e;
                                                oon1.v("Failed to query codec " + str + " (" + str2 + ")");
                                                throw e;
                                            }
                                        }
                                    } catch (Exception e2) {
                                        e = e2;
                                        str = name;
                                        str2 = strD;
                                    }
                                }
                            }
                        } catch (Exception e3) {
                            e = e3;
                            str = name;
                            str2 = strD;
                        }
                    }
                }
            }
            return arrayList;
        } catch (Exception e4) {
            throw new MediaCodecUtil$DecoderQueryException("Failed to query underlying media codecs", e4);
        }
    }

    public static bg11 h(ie30 ie30Var, boolean z, boolean z2) {
        Iterable iterableB;
        c9r c9rVar = c9r.d;
        List listB = c9rVar.b(ie30Var.p, z, z2);
        String strC = c(ie30Var);
        if (strC == null) {
            w280 w280Var = b380.b;
            iterableB = bg11.e;
        } else {
            iterableB = c9rVar.b(strC, z, z2);
        }
        v280 v280VarM = b380.m();
        v280VarM.e(listB);
        v280VarM.e(iterableB);
        return v280VarM.g();
    }

    public static boolean i(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (asj0.k(str)) {
            return true;
        }
        String strW = eth.W(mediaCodecInfo.getName());
        if (strW.startsWith("arc.")) {
            return false;
        }
        if (strW.startsWith("omx.google.") || strW.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strW.startsWith("omx.sec.") && strW.contains(".sw.")) || strW.equals("omx.qcom.video.decoder.hevcswvdec") || strW.startsWith("c2.android.") || strW.startsWith("c2.google.")) {
            return true;
        }
        return (strW.startsWith("omx.") || strW.startsWith("c2.")) ? false : true;
    }
}
