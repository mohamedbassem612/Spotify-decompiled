package p;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.media.MediaMuxer;
import android.net.Uri;
import com.spotify.adsdisplay.browser.inapp.InAppBrowserActivity;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class nfb implements Predicate, c290, Function, aiy, BiFunction, czh1, n2i1, nyc, Init, ya, wv91 {
    public final /* synthetic */ byte a;

    public nfb() {
        this.a = (byte) 23;
        String str = voe0.d;
        new ConcurrentHashMap(3, 1.0f, 2);
    }

    public static final Integer b(t081 t081Var) {
        return nhc1.c0(ihc1.H0(t081Var.b, "customshortcut-lastvisitedpage-"));
    }

    public static final String d(String str, String str2) {
        return "room_table_modification_trigger_" + str + '_' + str2;
    }

    public static final HashSet e(List list) {
        HashSet hashSet = new HashSet(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(((t081) it.next()).e.toString().toLowerCase(Locale.ROOT));
        }
        return hashSet;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x012b  */
    public static void f(l420 l420Var, l420 l420Var2, Integer num) throws Throwable {
        Throwable th;
        String absolutePath = l420Var.b.getAbsolutePath();
        String absolutePath2 = l420Var2.b.getAbsolutePath();
        if (num == null) {
            FileInputStream fileInputStream = new FileInputStream(absolutePath);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(absolutePath2);
                try {
                    fileInputStream.getChannel().transferTo(0L, fileInputStream.getChannel().size(), fileOutputStream.getChannel());
                    fileOutputStream.close();
                    fileInputStream.close();
                    return;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        u890.p(fileOutputStream, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    u890.p(fileInputStream, th4);
                    throw th5;
                }
            }
        }
        int iIntValue = num.intValue();
        MediaExtractor mediaExtractor = new MediaExtractor();
        MediaMuxer mediaMuxer = null;
        try {
            mediaExtractor.setDataSource(absolutePath);
            MediaMuxer mediaMuxer2 = new MediaMuxer(absolutePath2, 0);
            try {
                int trackCount = mediaExtractor.getTrackCount();
                int iAddTrack = -1;
                int i = -1;
                int i2 = -1;
                int iAddTrack2 = -1;
                for (int i3 = 0; i3 < trackCount; i3++) {
                    MediaFormat trackFormat = mediaExtractor.getTrackFormat(i3);
                    String string = trackFormat.getString("mime");
                    if (string != null) {
                        if (nhc1.Y(string, "video/", false) && i == -1) {
                            iAddTrack = mediaMuxer2.addTrack(trackFormat);
                            i = i3;
                        } else if (nhc1.Y(string, "audio/", false) && i2 == -1) {
                            iAddTrack2 = mediaMuxer2.addTrack(trackFormat);
                            i2 = i3;
                        }
                    }
                }
                if (iAddTrack == -1 && iAddTrack2 == -1) {
                    throw new IllegalStateException("No valid video/audio tracks found.");
                }
                mediaMuxer2.start();
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    mediaMetadataRetriever.setDataSource(absolutePath);
                    String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
                    long j = strExtractMetadata != null ? Long.parseLong(strExtractMetadata) : 0L;
                    mediaMetadataRetriever.release();
                    ytw0 ytw0Var = jfv.b;
                    long jL0 = fdg1.l0(j, ngv.d);
                    ngv ngvVar = ngv.c;
                    long jU = jfv.u(jL0, ngvVar);
                    long jU2 = jfv.u(fdg1.k0(iIntValue, ngv.e), ngvVar);
                    if (jU2 > jU) {
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8388608);
                        byteBufferAllocate.getClass();
                        List listV = v(mediaExtractor, i, byteBufferAllocate);
                        List listV2 = v(mediaExtractor, i2, byteBufferAllocate);
                        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                        long j2 = 0;
                        while (j2 < jU2) {
                            w(listV, iAddTrack, mediaMuxer2, bufferInfo, j2, jU2);
                            int i4 = iAddTrack;
                            List list = listV2;
                            int i5 = iAddTrack2;
                            w(list, i5, mediaMuxer2, bufferInfo, j2, jU2);
                            j2 += jU;
                            listV2 = list;
                            iAddTrack2 = i5;
                            iAddTrack = i4;
                        }
                    } else {
                        mediaMuxer = mediaMuxer2;
                        try {
                            y(mediaExtractor, mediaMuxer, i, i2, iAddTrack, iAddTrack2, jU2);
                            mediaMuxer2 = mediaMuxer;
                        } catch (Throwable th6) {
                            th = th6;
                            th = th;
                            if (mediaMuxer != null) {
                                mediaMuxer.release();
                            }
                            mediaExtractor.release();
                            throw th;
                        }
                    }
                    mediaMuxer2.release();
                    mediaExtractor.release();
                } catch (Throwable th7) {
                    mediaMetadataRetriever.release();
                    throw th7;
                }
            } catch (Throwable th8) {
                th = th8;
                mediaMuxer = mediaMuxer2;
                if (mediaMuxer != null) {
                    mediaMuxer.release();
                }
                mediaExtractor.release();
                throw th;
            }
        } catch (Throwable th9) {
            th = th9;
        }
    }

    public static Intent g(Activity activity, a580 a580Var) {
        return new Intent(activity, (Class<?>) InAppBrowserActivity.class).putExtra("com.spotify.adsdisplay.browser.webview.metadata", a580Var);
    }

    public static String h(String str) {
        int iW0 = ihc1.w0(str, "@", 0, false, 6);
        String strSubstring = iW0 == -1 ? "" : str.substring(0, iW0);
        if (strSubstring.length() != 0) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < strSubstring.length(); i++) {
                char cCharAt = strSubstring.charAt(i);
                if (!Character.isDigit(cCharAt)) {
                    sb.append(cCharAt);
                }
            }
            String string = sb.toString();
            if (string.length() != 0) {
                Locale locale = Locale.ROOT;
                String lowerCase = string.toLowerCase(locale);
                if (lowerCase.length() <= 0) {
                    return lowerCase;
                }
                return ((Object) String.valueOf(lowerCase.charAt(0)).toUpperCase(locale)) + lowerCase.substring(1);
            }
        }
        return "";
    }

    public static long i() {
        return u7h.b;
    }

    public static long j() {
        return u7h.h;
    }

    public static long l() {
        return u7h.d;
    }

    public static long m() {
        return u7h.g;
    }

    public static long o() {
        return u7h.j;
    }

    public static long p() {
        return u7h.k;
    }

    public static long q() {
        return u7h.f;
    }

    public static float r(float f, float f2, float f3, int i) {
        float f4 = ((f / 30.0f) + i) % 12.0f;
        return f3 - (Math.max(-1.0f, Math.min(f4 - 3.0f, Math.min(9.0f - f4, 1.0f))) * (Math.min(f3, 1.0f - f3) * f2));
    }

    public static long t(float f, float f2, float f3, float f4) {
        int i = u7h.l;
        je31 je31Var = kah.e;
        if (0.0f > f || f > 360.0f || 0.0f > f2 || f2 > 1.0f || 0.0f > f3 || f3 > 1.0f) {
            StringBuilder sbM = gvg.m("HSV (", f, ", ", f2, ", ");
            sbM.append(f3);
            sbM.append(") must be in range (0..360, 0..1, 0..1)");
            pf80.a(sbM.toString());
        }
        return z4p1.d(u(f, f2, f3, 5), u(f, f2, f3, 3), u(f, f2, f3, 1), f4, je31Var);
    }

    public static float u(float f, float f2, float f3, int i) {
        float f4 = ((f / 60.0f) + i) % 6.0f;
        return f3 - (Math.max(0.0f, Math.min(f4, Math.min(4.0f - f4, 1.0f))) * (f2 * f3));
    }

    public static List v(MediaExtractor mediaExtractor, int i, ByteBuffer byteBuffer) {
        if (i == -1) {
            return z6x.a;
        }
        ArrayList arrayList = new ArrayList();
        mediaExtractor.selectTrack(i);
        mediaExtractor.seekTo(0L, 2);
        while (true) {
            int sampleData = mediaExtractor.readSampleData(byteBuffer, 0);
            if (sampleData < 0) {
                mediaExtractor.unselectTrack(i);
                return arrayList;
            }
            byte[] bArr = new byte[sampleData];
            byteBuffer.position(0);
            byteBuffer.get(bArr, 0, sampleData);
            arrayList.add(new s9c1(mediaExtractor.getSampleTime(), bArr, mediaExtractor.getSampleFlags(), sampleData));
            mediaExtractor.advance();
        }
    }

    public static void w(List list, int i, MediaMuxer mediaMuxer, MediaCodec.BufferInfo bufferInfo, long j, long j2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            s9c1 s9c1Var = (s9c1) it.next();
            bufferInfo.offset = 0;
            bufferInfo.size = s9c1Var.d;
            bufferInfo.flags = s9c1Var.c;
            long j3 = s9c1Var.b + j;
            bufferInfo.presentationTimeUs = j3;
            if (j3 > j2) {
                return;
            } else {
                mediaMuxer.writeSampleData(i, ByteBuffer.wrap(s9c1Var.a), bufferInfo);
            }
        }
    }

    public static void y(MediaExtractor mediaExtractor, MediaMuxer mediaMuxer, int i, int i2, int i3, int i4, long j) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8388608);
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        Iterator it = p7h.M(new Integer[]{Integer.valueOf(i), Integer.valueOf(i2)}).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (iIntValue != -1) {
                mediaExtractor.selectTrack(iIntValue);
                mediaExtractor.seekTo(0L, 2);
                while (true) {
                    bufferInfo.offset = 0;
                    bufferInfo.size = mediaExtractor.readSampleData(byteBufferAllocate, 0);
                    bufferInfo.flags = mediaExtractor.getSampleFlags();
                    long sampleTime = mediaExtractor.getSampleTime();
                    bufferInfo.presentationTimeUs = sampleTime;
                    if (bufferInfo.size < 0 || sampleTime > j) {
                        break;
                    }
                    mediaMuxer.writeSampleData(iIntValue == i ? i3 : i4, byteBufferAllocate, bufferInfo);
                    mediaExtractor.advance();
                }
                mediaExtractor.unselectTrack(iIntValue);
            }
        }
    }

    public rqw a(zhy zhyVar) {
        return n3o1.q(zhyVar).a(c9x.P0, c9x.Q0);
    }

    public boolean accept(Object obj) {
        return ((ksk) obj).c == le30.e1;
    }

    public Object apply(Object obj) {
        int i;
        int i2;
        int i3;
        int i4;
        if81 if81Var;
        int i5;
        if81 if81Var2;
        if81 if81Var3;
        byte b = this.a;
        Set setP1 = w7x.a;
        switch (b) {
            case 6:
                Set setB = ((dma1) obj).b(qhr.b, setP1);
                return setB == null ? setP1 : setB;
            default:
                nl91 nl91Var = ((ij91) obj).d;
                int i6 = nl91Var != null ? nl91Var.o : 0;
                rp91 rp91VarF = rp91.a;
                rp91 rp91VarF2 = nl91Var != null ? hj91.f(nl91Var.c) : rp91VarF;
                rp91 rp91VarF3 = nl91Var != null ? hj91.f(nl91Var.d) : rp91VarF;
                if (nl91Var != null) {
                    rp91VarF = hj91.f(nl91Var.e);
                }
                rp91 rp91Var = rp91VarF;
                rp91 rp91VarF4 = (nl91Var == null || (if81Var3 = nl91Var.f) == null) ? null : hj91.f(if81Var3);
                rp91 rp91VarF5 = (nl91Var == null || (if81Var2 = nl91Var.g) == null) ? null : hj91.f(if81Var2);
                int i7 = 3;
                int i8 = 4;
                if (nl91Var == null || (i5 = nl91Var.h) == 0) {
                    i = 0;
                } else {
                    int iC = l1d.C(i5);
                    if (iC == 0) {
                        i = 1;
                    } else if (iC != 1) {
                        i = iC != 2 ? 4 : 3;
                    } else {
                        i = 2;
                    }
                }
                rp91 rp91VarF6 = (nl91Var == null || (if81Var = nl91Var.i) == null) ? null : hj91.f(if81Var);
                if (nl91Var == null || (i4 = nl91Var.k) == 0) {
                    i2 = 0;
                } else {
                    int iC2 = l1d.C(i4);
                    if (iC2 == 0) {
                        i2 = 1;
                    } else if (iC2 != 1) {
                        i2 = iC2 != 2 ? 4 : 3;
                    } else {
                        i2 = 2;
                    }
                }
                if (nl91Var != null) {
                    Set set = nl91Var.l;
                    ArrayList arrayList = new ArrayList(q7h.U(set, 10));
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        arrayList.add(hj91.f((if81) it.next()));
                    }
                    setP1 = o7h.p1(arrayList);
                }
                boolean z = nl91Var != null ? nl91Var.m : false;
                if (nl91Var != null && (i3 = nl91Var.n) != 0) {
                    int iC3 = l1d.C(i3);
                    if (iC3 == 0) {
                        i7 = 1;
                    } else if (iC3 == 1) {
                        i7 = 2;
                    } else if (iC3 != 2) {
                        if (iC3 != 3) {
                            eg.o();
                            return null;
                        }
                        i7 = 4;
                    }
                    i8 = i7;
                }
                return new sp91(rp91VarF2, rp91VarF3, rp91Var, rp91VarF4, rp91VarF5, i, rp91VarF6, i2, setP1, z, i8, i6);
        }
    }

    public mr20 c() {
        return new huz(new mhb1((String) null, (String) null, (vzh1) null, (String) null), (byte) 10);
    }

    public Object convert(int i) {
        pvm pvmVar;
        switch (this.a) {
            case 1:
                xls0 xls0VarA = xls0.a(i);
                return xls0VarA == null ? xls0.h : xls0VarA;
            case 3:
                if (i == 0) {
                    pvmVar = pvm.b;
                } else if (i == 1) {
                    pvmVar = pvm.c;
                } else if (i != 2) {
                    pvmVar = i != 3 ? null : pvm.e;
                } else {
                    pvmVar = pvm.d;
                }
                return pvmVar == null ? pvm.f : pvmVar;
            case 12:
                vls0 vls0VarA = vls0.a(i);
                return vls0VarA == null ? vls0.b : vls0VarA;
            case 16:
                wij0 wij0VarA = wij0.a(i);
                return wij0VarA == null ? wij0.b : wij0VarA;
            default:
                w80 w80VarA = w80.a(i);
                return w80VarA == null ? w80.f : w80VarA;
        }
    }

    public First e0(Object obj) {
        switch (this.a) {
            case 19:
                return First.c((k8t0) obj, Collections.singleton(w7t0.a));
            default:
                return First.c((zqy0) obj, Collections.singleton(kqy0.c));
        }
    }

    public void k(jf01 jf01Var, IOException iOException) {
        Logger.e(iOException, l1d.m("Tracking request failed: ", iOException.getMessage()), new Object[0]);
    }

    public void n(jf01 jf01Var, ry21 ry21Var) {
        int i = ry21Var.d;
        if (200 > i || i >= 300) {
            Logger.d("Tracking request failed: " + ry21Var, new Object[0]);
        }
        try {
            ry21Var.g.close();
        } catch (Throwable unused) {
        }
    }

    public boolean s(Uri uri) {
        String host = uri.getHost();
        if (host != null && (nhc1.R(host, ".spotify.com", false) || host.equals("spotify.com"))) {
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.contains("logout") || pathSegments.contains("revoke_sessions") || pathSegments.contains("sign-out-everywhere")) {
                return true;
            }
        }
        return false;
    }

    public boolean test(Object obj) {
        return ((Boolean) mfb.b.get(obj)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x003b A[RETURN] */
    public boolean x(Object obj, Object obj2) {
        z5e1 z5e1Var = (z5e1) obj;
        z5e1 z5e1Var2 = (z5e1) obj2;
        if (z5e1Var == null || z5e1Var2 == null) {
            if ((z5e1Var == null) ^ (z5e1Var2 == null)) {
                return false;
            }
            return true;
        }
        if (z5e1Var.a == z5e1Var2.a && u890.j(z5e1Var.b, z5e1Var2.b) && z5e1Var.c == z5e1Var2.c && z5e1Var.d == z5e1Var2.d && z5e1Var.e == z5e1Var2.e) {
            return true;
        }
        return false;
    }

    public /* synthetic */ nfb(byte b, boolean z) {
        this.a = b;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    public Object apply(Object obj, Object obj2) {
        boolean z;
        cxc0 cxc0Var = (cxc0) obj;
        if (((Boolean) obj2).booleanValue() || !cxc0Var.f.w.b) {
            z = false;
        } else {
            if (eqr0.r(cxc0Var.k, (dlc0[]) Arrays.copyOf(new dlc0[]{dlc0.d, dlc0.h}, 2)) || cxc0Var.a()) {
                z = true;
            } else {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
