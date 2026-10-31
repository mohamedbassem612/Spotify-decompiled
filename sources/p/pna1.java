package p;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pna1 {
    public final Spatializer a;
    public final boolean b;
    public final Handler c;
    public final ona1 d;

    public pna1(Context context, Runnable runnable, Boolean bool) {
        AudioManager audioManagerU = context == null ? null : kw7.u(context);
        if (audioManagerU == null || (bool != null && bool.booleanValue())) {
            this.a = null;
            this.b = false;
            this.c = null;
            this.d = null;
            return;
        }
        Spatializer spatializer = audioManagerU.getSpatializer();
        this.a = spatializer;
        this.b = spatializer.getImmersiveAudioLevel() != 0;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        Handler handler = new Handler(looperMyLooper);
        this.c = handler;
        ona1 ona1Var = new ona1(runnable);
        this.d = ona1Var;
        spatializer.addOnSpatializerStateChangedListener(new zrk(handler, (byte) 0), ona1Var);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    public final boolean a(po7 po7Var, ie30 ie30Var) {
        int i;
        if (this.a == null || !this.b || !c() || !d()) {
            return false;
        }
        String str = ie30Var.f66p;
        int i2 = ie30Var.J;
        if (Objects.equals(str, "audio/eac3-joc")) {
            if (i2 == 16) {
                i = 12;
            } else {
                i = i2;
            }
        } else if (Objects.equals(str, "audio/iamf")) {
            if (i2 == -1) {
                i = 6;
            } else {
                i = i2;
            }
        } else if (Objects.equals(str, "audio/ac4") && (i2 == 18 || i2 == 21)) {
            i = 24;
        } else {
            i = i2;
        }
        int iX = ie30Var.K;
        if (iX == -1 || i2 != i) {
            iX = zoi1.x(i);
        }
        if (iX == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iX);
        int i3 = ie30Var.L;
        if (i3 != -1) {
            channelMask.setSampleRate(i3);
        }
        Spatializer spatializer = this.a;
        spatializer.getClass();
        return spatializer.canBeSpatialized(po7Var.c(), channelMask.build());
    }

    public final List b() {
        if (this.a == null || !this.b || !c() || !d()) {
            w280 w280Var = b380.b;
            return bg11.e;
        }
        if (Build.VERSION.SDK_INT < 36) {
            return b380.t(252);
        }
        Spatializer spatializer = this.a;
        spatializer.getClass();
        return spatializer.getSpatializedChannelMasks();
    }

    public final boolean c() {
        Spatializer spatializer = this.a;
        return spatializer != null && spatializer.isAvailable();
    }

    public final boolean d() {
        Spatializer spatializer = this.a;
        return spatializer != null && spatializer.isEnabled();
    }

    public final void e() {
        ona1 ona1Var;
        Handler handler;
        Spatializer spatializer = this.a;
        if (spatializer == null || (ona1Var = this.d) == null || (handler = this.c) == null) {
            return;
        }
        spatializer.removeOnSpatializerStateChangedListener(ona1Var);
        handler.removeCallbacksAndMessages(null);
    }
}
