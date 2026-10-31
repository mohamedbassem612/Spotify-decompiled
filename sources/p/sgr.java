package p;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sgr {
    public final Context a;
    public Boolean b;

    public sgr(Context context) {
        this.a = context == null ? null : context.getApplicationContext();
    }

    public final zw7 a(po7 po7Var, ie30 ie30Var) {
        Boolean boolValueOf;
        boolean zBooleanValue;
        ie30Var.getClass();
        int i = ie30Var.L;
        po7Var.getClass();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 || i == -1) {
            return zw7.d;
        }
        Boolean bool = this.b;
        boolean z = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            Context context = this.a;
            if (context != null) {
                String parameters = kw7.u(context).getParameters("offloadVariableRateSupported");
                boolValueOf = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
                this.b = boolValueOf;
            } else {
                boolValueOf = Boolean.FALSE;
                this.b = boolValueOf;
            }
            zBooleanValue = boolValueOf.booleanValue();
        }
        String str = ie30Var.f66p;
        str.getClass();
        int iD = asj0.d(str, ie30Var.l);
        if (iD == 0 || i2 < zoi1.w(iD)) {
            return zw7.d;
        }
        int iY = zoi1.y(ie30Var);
        if (iY == 0) {
            return zw7.d;
        }
        try {
            AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(i).setChannelMask(iY).setEncoding(iD).build();
            if (i2 >= 33) {
                int directPlaybackSupport = AudioManager.getDirectPlaybackSupport(audioFormatBuild, po7Var.c());
                if ((directPlaybackSupport & 1) == 0) {
                    return zw7.d;
                }
                z = (directPlaybackSupport & 3) == 3;
                yw7 yw7Var = new yw7();
                yw7Var.a = true;
                yw7Var.b = z;
                yw7Var.c = zBooleanValue;
                return yw7Var.a();
            }
            if (i2 < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(audioFormatBuild, po7Var.c())) {
                    return zw7.d;
                }
                yw7 yw7Var2 = new yw7();
                yw7Var2.a = true;
                yw7Var2.c = zBooleanValue;
                return yw7Var2.a();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatBuild, po7Var.c());
            if (playbackOffloadSupport == 0) {
                return zw7.d;
            }
            yw7 yw7Var3 = new yw7();
            if (i2 > 32 && playbackOffloadSupport == 2) {
                z = true;
            }
            yw7Var3.a = true;
            yw7Var3.b = z;
            yw7Var3.c = zBooleanValue;
            return yw7Var3.a();
        } catch (IllegalArgumentException unused) {
            return zw7.d;
        }
    }
}
