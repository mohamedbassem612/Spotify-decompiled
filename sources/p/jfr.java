package p;

import androidx.media3.common.PlaybackException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class jfr implements e9d0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PlaybackException b;

    public /* synthetic */ jfr(tz3 tz3Var, PlaybackException playbackException) {
        this.a = (byte) 0;
        this.b = playbackException;
    }

    public final void invoke(Object obj) {
        byte b = this.a;
        PlaybackException playbackException = this.b;
        switch (b) {
            case 0:
                ((uz3) obj).n(playbackException);
                break;
            case 1:
                ((o8u0) obj).x0(playbackException);
                break;
            default:
                ((o8u0) obj).n(playbackException);
                break;
        }
    }

    public /* synthetic */ jfr(PlaybackException playbackException, byte b) {
        this.a = b;
        this.b = playbackException;
    }
}
