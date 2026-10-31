package p;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bkh0 {
    public static final v0d1 m = zno1.u(new p58((byte) 6));
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public int j;
    public int k;
    public float l;

    public bkh0(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.e = z4;
        this.f = z5;
        this.h = z6;
        this.i = asj0.o(str2);
        this.l = -3.4028235E38f;
        this.j = -1;
        this.k = -1;
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(zoi1.g(i, widthAlignment) * widthAlignment, zoi1.g(i2, heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        double dFloor = Math.floor(d);
        if (!videoCapabilities.areSizeAndRateSupported(i3, i4, dFloor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i3, i4);
        return achievableFrameRatesFor == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0088  */
    public static bkh0 i(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        boolean z4;
        boolean z5 = codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback");
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        boolean z6 = codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback");
        if (Build.VERSION.SDK_INT < 35 || codecCapabilities == null || !codecCapabilities.isFeatureSupported("detached-surface")) {
            z4 = false;
        } else {
            Integer num = (Integer) m.get();
            if (num != null && num.intValue() <= 202604) {
                String str4 = Build.MANUFACTURER;
                if (str4.equals("Xiaomi") || str4.equals("OPPO") || str4.equals("realme") || str4.equals("motorola") || str4.equals("LENOVO") || str4.equals("Fairphone")) {
                    z4 = false;
                }
            }
            z4 = true;
        }
        return new bkh0(str, str2, str3, codecCapabilities, z, z2, z3, z5, z6, z4);
    }

    public final iar b(ie30 ie30Var, ie30 ie30Var2) {
        ie30 ie30Var3;
        ie30 ie30Var4;
        int i;
        String str = ie30Var.p;
        x8h x8hVar = ie30Var.H;
        String str2 = ie30Var2.p;
        x8h x8hVar2 = ie30Var2.H;
        int i2 = !Objects.equals(str, str2) ? 8 : 0;
        if (this.i) {
            if (ie30Var.C != ie30Var2.C) {
                i2 |= 1024;
            }
            boolean z = (ie30Var.w == ie30Var2.w && ie30Var.x == ie30Var2.x) ? false : true;
            if (!this.e && z) {
                i2 |= NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS;
            }
            if ((!x8h.g(x8hVar) || !x8h.g(x8hVar2)) && !Objects.equals(x8hVar, x8hVar2)) {
                i2 |= 2048;
            }
            HashSet hashSet = hph0.a;
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.a) && !ie30Var.d(ie30Var2)) {
                i2 |= 2;
            }
            int i3 = ie30Var.z;
            if (i3 != -1 && (i = ie30Var.A) != -1 && i3 == ie30Var2.z && i == ie30Var2.A && z) {
                i2 |= 2;
            }
            if (i2 == 0 && Objects.equals(ie30Var2.p, "video/dolby-vision")) {
                Pair pairC = kwg.c(ie30Var);
                Pair pairC2 = kwg.c(ie30Var2);
                if (pairC == null || pairC2 == null || !((Integer) pairC.first).equals(pairC2.first)) {
                    i2 |= 2;
                }
            }
            if (i2 == 0) {
                return new iar(this.a, ie30Var, ie30Var2, ie30Var.d(ie30Var2) ? 3 : 2, 0);
            }
            ie30Var3 = ie30Var;
            ie30Var4 = ie30Var2;
        } else {
            ie30Var3 = ie30Var;
            ie30Var4 = ie30Var2;
            if (ie30Var3.J != ie30Var4.J) {
                i2 |= 4096;
            }
            if (ie30Var3.L != ie30Var4.L) {
                i2 |= 8192;
            }
            if (ie30Var3.M != ie30Var4.M) {
                i2 |= 16384;
            }
            String str3 = this.b;
            if (i2 == 0 && (str3.equals("audio/mp4a-latm") || str3.equals("audio/ac4"))) {
                Pair pairC3 = kwg.c(ie30Var3);
                Pair pairC4 = kwg.c(ie30Var4);
                if (pairC3 != null && pairC4 != null) {
                    int iIntValue = ((Integer) pairC3.first).intValue();
                    int iIntValue2 = ((Integer) pairC4.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new iar(this.a, ie30Var3, ie30Var4, 3, 0);
                    }
                    if (str3.equals("audio/ac4") && pairC3.equals(pairC4)) {
                        return new iar(this.a, ie30Var3, ie30Var4, 3, 0);
                    }
                }
            }
            if (i2 == 0 && (str3.equals("audio/eac3-joc") || str3.equals("audio/eac3"))) {
                return new iar(this.a, ie30Var3, ie30Var4, 3, 0);
            }
            if (!ie30Var3.d(ie30Var4)) {
                i2 |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new iar(this.a, ie30Var3, ie30Var4, 1, 0);
            }
        }
        return new iar(this.a, ie30Var3, ie30Var4, 0, i2);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0055 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0056  */
    /* JADX WARN: Code duplicated, block: B:22:0x006b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    /* JADX WARN: Code duplicated, block: B:28:0x007f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    /* JADX WARN: Code duplicated, block: B:32:0x0088  */
    /* JADX WARN: Code duplicated, block: B:33:0x008a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    /* JADX WARN: Code duplicated, block: B:39:0x0098  */
    /* JADX WARN: Code duplicated, block: B:40:0x009b  */
    /* JADX WARN: Code duplicated, block: B:48:0x00af  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:72:0x0113  */
    /* JADX WARN: Code duplicated, block: B:74:0x0119  */
    /* JADX WARN: Code duplicated, block: B:93:0x013d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x0056, please report this as an issue */
    public final boolean c(Context context, ie30 ie30Var, boolean z) {
        int iC;
        int iB;
        boolean zEquals;
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int length;
        int i;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel;
        int maxInputChannelCount;
        int i2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr2;
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        jwg jwgVarE = kwg.e(ie30Var);
        String str2 = ie30Var.p;
        String str3 = this.c;
        if (str2 != null && str2.equals("video/mv-hevc")) {
            String strP = asj0.p(str3);
            if (!strP.equals("video/mv-hevc")) {
                if (strP.equals("video/hevc")) {
                    HashMap map = hkh0.a;
                    String strP2 = mqn1.p(ie30Var.s);
                    if (strP2 == null) {
                        jwgVarE = null;
                    } else {
                        String strTrim = strP2.trim();
                        String str4 = zoi1.a;
                        jwgVarE = kwg.d(strP2, strTrim.split("\\.", -1), ie30Var.H);
                    }
                }
                if (jwgVarE != null) {
                    if (!jwgVarE.d()) {
                        return false;
                    }
                    iC = jwgVarE.c();
                    iB = jwgVarE.b();
                    zEquals = "video/dolby-vision".equals(str2);
                    str = this.b;
                    if (zEquals) {
                        str.getClass();
                        switch (str) {
                            case "video/av01":
                            case "video/hevc":
                                iB = 0;
                                iC = 2;
                                break;
                            case "video/avc":
                                iB = 0;
                                iC = 8;
                                break;
                        }
                    }
                    if (this.i) {
                        codecCapabilities = this.d;
                        if (codecCapabilities != null) {
                            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                        } else {
                            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                        }
                        if (str.equals("audio/ac4")) {
                            if (codecCapabilities != null) {
                                maxInputChannelCount = 2;
                            } else {
                                maxInputChannelCount = 2;
                            }
                            if (maxInputChannelCount > 18) {
                            }
                            if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                                codecProfileLevelArr2 = new MediaCodecInfo.CodecProfileLevel[]{hkh0.b(1026, i2)};
                            } else {
                                codecProfileLevelArr2 = new MediaCodecInfo.CodecProfileLevel[]{hkh0.b(257, i2), hkh0.b(NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SKIP_BYTE_COUNTS_TOO_SHORT, i2), hkh0.b(NativeMediaProcessor.PROCESS_SAMPLE_RESULT_PROCESS_BYTE_COUNTS_TOO_SHORT, i2), hkh0.b(1026, i2), hkh0.b(1028, i2)};
                            }
                            codecProfileLevelArr = codecProfileLevelArr2;
                        }
                        length = codecProfileLevelArr.length;
                        for (i = 0; i < length; i++) {
                            codecProfileLevel = codecProfileLevelArr[i];
                            if (codecProfileLevel.profile != iC) {
                            }
                        }
                        h("codec.profileLevel, " + ie30Var.l + ", " + str3);
                        return false;
                    }
                    codecCapabilities = this.d;
                    if (codecCapabilities != null) {
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                    } else {
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                    }
                    if (str.equals("audio/ac4")) {
                        if (codecCapabilities != null) {
                            maxInputChannelCount = 2;
                        } else {
                            maxInputChannelCount = 2;
                        }
                        if (maxInputChannelCount > 18) {
                        }
                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            codecProfileLevelArr2 = new MediaCodecInfo.CodecProfileLevel[]{hkh0.b(1026, i2)};
                        } else {
                            codecProfileLevelArr2 = new MediaCodecInfo.CodecProfileLevel[]{hkh0.b(257, i2), hkh0.b(NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SKIP_BYTE_COUNTS_TOO_SHORT, i2), hkh0.b(NativeMediaProcessor.PROCESS_SAMPLE_RESULT_PROCESS_BYTE_COUNTS_TOO_SHORT, i2), hkh0.b(1026, i2), hkh0.b(1028, i2)};
                        }
                        codecProfileLevelArr = codecProfileLevelArr2;
                    }
                    length = codecProfileLevelArr.length;
                    while (i < length) {
                        codecProfileLevel = codecProfileLevelArr[i];
                        if (codecProfileLevel.profile != iC) {
                        }
                    }
                    h("codec.profileLevel, " + ie30Var.l + ", " + str3);
                    return false;
                }
            }
        } else if (jwgVarE != null) {
            if (!jwgVarE.d()) {
                return false;
            }
            iC = jwgVarE.c();
            iB = jwgVarE.b();
            zEquals = "video/dolby-vision".equals(str2);
            str = this.b;
            if (zEquals) {
                str.getClass();
                switch (str) {
                    case -1662735862:
                        if (str.equals("video/av01")) {
                        }
                        break;
                    case -1662541442:
                        if (str.equals("video/hevc")) {
                        }
                        break;
                    case 1331836730:
                        if (str.equals("video/avc")) {
                        }
                        break;
                }
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Switch insn not found in header
                    	at java.base/java.util.Objects.requireNonNull(Objects.java:259)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
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
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
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
                    */
                /*
                    Method dump skipped, instruction units count: 372
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.bkh0.c(android.content.Context, p.ie30, boolean):boolean");
            }

            public final boolean d(ie30 ie30Var) {
                return (Objects.equals(ie30Var.p, "audio/flac") && ie30Var.M == 22 && Build.VERSION.SDK_INT < 34 && this.a.equals("c2.android.flac.decoder")) ? false : true;
            }

            public final boolean e(Context context, ie30 ie30Var) {
                int i;
                int i2;
                String str = ie30Var.p;
                String str2 = this.b;
                if ((!str2.equals(str) && !str2.equals(hkh0.c(ie30Var))) || !c(context, ie30Var, true) || !d(ie30Var)) {
                    return false;
                }
                if (this.i) {
                    int i3 = ie30Var.w;
                    if (i3 > 0 && (i2 = ie30Var.x) > 0) {
                        return g(ie30Var.B, i3, i2);
                    }
                } else {
                    int i4 = ie30Var.L;
                    MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
                    if (i4 != -1) {
                        if (codecCapabilities == null) {
                            h("sampleRate.caps");
                            return false;
                        }
                        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                        if (audioCapabilities == null) {
                            h("sampleRate.aCaps");
                            return false;
                        }
                        if (!audioCapabilities.isSampleRateSupported(i4)) {
                            h("sampleRate.support, " + i4);
                            return false;
                        }
                    }
                    int i5 = ie30Var.J;
                    if (i5 != -1) {
                        if (codecCapabilities == null) {
                            h("channelCount.caps");
                            return false;
                        }
                        MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                        if (audioCapabilities2 == null) {
                            h("channelCount.aCaps");
                            return false;
                        }
                        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                        if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                            if ("audio/ac3".equals(str2)) {
                                i = 6;
                            } else {
                                i = "audio/eac3".equals(str2) ? 16 : 30;
                            }
                            StringBuilder sbS = l1d.s(maxInputChannelCount, "AssumedMaxChannelAdjustment: ", this.a, ", [", " to ");
                            sbS.append(i);
                            sbS.append("]");
                            oon1.H(sbS.toString());
                            maxInputChannelCount = i;
                        }
                        if (maxInputChannelCount < i5) {
                            h("channelCount.support, " + i5);
                            return false;
                        }
                    }
                }
                return true;
            }

            public final boolean f(ie30 ie30Var) {
                if (this.i) {
                    return this.e;
                }
                jwg jwgVarE = kwg.e(ie30Var);
                return jwgVarE != null && jwgVarE.d() && jwgVarE.c() == 42;
            }

            /* JADX WARN: Code duplicated, block: B:20:0x0044 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:21:0x0046  */
            public final boolean g(double d, int i, int i2) {
                String str;
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
                if (codecCapabilities == null) {
                    h("sizeAndRate.caps");
                    return false;
                }
                MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
                if (videoCapabilities == null) {
                    h("sizeAndRate.vCaps");
                    return false;
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    int iR = ajo1.r(videoCapabilities, i, i2, d);
                    if (iR != 2) {
                        if (iR == 1) {
                            StringBuilder sbQ = cy30.q(i, i2, "sizeAndRate.cover, ", "x", "@");
                            sbQ.append(d);
                            h(sbQ.toString());
                            return false;
                        }
                        if (!a(videoCapabilities, i, i2, d)) {
                            if (i < i2) {
                                HashSet hashSet = hph0.a;
                                str = this.a;
                                if ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str)) {
                                    StringBuilder sbQ2 = cy30.q(i, i2, "sizeAndRate.rotated, ", "x", "@");
                                    sbQ2.append(d);
                                    StringBuilder sbN = gvg.n("AssumedSupport [", sbQ2.toString(), "] [", str, ", ");
                                    sbN.append(this.b);
                                    sbN.append("] [");
                                    sbN.append(zoi1.a);
                                    sbN.append("]");
                                    oon1.s(sbN.toString());
                                    return true;
                                }
                                StringBuilder sbQ3 = cy30.q(i, i2, "sizeAndRate.rotated, ", "x", "@");
                                sbQ3.append(d);
                                StringBuilder sbN2 = gvg.n("AssumedSupport [", sbQ3.toString(), "] [", str, ", ");
                                sbN2.append(this.b);
                                sbN2.append("] [");
                                sbN2.append(zoi1.a);
                                sbN2.append("]");
                                oon1.s(sbN2.toString());
                                return true;
                            }
                            StringBuilder sbQ4 = cy30.q(i, i2, "sizeAndRate.support, ", "x", "@");
                            sbQ4.append(d);
                            h(sbQ4.toString());
                            return false;
                        }
                    }
                } else if (!a(videoCapabilities, i, i2, d)) {
                    if (i < i2) {
                        HashSet hashSet2 = hph0.a;
                        str = this.a;
                        if (("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && a(videoCapabilities, i2, i, d)) {
                            StringBuilder sbQ5 = cy30.q(i, i2, "sizeAndRate.rotated, ", "x", "@");
                            sbQ5.append(d);
                            StringBuilder sbN3 = gvg.n("AssumedSupport [", sbQ5.toString(), "] [", str, ", ");
                            sbN3.append(this.b);
                            sbN3.append("] [");
                            sbN3.append(zoi1.a);
                            sbN3.append("]");
                            oon1.s(sbN3.toString());
                            return true;
                        }
                    }
                    StringBuilder sbQ6 = cy30.q(i, i2, "sizeAndRate.support, ", "x", "@");
                    sbQ6.append(d);
                    h(sbQ6.toString());
                    return false;
                }
                return true;
            }

            public final void h(String str) {
                StringBuilder sbT = l1d.t("NoSupport [", str, "] [");
                sbT.append(this.a);
                sbT.append(", ");
                sbT.append(this.b);
                sbT.append("] [");
                sbT.append(zoi1.a);
                sbT.append("]");
                oon1.s(sbT.toString());
            }

            public final String toString() {
                return this.a;
            }
        }
