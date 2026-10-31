package p;

import android.content.ContentResolver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.media3.exoplayer.audio.AudioOutputProvider$ConfigurationException;
import java.math.RoundingMode;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class r58 implements qx7 {
    public static final v0d1 k = zno1.u(new p58((byte) 0));
    public final Context a;
    public final pbo1 b;
    public final sgr c;
    public final ps7 d;
    public h9d0 e;
    public rdd1 f;
    public qp7 g;
    public tp7 h;
    public Looper i;
    public Context j;

    public r58(yu3 yu3Var) {
        Context context = (Context) yu3Var.b;
        this.a = context;
        sgr sgrVar = (sgr) yu3Var.c;
        sgrVar.getClass();
        this.c = sgrVar;
        this.b = (pbo1) yu3Var.d;
        this.g = (qp7) yu3Var.e;
        this.d = context == null ? null : new ps7(this, (byte) 1);
        this.f = rdd1.a;
    }

    public final o58 a(px7 px7Var) throws Exception {
        Context context;
        Context context2;
        try {
            int i = px7Var.h;
            int i2 = px7Var.i;
            if (i2 == -1 || (context2 = this.a) == null || Build.VERSION.SDK_INT < 34) {
                context = null;
            } else {
                Context context3 = this.j;
                if (context3 == null || context3.getDeviceId() != i2) {
                    this.j = context2.createDeviceContext(i2);
                }
                context = this.j;
                i = 0;
            }
            try {
                AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(px7Var.d ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : px7Var.g.c()).setAudioFormat(new AudioFormat.Builder().setSampleRate(px7Var.b).setChannelMask(px7Var.c).setEncoding(px7Var.a).build()).setTransferMode(1).setBufferSizeInBytes(px7Var.f).setSessionId(i);
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 29) {
                    sessionId.setOffloadedPlayback(px7Var.e);
                }
                if (i3 >= 34 && context != null) {
                    sessionId.setContext(context);
                }
                AudioTrack audioTrackBuild = sessionId.build();
                if (audioTrackBuild.getState() == 1) {
                    return new o58(audioTrackBuild, px7Var, this.d, this.f);
                }
                try {
                    audioTrackBuild.release();
                } catch (Exception unused) {
                }
                throw new Exception() { // from class: androidx.media3.exoplayer.audio.AudioOutputProvider$InitializationException
                };
            } catch (IllegalArgumentException e) {
                e = e;
                throw new Exception(e) { // from class: androidx.media3.exoplayer.audio.AudioOutputProvider$InitializationException
                };
            }
        } catch (IllegalArgumentException | UnsupportedOperationException e2) {
            e = e2;
        }
    }

    public final nx7 b(mx7 mx7Var) {
        e(mx7Var);
        ie30 ie30Var = mx7Var.a;
        po7 po7Var = mx7Var.b;
        zw7 zw7VarA = this.c.a(po7Var, ie30Var);
        nx7 nx7Var = new nx7();
        int i = 0;
        nx7Var.d = 0;
        String str = ie30Var.f66p;
        int i2 = ie30Var.M;
        if (!Objects.equals(str, "audio/raw") ? this.g.c(po7Var, ie30Var) != null : i2 == 2) {
            i = 2;
        }
        nx7Var.d = i;
        boolean z = zw7VarA.a;
        nx7Var.a = z;
        boolean z2 = zw7VarA.b;
        nx7Var.b = z2;
        boolean z3 = zw7VarA.c;
        nx7Var.c = z3;
        if (!z && (z2 || z3)) {
            eg.m("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
            return null;
        }
        nx7 nx7Var2 = new nx7();
        nx7Var2.a = nx7Var.a;
        nx7Var2.b = nx7Var.b;
        nx7Var2.c = nx7Var.c;
        nx7Var2.d = nx7Var.d;
        return nx7Var2;
    }

    public final px7 c(mx7 mx7Var) {
        int iIntValue;
        char c;
        int iZ;
        boolean z;
        boolean z2;
        int iJ;
        int i;
        int iO;
        ie30 ie30Var = mx7Var.a;
        boolean z3 = mx7Var.e;
        boolean z4 = mx7Var.d;
        po7 po7Var = mx7Var.b;
        e(mx7Var);
        String str = ie30Var.f66p;
        int i2 = ie30Var.J;
        int i3 = ie30Var.L;
        int iIntValue2 = ie30Var.M;
        if (Objects.equals(str, "audio/raw")) {
            dm5.m(zoi1.P(iIntValue2));
            iIntValue = zoi1.y(ie30Var);
            iZ = zoi1.z(iIntValue2) * i2;
            z = false;
            c = 0;
        } else {
            zw7 zw7VarA = z3 ? this.c.a(po7Var, ie30Var) : zw7.d;
            if (z3 && zw7VarA.a) {
                str.getClass();
                int iD = asj0.d(str, ie30Var.l);
                int iY = zoi1.y(ie30Var);
                if ((iD == 11 || iD == 12) && i3 >= 16000 && !((Boolean) k.get()).booleanValue()) {
                    if (iD == 12 && i2 == 2) {
                        iY = 4;
                    }
                    i3 /= 2;
                    iD = 10;
                }
                int i4 = iY;
                int i5 = iD;
                iIntValue = i4;
                z = zw7VarA.b;
                iIntValue2 = i5;
                iZ = -1;
                z4 = true;
                c = 1;
            } else {
                Pair pairC = this.g.c(po7Var, ie30Var);
                if (pairC == null) {
                    throw new AudioOutputProvider$ConfigurationException("Unable to configure passthrough for: " + ie30Var);
                }
                iIntValue2 = ((Integer) pairC.first).intValue();
                iIntValue = ((Integer) pairC.second).intValue();
                c = 2;
                iZ = -1;
                z = false;
            }
        }
        int i6 = ie30Var.k;
        if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr") && i6 == -1) {
            i6 = 768000;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i3, iIntValue, iIntValue2);
        dm5.y(minBufferSize != -2);
        if (iZ == -1) {
            iZ = 1;
        }
        double d = z4 ? 8.0d : 1.0d;
        this.b.getClass();
        if (c == 0) {
            z2 = true;
            iJ = bmq0.j(((500000 * ((long) i3)) * ((long) iZ)) / 1000000);
        } else if (c == 1) {
            z2 = true;
            int iW = jto1.w(iIntValue2);
            dm5.y(iW != -2147483647);
            iJ = bmq0.j((50000000 * ((long) iW)) / 1000000);
        } else {
            if (c != 2) {
                bhn0.q();
                return null;
            }
            if (iIntValue2 == 5) {
                i = 500000;
            } else {
                i = iIntValue2 == 8 ? 1000000 : 250000;
            }
            if (i6 != -1) {
                RoundingMode roundingMode = RoundingMode.CEILING;
                iO = eth.o(i6, 8);
            } else {
                int iW2 = jto1.w(iIntValue2);
                dm5.y(iW2 != -2147483647);
                iO = iW2;
            }
            z2 = true;
            iJ = bmq0.j((((long) i) * ((long) iO)) / 1000000);
        }
        int iMax = (((Math.max(minBufferSize, (int) (((double) iJ) * d)) + iZ) - 1) / iZ) * iZ;
        ox7 ox7Var = new ox7();
        po7 po7Var2 = po7.i;
        ox7Var.i = -1;
        ox7Var.b = i3;
        ox7Var.c = iIntValue;
        ox7Var.a = iIntValue2;
        ox7Var.f = iMax;
        ox7Var.h = mx7Var.f;
        ox7Var.g = po7Var;
        boolean z5 = z2;
        ox7Var.e = c == z5 ? z5 : false;
        ox7Var.d = mx7Var.h;
        ox7Var.j = z4;
        ox7Var.k = z;
        ox7Var.i = mx7Var.g;
        return new px7(ox7Var);
    }

    public final void d() {
        pna1 pna1Var;
        h9d0 h9d0Var = this.e;
        if (h9d0Var != null) {
            h9d0Var.d();
        }
        tp7 tp7Var = this.h;
        if (tp7Var != null) {
            Context context = (Context) tp7Var.b;
            if (tp7Var.a) {
                tp7Var.i = null;
                kw7.u(context).unregisterAudioDeviceCallback((rp7) tp7Var.e);
                if (Build.VERSION.SDK_INT >= 32 && (pna1Var = (pna1) tp7Var.h) != null) {
                    pna1Var.e();
                    tp7Var.h = null;
                }
                context.unregisterReceiver((jlb) tp7Var.f);
                sp7 sp7Var = (sp7) tp7Var.g;
                if (sp7Var != null) {
                    ((ContentResolver) sp7Var.b).unregisterContentObserver(sp7Var);
                }
                tp7Var.a = false;
            }
        }
    }

    public final void e(mx7 mx7Var) {
        Context context;
        qp7 qp7VarB;
        AudioDeviceInfo audioDeviceInfo = mx7Var.c;
        po7 po7Var = mx7Var.b;
        f();
        tp7 tp7Var = this.h;
        if (tp7Var == null && (context = this.a) != null) {
            tp7 tp7Var2 = new tp7(context, new vq6(this, (byte) 5), po7Var, audioDeviceInfo);
            this.h = tp7Var2;
            Handler handler = (Handler) tp7Var2.d;
            Context context2 = (Context) tp7Var2.b;
            if (tp7Var2.a) {
                qp7VarB = (qp7) tp7Var2.i;
                qp7VarB.getClass();
            } else {
                tp7Var2.a = true;
                sp7 sp7Var = (sp7) tp7Var2.g;
                if (sp7Var != null) {
                    ((ContentResolver) sp7Var.b).registerContentObserver((Uri) sp7Var.c, false, sp7Var);
                }
                kw7.u(context2).registerAudioDeviceCallback((rp7) tp7Var2.e, handler);
                if (Build.VERSION.SDK_INT >= 32 && ((pna1) tp7Var2.h) == null) {
                    tp7Var2.h = new pna1(context2, new fe(tp7Var2, (byte) 9), Boolean.valueOf(zoi1.T(context2)));
                }
                qp7VarB = qp7.b(context2, context2.registerReceiver((jlb) tp7Var2.f, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), (po7) tp7Var2.k, (AudioDeviceInfo) tp7Var2.j, tp7Var2.g());
                tp7Var2.i = qp7VarB;
            }
            this.g = qp7VarB;
        } else if (tp7Var != null) {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals((AudioDeviceInfo) tp7Var.j)) {
                tp7Var.j = audioDeviceInfo;
                Context context3 = (Context) tp7Var.b;
                po7 po7Var2 = (po7) tp7Var.k;
                List listG = tp7Var.g();
                bg11 bg11Var = qp7.e;
                tp7Var.h(qp7.b(context3, context3.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), po7Var2, audioDeviceInfo, listG));
            }
            tp7 tp7Var3 = this.h;
            if (!Objects.equals(po7Var, (po7) tp7Var3.k)) {
                tp7Var3.k = po7Var;
                Context context4 = (Context) tp7Var3.b;
                AudioDeviceInfo audioDeviceInfo2 = (AudioDeviceInfo) tp7Var3.j;
                List listG2 = tp7Var3.g();
                bg11 bg11Var2 = qp7.e;
                tp7Var3.h(qp7.b(context4, context4.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), po7Var, audioDeviceInfo2, listG2));
            }
        }
        this.g.getClass();
    }

    public final void f() {
        if (this.a == null) {
            return;
        }
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.i;
        dm5.B(looper == null || looper == looperMyLooper, "AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", looper == null ? "null" : looper.getThread().getName(), looperMyLooper != null ? looperMyLooper.getThread().getName() : "null");
        this.i = looperMyLooper;
    }
}
