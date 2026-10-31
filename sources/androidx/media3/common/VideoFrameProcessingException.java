package androidx.media3.common;

import p.l1d;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class VideoFrameProcessingException extends Exception {
    public VideoFrameProcessingException(long j, Throwable th) {
        super(j == -9223372036854775807L ? " @UNSET" : l1d.l(j, " @"), th);
    }

    public static VideoFrameProcessingException a(long j, Exception exc) {
        return exc instanceof VideoFrameProcessingException ? (VideoFrameProcessingException) exc : new VideoFrameProcessingException(j, exc);
    }

    public VideoFrameProcessingException(Throwable th) {
        this(-9223372036854775807L, th);
    }

    public VideoFrameProcessingException(String str) {
        super(str.concat(" @UNSET"));
    }
}
