package com.spotify.tap.go.protocol;

import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/spotify/tap/go/protocol/GoProtocolParseException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "src_main_java_com_spotify_tap_go-go"}, k = 1, mv = {2, 3, 0}, xi = StreamStartRequestOuterClass$StreamStartRequest.PREVIEW_IMPRESSION_URI_FIELD_NUMBER)
public final class GoProtocolParseException extends Exception {
    public final byte[] a;

    /* JADX WARN: Illegal instructions before constructor call */
    public GoProtocolParseException(byte[] bArr, int i) {
        String str;
        if (i == 1) {
            str = "No registered parser for the included command type.";
        } else if (i == 2) {
            str = "Data length does not match the included command length.";
        } else if (i == 3) {
            str = "Last command string is not terminated with 0x0.";
        } else if (i == 4) {
            str = "This parser does not support the included command type.";
        } else {
            if (i != 5) {
                throw null;
            }
            str = "Play commands should include 3 data strings.";
        }
        super(str);
        this.a = bArr;
    }
}
