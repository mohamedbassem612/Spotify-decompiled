package p;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.transformer.ExportException;
import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.ContentMediaFormat;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fmr {
    public final MediaCodec.BufferInfo a;
    public final MediaFormat b;
    public final ie30 c;
    public final MediaCodec d;
    public final Surface e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final AtomicBoolean i;
    public ie30 j;
    public ByteBuffer k;
    public int l;
    public int m;
    public boolean n;
    public boolean o;

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.transformer.ExportException */
    /* JADX WARN: Code duplicated, block: B:12:0x0042  */
    /* JADX WARN: Code duplicated, block: B:17:0x0057 A[Catch: Exception -> 0x006c, TryCatch #2 {Exception -> 0x006c, blocks: (B:15:0x0048, B:17:0x0057, B:19:0x005d, B:22:0x0066, B:27:0x0072, B:28:0x0076), top: B:66:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008c  */
    /* JADX WARN: Multi-variable type inference failed */
    public fmr(Context context, ie30 ie30Var, MediaFormat mediaFormat, String str, boolean z, Surface surface) throws ExportException {
        int i;
        boolean z2;
        Object[] objArr;
        Surface surfaceCreateInputSurface;
        MediaCodec mediaCodecCreateByCodecName;
        this.c = ie30Var;
        this.b = mediaFormat;
        this.g = z;
        String str2 = ie30Var.f66p;
        str2.getClass();
        boolean zO = asj0.o(str2);
        this.h = zO;
        this.a = new MediaCodec.BufferInfo();
        this.l = -1;
        this.m = -1;
        this.i = new AtomicBoolean();
        LinkedHashMap linkedHashMap = x8r.a;
        try {
            try {
                synchronized (x8r.class) {
                    synchronized (x8r.class) {
                    }
                    i = Build.VERSION.SDK_INT;
                    z2 = false;
                    if (i >= 31 || x74.M(mediaFormat, "color-transfer-request", 0) != 3) {
                        objArr = false;
                    } else {
                        objArr = true;
                    }
                    surfaceCreateInputSurface = null;
                    mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                    Trace.beginSection("configureCodec");
                    mediaCodecCreateByCodecName.configure(mediaFormat, surface, (MediaCrypto) null, !z ? 1 : 0);
                    Trace.endSection();
                    if (objArr != false) {
                        MediaFormat inputFormat = mediaCodecCreateByCodecName.getInputFormat();
                        if (i >= 31 && x74.M(inputFormat, "color-transfer-request", 0) == 3) {
                            z2 = true;
                        }
                        dm5.n(z2, "Tone-mapping requested but not supported by the decoder.");
                    }
                    if (zO && !z) {
                        surfaceCreateInputSurface = mediaCodecCreateByCodecName.createInputSurface();
                    }
                    Trace.beginSection("startCodec");
                    mediaCodecCreateByCodecName.start();
                    Trace.endSection();
                    this.d = mediaCodecCreateByCodecName;
                    this.e = surfaceCreateInputSurface;
                    this.f = zoi1.Q(context) ? 1 : 5;
                    return;
                }
                Trace.beginSection("configureCodec");
                mediaCodecCreateByCodecName.configure(mediaFormat, surface, (MediaCrypto) null, !z ? 1 : 0);
                Trace.endSection();
                if (objArr != false) {
                    MediaFormat inputFormat2 = mediaCodecCreateByCodecName.getInputFormat();
                    if (i >= 31) {
                        z2 = true;
                    }
                    dm5.n(z2, "Tone-mapping requested but not supported by the decoder.");
                }
                if (zO) {
                    surfaceCreateInputSurface = mediaCodecCreateByCodecName.createInputSurface();
                }
                Trace.beginSection("startCodec");
                mediaCodecCreateByCodecName.start();
                Trace.endSection();
                this.d = mediaCodecCreateByCodecName;
                this.e = surfaceCreateInputSurface;
                this.f = zoi1.Q(context) ? 1 : 5;
                return;
            } catch (Exception e) {
                e = e;
                oon1.t("MediaCodec error", e);
                if (surfaceCreateInputSurface != null) {
                    surfaceCreateInputSurface.release();
                }
                if (mediaCodecCreateByCodecName != null) {
                    mediaCodecCreateByCodecName.release();
                }
                throw ExportException.c(e, ((e instanceof IOException) || (e instanceof MediaCodec.CodecException)) ? z ? 3001 : 4001 : e instanceof IllegalArgumentException ? z ? 3003 : 4003 : ContentMediaFormat.FULL_CONTENT_GENERIC, new m3c(mediaFormat.toString(), this.h, str, z));
            }
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        } catch (Exception e2) {
            e = e2;
            mediaCodecCreateByCodecName = null;
        }
        i = Build.VERSION.SDK_INT;
        z2 = false;
        if (i >= 31) {
            objArr = false;
        } else {
            objArr = false;
        }
        surfaceCreateInputSurface = null;
    }

    public static ie30 a(MediaFormat mediaFormat, boolean z, hjj0 hjj0Var) {
        String string;
        int i;
        int i2;
        int i3;
        byte[] bArr;
        int i4;
        int i5;
        int i6;
        ge30 ge30Var = new ge30();
        ge30Var.o = asj0.p(mediaFormat.getString("mime"));
        ge30Var.d = mediaFormat.getString("language");
        ge30Var.j = x74.M(mediaFormat, "max-bitrate", -1);
        ge30Var.i = x74.M(mediaFormat, "bitrate", -1);
        if (Objects.equals(mediaFormat.getString("mime"), "video/3gpp") && mediaFormat.containsKey("profile") && mediaFormat.containsKey("level")) {
            int integer = mediaFormat.getInteger("profile");
            byte[] bArr2 = kwg.a;
            if (integer == 1) {
                i5 = 0;
            } else if (integer == 2) {
                i5 = 1;
            } else if (integer == 4) {
                i5 = 2;
            } else if (integer == 8) {
                i5 = 3;
            } else if (integer == 16) {
                i5 = 4;
            } else if (integer == 32) {
                i5 = 5;
            } else if (integer == 64) {
                i5 = 6;
            } else if (integer != 128) {
                i5 = integer != 256 ? -1 : 8;
            } else {
                i5 = 7;
            }
            int integer2 = mediaFormat.getInteger("level");
            if (integer2 == 1) {
                i6 = 10;
            } else if (integer2 == 2) {
                i6 = 20;
            } else if (integer2 == 4) {
                i6 = 30;
            } else if (integer2 == 8) {
                i6 = 40;
            } else if (integer2 == 16) {
                i6 = 45;
            } else if (integer2 == 32) {
                i6 = 50;
            } else if (integer2 != 64) {
                i6 = integer2 != 128 ? -1 : 70;
            } else {
                i6 = 60;
            }
            String str = zoi1.a;
            Locale locale = Locale.US;
            string = cy30.i(i5, "s263.", i6, ".");
        } else if (Objects.equals(mediaFormat.getString("mime"), "video/dolby-vision") && mediaFormat.containsKey("profile")) {
            int iM = x74.M(mediaFormat, "level", -1);
            if (iM == -1) {
                int iM2 = x74.M(mediaFormat, "width", -1);
                int iM3 = x74.M(mediaFormat, "height", -1);
                float fJ = x74.J(mediaFormat);
                byte[] bArr3 = kwg.a;
                int iMax = Math.max(iM2, iM3);
                dm5.y(iMax <= 7680);
                float f = iM2 * iM3 * fJ;
                if (iMax <= 1280) {
                    i3 = f <= 2.21184E7f ? 1 : 2;
                } else if (iMax <= 1920 && f <= 4.97664E7f) {
                    i3 = 4;
                } else if (iMax <= 2560 && f <= 6.2208E7f) {
                    i3 = 8;
                } else if (iMax <= 3840) {
                    if (f <= 1.24416E8f) {
                        i3 = 16;
                    } else if (f <= 1.990656E8f) {
                        i3 = 32;
                    } else if (f <= 2.48832E8f) {
                        i3 = 64;
                    } else if (f <= 3.981312E8f) {
                        i3 = SemanticState.Focused;
                    } else {
                        i3 = f <= 4.97664E8f ? SemanticState.Hidden : 512;
                    }
                } else if (iMax <= 7680) {
                    i3 = f <= 9.95328E8f ? SemanticState.ReadOnly : SemanticState.Modal;
                } else {
                    i3 = -1;
                }
                iM = i3;
            }
            int integer3 = mediaFormat.getInteger("profile");
            byte[] bArr4 = kwg.a;
            if (integer3 == 1) {
                i = 0;
            } else if (integer3 == 2) {
                i = 1;
            } else if (integer3 == 4) {
                i = 2;
            } else if (integer3 == 8) {
                i = 3;
            } else if (integer3 == 16) {
                i = 4;
            } else if (integer3 == 32) {
                i = 5;
            } else if (integer3 == 64) {
                i = 6;
            } else if (integer3 == 128) {
                i = 7;
            } else if (integer3 == 256) {
                i = 8;
            } else if (integer3 == 512) {
                i = 9;
            } else {
                if (integer3 != 1024) {
                    hhg1.n(f4i1.c(integer3, "Unknown Dolby Vision profile: "));
                    return null;
                }
                i = 10;
            }
            if (iM == 1) {
                i2 = 1;
            } else if (iM != 2) {
                switch (iM) {
                    case 4:
                        i2 = 3;
                        break;
                    case 8:
                        i2 = 4;
                        break;
                    case 16:
                        i2 = 5;
                        break;
                    case 32:
                        i2 = 6;
                        break;
                    case 64:
                        i2 = 7;
                        break;
                    case SemanticState.Focused /* 128 */:
                        i2 = 8;
                        break;
                    case SemanticState.Hidden /* 256 */:
                        i2 = 9;
                        break;
                    case 512:
                        i2 = 10;
                        break;
                    case SemanticState.ReadOnly /* 1024 */:
                        i2 = 11;
                        break;
                    case SemanticState.Modal /* 2048 */:
                        i2 = 12;
                        break;
                    case SemanticState.Obscured /* 4096 */:
                        i2 = 13;
                        break;
                    default:
                        hhg1.n(f4i1.c(iM, "Unknown Dolby Vision level: "));
                        return null;
                }
            } else {
                i2 = 2;
            }
            if (i > 9) {
                Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
                String str2 = zoi1.a;
                string = String.format(Locale.US, "dvh1.%02d.%02d", objArr);
            } else if (i > 8) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                String str3 = zoi1.a;
                string = String.format(Locale.US, "dvav.%02d.%02d", objArr2);
            } else {
                Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2)};
                String str4 = zoi1.a;
                string = String.format(Locale.US, "dvhe.%02d.%02d", objArr3);
            }
        } else {
            string = mediaFormat.getString("codecs-string");
        }
        ge30Var.k = string;
        ge30Var.c(x74.J(mediaFormat));
        ge30Var.v = x74.M(mediaFormat, "width", -1);
        ge30Var.w = x74.M(mediaFormat, "height", -1);
        ge30Var.D = (mediaFormat.containsKey("sar-width") && mediaFormat.containsKey("sar-height")) ? mediaFormat.getInteger("sar-width") / mediaFormat.getInteger("sar-height") : 1.0f;
        ge30Var.f52p = x74.M(mediaFormat, "max-input-size", -1);
        int i7 = 0;
        ge30Var.B = x74.M(mediaFormat, "rotation-degrees", 0);
        int iM4 = x74.M(mediaFormat, "color-standard", -1);
        int iM5 = x74.M(mediaFormat, "color-range", -1);
        int iM6 = x74.M(mediaFormat, "color-transfer", -1);
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
        if (byteBuffer != null) {
            byte[] bArr5 = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr5);
            bArr = bArr5;
        } else {
            bArr = null;
        }
        if (iM4 == 2 || iM4 == 1 || iM4 == 6) {
            i4 = -1;
        } else {
            i4 = -1;
            if (iM4 != -1) {
                iM4 = -1;
            }
        }
        if (iM5 != 2 && iM5 != 1 && iM5 != i4) {
            iM5 = i4;
        }
        if (iM6 != 1 && iM6 != 3 && iM6 != 2 && iM6 != 6 && iM6 != 7 && iM6 != i4) {
            iM6 = i4;
        }
        ge30Var.G = (iM4 == i4 && iM5 == i4 && iM6 == i4 && bArr == null) ? null : new x8h(iM4, iM5, iM6, bArr, -1, -1);
        ge30Var.K = x74.M(mediaFormat, "sample-rate", -1);
        int iM7 = x74.M(mediaFormat, "exo-pcm-encoding-int", -1);
        if (iM7 == -1) {
            iM7 = x74.M(mediaFormat, "pcm-encoding", -1);
        }
        ge30Var.L = iM7;
        int iM8 = x74.M(mediaFormat, "channel-count", -1);
        int iM9 = x74.M(mediaFormat, "channel-mask", -1);
        if (iM8 != -1 && iM9 != -1 && Integer.bitCount(iM9) != iM8) {
            iM9 = -1;
        }
        ge30Var.I = iM8;
        ge30Var.J = iM9;
        n3p1.j(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i8 = 0;
        while (true) {
            ByteBuffer byteBuffer2 = mediaFormat.getByteBuffer("csd-" + i7);
            if (byteBuffer2 == null) {
                ge30Var.r = b380.l(i8, objArrCopyOf);
                if (mediaFormat.containsKey("track-id")) {
                    ge30Var.a = Integer.toString(mediaFormat.getInteger("track-id"));
                }
                ie30 ie30Var = new ie30(ge30Var);
                ge30 ge30VarA = ie30Var.a();
                ge30VarA.l = hjj0Var;
                if (z && ie30Var.M == -1 && Objects.equals(ie30Var.f66p, "audio/raw")) {
                    ge30VarA.L = 2;
                }
                return new ie30(ge30VarA);
            }
            byte[] bArr6 = new byte[byteBuffer2.remaining()];
            byteBuffer2.get(bArr6);
            byteBuffer2.rewind();
            int i9 = i8 + 1;
            int iB = o280.b(objArrCopyOf.length, i9);
            if (iB > objArrCopyOf.length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
            }
            objArrCopyOf[i8] = bArr6;
            i7++;
            i8 = i9;
        }
    }

    public final ExportException b(RuntimeException runtimeException) {
        boolean z = this.g;
        return ExportException.c(runtimeException, z ? 3002 : 4002, new m3c(this.b.toString(), this.h, c(), z));
    }

    public final String c() {
        int i = Build.VERSION.SDK_INT;
        MediaCodec mediaCodec = this.d;
        return i >= 29 ? x74.C(mediaCodec) : mediaCodec.getName();
    }

    public final ByteBuffer d() {
        if (!g(true)) {
            return null;
        }
        long j = this.a.presentationTimeUs;
        LinkedHashMap linkedHashMap = x8r.a;
        synchronized (x8r.class) {
            synchronized (x8r.class) {
            }
            return this.k;
        }
        return this.k;
    }

    public final boolean e() {
        return this.o && this.m == -1;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.transformer.ExportException */
    public final boolean f(gar garVar) throws ExportException {
        MediaCodec mediaCodec = this.d;
        if (this.n) {
            return false;
        }
        if (this.l < 0) {
            try {
                int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
                this.l = iDequeueInputBuffer;
                if (iDequeueInputBuffer < 0) {
                    return false;
                }
                try {
                    garVar.d = mediaCodec.getInputBuffer(iDequeueInputBuffer);
                    garVar.g();
                } catch (RuntimeException e) {
                    oon1.t("MediaCodec error", e);
                    throw b(e);
                }
            } catch (RuntimeException e2) {
                oon1.t("MediaCodec error", e2);
                throw b(e2);
            }
        }
        garVar.d.getClass();
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.transformer.ExportException */
    /* JADX WARN: Code duplicated, block: B:44:0x009e  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a2  */
    public final boolean g(boolean z) throws ExportException {
        boolean z2 = this.g;
        ie30 ie30Var = this.c;
        MediaCodec mediaCodec = this.d;
        MediaCodec.BufferInfo bufferInfo = this.a;
        if (this.m < 0) {
            if (!this.o) {
                try {
                    int iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
                    this.m = iDequeueOutputBuffer;
                    if (iDequeueOutputBuffer >= 0) {
                        int i = bufferInfo.flags;
                        if ((i & 4) != 0) {
                            this.o = true;
                            LinkedHashMap linkedHashMap = x8r.a;
                            synchronized (x8r.class) {
                                synchronized (x8r.class) {
                                }
                                if (bufferInfo.size == 0) {
                                    j();
                                    return false;
                                }
                                i = bufferInfo.flags & (-5);
                                bufferInfo.flags = i;
                            }
                            if (bufferInfo.size == 0) {
                                j();
                                return false;
                            }
                            i = bufferInfo.flags & (-5);
                            bufferInfo.flags = i;
                        }
                        if ((i & 2) != 0) {
                            j();
                            return false;
                        }
                        if (z) {
                            try {
                                ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(this.m);
                                outputBuffer.getClass();
                                this.k = outputBuffer;
                                outputBuffer.position(bufferInfo.offset);
                                this.k.limit(bufferInfo.offset + bufferInfo.size);
                                return true;
                            } catch (RuntimeException e) {
                                oon1.t("MediaCodec error", e);
                                throw b(e);
                            }
                        }
                    } else if (iDequeueOutputBuffer == -2) {
                        this.j = a(mediaCodec.getOutputFormat(), z2, ie30Var.m);
                        if (z2) {
                            if (Objects.equals(ie30Var.f66p, "audio/raw")) {
                                ge30 ge30VarA = this.j.a();
                                ge30VarA.I = ie30Var.J;
                                ge30VarA.L = ie30Var.M;
                                this.j = new ie30(ge30VarA);
                            }
                        } else if (this.h) {
                            this.i.set(true);
                        } else if (Objects.equals(c(), "c2.android.aac.encoder")) {
                            ge30 ge30VarA2 = this.j.a();
                            ge30VarA2.M = 1600;
                            this.j = new ie30(ge30VarA2);
                        }
                        long j = bufferInfo.presentationTimeUs;
                        LinkedHashMap linkedHashMap2 = x8r.a;
                        synchronized (x8r.class) {
                            synchronized (x8r.class) {
                            }
                            return false;
                        }
                        return false;
                    }
                } catch (RuntimeException e2) {
                    oon1.t("MediaCodec error", e2);
                    throw b(e2);
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.transformer.ExportException */
    /* JADX WARN: Code duplicated, block: B:17:0x003a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063 A[Catch: all -> 0x006e, DONT_GENERATE, TRY_LEAVE, TryCatch #2 {, blocks: (B:33:0x0062, B:34:0x0063), top: B:49:0x0062 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void h(gar garVar) throws ExportException {
        int iPosition;
        int iRemaining;
        ByteBuffer byteBuffer;
        boolean z = true;
        dm5.z(!this.n, "Input buffer can not be queued after the input stream has ended.");
        ByteBuffer byteBuffer2 = garVar.d;
        int i = 0;
        if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
            iPosition = 0;
            iRemaining = 0;
        } else {
            iPosition = garVar.d.position();
            iRemaining = garVar.d.remaining();
        }
        long j = garVar.f;
        int i2 = 4;
        try {
            if (garVar.f(4)) {
                this.n = true;
                LinkedHashMap linkedHashMap = x8r.a;
                synchronized (x8r.class) {
                    synchronized (x8r.class) {
                    }
                    if (this.g) {
                        byteBuffer = garVar.d;
                        if (byteBuffer != null && byteBuffer.hasRemaining()) {
                            z = false;
                        }
                        dm5.y(z);
                        j = 0;
                        iRemaining = 0;
                    }
                    this.d.queueInputBuffer(this.l, i, iRemaining, j, i2);
                    LinkedHashMap linkedHashMap2 = x8r.a;
                    synchronized (x8r.class) {
                        synchronized (x8r.class) {
                        }
                        this.l = -1;
                        garVar.d = null;
                        return;
                    }
                    this.l = -1;
                    garVar.d = null;
                    return;
                }
                if (this.g) {
                    byteBuffer = garVar.d;
                    if (byteBuffer != null) {
                        z = false;
                    }
                    dm5.y(z);
                    j = 0;
                    iRemaining = 0;
                }
                this.d.queueInputBuffer(this.l, i, iRemaining, j, i2);
                LinkedHashMap linkedHashMap3 = x8r.a;
                synchronized (x8r.class) {
                    synchronized (x8r.class) {
                        this.l = -1;
                        garVar.d = null;
                        return;
                    }
                }
            }
            i2 = 0;
            this.d.queueInputBuffer(this.l, i, iRemaining, j, i2);
            LinkedHashMap linkedHashMap4 = x8r.a;
            synchronized (x8r.class) {
                synchronized (x8r.class) {
                    this.l = -1;
                    garVar.d = null;
                    return;
                }
            }
        } catch (RuntimeException e) {
            oon1.t("MediaCodec error", e);
            throw b(e);
        }
        i = iPosition;
    }

    public final void i() {
        this.k = null;
        Surface surface = this.e;
        if (surface != null) {
            surface.release();
        }
        this.d.release();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.transformer.ExportException */
    public final void j() throws ExportException {
        MediaCodec.BufferInfo bufferInfo = this.a;
        bufferInfo.getClass();
        k(bufferInfo.presentationTimeUs, false);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.transformer.ExportException */
    public final void k(long j, boolean z) throws ExportException {
        this.k = null;
        MediaCodec mediaCodec = this.d;
        int i = this.m;
        try {
            if (z) {
                mediaCodec.releaseOutputBuffer(i, j * 1000);
                LinkedHashMap linkedHashMap = x8r.a;
                synchronized (x8r.class) {
                    try {
                        synchronized (x8r.class) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else {
                mediaCodec.releaseOutputBuffer(i, false);
            }
            this.m = -1;
        } catch (RuntimeException e) {
            oon1.t("MediaCodec error", e);
            throw b(e);
        }
    }
}
