package androidx.media3.transformer;

import android.os.SystemClock;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.audio.AudioProcessor;
import com.spotify.collection2.itemdata.proto.CollectionItemdata$ItemData;
import p.ag11;
import p.j280;
import p.l1d;
import p.m3c;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ExportException extends Exception {
    public static final ag11 b;
    public final int a;

    static {
        j280 j280Var = new j280();
        j280Var.h("ERROR_CODE_FAILED_RUNTIME_CHECK", Integer.valueOf(CollectionItemdata$ItemData.PLAY_CONTEXT_BANS_ITEM_DATA_FIELD_NUMBER));
        j280Var.h("ERROR_CODE_IO_UNSPECIFIED", 2000);
        j280Var.h("ERROR_CODE_IO_NETWORK_CONNECTION_FAILED", 2001);
        j280Var.h("ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT", 2002);
        j280Var.h("ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE", 2003);
        j280Var.h("ERROR_CODE_IO_BAD_HTTP_STATUS", 2004);
        j280Var.h("ERROR_CODE_IO_FILE_NOT_FOUND", 2005);
        j280Var.h("ERROR_CODE_IO_NO_PERMISSION", 2006);
        j280Var.h("ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED", 2007);
        j280Var.h("ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE", 2008);
        j280Var.h("ERROR_CODE_DECODER_INIT_FAILED", 3001);
        j280Var.h("ERROR_CODE_DECODING_FAILED", 3002);
        j280Var.h("ERROR_CODE_DECODING_FORMAT_UNSUPPORTED", 3003);
        j280Var.h("ERROR_CODE_ENCODER_INIT_FAILED", 4001);
        j280Var.h("ERROR_CODE_ENCODING_FAILED", 4002);
        j280Var.h("ERROR_CODE_ENCODING_FORMAT_UNSUPPORTED", 4003);
        j280Var.h("ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED", 5001);
        j280Var.h("ERROR_CODE_AUDIO_PROCESSING_FAILED", 6001);
        j280Var.h("ERROR_CODE_MUXING_FAILED", 7001);
        j280Var.h("ERROR_CODE_MUXING_TIMEOUT", 7002);
        j280Var.h("ERROR_CODE_MUXING_APPEND", 7003);
        b = j280Var.g();
    }

    public ExportException(String str, Throwable th, int i, int i2) {
        super(str, th);
        this.a = i;
        SystemClock.elapsedRealtime();
    }

    public static ExportException a(int i, Throwable th) {
        return new ExportException("Asset loader error", th, i, 0);
    }

    public static ExportException b(AudioProcessor.UnhandledAudioFormatException unhandledAudioFormatException, String str) {
        StringBuilder sbT = l1d.t("Audio error: ", str, ", audioFormat=");
        sbT.append(unhandledAudioFormatException.a);
        return new ExportException(sbT.toString(), unhandledAudioFormatException, 6001, 0);
    }

    public static ExportException c(Exception exc, int i, m3c m3cVar) {
        return new ExportException("Codec exception: " + m3cVar, exc, i, 0);
    }

    public static ExportException d(Exception exc) {
        return exc instanceof RuntimeException ? new ExportException("Unexpected runtime error", exc, CollectionItemdata$ItemData.PLAY_CONTEXT_BANS_ITEM_DATA_FIELD_NUMBER, 0) : new ExportException("Unexpected error", exc, 1000, 0);
    }

    public static ExportException e(VideoFrameProcessingException videoFrameProcessingException) {
        return new ExportException("Video frame processing error", videoFrameProcessingException, 5001, 0);
    }
}
