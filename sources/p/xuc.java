package p;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import com.spotify.base.java.logging.Logger;
import com.spotify.carapplibrary.app.instrumentation.events.proto.ExternalAccessoryRemoteError;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xuc implements t28, npd {
    public int X;
    public int Y;
    public final androidx.car.app.k a;
    public final b6y b;
    public final l84 c;
    public final mpd d;
    public final AtomicInteger e = new AtomicInteger(1);
    public final idd1 f = new idd1(new ptb(this, (byte) 11));
    public final bpb1 g = gio1.b(Boolean.FALSE);
    public final AudioFocusRequest h = new AudioFocusRequest.Builder(1).setAudioAttributes(new AudioAttributes.Builder().setContentType(1).setUsage(16).build()).setOnAudioFocusChangeListener(new su7(this, (byte) 1)).build();
    public final Object i = new Object();
    public double t;

    public xuc(androidx.car.app.k kVar, b6y b6yVar, l84 l84Var) {
        this.a = kVar;
        this.b = b6yVar;
        this.c = l84Var;
        this.d = mpd.create(kVar);
    }

    public final int a() {
        return mpd.AUDIO_CONTENT_SAMPLING_RATE;
    }

    public final int f(ByteBuffer byteBuffer, int i) {
        if (this.e.get() != 3) {
            return -1;
        }
        if (i > 512) {
            i = 512;
        }
        byte[] bArr = new byte[i];
        int i2 = this.d.read(bArr, 0, i);
        byteBuffer.put(bArr);
        byteBuffer.flip();
        if (this.c.a()) {
            double dSqrt = 0.0d;
            if (i2 >= 2) {
                this.Y += i2;
                int i3 = i2 / 2;
                int i4 = i3 / 4;
                if (i4 > 0) {
                    ShortBuffer shortBufferAsShortBuffer = ByteBuffer.wrap(bArr, 0, i2).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer();
                    shortBufferAsShortBuffer.position((i3 - i4) / 2);
                    short[] sArr = new short[i4];
                    shortBufferAsShortBuffer.get(sArr, 0, i4);
                    for (int i5 = 0; i5 < i4; i5++) {
                        short s = sArr[i5];
                        dSqrt += (double) (s * s);
                    }
                    dSqrt = Math.sqrt(dSqrt / ((double) i4));
                }
            }
            synchronized (this.i) {
                int i6 = this.X + 1;
                this.X = i6;
                double d = this.t;
                this.t = ((dSqrt - d) / ((double) i6)) + d;
            }
        }
        if (i2 != -1) {
            if (i2 != 0) {
                return i2;
            }
            t2j0 t2j0Var = this.b.a;
            t210 t210VarN = ExternalAccessoryRemoteError.n();
            t210VarN.n("audio_recording");
            t210VarN.r();
            t210VarN.q("read|read zero bytes");
            t2j0Var.a(t210VarN.build());
            return i2;
        }
        this.e.get();
        if (this.e.get() == 3) {
            bpb1 bpb1Var = this.g;
            Boolean bool = Boolean.TRUE;
            bpb1Var.getClass();
            bpb1Var.m((Object) null, bool);
            t2j0 t2j0Var2 = this.b.a;
            t210 t210VarN2 = ExternalAccessoryRemoteError.n();
            t210VarN2.n("audio_recording");
            t210VarN2.r();
            t210VarN2.q("read|microphone dismissed while recording");
            t2j0Var2.a(t210VarN2.build());
        }
        this.e.set(1);
        return 0;
    }

    public final int getAudioSessionId() {
        return 124;
    }

    public final int getState() {
        return 1;
    }

    public final int k() {
        return this.e.get();
    }

    public final void p() {
        int iRequestAudioFocus = ((AudioManager) this.f.getValue()).requestAudioFocus(this.h);
        if (iRequestAudioFocus == 1) {
            this.e.set(3);
            this.d.startRecording();
            return;
        }
        String strValueOf = String.valueOf(iRequestAudioFocus);
        t2j0 t2j0Var = this.b.a;
        t210 t210VarN = ExternalAccessoryRemoteError.n();
        t210VarN.n("audio_recording");
        t210VarN.r();
        t210VarN.q("request_audio_focus|".concat(strValueOf));
        t2j0Var.a(t210VarN.build());
    }

    public final void release() {
        this.e.set(1);
        this.d.stopRecording();
        ((AudioManager) this.f.getValue()).abandonAudioFocusRequest(this.h);
        bpb1 bpb1Var = this.g;
        Boolean bool = Boolean.FALSE;
        bpb1Var.getClass();
        bpb1Var.m((Object) null, bool);
        if (this.c.a()) {
            synchronized (this.i) {
                try {
                    double d = ((double) (this.Y / 2)) / 16000.0d;
                    double d2 = this.t / 32767.0d;
                    Logger.b("[CAL-AudioRecorder] Recording ended. ".concat(String.format("Duration: %.2f s | Avg RMS: %.1f | Normalized RMS: %.3f", Arrays.copyOf(new Object[]{Double.valueOf(d), Double.valueOf(this.t), Double.valueOf(d2)}, 3))), new Object[0]);
                    if (this.t < 100.0d) {
                        b6y b6yVar = this.b;
                        String str = String.format("Recording ended with low audio: Duration: %.2f s | Avg RMS: %.1f | Normalized RMS: %.3f", Arrays.copyOf(new Object[]{Double.valueOf(d), Double.valueOf(this.t), Double.valueOf(d2)}, 3));
                        t2j0 t2j0Var = b6yVar.a;
                        t210 t210VarN = ExternalAccessoryRemoteError.n();
                        t210VarN.n("audio_recording");
                        t210VarN.r();
                        t210VarN.q("end_of_recording|".concat(str));
                        t2j0Var.a(t210VarN.build());
                    }
                    this.t = 0.0d;
                    this.X = 0;
                    this.Y = 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void j(cp5 cp5Var) {
    }

    public final void l(cp5 cp5Var) {
    }
}
