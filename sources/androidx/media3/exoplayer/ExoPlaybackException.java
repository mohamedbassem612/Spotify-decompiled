package androidx.media3.exoplayer;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import java.util.Objects;
import p.bhn0;
import p.dm5;
import p.ie30;
import p.p2i0;
import p.zoi1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ExoPlaybackException extends PlaybackException {
    public final int N0;
    public final p2i0 O0;
    public final boolean P0;
    public final String X;
    public final int Y;
    public final ie30 Z;
    public final byte t;

    /* JADX WARN: Illegal instructions before constructor call */
    public ExoPlaybackException(int i, Throwable th, int i2, String str, int i3, ie30 ie30Var, int i4, p2i0 p2i0Var, boolean z) {
        String str2;
        int i5;
        ie30 ie30Var2;
        String string;
        String str3;
        if (i == 0) {
            str2 = str;
            i5 = i3;
            ie30Var2 = ie30Var;
            string = "Source error";
        } else if (i != 1) {
            string = i != 3 ? "Unexpected runtime error" : "Remote error";
            str2 = str;
            i5 = i3;
            ie30Var2 = ie30Var;
        } else {
            StringBuilder sb = new StringBuilder();
            str2 = str;
            sb.append(str2);
            sb.append(" error, index=");
            i5 = i3;
            sb.append(i5);
            sb.append(", format=");
            ie30Var2 = ie30Var;
            sb.append(ie30Var2);
            sb.append(", format_supported=");
            String str4 = zoi1.a;
            if (i4 == 0) {
                str3 = "NO";
            } else if (i4 == 1) {
                str3 = "NO_UNSUPPORTED_SUBTYPE";
            } else if (i4 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i4 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i4 != 4) {
                    bhn0.w();
                    throw null;
                }
                str3 = "YES";
            }
            sb.append(str3);
            string = sb.toString();
        }
        this(TextUtils.isEmpty(null) ? string : string.concat(": null"), th, i2, i, str2, i5, ie30Var2, i4, p2i0Var, SystemClock.elapsedRealtime(), z);
    }

    @Override // androidx.media3.common.PlaybackException
    public final boolean a(PlaybackException playbackException) {
        if (!super.a(playbackException)) {
            return false;
        }
        String str = zoi1.a;
        ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
        return this.t == exoPlaybackException.t && Objects.equals(this.X, exoPlaybackException.X) && this.Y == exoPlaybackException.Y && Objects.equals(this.Z, exoPlaybackException.Z) && this.N0 == exoPlaybackException.N0 && Objects.equals(this.O0, exoPlaybackException.O0) && this.P0 == exoPlaybackException.P0;
    }

    public final ExoPlaybackException c(p2i0 p2i0Var) {
        String message = getMessage();
        String str = zoi1.a;
        return new ExoPlaybackException(message, getCause(), this.a, this.t, this.X, this.Y, this.Z, this.N0, p2i0Var, this.b, this.P0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExoPlaybackException(String str, Throwable th, int i, int i2, String str2, int i3, ie30 ie30Var, int i4, p2i0 p2i0Var, long j, boolean z) {
        super(str, th, i, Bundle.EMPTY, j);
        dm5.m(!z || i2 == 1);
        dm5.m(th != null || i2 == 3);
        this.t = i2;
        this.X = str2;
        this.Y = i3;
        this.Z = ie30Var;
        this.N0 = i4;
        this.O0 = p2i0Var;
        this.P0 = z;
    }

    public ExoPlaybackException(int i, Exception exc, int i2) {
        this(i, exc, i2, null, -1, null, 4, null, false);
    }
}
